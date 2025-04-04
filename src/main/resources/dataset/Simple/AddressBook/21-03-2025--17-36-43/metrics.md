# Generation 1
```
!new AddressBook('addressBook1')

!new Person('johnDoe')
!johnDoe.name := 'John Doe'
!johnDoe.phone := '123-456-7890'
!johnDoe.website := 'www.johndoe.com'
!johnDoe.email := 'john.doe@example.com'
!johnDoe.title := 'Software Engineer'

!new Company('acmeCorp')
!acmeCorp.name := 'Acme Corp'
!acmeCorp.phone := '987-654-3210'
!acmeCorp.website := 'www.acmecorp.com'
!acmeCorp.email := 'contact@acmecorp.com'
!acmeCorp.industry := 'Technology'

!new Person('janeSmith')
!janeSmith.name := 'Jane Smith'
!janeSmith.phone := '321-654-9870'
!janeSmith.website := 'www.janesmith.me'
!janeSmith.email := 'jane.smith@example.com'
!janeSmith.title := 'Project Manager'

!new Note('meetingNote')
!meetingNote.author := 'John Doe'
!meetingNote.time := Date('2023-11-01')
!meetingNote.type := #MEETING
!meetingNote.comment := 'Discuss project milestones'

!new Address('johnAddress')
!johnAddress.city := 'New York'
!johnAddress.houseNr := '101'
!johnAddress.street := 'Broadway'

!new Address('acmeAddress')
!acmeAddress.city := 'San Francisco'
!acmeAddress.houseNr := '202'
!acmeAddress.street := 'Market Street'

!new Relationship('bossRelationship')
!bossRelationship.type := #BOSS

!insert (bossRelationship, janeSmith) into RelationshipToContact
!insert (johnDoe, bossRelationship) into ContactToRelationship
!insert (johnDoe, johnAddress) into ContactContainsAddress
!insert (acmeCorp, acmeAddress) into ContactContainsAddress
!insert (janeSmith, meetingNote) into ContactContainsNote

!insert (addressBook1, johnDoe) into AddressBookMadeOfContact
!insert (addressBook1, acmeCorp) into AddressBookMadeOfContact
!insert (addressBook1, janeSmith) into AddressBookMadeOfContact

!new Note('callNote')
!callNote.author := 'Jane Smith'
!callNote.time := Date('2023-11-05')
!callNote.type := #CALL
!callNote.comment := 'Follow-up on proposal'

!new Address('janeAddress')
!janeAddress.city := 'Chicago'
!janeAddress.houseNr := '303'
!janeAddress.street := 'Michigan Avenue'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, johnDoe) into RelationshipToContact
!insert (janeSmith, employeeRelationship) into ContactToRelationship
!insert (janeSmith, janeAddress) into ContactContainsAddress
!insert (janeSmith, callNote) into ContactContainsNote

!new Person('markBrown')
!markBrown.name := 'Mark Brown'
!markBrown.phone := '555-234-5678'
!markBrown.website := 'www.markbrown.info'
!markBrown.email := 'mark.brown@example.com'
!markBrown.title := 'Marketing Director'

!new Relationship('coworkerRelationship')
!coworkerRelationship.type := #COWORKER

!insert (coworkerRelationship, acmeCorp) into RelationshipToContact
!insert (markBrown, coworkerRelationship) into ContactToRelationship

!insert (addressBook1, markBrown) into AddressBookMadeOfContact
```
## Generation 1 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 68 | 0.00% |
| Multiplicities Errors | 0 | 15 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 4 | 0.00% |
| Websites | 0 | 4 | 0.00% |
| Emails | 0 | 4 | 0.00% |
| Addresses | 2 | 3 | 66.67% |

| Invalid Addresses | 
|---| 
```
Market Street, 202, San Francisco
```
```
Michigan Avenue, 303, Chicago
```

# Generation 2
```
!new AddressBook('addressBook2')

!new Company('techSolutions')
!techSolutions.name := 'Tech Solutions'
!techSolutions.phone := '800-555-0199'
!techSolutions.website := 'www.techsolutions.com'
!techSolutions.email := 'info@techsolutions.com'
!techSolutions.industry := 'Consulting'

!new Person('aliceWong')
!aliceWong.name := 'Alice Wong'
!aliceWong.phone := '600-432-8888'
!aliceWong.website := 'www.alicewong.biz'
!aliceWong.email := 'alice.wong@example.com'
!aliceWong.title := 'Chief Executive Officer'

!new Note('emailNote')
!emailNote.author := 'Alice Wong'
!emailNote.time := Date('2023-11-10')
!emailNote.type := #EMAIL
!emailNote.comment := 'Sent quarterly earnings report'

!new Address('aliceAddress')
!aliceAddress.city := 'Los Angeles'
!aliceAddress.houseNr := '200'
!aliceAddress.street := 'Sunset Boulevard'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, techSolutions) into RelationshipToContact
!insert (aliceWong, subdivisionRelationship) into ContactToRelationship
!insert (aliceWong, aliceAddress) into ContactContainsAddress
!insert (aliceWong, emailNote) into ContactContainsNote

!new Person('bobCarter')
!bobCarter.name := 'Bob Carter'
!bobCarter.phone := '423-555-0177'
!bobCarter.website := 'www.bobcarter.org'
!bobCarter.email := 'bob.carter@example.com'
!bobCarter.title := 'Operations Manager'

!new Note('meetingReminderNote')
!meetingReminderNote.author := 'Bob Carter'
!meetingReminderNote.time := Date('2023-12-01')
!meetingReminderNote.type := #MEETING
!meetingReminderNote.comment := 'Reminder for annual strategic planning meeting'

!new Address('bobAddress')
!bobAddress.city := 'Seattle'
!bobAddress.houseNr := '405'
!bobAddress.street := 'Pine Street'

!new Relationship('coworkerRelationship')
!coworkerRelationship.type := #COWORKER

!insert (coworkerRelationship, aliceWong) into RelationshipToContact
!insert (bobCarter, coworkerRelationship) into ContactToRelationship
!insert (bobCarter, bobAddress) into ContactContainsAddress
!insert (bobCarter, meetingReminderNote) into ContactContainsNote

!insert (addressBook2, techSolutions) into AddressBookMadeOfContact
!insert (addressBook2, aliceWong) into AddressBookMadeOfContact
!insert (addressBook2, bobCarter) into AddressBookMadeOfContact
```
## Generation 2 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 52 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 1 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 3 | 0.00% |
| Websites | 0 | 3 | 0.00% |
| Emails | 0 | 3 | 0.00% |
| Addresses | 1 | 2 | 50.00% |

| Invalid Addresses | 
|---| 
```
Sunset Boulevard, 200, Los Angeles
```

# Generation 3
```
!new AddressBook('addressBook3')

!new Company('greenEnergyInc')
!greenEnergyInc.name := 'Green Energy Inc.'
!greenEnergyInc.phone := '844-444-2222'
!greenEnergyInc.website := 'www.greenenergyinc.com'
!greenEnergyInc.email := 'contact@greenenergyinc.com'
!greenEnergyInc.industry := 'Renewable Energy'

!new Person('davidLee')
!davidLee.name := 'David Lee'
!davidLee.phone := '609-555-7777'
!davidLee.website := 'www.davidleeconsulting.com'
!davidLee.email := 'david.lee@example.com'
!davidLee.title := 'Environmental Consultant'

!new Note('consultationNote')
!consultationNote.author := 'David Lee'
!consultationNote.time := Date('2023-12-15')
!consultationNote.type := #CALL
!consultationNote.comment := 'Consulted on solar power expansion project'

!new Address('davidAddress')
!davidAddress.city := 'Austin'
!davidAddress.houseNr := '777'
!davidAddress.street := 'Congress Avenue'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, greenEnergyInc) into RelationshipToContact
!insert (davidLee, employeeRelationship) into ContactToRelationship
!insert (davidLee, davidAddress) into ContactContainsAddress
!insert (davidLee, consultationNote) into ContactContainsNote

!new Person('sophiaKim')
!sophiaKim.name := 'Sophia Kim'
!sophiaKim.phone := '333-444-1111'
!sophiaKim.website := 'www.sophiakimdesign.com'
!sophiaKim.email := 'sophia.kim@example.com'
!sophiaKim.title := 'Graphic Designer'

!new Note('creativeDesignNote')
!creativeDesignNote.author := 'Sophia Kim'
!creativeDesignNote.time := Date('2023-12-20')
!creativeDesignNote.type := #EMAIL
!creativeDesignNote.comment := 'Submitted new design prototypes for review'

!new Address('sophiaAddress')
!sophiaAddress.city := 'Miami'
!sophiaAddress.houseNr := '1500'
!sophiaAddress.street := 'Biscayne Blvd'

!new Relationship('coworkerRelationship')
!coworkerRelationship.type := #COWORKER

!insert (coworkerRelationship, davidLee) into RelationshipToContact
!insert (sophiaKim, coworkerRelationship) into ContactToRelationship
!insert (sophiaKim, sophiaAddress) into ContactContainsAddress
!insert (sophiaKim, creativeDesignNote) into ContactContainsNote

!new Address('greenEnergyAddress')
!greenEnergyAddress.city := 'Denver'
!greenEnergyAddress.houseNr := '404'
!greenEnergyAddress.street := 'Energy Parkway'

!insert (greenEnergyInc, greenEnergyAddress) into ContactContainsAddress

!insert (addressBook3, greenEnergyInc) into AddressBookMadeOfContact
!insert (addressBook3, davidLee) into AddressBookMadeOfContact
!insert (addressBook3, sophiaKim) into AddressBookMadeOfContact
```
## Generation 3 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Biscayne Blvd, 1500, Miami
```
```
Energy Parkway, 404, Denver
```

# Generation 4
```
!new AddressBook('addressBook4')

!new Company('urbanDevelopersLtd')
!urbanDevelopersLtd.name := 'Urban Developers Ltd.'
!urbanDevelopersLtd.phone := '212-555-9000'
!urbanDevelopersLtd.website := 'www.urbandev.com'
!urbanDevelopersLtd.email := 'info@urbandev.com'
!urbanDevelopersLtd.industry := 'Real Estate'

!new Person('michaelJones')
!michaelJones.name := 'Michael Jones'
!michaelJones.phone := '555-0123-567'
!michaelJones.website := 'www.michaeljonesadvisor.com'
!michaelJones.email := 'michael.jones@urbandev.com'
!michaelJones.title := 'Senior Real Estate Advisor'

!new Note('propertyMeetingNote')
!propertyMeetingNote.author := 'Michael Jones'
!propertyMeetingNote.time := Date('2023-12-28')
!propertyMeetingNote.type := #MEETING
!propertyMeetingNote.comment := 'Discuss future property developments in downtown area'

!new Address('michaelAddress')
!michaelAddress.city := 'Phoenix'
!michaelAddress.houseNr := '1206'
!michaelAddress.street := 'Desert Drive'

!new Relationship('bossRelationship')
!bossRelationship.type := #BOSS

!insert (bossRelationship, urbanDevelopersLtd) into RelationshipToContact
!insert (michaelJones, bossRelationship) into ContactToRelationship
!insert (michaelJones, michaelAddress) into ContactContainsAddress
!insert (michaelJones, propertyMeetingNote) into ContactContainsNote

!new Person('sarahWilson')
!sarahWilson.name := 'Sarah Wilson'
!sarahWilson.phone := '666-321-9876'
!sarahWilson.website := 'www.sarahwilsonconsultancy.com'
!sarahWilson.email := 'sarah.wilson@example.com'
!sarahWilson.title := 'Architect'

!new Note('designPresentationNote')
!designPresentationNote.author := 'Sarah Wilson'
!designPresentationNote.time := Date('2024-01-05')
!designPresentationNote.type := #EMAIL
!designPresentationNote.comment := 'Sent architectural design drafts for the new business park'

!new Address('sarahAddress')
!sarahAddress.city := 'Charlotte'
!sarahAddress.houseNr := '389'
!sarahAddress.street := 'Elm Street'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, michaelJones) into RelationshipToContact
!insert (sarahWilson, subdivisionRelationship) into ContactToRelationship
!insert (sarahWilson, sarahAddress) into ContactContainsAddress
!insert (sarahWilson, designPresentationNote) into ContactContainsNote

!new Address('urbanDevelopersAddress')
!urbanDevelopersAddress.city := 'Houston'
!urbanDevelopersAddress.houseNr := '789'
!urbanDevelopersAddress.street := 'Construction Road'

!insert (urbanDevelopersLtd, urbanDevelopersAddress) into ContactContainsAddress

