# Generation 1
## Category baseline
```
!new Bank('bank1')
!bank1.country := 'Germany'
!bank1.name := 'Deutsche Bank'
!bank1.bic := 'DEUTDEFFXXX'

!new Account('account1')
!account1.iban := 'DE89370400440532013000'
!account1.balance := 1500

!new Account('account2')
!account2.iban := 'DE44500105175407324931'
!account2.balance := 7500

!new Person('person1')
!person1.firstName := 'Anna'
!person1.lastName := 'Müller'
!person1.age := 34

!new Person('person2')
!person2.firstName := 'Lukas'
!person2.lastName := 'Schmidt'
!person2.age := 42

!new Person('person3')
!person3.firstName := 'Klaus'
!person3.lastName := 'Becker'
!person3.age := 29

!insert (person1, account1) into Ownership
!insert (person2, account1) into Ownership
!insert (person3, account2) into Ownership

!insert (person1, account1) into Use
!insert (person2, account1) into Use
!insert (person2, account2) into Use
!insert (person3, account2) into Use

!insert (bank1, account1) into AccountOfBanks
!insert (bank1, account2) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 31 | 0.00% |
| Multiplicities Errors | 0 | 9 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 0 | 2 | 0.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

## Category boundary
```
!new Bank('bank2')
!bank2.country := 'Greenland'
!bank2.name := 'Arctica Bank'
!bank2.bic := 'ARCTGLBX'

!new Account('account3')
!account3.iban := 'GL57 ARCT 0000 0000000001'
!account3.balance := 0

!new Account('account4')
!account4.iban := 'GL57 ARCT 0000 0000000002'
!account4.balance := 1

!new Person('person4')
!person4.firstName := 'Annalisa'
!person4.lastName := 'Hansen'
!person4.age := 18

!new Person('person5')
!person5.firstName := 'Ian'
!person5.lastName := 'Frederiksen'
!person5.age := 40

!insert (person4, account3) into Ownership
!insert (person4, account4) into Ownership
!insert (person5, account4) into Ownership

!insert (person4, account3) into Use
!insert (person4, account4) into Use
!insert (person5, account4) into Use

!insert (bank2, account3) into AccountOfBanks
!insert (bank2, account4) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 26 | 0.00% |
| Multiplicities Errors | 0 | 8 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 2 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
GL57 ARCT 0000 0000000001
```
```
GL57 ARCT 0000 0000000002
```

## Category complex
```
!new Bank('bank5')
!bank5.country := 'Italy'
!bank5.name := 'Commercio Bank'
!bank5.bic := 'COMMIT22'

!new Account('account9')
!account9.iban := 'IT60X0542811101000000123456'
!account9.balance := 15000

!new Account('account10')
!account10.iban := 'IT60X0542811101000000654321'
!account10.balance := 5000

!new Account('account11')
!account11.iban := 'IT60X0542811101000000987654'
!account11.balance := 25000

!new Person('person11')
!person11.firstName := 'Marco'
!person11.lastName := 'Rossi'
!person11.age := 45

!new Person('person12')
!person12.firstName := 'Giulia'
!person12.lastName := 'Bianchi'
!person12.age := 34

!new Person('person13')
!person13.firstName := 'Ahmed'
!person13.lastName := 'Ali'
!person13.age := 28

!new Person('person14')
!person14.firstName := 'Mary'
!person14.lastName := 'O\'Connor'
!person14.age := 30

!insert (person11, account9) into Ownership
!insert (person12, account9) into Ownership
!insert (person12, account10) into Ownership
!insert (person13, account11) into Ownership
!insert (person14, account11) into Ownership

!insert (person11, account9) into Use
!insert (person12, account9) into Use
!insert (person13, account9) into Use
!insert (person12, account10) into Use
!insert (person13, account11) into Use
!insert (person14, account11) into Use

!insert (bank5, account9) into AccountOfBanks
!insert (bank5, account10) into AccountOfBanks
!insert (bank5, account11) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 43 | 0.00% |
| Multiplicities Errors | 0 | 14 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 3 | 66.67% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
IT60X0542811101000000654321
```
```
IT60X0542811101000000987654
```

## Category edge
```
!new Bank('bank4')
!bank4.country := 'Aland Islands'
!bank4.name := 'Nordic Light Bank'
!bank4.bic := 'NLBIALFIXXX'

!new Account('account7')
!account7.iban := 'AX1234567890123456'
!account7.balance := 0

!new Account('account8')
!account8.iban := 'AX9876543210987654'
!account8.balance := 0

!new Person('person9')
!person9.firstName := 'Guðmundur'
!person9.lastName := 'Jónsson'
!person9.age := 120

!new Person('person10')
!person10.firstName := 'María'
!person10.lastName := 'Gonzalez'
!person10.age := 127

!insert (person9, account7) into Ownership
!insert (person9, account8) into Ownership
!insert (person10, account8) into Ownership

!insert (person9, account7) into Use
!insert (person10, account7) into Use
!insert (person10, account8) into Use

!insert (bank4, account7) into AccountOfBanks
!insert (bank4, account8) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 26 | 0.00% |
| Multiplicities Errors | 0 | 8 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 2 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
AX1234567890123456
```
```
AX9876543210987654
```

## Category invalid
```
!new Bank('bank3')
!bank3.country := 'Germany'
!bank3.name := 'Rheinbank'
!bank3.bic := 'RHNBDEBB'

!new Account('account5')
!account5.iban := 'DE89370400440532013000'
!account5.balance := 1500

!new Account('account6')
!account6.iban := 'DE89370400440532013001'
!account6.balance := 2500

!new Person('person6')
!person6.firstName := 'Hans'
!person6.lastName := 'Müller'
!person6.age := 45

!new Person('person7')
!person7.firstName := 'Maria'
!person7.lastName := 'Müller'
!person7.age := 43

!new Person('person8')
!person8.firstName := 'Alex'
!person8.lastName := 'Schmidt'
!person8.age := 17

!insert (person6, account5) into Ownership
!insert (person7, account5) into Ownership

!insert (person6, account5) into Use
!insert (person7, account5) into Use
!insert (person8, account5) into Use

!insert (person6, account6) into Ownership
!insert (person6, account6) into Use

!insert (bank3, account5) into AccountOfBanks
!insert (bank3, account6) into AccountOfBanks
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 9 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 1 | 2 | 50.00% |
| BICs | 1 | 1 | 100.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
DE89370400440532013001
```

| Failed BICs | 
|---| 
```
RHNBDEBB
```

## Generation 1 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 157 | 0.00% |
| Multiplicities Errors | 0 | 39 | 0.00% |
| Invariants Errors | 0 | 8 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 9 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 7 | 11 | 63.64% |
| BICs | 1 | 5 | 20.00% |
| Countries | 0 | 5 | 0.00% |

| Failed IBANs | 
|---| 
```
GL57 ARCT 0000 0000000001
```
```
GL57 ARCT 0000 0000000002
```
```
IT60X0542811101000000654321
```
```
IT60X0542811101000000987654
```
```
AX1234567890123456
```
```
AX9876543210987654
```
```
DE89370400440532013001
```

| Failed BICs | 
|---| 
```
RHNBDEBB
```

# Generation 2
## Category baseline
```
!new Bank('bank6')
!bank6.country := 'Japan'
!bank6.name := 'Mitsubishi UFJ Financial Group'
!bank6.bic := 'BOTKJPJTXXX'

