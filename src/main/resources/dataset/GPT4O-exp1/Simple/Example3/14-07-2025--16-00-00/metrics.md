# Generation 1
```
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
```
## Generation 1 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 59 | 0.00% |
| Multiplicities Errors | 0 | 16 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs (Real) | 5 | 5 | 100.00% |
| IBANs (Realistic) | 5 | 5 | 100.00% |
| BICs (Realistic) | 0 | 2 | 0.00% |
| Countries (Realistic) | 0 | 2 | 0.00% |

| Failed IBANs (Real) | 
|---| 
```
US123456789
```
```
US987654321
```
```
DE1122334455
```
```
DE5544332211
```
```
DE0099887766
```
```
US123456789
```
```
US987654321
```
```
DE1122334455
```
```
DE5544332211
```
```
DE0099887766
```

| Failed IBANs (Realistic) | 
|---| 
```
US123456789
```
```
US987654321
```
```
DE1122334455
```
```
DE5544332211
```
```
DE0099887766
```
```
US123456789
```
```
US987654321
```
```
DE1122334455
```
```
DE5544332211
```
```
DE0099887766
```

# Generation 2
```
-- Real handmade Bank instance
-- Bank 1 example

!new Bank('bank1')
!bank1.country := 'Spain'
!bank1.name := 'Banco Santander'
!bank1.bic := 'BSCHESMMXXX'

!new Account('account1')
!account1.iban := 'ES6000491500051234567892'
!account1.balance := 9350

!new Person('person1')
!person1.age := 21
!person1.firstName := 'Francisco'
!person1.lastName := 'Martin'

!insert (person1, account1) into Ownership
!insert (person1, account1) into Use
!insert (bank1, account1) into AccountOfBanks

-- Bank 2 example

!new Bank('bank2')
!bank2.country := 'Germany'
!bank2.name := 'Commerzbank'
!bank2.bic := 'COBADEFFXXX'

!new Account('account2')
!account2.iban := 'DE89370400440532013000'
!account2.balance := 2520

!new Person('person2')
!person2.age := 30
!person2.firstName := 'Michael'
!person2.lastName := 'Schmidt'

!new Person('person3')
!person3.age := 25
!person3.firstName := 'Anna'
!person3.lastName := 'Bauer'

!insert (person2, account2) into Ownership
!insert (person2, account2) into Use
!insert (person3, account2) into Use
!insert (bank2, account2) into AccountOfBanks

-- Bank 3 example

!new Bank('bank3')
!bank3.country := 'England'
!bank3.name := 'MUFG Bank London'
!bank3.bic := 'BOTKGB2L'

!new Account('account3')
!account3.iban := 'GB29BOTK60010900031161'
!account3.balance := 478900

!new Person('personX')
!personX.age := 21
!personX.firstName := 'Noah'
!personX.lastName := 'Brown'

!new Person('person4')
!person4.age := 63
!person4.firstName := 'Oliver'
!person4.lastName := 'Taylor'

!new Person('person5')
!person5.age := 58
!person5.firstName := 'James'
!person5.lastName := 'Thompson'

!insert (personX, account3) into Ownership
!insert (personX, account3) into Use
!insert (person4, account3) into Use
!insert (person5, account3) into Use
!insert (bank3, account3) into AccountOfBanks

-- Bank 4 example

!new Bank('bank4')
!bank4.country := 'Italy'
!bank4.name := 'Intesa Sanpaolo'
!bank4.bic := 'BCITITMMXXX'

!new Account('account4')
!account4.iban := 'IT60X0542811101000000123456'
!account4.balance := 1917

!new Account('account5')
!account5.iban := 'IT02I0306915816100000006601'
!account5.balance := 728990

!new Account('account6')
!account6.iban := 'IT97G0306901007100000068719'
!account6.balance := 12

!new Person('person6')
!person6.age := 21
!person6.firstName := 'Aurora Sofia'
!person6.lastName := 'Rossi'

!insert (person6, account4) into Ownership
!insert (person6, account5) into Ownership
!insert (person6, account6) into Ownership
!insert (person6, account4) into Use
!insert (person6, account5) into Use
!insert (person6, account6) into Use
!insert (bank4, account4) into AccountOfBanks
!insert (bank4, account5) into AccountOfBanks
!insert (bank4, account6) into AccountOfBanks
```
## Generation 2 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 83 | 0.00% |
| Multiplicities Errors | 0 | 21 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs (Real) | 0 | 6 | 0.00% |
| IBANs (Realistic) | 0 | 6 | 0.00% |
| BICs (Realistic) | 0 | 4 | 0.00% |
| Countries (Realistic) | 0 | 4 | 0.00% |

