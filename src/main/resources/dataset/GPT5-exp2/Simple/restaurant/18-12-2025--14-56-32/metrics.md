# Generation 1
```
!new Restaurant('rest1')
!rest1.name := 'Harbor Bistro'

!new Restaurant('rest2')
!rest2.name := 'Green Garden'

!new Owner('own1')
!own1.name := 'Alice Chen'
!own1.percentageShares := 50

!new Owner('own2')
!own2.name := 'Bruno Silva'
!own2.percentageShares := 30

!new Owner('own3')
!own3.name := 'Carla Novak'
!own3.percentageShares := 20

!new Owner('own4')
!own4.name := 'Diana Rossi'
!own4.percentageShares := 100

!insert (rest1, own1) into RestaurantOwner
!insert (rest1, own2) into RestaurantOwner
!insert (rest1, own3) into RestaurantOwner
!insert (rest2, own4) into RestaurantOwner

!new HeadWaiter('hw1')
!hw1.name := 'Hector Miles'
!hw1.dateOfBirth := Date('1980-04-12')
!hw1.phoneNumber := '+1-555-0100'

!new Waiter('w1')
!w1.name := 'Mina Patel'
!w1.dateOfBirth := Date('1996-09-03')
!w1.phoneNumber := '+1-555-0111'
!w1.spokenLanguage := #English

!new Waiter('w2')
!w2.name := 'Luis García'
!w2.dateOfBirth := Date('1992-02-20')
!w2.phoneNumber := '+1-555-0112'
!w2.spokenLanguage := #Spanish

!new Waiter('w3')
!w3.name := 'Greta König'
!w3.dateOfBirth := Date('1998-07-19')
!w3.phoneNumber := '+1-555-0113'
!w3.spokenLanguage := #German

!insert (hw1, w1) into HeadWaiterWaiter
!insert (hw1, w2) into HeadWaiterWaiter
!insert (hw1, w3) into HeadWaiterWaiter

!new Chef('chef1')
!chef1.name := 'Marco Bianchi'
!chef1.dateOfBirth := Date('1975-11-30')
!chef1.phoneNumber := '+1-555-0201'

!new Chef('chef2')
!chef2.name := 'Nora Stein'
!chef2.dateOfBirth := Date('1983-06-25')
!chef2.phoneNumber := '+1-555-0202'

!new Cook('cook1')
!cook1.name := 'Sam Lee'
!cook1.dateOfBirth := Date('1990-01-14')
!cook1.phoneNumber := '+1-555-0211'
!cook1.yearsOfExperience := 12

!new Cook('cook2')
!cook2.name := 'Olivia Park'
!cook2.dateOfBirth := Date('2001-08-05')
!cook2.phoneNumber := '+1-555-0212'
!cook2.yearsOfExperience := 0

!new Cook('cook3')
!cook3.name := 'Ivan Horvat'
!cook3.dateOfBirth := Date('1994-12-02')
!cook3.phoneNumber := '+1-555-0213'
!cook3.yearsOfExperience := 5

!insert (chef1, cook1) into ChefCook
!insert (chef1, cook2) into ChefCook
!insert (chef2, cook3) into ChefCook

!new Manager('mgr1')
!mgr1.name := 'Rita Gomez'
!mgr1.dateOfBirth := Date('1988-03-08')
!mgr1.phoneNumber := '+1-555-0301'

!new BusDriver('bd1')
!bd1.name := 'Tom Driver'
!bd1.dateOfBirth := Date('1970-10-10')
!bd1.phoneNumber := '+1-555-0401'
!bd1.driverLicenseNr := 'D-8831-XY'

!new BusDriver('bd2')
!bd2.name := 'Uma Wheels'
!bd2.dateOfBirth := Date('1978-05-22')
!bd2.phoneNumber := '+1-555-0402'
!bd2.driverLicenseNr := 'D-1190-ZZ'

!new RegularCustomer('rc1')
!rc1.name := 'Evan Brooks'
!rc1.prefferedLanguage := #English

!new RegularCustomer('rc2')
!rc2.name := 'Sofía Martín'
!rc2.prefferedLanguage := #Spanish

!new DietaryRequirement('dr1')
!dr1.diet := #Vegan

!new DietaryRequirement('dr2')
!dr2.diet := #Kosher

!new ReportedAllergy('ra1')
!ra1.allergen := #Nuts

!new ReportedAllergy('ra2')
!ra2.allergen := #Gluten

!new Allergen('aLactose')
!aLactose.type := #Lactose

!new Allergen('aNuts')
!aNuts.type := #Nuts

!new Allergen('aGluten')
!aGluten.type := #Gluten

!new Allergen('aSeafood')
!aSeafood.type := #Seafood

!new FoodItem('fi1')
!fi1.number := 101
!fi1.description := 'Butter'
!fi1.purchaseFlag := true
!fi1.unit := #Ounce

!new FoodItem('fi2')
!fi2.number := 102
!fi2.description := 'Wheat Flour'
!fi2.purchaseFlag := true
!fi2.unit := #Pound

!new FoodItem('fi3')
!fi3.number := 103
!fi3.description := 'Shrimp'
!fi3.purchaseFlag := true
!fi3.unit := #Pound

!new FoodItem('fi4')
!fi4.number := 104
!fi4.description := 'Almonds'
!fi4.purchaseFlag := true
!fi4.unit := #Gram

!new FoodItem('fi5')
!fi5.number := 105
!fi5.description := 'Lettuce'
!fi5.purchaseFlag := false
!fi5.unit := #Dozen

!insert (fi1, aLactose) into FoodItemAllergen
!insert (fi2, aGluten) into FoodItemAllergen
!insert (fi3, aSeafood) into FoodItemAllergen
!insert (fi4, aNuts) into FoodItemAllergen

!new MenuItem('mi1')
!mi1.description := 'Garlic Shrimp'
!mi1.prepTime := 12.5
!mi1.classification := #Apetizer

!new MenuItem('mi2')
!mi2.description := 'Garden Salad'
!mi2.prepTime := 6.0
!mi2.classification := #Main

!new MenuItem('mi3')
!mi3.description := 'Almond Tart'
!mi3.prepTime := 25.0
!mi3.classification := #Dessert

!new MenuItem('mi4')
!mi4.description := 'Sparkling Water'
!mi4.prepTime := 0.5
!mi4.classification := #Beverage

!insert (mi1, chef1) into MenuItemChef
!insert (mi2, chef2) into MenuItemChef
!insert (mi3, chef1) into MenuItemChef
!insert (mi4, chef2) into MenuItemChef

!insert (mi1, fi3) into MenuItemFoodItem
!insert (mi1, fi1) into MenuItemFoodItem
!insert (mi2, fi5) into MenuItemFoodItem
!insert (mi3, fi2) into MenuItemFoodItem
!insert (mi3, fi4) into MenuItemFoodItem

!new Individual('resInd1')
!resInd1.time := Time('18:00')
!resInd1.date := Date('2025-12-20')
!resInd1.numberPeople := 2
!resInd1.name := 'Evan Brooks'
!resInd1.phoneNumber := '+1-555-1001'
!resInd1.number := 2001
!resInd1.seating := #Inside
!resInd1.smoking := #NonSmoking

!new Individual('resInd2')
!resInd2.time := Time('19:30')
!resInd2.date := Date('2025-12-20')
!resInd2.numberPeople := 5
!resInd2.name := 'Walk-in Guest'
!resInd2.phoneNumber := '+1-555-1002'
!resInd2.number := 2002
!resInd2.seating := #Patio
!resInd2.smoking := #Smoking

!new Banquet('resBan1')
!resBan1.time := Time('20:00')
!resBan1.date := Date('2025-12-31')
!resBan1.numberPeople := 30
!resBan1.name := 'Sofía Martín'
!resBan1.phoneNumber := '+1-555-1003'
!resBan1.number := 3001
!resBan1.groupName := 'New Year Club'
!resBan1.paymentMethod := #CreditCard
!resBan1.busService := true

!insert (rest1, resInd1) into RestaurantReservation
!insert (rest1, resBan1) into RestaurantReservation
!insert (rest2, resInd2) into RestaurantReservation

!insert (resInd1, rc1) into ReservationCustomer
!insert (resBan1, rc2) into ReservationCustomer

!insert (resInd1, w1) into ReservationWaiter
!insert (resInd2, w2) into ReservationWaiter
!insert (resInd2, w3) into ReservationWaiter
!insert (resBan1, w1) into ReservationWaiter
!insert (resBan1, w2) into ReservationWaiter

!insert (resBan1, bd1) into BanquetBusDriver
!insert (resBan1, bd2) into BanquetBusDriver

!new Table('t1')
!t1.number := 1
!t1.description := 'Window two-top'
!t1.capacity := 2

!new Table('t2')
!t2.number := 2
!t2.description := 'Patio four-top'
!t2.capacity := 4

!new Table('t3')
!t3.number := 3
!t3.description := 'Patio two-top'
!t3.capacity := 1

!new Table('t10')
!t10.number := 10
!t10.description := 'Banquet table A'
!t10.capacity := 10

!new Table('t11')
!t11.number := 11
!t11.description := 'Banquet table B'
!t11.capacity := 10

!new Table('t12')
!t12.number := 12
!t12.description := 'Banquet table C'
!t12.capacity := 10

!insert (resInd1, t1) into ReservationTable
!insert (resInd2, t2) into ReservationTable
!insert (resInd2, t3) into ReservationTable
!insert (resBan1, t10) into ReservationTable
!insert (resBan1, t11) into ReservationTable
!insert (resBan1, t12) into ReservationTable

!new ItemOrder('io1')
!io1.time := Time('18:05')

!new ItemOrder('io2')
!io2.time := Time('18:10')

!new ItemOrder('io3')
!io3.time := Time('19:40')

!new ItemOrder('io4')
!io4.time := Time('20:15')

!new ItemOrder('io5')
!io5.time := Time('20:16')

!insert (resInd1, io1) into ReservationItemOrdered
!insert (resInd1, io2) into ReservationItemOrdered
!insert (resInd2, io3) into ReservationItemOrdered
!insert (resBan1, io4) into ReservationItemOrdered
!insert (resBan1, io5) into ReservationItemOrdered

!insert (io1, mi1) into ItemOrderMenuItem
!insert (io2, mi4) into ItemOrderMenuItem
!insert (io3, mi2) into ItemOrderMenuItem
!insert (io4, mi1) into ItemOrderMenuItem
!insert (io5, mi3) into ItemOrderMenuItem

!new Individual('resNoRest1')
!resNoRest1.time := Time('21:00')
!resNoRest1.date := Date('2026-01-01')
!resNoRest1.numberPeople := 1
!resNoRest1.name := 'No Restaurant Linked'
!resNoRest1.phoneNumber := '+1-555-1999'
!resNoRest1.number := 2003
!resNoRest1.seating := #Inside
!resNoRest1.smoking := #NonSmoking

!insert (resNoRest1, w3) into ReservationWaiter

!new Table('t20')
!t20.number := 20
!t20.description := 'Single seat at bar'
!t20.capacity := 1

!insert (resNoRest1, t20) into ReservationTable
```
## Generation 1 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 263 | 0.00% |
| Multiplicities Errors | 0 | 53 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 16 | 0.00% |
| Phones | 0 | 16 | 0.00% |

# Generation 2
```
!new Restaurant('rest3')
!rest3.name := 'Skyline Rooftop Grill'

!new Owner('own5')
!own5.name := 'Kenji Tanaka'
!own5.percentageShares := 60

!new Owner('own6')
!own6.name := 'Laura Schmidt'
!own6.percentageShares := 40

!insert (rest3, own5) into RestaurantOwner
!insert (rest3, own6) into RestaurantOwner

!new HeadWaiter('hw2')
!hw2.name := 'Paula Reed'
!hw2.dateOfBirth := Date('1979-01-09')
!hw2.phoneNumber := '+1-555-0600'

!new Waiter('w4')
!w4.name := 'Enzo Conti'
!w4.dateOfBirth := Date('1995-05-14')
!w4.phoneNumber := '+1-555-0611'
!w4.spokenLanguage := #Italian

!new Waiter('w5')
!w5.name := 'Hannah Wright'
!w5.dateOfBirth := Date('2000-10-28')
!w5.phoneNumber := '+1-555-0612'
!w5.spokenLanguage := #English

!new Waiter('w6')
!w6.name := 'Diego Alvarez'
!w6.dateOfBirth := Date('1993-03-17')
!w6.phoneNumber := '+1-555-0613'
!w6.spokenLanguage := #Spanish

!insert (hw2, w4) into HeadWaiterWaiter
!insert (hw2, w5) into HeadWaiterWaiter
!insert (hw2, w6) into HeadWaiterWaiter

!new Cook('cook4')
!cook4.name := 'Priya Nair'
!cook4.dateOfBirth := Date('1989-09-21')
!cook4.phoneNumber := '+1-555-0701'
!cook4.yearsOfExperience := 9

!new Cook('cook5')
!cook5.name := 'Omar Haddad'
!cook5.dateOfBirth := Date('1991-12-11')
!cook5.phoneNumber := '+1-555-0702'
!cook5.yearsOfExperience := 3

!new Chef('chef3')
!chef3.name := 'Sienna Laurent'
!chef3.dateOfBirth := Date('1985-07-07')
!chef3.phoneNumber := '+1-555-0711'

!new Chef('chef4')
!chef4.name := 'Viktor Petrov'
!chef4.dateOfBirth := Date('1977-02-02')
!chef4.phoneNumber := '+1-555-0712'

!insert (chef3, cook4) into ChefCook
!insert (chef4, cook5) into ChefCook

!new Allergen('aNuts2')
!aNuts2.type := #Nuts

!new Allergen('aSeafood2')
!aSeafood2.type := #Seafood

!new FoodItem('fi10')
!fi10.number := 210
!fi10.description := 'Beef Steak'
!fi10.purchaseFlag := true
!fi10.unit := #Pound

!new FoodItem('fi11')
!fi11.number := 211
!fi11.description := 'Potatoes'
!fi11.purchaseFlag := true
!fi11.unit := #Pound

!new FoodItem('fi12')
!fi12.number := 212
!fi12.description := 'Hazelnut Crumble'
!fi12.purchaseFlag := true
!fi12.unit := #Gram

!new FoodItem('fi13')
!fi13.number := 213
!fi13.description := 'Scallops'
!fi13.purchaseFlag := true
!fi13.unit := #Ounce

!insert (fi12, aNuts2) into FoodItemAllergen
!insert (fi13, aSeafood2) into FoodItemAllergen

!new MenuItem('mi5')
!mi5.description := 'Rooftop Steak Frites'
!mi5.prepTime := 18.0
!mi5.classification := #Main

!new MenuItem('mi6')
!mi6.description := 'Seared Scallops'
!mi6.prepTime := 14.0
!mi6.classification := #Apetizer

!new MenuItem('mi7')
!mi7.description := 'Hazelnut Sundae'
!mi7.prepTime := 4.0
!mi7.classification := #Dessert

!insert (mi5, chef3) into MenuItemChef
!insert (mi6, chef3) into MenuItemChef
!insert (mi7, chef4) into MenuItemChef

!insert (mi5, fi10) into MenuItemFoodItem
!insert (mi5, fi11) into MenuItemFoodItem
!insert (mi6, fi13) into MenuItemFoodItem
!insert (mi7, fi12) into MenuItemFoodItem

!new Table('t30')
!t30.number := 30
!t30.description := 'Long communal table'
!t30.capacity := 12

!new Table('t31')
!t31.number := 31
!t31.description := 'Two-top near bar'
!t31.capacity := 2

!new Table('t32')
!t32.number := 32
!t32.description := 'Four-top corner'
!t32.capacity := 4

!new Individual('resInd3')
!resInd3.time := Time('17:45')
!resInd3.date := Date('2026-02-14')
!resInd3.numberPeople := 6
!resInd3.name := 'Valentine Group'
!resInd3.phoneNumber := '+1-555-2001'
!resInd3.number := 4001
!resInd3.seating := #Patio
!resInd3.smoking := #NonSmoking

!new Banquet('resBan2')
!resBan2.time := Time('12:00')
!resBan2.date := Date('2026-03-10')
!resBan2.numberPeople := 12
!resBan2.name := 'Corporate Host'
!resBan2.phoneNumber := '+1-555-2002'
!resBan2.number := 5001
!resBan2.groupName := 'Apex Quarterly Lunch'
!resBan2.paymentMethod := #Cash
!resBan2.busService := false

!insert (rest3, resInd3) into RestaurantReservation
!insert (rest3, resBan2) into RestaurantReservation

!insert (resInd3, w4) into ReservationWaiter
!insert (resInd3, w5) into ReservationWaiter
!insert (resInd3, w6) into ReservationWaiter

!insert (resBan2, w5) into ReservationWaiter

!insert (resInd3, t31) into ReservationTable
!insert (resInd3, t32) into ReservationTable

!insert (resBan2, t30) into ReservationTable

!new ItemOrder('io10')
!io10.time := Time('12:10')

!new ItemOrder('io11')
!io11.time := Time('12:12')

!new ItemOrder('io12')
!io12.time := Time('12:30')

!insert (resBan2, io10) into ReservationItemOrdered
!insert (resBan2, io11) into ReservationItemOrdered
!insert (resBan2, io12) into ReservationItemOrdered

!insert (io10, mi6) into ItemOrderMenuItem
!insert (io11, mi5) into ItemOrderMenuItem
!insert (io12, mi7) into ItemOrderMenuItem
```
## Generation 2 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 149 | 0.00% |
| Multiplicities Errors | 0 | 31 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 10 | 0.00% |
| Phones | 0 | 10 | 0.00% |

# Generation 3
```
!new Restaurant('rest4')
!rest4.name := 'Quiet Noodle House'

!new Owner('own7')
!own7.name := 'Marta Ivanova'
!own7.percentageShares := 34

!new Owner('own8')
!own8.name := 'Noah Johnson'
!own8.percentageShares := 33

!new Owner('own9')
!own9.name := 'Yuki Sato'
!own9.percentageShares := 33

!insert (rest4, own7) into RestaurantOwner
!insert (rest4, own8) into RestaurantOwner
!insert (rest4, own9) into RestaurantOwner

!new HeadWaiter('hw3')
!hw3.name := 'Quentin Baker'
!hw3.dateOfBirth := Date('1982-08-18')
!hw3.phoneNumber := '+1-555-0800'

!new Waiter('w7')
!w7.name := 'Aya Mori'
!w7.dateOfBirth := Date('1999-04-09')
!w7.phoneNumber := '+1-555-0811'
!w7.spokenLanguage := #English

!new Waiter('w8')
!w8.name := 'Carlos Vega'
!w8.dateOfBirth := Date('1991-09-27')
!w8.phoneNumber := '+1-555-0812'
!w8.spokenLanguage := #Spanish

!insert (hw3, w7) into HeadWaiterWaiter
!insert (hw3, w8) into HeadWaiterWaiter

!new Chef('chef5')
!chef5.name := 'Helena Dubois'
!chef5.dateOfBirth := Date('1984-03-03')
!chef5.phoneNumber := '+1-555-0901'

!new Chef('chef6')
!chef6.name := 'Ravi Mehta'
!chef6.dateOfBirth := Date('1976-12-24')
!chef6.phoneNumber := '+1-555-0902'

!new Cook('cook6')
!cook6.name := 'Ben Carter'
!cook6.dateOfBirth := Date('1997-06-16')
!cook6.phoneNumber := '+1-555-0911'
!cook6.yearsOfExperience := 1

!new Cook('cook7')
!cook7.name := 'Lina Aydin'
!cook7.dateOfBirth := Date('1993-11-05')
!cook7.phoneNumber := '+1-555-0912'
!cook7.yearsOfExperience := 7

!new Cook('cook8')
!cook8.name := 'Zoe King'
!cook8.dateOfBirth := Date('2002-02-12')
!cook8.phoneNumber := '+1-555-0913'
!cook8.yearsOfExperience := 0

!insert (chef5, cook6) into ChefCook
!insert (chef5, cook7) into ChefCook
!insert (chef6, cook8) into ChefCook

!new Allergen('aGluten3')
!aGluten3.type := #Gluten

!new FoodItem('fi20')
!fi20.number := 310
!fi20.description := 'Rice Noodles'
!fi20.purchaseFlag := true
!fi20.unit := #Pound

!new FoodItem('fi21')
!fi21.number := 311
!fi21.description := 'Soy Sauce'
!fi21.purchaseFlag := true
!fi21.unit := #Ounce

!new FoodItem('fi22')
!fi22.number := 312
!fi22.description := 'Wheat Dumpling Wrappers'
!fi22.purchaseFlag := true
!fi22.unit := #Sheet

!insert (fi22, aGluten3) into FoodItemAllergen

!new MenuItem('mi8')
!mi8.description := 'Beef Pho'
!mi8.prepTime := 20.0
!mi8.classification := #Main

!new MenuItem('mi9')
!mi9.description := 'Steamed Dumplings'
!mi9.prepTime := 11.0
!mi9.classification := #Apetizer

!new MenuItem('mi10')
!mi10.description := 'Hot Green Tea'
!mi10.prepTime := 2.0
!mi10.classification := #Beverage

!insert (mi8, chef5) into MenuItemChef
!insert (mi9, chef6) into MenuItemChef
!insert (mi10, chef5) into MenuItemChef

!insert (mi8, fi20) into MenuItemFoodItem
!insert (mi8, fi21) into MenuItemFoodItem
!insert (mi9, fi22) into MenuItemFoodItem

!new Table('t40')
!t40.number := 40
!t40.description := 'Solo counter seat'
!t40.capacity := 1

!new Table('t41')
!t41.number := 41
!t41.description := 'Back room table'
!t41.capacity := 10

!new Table('t42')
!t42.number := 42
!t42.description := 'Back room table'
!t42.capacity := 10

!new Table('t43')
!t43.number := 43
!t43.description := 'Side table'
!t43.capacity := 5

!new RegularCustomer('rc3')
!rc3.name := 'Irene Adler'
!rc3.prefferedLanguage := #German

!new Individual('resInd4')
!resInd4.time := Time('11:30')
!resInd4.date := Date('2026-04-01')
!resInd4.numberPeople := 1
!resInd4.name := 'Irene Adler'
!resInd4.phoneNumber := '+1-555-3001'
!resInd4.number := 6001
!resInd4.seating := #Inside
!resInd4.smoking := #NonSmoking

!new Banquet('resBan3')
!resBan3.time := Time('13:00')
!resBan3.date := Date('2026-04-01')
!resBan3.numberPeople := 25
!resBan3.name := 'Event Coordinator'
!resBan3.phoneNumber := '+1-555-3002'
!resBan3.number := 7001
!resBan3.groupName := 'City Chess League'
!resBan3.paymentMethod := #Cash
!resBan3.busService := true

!insert (rest4, resInd4) into RestaurantReservation
!insert (rest4, resBan3) into RestaurantReservation

!insert (resInd4, rc3) into ReservationCustomer

!insert (resInd4, w7) into ReservationWaiter
!insert (resBan3, w7) into ReservationWaiter
!insert (resBan3, w8) into ReservationWaiter

!insert (resInd4, t40) into ReservationTable
!insert (resBan3, t41) into ReservationTable
!insert (resBan3, t42) into ReservationTable
!insert (resBan3, t43) into ReservationTable

!new BusDriver('bd3')
!bd3.name := 'Nina Shuttle'
!bd3.dateOfBirth := Date('1969-09-01')
!bd3.phoneNumber := '+1-555-3100'
!bd3.driverLicenseNr := 'BUS-7721-AZ'

!insert (resBan3, bd3) into BanquetBusDriver

!new ItemOrder('io20')
!io20.time := Time('11:35')

!new ItemOrder('io21')
!io21.time := Time('11:37')

!insert (resInd4, io20) into ReservationItemOrdered
!insert (resInd4, io21) into ReservationItemOrdered

!insert (io20, mi8) into ItemOrderMenuItem
!insert (io21, mi10) into ItemOrderMenuItem
```
## Generation 3 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 154 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 11 | 0.00% |
| Phones | 0 | 11 | 0.00% |

