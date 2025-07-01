# Simple

**Table values interpretation:**

- **NaN** indicates the absence of attributes of that type.
- **1.0** means that the attributes are completely **different**.
*(If there is only one attribute, it also returns 1.0)*
- **0.0** means the attributes are entirely **identical**.

## AddressBook

### gen1

| name | John Doe | Acme Corp | Jane Smith | Mark Brown |
|---|---|---|---|---|
| **John Doe** | 0.0000 | 0.2852 | 0.2757 | 0.3220 | 
| **Acme Corp** | 0.2852 | 0.0000 | 0.3211 | 0.3626 | 
| **Jane Smith** | 0.2757 | 0.3211 | 0.0000 | 0.2700 | 
| **Mark Brown** | 0.3220 | 0.3626 | 0.2700 | 0.0000 | 


| title | Software Engineer | Project Manager | Marketing Director |
|---|---|---|---|
| **Software Engineer** | 0.0000 | 0.2293 | 0.2781 | 
| **Project Manager** | 0.2293 | 0.0000 | 0.2049 | 
| **Marketing Director** | 0.2781 | 0.2049 | 0.0000 | 


| city | New York | San Francisco | Chicago |
|---|---|---|---|
| **New York** | 0.0000 | 0.2234 | 0.2352 | 
| **San Francisco** | 0.2234 | 0.0000 | 0.2290 | 
| **Chicago** | 0.2352 | 0.2290 | 0.0000 | 


| street | Broadway | Market Street | Michigan Avenue |
|---|---|---|---|
| **Broadway** | 0.0000 | 0.2906 | 0.2456 | 
| **Market Street** | 0.2906 | 0.0000 | 0.2183 | 
| **Michigan Avenue** | 0.2456 | 0.2183 | 0.0000 | 


| comment | Discuss project milestones | Follow-up on proposal |
|---|---|---|
| **Discuss project milestones** | 0.0000 | 0.2465 | 
| **Follow-up on proposal** | 0.2465 | 0.0000 | 


| industry | Technology |
|---|---|
| **Technology** | 0.0000 | 


### gen2

| name | Tech Solutions | Alice Wong | Bob Carter |
|---|---|---|---|
| **Tech Solutions** | 0.0000 | 0.3723 | 0.3792 | 
| **Alice Wong** | 0.3723 | 0.0000 | 0.3239 | 
| **Bob Carter** | 0.3792 | 0.3239 | 0.0000 | 


| title | Chief Executive Officer | Operations Manager |
|---|---|---|
| **Chief Executive Officer** | 0.0000 | 0.2073 | 
| **Operations Manager** | 0.2073 | 0.0000 | 


| city | Los Angeles | Seattle |
|---|---|---|
| **Los Angeles** | 0.0000 | 0.2272 | 
| **Seattle** | 0.2272 | 0.0000 | 


| street | Sunset Boulevard | Pine Street |
|---|---|---|
| **Sunset Boulevard** | 0.0000 | 0.3047 | 
| **Pine Street** | 0.3047 | 0.0000 | 


| comment | Sent quarterly earnings report | Reminder for annual strategic planning meeting |
|---|---|---|
| **Sent quarterly earnings report** | 0.0000 | 0.3084 | 
| **Reminder for annual strategic planning meeting** | 0.3084 | 0.0000 | 


| industry | Consulting |
|---|---|
| **Consulting** | 0.0000 | 


### gen3

| name | Green Energy Inc. | David Lee | Sophia Kim |
|---|---|---|---|
| **Green Energy Inc.** | 0.0000 | 0.3204 | 0.3499 | 
| **David Lee** | 0.3204 | 0.0000 | 0.2716 | 
| **Sophia Kim** | 0.3499 | 0.2716 | 0.0000 | 


| title | Environmental Consultant | Graphic Designer |
|---|---|---|
| **Environmental Consultant** | 0.0000 | 0.2551 | 
| **Graphic Designer** | 0.2551 | 0.0000 | 


| city | Austin | Miami | Denver |
|---|---|---|---|
| **Austin** | 0.0000 | 0.2642 | 0.2618 | 
| **Miami** | 0.2642 | 0.0000 | 0.2318 | 
| **Denver** | 0.2618 | 0.2318 | 0.0000 | 