!new Bank('bank7')
!bank7.country := 'Canada'
!bank7.name := 'Royal Bank of Canada'
!bank7.bic := 'ROYCCAT2XXX'

!new Account('account12')
!account12.iban := 'JP234000123456789012345'
!account12.balance := 10000

!new Account('account13')
!account13.iban := 'CA000100200300400500600'
!account13.balance := 5000

!new Account('account14')
!account14.iban := 'JP098765432109876543210'
!account14.balance := 200

!new Person('person15')
!person15.firstName := 'Hiroshi'
!person15.lastName := 'Tanaka'
!person15.age := 45

!new Person('person16')
!person16.firstName := 'Emily'
!person16.lastName := 'Smith'
!person16.age := 37

!new Person('person17')
!person17.firstName := 'Andrea'
!person17.lastName := 'Lewis'
!person17.age := 26

!new Person('person18')
!person18.firstName := 'Jun'
!person18.lastName := 'Suzuki'
!person18.age := 32

!insert (person15, account12) into Ownership
!insert (person16, account13) into Ownership
!insert (person17, account13) into Ownership
!insert (person18, account14) into Ownership

!insert (person15, account12) into Use
!insert (person18, account12) into Use
!insert (person16, account13) into Use
!insert (person17, account13) into Use
!insert (person17, account14) into Use

!insert (bank6, account12) into AccountOfBanks
!insert (bank6, account14) into AccountOfBanks
!insert (bank7, account13) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 45 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 2 | 0.00% |
| Countries | 0 | 2 | 0.00% |

| Failed IBANs | 
|---| 
```
JP234000123456789012345
```
```
CA000100200300400500600
```
```
JP098765432109876543210
```

## Category boundary
```
!new Bank('bank8')
!bank8.country := 'Australia'
!bank8.name := 'Southern Stars Bank'
!bank8.bic := 'SSBUAU2S'

!new Account('account15')
!account15.iban := 'AU45 SSBU 1234 5678 9012 34'
!account15.balance := 10000

!new Account('account16')
!account16.iban := 'AU45 SSBU 2345 6789 0123 45'
!account16.balance := 5000

!new Account('account17')
!account17.iban := 'AU45 SSBU 3456 7890 1234 56'
!account17.balance := 25000

!new Person('person19')
!person19.firstName := 'Emily'
!person19.lastName := 'Nguyen'
!person19.age := 32

!new Person('person20')
!person20.firstName := 'Jack'
!person20.lastName := 'Ahmed'
!person20.age := 50

!new Person('person21')
!person21.firstName := 'Wilma'
!person21.lastName := 'Zhao'
!person21.age := 29

!insert (person19, account15) into Ownership
!insert (person21, account15) into Ownership
!insert (person20, account16) into Ownership
!insert (person19, account17) into Ownership

!insert (person19, account15) into Use
!insert (person21, account15) into Use
!insert (person20, account15) into Use
!insert (person20, account16) into Use
!insert (person19, account17) into Use
!insert (person21, account17) into Use

!insert (bank8, account15) into AccountOfBanks
!insert (bank8, account16) into AccountOfBanks
!insert (bank8, account17) into AccountOfBanks
```
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
AU45 SSBU 1234 5678 9012 34
```
```
AU45 SSBU 2345 6789 0123 45
```
```
AU45 SSBU 3456 7890 1234 56
```

## Category complex
```
!new Bank('bank11')
!bank11.country := 'India'
!bank11.name := 'Saraswat Cooperative Bank'
!bank11.bic := 'SARBINBBXXX'

!new Account('account21')
!account21.iban := 'IN68113600040500123456'
!account21.balance := 30000

!new Account('account22')
!account22.iban := 'IN68113600040500432109'
!account22.balance := 7000

!new Account('account23')
!account23.iban := 'IN68113600040500789012'
!account23.balance := 2000

!new Account('account24')
!account24.iban := 'IN68113600040500987654'
!account24.balance := 10000

!new Person('person29')
!person29.firstName := 'Priya'
!person29.lastName := 'Sharma'
!person29.age := 40

!new Person('person30')
!person30.firstName := 'Rohit'
!person30.lastName := 'Gupta'
!person30.age := 38

!new Person('person31')
!person31.firstName := 'Anjali'
!person31.lastName := 'Iyer'
!person31.age := 29

!new Person('person32')
!person32.firstName := 'Sneha'
!person32.lastName := 'Mehta'
!person32.age := 50

!insert (person29, account21) into Ownership
!insert (person30, account22) into Ownership
!insert (person31, account22) into Ownership
!insert (person31, account23) into Ownership
!insert (person32, account24) into Ownership
!insert (person29, account24) into Ownership

!insert (person29, account21) into Use
!insert (person32, account21) into Use
!insert (person30, account22) into Use
!insert (person31, account22) into Use
!insert (person31, account23) into Use
!insert (person32, account24) into Use
!insert (person29, account24) into Use

!insert (bank11, account21) into AccountOfBanks
!insert (bank11, account22) into AccountOfBanks
!insert (bank11, account23) into AccountOfBanks
!insert (bank11, account24) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 49 | 0.00% |
| Multiplicities Errors | 0 | 17 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 4 | 4 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
IN68113600040500123456
```
```
IN68113600040500432109
```
```
IN68113600040500789012
```
```
IN68113600040500987654
```

## Category edge
```
!new Bank('bank9')
!bank9.country := 'Maldives'
!bank9.name := 'Coral Reef Bank'
!bank9.bic := 'CRBVMVXXXX'

!new Account('account18')
!account18.iban := 'MV1111111111111111'
!account18.balance := 1

!new Person('person22')
!person22.firstName := 'Amina'
!person22.lastName := 'Ibrahim'
!person22.age := 18

!new Person('person23')
!person23.firstName := 'Ravi'
!person23.lastName := 'Patel'
!person23.age := 30

!new Person('person24')
!person24.firstName := 'Zhong'
!person24.lastName := 'Wei'
!person24.age := 90

!insert (person22, account18) into Ownership
!insert (person23, account18) into Ownership

!insert (person22, account18) into Use
!insert (person23, account18) into Use

!insert (bank9, account18) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 24 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 1 | 1 | 100.00% |
| BICs | 1 | 1 | 100.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
MV1111111111111111
```

| Failed BICs | 
|---| 
```
CRBVMVXXXX
```

## Category invalid
```
!new Bank('bank10')
!bank10.country := 'Japan'
!bank10.name := 'Yamaguchi Financial Group'
!bank10.bic := 'YMFGJPJT'

!new Account('account19')
!account19.iban := 'JP12345678901234567890'
!account19.balance := 8000

!new Account('account20')
!account20.iban := 'JP09876543210987654321'
!account20.balance := 0

!new Person('person25')
!person25.firstName := 'Keiko'
!person25.lastName := 'Saito'
!person25.age := 37

!new Person('person26')
!person26.firstName := 'Hiroshi'
!person26.lastName := 'Saito'
!person26.age := 39

