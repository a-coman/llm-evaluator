# Generation 1
## Category baseline
```
!new AddressBook('AddressBook_1')

!new Person('Person_1')
!Person_1.name := 'John Doe'
!Person_1.phone := '+1-555-0123'
!Person_1.website := 'www.johndoe.com'
!Person_1.email := 'john.doe@example.com'
!Person_1.title := 'Software Engineer'

!new Address('Address_1')
!Address_1.city := 'San Francisco'
!Address_1.houseNr := '123'
!Address_1.street := 'Market Street'
!insert (Person_1, Address_1) into ContactContainsAddress

!new Note('Note_1')
!Note_1.author := 'John Doe'
!Note_1.time := Date('2023-01-15')
!Note_1.type := #EMAIL
!Note_1.comment := 'Follow up with client about software updates.'
!insert (Person_1, Note_1) into ContactContainsNote

!new Relationship('Relationship_1')
!Relationship_1.type := #EMPLOYEE
!insert (Person_1, Relationship_1) into ContactToRelationship

!new Company('Company_1')
!Company_1.name := 'Tech Innovations Inc.'
!Company_1.phone := '+1-555-5678'
!Company_1.website := 'www.techinnovations.com'
!Company_1.email := 'contact@techinnovations.com'
!Company_1.industry := 'Information Technology'

!new Address('Address_2')
!Address_2.city := 'New York'
!Address_2.houseNr := '456'
!Address_2.street := '5th Avenue'
!insert (Company_1, Address_2) into ContactContainsAddress

!new Note('Note_2')
!Note_2.author := 'Sarah Mills'
!Note_2.time := Date('2023-02-10')
!Note_2.type := #MEETING
!Note_2.comment := 'Annual budget discussion scheduled.'
!insert (Company_1, Note_2) into ContactContainsNote

!insert (Relationship_1, Company_1) into RelationshipToContact

!new Person('Person_2')
!Person_2.name := 'Emily Zhang'
!Person_2.phone := '+44-7777-9988'
!Person_2.website := 'emilyzhangdesign.com'
!Person_2.email := 'e.zhang@designbliss.com'
!Person_2.title := 'Creative Director'

!new Address('Address_3')
!Address_3.city := 'London'
!Address_3.houseNr := '221B'
!Address_3.street := 'Baker Street'
!insert (Person_2, Address_3) into ContactContainsAddress

!new Note('Note_3')
!Note_3.author := 'Emily Zhang'
!Note_3.time := Date('2023-03-01')
!Note_3.type := #CALL
!Note_3.comment := 'Discussed quarterly design themes with marketing.'
!insert (Person_2, Note_3) into ContactContainsNote

!new Relationship('Relationship_2')
!Relationship_2.type := #COWORKER
!insert (Person_2, Relationship_2) into ContactToRelationship
!insert (Relationship_2, Person_1) into RelationshipToContact

!insert (AddressBook_1, Person_1) into AddressBookMadeOfContact
!insert (AddressBook_1, Company_1) into AddressBookMadeOfContact
!insert (AddressBook_1, Person_2) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 63 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 2 | 3 | 66.67% |

| Invalid Addresses | 
|---| 
```
Market Street, 123, San Francisco
```
```
Baker Street, 221B, London
```

## Category boundary
```
!new AddressBook('AddressBook_1')

!new Company('Company_1')
!Company_1.name := 'Global Tech Corp'
!Company_1.phone := '+1-555-0110'
!Company_1.website := 'www.globaltechcorp.com'
!Company_1.email := 'contact@globaltechcorp.com'
!Company_1.industry := 'Technology'

!new Address('Address_1')
!Address_1.city := 'New York'
!Address_1.houseNr := '42'
!Address_1.street := 'Wall Street'
!insert (Company_1, Address_1) into ContactContainsAddress

!new Note('Note_1')
!Note_1.author := 'Emily Fisher'
!Note_1.time := Date('2023-10-15')
!Note_1.type := #MEETING
!Note_1.comment := 'Discussed upcoming software project.'
!insert (Company_1, Note_1) into ContactContainsNote

!new Relationship('Relationship_1')
!Relationship_1.type := #BOSS
!insert (Company_1, Relationship_1) into ContactToRelationship

!new Person('Person_1')
!Person_1.name := 'John Doe'
!Person_1.phone := '+1-555-0199'
!Person_1.website := 'www.johndoeconsulting.com'
!Person_1.email := 'john.doe@johndoeconsulting.com'
!Person_1.title := 'Senior Consultant'

!new Address('Address_2')
!Address_2.city := 'Boston'
!Address_2.houseNr := '11'
!Address_2.street := 'Beacon Street'
!insert (Person_1, Address_2) into ContactContainsAddress

!new Address('Address_3')
!Address_3.city := 'Chicago'
!Address_3.houseNr := '203'
!Address_3.street := 'Lake Shore Dr'
!insert (Person_1, Address_3) into ContactContainsAddress

!new Note('Note_2')
!Note_2.author := 'Sarah Lane'
!Note_2.time := Date('2023-08-05')
!Note_2.type := #CALL
!Note_2.comment := 'Follow-up on consulting engagement.'
!insert (Person_1, Note_2) into ContactContainsNote

!new Relationship('Relationship_2')
!Relationship_2.type := #EMPLOYEE
!insert (Person_1, Relationship_2) into ContactToRelationship
!insert (Relationship_1, Person_1) into RelationshipToContact
!insert (Relationship_2, Company_1) into RelationshipToContact

!new Person('Person_2')
!Person_2.name := 'Alice Smith'
!Person_2.phone := '+1-555-0355'
!Person_2.website := 'www.alicesmithphotography.com'
!Person_2.email := 'alice@smithphotos.com'
!Person_2.title := 'Photographer'

!new Address('Address_4')
!Address_4.city := 'Los Angeles'
!Address_4.houseNr := '2590'
!Address_4.street := 'Sunset Blvd'
!insert (Person_2, Address_4) into ContactContainsAddress

!new Note('Note_3')
!Note_3.author := 'Michael Brown'
!Note_3.time := Date('2023-12-22')
!Note_3.type := #EMAIL
!Note_3.comment := 'Discussed photo shoot scheduling.'
!insert (Person_2, Note_3) into ContactContainsNote

!new Relationship('Relationship_3')
!Relationship_3.type := #COWORKER
!insert (Person_1, Relationship_3) into ContactToRelationship
!insert (Relationship_3, Person_2) into RelationshipToContact

!new Relationship('Relationship_4')
!Relationship_4.type := #COWORKER
!insert (Person_2, Relationship_4) into ContactToRelationship
!insert (Relationship_4, Person_1) into RelationshipToContact

!insert (AddressBook_1, Company_1) into AddressBookMadeOfContact
!insert (AddressBook_1, Person_1) into AddressBookMadeOfContact
!insert (AddressBook_1, Person_2) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 76 | 0.00% |
| Multiplicities Errors | 0 | 18 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 2 | 4 | 50.00% |

| Invalid Addresses | 
|---| 
```
Lake Shore Dr, 203, Chicago
```
```
Sunset Blvd, 2590, Los Angeles
```

## Category complex
```
!new AddressBook('GlobalTechAddressBook')

!new Person('Maria_Garcia')
!Maria_Garcia.name := 'María García'
!Maria_Garcia.phone := '+34-612-345-678'
!Maria_Garcia.website := 'maria-garcia-professional.com'
!Maria_Garcia.email := 'maria.garcia@globaltech.es'
!Maria_Garcia.title := 'Senior Software Engineer'

!new Address('Address_Maria_Garcia')
!Address_Maria_Garcia.city := 'Barcelona'
!Address_Maria_Garcia.houseNr := '24'
!Address_Maria_Garcia.street := 'Gran Via de les Corts Catalanes'
!insert (Maria_Garcia, Address_Maria_Garcia) into ContactContainsAddress

!new Note('Note_Maria_Garcia')
!Note_Maria_Garcia.author := 'María García'
!Note_Maria_Garcia.time := Date('2023-09-15')
!Note_Maria_Garcia.type := #MEETING
!Note_Maria_Garcia.comment := 'Meeting with the client to discuss new software requirements.'
!insert (Maria_Garcia, Note_Maria_Garcia) into ContactContainsNote

!new Person('John_Smith')
!John_Smith.name := 'John Smith'
!John_Smith.phone := '+1-202-555-0143'
!John_Smith.website := 'john-smith.biz'
!John_Smith.email := 'john.smith@globaltech.com'
!John_Smith.title := 'Director of Operations'

!new Address('Address_John_Smith')
!Address_John_Smith.city := 'New York'
!Address_John_Smith.houseNr := '50'
!Address_John_Smith.street := 'Fifth Avenue'
!insert (John_Smith, Address_John_Smith) into ContactContainsAddress

!new Note('Note_John_Smith')
!Note_John_Smith.author := 'John Smith'
!Note_John_Smith.time := Date('2023-10-05')
!Note_John_Smith.type := #CALL
!Note_John_Smith.comment := 'Follow-up call with suppliers in Asia.'
!insert (John_Smith, Note_John_Smith) into ContactContainsNote

!new Company('Nihao_Logistics')
!Nihao_Logistics.name := 'Nihao Logistics'
!Nihao_Logistics.phone := '+86-10-5554-6789'
!Nihao_Logistics.website := 'nihaologistics.cn'
!Nihao_Logistics.email := 'contact@nihaologistics.cn'
!Nihao_Logistics.industry := 'Logistics'

!new Address('Address_Nihao_Logistics')
!Address_Nihao_Logistics.city := 'Beijing'
!Address_Nihao_Logistics.houseNr := '908'
!Address_Nihao_Logistics.street := 'Zhongguancun Ave'
!insert (Nihao_Logistics, Address_Nihao_Logistics) into ContactContainsAddress

!new Note('Note_Nihao_Logistics')
!Note_Nihao_Logistics.author := 'Zhang Wei'
!Note_Nihao_Logistics.time := Date('2023-10-01')
!Note_Nihao_Logistics.type := #EMAIL
!Note_Nihao_Logistics.comment := 'Received shipment tracking numbers.'
!insert (Nihao_Logistics, Note_Nihao_Logistics) into ContactContainsNote

!new Relationship('Relationship_John_to_Maria')
!Relationship_John_to_Maria.type := #BOSS
!insert (John_Smith, Relationship_John_to_Maria) into ContactToRelationship
!insert (Relationship_John_to_Maria, Maria_Garcia) into RelationshipToContact

!new Relationship('Relationship_Maria_to_John')
!Relationship_Maria_to_John.type := #EMPLOYEE
!insert (Maria_Garcia, Relationship_Maria_to_John) into ContactToRelationship
!insert (Relationship_Maria_to_John, John_Smith) into RelationshipToContact

!new Relationship('Relationship_John_to_Nihao')
!Relationship_John_to_Nihao.type := #COWORKER
!insert (John_Smith, Relationship_John_to_Nihao) into ContactToRelationship
!insert (Relationship_John_to_Nihao, Nihao_Logistics) into RelationshipToContact

!insert (GlobalTechAddressBook, Maria_Garcia) into AddressBookMadeOfContact
!insert (GlobalTechAddressBook, John_Smith) into AddressBookMadeOfContact
!insert (GlobalTechAddressBook, Nihao_Logistics) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 67 | 0.00% |
| Multiplicities Errors | 0 | 15 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 2 | 3 | 66.67% |

| Invalid Addresses | 
|---| 
```
Gran Via de les Corts Catalanes, 24, Barcelona
```
```
Zhongguancun Ave, 908, Beijing
```

## Category edge
```
!new AddressBook('Global_Networks')

!new Company('GlobalTech_Solutions')
!GlobalTech_Solutions.name := 'GlobalTech Solutions'
!GlobalTech_Solutions.phone := '+44 20 7946 0958'
!GlobalTech_Solutions.website := 'www.globaltechsolutions.co.uk'
!GlobalTech_Solutions.email := 'contact@globaltechsolutions.co.uk'
!GlobalTech_Solutions.industry := 'Information Technology'

!new Address('Address_GlobalTech_London')
!Address_GlobalTech_London.city := 'London'
!Address_GlobalTech_London.houseNr := '101'
!Address_GlobalTech_London.street := 'Tech Lane'
!insert (GlobalTech_Solutions, Address_GlobalTech_London) into ContactContainsAddress

!new Note('Note_GlobalTech')
!Note_GlobalTech.author := 'Jonathan Ivy'
!Note_GlobalTech.time := Date('2023-09-15')
!Note_GlobalTech.type := #EMAIL
!Note_GlobalTech.comment := 'Confirmed merger with EuroSoft GmbH.'
!insert (GlobalTech_Solutions, Note_GlobalTech) into ContactContainsNote

!new Company('EuroSoft_GmbH')
!EuroSoft_GmbH.name := 'EuroSoft GmbH'
!EuroSoft_GmbH.phone := '+49 30 567 88 100'
!EuroSoft_GmbH.website := 'www.eurosoft.de'
!EuroSoft_GmbH.email := 'info@eurosoft.de'
!EuroSoft_GmbH.industry := 'Software Development'

!new Address('Address_EuroSoft_Berlin')
!Address_EuroSoft_Berlin.city := 'Berlin'
!Address_EuroSoft_Berlin.houseNr := '23'
!Address_EuroSoft_Berlin.street := 'Innovation Way'
!insert (EuroSoft_GmbH, Address_EuroSoft_Berlin) into ContactContainsAddress

!new Note('Note_EuroSoft')
!Note_EuroSoft.author := 'Klaus Meier'
!Note_EuroSoft.time := Date('2023-10-01')
!Note_EuroSoft.type := #MEETING
!Note_EuroSoft.comment := 'Discussing project timelines with GlobalTech.'
!insert (EuroSoft_GmbH, Note_EuroSoft) into ContactContainsNote

!new Person('Maria_Garcia')
!Maria_Garcia.name := 'Maria Garcia'
!Maria_Garcia.phone := '+34 645 78 9032'
!Maria_Garcia.website := 'www.mariagarcia.com'
!Maria_Garcia.email := 'maria.garcia@globaltechsolutions.co.uk'
!Maria_Garcia.title := 'International Liaison'

!new Address('Address_Maria_Madrid')
!Address_Maria_Madrid.city := 'Madrid'
!Address_Maria_Madrid.houseNr := '7'
!Address_Maria_Madrid.street := 'Gran Via'
!insert (Maria_Garcia, Address_Maria_Madrid) into ContactContainsAddress

!new Address('Address_Maria_Berlin')
!Address_Maria_Berlin.city := 'Berlin'
!Address_Maria_Berlin.houseNr := '24'
!Address_Maria_Berlin.street := 'Innovation Way'
!insert (Maria_Garcia, Address_Maria_Berlin) into ContactContainsAddress

!new Note('Note_Maria_1')
!Note_Maria_1.author := 'Maria Garcia'
!Note_Maria_1.time := Date('2023-10-02')
!Note_Maria_1.type := #CALL
!Note_Maria_1.comment := 'Coordinating meeting schedules across different time zones.'
!insert (Maria_Garcia, Note_Maria_1) into ContactContainsNote

!new Note('Note_Maria_2')
!Note_Maria_2.author := 'Klaus Meier'
!Note_Maria_2.time := Date('2023-10-05')
!Note_Maria_2.type := #EMAIL
!Note_Maria_2.comment := 'Feedback on legal documents for the merger.'
!insert (Maria_Garcia, Note_Maria_2) into ContactContainsNote

!new Relationship('Relationship_GlobalTech_to_EuroSoft')
!Relationship_GlobalTech_to_EuroSoft.type := #SUBDIVISION
!insert (GlobalTech_Solutions, Relationship_GlobalTech_to_EuroSoft) into ContactToRelationship
!insert (Relationship_GlobalTech_to_EuroSoft, EuroSoft_GmbH) into RelationshipToContact

!new Relationship('Relationship_GlobalTech_to_Maria')
!Relationship_GlobalTech_to_Maria.type := #EMPLOYEE
!insert (GlobalTech_Solutions, Relationship_GlobalTech_to_Maria) into ContactToRelationship
!insert (Relationship_GlobalTech_to_Maria, Maria_Garcia) into RelationshipToContact

!new Relationship('Relationship_EuroSoft_to_Maria')
!Relationship_EuroSoft_to_Maria.type := #COWORKER
!insert (EuroSoft_GmbH, Relationship_EuroSoft_to_Maria) into ContactToRelationship
!insert (Relationship_EuroSoft_to_Maria, Maria_Garcia) into RelationshipToContact

!insert (Global_Networks, GlobalTech_Solutions) into AddressBookMadeOfContact
!insert (Global_Networks, EuroSoft_GmbH) into AddressBookMadeOfContact
!insert (Global_Networks, Maria_Garcia) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 78 | 0.00% |
| Multiplicities Errors | 0 | 17 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 3 | 4 | 75.00% |

| Invalid Addresses | 
|---| 
```
Tech Lane, 101, London
```
```
Innovation Way, 24, Berlin
```
```
Innovation Way, 23, Berlin
```

## Category invalid
```
!new AddressBook('Tokyo_Corporate_Network_Contacts')

!new Company('Sakura_Technologies')
!Sakura_Technologies.name := 'Sakura Technologies'
!Sakura_Technologies.phone := '+81-3-1234-5678'
!Sakura_Technologies.website := 'www.sakura-tech.jp'
!Sakura_Technologies.email := 'contact@sakura-tech.jp'
!Sakura_Technologies.industry := 'Information Technology'

!new Address('Address_Sakura_Technologies')
!Address_Sakura_Technologies.city := 'Tokyo'
!Address_Sakura_Technologies.street := 'Shinagawa-ku, 5th Avenue'
!Address_Sakura_Technologies.houseNr := '22'
!insert (Sakura_Technologies, Address_Sakura_Technologies) into ContactContainsAddress

!new Note('Note_Sakura_Technologies')
!Note_Sakura_Technologies.author := 'Hana Yamada'
!Note_Sakura_Technologies.time := Date('2023-09-15 10:00')
!Note_Sakura_Technologies.type := #MEETING
!Note_Sakura_Technologies.comment := 'Discussed potential partnership projects with regional AI startups.'
!insert (Sakura_Technologies, Note_Sakura_Technologies) into ContactContainsNote

!new Relationship('Relationship_Sakura_to_Tsukasa')
!Relationship_Sakura_to_Tsukasa.type := #SUBDIVISION
!insert (Sakura_Technologies, Relationship_Sakura_to_Tsukasa) into ContactToRelationship

!new Company('Tsukasa_Robotics_Ltd')
!Tsukasa_Robotics_Ltd.name := 'Tsukasa Robotics Ltd.'
!Tsukasa_Robotics_Ltd.phone := '+81-3-8765-4321'
!Tsukasa_Robotics_Ltd.website := 'www.tsukasarobotics.jp'
!Tsukasa_Robotics_Ltd.email := 'info@tsukasarobotics.jp'
!Tsukasa_Robotics_Ltd.industry := 'Robotics'

!new Address('Address_Tsukasa_Robotics')
!Address_Tsukasa_Robotics.city := 'Tokyo'
!Address_Tsukasa_Robotics.street := 'Minato-ku, Robot Street'
!Address_Tsukasa_Robotics.houseNr := '10'
!insert (Tsukasa_Robotics_Ltd, Address_Tsukasa_Robotics) into ContactContainsAddress

!new Note('Note_Tsukasa_Robotics')
!Note_Tsukasa_Robotics.author := 'Mai Tanaka'
!Note_Tsukasa_Robotics.time := Date('2023-09-18 15:30')
!Note_Tsukasa_Robotics.type := #CALL
!Note_Tsukasa_Robotics.comment := 'Phone call regarding the new humanoid robot prototype.'
!insert (Tsukasa_Robotics_Ltd, Note_Tsukasa_Robotics) into ContactContainsNote

!new Relationship('Relationship_Tsukasa_to_Kenji')
!Relationship_Tsukasa_to_Kenji.type := #EMPLOYEE
!insert (Tsukasa_Robotics_Ltd, Relationship_Tsukasa_to_Kenji) into ContactToRelationship

!new Person('Kenji_Yamamoto')
!Kenji_Yamamoto.name := 'Kenji Yamamoto'
!Kenji_Yamamoto.phone := '+81-90-9876-5432'
!Kenji_Yamamoto.website := 'www.kenjiyamamoto.jp'
!Kenji_Yamamoto.email := 'kyamamoto@individual.jp'
!Kenji_Yamamoto.title := 'Chief Robotics Engineer'

!new Note('Note_Kenji_Yamamoto')
!Note_Kenji_Yamamoto.author := 'Kenji Yamamoto'
!Note_Kenji_Yamamoto.time := Date('2023-09-19 12:15')
!Note_Kenji_Yamamoto.type := #EMAIL
!Note_Kenji_Yamamoto.comment := 'Sent concept designs to the engineering team.'
!insert (Kenji_Yamamoto, Note_Kenji_Yamamoto) into ContactContainsNote

!insert (Relationship_Sakura_to_Tsukasa, Tsukasa_Robotics_Ltd) into RelationshipToContact
!insert (Relationship_Tsukasa_to_Kenji, Kenji_Yamamoto) into RelationshipToContact

!insert (Tokyo_Corporate_Network_Contacts, Sakura_Technologies) into AddressBookMadeOfContact
!insert (Tokyo_Corporate_Network_Contacts, Tsukasa_Robotics_Ltd) into AddressBookMadeOfContact
!insert (Tokyo_Corporate_Network_Contacts, Kenji_Yamamoto) into AddressBookMadeOfContact
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 12 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 2 | 2 | 100.00% |

| Invalid Addresses | 
|---| 
```
Shinagawa-ku, 5th Avenue, 22, Tokyo
```
```
Minato-ku, Robot Street, 10, Tokyo
```

## Generation 1 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 342 | 0.00% |
| Multiplicities Errors | 0 | 63 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 12 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 15 | 0.00% |
| Websites | 0 | 15 | 0.00% |
| Emails | 0 | 15 | 0.00% |
| Addresses | 11 | 16 | 68.75% |

| Invalid Addresses | 
|---| 
```
Market Street, 123, San Francisco
```
```
Baker Street, 221B, London
```
```
Lake Shore Dr, 203, Chicago
```
```
Sunset Blvd, 2590, Los Angeles
```
```
Gran Via de les Corts Catalanes, 24, Barcelona
```
```
Zhongguancun Ave, 908, Beijing
```
```
Tech Lane, 101, London
```
```
Innovation Way, 24, Berlin
```
```
Innovation Way, 23, Berlin
```
```
Shinagawa-ku, 5th Avenue, 22, Tokyo
```
```
Minato-ku, Robot Street, 10, Tokyo
```

# Generation 2
## Category baseline
```
!new AddressBook('AddressBook_2')