| street | Congress Avenue | Biscayne Blvd | Energy Parkway |
|---|---|---|---|
| **Congress Avenue** | 0.0000 | 0.2407 | 0.2659 | 
| **Biscayne Blvd** | 0.2407 | 0.0000 | 0.2710 | 
| **Energy Parkway** | 0.2659 | 0.2710 | 0.0000 | 


| comment | Consulted on solar power expansion project | Submitted new design prototypes for review |
|---|---|---|
| **Consulted on solar power expansion project** | 0.0000 | 0.3037 | 
| **Submitted new design prototypes for review** | 0.3037 | 0.0000 | 


| industry | Renewable Energy |
|---|---|
| **Renewable Energy** | 0.0000 | 


### gen4

| name | Urban Developers Ltd. | Michael Jones | Sarah Wilson |
|---|---|---|---|
| **Urban Developers Ltd.** | 0.0000 | 0.3659 | 0.3620 | 
| **Michael Jones** | 0.3659 | 0.0000 | 0.2909 | 
| **Sarah Wilson** | 0.3620 | 0.2909 | 0.0000 | 


| title | Senior Real Estate Advisor | Architect |
|---|---|---|
| **Senior Real Estate Advisor** | 0.0000 | 0.2567 | 
| **Architect** | 0.2567 | 0.0000 | 


| city | Phoenix | Charlotte | Houston |
|---|---|---|---|
| **Phoenix** | 0.0000 | 0.2699 | 0.2354 | 
| **Charlotte** | 0.2699 | 0.0000 | 0.2827 | 
| **Houston** | 0.2354 | 0.2827 | 0.0000 | 


| street | Desert Drive | Elm Street | Construction Road |
|---|---|---|---|
| **Desert Drive** | 0.0000 | 0.2883 | 0.2426 | 
| **Elm Street** | 0.2883 | 0.0000 | 0.3263 | 
| **Construction Road** | 0.2426 | 0.3263 | 0.0000 | 


| comment | Discuss future property developments in downtown area | Sent architectural design drafts for the new business park |
|---|---|---|
| **Discuss future property developments in downtown area** | 0.0000 | 0.2776 | 
| **Sent architectural design drafts for the new business park** | 0.2776 | 0.0000 | 


| industry | Real Estate |
|---|---|
| **Real Estate** | 0.0000 | 


### gen5

| name | BlueTech Innovations | Emma Watson | Oliver Stone |
|---|---|---|---|
| **BlueTech Innovations** | 0.0000 | 0.3934 | 0.3805 | 
| **Emma Watson** | 0.3934 | 0.0000 | 0.3031 | 
| **Oliver Stone** | 0.3805 | 0.3031 | 0.0000 | 


| title | Lead UX Designer | Multimedia Specialist |
|---|---|---|
| **Lead UX Designer** | 0.0000 | 0.2519 | 
| **Multimedia Specialist** | 0.2519 | 0.0000 | 


| city | Boston | San Diego | Seattle |
|---|---|---|---|
| **Boston** | 0.0000 | 0.2616 | 0.2320 | 
| **San Diego** | 0.2616 | 0.0000 | 0.2305 | 
| **Seattle** | 0.2320 | 0.2305 | 0.0000 | 


| street | Maple Street | Palm Lane | Lakeview Ave |
|---|---|---|---|
| **Maple Street** | 0.0000 | 0.2436 | 0.2240 | 
| **Palm Lane** | 0.2436 | 0.0000 | 0.2494 | 
| **Lakeview Ave** | 0.2240 | 0.2494 | 0.0000 | 


| comment | Participate in UX design workshop with stakeholders | Discuss multimedia content strategies for product launch |
|---|---|---|
| **Participate in UX design workshop with stakeholders** | 0.0000 | 0.3108 | 
| **Discuss multimedia content strategies for product launch** | 0.3108 | 0.0000 | 


| industry | Software Development |
|---|---|
| **Software Development** | 0.0000 | 


### ALL Gen detailed