!insert (addressBook4, urbanDevelopersLtd) into AddressBookMadeOfContact
!insert (addressBook4, michaelJones) into AddressBookMadeOfContact
!insert (addressBook4, sarahWilson) into AddressBookMadeOfContact
```
## Generation 4 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Desert Drive, 1206, Phoenix
```
```
Elm Street, 389, Charlotte
```
```
Construction Road, 789, Houston
```

# Generation 5
```
!new AddressBook('addressBook5')

!new Company('blueTechInnovations')
!blueTechInnovations.name := 'BlueTech Innovations'
!blueTechInnovations.phone := '800-768-5674'
!blueTechInnovations.website := 'www.bluetech.com'
!blueTechInnovations.email := 'contact@bluetech.com'
!blueTechInnovations.industry := 'Software Development'

!new Person('emmaWatson')
!emmaWatson.name := 'Emma Watson'
!emmaWatson.phone := '222-333-4455'
!emmaWatson.website := 'www.emmawatsondesign.com'
!emmaWatson.email := 'emma.watson@bluetech.com'
!emmaWatson.title := 'Lead UX Designer'

!new Note('designWorkshopNote')
!designWorkshopNote.author := 'Emma Watson'
!designWorkshopNote.time := Date('2024-01-12')
!designWorkshopNote.type := #MEETING
!designWorkshopNote.comment := 'Participate in UX design workshop with stakeholders'

!new Address('emmaAddress')
!emmaAddress.city := 'Boston'
!emmaAddress.houseNr := '455'
!emmaAddress.street := 'Maple Street'

!new Relationship('coworkerRelationship')
!coworkerRelationship.type := #COWORKER

!insert (coworkerRelationship, blueTechInnovations) into RelationshipToContact
!insert (emmaWatson, coworkerRelationship) into ContactToRelationship
!insert (emmaWatson, emmaAddress) into ContactContainsAddress
!insert (emmaWatson, designWorkshopNote) into ContactContainsNote

!new Person('oliverStone')
!oliverStone.name := 'Oliver Stone'
!oliverStone.phone := '444-555-6789'
!oliverStone.website := 'www.oliverstone.photography'
!oliverStone.email := 'oliver.stone@example.com'
!oliverStone.title := 'Multimedia Specialist'

!new Note('mediaProjectNote')
!mediaProjectNote.author := 'Oliver Stone'
!mediaProjectNote.time := Date('2024-02-01')
!mediaProjectNote.type := #CALL
!mediaProjectNote.comment := 'Discuss multimedia content strategies for product launch'

!new Address('oliverAddress')
!oliverAddress.city := 'San Diego'
!oliverAddress.houseNr := '989'
!oliverAddress.street := 'Palm Lane'

!new Relationship('bossRelationship')
!bossRelationship.type := #BOSS

!insert (bossRelationship, emmaWatson) into RelationshipToContact
!insert (oliverStone, bossRelationship) into ContactToRelationship
!insert (oliverStone, oliverAddress) into ContactContainsAddress
!insert (oliverStone, mediaProjectNote) into ContactContainsNote

!new Address('blueTechAddress')
!blueTechAddress.city := 'Seattle'
!blueTechAddress.houseNr := '150'
!blueTechAddress.street := 'Lakeview Ave'

!insert (blueTechInnovations, blueTechAddress) into ContactContainsAddress

!insert (addressBook5, blueTechInnovations) into AddressBookMadeOfContact
!insert (addressBook5, emmaWatson) into AddressBookMadeOfContact
!insert (addressBook5, oliverStone) into AddressBookMadeOfContact
```
## Generation 5 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Palm Lane, 989, San Diego
```
```
Lakeview Ave, 150, Seattle
```
```
Maple Street, 455, Boston
```

# Generation 6
```
!new AddressBook('addressBook6')

!new Company('ecoFriendlySolutions')
!ecoFriendlySolutions.name := 'Eco Friendly Solutions'
!ecoFriendlySolutions.phone := '333-888-7777'
!ecoFriendlySolutions.website := 'www.ecofriendlysolutions.org'
!ecoFriendlySolutions.email := 'support@ecofriendly.org'
!ecoFriendlySolutions.industry := 'Environmental Services'

!new Person('lucasGreen')
!lucasGreen.name := 'Lucas Green'
!lucasGreen.phone := '777-888-9999'
!lucasGreen.website := 'www.lucasgreenconsultant.com'
!lucasGreen.email := 'lucas.green@ecofriendly.org'
!lucasGreen.title := 'Environmental Scientist'

!new Note('environmentalReportNote')
!environmentalReportNote.author := 'Lucas Green'
!environmentalReportNote.time := Date('2024-01-20')
!environmentalReportNote.type := #EMAIL
!environmentalReportNote.comment := 'Submitted annual environmental impact report'

!new Address('lucasAddress')
!lucasAddress.city := 'Portland'
!lucasAddress.houseNr := '1011'
!lucasAddress.street := 'Forest Avenue'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, ecoFriendlySolutions) into RelationshipToContact
!insert (lucasGreen, employeeRelationship) into ContactToRelationship
!insert (lucasGreen, lucasAddress) into ContactContainsAddress
!insert (lucasGreen, environmentalReportNote) into ContactContainsNote

!new Person('noraBaker')
!noraBaker.name := 'Nora Baker'
!noraBaker.phone := '555-444-3333'
!noraBaker.website := 'www.norabakerlandscape.com'
!noraBaker.email := 'nora.baker@example.com'
!noraBaker.title := 'Landscape Architect'

!new Note('landscapePlanNote')
!landscapePlanNote.author := 'Nora Baker'
!landscapePlanNote.time := Date('2024-02-10')
!landscapePlanNote.type := #CALL
!landscapePlanNote.comment := 'Discuss landscape plans for urban renewal project'

!new Address('noraAddress')
!noraAddress.city := 'Denver'
!noraAddress.houseNr := '1420'
!noraAddress.street := 'Cedar Lane'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, lucasGreen) into RelationshipToContact
!insert (noraBaker, subdivisionRelationship) into ContactToRelationship
!insert (noraBaker, noraAddress) into ContactContainsAddress
!insert (noraBaker, landscapePlanNote) into ContactContainsNote

!new Address('ecoFriendlyAddress')
!ecoFriendlyAddress.city := 'Boulder'
!ecoFriendlyAddress.houseNr := '322'
!ecoFriendlyAddress.street := 'Green Street'

!insert (ecoFriendlySolutions, ecoFriendlyAddress) into ContactContainsAddress

!insert (addressBook6, ecoFriendlySolutions) into AddressBookMadeOfContact
!insert (addressBook6, lucasGreen) into AddressBookMadeOfContact
!insert (addressBook6, noraBaker) into AddressBookMadeOfContact
```
## Generation 6 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Forest Avenue, 1011, Portland
```
```
Cedar Lane, 1420, Denver
```
```
Green Street, 322, Boulder
```

# Generation 7
```
!new AddressBook('addressBook7')

!new Company('healthyLivingCorp')
!healthyLivingCorp.name := 'Healthy Living Corp'
!healthyLivingCorp.phone := '555-999-3333'
!healthyLivingCorp.website := 'www.healthylivingcorp.com'
!healthyLivingCorp.email := 'contact@healthyliving.com'
!healthyLivingCorp.industry := 'Health & Wellness'

!new Person('ameliaClark')
!ameliaClark.name := 'Amelia Clark'
!ameliaClark.phone := '444-555-6666'
!ameliaClark.website := 'www.ameliaclarkfitness.com'
!ameliaClark.email := 'amelia.clark@healthyliving.com'
!ameliaClark.title := 'Nutritionist'

!new Note('nutritionConsultationNote')
!nutritionConsultationNote.author := 'Amelia Clark'
!nutritionConsultationNote.time := Date('2024-03-02')
!nutritionConsultationNote.type := #MEETING
!nutritionConsultationNote.comment := 'Conducted dietary consultation with corporate clients'

!new Address('ameliaAddress')
!ameliaAddress.city := 'Orlando'
!ameliaAddress.houseNr := '1234'
!ameliaAddress.street := 'Health Avenue'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, healthyLivingCorp) into RelationshipToContact
!insert (ameliaClark, employeeRelationship) into ContactToRelationship
!insert (ameliaClark, ameliaAddress) into ContactContainsAddress
!insert (ameliaClark, nutritionConsultationNote) into ContactContainsNote

!new Person('liamJohnson')
!liamJohnson.name := 'Liam Johnson'
!liamJohnson.phone := '333-222-1111'
!liamJohnson.website := 'www.liamjohnsontherapy.com'
!liamJohnson.email := 'liam.johnson@example.com'
!liamJohnson.title := 'Wellness Coach'

!new Note('wellnessProgramNote')
!wellnessProgramNote.author := 'Liam Johnson'
!wellnessProgramNote.time := Date('2024-03-15')
!wellnessProgramNote.type := #EMAIL
!wellnessProgramNote.comment := 'Emailed new wellness program details to participants'

!new Address('liamAddress')
!liamAddress.city := 'Atlanta'
!liamAddress.houseNr := '5678'
!liamAddress.street := 'Peach Street'

!new Relationship('bossRelationship')
!bossRelationship.type := #BOSS

!insert (bossRelationship, ameliaClark) into RelationshipToContact
!insert (liamJohnson, bossRelationship) into ContactToRelationship
!insert (liamJohnson, liamAddress) into ContactContainsAddress
!insert (liamJohnson, wellnessProgramNote) into ContactContainsNote

!new Address('healthyLivingAddress')
!healthyLivingAddress.city := 'Miami'
!healthyLivingAddress.houseNr := '789'
!healthyLivingAddress.street := 'Wellness Blvd'

!insert (healthyLivingCorp, healthyLivingAddress) into ContactContainsAddress

!insert (addressBook7, healthyLivingCorp) into AddressBookMadeOfContact
!insert (addressBook7, ameliaClark) into AddressBookMadeOfContact
!insert (addressBook7, liamJohnson) into AddressBookMadeOfContact
```
## Generation 7 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Peach Street, 5678, Atlanta
```
```
Health Avenue, 1234, Orlando
```
```
Wellness Blvd, 789, Miami
```

# Generation 8
```
!new AddressBook('addressBook8')

!new Company('innovativeEnterprises')
!innovativeEnterprises.name := 'Innovative Enterprises'
!innovativeEnterprises.phone := '321-555-8765'
!innovativeEnterprises.website := 'www.innovativeenterprises.biz'
!innovativeEnterprises.email := 'info@innovative.biz'
!innovativeEnterprises.industry := 'Technology Consulting'

!new Person('hannahMoore')
!hannahMoore.name := 'Hannah Moore'
!hannahMoore.phone := '678-555-4343'
!hannahMoore.website := 'www.hannahmooreconsulting.com'
!hannahMoore.email := 'hannah.moore@innovative.biz'
!hannahMoore.title := 'Chief Technology Officer'

!new Note('strategySessionNote')
!strategySessionNote.author := 'Hannah Moore'
!strategySessionNote.time := Date('2024-04-10')
!strategySessionNote.type := #MEETING
!strategySessionNote.comment := 'Led technology strategy session with potential clients'

!new Address('hannahAddress')
!hannahAddress.city := 'Chicago'
!hannahAddress.houseNr := '3579'
!hannahAddress.street := 'Innovation Drive'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, innovativeEnterprises) into RelationshipToContact
!insert (hannahMoore, subdivisionRelationship) into ContactToRelationship
!insert (hannahMoore, hannahAddress) into ContactContainsAddress
!insert (hannahMoore, strategySessionNote) into ContactContainsNote

!new Person('noahBennett')
!noahBennett.name := 'Noah Bennett'
!noahBennett.phone := '765-555-1234'
!noahBennett.website := 'www.noahbennettsolutions.com'
!noahBennett.email := 'noah.bennett@example.com'
!noahBennett.title := 'Business Analyst'

!new Note('clientFeedbackNote')
!clientFeedbackNote.author := 'Noah Bennett'
!clientFeedbackNote.time := Date('2024-04-22')
!clientFeedbackNote.type := #CALL
!clientFeedbackNote.comment := 'Gathered client feedback for upcoming project proposals'

!new Address('noahAddress')
!noahAddress.city := 'New Orleans'
!noahAddress.houseNr := '963'
!noahAddress.street := 'Jazz Lane'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, hannahMoore) into RelationshipToContact
!insert (noahBennett, employeeRelationship) into ContactToRelationship
!insert (noahBennett, noahAddress) into ContactContainsAddress
!insert (noahBennett, clientFeedbackNote) into ContactContainsNote