!new Person('person27')
!person27.firstName := 'Yamato'
!person27.lastName := 'Tanaka'
!person27.age := 29

!new Person('person28')
!person28.firstName := 'Haruto'
!person28.lastName := 'Saito'
!person28.age := 16

!insert (person25, account19) into Ownership
!insert (person26, account19) into Ownership

!insert (person27, account20) into Ownership

!insert (person25, account20) into Use
!insert (person26, account20) into Use
!insert (person28, account19) into Use

!insert (bank10, account19) into AccountOfBanks
!insert (bank10, account20) into AccountOfBanks
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 8 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 2 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
JP12345678901234567890
```
```
JP09876543210987654321
```

## Generation 2 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 190 | 0.00% |
| Multiplicities Errors | 0 | 47 | 0.00% |
| Invariants Errors | 0 | 8 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 8 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 13 | 13 | 100.00% |
| BICs | 1 | 6 | 16.67% |
| Countries | 0 | 6 | 0.00% |

| Failed IBANs | 
|---| 
```
JP234000123456789012345
```
```
CA000100200300400500600
```
```
JP098765432109876543210
```
```
AU45 SSBU 1234 5678 9012 34
```
```
AU45 SSBU 2345 6789 0123 45
```
```
AU45 SSBU 3456 7890 1234 56
```
```
IN68113600040500123456
```
```
IN68113600040500432109
```
```
IN68113600040500789012
```
```
IN68113600040500987654
```
```
MV1111111111111111
```
```
JP12345678901234567890
```
```
JP09876543210987654321
```

| Failed BICs | 
|---| 
```
CRBVMVXXXX
```

# Generation 3
## Category baseline
```
!new Bank('bank12')
!bank12.country := 'Kenya'
!bank12.name := 'Equity Bank Kenya'
!bank12.bic := 'EQBLKENAXXX'

!new Bank('bank13')
!bank13.country := 'Mexico'
!bank13.name := 'Banco Nacional de México'
!bank13.bic := 'BNMXMXMMXXX'

!new Account('account25')
!account25.iban := 'KE00123456789012345678'
!account25.balance := 300

!new Account('account26')
!account26.iban := 'MX36901234567891234567'
!account26.balance := 12000

!new Person('person33')
!person33.firstName := 'Amina'
!person33.lastName := 'Mwangi'
!person33.age := 36

!new Person('person34')
!person34.firstName := 'Carlos'
!person34.lastName := 'González'
!person34.age := 28

!new Person('person35')
!person35.firstName := 'Lily'
!person35.lastName := 'Otieno'
!person35.age := 23

!new Person('person36')
!person36.firstName := 'Martín'
!person36.lastName := 'Perez'
!person36.age := 40

!insert (person33, account25) into Ownership
!insert (person34, account26) into Ownership
!insert (person36, account26) into Ownership

!insert (person33, account25) into Use
!insert (person35, account25) into Use
!insert (person34, account26) into Use
!insert (person35, account26) into Use
!insert (person36, account26) into Use

!insert (bank12, account25) into AccountOfBanks
!insert (bank13, account26) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 40 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 2 | 100.00% |
| BICs | 0 | 2 | 0.00% |
| Countries | 0 | 2 | 0.00% |

| Failed IBANs | 
|---| 
```
KE00123456789012345678
```
```
MX36901234567891234567
```

## Category boundary
```
!new Bank('bank14')
!bank14.country := 'Mexico'
!bank14.name := 'Azteca Bank'
!bank14.bic := 'AZTMXMXA'

!new Account('account27')
!account27.iban := 'MX51 AZTE 1234 5678 9012 3456'
!account27.balance := 50000

!new Account('account28')
!account28.iban := 'MX51 AZTE 0987 6543 2109 8765'
!account28.balance := 75500

!new Account('account29')
!account29.iban := 'MX51 AZTE 1111 2222 3333 4444'
!account29.balance := 0

!new Person('person37')
!person37.firstName := 'Rodrigo'
!person37.lastName := 'López'
!person37.age := 45

!new Person('person38')
!person38.firstName := 'Mariana'
!person38.lastName := 'Torres'
!person38.age := 37

!new Person('person39')
!person39.firstName := 'Jorge'
!person39.lastName := 'García'
!person39.age := 22

!insert (person37, account27) into Ownership
!insert (person38, account27) into Ownership
!insert (person39, account28) into Ownership
!insert (person37, account29) into Ownership
!insert (person39, account29) into Ownership

!insert (person37, account27) into Use
!insert (person38, account27) into Use
!insert (person39, account27) into Use
!insert (person39, account28) into Use
!insert (person38, account28) into Use
!insert (person37, account29) into Use

!insert (bank14, account27) into AccountOfBanks
!insert (bank14, account28) into AccountOfBanks
!insert (bank14, account29) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 39 | 0.00% |
| Multiplicities Errors | 0 | 14 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
MX51 AZTE 1234 5678 9012 3456
```
```
MX51 AZTE 0987 6543 2109 8765
```
```
MX51 AZTE 1111 2222 3333 4444
```

## Category complex
```
!new Bank('bank18')
!bank18.country := 'Canada'
!bank18.name := 'Maple Leaf Financial'
!bank18.bic := 'MLFCANCAXXXX'

!new Account('account37')
!account37.iban := 'CA951234000000045267'
!account37.balance := 4000

!new Account('account38')
!account38.iban := 'CA951234000000076543'
!account38.balance := 15000

!new Account('account39')
!account39.iban := 'CA951234000000065432'
!account39.balance := 1000

!new Account('account40')
!account40.iban := 'CA951234000000098765'
!account40.balance := 8000

!new Account('account41')
!account41.iban := 'CA951234000000032176'
!account41.balance := 25000

!new Person('person51')
!person51.firstName := 'David'
!person51.lastName := 'Thompson'
!person51.age := 50

!new Person('person52')
!person52.firstName := 'Li'
!person52.lastName := 'Zhang'
!person52.age := 27

!new Person('person53')
!person53.firstName := 'Sofia'
!person53.lastName := 'Hernandez'
!person53.age := 32

!new Person('person54')
!person54.firstName := 'Noah'
!person54.lastName := 'Smith'
!person54.age := 22

!new Person('person55')
!person55.firstName := 'Emily'
!person55.lastName := 'Jones'
!person55.age := 45

!insert (person51, account37) into Ownership
!insert (person53, account37) into Ownership
!insert (person55, account38) into Ownership
!insert (person52, account39) into Ownership
!insert (person53, account40) into Ownership
!insert (person54, account40) into Ownership
!insert (person51, account41) into Ownership

!insert (person51, account37) into Use
!insert (person53, account37) into Use
!insert (person55, account37) into Use
!insert (person55, account38) into Use
!insert (person52, account39) into Use
!insert (person53, account40) into Use
!insert (person54, account40) into Use
!insert (person51, account41) into Use

!insert (bank18, account37) into AccountOfBanks
!insert (bank18, account38) into AccountOfBanks
!insert (bank18, account39) into AccountOfBanks
!insert (bank18, account40) into AccountOfBanks
!insert (bank18, account41) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 59 | 0.00% |
| Multiplicities Errors | 0 | 20 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 5 | 5 | 100.00% |
| BICs | 1 | 1 | 100.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
CA951234000000045267
```
```
CA951234000000076543
```
```
CA951234000000065432
```
```
CA951234000000098765
```
```
CA951234000000032176
```

