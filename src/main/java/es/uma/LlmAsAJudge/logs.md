# Input IJudge
|Messages|
|---|
```
SystemMessage { text = "<role>
You are an expert software and system modeler. You are able to assess the semantic quality of object models that have been created to conform to a domain model. The models are defined in USE (UML-based Specification Environment) and OCL (Object Constraint Language).

Your primary capability is "Semantic Reality Checking". You do not just check for syntactic correctness; you check for real-world plausibility and logical consistency within a given domain.
</role>

<context>
The user will provide two types of content:
1. **Domain Model (.use)**: A class diagram definition including classes, attributes, enums, relationships, multiplicities and roles.
2. **Object Model (.soil)**: An object model. This object model can be seen as a script composed of instructions for the creation of objects, relationships and setting attribute values (snapshot).

Your goal is to act as a judge to determine if the object model represents a **REALISTIC** scenario based on the domain model and common sense real-world logic.
</context>

<definitions>
- **Realistic**: The object model is syntactically correct AND semantically plausible (e.g., A 'Person' has an age between 0 and 120; a 'Car' has a positive price).
- **Unrealistic**: The object model contains contradictions, impossible physical values, or nonsensical relationships (e.g., A 'Person' is their own father; a 'Product' has a negative weight).
- **Unknown**: You cannot determine whether the object model is realistic or not.
</definitions>

<instructions>
Follow this thinking process strictly before generating the final output:

1. **Analyze the Domain (.use)**: Understand the classes and what they represent in the real world.
2. **Analyze the Instances (.soil)**: Map the created objects to their classes. Look at the specific values assigned to attributes and the relationships created between objects.
3. **Evaluate Semantics**:
    - Apply "Common Sense Knowledge" to the attribute values.
    - Check cardinality and relationship logic beyond simple OCL constraints.
    - Identify any outliers or logical fallacies.
4. **Determine Verdict**: Select one of the defined labels (Realistic/Unrealistic/Unknown).
</instructions>

<constraints>
- **Tone**: Objective, Analytical, Technical.
- **Verbosity**: Low. Be direct.
- **Reasoning**: The "Why" section must be concise and specific, citing variable names, objects, or relationships when possible.
- Do not output the internal thinking process. Only output the final formatted result.
</constraints>

<output_format>
Structure your response exactly as follows:

**Response**: [Realistic | Unrealistic | Unknown]
**Why**: [Concise explanation of your reasoning. If Unrealistic, specify the exact objects, values or relationships that break realism.]
</output_format>

<examples>
Example 1:
Input:

<domain_model>
class Person
attributes
    age: Integer
end
class Pet
attributes
    name: String
end
association Ownership between
    Person [1] role owner
    Pet [*] role pets
end
</domain_model>
<object_model>
!new Person('p1')
!p1.age := 250
!new Pet('pet1')
!pet1.name := 'Luna'
… 1.000 more pets creation …
!pet1000.name := 'Max'
!insert (p1, pet1) into Ownership
…1.000 more pets associated with p1 …
!insert (p1, pet1000) into Ownership
</object_model>

Output:

**Response**: Unrealistic
**Why**: The object 'p1' of class 'Person' has an age of 250, which exceeds the biologically plausible lifespan of a human. Although it is not plausible that 1 same person owns 1.000 pets.


Example 2:
Input:

<domain_model>
class Car
attributes
    brand: String
end
class Person
attributes
    name: String
end
association Ownership between
    Person [1] role owner
    Car [*] role cars
end
</domain_model>
<object_model>
!new Person('p1')
!p1.age := 19
!new Car('c1')
!c1.brand := 'Toyota'
!insert (p1, c1) into Ownership
</object_model>


Output:

**Response**: Realistic
**Why**: The object 'c1' has a valid, recognized real-world car brand assigned, and its plausible that a teenager has only one car.

</examples>
" }
```
```
UserMessage { name = null, contents = [TextContent { text = "<domain_model>
model BankAccount

class Bank
attributes
    country:String
    name:String
    bic:String
end

class Account
attributes
    iban: String
    balance : Integer
end

class Person
attributes
    firstName:String
    lastName:String
    age : Integer
end

association Ownership between
    Person [1..2] role owner
    Account [*] role accounts
end

association Use between
    Person [*] role user
    Account [*]
end

composition AccountOfBanks between
    Bank [1] role bank
    Account [*] role accounts
end

constraints
context Account inv AdultOwners:
    self.owner->forAll(p | p.age >= 18)
	
context Account inv positiveBalance:
    self.balance >= 0
</domain_model>

<object_model>
!new Bank('bank1')
!bank1.country := 'USA'
!bank1.name := 'Bank of America'
!bank1.bic := 'BOFAUS3N'

!new Bank('bank2')
!bank2.country := 'Germany'
!bank2.name := 'Deutsche Bank'
!bank2.bic := 'DEUTDEFF'

!new Account('account1')
!account1.iban := 'US123456789'
!account1.balance := 5000

!new Account('account2')
!account2.iban := 'US987654321'
!account2.balance := 1500

!new Account('account3')
!account3.iban := 'DE1122334455'
!account3.balance := 0

!new Account('account4')
!account4.iban := 'DE5544332211'
!account4.balance := 7500

!new Person('person1')
!person1.firstName := 'John'
!person1.lastName := 'Doe'
!person1.age := 30

!new Person('person2')
!person2.firstName := 'Jane'
!person2.lastName := 'Smith'
!person2.age := 45

!new Person('person3')
!person3.firstName := 'Max'
!person3.lastName := 'Mustermann'
!person3.age := 32

!new Person('person4')
!person4.firstName := 'Anna'
!person4.lastName := 'Schmidt'
!person4.age := 28

-- Associations
!insert (bank1, account1) into AccountOfBanks
!insert (bank1, account2) into AccountOfBanks
!insert (bank2, account3) into AccountOfBanks
!insert (bank2, account4) into AccountOfBanks

!insert (person1, account1) into Ownership
!insert (person2, account1) into Ownership
!insert (person3, account2) into Ownership

!insert (person4, account3) into Ownership
!insert (person3, account3) into Ownership
!insert (person3, account4) into Ownership

!insert (person1, account2) into Use
!insert (person2, account2) into Use

!insert (person3, account1) into Use
!insert (person4, account4) into Use

-- Corner cases
!new Account('account5')
!account5.iban := 'DE0099887766'
!account5.balance := 0

!new Person('person5')
!person5.firstName := 'Tim'
!person5.lastName := 'Brown'
!person5.age := 18

!insert (bank2, account5) into AccountOfBanks
!insert (person5, account5) into Ownership
</object_model>
" }], attributes = {} }
```

|Request|
|---|
Model: gemini-2.5-flash
Max-Tokens: null
Temperature: null
Top-P: null

# Output IJudge
```
**Response**: Realistic
**Why**: All created objects have plausible attribute values and their relationships respect the defined multiplicities and OCL constraints within the domain model. Specifically, all account owners are 18 years or older, and all account balances are non-negative.
```

|Response|
|---|
Finish Reason: STOP
Input Tokens: 1924
Output Tokens: 53
Total Tokens: 3577
Generation Time: 9.31 seconds


# Summary for all generations
| Metric | Value |
| --- | --- |
| Generations time | 9.31 seconds |
| Sum of input tokens | 1924 |
| Sum of output tokens | 53 |
| Sum of total tokens | 3577 |
