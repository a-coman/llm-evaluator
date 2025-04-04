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
| IBANs | 5 | 5 | 100.00% |
| BICs | 0 | 2 | 0.00% |
| Countries | 0 | 2 | 0.00% |

| Failed IBANs | 
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

# Generation 2
```
!new Bank('bank3')
!bank3.country := 'Canada'
!bank3.name := 'Royal Bank of Canada'
!bank3.bic := 'ROYCCAT2'

!new Account('account6')
!account6.iban := 'CA123456789012'
!account6.balance := 2000

!new Account('account7')
!account7.iban := 'CA987654321098'
!account7.balance := 3000

!new Person('person6')
!person6.firstName := 'Alice'
!person6.lastName := 'Wong'
!person6.age := 40

!new Person('person7')
!person7.firstName := 'Bob'
!person7.lastName := 'Johnson'
!person7.age := 29

!new Person('person8')
!person8.firstName := 'Carl'
!person8.lastName := 'Nguyen'
!person8.age := 25

!new Person('person9')
!person9.firstName := 'Sara'
!person9.lastName := 'Lee'
!person9.age := 50

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
## Generation 2 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 36 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 2 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
CA123456789012
```
```
CA987654321098
```

# Generation 3
```
!new Bank('bank4')
!bank4.country := 'Australia'
!bank4.name := 'Commonwealth Bank'
!bank4.bic := 'CTBAAU2S'

!new Account('account8')
!account8.iban := 'AU765432109876'
!account8.balance := 10000

!new Account('account9')
!account9.iban := 'AU123123123123'
!account9.balance := 2500

!new Account('account10')
!account10.iban := 'AU999888777666'
!account10.balance := 0

!new Person('person10')
!person10.firstName := 'Emma'
!person10.lastName := 'Brown'
!person10.age := 37

!new Person('person11')
!person11.firstName := 'Lucas'
!person11.lastName := 'Davis'
!person11.age := 22

!new Person('person12')
!person12.firstName := 'Sophia'
!person12.lastName := 'Wilson'
!person12.age := 19

-- Associations
!insert (bank4, account8) into AccountOfBanks
!insert (bank4, account9) into AccountOfBanks
!insert (bank4, account10) into AccountOfBanks

!insert (person10, account8) into Ownership
!insert (person11, account8) into Ownership

!insert (person11, account9) into Ownership
!insert (person12, account9) into Ownership

!insert (person12, account10) into Ownership
!insert (person11, account10) into Ownership

!insert (person10, account9) into Use
!insert (person10, account10) into Use

!insert (person12, account8) into Use
```
## Generation 3 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
AU765432109876
```
```
AU123123123123
```
```
AU999888777666
```

# Generation 4
```
!new Bank('bank5')
!bank5.country := 'Japan'
!bank5.name := 'Mitsubishi UFJ Financial Group'
!bank5.bic := 'BOTKJPJT'

!new Account('account11')
!account11.iban := 'JP123456789012345'
!account11.balance := 3500

!new Account('account12')
!account12.iban := 'JP543210987654321'
!account12.balance := 500

!new Person('person13')
!person13.firstName := 'Yuuto'
!person13.lastName := 'Tanaka'
!person13.age := 33

!new Person('person14')
!person14.firstName := 'Hana'
!person14.lastName := 'Sato'
!person14.age := 21

!new Person('person15')
!person15.firstName := 'Kaito'
!person15.lastName := 'Matsumoto'
!person15.age := 45

!new Person('person16')
!person16.firstName := 'Yuki'
!person16.lastName := 'Miyazaki'
!person16.age := 38

-- Associations
!insert (bank5, account11) into AccountOfBanks
!insert (bank5, account12) into AccountOfBanks

!insert (person13, account11) into Ownership
!insert (person14, account11) into Ownership

!insert (person15, account12) into Ownership

!insert (person16, account12) into Ownership

!insert (person13, account12) into Use
!insert (person14, account12) into Use
!insert (person15, account11) into Use
!insert (person16, account11) into Use
```
## Generation 4 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 36 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 2 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
JP123456789012345
```
```
JP543210987654321
```

# Generation 5
```
!new Bank('bank6')
!bank6.country := 'India'
!bank6.name := 'State Bank of India'
!bank6.bic := 'SBINAINBB'

!new Account('account13')
!account13.iban := 'IN5013370001000000'
!account13.balance := 8000

!new Account('account14')
!account14.iban := 'IN6013370002000001'
!account14.balance := 1200

!new Account('account15')
!account15.iban := 'IN7013370003000002'
!account15.balance := 2100

!new Person('person17')
!person17.firstName := 'Raj'
!person17.lastName := 'Gupta'
!person17.age := 29

!new Person('person18')
!person18.firstName := 'Simran'
!person18.lastName := 'Kaur'
!person18.age := 23

!new Person('person19')
!person19.firstName := 'Vikram'
!person19.lastName := 'Rao'
!person19.age := 50

-- Associations
!insert (bank6, account13) into AccountOfBanks
!insert (bank6, account14) into AccountOfBanks
!insert (bank6, account15) into AccountOfBanks

!insert (person17, account13) into Ownership
!insert (person18, account13) into Ownership

!insert (person18, account14) into Ownership
!insert (person19, account14) into Ownership

!insert (person17, account15) into Ownership
!insert (person19, account15) into Ownership

!insert (person18, account15) into Use
!insert (person19, account13) into Use

-- Ensure unique usage relationships
!insert (person17, account14) into Use
!insert (person19, account15) into Use
```
## Generation 5 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 1 | 1 | 100.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
IN5013370001000000
```
```
IN6013370002000001
```
```
IN7013370003000002
```

| Failed BICs | 
|---| 
```
SBINAINBB
```

# Generation 6
```
!new Bank('bank7')
!bank7.country := 'Brazil'
!bank7.name := 'Banco do Brasil'
!bank7.bic := 'BRASBRRJ'