| Failed BICs | 
|---| 
```
MLFCANCAXXXX
```

## Category edge
```
!new Bank('bank16')
!bank16.country := 'Bhutan'
!bank16.name := 'Druk Gyalpo Bank'
!bank16.bic := 'DGBTKHBTXXX'

!new Account('account32')
!account32.iban := 'BT2222222222222222'
!account32.balance := 10000000

!new Account('account33')
!account33.iban := 'BT3333333333333333'
!account33.balance := 100

!new Person('person44')
!person44.firstName := 'Tenzin'
!person44.lastName := 'Norbu'
!person44.age := 44

!new Person('person45')
!person45.firstName := 'Karma'
!person45.lastName := 'Wangmo'
!person45.age := 28

!new Person('person46')
!person46.firstName := 'Sonam'
!person46.lastName := 'Phuntsho'
!person46.age := 21

!insert (person44, account32) into Ownership
!insert (person45, account33) into Ownership
!insert (person46, account33) into Ownership

!insert (person44, account32) into Use
!insert (person45, account32) into Use
!insert (person46, account32) into Use

!insert (bank16, account32) into AccountOfBanks
!insert (bank16, account33) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 30 | 0.00% |
| Multiplicities Errors | 0 | 8 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 2 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
BT2222222222222222
```
```
BT3333333333333333
```

## Category invalid
```
!new Bank('bank15')
!bank15.country := 'Kenya'
!bank15.name := 'Jambo Bank'
!bank15.bic := 'JMBOKENY'

!new Account('account30')
!account30.iban := 'KE12345678901234567890'
!account30.balance := 60000

!new Account('account31')
!account31.iban := 'KE09876543210987654321'
!account31.balance := -500

!new Person('person40')
!person40.firstName := 'Achieng'
!person40.lastName := 'Odongo'
!person40.age := 40

!new Person('person41')
!person41.firstName := 'Kwame'
!person41.lastName := 'Odongo'
!person41.age := 42

!new Person('person42')
!person42.firstName := 'Grace'
!person42.lastName := 'Njoroge'
!person42.age := 19

!new Person('person43')
!person43.firstName := 'Kendi'
!person43.lastName := 'Odongo'
!person43.age := 16

!insert (person40, account30) into Ownership
!insert (person41, account30) into Ownership
!insert (person42, account31) into Ownership

!insert (person40, account31) into Use
!insert (person41, account31) into Use
!insert (person42, account31) into Use
!insert (person43, account30) into Use

!insert (bank15, account30) into AccountOfBanks
!insert (bank15, account31) into AccountOfBanks
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 9 | 0.00% |
| Invariants Errors (Not included on General) | 1 | 2 | 50.00% |

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (2) `Account::positiveBalance': FAILED.
```

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 2 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
KE12345678901234567890
```
```
KE09876543210987654321
```

## Generation 3 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 203 | 0.00% |
| Multiplicities Errors | 0 | 52 | 0.00% |
| Invariants Errors | 0 | 8 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 9 | 0.00% |
| Invariants Errors (Not included on General) | 1 | 2 | 50.00% |

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (2) `Account::positiveBalance': FAILED.
```

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 14 | 14 | 100.00% |
| BICs | 1 | 6 | 16.67% |
| Countries | 0 | 6 | 0.00% |

| Failed IBANs | 
|---| 
```
KE00123456789012345678
```
```
MX36901234567891234567
```
```
MX51 AZTE 1234 5678 9012 3456
```
```
MX51 AZTE 0987 6543 2109 8765
```
```
MX51 AZTE 1111 2222 3333 4444
```
```
CA951234000000045267
```
```
CA951234000000076543
```
```
CA951234000000065432
```
```
CA951234000000098765
```
```
CA951234000000032176
```
```
BT2222222222222222
```
```
BT3333333333333333
```
```
KE12345678901234567890
```
```
KE09876543210987654321
```

| Failed BICs | 
|---| 
```
MLFCANCAXXXX
```

# Generation 4
## Category baseline
```
!new Bank('bank17')
!bank17.country := 'India'
!bank17.name := 'State Bank of India'
!bank17.bic := 'SBININBBXXX'

!new Account('account34')
!account34.iban := 'IN30109876543210987654'
!account34.balance := 8000

!new Account('account35')
!account35.iban := 'IN50234567890123456789'
!account35.balance := 450

!new Account('account36')
!account36.iban := 'IN70987654321098765432'
!account36.balance := 1500

!new Person('person47')
!person47.firstName := 'Priya'
!person47.lastName := 'Sharma'
!person47.age := 33

!new Person('person48')
!person48.firstName := 'Rajiv'
!person48.lastName := 'Nair'
!person48.age := 50

!new Person('person49')
!person49.firstName := 'Alok'
!person49.lastName := 'Bhatt'
!person49.age := 21

!new Person('person50')
!person50.firstName := 'Kavita'
!person50.lastName := 'Verma'
!person50.age := 45

!insert (person47, account34) into Ownership
!insert (person49, account34) into Ownership
!insert (person48, account35) into Ownership
!insert (person50, account36) into Ownership

!insert (person47, account34) into Use
!insert (person47, account36) into Use
!insert (person48, account35) into Use
!insert (person49, account34) into Use
!insert (person50, account35) into Use
!insert (person50, account36) into Use

!insert (bank17, account34) into AccountOfBanks
!insert (bank17, account35) into AccountOfBanks
!insert (bank17, account36) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 42 | 0.00% |
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
IN30109876543210987654
```
```
IN50234567890123456789
```
```
IN70987654321098765432
```

## Category boundary
```
!new Bank('bank19')
!bank19.country := 'Switzerland'
!bank19.name := 'Alpine Peaks Bank'
!bank19.bic := 'ALPSCHZH'

!new Account('account42')
!account42.iban := 'CH93 ALPS 0000 1234 5678 9'
!account42.balance := 200000

!new Account('account43')
!account43.iban := 'CH93 ALPS 9876 5432 1098 7'
!account43.balance := 5

!new Account('account44')
!account44.iban := 'CH93 ALPS 1111 2222 3333 9'
!account44.balance := 0

!new Person('person56')
!person56.firstName := 'Hans'
!person56.lastName := 'Müller'
!person56.age := 60

!new Person('person57')
!person57.firstName := 'Heidi'
!person57.lastName := 'Fischer'
!person57.age := 28

!new Person('person58')
!person58.firstName := 'Pascal'
!person58.lastName := 'Dubois'
!person58.age := 40

!new Person('person59')
!person59.firstName := 'Nathalie'
!person59.lastName := 'Meier'
!person59.age := 35

!insert (person56, account42) into Ownership
!insert (person58, account42) into Ownership
!insert (person57, account43) into Ownership
!insert (person59, account44) into Ownership
!insert (person57, account44) into Ownership

!insert (person56, account42) into Use
!insert (person58, account42) into Use
!insert (person57, account43) into Use
!insert (person59, account43) into Use
!insert (person58, account43) into Use
!insert (person59, account44) into Use

!insert (bank19, account42) into AccountOfBanks
!insert (bank19, account43) into AccountOfBanks
!insert (bank19, account44) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 43 | 0.00% |
| Multiplicities Errors | 0 | 14 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 1 | 1 | 100.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
CH93 ALPS 0000 1234 5678 9
```
```
CH93 ALPS 9876 5432 1098 7
```
```
CH93 ALPS 1111 2222 3333 9
```