| name | John Doe | Acme Corp | Jane Smith | Mark Brown | Tech Solutions | Alice Wong | Bob Carter | Green Energy Inc. | David Lee | Sophia Kim | Urban Developers Ltd. | Michael Jones | Sarah Wilson | BlueTech Innovations | Emma Watson | Oliver Stone |
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
| **John Doe** | 0.0000 | 0.2852 | 0.2757 | 0.3220 | 0.3494 | 0.3177 | 0.3125 | 0.3122 | 0.2934 | 0.3216 | 0.3707 | 0.2938 | 0.3494 | 0.3479 | 0.3465 | 0.3424 | 
| **Acme Corp** | 0.2852 | 0.0000 | 0.3211 | 0.3626 | 0.3434 | 0.2990 | 0.3402 | 0.2710 | 0.3132 | 0.3386 | 0.3313 | 0.3587 | 0.3525 | 0.3392 | 0.3226 | 0.3457 | 
| **Jane Smith** | 0.2757 | 0.3211 | 0.0000 | 0.2700 | 0.3713 | 0.3066 | 0.3154 | 0.3336 | 0.3150 | 0.3449 | 0.3520 | 0.2524 | 0.2950 | 0.3409 | 0.2882 | 0.2912 | 
| **Mark Brown** | 0.3220 | 0.3626 | 0.2700 | 0.0000 | 0.3675 | 0.3305 | 0.2989 | 0.3305 | 0.2749 | 0.3372 | 0.3479 | 0.2540 | 0.3242 | 0.3208 | 0.3387 | 0.3303 | 
| **Tech Solutions** | 0.3494 | 0.3434 | 0.3713 | 0.3675 | 0.0000 | 0.3723 | 0.3792 | 0.3270 | 0.3700 | 0.3464 | 0.3395 | 0.3793 | 0.3762 | 0.2154 | 0.3858 | 0.3963 | 
| **Alice Wong** | 0.3177 | 0.2990 | 0.3066 | 0.3305 | 0.3723 | 0.0000 | 0.3239 | 0.3610 | 0.2806 | 0.2392 | 0.3662 | 0.3438 | 0.2630 | 0.3399 | 0.2748 | 0.3360 | 
| **Bob Carter** | 0.3125 | 0.3402 | 0.3154 | 0.2989 | 0.3792 | 0.3239 | 0.0000 | 0.3554 | 0.2935 | 0.3327 | 0.3662 | 0.2922 | 0.2997 | 0.3468 | 0.3343 | 0.3039 | 
| **Green Energy Inc.** | 0.3122 | 0.2710 | 0.3336 | 0.3305 | 0.3270 | 0.3610 | 0.3554 | 0.0000 | 0.3204 | 0.3499 | 0.3086 | 0.3725 | 0.3501 | 0.2397 | 0.4078 | 0.3799 | 
| **David Lee** | 0.2934 | 0.3132 | 0.3150 | 0.2749 | 0.3700 | 0.2806 | 0.2935 | 0.3204 | 0.0000 | 0.2716 | 0.3217 | 0.2964 | 0.2598 | 0.3490 | 0.3353 | 0.3170 | 
| **Sophia Kim** | 0.3216 | 0.3386 | 0.3449 | 0.3372 | 0.3464 | 0.2392 | 0.3327 | 0.3499 | 0.2716 | 0.0000 | 0.3644 | 0.3423 | 0.2417 | 0.3528 | 0.2871 | 0.3384 | 
| **Urban Developers Ltd.** | 0.3707 | 0.3313 | 0.3520 | 0.3479 | 0.3395 | 0.3662 | 0.3662 | 0.3086 | 0.3217 | 0.3644 | 0.0000 | 0.3659 | 0.3620 | 0.3137 | 0.3816 | 0.3576 | 
| **Michael Jones** | 0.2938 | 0.3587 | 0.2524 | 0.2540 | 0.3793 | 0.3438 | 0.2922 | 0.3725 | 0.2964 | 0.3423 | 0.3659 | 0.0000 | 0.2909 | 0.3583 | 0.3629 | 0.2914 | 
| **Sarah Wilson** | 0.3494 | 0.3525 | 0.2950 | 0.3242 | 0.3762 | 0.2630 | 0.2997 | 0.3501 | 0.2598 | 0.2417 | 0.3620 | 0.2909 | 0.0000 | 0.3525 | 0.2814 | 0.3506 | 
| **BlueTech Innovations** | 0.3479 | 0.3392 | 0.3409 | 0.3208 | 0.2154 | 0.3399 | 0.3468 | 0.2397 | 0.3490 | 0.3528 | 0.3137 | 0.3583 | 0.3525 | 0.0000 | 0.3934 | 0.3805 | 
| **Emma Watson** | 0.3465 | 0.3226 | 0.2882 | 0.3387 | 0.3858 | 0.2748 | 0.3343 | 0.4078 | 0.3353 | 0.2871 | 0.3816 | 0.3629 | 0.2814 | 0.3934 | 0.0000 | 0.3031 | 
| **Oliver Stone** | 0.3424 | 0.3457 | 0.2912 | 0.3303 | 0.3963 | 0.3360 | 0.3039 | 0.3799 | 0.3170 | 0.3384 | 0.3576 | 0.2914 | 0.3506 | 0.3805 | 0.3031 | 0.0000 | 