!new Address('innovativeEnterprisesAddress')
!innovativeEnterprisesAddress.city := 'Dallas'
!innovativeEnterprisesAddress.houseNr := '482'
!innovativeEnterprisesAddress.street := 'Tech Park'

!insert (innovativeEnterprises, innovativeEnterprisesAddress) into ContactContainsAddress

!insert (addressBook8, innovativeEnterprises) into AddressBookMadeOfContact
!insert (addressBook8, hannahMoore) into AddressBookMadeOfContact
!insert (addressBook8, noahBennett) into AddressBookMadeOfContact
```
## Generation 8 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Innovation Drive, 3579, Chicago
```
```
Jazz Lane, 963, New Orleans
```
```
Tech Park, 482, Dallas
```

# Generation 9
```
!new AddressBook('addressBook9')

!new Company('digitalArtsCo')
!digitalArtsCo.name := 'Digital Arts Co'
!digitalArtsCo.phone := '888-444-2222'
!digitalArtsCo.website := 'www.digitalartsco.com'
!digitalArtsCo.email := 'info@digitalarts.com'
!digitalArtsCo.industry := 'Creative Design'

!new Person('sophieAnderson')
!sophieAnderson.name := 'Sophie Anderson'
!sophieAnderson.phone := '101-202-3030'
!sophieAnderson.website := 'www.sophieandersondesigns.com'
!sophieAnderson.email := 'sophie.anderson@digitalarts.com'
!sophieAnderson.title := 'Art Director'

!new Note('artReviewNote')
!artReviewNote.author := 'Sophie Anderson'
!artReviewNote.time := Date('2024-05-05')
!artReviewNote.type := #MEETING
!artReviewNote.comment := 'Conducted art strategy review with design team'

!new Address('sophieAddress')
!sophieAddress.city := 'San Francisco'
!sophieAddress.houseNr := '4567'
!sophieAddress.street := 'Creative Way'

!new Relationship('bossRelationship')
!bossRelationship.type := #BOSS

!insert (bossRelationship, digitalArtsCo) into RelationshipToContact
!insert (sophieAnderson, bossRelationship) into ContactToRelationship
!insert (sophieAnderson, sophieAddress) into ContactContainsAddress
!insert (sophieAnderson, artReviewNote) into ContactContainsNote

!new Person('ethanMartinez')
!ethanMartinez.name := 'Ethan Martinez'
!ethanMartinez.phone := '404-505-6060'
!ethanMartinez.website := 'www.ethanmartinezgraphics.com'
!ethanMartinez.email := 'ethan.martinez@example.com'
!ethanMartinez.title := 'Graphic Illustrator'

!new Note('projectUpdateNote')
!projectUpdateNote.author := 'Ethan Martinez'
!projectUpdateNote.time := Date('2024-05-10')
!projectUpdateNote.type := #EMAIL
!projectUpdateNote.comment := 'Sent project update to stakeholders'

!new Address('ethanAddress')
!ethanAddress.city := 'Los Angeles'
!ethanAddress.houseNr := '7890'
!ethanAddress.street := 'Artistic Avenue'

!new Relationship('coworkerRelationship')
!coworkerRelationship.type := #COWORKER

!insert (coworkerRelationship, sophieAnderson) into RelationshipToContact
!insert (ethanMartinez, coworkerRelationship) into ContactToRelationship
!insert (ethanMartinez, ethanAddress) into ContactContainsAddress
!insert (ethanMartinez, projectUpdateNote) into ContactContainsNote

!new Address('digitalArtsAddress')
!digitalArtsAddress.city := 'New York'
!digitalArtsAddress.houseNr := '222'
!digitalArtsAddress.street := 'Design Blvd'

!insert (digitalArtsCo, digitalArtsAddress) into ContactContainsAddress

!insert (addressBook9, digitalArtsCo) into AddressBookMadeOfContact
!insert (addressBook9, sophieAnderson) into AddressBookMadeOfContact
!insert (addressBook9, ethanMartinez) into AddressBookMadeOfContact
```
## Generation 9 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Design Blvd, 222, New York
```
```
Artistic Avenue, 7890, Los Angeles
```
```
Creative Way, 4567, San Francisco
```

# Generation 10
```
!new AddressBook('addressBook10')

!new Company('futureTechLabs')
!futureTechLabs.name := 'Future Tech Labs'
!futureTechLabs.phone := '777-333-1111'
!futureTechLabs.website := 'www.futuretechlabs.io'
!futureTechLabs.email := 'contact@futuretech.io'
!futureTechLabs.industry := 'Artificial Intelligence'

!new Person('jacksonWhite')
!jacksonWhite.name := 'Jackson White'
!jacksonWhite.phone := '555-666-7777'
!jacksonWhite.website := 'www.jacksonwhiteai.com'
!jacksonWhite.email := 'jackson.white@futuretech.io'
!jacksonWhite.title := 'Chief AI Strategist'

!new Note('innovationLabNote')
!innovationLabNote.author := 'Jackson White'
!innovationLabNote.time := Date('2024-06-15')
!innovationLabNote.type := #CALL
!innovationLabNote.comment := 'Discussed AI innovation strategies with lab partners'

!new Address('jacksonAddress')
!jacksonAddress.city := 'Austin'
!jacksonAddress.houseNr := '123'
!jacksonAddress.street := 'Tech Innovation St'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, futureTechLabs) into RelationshipToContact
!insert (jacksonWhite, subdivisionRelationship) into ContactToRelationship
!insert (jacksonWhite, jacksonAddress) into ContactContainsAddress
!insert (jacksonWhite, innovationLabNote) into ContactContainsNote

!new Person('lilyParker')
!lilyParker.name := 'Lily Parker'
!lilyParker.phone := '888-999-2222'
!lilyParker.website := 'www.lilyparkerdesigns.com'
!lilyParker.email := 'lily.parker@example.com'
!lilyParker.title := 'AI UX Designer'

!new Note('uiUpdateNote')
!uiUpdateNote.author := 'Lily Parker'
!uiUpdateNote.time := Date('2024-06-21')
!uiUpdateNote.type := #EMAIL
!uiUpdateNote.comment := 'Provided suggestions for AI application UI updates'

!new Address('lilyAddress')
!lilyAddress.city := 'Seattle'
!lilyAddress.houseNr := '456'
!lilyAddress.street := 'Design Loop'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, jacksonWhite) into RelationshipToContact
!insert (lilyParker, employeeRelationship) into ContactToRelationship
!insert (lilyParker, lilyAddress) into ContactContainsAddress
!insert (lilyParker, uiUpdateNote) into ContactContainsNote

!new Address('futureTechAddress')
!futureTechAddress.city := 'San Jose'
!futureTechAddress.houseNr := '890'
!futureTechAddress.street := 'Innovation Blvd'

!insert (futureTechLabs, futureTechAddress) into ContactContainsAddress

!insert (addressBook10, futureTechLabs) into AddressBookMadeOfContact
!insert (addressBook10, jacksonWhite) into AddressBookMadeOfContact
!insert (addressBook10, lilyParker) into AddressBookMadeOfContact
```
## Generation 10 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Tech Innovation St, 123, Austin
```
```
Design Loop, 456, Seattle
```
```
Innovation Blvd, 890, San Jose
```

# Generation 11
```
!new AddressBook('addressBook11')

!new Company('greenThumbsGardening')
!greenThumbsGardening.name := 'Green Thumbs Gardening'
!greenThumbsGardening.phone := '999-777-5555'
!greenThumbsGardening.website := 'www.greenthumbsgardening.net'
!greenThumbsGardening.email := 'support@greenthumbs.net'
!greenThumbsGardening.industry := 'Landscaping Services'

!new Person('willowDavis')
!willowDavis.name := 'Willow Davis'
!willowDavis.phone := '321-555-6543'
!willowDavis.website := 'www.willowdavislandscape.com'
!willowDavis.email := 'willow.davis@greenthumbs.net'
!willowDavis.title := 'Senior Landscape Designer'

!new Note('landscapeReviewNote')
!landscapeReviewNote.author := 'Willow Davis'
!landscapeReviewNote.time := Date('2024-07-05')
!landscapeReviewNote.type := #MEETING
!landscapeReviewNote.comment := 'Reviewed new garden layout designs with clients'

!new Address('willowAddress')
!willowAddress.city := 'Portland'
!willowAddress.houseNr := '302'
!willowAddress.street := 'Garden Lane'

!new Relationship('bossRelationship')
!bossRelationship.type := #BOSS

!insert (bossRelationship, greenThumbsGardening) into RelationshipToContact
!insert (willowDavis, bossRelationship) into ContactToRelationship
!insert (willowDavis, willowAddress) into ContactContainsAddress
!insert (willowDavis, landscapeReviewNote) into ContactContainsNote

!new Person('tomRivera')
!tomRivera.name := 'Tom Rivera'
!tomRivera.phone := '456-555-7890'
!tomRivera.website := 'www.tomriveradesigns.com'
!tomRivera.email := 'tom.rivera@example.com'
!tomRivera.title := 'Botanical Consultant'

!new Note('botanicalConsultNote')
!botanicalConsultNote.author := 'Tom Rivera'
!botanicalConsultNote.time := Date('2024-07-12')
!botanicalConsultNote.type := #CALL
!botanicalConsultNote.comment := 'Provided consulting on plant selection for a sustainable garden project'

!new Address('tomAddress')
!tomAddress.city := 'Phoenix'
!tomAddress.houseNr := '1001'
!tomAddress.street := 'Botanic Boulevard'

!new Relationship('coworkerRelationship')
!coworkerRelationship.type := #COWORKER

!insert (coworkerRelationship, willowDavis) into RelationshipToContact
!insert (tomRivera, coworkerRelationship) into ContactToRelationship
!insert (tomRivera, tomAddress) into ContactContainsAddress
!insert (tomRivera, botanicalConsultNote) into ContactContainsNote

!new Address('greenThumbsAddress')
!greenThumbsAddress.city := 'Denver'
!greenThumbsAddress.houseNr := '400'
!greenThumbsAddress.street := 'Flora Road'

!insert (greenThumbsGardening, greenThumbsAddress) into ContactContainsAddress

!insert (addressBook11, greenThumbsGardening) into AddressBookMadeOfContact
!insert (addressBook11, willowDavis) into AddressBookMadeOfContact
!insert (addressBook11, tomRivera) into AddressBookMadeOfContact
```
## Generation 11 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Botanic Boulevard, 1001, Phoenix
```
```
Flora Road, 400, Denver
```
```
Garden Lane, 302, Portland
```

# Generation 12
```
!new AddressBook('addressBook12')

!new Company('stellarMediaGroup')
!stellarMediaGroup.name := 'Stellar Media Group'
!stellarMediaGroup.phone := '800-555-0000'
!stellarMediaGroup.website := 'www.stellarmediagroup.com'
!stellarMediaGroup.email := 'contact@stellarmedia.com'
!stellarMediaGroup.industry := 'Digital Marketing'

!new Person('oliviaCampbell')
!oliviaCampbell.name := 'Olivia Campbell'
!oliviaCampbell.phone := '312-555-2468'
!oliviaCampbell.website := 'www.oliviacampbellmarketing.com'
!oliviaCampbell.email := 'olivia.campbell@stellarmedia.com'
!oliviaCampbell.title := 'Digital Marketing Strategist'

!new Note('campaignLaunchNote')
!campaignLaunchNote.author := 'Olivia Campbell'
!campaignLaunchNote.time := Date('2024-08-15')
!campaignLaunchNote.type := #EMAIL
!campaignLaunchNote.comment := 'Launched new social media campaign for client engagement'

!new Address('oliviaAddress')
!oliviaAddress.city := 'Chicago'
!oliviaAddress.houseNr := '783'
!oliviaAddress.street := 'Marketing Avenue'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, stellarMediaGroup) into RelationshipToContact
!insert (oliviaCampbell, employeeRelationship) into ContactToRelationship
!insert (oliviaCampbell, oliviaAddress) into ContactContainsAddress
!insert (oliviaCampbell, campaignLaunchNote) into ContactContainsNote

!new Person('danielMurphy')
!danielMurphy.name := 'Daniel Murphy'
!danielMurphy.phone := '678-555-4321'
!danielMurphy.website := 'www.danielmurphydesign.com'
!danielMurphy.email := 'daniel.murphy@example.com'
!danielMurphy.title := 'Creative Director'

!new Note('creativeDirectionNote')
!creativeDirectionNote.author := 'Daniel Murphy'
!creativeDirectionNote.time := Date('2024-08-20')
!creativeDirectionNote.type := #MEETING
!creativeDirectionNote.comment := 'Directed brainstorming session for creative content ideas'