| Failed BICs | 
|---| 
```
ALPSCHZH
```

## Category complex
```
!new Bank('bank22')
!bank22.country := 'Australia'
!bank22.name := 'Bluestone Atlantic Bank'
!bank22.bic := 'BLUAAU2S'

!new Account('account49')
!account49.iban := 'AU132962003000123456'
!account49.balance := 120000

!new Account('account50')
!account50.iban := 'AU132962003000654321'
!account50.balance := 3500

!new Account('account51')
!account51.iban := 'AU132962003000987654'
!account51.balance := 23950

!new Account('account52')
!account52.iban := 'AU132962003000543210'
!account52.balance := 47000

!new Person('person69')
!person69.firstName := 'Olivia'
!person69.lastName := 'Wilson'
!person69.age := 48

!new Person('person70')
!person70.firstName := 'Ethan'
!person70.lastName := 'McCarthy'
!person70.age := 37

!new Person('person71')
!person71.firstName := 'Mia'
!person71.lastName := 'Nguyen'
!person71.age := 29

!new Person('person72')
!person72.firstName := 'Jack'
!person72.lastName := 'Patel'
!person72.age := 41

!new Person('person73')
!person73.firstName := 'Aisha'
!person73.lastName := 'Bennet'
!person73.age := 33

!insert (person69, account49) into Ownership
!insert (person70, account49) into Ownership
!insert (person73, account50) into Ownership
!insert (person71, account51) into Ownership
!insert (person72, account51) into Ownership
!insert (person69, account52) into Ownership

!insert (person69, account49) into Use
!insert (person70, account49) into Use
!insert (person72, account49) into Use
!insert (person73, account50) into Use
!insert (person71, account51) into Use
!insert (person72, account51) into Use
!insert (person69, account52) into Use

!insert (bank22, account49) into AccountOfBanks
!insert (bank22, account50) into AccountOfBanks
!insert (bank22, account51) into AccountOfBanks
!insert (bank22, account52) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 53 | 0.00% |
| Multiplicities Errors | 0 | 17 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 4 | 4 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
AU132962003000123456
```
```
AU132962003000654321
```
```
AU132962003000987654
```
```
AU132962003000543210
```

## Category edge
```
!new Bank('bank23')
!bank23.country := 'Denmark'
!bank23.name := 'Viking Capital Bank'
!bank23.bic := 'VCBDKDKKXXX'

!new Account('account53')
!account53.iban := 'DK4444444444444444'
!account53.balance := 0

!new Account('account54')
!account54.iban := 'DK5555555555555555'
!account54.balance := 5000

!new Person('person74')
!person74.firstName := 'Lars'
!person74.lastName := 'Nielsen'
!person74.age := 35

!new Person('person75')
!person75.firstName := 'Ingrid'
!person75.lastName := 'Sørensen'
!person75.age := 19

!new Person('person76')
!person76.firstName := 'Bjørn'
!person76.lastName := 'Johansen'
!person76.age := 16

!insert (person74, account53) into Ownership
!insert (person74, account54) into Ownership
!insert (person75, account54) into Ownership

!insert (person74, account53) into Use
!insert (person75, account53) into Use
!insert (person76, account53) into Use
!insert (person75, account54) into Use

!insert (bank23, account53) into AccountOfBanks
!insert (bank23, account54) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 31 | 0.00% |
| Multiplicities Errors | 0 | 9 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 2 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
DK4444444444444444
```
```
DK5555555555555555
```

## Category invalid
```
!new Bank('bank20')
!bank20.country := 'Canada'
!bank20.name := 'Maple Leaf Financial'
!bank20.bic := 'MLFICAT2'

!new Account('account45')
!account45.iban := 'CA56473829106473598265'
!account45.balance := 4500

!new Account('account46')
!account46.iban := 'CA82736481920456719384'
!account46.balance := 0

!new Person('person60')
!person60.firstName := 'Emily'
!person60.lastName := 'Lee'
!person60.age := 36

!new Person('person61')
!person61.firstName := 'Daniel'
!person61.lastName := 'Lee'
!person61.age := 37

!new Person('person62')
!person62.firstName := 'Carla'
!person62.lastName := 'Martinez'
!person62.age := 19

!new Person('person63')
!person63.firstName := 'Sophie'
!person63.lastName := 'Lee'
!person63.age := 16

!insert (person60, account45) into Ownership
!insert (person61, account45) into Ownership
!insert (person62, account46) into Ownership

!insert (person63, account45) into Use
!insert (person62, account46) into Use

!insert (bank20, account45) into AccountOfBanks
!insert (bank20, account46) into AccountOfBanks
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 7 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 2 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
CA56473829106473598265
```
```
CA82736481920456719384
```

## Generation 4 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 202 | 0.00% |
| Multiplicities Errors | 0 | 53 | 0.00% |
| Invariants Errors | 0 | 8 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 7 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 14 | 14 | 100.00% |
| BICs | 1 | 5 | 20.00% |
| Countries | 0 | 5 | 0.00% |

| Failed IBANs | 
|---| 
```
IN30109876543210987654
```
```
IN50234567890123456789
```
```
IN70987654321098765432
```
```
CH93 ALPS 0000 1234 5678 9
```
```
CH93 ALPS 9876 5432 1098 7
```
```
CH93 ALPS 1111 2222 3333 9
```
```
AU132962003000123456
```
```
AU132962003000654321
```
```
AU132962003000987654
```
```
AU132962003000543210
```
```
DK4444444444444444
```
```
DK5555555555555555
```
```
CA56473829106473598265
```
```
CA82736481920456719384
```

| Failed BICs | 
|---| 
```
ALPSCHZH
```

# Generation 5
## Category baseline
```
!new Bank('bank21')
!bank21.country := 'France'
!bank21.name := 'Crédit Agricole'
!bank21.bic := 'AGRIFRPPXXX'

!new Account('account47')
!account47.iban := 'FR7630006000011234567890189'
!account47.balance := 250

!new Account('account48')
!account48.iban := 'FR7630006000029876543210123'
!account48.balance := 9400

!new Person('person64')
!person64.firstName := 'Marie'
!person64.lastName := 'Dupont'
!person64.age := 41

!new Person('person65')
!person65.firstName := 'Jean'
!person65.lastName := 'Lefebvre'
!person65.age := 48

!new Person('person66')
!person66.firstName := 'Chloé'
!person66.lastName := 'Blanc'
!person66.age := 30

!new Person('person67')
!person67.firstName := 'Théo'
!person67.lastName := 'De la Tour'
!person67.age := 35

!new Person('person68')
!person68.firstName := 'Lucas'
!person68.lastName := 'Petit'
!person68.age := 24

!insert (person64, account47) into Ownership
!insert (person65, account47) into Ownership
!insert (person66, account48) into Ownership
!insert (person67, account48) into Ownership

!insert (person64, account47) into Use
!insert (person65, account47) into Use
!insert (person64, account48) into Use
!insert (person65, account48) into Use
!insert (person66, account47) into Use
!insert (person66, account48) into Use
!insert (person67, account48) into Use
!insert (person68, account47) into Use
!insert (person68, account48) into Use

!insert (bank21, account47) into AccountOfBanks
!insert (bank21, account48) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 45 | 0.00% |
| Multiplicities Errors | 0 | 15 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 1 | 2 | 50.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
FR7630006000029876543210123
```