!new Account('account16')
!account16.iban := 'BR1800000000000012345678901'
!account16.balance := 4500

!new Account('account17')
!account17.iban := 'BR1900000000000012345678902'
!account17.balance := 600

!new Account('account18')
!account18.iban := 'BR2000000000000012345678903'
!account18.balance := 10000

!new Person('person20')
!person20.firstName := 'Carlos'
!person20.lastName := 'Silva'
!person20.age := 42

!new Person('person21')
!person21.firstName := 'Maria'
!person21.lastName := 'Fernandes'
!person21.age := 31

!new Person('person22')
!person22.firstName := 'João'
!person22.lastName := 'Pereira'
!person22.age := 28

-- Associations
!insert (bank7, account16) into AccountOfBanks
!insert (bank7, account17) into AccountOfBanks
!insert (bank7, account18) into AccountOfBanks

!insert (person20, account16) into Ownership
!insert (person21, account16) into Ownership

!insert (person21, account17) into Ownership
!insert (person22, account17) into Ownership

!insert (person22, account18) into Ownership
!insert (person20, account18) into Ownership

!insert (person20, account17) into Use
!insert (person21, account18) into Use

!insert (person21, account16) into Use
!insert (person22, account16) into Use
```
## Generation 6 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
BR1800000000000012345678901
```
```
BR1900000000000012345678902
```
```
BR2000000000000012345678903
```

# Generation 7
```
!new Bank('bank8')
!bank8.country := 'France'
!bank8.name := 'BNP Paribas'
!bank8.bic := 'BNPAFRPP'

!new Account('account19')
!account19.iban := 'FR7630006000011234567890189'
!account19.balance := 7500

!new Account('account20')
!account20.iban := 'FR7630006000021234567890188'
!account20.balance := 250

!new Account('account21')
!account21.iban := 'FR7630006000031234567890187'
!account21.balance := 5000

!new Person('person23')
!person23.firstName := 'Jean'
!person23.lastName := 'Dupont'
!person23.age := 47

!new Person('person24')
!person24.firstName := 'Lucie'
!person24.lastName := 'Martin'
!person24.age := 35

!new Person('person25')
!person25.firstName := 'Pierre'
!person25.lastName := 'Leclerc'
!person25.age := 54

-- Associations
!insert (bank8, account19) into AccountOfBanks
!insert (bank8, account20) into AccountOfBanks
!insert (bank8, account21) into AccountOfBanks

!insert (person23, account19) into Ownership
!insert (person24, account19) into Ownership

!insert (person24, account20) into Ownership
!insert (person25, account20) into Ownership

!insert (person25, account21) into Ownership
!insert (person23, account21) into Ownership

!insert (person24, account21) into Use
!insert (person23, account20) into Use

!insert (person25, account19) into Use
!insert (person24, account19) into Use
```
## Generation 7 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 3 | 66.67% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
FR7630006000021234567890188
```
```
FR7630006000031234567890187
```

# Generation 8
```
!new Bank('bank9')
!bank9.country := 'Italy'
!bank9.name := 'UniCredit'
!bank9.bic := 'UNCRITMM'

!new Account('account22')
!account22.iban := 'IT6003600001001234567890123'
!account22.balance := 10000

!new Account('account23')
!account23.iban := 'IT6003600002001234567890122'
!account23.balance := 1500

!new Account('account24')
!account24.iban := 'IT6003600003001234567890121'
!account24.balance := 3200

!new Person('person26')
!person26.firstName := 'Marco'
!person26.lastName := 'Rossi'
!person26.age := 39

!new Person('person27')
!person27.firstName := 'Giulia'
!person27.lastName := 'Bianchi'
!person27.age := 33

!new Person('person28')
!person28.firstName := 'Luca'
!person28.lastName := 'Conti'
!person28.age := 25

-- Associations
!insert (bank9, account22) into AccountOfBanks
!insert (bank9, account23) into AccountOfBanks
!insert (bank9, account24) into AccountOfBanks

!insert (person26, account22) into Ownership
!insert (person27, account22) into Ownership

!insert (person27, account23) into Ownership
!insert (person28, account23) into Ownership

!insert (person28, account24) into Ownership
!insert (person26, account24) into Ownership

!insert (person26, account23) into Use
!insert (person27, account24) into Use

!insert (person28, account22) into Use
!insert (person27, account22) into Use
```
## Generation 8 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
IT6003600001001234567890123
```
```
IT6003600002001234567890122
```
```
IT6003600003001234567890121
```

# Generation 9
```
!new Bank('bank10')
!bank10.country := 'Canada'
!bank10.name := 'Scotiabank'
!bank10.bic := 'NOSCCATT'

!new Account('account25')
!account25.iban := 'CA000123450067890'
!account25.balance := 2500

!new Account('account26')
!account26.iban := 'CA000987650032165'
!account26.balance := 4000

!new Account('account27')
!account27.iban := 'CA000555550012345'
!account27.balance := 0

!new Person('person29')
!person29.firstName := 'Ava'
!person29.lastName := 'Johnson'
!person29.age := 45

!new Person('person30')
!person30.firstName := 'Ethan'
!person30.lastName := 'Williams'
!person30.age := 30

!new Person('person31')
!person31.firstName := 'Olivia'
!person31.lastName := 'Brown'
!person31.age := 27

-- Associations
!insert (bank10, account25) into AccountOfBanks
!insert (bank10, account26) into AccountOfBanks
!insert (bank10, account27) into AccountOfBanks

!insert (person29, account25) into Ownership
!insert (person30, account25) into Ownership

!insert (person30, account26) into Ownership
!insert (person31, account26) into Ownership

!insert (person31, account27) into Ownership
!insert (person29, account27) into Ownership

!insert (person29, account26) into Use
!insert (person30, account27) into Use

!insert (person31, account25) into Use
!insert (person30, account25) into Use
```
## Generation 9 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
CA000123450067890
```
```
CA000987650032165
```
```
CA000555550012345
```

# Generation 10
```
!new Bank('bank11')
!bank11.country := 'Australia'
!bank11.name := 'Westpac'
!bank11.bic := 'WPACAU2S'