| title | Software Engineer | Project Manager | Marketing Director | Chief Executive Officer | Operations Manager | Environmental Consultant | Graphic Designer | Senior Real Estate Advisor | Architect | Lead UX Designer | Multimedia Specialist |
|---|---|---|---|---|---|---|---|---|---|---|---|
| **Software Engineer** | 0.0000 | 0.2293 | 0.2781 | 0.2796 | 0.2770 | 0.2791 | 0.2316 | 0.2893 | 0.2594 | 0.2238 | 0.2562 | 
| **Project Manager** | 0.2293 | 0.0000 | 0.2049 | 0.2572 | 0.1649 | 0.2391 | 0.2329 | 0.2545 | 0.2490 | 0.2282 | 0.2415 | 
| **Marketing Director** | 0.2781 | 0.2049 | 0.0000 | 0.1719 | 0.2085 | 0.2769 | 0.2195 | 0.2351 | 0.2851 | 0.2220 | 0.2448 | 
| **Chief Executive Officer** | 0.2796 | 0.2572 | 0.1719 | 0.0000 | 0.2073 | 0.3077 | 0.2973 | 0.2745 | 0.2810 | 0.2558 | 0.3077 | 
| **Operations Manager** | 0.2770 | 0.1649 | 0.2085 | 0.2073 | 0.0000 | 0.2763 | 0.2665 | 0.2720 | 0.2986 | 0.2471 | 0.2796 | 
| **Environmental Consultant** | 0.2791 | 0.2391 | 0.2769 | 0.3077 | 0.2763 | 0.0000 | 0.2551 | 0.2234 | 0.2490 | 0.2876 | 0.2727 | 
| **Graphic Designer** | 0.2316 | 0.2329 | 0.2195 | 0.2973 | 0.2665 | 0.2551 | 0.0000 | 0.2873 | 0.2191 | 0.1814 | 0.1771 | 
| **Senior Real Estate Advisor** | 0.2893 | 0.2545 | 0.2351 | 0.2745 | 0.2720 | 0.2234 | 0.2873 | 0.0000 | 0.2567 | 0.2398 | 0.2734 | 
| **Architect** | 0.2594 | 0.2490 | 0.2851 | 0.2810 | 0.2986 | 0.2490 | 0.2191 | 0.2567 | 0.0000 | 0.2775 | 0.3019 | 
| **Lead UX Designer** | 0.2238 | 0.2282 | 0.2220 | 0.2558 | 0.2471 | 0.2876 | 0.1814 | 0.2398 | 0.2775 | 0.0000 | 0.2519 | 
| **Multimedia Specialist** | 0.2562 | 0.2415 | 0.2448 | 0.3077 | 0.2796 | 0.2727 | 0.1771 | 0.2734 | 0.3019 | 0.2519 | 0.0000 | 