# Generation 4
```
!new Restaurant('rest5')
!rest5.name := 'Lighthouse Café'

!new Owner('own10')
!own10.name := 'Paul Nguyen'
!own10.percentageShares := 99

!new Owner('own11')
!own11.name := 'Sara Lind'
!own11.percentageShares := 1

!insert (rest5, own10) into RestaurantOwner
!insert (rest5, own11) into RestaurantOwner

!new HeadWaiter('hw4')
!hw4.name := 'Janet Cole'
!hw4.dateOfBirth := Date('1972-05-06')
!hw4.phoneNumber := '+1-555-5000'

!new Waiter('w9')
!w9.name := 'Ilya Morozov'
!w9.dateOfBirth := Date('1990-12-01')
!w9.phoneNumber := '+1-555-5011'
!w9.spokenLanguage := #Italian

!insert (hw4, w9) into HeadWaiterWaiter

!new Chef('chef7')
!chef7.name := 'Ana Costa'
!chef7.dateOfBirth := Date('1981-09-15')
!chef7.phoneNumber := '+1-555-5101'

!new Cook('cook9')
!cook9.name := 'Mason Hill'
!cook9.dateOfBirth := Date('2003-03-03')
!cook9.phoneNumber := '+1-555-5111'
!cook9.yearsOfExperience := 0

!insert (chef7, cook9) into ChefCook

!new Table('t50')
!t50.number := 50
!t50.description := 'Small booth A'
!t50.capacity := 2

!new Table('t51')
!t51.number := 51
!t51.description := 'Small booth B'
!t51.capacity := 2

!new Table('t52')
!t52.number := 52
!t52.description := 'Chef counter seat'
!t52.capacity := 1

!new RegularCustomer('rc4')
!rc4.name := 'Tomás Ibarra'
!rc4.prefferedLanguage := #Spanish

!new Individual('resInd5')
!resInd5.time := Time('08:15')
!resInd5.date := Date('2026-05-02')
!resInd5.numberPeople := 4
!resInd5.name := 'Tomás Ibarra'
!resInd5.phoneNumber := '+1-555-5201'
!resInd5.number := 8001
!resInd5.seating := #Inside
!resInd5.smoking := #NonSmoking

!new Banquet('resBan4')
!resBan4.time := Time('06:30')
!resBan4.date := Date('2026-05-03')
!resBan4.numberPeople := 1
!resBan4.name := 'Early Meeting'
!resBan4.phoneNumber := '+1-555-5202'
!resBan4.number := 9001
!resBan4.groupName := 'Sunrise Briefing'
!resBan4.paymentMethod := #CreditCard
!resBan4.busService := false

!insert (rest5, resInd5) into RestaurantReservation
!insert (rest5, resBan4) into RestaurantReservation

!insert (resInd5, rc4) into ReservationCustomer

!insert (resInd5, w9) into ReservationWaiter
!insert (resBan4, w9) into ReservationWaiter

!insert (resInd5, t50) into ReservationTable
!insert (resInd5, t51) into ReservationTable

!insert (resBan4, t52) into ReservationTable
```
## Generation 4 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 72 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 6 | 0.00% |
| Phones | 0 | 6 | 0.00% |

# Generation 5
```
!new Restaurant('rest6')
!rest6.name := 'Sunset Tapas Bar'

!new Owner('own12')
!own12.name := 'Ibrahim Noor'
!own12.percentageShares := 70

!new Owner('own13')
!own13.name := 'Elena Fischer'
!own13.percentageShares := 30

!insert (rest6, own12) into RestaurantOwner
!insert (rest6, own13) into RestaurantOwner

!new HeadWaiter('hw5')
!hw5.name := 'Derek Shaw'
!hw5.dateOfBirth := Date('1986-12-12')
!hw5.phoneNumber := '+1-555-6000'

!new Waiter('w10')
!w10.name := 'Chiara Romano'
!w10.dateOfBirth := Date('1997-01-23')
!w10.phoneNumber := '+1-555-6011'
!w10.spokenLanguage := #Italian

!new Waiter('w11')
!w11.name := 'Max Müller'
!w11.dateOfBirth := Date('1994-06-30')
!w11.phoneNumber := '+1-555-6012'
!w11.spokenLanguage := #German

!insert (hw5, w10) into HeadWaiterWaiter
!insert (hw5, w11) into HeadWaiterWaiter

!new Chef('chef8')
!chef8.name := 'Grace Kim'
!chef8.dateOfBirth := Date('1982-02-18')
!chef8.phoneNumber := '+1-555-6100'

!new Cook('cook10')
!cook10.name := 'Pedro Sousa'
!cook10.dateOfBirth := Date('1990-09-09')
!cook10.phoneNumber := '+1-555-6111'
!cook10.yearsOfExperience := 15

!new Cook('cook11')
!cook11.name := 'Nina Berg'
!cook11.dateOfBirth := Date('2004-04-04')
!cook11.phoneNumber := '+1-555-6112'
!cook11.yearsOfExperience := 0

!insert (chef8, cook10) into ChefCook
!insert (chef8, cook11) into ChefCook

!new Allergen('aSeafood6')
!aSeafood6.type := #Seafood

!new Allergen('aGluten6')
!aGluten6.type := #Gluten

!new Allergen('aLactose6')
!aLactose6.type := #Lactose

!new FoodItem('fi30')
!fi30.number := 430
!fi30.description := 'Bread'
!fi30.purchaseFlag := true
!fi30.unit := #Dozen

!new FoodItem('fi31')
!fi31.number := 431
!fi31.description := 'Cheese'
!fi31.purchaseFlag := true
!fi31.unit := #Pound

!new FoodItem('fi32')
!fi32.number := 432
!fi32.description := 'Octopus'
!fi32.purchaseFlag := true
!fi32.unit := #Ounce

!new FoodItem('fi33')
!fi33.number := 433
!fi33.description := 'Olive Oil'
!fi33.purchaseFlag := false
!fi33.unit := #Ounce

!insert (fi30, aGluten6) into FoodItemAllergen
!insert (fi31, aLactose6) into FoodItemAllergen
!insert (fi32, aSeafood6) into FoodItemAllergen
!insert (fi30, aLactose6) into FoodItemAllergen

!new MenuItem('mi11')
!mi11.description := 'Grilled Octopus Pintxo'
!mi11.prepTime := 9.0
!mi11.classification := #Apetizer

!new MenuItem('mi12')
!mi12.description := 'Cheese Toast'
!mi12.prepTime := 5.0
!mi12.classification := #Main

!insert (mi11, chef8) into MenuItemChef
!insert (mi12, chef8) into MenuItemChef

!insert (mi11, fi32) into MenuItemFoodItem
!insert (mi11, fi33) into MenuItemFoodItem
!insert (mi12, fi30) into MenuItemFoodItem
!insert (mi12, fi31) into MenuItemFoodItem
!insert (mi12, fi33) into MenuItemFoodItem

!new Table('t60')
!t60.number := 60
!t60.description := 'High-top two-seat'
!t60.capacity := 2

!new Table('t61')
!t61.number := 61
!t61.description := 'Stool at bar'
!t61.capacity := 1

!new Table('t62')
!t62.number := 62
!t62.description := 'Private nook'
!t62.capacity := 4

!new Individual('resInd6')
!resInd6.time := Time('22:15')
!resInd6.date := Date('2026-06-18')
!resInd6.numberPeople := 3
!resInd6.name := 'Late Snack'
!resInd6.phoneNumber := '+1-555-6201'
!resInd6.number := 10001
!resInd6.seating := #Patio
!resInd6.smoking := #NonSmoking

!new Banquet('resBan5')
!resBan5.time := Time('15:00')
!resBan5.date := Date('2026-06-19')
!resBan5.numberPeople := 0
!resBan5.name := 'Placeholder Booking'
!resBan5.phoneNumber := '+1-555-6202'
!resBan5.number := 11001
!resBan5.groupName := 'TBD'
!resBan5.paymentMethod := #Cash
!resBan5.busService := false

!insert (rest6, resInd6) into RestaurantReservation
!insert (rest6, resBan5) into RestaurantReservation

!insert (resInd6, w10) into ReservationWaiter
!insert (resBan5, w10) into ReservationWaiter
!insert (resBan5, w11) into ReservationWaiter

!insert (resInd6, t60) into ReservationTable
!insert (resInd6, t61) into ReservationTable

!insert (resBan5, t62) into ReservationTable

!new ItemOrder('io30')
!io30.time := Time('22:20')

!insert (resInd6, io30) into ReservationItemOrdered
!insert (io30, mi11) into ItemOrderMenuItem
```
## Generation 5 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 130 | 0.00% |
| Multiplicities Errors | 0 | 27 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 8 | 0.00% |
| Phones | 0 | 8 | 0.00% |

# Generation 6
```
!new Restaurant('rest7')
!rest7.name := 'Mountain Hearth'

!new Owner('own14')
!own14.name := 'Olga Petrenko'
!own14.percentageShares := 25

!new Owner('own15')
!own15.name := 'James O’Neil'
!own15.percentageShares := 25

!new Owner('own16')
!own16.name := 'Fatima Zahra'
!own16.percentageShares := 25

!new Owner('own17')
!own17.name := 'Wei Huang'
!own17.percentageShares := 25

!insert (rest7, own14) into RestaurantOwner
!insert (rest7, own15) into RestaurantOwner
!insert (rest7, own16) into RestaurantOwner
!insert (rest7, own17) into RestaurantOwner

!new HeadWaiter('hw6')
!hw6.name := 'Stella Quinn'
!hw6.dateOfBirth := Date('1987-10-01')
!hw6.phoneNumber := '+1-555-7000'

!new Waiter('w12')
!w12.name := 'Jonas Richter'
!w12.dateOfBirth := Date('1999-01-11')
!w12.phoneNumber := '+1-555-7011'
!w12.spokenLanguage := #German

!new Waiter('w13')
!w13.name := 'Maria Lopez'
!w13.dateOfBirth := Date('1996-08-23')
!w13.phoneNumber := '+1-555-7012'
!w13.spokenLanguage := #Spanish

!insert (hw6, w12) into HeadWaiterWaiter
!insert (hw6, w13) into HeadWaiterWaiter

!new Cook('cook12')
!cook12.name := 'Ethan Snow'
!cook12.dateOfBirth := Date('1992-02-29')
!cook12.phoneNumber := '+1-555-7101'
!cook12.yearsOfExperience := 2

!new Cook('cook13')
!cook13.name := 'Mila Hart'
!cook13.dateOfBirth := Date('1990-07-21')
!cook13.phoneNumber := '+1-555-7104'
!cook13.yearsOfExperience := 11

!new Chef('chef9')
!chef9.name := 'Claire Rowan'
!chef9.dateOfBirth := Date('1980-12-05')
!chef9.phoneNumber := '+1-555-7102'

!new Chef('chef10')
!chef10.name := 'Boris Ivanov'
!chef10.dateOfBirth := Date('1974-04-17')
!chef10.phoneNumber := '+1-555-7103'

!insert (chef9, cook12) into ChefCook
!insert (chef10, cook13) into ChefCook

!new Allergen('aNuts7')
!aNuts7.type := #Nuts

!new Allergen('aLactose7')
!aLactose7.type := #Lactose

!new FoodItem('fi40')
!fi40.number := 540
!fi40.description := 'Walnuts'
!fi40.purchaseFlag := true
!fi40.unit := #Gram

!new FoodItem('fi41')
!fi41.number := 541
!fi41.description := 'Cream'
!fi41.purchaseFlag := true
!fi41.unit := #Ounce

!new FoodItem('fi42')
!fi42.number := 542
!fi42.description := 'Herb Mix'
!fi42.purchaseFlag := false
!fi42.unit := #Gram

!insert (fi40, aNuts7) into FoodItemAllergen
!insert (fi41, aLactose7) into FoodItemAllergen

!new MenuItem('mi13')
!mi13.description := 'Walnut Cream Cake'
!mi13.prepTime := 35.0
!mi13.classification := #Dessert

!new MenuItem('mi14')
!mi14.description := 'Herbal Spritzer'
!mi14.prepTime := 1.5
!mi14.classification := #Beverage

!new MenuItem('mi15')
!mi15.description := 'Chef’s Surprise Plate'
!mi15.prepTime := 22.0
!mi15.classification := #Main

!insert (mi13, chef9) into MenuItemChef
!insert (mi14, chef10) into MenuItemChef
!insert (mi15, chef9) into MenuItemChef

!insert (mi13, fi40) into MenuItemFoodItem
!insert (mi13, fi41) into MenuItemFoodItem
!insert (mi14, fi42) into MenuItemFoodItem
!insert (mi15, fi42) into MenuItemFoodItem

!new Table('t70')
!t70.number := 70
!t70.description := 'Fireplace table'
!t70.capacity := 6

!new Table('t71')
!t71.number := 71
!t71.description := 'Small round table'
!t71.capacity := 3

!new Table('t72')
!t72.number := 72
!t72.description := 'Bench seat'
!t72.capacity := 3

!new RegularCustomer('rc5')
!rc5.name := 'Luca Romano'
!rc5.prefferedLanguage := #Italian

!new Individual('resInd7')
!resInd7.time := Time('16:00')
!resInd7.date := Date('2026-07-04')
!resInd7.numberPeople := 6
!resInd7.name := 'Drop-in Party'
!resInd7.phoneNumber := '+1-555-7201'
!resInd7.number := 12001
!resInd7.seating := #Inside
!resInd7.smoking := #NonSmoking

!new Banquet('resBan6')
!resBan6.time := Time('18:30')
!resBan6.date := Date('2026-07-04')
!resBan6.numberPeople := 6
!resBan6.name := 'Luca Romano'
!resBan6.phoneNumber := '+1-555-7202'
!resBan6.number := 13001
!resBan6.groupName := 'Family Reunion'
!resBan6.paymentMethod := #Cash
!resBan6.busService := false

!insert (rest7, resInd7) into RestaurantReservation
!insert (rest7, resBan6) into RestaurantReservation

!insert (resBan6, rc5) into ReservationCustomer

!insert (resInd7, w12) into ReservationWaiter
!insert (resBan6, w13) into ReservationWaiter

!insert (resInd7, t70) into ReservationTable
!insert (resBan6, t71) into ReservationTable
!insert (resBan6, t72) into ReservationTable

!new DietaryRequirement('dr3')
!dr3.diet := #Halal

!new ReportedAllergy('ra3')
!ra3.allergen := #Seafood
```
## Generation 6 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 140 | 0.00% |
| Multiplicities Errors | 0 | 25 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 9 | 0.00% |
| Phones | 0 | 9 | 0.00% |

# Generation 7
```
!new Restaurant('rest8')
!rest8.name := 'Riverside Diner'

!new Owner('own18')
!own18.name := 'Harper Lin'
!own18.percentageShares := 55

!new Owner('own19')
!own19.name := 'Owen Price'
!own19.percentageShares := 45

!insert (rest8, own18) into RestaurantOwner
!insert (rest8, own19) into RestaurantOwner

!new HeadWaiter('hw7')
!hw7.name := 'Carmen Wells'
!hw7.dateOfBirth := Date('1985-09-09')
!hw7.phoneNumber := '+1-555-8000'

!new Waiter('w14')
!w14.name := 'Noel Hart'
!w14.dateOfBirth := Date('1998-02-18')
!w14.phoneNumber := '+1-555-8011'
!w14.spokenLanguage := #English

!new Waiter('w15')
!w15.name := 'Giulia Ferri'
!w15.dateOfBirth := Date('1993-05-26')
!w15.phoneNumber := '+1-555-8012'
!w15.spokenLanguage := #Italian

!new Waiter('w16')
!w16.name := 'Felix Braun'
!w16.dateOfBirth := Date('2000-11-03')
!w16.phoneNumber := '+1-555-8013'
!w16.spokenLanguage := #German

!insert (hw7, w14) into HeadWaiterWaiter
!insert (hw7, w15) into HeadWaiterWaiter
!insert (hw7, w16) into HeadWaiterWaiter

!new Chef('chef11')
!chef11.name := 'Rosa Delgado'
!chef11.dateOfBirth := Date('1979-03-19')
!chef11.phoneNumber := '+1-555-8101'

!new Chef('chef12')
!chef12.name := 'Anton Weber'
!chef12.dateOfBirth := Date('1988-07-28')
!chef12.phoneNumber := '+1-555-8102'

!new Cook('cook14')
!cook14.name := 'Kara Finch'
!cook14.dateOfBirth := Date('2002-01-10')
!cook14.phoneNumber := '+1-555-8111'
!cook14.yearsOfExperience := 0

!new Cook('cook15')
!cook15.name := 'Victor Hale'
!cook15.dateOfBirth := Date('1986-10-20')
!cook15.phoneNumber := '+1-555-8112'
!cook15.yearsOfExperience := 20

!new Cook('cook16')
!cook16.name := 'Sven Adler'
!cook16.dateOfBirth := Date('1995-04-04')
!cook16.phoneNumber := '+1-555-8113'
!cook16.yearsOfExperience := 3

!insert (chef11, cook14) into ChefCook
!insert (chef11, cook15) into ChefCook
!insert (chef12, cook16) into ChefCook

!new Allergen('aLactose8')
!aLactose8.type := #Lactose

!new Allergen('aGluten8')
!aGluten8.type := #Gluten

!new FoodItem('fi50')
!fi50.number := 650
!fi50.description := 'Short-grain rice'
!fi50.purchaseFlag := true
!fi50.unit := #Pound

!new FoodItem('fi51')
!fi51.number := 651
!fi51.description := 'Mixed vegetables'
!fi51.purchaseFlag := true
!fi51.unit := #Pound

!new FoodItem('fi52')
!fi52.number := 652
!fi52.description := 'Mascarpone'
!fi52.purchaseFlag := true
!fi52.unit := #Ounce

!new FoodItem('fi53')
!fi53.number := 653
!fi53.description := 'Espresso'
!fi53.purchaseFlag := true
!fi53.unit := #Ounce

!new FoodItem('fi54')
!fi54.number := 654
!fi54.description := 'Ladyfingers'
!fi54.purchaseFlag := true
!fi54.unit := #Sheet

!insert (fi52, aLactose8) into FoodItemAllergen
!insert (fi54, aGluten8) into FoodItemAllergen

!new MenuItem('mi16')
!mi16.description := 'Veggie Paella'
!mi16.prepTime := 28.0
!mi16.classification := #Main

!new MenuItem('mi17')
!mi17.description := 'Tiramisu Slice'
!mi17.prepTime := 9.0
!mi17.classification := #Dessert

!new MenuItem('mi18')
!mi18.description := 'Iced Coffee'
!mi18.prepTime := 1.0
!mi18.classification := #Beverage

!insert (mi16, chef11) into MenuItemChef
!insert (mi17, chef12) into MenuItemChef
!insert (mi18, chef11) into MenuItemChef

!insert (mi16, fi50) into MenuItemFoodItem
!insert (mi16, fi51) into MenuItemFoodItem
!insert (mi17, fi52) into MenuItemFoodItem
!insert (mi17, fi53) into MenuItemFoodItem
!insert (mi17, fi54) into MenuItemFoodItem
!insert (mi18, fi53) into MenuItemFoodItem

!new Table('t80')
!t80.number := 80
!t80.description := 'Banquet room table 1'
!t80.capacity := 8

!new Table('t81')
!t81.number := 81
!t81.description := 'Banquet room table 2'
!t81.capacity := 8

!new Table('t82')
!t82.number := 82
!t82.description := 'Banquet room table 3'
!t82.capacity := 4

!new Table('t83')
!t83.number := 83
!t83.description := 'Corner two-top'
!t83.capacity := 2

!new Banquet('resBan7')
!resBan7.time := Time('19:00')
!resBan7.date := Date('2026-08-15')
!resBan7.numberPeople := 20
!resBan7.name := 'Event Desk'
!resBan7.phoneNumber := '+1-555-8201'
!resBan7.number := 14001
!resBan7.groupName := 'River Charity'
!resBan7.paymentMethod := #CreditCard
!resBan7.busService := true

!new Individual('resInd8')
!resInd8.time := Time('07:00')
!resInd8.date := Date('2026-08-16')
!resInd8.numberPeople := 2
!resInd8.name := 'Nadia Holm'
!resInd8.phoneNumber := '+1-555-8202'
!resInd8.number := 15001
!resInd8.seating := #Inside
!resInd8.smoking := #NonSmoking

!insert (rest8, resBan7) into RestaurantReservation
!insert (rest8, resInd8) into RestaurantReservation

!insert (resBan7, w14) into ReservationWaiter
!insert (resBan7, w15) into ReservationWaiter
!insert (resInd8, w16) into ReservationWaiter

!insert (resBan7, t80) into ReservationTable
!insert (resBan7, t81) into ReservationTable
!insert (resBan7, t82) into ReservationTable
!insert (resInd8, t83) into ReservationTable

!new BusDriver('bd4')
!bd4.name := 'Marek Novak'
!bd4.dateOfBirth := Date('1968-06-06')
!bd4.phoneNumber := '+1-555-8301'
!bd4.driverLicenseNr := 'BUS-3001-RV'

!new BusDriver('bd5')
!bd5.name := 'Selma Kline'
!bd5.dateOfBirth := Date('1973-02-14')
!bd5.phoneNumber := '+1-555-8302'
!bd5.driverLicenseNr := 'BUS-3002-RV'

!insert (resBan7, bd4) into BanquetBusDriver
!insert (resBan7, bd5) into BanquetBusDriver

!new ItemOrder('io40')
!io40.time := Time('19:10')

!new ItemOrder('io41')
!io41.time := Time('19:12')

!new ItemOrder('io42')
!io42.time := Time('19:45')

!new ItemOrder('io43')
!io43.time := Time('07:05')

!insert (resBan7, io40) into ReservationItemOrdered
!insert (resBan7, io41) into ReservationItemOrdered
!insert (resBan7, io42) into ReservationItemOrdered
!insert (resInd8, io43) into ReservationItemOrdered

!insert (io40, mi16) into ItemOrderMenuItem
!insert (io41, mi18) into ItemOrderMenuItem
!insert (io42, mi17) into ItemOrderMenuItem
!insert (io43, mi18) into ItemOrderMenuItem

!new RegularCustomer('rc6')
!rc6.name := 'Nadia Holm'
!rc6.prefferedLanguage := #English

!insert (resInd8, rc6) into ReservationCustomer

!new DietaryRequirement('dr4')
!dr4.diet := #Vegan

!new DietaryRequirement('dr5')
!dr5.diet := #Vegetarian

!new ReportedAllergy('ra4')
!ra4.allergen := #Nuts
```
## Generation 7 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 192 | 0.00% |
| Multiplicities Errors | 0 | 39 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 13 | 0.00% |
| Phones | 0 | 13 | 0.00% |