!new Account('account28')
!account28.iban := 'AU123456789012345678'
!account28.balance := 6700

!new Account('account29')
!account29.iban := 'AU987654321098765432'
!account29.balance := 1300

!new Account('account30')
!account30.iban := 'AU321123456789654789'
!account30.balance := 2200

!new Person('person32')
!person32.firstName := 'James'
!person32.lastName := 'Smith'
!person32.age := 52

!new Person('person33')
!person33.firstName := 'Emma'
!person33.lastName := 'Taylor'
!person33.age := 34

!new Person('person34')
!person34.firstName := 'Liam'
!person34.lastName := 'Moore'
!person34.age := 26

-- Associations
!insert (bank11, account28) into AccountOfBanks
!insert (bank11, account29) into AccountOfBanks
!insert (bank11, account30) into AccountOfBanks

!insert (person32, account28) into Ownership
!insert (person33, account28) into Ownership

!insert (person33, account29) into Ownership
!insert (person34, account29) into Ownership

!insert (person34, account30) into Ownership
!insert (person32, account30) into Ownership

!insert (person32, account29) into Use
!insert (person33, account30) into Use

!insert (person34, account28) into Use
!insert (person33, account28) into Use
```
## Generation 10 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
AU123456789012345678
```
```
AU987654321098765432
```
```
AU321123456789654789
```

# Generation 11
```
!new Bank('bank12')
!bank12.country := 'Sweden'
!bank12.name := 'SEB'
!bank12.bic := 'ESSESESS'

!new Account('account31')
!account31.iban := 'SE3550000000054910000003'
!account31.balance := 4800

!new Account('account32')
!account32.iban := 'SE3550000000069480000004'
!account32.balance := 900

!new Account('account33')
!account33.iban := 'SE3550000000071230000005'
!account33.balance := 12000

!new Person('person35')
!person35.firstName := 'Ingrid'
!person35.lastName := 'Larsson'
!person35.age := 41

!new Person('person36')
!person36.firstName := 'Erik'
!person36.lastName := 'Svensson'
!person36.age := 38

!new Person('person37')
!person37.firstName := 'Karin'
!person37.lastName := 'Nilsson'
!person37.age := 29

-- Associations
!insert (bank12, account31) into AccountOfBanks
!insert (bank12, account32) into AccountOfBanks
!insert (bank12, account33) into AccountOfBanks

!insert (person35, account31) into Ownership
!insert (person36, account31) into Ownership

!insert (person36, account32) into Ownership
!insert (person37, account32) into Ownership

!insert (person37, account33) into Ownership
!insert (person35, account33) into Ownership

!insert (person35, account32) into Use
!insert (person36, account33) into Use

!insert (person37, account31) into Use
!insert (person36, account31) into Use
```
## Generation 11 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 3 | 66.67% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
SE3550000000069480000004
```
```
SE3550000000071230000005
```

# Generation 12
```
!new Bank('bank13')
!bank13.country := 'Singapore'
!bank13.name := 'DBS Bank'
!bank13.bic := 'DBSSSGSG'

!new Account('account34')
!account34.iban := 'SG12345678901234567890'
!account34.balance := 5200

!new Account('account35')
!account35.iban := 'SG09876543210987654321'
!account35.balance := 300

!new Account('account36')
!account36.iban := 'SG11122233344455566677'
!account36.balance := 7500

!new Person('person38')
!person38.firstName := 'Wei'
!person38.lastName := 'Tan'
!person38.age := 27

!new Person('person39')
!person39.firstName := 'Li'
!person39.lastName := 'Huang'
!person39.age := 22

!new Person('person40')
!person40.firstName := 'Siti'
!person40.lastName := 'Abdul'
!person40.age := 35

-- Associations
!insert (bank13, account34) into AccountOfBanks
!insert (bank13, account35) into AccountOfBanks
!insert (bank13, account36) into AccountOfBanks

!insert (person38, account34) into Ownership
!insert (person39, account34) into Ownership

!insert (person39, account35) into Ownership
!insert (person40, account35) into Ownership

!insert (person40, account36) into Ownership
!insert (person38, account36) into Ownership

!insert (person38, account35) into Use
!insert (person39, account36) into Use

!insert (person40, account34) into Use
!insert (person39, account34) into Use
```
## Generation 12 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
SG12345678901234567890
```
```
SG09876543210987654321
```
```
SG11122233344455566677
```

# Generation 13
```
!new Bank('bank14')
!bank14.country := 'New Zealand'
!bank14.name := 'ANZ Bank'
!bank14.bic := 'ANZBNZ22'

!new Account('account37')
!account37.iban := 'NZ123456789012345678901'
!account37.balance := 4400

!new Account('account38')
!account38.iban := 'NZ987654321098765432109'
!account38.balance := 6000

!new Account('account39')
!account39.iban := 'NZ555666777888999000123'
!account39.balance := 150

!new Person('person41')
!person41.firstName := 'Sophie'
!person41.lastName := 'Wilson'
!person41.age := 29

!new Person('person42')
!person42.firstName := 'Oliver'
!person42.lastName := 'Jackson'
!person42.age := 42

!new Person('person43')
!person43.firstName := 'Charlotte'
!person43.lastName := 'Harris'
!person43.age := 31

-- Associations
!insert (bank14, account37) into AccountOfBanks
!insert (bank14, account38) into AccountOfBanks
!insert (bank14, account39) into AccountOfBanks

!insert (person41, account37) into Ownership
!insert (person42, account37) into Ownership

!insert (person42, account38) into Ownership
!insert (person43, account38) into Ownership

!insert (person43, account39) into Ownership
!insert (person41, account39) into Ownership

!insert (person41, account38) into Use
!insert (person42, account39) into Use

!insert (person43, account37) into Use
!insert (person42, account37) into Use
```
## Generation 13 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
NZ123456789012345678901
```
```
NZ987654321098765432109
```
```
NZ555666777888999000123
```

# Generation 14
```
!new Bank('bank15')
!bank15.country := 'South Africa'
!bank15.name := 'FirstRand Bank'
!bank15.bic := 'FIRNZAJJ'