| city | New York | San Francisco | Chicago | Los Angeles | Seattle | Austin | Miami | Denver | Phoenix | Charlotte | Houston | Boston | San Diego | Seattle |
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
| **New York** | 0.0000 | 0.2234 | 0.2352 | 0.2131 | 0.2605 | 0.2779 | 0.2454 | 0.2501 | 0.3009 | 0.2610 | 0.2548 | 0.2389 | 0.2670 | 0.2605 | 
| **San Francisco** | 0.2234 | 0.0000 | 0.2290 | 0.1783 | 0.1888 | 0.2582 | 0.2571 | 0.2146 | 0.2842 | 0.2849 | 0.2306 | 0.2159 | 0.1511 | 0.1888 | 
| **Chicago** | 0.2352 | 0.2290 | 0.0000 | 0.2039 | 0.2297 | 0.2355 | 0.2014 | 0.2211 | 0.2458 | 0.2602 | 0.2329 | 0.1943 | 0.2343 | 0.2297 | 
| **Los Angeles** | 0.2131 | 0.1783 | 0.2039 | 0.0000 | 0.2272 | 0.2404 | 0.2243 | 0.2299 | 0.2595 | 0.2932 | 0.2169 | 0.2398 | 0.1898 | 0.2272 | 
| **Seattle** | 0.2605 | 0.1888 | 0.2297 | 0.2272 | 0.0000 | 0.2437 | 0.2446 | 0.1995 | 0.2877 | 0.3065 | 0.2389 | 0.2320 | 0.2305 | 0.0000 | 
| **Austin** | 0.2779 | 0.2582 | 0.2355 | 0.2404 | 0.2437 | 0.0000 | 0.2642 | 0.2618 | 0.2340 | 0.3062 | 0.1787 | 0.2480 | 0.2721 | 0.2437 | 
| **Miami** | 0.2454 | 0.2571 | 0.2014 | 0.2243 | 0.2446 | 0.2642 | 0.0000 | 0.2318 | 0.2561 | 0.2902 | 0.2180 | 0.2263 | 0.2735 | 0.2446 | 
| **Denver** | 0.2501 | 0.2146 | 0.2211 | 0.2299 | 0.1995 | 0.2618 | 0.2318 | 0.0000 | 0.2349 | 0.2515 | 0.2521 | 0.2254 | 0.2270 | 0.1995 | 
| **Phoenix** | 0.3009 | 0.2842 | 0.2458 | 0.2595 | 0.2877 | 0.2340 | 0.2561 | 0.2349 | 0.0000 | 0.2699 | 0.2354 | 0.2472 | 0.2639 | 0.2877 | 
| **Charlotte** | 0.2610 | 0.2849 | 0.2602 | 0.2932 | 0.3065 | 0.3062 | 0.2902 | 0.2515 | 0.2699 | 0.0000 | 0.2827 | 0.2575 | 0.2760 | 0.3065 | 
| **Houston** | 0.2548 | 0.2306 | 0.2329 | 0.2169 | 0.2389 | 0.1787 | 0.2180 | 0.2521 | 0.2354 | 0.2827 | 0.0000 | 0.2103 | 0.2639 | 0.2389 | 
| **Boston** | 0.2389 | 0.2159 | 0.1943 | 0.2398 | 0.2320 | 0.2480 | 0.2263 | 0.2254 | 0.2472 | 0.2575 | 0.2103 | 0.0000 | 0.2616 | 0.2320 | 
| **San Diego** | 0.2670 | 0.1511 | 0.2343 | 0.1898 | 0.2305 | 0.2721 | 0.2735 | 0.2270 | 0.2639 | 0.2760 | 0.2639 | 0.2616 | 0.0000 | 0.2305 | 
| **Seattle** | 0.2605 | 0.1888 | 0.2297 | 0.2272 | 0.0000 | 0.2437 | 0.2446 | 0.1995 | 0.2877 | 0.3065 | 0.2389 | 0.2320 | 0.2305 | 0.0000 | 