!new Address('danielAddress')
!danielAddress.city := 'Boston'
!danielAddress.houseNr := '158'
!danielAddress.street := 'Creative Court'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, oliviaCampbell) into RelationshipToContact
!insert (danielMurphy, subdivisionRelationship) into ContactToRelationship
!insert (danielMurphy, danielAddress) into ContactContainsAddress
!insert (danielMurphy, creativeDirectionNote) into ContactContainsNote

!new Address('stellarMediaAddress')
!stellarMediaAddress.city := 'San Francisco'
!stellarMediaAddress.houseNr := '902'
!stellarMediaAddress.street := 'Media Lane'

!insert (stellarMediaGroup, stellarMediaAddress) into ContactContainsAddress

!insert (addressBook12, stellarMediaGroup) into AddressBookMadeOfContact
!insert (addressBook12, oliviaCampbell) into AddressBookMadeOfContact
!insert (addressBook12, danielMurphy) into AddressBookMadeOfContact
```
## Generation 12 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Creative Court, 158, Boston
```
```
Media Lane, 902, San Francisco
```
```
Marketing Avenue, 783, Chicago
```

# Generation 13
```
!new AddressBook('addressBook13')

!new Company('adventureTravelCo')
!adventureTravelCo.name := 'Adventure Travel Co'
!adventureTravelCo.phone := '555-233-4455'
!adventureTravelCo.website := 'www.adventuretravelco.com'
!adventureTravelCo.email := 'info@adventuretravel.com'
!adventureTravelCo.industry := 'Travel and Tourism'

!new Person('avaNelson')
!avaNelson.name := 'Ava Nelson'
!avaNelson.phone := '444-555-1234'
!avaNelson.website := 'www.avanelsontours.com'
!avaNelson.email := 'ava.nelson@adventuretravel.com'
!avaNelson.title := 'Tour Manager'

!new Note('clientTourNote')
!clientTourNote.author := 'Ava Nelson'
!clientTourNote.time := Date('2024-09-10')
!clientTourNote.type := #CALL
!clientTourNote.comment := 'Discussed itinerary with clients for upcoming adventure tour'

!new Address('avaAddress')
!avaAddress.city := 'Denver'
!avaAddress.houseNr := '657'
!avaAddress.street := 'Tourist Trail'

!new Relationship('bossRelationship')
!bossRelationship.type := #BOSS

!insert (bossRelationship, adventureTravelCo) into RelationshipToContact
!insert (avaNelson, bossRelationship) into ContactToRelationship
!insert (avaNelson, avaAddress) into ContactContainsAddress
!insert (avaNelson, clientTourNote) into ContactContainsNote

!new Person('jackSullivan')
!jackSullivan.name := 'Jack Sullivan'
!jackSullivan.phone := '333-666-7890'
!jackSullivan.website := 'www.jacksullivanadventures.com'
!jackSullivan.email := 'jack.sullivan@example.com'
!jackSullivan.title := 'Adventure Guide'

!new Note('routePlanningNote')
!routePlanningNote.author := 'Jack Sullivan'
!routePlanningNote.time := Date('2024-09-15')
!routePlanningNote.type := #EMAIL
!routePlanningNote.comment := 'Planned new routes for mountain expeditions and updated team'

!new Address('jackAddress')
!jackAddress.city := 'Salt Lake City'
!jackAddress.houseNr := '534'
!jackAddress.street := 'Explorer Lane'

!new Relationship('coworkerRelationship')
!coworkerRelationship.type := #COWORKER

!insert (coworkerRelationship, avaNelson) into RelationshipToContact
!insert (jackSullivan, coworkerRelationship) into ContactToRelationship
!insert (jackSullivan, jackAddress) into ContactContainsAddress
!insert (jackSullivan, routePlanningNote) into ContactContainsNote

!new Address('adventureTravelAddress')
!adventureTravelAddress.city := 'Seattle'
!adventureTravelAddress.houseNr := '777'
!adventureTravelAddress.street := 'Expedition Blvd'

!insert (adventureTravelCo, adventureTravelAddress) into ContactContainsAddress

!insert (addressBook13, adventureTravelCo) into AddressBookMadeOfContact
!insert (addressBook13, avaNelson) into AddressBookMadeOfContact
!insert (addressBook13, jackSullivan) into AddressBookMadeOfContact
```
## Generation 13 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Expedition Blvd, 777, Seattle
```
```
Tourist Trail, 657, Denver
```
```
Explorer Lane, 534, Salt Lake City
```

# Generation 14
```
!new AddressBook('addressBook14')

!new Company('urbanEats')
!urbanEats.name := 'Urban Eats'
!urbanEats.phone := '555-321-4321'
!urbanEats.website := 'www.urbaneats.com'
!urbanEats.email := 'contact@urbaneats.com'
!urbanEats.industry := 'Culinary Arts'

!new Person('chloeBishop')
!chloeBishop.name := 'Chloe Bishop'
!chloeBishop.phone := '999-888-7777'
!chloeBishop.website := 'www.chloebishopcuisine.com'
!chloeBishop.email := 'chloe.bishop@urbaneats.com'
!chloeBishop.title := 'Head Chef'

!new Note('recipeDevelopmentNote')
!recipeDevelopmentNote.author := 'Chloe Bishop'
!recipeDevelopmentNote.time := Date('2024-10-03')
!recipeDevelopmentNote.type := #MEETING
!recipeDevelopmentNote.comment := 'Developed new seasonal recipes with the culinary team'

!new Address('chloeAddress')
!chloeAddress.city := 'Minneapolis'
!chloeAddress.houseNr := '6789'
!chloeAddress.street := 'Chef Boulevard'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, urbanEats) into RelationshipToContact
!insert (chloeBishop, employeeRelationship) into ContactToRelationship
!insert (chloeBishop, chloeAddress) into ContactContainsAddress
!insert (chloeBishop, recipeDevelopmentNote) into ContactContainsNote

!new Person('loganScott')
!loganScott.name := 'Logan Scott'
!loganScott.phone := '222-555-4444'
!loganScott.website := 'www.loganscottbartender.com'
!loganScott.email := 'logan.scott@example.com'
!loganScott.title := 'Mixologist'

!new Note('cocktailInnovationNote')
!cocktailInnovationNote.author := 'Logan Scott'
!cocktailInnovationNote.time := Date('2024-10-10')
!cocktailInnovationNote.type := #CALL
!cocktailInnovationNote.comment := 'Discussed cocktail innovation ideas and menu updates'

!new Address('loganAddress')
!loganAddress.city := 'Austin'
!loganAddress.houseNr := '3456'
!loganAddress.street := 'Mix Lane'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, chloeBishop) into RelationshipToContact
!insert (loganScott, subdivisionRelationship) into ContactToRelationship
!insert (loganScott, loganAddress) into ContactContainsAddress
!insert (loganScott, cocktailInnovationNote) into ContactContainsNote

!new Address('urbanEatsAddress')
!urbanEatsAddress.city := 'Chicago'
!urbanEatsAddress.houseNr := '1200'
!urbanEatsAddress.street := 'Gourmet Street'

!insert (urbanEats, urbanEatsAddress) into ContactContainsAddress

!insert (addressBook14, urbanEats) into AddressBookMadeOfContact
!insert (addressBook14, chloeBishop) into AddressBookMadeOfContact
!insert (addressBook14, loganScott) into AddressBookMadeOfContact
```
## Generation 14 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Mix Lane, 3456, Austin
```
```
Gourmet Street, 1200, Chicago
```
```
Chef Boulevard, 6789, Minneapolis
```

# Generation 15
```
!new AddressBook('addressBook15')

!new Company('techInnovationsInc')
!techInnovationsInc.name := 'Tech Innovations Inc'
!techInnovationsInc.phone := '123-456-7890'
!techInnovationsInc.website := 'www.techinnovations.com'
!techInnovationsInc.email := 'info@techinnovations.com'
!techInnovationsInc.industry := 'Software Development'

!new Person('lucasTurner')
!lucasTurner.name := 'Lucas Turner'
!lucasTurner.phone := '555-123-4567'
!lucasTurner.website := 'www.lucasturnerdev.com'
!lucasTurner.email := 'lucas.turner@techinnovations.com'
!lucasTurner.title := 'Lead Software Engineer'

!new Note('developmentSprintNote')
!developmentSprintNote.author := 'Lucas Turner'
!developmentSprintNote.time := Date('2024-11-01')
!developmentSprintNote.type := #MEETING
!developmentSprintNote.comment := 'Led sprint planning meeting for software development team'

!new Address('lucasAddress')
!lucasAddress.city := 'San Francisco'
!lucasAddress.houseNr := '456'
!lucasAddress.street := 'Silicon Avenue'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, techInnovationsInc) into RelationshipToContact
!insert (lucasTurner, employeeRelationship) into ContactToRelationship
!insert (lucasTurner, lucasAddress) into ContactContainsAddress
!insert (lucasTurner, developmentSprintNote) into ContactContainsNote

!new Person('emmaBrooks')
!emmaBrooks.name := 'Emma Brooks'
!emmaBrooks.phone := '987-654-3210'
!emmaBrooks.website := 'www.emmabrookstesting.com'
!emmaBrooks.email := 'emma.brooks@example.com'
!emmaBrooks.title := 'Quality Assurance Specialist'

!new Note('qaReviewNote')
!qaReviewNote.author := 'Emma Brooks'
!qaReviewNote.time := Date('2024-11-10')
!qaReviewNote.type := #CALL
!qaReviewNote.comment := 'Reviewed software testing procedures with QA team'

!new Address('emmaAddress')
!emmaAddress.city := 'New York'
!emmaAddress.houseNr := '789'
!emmaAddress.street := 'Testing Lane'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, lucasTurner) into RelationshipToContact
!insert (emmaBrooks, subdivisionRelationship) into ContactToRelationship
!insert (emmaBrooks, emmaAddress) into ContactContainsAddress
!insert (emmaBrooks, qaReviewNote) into ContactContainsNote

!new Address('techInnovationsAddress')
!techInnovationsAddress.city := 'Los Angeles'
!techInnovationsAddress.houseNr := '321'
!techInnovationsAddress.street := 'Innovation Blvd'

!insert (techInnovationsInc, techInnovationsAddress) into ContactContainsAddress

!insert (addressBook15, techInnovationsInc) into AddressBookMadeOfContact
!insert (addressBook15, lucasTurner) into AddressBookMadeOfContact
!insert (addressBook15, emmaBrooks) into AddressBookMadeOfContact
```
## Generation 15 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Innovation Blvd, 321, Los Angeles
```
```
Silicon Avenue, 456, San Francisco
```
```
Testing Lane, 789, New York
```

# Generation 16
```
!new AddressBook('addressBook16')

!new Company('freshHarvestOrganics')
!freshHarvestOrganics.name := 'Fresh Harvest Organics'
!freshHarvestOrganics.phone := '111-222-3333'
!freshHarvestOrganics.website := 'www.freshharvestorganics.com'
!freshHarvestOrganics.email := 'info@freshharvest.com'
!freshHarvestOrganics.industry := 'Organic Farming'

!new Person('ninaReynolds')
!ninaReynolds.name := 'Nina Reynolds'
!ninaReynolds.phone := '444-555-6666'
!ninaReynolds.website := 'www.ninareynoldsorganics.com'
!ninaReynolds.email := 'nina.reynolds@freshharvest.com'
!ninaReynolds.title := 'Chief Agricultural Officer'

!new Note('organicCertificationNote')
!organicCertificationNote.author := 'Nina Reynolds'
!organicCertificationNote.time := Date('2024-12-05')
!organicCertificationNote.type := #EMAIL
!organicCertificationNote.comment := 'Coordinated organic certification process for new produce line'

!new Address('ninaAddress')
!ninaAddress.city := 'Madison'
!ninaAddress.houseNr := '100'
!ninaAddress.street := 'Harvest Lane'

!new Relationship('bossRelationship')
!bossRelationship.type := #BOSS

!insert (bossRelationship, freshHarvestOrganics) into RelationshipToContact
!insert (ninaReynolds, bossRelationship) into ContactToRelationship
!insert (ninaReynolds, ninaAddress) into ContactContainsAddress
!insert (ninaReynolds, organicCertificationNote) into ContactContainsNote

!new Person('dylanMorris')
!dylanMorris.name := 'Dylan Morris'
!dylanMorris.phone := '777-888-9999'
!dylanMorris.website := 'www.dylanmorrisagriculture.com'
!dylanMorris.email := 'dylan.morris@example.com'
!dylanMorris.title := 'Farm Operations Manager'

