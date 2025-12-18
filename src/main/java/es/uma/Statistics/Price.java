package es.uma.Statistics;

import java.util.List;

import es.uma.Utils;

public class Price {
    private static final double PRICE_PER_1M_TOKENS_INPUT_GPT40 = 2.5;
    private static final double PRICE_PER_1M_TOKENS_OUTPUT_GPT40 = 10.0;
    private static final double PRICE_PER_1M_TOKENS_INPUT_GPT5_2 = 1.75;
    private static final double PRICE_PER_1M_TOKENS_OUTPUT_GPT5_2 = 14.0;
    
    private static double calculateCost(double inputTokens, double outputTokens, double pricePer1MInputTokens,
            double pricePer1MOutputTokens) {
        double inputCost = (inputTokens / 1_000_000) * pricePer1MInputTokens;
        double outputCost = (outputTokens / 1_000_000) * pricePer1MOutputTokens;
        return inputCost + outputCost;
    }

    private static double calculateCostGPT40(double inputTokens, double outputTokens) {
        return calculateCost(inputTokens, outputTokens, PRICE_PER_1M_TOKENS_INPUT_GPT40,
                PRICE_PER_1M_TOKENS_OUTPUT_GPT40);
    }

    private static double calculateCostGPT52(double inputTokens, double outputTokens) {
        return calculateCost(inputTokens, outputTokens, PRICE_PER_1M_TOKENS_INPUT_GPT5_2,
                PRICE_PER_1M_TOKENS_OUTPUT_GPT5_2);
    }

    private static int getInputTokens(String filePath) {
        String logs = Utils.readFile(filePath);
        String regEx = "Input Tokens:\\s*(\\d+)";
        List<String> matches = Utils.match(logs, regEx);
        int sum = 0;
        for (String match : matches) {
            sum += Integer.parseInt(match);
        }
        return sum;
    }

    private static int getOutputTokens(String filePath) {
        String logs = Utils.readFile(filePath);
        String regEx = "Output Tokens:\\s*(\\d+)";
        List<String> matches = Utils.match(logs, regEx);
        int sum = 0;
        for (String match : matches) {
            sum += Integer.parseInt(match);
        }
        return sum;
    }

    public static void main(String[] args) {
        int inputTokens = getInputTokens(
                "./src/main/resources/dataset/GPT4O-exp1/Simple/Restaurant/02-04-2025--16-10-47/logs.md");
        int outputTokens = getOutputTokens(
                "./src/main/resources/dataset/GPT4O-exp1/Simple/Restaurant/02-04-2025--16-10-47/logs.md");
        double totalCost = calculateCostGPT40(inputTokens, outputTokens);
        System.out.printf("Total cost for GPT-4.0 with %,d input tokens and %,d output tokens: $%,.4f%n",
                inputTokens, outputTokens, totalCost);

        inputTokens = getInputTokens("./src/main/resources/dataset/GPT5-exp2/Simple/restaurant/18-12-2025--14-56-32/logs.md");
        outputTokens = getOutputTokens("./src/main/resources/dataset/GPT5-exp2/Simple/restaurant/18-12-2025--14-56-32/logs.md");
        double totalCostGPT52 = calculateCostGPT52(inputTokens, outputTokens);
        System.out.printf("Total cost for GPT-5.2 with %,d input tokens and %,d output tokens: $%,.4f%n",
                inputTokens, outputTokens, totalCostGPT52);
    }
}