# Generation 8
```
!new Restaurant('rest9')
!rest9.name := 'Seaside Vegan Corner'

!new Owner('own20')
!own20.name := 'Renee Walsh'
!own20.percentageShares := 50

!new Owner('own21')
!own21.name := 'Khalid Mansour'
!own21.percentageShares := 50

!insert (rest9, own20) into RestaurantOwner
!insert (rest9, own21) into RestaurantOwner

!new HeadWaiter('hw8')
!hw8.name := 'Victor Lane'
!hw8.dateOfBirth := Date('1984-01-16')
!hw8.phoneNumber := '+1-555-9000'

!new Waiter('w17')
!w17.name := 'Elisa Neri'
!w17.dateOfBirth := Date('1997-07-07')
!w17.phoneNumber := '+1-555-9011'
!w17.spokenLanguage := #Italian

!new Waiter('w18')
!w18.name := 'Mateo Ruiz'
!w18.dateOfBirth := Date('1991-03-22')
!w18.phoneNumber := '+1-555-9012'
!w18.spokenLanguage := #Spanish

!insert (hw8, w17) into HeadWaiterWaiter
!insert (hw8, w18) into HeadWaiterWaiter

!new Chef('chef13')
!chef13.name := 'June Park'
!chef13.dateOfBirth := Date('1989-05-05')
!chef13.phoneNumber := '+1-555-9101'

!new Chef('chef14')
!chef14.name := 'Tobias Klein'
!chef14.dateOfBirth := Date('1978-09-09')
!chef14.phoneNumber := '+1-555-9102'

!new Cook('cook17')
!cook17.name := 'Arun Das'
!cook17.dateOfBirth := Date('1994-12-12')
!cook17.phoneNumber := '+1-555-9111'
!cook17.yearsOfExperience := 4

!new Cook('cook18')
!cook18.name := 'Sasha Moore'
!cook18.dateOfBirth := Date('2000-10-10')
!cook18.phoneNumber := '+1-555-9112'
!cook18.yearsOfExperience := 0

!insert (chef13, cook17) into ChefCook
!insert (chef14, cook18) into ChefCook

!new FoodItem('fi60')
!fi60.number := 760
!fi60.description := 'Chickpeas'
!fi60.purchaseFlag := true
!fi60.unit := #Pound

!new FoodItem('fi61')
!fi61.number := 761
!fi61.description := 'Tahini'
!fi61.purchaseFlag := true
!fi61.unit := #Ounce

!new FoodItem('fi62')
!fi62.number := 762
!fi62.description := 'Fresh Mint'
!fi62.purchaseFlag := false
!fi62.unit := #Gram

!new MenuItem('mi19')
!mi19.description := 'Chickpea Power Bowl'
!mi19.prepTime := 8.0
!mi19.classification := #Main

!new MenuItem('mi20')
!mi20.description := 'Mint Tea'
!mi20.prepTime := 2.0
!mi20.classification := #Beverage

!insert (mi19, chef13) into MenuItemChef
!insert (mi20, chef14) into MenuItemChef

!insert (mi19, fi60) into MenuItemFoodItem
!insert (mi19, fi61) into MenuItemFoodItem
!insert (mi20, fi62) into MenuItemFoodItem

!new RegularCustomer('rc7')
!rc7.name := 'Paolo Greco'
!rc7.prefferedLanguage := #Italian

!new Banquet('resBan8')
!resBan8.time := Time('05:30')
!resBan8.date := Date('2026-09-01')
!resBan8.numberPeople := 1
!resBan8.name := 'Sponsor Guest'
!resBan8.phoneNumber := '+1-555-9201'
!resBan8.number := 16001
!resBan8.groupName := 'Solo Sponsor'
!resBan8.paymentMethod := #Cash
!resBan8.busService := true

!new Individual('resInd9')
!resInd9.time := Time('12:00')
!resInd9.date := Date('2026-09-01')
!resInd9.numberPeople := 4
!resInd9.name := 'Paolo Greco'
!resInd9.phoneNumber := '+1-555-9202'
!resInd9.number := 17001
!resInd9.seating := #Patio
!resInd9.smoking := #NonSmoking

!insert (resInd9, rc7) into ReservationCustomer

!insert (resBan8, w17) into ReservationWaiter
!insert (resInd9, w18) into ReservationWaiter

!new Table('t90')
!t90.number := 90
!t90.description := 'Single stool table'
!t90.capacity := 1

!new Table('t91')
!t91.number := 91
!t91.description := 'Patio two-top A'
!t91.capacity := 2

!new Table('t92')
!t92.number := 92
!t92.description := 'Patio two-top B'
!t92.capacity := 2

!insert (resBan8, t90) into ReservationTable
!insert (resInd9, t91) into ReservationTable
!insert (resInd9, t92) into ReservationTable
```
## Generation 8 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 114 | 0.00% |
| Multiplicities Errors | 0 | 17 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 9 | 0.00% |
| Phones | 0 | 9 | 0.00% |

# Generation 9
```
!new Restaurant('rest10')
!rest10.name := 'Pop-up Fusion Lab'

!new Owner('own22')
!own22.name := 'Gwen Hart'
!own22.percentageShares := 98

!new Owner('own23')
!own23.name := 'Rafi Cohen'
!own23.percentageShares := 1

!new Owner('own24')
!own24.name := 'Mei Alvarez'
!own24.percentageShares := 1

!insert (rest10, own22) into RestaurantOwner
!insert (rest10, own23) into RestaurantOwner
!insert (rest10, own24) into RestaurantOwner

!new HeadWaiter('hw9')
!hw9.name := 'Tariq Owens'
!hw9.dateOfBirth := Date('1983-03-13')
!hw9.phoneNumber := '+1-555-9500'

!new Waiter('w19')
!w19.name := 'Elena Soto'
!w19.dateOfBirth := Date('2001-01-01')
!w19.phoneNumber := '+1-555-9511'
!w19.spokenLanguage := #English

!insert (hw9, w19) into HeadWaiterWaiter

!new Chef('chef15')
!chef15.name := 'Hugo Bernard'
!chef15.dateOfBirth := Date('1986-06-06')
!chef15.phoneNumber := '+1-555-9601'

!new Cook('cook19')
!cook19.name := 'Kim Norris'
!cook19.dateOfBirth := Date('1999-09-09')
!cook19.phoneNumber := '+1-555-9602'
!cook19.yearsOfExperience := 0

!insert (chef15, cook19) into ChefCook

!new Allergen('aNuts10')
!aNuts10.type := #Nuts

!new FoodItem('fi70')
!fi70.number := 870
!fi70.description := 'Peanut Sauce Base'
!fi70.purchaseFlag := true
!fi70.unit := #Ounce

!new FoodItem('fi71')
!fi71.number := 871
!fi71.description := 'Rice Paper'
!fi71.purchaseFlag := true
!fi71.unit := #Sheet

!new FoodItem('fi72')
!fi72.number := 872
!fi72.description := 'Lime'
!fi72.purchaseFlag := false
!fi72.unit := #Dozen

!insert (fi70, aNuts10) into FoodItemAllergen

!new MenuItem('mi21')
!mi21.description := 'Peanut Lime Wrap'
!mi21.prepTime := 7.5
!mi21.classification := #Apetizer

!new MenuItem('mi22')
!mi22.description := 'Rice Paper Citrus Roll'
!mi22.prepTime := 5.0
!mi22.classification := #Dessert

!insert (mi21, chef15) into MenuItemChef
!insert (mi22, chef15) into MenuItemChef

!insert (mi21, fi70) into MenuItemFoodItem
!insert (mi21, fi71) into MenuItemFoodItem
!insert (mi21, fi72) into MenuItemFoodItem
!insert (mi22, fi71) into MenuItemFoodItem
!insert (mi22, fi72) into MenuItemFoodItem

!new Table('t100')
!t100.number := 100
!t100.description := 'Modular table section A'
!t100.capacity := 6

!new Table('t101')
!t101.number := 101
!t101.description := 'Modular table section B'
!t101.capacity := 4

!new Table('t102')
!t102.number := 102
!t102.description := 'Single standing table'
!t102.capacity := 1

!new Banquet('resBan9')
!resBan9.time := Time('21:45')
!resBan9.date := Date('2026-10-31')
!resBan9.numberPeople := 10
!resBan9.name := 'Night Market Host'
!resBan9.phoneNumber := '+1-555-9701'
!resBan9.number := 18001
!resBan9.groupName := 'Night Market Collective'
!resBan9.paymentMethod := #Cash
!resBan9.busService := true

!insert (rest10, resBan9) into RestaurantReservation

!insert (resBan9, w19) into ReservationWaiter
!insert (resBan9, t100) into ReservationTable
!insert (resBan9, t101) into ReservationTable

!new ItemOrder('io50')
!io50.time := Time('22:00')

!new ItemOrder('io51')
!io51.time := Time('22:05')

!new ItemOrder('io52')
!io52.time := Time('22:06')

!insert (resBan9, io50) into ReservationItemOrdered
!insert (resBan9, io51) into ReservationItemOrdered
!insert (resBan9, io52) into ReservationItemOrdered

!insert (io50, mi21) into ItemOrderMenuItem
!insert (io51, mi22) into ItemOrderMenuItem
!insert (io52, mi21) into ItemOrderMenuItem

!new Individual('resInd10')
!resInd10.time := Time('23:59')
!resInd10.date := Date('2026-12-31')
!resInd10.numberPeople := 1
!resInd10.name := 'Anonymous Late Guest'
!resInd10.phoneNumber := '+1-555-9702'
!resInd10.number := 19001
!resInd10.seating := #Inside
!resInd10.smoking := #NonSmoking

!insert (resInd10, w19) into ReservationWaiter
!insert (resInd10, t102) into ReservationTable
```
## Generation 9 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 116 | 0.00% |
| Multiplicities Errors | 0 | 25 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 6 | 0.00% |
| Phones | 0 | 6 | 0.00% |

# Generation 10
```
!new Restaurant('rest11')
!rest11.name := 'Archive Supper Club'

!new Owner('own25')
!own25.name := 'Selene Carter'
!own25.percentageShares := 70

!new Owner('own26')
!own26.name := 'Amir Haddad'
!own26.percentageShares := 20

!new Owner('own27')
!own27.name := 'Petra Voss'
!own27.percentageShares := 10

!insert (rest11, own25) into RestaurantOwner
!insert (rest11, own26) into RestaurantOwner
!insert (rest11, own27) into RestaurantOwner

!new HeadWaiter('hw10')
!hw10.name := 'Morgan Pike'
!hw10.dateOfBirth := Date('1977-07-17')
!hw10.phoneNumber := '+1-555-1100'

!new Waiter('w20')
!w20.name := 'Leonie Brandt'
!w20.dateOfBirth := Date('1998-03-15')
!w20.phoneNumber := '+1-555-1101'
!w20.spokenLanguage := #German

!new Waiter('w21')
!w21.name := 'Caleb Stone'
!w21.dateOfBirth := Date('1994-09-09')
!w21.phoneNumber := '+1-555-1102'
!w21.spokenLanguage := #English

!insert (hw10, w20) into HeadWaiterWaiter
!insert (hw10, w21) into HeadWaiterWaiter

!new Chef('chef16')
!chef16.name := 'Isabella Moretti'
!chef16.dateOfBirth := Date('1988-08-08')
!chef16.phoneNumber := '+1-555-1110'

!new Cook('cook20')
!cook20.name := 'Noor Aziz'
!cook20.dateOfBirth := Date('2002-02-02')
!cook20.phoneNumber := '+1-555-1111'
!cook20.yearsOfExperience := 0

!insert (chef16, cook20) into ChefCook

!new Allergen('aNuts11')
!aNuts11.type := #Nuts

!new Allergen('aGluten11')
!aGluten11.type := #Gluten

!new FoodItem('fi80')
!fi80.number := 980
!fi80.description := 'Sourdough Crumbs'
!fi80.purchaseFlag := true
!fi80.unit := #Pound

!new FoodItem('fi81')
!fi81.number := 981
!fi81.description := 'Roasted Hazelnuts'
!fi81.purchaseFlag := true
!fi81.unit := #Gram

!new FoodItem('fi82')
!fi82.number := 982
!fi82.description := 'Tomato Paste'
!fi82.purchaseFlag := false
!fi82.unit := #Ounce

!insert (fi80, aGluten11) into FoodItemAllergen
!insert (fi81, aNuts11) into FoodItemAllergen

!new MenuItem('mi23')
!mi23.description := 'Still Water'
!mi23.prepTime := 0.0
!mi23.classification := #Beverage

!new MenuItem('mi24')
!mi24.description := 'Tomato Hazelnut Crust Pasta'
!mi24.prepTime := 16.0
!mi24.classification := #Main

!insert (mi23, chef16) into MenuItemChef
!insert (mi24, chef16) into MenuItemChef

!insert (mi24, fi80) into MenuItemFoodItem
!insert (mi24, fi81) into MenuItemFoodItem
!insert (mi24, fi82) into MenuItemFoodItem

!new Table('t110')
!t110.number := 110
!t110.description := 'Quiet alcove table'
!t110.capacity := 3

!new Table('t111')
!t111.number := 111
!t111.description := 'Adjacent side table'
!t111.capacity := 2

!new Table('t112')
!t112.number := 112
!t112.description := 'Private room long table'
!t112.capacity := 8

!new Individual('resInd11')
!resInd11.time := Time('18:45')
!resInd11.date := Date('2026-11-05')
!resInd11.numberPeople := 5
!resInd11.name := 'Research Dinner'
!resInd11.phoneNumber := '+1-555-1120'
!resInd11.number := 20011
!resInd11.seating := #Inside
!resInd11.smoking := #NonSmoking

!new Banquet('resBan10')
!resBan10.time := Time('13:15')
!resBan10.date := Date('2026-11-06')
!resBan10.numberPeople := 8
!resBan10.name := 'Club Secretary'
!resBan10.phoneNumber := '+1-555-1121'
!resBan10.number := 21011
!resBan10.groupName := 'Archivists Guild'
!resBan10.paymentMethod := #Cash
!resBan10.busService := true

!insert (rest11, resInd11) into RestaurantReservation
!insert (rest11, resBan10) into RestaurantReservation

!insert (resInd11, w20) into ReservationWaiter
!insert (resBan10, w21) into ReservationWaiter

!insert (resInd11, t110) into ReservationTable
!insert (resInd11, t111) into ReservationTable
!insert (resBan10, t112) into ReservationTable

!new ItemOrder('io60')
!io60.time := Time('13:20')

!insert (resBan10, io60) into ReservationItemOrdered
!insert (io60, mi23) into ItemOrderMenuItem
```
## Generation 10 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 116 | 0.00% |
| Multiplicities Errors | 0 | 22 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 7 | 0.00% |
| Phones | 0 | 7 | 0.00% |

# Generation 11
```
!new Restaurant('rest12')
!rest12.name := 'Desert Caravan Kitchen'

!new Owner('own28')
!own28.name := 'Nora Hassan'
!own28.percentageShares := 50

!new Owner('own29')
!own29.name := 'Elliot Shaw'
!own29.percentageShares := 40

!new Owner('own30')
!own30.name := 'Priit Saar'
!own30.percentageShares := 10

!insert (rest12, own28) into RestaurantOwner
!insert (rest12, own29) into RestaurantOwner
!insert (rest12, own30) into RestaurantOwner

!new HeadWaiter('hw11')
!hw11.name := 'Simone Grant'
!hw11.dateOfBirth := Date('1981-02-08')
!hw11.phoneNumber := '+1-555-1200'

!new Waiter('w22')
!w22.name := 'Ava Hill'
!w22.dateOfBirth := Date('1999-10-10')
!w22.phoneNumber := '+1-555-1201'
!w22.spokenLanguage := #English

!new Waiter('w23')
!w23.name := 'Rafael Cruz'
!w23.dateOfBirth := Date('1992-04-14')
!w23.phoneNumber := '+1-555-1202'
!w23.spokenLanguage := #Spanish

!new Waiter('w24')
!w24.name := 'Lena Vogel'
!w24.dateOfBirth := Date('1996-06-06')
!w24.phoneNumber := '+1-555-1203'
!w24.spokenLanguage := #German

!new Waiter('w25')
!w25.name := 'Gianni Rizzo'
!w25.dateOfBirth := Date('1989-09-19')
!w25.phoneNumber := '+1-555-1204'
!w25.spokenLanguage := #Italian

!insert (hw11, w22) into HeadWaiterWaiter
!insert (hw11, w23) into HeadWaiterWaiter
!insert (hw11, w24) into HeadWaiterWaiter
!insert (hw11, w25) into HeadWaiterWaiter

!new Chef('chef17')
!chef17.name := 'Mira Alston'
!chef17.dateOfBirth := Date('1976-03-03')
!chef17.phoneNumber := '+1-555-1210'

!new Chef('chef18')
!chef18.name := 'Stefan Keller'
!chef18.dateOfBirth := Date('1983-11-11')
!chef18.phoneNumber := '+1-555-1211'

!new Cook('cook21')
!cook21.name := 'Jon Peretz'
!cook21.dateOfBirth := Date('1991-01-21')
!cook21.phoneNumber := '+1-555-1221'
!cook21.yearsOfExperience := 6

!new Cook('cook22')
!cook22.name := 'Dana Wu'
!cook22.dateOfBirth := Date('2004-07-07')
!cook22.phoneNumber := '+1-555-1222'
!cook22.yearsOfExperience := 0

!new Cook('cook23')
!cook23.name := 'Hakeem Saleh'
!cook23.dateOfBirth := Date('1988-05-05')
!cook23.phoneNumber := '+1-555-1223'
!cook23.yearsOfExperience := 14

!insert (chef17, cook21) into ChefCook
!insert (chef17, cook22) into ChefCook
!insert (chef18, cook23) into ChefCook

!new Allergen('aSeafood12')
!aSeafood12.type := #Seafood

!new Allergen('aGluten12')
!aGluten12.type := #Gluten

!new Allergen('aNuts12')
!aNuts12.type := #Nuts

!new Allergen('aLactose12')
!aLactose12.type := #Lactose

!new FoodItem('fi90')
!fi90.number := 1090
!fi90.description := 'Pita Bread'
!fi90.purchaseFlag := true
!fi90.unit := #Dozen

!new FoodItem('fi91')
!fi91.number := 1091
!fi91.description := 'Yogurt'
!fi91.purchaseFlag := true
!fi91.unit := #Ounce

!new FoodItem('fi92')
!fi92.number := 1092
!fi92.description := 'Pine Nuts'
!fi92.purchaseFlag := true
!fi92.unit := #Gram

!new FoodItem('fi93')
!fi93.number := 1093
!fi93.description := 'Lemon'
!fi93.purchaseFlag := false
!fi93.unit := #Dozen

!new FoodItem('fi94')
!fi94.number := 1094
!fi94.description := 'Shrimp'
!fi94.purchaseFlag := true
!fi94.unit := #Pound

!insert (fi90, aGluten12) into FoodItemAllergen
!insert (fi91, aLactose12) into FoodItemAllergen
!insert (fi92, aNuts12) into FoodItemAllergen
!insert (fi94, aSeafood12) into FoodItemAllergen

!new MenuItem('mi25')
!mi25.description := 'Lemon Yogurt Chicken Plate'
!mi25.prepTime := 17.0
!mi25.classification := #Main

!new MenuItem('mi26')
!mi26.description := 'Pine Nut Yogurt Parfait'
!mi26.prepTime := 6.5
!mi26.classification := #Dessert

!new MenuItem('mi27')
!mi27.description := 'Lemon Soda'
!mi27.prepTime := 0.0
!mi27.classification := #Beverage

!new MenuItem('mi28')
!mi28.description := 'Shrimp Skewer'
!mi28.prepTime := 10.0
!mi28.classification := #Apetizer

!insert (mi25, chef17) into MenuItemChef
!insert (mi26, chef18) into MenuItemChef
!insert (mi27, chef17) into MenuItemChef
!insert (mi28, chef18) into MenuItemChef

!insert (mi25, fi90) into MenuItemFoodItem
!insert (mi25, fi91) into MenuItemFoodItem
!insert (mi25, fi93) into MenuItemFoodItem
!insert (mi26, fi91) into MenuItemFoodItem
!insert (mi26, fi92) into MenuItemFoodItem
!insert (mi27, fi93) into MenuItemFoodItem
!insert (mi28, fi94) into MenuItemFoodItem
!insert (mi28, fi93) into MenuItemFoodItem

!new Table('t120')
!t120.number := 120
!t120.description := 'Stool 1'
!t120.capacity := 1

!new Table('t121')
!t121.number := 121
!t121.description := 'Stool 2'
!t121.capacity := 1

!new Table('t122')
!t122.number := 122
!t122.description := 'Stool 3'
!t122.capacity := 1

!new Table('t123')
!t123.number := 123
!t123.description := 'Stool 4'
!t123.capacity := 1

!new Table('t124')
!t124.number := 124
!t124.description := 'Stool 5'
!t124.capacity := 1

!new Table('t125')
!t125.number := 125
!t125.description := 'Stool 6'
!t125.capacity := 1

!new Table('t126')
!t126.number := 126
!t126.description := 'Stool 7'
!t126.capacity := 1

!new Table('t127')
!t127.number := 127
!t127.description := 'Long banquet table'
!t127.capacity := 12

!new Table('t128')
!t128.number := 128
!t128.description := 'Small two-top'
!t128.capacity := 2

!new RegularCustomer('rc8')
!rc8.name := 'Bianca Conti'
!rc8.prefferedLanguage := #Italian

!new Individual('resInd12')
!resInd12.time := Time('14:10')
!resInd12.date := Date('2026-12-12')
!resInd12.numberPeople := 7
!resInd12.name := 'Afternoon Study Group'
!resInd12.phoneNumber := '+1-555-1230'
!resInd12.number := 22001
!resInd12.seating := #Inside
!resInd12.smoking := #NonSmoking

!new Individual('resInd13')
!resInd13.time := Time('20:20')
!resInd13.date := Date('2026-12-12')
!resInd13.numberPeople := 2
!resInd13.name := 'Bianca Conti'
!resInd13.phoneNumber := '+1-555-1231'
!resInd13.number := 22002
!resInd13.seating := #Patio
!resInd13.smoking := #NonSmoking

!new Banquet('resBan11')
!resBan11.time := Time('18:00')
!resBan11.date := Date('2026-12-13')
!resBan11.numberPeople := 12
!resBan11.name := 'Coordinator'
!resBan11.phoneNumber := '+1-555-1232'
!resBan11.number := 23001
!resBan11.groupName := 'Desert Marathon Crew'
!resBan11.paymentMethod := #CreditCard
!resBan11.busService := true

!insert (rest12, resInd12) into RestaurantReservation
!insert (rest12, resInd13) into RestaurantReservation
!insert (rest12, resBan11) into RestaurantReservation

!insert (resInd13, rc8) into ReservationCustomer

!insert (resInd12, w22) into ReservationWaiter
!insert (resInd12, w23) into ReservationWaiter
!insert (resInd13, w24) into ReservationWaiter
!insert (resBan11, w25) into ReservationWaiter
!insert (resBan11, w23) into ReservationWaiter

!insert (resInd12, t120) into ReservationTable
!insert (resInd12, t121) into ReservationTable
!insert (resInd12, t122) into ReservationTable
!insert (resInd12, t123) into ReservationTable
!insert (resInd12, t124) into ReservationTable
!insert (resInd12, t125) into ReservationTable
!insert (resInd12, t126) into ReservationTable

!insert (resInd13, t128) into ReservationTable

!insert (resBan11, t127) into ReservationTable

!new BusDriver('bd6')
!bd6.name := 'Gus Palmer'
!bd6.dateOfBirth := Date('1967-08-08')
!bd6.phoneNumber := '+1-555-1240'
!bd6.driverLicenseNr := 'BUS-8840-DC'

!new BusDriver('bd7')
!bd7.name := 'Helena Ortiz'
!bd7.dateOfBirth := Date('1971-01-30')
!bd7.phoneNumber := '+1-555-1241'
!bd7.driverLicenseNr := 'BUS-8841-DC'

!insert (resBan11, bd6) into BanquetBusDriver
!insert (resBan11, bd7) into BanquetBusDriver

!new ItemOrder('io70')
!io70.time := Time('20:25')

!insert (resInd13, io70) into ReservationItemOrdered
!insert (io70, mi28) into ItemOrderMenuItem

!new ItemOrder('io71')
!io71.time := Time('18:05')

!new ItemOrder('io72')
!io72.time := Time('18:07')

!new ItemOrder('io73')
!io73.time := Time('18:30')

!insert (resBan11, io71) into ReservationItemOrdered
!insert (resBan11, io72) into ReservationItemOrdered
!insert (resBan11, io73) into ReservationItemOrdered

!insert (io71, mi25) into ItemOrderMenuItem
!insert (io72, mi27) into ItemOrderMenuItem
!insert (io73, mi26) into ItemOrderMenuItem

!new DietaryRequirement('dr6')
!dr6.diet := #Vegetarian

!new ReportedAllergy('ra5')
!ra5.allergen := #Gluten
```
## Generation 11 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 250 | 0.00% |
| Multiplicities Errors | 0 | 54 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 15 | 0.00% |
| Phones | 0 | 15 | 0.00% |