!new Account('account40')
!account40.iban := 'ZA123456789012345678'
!account40.balance := 5500

!new Account('account41')
!account41.iban := 'ZA876543210987654321'
!account41.balance := 800

!new Account('account42')
!account42.iban := 'ZA192837465091827364'
!account42.balance := 3100

!new Person('person44')
!person44.firstName := 'Thandi'
!person44.lastName := 'Nkosi'
!person44.age := 36

!new Person('person45')
!person45.firstName := 'Sipho'
!person45.lastName := 'Moyo'
!person45.age := 28

!new Person('person46')
!person46.firstName := 'Lerato'
!person46.lastName := 'Dlamini'
!person46.age := 40

-- Associations
!insert (bank15, account40) into AccountOfBanks
!insert (bank15, account41) into AccountOfBanks
!insert (bank15, account42) into AccountOfBanks

!insert (person44, account40) into Ownership
!insert (person45, account40) into Ownership

!insert (person45, account41) into Ownership
!insert (person46, account41) into Ownership

!insert (person46, account42) into Ownership
!insert (person44, account42) into Ownership

!insert (person44, account41) into Use
!insert (person45, account42) into Use

!insert (person46, account40) into Use
!insert (person45, account40) into Use
```
## Generation 14 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
ZA123456789012345678
```
```
ZA876543210987654321
```
```
ZA192837465091827364
```

# Generation 15
```
!new Bank('bank16')
!bank16.country := 'Mexico'
!bank16.name := 'Banorte'
!bank16.bic := 'BNMXMXMM'

!new Account('account43')
!account43.iban := 'MX12345678901234567890'
!account43.balance := 1200

!new Account('account44')
!account44.iban := 'MX09876543210987654321'
!account44.balance := 3300

!new Account('account45')
!account45.iban := 'MX11121314151617181920'
!account45.balance := 7200

!new Person('person47')
!person47.firstName := 'Juan'
!person47.lastName := 'Lopez'
!person47.age := 45

!new Person('person48')
!person48.firstName := 'Ana'
!person48.lastName := 'Garcia'
!person48.age := 32

!new Person('person49')
!person49.firstName := 'Carlos'
!person49.lastName := 'Martinez'
!person49.age := 25

-- Associations
!insert (bank16, account43) into AccountOfBanks
!insert (bank16, account44) into AccountOfBanks
!insert (bank16, account45) into AccountOfBanks

!insert (person47, account43) into Ownership
!insert (person48, account43) into Ownership

!insert (person48, account44) into Ownership
!insert (person49, account44) into Ownership

!insert (person49, account45) into Ownership
!insert (person47, account45) into Ownership

!insert (person47, account44) into Use
!insert (person48, account45) into Use

!insert (person49, account43) into Use
!insert (person48, account43) into Use
```
## Generation 15 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
MX12345678901234567890
```
```
MX09876543210987654321
```
```
MX11121314151617181920
```

# Generation 16
```
!new Bank('bank17')
!bank17.country := 'South Korea'
!bank17.name := 'Kookmin Bank'
!bank17.bic := 'KOOKKRSE'

!new Account('account46')
!account46.iban := 'KR12345678901234567890'
!account46.balance := 2400

!new Account('account47')
!account47.iban := 'KR09876543210987654321'
!account47.balance := 5400

!new Account('account48')
!account48.iban := 'KR56789012345678901234'
!account48.balance := 100

!new Person('person50')
!person50.firstName := 'Hyun'
!person50.lastName := 'Kim'
!person50.age := 50

!new Person('person51')
!person51.firstName := 'Minji'
!person51.lastName := 'Park'
!person51.age := 29

!new Person('person52')
!person52.firstName := 'Jisoo'
!person52.lastName := 'Lee'
!person52.age := 41

-- Associations
!insert (bank17, account46) into AccountOfBanks
!insert (bank17, account47) into AccountOfBanks
!insert (bank17, account48) into AccountOfBanks

!insert (person50, account46) into Ownership
!insert (person51, account46) into Ownership

!insert (person51, account47) into Ownership
!insert (person52, account47) into Ownership

!insert (person52, account48) into Ownership
!insert (person50, account48) into Ownership

!insert (person50, account47) into Use
!insert (person51, account48) into Use

!insert (person52, account46) into Use
!insert (person51, account46) into Use
```
## Generation 16 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
KR12345678901234567890
```
```
KR09876543210987654321
```
```
KR56789012345678901234
```

# Generation 17
```
!new Bank('bank18')
!bank18.country := 'Netherlands'
!bank18.name := 'ING Bank'
!bank18.bic := 'INGBNL2A'

!new Account('account49')
!account49.iban := 'NL91ABNA0417164300'
!account49.balance := 6500

!new Account('account50')
!account50.iban := 'NL91ABNA0417164301'
!account50.balance := 2000

!new Account('account51')
!account51.iban := 'NL91ABNA0417164302'
!account51.balance := 450

!new Person('person53')
!person53.firstName := 'Sander'
!person53.lastName := 'Janssen'
!person53.age := 38

!new Person('person54')
!person54.firstName := 'Eva'
!person54.lastName := 'Meijer'
!person54.age := 30

!new Person('person55')
!person55.firstName := 'Tom'
!person55.lastName := 'Willems'
!person55.age := 44

-- Associations
!insert (bank18, account49) into AccountOfBanks
!insert (bank18, account50) into AccountOfBanks
!insert (bank18, account51) into AccountOfBanks

!insert (person53, account49) into Ownership
!insert (person54, account49) into Ownership

!insert (person54, account50) into Ownership
!insert (person55, account50) into Ownership

!insert (person55, account51) into Ownership
!insert (person53, account51) into Ownership

!insert (person53, account50) into Use
!insert (person54, account51) into Use

!insert (person55, account49) into Use
!insert (person54, account49) into Use
```
## Generation 17 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 3 | 66.67% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
NL91ABNA0417164301
```
```
NL91ABNA0417164302
```

# Generation 18
```
!new Bank('bank19')
!bank19.country := 'India'
!bank19.name := 'HDFC Bank'
!bank19.bic := 'HDFCINBB'