!new Person('Person_3')
!Person_3.name := 'Carlos Mendoza'
!Person_3.phone := '+52-55-99887766'
!Person_3.website := 'carlosm-art.com'
!Person_3.email := 'carlos.mendoza@artshow.com'
!Person_3.title := 'Art Curator'

!new Address('Address_4')
!Address_4.city := 'Mexico City'
!Address_4.houseNr := '789'
!Address_4.street := 'Avenida Reforma'
!insert (Person_3, Address_4) into ContactContainsAddress

!new Note('Note_4')
!Note_4.author := 'Carlos Mendoza'
!Note_4.time := Date('2023-04-20')
!Note_4.type := #MEETING
!Note_4.comment := 'Planning exhibition logistics with art suppliers.'
!insert (Person_3, Note_4) into ContactContainsNote

!new Company('Company_2')
!Company_2.name := 'Global Ventures Ltd.'
!Company_2.phone := '+61-3-1234-5678'
!Company_2.website := 'www.globalventures.com.au'
!Company_2.email := 'info@globalventures.com.au'
!Company_2.industry := 'Consulting'

!new Address('Address_5')
!Address_5.city := 'Melbourne'
!Address_5.houseNr := '250'
!Address_5.street := 'Collins Street'
!insert (Company_2, Address_5) into ContactContainsAddress

!new Note('Note_5')
!Note_5.author := 'Richard Bales'
!Note_5.time := Date('2023-05-18')
!Note_5.type := #CALL
!Note_5.comment := 'Client feedback session following project completion.'
!insert (Company_2, Note_5) into ContactContainsNote

!new Person('Person_4')
!Person_4.name := 'Akiko Takahashi'
!Person_4.phone := '+81-3-5555-4444'
!Person_4.website := 'akikotakahashi.jp'
!Person_4.email := 'akiko.t@innovations.jp'
!Person_4.title := 'Business Analyst'

!new Address('Address_6')
!Address_6.city := 'Tokyo'
!Address_6.houseNr := '1120'
!Address_6.street := 'Shinjuku-dori'
!insert (Person_4, Address_6) into ContactContainsAddress

!new Note('Note_6')
!Note_6.author := 'Akiko Takahashi'
!Note_6.time := Date('2023-06-12')
!Note_6.type := #EMAIL
!Note_6.comment := 'Sent market analysis and projections for Q2.'
!insert (Person_4, Note_6) into ContactContainsNote

!new Relationship('Relationship_4')
!Relationship_4.type := #SUBDIVISION
!insert (Person_4, Relationship_4) into ContactToRelationship
!insert (Relationship_4, Company_2) into RelationshipToContact

!new Relationship('Relationship_5')
!Relationship_5.type := #COWORKER
!insert (Person_4, Relationship_5) into ContactToRelationship
!insert (Relationship_5, Person_3) into RelationshipToContact

!insert (AddressBook_2, Person_3) into AddressBookMadeOfContact
!insert (AddressBook_2, Company_2) into AddressBookMadeOfContact
!insert (AddressBook_2, Person_4) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 63 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 3 | 3 | 100.00% |

| Invalid Addresses | 
|---| 
```
Collins Street, 250, Melbourne
```
```
Shinjuku-dori, 1120, Tokyo
```
```
Avenida Reforma, 789, Mexico City
```

## Category boundary
```
!new AddressBook('AddressBook_2')

!new Company('Innovate_Start_up_Co')
!Innovate_Start_up_Co.name := 'Innovate Start-up Co.'
!Innovate_Start_up_Co.phone := '+44-20-7946-0958'
!Innovate_Start_up_Co.website := 'www.innovatestart.com'
!Innovate_Start_up_Co.email := 'info@innovatestart.com'
!Innovate_Start_up_Co.industry := 'FinTech'

!new Address('Address_1')
!Address_1.city := 'London'
!Address_1.houseNr := '15'
!Address_1.street := 'Baker Street'
!insert (Innovate_Start_up_Co, Address_1) into ContactContainsAddress

!new Note('Note_1')
!Note_1.author := 'Clara Tan'
!Note_1.time := Date('2023-09-29')
!Note_1.type := #EMAIL
!Note_1.comment := 'Clarification on partnership agreement.'
!insert (Innovate_Start_up_Co, Note_1) into ContactContainsNote

!new Relationship('Relationship_1')
!Relationship_1.type := #BOSS
!insert (Innovate_Start_up_Co, Relationship_1) into ContactToRelationship

!new Person('Dr_Mei_Lin_Chen')
!Dr_Mei_Lin_Chen.name := 'Dr. Mei Lin Chen'
!Dr_Mei_Lin_Chen.phone := '+86-21-5555-2222'
!Dr_Mei_Lin_Chen.website := 'www.drmeilinchuniversity.com'
!Dr_Mei_Lin_Chen.email := 'mei.chen@universityedu.cn'
!Dr_Mei_Lin_Chen.title := 'Professor of Economics'

!new Address('Address_2')
!Address_2.city := 'Shanghai'
!Address_2.houseNr := '67'
!Address_2.street := 'Nanjing Road West'
!insert (Dr_Mei_Lin_Chen, Address_2) into ContactContainsAddress

!new Note('Note_2')
!Note_2.author := 'Li Zhi'
!Note_2.time := Date('2023-11-03')
!Note_2.type := #MEETING
!Note_2.comment := 'Presentation on global economic trends.'
!insert (Dr_Mei_Lin_Chen, Note_2) into ContactContainsNote

!new Relationship('Relationship_2')
!Relationship_2.type := #SUBDIVISION
!insert (Dr_Mei_Lin_Chen, Relationship_2) into ContactToRelationship
!insert (Relationship_2, Innovate_Start_up_Co) into RelationshipToContact

!new Relationship('Relationship_3')
!Relationship_3.type := #COWORKER
!insert (Dr_Mei_Lin_Chen, Relationship_3) into ContactToRelationship

!new Person('Alejandro_Rosas')
!Alejandro_Rosas.name := 'Alejandro Rosas'
!Alejandro_Rosas.phone := '+34-91-888-3456'
!Alejandro_Rosas.website := 'www.alejandro-rosas-art.com'
!Alejandro_Rosas.email := 'alejandro@rosasart.es'
!Alejandro_Rosas.title := 'Art Consultant'

!new Address('Address_3')
!Address_3.city := 'Madrid'
!Address_3.houseNr := '102'
!Address_3.street := 'Gran Via'
!insert (Alejandro_Rosas, Address_3) into ContactContainsAddress

!new Address('Address_4')
!Address_4.city := 'Barcelona'
!Address_4.houseNr := '22'
!Address_4.street := 'Rambla de Catalunya'
!insert (Alejandro_Rosas, Address_4) into ContactContainsAddress

!new Note('Note_3')
!Note_3.author := 'Juan Carlos'
!Note_3.time := Date('2023-10-18')
!Note_3.type := #CALL
!Note_3.comment := 'Discussed upcoming art exhibition.'
!insert (Alejandro_Rosas, Note_3) into ContactContainsNote

!new Relationship('Relationship_4')
!Relationship_4.type := #COWORKER
!insert (Alejandro_Rosas, Relationship_4) into ContactToRelationship
!insert (Relationship_4, Dr_Mei_Lin_Chen) into RelationshipToContact

!insert (Relationship_3, Alejandro_Rosas) into RelationshipToContact

!insert (Relationship_1, Dr_Mei_Lin_Chen) into RelationshipToContact

!insert (AddressBook_2, Innovate_Start_up_Co) into AddressBookMadeOfContact
!insert (AddressBook_2, Dr_Mei_Lin_Chen) into AddressBookMadeOfContact
!insert (AddressBook_2, Alejandro_Rosas) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 76 | 0.00% |
| Multiplicities Errors | 0 | 18 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 3 | 4 | 75.00% |

| Invalid Addresses | 
|---| 
```
Baker Street, 15, London
```
```
Nanjing Road West, 67, Shanghai
```
```
Gran Via, 102, Madrid
```

## Category complex
```
!new AddressBook('EastWest_Innovations_Contacts')

!new Person('Akira_Tanaka')
!Akira_Tanaka.name := 'Akira Tanaka'
!Akira_Tanaka.phone := '+81-3-5678-1234'
!Akira_Tanaka.website := 'akiratanaka-dev.jp'
!Akira_Tanaka.email := 'akira.tanaka@eastwest.co.jp'
!Akira_Tanaka.title := 'Lead Developer'

!new Address('Address_Akira_Tanaka')
!Address_Akira_Tanaka.city := 'Tokyo'
!Address_Akira_Tanaka.houseNr := '11'
!Address_Akira_Tanaka.street := 'Shibuya Crossing'
!insert (Akira_Tanaka, Address_Akira_Tanaka) into ContactContainsAddress

!new Note('Note_Akira_Tanaka')
!Note_Akira_Tanaka.author := 'Akira Tanaka'
!Note_Akira_Tanaka.time := Date('2023-07-20')
!Note_Akira_Tanaka.type := #MEETING
!Note_Akira_Tanaka.comment := 'Project kickoff meeting with new American partners.'
!insert (Akira_Tanaka, Note_Akira_Tanaka) into ContactContainsNote

!new Person('Emily_Thompson')
!Emily_Thompson.name := 'Emily Thompson'
!Emily_Thompson.phone := '+44-20-7946-0958'
!Emily_Thompson.website := 'emilythompson-design.com'
!Emily_Thompson.email := 'emily.thompson@eastwest.co.uk'
!Emily_Thompson.title := 'Creative Director'

!new Address('Address_Emily_Thompson')
!Address_Emily_Thompson.city := 'London'
!Address_Emily_Thompson.houseNr := '82'
!Address_Emily_Thompson.street := 'Oxford Street'
!insert (Emily_Thompson, Address_Emily_Thompson) into ContactContainsAddress

!new Note('Note_Emily_Thompson')
!Note_Emily_Thompson.author := 'Emily Thompson'
!Note_Emily_Thompson.time := Date('2023-09-30')
!Note_Emily_Thompson.type := #EMAIL
!Note_Emily_Thompson.comment := 'Sent design drafts and awaiting feedback on branding project.'
!insert (Emily_Thompson, Note_Emily_Thompson) into ContactContainsNote

!new Company('South_Seas_Communications')
!South_Seas_Communications.name := 'South Seas Communications'
!South_Seas_Communications.phone := '+61-7-5674-1234'
!South_Seas_Communications.website := 'southseascomms.au'
!South_Seas_Communications.email := 'contact@southseascomms.au'
!South_Seas_Communications.industry := 'Telecommunications'

!new Address('Address_South_Seas_Communications')
!Address_South_Seas_Communications.city := 'Brisbane'
!Address_South_Seas_Communications.houseNr := '256'
!Address_South_Seas_Communications.street := 'Queen Street'
!insert (South_Seas_Communications, Address_South_Seas_Communications) into ContactContainsAddress

!new Note('Note_South_Seas_Communications')
!Note_South_Seas_Communications.author := 'Managing Director'
!Note_South_Seas_Communications.time := Date('2023-07-10')
!Note_South_Seas_Communications.type := #CALL
!Note_South_Seas_Communications.comment := 'Discussed partnership opportunities in the Asia-Pacific region.'
!insert (South_Seas_Communications, Note_South_Seas_Communications) into ContactContainsNote

!new Company('Alpine_Resort_Group')
!Alpine_Resort_Group.name := 'Alpine Resort Group'
!Alpine_Resort_Group.phone := '+41-22-555-6789'
!Alpine_Resort_Group.website := 'alpineresortgroup.ch'
!Alpine_Resort_Group.email := 'info@alpineresortgroup.ch'
!Alpine_Resort_Group.industry := 'Hospitality'

!new Address('Address_Alpine_Resort_Group')
!Address_Alpine_Resort_Group.city := 'Geneva'
!Address_Alpine_Resort_Group.houseNr := '74'
!Address_Alpine_Resort_Group.street := 'Rue du Rhône'
!insert (Alpine_Resort_Group, Address_Alpine_Resort_Group) into ContactContainsAddress

!new Note('Note_Alpine_Resort_Group')
!Note_Alpine_Resort_Group.author := 'CEO'
!Note_Alpine_Resort_Group.time := Date('2023-08-21')
!Note_Alpine_Resort_Group.type := #MEETING
!Note_Alpine_Resort_Group.comment := 'Reviewed expansion plans for new ski resorts in the Alps.'
!insert (Alpine_Resort_Group, Note_Alpine_Resort_Group) into ContactContainsNote

!new Relationship('Relationship_Emily_to_Akira')
!Relationship_Emily_to_Akira.type := #COWORKER
!insert (Emily_Thompson, Relationship_Emily_to_Akira) into ContactToRelationship
!insert (Relationship_Emily_to_Akira, Akira_Tanaka) into RelationshipToContact

!new Relationship('Relationship_Emily_to_South_Seas')
!Relationship_Emily_to_South_Seas.type := #SUBDIVISION
!insert (Emily_Thompson, Relationship_Emily_to_South_Seas) into ContactToRelationship
!insert (Relationship_Emily_to_South_Seas, South_Seas_Communications) into RelationshipToContact

!new Relationship('Relationship_Akira_to_Alpine')
!Relationship_Akira_to_Alpine.type := #COWORKER
!insert (Akira_Tanaka, Relationship_Akira_to_Alpine) into ContactToRelationship
!insert (Relationship_Akira_to_Alpine, Alpine_Resort_Group) into RelationshipToContact

!insert (EastWest_Innovations_Contacts, Akira_Tanaka) into AddressBookMadeOfContact
!insert (EastWest_Innovations_Contacts, Emily_Thompson) into AddressBookMadeOfContact
!insert (EastWest_Innovations_Contacts, South_Seas_Communications) into AddressBookMadeOfContact
!insert (EastWest_Innovations_Contacts, Alpine_Resort_Group) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 85 | 0.00% |
| Multiplicities Errors | 0 | 18 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 4 | 0.00% |
| Websites | 0 | 4 | 0.00% |
| Emails | 0 | 4 | 0.00% |
| Addresses | 2 | 4 | 50.00% |

| Invalid Addresses | 
|---| 
```
Shibuya Crossing, 11, Tokyo
```
```
Queen Street, 256, Brisbane
```

## Category edge
```
!new AddressBook('Cultural_Exchange_Hub')

!new Company('Global_Cultures_Initiative')
!Global_Cultures_Initiative.name := 'Global Cultures Initiative'
!Global_Cultures_Initiative.phone := '+61 2 8765 4321'
!Global_Cultures_Initiative.website := 'www.globalcultures.org'
!Global_Cultures_Initiative.email := 'info@globalcultures.org'
!Global_Cultures_Initiative.industry := 'Non-Profit'

!new Address('Address_Sydney')
!Address_Sydney.city := 'Sydney'
!Address_Sydney.houseNr := '50'
!Address_Sydney.street := 'Bridge St'
!insert (Global_Cultures_Initiative, Address_Sydney) into ContactContainsAddress

!new Address('Address_Tokyo')
!Address_Tokyo.city := 'Tokyo'
!Address_Tokyo.houseNr := '15'
!Address_Tokyo.street := 'Sakura Avenue'
!insert (Global_Cultures_Initiative, Address_Tokyo) into ContactContainsAddress

!new Note('Note_1_Global_Cultures')
!Note_1_Global_Cultures.author := 'Hiro Tanaka'
!Note_1_Global_Cultures.time := Date('2023-07-10')
!Note_1_Global_Cultures.type := #MEETING
!Note_1_Global_Cultures.comment := 'Planning an art exchange program across Australia and Japan.'
!insert (Global_Cultures_Initiative, Note_1_Global_Cultures) into ContactContainsNote

!new Note('Note_2_Global_Cultures')
!Note_2_Global_Cultures.author := 'Aisha Patel'
!Note_2_Global_Cultures.time := Date('2023-08-22')
!Note_2_Global_Cultures.type := #CALL
!Note_2_Global_Cultures.comment := 'Visa arrangements for cultural delegates.'
!insert (Global_Cultures_Initiative, Note_2_Global_Cultures) into ContactContainsNote

!new Company('Arte_de_la_Tierra')
!Arte_de_la_Tierra.name := 'Arte de la Tierra'
!Arte_de_la_Tierra.phone := '+52 55 1234 5678'
!Arte_de_la_Tierra.website := 'www.artedelatierra.mx'
!Arte_de_la_Tierra.email := 'contacto@artedelatierra.mx'
!Arte_de_la_Tierra.industry := 'Arts and Culture'

!new Address('Address_Mexico_City')
!Address_Mexico_City.city := 'Mexico City'
!Address_Mexico_City.houseNr := '200'
!Address_Mexico_City.street := 'Paseo de la Reforma'
!insert (Arte_de_la_Tierra, Address_Mexico_City) into ContactContainsAddress

!new Note('Note_Arte_de_la_Tierra')
!Note_Arte_de_la_Tierra.author := 'Carlos Mendez'
!Note_Arte_de_la_Tierra.time := Date('2023-08-15')
!Note_Arte_de_la_Tierra.type := #EMAIL
!Note_Arte_de_la_Tierra.comment := 'Interested in the Global Cultures Initiative\'s art program.'
!insert (Arte_de_la_Tierra, Note_Arte_de_la_Tierra) into ContactContainsNote

!new Person('Zara_Khan')
!Zara_Khan.name := 'Zara Khan'
!Zara_Khan.phone := '+1 202 555 0199'
!Zara_Khan.website := 'www.zarakhan.org'
!Zara_Khan.email := 'zara.khan@globalcultures.org'
!Zara_Khan.title := 'Ambassador of Cultural Integration'

!new Address('Address_Washington_DC')
!Address_Washington_DC.city := 'Washington, D.C.'
!Address_Washington_DC.houseNr := '1501'
!Address_Washington_DC.street := 'Constitution Ave NW'
!insert (Zara_Khan, Address_Washington_DC) into ContactContainsAddress

!new Note('Note_1_Zara_Khan')
!Note_1_Zara_Khan.author := 'Zara Khan'
!Note_1_Zara_Khan.time := Date('2023-09-05')
!Note_1_Zara_Khan.type := #EMAIL
!Note_1_Zara_Khan.comment := 'Drafting a policy document on cultural exchange policies.'
!insert (Zara_Khan, Note_1_Zara_Khan) into ContactContainsNote

!new Note('Note_2_Zara_Khan')
!Note_2_Zara_Khan.author := 'Hiro Tanaka'
!Note_2_Zara_Khan.time := Date('2023-09-20')
!Note_2_Zara_Khan.type := #MEETING
!Note_2_Zara_Khan.comment := 'Discuss cross-continental workshops for artists.'
!insert (Zara_Khan, Note_2_Zara_Khan) into ContactContainsNote

!new Relationship('Relationship_Global_to_Arte')
!Relationship_Global_to_Arte.type := #SUBDIVISION
!insert (Global_Cultures_Initiative, Relationship_Global_to_Arte) into ContactToRelationship
!insert (Relationship_Global_to_Arte, Arte_de_la_Tierra) into RelationshipToContact

!new Relationship('Relationship_Global_to_Zara')
!Relationship_Global_to_Zara.type := #EMPLOYEE
!insert (Global_Cultures_Initiative, Relationship_Global_to_Zara) into ContactToRelationship
!insert (Relationship_Global_to_Zara, Zara_Khan) into RelationshipToContact

!new Relationship('Relationship_Arte_to_Zara')
!Relationship_Arte_to_Zara.type := #COWORKER
!insert (Arte_de_la_Tierra, Relationship_Arte_to_Zara) into ContactToRelationship
!insert (Relationship_Arte_to_Zara, Zara_Khan) into RelationshipToContact

!insert (Cultural_Exchange_Hub, Global_Cultures_Initiative) into AddressBookMadeOfContact
!insert (Cultural_Exchange_Hub, Arte_de_la_Tierra) into AddressBookMadeOfContact
!insert (Cultural_Exchange_Hub, Zara_Khan) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 84 | 0.00% |
| Multiplicities Errors | 0 | 18 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 2 | 4 | 50.00% |

| Invalid Addresses | 
|---| 
```
Paseo de la Reforma, 200, Mexico City
```
```
Sakura Avenue, 15, Tokyo
```

## Category invalid
```
!new AddressBook('New_York_Startup_Network')