## Category boundary
```
!new Bank('bank24')
!bank24.country := 'United Arab Emirates'
!bank24.name := 'Desert Oasis Bank'
!bank24.bic := 'DOBAAEAD'

!new Account('account55')
!account55.iban := 'AE99 DOBA 0000 9876 5432 10'
!account55.balance := 1500000

!new Account('account56')
!account56.iban := 'AE99 DOBA 1111 2222 3333 44'
!account56.balance := 0

!new Person('person77')
!person77.firstName := 'Amal'
!person77.lastName := 'Al-Farsi'
!person77.age := 30

!new Person('person78')
!person78.firstName := 'Fatima'
!person78.lastName := 'El-Sayed'
!person78.age := 48

!new Person('person79')
!person79.firstName := 'Khalid'
!person79.lastName := 'Bin Rashid'
!person79.age := 55

!insert (person77, account55) into Ownership
!insert (person79, account55) into Ownership
!insert (person78, account56) into Ownership

!insert (person77, account55) into Use
!insert (person79, account55) into Use
!insert (person78, account55) into Use
!insert (person78, account56) into Use

!insert (bank24, account55) into AccountOfBanks
!insert (bank24, account56) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 31 | 0.00% |
| Multiplicities Errors | 0 | 9 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 2 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
AE99 DOBA 0000 9876 5432 10
```
```
AE99 DOBA 1111 2222 3333 44
```

## Category complex
```
!new Bank('bank30')
!bank30.country := 'South Africa'
!bank30.name := 'Ubuntu National Bank'
!bank30.bic := 'UBZNZAJJ'

!new Account('account68')
!account68.iban := 'ZA653010000000012345'
!account68.balance := 50000

!new Account('account69')
!account69.iban := 'ZA653010000000067890'
!account69.balance := 8000

!new Account('account70')
!account70.iban := 'ZA653010000000054321'
!account70.balance := 12000

!new Account('account71')
!account71.iban := 'ZA653010000000076432'
!account71.balance := 30000

!new Account('account72')
!account72.iban := 'ZA653010000000098765'
!account72.balance := 4500

!new Person('person95')
!person95.firstName := 'Sipho'
!person95.lastName := 'Nkosi'
!person95.age := 35

!new Person('person96')
!person96.firstName := 'Thandi'
!person96.lastName := 'Mbeki'
!person96.age := 28

!new Person('person97')
!person97.firstName := 'Jabu'
!person97.lastName := 'Dlamini'
!person97.age := 40

!new Person('person98')
!person98.firstName := 'Lesedi'
!person98.lastName := 'Dube'
!person98.age := 33

!new Person('person99')
!person99.firstName := 'Amara'
!person99.lastName := 'Naidoo'
!person99.age := 30

!insert (person95, account68) into Ownership
!insert (person96, account68) into Ownership
!insert (person97, account69) into Ownership
!insert (person98, account70) into Ownership
!insert (person99, account70) into Ownership
!insert (person95, account71) into Ownership
!insert (person98, account72) into Ownership

!insert (person95, account68) into Use
!insert (person96, account68) into Use
!insert (person97, account68) into Use
!insert (person97, account69) into Use
!insert (person98, account70) into Use
!insert (person99, account70) into Use
!insert (person95, account71) into Use
!insert (person98, account72) into Use

!insert (bank30, account68) into AccountOfBanks
!insert (bank30, account69) into AccountOfBanks
!insert (bank30, account70) into AccountOfBanks
!insert (bank30, account71) into AccountOfBanks
!insert (bank30, account72) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 59 | 0.00% |
| Multiplicities Errors | 0 | 20 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 5 | 5 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
ZA653010000000012345
```
```
ZA653010000000067890
```
```
ZA653010000000054321
```
```
ZA653010000000076432
```
```
ZA653010000000098765
```

## Category edge
```
!new Bank('bank28')
!bank28.country := 'Japan'
!bank28.name := 'Sakura Financial Group'
!bank28.bic := 'SFGTJP77XXX'

!new Account('account62')
!account62.iban := 'JP6666666666666666'
!account62.balance := 0

!new Account('account63')
!account63.iban := 'JP7777777777777777'
!account63.balance := 1000000000

!new Person('person89')
!person89.firstName := 'Haruto'
!person89.lastName := 'Tanaka'
!person89.age := 24

!new Person('person90')
!person90.firstName := 'Yuki'
!person90.lastName := 'Asano'
!person90.age := 85

!insert (person89, account62) into Ownership
!insert (person90, account63) into Ownership

!insert (person89, account62) into Use
!insert (person90, account62) into Use
!insert (person89, account63) into Use

!insert (bank28, account62) into AccountOfBanks
!insert (bank28, account63) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 25 | 0.00% |
| Multiplicities Errors | 0 | 7 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 2 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
JP6666666666666666
```
```
JP7777777777777777
```

## Category invalid
```
!new Bank('bank25')
!bank25.country := 'Italy'
!bank25.name := 'Tuscan Union Bank'
!bank25.bic := 'TUSBIT22'

!new Account('account57')
!account57.iban := 'IT6012345678901234567890'
!account57.balance := 12000

!new Account('account58')
!account58.iban := 'IT8098765432109876543210'
!account58.balance := 200

!new Person('person80')
!person80.firstName := 'Marco'
!person80.lastName := 'Romano'
!person80.age := 52

!new Person('person81')
!person81.firstName := 'Chiara'
!person81.lastName := 'Romano'
!person81.age := 50

!new Person('person82')
!person82.firstName := 'Giulia'
!person82.lastName := 'Romano'
!person82.age := 17

!new Person('person83')
!person83.firstName := 'Ji-Ho'
!person83.lastName := 'Kim'
!person83.age := 20

!insert (person80, account57) into Ownership
!insert (person81, account57) into Ownership
!insert (person83, account58) into Ownership

!insert (person82, account57) into Use
!insert (person83, account58) into Use

!insert (bank25, account57) into AccountOfBanks
!insert (bank25, account58) into AccountOfBanks
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 7 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 2 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
IT6012345678901234567890
```
```
IT8098765432109876543210
```

## Generation 5 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 193 | 0.00% |
| Multiplicities Errors | 0 | 51 | 0.00% |
| Invariants Errors | 0 | 8 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 7 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 12 | 13 | 92.31% |
| BICs | 0 | 5 | 0.00% |
| Countries | 0 | 5 | 0.00% |

| Failed IBANs | 
|---| 
```
FR7630006000029876543210123
```
```
AE99 DOBA 0000 9876 5432 10
```
```
AE99 DOBA 1111 2222 3333 44
```
```
ZA653010000000012345
```
```
ZA653010000000067890
```
```
ZA653010000000054321
```
```
ZA653010000000076432
```
```
ZA653010000000098765
```
```
JP6666666666666666
```
```
JP7777777777777777
```
```
IT6012345678901234567890
```
```
IT8098765432109876543210
```