!new Account('account52')
!account52.iban := 'IN50101345678912345678'
!account52.balance := 6800

!new Account('account53')
!account53.iban := 'IN60111345678912345679'
!account53.balance := 1500

!new Account('account54')
!account54.iban := 'IN70121345678912345680'
!account54.balance := 2900

!new Person('person56')
!person56.firstName := 'Aarav'
!person56.lastName := 'Sharma'
!person56.age := 39

!new Person('person57')
!person57.firstName := 'Priya'
!person57.lastName := 'Verma'
!person57.age := 35

!new Person('person58')
!person58.firstName := 'Rajesh'
!person58.lastName := 'Patel'
!person58.age := 43

-- Associations
!insert (bank19, account52) into AccountOfBanks
!insert (bank19, account53) into AccountOfBanks
!insert (bank19, account54) into AccountOfBanks

!insert (person56, account52) into Ownership
!insert (person57, account52) into Ownership

!insert (person57, account53) into Ownership
!insert (person58, account53) into Ownership

!insert (person58, account54) into Ownership
!insert (person56, account54) into Ownership

!insert (person56, account53) into Use
!insert (person57, account54) into Use

!insert (person58, account52) into Use
!insert (person57, account52) into Use
```
## Generation 18 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
IN50101345678912345678
```
```
IN60111345678912345679
```
```
IN70121345678912345680
```

# Generation 19
```
!new Bank('bank20')
!bank20.country := 'Turkey'
!bank20.name := 'Garanti BBVA'
!bank20.bic := 'TGBATRIS'

!new Account('account55')
!account55.iban := 'TR330006100519786457841326'
!account55.balance := 5500

!new Account('account56')
!account56.iban := 'TR330006100519786457841327'
!account56.balance := 1200

!new Account('account57')
!account57.iban := 'TR330006100519786457841328'
!account57.balance := 4000

!new Person('person59')
!person59.firstName := 'Elif'
!person59.lastName := 'Yilmaz'
!person59.age := 34

!new Person('person60')
!person60.firstName := 'Murat'
!person60.lastName := 'Ozturk'
!person60.age := 48

!new Person('person61')
!person61.firstName := 'Selin'
!person61.lastName := 'Demir'
!person61.age := 28

-- Associations
!insert (bank20, account55) into AccountOfBanks
!insert (bank20, account56) into AccountOfBanks
!insert (bank20, account57) into AccountOfBanks

!insert (person59, account55) into Ownership
!insert (person60, account55) into Ownership

!insert (person60, account56) into Ownership
!insert (person61, account56) into Ownership

!insert (person61, account57) into Ownership
!insert (person59, account57) into Ownership

!insert (person59, account56) into Use
!insert (person60, account57) into Use

!insert (person61, account55) into Use
!insert (person60, account55) into Use
```
## Generation 19 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 3 | 66.67% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
TR330006100519786457841327
```
```
TR330006100519786457841328
```

# Generation 20
```
!new Bank('bank21')
!bank21.country := 'Brazil'
!bank21.name := 'Banco Bradesco'
!bank21.bic := 'BBDEBRSPSPO'

!new Account('account58')
!account58.iban := 'BR1800000000001012345678901B'
!account58.balance := 7500

!new Account('account59')
!account59.iban := 'BR1800000000002012345678902B'
!account59.balance := 500

!new Account('account60')
!account60.iban := 'BR1800000000003012345678903B'
!account60.balance := 6000

!new Person('person62')
!person62.firstName := 'Lucas'
!person62.lastName := 'Santos'
!person62.age := 42

!new Person('person63')
!person63.firstName := 'Mariana'
!person63.lastName := 'Costa'
!person63.age := 37

!new Person('person64')
!person64.firstName := 'Felipe'
!person64.lastName := 'Almeida'
!person64.age := 29

-- Associations
!insert (bank21, account58) into AccountOfBanks
!insert (bank21, account59) into AccountOfBanks
!insert (bank21, account60) into AccountOfBanks

!insert (person62, account58) into Ownership
!insert (person63, account58) into Ownership

!insert (person63, account59) into Ownership
!insert (person64, account59) into Ownership

!insert (person64, account60) into Ownership
!insert (person62, account60) into Ownership

!insert (person62, account59) into Use
!insert (person63, account60) into Use

!insert (person64, account58) into Use
!insert (person63, account58) into Use
```
## Generation 20 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
BR1800000000001012345678901B
```
```
BR1800000000002012345678902B
```
```
BR1800000000003012345678903B
```

# Generation 21
```
!new Bank('bank22')
!bank22.country := 'Spain'
!bank22.name := 'Santander Bank'
!bank22.bic := 'BSCHESMM'

!new Account('account61')
!account61.iban := 'ES9121000418450200051332'
!account61.balance := 5200

!new Account('account62')
!account62.iban := 'ES9121000418450200051333'
!account62.balance := 1800

!new Account('account63')
!account63.iban := 'ES9121000418450200051334'
!account63.balance := 7700

!new Person('person65')
!person65.firstName := 'Antonio'
!person65.lastName := 'García'
!person65.age := 36

!new Person('person66')
!person66.firstName := 'Sofia'
!person66.lastName := 'Martinez'
!person66.age := 31

!new Person('person67')
!person67.firstName := 'Miguel'
!person67.lastName := 'Torres'
!person67.age := 39

-- Associations
!insert (bank22, account61) into AccountOfBanks
!insert (bank22, account62) into AccountOfBanks
!insert (bank22, account63) into AccountOfBanks

!insert (person65, account61) into Ownership
!insert (person66, account61) into Ownership

!insert (person66, account62) into Ownership
!insert (person67, account62) into Ownership

!insert (person67, account63) into Ownership
!insert (person65, account63) into Ownership

!insert (person65, account62) into Use
!insert (person66, account63) into Use

!insert (person67, account61) into Use
!insert (person66, account61) into Use
```
## Generation 21 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 3 | 66.67% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
ES9121000418450200051333
```
```
ES9121000418450200051334
```

# Generation 22
```
!new Bank('bank23')
!bank23.country := 'Nigeria'
!bank23.name := 'Zenith Bank'
!bank23.bic := 'ZEIBNGLA'