!new Company('Hudson_Ventures')
!Hudson_Ventures.name := 'Hudson Ventures'
!Hudson_Ventures.phone := '+1-212-555-0199'
!Hudson_Ventures.website := 'www.hudsonventures.com'
!Hudson_Ventures.email := 'outreach@hudsonventures.com'
!Hudson_Ventures.industry := 'Venture Capital'

!new Address('Address_Hudson_Ventures')
!Address_Hudson_Ventures.city := 'New York'
!Address_Hudson_Ventures.houseNr := '45'
!Address_Hudson_Ventures.street := 'Wall St'
!insert (Hudson_Ventures, Address_Hudson_Ventures) into ContactContainsAddress

!new Note('Note_Hudson_Ventures')
!Note_Hudson_Ventures.author := 'Emily Brighton'
!Note_Hudson_Ventures.time := Date('2023-10-02 11:00')
!Note_Hudson_Ventures.type := #EMAIL
!Note_Hudson_Ventures.comment := 'Sent proposal details to potential investors.'
!insert (Hudson_Ventures, Note_Hudson_Ventures) into ContactContainsNote

!new Relationship('Relationship_Hudson_to_Jordan')
!Relationship_Hudson_to_Jordan.type := #BOSS
!insert (Hudson_Ventures, Relationship_Hudson_to_Jordan) into ContactToRelationship

!new Person('Jordan_Lewis')
!Jordan_Lewis.name := 'Jordan Lewis'
!Jordan_Lewis.phone := '+1-646-555-0202'
!Jordan_Lewis.website := 'www.jordanlewisentrepreneur.com'
!Jordan_Lewis.email := 'jordan@hudsonventures.com'
!Jordan_Lewis.title := 'Investment Analyst'

!new Address('Address_Jordan_NY')
!Address_Jordan_NY.city := 'New York'
!Address_Jordan_NY.houseNr := '200'
!Address_Jordan_NY.street := 'Broadway'
!insert (Jordan_Lewis, Address_Jordan_NY) into ContactContainsAddress

!new Address('Address_Jordan_Brooklyn')
!Address_Jordan_Brooklyn.city := 'Brooklyn'
!Address_Jordan_Brooklyn.houseNr := '330'
!Address_Jordan_Brooklyn.street := 'Bedford Ave'
!insert (Jordan_Lewis, Address_Jordan_Brooklyn) into ContactContainsAddress

!new Note('Note_Jordan_1')
!Note_Jordan_1.author := 'Jordan Lewis'
!Note_Jordan_1.time := Date('2023-09-30 09:30')
!Note_Jordan_1.type := #MEETING
!Note_Jordan_1.comment := 'Strategic planning session for startup incubator programs.'
!insert (Jordan_Lewis, Note_Jordan_1) into ContactContainsNote

!new Note('Note_Jordan_2')
!Note_Jordan_2.author := 'Jordan Lewis'
!Note_Jordan_2.time := Date('2023-10-01 14:00')
!Note_Jordan_2.type := #CALL
!Note_Jordan_2.comment := 'Phone call with an emerging tech startup CEO.'
!insert (Jordan_Lewis, Note_Jordan_2) into ContactContainsNote

!insert (Relationship_Hudson_to_Jordan, Jordan_Lewis) into RelationshipToContact

!new Company('InnovateX_Labs')
!InnovateX_Labs.name := 'InnovateX Labs'
!InnovateX_Labs.phone := '+1-917-555-0111'
!InnovateX_Labs.website := 'www.innovatexlabs.com'
!InnovateX_Labs.email := 'contact@innovatexlabs.com'
!InnovateX_Labs.industry := 'Technology Incubation'

!new Address('Address_InnovateX_Labs')
!Address_InnovateX_Labs.city := 'New York'
!Address_InnovateX_Labs.houseNr := '600'
!Address_InnovateX_Labs.street := 'Fifth Ave'
!insert (InnovateX_Labs, Address_InnovateX_Labs) into ContactContainsAddress

!new Note('Note_InnovateX')
!Note_InnovateX.author := 'Lisa Chang'
!Note_InnovateX.time := Date('2023-09-28 16:45')
!Note_InnovateX.type := #CALL
!Note_InnovateX.comment := 'Discussed potential collaboration with Hudson Ventures.'
!insert (InnovateX_Labs, Note_InnovateX) into ContactContainsNote

!new Relationship('Relationship_InnovateX_to_Hudson')
!Relationship_InnovateX_to_Hudson.type := #COWORKER
!insert (InnovateX_Labs, Relationship_InnovateX_to_Hudson) into ContactToRelationship
!insert (Relationship_InnovateX_to_Hudson, Hudson_Ventures) into RelationshipToContact

!insert (New_York_Startup_Network, Hudson_Ventures) into AddressBookMadeOfContact
!insert (New_York_Startup_Network, Jordan_Lewis) into AddressBookMadeOfContact
!insert (New_York_Startup_Network, InnovateX_Labs) into AddressBookMadeOfContact
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 15 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 0 | 4 | 0.00% |

## Generation 2 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 382 | 0.00% |
| Multiplicities Errors | 0 | 67 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 15 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 16 | 0.00% |
| Websites | 0 | 16 | 0.00% |
| Emails | 0 | 16 | 0.00% |
| Addresses | 10 | 19 | 52.63% |

| Invalid Addresses | 
|---| 
```
Collins Street, 250, Melbourne
```
```
Shinjuku-dori, 1120, Tokyo
```
```
Avenida Reforma, 789, Mexico City
```
```
Baker Street, 15, London
```
```
Nanjing Road West, 67, Shanghai
```
```
Gran Via, 102, Madrid
```
```
Shibuya Crossing, 11, Tokyo
```
```
Queen Street, 256, Brisbane
```
```
Paseo de la Reforma, 200, Mexico City
```
```
Sakura Avenue, 15, Tokyo
```

# Generation 3
## Category baseline
```
!new AddressBook('AddressBook_3')

!new Person('Amina_Hassan')
!Amina_Hassan.name := 'Amina Hassan'
!Amina_Hassan.phone := '+1-202-555-0144'
!Amina_Hassan.website := 'ahassanresearch.org'
!Amina_Hassan.email := 'amina.hassan@university.edu'
!Amina_Hassan.title := 'Professor of Environmental Science'

!new Address('Address_7')
!Address_7.city := 'Washington D.C.'
!Address_7.houseNr := '1600'
!Address_7.street := 'Constitution Avenue'
!insert (Amina_Hassan, Address_7) into ContactContainsAddress

!new Note('Note_7')
!Note_7.author := 'Amina Hassan'
!Note_7.time := Date('2023-07-10')
!Note_7.type := #CALL
!Note_7.comment := 'Discussed funding opportunities with the department head.'
!insert (Amina_Hassan, Note_7) into ContactContainsNote

!new Company('GreenTech_Solutions')
!GreenTech_Solutions.name := 'GreenTech Solutions'
!GreenTech_Solutions.phone := '+31-20-555-7890'
!GreenTech_Solutions.website := 'www.greentechsolutions.nl'
!GreenTech_Solutions.email := 'contact@greentechsolutions.nl'
!GreenTech_Solutions.industry := 'Renewable Energy'

!new Address('Address_8')
!Address_8.city := 'Amsterdam'
!Address_8.houseNr := '508'
!Address_8.street := 'Keizersgracht'
!insert (GreenTech_Solutions, Address_8) into ContactContainsAddress

!new Note('Note_8')
!Note_8.author := 'Eleanor Fields'
!Note_8.time := Date('2023-08-15')
!Note_8.type := #MEETING
!Note_8.comment := 'Strategy meeting to enhance solar panel efficiency.'
!insert (GreenTech_Solutions, Note_8) into ContactContainsNote

!new Person('Ravi_Patel')
!Ravi_Patel.name := 'Ravi Patel'
!Ravi_Patel.phone := '+91-98-7654-3210'
!Ravi_Patel.website := 'ravipatelfinance.com'
!Ravi_Patel.email := 'ravi@finadvisors.in'
!Ravi_Patel.title := 'Financial Consultant'

!new Address('Address_9')
!Address_9.city := 'Mumbai'
!Address_9.houseNr := '101'
!Address_9.street := 'Marine Drive'
!insert (Ravi_Patel, Address_9) into ContactContainsAddress

!new Note('Note_9')
!Note_9.author := 'Ravi Patel'
!Note_9.time := Date('2023-09-25')
!Note_9.type := #EMAIL
!Note_9.comment := 'Sent investment strategy proposal to potential clients.'
!insert (Ravi_Patel, Note_9) into ContactContainsNote

!new Relationship('Relationship_6')
!Relationship_6.type := #COWORKER
!insert (Ravi_Patel, Relationship_6) into ContactToRelationship
!insert (Relationship_6, Amina_Hassan) into RelationshipToContact

!new Relationship('Relationship_7')
!Relationship_7.type := #COWORKER
!insert (Ravi_Patel, Relationship_7) into ContactToRelationship
!insert (Relationship_7, GreenTech_Solutions) into RelationshipToContact

!insert (AddressBook_3, Amina_Hassan) into AddressBookMadeOfContact
!insert (AddressBook_3, GreenTech_Solutions) into AddressBookMadeOfContact
!insert (AddressBook_3, Ravi_Patel) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 63 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 2 | 3 | 66.67% |

| Invalid Addresses | 
|---| 
```
Marine Drive, 101, Mumbai
```
```
Constitution Avenue, 1600, Washington D.C.
```

## Category boundary
```
!new AddressBook('AddressBook_3')

!new Company('GreenLeaf_Publishing_House')
!GreenLeaf_Publishing_House.name := 'GreenLeaf Publishing House'
!GreenLeaf_Publishing_House.phone := '+91-22-4091-1560'
!GreenLeaf_Publishing_House.website := 'www.greenleafindia.com'
!GreenLeaf_Publishing_House.email := 'contact@greenleafindia.com'
!GreenLeaf_Publishing_House.industry := 'Publishing'

!new Address('Address_1')
!Address_1.city := 'Mumbai'
!Address_1.houseNr := '88'
!Address_1.street := 'Marine Drive'
!insert (GreenLeaf_Publishing_House, Address_1) into ContactContainsAddress

!new Note('Note_1')
!Note_1.author := 'Kavita Sharma'
!Note_1.time := Date('2023-07-10')
!Note_1.type := #CALL
!Note_1.comment := 'Discuss book launch event details.'
!insert (GreenLeaf_Publishing_House, Note_1) into ContactContainsNote

!new Relationship('Relationship_1')
!Relationship_1.type := #SUBDIVISION
!insert (GreenLeaf_Publishing_House, Relationship_1) into ContactToRelationship

!new Person('Professor_Erik_Svalberg')
!Professor_Erik_Svalberg.name := 'Professor Erik Svalberg'
!Professor_Erik_Svalberg.phone := '+46-8-5592-8450'
!Professor_Erik_Svalberg.website := 'www.eriksvalbergresearch.se'
!Professor_Erik_Svalberg.email := 'erik.svalberg@uniuppsala.se'
!Professor_Erik_Svalberg.title := 'Professor of Linguistics'

!new Address('Address_2')
!Address_2.city := 'Uppsala'
!Address_2.houseNr := '17'
!Address_2.street := 'Stora Torget'
!insert (Professor_Erik_Svalberg, Address_2) into ContactContainsAddress

!new Note('Note_2')
!Note_2.author := 'Johan Lindgren'
!Note_2.time := Date('2023-06-20')
!Note_2.type := #EMAIL
!Note_2.comment := 'Received feedback on linguistic research paper.'
!insert (Professor_Erik_Svalberg, Note_2) into ContactContainsNote

!new Relationship('Relationship_2')
!Relationship_2.type := #COWORKER
!insert (Professor_Erik_Svalberg, Relationship_2) into ContactToRelationship

!new Person('Dr_Fatima_Abbas')
!Dr_Fatima_Abbas.name := 'Dr. Fatima Abbas'
!Dr_Fatima_Abbas.phone := '+966-12-6600-4789'
!Dr_Fatima_Abbas.website := 'www.fatimaabbasedu.org'
!Dr_Fatima_Abbas.email := 'fatima.abbas@kinguniversities.sa'
!Dr_Fatima_Abbas.title := 'Research Fellow'

!new Address('Address_3')
!Address_3.city := 'Riyadh'
!Address_3.houseNr := '230'
!Address_3.street := 'Olaya Street'
!insert (Dr_Fatima_Abbas, Address_3) into ContactContainsAddress

!new Note('Note_3')
!Note_3.author := 'Ahmed Al-Mousa'
!Note_3.time := Date('2023-09-12')
!Note_3.type := #MEETING
!Note_3.comment := 'Collaboration on artificial intelligence project.'
!insert (Dr_Fatima_Abbas, Note_3) into ContactContainsNote

!new Relationship('Relationship_3')
!Relationship_3.type := #COWORKER
!insert (Dr_Fatima_Abbas, Relationship_3) into ContactToRelationship
!insert (Relationship_3, Professor_Erik_Svalberg) into RelationshipToContact

!insert (Relationship_2, Dr_Fatima_Abbas) into RelationshipToContact
!insert (Relationship_1, Professor_Erik_Svalberg) into RelationshipToContact

!insert (AddressBook_3, GreenLeaf_Publishing_House) into AddressBookMadeOfContact
!insert (AddressBook_3, Professor_Erik_Svalberg) into AddressBookMadeOfContact
!insert (AddressBook_3, Dr_Fatima_Abbas) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 67 | 0.00% |
| Multiplicities Errors | 0 | 15 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 3 | 3 | 100.00% |

| Invalid Addresses | 
|---| 
```
Marine Drive, 88, Mumbai
```
```
Stora Torget, 17, Uppsala
```
```
Olaya Street, 230, Riyadh
```

## Category complex
```
!new AddressBook('Oceanic_Ventures_Connections')

!new Person('Aisha_Al_Zein')
!Aisha_Al_Zein.name := 'Aisha Al Zein'
!Aisha_Al_Zein.phone := '+971-4-355-9876'
!Aisha_Al_Zein.website := 'aishaalzeinconsults.ae'
!Aisha_Al_Zein.email := 'aisha.alzein@oceanicventures.ae'
!Aisha_Al_Zein.title := 'Chief Financial Officer'

!new Address('Address_Aisha_Al_Zein')
!Address_Aisha_Al_Zein.city := 'Dubai'
!Address_Aisha_Al_Zein.houseNr := '45'
!Address_Aisha_Al_Zein.street := 'Sheikh Zayed Road'
!insert (Aisha_Al_Zein, Address_Aisha_Al_Zein) into ContactContainsAddress

!new Note('Note_Aisha_Al_Zein')
!Note_Aisha_Al_Zein.author := 'Aisha Al Zein'
!Note_Aisha_Al_Zein.time := Date('2023-06-18')
!Note_Aisha_Al_Zein.type := #EMAIL
!Note_Aisha_Al_Zein.comment := 'Sent quarterly financial reports to executive team.'
!insert (Aisha_Al_Zein, Note_Aisha_Al_Zein) into ContactContainsNote

!new Company('Amazonas_Eco_Tours')
!Amazonas_Eco_Tours.name := 'Amazonas Eco Tours'
!Amazonas_Eco_Tours.phone := '+55-92-3312-4789'
!Amazonas_Eco_Tours.website := 'amazonasecotours.brazil'
!Amazonas_Eco_Tours.email := 'booking@amazonasecotours.brazil'
!Amazonas_Eco_Tours.industry := 'Tourism and Eco Travel'

!new Address('Address_Amazonas_Eco_Tours')
!Address_Amazonas_Eco_Tours.city := 'Manaus'
!Address_Amazonas_Eco_Tours.houseNr := '81'
!Address_Amazonas_Eco_Tours.street := 'Avenida Eduardo Ribeiro'
!insert (Amazonas_Eco_Tours, Address_Amazonas_Eco_Tours) into ContactContainsAddress

!new Note('Note_Amazonas_Eco_Tours')
!Note_Amazonas_Eco_Tours.author := 'Operations Manager'
!Note_Amazonas_Eco_Tours.time := Date('2023-09-25')
!Note_Amazonas_Eco_Tours.type := #MEETING
!Note_Amazonas_Eco_Tours.comment := 'Planning itinerary setups for eco-friendly tourism packages.'
!insert (Amazonas_Eco_Tours, Note_Amazonas_Eco_Tours) into ContactContainsNote

!new Person('Liam_O_Connor')
!Liam_O_Connor.name := 'Liam O\'Connor'
!Liam_O_Connor.phone := '+353-1-555-9908'
!Liam_O_Connor.website := 'liamoconnorsolutions.ie'
!Liam_O_Connor.email := 'liam.oconnor@oceanicventures.ie'
!Liam_O_Connor.title := 'Sustainability Advisor'

!new Address('Address_Liam_O_Connor')
!Address_Liam_O_Connor.city := 'Dublin'
!Address_Liam_O_Connor.houseNr := '12'
!Address_Liam_O_Connor.street := 'St Stephen\'s Green'
!insert (Liam_O_Connor, Address_Liam_O_Connor) into ContactContainsAddress

!new Note('Note_Liam_O_Connor')
!Note_Liam_O_Connor.author := 'Liam O\'Connor'
!Note_Liam_O_Connor.time := Date('2023-10-12')
!Note_Liam_O_Connor.type := #CALL
!Note_Liam_O_Connor.comment := 'Consultation call with environmental NGOs about sustainable practices.'
!insert (Liam_O_Connor, Note_Liam_O_Connor) into ContactContainsNote

!new Company('Pacifica_Marine_Innovations')
!Pacifica_Marine_Innovations.name := 'Pacifica Marine Innovations'
!Pacifica_Marine_Innovations.phone := '+61-2-8897-6534'
!Pacifica_Marine_Innovations.website := 'pacificamarine.com.au'
!Pacifica_Marine_Innovations.email := 'innovations@pacificamarine.com.au'
!Pacifica_Marine_Innovations.industry := 'Marine Biotechnology'

!new Address('Address_Pacifica_Marine_Innovations')
!Address_Pacifica_Marine_Innovations.city := 'Sydney'
!Address_Pacifica_Marine_Innovations.houseNr := '223'
!Address_Pacifica_Marine_Innovations.street := 'Darling Harbour'
!insert (Pacifica_Marine_Innovations, Address_Pacifica_Marine_Innovations) into ContactContainsAddress

!new Note('Note_Pacifica_Marine_Innovations')
!Note_Pacifica_Marine_Innovations.author := 'Chief Scientist'
!Note_Pacifica_Marine_Innovations.time := Date('2023-08-05')
!Note_Pacifica_Marine_Innovations.type := #MEETING
!Note_Pacifica_Marine_Innovations.comment := 'Discussed collaboration on marine preservation technology.'
!insert (Pacifica_Marine_Innovations, Note_Pacifica_Marine_Innovations) into ContactContainsNote

!new Relationship('Relationship_Aisha_to_Liam')
!Relationship_Aisha_to_Liam.type := #EMPLOYEE
!insert (Aisha_Al_Zein, Relationship_Aisha_to_Liam) into ContactToRelationship
!insert (Relationship_Aisha_to_Liam, Liam_O_Connor) into RelationshipToContact

!new Relationship('Relationship_Liam_to_Amazonas')
!Relationship_Liam_to_Amazonas.type := #COWORKER
!insert (Liam_O_Connor, Relationship_Liam_to_Amazonas) into ContactToRelationship
!insert (Relationship_Liam_to_Amazonas, Amazonas_Eco_Tours) into RelationshipToContact

!new Relationship('Relationship_Aisha_to_Pacifica')
!Relationship_Aisha_to_Pacifica.type := #BOSS
!insert (Aisha_Al_Zein, Relationship_Aisha_to_Pacifica) into ContactToRelationship
!insert (Relationship_Aisha_to_Pacifica, Pacifica_Marine_Innovations) into RelationshipToContact

!insert (Oceanic_Ventures_Connections, Aisha_Al_Zein) into AddressBookMadeOfContact
!insert (Oceanic_Ventures_Connections, Amazonas_Eco_Tours) into AddressBookMadeOfContact
!insert (Oceanic_Ventures_Connections, Liam_O_Connor) into AddressBookMadeOfContact
!insert (Oceanic_Ventures_Connections, Pacifica_Marine_Innovations) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 85 | 0.00% |
| Multiplicities Errors | 0 | 18 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 4 | 0.00% |
| Websites | 0 | 4 | 0.00% |
| Emails | 0 | 4 | 0.00% |
| Addresses | 3 | 4 | 75.00% |

| Invalid Addresses | 
|---| 
```
Darling Harbour, 223, Sydney
```
```
Avenida Eduardo Ribeiro, 81, Manaus
```
```
Sheikh Zayed Road, 45, Dubai
```

## Category edge
```
!new AddressBook('Education_Exchange_Program')