!new Note('harvestPlanningNote')
!harvestPlanningNote.author := 'Dylan Morris'
!harvestPlanningNote.time := Date('2024-12-12')
!harvestPlanningNote.type := #MEETING
!harvestPlanningNote.comment := 'Conducted meeting for upcoming harvest planning and logistics'

!new Address('dylanAddress')
!dylanAddress.city := 'Des Moines'
!dylanAddress.houseNr := '222'
!dylanAddress.street := 'Field Road'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, ninaReynolds) into RelationshipToContact
!insert (dylanMorris, subdivisionRelationship) into ContactToRelationship
!insert (dylanMorris, dylanAddress) into ContactContainsAddress
!insert (dylanMorris, harvestPlanningNote) into ContactContainsNote

!new Address('freshHarvestAddress')
!freshHarvestAddress.city := 'Iowa City'
!freshHarvestAddress.houseNr := '678'
!freshHarvestAddress.street := 'Organic Avenue'

!insert (freshHarvestOrganics, freshHarvestAddress) into ContactContainsAddress

!insert (addressBook16, freshHarvestOrganics) into AddressBookMadeOfContact
!insert (addressBook16, ninaReynolds) into AddressBookMadeOfContact
!insert (addressBook16, dylanMorris) into AddressBookMadeOfContact
```
## Generation 16 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Harvest Lane, 100, Madison
```
```
Field Road, 222, Des Moines
```
```
Organic Avenue, 678, Iowa City
```

# Generation 17
```
!new AddressBook('addressBook17')

!new Company('soundWavesMusic')
!soundWavesMusic.name := 'Sound Waves Music'
!soundWavesMusic.phone := '777-888-1234'
!soundWavesMusic.website := 'www.soundwavesmusic.com'
!soundWavesMusic.email := 'contact@soundwavesmusic.com'
!soundWavesMusic.industry := 'Music Production'

!new Person('juliaHayes')
!juliaHayes.name := 'Julia Hayes'
!juliaHayes.phone := '222-333-4444'
!juliaHayes.website := 'www.juliahayesmusic.com'
!juliaHayes.email := 'julia.hayes@soundwavesmusic.com'
!juliaHayes.title := 'Music Producer'

!new Note('albumReleaseNote')
!albumReleaseNote.author := 'Julia Hayes'
!albumReleaseNote.time := Date('2025-01-10')
!albumReleaseNote.type := #EMAIL
!albumReleaseNote.comment := 'Finalized details for upcoming album release event'

!new Address('juliaAddress')
!juliaAddress.city := 'Nashville'
!juliaAddress.houseNr := '101'
!juliaAddress.street := 'Music Row'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, soundWavesMusic) into RelationshipToContact
!insert (juliaHayes, employeeRelationship) into ContactToRelationship
!insert (juliaHayes, juliaAddress) into ContactContainsAddress
!insert (juliaHayes, albumReleaseNote) into ContactContainsNote

!new Person('ryanMiller')
!ryanMiller.name := 'Ryan Miller'
!ryanMiller.phone := '555-444-3333'
!ryanMiller.website := 'www.ryanmillerdrums.com'
!ryanMiller.email := 'ryan.miller@example.com'
!ryanMiller.title := 'Studio Drummer'

!new Note('recordingSessionNote')
!recordingSessionNote.author := 'Ryan Miller'
!recordingSessionNote.time := Date('2025-01-15')
!recordingSessionNote.type := #MEETING
!recordingSessionNote.comment := 'Attended recording session for new artists album'

!new Address('ryanAddress')
!ryanAddress.city := 'Memphis'
!ryanAddress.houseNr := '250'
!ryanAddress.street := 'Jazz Avenue'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, juliaHayes) into RelationshipToContact
!insert (ryanMiller, subdivisionRelationship) into ContactToRelationship
!insert (ryanMiller, ryanAddress) into ContactContainsAddress
!insert (ryanMiller, recordingSessionNote) into ContactContainsNote

!new Address('soundWavesAddress')
!soundWavesAddress.city := 'Los Angeles'
!soundWavesAddress.houseNr := '555'
!soundWavesAddress.street := 'Melody Lane'

!insert (soundWavesMusic, soundWavesAddress) into ContactContainsAddress

!insert (addressBook17, soundWavesMusic) into AddressBookMadeOfContact
!insert (addressBook17, juliaHayes) into AddressBookMadeOfContact
!insert (addressBook17, ryanMiller) into AddressBookMadeOfContact
```
## Generation 17 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Melody Lane, 555, Los Angeles
```
```
Music Row, 101, Nashville
```
```
Jazz Avenue, 250, Memphis
```

# Generation 18
```
!new AddressBook('addressBook18')

!new Company('ecoTechSolutions')
!ecoTechSolutions.name := 'EcoTech Solutions'
!ecoTechSolutions.phone := '888-999-0000'
!ecoTechSolutions.website := 'www.ecotechsolutions.org'
!ecoTechSolutions.email := 'info@ecotechsolutions.org'
!ecoTechSolutions.industry := 'Clean Technology'

!new Person('sophiaLiu')
!sophiaLiu.name := 'Sophia Liu'
!sophiaLiu.phone := '333-444-5555'
!sophiaLiu.website := 'www.sophialiuconsulting.com'
!sophiaLiu.email := 'sophia.liu@ecotechsolutions.org'
!sophiaLiu.title := 'Renewable Energy Consultant'

!new Note('sustainabilityMeetingNote')
!sustainabilityMeetingNote.author := 'Sophia Liu'
!sustainabilityMeetingNote.time := Date('2025-02-10')
!sustainabilityMeetingNote.type := #MEETING
!sustainabilityMeetingNote.comment := 'Led a meeting on sustainable energy practices'

!new Address('sophiaAddress')
!sophiaAddress.city := 'Seattle'
!sophiaAddress.houseNr := '220'
!sophiaAddress.street := 'Green Road'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, ecoTechSolutions) into RelationshipToContact
!insert (sophiaLiu, employeeRelationship) into ContactToRelationship
!insert (sophiaLiu, sophiaAddress) into ContactContainsAddress
!insert (sophiaLiu, sustainabilityMeetingNote) into ContactContainsNote

!new Person('ethanCole')
!ethanCole.name := 'Ethan Cole'
!ethanCole.phone := '444-555-6767'
!ethanCole.website := 'www.ethancoleenergy.com'
!ethanCole.email := 'ethan.cole@example.com'
!ethanCole.title := 'Environmental Scientist'

!new Note('researchDiscussionNote')
!researchDiscussionNote.author := 'Ethan Cole'
!researchDiscussionNote.time := Date('2025-02-18')
!researchDiscussionNote.type := #CALL
!researchDiscussionNote.comment := 'Discussed latest research on eco-friendly technologies'

!new Address('ethanAddress')
!ethanAddress.city := 'Portland'
!ethanAddress.houseNr := '309'
!ethanAddress.street := 'Sustainability Street'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, sophiaLiu) into RelationshipToContact
!insert (ethanCole, subdivisionRelationship) into ContactToRelationship
!insert (ethanCole, ethanAddress) into ContactContainsAddress
!insert (ethanCole, researchDiscussionNote) into ContactContainsNote

!new Address('ecoTechAddress')
!ecoTechAddress.city := 'San Francisco'
!ecoTechAddress.houseNr := '900'
!ecoTechAddress.street := 'Eco Avenue'

!insert (ecoTechSolutions, ecoTechAddress) into ContactContainsAddress

!insert (addressBook18, ecoTechSolutions) into AddressBookMadeOfContact
!insert (addressBook18, sophiaLiu) into AddressBookMadeOfContact
!insert (addressBook18, ethanCole) into AddressBookMadeOfContact
```
## Generation 18 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Green Road, 220, Seattle
```
```
Sustainability Street, 309, Portland
```
```
Eco Avenue, 900, San Francisco
```

# Generation 19
```
!new AddressBook('addressBook19')

!new Company('artisanBakes')
!artisanBakes.name := 'Artisan Bakes'
!artisanBakes.phone := '123-456-7890'
!artisanBakes.website := 'www.artisanbakes.com'
!artisanBakes.email := 'contact@artisanbakes.com'
!artisanBakes.industry := 'Bakery'

!new Person('claraJenkins')
!claraJenkins.name := 'Clara Jenkins'
!claraJenkins.phone := '321-654-9870'
!claraJenkins.website := 'www.clarajenkinsbakery.com'
!claraJenkins.email := 'clara.jenkins@artisanbakes.com'
!claraJenkins.title := 'Master Baker'

!new Note('menuPlanningNote')
!menuPlanningNote.author := 'Clara Jenkins'
!menuPlanningNote.time := Date('2025-03-12')
!menuPlanningNote.type := #MEETING
!menuPlanningNote.comment := 'Planned new menu items for the spring season'

!new Address('claraAddress')
!claraAddress.city := 'Boston'
!claraAddress.houseNr := '456'
!claraAddress.street := 'Baker Street'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, artisanBakes) into RelationshipToContact
!insert (claraJenkins, employeeRelationship) into ContactToRelationship
!insert (claraJenkins, claraAddress) into ContactContainsAddress
!insert (claraJenkins, menuPlanningNote) into ContactContainsNote

!new Person('henryWilliams')
!henryWilliams.name := 'Henry Williams'
!henryWilliams.phone := '456-789-0123'
!henryWilliams.website := 'www.henrywilliamsrecipes.com'
!henryWilliams.email := 'henry.williams@example.com'
!henryWilliams.title := 'Pastry Chef'

!new Note('recipeInnovationNote')
!recipeInnovationNote.author := 'Henry Williams'
!recipeInnovationNote.time := Date('2025-03-20')
!recipeInnovationNote.type := #CALL
!recipeInnovationNote.comment := 'Explored innovative pastry recipes with the team'

!new Address('henryAddress')
!henryAddress.city := 'Chicago'
!henryAddress.houseNr := '789'
!henryAddress.street := 'Pastry Lane'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, claraJenkins) into RelationshipToContact
!insert (henryWilliams, subdivisionRelationship) into ContactToRelationship
!insert (henryWilliams, henryAddress) into ContactContainsAddress
!insert (henryWilliams, recipeInnovationNote) into ContactContainsNote

!new Address('artisanBakesAddress')
!artisanBakesAddress.city := 'New York'
!artisanBakesAddress.houseNr := '234'
!artisanBakesAddress.street := 'Gourmet Way'

!insert (artisanBakes, artisanBakesAddress) into ContactContainsAddress

!insert (addressBook19, artisanBakes) into AddressBookMadeOfContact
!insert (addressBook19, claraJenkins) into AddressBookMadeOfContact
!insert (addressBook19, henryWilliams) into AddressBookMadeOfContact
```
## Generation 19 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Pastry Lane, 789, Chicago
```
```
Gourmet Way, 234, New York
```

# Generation 20
```
!new AddressBook('addressBook20')

!new Company('urbanCycleFitness')
!urbanCycleFitness.name := 'Urban Cycle Fitness'
!urbanCycleFitness.phone := '777-888-2222'
!urbanCycleFitness.website := 'www.urbancyclefitness.com'
!urbanCycleFitness.email := 'info@urbancyclefitness.com'
!urbanCycleFitness.industry := 'Health & Fitness'

!new Person('noraAdams')
!noraAdams.name := 'Nora Adams'
!noraAdams.phone := '888-999-1111'
!noraAdams.website := 'www.noraadamsfitness.com'
!noraAdams.email := 'nora.adams@urbancyclefitness.com'
!noraAdams.title := 'Head Instructor'

!new Note('classScheduleNote')
!classScheduleNote.author := 'Nora Adams'
!classScheduleNote.time := Date('2025-04-05')
!classScheduleNote.type := #MEETING
!classScheduleNote.comment := 'Scheduled new cycling classes for the upcoming quarter'

!new Address('noraAddress')
!noraAddress.city := 'San Diego'
!noraAddress.houseNr := '500'
!noraAddress.street := 'Fitness Lane'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, urbanCycleFitness) into RelationshipToContact
!insert (noraAdams, employeeRelationship) into ContactToRelationship
!insert (noraAdams, noraAddress) into ContactContainsAddress
!insert (noraAdams, classScheduleNote) into ContactContainsNote

!new Person('jakeTurner')
!jakeTurner.name := 'Jake Turner'
!jakeTurner.phone := '555-666-7777'
!jakeTurner.website := 'www.jaketurnerfitness.com'
!jakeTurner.email := 'jake.turner@example.com'
!jakeTurner.title := 'Personal Trainer'

!new Note('fitnessAssessmentNote')
!fitnessAssessmentNote.author := 'Jake Turner'
!fitnessAssessmentNote.time := Date('2025-04-15')
!fitnessAssessmentNote.type := #CALL
!fitnessAssessmentNote.comment := 'Conducted fitness assessments for new clients'