# Generation 12
```
!new Restaurant('rest13')
!rest13.name := 'Orchard Tasting Room'

!new Owner('own31')
!own31.name := 'Elias Stone'
!own31.percentageShares := 0

!new Owner('own32')
!own32.name := 'Marina Keller'
!own32.percentageShares := 100

!insert (rest13, own31) into RestaurantOwner
!insert (rest13, own32) into RestaurantOwner

!new HeadWaiter('hw12')
!hw12.name := 'Rowan Pierce'
!hw12.dateOfBirth := Date('1990-05-20')
!hw12.phoneNumber := '+1-555-1300'

!new Waiter('w26')
!w26.name := 'Tessa Varga'
!w26.dateOfBirth := Date('2001-12-12')
!w26.phoneNumber := '+1-555-1301'
!w26.spokenLanguage := #English

!new Waiter('w27')
!w27.name := 'Nils Schneider'
!w27.dateOfBirth := Date('1995-08-08')
!w27.phoneNumber := '+1-555-1302'
!w27.spokenLanguage := #German

!insert (hw12, w26) into HeadWaiterWaiter
!insert (hw12, w27) into HeadWaiterWaiter

!new Chef('chef19')
!chef19.name := 'Helio Santos'
!chef19.dateOfBirth := Date('1982-10-10')
!chef19.phoneNumber := '+1-555-1310'

!new Cook('cook24')
!cook24.name := 'Maya Quinn'
!cook24.dateOfBirth := Date('1999-03-03')
!cook24.phoneNumber := '+1-555-1311'
!cook24.yearsOfExperience := 0

!new Cook('cook25')
!cook25.name := 'George Ivers'
!cook25.dateOfBirth := Date('1987-01-27')
!cook25.phoneNumber := '+1-555-1312'
!cook25.yearsOfExperience := 18

!insert (chef19, cook24) into ChefCook
!insert (chef19, cook25) into ChefCook

!new Manager('mgr2')
!mgr2.name := 'Sabrina Holt'
!mgr2.dateOfBirth := Date('1973-04-04')
!mgr2.phoneNumber := '+1-555-1320'

!new Table('t130')
!t130.number := 130
!t130.description := ''
!t130.capacity := 1

!new Table('t131')
!t131.number := 131
!t131.description := 'Chef pass seating'
!t131.capacity := 3

!new MenuItem('mi29')
!mi29.description := 'House Bread (complimentary)'
!mi29.prepTime := 0.0
!mi29.classification := #Apetizer

!new MenuItem('mi30')
!mi30.description := 'Zero-Prep Water'
!mi30.prepTime := 0.0
!mi30.classification := #Beverage

!insert (mi29, chef19) into MenuItemChef
!insert (mi30, chef19) into MenuItemChef

!new Allergen('aLactose13')
!aLactose13.type := #Lactose

!new FoodItem('fi100')
!fi100.number := 1200
!fi100.description := 'Milk (unused stock item)'
!fi100.purchaseFlag := true
!fi100.unit := #Ounce

!new FoodItem('fi101')
!fi101.number := 1201
!fi101.description := 'Salt (no declared allergens)'
!fi101.purchaseFlag := false
!fi101.unit := #Gram

!insert (fi100, aLactose13) into FoodItemAllergen

!new DietaryRequirement('dr7')
!dr7.diet := #Kosher

!new ReportedAllergy('ra6')
!ra6.allergen := #Gluten

!new Individual('resInd14')
!resInd14.time := Time('17:00')
!resInd14.date := Date('2026-12-01')
!resInd14.numberPeople := 1
!resInd14.name := 'Solo Archivist'
!resInd14.phoneNumber := '+1-555-1331'
!resInd14.number := 24001
!resInd14.seating := #Inside
!resInd14.smoking := #NonSmoking

!new Individual('resInd15')
!resInd15.time := Time('17:15')
!resInd15.date := Date('2026-12-01')
!resInd15.numberPeople := 3
!resInd15.name := 'Kitchen Tour Trio'
!resInd15.phoneNumber := '+1-555-1332'
!resInd15.number := 24002
!resInd15.seating := #Inside
!resInd15.smoking := #NonSmoking

!insert (rest13, resInd14) into RestaurantReservation
!insert (rest13, resInd15) into RestaurantReservation

!insert (resInd14, t130) into ReservationTable
!insert (resInd15, t131) into ReservationTable

!insert (resInd14, w26) into ReservationWaiter
!insert (resInd15, w26) into ReservationWaiter
!insert (resInd15, w27) into ReservationWaiter

!new ItemOrder('io80')
!io80.time := Time('17:02')

!new ItemOrder('io81')
!io81.time := Time('17:18')

!insert (resInd14, io80) into ReservationItemOrdered
!insert (resInd15, io81) into ReservationItemOrdered

!insert (io80, mi30) into ItemOrderMenuItem
!insert (io81, mi29) into ItemOrderMenuItem
```
## Generation 12 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 114 | 0.00% |
| Multiplicities Errors | 0 | 20 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 9 | 0.00% |
| Phones | 0 | 9 | 0.00% |

# Generation 13
```
!new Restaurant('rest14')
!rest14.name := 'Museum Lunch Counter'

!new Owner('own33')
!own33.name := 'Nia Brooks'
!own33.percentageShares := 100

!insert (rest14, own33) into RestaurantOwner

!new HeadWaiter('hw13')
!hw13.name := 'Oskar Hahn'
!hw13.dateOfBirth := Date('1981-01-01')
!hw13.phoneNumber := '+1-555-1400'

!new Waiter('w28')
!w28.name := 'Clara Diaz'
!w28.dateOfBirth := Date('1999-09-19')
!w28.phoneNumber := '+1-555-1401'
!w28.spokenLanguage := #Spanish

!new Waiter('w29')
!w29.name := 'Ben Turner'
!w29.dateOfBirth := Date('1996-06-06')
!w29.phoneNumber := '+1-555-1402'
!w29.spokenLanguage := #English

!insert (hw13, w28) into HeadWaiterWaiter
!insert (hw13, w29) into HeadWaiterWaiter

!new Manager('mgr3')
!mgr3.name := 'Tina Meyer'
!mgr3.dateOfBirth := Date('1975-05-05')
!mgr3.phoneNumber := '+1-555-1409'

!new Chef('chef20')
!chef20.name := 'Ken Morgan'
!chef20.dateOfBirth := Date('1988-08-18')
!chef20.phoneNumber := '+1-555-1410'

!new Cook('cook26')
!cook26.name := 'Asha Verma'
!cook26.dateOfBirth := Date('2000-02-20')
!cook26.phoneNumber := '+1-555-1411'
!cook26.yearsOfExperience := 0

!new Cook('cook27')
!cook27.name := 'Paul Steiner'
!cook27.dateOfBirth := Date('1991-11-21')
!cook27.phoneNumber := '+1-555-1412'
!cook27.yearsOfExperience := 9

!insert (chef20, cook26) into ChefCook
!insert (chef20, cook27) into ChefCook

!new BusDriver('bd8')
!bd8.name := 'Ronan Fields'
!bd8.dateOfBirth := Date('1966-10-10')
!bd8.phoneNumber := '+1-555-1420'
!bd8.driverLicenseNr := 'BUS-9910-ML'

!new Allergen('aNuts14')
!aNuts14.type := #Nuts

!new Allergen('aGluten14')
!aGluten14.type := #Gluten

!new FoodItem('fi110')
!fi110.number := 1310
!fi110.description := 'Wholegrain Bread Loaf'
!fi110.purchaseFlag := true
!fi110.unit := #Pound

!new FoodItem('fi111')
!fi111.number := 1311
!fi111.description := 'Peanut Spread'
!fi111.purchaseFlag := true
!fi111.unit := #Ounce

!new FoodItem('fi112')
!fi112.number := 1312
!fi112.description := 'Tomatoes'
!fi112.purchaseFlag := false
!fi112.unit := #Dozen

!insert (fi110, aGluten14) into FoodItemAllergen
!insert (fi111, aNuts14) into FoodItemAllergen

!new MenuItem('mi31')
!mi31.description := 'Peanut Toast'
!mi31.prepTime := 3.0
!mi31.classification := #Apetizer

!new MenuItem('mi32')
!mi32.description := 'Tomato Sandwich'
!mi32.prepTime := 4.5
!mi32.classification := #Main

!new MenuItem('mi33')
!mi33.description := 'Tap Water'
!mi33.prepTime := 0.0
!mi33.classification := #Beverage

!insert (mi31, chef20) into MenuItemChef
!insert (mi32, chef20) into MenuItemChef
!insert (mi33, chef20) into MenuItemChef

!insert (mi31, fi110) into MenuItemFoodItem
!insert (mi31, fi111) into MenuItemFoodItem
!insert (mi32, fi110) into MenuItemFoodItem
!insert (mi32, fi112) into MenuItemFoodItem

!new Table('t140')
!t140.number := 140
!t140.description := 'Counter seat A'
!t140.capacity := 1

!new Table('t141')
!t141.number := 141
!t141.description := 'Counter seat B'
!t141.capacity := 1

!new Table('t142')
!t142.number := 142
!t142.description := 'Small table'
!t142.capacity := 2

!new Banquet('resBan12')
!resBan12.time := Time('10:00')
!resBan12.date := Date('2026-10-10')
!resBan12.numberPeople := 2
!resBan12.name := 'Docent Office'
!resBan12.phoneNumber := '+1-555-1430'
!resBan12.number := 25001
!resBan12.groupName := 'VIP Shuttle Breakfast'
!resBan12.paymentMethod := #Cash
!resBan12.busService := true

!new Individual('resInd16')
!resInd16.time := Time('12:15')
!resInd16.date := Date('2026-10-10')
!resInd16.numberPeople := 2
!resInd16.name := 'Gallery Visitors'
!resInd16.phoneNumber := '+1-555-1431'
!resInd16.number := 25002
!resInd16.seating := #Inside
!resInd16.smoking := #NonSmoking

!insert (rest14, resBan12) into RestaurantReservation
!insert (rest14, resInd16) into RestaurantReservation

!insert (resBan12, bd8) into BanquetBusDriver

!insert (resBan12, w28) into ReservationWaiter
!insert (resInd16, w29) into ReservationWaiter

!insert (resBan12, t140) into ReservationTable
!insert (resBan12, t141) into ReservationTable
!insert (resInd16, t142) into ReservationTable

!new ItemOrder('io90')
!io90.time := Time('10:05')

!new ItemOrder('io91')
!io91.time := Time('12:20')

!insert (resBan12, io90) into ReservationItemOrdered
!insert (resInd16, io91) into ReservationItemOrdered

!insert (io90, mi33) into ItemOrderMenuItem
!insert (io91, mi32) into ItemOrderMenuItem
```
## Generation 13 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 134 | 0.00% |
| Multiplicities Errors | 0 | 26 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 10 | 0.00% |
| Phones | 0 | 10 | 0.00% |

# Generation 14
```
!new Restaurant('rest15')
!rest15.name := 'Comet Night Kitchen'

!new Owner('own34')
!own34.name := 'Aiden Ross'
!own34.percentageShares := 34

!new Owner('own35')
!own35.name := 'Beatriz Luna'
!own35.percentageShares := 33

!new Owner('own36')
!own36.name := 'Chen Wu'
!own36.percentageShares := 33

!insert (rest15, own34) into RestaurantOwner
!insert (rest15, own35) into RestaurantOwner
!insert (rest15, own36) into RestaurantOwner

!new HeadWaiter('hw14')
!hw14.name := 'Nolan Pierce'
!hw14.dateOfBirth := Date('1989-09-09')
!hw14.phoneNumber := '+1-555-1500'

!new Waiter('w30')
!w30.name := 'Eva Schmidt'
!w30.dateOfBirth := Date('1998-04-14')
!w30.phoneNumber := '+1-555-1501'
!w30.spokenLanguage := #German

!new Waiter('w31')
!w31.name := 'Mateo Silva'
!w31.dateOfBirth := Date('1993-12-12')
!w31.phoneNumber := '+1-555-1502'
!w31.spokenLanguage := #Spanish

!new Waiter('w32')
!w32.name := 'Iris Bell'
!w32.dateOfBirth := Date('2000-06-06')
!w32.phoneNumber := '+1-555-1503'
!w32.spokenLanguage := #English

!insert (hw14, w30) into HeadWaiterWaiter
!insert (hw14, w31) into HeadWaiterWaiter
!insert (hw14, w32) into HeadWaiterWaiter

!new Manager('mgr4')
!mgr4.name := 'Keira Vaughn'
!mgr4.dateOfBirth := Date('1978-01-23')
!mgr4.phoneNumber := '+1-555-1510'

!new Chef('chef21')
!chef21.name := 'Soren Nygaard'
!chef21.dateOfBirth := Date('1982-02-02')
!chef21.phoneNumber := '+1-555-1520'

!new Chef('chef22')
!chef22.name := 'Lucia Baresi'
!chef22.dateOfBirth := Date('1987-07-17')
!chef22.phoneNumber := '+1-555-1521'

!new Cook('cook28')
!cook28.name := 'Pavel Orlov'
!cook28.dateOfBirth := Date('1995-05-05')
!cook28.phoneNumber := '+1-555-1530'
!cook28.yearsOfExperience := 8

!new Cook('cook29')
!cook29.name := 'Nina Cho'
!cook29.dateOfBirth := Date('2003-03-03')
!cook29.phoneNumber := '+1-555-1531'
!cook29.yearsOfExperience := 0

!new Cook('cook30')
!cook30.name := 'Tarek Ali'
!cook30.dateOfBirth := Date('1991-11-11')
!cook30.phoneNumber := '+1-555-1532'
!cook30.yearsOfExperience := 13

!insert (chef21, cook28) into ChefCook
!insert (chef21, cook29) into ChefCook
!insert (chef22, cook30) into ChefCook

!new Allergen('aNuts15')
!aNuts15.type := #Nuts

!new Allergen('aGluten15')
!aGluten15.type := #Gluten

!new Allergen('aLactose15')
!aLactose15.type := #Lactose

!new FoodItem('fi120')
!fi120.number := 1410
!fi120.description := 'Toasted Sesame-Nut Mix'
!fi120.purchaseFlag := true
!fi120.unit := #Gram

!new FoodItem('fi121')
!fi121.number := 1411
!fi121.description := 'Wheat Noodles'
!fi121.purchaseFlag := true
!fi121.unit := #Pound

!new FoodItem('fi122')
!fi122.number := 1412
!fi122.description := 'Cream Sauce Base'
!fi122.purchaseFlag := true
!fi122.unit := #Ounce

!new FoodItem('fi123')
!fi123.number := 1413
!fi123.description := 'Sparkling Water Bottles'
!fi123.purchaseFlag := false
!fi123.unit := #Dozen

!insert (fi120, aNuts15) into FoodItemAllergen
!insert (fi120, aGluten15) into FoodItemAllergen
!insert (fi121, aGluten15) into FoodItemAllergen
!insert (fi122, aLactose15) into FoodItemAllergen

!new MenuItem('mi34')
!mi34.description := 'Midnight Noodle Bowl'
!mi34.prepTime := 13.0
!mi34.classification := #Main

!new MenuItem('mi35')
!mi35.description := 'Nut Crunch Topping'
!mi35.prepTime := 0.1
!mi35.classification := #Apetizer

!new MenuItem('mi36')
!mi36.description := 'Sparkling Water (Bottle)'
!mi36.prepTime := 0.0
!mi36.classification := #Beverage

!new MenuItem('mi37')
!mi37.description := 'Cream Ribbon Dessert'
!mi37.prepTime := 4.0
!mi37.classification := #Dessert

!insert (mi34, chef21) into MenuItemChef
!insert (mi35, chef21) into MenuItemChef
!insert (mi36, chef22) into MenuItemChef
!insert (mi37, chef22) into MenuItemChef

!insert (mi34, fi121) into MenuItemFoodItem
!insert (mi34, fi122) into MenuItemFoodItem
!insert (mi35, fi120) into MenuItemFoodItem
!insert (mi36, fi123) into MenuItemFoodItem
!insert (mi37, fi122) into MenuItemFoodItem
!insert (mi37, fi120) into MenuItemFoodItem

!new RegularCustomer('rc9')
!rc9.name := 'Dana Frost'
!rc9.prefferedLanguage := #English

!new Individual('resInd17')
!resInd17.time := Time('19:10')
!resInd17.date := Date('2026-11-20')
!resInd17.numberPeople := 2
!resInd17.name := 'Dana Frost'
!resInd17.phoneNumber := '+1-555-1540'
!resInd17.number := 26001
!resInd17.seating := #Inside
!resInd17.smoking := #NonSmoking

!new Individual('resInd18')
!resInd18.time := Time('19:15')
!resInd18.date := Date('2026-11-20')
!resInd18.numberPeople := 1
!resInd18.name := 'Walk-in Visitor'
!resInd18.phoneNumber := '+1-555-1541'
!resInd18.number := 26002
!resInd18.seating := #Patio
!resInd18.smoking := #Smoking

!new Banquet('resBan13')
!resBan13.time := Time('20:00')
!resBan13.date := Date('2026-11-20')
!resBan13.numberPeople := 15
!resBan13.name := 'Dana Frost'
!resBan13.phoneNumber := '+1-555-1542'
!resBan13.number := 27001
!resBan13.groupName := 'Meteor Watch Party'
!resBan13.paymentMethod := #CreditCard
!resBan13.busService := false

!insert (rest15, resInd17) into RestaurantReservation
!insert (rest15, resInd18) into RestaurantReservation
!insert (rest15, resBan13) into RestaurantReservation

!insert (resInd17, rc9) into ReservationCustomer
!insert (resBan13, rc9) into ReservationCustomer

!insert (resInd17, w30) into ReservationWaiter
!insert (resInd18, w31) into ReservationWaiter
!insert (resInd18, w32) into ReservationWaiter
!insert (resBan13, w30) into ReservationWaiter
!insert (resBan13, w31) into ReservationWaiter

!new Table('t150')
!t150.number := 150
!t150.description := 'Inside two-top (exact fit)'
!t150.capacity := 2

!new Table('t151')
!t151.number := 151
!t151.description := 'Patio single'
!t151.capacity := 1

!new Table('t152')
!t152.number := 152
!t152.description := 'Banquet table 5 seats A'
!t152.capacity := 5

!new Table('t153')
!t153.number := 153
!t153.description := 'Banquet table 5 seats B'
!t153.capacity := 5

!new Table('t154')
!t154.number := 154
!t154.description := 'Banquet table 5 seats C'
!t154.capacity := 5

!insert (resInd17, t150) into ReservationTable
!insert (resInd18, t151) into ReservationTable
!insert (resBan13, t152) into ReservationTable
!insert (resBan13, t153) into ReservationTable
!insert (resBan13, t154) into ReservationTable

!new ItemOrder('io100')
!io100.time := Time('19:12')

!new ItemOrder('io101')
!io101.time := Time('19:13')

!insert (resInd17, io100) into ReservationItemOrdered
!insert (resInd17, io101) into ReservationItemOrdered

!insert (io100, mi34) into ItemOrderMenuItem
!insert (io101, mi36) into ItemOrderMenuItem

!new ItemOrder('io102')
!io102.time := Time('20:10')

!new ItemOrder('io103')
!io103.time := Time('20:12')

!new ItemOrder('io104')
!io104.time := Time('20:40')

!insert (resBan13, io102) into ReservationItemOrdered
!insert (resBan13, io103) into ReservationItemOrdered
!insert (resBan13, io104) into ReservationItemOrdered

!insert (io102, mi35) into ItemOrderMenuItem
!insert (io103, mi34) into ItemOrderMenuItem
!insert (io104, mi37) into ItemOrderMenuItem

!new DietaryRequirement('dr8')
!dr8.diet := #Vegan

!new ReportedAllergy('ra7')
!ra7.allergen := #Nuts
```
## Generation 14 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 212 | 0.00% |
| Multiplicities Errors | 0 | 48 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 13 | 0.00% |
| Phones | 0 | 13 | 0.00% |

# Generation 15
```
!new Restaurant('rest16')
!rest16.name := 'Minimalist Tea Room'

!new Owner('own37')
!own37.name := 'Hana Kuroda'
!own37.percentageShares := 10

!new Owner('own38')
!own38.name := 'Peter Lang'
!own38.percentageShares := 20

!new Owner('own39')
!own39.name := 'Salma Idris'
!own39.percentageShares := 30

!new Owner('own40')
!own40.name := 'Noel Dupont'
!own40.percentageShares := 40

!insert (rest16, own37) into RestaurantOwner
!insert (rest16, own38) into RestaurantOwner
!insert (rest16, own39) into RestaurantOwner
!insert (rest16, own40) into RestaurantOwner

!new HeadWaiter('hw15')
!hw15.name := 'Uma Sterling'
!hw15.dateOfBirth := Date('1986-06-30')
!hw15.phoneNumber := '+1-555-1600'

!new Waiter('w33')
!w33.name := 'Rosa Kim'
!w33.dateOfBirth := Date('1999-09-09')
!w33.phoneNumber := '+1-555-1601'
!w33.spokenLanguage := #English

!insert (hw15, w33) into HeadWaiterWaiter

!new Chef('chef23')
!chef23.name := 'Tari Mendez'
!chef23.dateOfBirth := Date('1981-11-11')
!chef23.phoneNumber := '+1-555-1610'

!new Chef('chef24')
!chef24.name := 'Gero Voss'
!chef24.dateOfBirth := Date('1979-04-04')
!chef24.phoneNumber := '+1-555-1611'

!new Cook('cook31')
!cook31.name := 'Liam Vance'
!cook31.dateOfBirth := Date('1990-10-10')
!cook31.phoneNumber := '+1-555-1620'
!cook31.yearsOfExperience := 6

!new Cook('cook32')
!cook32.name := 'Inez Farah'
!cook32.dateOfBirth := Date('2004-12-12')
!cook32.phoneNumber := '+1-555-1621'
!cook32.yearsOfExperience := 0

!insert (chef23, cook31) into ChefCook
!insert (chef24, cook32) into ChefCook

!new Allergen('aGluten16')
!aGluten16.type := #Gluten

!new Allergen('aNuts16')
!aNuts16.type := #Nuts

!new FoodItem('fi130')
!fi130.number := 1510
!fi130.description := 'Matcha Powder'
!fi130.purchaseFlag := true
!fi130.unit := #Gram

!new FoodItem('fi131')
!fi131.number := 1511
!fi131.description := 'Almond Milk'
!fi131.purchaseFlag := true
!fi131.unit := #Ounce

!new FoodItem('fi132')
!fi132.number := 1512
!fi132.description := 'Wheat Cookie Sheets'
!fi132.purchaseFlag := false
!fi132.unit := #Sheet

!insert (fi131, aNuts16) into FoodItemAllergen
!insert (fi132, aGluten16) into FoodItemAllergen

!new MenuItem('mi38')
!mi38.description := 'Iced Matcha Latte'
!mi38.prepTime := 2.5
!mi38.classification := #Beverage

!new MenuItem('mi39')
!mi39.description := 'Cookie Trio'
!mi39.prepTime := 0.5
!mi39.classification := #Dessert

!insert (mi38, chef23) into MenuItemChef
!insert (mi39, chef24) into MenuItemChef

!insert (mi38, fi130) into MenuItemFoodItem
!insert (mi38, fi131) into MenuItemFoodItem
!insert (mi39, fi132) into MenuItemFoodItem
!insert (mi39, fi131) into MenuItemFoodItem

!new Table('t160')
!t160.number := 160
!t160.description := 'Quiet corner seat 1'
!t160.capacity := 1

!new Table('t161')
!t161.number := 161
!t161.description := 'Quiet corner seat 2'
!t161.capacity := 1

!new Table('t162')
!t162.number := 162
!t162.description := 'Low table A'
!t162.capacity := 4

!new Table('t163')
!t163.number := 163
!t163.description := 'Low table B'
!t163.capacity := 3

!new Table('t164')
!t164.number := 164
!t164.description := 'Low table C'
!t164.capacity := 2

!new Individual('resInd19')
!resInd19.time := Time('09:00')
!resInd19.date := Date('2026-01-05')
!resInd19.numberPeople := 2
!resInd19.name := 'Morning Pair'
!resInd19.phoneNumber := '+1-555-1630'
!resInd19.number := 28001
!resInd19.seating := #Inside
!resInd19.smoking := #NonSmoking

!new Banquet('resBan14')
!resBan14.time := Time('09:30')
!resBan14.date := Date('2026-01-05')
!resBan14.numberPeople := 9
!resBan14.name := 'Book Club Lead'
!resBan14.phoneNumber := '+1-555-1631'
!resBan14.number := 29001
!resBan14.groupName := 'Morning Readers'
!resBan14.paymentMethod := #Cash
!resBan14.busService := false

!insert (rest16, resInd19) into RestaurantReservation
!insert (rest16, resBan14) into RestaurantReservation

!insert (resInd19, w33) into ReservationWaiter
!insert (resBan14, w33) into ReservationWaiter

!insert (resInd19, t160) into ReservationTable
!insert (resInd19, t161) into ReservationTable

!insert (resBan14, t162) into ReservationTable
!insert (resBan14, t163) into ReservationTable
!insert (resBan14, t164) into ReservationTable

!new RegularCustomer('rc10')
!rc10.name := 'Serena Holt'
!rc10.prefferedLanguage := #English

!insert (resBan14, rc10) into ReservationCustomer

!new ItemOrder('io110')
!io110.time := Time('09:35')

!new ItemOrder('io111')
!io111.time := Time('09:40')

!insert (resBan14, io110) into ReservationItemOrdered
!insert (resBan14, io111) into ReservationItemOrdered

!insert (io110, mi38) into ItemOrderMenuItem
!insert (io111, mi39) into ItemOrderMenuItem
```
## Generation 15 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 143 | 0.00% |
| Multiplicities Errors | 0 | 29 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 8 | 0.00% |
| Phones | 0 | 8 | 0.00% |