!new Company('Oxford_International_University')
!Oxford_International_University.name := 'Oxford International University'
!Oxford_International_University.phone := '+44 1865 270000'
!Oxford_International_University.website := 'www.oxfordintuni.edu'
!Oxford_International_University.email := 'contact@oxfordintuni.edu'
!Oxford_International_University.industry := 'Higher Education'

!new Address('Address_Oxford')
!Address_Oxford.city := 'Oxford'
!Address_Oxford.houseNr := '1'
!Address_Oxford.street := 'High Street'
!insert (Oxford_International_University, Address_Oxford) into ContactContainsAddress

!new Address('Address_Dubai')
!Address_Dubai.city := 'Dubai'
!Address_Dubai.houseNr := '45'
!Address_Dubai.street := 'Education City'
!insert (Oxford_International_University, Address_Dubai) into ContactContainsAddress

!new Note('Note_1_Oxford_International_University')
!Note_1_Oxford_International_University.author := 'Dr. Emily Watson'
!Note_1_Oxford_International_University.time := Date('2023-07-12')
!Note_1_Oxford_International_University.type := #EMAIL
!Note_1_Oxford_International_University.comment := 'Discuss collaborations for international student exchange.'
!insert (Oxford_International_University, Note_1_Oxford_International_University) into ContactContainsNote

!new Note('Note_2_Oxford_International_University')
!Note_2_Oxford_International_University.author := 'Ali Hussain'
!Note_2_Oxford_International_University.time := Date('2023-09-05')
!Note_2_Oxford_International_University.type := #CALL
!Note_2_Oxford_International_University.comment := 'Details of the scholarship program for the new academic year.'
!insert (Oxford_International_University, Note_2_Oxford_International_University) into ContactContainsNote

!new Company('Shanghai_High_School_of_Arts')
!Shanghai_High_School_of_Arts.name := 'Shanghai High School of Arts'
!Shanghai_High_School_of_Arts.phone := '+86 21 6789 1011'
!Shanghai_High_School_of_Arts.website := 'www.shanghaiarts.edu.cn'
!Shanghai_High_School_of_Arts.email := 'info@shanghaiarts.edu.cn'
!Shanghai_High_School_of_Arts.industry := 'Secondary Education'

!new Address('Address_Shanghai')
!Address_Shanghai.city := 'Shanghai'
!Address_Shanghai.houseNr := '128'
!Address_Shanghai.street := 'Future Avenue'
!insert (Shanghai_High_School_of_Arts, Address_Shanghai) into ContactContainsAddress

!new Note('Note_Shanghai_High_School_of_Arts')
!Note_Shanghai_High_School_of_Arts.author := 'Liu Chen'
!Note_Shanghai_High_School_of_Arts.time := Date('2023-08-10')
!Note_Shanghai_High_School_of_Arts.type := #MEETING
!Note_Shanghai_High_School_of_Arts.comment := 'Organizing a joint cultural festival with Oxford International University.'
!insert (Shanghai_High_School_of_Arts, Note_Shanghai_High_School_of_Arts) into ContactContainsNote

!new Person('Federico_Gillespie')
!Federico_Gillespie.name := 'Federico Gillespie'
!Federico_Gillespie.phone := '+54 11 2345 6789'
!Federico_Gillespie.website := 'www.federicogillespie.com'
!Federico_Gillespie.email := 'federico.gillespie@oxfordintuni.edu'
!Federico_Gillespie.title := 'Coordinator of International Partnerships'

!new Address('Address_Buenos_Aires')
!Address_Buenos_Aires.city := 'Buenos Aires'
!Address_Buenos_Aires.houseNr := '230'
!Address_Buenos_Aires.street := 'Knowledge Lane'
!insert (Federico_Gillespie, Address_Buenos_Aires) into ContactContainsAddress

!new Address('Address_Oxford_Coordinator')
!Address_Oxford_Coordinator.city := 'Oxford'
!Address_Oxford_Coordinator.houseNr := '2'
!Address_Oxford_Coordinator.street := 'Scholar\'s Ct'
!insert (Federico_Gillespie, Address_Oxford_Coordinator) into ContactContainsAddress

!new Note('Note_1_Federico_Gillespie')
!Note_1_Federico_Gillespie.author := 'Federico Gillespie'
!Note_1_Federico_Gillespie.time := Date('2023-08-20')
!Note_1_Federico_Gillespie.type := #EMAIL
!Note_1_Federico_Gillespie.comment := 'Proposal for curriculum alignment between partner institutions.'
!insert (Federico_Gillespie, Note_1_Federico_Gillespie) into ContactContainsNote

!new Note('Note_2_Federico_Gillespie')
!Note_2_Federico_Gillespie.author := 'Liu Chen'
!Note_2_Federico_Gillespie.time := Date('2023-09-15')
!Note_2_Federico_Gillespie.type := #MEETING
!Note_2_Federico_Gillespie.comment := 'Competency framework for exchange students discussed.'
!insert (Federico_Gillespie, Note_2_Federico_Gillespie) into ContactContainsNote

!new Relationship('Relationship_Oxford_to_Shanghai')
!Relationship_Oxford_to_Shanghai.type := #SUBDIVISION
!insert (Oxford_International_University, Relationship_Oxford_to_Shanghai) into ContactToRelationship
!insert (Relationship_Oxford_to_Shanghai, Shanghai_High_School_of_Arts) into RelationshipToContact

!new Relationship('Relationship_Oxford_to_Federico')
!Relationship_Oxford_to_Federico.type := #EMPLOYEE
!insert (Oxford_International_University, Relationship_Oxford_to_Federico) into ContactToRelationship
!insert (Relationship_Oxford_to_Federico, Federico_Gillespie) into RelationshipToContact

!new Relationship('Relationship_Shanghai_to_Federico')
!Relationship_Shanghai_to_Federico.type := #COWORKER
!insert (Shanghai_High_School_of_Arts, Relationship_Shanghai_to_Federico) into ContactToRelationship
!insert (Relationship_Shanghai_to_Federico, Federico_Gillespie) into RelationshipToContact

!insert (Education_Exchange_Program, Oxford_International_University) into AddressBookMadeOfContact
!insert (Education_Exchange_Program, Shanghai_High_School_of_Arts) into AddressBookMadeOfContact
!insert (Education_Exchange_Program, Federico_Gillespie) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 89 | 0.00% |
| Multiplicities Errors | 0 | 19 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 4 | 5 | 80.00% |

| Invalid Addresses | 
|---| 
```
Education City, 45, Dubai
```
```
Scholar\s Ct, 2, Oxford
```
```
Future Avenue, 128, Shanghai
```
```
Knowledge Lane, 230, Buenos Aires
```

## Category invalid
```
!new AddressBook('European_Creative_Arts_Directory')

!new Person('Sophie_Duval')
!Sophie_Duval.name := 'Sophie Duval'
!Sophie_Duval.phone := '+33-1-2345-6789'
!Sophie_Duval.website := 'www.sophieduvalartist.com'
!Sophie_Duval.email := 'contact@sophieduvaldesign.com'
!Sophie_Duval.title := 'Graphic Designer'

!new Address('Address_Sophie_Duval')
!Address_Sophie_Duval.city := 'Paris'
!Address_Sophie_Duval.houseNr := '101'
!Address_Sophie_Duval.street := 'Rue de Rivoli'
!insert (Sophie_Duval, Address_Sophie_Duval) into ContactContainsAddress

!new Company('Barcelona_Art_Guild')
!Barcelona_Art_Guild.name := 'Barcelona Art Guild'
!Barcelona_Art_Guild.phone := '+34-93-123-4567'
!Barcelona_Art_Guild.website := 'www.barcelonaartguild.es'
!Barcelona_Art_Guild.email := 'info@barcelonaartguild.es'
!Barcelona_Art_Guild.industry := 'Visual Arts'

!new Address('Address_Barcelona_Art_Guild')
!Address_Barcelona_Art_Guild.city := 'Barcelona'
!Address_Barcelona_Art_Guild.houseNr := '250'
!Address_Barcelona_Art_Guild.street := 'Carrer de Mallorca'
!insert (Barcelona_Art_Guild, Address_Barcelona_Art_Guild) into ContactContainsAddress

!new Note('Note_Barcelona_Art_Guild')
!Note_Barcelona_Art_Guild.author := 'Carlos Ramirez'
!Note_Barcelona_Art_Guild.time := Date('2023-09-14 10:00')
!Note_Barcelona_Art_Guild.type := #MEETING
!Note_Barcelona_Art_Guild.comment := 'Organized an exhibition featuring European artists.'
!insert (Barcelona_Art_Guild, Note_Barcelona_Art_Guild) into ContactContainsNote

!new Relationship('Relationship_Sophie_to_Barcelona_Art_Guild')
!Relationship_Sophie_to_Barcelona_Art_Guild.type := #COWORKER
!insert (Sophie_Duval, Relationship_Sophie_to_Barcelona_Art_Guild) into ContactToRelationship
!insert (Relationship_Sophie_to_Barcelona_Art_Guild, Barcelona_Art_Guild) into RelationshipToContact

!new Company('Amsterdam_Arts_Academy')
!Amsterdam_Arts_Academy.name := 'Amsterdam Arts Academy'
!Amsterdam_Arts_Academy.phone := '+31-20-123-4567'
!Amsterdam_Arts_Academy.website := 'www.amsterdamartsacademy.nl'
!Amsterdam_Arts_Academy.email := 'admin@amsterdamartsacademy.nl'
!Amsterdam_Arts_Academy.industry := 'Arts Education'

!new Address('Address_Amsterdam_Arts_Academy')
!Address_Amsterdam_Arts_Academy.city := 'Amsterdam'
!Address_Amsterdam_Arts_Academy.houseNr := '456'
!Address_Amsterdam_Arts_Academy.street := 'Keizersgracht'
!insert (Amsterdam_Arts_Academy, Address_Amsterdam_Arts_Academy) into ContactContainsAddress

!new Note('Note_Amsterdam_Arts_Academy')
!Note_Amsterdam_Arts_Academy.author := 'Marieke de Vries'
!Note_Amsterdam_Arts_Academy.time := Date('2023-09-25 13:30')
!Note_Amsterdam_Arts_Academy.type := #EMAIL
!Note_Amsterdam_Arts_Academy.comment := 'Sent out invitations for upcoming workshops to participating artists.'
!insert (Amsterdam_Arts_Academy, Note_Amsterdam_Arts_Academy) into ContactContainsNote

!new Relationship('Relationship_Barcelona_Art_Guild_to_Amsterdam_Arts_Academy')
!Relationship_Barcelona_Art_Guild_to_Amsterdam_Arts_Academy.type := #SUBDIVISION
!insert (Barcelona_Art_Guild, Relationship_Barcelona_Art_Guild_to_Amsterdam_Arts_Academy) into ContactToRelationship
!insert (Relationship_Barcelona_Art_Guild_to_Amsterdam_Arts_Academy, Amsterdam_Arts_Academy) into RelationshipToContact

!new Relationship('Relationship_Amsterdam_Arts_Academy_to_Sophie')
!Relationship_Amsterdam_Arts_Academy_to_Sophie.type := #BOSS
!insert (Amsterdam_Arts_Academy, Relationship_Amsterdam_Arts_Academy_to_Sophie) into ContactToRelationship
!insert (Relationship_Amsterdam_Arts_Academy_to_Sophie, Sophie_Duval) into RelationshipToContact

!insert (European_Creative_Arts_Directory, Sophie_Duval) into AddressBookMadeOfContact
!insert (European_Creative_Arts_Directory, Barcelona_Art_Guild) into AddressBookMadeOfContact
!insert (European_Creative_Arts_Directory, Amsterdam_Arts_Academy) into AddressBookMadeOfContact
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 14 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 0 | 3 | 0.00% |

## Generation 3 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 365 | 0.00% |
| Multiplicities Errors | 0 | 65 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 14 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 16 | 0.00% |
| Websites | 0 | 16 | 0.00% |
| Emails | 0 | 16 | 0.00% |
| Addresses | 12 | 18 | 66.67% |

| Invalid Addresses | 
|---| 
```
Marine Drive, 101, Mumbai
```
```
Constitution Avenue, 1600, Washington D.C.
```
```
Marine Drive, 88, Mumbai
```
```
Stora Torget, 17, Uppsala
```
```
Olaya Street, 230, Riyadh
```
```
Darling Harbour, 223, Sydney
```
```
Avenida Eduardo Ribeiro, 81, Manaus
```
```
Sheikh Zayed Road, 45, Dubai
```
```
Education City, 45, Dubai
```
```
Scholar\s Ct, 2, Oxford
```
```
Future Avenue, 128, Shanghai
```
```
Knowledge Lane, 230, Buenos Aires
```

# Generation 4
## Category baseline
```
!new AddressBook('AddressBook_4')

!new Person('Mei_Ling')
!Mei_Ling.name := 'Mei Ling'
!Mei_Ling.phone := '+86-10-5555-6666'
!Mei_Ling.website := 'meilingspace.cn'
!Mei_Ling.email := 'mei.ling@creativelabs.cn'
!Mei_Ling.title := 'CEO'

!new Address('Address_10')
!Address_10.city := 'Beijing'
!Address_10.houseNr := '88'
!Address_10.street := 'Wangfujing Street'
!insert (Mei_Ling, Address_10) into ContactContainsAddress

!new Note('Note_10')
!Note_10.author := 'Mei Ling'
!Note_10.time := Date('2023-10-08')
!Note_10.type := #EMAIL
!Note_10.comment := 'Sent strategic partnership proposal to local tech hubs.'
!insert (Mei_Ling, Note_10) into ContactContainsNote

!new Company('DigiArt_cro')
!DigiArt_cro.name := 'DigiArt c.r.o.'
!DigiArt_cro.phone := '+420-2-1234-5678'
!DigiArt_cro.website := 'digiart.cat'
!DigiArt_cro.email := 'gallery@digiart.cat'
!DigiArt_cro.industry := 'Digital Arts'

!new Address('Address_11')
!Address_11.city := 'Prague'
!Address_11.houseNr := '29'
!Address_11.street := 'Karlova Street'
!insert (DigiArt_cro, Address_11) into ContactContainsAddress

!new Note('Note_11')
!Note_11.author := 'Tomáš Havel'
!Note_11.time := Date('2023-11-05')
!Note_11.type := #MEETING
!Note_11.comment := 'Collaboration with European artists for digital art gallery.'
!insert (DigiArt_cro, Note_11) into ContactContainsNote

!new Person('Elena_Rossi')
!Elena_Rossi.name := 'Elena Rossi'
!Elena_Rossi.phone := '+39-06-555-1112'
!Elena_Rossi.website := 'elenarossiinnovation.it'
!Elena_Rossi.email := 'elena@innovates.it'
!Elena_Rossi.title := 'Product Manager'

!new Address('Address_12')
!Address_12.city := 'Rome'
!Address_12.houseNr := '45'
!Address_12.street := 'Via Appia Nuova'
!insert (Elena_Rossi, Address_12) into ContactContainsAddress

!new Note('Note_12')
!Note_12.author := 'Elena Rossi'
!Note_12.time := Date('2023-12-03')
!Note_12.type := #CALL
!Note_12.comment := 'Resolved technical issues with current design software.'
!insert (Elena_Rossi, Note_12) into ContactContainsNote

!new Relationship('Relationship_8')
!Relationship_8.type := #COWORKER
!insert (Elena_Rossi, Relationship_8) into ContactToRelationship
!insert (Relationship_8, Mei_Ling) into RelationshipToContact

!new Relationship('Relationship_9')
!Relationship_9.type := #SUBDIVISION
!insert (Elena_Rossi, Relationship_9) into ContactToRelationship
!insert (Relationship_9, DigiArt_cro) into RelationshipToContact

!insert (AddressBook_4, Mei_Ling) into AddressBookMadeOfContact
!insert (AddressBook_4, DigiArt_cro) into AddressBookMadeOfContact
!insert (AddressBook_4, Elena_Rossi) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 63 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 2 | 3 | 66.67% |

| Invalid Addresses | 
|---| 
```
Wangfujing Street, 88, Beijing
```
```
Karlova Street, 29, Prague
```