| street | Broadway | Market Street | Michigan Avenue | Sunset Boulevard | Pine Street | Congress Avenue | Biscayne Blvd | Energy Parkway | Desert Drive | Elm Street | Construction Road | Maple Street | Palm Lane | Lakeview Ave |
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
| **Broadway** | 0.0000 | 0.2906 | 0.2456 | 0.2484 | 0.2922 | 0.2531 | 0.2507 | 0.2953 | 0.3026 | 0.3093 | 0.3277 | 0.2810 | 0.2892 | 0.3032 | 
| **Market Street** | 0.2906 | 0.0000 | 0.2183 | 0.3356 | 0.1938 | 0.2245 | 0.2991 | 0.2845 | 0.3110 | 0.2706 | 0.2936 | 0.1809 | 0.2830 | 0.2615 | 
| **Michigan Avenue** | 0.2456 | 0.2183 | 0.0000 | 0.2820 | 0.2239 | 0.1853 | 0.1958 | 0.2711 | 0.2609 | 0.2823 | 0.2775 | 0.2193 | 0.2488 | 0.1886 | 
| **Sunset Boulevard** | 0.2484 | 0.3356 | 0.2820 | 0.0000 | 0.3047 | 0.3065 | 0.2429 | 0.3352 | 0.2389 | 0.2487 | 0.3259 | 0.3121 | 0.2948 | 0.2989 | 
| **Pine Street** | 0.2922 | 0.1938 | 0.2239 | 0.3047 | 0.0000 | 0.2619 | 0.2612 | 0.3088 | 0.2829 | 0.2588 | 0.2866 | 0.1349 | 0.2290 | 0.2441 | 
| **Congress Avenue** | 0.2531 | 0.2245 | 0.1853 | 0.3065 | 0.2619 | 0.0000 | 0.2407 | 0.2659 | 0.2784 | 0.3160 | 0.2494 | 0.2558 | 0.2509 | 0.2264 | 
| **Biscayne Blvd** | 0.2507 | 0.2991 | 0.1958 | 0.2429 | 0.2612 | 0.2407 | 0.0000 | 0.2710 | 0.2651 | 0.2999 | 0.2888 | 0.2753 | 0.2420 | 0.2531 | 
| **Energy Parkway** | 0.2953 | 0.2845 | 0.2711 | 0.3352 | 0.3088 | 0.2659 | 0.2710 | 0.0000 | 0.2486 | 0.3139 | 0.2377 | 0.3033 | 0.2786 | 0.2839 | 
| **Desert Drive** | 0.3026 | 0.3110 | 0.2609 | 0.2389 | 0.2829 | 0.2784 | 0.2651 | 0.2486 | 0.0000 | 0.2883 | 0.2426 | 0.2953 | 0.2223 | 0.2772 | 
| **Elm Street** | 0.3093 | 0.2706 | 0.2823 | 0.2487 | 0.2588 | 0.3160 | 0.2999 | 0.3139 | 0.2883 | 0.0000 | 0.3263 | 0.2574 | 0.2973 | 0.3053 | 
| **Construction Road** | 0.3277 | 0.2936 | 0.2775 | 0.3259 | 0.2866 | 0.2494 | 0.2888 | 0.2377 | 0.2426 | 0.3263 | 0.0000 | 0.2832 | 0.2834 | 0.2815 | 
| **Maple Street** | 0.2810 | 0.1809 | 0.2193 | 0.3121 | 0.1349 | 0.2558 | 0.2753 | 0.3033 | 0.2953 | 0.2574 | 0.2832 | 0.0000 | 0.2436 | 0.2240 | 
| **Palm Lane** | 0.2892 | 0.2830 | 0.2488 | 0.2948 | 0.2290 | 0.2509 | 0.2420 | 0.2786 | 0.2223 | 0.2973 | 0.2834 | 0.2436 | 0.0000 | 0.2494 | 
| **Lakeview Ave** | 0.3032 | 0.2615 | 0.1886 | 0.2989 | 0.2441 | 0.2264 | 0.2531 | 0.2839 | 0.2772 | 0.3053 | 0.2815 | 0.2240 | 0.2494 | 0.0000 | 