# Generation 6
## Category baseline
```
!new Bank('bank26')
!bank26.country := 'United States'
!bank26.name := 'JPMorgan Chase'
!bank26.bic := 'CHASUS33XXX'

!new Bank('bank27')
!bank27.country := 'Brazil'
!bank27.name := 'Banco do Brasil'
!bank27.bic := 'BRASBRRXXXX'

!new Account('account59')
!account59.iban := 'US64CHAS1234567890123'
!account59.balance := 50000

!new Account('account60')
!account60.iban := 'BR720000000012345678901'
!account60.balance := 30000

!new Account('account61')
!account61.iban := 'US64CHAS2345678901234'
!account61.balance := 1500

!new Person('person84')
!person84.firstName := 'John'
!person84.lastName := 'Wilson'
!person84.age := 52

!new Person('person85')
!person85.firstName := 'Ana'
!person85.lastName := 'Barbosa'
!person85.age := 43

!new Person('person86')
!person86.firstName := 'Lucas'
!person86.lastName := 'Silva'
!person86.age := 38

!new Person('person87')
!person87.firstName := 'Emily'
!person87.lastName := 'Johnson'
!person87.age := 30

!new Person('person88')
!person88.firstName := 'Pedro'
!person88.lastName := 'Martinez'
!person88.age := 29

!insert (person84, account59) into Ownership
!insert (person85, account60) into Ownership
!insert (person86, account60) into Ownership
!insert (person87, account61) into Ownership
!insert (person88, account61) into Ownership

!insert (person84, account59) into Use
!insert (person84, account60) into Use
!insert (person85, account60) into Use
!insert (person85, account61) into Use
!insert (person86, account60) into Use
!insert (person87, account61) into Use
!insert (person88, account61) into Use
!insert (person87, account59) into Use

!insert (bank26, account59) into AccountOfBanks
!insert (bank27, account60) into AccountOfBanks
!insert (bank26, account61) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 53 | 0.00% |
| Multiplicities Errors | 0 | 16 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 2 | 0.00% |
| Countries | 0 | 2 | 0.00% |

| Failed IBANs | 
|---| 
```
US64CHAS1234567890123
```
```
BR720000000012345678901
```
```
US64CHAS2345678901234
```

## Category boundary
```
!new Bank('bank29')
!bank29.country := 'Canada'
!bank29.name := 'Maple Leaf Financial'
!bank29.bic := 'MLFCACTO'

!new Account('account64')
!account64.iban := 'CA22 MLF 4567 8910 2345 67'
!account64.balance := 300750

!new Account('account65')
!account65.iban := 'CA22 MLF 1234 5678 9012 34'
!account65.balance := 0

!new Account('account66')
!account66.iban := 'CA22 MLF 9876 5432 1098 76'
!account66.balance := 3000

!new Account('account67')
!account67.iban := 'CA22 MLF 3210 9876 5432 10'
!account67.balance := 1

!new Person('person91')
!person91.firstName := 'Sarah'
!person91.lastName := 'Thompson'
!person91.age := 34

!new Person('person92')
!person92.firstName := 'Raj'
!person92.lastName := 'Patel'
!person92.age := 23

!new Person('person93')
!person93.firstName := 'Mei'
!person93.lastName := 'Chen'
!person93.age := 41

!new Person('person94')
!person94.firstName := 'Michael'
!person94.lastName := 'Williams'
!person94.age := 29

!insert (person91, account64) into Ownership
!insert (person93, account64) into Ownership
!insert (person92, account65) into Ownership
!insert (person94, account65) into Ownership
!insert (person93, account66) into Ownership
!insert (person91, account67) into Ownership
!insert (person92, account67) into Ownership

!insert (person91, account64) into Use
!insert (person93, account64) into Use
!insert (person92, account65) into Use
!insert (person94, account65) into Use
!insert (person91, account65) into Use
!insert (person93, account66) into Use
!insert (person91, account67) into Use
!insert (person92, account67) into Use

!insert (bank29, account64) into AccountOfBanks
!insert (bank29, account65) into AccountOfBanks
!insert (bank29, account66) into AccountOfBanks
!insert (bank29, account67) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 51 | 0.00% |
| Multiplicities Errors | 0 | 19 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 4 | 4 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
CA22 MLF 4567 8910 2345 67
```
```
CA22 MLF 1234 5678 9012 34
```
```
CA22 MLF 9876 5432 1098 76
```
```
CA22 MLF 3210 9876 5432 10
```

## Category complex
```
!new Bank('bank33')
!bank33.country := 'Japan'
!bank33.name := 'Hayashi Bank'
!bank33.bic := 'HYJPJPJT'

!new Account('account77')
!account77.iban := 'JP2750930000012345678'
!account77.balance := 250000

!new Account('account78')
!account78.iban := 'JP2750930000054321098'
!account78.balance := 150000

!new Account('account79')
!account79.iban := 'JP2750930000098765432'
!account79.balance := 5000

!new Person('person107')
!person107.firstName := 'Haruto'
!person107.lastName := 'Tanaka'
!person107.age := 55

!new Person('person108')
!person108.firstName := 'Yuki'
!person108.lastName := 'Sato'
!person108.age := 29

!new Person('person109')
!person109.firstName := 'Arisa'
!person109.lastName := 'Nakamura'
!person109.age := 45

!new Person('person110')
!person110.firstName := 'Kenji'
!person110.lastName := 'Ito'
!person110.age := 60

!new Person('person111')
!person111.firstName := 'Mei'
!person111.lastName := 'Suzuki'
!person111.age := 35

!insert (person107, account77) into Ownership
!insert (person108, account77) into Ownership
!insert (person109, account78) into Ownership
!insert (person110, account78) into Ownership
!insert (person111, account79) into Ownership

!insert (person107, account77) into Use
!insert (person108, account77) into Use
!insert (person111, account77) into Use
!insert (person109, account78) into Use
!insert (person110, account78) into Use
!insert (person107, account78) into Use
!insert (person111, account79) into Use

!insert (bank33, account77) into AccountOfBanks
!insert (bank33, account78) into AccountOfBanks
!insert (bank33, account79) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 48 | 0.00% |
| Multiplicities Errors | 0 | 15 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 3 | 3 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
JP2750930000012345678
```
```
JP2750930000054321098
```
```
JP2750930000098765432
```

## Category edge
```
!new Bank('bank32')
!bank32.country := 'Kenya'
!bank32.name := 'Savannah Banking Corporation'
!bank32.bic := 'SBCOKNNAXXX'

!new Account('account75')
!account75.iban := 'KE8888888888888888'
!account75.balance := 1

!new Account('account76')
!account76.iban := 'KE9999999999999999'
!account76.balance := 250000

!new Person('person104')
!person104.firstName := 'Achieng'
!person104.lastName := 'Odhiambo'
!person104.age := 19

!new Person('person105')
!person105.firstName := 'Kiprono'
!person105.lastName := 'Kibet'
!person105.age := 55