!new Account('account64')
!account64.iban := 'NG1234567890123456789012'
!account64.balance := 3000

!new Account('account65')
!account65.iban := 'NG0987654321098765432101'
!account65.balance := 4500

!new Account('account66')
!account66.iban := 'NG1122334455667788990000'
!account66.balance := 0

!new Person('person68')
!person68.firstName := 'Chinwe'
!person68.lastName := 'Okeke'
!person68.age := 40

!new Person('person69')
!person69.firstName := 'Ibrahim'
!person69.lastName := 'Mohammed'
!person69.age := 45

!new Person('person70')
!person70.firstName := 'Amina'
!person70.lastName := 'Bello'
!person70.age := 33

-- Associations
!insert (bank23, account64) into AccountOfBanks
!insert (bank23, account65) into AccountOfBanks
!insert (bank23, account66) into AccountOfBanks

!insert (person68, account64) into Ownership
!insert (person69, account64) into Ownership

!insert (person69, account65) into Ownership
!insert (person70, account65) into Ownership

!insert (person70, account66) into Ownership
!insert (person68, account66) into Ownership

!insert (person68, account65) into Use
!insert (person69, account66) into Use

!insert (person70, account64) into Use
!insert (person69, account64) into Use
```
## Generation 22 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
NG1234567890123456789012
```
```
NG0987654321098765432101
```
```
NG1122334455667788990000
```

# Generation 23
```
!new Bank('bank24')
!bank24.country := 'United Arab Emirates'
!bank24.name := 'Emirates NBD'
!bank24.bic := 'EBILAEAD'

!new Account('account67')
!account67.iban := 'AE070331234567890123456'
!account67.balance := 9500

!new Account('account68')
!account68.iban := 'AE070331234567890123457'
!account68.balance := 3400

!new Account('account69')
!account69.iban := 'AE070331234567890123458'
!account69.balance := 600

!new Person('person71')
!person71.firstName := 'Fatima'
!person71.lastName := 'Al Zahara'
!person71.age := 29

!new Person('person72')
!person72.firstName := 'Ahmed'
!person72.lastName := 'Khan'
!person72.age := 36

!new Person('person73')
!person73.firstName := 'Sara'
!person73.lastName := 'Al Mansouri'
!person73.age := 42

-- Associations
!insert (bank24, account67) into AccountOfBanks
!insert (bank24, account68) into AccountOfBanks
!insert (bank24, account69) into AccountOfBanks

!insert (person71, account67) into Ownership
!insert (person72, account67) into Ownership

!insert (person72, account68) into Ownership
!insert (person73, account68) into Ownership

!insert (person73, account69) into Ownership
!insert (person71, account69) into Ownership

!insert (person71, account68) into Use
!insert (person72, account69) into Use

!insert (person73, account67) into Use
!insert (person72, account67) into Use
```
## Generation 23 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 3 | 66.67% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
AE070331234567890123457
```
```
AE070331234567890123458
```

# Generation 24
```
!new Bank('bank25')
!bank25.country := 'Switzerland'
!bank25.name := 'Credit Suisse'
!bank25.bic := 'CRESCHZZ80A'

!new Account('account70')
!account70.iban := 'CH5604835012345678009'
!account70.balance := 7800

!new Account('account71')
!account71.iban := 'CH5604835012345678010'
!account71.balance := 150

!new Account('account72')
!account72.iban := 'CH5604835012345678011'
!account72.balance := 5000

!new Person('person74')
!person74.firstName := 'Lukas'
!person74.lastName := 'Müller'
!person74.age := 48

!new Person('person75')
!person75.firstName := 'Nina'
!person75.lastName := 'Schneider'
!person75.age := 33

!new Person('person76')
!person76.firstName := 'Fabian'
!person76.lastName := 'Bernhard'
!person76.age := 29

-- Associations
!insert (bank25, account70) into AccountOfBanks
!insert (bank25, account71) into AccountOfBanks
!insert (bank25, account72) into AccountOfBanks

!insert (person74, account70) into Ownership
!insert (person75, account70) into Ownership

!insert (person75, account71) into Ownership
!insert (person76, account71) into Ownership

!insert (person76, account72) into Ownership
!insert (person74, account72) into Ownership

!insert (person74, account71) into Use
!insert (person75, account72) into Use

!insert (person76, account70) into Use
!insert (person75, account70) into Use
```
## Generation 24 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 3 | 66.67% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
CH5604835012345678010
```
```
CH5604835012345678011
```