## Category boundary
```
!new AddressBook('AddressBook_4')

!new Company('Artisanal_Foundation')
!Artisanal_Foundation.name := 'Artisanal Foundation'
!Artisanal_Foundation.phone := '+81-3-1234-5678'
!Artisanal_Foundation.website := 'www.artisanalfoundation.jp'
!Artisanal_Foundation.email := 'info@artisanal.jp'
!Artisanal_Foundation.industry := 'Non-profit'

!new Address('Address_Artisanal_Foundation')
!Address_Artisanal_Foundation.city := 'Tokyo'
!Address_Artisanal_Foundation.houseNr := '101'
!Address_Artisanal_Foundation.street := 'Ginza'
!insert (Artisanal_Foundation, Address_Artisanal_Foundation) into ContactContainsAddress

!new Note('Note_Artisanal_Foundation')
!Note_Artisanal_Foundation.author := 'Akira Tanaka'
!Note_Artisanal_Foundation.time := Date('2023-04-10')
!Note_Artisanal_Foundation.type := #MEETING
!Note_Artisanal_Foundation.comment := 'Planning cultural heritage workshop.'
!insert (Artisanal_Foundation, Note_Artisanal_Foundation) into ContactContainsNote

!new Relationship('Relationship_Artisanal_to_Sofia')
!Relationship_Artisanal_to_Sofia.type := #COWORKER
!insert (Artisanal_Foundation, Relationship_Artisanal_to_Sofia) into ContactToRelationship

!new Person('Sofia_Martinez')
!Sofia_Martinez.name := 'Sofia Martínez'
!Sofia_Martinez.phone := '+52-55-9876-5432'
!Sofia_Martinez.website := 'www.sofiamartinezcontemporary.mx'
!Sofia_Martinez.email := 'sofia@martinezart.mx'
!Sofia_Martinez.title := 'Contemporary Artist'

!new Address('Address_Sofia_Martinez')
!Address_Sofia_Martinez.city := 'Mexico City'
!Address_Sofia_Martinez.houseNr := '23'
!Address_Sofia_Martinez.street := 'Paseo de la Reforma'
!insert (Sofia_Martinez, Address_Sofia_Martinez) into ContactContainsAddress

!new Note('Note_Sofia_Martinez')
!Note_Sofia_Martinez.author := 'Diego Luna'
!Note_Sofia_Martinez.time := Date('2023-01-17')
!Note_Sofia_Martinez.type := #CALL
!Note_Sofia_Martinez.comment := 'Discussed details for a collaborative art project.'
!insert (Sofia_Martinez, Note_Sofia_Martinez) into ContactContainsNote

!new Relationship('Relationship_Sofia_to_Artisanal')
!Relationship_Sofia_to_Artisanal.type := #COWORKER
!insert (Sofia_Martinez, Relationship_Sofia_to_Artisanal) into ContactToRelationship
!insert (Relationship_Sofia_to_Artisanal, Artisanal_Foundation) into RelationshipToContact

!insert (Relationship_Artisanal_to_Sofia, Sofia_Martinez) into RelationshipToContact

!insert (AddressBook_4, Artisanal_Foundation) into AddressBookMadeOfContact
!insert (AddressBook_4, Sofia_Martinez) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 45 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 2 | 0.00% |
| Websites | 0 | 2 | 0.00% |
| Emails | 0 | 2 | 0.00% |
| Addresses | 2 | 2 | 100.00% |

| Invalid Addresses | 
|---| 
```
Ginza, 101, Tokyo
```
```
Paseo de la Reforma, 23, Mexico City
```

## Category complex
```
!new AddressBook('Innovatech_Global_Network')

!new Person('Chen_Mingyu')
!Chen_Mingyu.name := 'Chen Mingyu'
!Chen_Mingyu.phone := '+86-21-5558-7845'
!Chen_Mingyu.website := 'mingyu-innovations.cn'
!Chen_Mingyu.email := 'chen.mingyu@innovatech.cn'
!Chen_Mingyu.title := 'Chief Technology Officer'

!new Address('Address_Chen_Mingyu')
!Address_Chen_Mingyu.city := 'Shanghai'
!Address_Chen_Mingyu.houseNr := '128'
!Address_Chen_Mingyu.street := 'Nanjing Road'
!insert (Chen_Mingyu, Address_Chen_Mingyu) into ContactContainsAddress

!new Note('Note_Chen_Mingyu')
!Note_Chen_Mingyu.author := 'Chen Mingyu'
!Note_Chen_Mingyu.time := Date('2023-07-14')
!Note_Chen_Mingyu.type := #EMAIL
!Note_Chen_Mingyu.comment := 'Presented the latest AI technology development strategy to European partners.'
!insert (Chen_Mingyu, Note_Chen_Mingyu) into ContactContainsNote

!new Company('Green_Energy_Solutions')
!Green_Energy_Solutions.name := 'Green Energy Solutions'
!Green_Energy_Solutions.phone := '+49-30-4356-7890'
!Green_Energy_Solutions.website := 'greenenergysolutions.de'
!Green_Energy_Solutions.email := 'info@greenenergysolutions.de'
!Green_Energy_Solutions.industry := 'Renewable Energy'

!new Address('Address_Green_Energy_Solutions')
!Address_Green_Energy_Solutions.city := 'Berlin'
!Address_Green_Energy_Solutions.houseNr := '34'
!Address_Green_Energy_Solutions.street := 'Unter den Linden'
!insert (Green_Energy_Solutions, Address_Green_Energy_Solutions) into ContactContainsAddress

!new Note('Note_Green_Energy_Solutions')
!Note_Green_Energy_Solutions.author := 'CEO'
!Note_Green_Energy_Solutions.time := Date('2023-08-22')
!Note_Green_Energy_Solutions.type := #MEETING
!Note_Green_Energy_Solutions.comment := 'Negotiated joint venture terms for solar panel technology exchange.'
!insert (Green_Energy_Solutions, Note_Green_Energy_Solutions) into ContactContainsNote

!new Person('Priya_Ramesh')
!Priya_Ramesh.name := 'Priya Ramesh'
!Priya_Ramesh.phone := '+91-22-6734-7650'
!Priya_Ramesh.website := 'priyaramesh-consulting.in'
!Priya_Ramesh.email := 'priya.ramesh@innovatech.in'
!Priya_Ramesh.title := 'Strategic Business Consultant'

!new Address('Address_Priya_Ramesh')
!Address_Priya_Ramesh.city := 'Mumbai'
!Address_Priya_Ramesh.houseNr := '563'
!Address_Priya_Ramesh.street := 'Marine Drive'
!insert (Priya_Ramesh, Address_Priya_Ramesh) into ContactContainsAddress

!new Note('Note_Priya_Ramesh')
!Note_Priya_Ramesh.author := 'Priya Ramesh'
!Note_Priya_Ramesh.time := Date('2023-09-16')
!Note_Priya_Ramesh.type := #CALL
!Note_Priya_Ramesh.comment := 'Held strategic meeting on market entry strategy for the Southeast Asian market.'
!insert (Priya_Ramesh, Note_Priya_Ramesh) into ContactContainsNote

!new Company('Arctic_Tech_Research')
!Arctic_Tech_Research.name := 'Arctic Tech Research'
!Arctic_Tech_Research.phone := '+47-23-656-9832'
!Arctic_Tech_Research.website := 'arctictechresearch.no'
!Arctic_Tech_Research.email := 'enquiries@arctictechresearch.no'
!Arctic_Tech_Research.industry := 'Environmental Research'

!new Address('Address_Arctic_Tech_Research')
!Address_Arctic_Tech_Research.city := 'Oslo'
!Address_Arctic_Tech_Research.houseNr := '15'
!Address_Arctic_Tech_Research.street := 'Karl Johans gate'
!insert (Arctic_Tech_Research, Address_Arctic_Tech_Research) into ContactContainsAddress

!new Note('Note_Arctic_Tech_Research')
!Note_Arctic_Tech_Research.author := 'Lead Researcher'
!Note_Arctic_Tech_Research.time := Date('2023-10-02')
!Note_Arctic_Tech_Research.type := #EMAIL
!Note_Arctic_Tech_Research.comment := 'Coordinated international symposium on polar climate change impacts.'
!insert (Arctic_Tech_Research, Note_Arctic_Tech_Research) into ContactContainsNote

!new Relationship('Relationship_Chen_to_Green_Energy')
!Relationship_Chen_to_Green_Energy.type := #BOSS
!insert (Chen_Mingyu, Relationship_Chen_to_Green_Energy) into ContactToRelationship
!insert (Relationship_Chen_to_Green_Energy, Green_Energy_Solutions) into RelationshipToContact

!new Relationship('Relationship_Priya_to_Chen')
!Relationship_Priya_to_Chen.type := #COWORKER
!insert (Priya_Ramesh, Relationship_Priya_to_Chen) into ContactToRelationship
!insert (Relationship_Priya_to_Chen, Chen_Mingyu) into RelationshipToContact

!new Relationship('Relationship_Green_Energy_to_Arctic_Tech')
!Relationship_Green_Energy_to_Arctic_Tech.type := #SUBDIVISION
!insert (Green_Energy_Solutions, Relationship_Green_Energy_to_Arctic_Tech) into ContactToRelationship
!insert (Relationship_Green_Energy_to_Arctic_Tech, Arctic_Tech_Research) into RelationshipToContact

!new Relationship('Relationship_Priya_to_Arctic_Tech')
!Relationship_Priya_to_Arctic_Tech.type := #COWORKER
!insert (Priya_Ramesh, Relationship_Priya_to_Arctic_Tech) into ContactToRelationship
!insert (Relationship_Priya_to_Arctic_Tech, Arctic_Tech_Research) into RelationshipToContact

!insert (Innovatech_Global_Network, Chen_Mingyu) into AddressBookMadeOfContact
!insert (Innovatech_Global_Network, Green_Energy_Solutions) into AddressBookMadeOfContact
!insert (Innovatech_Global_Network, Priya_Ramesh) into AddressBookMadeOfContact
!insert (Innovatech_Global_Network, Arctic_Tech_Research) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 89 | 0.00% |
| Multiplicities Errors | 0 | 20 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 4 | 0.00% |
| Websites | 0 | 4 | 0.00% |
| Emails | 0 | 4 | 0.00% |
| Addresses | 2 | 4 | 50.00% |

| Invalid Addresses | 
|---| 
```
Marine Drive, 563, Mumbai
```
```
Nanjing Road, 128, Shanghai
```

## Category edge
```
!new AddressBook('Tech_Innovators_Network')

!new Company('FutureTech_Labs')
!FutureTech_Labs.name := 'FutureTech Labs'
!FutureTech_Labs.phone := '+1 415 555 3399'
!FutureTech_Labs.website := 'www.futuretechlabs.com'
!FutureTech_Labs.email := 'info@futuretechlabs.com'
!FutureTech_Labs.industry := 'Software Development'

!new Address('Address_FutureTech_Labs')
!Address_FutureTech_Labs.city := 'San Francisco'
!Address_FutureTech_Labs.houseNr := '75'
!Address_FutureTech_Labs.street := 'Market Street'
!insert (FutureTech_Labs, Address_FutureTech_Labs) into ContactContainsAddress

!new Note('Note_FutureTech_Labs')
!Note_FutureTech_Labs.author := 'Sophie Turner'
!Note_FutureTech_Labs.time := Date('2023-06-17')
!Note_FutureTech_Labs.type := #CALL
!Note_FutureTech_Labs.comment := 'Brainstorming session on next-gen AI tools.'
!insert (FutureTech_Labs, Note_FutureTech_Labs) into ContactContainsNote

!new Company('GreenSphere_Technologies')
!GreenSphere_Technologies.name := 'GreenSphere Technologies'
!GreenSphere_Technologies.phone := '+33 1 4770 3399'
!GreenSphere_Technologies.website := 'www.greenspheretech.fr'
!GreenSphere_Technologies.email := 'contact@greenspheretech.fr'
!GreenSphere_Technologies.industry := 'Environmental Research'

!new Address('Address_GreenSphere_Technologies')
!Address_GreenSphere_Technologies.city := 'Paris'
!Address_GreenSphere_Technologies.houseNr := '200'
!Address_GreenSphere_Technologies.street := 'Rue de Rivoli'
!insert (GreenSphere_Technologies, Address_GreenSphere_Technologies) into ContactContainsAddress

!new Note('Note_GreenSphere_Technologies')
!Note_GreenSphere_Technologies.author := 'Lucas Debois'
!Note_GreenSphere_Technologies.time := Date('2023-07-01')
!Note_GreenSphere_Technologies.type := #EMAIL
!Note_GreenSphere_Technologies.comment := 'Proposal to collaborate on eco-friendly tech solutions.'
!insert (GreenSphere_Technologies, Note_GreenSphere_Technologies) into ContactContainsNote

!new Person('Naomi_Okada')
!Naomi_Okada.name := 'Naomi Okada'
!Naomi_Okada.phone := '+81 90 3456 7890'
!Naomi_Okada.website := 'www.naomiokada.com'
!Naomi_Okada.email := 'naomi@innovate.jp'
!Naomi_Okada.title := 'Tech Consultant'

!new Address('Address_Tokyo_Naomi')
!Address_Tokyo_Naomi.city := 'Tokyo'
!Address_Tokyo_Naomi.houseNr := '18'
!Address_Tokyo_Naomi.street := 'Shibuya Crossing'
!insert (Naomi_Okada, Address_Tokyo_Naomi) into ContactContainsAddress

!new Address('Address_SanFrancisco_Naomi')
!Address_SanFrancisco_Naomi.city := 'San Francisco'
!Address_SanFrancisco_Naomi.houseNr := '85'
!Address_SanFrancisco_Naomi.street := 'Market Street'
!insert (Naomi_Okada, Address_SanFrancisco_Naomi) into ContactContainsAddress

!new Note('Note_1_Naomi_Okada')
!Note_1_Naomi_Okada.author := 'Naomi Okada'
!Note_1_Naomi_Okada.time := Date('2023-06-25')
!Note_1_Naomi_Okada.type := #MEETING
!Note_1_Naomi_Okada.comment := 'Reviewing tech sustainability models with GreenSphere.'
!insert (Naomi_Okada, Note_1_Naomi_Okada) into ContactContainsNote

!new Note('Note_2_Naomi_Okada')
!Note_2_Naomi_Okada.author := 'Sophie Turner'
!Note_2_Naomi_Okada.time := Date('2023-07-15')
!Note_2_Naomi_Okada.type := #EMAIL
!Note_2_Naomi_Okada.comment := 'Initiating joint project between FutureTech and Naomi.'
!insert (Naomi_Okada, Note_2_Naomi_Okada) into ContactContainsNote

!new Relationship('Relationship_FutureTech_to_GreenSphere')
!Relationship_FutureTech_to_GreenSphere.type := #COWORKER
!insert (FutureTech_Labs, Relationship_FutureTech_to_GreenSphere) into ContactToRelationship
!insert (Relationship_FutureTech_to_GreenSphere, GreenSphere_Technologies) into RelationshipToContact

!new Relationship('Relationship_FutureTech_to_Naomi')
!Relationship_FutureTech_to_Naomi.type := #EMPLOYEE
!insert (FutureTech_Labs, Relationship_FutureTech_to_Naomi) into ContactToRelationship
!insert (Relationship_FutureTech_to_Naomi, Naomi_Okada) into RelationshipToContact

!new Relationship('Relationship_GreenSphere_to_Naomi')
!Relationship_GreenSphere_to_Naomi.type := #BOSS
!insert (GreenSphere_Technologies, Relationship_GreenSphere_to_Naomi) into ContactToRelationship
!insert (Relationship_GreenSphere_to_Naomi, Naomi_Okada) into RelationshipToContact

!insert (Tech_Innovators_Network, FutureTech_Labs) into AddressBookMadeOfContact
!insert (Tech_Innovators_Network, GreenSphere_Technologies) into AddressBookMadeOfContact
!insert (Tech_Innovators_Network, Naomi_Okada) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 78 | 0.00% |
| Multiplicities Errors | 0 | 17 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 3 | 4 | 75.00% |

| Invalid Addresses | 
|---| 
```
Market Street, 85, San Francisco
```
```
Shibuya Crossing, 18, Tokyo
```
```
Market Street, 75, San Francisco
```

## Category invalid
```
!new AddressBook('World_Culinary_Network_Directory')

!new Person('Luca_Rossi')
!Luca_Rossi.name := 'Luca Rossi'
!Luca_Rossi.phone := '+39-06-555-0101'
!Luca_Rossi.website := 'www.lucarossiitalianchef.com'
!Luca_Rossi.email := 'luca.rossi@italiancuisine.com'
!Luca_Rossi.title := 'Executive Chef'

!new Address('Address_Luca_Rossi')
!Address_Luca_Rossi.city := 'Rome'
!Address_Luca_Rossi.houseNr := '15'
!Address_Luca_Rossi.street := 'Via Condotti'
!insert (Luca_Rossi, Address_Luca_Rossi) into ContactContainsAddress

!new Note('Note_Luca_Rossi')
!Note_Luca_Rossi.author := 'Luca Rossi'
!Note_Luca_Rossi.time := Date('2023-08-20 12:00')
!Note_Luca_Rossi.type := #EMAIL
!Note_Luca_Rossi.comment := 'Shared authentic Italian recipes with fellow chefs.'
!insert (Luca_Rossi, Note_Luca_Rossi) into ContactContainsNote

!new Company('Culinary_Arts_Institute')
!Culinary_Arts_Institute.name := 'Culinary Arts Institute'
!Culinary_Arts_Institute.phone := '+44-20-555-0202'
!Culinary_Arts_Institute.website := 'www.culinaryartsinstitute.co.uk'
!Culinary_Arts_Institute.email := 'contact@culinaryartsinstitute.co.uk'
!Culinary_Arts_Institute.industry := 'Culinary Education'

!new Address('Address_Culinary_Arts_London')
!Address_Culinary_Arts_London.city := 'London'
!Address_Culinary_Arts_London.houseNr := '221B'
!Address_Culinary_Arts_London.street := 'Baker St'
!insert (Culinary_Arts_Institute, Address_Culinary_Arts_London) into ContactContainsAddress

!new Address('Address_Culinary_Arts_Paris')
!Address_Culinary_Arts_Paris.city := 'Paris'
!Address_Culinary_Arts_Paris.houseNr := '392'
!Address_Culinary_Arts_Paris.street := 'Avenue des Champs-Élysées'
!insert (Culinary_Arts_Institute, Address_Culinary_Arts_Paris) into ContactContainsAddress

!new Note('Note_Culinary_Arts_Institute')
!Note_Culinary_Arts_Institute.author := 'Emily Thompson'
!Note_Culinary_Arts_Institute.time := Date('2023-09-05 09:30')
!Note_Culinary_Arts_Institute.type := #MEETING
!Note_Culinary_Arts_Institute.comment := 'Planning the annual international chef summit.'
!insert (Culinary_Arts_Institute, Note_Culinary_Arts_Institute) into ContactContainsNote

!new Relationship('Relationship_Luca_to_Culinary_Arts')
!Relationship_Luca_to_Culinary_Arts.type := #COWORKER
!insert (Luca_Rossi, Relationship_Luca_to_Culinary_Arts) into ContactToRelationship
!insert (Relationship_Luca_to_Culinary_Arts, Culinary_Arts_Institute) into RelationshipToContact

!new Company('World_Spice_Forum')
!World_Spice_Forum.name := 'World Spice Forum'
!World_Spice_Forum.phone := '+91-22-555-0303'
!World_Spice_Forum.website := 'www.worldspiceforum.org'
!World_Spice_Forum.email := 'info@worldspiceforum.org'
!World_Spice_Forum.industry := 'Culinary Innovations'

!new Address('Address_World_Spice_Forum')
!Address_World_Spice_Forum.city := 'Mumbai'
!Address_World_Spice_Forum.houseNr := '14A'
!Address_World_Spice_Forum.street := 'Marine Drive'
!insert (World_Spice_Forum, Address_World_Spice_Forum) into ContactContainsAddress

!new Note('Note_World_Spice_Forum')
!Note_World_Spice_Forum.author := 'Anjali Patel'
!Note_World_Spice_Forum.time := Date('2023-10-15 11:00')
!Note_World_Spice_Forum.type := #CALL
!Note_World_Spice_Forum.comment := 'Discussed global spice trends with culinary institutes.'
!insert (World_Spice_Forum, Note_World_Spice_Forum) into ContactContainsNote

!new Relationship('Relationship_Culinary_Arts_to_World_Spice')
!Relationship_Culinary_Arts_to_World_Spice.type := #SUBDIVISION
!insert (Culinary_Arts_Institute, Relationship_Culinary_Arts_to_World_Spice) into ContactToRelationship
!insert (Relationship_Culinary_Arts_to_World_Spice, World_Spice_Forum) into RelationshipToContact

!new Relationship('Relationship_World_Spice_to_Luca')
!Relationship_World_Spice_to_Luca.type := #EMPLOYEE
!insert (World_Spice_Forum, Relationship_World_Spice_to_Luca) into ContactToRelationship
!insert (Relationship_World_Spice_to_Luca, Luca_Rossi) into RelationshipToContact