| comment | Discuss project milestones | Follow-up on proposal | Sent quarterly earnings report | Reminder for annual strategic planning meeting | Consulted on solar power expansion project | Submitted new design prototypes for review | Discuss future property developments in downtown area | Sent architectural design drafts for the new business park | Participate in UX design workshop with stakeholders | Discuss multimedia content strategies for product launch |
|---|---|---|---|---|---|---|---|---|---|---|
| **Discuss project milestones** | 0.0000 | 0.2465 | 0.3006 | 0.2789 | 0.3002 | 0.2806 | 0.2538 | 0.3019 | 0.2822 | 0.2564 | 
| **Follow-up on proposal** | 0.2465 | 0.0000 | 0.3055 | 0.2897 | 0.3060 | 0.2446 | 0.2583 | 0.2655 | 0.3176 | 0.3570 | 
| **Sent quarterly earnings report** | 0.3006 | 0.3055 | 0.0000 | 0.3084 | 0.3582 | 0.2936 | 0.3748 | 0.2544 | 0.3872 | 0.3308 | 
| **Reminder for annual strategic planning meeting** | 0.2789 | 0.2897 | 0.3084 | 0.0000 | 0.3526 | 0.3430 | 0.3125 | 0.3198 | 0.2952 | 0.3441 | 
| **Consulted on solar power expansion project** | 0.3002 | 0.3060 | 0.3582 | 0.3526 | 0.0000 | 0.3037 | 0.3100 | 0.2712 | 0.3247 | 0.3715 | 
| **Submitted new design prototypes for review** | 0.2806 | 0.2446 | 0.2936 | 0.3430 | 0.3037 | 0.0000 | 0.3097 | 0.1972 | 0.2471 | 0.2902 | 
| **Discuss future property developments in downtown area** | 0.2538 | 0.2583 | 0.3748 | 0.3125 | 0.3100 | 0.3097 | 0.0000 | 0.2776 | 0.3448 | 0.3218 | 
| **Sent architectural design drafts for the new business park** | 0.3019 | 0.2655 | 0.2544 | 0.3198 | 0.2712 | 0.1972 | 0.2776 | 0.0000 | 0.3082 | 0.3412 | 
| **Participate in UX design workshop with stakeholders** | 0.2822 | 0.3176 | 0.3872 | 0.2952 | 0.3247 | 0.2471 | 0.3448 | 0.3082 | 0.0000 | 0.3108 | 
| **Discuss multimedia content strategies for product launch** | 0.2564 | 0.3570 | 0.3308 | 0.3441 | 0.3715 | 0.2902 | 0.3218 | 0.3412 | 0.3108 | 0.0000 | 


| industry | Technology | Consulting | Renewable Energy | Real Estate | Software Development |
|---|---|---|---|---|---|
| **Technology** | 0.0000 | 0.3124 | 0.2942 | 0.2813 | 0.2299 | 
| **Consulting** | 0.3124 | 0.0000 | 0.3277 | 0.2901 | 0.2530 | 
| **Renewable Energy** | 0.2942 | 0.3277 | 0.0000 | 0.2482 | 0.3040 | 
| **Real Estate** | 0.2813 | 0.2901 | 0.2482 | 0.0000 | 0.2793 | 
| **Software Development** | 0.2299 | 0.2530 | 0.3040 | 0.2793 | 0.0000 | 


### ALL Gen top-diag mean

| AddressBook | name | title | city | street | comment | industry |
|---|---|---|---|---|---|---|
| **gen1** | 0.3061 | 0.2374 | 0.2292 | 0.2515 | 0.2465 | 1.0000 | 
| **gen2** | 0.3585 | 0.2073 | 0.2272 | 0.3047 | 0.3084 | 1.0000 | 
| **gen3** | 0.3140 | 0.2551 | 0.2526 | 0.2592 | 0.3037 | 1.0000 | 
| **gen4** | 0.3396 | 0.2567 | 0.2627 | 0.2857 | 0.2776 | 1.0000 | 
| **gen5** | 0.3590 | 0.2519 | 0.2414 | 0.2390 | 0.3108 | 1.0000 | 


| AddressBook | name | title | city | street | comment | industry |
|---|---|---|---|---|---|---|
| **Across Gen** | 0.3275 | 0.2521 | 0.2395 | 0.2679 | 0.3033 | 0.2820 |