# Generation 3
```
-- Synthetic generated

!new Bank('bank3')
!bank3.country := 'country3'
!bank3.name := 'name3'
!bank3.bic := 'bic3'

!new Account('account6')
!account6.iban := 'iban6'
!account6.balance := 111

!new Account('account7')
!account7.iban := 'iban7'
!account7.balance := 222

!new Person('person6')
!person6.firstName := 'firstName6'
!person6.lastName := 'lastName6'
!person6.age := 333

!new Person('person7')
!person7.firstName := 'firstName7'
!person7.lastName := 'lastName7'
!person7.age := 444

!new Person('person8')
!person8.firstName := 'firstName8'
!person8.lastName := 'lastName8'
!person8.age := 555

!new Person('person9')
!person9.firstName := 'firstName9'
!person9.lastName := 'lastName9'
!person9.age := 666

-- Associations
!insert (bank3, account6) into AccountOfBanks
!insert (bank3, account7) into AccountOfBanks

!insert (person6, account6) into Ownership
!insert (person7, account6) into Ownership

!insert (person8, account7) into Ownership
!insert (person9, account7) into Ownership

!insert (person6, account7) into Use
!insert (person7, account7) into Use

!insert (person8, account6) into Use
!insert (person9, account6) into Use
```
## Generation 3 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 36 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs (Real) | 2 | 2 | 100.00% |
| IBANs (Realistic) | 2 | 2 | 100.00% |
| BICs (Realistic) | 1 | 1 | 100.00% |
| Countries (Realistic) | 1 | 1 | 100.00% |

| Failed IBANs (Real) | 
|---| 
```
IBAN6
```
```
IBAN7
```
```
IBAN6
```
```
IBAN7
```

| Failed IBANs (Realistic) | 
|---| 
```
IBAN6
```
```
IBAN7
```
```
IBAN6
```
```
IBAN7
```

| Failed BICs (Realistic) | 
|---| 
```
BIC3
```

| Failed Countries (Realistic) | 
|---| 
```
country3
```

# Summary for all generations
| Summary | Value | 
|---|---| 
| Model | GPT_4O | 
| Type | Simple | 
| System | example | 
| Number of generations | 3 | 

| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 178 | 0.00% |
| Multiplicities Errors | 0 | 47 | 0.00% |
| Invariants Errors | 0 | 6 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs (Real) | 7 | 13 | 53.85% |
| IBANs (Realistic) | 7 | 13 | 53.85% |
| BICs (Realistic) | 1 | 7 | 14.29% |
| Countries (Realistic) | 1 | 7 | 14.29% |

| Failed IBANs (Real) | 
|---| 
```
US123456789
```
```
US987654321
```
```
DE1122334455
```
```
DE5544332211
```
```
DE0099887766
```
```
US123456789
```
```
US987654321
```
```
DE1122334455
```
```
DE5544332211
```
```
DE0099887766
```
```
IBAN6
```
```
IBAN7
```
```
IBAN6
```
```
IBAN7
```

| Failed IBANs (Realistic) | 
|---| 
```
US123456789
```
```
US987654321
```
```
DE1122334455
```
```
DE5544332211
```
```
DE0099887766
```
```
US123456789
```
```
US987654321
```
```
DE1122334455
```
```
DE5544332211
```
```
DE0099887766
```
```
IBAN6
```
```
IBAN7
```
```
IBAN6
```
```
IBAN7
```

| Failed BICs (Realistic) | 
|---| 
```
BIC3
```

| Failed Countries (Realistic) | 
|---| 
```
country3
```