# Generation 16
```
!new Restaurant('rest17')
!rest17.name := 'Capsule Ramen Station'

!new Owner('own41')
!own41.name := 'Lea Winters'
!own41.percentageShares := 97

!new Owner('own42')
!own42.name := 'Omar Klein'
!own42.percentageShares := 1

!new Owner('own43')
!own43.name := 'Priya Sato'
!own43.percentageShares := 1

!new Owner('own44')
!own44.name := 'Vince Romano'
!own44.percentageShares := 1

!insert (rest17, own41) into RestaurantOwner
!insert (rest17, own42) into RestaurantOwner
!insert (rest17, own43) into RestaurantOwner
!insert (rest17, own44) into RestaurantOwner

!new HeadWaiter('hw16')
!hw16.name := 'Harold Finch'
!hw16.dateOfBirth := Date('1980-02-02')
!hw16.phoneNumber := '+1-555-1700'

!new HeadWaiter('hw17')
!hw17.name := 'Ines Calder'
!hw17.dateOfBirth := Date('1987-07-07')
!hw17.phoneNumber := '+1-555-1701'

!new Waiter('w34')
!w34.name := 'Nico Vega'
!w34.dateOfBirth := Date('1998-08-08')
!w34.phoneNumber := '+1-555-1702'
!w34.spokenLanguage := #Spanish

!new Waiter('w35')
!w35.name := 'Paula Stein'
!w35.dateOfBirth := Date('1995-05-15')
!w35.phoneNumber := '+1-555-1703'
!w35.spokenLanguage := #German

!insert (hw16, w34) into HeadWaiterWaiter
!insert (hw17, w35) into HeadWaiterWaiter

!new Chef('chef25')
!chef25.name := 'Mika Tan'
!chef25.dateOfBirth := Date('1984-04-04')
!chef25.phoneNumber := '+1-555-1710'

!new Chef('chef26')
!chef26.name := 'Dario Conti'
!chef26.dateOfBirth := Date('1979-09-29')
!chef26.phoneNumber := '+1-555-1711'

!new Cook('cook33')
!cook33.name := 'Rhea Bloom'
!cook33.dateOfBirth := Date('1992-12-12')
!cook33.phoneNumber := '+1-555-1712'
!cook33.yearsOfExperience := 10

!new Cook('cook34')
!cook34.name := 'Tomasz Nowak'
!cook34.dateOfBirth := Date('1999-01-19')
!cook34.phoneNumber := '+1-555-1713'
!cook34.yearsOfExperience := 0

!new Cook('cook35')
!cook35.name := 'Sana Iqbal'
!cook35.dateOfBirth := Date('1996-06-06')
!cook35.phoneNumber := '+1-555-1714'
!cook35.yearsOfExperience := 4

!new Cook('cook36')
!cook36.name := 'Eli Porter'
!cook36.dateOfBirth := Date('1988-03-03')
!cook36.phoneNumber := '+1-555-1715'
!cook36.yearsOfExperience := 16

!insert (chef25, cook33) into ChefCook
!insert (chef25, cook34) into ChefCook
!insert (chef25, cook35) into ChefCook
!insert (chef26, cook36) into ChefCook

!new Allergen('aSeafood17')
!aSeafood17.type := #Seafood

!new Allergen('aGluten17')
!aGluten17.type := #Gluten

!new Allergen('aNuts17')
!aNuts17.type := #Nuts

!new FoodItem('fi140')
!fi140.number := 1610
!fi140.description := 'Wheat Ramen Noodles'
!fi140.purchaseFlag := true
!fi140.unit := #Pound

!new FoodItem('fi141')
!fi141.number := 1611
!fi141.description := 'Sesame Paste'
!fi141.purchaseFlag := true
!fi141.unit := #Ounce

!new FoodItem('fi142')
!fi142.number := 1612
!fi142.description := 'Shrimp Broth Concentrate'
!fi142.purchaseFlag := true
!fi142.unit := #Ounce

!new FoodItem('fi143')
!fi143.number := 1613
!fi143.description := 'Scallions'
!fi143.purchaseFlag := false
!fi143.unit := #Gram

!insert (fi140, aGluten17) into FoodItemAllergen
!insert (fi141, aNuts17) into FoodItemAllergen
!insert (fi142, aSeafood17) into FoodItemAllergen

!new MenuItem('mi40')
!mi40.description := 'Nitro Cold Brew'
!mi40.prepTime := 0.0
!mi40.classification := #Beverage

!new MenuItem('mi41')
!mi41.description := 'Spicy Sesame Shrimp Ramen'
!mi41.prepTime := 14.0
!mi41.classification := #Main

!new MenuItem('mi42')
!mi42.description := 'Scallion Side'
!mi42.prepTime := 0.2
!mi42.classification := #Apetizer

!insert (mi40, chef26) into MenuItemChef
!insert (mi41, chef25) into MenuItemChef
!insert (mi42, chef25) into MenuItemChef

!insert (mi41, fi140) into MenuItemFoodItem
!insert (mi41, fi141) into MenuItemFoodItem
!insert (mi41, fi142) into MenuItemFoodItem
!insert (mi41, fi143) into MenuItemFoodItem
!insert (mi42, fi143) into MenuItemFoodItem

!new Table('t170')
!t170.number := 170
!t170.description := 'Capsule booth A'
!t170.capacity := 4

!new Table('t171')
!t171.number := 171
!t171.description := 'Event table 1'
!t171.capacity := 10

!new Table('t172')
!t172.number := 172
!t172.description := 'Event table 2'
!t172.capacity := 10

!new Table('t173')
!t173.number := 173
!t173.description := 'Event table 3'
!t173.capacity := 10

!new Table('t174')
!t174.number := 174
!t174.description := 'Event table 4'
!t174.capacity := 10

!new Table('t175')
!t175.number := 175
!t175.description := 'Event table 5'
!t175.capacity := 10

!new RegularCustomer('rc11')
!rc11.name := 'Mara Lind'
!rc11.prefferedLanguage := #English

!new Individual('resInd20')
!resInd20.time := Time('18:20')
!resInd20.date := Date('2026-03-03')
!resInd20.numberPeople := 4
!resInd20.name := 'Mara Lind'
!resInd20.phoneNumber := '+1-555-1720'
!resInd20.number := 30001
!resInd20.seating := #Inside
!resInd20.smoking := #NonSmoking

!new Banquet('resBan15')
!resBan15.time := Time('19:00')
!resBan15.date := Date('2026-03-03')
!resBan15.numberPeople := 50
!resBan15.name := 'Organizer Desk'
!resBan15.phoneNumber := '+1-555-1721'
!resBan15.number := 31001
!resBan15.groupName := 'Ramen Championship'
!resBan15.paymentMethod := #CreditCard
!resBan15.busService := true

!insert (rest17, resInd20) into RestaurantReservation
!insert (rest17, resBan15) into RestaurantReservation

!insert (resInd20, rc11) into ReservationCustomer

!insert (resInd20, w34) into ReservationWaiter
!insert (resBan15, w34) into ReservationWaiter
!insert (resBan15, w35) into ReservationWaiter

!insert (resInd20, t170) into ReservationTable
!insert (resBan15, t171) into ReservationTable
!insert (resBan15, t172) into ReservationTable
!insert (resBan15, t173) into ReservationTable
!insert (resBan15, t174) into ReservationTable
!insert (resBan15, t175) into ReservationTable

!new BusDriver('bd9')
!bd9.name := 'Gareth Miles'
!bd9.dateOfBirth := Date('1965-05-05')
!bd9.phoneNumber := '+1-555-1730'
!bd9.driverLicenseNr := 'BUS-1709-CN'

!new BusDriver('bd10')
!bd10.name := 'Sonia Reed'
!bd10.dateOfBirth := Date('1972-02-12')
!bd10.phoneNumber := '+1-555-1731'
!bd10.driverLicenseNr := 'BUS-1710-CN'

!insert (resBan15, bd9) into BanquetBusDriver
!insert (resBan15, bd10) into BanquetBusDriver

!new ItemOrder('io120')
!io120.time := Time('19:05')

!new ItemOrder('io121')
!io121.time := Time('19:06')

!new ItemOrder('io122')
!io122.time := Time('19:07')

!new ItemOrder('io123')
!io123.time := Time('19:10')

!insert (resBan15, io120) into ReservationItemOrdered
!insert (resBan15, io121) into ReservationItemOrdered
!insert (resBan15, io122) into ReservationItemOrdered
!insert (resBan15, io123) into ReservationItemOrdered

!insert (io120, mi41) into ItemOrderMenuItem
!insert (io121, mi40) into ItemOrderMenuItem
!insert (io122, mi41) into ItemOrderMenuItem
!insert (io123, mi42) into ItemOrderMenuItem

!new DietaryRequirement('dr9')
!dr9.diet := #Vegan

!new ReportedAllergy('ra8')
!ra8.allergen := #Seafood
```
## Generation 16 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 209 | 0.00% |
| Multiplicities Errors | 0 | 43 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 14 | 0.00% |
| Phones | 0 | 14 | 0.00% |

# Generation 17
```
!new Restaurant('rest18')
!rest18.name := 'Floating Sushi Boat'

!new Owner('own45')
!own45.name := 'Sora Nishimura'
!own45.percentageShares := 51

!new Owner('own46')
!own46.name := 'Helen Carter'
!own46.percentageShares := 49

!insert (rest18, own45) into RestaurantOwner
!insert (rest18, own46) into RestaurantOwner

!new HeadWaiter('hw18')
!hw18.name := 'Dmitri Volkov'
!hw18.dateOfBirth := Date('1982-09-02')
!hw18.phoneNumber := '+1-555-1800'

!new Waiter('w36')
!w36.name := 'Alba Reyes'
!w36.dateOfBirth := Date('1999-01-05')
!w36.phoneNumber := '+1-555-1801'
!w36.spokenLanguage := #Spanish

!new Waiter('w37')
!w37.name := 'Jonah Beck'
!w37.dateOfBirth := Date('1996-06-22')
!w37.phoneNumber := '+1-555-1802'
!w37.spokenLanguage := #English

!new Waiter('w38')
!w38.name := 'Greta Weiss'
!w38.dateOfBirth := Date('1993-03-30')
!w38.phoneNumber := '+1-555-1803'
!w38.spokenLanguage := #German

!insert (hw18, w36) into HeadWaiterWaiter
!insert (hw18, w37) into HeadWaiterWaiter
!insert (hw18, w38) into HeadWaiterWaiter

!new Chef('chef27')
!chef27.name := 'Kenji Watanabe'
!chef27.dateOfBirth := Date('1977-07-07')
!chef27.phoneNumber := '+1-555-1810'

!new Cook('cook37')
!cook37.name := 'Lara Stone'
!cook37.dateOfBirth := Date('1990-10-10')
!cook37.phoneNumber := '+1-555-1811'
!cook37.yearsOfExperience := 15

!new Cook('cook38')
!cook38.name := 'Milan Kovac'
!cook38.dateOfBirth := Date('2004-04-14')
!cook38.phoneNumber := '+1-555-1812'
!cook38.yearsOfExperience := 0

!insert (chef27, cook37) into ChefCook
!insert (chef27, cook38) into ChefCook

!new Allergen('aSeafood18')
!aSeafood18.type := #Seafood

!new Allergen('aGluten18')
!aGluten18.type := #Gluten

!new FoodItem('fi150')
!fi150.number := 1710
!fi150.description := 'Nori Sheets'
!fi150.purchaseFlag := true
!fi150.unit := #Sheet

!new FoodItem('fi151')
!fi151.number := 1711
!fi151.description := 'Crab Mix'
!fi151.purchaseFlag := true
!fi151.unit := #Ounce

!new FoodItem('fi152')
!fi152.number := 1712
!fi152.description := 'Soy Sauce'
!fi152.purchaseFlag := false
!fi152.unit := #Ounce

!insert (fi151, aSeafood18) into FoodItemAllergen
!insert (fi152, aGluten18) into FoodItemAllergen

!new MenuItem('mi43')
!mi43.description := 'Crab Handroll'
!mi43.prepTime := 4.0
!mi43.classification := #Main

!new MenuItem('mi44')
!mi44.description := 'Soy Shot'
!mi44.prepTime := 0.0
!mi44.classification := #Beverage

!insert (mi43, chef27) into MenuItemChef
!insert (mi44, chef27) into MenuItemChef

!insert (mi43, fi150) into MenuItemFoodItem
!insert (mi43, fi151) into MenuItemFoodItem
!insert (mi44, fi152) into MenuItemFoodItem

!new Individual('resInd21')
!resInd21.time := Time('11:00')
!resInd21.date := Date('2026-02-02')
!resInd21.numberPeople := 1
!resInd21.name := 'Solo Seated'
!resInd21.phoneNumber := '+1-555-1820'
!resInd21.number := 32001
!resInd21.seating := #Inside
!resInd21.smoking := #NonSmoking

!new Banquet('resBan16')
!resBan16.time := Time('20:30')
!resBan16.date := Date('2026-02-02')
!resBan16.numberPeople := 40
!resBan16.name := 'Operations Desk'
!resBan16.phoneNumber := '+1-555-1821'
!resBan16.number := 33001
!resBan16.groupName := 'Harbor Gala'
!resBan16.paymentMethod := #Cash
!resBan16.busService := true

!insert (rest18, resInd21) into RestaurantReservation
!insert (rest18, resBan16) into RestaurantReservation

!insert (resInd21, w36) into ReservationWaiter
!insert (resBan16, w36) into ReservationWaiter
!insert (resBan16, w37) into ReservationWaiter
!insert (resBan16, w38) into ReservationWaiter

!new Table('t180')
!t180.number := 180
!t180.description := 'Single bar stool'
!t180.capacity := 1

!new Table('t181')
!t181.number := 181
!t181.description := 'Deck table A'
!t181.capacity := 10

!new Table('t182')
!t182.number := 182
!t182.description := 'Deck table B'
!t182.capacity := 10

!new Table('t183')
!t183.number := 183
!t183.description := 'Deck table C'
!t183.capacity := 10

!new Table('t184')
!t184.number := 184
!t184.description := 'Deck table D'
!t184.capacity := 10

!insert (resInd21, t180) into ReservationTable
!insert (resBan16, t181) into ReservationTable
!insert (resBan16, t182) into ReservationTable
!insert (resBan16, t183) into ReservationTable
!insert (resBan16, t184) into ReservationTable

!new BusDriver('bd11')
!bd11.name := 'Clive Jensen'
!bd11.dateOfBirth := Date('1969-11-11')
!bd11.phoneNumber := '+1-555-1830'
!bd11.driverLicenseNr := 'BUS-4411-FS'

!new BusDriver('bd12')
!bd12.name := 'Rosa Medina'
!bd12.dateOfBirth := Date('1974-08-08')
!bd12.phoneNumber := '+1-555-1831'
!bd12.driverLicenseNr := 'BUS-4412-FS'

!insert (resBan16, bd11) into BanquetBusDriver
!insert (resBan16, bd12) into BanquetBusDriver

!new ItemOrder('io130')
!io130.time := Time('20:40')

!new ItemOrder('io131')
!io131.time := Time('20:41')

!insert (resBan16, io130) into ReservationItemOrdered
!insert (resBan16, io131) into ReservationItemOrdered

!insert (io130, mi43) into ItemOrderMenuItem
!insert (io131, mi44) into ItemOrderMenuItem

!new DietaryRequirement('dr10')
!dr10.diet := #Halal

!new ReportedAllergy('ra9')
!ra9.allergen := #Lactose
```
## Generation 17 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 156 | 0.00% |
| Multiplicities Errors | 0 | 31 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 11 | 0.00% |
| Phones | 0 | 11 | 0.00% |

# Generation 18
```
!new Restaurant('rest19')
!rest19.name := 'Stonebridge Brasserie'

!new Owner('own47')
!own47.name := 'Inez Navarro'
!own47.percentageShares := 70

!new Owner('own48')
!own48.name := 'Calvin Reed'
!own48.percentageShares := 30

!insert (rest19, own47) into RestaurantOwner
!insert (rest19, own48) into RestaurantOwner

!new HeadWaiter('hw19')
!hw19.name := 'Marion Blake'
!hw19.dateOfBirth := Date('1983-03-21')
!hw19.phoneNumber := '+1-555-1900'

!new Waiter('w39')
!w39.name := 'Sergio Peña'
!w39.dateOfBirth := Date('1997-07-12')
!w39.phoneNumber := '+1-555-1901'
!w39.spokenLanguage := #Spanish

!new Waiter('w40')
!w40.name := 'Franz Adler'
!w40.dateOfBirth := Date('1992-11-02')
!w40.phoneNumber := '+1-555-1902'
!w40.spokenLanguage := #German

!insert (hw19, w39) into HeadWaiterWaiter
!insert (hw19, w40) into HeadWaiterWaiter

!new Individual('resInd22')
!resInd22.time := Time('13:05')
!resInd22.date := Date('2026-04-20')
!resInd22.numberPeople := 3
!resInd22.name := 'Walk-up Trio'
!resInd22.phoneNumber := '+1-555-1910'
!resInd22.number := 34001
!resInd22.seating := #Patio
!resInd22.smoking := #NonSmoking

!new Banquet('resBan17')
!resBan17.time := Time('16:30')
!resBan17.date := Date('2026-04-20')
!resBan17.numberPeople := 8
!resBan17.name := 'Community Coordinator'
!resBan17.phoneNumber := '+1-555-1911'
!resBan17.number := 35001
!resBan17.groupName := 'Neighborhood Planning Meet'
!resBan17.paymentMethod := #CreditCard
!resBan17.busService := false

!insert (rest19, resInd22) into RestaurantReservation
!insert (rest19, resBan17) into RestaurantReservation

!insert (resInd22, w39) into ReservationWaiter
!insert (resBan17, w39) into ReservationWaiter
!insert (resBan17, w40) into ReservationWaiter

!new Table('t190')
!t190.number := 190
!t190.description := 'Patio table (exact fit)'
!t190.capacity := 3

!new Table('t191')
!t191.number := 191
!t191.description := 'Banquet split table A'
!t191.capacity := 2

!new Table('t192')
!t192.number := 192
!t192.description := 'Banquet split table B'
!t192.capacity := 3

!new Table('t193')
!t193.number := 193
!t193.description := 'Banquet split table C'
!t193.capacity := 3

!insert (resInd22, t190) into ReservationTable
!insert (resBan17, t191) into ReservationTable
!insert (resBan17, t192) into ReservationTable
!insert (resBan17, t193) into ReservationTable
```
## Generation 18 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 70 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 5 | 0.00% |
| Phones | 0 | 5 | 0.00% |

# Generation 19
```
!new Restaurant('rest20')
!rest20.name := 'Northwind Cantina'

!new Owner('own49')
!own49.name := 'Tomas Keller'
!own49.percentageShares := 10

!new Owner('own50')
!own50.name := 'Mina Duarte'
!own50.percentageShares := 20

!new Owner('own51')
!own51.name := 'Hugo Sanz'
!own51.percentageShares := 30

!new Owner('own52')
!own52.name := 'Elif Yilmaz'
!own52.percentageShares := 40

!insert (rest20, own49) into RestaurantOwner
!insert (rest20, own50) into RestaurantOwner
!insert (rest20, own51) into RestaurantOwner
!insert (rest20, own52) into RestaurantOwner

!new HeadWaiter('hw20')
!hw20.name := 'Sasha North'
!hw20.dateOfBirth := Date('1982-12-24')
!hw20.phoneNumber := '+1-555-2000'

!new Waiter('w41')
!w41.name := 'Rene Alvarez'
!w41.dateOfBirth := Date('1999-02-02')
!w41.phoneNumber := '+1-555-2001'
!w41.spokenLanguage := #Spanish

!new Waiter('w42')
!w42.name := 'Claudia Meyer'
!w42.dateOfBirth := Date('1994-04-04')
!w42.phoneNumber := '+1-555-2002'
!w42.spokenLanguage := #German

!insert (hw20, w41) into HeadWaiterWaiter
!insert (hw20, w42) into HeadWaiterWaiter

!new Chef('chef28')
!chef28.name := 'Noah Firth'
!chef28.dateOfBirth := Date('1976-01-19')
!chef28.phoneNumber := '+1-555-2010'

!new Cook('cook39')
!cook39.name := 'Ivy Tran'
!cook39.dateOfBirth := Date('2003-03-23')
!cook39.phoneNumber := '+1-555-2011'
!cook39.yearsOfExperience := 0

!new Cook('cook40')
!cook40.name := 'Bram Novak'
!cook40.dateOfBirth := Date('1991-07-07')
!cook40.phoneNumber := '+1-555-2012'
!cook40.yearsOfExperience := 11

!new Cook('cook41')
!cook41.name := 'Sara Elmas'
!cook41.dateOfBirth := Date('1989-09-29')
!cook41.phoneNumber := '+1-555-2013'
!cook41.yearsOfExperience := 6

!insert (chef28, cook39) into ChefCook
!insert (chef28, cook40) into ChefCook
!insert (chef28, cook41) into ChefCook

!new Allergen('aGluten20')
!aGluten20.type := #Gluten

!new Allergen('aNuts20')
!aNuts20.type := #Nuts

!new Allergen('aSeafood20')
!aSeafood20.type := #Seafood

!new FoodItem('fi160')
!fi160.number := 1810
!fi160.description := 'Wheat Tortillas'
!fi160.purchaseFlag := true
!fi160.unit := #Dozen

!new FoodItem('fi161')
!fi161.number := 1811
!fi161.description := 'Cashew Cream'
!fi161.purchaseFlag := true
!fi161.unit := #Ounce

!new FoodItem('fi162')
!fi162.number := 1812
!fi162.description := 'Fish Stock'
!fi162.purchaseFlag := true
!fi162.unit := #Ounce

!new FoodItem('fi163')
!fi163.number := 1813
!fi163.description := 'Lime Zest'
!fi163.purchaseFlag := false
!fi163.unit := #Gram

!insert (fi160, aGluten20) into FoodItemAllergen
!insert (fi161, aNuts20) into FoodItemAllergen
!insert (fi162, aSeafood20) into FoodItemAllergen

!new MenuItem('mi45')
!mi45.description := 'Cashew-Lime Taco'
!mi45.prepTime := 6.0
!mi45.classification := #Main

!new MenuItem('mi46')
!mi46.description := 'Broth Taster'
!mi46.prepTime := 1.0
!mi46.classification := #Apetizer

!new MenuItem('mi47')
!mi47.description := 'Still Water Pitcher'
!mi47.prepTime := 0.0
!mi47.classification := #Beverage

!insert (mi45, chef28) into MenuItemChef
!insert (mi46, chef28) into MenuItemChef
!insert (mi47, chef28) into MenuItemChef

!insert (mi45, fi160) into MenuItemFoodItem
!insert (mi45, fi161) into MenuItemFoodItem
!insert (mi45, fi163) into MenuItemFoodItem
!insert (mi46, fi162) into MenuItemFoodItem

!new RegularCustomer('rc12')
!rc12.name := 'June Havel'
!rc12.prefferedLanguage := #English

!new Individual('resInd23')
!resInd23.time := Time('10:05')
!resInd23.date := Date('2026-01-10')
!resInd23.numberPeople := 1
!resInd23.name := 'June Havel'
!resInd23.phoneNumber := '+1-555-2020'
!resInd23.number := 36001
!resInd23.seating := #Inside
!resInd23.smoking := #NonSmoking

!new Individual('resInd24')
!resInd24.time := Time('12:40')
!resInd24.date := Date('2026-01-10')
!resInd24.numberPeople := 7
!resInd24.name := 'Workshop Group'
!resInd24.phoneNumber := '+1-555-2021'
!resInd24.number := 36002
!resInd24.seating := #Patio
!resInd24.smoking := #NonSmoking

!new Banquet('resBan18')
!resBan18.time := Time('19:15')
!resBan18.date := Date('2026-01-10')
!resBan18.numberPeople := 25
!resBan18.name := 'Night Coordinator'
!resBan18.phoneNumber := '+1-555-2022'
!resBan18.number := 37001
!resBan18.groupName := 'Northern Lights Society'
!resBan18.paymentMethod := #CreditCard
!resBan18.busService := true

!insert (rest20, resInd23) into RestaurantReservation
!insert (rest20, resInd24) into RestaurantReservation
!insert (rest20, resBan18) into RestaurantReservation

!insert (resInd23, rc12) into ReservationCustomer

!insert (resInd23, w41) into ReservationWaiter
!insert (resInd24, w41) into ReservationWaiter
!insert (resInd24, w42) into ReservationWaiter
!insert (resBan18, w42) into ReservationWaiter

!new Table('t200')
!t200.number := 200
!t200.description := 'Single counter seat'
!t200.capacity := 1

!new Table('t201')
!t201.number := 201
!t201.description := 'Patio four-top'
!t201.capacity := 4

!new Table('t202')
!t202.number := 202
!t202.description := 'Patio three-top'
!t202.capacity := 3

!new Table('t203')
!t203.number := 203
!t203.description := 'Banquet table A'
!t203.capacity := 10

!new Table('t204')
!t204.number := 204
!t204.description := 'Banquet table B'
!t204.capacity := 10

!new Table('t205')
!t205.number := 205
!t205.description := 'Banquet table C'
!t205.capacity := 5

!insert (resInd23, t200) into ReservationTable
!insert (resInd24, t201) into ReservationTable
!insert (resInd24, t202) into ReservationTable
!insert (resBan18, t203) into ReservationTable
!insert (resBan18, t204) into ReservationTable
!insert (resBan18, t205) into ReservationTable

!new ItemOrder('io140')
!io140.time := Time('10:08')

!insert (resInd23, io140) into ReservationItemOrdered
!insert (io140, mi47) into ItemOrderMenuItem

!new ItemOrder('io141')
!io141.time := Time('19:25')

!new ItemOrder('io142')
!io142.time := Time('19:27')

!new ItemOrder('io143')
!io143.time := Time('19:45')

!insert (resBan18, io141) into ReservationItemOrdered
!insert (resBan18, io142) into ReservationItemOrdered
!insert (resBan18, io143) into ReservationItemOrdered

!insert (io141, mi46) into ItemOrderMenuItem
!insert (io142, mi45) into ItemOrderMenuItem
!insert (io143, mi45) into ItemOrderMenuItem
```
## Generation 19 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 189 | 0.00% |
| Multiplicities Errors | 0 | 41 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 10 | 0.00% |
| Phones | 0 | 10 | 0.00% |