!new Address('jakeAddress')
!jakeAddress.city := 'Phoenix'
!jakeAddress.houseNr := '602'
!jakeAddress.street := 'Strength Street'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, noraAdams) into RelationshipToContact
!insert (jakeTurner, subdivisionRelationship) into ContactToRelationship
!insert (jakeTurner, jakeAddress) into ContactContainsAddress
!insert (jakeTurner, fitnessAssessmentNote) into ContactContainsNote

!new Address('urbanCycleFitnessAddress')
!urbanCycleFitnessAddress.city := 'Austin'
!urbanCycleFitnessAddress.houseNr := '101'
!urbanCycleFitnessAddress.street := 'Cycle Avenue'

!insert (urbanCycleFitness, urbanCycleFitnessAddress) into ContactContainsAddress

!insert (addressBook20, urbanCycleFitness) into AddressBookMadeOfContact
!insert (addressBook20, noraAdams) into AddressBookMadeOfContact
!insert (addressBook20, jakeTurner) into AddressBookMadeOfContact
```
## Generation 20 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Strength Street, 602, Phoenix
```
```
Cycle Avenue, 101, Austin
```
```
Fitness Lane, 500, San Diego
```

# Generation 21
```
!new AddressBook('addressBook21')

!new Company('skyHighAdventures')
!skyHighAdventures.name := 'Sky High Adventures'
!skyHighAdventures.phone := '444-555-6666'
!skyHighAdventures.website := 'www.skyhighadventures.com'
!skyHighAdventures.email := 'info@skyhighadventures.com'
!skyHighAdventures.industry := 'Adventure Tourism'

!new Person('miaSullivan')
!miaSullivan.name := 'Mia Sullivan'
!miaSullivan.phone := '222-333-1234'
!miaSullivan.website := 'www.miasullivanadventures.com'
!miaSullivan.email := 'mia.sullivan@skyhighadventures.com'
!miaSullivan.title := 'Adventure Coordinator'

!new Note('expeditionPlanningNote')
!expeditionPlanningNote.author := 'Mia Sullivan'
!expeditionPlanningNote.time := Date('2025-05-12')
!expeditionPlanningNote.type := #MEETING
!expeditionPlanningNote.comment := 'Planned next quarter expedition routes and logistics'

!new Address('miaAddress')
!miaAddress.city := 'Denver'
!miaAddress.houseNr := '458'
!miaAddress.street := 'Adventure Rd'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, skyHighAdventures) into RelationshipToContact
!insert (miaSullivan, employeeRelationship) into ContactToRelationship
!insert (miaSullivan, miaAddress) into ContactContainsAddress
!insert (miaSullivan, expeditionPlanningNote) into ContactContainsNote

!new Person('simonCarter')
!simonCarter.name := 'Simon Carter'
!simonCarter.phone := '555-789-6789'
!simonCarter.website := 'www.simoncartertrips.com'
!simonCarter.email := 'simon.carter@example.com'
!simonCarter.title := 'Outdoor Guide'

!new Note('clientSafetyBriefingNote')
!clientSafetyBriefingNote.author := 'Simon Carter'
!clientSafetyBriefingNote.time := Date('2025-05-20')
!clientSafetyBriefingNote.type := #CALL
!clientSafetyBriefingNote.comment := 'Conducted safety briefing for upcoming alpine tours'

!new Address('simonAddress')
!simonAddress.city := 'Boulder'
!simonAddress.houseNr := '112'
!simonAddress.street := 'Trailhead St'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, miaSullivan) into RelationshipToContact
!insert (simonCarter, subdivisionRelationship) into ContactToRelationship
!insert (simonCarter, simonAddress) into ContactContainsAddress
!insert (simonCarter, clientSafetyBriefingNote) into ContactContainsNote

!new Address('skyHighAdventuresAddress')
!skyHighAdventuresAddress.city := 'San Francisco'
!skyHighAdventuresAddress.houseNr := '321'
!skyHighAdventuresAddress.street := 'Expedition Blvd'

!insert (skyHighAdventures, skyHighAdventuresAddress) into ContactContainsAddress

!insert (addressBook21, skyHighAdventures) into AddressBookMadeOfContact
!insert (addressBook21, miaSullivan) into AddressBookMadeOfContact
!insert (addressBook21, simonCarter) into AddressBookMadeOfContact
```
## Generation 21 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Trailhead St, 112, Boulder
```
```
Adventure Rd, 458, Denver
```
```
Expedition Blvd, 321, San Francisco
```

# Generation 22
```
!new AddressBook('addressBook22')

!new Company('innovativeCulinaryArts')
!innovativeCulinaryArts.name := 'Innovative Culinary Arts'
!innovativeCulinaryArts.phone := '333-222-7890'
!innovativeCulinaryArts.website := 'www.innovativeculinaryarts.com'
!innovativeCulinaryArts.email := 'info@culinaryarts.com'
!innovativeCulinaryArts.industry := 'Culinary Consulting'

!new Person('ameliaTurner')
!ameliaTurner.name := 'Amelia Turner'
!ameliaTurner.phone := '444-777-8888'
!ameliaTurner.website := 'www.ameliaturnercuisine.com'
!ameliaTurner.email := 'amelia.turner@culinaryarts.com'
!ameliaTurner.title := 'Culinary Consultant'

!new Note('kitchenInnovationNote')
!kitchenInnovationNote.author := 'Amelia Turner'
!kitchenInnovationNote.time := Date('2025-06-08')
!kitchenInnovationNote.type := #EMAIL
!kitchenInnovationNote.comment := 'Discussed innovative kitchen layouts with restaurant clients'

!new Address('ameliaAddress')
!ameliaAddress.city := 'Austin'
!ameliaAddress.houseNr := '789'
!ameliaAddress.street := 'Cuisine Court'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, innovativeCulinaryArts) into RelationshipToContact
!insert (ameliaTurner, employeeRelationship) into ContactToRelationship
!insert (ameliaTurner, ameliaAddress) into ContactContainsAddress
!insert (ameliaTurner, kitchenInnovationNote) into ContactContainsNote

!new Person('marcoDiaz')
!marcoDiaz.name := 'Marco Diaz'
!marcoDiaz.phone := '555-987-6543'
!marcoDiaz.website := 'www.marcodiazrecipes.com'
!marcoDiaz.email := 'marco.diaz@example.com'
!marcoDiaz.title := 'Menu Developer'

!new Note('summerMenuNote')
!summerMenuNote.author := 'Marco Diaz'
!summerMenuNote.time := Date('2025-06-15')
!summerMenuNote.type := #CALL
!summerMenuNote.comment := 'Developed and discussed new summer menu items with team'

!new Address('marcoAddress')
!marcoAddress.city := 'Miami'
!marcoAddress.houseNr := '357'
!marcoAddress.street := 'Flavors Ave'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, ameliaTurner) into RelationshipToContact
!insert (marcoDiaz, subdivisionRelationship) into ContactToRelationship
!insert (marcoDiaz, marcoAddress) into ContactContainsAddress
!insert (marcoDiaz, summerMenuNote) into ContactContainsNote

!new Address('culinaryArtsAddress')
!culinaryArtsAddress.city := 'Portland'
!culinaryArtsAddress.houseNr := '567'
!culinaryArtsAddress.street := 'Gastronomy St'

!insert (innovativeCulinaryArts, culinaryArtsAddress) into ContactContainsAddress

!insert (addressBook22, innovativeCulinaryArts) into AddressBookMadeOfContact
!insert (addressBook22, ameliaTurner) into AddressBookMadeOfContact
!insert (addressBook22, marcoDiaz) into AddressBookMadeOfContact
```
## Generation 22 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Flavors Ave, 357, Miami
```
```
Gastronomy St, 567, Portland
```
```
Cuisine Court, 789, Austin
```

# Generation 23
```
!new AddressBook('addressBook23')

!new Company('redwoodPublishing')
!redwoodPublishing.name := 'Redwood Publishing'
!redwoodPublishing.phone := '555-321-6789'
!redwoodPublishing.website := 'www.redwoodpublishing.com'
!redwoodPublishing.email := 'contact@redwoodpublishing.com'
!redwoodPublishing.industry := 'Publishing'

!new Person('elizabethGreen')
!elizabethGreen.name := 'Elizabeth Green'
!elizabethGreen.phone := '222-555-0987'
!elizabethGreen.website := 'www.elizabethgreenwriter.com'
!elizabethGreen.email := 'elizabeth.green@redwoodpublishing.com'
!elizabethGreen.title := 'Editor in Chief'

!new Note('bookLaunchMeetingNote')
!bookLaunchMeetingNote.author := 'Elizabeth Green'
!bookLaunchMeetingNote.time := Date('2025-07-11')
!bookLaunchMeetingNote.type := #MEETING
!bookLaunchMeetingNote.comment := 'Organized book launch meetings with authors and the marketing team'

!new Address('elizabethAddress')
!elizabethAddress.city := 'Boston'
!elizabethAddress.houseNr := '124'
!elizabethAddress.street := 'Literary Way'

!new Relationship('bossRelationship')
!bossRelationship.type := #BOSS

!insert (bossRelationship, redwoodPublishing) into RelationshipToContact
!insert (elizabethGreen, bossRelationship) into ContactToRelationship
!insert (elizabethGreen, elizabethAddress) into ContactContainsAddress
!insert (elizabethGreen, bookLaunchMeetingNote) into ContactContainsNote

!new Person('jasonParker')
!jasonParker.name := 'Jason Parker'
!jasonParker.phone := '333-666-1234'
!jasonParker.website := 'www.jasonparkereditor.com'
!jasonParker.email := 'jason.parker@example.com'
!jasonParker.title := 'Acquisitions Editor'

!new Note('manuscriptReviewNote')
!manuscriptReviewNote.author := 'Jason Parker'
!manuscriptReviewNote.time := Date('2025-07-20')
!manuscriptReviewNote.type := #CALL
!manuscriptReviewNote.comment := 'Reviewed new manuscript submissions with the editorial board'

!new Address('jasonAddress')
!jasonAddress.city := 'San Francisco'
!jasonAddress.houseNr := '789'
!jasonAddress.street := 'Editors Lane'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, elizabethGreen) into RelationshipToContact
!insert (jasonParker, subdivisionRelationship) into ContactToRelationship
!insert (jasonParker, jasonAddress) into ContactContainsAddress
!insert (jasonParker, manuscriptReviewNote) into ContactContainsNote

!new Address('redwoodAddress')
!redwoodAddress.city := 'New York City'
!redwoodAddress.houseNr := '456'
!redwoodAddress.street := 'Publication Street'

!insert (redwoodPublishing, redwoodAddress) into ContactContainsAddress

!insert (addressBook23, redwoodPublishing) into AddressBookMadeOfContact
!insert (addressBook23, elizabethGreen) into AddressBookMadeOfContact
!insert (addressBook23, jasonParker) into AddressBookMadeOfContact
```
## Generation 23 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Publication Street, 456, New York City
```
```
Editors Lane, 789, San Francisco
```
```
Literary Way, 124, Boston
```

# Generation 24
```
!new AddressBook('addressBook24')

!new Company('nextGenRobotics')
!nextGenRobotics.name := 'NextGen Robotics'
!nextGenRobotics.phone := '777-888-9990'
!nextGenRobotics.website := 'www.nextgenrobotics.com'
!nextGenRobotics.email := 'info@nextgenrobotics.com'
!nextGenRobotics.industry := 'Robotics & Automation'

!new Person('oliverJames')
!oliverJames.name := 'Oliver James'
!oliverJames.phone := '888-444-1122'
!oliverJames.website := 'www.oliverjamesengineering.com'
!oliverJames.email := 'oliver.james@nextgenrobotics.com'
!oliverJames.title := 'Robotics Engineer'

!new Note('innovationWorkshopNote')
!innovationWorkshopNote.author := 'Oliver James'
!innovationWorkshopNote.time := Date('2025-08-05')
!innovationWorkshopNote.type := #MEETING
!innovationWorkshopNote.comment := 'Conducted a workshop on the latest robotics innovations'

!new Address('oliverAddress')
!oliverAddress.city := 'San Jose'
!oliverAddress.houseNr := '156'
!oliverAddress.street := 'Innovation Drive'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, nextGenRobotics) into RelationshipToContact
!insert (oliverJames, employeeRelationship) into ContactToRelationship
!insert (oliverJames, oliverAddress) into ContactContainsAddress
!insert (oliverJames, innovationWorkshopNote) into ContactContainsNote