!insert (World_Culinary_Network_Directory, Luca_Rossi) into AddressBookMadeOfContact
!insert (World_Culinary_Network_Directory, Culinary_Arts_Institute) into AddressBookMadeOfContact
!insert (World_Culinary_Network_Directory, World_Spice_Forum) into AddressBookMadeOfContact
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 16 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 4 | 4 | 100.00% |

| Invalid Addresses | 
|---| 
```
Baker St, 221B, London
```
```
Marine Drive, 14A, Mumbai
```
```
Via Condotti, 15, Rome
```
```
Avenue des Champs-Élysées, 392, Paris
```

## Generation 4 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 347 | 0.00% |
| Multiplicities Errors | 0 | 60 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 16 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 15 | 0.00% |
| Websites | 0 | 15 | 0.00% |
| Emails | 0 | 15 | 0.00% |
| Addresses | 13 | 17 | 76.47% |

| Invalid Addresses | 
|---| 
```
Wangfujing Street, 88, Beijing
```
```
Karlova Street, 29, Prague
```
```
Ginza, 101, Tokyo
```
```
Paseo de la Reforma, 23, Mexico City
```
```
Marine Drive, 563, Mumbai
```
```
Nanjing Road, 128, Shanghai
```
```
Market Street, 85, San Francisco
```
```
Shibuya Crossing, 18, Tokyo
```
```
Market Street, 75, San Francisco
```
```
Baker St, 221B, London
```
```
Marine Drive, 14A, Mumbai
```
```
Via Condotti, 15, Rome
```
```
Avenue des Champs-Élysées, 392, Paris
```

# Generation 5
## Category baseline
```
!new AddressBook('AddressBook_5')

!new Person('Fatima_Jafari')
!Fatima_Jafari.name := 'Fatima Jafari'
!Fatima_Jafari.phone := '+212-5-522-3344'
!Fatima_Jafari.website := 'fatimajcommunity.org'
!Fatima_Jafari.email := 'fatima.jafari@communityhope.ma'
!Fatima_Jafari.title := 'Community Leader'

!new Address('Address_13')
!Address_13.city := 'Casablanca'
!Address_13.houseNr := '15'
!Address_13.street := 'Boulevard Anfa'
!insert (Fatima_Jafari, Address_13) into ContactContainsAddress

!new Note('Note_13')
!Note_13.author := 'Fatima Jafari'
!Note_13.time := Date('2024-01-12')
!Note_13.type := #MEETING
!Note_13.comment := 'Organized a workshop to support local artisans.'
!insert (Fatima_Jafari, Note_13) into ContactContainsNote

!new Company('Regional_Development_Trust')
!Regional_Development_Trust.name := 'Regional Development Trust'
!Regional_Development_Trust.phone := '+27-11-945-0210'
!Regional_Development_Trust.website := 'www.rdtrust.co.za'
!Regional_Development_Trust.email := 'contact@rdtrust.co.za'
!Regional_Development_Trust.industry := 'Social Development'

!new Address('Address_14')
!Address_14.city := 'Johannesburg'
!Address_14.houseNr := '1001'
!Address_14.street := 'Nelson Mandela Boulevard'
!insert (Regional_Development_Trust, Address_14) into ContactContainsAddress

!new Note('Note_14')
!Note_14.author := 'Thabo Ndlovu'
!Note_14.time := Date('2024-02-20')
!Note_14.type := #EMAIL
!Note_14.comment := 'Detailed grant application protocol for community services.'
!insert (Regional_Development_Trust, Note_14) into ContactContainsNote

!new Person('Lars_Kristoffersen')
!Lars_Kristoffersen.name := 'Lars Kristoffersen'
!Lars_Kristoffersen.phone := '+47-21-555-6789'
!Lars_Kristoffersen.website := 'larsevents.no'
!Lars_Kristoffersen.email := 'lars.k@eventplanner.no'
!Lars_Kristoffersen.title := 'Event Coordinator'

!new Address('Address_15')
!Address_15.city := 'Oslo'
!Address_15.houseNr := '3'
!Address_15.street := 'Karl Johans Gate'
!insert (Lars_Kristoffersen, Address_15) into ContactContainsAddress

!new Note('Note_15')
!Note_15.author := 'Lars Kristoffersen'
!Note_15.time := Date('2024-03-10')
!Note_15.type := #CALL
!Note_15.comment := 'Planned cultural exchange event involving local communities.'
!insert (Lars_Kristoffersen, Note_15) into ContactContainsNote

!new Relationship('Relationship_10')
!Relationship_10.type := #BOSS
!insert (Lars_Kristoffersen, Relationship_10) into ContactToRelationship
!insert (Relationship_10, Fatima_Jafari) into RelationshipToContact

!new Relationship('Relationship_11')
!Relationship_11.type := #COWORKER
!insert (Lars_Kristoffersen, Relationship_11) into ContactToRelationship
!insert (Relationship_11, Regional_Development_Trust) into RelationshipToContact

!insert (AddressBook_5, Fatima_Jafari) into AddressBookMadeOfContact
!insert (AddressBook_5, Regional_Development_Trust) into AddressBookMadeOfContact
!insert (AddressBook_5, Lars_Kristoffersen) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 63 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 2 | 3 | 66.67% |

| Invalid Addresses | 
|---| 
```
Boulevard Anfa, 15, Casablanca
```
```
Nelson Mandela Boulevard, 1001, Johannesburg
```

## Category boundary
```
!new AddressBook('AddressBook_5')

!new Company('Green_Energy_Solutions')
!Green_Energy_Solutions.name := 'Green Energy Solutions'
!Green_Energy_Solutions.phone := '+49-30-4500-1234'
!Green_Energy_Solutions.website := 'www.greenenergy.de'
!Green_Energy_Solutions.email := 'info@greenenergy.de'
!Green_Energy_Solutions.industry := 'Renewable Energy'

!new Address('Address_Green_Energy')
!Address_Green_Energy.city := 'Berlin'
!Address_Green_Energy.houseNr := '256'
!Address_Green_Energy.street := 'Sonnenallee'
!insert (Green_Energy_Solutions, Address_Green_Energy) into ContactContainsAddress

!new Note('Note_Green_Energy')
!Note_Green_Energy.author := 'Hans Müller'
!Note_Green_Energy.time := Date('2023-03-25')
!Note_Green_Energy.type := #EMAIL
!Note_Green_Energy.comment := 'Follow-up on clean energy partnership proposal.'
!insert (Green_Energy_Solutions, Note_Green_Energy) into ContactContainsNote

!new Person('Maria_Fernandez')
!Maria_Fernandez.name := 'Maria Fernández'
!Maria_Fernandez.phone := '+34-93-7654-3210'
!Maria_Fernandez.website := 'www.mariafernandezmusic.com'
!Maria_Fernandez.email := 'maria.fernandez@musicmail.es'
!Maria_Fernandez.title := 'Flamenco Guitarist'

!new Address('Address_Maria_Fernandez')
!Address_Maria_Fernandez.city := 'Seville'
!Address_Maria_Fernandez.houseNr := '7'
!Address_Maria_Fernandez.street := 'Calle Betis'
!insert (Maria_Fernandez, Address_Maria_Fernandez) into ContactContainsAddress

!new Note('Note_Maria_Fernandez')
!Note_Maria_Fernandez.author := 'Carlos Herrera'
!Note_Maria_Fernandez.time := Date('2023-05-15')
!Note_Maria_Fernandez.type := #MEETING
!Note_Maria_Fernandez.comment := 'Arranged concert tour dates and venues.'
!insert (Maria_Fernandez, Note_Maria_Fernandez) into ContactContainsNote

!new Relationship('Relationship_Green_Energy_to_Maria')
!Relationship_Green_Energy_to_Maria.type := #EMPLOYEE
!insert (Green_Energy_Solutions, Relationship_Green_Energy_to_Maria) into ContactToRelationship
!insert (Relationship_Green_Energy_to_Maria, Maria_Fernandez) into RelationshipToContact

!new Company('Iberian_Recordings')
!Iberian_Recordings.name := 'Iberian Recordings'
!Iberian_Recordings.phone := '+34-91-8899-1011'
!Iberian_Recordings.website := 'www.iberianrecordings.com'
!Iberian_Recordings.email := 'contact@iberianrecordings.es'
!Iberian_Recordings.industry := 'Music Production'

!new Address('Address_Iberian_Recordings')
!Address_Iberian_Recordings.city := 'Madrid'
!Address_Iberian_Recordings.houseNr := '54'
!Address_Iberian_Recordings.street := 'Calle Mayor'
!insert (Iberian_Recordings, Address_Iberian_Recordings) into ContactContainsAddress

!new Note('Note_Iberian_Recordings')
!Note_Iberian_Recordings.author := 'Ana Robles'
!Note_Iberian_Recordings.time := Date('2023-07-10')
!Note_Iberian_Recordings.type := #CALL
!Note_Iberian_Recordings.comment := 'Discussed new album production timelines.'
!insert (Iberian_Recordings, Note_Iberian_Recordings) into ContactContainsNote

!new Relationship('Relationship_Iberian_to_Maria')
!Relationship_Iberian_to_Maria.type := #BOSS
!insert (Iberian_Recordings, Relationship_Iberian_to_Maria) into ContactToRelationship
!insert (Relationship_Iberian_to_Maria, Maria_Fernandez) into RelationshipToContact

!insert (AddressBook_5, Green_Energy_Solutions) into AddressBookMadeOfContact
!insert (AddressBook_5, Maria_Fernandez) into AddressBookMadeOfContact
!insert (AddressBook_5, Iberian_Recordings) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 63 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 0 | 3 | 0.00% |

## Category complex
```
!new AddressBook('Horizon_Collaborative_Connections')

!new Person('Fatima_Ahmed')
!Fatima_Ahmed.name := 'Fatima Ahmed'
!Fatima_Ahmed.phone := '+971-2-4033-7894'
!Fatima_Ahmed.website := 'fatimaahmed-innovation.ae'
!Fatima_Ahmed.email := 'fatima.ahmed@horizoncollaborative.ae'
!Fatima_Ahmed.title := 'Project Manager'

!new Address('Address_Fatima_Ahmed')
!Address_Fatima_Ahmed.city := 'Abu Dhabi'
!Address_Fatima_Ahmed.houseNr := '87'
!Address_Fatima_Ahmed.street := 'Corniche Road'
!insert (Fatima_Ahmed, Address_Fatima_Ahmed) into ContactContainsAddress

!new Note('Note_Fatima_Ahmed')
!Note_Fatima_Ahmed.author := 'Fatima Ahmed'
!Note_Fatima_Ahmed.time := Date('2023-04-11')
!Note_Fatima_Ahmed.type := #MEETING
!Note_Fatima_Ahmed.comment := 'Hosted a regional planning session for the MENA technology summit.'
!insert (Fatima_Ahmed, Note_Fatima_Ahmed) into ContactContainsNote

!new Company('Baltic_Cyber_Innovations')
!Baltic_Cyber_Innovations.name := 'Baltic Cyber Innovations'
!Baltic_Cyber_Innovations.phone := '+371-6-7453-2098'
!Baltic_Cyber_Innovations.website := 'balticcyber.lv'
!Baltic_Cyber_Innovations.email := 'contact@balticcyber.lv'
!Baltic_Cyber_Innovations.industry := 'Information Security'

!new Address('Address_Baltic_Cyber')
!Address_Baltic_Cyber.city := 'Riga'
!Address_Baltic_Cyber.houseNr := '22'
!Address_Baltic_Cyber.street := 'Brivibas Iela'
!insert (Baltic_Cyber_Innovations, Address_Baltic_Cyber) into ContactContainsAddress

!new Note('Note_Baltic_Cyber')
!Note_Baltic_Cyber.author := 'IT Director'
!Note_Baltic_Cyber.time := Date('2023-07-05')
!Note_Baltic_Cyber.type := #EMAIL
!Note_Baltic_Cyber.comment := 'Discussed cybersecurity protocols for upcoming EU data protection compliance.'
!insert (Baltic_Cyber_Innovations, Note_Baltic_Cyber) into ContactContainsNote

!new Person('Amir_Khan')
!Amir_Khan.name := 'Amir Khan'
!Amir_Khan.phone := '+92-21-3554-7654'
!Amir_Khan.website := 'amirkhan-tech.pk'
!Amir_Khan.email := 'amir.khan@horizoncollaborative.pk'
!Amir_Khan.title := 'Data Scientist'

!new Address('Address_Amir_Khan')
!Address_Amir_Khan.city := 'Karachi'
!Address_Amir_Khan.houseNr := '105'
!Address_Amir_Khan.street := 'Shahrah-e-Faisal'
!insert (Amir_Khan, Address_Amir_Khan) into ContactContainsAddress

!new Note('Note_Amir_Khan')
!Note_Amir_Khan.author := 'Amir Khan'
!Note_Amir_Khan.time := Date('2023-08-14')
!Note_Amir_Khan.type := #CALL
!Note_Amir_Khan.comment := 'Participated in a panel discussion about AI ethics and big data implications.'
!insert (Amir_Khan, Note_Amir_Khan) into ContactContainsNote

!new Company('Andes_Eco_Tech')
!Andes_Eco_Tech.name := 'Andes Eco Tech'
!Andes_Eco_Tech.phone := '+56-2-2955-3620'
!Andes_Eco_Tech.website := 'andesecotech.cl'
!Andes_Eco_Tech.email := 'operations@andesecotech.cl'
!Andes_Eco_Tech.industry := 'Environmental Solutions'

!new Address('Address_Andes_Eco_Tech')
!Address_Andes_Eco_Tech.city := 'Santiago'
!Address_Andes_Eco_Tech.houseNr := '68'
!Address_Andes_Eco_Tech.street := 'Avenida Libertador'
!insert (Andes_Eco_Tech, Address_Andes_Eco_Tech) into ContactContainsAddress

!new Note('Note_Andes_Eco_Tech')
!Note_Andes_Eco_Tech.author := 'CTO'
!Note_Andes_Eco_Tech.time := Date('2023-06-21')
!Note_Andes_Eco_Tech.type := #MEETING
!Note_Andes_Eco_Tech.comment := 'Collaborative workshop on sustainable technology integration.'
!insert (Andes_Eco_Tech, Note_Andes_Eco_Tech) into ContactContainsNote

!new Relationship('Relationship_Fatima_to_Baltic_Cyber')
!Relationship_Fatima_to_Baltic_Cyber.type := #COWORKER
!insert (Fatima_Ahmed, Relationship_Fatima_to_Baltic_Cyber) into ContactToRelationship
!insert (Relationship_Fatima_to_Baltic_Cyber, Baltic_Cyber_Innovations) into RelationshipToContact

!new Relationship('Relationship_Amir_to_Fatima')
!Relationship_Amir_to_Fatima.type := #EMPLOYEE
!insert (Amir_Khan, Relationship_Amir_to_Fatima) into ContactToRelationship
!insert (Relationship_Amir_to_Fatima, Fatima_Ahmed) into RelationshipToContact

!new Relationship('Relationship_Fatima_to_Andes_Eco_Tech')
!Relationship_Fatima_to_Andes_Eco_Tech.type := #SUBDIVISION
!insert (Fatima_Ahmed, Relationship_Fatima_to_Andes_Eco_Tech) into ContactToRelationship
!insert (Relationship_Fatima_to_Andes_Eco_Tech, Andes_Eco_Tech) into RelationshipToContact

!new Relationship('Relationship_Amir_to_Baltic_Cyber')
!Relationship_Amir_to_Baltic_Cyber.type := #COWORKER
!insert (Amir_Khan, Relationship_Amir_to_Baltic_Cyber) into ContactToRelationship
!insert (Relationship_Amir_to_Baltic_Cyber, Baltic_Cyber_Innovations) into RelationshipToContact

!insert (Horizon_Collaborative_Connections, Fatima_Ahmed) into AddressBookMadeOfContact
!insert (Horizon_Collaborative_Connections, Baltic_Cyber_Innovations) into AddressBookMadeOfContact
!insert (Horizon_Collaborative_Connections, Amir_Khan) into AddressBookMadeOfContact
!insert (Horizon_Collaborative_Connections, Andes_Eco_Tech) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 89 | 0.00% |
| Multiplicities Errors | 0 | 20 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 4 | 0.00% |
| Websites | 0 | 4 | 0.00% |
| Emails | 0 | 4 | 0.00% |
| Addresses | 4 | 4 | 100.00% |

| Invalid Addresses | 
|---| 
```
Corniche Road, 87, Abu Dhabi
```
```
Brivibas Iela, 22, Riga
```
```
Avenida Libertador, 68, Santiago
```
```
Shahrah-e-Faisal, 105, Karachi
```

## Category edge
```
!new AddressBook('Global_Health_Partners_Consortium')

!new Company('BioScience_Research_Institute')
!BioScience_Research_Institute.name := 'BioScience Research Institute'
!BioScience_Research_Institute.phone := '+1 212 555 7845'
!BioScience_Research_Institute.website := 'www.bioscienceresearch.org'
!BioScience_Research_Institute.email := 'info@bioscienceresearch.org'
!BioScience_Research_Institute.industry := 'Biotechnology Research'

!new Address('Address_BioScience')
!Address_BioScience.city := 'New York'
!Address_BioScience.houseNr := '300'
!Address_BioScience.street := 'Madison Avenue'
!insert (BioScience_Research_Institute, Address_BioScience) into ContactContainsAddress

!new Note('Note_BioScience_Research_Institute')
!Note_BioScience_Research_Institute.author := 'Dr. Alex Jordan'
!Note_BioScience_Research_Institute.time := Date('2023-08-05')
!Note_BioScience_Research_Institute.type := #CALL
!Note_BioScience_Research_Institute.comment := 'Discussed latest developments in gene therapy.'
!insert (BioScience_Research_Institute, Note_BioScience_Research_Institute) into ContactContainsNote

!new Company('LifeCare_Pharmaceuticals')
!LifeCare_Pharmaceuticals.name := 'LifeCare Pharmaceuticals'
!LifeCare_Pharmaceuticals.phone := '+49 69 2108 5456'
!LifeCare_Pharmaceuticals.website := 'www.lifecarepharma.de'
!LifeCare_Pharmaceuticals.email := 'contact@lifecarepharma.de'
!LifeCare_Pharmaceuticals.industry := 'Pharmaceuticals'

!new Address('Address_LifeCare')
!Address_LifeCare.city := 'Frankfurt'
!Address_LifeCare.houseNr := '85'
!Address_LifeCare.street := 'Kaiserstraße'
!insert (LifeCare_Pharmaceuticals, Address_LifeCare) into ContactContainsAddress

!new Note('Note_LifeCare_Pharmaceuticals')
!Note_LifeCare_Pharmaceuticals.author := 'Dr. Andrea Schmidt'
!Note_LifeCare_Pharmaceuticals.time := Date('2023-09-12')
!Note_LifeCare_Pharmaceuticals.type := #EMAIL
!Note_LifeCare_Pharmaceuticals.comment := 'Potential collaboration on vaccine research.'
!insert (LifeCare_Pharmaceuticals, Note_LifeCare_Pharmaceuticals) into ContactContainsNote

!new Person('Sanjay_Patel')
!Sanjay_Patel.name := 'Sanjay Patel'
!Sanjay_Patel.phone := '+91 98200 12345'
!Sanjay_Patel.website := 'www.sanjaypatelhealth.com'
!Sanjay_Patel.email := 'sanjay.patel@consultant.org'
!Sanjay_Patel.title := 'Healthcare Advisory Specialist'

!new Address('Address_Mumbai_Sanjay')
!Address_Mumbai_Sanjay.city := 'Mumbai'
!Address_Mumbai_Sanjay.houseNr := '47'
!Address_Mumbai_Sanjay.street := 'Mahatma Gandhi Road'
!insert (Sanjay_Patel, Address_Mumbai_Sanjay) into ContactContainsAddress

!new Address('Address_London_Sanjay')
!Address_London_Sanjay.city := 'London'
!Address_London_Sanjay.houseNr := '220'
!Address_London_Sanjay.street := 'Harley Street'
!insert (Sanjay_Patel, Address_London_Sanjay) into ContactContainsAddress

!new Note('Note_1_Sanjay_Patel')
!Note_1_Sanjay_Patel.author := 'Sanjay Patel'
!Note_1_Sanjay_Patel.time := Date('2023-07-30')
!Note_1_Sanjay_Patel.type := #MEETING
!Note_1_Sanjay_Patel.comment := 'Joint analysis session on international healthcare challenges.'
!insert (Sanjay_Patel, Note_1_Sanjay_Patel) into ContactContainsNote