# Generation 20
```
!new Restaurant('rest21')
!rest21.name := 'Eclipse Speakeasy'

!new Owner('own53')
!own53.name := 'Vera Quinn'
!own53.percentageShares := 100

!insert (rest21, own53) into RestaurantOwner

!new HeadWaiter('hw21')
!hw21.name := 'Damon Cruz'
!hw21.dateOfBirth := Date('1982-06-12')
!hw21.phoneNumber := '+1-555-2100'

!new Waiter('w43')
!w43.name := 'Sofia Klein'
!w43.dateOfBirth := Date('1998-08-21')
!w43.phoneNumber := '+1-555-2101'
!w43.spokenLanguage := #German

!new Waiter('w44')
!w44.name := 'Marco Reyes'
!w44.dateOfBirth := Date('1995-03-09')
!w44.phoneNumber := '+1-555-2102'
!w44.spokenLanguage := #Spanish

!insert (hw21, w43) into HeadWaiterWaiter
!insert (hw21, w44) into HeadWaiterWaiter

!new Chef('chef29')
!chef29.name := 'Elise Ward'
!chef29.dateOfBirth := Date('1979-12-01')
!chef29.phoneNumber := '+1-555-2110'

!new Chef('chef30')
!chef30.name := 'Bruno Hart'
!chef30.dateOfBirth := Date('1986-04-18')
!chef30.phoneNumber := '+1-555-2111'

!new Cook('cook42')
!cook42.name := 'Nadia Stone'
!cook42.dateOfBirth := Date('1990-10-05')
!cook42.phoneNumber := '+1-555-2120'
!cook42.yearsOfExperience := 7

!new Cook('cook43')
!cook43.name := 'Owen Dale'
!cook43.dateOfBirth := Date('2004-01-15')
!cook43.phoneNumber := '+1-555-2121'
!cook43.yearsOfExperience := 0

!new Cook('cook44')
!cook44.name := 'Pia Moreno'
!cook44.dateOfBirth := Date('1988-09-09')
!cook44.phoneNumber := '+1-555-2122'
!cook44.yearsOfExperience := 14

!insert (chef29, cook42) into ChefCook
!insert (chef29, cook43) into ChefCook
!insert (chef30, cook44) into ChefCook

!new Allergen('aNuts21')
!aNuts21.type := #Nuts

!new Allergen('aGluten21')
!aGluten21.type := #Gluten

!new Allergen('aLactose21')
!aLactose21.type := #Lactose

!new FoodItem('fi170')
!fi170.number := 1910
!fi170.description := 'Puff Pastry'
!fi170.purchaseFlag := true
!fi170.unit := #Pound

!new FoodItem('fi171')
!fi171.number := 1911
!fi171.description := 'Hazelnut Cream'
!fi171.purchaseFlag := true
!fi171.unit := #Ounce

!new FoodItem('fi172')
!fi172.number := 1912
!fi172.description := 'Espresso Beans'
!fi172.purchaseFlag := false
!fi172.unit := #Gram

!new FoodItem('fi173')
!fi173.number := 1913
!fi173.description := 'Citrus Syrup'
!fi173.purchaseFlag := false
!fi173.unit := #Ounce

!insert (fi170, aGluten21) into FoodItemAllergen
!insert (fi171, aNuts21) into FoodItemAllergen
!insert (fi171, aLactose21) into FoodItemAllergen

!new MenuItem('mi48')
!mi48.description := 'Hazelnut Mille-Feuille'
!mi48.prepTime := 22.0
!mi48.classification := #Dessert

!new MenuItem('mi49')
!mi49.description := 'Espresso Tonic'
!mi49.prepTime := 1.0
!mi49.classification := #Beverage

!new MenuItem('mi50')
!mi50.description := 'Citrus Pastry Bites'
!mi50.prepTime := 8.0
!mi50.classification := #Apetizer

!insert (mi48, chef29) into MenuItemChef
!insert (mi49, chef30) into MenuItemChef
!insert (mi50, chef29) into MenuItemChef

!insert (mi48, fi170) into MenuItemFoodItem
!insert (mi48, fi171) into MenuItemFoodItem
!insert (mi49, fi172) into MenuItemFoodItem
!insert (mi49, fi173) into MenuItemFoodItem
!insert (mi50, fi170) into MenuItemFoodItem
!insert (mi50, fi173) into MenuItemFoodItem

!new Table('t210')
!t210.number := 210
!t210.description := 'Booth left'
!t210.capacity := 2

!new Table('t211')
!t211.number := 211
!t211.description := 'Booth right'
!t211.capacity := 2

!new Table('t212')
!t212.number := 212
!t212.description := 'Salon table A'
!t212.capacity := 6

!new Table('t213')
!t213.number := 213
!t213.description := 'Salon table B'
!t213.capacity := 6

!new Table('t214')
!t214.number := 214
!t214.description := 'Salon table C'
!t214.capacity := 6

!new Individual('resInd25')
!resInd25.time := Time('18:30')
!resInd25.date := Date('2026-10-05')
!resInd25.numberPeople := 4
!resInd25.name := 'Quiet Booth Duo x2'
!resInd25.phoneNumber := '+1-555-2130'
!resInd25.number := 38001
!resInd25.seating := #Inside
!resInd25.smoking := #NonSmoking

!new Banquet('resBan19')
!resBan19.time := Time('21:00')
!resBan19.date := Date('2026-10-05')
!resBan19.numberPeople := 18
!resBan19.name := 'Event Host'
!resBan19.phoneNumber := '+1-555-2131'
!resBan19.number := 39001
!resBan19.groupName := 'Eclipse Alumni'
!resBan19.paymentMethod := #CreditCard
!resBan19.busService := true

!insert (rest21, resInd25) into RestaurantReservation
!insert (rest21, resBan19) into RestaurantReservation

!insert (resInd25, t210) into ReservationTable
!insert (resInd25, t211) into ReservationTable

!insert (resBan19, t212) into ReservationTable
!insert (resBan19, t213) into ReservationTable
!insert (resBan19, t214) into ReservationTable

!insert (resInd25, w43) into ReservationWaiter
!insert (resBan19, w43) into ReservationWaiter
!insert (resBan19, w44) into ReservationWaiter

!new RegularCustomer('rc13')
!rc13.name := 'Harold Ivy'
!rc13.prefferedLanguage := #English

!insert (resBan19, rc13) into ReservationCustomer

!new BusDriver('bd13')
!bd13.name := 'Calvin Shore'
!bd13.dateOfBirth := Date('1968-03-03')
!bd13.phoneNumber := '+1-555-2140'
!bd13.driverLicenseNr := 'BUS-9913-EC'

!new BusDriver('bd14')
!bd14.name := 'Lena Pike'
!bd14.dateOfBirth := Date('1976-07-27')
!bd14.phoneNumber := '+1-555-2141'
!bd14.driverLicenseNr := 'BUS-9914-EC'

!insert (resBan19, bd13) into BanquetBusDriver
!insert (resBan19, bd14) into BanquetBusDriver

!new ItemOrder('io150')
!io150.time := Time('21:05')

!new ItemOrder('io151')
!io151.time := Time('21:06')

!new ItemOrder('io152')
!io152.time := Time('21:20')

!insert (resBan19, io150) into ReservationItemOrdered
!insert (resBan19, io151) into ReservationItemOrdered
!insert (resBan19, io152) into ReservationItemOrdered

!insert (io150, mi50) into ItemOrderMenuItem
!insert (io151, mi49) into ItemOrderMenuItem
!insert (io152, mi48) into ItemOrderMenuItem

!new DietaryRequirement('dr11')
!dr11.diet := #Vegan

!new ReportedAllergy('ra10')
!ra10.allergen := #Nuts
```
## Generation 20 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 179 | 0.00% |
| Multiplicities Errors | 0 | 37 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |
| Phones | 0 | 12 | 0.00% |

# Generation 21
```
!new Restaurant('rest22')
!rest22.name := 'Aurora Event Hall & Grill'

!new Owner('own54')
!own54.name := 'Gita Rahman'
!own54.percentageShares := 60

!new Owner('own55')
!own55.name := 'Leon Fischer'
!own55.percentageShares := 40

!insert (rest22, own54) into RestaurantOwner
!insert (rest22, own55) into RestaurantOwner

!new HeadWaiter('hw22')
!hw22.name := 'Celine Ward'
!hw22.dateOfBirth := Date('1985-02-11')
!hw22.phoneNumber := '+1-555-2200'

!new Waiter('w45')
!w45.name := 'Pablo Serra'
!w45.dateOfBirth := Date('1996-10-01')
!w45.phoneNumber := '+1-555-2201'
!w45.spokenLanguage := #Spanish

!new Waiter('w46')
!w46.name := 'Mara Vogel'
!w46.dateOfBirth := Date('2001-03-03')
!w46.phoneNumber := '+1-555-2202'
!w46.spokenLanguage := #German

!new Waiter('w47')
!w47.name := 'Ethan Cole'
!w47.dateOfBirth := Date('1993-07-07')
!w47.phoneNumber := '+1-555-2203'
!w47.spokenLanguage := #English

!insert (hw22, w45) into HeadWaiterWaiter
!insert (hw22, w46) into HeadWaiterWaiter
!insert (hw22, w47) into HeadWaiterWaiter

!new Chef('chef31')
!chef31.name := 'Rina Moreau'
!chef31.dateOfBirth := Date('1980-05-15')
!chef31.phoneNumber := '+1-555-2210'

!new Chef('chef32')
!chef32.name := 'Diego Rossi'
!chef32.dateOfBirth := Date('1976-09-09')
!chef32.phoneNumber := '+1-555-2211'

!new Cook('cook45')
!cook45.name := 'Jules Kim'
!cook45.dateOfBirth := Date('1994-04-14')
!cook45.phoneNumber := '+1-555-2220'
!cook45.yearsOfExperience := 9

!new Cook('cook46')
!cook46.name := 'Nora Ivers'
!cook46.dateOfBirth := Date('2004-12-01')
!cook46.phoneNumber := '+1-555-2221'
!cook46.yearsOfExperience := 0

!new Cook('cook47')
!cook47.name := 'Salim Batra'
!cook47.dateOfBirth := Date('1989-01-19')
!cook47.phoneNumber := '+1-555-2222'
!cook47.yearsOfExperience := 15

!insert (chef31, cook45) into ChefCook
!insert (chef31, cook46) into ChefCook
!insert (chef32, cook47) into ChefCook

!new Allergen('aLactose22')
!aLactose22.type := #Lactose

!new Allergen('aGluten22')
!aGluten22.type := #Gluten

!new Allergen('aNuts22')
!aNuts22.type := #Nuts

!new FoodItem('fi180')
!fi180.number := 2010
!fi180.description := 'Brioche Bun'
!fi180.purchaseFlag := true
!fi180.unit := #Pound

!new FoodItem('fi181')
!fi181.number := 2011
!fi181.description := 'Cashew Spread'
!fi181.purchaseFlag := true
!fi181.unit := #Ounce

!new FoodItem('fi182')
!fi182.number := 2012
!fi182.description := 'Cream Cheese'
!fi182.purchaseFlag := true
!fi182.unit := #Ounce

!new FoodItem('fi183')
!fi183.number := 2013
!fi183.description := 'Citrus Peel'
!fi183.purchaseFlag := false
!fi183.unit := #Gram

!insert (fi180, aGluten22) into FoodItemAllergen
!insert (fi181, aNuts22) into FoodItemAllergen
!insert (fi182, aLactose22) into FoodItemAllergen
!insert (fi181, aLactose22) into FoodItemAllergen

!new MenuItem('mi51')
!mi51.description := 'Cashew Brioche Bites'
!mi51.prepTime := 3.5
!mi51.classification := #Apetizer

!new MenuItem('mi52')
!mi52.description := 'Creamy Brioche Slider'
!mi52.prepTime := 9.0
!mi52.classification := #Main

!new MenuItem('mi53')
!mi53.description := 'Citrus Cheesecake Cup'
!mi53.prepTime := 7.25
!mi53.classification := #Dessert

!new MenuItem('mi54')
!mi54.description := 'House Still Water'
!mi54.prepTime := 0.0
!mi54.classification := #Beverage

!insert (mi51, chef31) into MenuItemChef
!insert (mi52, chef31) into MenuItemChef
!insert (mi53, chef32) into MenuItemChef
!insert (mi54, chef32) into MenuItemChef

!insert (mi51, fi180) into MenuItemFoodItem
!insert (mi51, fi181) into MenuItemFoodItem
!insert (mi52, fi180) into MenuItemFoodItem
!insert (mi52, fi182) into MenuItemFoodItem
!insert (mi53, fi182) into MenuItemFoodItem
!insert (mi53, fi183) into MenuItemFoodItem

!new RegularCustomer('rc14')
!rc14.name := 'Helena Strauss'
!rc14.prefferedLanguage := #German

!new Individual('resInd26')
!resInd26.time := Time('17:55')
!resInd26.date := Date('2026-06-01')
!resInd26.numberPeople := 2
!resInd26.name := 'Helena Strauss'
!resInd26.phoneNumber := '+1-555-2230'
!resInd26.number := 40001
!resInd26.seating := #Inside
!resInd26.smoking := #NonSmoking

!new Banquet('resBan20')
!resBan20.time := Time('18:30')
!resBan20.date := Date('2026-06-01')
!resBan20.numberPeople := 12
!resBan20.name := 'Event Lead'
!resBan20.phoneNumber := '+1-555-2231'
!resBan20.number := 41001
!resBan20.groupName := 'Aurora Makers Meetup'
!resBan20.paymentMethod := #CreditCard
!resBan20.busService := true

!new Banquet('resBan21')
!resBan21.time := Time('22:00')
!resBan21.date := Date('2026-06-01')
!resBan21.numberPeople := 0
!resBan21.name := 'Hold Slot'
!resBan21.phoneNumber := '+1-555-2232'
!resBan21.number := 41002
!resBan21.groupName := 'TBD'
!resBan21.paymentMethod := #Cash
!resBan21.busService := false

!insert (rest22, resInd26) into RestaurantReservation
!insert (rest22, resBan20) into RestaurantReservation
!insert (rest22, resBan21) into RestaurantReservation

!insert (resInd26, rc14) into ReservationCustomer

!insert (resInd26, w46) into ReservationWaiter
!insert (resBan20, w45) into ReservationWaiter
!insert (resBan20, w46) into ReservationWaiter
!insert (resBan20, w47) into ReservationWaiter
!insert (resBan21, w47) into ReservationWaiter

!new Table('t220')
!t220.number := 220
!t220.description := 'Inside two-top (exact)'
!t220.capacity := 2

!new Table('t221')
!t221.number := 221
!t221.description := 'Meetup table A'
!t221.capacity := 4

!new Table('t222')
!t222.number := 222
!t222.description := 'Meetup table B'
!t222.capacity := 4

!new Table('t223')
!t223.number := 223
!t223.description := 'Meetup table C'
!t223.capacity := 4

!new Table('t224')
!t224.number := 224
!t224.description := 'Late hold single'
!t224.capacity := 1

!insert (resInd26, t220) into ReservationTable
!insert (resBan20, t221) into ReservationTable
!insert (resBan20, t222) into ReservationTable
!insert (resBan20, t223) into ReservationTable
!insert (resBan21, t224) into ReservationTable

!new BusDriver('bd15')
!bd15.name := 'Orson Pike'
!bd15.dateOfBirth := Date('1967-07-01')
!bd15.phoneNumber := '+1-555-2240'
!bd15.driverLicenseNr := 'BUS-2215-AU'

!new BusDriver('bd16')
!bd16.name := 'Nina Shore'
!bd16.dateOfBirth := Date('1975-05-25')
!bd16.phoneNumber := '+1-555-2241'
!bd16.driverLicenseNr := 'BUS-2216-AU'

!insert (resBan20, bd15) into BanquetBusDriver
!insert (resBan20, bd16) into BanquetBusDriver

!new ItemOrder('io160')
!io160.time := Time('18:40')

!new ItemOrder('io161')
!io161.time := Time('18:41')

!new ItemOrder('io162')
!io162.time := Time('18:55')

!insert (resBan20, io160) into ReservationItemOrdered
!insert (resBan20, io161) into ReservationItemOrdered
!insert (resBan20, io162) into ReservationItemOrdered

!insert (io160, mi51) into ItemOrderMenuItem
!insert (io161, mi52) into ItemOrderMenuItem
!insert (io162, mi54) into ItemOrderMenuItem
```
## Generation 21 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 204 | 0.00% |
| Multiplicities Errors | 0 | 44 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 14 | 0.00% |
| Phones | 0 | 14 | 0.00% |

# Generation 22
```
!new Restaurant('rest23')
!rest23.name := 'Underground Roti and Jazz'

!new Owner('own56')
!own56.name := 'Noah Verner'
!own56.percentageShares := 34

!new Owner('own57')
!own57.name := 'Lucia Hart'
!own57.percentageShares := 33

!new Owner('own58')
!own58.name := 'Sanjay Iyer'
!own58.percentageShares := 33

!insert (rest23, own56) into RestaurantOwner
!insert (rest23, own57) into RestaurantOwner
!insert (rest23, own58) into RestaurantOwner

!new HeadWaiter('hw23')
!hw23.name := 'Maren Knox'
!hw23.dateOfBirth := Date('1988-05-08')
!hw23.phoneNumber := '+1-555-2300'

!new Waiter('w48')
!w48.name := 'Ivo Marin'
!w48.dateOfBirth := Date('2000-02-20')
!w48.phoneNumber := '+1-555-2301'
!w48.spokenLanguage := #English

!new Waiter('w49')
!w49.name := 'Giada Serra'
!w49.dateOfBirth := Date('1996-09-14')
!w49.phoneNumber := '+1-555-2302'
!w49.spokenLanguage := #Italian

!insert (hw23, w48) into HeadWaiterWaiter
!insert (hw23, w49) into HeadWaiterWaiter

!new Chef('chef33')
!chef33.name := 'Rafi Noor'
!chef33.dateOfBirth := Date('1981-01-19')
!chef33.phoneNumber := '+1-555-2310'

!new Chef('chef34')
!chef34.name := 'Elena Vogt'
!chef34.dateOfBirth := Date('1979-11-11')
!chef34.phoneNumber := '+1-555-2311'

!new Cook('cook48')
!cook48.name := 'Mika Duran'
!cook48.dateOfBirth := Date('2004-03-03')
!cook48.phoneNumber := '+1-555-2320'
!cook48.yearsOfExperience := 0

!new Cook('cook49')
!cook49.name := 'Boris Kanev'
!cook49.dateOfBirth := Date('1985-07-07')
!cook49.phoneNumber := '+1-555-2321'
!cook49.yearsOfExperience := 25

!insert (chef33, cook48) into ChefCook
!insert (chef34, cook49) into ChefCook

!new Allergen('aGluten23')
!aGluten23.type := #Gluten

!new Allergen('aNuts23')
!aNuts23.type := #Nuts

!new Allergen('aLactose23')
!aLactose23.type := #Lactose

!new FoodItem('fi200')
!fi200.number := 2200
!fi200.description := 'Wheat Flour'
!fi200.purchaseFlag := true
!fi200.unit := #Pound

!new FoodItem('fi201')
!fi201.number := 2201
!fi201.description := 'Roasted Peanuts'
!fi201.purchaseFlag := true
!fi201.unit := #Gram

!new FoodItem('fi202')
!fi202.number := 2202
!fi202.description := 'Lamb'
!fi202.purchaseFlag := true
!fi202.unit := #Pound

!new FoodItem('fi203')
!fi203.number := 2203
!fi203.description := 'Spice Blend'
!fi203.purchaseFlag := false
!fi203.unit := #Gram

!new FoodItem('fi204')
!fi204.number := 2204
!fi204.description := 'Milk'
!fi204.purchaseFlag := true
!fi204.unit := #Ounce

!insert (fi200, aGluten23) into FoodItemAllergen
!insert (fi201, aNuts23) into FoodItemAllergen
!insert (fi204, aLactose23) into FoodItemAllergen

!new MenuItem('mi55')
!mi55.description := 'Peanut Roti Bites'
!mi55.prepTime := 7.0
!mi55.classification := #Apetizer

!new MenuItem('mi56')
!mi56.description := 'Spiced Lamb Roti Wrap'
!mi56.prepTime := 15.0
!mi56.classification := #Main

!new MenuItem('mi57')
!mi57.description := 'House Spiced Water'
!mi57.prepTime := 0.0
!mi57.classification := #Beverage

!insert (mi55, chef33) into MenuItemChef
!insert (mi56, chef34) into MenuItemChef
!insert (mi57, chef33) into MenuItemChef

!insert (mi55, fi200) into MenuItemFoodItem
!insert (mi55, fi201) into MenuItemFoodItem
!insert (mi55, fi204) into MenuItemFoodItem
!insert (mi56, fi200) into MenuItemFoodItem
!insert (mi56, fi202) into MenuItemFoodItem
!insert (mi56, fi203) into MenuItemFoodItem
!insert (mi57, fi203) into MenuItemFoodItem

!new Table('t230')
!t230.number := 230
!t230.description := 'Jazz corner two-top'
!t230.capacity := 2

!new Table('t231')
!t231.number := 231
!t231.description := 'Reserved staging table'
!t231.capacity := 1

!new Individual('resInd27')
!resInd27.time := Time('21:10')
!resInd27.date := Date('2026-05-15')
!resInd27.numberPeople := 2
!resInd27.name := 'Late Duo'
!resInd27.phoneNumber := '+1-555-2330'
!resInd27.number := 42001
!resInd27.seating := #Inside
!resInd27.smoking := #NonSmoking

!new Banquet('resBan22')
!resBan22.time := Time('23:00')
!resBan22.date := Date('2026-05-15')
!resBan22.numberPeople := 0
!resBan22.name := 'Closed Hold'
!resBan22.phoneNumber := '+1-555-2331'
!resBan22.number := 43001
!resBan22.groupName := 'After-hours Hold'
!resBan22.paymentMethod := #Cash
!resBan22.busService := false

!insert (rest23, resInd27) into RestaurantReservation
!insert (rest23, resBan22) into RestaurantReservation

!insert (resInd27, w48) into ReservationWaiter
!insert (resBan22, w49) into ReservationWaiter

!insert (resInd27, t230) into ReservationTable
!insert (resBan22, t231) into ReservationTable

!new ItemOrder('io170')
!io170.time := Time('21:12')

!new ItemOrder('io171')
!io171.time := Time('21:20')

!insert (resInd27, io170) into ReservationItemOrdered
!insert (resInd27, io171) into ReservationItemOrdered

!insert (io170, mi55) into ItemOrderMenuItem
!insert (io171, mi57) into ItemOrderMenuItem

!new DietaryRequirement('dr12')
!dr12.diet := #Vegan

!new ReportedAllergy('ra11')
!ra11.allergen := #Gluten
```
## Generation 22 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 151 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 9 | 0.00% |
| Phones | 0 | 9 | 0.00% |