!new Person('sarahLee')
!sarahLee.name := 'Sarah Lee'
!sarahLee.phone := '444-555-6677'
!sarahLee.website := 'www.sarahleedevelopment.com'
!sarahLee.email := 'sarah.lee@example.com'
!sarahLee.title := 'Software Developer'

!new Note('codingSprintNote')
!codingSprintNote.author := 'Sarah Lee'
!codingSprintNote.time := Date('2025-08-12')
!codingSprintNote.type := #CALL
!codingSprintNote.comment := 'Led a coding sprint for the new robotics software platform'

!new Address('sarahAddress')
!sarahAddress.city := 'Palo Alto'
!sarahAddress.houseNr := '321'
!sarahAddress.street := 'Tech Valley Rd'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, oliverJames) into RelationshipToContact
!insert (sarahLee, subdivisionRelationship) into ContactToRelationship
!insert (sarahLee, sarahAddress) into ContactContainsAddress
!insert (sarahLee, codingSprintNote) into ContactContainsNote

!new Address('nextGenAddress')
!nextGenAddress.city := 'Mountain View'
!nextGenAddress.houseNr := '404'
!nextGenAddress.street := 'Automation Lane'

!insert (nextGenRobotics, nextGenAddress) into ContactContainsAddress

!insert (addressBook24, nextGenRobotics) into AddressBookMadeOfContact
!insert (addressBook24, oliverJames) into AddressBookMadeOfContact
!insert (addressBook24, sarahLee) into AddressBookMadeOfContact
```
## Generation 24 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Automation Lane, 404, Mountain View
```
```
Tech Valley Rd, 321, Palo Alto
```

# Generation 25
```
!new AddressBook('addressBook25')

!new Company('smartHomeInnovators')
!smartHomeInnovators.name := 'Smart Home Innovators'
!smartHomeInnovators.phone := '222-555-9090'
!smartHomeInnovators.website := 'www.smarthomeinnovators.com'
!smartHomeInnovators.email := 'support@smarthomeinnovators.com'
!smartHomeInnovators.industry := 'Smart Home Technology'

!new Person('emmaWatson')
!emmaWatson.name := 'Emma Watson'
!emmaWatson.phone := '123-456-7899'
!emmaWatson.website := 'www.emmawatsondesigns.com'
!emmaWatson.email := 'emma.watson@smarthomeinnovators.com'
!emmaWatson.title := 'Product Designer'

!new Note('productLaunchMeetingNote')
!productLaunchMeetingNote.author := 'Emma Watson'
!productLaunchMeetingNote.time := Date('2025-09-15')
!productLaunchMeetingNote.type := #MEETING
!productLaunchMeetingNote.comment := 'Coordinated product launch meeting for new smart home device'

!new Address('emmaAddress')
!emmaAddress.city := 'Los Angeles'
!emmaAddress.houseNr := '101'
!emmaAddress.street := 'Creative Blvd'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, smartHomeInnovators) into RelationshipToContact
!insert (emmaWatson, employeeRelationship) into ContactToRelationship
!insert (emmaWatson, emmaAddress) into ContactContainsAddress
!insert (emmaWatson, productLaunchMeetingNote) into ContactContainsNote

!new Person('liamJohnson')
!liamJohnson.name := 'Liam Johnson'
!liamJohnson.phone := '987-654-3211'
!liamJohnson.website := 'www.liamjohnsontech.com'
!liamJohnson.email := 'liam.johnson@example.com'
!liamJohnson.title := 'Technical Lead'

!new Note('techIntegrationNote')
!techIntegrationNote.author := 'Liam Johnson'
!techIntegrationNote.time := Date('2025-09-22')
!techIntegrationNote.type := #CALL
!techIntegrationNote.comment := 'Discussed technical integration challenges with engineering team'

!new Address('liamAddress')
!liamAddress.city := 'Chicago'
!liamAddress.houseNr := '907'
!liamAddress.street := 'Innovation Rd'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, emmaWatson) into RelationshipToContact
!insert (liamJohnson, subdivisionRelationship) into ContactToRelationship
!insert (liamJohnson, liamAddress) into ContactContainsAddress
!insert (liamJohnson, techIntegrationNote) into ContactContainsNote

!new Address('smartHomeAddress')
!smartHomeAddress.city := 'Austin'
!smartHomeAddress.houseNr := '505'
!smartHomeAddress.street := 'Tech Park'

!insert (smartHomeInnovators, smartHomeAddress) into ContactContainsAddress

!insert (addressBook25, smartHomeInnovators) into AddressBookMadeOfContact
!insert (addressBook25, emmaWatson) into AddressBookMadeOfContact
!insert (addressBook25, liamJohnson) into AddressBookMadeOfContact
```
## Generation 25 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Innovation Rd, 907, Chicago
```
```
Tech Park, 505, Austin
```
```
Creative Blvd, 101, Los Angeles
```

# Generation 26
```
!new AddressBook('addressBook26')

!new Company('urbanGreenscape')
!urbanGreenscape.name := 'Urban Greenscape'
!urbanGreenscape.phone := '888-777-6666'
!urbanGreenscape.website := 'www.urbangreenscape.com'
!urbanGreenscape.email := 'info@urbangreenscape.com'
!urbanGreenscape.industry := 'Landscape Architecture'

!new Person('graceMiller')
!graceMiller.name := 'Grace Miller'
!graceMiller.phone := '333-444-5555'
!graceMiller.website := 'www.gracemillerlandscapes.com'
!graceMiller.email := 'grace.miller@urbangreenscape.com'
!graceMiller.title := 'Chief Landscape Architect'

!new Note('projectDesignNote')
!projectDesignNote.author := 'Grace Miller'
!projectDesignNote.time := Date('2025-10-04')
!projectDesignNote.type := #MEETING
!projectDesignNote.comment := 'Led project design discussions for new urban park developments'

!new Address('graceAddress')
!graceAddress.city := 'Seattle'
!graceAddress.houseNr := '234'
!graceAddress.street := 'Garden Ave'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, urbanGreenscape) into RelationshipToContact
!insert (graceMiller, employeeRelationship) into ContactToRelationship
!insert (graceMiller, graceAddress) into ContactContainsAddress
!insert (graceMiller, projectDesignNote) into ContactContainsNote

!new Person('maxHunter')
!maxHunter.name := 'Max Hunter'
!maxHunter.phone := '555-342-1234'
!maxHunter.website := 'www.maxhunterdesign.com'
!maxHunter.email := 'max.hunter@example.com'
!maxHunter.title := 'Horticultural Consultant'

!new Note('plantSelectionNote')
!plantSelectionNote.author := 'Max Hunter'
!plantSelectionNote.time := Date('2025-10-15')
!plantSelectionNote.type := #CALL
!plantSelectionNote.comment := 'Consulted on plant selection for the community garden project'

!new Address('maxAddress')
!maxAddress.city := 'Vancouver'
!maxAddress.houseNr := '678'
!maxAddress.street := 'Leaf Lane'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, graceMiller) into RelationshipToContact
!insert (maxHunter, subdivisionRelationship) into ContactToRelationship
!insert (maxHunter, maxAddress) into ContactContainsAddress
!insert (maxHunter, plantSelectionNote) into ContactContainsNote

!new Address('urbanGreenscapeAddress')
!urbanGreenscapeAddress.city := 'Portland'
!urbanGreenscapeAddress.houseNr := '890'
!urbanGreenscapeAddress.street := 'Green Pathway'

!insert (urbanGreenscape, urbanGreenscapeAddress) into ContactContainsAddress

!insert (addressBook26, urbanGreenscape) into AddressBookMadeOfContact
!insert (addressBook26, graceMiller) into AddressBookMadeOfContact
!insert (addressBook26, maxHunter) into AddressBookMadeOfContact
```
## Generation 26 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Leaf Lane, 678, Vancouver
```
```
Green Pathway, 890, Portland
```
```
Garden Ave, 234, Seattle
```

# Generation 27
```
!new AddressBook('addressBook27')

!new Company('byteWaveMedia')
!byteWaveMedia.name := 'ByteWave Media'
!byteWaveMedia.phone := '999-888-7777'
!byteWaveMedia.website := 'www.bytewavemedia.com'
!byteWaveMedia.email := 'contact@bytewavemedia.com'
!byteWaveMedia.industry := 'Digital Media Production'

!new Person('alexTurner')
!alexTurner.name := 'Alex Turner'
!alexTurner.phone := '444-321-6789'
!alexTurner.website := 'www.alexturnercreatives.com'
!alexTurner.email := 'alex.turner@bytewavemedia.com'
!alexTurner.title := 'Creative Director'

!new Note('contentStrategyMeetingNote')
!contentStrategyMeetingNote.author := 'Alex Turner'
!contentStrategyMeetingNote.time := Date('2025-11-20')
!contentStrategyMeetingNote.type := #MEETING
!contentStrategyMeetingNote.comment := 'Outlined the content strategy for upcoming digital campaigns'

!new Address('alexAddress')
!alexAddress.city := 'Los Angeles'
!alexAddress.houseNr := '450'
!alexAddress.street := 'Media Blvd'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, byteWaveMedia) into RelationshipToContact
!insert (alexTurner, employeeRelationship) into ContactToRelationship
!insert (alexTurner, alexAddress) into ContactContainsAddress
!insert (alexTurner, contentStrategyMeetingNote) into ContactContainsNote

!new Person('rileyKim')
!rileyKim.name := 'Riley Kim'
!rileyKim.phone := '555-789-1234'
!rileyKim.website := 'www.rileykimproductions.com'
!rileyKim.email := 'riley.kim@example.com'
!rileyKim.title := 'Video Producer'

!new Note('shootingScheduleNote')
!shootingScheduleNote.author := 'Riley Kim'
!shootingScheduleNote.time := Date('2025-11-25')
!shootingScheduleNote.type := #CALL
!shootingScheduleNote.comment := 'Finalized shooting schedules for multiple client video projects'

!new Address('rileyAddress')
!rileyAddress.city := 'New York'
!rileyAddress.houseNr := '610'
!rileyAddress.street := 'Film Avenue'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, alexTurner) into RelationshipToContact
!insert (rileyKim, subdivisionRelationship) into ContactToRelationship
!insert (rileyKim, rileyAddress) into ContactContainsAddress
!insert (rileyKim, shootingScheduleNote) into ContactContainsNote

!new Address('byteWaveAddress')
!byteWaveAddress.city := 'Chicago'
!byteWaveAddress.houseNr := '300'
!byteWaveAddress.street := 'Digital Dr'

!insert (byteWaveMedia, byteWaveAddress) into ContactContainsAddress

!insert (addressBook27, byteWaveMedia) into AddressBookMadeOfContact
!insert (addressBook27, alexTurner) into AddressBookMadeOfContact
!insert (addressBook27, rileyKim) into AddressBookMadeOfContact
```
## Generation 27 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Digital Dr, 300, Chicago
```
```
Media Blvd, 450, Los Angeles
```
```
Film Avenue, 610, New York
```

# Generation 28
```
!new AddressBook('addressBook28')

!new Company('aquaWaveTech')
!aquaWaveTech.name := 'AquaWave Tech'
!aquaWaveTech.phone := '123-789-4560'
!aquaWaveTech.website := 'www.aquawavetech.com'
!aquaWaveTech.email := 'info@aquawavetech.com'
!aquaWaveTech.industry := 'Water Purification Technology'

!new Person('liamBrown')
!liamBrown.name := 'Liam Brown'
!liamBrown.phone := '555-999-8888'
!liamBrown.website := 'www.liambrowninnovations.com'
!liamBrown.email := 'liam.brown@aquawavetech.com'
!liamBrown.title := 'Research and Development Lead'

!new Note('labResearchNote')
!labResearchNote.author := 'Liam Brown'
!labResearchNote.time := Date('2025-12-05')
!labResearchNote.type := #MEETING
!labResearchNote.comment := 'Discussed progress on new water filtration prototype in lab meeting'

!new Address('liamAddress')
!liamAddress.city := 'San Francisco'
!liamAddress.houseNr := '789'
!liamAddress.street := 'Ocean Drive'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, aquaWaveTech) into RelationshipToContact
!insert (liamBrown, employeeRelationship) into ContactToRelationship
!insert (liamBrown, liamAddress) into ContactContainsAddress
!insert (liamBrown, labResearchNote) into ContactContainsNote

!new Person('sophiaWang')
!sophiaWang.name := 'Sophia Wang'
!sophiaWang.phone := '444-667-8899'
!sophiaWang.website := 'www.sophiawangwater.com'
!sophiaWang.email := 'sophia.wang@example.com'
!sophiaWang.title := 'Environmental Consultant'