!new Note('Note_2_Sanjay_Patel')
!Note_2_Sanjay_Patel.author := 'Dr. Alex Jordan'
!Note_2_Sanjay_Patel.time := Date('2023-08-20')
!Note_2_Sanjay_Patel.type := #EMAIL
!Note_2_Sanjay_Patel.comment := 'Evaluating research input from BioScience and LifeCare.'
!insert (Sanjay_Patel, Note_2_Sanjay_Patel) into ContactContainsNote

!new Relationship('Relationship_BioScience_to_LifeCare')
!Relationship_BioScience_to_LifeCare.type := #SUBDIVISION
!insert (BioScience_Research_Institute, Relationship_BioScience_to_LifeCare) into ContactToRelationship
!insert (Relationship_BioScience_to_LifeCare, LifeCare_Pharmaceuticals) into RelationshipToContact

!new Relationship('Relationship_BioScience_to_Sanjay')
!Relationship_BioScience_to_Sanjay.type := #COWORKER
!insert (BioScience_Research_Institute, Relationship_BioScience_to_Sanjay) into ContactToRelationship
!insert (Relationship_BioScience_to_Sanjay, Sanjay_Patel) into RelationshipToContact

!new Relationship('Relationship_LifeCare_to_Sanjay')
!Relationship_LifeCare_to_Sanjay.type := #BOSS
!insert (LifeCare_Pharmaceuticals, Relationship_LifeCare_to_Sanjay) into ContactToRelationship
!insert (Relationship_LifeCare_to_Sanjay, Sanjay_Patel) into RelationshipToContact

!insert (Global_Health_Partners_Consortium, BioScience_Research_Institute) into AddressBookMadeOfContact
!insert (Global_Health_Partners_Consortium, LifeCare_Pharmaceuticals) into AddressBookMadeOfContact
!insert (Global_Health_Partners_Consortium, Sanjay_Patel) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 78 | 0.00% |
| Multiplicities Errors | 0 | 17 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 3 | 4 | 75.00% |

| Invalid Addresses | 
|---| 
```
Harley Street, 220, London
```
```
Mahatma Gandhi Road, 47, Mumbai
```
```
Kaiserstraße, 85, Frankfurt
```

## Category invalid
```
!new AddressBook('Silicon_Valley_Tech_Innovators')

!new Person('Aria_Patel')
!Aria_Patel.name := 'Aria Patel'
!Aria_Patel.phone := '+1-408-555-0123'
!Aria_Patel.website := 'www.ariapateltech.com'
!Aria_Patel.email := 'aria.patel@siliconvalleytech.com'
!Aria_Patel.title := 'Software Architect'

!new Address('Address_Aria_Patel')
!Address_Aria_Patel.city := 'San Jose'
!Address_Aria_Patel.houseNr := '337'
!Address_Aria_Patel.street := 'Santana Row'
!insert (Aria_Patel, Address_Aria_Patel) into ContactContainsAddress

!new Note('Note_Aria_Patel')
!Note_Aria_Patel.author := 'Aria Patel'
!Note_Aria_Patel.time := Date('2023-09-01 14:00')
!Note_Aria_Patel.type := #CALL
!Note_Aria_Patel.comment := 'Discussed upcoming IoT standards with partners.'
!insert (Aria_Patel, Note_Aria_Patel) into ContactContainsNote

!new Company('Thalia_Technologies')
!Thalia_Technologies.name := 'Thalia Technologies'
!Thalia_Technologies.phone := '+1-650-555-0234'
!Thalia_Technologies.website := 'www.thalia-tech.com'
!Thalia_Technologies.email := 'contact@thalia-tech.com'
!Thalia_Technologies.industry := 'Artificial Intelligence'

!new Address('Address_Thalia_Technologies')
!Address_Thalia_Technologies.city := 'Mountain View'
!Address_Thalia_Technologies.houseNr := '1200'
!Address_Thalia_Technologies.street := 'Alta Ave'
!insert (Thalia_Technologies, Address_Thalia_Technologies) into ContactContainsAddress

!new Relationship('Relationship_Thalia_to_Aria')
!Relationship_Thalia_to_Aria.type := #BOSS
!insert (Thalia_Technologies, Relationship_Thalia_to_Aria) into ContactToRelationship
!insert (Relationship_Thalia_to_Aria, Aria_Patel) into RelationshipToContact

!new Relationship('Relationship_Thalia_to_Innovatech')
!Relationship_Thalia_to_Innovatech.type := #SUBDIVISION
!insert (Thalia_Technologies, Relationship_Thalia_to_Innovatech) into ContactToRelationship

!new Company('Innovatech_Labs')
!Innovatech_Labs.name := 'Innovatech Labs'
!Innovatech_Labs.phone := '+44-20-555-0456'
!Innovatech_Labs.website := 'www.innovatechlabs.com'
!Innovatech_Labs.email := 'helpdesk@innovatechlabs.com'
!Innovatech_Labs.industry := 'Research and Development'

!new Address('Address_Innovatech_Labs')
!Address_Innovatech_Labs.city := 'Palo Alto'
!Address_Innovatech_Labs.houseNr := '789'
!Address_Innovatech_Labs.street := 'University Ave'
!insert (Innovatech_Labs, Address_Innovatech_Labs) into ContactContainsAddress

!new Note('Note_Innovatech_Labs')
!Note_Innovatech_Labs.author := 'Rachel Nguyen'
!Note_Innovatech_Labs.time := Date('2023-09-15 10:00')
!Note_Innovatech_Labs.type := #MEETING
!Note_Innovatech_Labs.comment := 'Brainstorming session for future AI project ventures.'
!insert (Innovatech_Labs, Note_Innovatech_Labs) into ContactContainsNote

!new Relationship('Relationship_Innovatech_to_Aria')
!Relationship_Innovatech_to_Aria.type := #EMPLOYEE
!insert (Innovatech_Labs, Relationship_Innovatech_to_Aria) into ContactToRelationship
!insert (Relationship_Innovatech_to_Aria, Aria_Patel) into RelationshipToContact

!insert (Relationship_Thalia_to_Innovatech, Innovatech_Labs) into RelationshipToContact

!insert (Silicon_Valley_Tech_Innovators, Aria_Patel) into AddressBookMadeOfContact
!insert (Silicon_Valley_Tech_Innovators, Thalia_Technologies) into AddressBookMadeOfContact
!insert (Silicon_Valley_Tech_Innovators, Innovatech_Labs) into AddressBookMadeOfContact
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 14 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 1 | 3 | 33.33% |

| Invalid Addresses | 
|---| 
```
Alta Ave, 1200, Mountain View
```

## Generation 5 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 354 | 0.00% |
| Multiplicities Errors | 0 | 63 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 14 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 16 | 0.00% |
| Websites | 0 | 16 | 0.00% |
| Emails | 0 | 16 | 0.00% |
| Addresses | 10 | 17 | 58.82% |

| Invalid Addresses | 
|---| 
```
Boulevard Anfa, 15, Casablanca
```
```
Nelson Mandela Boulevard, 1001, Johannesburg
```
```
Corniche Road, 87, Abu Dhabi
```
```
Brivibas Iela, 22, Riga
```
```
Avenida Libertador, 68, Santiago
```
```
Shahrah-e-Faisal, 105, Karachi
```
```
Harley Street, 220, London
```
```
Mahatma Gandhi Road, 47, Mumbai
```
```
Kaiserstraße, 85, Frankfurt
```
```
Alta Ave, 1200, Mountain View
```

# Generation 6
## Category baseline
```
!new AddressBook('AddressBook_6')

!new Person('Laura_Espinoza')
!Laura_Espinoza.name := 'Laura Espinoza'
!Laura_Espinoza.phone := '+34-93-555-3344'
!Laura_Espinoza.website := 'lauraresearch.net'
!Laura_Espinoza.email := 'laura.espinoza@barcelonainnovate.es'
!Laura_Espinoza.title := 'Research Scientist'

!new Address('Address_16')
!Address_16.city := 'Barcelona'
!Address_16.houseNr := '76'
!Address_16.street := 'Gran Via de les Corts Catalanes'
!insert (Laura_Espinoza, Address_16) into ContactContainsAddress

!new Note('Note_16')
!Note_16.author := 'Laura Espinoza'
!Note_16.time := Date('2024-04-15')
!Note_16.type := #MEETING
!Note_16.comment := 'Presented findings at the annual renewable energy conference.'
!insert (Laura_Espinoza, Note_16) into ContactContainsNote

!new Company('Fintech_Innovators')
!Fintech_Innovators.name := 'Fintech Innovators'
!Fintech_Innovators.phone := '+65-6222-8899'
!Fintech_Innovators.website := 'www.fintechinnovators.sg'
!Fintech_Innovators.email := 'hello@fintechinnovators.sg'
!Fintech_Innovators.industry := 'Financial Technology'

!new Address('Address_17')
!Address_17.city := 'Singapore'
!Address_17.houseNr := '10'
!Address_17.street := 'Marina Bay Sands'
!insert (Fintech_Innovators, Address_17) into ContactContainsAddress

!new Note('Note_17')
!Note_17.author := 'Rohan Kapoor'
!Note_17.time := Date('2024-05-22')
!Note_17.type := #CALL
!Note_17.comment := 'Discussed strategies for implementing blockchain solutions.'
!insert (Fintech_Innovators, Note_17) into ContactContainsNote

!new Person('Zoe_Ndlovu')
!Zoe_Ndlovu.name := 'Zoe Ndlovu'
!Zoe_Ndlovu.phone := '+263-4-777-8888'
!Zoe_Ndlovu.website := 'zoetechconsulting.co.zw'
!Zoe_Ndlovu.email := 'zoe.ndlovu@consultingafrica.com'
!Zoe_Ndlovu.title := 'Technology Consultant'

!new Address('Address_18')
!Address_18.city := 'Harare'
!Address_18.houseNr := '101'
!Address_18.street := 'Samora Machel Avenue'
!insert (Zoe_Ndlovu, Address_18) into ContactContainsAddress

!new Note('Note_18')
!Note_18.author := 'Zoe Ndlovu'
!Note_18.time := Date('2024-06-30')
!Note_18.type := #EMAIL
!Note_18.comment := 'Sent a proposal for integrating AI tools in financial services.'
!insert (Zoe_Ndlovu, Note_18) into ContactContainsNote

!new Relationship('Relationship_12')
!Relationship_12.type := #COWORKER
!insert (Zoe_Ndlovu, Relationship_12) into ContactToRelationship
!insert (Relationship_12, Laura_Espinoza) into RelationshipToContact

!new Relationship('Relationship_13')
!Relationship_13.type := #SUBDIVISION
!insert (Zoe_Ndlovu, Relationship_13) into ContactToRelationship
!insert (Relationship_13, Fintech_Innovators) into RelationshipToContact

!insert (AddressBook_6, Laura_Espinoza) into AddressBookMadeOfContact
!insert (AddressBook_6, Fintech_Innovators) into AddressBookMadeOfContact
!insert (AddressBook_6, Zoe_Ndlovu) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 63 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 2 | 3 | 66.67% |

| Invalid Addresses | 
|---| 
```
Gran Via de les Corts Catalanes, 76, Barcelona
```
```
Marina Bay Sands, 10, Singapore
```

## Category boundary
```
!new AddressBook('AddressBook_6')

!new Company('Culinary_Innovations_Inc')
!Culinary_Innovations_Inc.name := 'Culinary Innovations Inc.'
!Culinary_Innovations_Inc.phone := '+65-6571-4001'
!Culinary_Innovations_Inc.website := 'www.culinaryinnovations.sg'
!Culinary_Innovations_Inc.email := 'support@culinaryinnovations.sg'
!Culinary_Innovations_Inc.industry := 'Food Technology'

!new Address('Address_Culinary_Innovations')
!Address_Culinary_Innovations.city := 'Singapore'
!Address_Culinary_Innovations.houseNr := '50'
!Address_Culinary_Innovations.street := 'Orchard Road'
!insert (Culinary_Innovations_Inc, Address_Culinary_Innovations) into ContactContainsAddress

!new Note('Note_Culinary_Innovations')
!Note_Culinary_Innovations.author := 'Jasmine Lee'
!Note_Culinary_Innovations.time := Date('2023-08-11')
!Note_Culinary_Innovations.type := #CALL
!Note_Culinary_Innovations.comment := 'Discussed integration of AI in recipe development.'
!insert (Culinary_Innovations_Inc, Note_Culinary_Innovations) into ContactContainsNote

!new Person('Chef_Lian_Wei')
!Chef_Lian_Wei.name := 'Chef Lian Wei'
!Chef_Lian_Wei.phone := '+852-2891-1234'
!Chef_Lian_Wei.website := 'www.chefwei.hk'
!Chef_Lian_Wei.email := 'liaowei@chefwei.hk'
!Chef_Lian_Wei.title := 'Executive Chef'

!new Address('Address_Chef_Lian_Wei')
!Address_Chef_Lian_Wei.city := 'Hong Kong'
!Address_Chef_Lian_Wei.houseNr := '88'
!Address_Chef_Lian_Wei.street := 'Victoria Street'
!insert (Chef_Lian_Wei, Address_Chef_Lian_Wei) into ContactContainsAddress

!new Note('Note_Chef_Lian_Wei')
!Note_Chef_Lian_Wei.author := 'Ming Zhao'
!Note_Chef_Lian_Wei.time := Date('2023-02-20')
!Note_Chef_Lian_Wei.type := #EMAIL
!Note_Chef_Lian_Wei.comment := 'Invitation to the International Culinary Symposium.'
!insert (Chef_Lian_Wei, Note_Chef_Lian_Wei) into ContactContainsNote

!new Person('Elena_Costa')
!Elena_Costa.name := 'Elena Costa'
!Elena_Costa.phone := '+39-06-1234-5678'
!Elena_Costa.website := 'www.elenacostaart.it'
!Elena_Costa.email := 'elenacosta@artmail.it'
!Elena_Costa.title := 'Digital Artist'

!new Address('Address_Elena_Costa')
!Address_Elena_Costa.city := 'Rome'
!Address_Elena_Costa.houseNr := '22'
!Address_Elena_Costa.street := 'Via Condotti'
!insert (Elena_Costa, Address_Elena_Costa) into ContactContainsAddress

!new Note('Note_Elena_Costa')
!Note_Elena_Costa.author := 'Mario Rossi'
!Note_Elena_Costa.time := Date('2023-03-16')
!Note_Elena_Costa.type := #MEETING
!Note_Elena_Costa.comment := 'Collaborated on a virtual art exhibition.'
!insert (Elena_Costa, Note_Elena_Costa) into ContactContainsNote

!new Relationship('Relationship_Culinary_Subdivision_Chef_Wei')
!Relationship_Culinary_Subdivision_Chef_Wei.type := #SUBDIVISION
!insert (Culinary_Innovations_Inc, Relationship_Culinary_Subdivision_Chef_Wei) into ContactToRelationship
!insert (Relationship_Culinary_Subdivision_Chef_Wei, Chef_Lian_Wei) into RelationshipToContact

!new Relationship('Relationship_Chef_Wei_to_Culinary_Innovations')
!Relationship_Chef_Wei_to_Culinary_Innovations.type := #EMPLOYEE
!insert (Chef_Lian_Wei, Relationship_Chef_Wei_to_Culinary_Innovations) into ContactToRelationship
!insert (Relationship_Chef_Wei_to_Culinary_Innovations, Culinary_Innovations_Inc) into RelationshipToContact

!new Relationship('Relationship_Elena_to_Chef_Wei')
!Relationship_Elena_to_Chef_Wei.type := #COWORKER
!insert (Elena_Costa, Relationship_Elena_to_Chef_Wei) into ContactToRelationship
!insert (Relationship_Elena_to_Chef_Wei, Chef_Lian_Wei) into RelationshipToContact

!insert (AddressBook_6, Culinary_Innovations_Inc) into AddressBookMadeOfContact
!insert (AddressBook_6, Chef_Lian_Wei) into AddressBookMadeOfContact
!insert (AddressBook_6, Elena_Costa) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 67 | 0.00% |
| Multiplicities Errors | 0 | 15 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 2 | 3 | 66.67% |

| Invalid Addresses | 
|---| 
```
Victoria Street, 88, Hong Kong
```
```
Via Condotti, 22, Rome
```

## Category complex
```
!new AddressBook('Nexus_International_Network')

!new Person('Youssef_El_Khoury')
!Youssef_El_Khoury.name := 'Youssef El Khoury'
!Youssef_El_Khoury.phone := '+212-537-655-839'
!Youssef_El_Khoury.website := 'youssefelkhoury-solutions.ma'
!Youssef_El_Khoury.email := 'youssef.elkhoury@nexusnetwork.ma'
!Youssef_El_Khoury.title := 'Business Development Director'

!new Address('Address_Youssef_El_Khoury')
!Address_Youssef_El_Khoury.city := 'Rabat'
!Address_Youssef_El_Khoury.houseNr := '12'
!Address_Youssef_El_Khoury.street := 'Avenue Mohammed V'
!insert (Youssef_El_Khoury, Address_Youssef_El_Khoury) into ContactContainsAddress

!new Note('Note_Youssef_El_Khoury')
!Note_Youssef_El_Khoury.author := 'Youssef El Khoury'
!Note_Youssef_El_Khoury.time := Date('2023-09-03')
!Note_Youssef_El_Khoury.type := #MEETING
!Note_Youssef_El_Khoury.comment := 'Led workshop on expanding telecommunications infrastructure in North Africa.'
!insert (Youssef_El_Khoury, Note_Youssef_El_Khoury) into ContactContainsNote

!new Company('Alpine_IT_Solutions')
!Alpine_IT_Solutions.name := 'Alpine IT Solutions'
!Alpine_IT_Solutions.phone := '+43-1-3456-789'
!Alpine_IT_Solutions.website := 'alpineitsolutions.at'
!Alpine_IT_Solutions.email := 'service@alpineitsolutions.at'
!Alpine_IT_Solutions.industry := 'Cloud Computing'

!new Address('Address_Alpine_IT_Solutions')
!Address_Alpine_IT_Solutions.city := 'Vienna'
!Address_Alpine_IT_Solutions.houseNr := '9'
!Address_Alpine_IT_Solutions.street := 'Kärntnerring'
!insert (Alpine_IT_Solutions, Address_Alpine_IT_Solutions) into ContactContainsAddress

!new Note('Note_Alpine_IT_Solutions')
!Note_Alpine_IT_Solutions.author := 'CTO'
!Note_Alpine_IT_Solutions.time := Date('2023-08-10')
!Note_Alpine_IT_Solutions.type := #EMAIL
!Note_Alpine_IT_Solutions.comment := 'Provided a new rollout of secure cloud platforms for European SMEs.'
!insert (Alpine_IT_Solutions, Note_Alpine_IT_Solutions) into ContactContainsNote

!new Person('Svetlana_Ivanova')
!Svetlana_Ivanova.name := 'Svetlana Ivanova'
!Svetlana_Ivanova.phone := '+7-495-123-2468'
!Svetlana_Ivanova.website := 'svetlanaivanova-connect.ru'
!Svetlana_Ivanova.email := 'svetlana.ivanova@nexusnetwork.ru'
!Svetlana_Ivanova.title := 'Head of Innovation'

!new Address('Address_Svetlana_Ivanova')
!Address_Svetlana_Ivanova.city := 'Moscow'
!Address_Svetlana_Ivanova.houseNr := '32'
!Address_Svetlana_Ivanova.street := 'Tverskaya Street'
!insert (Svetlana_Ivanova, Address_Svetlana_Ivanova) into ContactContainsAddress

!new Note('Note_Svetlana_Ivanova')
!Note_Svetlana_Ivanova.author := 'Svetlana Ivanova'
!Note_Svetlana_Ivanova.time := Date('2023-07-22')
!Note_Svetlana_Ivanova.type := #CALL
!Note_Svetlana_Ivanova.comment := 'Discussed the integration of AI-driven solutions in logistics systems.'
!insert (Svetlana_Ivanova, Note_Svetlana_Ivanova) into ContactContainsNote