# Generation 23
```
!new Restaurant('rest24')
!rest24.name := 'Cedar & Salt'

!new Owner('own59')
!own59.name := 'Eleanor Price'
!own59.percentageShares := 99

!new Owner('own60')
!own60.name := 'Milan Jovanovic'
!own60.percentageShares := 1

!insert (rest24, own59) into RestaurantOwner
!insert (rest24, own60) into RestaurantOwner

!new HeadWaiter('hw24')
!hw24.name := 'Ramon Chase'
!hw24.dateOfBirth := Date('1984-08-14')
!hw24.phoneNumber := '+1-555-2400'

!new HeadWaiter('hw25')
!hw25.name := 'Ingrid Vale'
!hw25.dateOfBirth := Date('1989-02-06')
!hw25.phoneNumber := '+1-555-2401'

!new Waiter('w50')
!w50.name := 'Sabrina Knox'
!w50.dateOfBirth := Date('1999-09-01')
!w50.phoneNumber := '+1-555-2402'
!w50.spokenLanguage := #English

!new Waiter('w51')
!w51.name := 'Diego Marin'
!w51.dateOfBirth := Date('1996-12-10')
!w51.phoneNumber := '+1-555-2403'
!w51.spokenLanguage := #Spanish

!new Waiter('w52')
!w52.name := 'Lotte Weiss'
!w52.dateOfBirth := Date('1994-04-22')
!w52.phoneNumber := '+1-555-2404'
!w52.spokenLanguage := #German

!insert (hw24, w50) into HeadWaiterWaiter
!insert (hw24, w51) into HeadWaiterWaiter
!insert (hw25, w52) into HeadWaiterWaiter

!new Chef('chef35')
!chef35.name := 'Paolo Ferri'
!chef35.dateOfBirth := Date('1978-03-03')
!chef35.phoneNumber := '+1-555-2410'

!new Chef('chef36')
!chef36.name := 'Greta Holm'
!chef36.dateOfBirth := Date('1986-06-16')
!chef36.phoneNumber := '+1-555-2411'

!new Cook('cook50')
!cook50.name := 'Amir Saleh'
!cook50.dateOfBirth := Date('1991-01-12')
!cook50.phoneNumber := '+1-555-2412'
!cook50.yearsOfExperience := 0

!new Cook('cook51')
!cook51.name := 'Nina Varga'
!cook51.dateOfBirth := Date('1988-11-08')
!cook51.phoneNumber := '+1-555-2413'
!cook51.yearsOfExperience := 19

!insert (chef35, cook50) into ChefCook
!insert (chef36, cook51) into ChefCook

!new Allergen('aSeafood24')
!aSeafood24.type := #Seafood

!new Allergen('aGluten24')
!aGluten24.type := #Gluten

!new FoodItem('fi210')
!fi210.number := 3001
!fi210.description := 'Sourdough Bread'
!fi210.purchaseFlag := true
!fi210.unit := #Pound

!new FoodItem('fi211')
!fi211.number := 3002
!fi211.description := 'Clams'
!fi211.purchaseFlag := true
!fi211.unit := #Pound

!new FoodItem('fi212')
!fi212.number := 3003
!fi212.description := 'Herb Oil'
!fi212.purchaseFlag := false
!fi212.unit := #Ounce

!insert (fi210, aGluten24) into FoodItemAllergen
!insert (fi211, aSeafood24) into FoodItemAllergen

!new MenuItem('mi58')
!mi58.description := 'Clam Toast Bites'
!mi58.prepTime := 8.0
!mi58.classification := #Apetizer

!new MenuItem('mi59')
!mi59.description := 'Herb Oil Bread Plate'
!mi59.prepTime := 2.0
!mi59.classification := #Main

!new MenuItem('mi60')
!mi60.description := 'House Water (Carafe)'
!mi60.prepTime := 0.0
!mi60.classification := #Beverage

!insert (mi58, chef35) into MenuItemChef
!insert (mi59, chef36) into MenuItemChef
!insert (mi60, chef36) into MenuItemChef

!insert (mi58, fi210) into MenuItemFoodItem
!insert (mi58, fi211) into MenuItemFoodItem
!insert (mi59, fi210) into MenuItemFoodItem
!insert (mi59, fi212) into MenuItemFoodItem

!new RegularCustomer('rc15')
!rc15.name := 'Lea Martin'
!rc15.prefferedLanguage := #Italian

!new Individual('resInd28')
!resInd28.time := Time('15:05')
!resInd28.date := Date('2026-09-09')
!resInd28.numberPeople := 0
!resInd28.name := 'Zero-Guest Hold'
!resInd28.phoneNumber := '+1-555-2420'
!resInd28.number := 50001
!resInd28.seating := #Patio
!resInd28.smoking := #Smoking

!new Individual('resInd29')
!resInd29.time := Time('18:10')
!resInd29.date := Date('2026-09-09')
!resInd29.numberPeople := 2
!resInd29.name := 'Lea Martin'
!resInd29.phoneNumber := '+1-555-2421'
!resInd29.number := 50002
!resInd29.seating := #Inside
!resInd29.smoking := #NonSmoking

!new Banquet('resBan23')
!resBan23.time := Time('20:00')
!resBan23.date := Date('2026-09-09')
!resBan23.numberPeople := 60
!resBan23.name := 'Conference Desk'
!resBan23.phoneNumber := '+1-555-2422'
!resBan23.number := 51001
!resBan23.groupName := 'Cedar Summit'
!resBan23.paymentMethod := #Cash
!resBan23.busService := true

!insert (rest24, resInd28) into RestaurantReservation
!insert (rest24, resInd29) into RestaurantReservation
!insert (rest24, resBan23) into RestaurantReservation

!insert (resInd29, rc15) into ReservationCustomer

!insert (resInd28, w50) into ReservationWaiter
!insert (resInd29, w51) into ReservationWaiter
!insert (resBan23, w50) into ReservationWaiter
!insert (resBan23, w51) into ReservationWaiter
!insert (resBan23, w52) into ReservationWaiter

!new Table('t240')
!t240.number := 240
!t240.description := 'Small patio stand'
!t240.capacity := 1

!new Table('t241')
!t241.number := 241
!t241.description := 'Inside two-top (exact)'
!t241.capacity := 2

!new Table('t242')
!t242.number := 242
!t242.description := 'Hall table A'
!t242.capacity := 20

!new Table('t243')
!t243.number := 243
!t243.description := 'Hall table B'
!t243.capacity := 20

!new Table('t244')
!t244.number := 244
!t244.description := 'Hall table C'
!t244.capacity := 20

!insert (resInd28, t240) into ReservationTable
!insert (resInd29, t241) into ReservationTable
!insert (resBan23, t242) into ReservationTable
!insert (resBan23, t243) into ReservationTable
!insert (resBan23, t244) into ReservationTable

!new BusDriver('bd17')
!bd17.name := 'Oscar Wynn'
!bd17.dateOfBirth := Date('1966-06-06')
!bd17.phoneNumber := '+1-555-2430'
!bd17.driverLicenseNr := 'BUS-5517-CS'

!insert (resBan23, bd17) into BanquetBusDriver

!new ItemOrder('io180')
!io180.time := Time('18:12')

!insert (resInd29, io180) into ReservationItemOrdered
!insert (io180, mi60) into ItemOrderMenuItem

!new ItemOrder('io181')
!io181.time := Time('20:05')

!new ItemOrder('io182')
!io182.time := Time('20:06')

!new ItemOrder('io183')
!io183.time := Time('20:30')

!insert (resBan23, io181) into ReservationItemOrdered
!insert (resBan23, io182) into ReservationItemOrdered
!insert (resBan23, io183) into ReservationItemOrdered

!insert (io181, mi58) into ItemOrderMenuItem
!insert (io182, mi59) into ItemOrderMenuItem
!insert (io183, mi60) into ItemOrderMenuItem
```
## Generation 23 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 183 | 0.00% |
| Multiplicities Errors | 0 | 39 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 13 | 0.00% |
| Phones | 0 | 13 | 0.00% |

# Generation 24
```
!new Restaurant('rest25')
!rest25.name := 'Polar Picnic Hall'

!new Owner('own61')
!own61.name := 'Quinn Harper'
!own61.percentageShares := 100

!insert (rest25, own61) into RestaurantOwner

!new HeadWaiter('hw26')
!hw26.name := 'Evelyn Drake'
!hw26.dateOfBirth := Date('1983-10-30')
!hw26.phoneNumber := '+1-555-2500'

!new Waiter('w53')
!w53.name := 'Tomas Ricci'
!w53.dateOfBirth := Date('1997-02-07')
!w53.phoneNumber := '+1-555-2501'
!w53.spokenLanguage := #Italian

!new Waiter('w54')
!w54.name := 'Alicia Moore'
!w54.dateOfBirth := Date('2000-06-18')
!w54.phoneNumber := '+1-555-2502'
!w54.spokenLanguage := #English

!insert (hw26, w53) into HeadWaiterWaiter
!insert (hw26, w54) into HeadWaiterWaiter

!new Chef('chef37')
!chef37.name := 'Svenja Hart'
!chef37.dateOfBirth := Date('1979-01-13')
!chef37.phoneNumber := '+1-555-2510'

!new Cook('cook52')
!cook52.name := 'Nikhil Batra'
!cook52.dateOfBirth := Date('1992-09-09')
!cook52.phoneNumber := '+1-555-2511'
!cook52.yearsOfExperience := 12

!new Cook('cook53')
!cook53.name := 'Lena Ortiz'
!cook53.dateOfBirth := Date('2004-12-12')
!cook53.phoneNumber := '+1-555-2512'
!cook53.yearsOfExperience := 0

!insert (chef37, cook52) into ChefCook
!insert (chef37, cook53) into ChefCook

!new Allergen('aGluten25')
!aGluten25.type := #Gluten

!new FoodItem('fi220')
!fi220.number := 4000
!fi220.description := 'Beef'
!fi220.purchaseFlag := true
!fi220.unit := #Pound

!new FoodItem('fi221')
!fi221.number := 4001
!fi221.description := 'Pearl Barley'
!fi221.purchaseFlag := true
!fi221.unit := #Pound

!new FoodItem('fi222')
!fi222.number := 4002
!fi222.description := 'Carrots'
!fi222.purchaseFlag := false
!fi222.unit := #Gram

!insert (fi221, aGluten25) into FoodItemAllergen

!new MenuItem('mi61')
!mi61.description := 'Arctic Lemonade'
!mi61.prepTime := 0.0
!mi61.classification := #Beverage

!new MenuItem('mi62')
!mi62.description := 'Hearty Winter Stew'
!mi62.prepTime := 30.0
!mi62.classification := #Main

!insert (mi61, chef37) into MenuItemChef
!insert (mi62, chef37) into MenuItemChef

!insert (mi62, fi220) into MenuItemFoodItem
!insert (mi62, fi221) into MenuItemFoodItem
!insert (mi62, fi222) into MenuItemFoodItem

!new RegularCustomer('rc16')
!rc16.name := 'Mikael Lund'
!rc16.prefferedLanguage := #German

!new Individual('resInd30')
!resInd30.time := Time('11:00')
!resInd30.date := Date('2026-02-20')
!resInd30.numberPeople := 6
!resInd30.name := 'Ice Fishing Crew'
!resInd30.phoneNumber := '+1-555-2520'
!resInd30.number := 60001
!resInd30.seating := #Inside
!resInd30.smoking := #NonSmoking

!new Individual('resInd31')
!resInd31.time := Time('11:05')
!resInd31.date := Date('2026-02-20')
!resInd31.numberPeople := 1
!resInd31.name := 'Mikael Lund'
!resInd31.phoneNumber := '+1-555-2521'
!resInd31.number := 60002
!resInd31.seating := #Patio
!resInd31.smoking := #NonSmoking

!new Individual('resInd32')
!resInd32.time := Time('12:00')
!resInd32.date := Date('2026-02-20')
!resInd32.numberPeople := 3
!resInd32.name := 'Midday Trio'
!resInd32.phoneNumber := '+1-555-2522'
!resInd32.number := 60003
!resInd32.seating := #Inside
!resInd32.smoking := #Smoking

!insert (rest25, resInd30) into RestaurantReservation
!insert (rest25, resInd31) into RestaurantReservation
!insert (rest25, resInd32) into RestaurantReservation

!insert (resInd31, rc16) into ReservationCustomer
!insert (resInd32, rc16) into ReservationCustomer

!insert (resInd30, w53) into ReservationWaiter
!insert (resInd31, w54) into ReservationWaiter
!insert (resInd32, w53) into ReservationWaiter
!insert (resInd32, w54) into ReservationWaiter

!new Table('t250')
!t250.number := 250
!t250.description := 'Heated booth'
!t250.capacity := 4

!new Table('t251')
!t251.number := 251
!t251.description := 'Auxiliary chair set'
!t251.capacity := 2

!new Table('t252')
!t252.number := 252
!t252.description := 'Single stool'
!t252.capacity := 1

!new Table('t253')
!t253.number := 253
!t253.description := 'Narrow bench'
!t253.capacity := 1

!new Table('t254')
!t254.number := 254
!t254.description := 'Two-top by window'
!t254.capacity := 2

!insert (resInd30, t250) into ReservationTable
!insert (resInd30, t251) into ReservationTable
!insert (resInd31, t252) into ReservationTable
!insert (resInd32, t253) into ReservationTable
!insert (resInd32, t254) into ReservationTable

!new ItemOrder('io190')
!io190.time := Time('12:10')

!new ItemOrder('io191')
!io191.time := Time('12:15')

!insert (resInd32, io190) into ReservationItemOrdered
!insert (resInd32, io191) into ReservationItemOrdered

!insert (io190, mi61) into ItemOrderMenuItem
!insert (io191, mi62) into ItemOrderMenuItem

!new DietaryRequirement('dr13')
!dr13.diet := #Halal

!new ReportedAllergy('ra12')
!ra12.allergen := #Nuts
```
## Generation 24 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 145 | 0.00% |
| Multiplicities Errors | 0 | 29 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 9 | 0.00% |
| Phones | 0 | 9 | 0.00% |

# Generation 25
```
!new Restaurant('rest26')
!rest26.name := 'Nebula Garden'

!new Restaurant('rest27')
!rest27.name := 'Nebula Garden Annex'

!new Owner('own62')
!own62.name := 'Rowena Park'
!own62.percentageShares := 60

!new Owner('own63')
!own63.name := 'Stefan Ilic'
!own63.percentageShares := 40

!insert (rest26, own62) into RestaurantOwner
!insert (rest26, own63) into RestaurantOwner
!insert (rest27, own62) into RestaurantOwner
!insert (rest27, own63) into RestaurantOwner

!new HeadWaiter('hw27')
!hw27.name := 'Camille Novak'
!hw27.dateOfBirth := Date('1986-05-16')
!hw27.phoneNumber := '+1-555-2600'

!new Waiter('w55')
!w55.name := 'Ortega Ruiz'
!w55.dateOfBirth := Date('1997-09-09')
!w55.phoneNumber := '+1-555-2601'
!w55.spokenLanguage := #Spanish

!new Waiter('w56')
!w56.name := 'Hannah Weiss'
!w56.dateOfBirth := Date('1999-03-03')
!w56.phoneNumber := '+1-555-2602'
!w56.spokenLanguage := #German

!new Waiter('w57')
!w57.name := 'Luca Bianchi'
!w57.dateOfBirth := Date('1994-12-12')
!w57.phoneNumber := '+1-555-2603'
!w57.spokenLanguage := #Italian

!insert (hw27, w55) into HeadWaiterWaiter
!insert (hw27, w56) into HeadWaiterWaiter
!insert (hw27, w57) into HeadWaiterWaiter

!new Chef('chef38')
!chef38.name := 'Talia Moretti'
!chef38.dateOfBirth := Date('1981-08-08')
!chef38.phoneNumber := '+1-555-2610'

!new Chef('chef39')
!chef39.name := 'Erik Stone'
!chef39.dateOfBirth := Date('1979-02-02')
!chef39.phoneNumber := '+1-555-2611'

!new Cook('cook54')
!cook54.name := 'Nora Feld'
!cook54.dateOfBirth := Date('1992-11-11')
!cook54.phoneNumber := '+1-555-2620'
!cook54.yearsOfExperience := 10

!new Cook('cook55')
!cook55.name := 'Samir Qadir'
!cook55.dateOfBirth := Date('2004-04-04')
!cook55.phoneNumber := '+1-555-2621'
!cook55.yearsOfExperience := 0

!new Cook('cook56')
!cook56.name := 'Ivy Chen'
!cook56.dateOfBirth := Date('1988-06-06')
!cook56.phoneNumber := '+1-555-2622'
!cook56.yearsOfExperience := 14

!insert (chef38, cook54) into ChefCook
!insert (chef38, cook55) into ChefCook
!insert (chef39, cook56) into ChefCook

!new Allergen('aNuts26')
!aNuts26.type := #Nuts

!new Allergen('aSeafood26')
!aSeafood26.type := #Seafood

!new FoodItem('fi230')
!fi230.number := 5010
!fi230.description := 'Cashews'
!fi230.purchaseFlag := true
!fi230.unit := #Gram

!new FoodItem('fi231')
!fi231.number := 5011
!fi231.description := 'Shrimp'
!fi231.purchaseFlag := true
!fi231.unit := #Pound

!new FoodItem('fi232')
!fi232.number := 5012
!fi232.description := 'Rice Paper'
!fi232.purchaseFlag := true
!fi232.unit := #Sheet

!new FoodItem('fi233')
!fi233.number := 5013
!fi233.description := 'Citrus Dressing'
!fi233.purchaseFlag := false
!fi233.unit := #Ounce

!insert (fi230, aNuts26) into FoodItemAllergen
!insert (fi231, aSeafood26) into FoodItemAllergen

!new MenuItem('mi63')
!mi63.description := 'Shrimp Summer Roll'
!mi63.prepTime := 6.0
!mi63.classification := #Apetizer

!new MenuItem('mi64')
!mi64.description := 'Cashew Citrus Bowl'
!mi64.prepTime := 9.5
!mi64.classification := #Main

!new MenuItem('mi65')
!mi65.description := 'Still Water'
!mi65.prepTime := 0.0
!mi65.classification := #Beverage

!insert (mi63, chef38) into MenuItemChef
!insert (mi64, chef39) into MenuItemChef
!insert (mi65, chef38) into MenuItemChef

!insert (mi63, fi231) into MenuItemFoodItem
!insert (mi63, fi232) into MenuItemFoodItem
!insert (mi63, fi233) into MenuItemFoodItem
!insert (mi64, fi230) into MenuItemFoodItem
!insert (mi64, fi233) into MenuItemFoodItem

!new RegularCustomer('rc17')
!rc17.name := 'Mina Alvarez'
!rc17.prefferedLanguage := #English

!new Banquet('resBan24')
!resBan24.time := Time('18:00')
!resBan24.date := Date('2026-07-21')
!resBan24.numberPeople := 12
!resBan24.name := 'Group Liaison'
!resBan24.phoneNumber := '+1-555-2630'
!resBan24.number := 70001
!resBan24.groupName := 'Stargazer Society'
!resBan24.paymentMethod := #CreditCard
!resBan24.busService := true

!new Individual('resInd33')
!resInd33.time := Time('12:15')
!resInd33.date := Date('2026-07-22')
!resInd33.numberPeople := 3
!resInd33.name := 'Mina Alvarez'
!resInd33.phoneNumber := '+1-555-2631'
!resInd33.number := 70002
!resInd33.seating := #Patio
!resInd33.smoking := #NonSmoking

!new Individual('resInd34')
!resInd34.time := Time('22:30')
!resInd34.date := Date('2026-07-22')
!resInd34.numberPeople := 1
!resInd34.name := 'Late Solo'
!resInd34.phoneNumber := '+1-555-2632'
!resInd34.number := 70003
!resInd34.seating := #Inside
!resInd34.smoking := #NonSmoking

!insert (rest26, resBan24) into RestaurantReservation
!insert (rest26, resInd33) into RestaurantReservation
!insert (rest26, resInd34) into RestaurantReservation

!insert (resInd33, rc17) into ReservationCustomer

!insert (resBan24, w55) into ReservationWaiter
!insert (resBan24, w56) into ReservationWaiter
!insert (resInd33, w57) into ReservationWaiter
!insert (resInd34, w56) into ReservationWaiter

!new BusDriver('bd18')
!bd18.name := 'Kurt Valdez'
!bd18.dateOfBirth := Date('1964-04-14')
!bd18.phoneNumber := '+1-555-2640'
!bd18.driverLicenseNr := 'BUS-6818-NG'

!insert (resBan24, bd18) into BanquetBusDriver

!new Table('t260')
!t260.number := 260
!t260.description := 'Banquet round A'
!t260.capacity := 5

!new Table('t261')
!t261.number := 261
!t261.description := 'Banquet round B'
!t261.capacity := 7

!new Table('t262')
!t262.number := 262
!t262.description := 'Patio two-top'
!t262.capacity := 2

!new Table('t263')
!t263.number := 263
!t263.description := 'Patio stool'
!t263.capacity := 1

!new Table('t264')
!t264.number := 264
!t264.description := 'Inside single'
!t264.capacity := 1

!insert (resBan24, t260) into ReservationTable
!insert (resBan24, t261) into ReservationTable
!insert (resInd33, t262) into ReservationTable
!insert (resInd33, t263) into ReservationTable
!insert (resInd34, t264) into ReservationTable

!new ItemOrder('io200')
!io200.time := Time('18:10')

!new ItemOrder('io201')
!io201.time := Time('18:12')

!new ItemOrder('io202')
!io202.time := Time('12:20')

!insert (resBan24, io200) into ReservationItemOrdered
!insert (resBan24, io201) into ReservationItemOrdered
!insert (resInd33, io202) into ReservationItemOrdered

!insert (io200, mi63) into ItemOrderMenuItem
!insert (io201, mi65) into ItemOrderMenuItem
!insert (io202, mi64) into ItemOrderMenuItem

!new DietaryRequirement('dr14')
!dr14.diet := #Vegetarian

!new ReportedAllergy('ra13')
!ra13.allergen := #Seafood
```
## Generation 25 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 194 | 0.00% |
| Multiplicities Errors | 0 | 40 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 13 | 0.00% |
| Phones | 0 | 13 | 0.00% |