!new Note('clientConsultationNote')
!clientConsultationNote.author := 'Sophia Wang'
!clientConsultationNote.time := Date('2025-12-12')
!clientConsultationNote.type := #CALL
!clientConsultationNote.comment := 'Held a consultation with clients on sustainable water practices'

!new Address('sophiaAddress')
!sophiaAddress.city := 'Miami'
!sophiaAddress.houseNr := '123'
!sophiaAddress.street := 'Blue Water Road'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, liamBrown) into RelationshipToContact
!insert (sophiaWang, subdivisionRelationship) into ContactToRelationship
!insert (sophiaWang, sophiaAddress) into ContactContainsAddress
!insert (sophiaWang, clientConsultationNote) into ContactContainsNote

!new Address('aquaWaveAddress')
!aquaWaveAddress.city := 'Houston'
!aquaWaveAddress.houseNr := '100'
!aquaWaveAddress.street := 'Innovation Dr'

!insert (aquaWaveTech, aquaWaveAddress) into ContactContainsAddress

!insert (addressBook28, aquaWaveTech) into AddressBookMadeOfContact
!insert (addressBook28, liamBrown) into AddressBookMadeOfContact
!insert (addressBook28, sophiaWang) into AddressBookMadeOfContact
```
## Generation 28 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Ocean Drive, 789, San Francisco
```
```
Blue Water Road, 123, Miami
```
```
Innovation Dr, 100, Houston
```

# Generation 29
```
!new AddressBook('addressBook29')

!new Company('skylineArchitects')
!skylineArchitects.name := 'Skyline Architects'
!skylineArchitects.phone := '777-555-1234'
!skylineArchitects.website := 'www.skylinearchitects.com'
!skylineArchitects.email := 'contact@skylinearchitects.com'
!skylineArchitects.industry := 'Architectural Design'

!new Person('michaelStone')
!michaelStone.name := 'Michael Stone'
!michaelStone.phone := '111-222-3333'
!michaelStone.website := 'www.michaelstonearchitecture.com'
!michaelStone.email := 'michael.stone@skylinearchitects.com'
!michaelStone.title := 'Principal Architect'

!new Note('designReviewMeetingNote')
!designReviewMeetingNote.author := 'Michael Stone'
!designReviewMeetingNote.time := Date('2026-01-10')
!designReviewMeetingNote.type := #MEETING
!designReviewMeetingNote.comment := 'Conducted design review meeting for the new skyscraper project'

!new Address('michaelAddress')
!michaelAddress.city := 'New York'
!michaelAddress.houseNr := '300'
!michaelAddress.street := 'Broadway St'

!new Relationship('bossRelationship')
!bossRelationship.type := #BOSS

!insert (bossRelationship, skylineArchitects) into RelationshipToContact
!insert (michaelStone, bossRelationship) into ContactToRelationship
!insert (michaelStone, michaelAddress) into ContactContainsAddress
!insert (michaelStone, designReviewMeetingNote) into ContactContainsNote

!new Person('isabellaLee')
!isabellaLee.name := 'Isabella Lee'
!isabellaLee.phone := '444-333-2222'
!isabellaLee.website := 'www.isabellaleeinteriors.com'
!isabellaLee.email := 'isabella.lee@example.com'
!isabellaLee.title := 'Interior Designer'

!new Note('interiorConceptNote')
!interiorConceptNote.author := 'Isabella Lee'
!interiorConceptNote.time := Date('2026-01-17')
!interiorConceptNote.type := #CALL
!interiorConceptNote.comment := 'Discussed interior concepts and materials with the client'

!new Address('isabellaAddress')
!isabellaAddress.city := 'Chicago'
!isabellaAddress.houseNr := '150'
!isabellaAddress.street := 'Designer Lane'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, michaelStone) into RelationshipToContact
!insert (isabellaLee, subdivisionRelationship) into ContactToRelationship
!insert (isabellaLee, isabellaAddress) into ContactContainsAddress
!insert (isabellaLee, interiorConceptNote) into ContactContainsNote

!new Address('skylineAddress')
!skylineAddress.city := 'San Francisco'
!skylineAddress.houseNr := '850'
!skylineAddress.street := 'Architecture Drive'

!insert (skylineArchitects, skylineAddress) into ContactContainsAddress

!insert (addressBook29, skylineArchitects) into AddressBookMadeOfContact
!insert (addressBook29, michaelStone) into AddressBookMadeOfContact
!insert (addressBook29, isabellaLee) into AddressBookMadeOfContact
```
## Generation 29 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Designer Lane, 150, Chicago
```
```
Broadway St, 300, New York
```
```
Architecture Drive, 850, San Francisco
```

# Generation 30
```
!new AddressBook('addressBook30')

!new Company('stellarAIResearch')
!stellarAIResearch.name := 'Stellar AI Research'
!stellarAIResearch.phone := '999-888-5555'
!stellarAIResearch.website := 'www.stellarairesearch.com'
!stellarAIResearch.email := 'info@stellarairesearch.com'
!stellarAIResearch.industry := 'Artificial Intelligence'

!new Person('jasonClark')
!jasonClark.name := 'Jason Clark'
!jasonClark.phone := '555-666-7777'
!jasonClark.website := 'www.jasonclarkai.com'
!jasonClark.email := 'jason.clark@stellarairesearch.com'
!jasonClark.title := 'AI Research Scientist'

!new Note('aiDevelopmentConferenceNote')
!aiDevelopmentConferenceNote.author := 'Jason Clark'
!aiDevelopmentConferenceNote.time := Date('2026-02-20')
!aiDevelopmentConferenceNote.type := #MEETING
!aiDevelopmentConferenceNote.comment := 'Presented recent AI development advancements at industry conference'

!new Address('jasonAddress')
!jasonAddress.city := 'Cambridge'
!jasonAddress.houseNr := '210'
!jasonAddress.street := 'Innovation Blvd'

!new Relationship('employeeRelationship')
!employeeRelationship.type := #EMPLOYEE

!insert (employeeRelationship, stellarAIResearch) into RelationshipToContact
!insert (jasonClark, employeeRelationship) into ContactToRelationship
!insert (jasonClark, jasonAddress) into ContactContainsAddress
!insert (jasonClark, aiDevelopmentConferenceNote) into ContactContainsNote

!new Person('lilaNguyen')
!lilaNguyen.name := 'Lila Nguyen'
!lilaNguyen.phone := '666-777-8888'
!lilaNguyen.website := 'www.lilanguyenanalytics.com'
!lilaNguyen.email := 'lila.nguyen@example.com'
!lilaNguyen.title := 'Data Scientist'

!new Note('dataAnalysisNote')
!dataAnalysisNote.author := 'Lila Nguyen'
!dataAnalysisNote.time := Date('2026-02-28')
!dataAnalysisNote.type := #CALL
!dataAnalysisNote.comment := 'Analyzed large datasets to uncover key insights for AI model training'

!new Address('lilaAddress')
!lilaAddress.city := 'San Jose'
!lilaAddress.houseNr := '321'
!lilaAddress.street := 'Data Drive'

!new Relationship('subdivisionRelationship')
!subdivisionRelationship.type := #SUBDIVISION

!insert (subdivisionRelationship, jasonClark) into RelationshipToContact
!insert (lilaNguyen, subdivisionRelationship) into ContactToRelationship
!insert (lilaNguyen, lilaAddress) into ContactContainsAddress
!insert (lilaNguyen, dataAnalysisNote) into ContactContainsNote

!new Address('stellarAIAddress')
!stellarAIAddress.city := 'Boston'
!stellarAIAddress.houseNr := '500'
!stellarAIAddress.street := 'Research Road'

!insert (stellarAIResearch, stellarAIAddress) into ContactContainsAddress

!insert (addressBook30, stellarAIResearch) into AddressBookMadeOfContact
!insert (addressBook30, jasonClark) into AddressBookMadeOfContact
!insert (addressBook30, lilaNguyen) into AddressBookMadeOfContact
```
## Generation 30 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
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
Innovation Blvd, 210, Cambridge
```
```
Data Drive, 321, San Jose
```
```
Research Road, 500, Boston
```

# Summary for all generations
| Summary | Value | 
|---|---| 
| Model | GPT_4O | 
| Type | Simple | 
| System | addressbook | 
| Number of generations | 30 | 

| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 1716 | 0.00% |
| Multiplicities Errors | 0 | 362 | 0.00% |
| Invariants Errors | 0 | 30 | 0.00% |

| AddressBook | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Phones | 0 | 91 | 0.00% |
| Websites | 0 | 91 | 0.00% |
| Emails | 0 | 91 | 0.00% |
| Addresses | 84 | 89 | 94.38% |

| Invalid Addresses | 
|---| 
```
Market Street, 202, San Francisco
```
```
Michigan Avenue, 303, Chicago
```
```
Sunset Boulevard, 200, Los Angeles
```
```
Biscayne Blvd, 1500, Miami
```
```
Energy Parkway, 404, Denver
```
```
Desert Drive, 1206, Phoenix
```
```
Elm Street, 389, Charlotte
```
```
Construction Road, 789, Houston
```
```
Palm Lane, 989, San Diego
```
```
Lakeview Ave, 150, Seattle
```
```
Maple Street, 455, Boston
```
```
Forest Avenue, 1011, Portland
```
```
Cedar Lane, 1420, Denver
```
```
Green Street, 322, Boulder
```
```
Peach Street, 5678, Atlanta
```
```
Health Avenue, 1234, Orlando
```
```
Wellness Blvd, 789, Miami
```
```
Innovation Drive, 3579, Chicago
```
```
Jazz Lane, 963, New Orleans
```
```
Tech Park, 482, Dallas
```
```
Design Blvd, 222, New York
```
```
Artistic Avenue, 7890, Los Angeles
```
```
Creative Way, 4567, San Francisco
```
```
Tech Innovation St, 123, Austin
```
```
Design Loop, 456, Seattle
```
```
Innovation Blvd, 890, San Jose
```
```
Botanic Boulevard, 1001, Phoenix
```
```
Flora Road, 400, Denver
```
```
Garden Lane, 302, Portland
```
```
Creative Court, 158, Boston
```
```
Media Lane, 902, San Francisco
```
```
Marketing Avenue, 783, Chicago
```
```
Expedition Blvd, 777, Seattle
```
```
Tourist Trail, 657, Denver
```
```
Explorer Lane, 534, Salt Lake City
```
```
Mix Lane, 3456, Austin
```
```
Gourmet Street, 1200, Chicago
```
```
Chef Boulevard, 6789, Minneapolis
```
```
Innovation Blvd, 321, Los Angeles
```
```
Silicon Avenue, 456, San Francisco
```
```
Testing Lane, 789, New York
```
```
Harvest Lane, 100, Madison
```
```
Field Road, 222, Des Moines
```
```
Organic Avenue, 678, Iowa City
```
```
Melody Lane, 555, Los Angeles
```
```
Music Row, 101, Nashville
```
```
Jazz Avenue, 250, Memphis
```
```
Green Road, 220, Seattle
```
```
Sustainability Street, 309, Portland
```
```
Eco Avenue, 900, San Francisco
```
```
Pastry Lane, 789, Chicago
```
```
Gourmet Way, 234, New York
```
```
Strength Street, 602, Phoenix
```
```
Cycle Avenue, 101, Austin
```
```
Fitness Lane, 500, San Diego
```
```
Trailhead St, 112, Boulder
```
```
Adventure Rd, 458, Denver
```
```
Expedition Blvd, 321, San Francisco
```
```
Flavors Ave, 357, Miami
```
```
Gastronomy St, 567, Portland
```
```
Cuisine Court, 789, Austin
```
```
Publication Street, 456, New York City
```
```
Editors Lane, 789, San Francisco
```
```
Literary Way, 124, Boston
```
```
Automation Lane, 404, Mountain View
```
```
Tech Valley Rd, 321, Palo Alto
```
```
Innovation Rd, 907, Chicago
```
```
Tech Park, 505, Austin
```
```
Creative Blvd, 101, Los Angeles
```
```
Leaf Lane, 678, Vancouver
```
```
Green Pathway, 890, Portland
```
```
Garden Ave, 234, Seattle
```
```
Digital Dr, 300, Chicago
```
```
Media Blvd, 450, Los Angeles
```
```
Film Avenue, 610, New York
```
```
Ocean Drive, 789, San Francisco
```
```
Blue Water Road, 123, Miami
```
```
Innovation Dr, 100, Houston
```
```
Designer Lane, 150, Chicago
```
```
Broadway St, 300, New York
```
```
Architecture Drive, 850, San Francisco
```
```
Innovation Blvd, 210, Cambridge
```
```
Data Drive, 321, San Jose
```
```
Research Road, 500, Boston
```