!new Company('Serengeti_Renewable_Development')
!Serengeti_Renewable_Development.name := 'Serengeti Renewable Development'
!Serengeti_Renewable_Development.phone := '+255-22-1234-5678'
!Serengeti_Renewable_Development.website := 'serengetirenewable-tz.com'
!Serengeti_Renewable_Development.email := 'info@serengetirenewable-tz.com'
!Serengeti_Renewable_Development.industry := 'Renewable Energy'

!new Address('Address_Serengeti_Renewable_Development')
!Address_Serengeti_Renewable_Development.city := 'Dar es Salaam'
!Address_Serengeti_Renewable_Development.houseNr := '57'
!Address_Serengeti_Renewable_Development.street := 'Uhuru Street'
!insert (Serengeti_Renewable_Development, Address_Serengeti_Renewable_Development) into ContactContainsAddress

!new Note('Note_Serengeti_Renewable_Development')
!Note_Serengeti_Renewable_Development.author := 'Operations Manager'
!Note_Serengeti_Renewable_Development.time := Date('2023-05-17')
!Note_Serengeti_Renewable_Development.type := #MEETING
!Note_Serengeti_Renewable_Development.comment := 'Explored solar energy expansion projects in East Africa.'
!insert (Serengeti_Renewable_Development, Note_Serengeti_Renewable_Development) into ContactContainsNote

!new Relationship('Relationship_Youssef_to_Alpine_IT')
!Relationship_Youssef_to_Alpine_IT.type := #COWORKER
!insert (Youssef_El_Khoury, Relationship_Youssef_to_Alpine_IT) into ContactToRelationship
!insert (Relationship_Youssef_to_Alpine_IT, Alpine_IT_Solutions) into RelationshipToContact

!new Relationship('Relationship_Svetlana_to_Youssef')
!Relationship_Svetlana_to_Youssef.type := #COWORKER
!insert (Svetlana_Ivanova, Relationship_Svetlana_to_Youssef) into ContactToRelationship
!insert (Relationship_Svetlana_to_Youssef, Youssef_El_Khoury) into RelationshipToContact

!new Relationship('Relationship_Youssef_to_Serengeti_Renewable')
!Relationship_Youssef_to_Serengeti_Renewable.type := #BOSS
!insert (Youssef_El_Khoury, Relationship_Youssef_to_Serengeti_Renewable) into ContactToRelationship
!insert (Relationship_Youssef_to_Serengeti_Renewable, Serengeti_Renewable_Development) into RelationshipToContact

!new Relationship('Relationship_Svetlana_to_Serengeti_Renewable')
!Relationship_Svetlana_to_Serengeti_Renewable.type := #COWORKER
!insert (Svetlana_Ivanova, Relationship_Svetlana_to_Serengeti_Renewable) into ContactToRelationship
!insert (Relationship_Svetlana_to_Serengeti_Renewable, Serengeti_Renewable_Development) into RelationshipToContact

!insert (Nexus_International_Network, Youssef_El_Khoury) into AddressBookMadeOfContact
!insert (Nexus_International_Network, Alpine_IT_Solutions) into AddressBookMadeOfContact
!insert (Nexus_International_Network, Svetlana_Ivanova) into AddressBookMadeOfContact
!insert (Nexus_International_Network, Serengeti_Renewable_Development) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 89 | 0.00% |
| Multiplicities Errors | 0 | 20 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 4 | 0.00% |
| Websites | 0 | 4 | 0.00% |
| Emails | 0 | 4 | 0.00% |
| Addresses | 3 | 4 | 75.00% |

| Invalid Addresses | 
|---| 
```
Avenue Mohammed V, 12, Rabat
```
```
Kärntnerring, 9, Vienna
```
```
Tverskaya Street, 32, Moscow
```

## Category edge
```
!new AddressBook('World_Heritage_Preservation_Consortium')

!new Company('World_Heritage_Trust')
!World_Heritage_Trust.name := 'World Heritage Trust'
!World_Heritage_Trust.phone := '+44 20 7890 1234'
!World_Heritage_Trust.website := 'www.worldheritagetrust.org'
!World_Heritage_Trust.email := 'contact@worldheritagetrust.org'
!World_Heritage_Trust.industry := 'Cultural Preservation'

!new Address('Address_Edinburgh_Trust')
!Address_Edinburgh_Trust.city := 'Edinburgh'
!Address_Edinburgh_Trust.houseNr := '10'
!Address_Edinburgh_Trust.street := 'Castle Hill'
!insert (World_Heritage_Trust, Address_Edinburgh_Trust) into ContactContainsAddress

!new Address('Address_Rome_Trust')
!Address_Rome_Trust.city := 'Rome'
!Address_Rome_Trust.houseNr := '50'
!Address_Rome_Trust.street := 'Via del Corso'
!insert (World_Heritage_Trust, Address_Rome_Trust) into ContactContainsAddress

!new Note('Note_World_Heritage_Trust')
!Note_World_Heritage_Trust.author := 'Catherine Grey'
!Note_World_Heritage_Trust.time := Date('2023-04-22')
!Note_World_Heritage_Trust.type := #MEETING
!Note_World_Heritage_Trust.comment := 'Strategic meeting for funding of new restoration projects.'
!insert (World_Heritage_Trust, Note_World_Heritage_Trust) into ContactContainsNote

!new Company('Preservation_Architects_Inc')
!Preservation_Architects_Inc.name := 'Preservation Architects Inc.'
!Preservation_Architects_Inc.phone := '+1 312 555 6789'
!Preservation_Architects_Inc.website := 'www.preservationarchitects.com'
!Preservation_Architects_Inc.email := 'info@preservationarchitects.com'
!Preservation_Architects_Inc.industry := 'Architecture and Restoration'

!new Address('Address_Chicago_Architects')
!Address_Chicago_Architects.city := 'Chicago'
!Address_Chicago_Architects.houseNr := '210'
!Address_Chicago_Architects.street := 'N Michigan Avenue'
!insert (Preservation_Architects_Inc, Address_Chicago_Architects) into ContactContainsAddress

!new Note('Note_Preservation_Architects_Inc')
!Note_Preservation_Architects_Inc.author := 'Michael D\'Arcy'
!Note_Preservation_Architects_Inc.time := Date('2023-05-15')
!Note_Preservation_Architects_Inc.type := #EMAIL
!Note_Preservation_Architects_Inc.comment := 'Proposal for architectural input in UNESCO heritage sites.'
!insert (Preservation_Architects_Inc, Note_Preservation_Architects_Inc) into ContactContainsNote

!new Person('Min_Jae_Lee')
!Min_Jae_Lee.name := 'Min-Jae Lee'
!Min_Jae_Lee.phone := '+82 2 555 7890'
!Min_Jae_Lee.website := 'www.minjaeconsulting.com'
!Min_Jae_Lee.email := 'minjae.lee@advisor.com'
!Min_Jae_Lee.title := 'Heritage Conservation Specialist'

!new Address('Address_Seoul_Lee')
!Address_Seoul_Lee.city := 'Seoul'
!Address_Seoul_Lee.houseNr := '99'
!Address_Seoul_Lee.street := 'Insa-dong'
!insert (Min_Jae_Lee, Address_Seoul_Lee) into ContactContainsAddress

!new Address('Address_Edinburgh_Lee')
!Address_Edinburgh_Lee.city := 'Edinburgh'
!Address_Edinburgh_Lee.houseNr := '15'
!Address_Edinburgh_Lee.street := 'Castle Hill'
!insert (Min_Jae_Lee, Address_Edinburgh_Lee) into ContactContainsAddress

!new Note('Note_1_Min_Jae_Lee')
!Note_1_Min_Jae_Lee.author := 'Min-Jae Lee'
!Note_1_Min_Jae_Lee.time := Date('2023-03-10')
!Note_1_Min_Jae_Lee.type := #CALL
!Note_1_Min_Jae_Lee.comment := 'Evaluated potential sites in Korea for collaboration.'
!insert (Min_Jae_Lee, Note_1_Min_Jae_Lee) into ContactContainsNote

!new Note('Note_2_Min_Jae_Lee')
!Note_2_Min_Jae_Lee.author := 'Catherine Grey'
!Note_2_Min_Jae_Lee.time := Date('2023-06-05')
!Note_2_Min_Jae_Lee.type := #EMAIL
!Note_2_Min_Jae_Lee.comment := 'Agreed upon conservation techniques and resource sharing.'
!insert (Min_Jae_Lee, Note_2_Min_Jae_Lee) into ContactContainsNote

!new Relationship('Relationship_Trust_to_Architects')
!Relationship_Trust_to_Architects.type := #EMPLOYEE
!insert (World_Heritage_Trust, Relationship_Trust_to_Architects) into ContactToRelationship
!insert (Relationship_Trust_to_Architects, Preservation_Architects_Inc) into RelationshipToContact

!new Relationship('Relationship_Trust_to_Min_Jae_Lee')
!Relationship_Trust_to_Min_Jae_Lee.type := #SUBDIVISION
!insert (World_Heritage_Trust, Relationship_Trust_to_Min_Jae_Lee) into ContactToRelationship
!insert (Relationship_Trust_to_Min_Jae_Lee, Min_Jae_Lee) into RelationshipToContact

!new Relationship('Relationship_Architects_to_Min_Jae_Lee')
!Relationship_Architects_to_Min_Jae_Lee.type := #COWORKER
!insert (Preservation_Architects_Inc, Relationship_Architects_to_Min_Jae_Lee) into ContactToRelationship
!insert (Relationship_Architects_to_Min_Jae_Lee, Min_Jae_Lee) into RelationshipToContact

!insert (World_Heritage_Preservation_Consortium, World_Heritage_Trust) into AddressBookMadeOfContact
!insert (World_Heritage_Preservation_Consortium, Preservation_Architects_Inc) into AddressBookMadeOfContact
!insert (World_Heritage_Preservation_Consortium, Min_Jae_Lee) into AddressBookMadeOfContact
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 83 | 0.00% |
| Multiplicities Errors | 0 | 18 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 3 | 5 | 60.00% |

| Invalid Addresses | 
|---| 
```
Castle Hill, 10, Edinburgh
```
```
Insa-dong, 99, Seoul
```
```
Castle Hill, 15, Edinburgh
```

## Category invalid
```
!new AddressBook('International_Humanitarian_Outreach')

!new Person('Maria_Suarez')
!Maria_Suarez.name := 'Maria Suarez'
!Maria_Suarez.phone := '+52-55-5555-1010'
!Maria_Suarez.website := 'www.mariasuarezreliefwork.com'
!Maria_Suarez.email := 'maria.suarez@globalrelief.org'
!Maria_Suarez.title := 'Field Coordinator'

!new Address('Address_Maria_Suarez')
!Address_Maria_Suarez.city := 'Mexico City'
!Address_Maria_Suarez.houseNr := '292'
!Address_Maria_Suarez.street := 'Paseo de la Reforma'
!insert (Maria_Suarez, Address_Maria_Suarez) into ContactContainsAddress

!new Note('Note_Maria_Suarez')
!Note_Maria_Suarez.author := 'Maria Suarez'
!Note_Maria_Suarez.time := Date('2023-08-12 15:00')
!Note_Maria_Suarez.type := #MEETING
!Note_Maria_Suarez.comment := 'Strategic planning meeting for upcoming disaster relief operations in Central America.'
!insert (Maria_Suarez, Note_Maria_Suarez) into ContactContainsNote

!new Company('Hope_Alliance')
!Hope_Alliance.name := 'Hope Alliance'
!Hope_Alliance.phone := '+1-703-555-0202'
!Hope_Alliance.website := 'www.hopealliance.org'
!Hope_Alliance.email := 'contact@hopealliance.org'
!Hope_Alliance.industry := 'Humanitarian Aid'

!new Address('Address_Hope_Alliance')
!Address_Hope_Alliance.city := 'Washington, D.C.'
!Address_Hope_Alliance.houseNr := '1620'
!Address_Hope_Alliance.street := 'Constitution Ave'
!insert (Hope_Alliance, Address_Hope_Alliance) into ContactContainsAddress

!new Note('Note_Hope_Alliance')
!Note_Hope_Alliance.author := 'David Nguyen'
!Note_Hope_Alliance.time := Date('2023-09-01 09:00')
!Note_Hope_Alliance.type := #CALL
!Note_Hope_Alliance.comment := 'Coordination call with regional partners for emergency supplies distribution.'
!insert (Hope_Alliance, Note_Hope_Alliance) into ContactContainsNote

!new Company('Global_Healthcare_Services')
!Global_Healthcare_Services.name := 'Global Healthcare Services'
!Global_Healthcare_Services.phone := '+49-30-555-0333'
!Global_Healthcare_Services.website := 'www.globalhealth.org'
!Global_Healthcare_Services.email := 'admin@globalhealth.org'
!Global_Healthcare_Services.industry := 'Medical Support'

!new Address('Address_Global_Healthcare_Services')
!Address_Global_Healthcare_Services.city := 'Berlin'
!Address_Global_Healthcare_Services.houseNr := '77'
!Address_Global_Healthcare_Services.street := 'Unter den Linden'
!insert (Global_Healthcare_Services, Address_Global_Healthcare_Services) into ContactContainsAddress

!new Note('Note_Global_Healthcare_Services')
!Note_Global_Healthcare_Services.author := 'Hans Schmidt'
!Note_Global_Healthcare_Services.time := Date('2023-10-10 11:30')
!Note_Global_Healthcare_Services.type := #EMAIL
!Note_Global_Healthcare_Services.comment := 'Updated project list for mobile clinics deployment in Southeast Asia.'
!insert (Global_Healthcare_Services, Note_Global_Healthcare_Services) into ContactContainsNote

!new Relationship('Relationship_Hope_to_Global_Healthcare')
!Relationship_Hope_to_Global_Healthcare.type := #SUBDIVISION
!insert (Hope_Alliance, Relationship_Hope_to_Global_Healthcare) into ContactToRelationship
!insert (Relationship_Hope_to_Global_Healthcare, Global_Healthcare_Services) into RelationshipToContact

!new Relationship('Relationship_Global_Healthcare_to_Maria')
!Relationship_Global_Healthcare_to_Maria.type := #EMPLOYEE
!insert (Global_Healthcare_Services, Relationship_Global_Healthcare_to_Maria) into ContactToRelationship
!insert (Relationship_Global_Healthcare_to_Maria, Maria_Suarez) into RelationshipToContact

!new Relationship('Relationship_Maria_to_Hope')
!Relationship_Maria_to_Hope.type := #EMPLOYEE
!insert (Maria_Suarez, Relationship_Maria_to_Hope) into ContactToRelationship
!insert (Relationship_Maria_to_Hope, Hope_Alliance) into RelationshipToContact

!insert (International_Humanitarian_Outreach, Maria_Suarez) into AddressBookMadeOfContact
!insert (International_Humanitarian_Outreach, Hope_Alliance) into AddressBookMadeOfContact
!insert (International_Humanitarian_Outreach, Global_Healthcare_Services) into AddressBookMadeOfContact
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 15 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 2 | 3 | 66.67% |

| Invalid Addresses | 
|---| 
```
Constitution Ave, 1620, Washington, D.C.
```
```
Paseo de la Reforma, 292, Mexico City
```

## Generation 6 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 369 | 0.00% |
| Multiplicities Errors | 0 | 66 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 15 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 16 | 0.00% |
| Websites | 0 | 16 | 0.00% |
| Emails | 0 | 16 | 0.00% |
| Addresses | 12 | 18 | 66.67% |

| Invalid Addresses | 
|---| 
```
Gran Via de les Corts Catalanes, 76, Barcelona
```
```
Marina Bay Sands, 10, Singapore
```
```
Victoria Street, 88, Hong Kong
```
```
Via Condotti, 22, Rome
```
```
Avenue Mohammed V, 12, Rabat
```
```
Kärntnerring, 9, Vienna
```
```
Tverskaya Street, 32, Moscow
```
```
Castle Hill, 10, Edinburgh
```
```
Insa-dong, 99, Seoul
```
```
Castle Hill, 15, Edinburgh
```
```
Constitution Ave, 1620, Washington, D.C.
```
```
Paseo de la Reforma, 292, Mexico City
```

# Summary for all generations
| Summary | Value | 
|---|---| 
| Model | GPT_4O | 
| Type | CoT | 
| System | addressbook | 
| Number of generations | 6 | 

| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 2159 | 0.00% |
| Multiplicities Errors | 0 | 384 | 0.00% |
| Invariants Errors | 0 | 24 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 86 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 6 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 94 | 0.00% |
| Websites | 0 | 94 | 0.00% |
| Emails | 0 | 94 | 0.00% |
| Addresses | 68 | 105 | 64.76% |

| Invalid Addresses | 
|---| 
```
Market Street, 123, San Francisco
```
```
Baker Street, 221B, London
```
```
Lake Shore Dr, 203, Chicago
```
```
Sunset Blvd, 2590, Los Angeles
```
```
Gran Via de les Corts Catalanes, 24, Barcelona
```
```
Zhongguancun Ave, 908, Beijing
```
```
Tech Lane, 101, London
```
```
Innovation Way, 24, Berlin
```
```
Innovation Way, 23, Berlin
```
```
Shinagawa-ku, 5th Avenue, 22, Tokyo
```
```
Minato-ku, Robot Street, 10, Tokyo
```
```
Collins Street, 250, Melbourne
```
```
Shinjuku-dori, 1120, Tokyo
```
```
Avenida Reforma, 789, Mexico City
```
```
Baker Street, 15, London
```
```
Nanjing Road West, 67, Shanghai
```
```
Gran Via, 102, Madrid
```
```
Shibuya Crossing, 11, Tokyo
```
```
Queen Street, 256, Brisbane
```
```
Paseo de la Reforma, 200, Mexico City
```
```
Sakura Avenue, 15, Tokyo
```
```
Marine Drive, 101, Mumbai
```
```
Constitution Avenue, 1600, Washington D.C.
```
```
Marine Drive, 88, Mumbai
```
```
Stora Torget, 17, Uppsala
```
```
Olaya Street, 230, Riyadh
```
```
Darling Harbour, 223, Sydney
```
```
Avenida Eduardo Ribeiro, 81, Manaus
```
```
Sheikh Zayed Road, 45, Dubai
```
```
Education City, 45, Dubai
```
```
Scholar\s Ct, 2, Oxford
```
```
Future Avenue, 128, Shanghai
```
```
Knowledge Lane, 230, Buenos Aires
```
```
Wangfujing Street, 88, Beijing
```
```
Karlova Street, 29, Prague
```
```
Ginza, 101, Tokyo
```
```
Paseo de la Reforma, 23, Mexico City
```
```
Marine Drive, 563, Mumbai
```
```
Nanjing Road, 128, Shanghai
```
```
Market Street, 85, San Francisco
```
```
Shibuya Crossing, 18, Tokyo
```
```
Market Street, 75, San Francisco
```
```
Baker St, 221B, London
```
```
Marine Drive, 14A, Mumbai
```
```
Via Condotti, 15, Rome
```
```
Avenue des Champs-Élysées, 392, Paris
```
```
Boulevard Anfa, 15, Casablanca
```
```
Nelson Mandela Boulevard, 1001, Johannesburg
```
```
Corniche Road, 87, Abu Dhabi
```
```
Brivibas Iela, 22, Riga
```
```
Avenida Libertador, 68, Santiago
```
```
Shahrah-e-Faisal, 105, Karachi
```
```
Harley Street, 220, London
```
```
Mahatma Gandhi Road, 47, Mumbai
```
```
Kaiserstraße, 85, Frankfurt
```
```
Alta Ave, 1200, Mountain View
```
```
Gran Via de les Corts Catalanes, 76, Barcelona
```
```
Marina Bay Sands, 10, Singapore
```
```
Victoria Street, 88, Hong Kong
```
```
Via Condotti, 22, Rome
```
```
Avenue Mohammed V, 12, Rabat
```
```
Kärntnerring, 9, Vienna
```
```
Tverskaya Street, 32, Moscow
```
```
Castle Hill, 10, Edinburgh
```
```
Insa-dong, 99, Seoul
```
```
Castle Hill, 15, Edinburgh
```
```
Constitution Ave, 1620, Washington, D.C.
```
```
Paseo de la Reforma, 292, Mexico City
```