# Generation 26
```
!new Restaurant('rest28')
!rest28.name := 'Airport Express Kitchen'

!new Owner('own64')
!own64.name := 'Lena Foster'
!own64.percentageShares := 80

!new Owner('own65')
!own65.name := 'Mateo Klein'
!own65.percentageShares := 20

!insert (rest28, own64) into RestaurantOwner
!insert (rest28, own65) into RestaurantOwner

!new HeadWaiter('hw28')
!hw28.name := 'Cora Sterling'
!hw28.dateOfBirth := Date('1984-12-02')
!hw28.phoneNumber := '+1-555-2800'

!new Waiter('w58')
!w58.name := 'Bruno Costa'
!w58.dateOfBirth := Date('1996-06-18')
!w58.phoneNumber := '+1-555-2801'
!w58.spokenLanguage := #English

!new Waiter('w59')
!w59.name := 'Gianna Riva'
!w59.dateOfBirth := Date('1998-10-10')
!w59.phoneNumber := '+1-555-2802'
!w59.spokenLanguage := #Italian

!new Waiter('w60')
!w60.name := 'Kai Neumann'
!w60.dateOfBirth := Date('2000-03-03')
!w60.phoneNumber := '+1-555-2803'
!w60.spokenLanguage := #German

!insert (hw28, w58) into HeadWaiterWaiter
!insert (hw28, w59) into HeadWaiterWaiter
!insert (hw28, w60) into HeadWaiterWaiter

!new Chef('chef40')
!chef40.name := 'Rita Sanz'
!chef40.dateOfBirth := Date('1979-09-09')
!chef40.phoneNumber := '+1-555-2810'

!new Chef('chef41')
!chef41.name := 'Oliver Brandt'
!chef41.dateOfBirth := Date('1987-07-07')
!chef41.phoneNumber := '+1-555-2811'

!new Cook('cook57')
!cook57.name := 'Nadia Holm'
!cook57.dateOfBirth := Date('1993-02-12')
!cook57.phoneNumber := '+1-555-2820'
!cook57.yearsOfExperience := 0

!new Cook('cook58')
!cook58.name := 'Sam Carter'
!cook58.dateOfBirth := Date('1990-11-21')
!cook58.phoneNumber := '+1-555-2821'
!cook58.yearsOfExperience := 6

!new Cook('cook59')
!cook59.name := 'Mira Klein'
!cook59.dateOfBirth := Date('1988-04-04')
!cook59.phoneNumber := '+1-555-2822'
!cook59.yearsOfExperience := 15

!insert (chef40, cook57) into ChefCook
!insert (chef40, cook58) into ChefCook
!insert (chef41, cook59) into ChefCook

!new Allergen('aNuts28')
!aNuts28.type := #Nuts

!new Allergen('aGluten28')
!aGluten28.type := #Gluten

!new Allergen('aLactose28')
!aLactose28.type := #Lactose

!new FoodItem('fi240')
!fi240.number := 6010
!fi240.description := 'Chickpeas'
!fi240.purchaseFlag := true
!fi240.unit := #Pound

!new FoodItem('fi241')
!fi241.number := 6011
!fi241.description := 'Sesame Paste'
!fi241.purchaseFlag := true
!fi241.unit := #Gram

!new FoodItem('fi242')
!fi242.number := 6012
!fi242.description := 'Cocoa Powder'
!fi242.purchaseFlag := true
!fi242.unit := #Gram

!new FoodItem('fi243')
!fi243.number := 6013
!fi243.description := 'Soy Milk Base'
!fi243.purchaseFlag := false
!fi243.unit := #Ounce

!insert (fi241, aNuts28) into FoodItemAllergen
!insert (fi243, aLactose28) into FoodItemAllergen
!insert (fi243, aNuts28) into FoodItemAllergen

!new MenuItem('mi66')
!mi66.description := 'Express Espresso'
!mi66.prepTime := 0.7
!mi66.classification := #Beverage

!new MenuItem('mi67')
!mi67.description := 'Vegan Mezze Box'
!mi67.prepTime := 8.5
!mi67.classification := #Main

!new MenuItem('mi68')
!mi68.description := 'Gluten-Free Cocoa Brownie'
!mi68.prepTime := 5.0
!mi68.classification := #Dessert

!insert (mi66, chef41) into MenuItemChef
!insert (mi67, chef40) into MenuItemChef
!insert (mi68, chef41) into MenuItemChef

!insert (mi67, fi240) into MenuItemFoodItem
!insert (mi67, fi241) into MenuItemFoodItem
!insert (mi67, fi243) into MenuItemFoodItem
!insert (mi68, fi242) into MenuItemFoodItem
!insert (mi68, fi243) into MenuItemFoodItem

!new RegularCustomer('rc18')
!rc18.name := 'Sofía Vega'
!rc18.prefferedLanguage := #Spanish

!new Individual('resInd35')
!resInd35.time := Time('17:20')
!resInd35.date := Date('2026-08-08')
!resInd35.numberPeople := 4
!resInd35.name := 'Sofía Vega'
!resInd35.phoneNumber := '+1-555-2830'
!resInd35.number := 80001
!resInd35.seating := #Patio
!resInd35.smoking := #NonSmoking

!new Individual('resInd36')
!resInd36.time := Time('23:10')
!resInd36.date := Date('2026-08-08')
!resInd36.numberPeople := 1
!resInd36.name := 'Red-eye Traveler'
!resInd36.phoneNumber := '+1-555-2831'
!resInd36.number := 80002
!resInd36.seating := #Inside
!resInd36.smoking := #Smoking

!new Banquet('resBan25')
!resBan25.time := Time('19:00')
!resBan25.date := Date('2026-08-08')
!resBan25.numberPeople := 25
!resBan25.name := 'Operations Desk'
!resBan25.phoneNumber := '+1-555-2832'
!resBan25.number := 81001
!resBan25.groupName := 'Runway Crew Dinner'
!resBan25.paymentMethod := #Cash
!resBan25.busService := true

!insert (rest28, resInd35) into RestaurantReservation
!insert (rest28, resBan25) into RestaurantReservation

!insert (resInd35, rc18) into ReservationCustomer

!insert (resInd35, w58) into ReservationWaiter
!insert (resInd35, w59) into ReservationWaiter
!insert (resInd36, w60) into ReservationWaiter
!insert (resBan25, w58) into ReservationWaiter
!insert (resBan25, w60) into ReservationWaiter

!new BusDriver('bd19')
!bd19.name := 'Evan Driver'
!bd19.dateOfBirth := Date('1968-08-18')
!bd19.phoneNumber := '+1-555-2840'
!bd19.driverLicenseNr := 'BUS-9819-AE'

!new BusDriver('bd20')
!bd20.name := 'Rosa Driver'
!bd20.dateOfBirth := Date('1974-04-04')
!bd20.phoneNumber := '+1-555-2841'
!bd20.driverLicenseNr := 'BUS-9820-AE'

!insert (resBan25, bd19) into BanquetBusDriver
!insert (resBan25, bd20) into BanquetBusDriver

!new Table('t270')
!t270.number := 270
!t270.description := 'Patio two-top A'
!t270.capacity := 2

!new Table('t271')
!t271.number := 271
!t271.description := 'Patio two-top B'
!t271.capacity := 2

!new Table('t272')
!t272.number := 272
!t272.description := 'Inside solo stool'
!t272.capacity := 1

!new Table('t273')
!t273.number := 273
!t273.description := 'Event table A'
!t273.capacity := 10

!new Table('t274')
!t274.number := 274
!t274.description := 'Event table B'
!t274.capacity := 10

!new Table('t275')
!t275.number := 275
!t275.description := 'Event table C'
!t275.capacity := 5

!insert (resInd35, t270) into ReservationTable
!insert (resInd35, t271) into ReservationTable
!insert (resInd36, t272) into ReservationTable
!insert (resBan25, t273) into ReservationTable
!insert (resBan25, t274) into ReservationTable
!insert (resBan25, t275) into ReservationTable

!new ItemOrder('io210')
!io210.time := Time('17:25')

!new ItemOrder('io211')
!io211.time := Time('17:30')

!insert (resInd35, io210) into ReservationItemOrdered
!insert (resInd35, io211) into ReservationItemOrdered

!insert (io210, mi66) into ItemOrderMenuItem
!insert (io211, mi67) into ItemOrderMenuItem

!new ItemOrder('io212')
!io212.time := Time('19:05')

!new ItemOrder('io213')
!io213.time := Time('19:07')

!new ItemOrder('io214')
!io214.time := Time('19:45')

!insert (resBan25, io212) into ReservationItemOrdered
!insert (resBan25, io213) into ReservationItemOrdered
!insert (resBan25, io214) into ReservationItemOrdered

!insert (io212, mi67) into ItemOrderMenuItem
!insert (io213, mi66) into ItemOrderMenuItem
!insert (io214, mi68) into ItemOrderMenuItem

!new DietaryRequirement('dr15')
!dr15.diet := #Vegan

!new ReportedAllergy('ra14')
!ra14.allergen := #Gluten
```
## Generation 26 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 212 | 0.00% |
| Multiplicities Errors | 0 | 45 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 14 | 0.00% |
| Phones | 0 | 14 | 0.00% |

# Generation 27
```
!new Restaurant('rest29')
!rest29.name := 'Clockwork Eatery'

!new Owner('own66')
!own66.name := 'Aria Bloom'
!own66.percentageShares := 25

!new Owner('own67')
!own67.name := 'Boris Kent'
!own67.percentageShares := 25

!new Owner('own68')
!own68.name := 'Celine Frost'
!own68.percentageShares := 25

!new Owner('own69')
!own69.name := 'Darius Cole'
!own69.percentageShares := 25

!insert (rest29, own66) into RestaurantOwner
!insert (rest29, own67) into RestaurantOwner
!insert (rest29, own68) into RestaurantOwner
!insert (rest29, own69) into RestaurantOwner

!new HeadWaiter('hw29')
!hw29.name := 'Parker Sloan'
!hw29.dateOfBirth := Date('1985-05-05')
!hw29.phoneNumber := '+1-555-2900'

!new Waiter('w61')
!w61.name := 'Inez Romero'
!w61.dateOfBirth := Date('1997-07-01')
!w61.phoneNumber := '+1-555-2901'
!w61.spokenLanguage := #Spanish

!new Waiter('w62')
!w62.name := 'Felix Hartmann'
!w62.dateOfBirth := Date('1994-02-14')
!w62.phoneNumber := '+1-555-2902'
!w62.spokenLanguage := #German

!insert (hw29, w61) into HeadWaiterWaiter
!insert (hw29, w62) into HeadWaiterWaiter

!new Chef('chef42')
!chef42.name := 'Naomi Richter'
!chef42.dateOfBirth := Date('1980-10-10')
!chef42.phoneNumber := '+1-555-2910'

!new Cook('cook60')
!cook60.name := 'Evan Pike'
!cook60.dateOfBirth := Date('2003-01-01')
!cook60.phoneNumber := '+1-555-2911'
!cook60.yearsOfExperience := 0

!new Cook('cook61')
!cook61.name := 'Soraya Malik'
!cook61.dateOfBirth := Date('1989-09-09')
!cook61.phoneNumber := '+1-555-2912'
!cook61.yearsOfExperience := 17

!insert (chef42, cook60) into ChefCook
!insert (chef42, cook61) into ChefCook

!new Allergen('aNuts29')
!aNuts29.type := #Nuts

!new Allergen('aGluten29')
!aGluten29.type := #Gluten

!new FoodItem('fi250')
!fi250.number := 7010
!fi250.description := 'Walnut Pieces'
!fi250.purchaseFlag := true
!fi250.unit := #Gram

!new FoodItem('fi251')
!fi251.number := 7011
!fi251.description := 'Flour'
!fi251.purchaseFlag := true
!fi251.unit := #Pound

!new FoodItem('fi252')
!fi252.number := 7012
!fi252.description := 'Sparkling Water'
!fi252.purchaseFlag := false
!fi252.unit := #Dozen

!insert (fi250, aNuts29) into FoodItemAllergen
!insert (fi251, aGluten29) into FoodItemAllergen

!new MenuItem('mi69')
!mi69.description := 'Walnut Flatbread'
!mi69.prepTime := 11.0
!mi69.classification := #Main

!new MenuItem('mi70')
!mi70.description := 'House Water'
!mi70.prepTime := 0.0
!mi70.classification := #Beverage

!insert (mi69, chef42) into MenuItemChef
!insert (mi70, chef42) into MenuItemChef

!insert (mi69, fi250) into MenuItemFoodItem
!insert (mi69, fi251) into MenuItemFoodItem
!insert (mi70, fi252) into MenuItemFoodItem

!new Table('t290')
!t290.number := 290
!t290.description := 'Counter seat'
!t290.capacity := 1

!new Table('t291')
!t291.number := 291
!t291.description := 'Banquet section A'
!t291.capacity := 3

!new Table('t292')
!t292.number := 292
!t292.description := 'Banquet section B'
!t292.capacity := 3

!new Table('t293')
!t293.number := 293
!t293.description := 'Banquet section C'
!t293.capacity := 3

!new RegularCustomer('rc19')
!rc19.name := 'Kai Morgan'
!rc19.prefferedLanguage := #English

!new Individual('resInd37')
!resInd37.time := Time('06:00')
!resInd37.date := Date('2026-12-24')
!resInd37.numberPeople := 1
!resInd37.name := 'Kai Morgan'
!resInd37.phoneNumber := '+1-555-2920'
!resInd37.number := 90001
!resInd37.seating := #Inside
!resInd37.smoking := #NonSmoking

!new Banquet('resBan26')
!resBan26.time := Time('23:30')
!resBan26.date := Date('2026-12-24')
!resBan26.numberPeople := 9
!resBan26.name := 'Night Organizer'
!resBan26.phoneNumber := '+1-555-2921'
!resBan26.number := 90002
!resBan26.groupName := 'Midnight Mechanics'
!resBan26.paymentMethod := #Cash
!resBan26.busService := true

!insert (rest29, resInd37) into RestaurantReservation
!insert (rest29, resBan26) into RestaurantReservation

!insert (resInd37, rc19) into ReservationCustomer

!insert (resInd37, w61) into ReservationWaiter
!insert (resBan26, w61) into ReservationWaiter
!insert (resBan26, w62) into ReservationWaiter

!insert (resInd37, t290) into ReservationTable
!insert (resBan26, t291) into ReservationTable
!insert (resBan26, t292) into ReservationTable
!insert (resBan26, t293) into ReservationTable

!new BusDriver('bd21')
!bd21.name := 'Tess Driver'
!bd21.dateOfBirth := Date('1970-07-07')
!bd21.phoneNumber := '+1-555-2930'
!bd21.driverLicenseNr := 'BUS-2921-CW'

!new BusDriver('bd22')
!bd22.name := 'Marek Driver'
!bd22.dateOfBirth := Date('1968-08-08')
!bd22.phoneNumber := '+1-555-2931'
!bd22.driverLicenseNr := 'BUS-2922-CW'

!insert (resBan26, bd21) into BanquetBusDriver
!insert (resBan26, bd22) into BanquetBusDriver

!new ItemOrder('io220')
!io220.time := Time('23:35')

!new ItemOrder('io221')
!io221.time := Time('23:36')

!new ItemOrder('io222')
!io222.time := Time('23:50')

!insert (resBan26, io220) into ReservationItemOrdered
!insert (resBan26, io221) into ReservationItemOrdered
!insert (resBan26, io222) into ReservationItemOrdered

!insert (io220, mi70) into ItemOrderMenuItem
!insert (io221, mi69) into ItemOrderMenuItem
!insert (io222, mi69) into ItemOrderMenuItem

!new DietaryRequirement('dr16')
!dr16.diet := #Kosher

!new ReportedAllergy('ra15')
!ra15.allergen := #Nuts
```
## Generation 27 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 160 | 0.00% |
| Multiplicities Errors | 0 | 33 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 10 | 0.00% |
| Phones | 0 | 10 | 0.00% |

# Generation 28
```
!new Restaurant('rest30')
!rest30.name := 'Saffron & Steam'

!new Owner('own70')
!own70.name := 'Leila Nasser'
!own70.percentageShares := 50

!new Owner('own71')
!own71.name := 'Jonas Berg'
!own71.percentageShares := 50

!insert (rest30, own70) into RestaurantOwner
!insert (rest30, own71) into RestaurantOwner

!new HeadWaiter('hw30')
!hw30.name := 'Carsten Lowe'
!hw30.dateOfBirth := Date('1981-03-30')
!hw30.phoneNumber := '+1-555-3000'

!new Waiter('w63')
!w63.name := 'Elena Varga'
!w63.dateOfBirth := Date('1998-08-08')
!w63.phoneNumber := '+1-555-3001'
!w63.spokenLanguage := #English

!new Waiter('w64')
!w64.name := 'Pietro Conti'
!w64.dateOfBirth := Date('1995-09-19')
!w64.phoneNumber := '+1-555-3002'
!w64.spokenLanguage := #Italian

!new Waiter('w65')
!w65.name := 'Marta Klein'
!w65.dateOfBirth := Date('1999-12-12')
!w65.phoneNumber := '+1-555-3003'
!w65.spokenLanguage := #German

!insert (hw30, w63) into HeadWaiterWaiter
!insert (hw30, w64) into HeadWaiterWaiter
!insert (hw30, w65) into HeadWaiterWaiter

!new Manager('mgr5')
!mgr5.name := 'Noor Salman'
!mgr5.dateOfBirth := Date('1976-06-16')
!mgr5.phoneNumber := '+1-555-3010'

!new Chef('chef43')
!chef43.name := 'Aurelia Rossi'
!chef43.dateOfBirth := Date('1983-01-10')
!chef43.phoneNumber := '+1-555-3020'

!new Chef('chef44')
!chef44.name := 'Marek Nowak'
!chef44.dateOfBirth := Date('1979-07-27')
!chef44.phoneNumber := '+1-555-3021'

!new Cook('cook62')
!cook62.name := 'Sana Rahim'
!cook62.dateOfBirth := Date('1994-04-04')
!cook62.phoneNumber := '+1-555-3030'
!cook62.yearsOfExperience := 0

!new Cook('cook63')
!cook63.name := 'Elias Ward'
!cook63.dateOfBirth := Date('1988-11-11')
!cook63.phoneNumber := '+1-555-3031'
!cook63.yearsOfExperience := 16

!new Cook('cook64')
!cook64.name := 'Giulia Ferraro'
!cook64.dateOfBirth := Date('2002-02-02')
!cook64.phoneNumber := '+1-555-3032'
!cook64.yearsOfExperience := 2

!insert (chef43, cook62) into ChefCook
!insert (chef43, cook63) into ChefCook
!insert (chef44, cook64) into ChefCook

!new Allergen('aGluten30')
!aGluten30.type := #Gluten

!new Allergen('aNuts30')
!aNuts30.type := #Nuts

!new Allergen('aLactose30')
!aLactose30.type := #Lactose

!new FoodItem('fi300')
!fi300.number := 9010
!fi300.description := 'Pistachios'
!fi300.purchaseFlag := true
!fi300.unit := #Gram

!new FoodItem('fi301')
!fi301.number := 9011
!fi301.description := 'Yogurt'
!fi301.purchaseFlag := true
!fi301.unit := #Ounce

!new FoodItem('fi302')
!fi302.number := 9012
!fi302.description := 'Phyllo Sheets'
!fi302.purchaseFlag := true
!fi302.unit := #Sheet

!new FoodItem('fi303')
!fi303.number := 9013
!fi303.description := 'Black Tea Leaves'
!fi303.purchaseFlag := false
!fi303.unit := #Gram

!new FoodItem('fi304')
!fi304.number := 9014
!fi304.description := 'Chickpeas'
!fi304.purchaseFlag := true
!fi304.unit := #Pound

!insert (fi300, aNuts30) into FoodItemAllergen
!insert (fi301, aLactose30) into FoodItemAllergen
!insert (fi302, aGluten30) into FoodItemAllergen

!new MenuItem('mi71')
!mi71.description := 'Pistachio Baklava'
!mi71.prepTime := 40.0
!mi71.classification := #Dessert

!new MenuItem('mi72')
!mi72.description := 'Chickpea Stew Bowl'
!mi72.prepTime := 18.0
!mi72.classification := #Main

!new MenuItem('mi73')
!mi73.description := 'Black Tea (served hot)'
!mi73.prepTime := 0.0
!mi73.classification := #Beverage

!new MenuItem('mi74')
!mi74.description := 'Yogurt Dip Plate'
!mi74.prepTime := 3.0
!mi74.classification := #Apetizer

!insert (mi71, chef43) into MenuItemChef
!insert (mi72, chef44) into MenuItemChef
!insert (mi73, chef44) into MenuItemChef
!insert (mi74, chef43) into MenuItemChef

!insert (mi71, fi300) into MenuItemFoodItem
!insert (mi71, fi302) into MenuItemFoodItem
!insert (mi74, fi301) into MenuItemFoodItem
!insert (mi72, fi304) into MenuItemFoodItem
!insert (mi73, fi303) into MenuItemFoodItem

!new RegularCustomer('rc20')
!rc20.name := 'Anika Stern'
!rc20.prefferedLanguage := #German

!new DietaryRequirement('dr17')
!dr17.diet := #Vegetarian

!new ReportedAllergy('ra16')
!ra16.allergen := #Gluten
```
## Generation 28 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 128 | 0.00% |
| Multiplicities Errors | 0 | 20 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 10 | 0.00% |
| Phones | 0 | 10 | 0.00% |

# Generation 29
```
!new Restaurant('rest31')
!rest31.name := 'One-Tableless Concept'

!new Owner('own72')
!own72.name := 'Seth Palmer'
!own72.percentageShares := 99

!new Owner('own73')
!own73.name := 'Lina Gruber'
!own73.percentageShares := 1

!insert (rest31, own72) into RestaurantOwner
!insert (rest31, own73) into RestaurantOwner
```
## Generation 29 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 10 | 0.00% |
| Multiplicities Errors | 0 | 2 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 0 | 0.00% |
| Phones | 0 | 0 | 0.00% |

# Generation 30
```
!new Restaurant('rest32')
!rest32.name := 'Heritage Bakery Lab'

!new Owner('own74')
!own74.name := 'Marcel Dupre'
!own74.percentageShares := 50

!new Owner('own75')
!own75.name := 'Nadia Petrova'
!own75.percentageShares := 30

!new Owner('own76')
!own76.name := 'Oskar Lind'
!own76.percentageShares := 20

!insert (rest32, own74) into RestaurantOwner
!insert (rest32, own75) into RestaurantOwner
!insert (rest32, own76) into RestaurantOwner

!new Manager('mgr6')
!mgr6.name := 'Clara Wynn'
!mgr6.dateOfBirth := Date('1982-02-02')
!mgr6.phoneNumber := '+1-555-3200'

!new Chef('chef50')
!chef50.name := 'Amal Saeed'
!chef50.dateOfBirth := Date('1980-10-20')
!chef50.phoneNumber := '+1-555-3210'

!new Cook('cook70')
!cook70.name := 'Timo Berger'
!cook70.dateOfBirth := Date('1996-06-06')
!cook70.phoneNumber := '+1-555-3211'
!cook70.yearsOfExperience := 4

!new Cook('cook71')
!cook71.name := 'Rina Cole'
!cook71.dateOfBirth := Date('2003-03-03')
!cook71.phoneNumber := '+1-555-3212'
!cook71.yearsOfExperience := 0

!insert (chef50, cook70) into ChefCook
!insert (chef50, cook71) into ChefCook

!new Allergen('aGluten32')
!aGluten32.type := #Gluten

!new Allergen('aNuts32')
!aNuts32.type := #Nuts

!new Allergen('aLactose32')
!aLactose32.type := #Lactose

!new FoodItem('fi320')
!fi320.number := 3200
!fi320.description := 'Wheat Flour (high protein)'
!fi320.purchaseFlag := true
!fi320.unit := #Pound

!new FoodItem('fi321')
!fi321.number := 3201
!fi321.description := 'Butter cultured'
!fi321.purchaseFlag := true
!fi321.unit := #Ounce

!new FoodItem('fi322')
!fi322.number := 3202
!fi322.description := 'Walnut pieces'
!fi322.purchaseFlag := true
!fi322.unit := #Gram

!new FoodItem('fi323')
!fi323.number := 3203
!fi323.description := 'Coffee beans'
!fi323.purchaseFlag := false
!fi323.unit := #Gram

!insert (fi320, aGluten32) into FoodItemAllergen
!insert (fi321, aLactose32) into FoodItemAllergen
!insert (fi322, aNuts32) into FoodItemAllergen

!new MenuItem('mi100')
!mi100.description := 'Walnut Croissant'
!mi100.prepTime := 45.0
!mi100.classification := #Dessert

!new MenuItem('mi101')
!mi101.description := 'Espresso Shot'
!mi101.prepTime := 0.5
!mi101.classification := #Beverage

!new MenuItem('mi102')
!mi102.description := 'Butter Roll (mini)'
!mi102.prepTime := 20.0
!mi102.classification := #Apetizer

!insert (mi100, chef50) into MenuItemChef
!insert (mi101, chef50) into MenuItemChef
!insert (mi102, chef50) into MenuItemChef

!insert (mi100, fi320) into MenuItemFoodItem
!insert (mi100, fi321) into MenuItemFoodItem
!insert (mi100, fi322) into MenuItemFoodItem
!insert (mi101, fi323) into MenuItemFoodItem
!insert (mi102, fi320) into MenuItemFoodItem
!insert (mi102, fi321) into MenuItemFoodItem

!new RegularCustomer('rc21')
!rc21.name := 'Viktor Hahn'
!rc21.prefferedLanguage := #German

!new DietaryRequirement('dr18')
!dr18.diet := #Vegan

!new ReportedAllergy('ra17')
!ra17.allergen := #Gluten
```
## Generation 30 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 91 | 0.00% |
| Multiplicities Errors | 0 | 17 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 4 | 0.00% |
| Phones | 0 | 4 | 0.00% |

# Summary for all generations
| Summary | Value | 
|---|---| 
| Model | GPT_5_2 | 
| Type | Simple | 
| System | restaurant | 
| Number of generations | 30 | 

| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 4580 | 0.00% |
| Multiplicities Errors | 0 | 922 | 0.00% |
| Invariants Errors | 0 | 120 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 298 | 0.00% |
| Phones | 0 | 298 | 0.00% |