# Generation 25
```
!new Bank('bank26')
!bank26.country := 'Japan'
!bank26.name := 'Sumitomo Mitsui Banking Corporation'
!bank26.bic := 'SMBCJPJT'

!new Account('account73')
!account73.iban := 'JP890000000000123456789'
!account73.balance := 6250

!new Account('account74')
!account74.iban := 'JP890000000000987654321'
!account74.balance := 400

!new Account('account75')
!account75.iban := 'JP890000000000567890123'
!account75.balance := 2700

!new Person('person77')
!person77.firstName := 'Haruto'
!person77.lastName := 'Suzuki'
!person77.age := 38

!new Person('person78')
!person78.firstName := 'Yua'
!person78.lastName := 'Takahashi'
!person78.age := 34

!new Person('person79')
!person79.firstName := 'Satoshi'
!person79.lastName := 'Yamamoto'
!person79.age := 41

-- Associations
!insert (bank26, account73) into AccountOfBanks
!insert (bank26, account74) into AccountOfBanks
!insert (bank26, account75) into AccountOfBanks

!insert (person77, account73) into Ownership
!insert (person78, account73) into Ownership

!insert (person78, account74) into Ownership
!insert (person79, account74) into Ownership

!insert (person79, account75) into Ownership
!insert (person77, account75) into Ownership

!insert (person77, account74) into Use
!insert (person78, account75) into Use

!insert (person79, account73) into Use
!insert (person78, account73) into Use
```
## Generation 25 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
JP890000000000123456789
```
```
JP890000000000987654321
```
```
JP890000000000567890123
```

# Generation 26
```
!new Bank('bank27')
!bank27.country := 'China'
!bank27.name := 'Industrial and Commercial Bank of China'
!bank27.bic := 'ICBKCNBJ'

!new Account('account76')
!account76.iban := 'CN123456789012345678901'
!account76.balance := 8900

!new Account('account77')
!account77.iban := 'CN987654321098765432109'
!account77.balance := 3200

!new Account('account78')
!account78.iban := 'CN192837465091827364550'
!account78.balance := 700

!new Person('person80')
!person80.firstName := 'Wei'
!person80.lastName := 'Zhang'
!person80.age := 50

!new Person('person81')
!person81.firstName := 'Lina'
!person81.lastName := 'Wang'
!person81.age := 27

!new Person('person82')
!person82.firstName := 'Hao'
!person82.lastName := 'Li'
!person82.age := 35

-- Associations
!insert (bank27, account76) into AccountOfBanks
!insert (bank27, account77) into AccountOfBanks
!insert (bank27, account78) into AccountOfBanks

!insert (person80, account76) into Ownership
!insert (person81, account76) into Ownership

!insert (person81, account77) into Ownership
!insert (person82, account77) into Ownership

!insert (person82, account78) into Ownership
!insert (person80, account78) into Ownership

!insert (person80, account77) into Use
!insert (person81, account78) into Use

!insert (person82, account76) into Use
!insert (person81, account76) into Use
```
## Generation 26 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
CN123456789012345678901
```
```
CN987654321098765432109
```
```
CN192837465091827364550
```

# Generation 27
```
!new Bank('bank28')
!bank28.country := 'Russia'
!bank28.name := 'Sberbank'
!bank28.bic := 'SABRRUMM'

!new Account('account79')
!account79.iban := 'RU1234567890123456789012'
!account79.balance := 8400

!new Account('account80')
!account80.iban := 'RU2345678901234567890123'
!account80.balance := 3100

!new Account('account81')
!account81.iban := 'RU3456789012345678901234'
!account81.balance := 200

!new Person('person83')
!person83.firstName := 'Ivan'
!person83.lastName := 'Petrov'
!person83.age := 45

!new Person('person84')
!person84.firstName := 'Anastasia'
!person84.lastName := 'Ivanova'
!person84.age := 32

!new Person('person85')
!person85.firstName := 'Dmitri'
!person85.lastName := 'Sokolov'
!person85.age := 28

-- Associations
!insert (bank28, account79) into AccountOfBanks
!insert (bank28, account80) into AccountOfBanks
!insert (bank28, account81) into AccountOfBanks

!insert (person83, account79) into Ownership
!insert (person84, account79) into Ownership

!insert (person84, account80) into Ownership
!insert (person85, account80) into Ownership

!insert (person85, account81) into Ownership
!insert (person83, account81) into Ownership

!insert (person83, account80) into Use
!insert (person84, account81) into Use

!insert (person85, account79) into Use
!insert (person84, account79) into Use
```
## Generation 27 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
RU1234567890123456789012
```
```
RU2345678901234567890123
```
```
RU3456789012345678901234
```

# Generation 28
```
!new Bank('bank29')
!bank29.country := 'Argentina'
!bank29.name := 'Banco Galicia'
!bank29.bic := 'GALICARX'

!new Account('account82')
!account82.iban := 'AR123456789012345678901'
!account82.balance := 5600

!new Account('account83')
!account83.iban := 'AR987654321098765432101'
!account83.balance := 1200

!new Account('account84')
!account84.iban := 'AR192837465091827364501'
!account84.balance := 3600

!new Person('person86')
!person86.firstName := 'Diego'
!person86.lastName := 'Fernandez'
!person86.age := 44

!new Person('person87')
!person87.firstName := 'Lucia'
!person87.lastName := 'Gonzalez'
!person87.age := 29

!new Person('person88')
!person88.firstName := 'Mateo'
!person88.lastName := 'Rodriguez'
!person88.age := 33

-- Associations
!insert (bank29, account82) into AccountOfBanks
!insert (bank29, account83) into AccountOfBanks
!insert (bank29, account84) into AccountOfBanks

!insert (person86, account82) into Ownership
!insert (person87, account82) into Ownership

!insert (person87, account83) into Ownership
!insert (person88, account83) into Ownership

!insert (person88, account84) into Ownership
!insert (person86, account84) into Ownership

!insert (person86, account83) into Use
!insert (person87, account84) into Use

!insert (person88, account82) into Use
!insert (person87, account82) into Use
```
## Generation 28 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
AR123456789012345678901
```
```
AR987654321098765432101
```
```
AR192837465091827364501
```