!new Person('person106')
!person106.firstName := 'Isingoma'
!person106.lastName := 'Mukasa'
!person106.age := 70

!insert (person104, account75) into Ownership
!insert (person105, account75) into Ownership
!insert (person106, account76) into Ownership

!insert (person104, account75) into Use
!insert (person106, account75) into Use
!insert (person105, account76) into Use

!insert (bank32, account75) into AccountOfBanks
!insert (bank32, account76) into AccountOfBanks
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 30 | 0.00% |
| Multiplicities Errors | 0 | 8 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 2 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
KE8888888888888888
```
```
KE9999999999999999
```

## Category invalid
```
!new Bank('bank31')
!bank31.country := 'Brazil'
!bank31.name := 'Horizonte Bank'
!bank31.bic := 'HBRCBRRJ'

!new Account('account73')
!account73.iban := 'BR9701234567890123456789012'
!account73.balance := 3500

!new Account('account74')
!account74.iban := 'BR5609876543210987654321098'
!account74.balance := -250

!new Person('person100')
!person100.firstName := 'Ana'
!person100.lastName := 'Lopez'
!person100.age := 48

!new Person('person101')
!person101.firstName := 'Carlos'
!person101.lastName := 'Lopez'
!person101.age := 51

!new Person('person102')
!person102.firstName := 'Pedro'
!person102.lastName := 'Lopez'
!person102.age := 17

!new Person('person103')
!person103.firstName := 'Rafael'
!person103.lastName := 'Silva'
!person103.age := 24

!insert (person100, account73) into Ownership
!insert (person101, account73) into Ownership
!insert (person103, account74) into Ownership

!insert (person102, account73) into Use
!insert (person103, account74) into Use

!insert (bank31, account73) into AccountOfBanks
!insert (bank31, account74) into AccountOfBanks
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 7 | 0.00% |
| Invariants Errors (Not included on General) | 1 | 2 | 50.00% |

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (2) `Account::positiveBalance': FAILED.
```

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 2 | 2 | 100.00% |
| BICs | 0 | 1 | 0.00% |
| Countries | 0 | 1 | 0.00% |

| Failed IBANs | 
|---| 
```
BR9701234567890123456789012
```
```
BR5609876543210987654321098
```

## Generation 6 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 215 | 0.00% |
| Multiplicities Errors | 0 | 58 | 0.00% |
| Invariants Errors | 0 | 8 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 7 | 0.00% |
| Invariants Errors (Not included on General) | 1 | 2 | 50.00% |

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (2) `Account::positiveBalance': FAILED.
```

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 14 | 14 | 100.00% |
| BICs | 0 | 6 | 0.00% |
| Countries | 0 | 6 | 0.00% |

| Failed IBANs | 
|---| 
```
US64CHAS1234567890123
```
```
BR720000000012345678901
```
```
US64CHAS2345678901234
```
```
CA22 MLF 4567 8910 2345 67
```
```
CA22 MLF 1234 5678 9012 34
```
```
CA22 MLF 9876 5432 1098 76
```
```
CA22 MLF 3210 9876 5432 10
```
```
JP2750930000012345678
```
```
JP2750930000054321098
```
```
JP2750930000098765432
```
```
KE8888888888888888
```
```
KE9999999999999999
```
```
BR9701234567890123456789012
```
```
BR5609876543210987654321098
```

# Summary for all generations
| Summary | Value | 
|---|---| 
| Model | GPT_4O | 
| Type | CoT | 
| System | bank | 
| Number of generations | 6 | 

| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 1160 | 0.00% |
| Multiplicities Errors | 0 | 300 | 0.00% |
| Invariants Errors | 0 | 48 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 47 | 0.00% |
| Invariants Errors (Not included on General) | 2 | 12 | 16.67% |

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (2) `Account::positiveBalance': FAILED.
```
```
checking invariant (2) `Account::positiveBalance': FAILED.
```

| Bank | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| IBANs | 74 | 79 | 93.67% |
| BICs | 4 | 33 | 12.12% |
| Countries | 0 | 33 | 0.00% |

| Failed IBANs | 
|---| 
```
GL57 ARCT 0000 0000000001
```
```
GL57 ARCT 0000 0000000002
```
```
IT60X0542811101000000654321
```
```
IT60X0542811101000000987654
```
```
AX1234567890123456
```
```
AX9876543210987654
```
```
DE89370400440532013001
```
```
JP234000123456789012345
```
```
CA000100200300400500600
```
```
JP098765432109876543210
```
```
AU45 SSBU 1234 5678 9012 34
```
```
AU45 SSBU 2345 6789 0123 45
```
```
AU45 SSBU 3456 7890 1234 56
```
```
IN68113600040500123456
```
```
IN68113600040500432109
```
```
IN68113600040500789012
```
```
IN68113600040500987654
```
```
MV1111111111111111
```
```
JP12345678901234567890
```
```
JP09876543210987654321
```
```
KE00123456789012345678
```
```
MX36901234567891234567
```
```
MX51 AZTE 1234 5678 9012 3456
```
```
MX51 AZTE 0987 6543 2109 8765
```
```
MX51 AZTE 1111 2222 3333 4444
```
```
CA951234000000045267
```
```
CA951234000000076543
```
```
CA951234000000065432
```
```
CA951234000000098765
```
```
CA951234000000032176
```
```
BT2222222222222222
```
```
BT3333333333333333
```
```
KE12345678901234567890
```
```
KE09876543210987654321
```
```
IN30109876543210987654
```
```
IN50234567890123456789
```
```
IN70987654321098765432
```
```
CH93 ALPS 0000 1234 5678 9
```
```
CH93 ALPS 9876 5432 1098 7
```
```
CH93 ALPS 1111 2222 3333 9
```
```
AU132962003000123456
```
```
AU132962003000654321
```
```
AU132962003000987654
```
```
AU132962003000543210
```
```
DK4444444444444444
```
```
DK5555555555555555
```
```
CA56473829106473598265
```
```
CA82736481920456719384
```
```
FR7630006000029876543210123
```
```
AE99 DOBA 0000 9876 5432 10
```
```
AE99 DOBA 1111 2222 3333 44
```
```
ZA653010000000012345
```
```
ZA653010000000067890
```
```
ZA653010000000054321
```
```
ZA653010000000076432
```
```
ZA653010000000098765
```
```
JP6666666666666666
```
```
JP7777777777777777
```
```
IT6012345678901234567890
```
```
IT8098765432109876543210
```
```
US64CHAS1234567890123
```
```
BR720000000012345678901
```
```
US64CHAS2345678901234
```
```
CA22 MLF 4567 8910 2345 67
```
```
CA22 MLF 1234 5678 9012 34
```
```
CA22 MLF 9876 5432 1098 76
```
```
CA22 MLF 3210 9876 5432 10
```
```
JP2750930000012345678
```
```
JP2750930000054321098
```
```
JP2750930000098765432
```
```
KE8888888888888888
```
```
KE9999999999999999
```
```
BR9701234567890123456789012
```
```
BR5609876543210987654321098
```

| Failed BICs | 
|---| 
```
RHNBDEBB
```
```
CRBVMVXXXX
```
```
MLFCANCAXXXX
```
```
ALPSCHZH
```