# Generation 29
```
!new Bank('bank30')
!bank30.country := 'Thailand'
!bank30.name := 'Bangkok Bank'
!bank30.bic := 'BKKBTHBK'

!new Account('account85')
!account85.iban := 'TH123456789012345678901'
!account85.balance := 7700

!new Account('account86')
!account86.iban := 'TH987654321098765432109'
!account86.balance := 900

!new Account('account87')
!account87.iban := 'TH543217890123456789012'
!account87.balance := 4100

!new Person('person89')
!person89.firstName := 'Apinya'
!person89.lastName := 'Somchai'
!person89.age := 37

!new Person('person90')
!person90.firstName := 'Niran'
!person90.lastName := 'Chatri'
!person90.age := 41

!new Person('person91')
!person91.firstName := 'Arisa'
!person91.lastName := 'Kamon'
!person91.age := 28

-- Associations
!insert (bank30, account85) into AccountOfBanks
!insert (bank30, account86) into AccountOfBanks
!insert (bank30, account87) into AccountOfBanks

!insert (person89, account85) into Ownership
!insert (person90, account85) into Ownership

!insert (person90, account86) into Ownership
!insert (person91, account86) into Ownership

!insert (person91, account87) into Ownership
!insert (person89, account87) into Ownership

!insert (person89, account86) into Use
!insert (person90, account87) into Use

!insert (person91, account85) into Use
!insert (person90, account85) into Use
```
## Generation 29 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
TH123456789012345678901
```
```
TH987654321098765432109
```
```
TH543217890123456789012
```

# Generation 30
```
!new Bank('bank31')
!bank31.country := 'South Korea'
!bank31.name := 'Woori Bank'
!bank31.bic := 'HVBKKRSE'

!new Account('account88')
!account88.iban := 'KR700110000747123456789'
!account88.balance := 9300

!new Account('account89')
!account89.iban := 'KR700110000747987654321'
!account89.balance := 2100

!new Account('account90')
!account90.iban := 'KR700110000747567890123'
!account90.balance := 1000

!new Person('person92')
!person92.firstName := 'Minseo'
!person92.lastName := 'Park'
!person92.age := 39

!new Person('person93')
!person93.firstName := 'Jisoo'
!person93.lastName := 'Kim'
!person93.age := 30

!new Person('person94')
!person94.firstName := 'Sujin'
!person94.lastName := 'Choi'
!person94.age := 27

-- Associations
!insert (bank31, account88) into AccountOfBanks
!insert (bank31, account89) into AccountOfBanks
!insert (bank31, account90) into AccountOfBanks

!insert (person92, account88) into Ownership
!insert (person93, account88) into Ownership

!insert (person93, account89) into Ownership
!insert (person94, account89) into Ownership

!insert (person94, account90) into Ownership
!insert (person92, account90) into Ownership

!insert (person92, account89) into Use
!insert (person93, account90) into Use

!insert (person94, account88) into Use
!insert (person93, account88) into Use
```
## Generation 30 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
KR700110000747123456789
```
```
KR700110000747987654321
```
```
KR700110000747567890123
```

# Summary for all generations
| Summary | Value | 
|---|---| 
| Model | GPT_4O | 
| Type | Simple | 
| System | bank | 
| Number of generations | 30 | 

| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 1156 | 0.00% |
| Multiplicities Errors | 0 | 386 | 0.00% |
| Invariants Errors | 0 | 60 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 83 | 90 | 92.22% |
| BICs | 1 | 31 | 3.23% |
| Countries | 0 | 31 | 0.00% |

| Failed IBANs | 
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
CA123456789012
```
```
CA987654321098
```
```
AU765432109876
```
```
AU123123123123
```
```
AU999888777666
```
```
JP123456789012345
```
```
JP543210987654321
```
```
IN5013370001000000
```
```
IN6013370002000001
```
```
IN7013370003000002
```
```
BR1800000000000012345678901
```
```
BR1900000000000012345678902
```
```
BR2000000000000012345678903
```
```
FR7630006000021234567890188
```
```
FR7630006000031234567890187
```
```
IT6003600001001234567890123
```
```
IT6003600002001234567890122
```
```
IT6003600003001234567890121
```
```
CA000123450067890
```
```
CA000987650032165
```
```
CA000555550012345
```
```
AU123456789012345678
```
```
AU987654321098765432
```
```
AU321123456789654789
```
```
SE3550000000069480000004
```
```
SE3550000000071230000005
```
```
SG12345678901234567890
```
```
SG09876543210987654321
```
```
SG11122233344455566677
```
```
NZ123456789012345678901
```
```
NZ987654321098765432109
```
```
NZ555666777888999000123
```
```
ZA123456789012345678
```
```
ZA876543210987654321
```
```
ZA192837465091827364
```
```
MX12345678901234567890
```
```
MX09876543210987654321
```
```
MX11121314151617181920
```
```
KR12345678901234567890
```
```
KR09876543210987654321
```
```
KR56789012345678901234
```
```
NL91ABNA0417164301
```
```
NL91ABNA0417164302
```
```
IN50101345678912345678
```
```
IN60111345678912345679
```
```
IN70121345678912345680
```
```
TR330006100519786457841327
```
```
TR330006100519786457841328
```
```
BR1800000000001012345678901B
```
```
BR1800000000002012345678902B
```
```
BR1800000000003012345678903B
```
```
ES9121000418450200051333
```
```
ES9121000418450200051334
```
```
NG1234567890123456789012
```
```
NG0987654321098765432101
```
```
NG1122334455667788990000
```
```
AE070331234567890123457
```
```
AE070331234567890123458
```
```
CH5604835012345678010
```
```
CH5604835012345678011
```
```
JP890000000000123456789
```
```
JP890000000000987654321
```
```
JP890000000000567890123
```
```
CN123456789012345678901
```
```
CN987654321098765432109
```
```
CN192837465091827364550
```
```
RU1234567890123456789012
```
```
RU2345678901234567890123
```
```
RU3456789012345678901234
```
```
AR123456789012345678901
```
```
AR987654321098765432101
```
```
AR192837465091827364501
```
```
TH123456789012345678901
```
```
TH987654321098765432109
```
```
TH543217890123456789012
```
```
KR700110000747123456789
```
```
KR700110000747987654321
```
```
KR700110000747567890123
```

| Failed BICs | 
|---| 
```
SBINAINBB
```

