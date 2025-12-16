# Generation 1
## Category baseline
```
!new Restaurant('restaurant3')
!restaurant3.name := 'Bella Italia'

!new Owner('owner5')
!owner5.name := 'Alessandro Rossi'
!owner5.percentageShares := 70

!new Owner('owner6')
!owner6.name := 'Giulia Verdi'
!owner6.percentageShares := 30

!insert (restaurant3, owner5) into RestaurantOwner
!insert (restaurant3, owner6) into RestaurantOwner

!new Table('table6')
!table6.number := 1
!table6.description := 'A cozy corner table for two near the window.'
!table6.capacity := 2

!new Table('table7')
!table7.number := 2
!table7.description := 'A round table in the center suitable for small groups.'
!table7.capacity := 6

!new Table('table8')
!table8.number := 3
!table8.description := 'An extra table to ensure adequate capacity for the banquet.'
!table8.capacity := 6

!new Individual('individualReservation1')
!individualReservation1.date := Date('2023-10-15')
!individualReservation1.time := Time('19:00')
!individualReservation1.numberPeople := 2
!individualReservation1.name := 'Maria Bianchi'
!individualReservation1.phoneNumber := '555-0123'
!individualReservation1.number := 1001
!individualReservation1.seating := #Inside
!individualReservation1.smoking := #NonSmoking

!insert (restaurant3, individualReservation1) into RestaurantReservation
!insert (individualReservation1, table6) into ReservationTable

!new RegularCustomer('customer1')
!customer1.name := 'Maria Bianchi'
!customer1.prefferedLanguage := #Italian

!insert (individualReservation1, customer1) into ReservationCustomer

!new Waiter('waiter4')
!waiter4.name := 'Marco Neri'
!waiter4.dateOfBirth := Date('1990-06-15')
!waiter4.phoneNumber := '555-0345'

!insert (individualReservation1, waiter4) into ReservationWaiter

!new ItemOrder('itemOrder1')
!itemOrder1.time := Time('19:10')
!insert (individualReservation1, itemOrder1) into ReservationItemOrdered

!new MenuItem('menuItem1')
!menuItem1.description := 'Bruschetta'
!menuItem1.prepTime := 10.0
!menuItem1.classification := #Apetizer

!insert (itemOrder1, menuItem1) into ItemOrderMenuItem

!new Chef('chef6')
!chef6.name := 'Veronica Lombardi'
!chef6.dateOfBirth := Date('1982-02-14')
!chef6.phoneNumber := '555-0567'

!insert (menuItem1, chef6) into MenuItemChef

!new Cook('cook5')
!cook5.name := 'Luigi Moretti'
!cook5.dateOfBirth := Date('1978-09-12')
!cook5.phoneNumber := '555-0789'
!cook5.yearsOfExperience := 10

!insert (chef6, cook5) into ChefCook

!new Banquet('banquet3')
!banquet3.date := Date('2023-10-15')
!banquet3.time := Time('20:00')
!banquet3.numberPeople := 8
!banquet3.name := 'Birthday Bash'
!banquet3.number := 2001
!banquet3.paymentMethod := #CreditCard
!banquet3.busService := true

!insert (restaurant3, banquet3) into RestaurantReservation
!insert (banquet3, table7) into ReservationTable
!insert (banquet3, table8) into ReservationTable

!insert (banquet3, waiter4) into ReservationWaiter

!new Waiter('waiter5')
!waiter5.name := 'Sofia Russo'
!waiter5.dateOfBirth := Date('1993-03-20')
!waiter5.phoneNumber := '555-0987'

!insert (banquet3, waiter5) into ReservationWaiter

!new HeadWaiter('headWaiter2')
!headWaiter2.name := 'Luca Martinelli'
!headWaiter2.dateOfBirth := Date('1985-01-22')
!headWaiter2.phoneNumber := '555-0678'

!insert (headWaiter2, waiter4) into HeadWaiterWaiter
!insert (headWaiter2, waiter5) into HeadWaiterWaiter

!new BusDriver('busdriver3')
!busdriver3.name := 'Franco Gallo'
!busdriver3.dateOfBirth := Date('1975-11-11')
!busdriver3.phoneNumber := '555-0456'

!insert (banquet3, busdriver3) into BanquetBusDriver

!new FoodItem('foodItem1')
!foodItem1.number := 3001
!foodItem1.description := 'Artisan Sourdough Bread'
!foodItem1.purchaseFlag := true
!foodItem1.unit := #Dozen

!new FoodItem('foodItem2')
!foodItem2.number := 3002
!foodItem2.description := 'Fresh Tomatoes'
!foodItem2.purchaseFlag := true
!foodItem2.unit := #Pound

!new Allergen('allergen4')
!allergen4.type := #Gluten

!new Allergen('allergen5')
!allergen5.type := #Nuts

!insert (foodItem1, allergen4) into FoodItemAllergen
!insert (foodItem2, allergen5) into FoodItemAllergen

!insert (menuItem1, foodItem1) into MenuItemFoodItem
!insert (menuItem1, foodItem2) into MenuItemFoodItem

!new DietaryRequirement('dietary1')
!dietary1.diet := #Vegan

!new Manager('manager1')
!manager1.name := 'Roberto Salvi'
!manager1.dateOfBirth := Date('1976-08-05')
!manager1.phoneNumber := '555-0332'
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 113 | 0.00% |
| Multiplicities Errors | 0 | 22 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 9 | 0.00% |
| Phones | 0 | 8 | 0.00% |

## Category boundary
```
!new Restaurant('restaurant1')
!restaurant1.name := 'The Global Taste Experience'

!new Owner('owner1')
!owner1.name := 'Alejandro Rivera'
!owner1.percentageShares := 50

!new Owner('owner2')
!owner2.name := 'Akiko Tanaka'
!owner2.percentageShares := 50

!insert (restaurant1, owner1) into RestaurantOwner
!insert (restaurant1, owner2) into RestaurantOwner

!new Banquet('banquet1')
!banquet1.date := Date('2023-11-05')
!banquet1.time := Time('19:00')
!banquet1.numberPeople := 36
!banquet1.name := 'Global Food Enthusiasts Club'
!banquet1.phoneNumber := '+44 207 123 4567'
!banquet1.number := 1
!banquet1.groupName := 'Global Food Enthusiasts'
!banquet1.paymentMethod := #CreditCard
!banquet1.busService := false

!insert (restaurant1, banquet1) into RestaurantReservation 

!new Table('table1')
!table1.number := 1
!table1.description := 'Main Hall Large Round'
!table1.capacity := 12

!new Table('table2')
!table2.number := 2
!table2.description := 'Main Hall Medium Round'
!table2.capacity := 10

!new Table('table3')
!table3.number := 3
!table3.description := 'Garden Patio Long'
!table3.capacity := 14

!insert (banquet1, table1) into ReservationTable
!insert (banquet1, table2) into ReservationTable
!insert (banquet1, table3) into ReservationTable

!new MenuItem('item1')
!item1.description := 'Japanese Ramen'
!item1.prepTime := 15.0
!item1.classification := #Main

!new MenuItem('item2')
!item2.description := 'Spanish Paella'
!item2.prepTime := 20.0
!item2.classification := #Main

!new MenuItem('item3')
!item3.description := 'French Ratatouille'
!item3.prepTime := 25.0
!item3.classification := #Apetizer

!new MenuItem('item4')
!item4.description := 'Indian Butter Chicken'
!item4.prepTime := 30.0
!item4.classification := #Main

!new Chef('chef1')
!chef1.name := 'Hiroshi Yamamoto'
!new Chef('chef2')
!chef2.name := 'Isabel Martinez'
!new Chef('chef3')
!chef3.name := 'Pierre Dupont'
!new Chef('chef4')
!chef4.name := 'Priya Nair'

!insert (item1, chef1) into MenuItemChef
!insert (item2, chef2) into MenuItemChef
!insert (item3, chef3) into MenuItemChef
!insert (item4, chef4) into MenuItemChef

!new Cook('cook1')
!cook1.name := 'Kenji Takahashi'
!cook1.dateOfBirth := Date('1988-02-02')
!cook1.yearsOfExperience := 12

!new Cook('cook2')
!cook2.name := 'Yuki Mori'
!cook2.dateOfBirth := Date('1991-06-15')
!cook2.yearsOfExperience := 8

!insert (chef1, cook1) into ChefCook
!insert (chef2, cook2) into ChefCook
!insert (chef3, cook1) into ChefCook
!insert (chef4, cook2) into ChefCook

!new ItemOrder('order1')
!order1.time := Time('19:15')
!insert (banquet1, order1) into ReservationItemOrdered
!insert (order1, item1) into ItemOrderMenuItem

!new ItemOrder('order2')
!order2.time := Time('19:20')
!insert (banquet1, order2) into ReservationItemOrdered
!insert (order2, item2) into ItemOrderMenuItem

!new ItemOrder('order3')
!order3.time := Time('19:25')
!insert (banquet1, order3) into ReservationItemOrdered
!insert (order3, item3) into ItemOrderMenuItem

!new ItemOrder('order4')
!order4.time := Time('19:30')
!insert (banquet1, order4) into ReservationItemOrdered
!insert (order4, item4) into ItemOrderMenuItem

!new FoodItem('food1')
!food1.number := 1
!food1.description := 'Shrimp'
!food1.purchaseFlag := true
!food1.unit := #Pound

!new Allergen('allergen1')
!allergen1.type := #Seafood

!insert (food1, allergen1) into FoodItemAllergen

!new FoodItem('food2')
!food2.number := 2
!food2.description := 'Peanuts'
!food2.purchaseFlag := true
!food2.unit := #Gram

!new Allergen('allergen2')
!allergen2.type := #Nuts

!insert (food2, allergen2) into FoodItemAllergen

!new FoodItem('food3')
!food3.number := 3
!food3.description := 'Wheat Flour'
!food3.purchaseFlag := true
!food3.unit := #Pound

!new Allergen('allergen3')
!allergen3.type := #Gluten

!insert (food3, allergen3) into FoodItemAllergen

!new HeadWaiter('headWaiter1')
!headWaiter1.name := 'Anna Müller'
!headWaiter1.dateOfBirth := Date('1985-03-10')
!headWaiter1.phoneNumber := '+49 160 9876543'

!new Waiter('waiter1')
!waiter1.name := 'Carlos Diaz'
!waiter1.dateOfBirth := Date('1990-09-21')
!waiter1.phoneNumber := '+52 55 12345678'

!new Waiter('waiter2')
!waiter2.name := 'Fatima Al-Farsi'
!waiter2.dateOfBirth := Date('1993-12-05')
!waiter2.phoneNumber := '+971 50 3216549'

!insert (banquet1, waiter1) into ReservationWaiter
!insert (banquet1, waiter2) into ReservationWaiter

!insert (headWaiter1, waiter1) into HeadWaiterWaiter
!insert (headWaiter1, waiter2) into HeadWaiterWaiter
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 132 | 0.00% |
| Multiplicities Errors | 2 | 29 | 6.90% |
| Invariants Errors | 0 | 4 | 0.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `ChefCook':
  Object `cook2' of class `Cook' is connected to 2 objects of class `Chef'
  at association end `underSupervisionOf' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ChefCook':
  Object `cook1' of class `Cook' is connected to 2 objects of class `Chef'
  at association end `underSupervisionOf' but the multiplicity is specified as `1'.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 6 | 0.00% |
| Phones | 0 | 4 | 0.00% |

## Category complex
```
!new Restaurant('restaurant5')
!restaurant5.name := 'Global Fusion Dining'

!new Owner('owner10')
!owner10.name := 'Alejandro Martinez'
!owner10.percentageShares := 50

!new Owner('owner11')
!owner11.name := 'Fatima Al-Hassan'
!owner11.percentageShares := 30

!new Owner('owner12')
!owner12.name := 'Yuki Nakamura'
!owner12.percentageShares := 20

!insert (restaurant5, owner10) into RestaurantOwner
!insert (restaurant5, owner11) into RestaurantOwner
!insert (restaurant5, owner12) into RestaurantOwner

!new RegularCustomer('customerA')
!customerA.name := 'Claire Dubois'
!customerA.prefferedLanguage := #English

!new RegularCustomer('customerB')
!customerB.name := 'Omar El-Masry'
!customerB.prefferedLanguage := #English

!new HeadWaiter('headWaiter4')
!headWaiter4.name := 'Giovanni Rossi'
!headWaiter4.dateOfBirth := Date('1968-05-12')
!headWaiter4.phoneNumber := '+39 555 2333'

!new Waiter('waiter9')
!waiter9.name := 'Elsa Svensson'
!waiter9.dateOfBirth := Date('1990-04-28')
!waiter9.phoneNumber := '+46 555 8844'

!new Waiter('waiter10')
!waiter10.name := 'Amara Singh'
!waiter10.dateOfBirth := Date('1985-11-14')
!waiter10.phoneNumber := '+91 555 1122'

!insert (headWaiter4, waiter9) into HeadWaiterWaiter
!insert (headWaiter4, waiter10) into HeadWaiterWaiter

!new Manager('manager2')
!manager2.name := 'Lin Zhang'
!manager2.dateOfBirth := Date('1975-01-22')
!manager2.phoneNumber := '+86 555 9988'

!new Chef('chef8')
!chef8.name := 'Carlos Fernandez'
!chef8.dateOfBirth := Date('1980-08-08')
!chef8.phoneNumber := '+34 555 7711'

!new Cook('cook8')
!cook8.name := 'Diego Rios'
!cook8.dateOfBirth := Date('1992-11-30')
!cook8.phoneNumber := '+34 555 8833'
!cook8.yearsOfExperience := 5

!new Cook('cook9')
!cook9.name := 'Anja Müller'
!cook9.dateOfBirth := Date('1983-09-10')
!cook9.phoneNumber := '+49 555 4477'
!cook9.yearsOfExperience := 8

!insert (chef8, cook8) into ChefCook
!insert (chef8, cook9) into ChefCook

!new BusDriver('busdriver7')
!busdriver7.name := 'Sandra Lee'
!busdriver7.dateOfBirth := Date('1978-03-15')
!busdriver7.phoneNumber := '+1 555 3321'

!new Table('table12')
!table12.number := 1
!table12.description := 'Near window, round'
!table12.capacity := 4

!new Table('table13')
!table13.number := 2
!table13.description := 'Centered, square'
!table13.capacity := 6

!new Table('table14')
!table14.number := 3
!table14.description := 'Garden view, long rectangle'
!table14.capacity := 12

!new Individual('individualReservation2')
!individualReservation2.time := Time('19:00')
!individualReservation2.date := Date('2023-12-20')
!individualReservation2.numberPeople := 2
!individualReservation2.name := 'Claire Dubois'
!individualReservation2.phoneNumber := '+33 555 1234'
!individualReservation2.number := 12345
!individualReservation2.seating := #Inside
!individualReservation2.smoking := #NonSmoking

!insert (restaurant5, individualReservation2) into RestaurantReservation
!insert (individualReservation2, table12) into ReservationTable
!insert (individualReservation2, waiter9) into ReservationWaiter
!insert (individualReservation2, waiter10) into ReservationWaiter

!insert (individualReservation2, customerA) into ReservationCustomer

!new Banquet('banquet5')
!banquet5.date := Date('2023-12-21')
!banquet5.time := Time('18:00')
!banquet5.numberPeople := 18
!banquet5.groupName := 'International Culinary Meetup'
!banquet5.paymentMethod := #CreditCard
!banquet5.busService := true

!insert (restaurant5, banquet5) into RestaurantReservation
!insert (banquet5, table13) into ReservationTable
!insert (banquet5, table14) into ReservationTable
!insert (banquet5, waiter9) into ReservationWaiter
!insert (banquet5, waiter10) into ReservationWaiter

!insert (banquet5, busdriver7) into BanquetBusDriver

!new ItemOrder('itemOrder3')
!itemOrder3.time := Time('19:15')
!insert (individualReservation2, itemOrder3) into ReservationItemOrdered

!new MenuItem('menuItem4')
!menuItem4.description := 'Fusion Sushi'
!menuItem4.prepTime := 15.0
!menuItem4.classification := #Apetizer

!insert (itemOrder3, menuItem4) into ItemOrderMenuItem
!insert (menuItem4, chef8) into MenuItemChef

!new ItemOrder('itemOrder4')
!itemOrder4.time := Time('18:30')
!insert (banquet5, itemOrder4) into ReservationItemOrdered

!new MenuItem('menuItem5')
!menuItem5.description := 'Red Curry'
!menuItem5.prepTime := 30.0
!menuItem5.classification := #Main

!insert (itemOrder4, menuItem5) into ItemOrderMenuItem
!insert (menuItem5, chef8) into MenuItemChef

!new FoodItem('foodItem6')
!foodItem6.number := 304
!foodItem6.description := 'Rice'
!foodItem6.purchaseFlag := true
!foodItem6.unit := #Pound

!insert (menuItem4, foodItem6) into MenuItemFoodItem

!new FoodItem('foodItem7')
!foodItem7.number := 305
!foodItem7.description := 'Seaweed'
!foodItem7.purchaseFlag := true
!foodItem7.unit := #Sheet

!insert (menuItem4, foodItem7) into MenuItemFoodItem

!new FoodItem('foodItem8')
!foodItem8.number := 306
!foodItem8.description := 'Salmon'
!foodItem8.purchaseFlag := false
!foodItem8.unit := #Gram

!insert (menuItem4, foodItem8) into MenuItemFoodItem

!new FoodItem('foodItem9')
!foodItem9.number := 307
!foodItem9.description := 'Coconut Milk'
!foodItem9.purchaseFlag := true
!foodItem9.unit := #Ounce

!insert (menuItem5, foodItem9) into MenuItemFoodItem

!new FoodItem('foodItem10')
!foodItem10.number := 308
!foodItem10.description := 'Red Chilies'
!foodItem10.purchaseFlag := true
!foodItem10.unit := #Gram

!insert (menuItem5, foodItem10) into MenuItemFoodItem

!new Allergen('allergen7')
!allergen7.type := #Seafood

!new Allergen('allergen8')
!allergen8.type := #Nuts

!insert (foodItem8, allergen7) into FoodItemAllergen
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 150 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 10 | 0.00% |
| Phones | 0 | 9 | 0.00% |

## Category edge
```
!new Restaurant('restaurant4')
!restaurant4.name := 'Culinary Mosaic'

!new Owner('owner7')
!owner7.name := 'Sophia Mendez'
!owner7.percentageShares := 50

!new Owner('owner8')
!owner8.name := 'Arjun Patel'
!owner8.percentageShares := 30

!new Owner('owner9')
!owner9.name := 'Lina Rossi'
!owner9.percentageShares := 20

!insert (restaurant4, owner7) into RestaurantOwner
!insert (restaurant4, owner8) into RestaurantOwner
!insert (restaurant4, owner9) into RestaurantOwner

!new Table('table9')
!table9.number := 101
!table9.description := 'Cozy Corner with a view'
!table9.capacity := 4

!new Table('table10')
!table10.number := 102
!table10.description := 'Open Terrace Seating'
!table10.capacity := 6

!new Table('table11')
!table11.number := 103
!table11.description := 'Private Dining Room'
!table11.capacity := 40  -- Adjusted to ensure total capacity meets requirement

!new RegularCustomer('customer2')
!customer2.name := 'Ming Zhao'
!customer2.prefferedLanguage := #English  -- Assuming #Mandarin is not defined, using #English as a placeholder

!new Chef('chef7')
!chef7.name := 'Jean-Luc Girard'

!new Cook('cook6')
!cook6.name := 'Hasan Yilmaz'
!cook6.dateOfBirth := Date('1980-05-14')  -- Dummy date of birth
!cook6.yearsOfExperience := 5

!new Cook('cook7')
!cook7.name := 'Nia Ogawa'
!cook7.dateOfBirth := Date('1979-02-22')  -- Dummy date of birth
!cook7.yearsOfExperience := 7

!insert (chef7, cook6) into ChefCook
!insert (chef7, cook7) into ChefCook

!new MenuItem('menuItem2')
!menuItem2.description := 'Spicy Tofu Stir-Fry'
!menuItem2.prepTime := 15.0
!menuItem2.classification := #Main

!new MenuItem('menuItem3')
!menuItem3.description := 'Taste of Italy Appetizer Platter'
!menuItem3.prepTime := 20.0
!menuItem3.classification := #Apetizer

!insert (menuItem2, chef7) into MenuItemChef
!insert (menuItem3, chef7) into MenuItemChef

!new FoodItem('foodItem3')
!foodItem3.number := 301
!foodItem3.description := 'Chicken Breast'
!foodItem3.purchaseFlag := true
!foodItem3.unit := #Pound  -- Assuming #Kilogram is not defined, using #Pound as a placeholder

!new FoodItem('foodItem4')
!foodItem4.number := 302
!foodItem4.description := 'Red Chili'
!foodItem4.purchaseFlag := false
!foodItem4.unit := #Gram

!new FoodItem('foodItem5')
!foodItem5.number := 303
!foodItem5.description := 'Italian Salami'
!foodItem5.purchaseFlag := true
!foodItem5.unit := #Gram

!new Allergen('allergen6')
!allergen6.type := #Gluten

!insert (menuItem2, foodItem3) into MenuItemFoodItem
!insert (menuItem2, foodItem4) into MenuItemFoodItem
!insert (menuItem3, foodItem5) into MenuItemFoodItem

!insert (foodItem5, allergen6) into FoodItemAllergen

!new Banquet('banquet4')
!banquet4.date := Date('2024-05-15')
!banquet4.time := Time('18:00')
!banquet4.numberPeople := 50
!banquet4.name := 'Dr. Emma Wilson'
!banquet4.phoneNumber := '+44 7123 456789'
!banquet4.number := 20240515
!banquet4.paymentMethod := #CreditCard
!banquet4.busService := true

!insert (restaurant4, banquet4) into RestaurantReservation
!insert (banquet4, table9) into ReservationTable
!insert (banquet4, table10) into ReservationTable
!insert (banquet4, table11) into ReservationTable

!new ItemOrder('itemOrder2')
!itemOrder2.time := Time('18:30')
!insert (banquet4, itemOrder2) into ReservationItemOrdered

!insert (itemOrder2, menuItem3) into ItemOrderMenuItem

!new HeadWaiter('headWaiter3')
!headWaiter3.name := 'Alessio Vitale'
!headWaiter3.dateOfBirth := Date('1983-04-18')  -- Dummy date of birth

!new Waiter('waiter6')
!waiter6.name := 'Maria Gonzales'
!waiter6.dateOfBirth := Date('1991-07-30')  -- Dummy date of birth

!new Waiter('waiter7')
!waiter7.name := 'Ahmed Khan'
!waiter7.dateOfBirth := Date('1988-11-05')  -- Dummy date of birth

!new Waiter('waiter8')
!waiter8.name := 'Lucy Robertson'
!waiter8.dateOfBirth := Date('1990-02-10')  -- Dummy date of birth

!insert (banquet4, waiter6) into ReservationWaiter
!insert (banquet4, waiter7) into ReservationWaiter
!insert (banquet4, waiter8) into ReservationWaiter

!insert (headWaiter3, waiter6) into HeadWaiterWaiter
!insert (headWaiter3, waiter7) into HeadWaiterWaiter
!insert (headWaiter3, waiter8) into HeadWaiterWaiter

!new BusDriver('busdriver4')
!busdriver4.name := 'Ravi Kumar'
!busdriver4.dateOfBirth := Date('1978-06-09')  -- Dummy date of birth

!new BusDriver('busdriver5')
!busdriver5.name := 'Nina Forte'
!busdriver5.dateOfBirth := Date('1982-12-14')  -- Dummy date of birth

!new BusDriver('busdriver6')
!busdriver6.name := 'Zidane Mohammed'
!busdriver6.dateOfBirth := Date('1990-03-09')  -- Dummy date of birth

!insert (banquet4, busdriver4) into BanquetBusDriver
!insert (banquet4, busdriver5) into BanquetBusDriver
!insert (banquet4, busdriver6) into BanquetBusDriver

!new DietaryRequirement('dietary2')
!dietary2.diet := #Vegan

!insert (banquet4, customer2) into ReservationCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 122 | 0.00% |
| Multiplicities Errors | 0 | 27 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 10 | 0.00% |
| Phones | 0 | 1 | 0.00% |

## Category invalid
```
!new Restaurant('restaurant2')
!restaurant2.name := 'Gourmet Feast'

!new Owner('owner3')
!owner3.name := 'Sophia Chang'
!owner3.percentageShares := 60

!new Owner('owner4')
!owner4.name := 'Liam O\'Connor'
!owner4.percentageShares := 60

!insert (restaurant2, owner3) into RestaurantOwner
!insert (restaurant2, owner4) into RestaurantOwner

!new Banquet('banquet2')
!banquet2.date := Date('2023-11-20')
!banquet2.time := Time('18:00')
!banquet2.numberPeople := 50
!banquet2.name := 'The Smiths Celebration'
!banquet2.phoneNumber := '+44 7911 123456'
!banquet2.number := 2
!banquet2.groupName := 'Smith Family'
!banquet2.paymentMethod := #CreditCard
!banquet2.busService := true

!insert (restaurant2, banquet2) into RestaurantReservation 

!new Table('table4')
!table4.number := 101
!table4.description := 'Large banquet table with oak finish'
!table4.capacity := 10

!new Table('table5')
!table5.number := 102
!table5.description := 'Medium round table near the window'
!table5.capacity := 8

!insert (banquet2, table4) into ReservationTable
!insert (banquet2, table5) into ReservationTable

!new BusDriver('busdriver1')
!busdriver1.name := 'Ahmed Ali'
!busdriver1.dateOfBirth := Date('1980-07-15')
!busdriver1.phoneNumber := '+44 7911 109876'

!new BusDriver('busdriver2')
!busdriver2.name := 'Elena Morales'
!busdriver2.dateOfBirth := Date('1992-03-22')
!busdriver2.phoneNumber := '+44 7911 304987'

!new Waiter('waiter3')
!waiter3.name := 'Carlos Rivera'
!waiter3.dateOfBirth := Date('1989-05-05')
!waiter3.phoneNumber := '+44 7911 203456'

!insert (banquet2, waiter3) into ReservationWaiter

!new Chef('chef5')
!chef5.name := 'Giovanni Russo'
!chef5.dateOfBirth := Date('1975-12-20')
!chef5.phoneNumber := '+44 7911 404455'

!new Cook('cook3')
!cook3.name := 'Marina Kovac'
!cook3.dateOfBirth := Date('1982-11-15')
!cook3.phoneNumber := '+44 7911 502432'
!cook3.yearsOfExperience := 5

!new Cook('cook4')
!cook4.name := 'Owen Sinclair'
!cook4.dateOfBirth := Date('1990-08-12')
!cook4.phoneNumber := '+44 7911 643221'
!cook4.yearsOfExperience := 3

!insert (chef5, cook3) into ChefCook
!insert (chef5, cook4) into ChefCook

!insert (banquet2, busdriver1) into BanquetBusDriver
!insert (banquet2, busdriver2) into BanquetBusDriver
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 10 | 10.00% |
| Invariants Errors (Not included on General) | 2 | 4 | 50.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `HeadWaiterWaiter':
  Object `waiter3' of class `Waiter' is connected to 0 objects of class `HeadWaiter'
  at association end `headWaiter' but the multiplicity is specified as `1'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (3) `Restaurant::TotalOwnerShares': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 7 | 0.00% |
| Phones | 0 | 7 | 0.00% |

## Generation 1 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 579 | 0.00% |
| Multiplicities Errors | 2 | 108 | 1.85% |
| Invariants Errors | 0 | 16 | 0.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `ChefCook':
  Object `cook2' of class `Cook' is connected to 2 objects of class `Chef'
  at association end `underSupervisionOf' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ChefCook':
  Object `cook1' of class `Cook' is connected to 2 objects of class `Chef'
  at association end `underSupervisionOf' but the multiplicity is specified as `1'.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 10 | 10.00% |
| Invariants Errors (Not included on General) | 2 | 4 | 50.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `HeadWaiterWaiter':
  Object `waiter3' of class `Waiter' is connected to 0 objects of class `HeadWaiter'
  at association end `headWaiter' but the multiplicity is specified as `1'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (3) `Restaurant::TotalOwnerShares': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 42 | 0.00% |
| Phones | 0 | 29 | 0.00% |

# Generation 2
## Category baseline
```
!new Restaurant('restaurant7')
!restaurant7.name := 'Le Petit Gourmet'

!new Owner('owner15')
!owner15.name := 'François Dupont'
!owner15.percentageShares := 50

!new Owner('owner16')
!owner16.name := 'Claire Dubois'
!owner16.percentageShares := 50

!insert (restaurant7, owner15) into RestaurantOwner
!insert (restaurant7, owner16) into RestaurantOwner

!new Table('table16')
!table16.number := 1
!table16.description := 'A romantic table for two with a view of the city skyline.'
!table16.capacity := 2

!new Table('table17')
!table17.number := 2
!table17.description := 'Perfect for families, near the fireplace.'
!table17.capacity := 12  -- Adjusting capacity to meet requirement

!new Individual('individualReservation4')
!individualReservation4.time := Time('18:30')
!individualReservation4.date := Date('2023-10-16')
!individualReservation4.numberPeople := 1
!individualReservation4.name := 'Hiroshi Tanaka'
!individualReservation4.phoneNumber := '555-2045'
!individualReservation4.number := 3002
!individualReservation4.seating := #Inside
!individualReservation4.smoking := #NonSmoking

!insert (restaurant7, individualReservation4) into RestaurantReservation
!insert (individualReservation4, table16) into ReservationTable

!new RegularCustomer('customer3')
!customer3.name := 'Hiroshi Tanaka'
!customer3.prefferedLanguage := #English  -- Assuming #Japanese is not defined, using #English as a placeholder

!insert (individualReservation4, customer3) into ReservationCustomer

!new Waiter('waiter12')
!waiter12.name := 'Jean Laurent'
!waiter12.dateOfBirth := Date('1991-03-29')
!waiter12.phoneNumber := '555-1964'

!insert (individualReservation4, waiter12) into ReservationWaiter

!new ItemOrder('itemOrder7')
!itemOrder7.time := Time('18:40')
!insert (individualReservation4, itemOrder7) into ReservationItemOrdered

!new MenuItem('menuItem10')
!menuItem10.description := 'Escargots de Bourgogne'
!menuItem10.prepTime := 15.0
!menuItem10.classification := #Apetizer

!insert (itemOrder7, menuItem10) into ItemOrderMenuItem

!new Chef('chef11')
!chef11.name := 'Amélie Monet'
!chef11.dateOfBirth := Date('1975-05-14')
!chef11.phoneNumber := '555-1532'

!insert (menuItem10, chef11) into MenuItemChef

!new Cook('cook12')
!cook12.name := 'Pierre Lafont'
!cook12.dateOfBirth := Date('1980-07-22')
!cook12.phoneNumber := '555-1234'
!cook12.yearsOfExperience := 12

!insert (chef11, cook12) into ChefCook

!new Banquet('banquet6')
!banquet6.date := Date('2023-10-16')
!banquet6.time := Time('19:45')
!banquet6.numberPeople := 12
!banquet6.groupName := 'La Société Gastronomique'
!banquet6.paymentMethod := #Cash
!banquet6.busService := false

!insert (restaurant7, banquet6) into RestaurantReservation
!insert (banquet6, table17) into ReservationTable

!insert (banquet6, waiter12) into ReservationWaiter

!new Waiter('waiter13')
!waiter13.name := 'Marine Poirier'
!waiter13.dateOfBirth := Date('1988-10-10')
!waiter13.phoneNumber := '555-1678'

!insert (banquet6, waiter13) into ReservationWaiter

!new HeadWaiter('headWaiter6')
!headWaiter6.name := 'Lucien Moreau'
!headWaiter6.dateOfBirth := Date('1983-05-15')
!headWaiter6.phoneNumber := '555-1456'

!insert (headWaiter6, waiter12) into HeadWaiterWaiter
!insert (headWaiter6, waiter13) into HeadWaiterWaiter

!new FoodItem('foodItem19')
!foodItem19.number := 401
!foodItem19.description := 'Snails'
!foodItem19.purchaseFlag := true
!foodItem19.unit := #Dozen

!new FoodItem('foodItem20')
!foodItem20.number := 402
!foodItem20.description := 'Garlic'
!foodItem20.purchaseFlag := true
!foodItem20.unit := #Gram

!new FoodItem('foodItem21')
!foodItem21.number := 403
!foodItem21.description := 'Butter'
!foodItem21.purchaseFlag := true
!foodItem21.unit := #Gram

!insert (menuItem10, foodItem19) into MenuItemFoodItem
!insert (menuItem10, foodItem20) into MenuItemFoodItem
!insert (menuItem10, foodItem21) into MenuItemFoodItem

!new Allergen('allergen11')
!allergen11.type := #Lactose

!insert (foodItem21, allergen11) into FoodItemAllergen

!new DietaryRequirement('dietary3')
!dietary3.diet := #Vegan  -- Using #Vegan as placeholder for Dairy-Free

!new Manager('manager3')
!manager3.name := 'Sophie Lemieux'
!manager3.dateOfBirth := Date('1970-02-24')
!manager3.phoneNumber := '555-1345'
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 105 | 0.00% |
| Multiplicities Errors | 0 | 20 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 8 | 0.00% |
| Phones | 0 | 7 | 0.00% |

## Category boundary
```
!new Restaurant('restaurant6')
!restaurant6.name := 'The Cozy Corner Tavern'

!new Owner('owner13')
!owner13.name := 'Margaret O\'Connell'
!owner13.percentageShares := 65

!new Owner('owner14')
!owner14.name := 'Liam Byrne'
!owner14.percentageShares := 35

!insert (restaurant6, owner13) into RestaurantOwner
!insert (restaurant6, owner14) into RestaurantOwner

!new Table('table15')
!table15.number := 4
!table15.description := 'Intimate Corner Table'
!table15.capacity := 4

!new Individual('individualReservation3')
!individualReservation3.time := Time('17:00')
!individualReservation3.date := Date('2023-10-10')
!individualReservation3.numberPeople := 1
!individualReservation3.name := 'Patrick Finnigan'
!individualReservation3.phoneNumber := '+353 123 456789'
!individualReservation3.number := 1
!individualReservation3.seating := #Inside
!individualReservation3.smoking := #NonSmoking

!insert (restaurant6, individualReservation3) into RestaurantReservation
!insert (individualReservation3, table15) into ReservationTable

!new Waiter('waiter11')
!waiter11.name := 'Sean Kelly'
!waiter11.dateOfBirth := Date('1992-01-15')
!waiter11.phoneNumber := '+353 456 789012'

!new HeadWaiter('headWaiter5')
!headWaiter5.name := 'Unknown Waiter'
!headWaiter5.dateOfBirth := Date('1970-01-01')  -- Placeholder data
!headWaiter5.phoneNumber := '+353 000 0000000'  -- Placeholder data

!insert (headWaiter5, waiter11) into HeadWaiterWaiter
!insert (individualReservation3, waiter11) into ReservationWaiter

!new ItemOrder('itemOrder5')
!itemOrder5.time := Time('17:10')
!insert (individualReservation3, itemOrder5) into ReservationItemOrdered

!new MenuItem('menuItem8')
!menuItem8.description := 'Traditional Irish Stew'
!menuItem8.prepTime := 20.0
!menuItem8.classification := #Main

!insert (itemOrder5, menuItem8) into ItemOrderMenuItem

!new MenuItem('menuItem9')
!menuItem9.description := 'Brown Soda Bread'
!menuItem9.prepTime := 10.0
!menuItem9.classification := #Dessert -- Placeholder as Side is not defined
!new ItemOrder('itemOrder6')
!itemOrder6.time := Time('17:20')
!insert (individualReservation3, itemOrder6) into ReservationItemOrdered
!insert (itemOrder6, menuItem9) into ItemOrderMenuItem

!new Chef('chef9')
!chef9.name := 'Aoife Doran'

!new Chef('chef10')
!chef10.name := 'John McGowan'

!insert (menuItem8, chef9) into MenuItemChef
!insert (menuItem9, chef10) into MenuItemChef

!new Cook('cook10')
!cook10.name := 'Fiona O\'Reilly'
!cook10.dateOfBirth := Date('1980-08-03')
!cook10.yearsOfExperience := 15

!new Cook('cook11')
!cook11.name := 'Placeholder Cook'
!cook11.dateOfBirth := Date('1980-01-01') -- Placeholder data
!cook11.yearsOfExperience := 5

!insert (chef9, cook10) into ChefCook
!insert (chef10, cook11) into ChefCook

!new FoodItem('foodItem16')
!foodItem16.number := 16
!foodItem16.description := 'Lamb'
!foodItem16.purchaseFlag := true
!foodItem16.unit := #Pound  -- Placeholder since Kilograms isn't defined

!new FoodItem('foodItem17')
!foodItem17.number := 17
!foodItem17.description := 'Butter'
!foodItem17.purchaseFlag := true
!foodItem17.unit := #Gram

!new Allergen('allergen9')
!allergen9.type := #Lactose

!insert (foodItem17, allergen9) into FoodItemAllergen

!new FoodItem('foodItem18')
!foodItem18.number := 18
!foodItem18.description := 'Flour'
!foodItem18.purchaseFlag := true
!foodItem18.unit := #Pound  -- Placeholder since Bags isn't defined

!new Allergen('allergen10')
!allergen10.type := #Gluten

!insert (foodItem18, allergen10) into FoodItemAllergen
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 88 | 0.00% |
| Multiplicities Errors | 0 | 16 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 5 | 0.00% |
| Phones | 0 | 3 | 0.00% |

## Category complex
```
!new Restaurant('restaurant12')
!restaurant12.name := 'Euphoria Palace'

!new Owner('owner27')
!owner27.name := 'Aisha Bello'
!owner27.percentageShares := 40

!new Owner('owner28')
!owner28.name := 'Miguel Pereira'
!owner28.percentageShares := 60

!insert (restaurant12, owner27) into RestaurantOwner
!insert (restaurant12, owner28) into RestaurantOwner

!new RegularCustomer('customer6')
!customer6.name := 'Arjun Mehta'
!customer6.prefferedLanguage := #English  -- #Hindi not defined

!new RegularCustomer('customer7')
!customer7.name := 'Sophie Baker'
!customer7.prefferedLanguage := #English

!new HeadWaiter('headWaiter11')
!headWaiter11.name := 'Francois Lavoie'
!headWaiter11.dateOfBirth := Date('1972-07-04')
!headWaiter11.phoneNumber := '+1 604 333 2100'

!new Waiter('waiter21')
!waiter21.name := 'Ling Wei'
!waiter21.dateOfBirth := Date('1995-02-17')
!waiter21.phoneNumber := '+1 604 555 4192'

!new Waiter('waiter22')
!waiter22.name := 'Maria Brovkin'
!waiter22.dateOfBirth := Date('1987-10-30')
!waiter22.phoneNumber := '+1 604 555 7430'

!new Waiter('waiter23')
!waiter23.name := 'Koharu Tanaka'
!waiter23.dateOfBirth := Date('1991-03-03')
!waiter23.phoneNumber := '+1 604 555 2354'

!insert (headWaiter11, waiter21) into HeadWaiterWaiter
!insert (headWaiter11, waiter22) into HeadWaiterWaiter
!insert (headWaiter11, waiter23) into HeadWaiterWaiter

!new Manager('manager5')
!manager5.name := 'Samuel Yeboah'
!manager5.dateOfBirth := Date('1966-11-25')
!manager5.phoneNumber := '+1 604 777 5421'

!new Chef('chef17')
!chef17.name := 'Athena Petrova'
!chef17.dateOfBirth := Date('1981-03-23')
!chef17.phoneNumber := '+1 604 555 8765'

!new Cook('cook19')
!cook19.name := 'Pierre Lafont'
!cook19.dateOfBirth := Date('1990-12-12')
!cook19.phoneNumber := '+1 604 555 1123'
!cook19.yearsOfExperience := 6

!new Cook('cook20')
!cook20.name := 'Olga Ivanova'
!cook20.dateOfBirth := Date('1984-05-15')
!cook20.phoneNumber := '+1 604 555 2234'
!cook20.yearsOfExperience := 9

!insert (chef17, cook19) into ChefCook
!insert (chef17, cook20) into ChefCook

!new BusDriver('busdriver11')
!busdriver11.name := 'Tomislav Zoric'
!busdriver11.dateOfBirth := Date('1975-08-14')
!busdriver11.phoneNumber := '+1 604 555 3498'

!new Table('table27')
!table27.number := 4
!table27.description := 'Private booth, corner'
!table27.capacity := 2

!new Table('table28')
!table28.number := 5
!table28.description := 'Open air, veranda'
!table28.capacity := 4

!new Table('table29')
!table29.number := 6
!table29.description := 'Large booth, by bar'
!table29.capacity := 12  -- Adjusted to support both reservations

!new Individual('individualReservation8')
!individualReservation8.time := Time('20:30')
!individualReservation8.date := Date('2023-11-15')
!individualReservation8.numberPeople := 3
!individualReservation8.name := 'Sophie Baker'
!individualReservation8.phoneNumber := '+1 778 333 6677'
!individualReservation8.number := 54321
!individualReservation8.seating := #Inside  -- Using #Inside as placeholder for Booth
!individualReservation8.smoking := #Smoking

!insert (restaurant12, individualReservation8) into RestaurantReservation
!insert (individualReservation8, table29) into ReservationTable
!insert (individualReservation8, waiter21) into ReservationWaiter

!insert (individualReservation8, customer7) into ReservationCustomer

!new Banquet('banquet10')
!banquet10.date := Date('2023-11-19')
!banquet10.time := Time('17:30')
!banquet10.numberPeople := 12
!banquet10.groupName := 'Global Art Gala'
!banquet10.paymentMethod := #Cash
!banquet10.busService := false

!insert (restaurant12, banquet10) into RestaurantReservation
!insert (banquet10, table28) into ReservationTable

!insert (banquet10, waiter23) into ReservationWaiter
!insert (banquet10, waiter22) into ReservationWaiter

!new ItemOrder('itemOrder13')
!itemOrder13.time := Time('20:45')
!insert (individualReservation8, itemOrder13) into ReservationItemOrdered

!new MenuItem('menuItem17')
!menuItem17.description := 'Gourmet Tacos'
!menuItem17.prepTime := 20.0
!menuItem17.classification := #Main

!insert (itemOrder13, menuItem17) into ItemOrderMenuItem
!insert (menuItem17, chef17) into MenuItemChef

!new MenuItem('menuItem18')
!menuItem18.description := 'Spinach Cannelloni'
!menuItem18.prepTime := 35.0
!menuItem18.classification := #Main

!new ItemOrder('itemOrder15')
!itemOrder15.time := Time('20:50')  -- Separate ItemOrder for the second menu item
!insert (individualReservation8, itemOrder15) into ReservationItemOrdered
!insert (itemOrder15, menuItem18) into ItemOrderMenuItem
!insert (menuItem18, chef17) into MenuItemChef

!new MenuItem('menuItem19')
!menuItem19.description := 'Moroccan Tagine'
!menuItem19.prepTime := 45.0
!menuItem19.classification := #Main

!new ItemOrder('itemOrder14')
!itemOrder14.time := Time('18:00')
!insert (banquet10, itemOrder14) into ReservationItemOrdered
!insert (itemOrder14, menuItem19) into ItemOrderMenuItem
!insert (menuItem19, chef17) into MenuItemChef

!new MenuItem('menuItem20')
!menuItem20.description := 'Portuguese Peri Peri Chicken'
!menuItem20.prepTime := 30.0
!menuItem20.classification := #Main

!new ItemOrder('itemOrder16')
!itemOrder16.time := Time('18:05')  -- Separate ItemOrder for the second menu item
!insert (banquet10, itemOrder16) into ReservationItemOrdered
!insert (itemOrder16, menuItem20) into ItemOrderMenuItem
!insert (menuItem20, chef17) into MenuItemChef

!new FoodItem('foodItem30')
!foodItem30.number := 7001
!foodItem30.description := 'Beef'
!foodItem30.purchaseFlag := false
!foodItem30.unit := #Pound  -- Using #Pound as placeholder for Kilograms

!new FoodItem('foodItem31')
!foodItem31.number := 7002
!foodItem31.description := 'Tortillas'
!foodItem31.purchaseFlag := true
!foodItem31.unit := #Dozen  -- Using #Dozen as placeholder for Packs

!new FoodItem('foodItem32')
!foodItem32.number := 7003
!foodItem32.description := 'Avocado'
!foodItem32.purchaseFlag := true
!foodItem32.unit := #Dozen  -- Conforming unit to an available option

!insert (menuItem17, foodItem30) into MenuItemFoodItem
!insert (menuItem17, foodItem31) into MenuItemFoodItem
!insert (menuItem17, foodItem32) into MenuItemFoodItem

!new FoodItem('foodItem33')
!foodItem33.number := 7004
!foodItem33.description := 'Spinach'
!foodItem33.purchaseFlag := true
!foodItem33.unit := #Ounce  -- Using #Ounce as placeholder for Kilograms

!new FoodItem('foodItem34')
!foodItem34.number := 7005
!foodItem34.description := 'Ricotta Cheese'
!foodItem34.purchaseFlag := true
!foodItem34.unit := #Gram

!new FoodItem('foodItem35')
!foodItem35.number := 7006
!foodItem35.description := 'Tomato Sauce'
!foodItem35.purchaseFlag := true
!foodItem35.unit := #Ounce  -- Using #Ounce as placeholder for Liters

!insert (menuItem18, foodItem33) into MenuItemFoodItem
!insert (menuItem18, foodItem34) into MenuItemFoodItem
!insert (menuItem18, foodItem35) into MenuItemFoodItem

!new FoodItem('foodItem36')
!foodItem36.number := 7007
!foodItem36.description := 'Lamb'
!foodItem36.purchaseFlag := false
!foodItem36.unit := #Gram

!new FoodItem('foodItem37')
!foodItem37.number := 7008
!foodItem37.description := 'Apricots'
!foodItem37.purchaseFlag := true
!foodItem37.unit := #Pound  -- Correcting unit to an available placeholder

!new FoodItem('foodItem38')
!foodItem38.number := 7009
!foodItem38.description := 'Almonds'
!foodItem38.purchaseFlag := true
!foodItem38.unit := #Gram

!insert (menuItem19, foodItem36) into MenuItemFoodItem
!insert (menuItem19, foodItem37) into MenuItemFoodItem
!insert (menuItem19, foodItem38) into MenuItemFoodItem

!new FoodItem('foodItem39')
!foodItem39.number := 7010
!foodItem39.description := 'Chicken'
!foodItem39.purchaseFlag := false
!foodItem39.unit := #Pound  -- Using #Pound as placeholder for Kilograms

!new FoodItem('foodItem40')
!foodItem40.number := 7011
!foodItem40.description := 'Peri Peri Sauce'
!foodItem40.purchaseFlag := true
!foodItem40.unit := #Ounce  -- Using #Ounce as available placeholder

!insert (menuItem20, foodItem39) into MenuItemFoodItem
!insert (menuItem20, foodItem40) into MenuItemFoodItem

!new Allergen('allergen17')
!allergen17.type := #Lactose

!new Allergen('allergen18')
!allergen18.type := #Gluten

!insert (foodItem34, allergen17) into FoodItemAllergen
!insert (foodItem31, allergen18) into FoodItemAllergen
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 203 | 0.00% |
| Multiplicities Errors | 2 | 40 | 5.00% |
| Invariants Errors | 1 | 4 | 25.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `BanquetBusDriver':
  Object `busdriver11' of class `BusDriver' is connected to 0 objects of class `Banquet'
  at association end `banquet' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table27' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```

| Invariants Errors | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 11 | 0.00% |
| Phones | 0 | 10 | 0.00% |

## Category edge
```
!new Restaurant('restaurant9')
!restaurant9.name := 'The Global Plate'

!new Owner('owner19')
!owner19.name := 'Marco Zanetti'
!owner19.percentageShares := 40

!new Owner('owner20')
!owner20.name := 'Amara El-Adly'
!owner20.percentageShares := 40

!new Owner('owner21')
!owner21.name := 'Hiro Suzuki'
!owner21.percentageShares := 20

!insert (restaurant9, owner19) into RestaurantOwner
!insert (restaurant9, owner20) into RestaurantOwner
!insert (restaurant9, owner21) into RestaurantOwner

!new Table('table21')
!table21.number := 201
!table21.description := 'VIP Lounge Area'
!table21.capacity := 2

!new Table('table22')
!table22.number := 202
!table22.description := 'High-Profile Deck'
!table22.capacity := 20  -- Adjust to cover the reservation requirement

!new Table('table23')
!table23.number := 203
!table23.description := 'Spacious Dining Hall'
!table23.capacity := 80  -- Adjust to cover the reservation requirement

!new RegularCustomer('customer4')
!customer4.name := 'Carlos Mendoza'
!customer4.prefferedLanguage := #English

!new Chef('chef13')
!chef13.name := 'Georgios Nikolaidis'

!new Cook('cook14')
!cook14.name := 'Akira Tanaka'
!cook14.dateOfBirth := Date('1975-04-10')  -- Dummy date of birth
!cook14.yearsOfExperience := 10

!new Cook('cook15')
!cook15.name := 'Fatima Al-Hassan'
!cook15.dateOfBirth := Date('1982-07-25')  -- Dummy date of birth
!cook15.yearsOfExperience := 8

!insert (chef13, cook14) into ChefCook
!insert (chef13, cook15) into ChefCook

!new Individual('individualReservation6')
!individualReservation6.time := Time('20:00')
!individualReservation6.date := Date('2024-04-22')
!individualReservation6.numberPeople := 1
!individualReservation6.name := 'Samuel Levine'
!individualReservation6.phoneNumber := '+1 212 555 0192'
!individualReservation6.number := 20240422
!individualReservation6.seating := #Inside
!individualReservation6.smoking := #NonSmoking

!insert (restaurant9, individualReservation6) into RestaurantReservation
!insert (individualReservation6, table21) into ReservationTable

!new HeadWaiter('headWaiter8')
!headWaiter8.name := 'Josephine Laurent'
!headWaiter8.dateOfBirth := Date('1989-02-20')  -- Dummy date of birth
!headWaiter8.phoneNumber := '+1 212 555 1234'

!new Waiter('waiter15')
!waiter15.name := 'Andre Federer'
!waiter15.dateOfBirth := Date('1990-11-11')  -- Dummy date of birth
!waiter15.phoneNumber := '+1 212 555 5678'

!new Waiter('waiter16')
!waiter16.name := 'Mei Liu'
!waiter16.dateOfBirth := Date('1992-05-25')  -- Dummy date of birth
!waiter16.phoneNumber := '+1 212 555 8765'

!insert (headWaiter8, waiter15) into HeadWaiterWaiter
!insert (headWaiter8, waiter16) into HeadWaiterWaiter
!insert (individualReservation6, waiter15) into ReservationWaiter

!new ItemOrder('itemOrder8')
!itemOrder8.time := Time('20:15')
!insert (individualReservation6, itemOrder8) into ReservationItemOrdered

!new MenuItem('menuItem12')
!menuItem12.description := 'Mediterranean Delight Salad'
!menuItem12.prepTime := 10.0
!menuItem12.classification := #Apetizer

!insert (itemOrder8, menuItem12) into ItemOrderMenuItem
!insert (menuItem12, chef13) into MenuItemChef

!new FoodItem('foodItem22')
!foodItem22.number := 401
!foodItem22.description := 'Organic Spinach'
!foodItem22.purchaseFlag := true
!foodItem22.unit := #Pound

!insert (menuItem12, foodItem22) into MenuItemFoodItem

!new MenuItem('menuItem13')
!menuItem13.description := 'Miso-Glazed Cod'
!menuItem13.prepTime := 20.0
!menuItem13.classification := #Main

!new ItemOrder('itemOrder9')
!itemOrder9.time := Time('20:30')  -- Creating a new ItemOrder instance for the second menu item
!insert (individualReservation6, itemOrder9) into ReservationItemOrdered
!insert (itemOrder9, menuItem13) into ItemOrderMenuItem
!insert (menuItem13, chef13) into MenuItemChef

!new FoodItem('foodItem23')
!foodItem23.number := 402
!foodItem23.description := 'Fresh Cod'
!foodItem23.purchaseFlag := true
!foodItem23.unit := #Pound

!new Allergen('allergen12')
!allergen12.type := #Seafood

!insert (menuItem13, foodItem23) into MenuItemFoodItem
!insert (foodItem23, allergen12) into FoodItemAllergen

!new Banquet('banquet7')
!banquet7.date := Date('2024-04-23')
!banquet7.time := Time('19:00')
!banquet7.numberPeople := 100
!banquet7.name := 'Noelle Rivera'
!banquet7.phoneNumber := '+33 1 44 55 66 77'
!banquet7.number := 20240423
!banquet7.paymentMethod := #CreditCard
!banquet7.busService := false

!insert (restaurant9, banquet7) into RestaurantReservation
!insert (banquet7, table22) into ReservationTable
!insert (banquet7, table23) into ReservationTable

!insert (banquet7, waiter15) into ReservationWaiter
!insert (banquet7, waiter16) into ReservationWaiter
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 114 | 0.00% |
| Multiplicities Errors | 0 | 24 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 7 | 0.00% |
| Phones | 0 | 5 | 0.00% |

## Category invalid
```
!new Restaurant('restaurant8')
!restaurant8.name := 'The Traditional Inn'

!new Owner('owner17')
!owner17.name := 'Rajesh Patel'
!owner17.percentageShares := 40

!new Owner('owner18')
!owner18.name := 'Emily Rivera'
!owner18.percentageShares := 70

!insert (restaurant8, owner17) into RestaurantOwner
!insert (restaurant8, owner18) into RestaurantOwner

!new Table('table18')
!table18.number := 201
!table18.description := 'Cozy corner table'
!table18.capacity := 2

!new Table('table19')
!table19.number := 202
!table19.description := 'Patio table for an outdoor experience'
!table19.capacity := 0  -- Violates Table::PositiveCapacity invariant

!new Table('table20')
!table20.number := 203
!table20.description := 'Family-sized dining table with a rustic appeal'
!table20.capacity := 8

!new Individual('individualReservation5')
!individualReservation5.time := Time('20:00')
!individualReservation5.date := Date('2023-12-01')
!individualReservation5.numberPeople := 1
!individualReservation5.name := 'Daniel Thompson'
!individualReservation5.phoneNumber := '+1-202-555-0173'
!individualReservation5.number := 1
!individualReservation5.seating := #Inside
!individualReservation5.smoking := #NonSmoking

!insert (restaurant8, individualReservation5) into RestaurantReservation
!insert (individualReservation5, table18) into ReservationTable

!new Waiter('waiter14')
!waiter14.name := 'Lucía Hernández'
!waiter14.dateOfBirth := Date('1995-02-26')
!waiter14.phoneNumber := '+1-202-555-0194'

!insert (individualReservation5, waiter14) into ReservationWaiter

!new HeadWaiter('headWaiter7')
!headWaiter7.name := 'Benji Wong'
!headWaiter7.dateOfBirth := Date('1985-09-10')
!headWaiter7.phoneNumber := '+1-202-555-0235'

!insert (headWaiter7, waiter14) into HeadWaiterWaiter

!new Chef('chef12')
!chef12.name := 'Fatima Amin'
!chef12.dateOfBirth := Date('1983-01-30')
!chef12.phoneNumber := '+1-202-555-0456'

!new Cook('cook13')
!cook13.name := 'Ariella Goldstein'
!cook13.dateOfBirth := Date('1999-10-15')
!cook13.phoneNumber := '+1-202-555-0654'
!cook13.yearsOfExperience := 0  -- Violates Cook::PositiveExperience invariant

!insert (chef12, cook13) into ChefCook
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 2 | 7 | 28.57% |
| Invariants Errors (Not included on General) | 2 | 4 | 50.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table19' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table20' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (3) `Restaurant::TotalOwnerShares': FAILED.
```
```
checking invariant (4) `Table::PositiveCapacity': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 5 | 0.00% |
| Phones | 0 | 5 | 0.00% |

## Generation 2 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 563 | 0.00% |
| Multiplicities Errors | 2 | 100 | 2.00% |
| Invariants Errors | 1 | 16 | 6.25% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `BanquetBusDriver':
  Object `busdriver11' of class `BusDriver' is connected to 0 objects of class `Banquet'
  at association end `banquet' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table27' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```

| Invariants Errors | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 2 | 7 | 28.57% |
| Invariants Errors (Not included on General) | 2 | 4 | 50.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table19' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table20' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (3) `Restaurant::TotalOwnerShares': FAILED.
```
```
checking invariant (4) `Table::PositiveCapacity': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 36 | 0.00% |
| Phones | 0 | 30 | 0.00% |

# Generation 3
## Category baseline
```
!new Restaurant('restaurant11')
!restaurant11.name := 'Casa de Tapas'

!new Owner('owner25')
!owner25.name := 'Juan Torres'
!owner25.percentageShares := 60

!new Owner('owner26')
!owner26.name := 'Carmen Ruiz'
!owner26.percentageShares := 40

!insert (restaurant11, owner25) into RestaurantOwner
!insert (restaurant11, owner26) into RestaurantOwner

!new Table('table25')
!table25.number := 3  -- Using an ordinal form
!table25.description := 'Small private booth with limited view.'
!table25.capacity := 2

!new Table('table26')
!table26.number := 4  -- Using an ordinal form
!table26.description := 'Communal table for larger group gatherings.'
!table26.capacity := 10

!new Individual('individualReservation7')
!individualReservation7.time := Time('20:00')
!individualReservation7.date := Date('2023-10-17')
!individualReservation7.numberPeople := 1
!individualReservation7.name := 'Rashid Khan'
!individualReservation7.phoneNumber := '555-3210'
!individualReservation7.number := 5003
!individualReservation7.seating := #Inside
!individualReservation7.smoking := #NonSmoking

!insert (restaurant11, individualReservation7) into RestaurantReservation
!insert (individualReservation7, table25) into ReservationTable

!new RegularCustomer('customer5')
!customer5.name := 'Rashid Khan'
!customer5.prefferedLanguage := #English

!insert (individualReservation7, customer5) into ReservationCustomer

!new Waiter('waiter19')
!waiter19.name := 'Ana López'
!waiter19.dateOfBirth := Date('1994-01-10')
!waiter19.phoneNumber := '555-4687'

!insert (individualReservation7, waiter19) into ReservationWaiter

!new ItemOrder('itemOrder12')
!itemOrder12.time := Time('20:10')
!insert (individualReservation7, itemOrder12) into ReservationItemOrdered

!new MenuItem('menuItem16')
!menuItem16.description := 'Patatas Bravas'
!menuItem16.prepTime := 12.0
!menuItem16.classification := #Apetizer

!insert (itemOrder12, menuItem16) into ItemOrderMenuItem

!new Chef('chef16')
!chef16.name := 'Luis Martín'
!chef16.dateOfBirth := Date('1987-11-20')
!chef16.phoneNumber := '555-4578'

!insert (menuItem16, chef16) into MenuItemChef

!new Cook('cook18')
!cook18.name := 'Manuel Fernández'
!cook18.dateOfBirth := Date('1979-04-18')
!cook18.phoneNumber := '555-4245'
!cook18.yearsOfExperience := 15

!insert (chef16, cook18) into ChefCook

!new Banquet('banquet9')
!banquet9.date := Date('2023-10-17')
!banquet9.time := Time('21:30')
!banquet9.numberPeople := 9
!banquet9.groupName := 'Salsa Night Crew'
!banquet9.paymentMethod := #CreditCard  -- Using #CreditCard as placeholder for Digital Wallet
!banquet9.busService := true

!insert (restaurant11, banquet9) into RestaurantReservation
!insert (banquet9, table26) into ReservationTable

!insert (banquet9, waiter19) into ReservationWaiter

!new Waiter('waiter20')
!waiter20.name := 'Carlos Ramos'
!waiter20.dateOfBirth := Date('1986-12-25')
!waiter20.phoneNumber := '555-3729'

!insert (banquet9, waiter20) into ReservationWaiter

!new HeadWaiter('headWaiter10')
!headWaiter10.name := 'Marta González'
!headWaiter10.dateOfBirth := Date('1980-09-06')
!headWaiter10.phoneNumber := '555-3896'

!insert (headWaiter10, waiter19) into HeadWaiterWaiter
!insert (headWaiter10, waiter20) into HeadWaiterWaiter

!new BusDriver('busdriver10')
!busdriver10.name := 'Alejandro Peña'
!busdriver10.dateOfBirth := Date('1983-07-14')
!busdriver10.phoneNumber := '555-3975'

!insert (banquet9, busdriver10) into BanquetBusDriver

!new FoodItem('foodItem27')
!foodItem27.number := 6001
!foodItem27.description := 'Potatoes'
!foodItem27.purchaseFlag := true
!foodItem27.unit := #Pound  -- Using #Pound as placeholder for Kg

!new FoodItem('foodItem28')
!foodItem28.number := 6002
!foodItem28.description := 'Aioli Sauce'
!foodItem28.purchaseFlag := false
!foodItem28.unit := #Ounce  -- Using #Ounce as placeholder for Liters

!new Allergen('allergen16')
!allergen16.type := #Lactose  -- Using #Lactose as placeholder for Eggs

!insert (foodItem28, allergen16) into FoodItemAllergen

!new FoodItem('foodItem29')
!foodItem29.number := 6003
!foodItem29.description := 'Tomato Sauce'
!foodItem29.purchaseFlag := true
!foodItem29.unit := #Ounce

!insert (menuItem16, foodItem27) into MenuItemFoodItem
!insert (menuItem16, foodItem28) into MenuItemFoodItem
!insert (menuItem16, foodItem29) into MenuItemFoodItem

!new DietaryRequirement('dietary5')
!dietary5.diet := #Vegan  -- Using #Vegan as placeholder for Vegetarian

!new Manager('manager4')
!manager4.name := 'Pablo Santacruz'
!manager4.dateOfBirth := Date('1973-05-03')
!manager4.phoneNumber := '555-5587'
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 110 | 0.00% |
| Multiplicities Errors | 0 | 21 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 9 | 0.00% |
| Phones | 0 | 8 | 0.00% |

## Category boundary
```
!new Restaurant('restaurant10')
!restaurant10.name := 'Mediterranean Memories Bistro'

!new Owner('owner22')
!owner22.name := 'Sophia Xenides'
!owner22.percentageShares := 40

!new Owner('owner23')
!owner23.name := 'Kostas Pappas'
!owner23.percentageShares := 30

!new Owner('owner24')
!owner24.name := 'Eleni Petrou'
!owner24.percentageShares := 30

!insert (restaurant10, owner22) into RestaurantOwner
!insert (restaurant10, owner23) into RestaurantOwner
!insert (restaurant10, owner24) into RestaurantOwner

!new Table('table24')
!table24.number := 5
!table24.description := 'Sunlit Terrace Long Table'
!table24.capacity := 20

!new Banquet('banquet8')
!banquet8.date := Date('2023-12-24')
!banquet8.time := Time('13:00')
!banquet8.numberPeople := 20
!banquet8.name := 'Papadakis Family Reunion'
!banquet8.phoneNumber := '+30 210 9876543'
!banquet8.number := 20231224
!banquet8.groupName := 'Papadakis Family'
!banquet8.paymentMethod := #Cash
!banquet8.busService := true

!insert (restaurant10, banquet8) into RestaurantReservation
!insert (banquet8, table24) into ReservationTable

!new ItemOrder('itemOrder10')
!itemOrder10.time := Time('13:15')
!insert (banquet8, itemOrder10) into ReservationItemOrdered

!new MenuItem('menuItem14')
!menuItem14.description := 'Grilled Octopus'
!menuItem14.prepTime := 25.0
!menuItem14.classification := #Main

!insert (itemOrder10, menuItem14) into ItemOrderMenuItem
!insert (menuItem14, chef14) into MenuItemChef

!new ItemOrder('itemOrder11')
!itemOrder11.time := Time('13:16')  -- A separate order for the second item
!insert (banquet8, itemOrder11) into ReservationItemOrdered

!new MenuItem('menuItem15')
!menuItem15.description := 'Spanakopita'
!menuItem15.prepTime := 15.0
!menuItem15.classification := #Apetizer

!insert (itemOrder11, menuItem15) into ItemOrderMenuItem

!new Chef('chef14')
!chef14.name := 'Maria Eleftheriou'

!new Chef('chef15')
!chef15.name := 'Nikos Souvlakis'

!insert (menuItem14, chef14) into MenuItemChef
!insert (menuItem15, chef15) into MenuItemChef

!new Cook('cook16')
!cook16.name := 'Thanos Marinakis'
!cook16.dateOfBirth := Date('1980-07-12')
!cook16.yearsOfExperience := 15

!new Cook('cook17')
!cook17.name := 'Demo Cook for Souvlakis'
!cook17.dateOfBirth := Date('1985-01-01')  -- Placeholder date of birth
!cook17.yearsOfExperience := 5  -- Placeholder years of experience

!insert (chef14, cook16) into ChefCook
!insert (chef15, cook17) into ChefCook

!new FoodItem('foodItem24')
!foodItem24.number := 501
!foodItem24.description := 'Octopus'
!foodItem24.purchaseFlag := true
!foodItem24.unit := #Pound  -- Using #Pound as placeholder

!new Allergen('allergen13')
!allergen13.type := #Seafood

!insert (foodItem24, allergen13) into FoodItemAllergen

!new FoodItem('foodItem25')
!foodItem25.number := 502
!foodItem25.description := 'Feta Cheese'
!foodItem25.purchaseFlag := true
!foodItem25.unit := #Dozen  -- Using #Dozen as placeholder for Blocks

!new Allergen('allergen14')
!allergen14.type := #Lactose

!insert (foodItem25, allergen14) into FoodItemAllergen

!new FoodItem('foodItem26')
!foodItem26.number := 503
!foodItem26.description := 'Phyllo Dough'
!foodItem26.purchaseFlag := true
!foodItem26.unit := #Sheet

!new Allergen('allergen15')
!allergen15.type := #Gluten

!insert (foodItem26, allergen15) into FoodItemAllergen

!new HeadWaiter('headWaiter9')
!headWaiter9.name := 'Giorgos Laskaris'
!headWaiter9.dateOfBirth := Date('1978-10-05')
!headWaiter9.phoneNumber := '+30 694 1234567'

!new Waiter('waiter17')
!waiter17.name := 'Mario Spiros'
!waiter17.dateOfBirth := Date('1985-12-14')
!waiter17.phoneNumber := '+30 697 8901234'

!new Waiter('waiter18')
!waiter18.name := 'Eleni Vasilikou'
!waiter18.dateOfBirth := Date('1992-04-03')
!waiter18.phoneNumber := '+30 695 1237890'

!insert (headWaiter9, waiter17) into HeadWaiterWaiter
!insert (headWaiter9, waiter18) into HeadWaiterWaiter
!insert (banquet8, waiter17) into ReservationWaiter
!insert (banquet8, waiter18) into ReservationWaiter

!new BusDriver('busdriver9')
!busdriver9.name := 'Andreas Kostopoulos'
!busdriver9.dateOfBirth := Date('1965-05-19')
!busdriver9.phoneNumber := '+30 699 5678901'

!insert (banquet8, busdriver9) into BanquetBusDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 108 | 0.00% |
| Multiplicities Errors | 0 | 22 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 7 | 0.00% |
| Phones | 0 | 5 | 0.00% |

## Category complex
```
!new Restaurant('restaurant19')
!restaurant19.name := 'Skald\'s Hall'

!new Owner('owner42')
!owner42.name := 'Ingrid Svendsen'
!owner42.percentageShares := 70

!new Owner('owner43')
!owner43.name := 'Erik Johansson'
!owner43.percentageShares := 30

!insert (restaurant19, owner42) into RestaurantOwner
!insert (restaurant19, owner43) into RestaurantOwner

!new RegularCustomer('customer11')
!customer11.name := 'Leif Andersson'
!customer11.prefferedLanguage := #English  -- Using #English as placeholder for Swedish

!new RegularCustomer('customer12')
!customer12.name := 'Bjorn Bergen'
!customer12.prefferedLanguage := #English  -- Using #English as placeholder for Norwegian

!new HeadWaiter('headWaiter18')
!headWaiter18.name := 'Lovisa Nilsen'
!headWaiter18.dateOfBirth := Date('1976-09-19')
!headWaiter18.phoneNumber := '+47 755 667 233'

!new Waiter('waiter38')
!waiter38.name := 'Sanna Olsson'
!waiter38.dateOfBirth := Date('1988-03-22')
!waiter38.phoneNumber := '+47 755 667 211'

!new Waiter('waiter39')
!waiter39.name := 'Elias Hansen'
!waiter39.dateOfBirth := Date('1992-11-09')
!waiter39.phoneNumber := '+47 755 667 199'

!insert (headWaiter18, waiter38) into HeadWaiterWaiter
!insert (headWaiter18, waiter39) into HeadWaiterWaiter

!new Manager('manager7')
!manager7.name := 'Johanna Berg'
!manager7.dateOfBirth := Date('1980-05-10')
!manager7.phoneNumber := '+47 755 667 100'

!new Chef('chef26')
!chef26.name := 'Knut Eriksen'
!chef26.dateOfBirth := Date('1975-07-15')
!chef26.phoneNumber := '+47 755 667 123'

!new Cook('cook32')
!cook32.name := 'Magnus Lars'
!cook32.dateOfBirth := Date('1985-08-08')
!cook32.phoneNumber := '+47 755 667 345'
!cook32.yearsOfExperience := 7

!new Cook('cook33')
!cook33.name := 'Anette Strom'
!cook33.dateOfBirth := Date('1987-12-01')
!cook33.phoneNumber := '+47 755 667 456'
!cook33.yearsOfExperience := 10

!insert (chef26, cook32) into ChefCook
!insert (chef26, cook33) into ChefCook

!new BusDriver('busdriver18')
!busdriver18.name := 'Jens Olesen'
!busdriver18.dateOfBirth := Date('1970-01-29')
!busdriver18.phoneNumber := '+47 755 667 789'

!new Table('table43')
!table43.number := 7
!table43.description := 'Fireplace nook, intimate'
!table43.capacity := 2

!new Table('table44')
!table44.number := 8
!table44.description := 'Heritage tapestry, spacious'
!table44.capacity := 6

!new Table('table45')
!table45.number := 9
!table45.description := 'Grand hall, banquet style'
!table45.capacity := 22  -- Adjust this to ensure the banquet reservation tables' total capacity matches or exceeds the people reserved.

!new Individual('individualReservation13')
!individualReservation13.time := Time('19:45')
!individualReservation13.date := Date('2023-10-25')
!individualReservation13.numberPeople := 1
!individualReservation13.name := 'Leif Andersson'
!individualReservation13.phoneNumber := '+46 555 6789'
!individualReservation13.number := 67890
!individualReservation13.seating := #Inside  -- Using #Inside as placeholder for Fireplace Nook
!individualReservation13.smoking := #NonSmoking

!insert (restaurant19, individualReservation13) into RestaurantReservation
!insert (individualReservation13, table43) into ReservationTable
!insert (individualReservation13, waiter38) into ReservationWaiter

!insert (individualReservation13, customer11) into ReservationCustomer

!new Banquet('banquet16')
!banquet16.date := Date('2023-10-28')
!banquet16.time := Time('16:30')
!banquet16.numberPeople := 20
!banquet16.name := 'Nordic Heritage Celebration'
!banquet16.paymentMethod := #CreditCard  -- Using placeholder for Bank Transfer
!banquet16.busService := true

!insert (restaurant19, banquet16) into RestaurantReservation
!insert (banquet16, table44) into ReservationTable
!insert (banquet16, table45) into ReservationTable

!insert (banquet16, waiter39) into ReservationWaiter
!insert (banquet16, waiter38) into ReservationWaiter

!insert (banquet16, busdriver18) into BanquetBusDriver

!new ItemOrder('itemOrder26')
!itemOrder26.time := Time('20:00')
!insert (individualReservation13, itemOrder26) into ReservationItemOrdered

!new MenuItem('menuItem31')
!menuItem31.description := 'Nordic Smorrebrod'
!menuItem31.prepTime := 15.0
!menuItem31.classification := #Apetizer

!insert (itemOrder26, menuItem31) into ItemOrderMenuItem
!insert (menuItem31, chef26) into MenuItemChef

!new MenuItem('menuItem32')
!menuItem32.description := 'Reindeer Stew'
!menuItem32.prepTime := 40.0
!menuItem32.classification := #Main

!new ItemOrder('itemOrder27')
!itemOrder27.time := Time('20:15')
!insert (individualReservation13, itemOrder27) into ReservationItemOrdered
!insert (itemOrder27, menuItem32) into ItemOrderMenuItem
!insert (menuItem32, chef26) into MenuItemChef

!new ItemOrder('itemOrder28')
!itemOrder28.time := Time('17:00')
!insert (banquet16, itemOrder28) into ReservationItemOrdered

!new MenuItem('menuItem33')
!menuItem33.description := 'Swedish Meatballs'
!menuItem33.prepTime := 25.0
!menuItem33.classification := #Main

!insert (itemOrder28, menuItem33) into ItemOrderMenuItem
!insert (menuItem33, chef26) into MenuItemChef

!new MenuItem('menuItem34')
!menuItem34.description := 'Norwegian Salmon'
!menuItem34.prepTime := 30.0
!menuItem34.classification := #Main

!new ItemOrder('itemOrder29')
!itemOrder29.time := Time('17:15')
!insert (banquet16, itemOrder29) into ReservationItemOrdered
!insert (itemOrder29, menuItem34) into ItemOrderMenuItem
!insert (menuItem34, chef26) into MenuItemChef

!new FoodItem('foodItem54')
!foodItem54.number := 10001
!foodItem54.description := 'Rye Bread'
!foodItem54.purchaseFlag := true
!foodItem54.unit := #Pound  -- Using #Pound as placeholder for Loaves

!new FoodItem('foodItem55')
!foodItem55.number := 10002
!foodItem55.description := 'Cured Meats'
!foodItem55.purchaseFlag := true
!foodItem55.unit := #Gram

!new FoodItem('foodItem56')
!foodItem56.number := 10003
!foodItem56.description := 'Pickled Herring'
!foodItem56.purchaseFlag := true
!foodItem56.unit := #Ounce  -- Using #Ounce as placeholder for Jars

!insert (menuItem31, foodItem54) into MenuItemFoodItem
!insert (menuItem31, foodItem55) into MenuItemFoodItem
!insert (menuItem31, foodItem56) into MenuItemFoodItem

!new FoodItem('foodItem57')
!foodItem57.number := 10004
!foodItem57.description := 'Reindeer Meat'
!foodItem57.purchaseFlag := false
!foodItem57.unit := #Pound  -- Using #Pound as placeholder for Kilograms

!new FoodItem('foodItem58')
!foodItem58.number := 10005
!foodItem58.description := 'Carrots'
!foodItem58.purchaseFlag := true
!foodItem58.unit := #Pound  -- Using #Pound as placeholder for Kilograms

!new FoodItem('foodItem59')
!foodItem59.number := 10006
!foodItem59.description := 'Potatoes'
!foodItem59.purchaseFlag := true
!foodItem59.unit := #Pound  -- Using #Pound as placeholder for Kilograms

!insert (menuItem32, foodItem57) into MenuItemFoodItem
!insert (menuItem32, foodItem58) into MenuItemFoodItem
!insert (menuItem32, foodItem59) into MenuItemFoodItem

!new FoodItem('foodItem60')
!foodItem60.number := 10007
!foodItem60.description := 'Minced Meat'
!foodItem60.purchaseFlag := true
!foodItem60.unit := #Pound  -- Using #Pound as placeholder for Kilograms

!new FoodItem('foodItem61')
!foodItem61.number := 10008
!foodItem61.description := 'Lingonberry'
!foodItem61.purchaseFlag := true
!foodItem61.unit := #Ounce  -- Using #Ounce as placeholder for Jars

!new FoodItem('foodItem62')
!foodItem62.number := 10009
!foodItem62.description := 'Cream'
!foodItem62.purchaseFlag := true
!foodItem62.unit := #Ounce  -- Using #Ounce as placeholder for Liters

!insert (menuItem33, foodItem60) into MenuItemFoodItem
!insert (menuItem33, foodItem61) into MenuItemFoodItem
!insert (menuItem33, foodItem62) into MenuItemFoodItem

!new FoodItem('foodItem63')
!foodItem63.number := 10010
!foodItem63.description := 'Salmon'
!foodItem63.purchaseFlag := false
!foodItem63.unit := #Gram

!new FoodItem('foodItem64')
!foodItem64.number := 10011
!foodItem64.description := 'Dill'
!foodItem64.purchaseFlag := true
!foodItem64.unit := #Dozen  -- Using #Dozen as placeholder for Bunches

!new FoodItem('foodItem65')
!foodItem65.number := 10012
!foodItem65.description := 'Lemon'
!foodItem65.purchaseFlag := true
!foodItem65.unit := #Pound  -- Using #Pound as placeholder

!insert (menuItem34, foodItem63) into MenuItemFoodItem
!insert (menuItem34, foodItem64) into MenuItemFoodItem
!insert (menuItem34, foodItem65) into MenuItemFoodItem

!new Allergen('allergen27')
!allergen27.type := #Lactose  -- Using #Lactose as placeholder for Fish

!new Allergen('allergen28')
!allergen28.type := #Lactose

!insert (foodItem63, allergen27) into FoodItemAllergen
!insert (foodItem62, allergen28) into FoodItemAllergen
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 206 | 0.00% |
| Multiplicities Errors | 0 | 42 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 10 | 0.00% |
| Phones | 0 | 9 | 0.00% |

## Category edge
```
!new Restaurant('restaurant15')
!restaurant15.name := 'Taste of Diversity'

!new Owner('owner32')
!owner32.name := 'Aisha Mbatha'
!owner32.percentageShares := 40

!new Owner('owner33')
!owner33.name := 'Dimitri Ivanov'
!owner33.percentageShares := 35

!new Owner('owner34')
!owner34.name := 'Ling Wei'
!owner34.percentageShares := 25

!insert (restaurant15, owner32) into RestaurantOwner
!insert (restaurant15, owner33) into RestaurantOwner
!insert (restaurant15, owner34) into RestaurantOwner

!new Table('table32')
!table32.number := 301
!table32.description := 'Main Hall Table with Panoramic View'
!table32.capacity := 10

!new Table('table33')
!table33.number := 302
!table33.description := 'Intimate Booth'
!table33.capacity := 3

!new Table('table34')
!table34.number := 303
!table34.description := 'Family Section Table'
!table34.capacity := 6

!new Table('table35')
!table35.number := 304
!table35.description := 'Outdoor Patio Table'
!table35.capacity := 12

!new RegularCustomer('customer8')
!customer8.name := 'Jamal Abdi'
!customer8.prefferedLanguage := #English  -- Using #English as placeholder for Swahili

!new Chef('chef21')
!chef21.name := 'Michela Conti'

!new Cook('cook25')
!cook25.name := 'Gabriel Romero'
!cook25.dateOfBirth := Date('1989-02-15')  -- Dummy date of birth
!cook25.yearsOfExperience := 6

!new Cook('cook26')
!cook26.name := 'Amina Al-Khalili'
!cook26.dateOfBirth := Date('1992-07-11')  -- Dummy date of birth
!cook26.yearsOfExperience := 4

!insert (chef21, cook25) into ChefCook
!insert (chef21, cook26) into ChefCook

!new Individual('individualReservation9')
!individualReservation9.time := Time('19:00')
!individualReservation9.date := Date('2024-03-30')
!individualReservation9.numberPeople := 1
!individualReservation9.name := 'Oliver Green'
!individualReservation9.phoneNumber := '+49 30 800 1234'
!individualReservation9.number := 20240330
!individualReservation9.seating := #Inside  -- Placeholder adapting for Outdoor, as no specific literal is defined
!individualReservation9.smoking := #Smoking

!insert (restaurant15, individualReservation9) into RestaurantReservation
!insert (individualReservation9, table35) into ReservationTable

!new HeadWaiter('headWaiter14')
!headWaiter14.name := 'Salim Khan'
!headWaiter14.dateOfBirth := Date('1979-05-09')  -- Dummy date of birth
!headWaiter14.phoneNumber := '+49 30 1234 5678'  -- Dummy phone number

!new Waiter('waiter29')
!waiter29.name := 'Jasmine Rami'
!waiter29.dateOfBirth := Date('1990-06-21')  -- Dummy date of birth
!waiter29.phoneNumber := '+49 30 2345 6789'  -- Dummy phone number

!new Waiter('waiter30')
!waiter30.name := 'Tarek El-Tayeb'
!waiter30.dateOfBirth := Date('1985-10-12')  -- Dummy date of birth
!waiter30.phoneNumber := '+49 30 3456 7890'  -- Dummy phone number

!new Waiter('waiter31')
!waiter31.name := 'Sofia Novak'
!waiter31.dateOfBirth := Date('1993-01-18')  -- Dummy date of birth
!waiter31.phoneNumber := '+49 30 4567 8901'  -- Dummy phone number

!insert (headWaiter14, waiter29) into HeadWaiterWaiter
!insert (headWaiter14, waiter30) into HeadWaiterWaiter
!insert (headWaiter14, waiter31) into HeadWaiterWaiter
!insert (individualReservation9, waiter29) into ReservationWaiter

!new ItemOrder('itemOrder19')
!itemOrder19.time := Time('19:15')
!insert (individualReservation9, itemOrder19) into ReservationItemOrdered

!new MenuItem('menuItem24')
!menuItem24.description := 'Pacific Rim Sushi'
!menuItem24.prepTime := 20.0
!menuItem24.classification := #Main

!insert (itemOrder19, menuItem24) into ItemOrderMenuItem
!insert (menuItem24, chef21) into MenuItemChef

!new MenuItem('menuItem25')
!menuItem25.description := 'Korean BBQ Short Ribs'
!menuItem25.prepTime := 25.0
!menuItem25.classification := #Main

!new ItemOrder('itemOrder20')
!itemOrder20.time := Time('19:30')  -- Separate ItemOrder for the second menu item
!insert (individualReservation9, itemOrder20) into ReservationItemOrdered
!insert (itemOrder20, menuItem25) into ItemOrderMenuItem
!insert (menuItem25, chef21) into MenuItemChef

!new FoodItem('foodItem44')
!foodItem44.number := 501
!foodItem44.description := 'Sushi-Grade Tuna'
!foodItem44.purchaseFlag := true
!foodItem44.unit := #Pound  -- Using #Pound as placeholder for kg

!insert (menuItem24, foodItem44) into MenuItemFoodItem

!new FoodItem('foodItem45')
!foodItem45.number := 502
!foodItem45.description := 'Beef Short Ribs'
!foodItem45.purchaseFlag := false
!foodItem45.unit := #Pound  -- Using #Pound as placeholder for kg

!insert (menuItem25, foodItem45) into MenuItemFoodItem

!new Banquet('banquet13')
!banquet13.date := Date('2024-03-30')
!banquet13.time := Time('20:30')
!banquet13.numberPeople := 120
!banquet13.name := 'Cultural Exchange Department'
!banquet13.phoneNumber := '+81 3 1234 5678'
!banquet13.number := 20240330
!banquet13.paymentMethod := #CreditCard  -- Placeholder for Wire Transfer
!banquet13.busService := true

!insert (restaurant15, banquet13) into RestaurantReservation

!insert (banquet13, table32) into ReservationTable
!insert (banquet13, table33) into ReservationTable
!insert (banquet13, table34) into ReservationTable
!insert (banquet13, table35) into ReservationTable
!insert (banquet13, waiter30) into ReservationWaiter
!insert (banquet13, waiter31) into ReservationWaiter

!new BusDriver('busdriver13')
!busdriver13.name := 'Yuri Petrov'
!busdriver13.dateOfBirth := Date('1970-02-10')  -- Dummy date of birth
!busdriver13.phoneNumber := '+49 30 5678 1234'  -- Dummy phone number

!new BusDriver('busdriver14')
!busdriver14.name := 'Lëa N\'Dour'
!busdriver14.dateOfBirth := Date('1975-04-19')  -- Dummy date of birth
!busdriver14.phoneNumber := '+49 30 6789 2345'  -- Dummy phone number

!new BusDriver('busdriver15')
!busdriver15.name := 'Thomas Svensson'
!busdriver15.dateOfBirth := Date('1982-09-15')  -- Dummy date of birth
!busdriver15.phoneNumber := '+49 30 7890 3456'  -- Dummy phone number

!insert (banquet13, busdriver13) into BanquetBusDriver
!insert (banquet13, busdriver14) into BanquetBusDriver
!insert (banquet13, busdriver15) into BanquetBusDriver

!new DietaryRequirement('dietary6')
!dietary6.diet := #Vegan  -- Using #Vegan as placeholder for Kosher

!insert (customer8, dietary6) into CustomerDietary

!new Allergen('allergen21')
!allergen21.type := #Lactose  -- Using #Lactose as placeholder for Fish

!new Allergen('allergen22')
!allergen22.type := #Lactose  -- Using #Lactose as placeholder for Sesame

!insert (foodItem44, allergen21) into FoodItemAllergen
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 145 | 0.00% |
| Multiplicities Errors | 1 | 31 | 3.23% |
| Invariants Errors | 1 | 4 | 25.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table35' of class `Table' is connected to 2 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```

| Invariants Errors | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 11 | 0.00% |
| Phones | 0 | 9 | 0.00% |

## Category invalid
```
!new Restaurant('restaurant13')
!restaurant13.name := 'Pop-up Bistro Delight'

!new Owner('owner29')
!owner29.name := 'Yuki Tanaka'
!owner29.percentageShares := 100

!insert (restaurant13, owner29) into RestaurantOwner

!new Table('table30')
!table30.number := 301
!table30.description := 'Elevated stage area with panoramic street view'
!table30.capacity := 5

!new Banquet('banquet11')
!banquet11.date := Date('2023-12-15')
!banquet11.time := Time('12:30')
!banquet11.numberPeople := 30
!banquet11.name := 'Tech Innovators Meetup'
!banquet11.phoneNumber := '+81-3-1234-5678'
!banquet11.number := 20231215
!banquet11.groupName := 'Silicon Summit'
!banquet11.paymentMethod := #Cash
!banquet11.busService := false

!insert (restaurant13, banquet11) into RestaurantReservation
!insert (banquet11, table30) into ReservationTable

!new Waiter('waiter24')
!waiter24.name := 'Anna Müller'
!waiter24.dateOfBirth := Date('1992-11-30')
!waiter24.phoneNumber := '+81-3-9876-5432'

!new Waiter('waiter25')
!waiter25.name := 'Morgan Kim'
!waiter25.dateOfBirth := Date('1994-06-22')
!waiter25.phoneNumber := '+81-3-5555-6789'

!insert (banquet11, waiter24) into ReservationWaiter
!insert (banquet11, waiter25) into ReservationWaiter

!new HeadWaiter('headWaiter12')
!headWaiter12.name := 'Lucas Ferreira'
!headWaiter12.dateOfBirth := Date('1988-08-01')
!headWaiter12.phoneNumber := '+81-3-4444-1122'

!insert (headWaiter12, waiter24) into HeadWaiterWaiter
!insert (headWaiter12, waiter25) into HeadWaiterWaiter

!new MenuItem('menuItem21')
!menuItem21.description := 'Vegan Avocado Sushi'
!menuItem21.prepTime := 10.0
!menuItem21.classification := #Apetizer

!new Chef('chef18')
!chef18.name := 'Noor Al-Farsi'
!chef18.dateOfBirth := Date('1980-04-18')
!chef18.phoneNumber := '+81-3-3333-1221'

!insert (menuItem21, chef18) into MenuItemChef

!new Cook('cook21')
!cook21.name := 'Maxim Smirnov'
!cook21.dateOfBirth := Date('1985-03-17')
!cook21.phoneNumber := '+81-3-1000-4321'
!cook21.yearsOfExperience := 4

!insert (chef18, cook21) into ChefCook

!new ItemOrder('itemOrder17')
!itemOrder17.time := Time('13:00')
!insert (banquet11, itemOrder17) into ReservationItemOrdered
!insert (itemOrder17, menuItem21) into ItemOrderMenuItem

!new RegularCustomer('customer8')
!customer8.name := 'Aiko Nakamura'
!customer8.prefferedLanguage := #English  -- Assuming #Japanese is not defined, using #English as a placeholder

!insert (banquet11, customer8) into ReservationCustomer
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 12 | 0.00% |
| Invariants Errors (Not included on General) | 1 | 4 | 25.00% |

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 6 | 0.00% |
| Phones | 0 | 6 | 0.00% |

## Generation 3 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 630 | 0.00% |
| Multiplicities Errors | 1 | 116 | 0.86% |
| Invariants Errors | 1 | 16 | 6.25% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table35' of class `Table' is connected to 2 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```

| Invariants Errors | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 12 | 0.00% |
| Invariants Errors (Not included on General) | 1 | 4 | 25.00% |

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 43 | 0.00% |
| Phones | 0 | 37 | 0.00% |

# Generation 4
## Category baseline
```
!new Restaurant('restaurant16')
!restaurant16.name := 'The Green Lotus'

!new Owner('owner35')
!owner35.name := 'Mei Wang'
!owner35.percentageShares := 75

!new Owner('owner36')
!owner36.name := 'Aamir Patel'
!owner36.percentageShares := 25

!insert (restaurant16, owner35) into RestaurantOwner
!insert (restaurant16, owner36) into RestaurantOwner

!new Table('table36')
!table36.number := 5
!table36.description := 'Intimate table in the garden area.'
!table36.capacity := 2

!new Table('table37')
!table37.number := 6
!table37.description := 'Large family table under the pergola.'
!table37.capacity := 8

!new RegularCustomer('customer9')
!customer9.name := 'Sofia Ivanov'
!customer9.prefferedLanguage := #English  -- Using #English as placeholder for Russian

!new Individual('individualReservation10')
!individualReservation10.time := Time('19:30')
!individualReservation10.date := Date('2023-10-18')
!individualReservation10.numberPeople := 2
!individualReservation10.name := 'Sofia Ivanov'
!individualReservation10.phoneNumber := '555-7896'
!individualReservation10.number := 7004
!individualReservation10.seating := #Inside  -- Placeholder adapting for Garden, no specific literal
!individualReservation10.smoking := #NonSmoking

!insert (restaurant16, individualReservation10) into RestaurantReservation
!insert (individualReservation10, table36) into ReservationTable

!insert (individualReservation10, customer9) into ReservationCustomer

!new Waiter('waiter32')
!waiter32.name := 'Julian Kim'
!waiter32.dateOfBirth := Date('1995-07-05')
!waiter32.phoneNumber := '555-2341'

!insert (individualReservation10, waiter32) into ReservationWaiter

!new ItemOrder('itemOrder21')
!itemOrder21.time := Time('19:40')
!insert (individualReservation10, itemOrder21) into ReservationItemOrdered

!new MenuItem('menuItem26')
!menuItem26.description := 'Mango Avocado Roll'
!menuItem26.prepTime := 8.0
!menuItem26.classification := #Apetizer

!insert (itemOrder21, menuItem26) into ItemOrderMenuItem

!new Chef('chef22')
!chef22.name := 'Hana Lee'
!chef22.dateOfBirth := Date('1978-06-21')
!chef22.phoneNumber := '555-8776'

!insert (menuItem26, chef22) into MenuItemChef

!new Cook('cook27')
!cook27.name := 'Yuzu Tanaka'
!cook27.dateOfBirth := Date('1982-02-25')
!cook27.phoneNumber := '555-3948'
!cook27.yearsOfExperience := 9

!insert (chef22, cook27) into ChefCook

!new Banquet('banquet14')
!banquet14.date := Date('2023-10-18')
!banquet14.time := Time('18:00')
!banquet14.numberPeople := 8
!banquet14.name := 'Yoga Retreat Reunion'
!banquet14.paymentMethod := #CreditCard  -- Using placeholder for PayPal
!banquet14.busService := false

!insert (restaurant16, banquet14) into RestaurantReservation
!insert (banquet14, table37) into ReservationTable

!insert (banquet14, waiter32) into ReservationWaiter

!new Waiter('waiter33')
!waiter33.name := 'Mia Nguyen'
!waiter33.dateOfBirth := Date('1992-11-19')
!waiter33.phoneNumber := '555-1123'

!insert (banquet14, waiter33) into ReservationWaiter

!new HeadWaiter('headWaiter15')
!headWaiter15.name := 'Anya Mitra'
!headWaiter15.dateOfBirth := Date('1985-03-30')
!headWaiter15.phoneNumber := '555-5582'

!insert (headWaiter15, waiter32) into HeadWaiterWaiter
!insert (headWaiter15, waiter33) into HeadWaiterWaiter

!new FoodItem('foodItem46')
!foodItem46.number := 7001
!foodItem46.description := 'Ripe Mango'
!foodItem46.purchaseFlag := true
!foodItem46.unit := #Pound  -- Using #Pound as placeholder for Kg

!new FoodItem('foodItem47')
!foodItem47.number := 7002
!foodItem47.description := 'Fresh Avocado'
!foodItem47.purchaseFlag := true
!foodItem47.unit := #Pound  -- Using #Pound as placeholder for Pieces

!new FoodItem('foodItem48')
!foodItem48.number := 7003
!foodItem48.description := 'Ginger Soy Sauce'
!foodItem48.purchaseFlag := true
!foodItem48.unit := #Ounce  -- Using #Ounce as placeholder for Liters

!insert (menuItem26, foodItem46) into MenuItemFoodItem
!insert (menuItem26, foodItem47) into MenuItemFoodItem
!insert (menuItem26, foodItem48) into MenuItemFoodItem

!new Allergen('allergen23')
!allergen23.type := #Lactose  -- Using #Lactose as placeholder for Soy

!insert (foodItem48, allergen23) into FoodItemAllergen

!new DietaryRequirement('dietary7')
!dietary7.diet := #Vegan

!insert (customer9, dietary7) into CustomerDietary

!new Manager('manager6')
!manager6.name := 'Daniel Silva'
!manager6.dateOfBirth := Date('1971-08-12')
!manager6.phoneNumber := '555-2367'
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 106 | 0.00% |
| Multiplicities Errors | 0 | 21 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 8 | 0.00% |
| Phones | 0 | 7 | 0.00% |

## Category boundary
```
!new Restaurant('restaurant14')
!restaurant14.name := 'Green Harvest Outdoor Dining'

!new Owner('owner30')
!owner30.name := 'Jamie Thorne'
!owner30.percentageShares := 60

!new Owner('owner31')
!owner31.name := 'Priya Patel'
!owner31.percentageShares := 40

!insert (restaurant14, owner30) into RestaurantOwner
!insert (restaurant14, owner31) into RestaurantOwner

!new Table('table31')
!table31.number := 6
!table31.description := 'Outdoor Vineyard Table'
!table31.capacity := 40

!new Banquet('banquet12')
!banquet12.date := Date('2023-11-15')
!banquet12.time := Time('16:00')
!banquet12.numberPeople := 40
!banquet12.name := 'Eco-Friendly Corporate Retreat'
!banquet12.phoneNumber := '+1 555-0011'
!banquet12.number := 20231115
!banquet12.groupName := 'Sustainable Finance Group'
!banquet12.paymentMethod := #Cash  -- Using #Cash as a placeholder for Direct Bank Transfer
!banquet12.busService := true

!insert (restaurant14, banquet12) into RestaurantReservation
!insert (banquet12, table31) into ReservationTable

!new ItemOrder('itemOrder18.1')
!itemOrder18.1.time := Time('16:20')
!insert (banquet12, itemOrder18.1) into ReservationItemOrdered

!new MenuItem('menuItem22')
!menuItem22.description := 'Grilled Farm Vegetables'
!menuItem22.prepTime := 30.0
!menuItem22.classification := #Main

!insert (itemOrder18.1, menuItem22) into ItemOrderMenuItem

!new ItemOrder('itemOrder18.2')
!itemOrder18.2.time := Time('16:25')
!insert (banquet12, itemOrder18.2) into ReservationItemOrdered

!new MenuItem('menuItem23')
!menuItem23.description := 'Local Cheese Platter'
!menuItem23.prepTime := 10.0
!menuItem23.classification := #Apetizer

!insert (itemOrder18.2, menuItem23) into ItemOrderMenuItem

!new Chef('chef19')
!chef19.name := 'Alice Green'

!new Chef('chef20')
!chef20.name := 'John Meadows'

!insert (menuItem22, chef19) into MenuItemChef
!insert (menuItem23, chef20) into MenuItemChef

!new Cook('cook22')
!cook22.name := 'Ryan Fields'
!cook22.dateOfBirth := Date('1990-09-17')
!cook22.yearsOfExperience := 5

!new Cook('cook23')
!cook23.name := 'Lily Morgan'
!cook23.dateOfBirth := Date('1985-01-05')
!cook23.yearsOfExperience := 10

!insert (chef19, cook22) into ChefCook
!insert (chef19, cook23) into ChefCook

!new Cook('cook24')
!cook24.name := 'Chris Owen'
!cook24.dateOfBirth := Date('1989-08-23')
!cook24.yearsOfExperience := 7

!insert (chef20, cook24) into ChefCook

!new FoodItem('foodItem41')
!foodItem41.number := 8001
!foodItem41.description := 'Zucchini'
!foodItem41.purchaseFlag := false
!foodItem41.unit := #Pound  -- Using #Pound as a placeholder

!new FoodItem('foodItem42')
!foodItem42.number := 8002
!foodItem42.description := 'Local Artisan Cheese'
!foodItem42.purchaseFlag := true
!foodItem42.unit := #Pound  -- Using #Pound as a placeholder

!new Allergen('allergen19')
!allergen19.type := #Lactose

!insert (foodItem42, allergen19) into FoodItemAllergen

!new FoodItem('foodItem43')
!foodItem43.number := 8003
!foodItem43.description := 'Bread'
!foodItem43.purchaseFlag := true
!foodItem43.unit := #Pound  -- Using #Pound as a placeholder

!new Allergen('allergen20')
!allergen20.type := #Gluten

!insert (foodItem43, allergen20) into FoodItemAllergen

!new HeadWaiter('headWaiter13')
!headWaiter13.name := 'Fiona Lewis'
!headWaiter13.dateOfBirth := Date('1988-07-20')
!headWaiter13.phoneNumber := '+1 555-2233'

!new Waiter('waiter26')
!waiter26.name := 'Jordan Summers'
!waiter26.dateOfBirth := Date('1995-05-01')
!waiter26.phoneNumber := '+1 555-3344'

!new Waiter('waiter27')
!waiter27.name := 'Samantha Vaughn'
!waiter27.dateOfBirth := Date('1991-03-23')
!waiter27.phoneNumber := '+1 555-4455'

!new Waiter('waiter28')
!waiter28.name := 'Ethan Walton'
!waiter28.dateOfBirth := Date('1986-10-11')
!waiter28.phoneNumber := '+1 555-5566'

!insert (headWaiter13, waiter26) into HeadWaiterWaiter
!insert (headWaiter13, waiter27) into HeadWaiterWaiter
!insert (headWaiter13, waiter28) into HeadWaiterWaiter
!insert (banquet12, waiter26) into ReservationWaiter
!insert (banquet12, waiter27) into ReservationWaiter
!insert (banquet12, waiter28) into ReservationWaiter

!new BusDriver('busdriver12')
!busdriver12.name := 'Mike Carson'
!busdriver12.dateOfBirth := Date('1972-02-09')
!busdriver12.phoneNumber := '+1 555-6677'

!insert (banquet12, busdriver12) into BanquetBusDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 7 | 111 | 6.31% |
| Multiplicities Errors | 0 | 22 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Syntax Errors | 
|---| 
```
Error: `itemOrder18.1' is not a valid object name
```
```
<input>:line 1:11 mismatched input '.' expecting :=
```
```
<input>:line 1:7 no viable alternative at input '('
```
```
<input>:line 1:7 no viable alternative at input '('
```
```
Error: `itemOrder18.2' is not a valid object name
```
```
<input>:line 1:11 mismatched input '.' expecting :=
```
```
<input>:line 1:7 no viable alternative at input '('
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 9 | 0.00% |
| Phones | 0 | 6 | 0.00% |

## Category complex
```
!new Restaurant('restaurant26')
!restaurant26.name := 'Cultural Tapestry Bistro'

!new Owner('owner58')
!owner58.name := 'Mei Lin'
!owner58.percentageShares := 55

!new Owner('owner59')
!owner59.name := 'Rajiv Patel'
!owner59.percentageShares := 45

!insert (restaurant26, owner58) into RestaurantOwner
!insert (restaurant26, owner59) into RestaurantOwner

!new RegularCustomer('customer18')
!customer18.name := 'Isabella Ricci'
!customer18.prefferedLanguage := #English  -- Using #English as placeholder for Italian

!new RegularCustomer('customer19')
!customer19.name := 'Karim Faheem'
!customer19.prefferedLanguage := #English  -- Using #English as placeholder for Arabic

!new HeadWaiter('headWaiter23')
!headWaiter23.name := 'Sarah Thompson'
!headWaiter23.dateOfBirth := Date('1965-06-02')
!headWaiter23.phoneNumber := '+44 755 667 1010'

!new Waiter('waiter50')
!waiter50.name := 'Oliver Green'
!waiter50.dateOfBirth := Date('1991-02-12')
!waiter50.phoneNumber := '+44 755 667 2221'

!new Waiter('waiter51')
!waiter51.name := 'Nisha Kapoor'
!waiter51.dateOfBirth := Date('1989-04-05')
!waiter51.phoneNumber := '+44 755 667 3331'

!new Waiter('waiter52')
!waiter52.name := 'Lukas Vidal'
!waiter52.dateOfBirth := Date('1986-07-11')
!waiter52.phoneNumber := '+44 755 667 4442'

!insert (headWaiter23, waiter50) into HeadWaiterWaiter
!insert (headWaiter23, waiter51) into HeadWaiterWaiter
!insert (headWaiter23, waiter52) into HeadWaiterWaiter

!new Manager('manager10')
!manager10.name := 'Fiona McAllister'
!manager10.dateOfBirth := Date('1978-12-05')
!manager10.phoneNumber := '+44 755 667 5005'

!new Chef('chef34')
!chef34.name := 'Hiroshi Tanaka'
!chef34.dateOfBirth := Date('1980-08-30')
!chef34.phoneNumber := '+44 755 667 6123'

!new Cook('cook42')
!cook42.name := 'Hugo Moreno'
!cook42.dateOfBirth := Date('1994-11-19')
!cook42.phoneNumber := '+44 755 667 7345'
!cook42.yearsOfExperience := 4

!new Cook('cook43')
!cook43.name := 'Sienna Wu'
!cook43.dateOfBirth := Date('1982-01-22')
!cook43.phoneNumber := '+44 755 667 8541'
!cook43.yearsOfExperience := 11

!insert (chef34, cook42) into ChefCook
!insert (chef34, cook43) into ChefCook

!new BusDriver('busdriver22')
!busdriver22.name := 'Adeel Khan'
!busdriver22.dateOfBirth := Date('1972-03-10')
!busdriver22.phoneNumber := '+44 755 667 9112'

!new Table('table58')
!table58.number := 10
!table58.description := 'Cozy booth by the mural'
!table58.capacity := 4

!new Table('table59')
!table59.number := 11
!table59.description := 'Outdoor terrace, scenic'
!table59.capacity := 6

!new Table('table60')
!table60.number := 12
!table60.description := 'Private room, Art Deco style'
!table60.capacity := 15  -- Adjusting capacity to meet reservation demands

!new Individual('individualReservation19')
!individualReservation19.time := Time('21:00')
!individualReservation19.date := Date('2023-09-30')
!individualReservation19.numberPeople := 2
!individualReservation19.name := 'Isabella Ricci'
!individualReservation19.phoneNumber := '+39 555 2345'
!individualReservation19.number := 98765
!individualReservation19.seating := #Inside  -- Using #Inside as placeholder for Terrace
!individualReservation19.smoking := #NonSmoking

!insert (restaurant26, individualReservation19) into RestaurantReservation
!insert (individualReservation19, table59) into ReservationTable
!insert (individualReservation19, waiter51) into ReservationWaiter

!insert (individualReservation19, customer18) into ReservationCustomer

!new Banquet('banquet23')
!banquet23.date := Date('2023-10-06')
!banquet23.time := Time('15:00')
!banquet23.numberPeople := 15
!banquet23.name := 'Art Lovers Circle'
!banquet23.paymentMethod := #CreditCard  -- Using #CreditCard as placeholder for PayPal
!banquet23.busService := false

!insert (restaurant26, banquet23) into RestaurantReservation
!insert (banquet23, table60) into ReservationTable
!insert (banquet23, busdriver22) into BanquetBusDriver  -- Correct association with the banquet

!insert (banquet23, waiter52) into ReservationWaiter
!insert (banquet23, waiter50) into ReservationWaiter

!new ItemOrder('itemOrder36')
!itemOrder36.time := Time('21:15')
!insert (individualReservation19, itemOrder36) into ReservationItemOrdered

!new MenuItem('menuItem41')
!menuItem41.description := 'Pasta Primavera'
!menuItem41.prepTime := 20.0
!menuItem41.classification := #Main

!insert (itemOrder36, menuItem41) into ItemOrderMenuItem
!insert (menuItem41, chef34) into MenuItemChef

!new MenuItem('menuItem42')
!menuItem42.description := 'Chocolate Fondue'
!menuItem42.prepTime := 15.0
!menuItem42.classification := #Dessert

!new ItemOrder('itemOrder37')
!itemOrder37.time := Time('21:30')  -- Separate ItemOrder for the second menu item
!insert (individualReservation19, itemOrder37) into ReservationItemOrdered
!insert (itemOrder37, menuItem42) into ItemOrderMenuItem
!insert (menuItem42, chef34) into MenuItemChef

!new ItemOrder('itemOrder38')
!itemOrder38.time := Time('15:30')
!insert (banquet23, itemOrder38) into ReservationItemOrdered

!new MenuItem('menuItem43')
!menuItem43.description := 'Falafel Wrap'
!menuItem43.prepTime := 25.0
!menuItem43.classification := #Main

!insert (itemOrder38, menuItem43) into ItemOrderMenuItem
!insert (menuItem43, chef34) into MenuItemChef

!new MenuItem('menuItem44')
!menuItem44.description := 'Mediterranean Paella'
!menuItem44.prepTime := 35.0
!menuItem44.classification := #Main

!new ItemOrder('itemOrder39')
!itemOrder39.time := Time('15:45')  -- Separate ItemOrder for the second menu item
!insert (banquet23, itemOrder39) into ReservationItemOrdered
!insert (itemOrder39, menuItem44) into ItemOrderMenuItem
!insert (menuItem44, chef34) into MenuItemChef

!new FoodItem('foodItem77')
!foodItem77.number := 12001
!foodItem77.description := 'Penne'
!foodItem77.purchaseFlag := true
!foodItem77.unit := #Pound  -- Using #Pound as placeholder for Boxes

!new FoodItem('foodItem78')
!foodItem78.number := 12002
!foodItem78.description := 'Zucchini'
!foodItem78.purchaseFlag := true
!foodItem78.unit := #Pound  -- Using #Pound as placeholder for Kilograms

!new FoodItem('foodItem79')
!foodItem79.number := 12003
!foodItem79.description := 'Bell Pepper'
!foodItem79.purchaseFlag := true
!foodItem79.unit := #Pound  -- Using #Pound as placeholder for Kilograms

!insert (menuItem41, foodItem77) into MenuItemFoodItem
!insert (menuItem41, foodItem78) into MenuItemFoodItem
!insert (menuItem41, foodItem79) into MenuItemFoodItem

!new FoodItem('foodItem80')
!foodItem80.number := 12004
!foodItem80.description := 'Dark Chocolate'
!foodItem80.purchaseFlag := true
!foodItem80.unit := #Pound  -- Using #Pound as placeholder for Kilograms

!new FoodItem('foodItem81')
!foodItem81.number := 12005
!foodItem81.description := 'Strawberries'
!foodItem81.purchaseFlag := true
!foodItem81.unit := #Pound  -- Using #Pound as placeholder for Boxes

!new FoodItem('foodItem82')
!foodItem82.number := 12006
!foodItem82.description := 'Bananas'
!foodItem82.purchaseFlag := true
!foodItem82.unit := #Ounce  -- Using #Ounce as placeholder for Bunches

!insert (menuItem42, foodItem80) into MenuItemFoodItem
!insert (menuItem42, foodItem81) into MenuItemFoodItem
!insert (menuItem42, foodItem82) into MenuItemFoodItem

!new FoodItem('foodItem83')
!foodItem83.number := 12007
!foodItem83.description := 'Falafel'
!foodItem83.purchaseFlag := true
!foodItem83.unit := #Dozen  -- Using #Dozen as placeholder for Pieces

!new FoodItem('foodItem84')
!foodItem84.number := 12008
!foodItem84.description := 'Pita Bread'
!foodItem84.purchaseFlag := true
!foodItem84.unit := #Ounce  -- Using #Ounce as placeholder as no pack literal is defined

!new FoodItem('foodItem85')
!foodItem85.number := 12009
!foodItem85.description := 'Tahini'
!foodItem85.purchaseFlag := true
!foodItem85.unit := #Ounce  -- Using #Ounce as placeholder for Jars

!insert (menuItem43, foodItem83) into MenuItemFoodItem
!insert (menuItem43, foodItem84) into MenuItemFoodItem
!insert (menuItem43, foodItem85) into MenuItemFoodItem

!new FoodItem('foodItem86')
!foodItem86.number := 12010
!foodItem86.description := 'Rice'
!foodItem86.purchaseFlag := true
!foodItem86.unit := #Pound  -- Using #Pound as placeholder for Kilograms

!new FoodItem('foodItem87')
!foodItem87.number := 12011
!foodItem87.description := 'Seafood Mix'
!foodItem87.purchaseFlag := true
!foodItem87.unit := #Pound  -- Using #Pound as placeholder for Kilograms

!new FoodItem('foodItem88')
!foodItem88.number := 12012
!foodItem88.description := 'Saffron'
!foodItem88.purchaseFlag := true
!foodItem88.unit := #Gram

!insert (menuItem44, foodItem86) into MenuItemFoodItem
!insert (menuItem44, foodItem87) into MenuItemFoodItem
!insert (menuItem44, foodItem88) into MenuItemFoodItem

!new Allergen('allergen34')
!allergen34.type := #Lactose  -- Using #Lactose as placeholder for Gluten

!new Allergen('allergen35')
!allergen35.type := #Lactose  -- Using #Lactose as placeholder for Nuts

!insert (foodItem80, allergen34) into FoodItemAllergen
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 209 | 0.00% |
| Multiplicities Errors | 1 | 41 | 2.44% |
| Invariants Errors | 0 | 4 | 0.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table58' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 11 | 0.00% |
| Phones | 0 | 10 | 0.00% |

## Category edge
```
!new Restaurant('restaurant18')
!restaurant18.name := 'Nocturnal Nibbles'

!new Owner('owner40')
!owner40.name := 'Johan De Vries'
!owner40.percentageShares := 50

!new Owner('owner41')
!owner41.name := 'Penelope Turner'
!owner41.percentageShares := 50

!insert (restaurant18, owner40) into RestaurantOwner
!insert (restaurant18, owner41) into RestaurantOwner

!new Table('table39')
!table39.number := 401
!table39.description := 'Night Sky Viewing Balcony'
!table39.capacity := 5

!new Table('table40')
!table40.number := 402
!table40.description := 'Retro Lounge Seating'
!table40.capacity := 4

!new Table('table41')
!table41.number := 403
!table41.description := 'Underground Cellar Nook'
!table41.capacity := 15

!new Table('table42')
!table42.number := 404
!table42.description := 'Fireplace Corner'
!table42.capacity := 40  -- Adjusted to accommodate both reservations comfortably

!new RegularCustomer('customer10')
!customer10.name := 'Natasha Ivanova'
!customer10.prefferedLanguage := #English  -- Using #English as placeholder for Russian

!new Chef('chef25')
!chef25.name := 'Pedro Alvarez'

!new Cook('cook30')
!cook30.name := 'Laila Bennett'
!cook30.dateOfBirth := Date('1992-09-12')  -- Dummy date of birth
!cook30.yearsOfExperience := 3

!new Cook('cook31')
!cook31.name := 'Omar Hassan'
!cook31.dateOfBirth := Date('1985-05-20')  -- Dummy date of birth
!cook31.yearsOfExperience := 9

!insert (chef25, cook30) into ChefCook
!insert (chef25, cook31) into ChefCook

!new Individual('individualReservation12')
!individualReservation12.time := Time('23:00')
!individualReservation12.date := Date('2024-12-31')
!individualReservation12.numberPeople := 1
!individualReservation12.name := 'Alexander Foster'
!individualReservation12.phoneNumber := '+44 20 7946 0958'
!individualReservation12.number := 20241231
!individualReservation12.seating := #Inside
!individualReservation12.smoking := #NonSmoking

!insert (restaurant18, individualReservation12) into RestaurantReservation
!insert (individualReservation12, table40) into ReservationTable

!new HeadWaiter('headWaiter17')
!headWaiter17.name := 'Vivienne Choi'
!headWaiter17.dateOfBirth := Date('1981-07-11')  -- Dummy date of birth
!headWaiter17.phoneNumber := '+44 20 1234 5678'  -- Dummy phone number

!new Waiter('waiter35')
!waiter35.name := 'Carlos Mendes'
!waiter35.dateOfBirth := Date('1987-09-04')  -- Dummy date of birth
!waiter35.phoneNumber := '+44 20 2345 6789'  -- Dummy phone number

!new Waiter('waiter36')
!waiter36.name := 'Haruto Sato'
!waiter36.dateOfBirth := Date('1989-02-25')  -- Dummy date of birth
!waiter36.phoneNumber := '+44 20 3456 7890'  -- Dummy phone number

!new Waiter('waiter37')
!waiter37.name := 'Lydia Clarke'
!waiter37.dateOfBirth := Date('1993-05-18')  -- Dummy date of birth
!waiter37.phoneNumber := '+44 20 4567 8901'  -- Dummy phone number

!insert (headWaiter17, waiter35) into HeadWaiterWaiter
!insert (headWaiter17, waiter36) into HeadWaiterWaiter
!insert (headWaiter17, waiter37) into HeadWaiterWaiter
!insert (individualReservation12, waiter35) into ReservationWaiter

!new ItemOrder('itemOrder24')
!itemOrder24.time := Time('23:30')
!insert (individualReservation12, itemOrder24) into ReservationItemOrdered

!new MenuItem('menuItem29')
!menuItem29.description := 'Lunar Crusted Sea Bass'
!menuItem29.prepTime := 20.0
!menuItem29.classification := #Main

!insert (itemOrder24, menuItem29) into ItemOrderMenuItem
!insert (menuItem29, chef25) into MenuItemChef

!new MenuItem('menuItem30')
!menuItem30.description := 'Dark Chocolate Dream'
!menuItem30.prepTime := 15.0
!menuItem30.classification := #Dessert

!new ItemOrder('itemOrder25')
!itemOrder25.time := Time('23:45')  -- Separate ItemOrder for the second menu item
!insert (individualReservation12, itemOrder25) into ReservationItemOrdered
!insert (itemOrder25, menuItem30) into ItemOrderMenuItem
!insert (menuItem30, chef25) into MenuItemChef

!new FoodItem('foodItem52')
!foodItem52.number := 601
!foodItem52.description := 'Sea Bass Fillet'
!foodItem52.purchaseFlag := true
!foodItem52.unit := #Pound  -- Using #Pound as placeholder for lb

!insert (menuItem29, foodItem52) into MenuItemFoodItem

!new FoodItem('foodItem53')
!foodItem53.number := 602
!foodItem53.description := 'Organic Dark Cocoa'
!foodItem53.purchaseFlag := false
!foodItem53.unit := #Ounce

!insert (menuItem30, foodItem53) into MenuItemFoodItem

!new Banquet('banquet15')
!banquet15.date := Date('2024-12-31')
!banquet15.time := Time('22:00')
!banquet15.numberPeople := 80
!banquet15.name := 'Artistic Events Unlimited'
!banquet15.phoneNumber := '+39 06 8754 1234'
!banquet15.number := 20241231
!banquet15.paymentMethod := #CreditCard  -- Using #CreditCard as placeholder for Direct Bank Deposit
!banquet15.busService := true

!insert (restaurant18, banquet15) into RestaurantReservation
!insert (banquet15, table39) into ReservationTable
!insert (banquet15, table41) into ReservationTable

!insert (banquet15, waiter36) into ReservationWaiter
!insert (banquet15, waiter37) into ReservationWaiter

!new BusDriver('busdriver16')
!busdriver16.name := 'Marcelo Guzman'
!busdriver16.dateOfBirth := Date('1970-11-30')  -- Dummy date of birth
!busdriver16.phoneNumber := '+39 06 1122 3344'  -- Dummy phone number

!new BusDriver('busdriver17')
!busdriver17.name := 'Farah Abbas'
!busdriver17.dateOfBirth := Date('1978-03-14')  -- Dummy date of birth
!busdriver17.phoneNumber := '+39 06 2233 4455'  -- Dummy phone number

!insert (banquet15, busdriver16) into BanquetBusDriver
!insert (banquet15, busdriver17) into BanquetBusDriver

!new DietaryRequirement('dietary8')
!dietary8.diet := #Vegan  -- Using #Vegan as placeholder for Lactose-Free

!insert (individualReservation12, customer10) into ReservationCustomer

!new Allergen('allergen25')
!allergen25.type := #Lactose

!new Allergen('allergen26')
!allergen26.type := #Lactose  -- Using #Lactose as placeholder for Nuts

!insert (foodItem53, allergen26) into FoodItemAllergen
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 134 | 0.00% |
| Multiplicities Errors | 1 | 27 | 3.70% |
| Invariants Errors | 1 | 4 | 25.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table42' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```

| Invariants Errors | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 10 | 0.00% |
| Phones | 0 | 8 | 0.00% |

## Category invalid
```
!new Restaurant('restaurant20')
!restaurant20.name := 'Family Harvest'

!new Owner('owner44')
!owner44.name := 'Miguel Lopez'
!owner44.percentageShares := 65

!new Owner('owner45')
!owner45.name := 'Isabella Lopez'
!owner45.percentageShares := 65

!insert (restaurant20, owner44) into RestaurantOwner
!insert (restaurant20, owner45) into RestaurantOwner

!new Table('table46')
!table46.number := 401
!table46.description := 'Vintage wooden table by the fireplace'
!table46.capacity := 4

!new Table('table47')
!table47.number := 402
!table47.description := 'Long family dining table'
!table47.capacity := 20

!new BusDriver('busdriver19')
!busdriver19.name := 'Juan Sanchez'
!busdriver19.dateOfBirth := Date('1978-05-12')
!busdriver19.phoneNumber := '+34 678-234999'

!new BusDriver('busdriver20')
!busdriver20.name := 'Pedro Alvarez'
!busdriver20.dateOfBirth := Date('1985-09-25')
!busdriver20.phoneNumber := '+34 678-567888'

!new Waiter('waiter40')
!waiter40.name := 'Sophia Davis'
!waiter40.dateOfBirth := Date('1996-04-01')
!waiter40.phoneNumber := '+34 678-101112'

!new Chef('chef27')
!chef27.name := 'Luca Ricci'
!chef27.dateOfBirth := Date('1980-07-07')
!chef27.phoneNumber := '+34 678-222333'

!new Cook('cook34')
!cook34.name := 'Olivia Nunes'
!cook34.dateOfBirth := Date('1992-06-13')
!cook34.phoneNumber := '+34 678-444555'
!cook34.yearsOfExperience := 6

!new RegularCustomer('customer13')
!customer13.name := 'Marie Dubois'
!customer13.prefferedLanguage := #English  -- Using #English as placeholder for French

!new Banquet('banquet17')
!banquet17.date := Date('2023-12-20')
!banquet17.time := Time('18:00')
!banquet17.numberPeople := 25
!banquet17.name := 'Lopez\'s Annual Gathering'
!banquet17.phoneNumber := '+34 678-234567'
!banquet17.number := 20231220
!banquet17.groupName := 'The Lopez Family'
!banquet17.paymentMethod := #CreditCard  -- Using #CreditCard as placeholder for Credit
!banquet17.busService := true

!insert (restaurant20, banquet17) into RestaurantReservation
!insert (banquet17, table47) into ReservationTable

!insert (banquet17, waiter40) into ReservationWaiter

!insert (banquet17, busdriver19) into BanquetBusDriver
!insert (banquet17, busdriver20) into BanquetBusDriver

!new Individual('individualReservation14')
!individualReservation14.time := Time('19:00')
!individualReservation14.date := Date('2023-12-20')
!individualReservation14.numberPeople := 2
!individualReservation14.name := 'Hiro Tanaka'
!individualReservation14.phoneNumber := '+34 678-876543'
!individualReservation14.number := 30231220  -- Adjusted to avoid potential number conflict
!individualReservation14.seating := #Inside  -- Placeholder used for Garden as no specific literal is defined
!individualReservation14.smoking := #Smoking

!insert (restaurant20, individualReservation14) into RestaurantReservation
!insert (individualReservation14, table46) into ReservationTable

!insert (individualReservation14, waiter40) into ReservationWaiter

!insert (individualReservation14, customer13) into ReservationCustomer
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 3 | 11 | 27.27% |
| Invariants Errors (Not included on General) | 2 | 4 | 50.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `ChefCook':
  Object `chef27' of class `Chef' is connected to 0 objects of class `Cook'
  at association end `supervises' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `ChefCook':
  Object `cook34' of class `Cook' is connected to 0 objects of class `Chef'
  at association end `underSupervisionOf' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `HeadWaiterWaiter':
  Object `waiter40' of class `Waiter' is connected to 0 objects of class `HeadWaiter'
  at association end `headWaiter' but the multiplicity is specified as `1'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (3) `Restaurant::TotalOwnerShares': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 7 | 0.00% |
| Phones | 0 | 7 | 0.00% |

## Generation 4 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 7 | 630 | 1.11% |
| Multiplicities Errors | 2 | 111 | 1.80% |
| Invariants Errors | 1 | 16 | 6.25% |

| Syntax Errors | 
|---| 
```
Error: `itemOrder18.1' is not a valid object name
```
```
<input>:line 1:11 mismatched input '.' expecting :=
```
```
<input>:line 1:7 no viable alternative at input '('
```
```
<input>:line 1:7 no viable alternative at input '('
```
```
Error: `itemOrder18.2' is not a valid object name
```
```
<input>:line 1:11 mismatched input '.' expecting :=
```
```
<input>:line 1:7 no viable alternative at input '('
```

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table58' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table42' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```

| Invariants Errors | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 3 | 11 | 27.27% |
| Invariants Errors (Not included on General) | 2 | 4 | 50.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `ChefCook':
  Object `chef27' of class `Chef' is connected to 0 objects of class `Cook'
  at association end `supervises' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `ChefCook':
  Object `cook34' of class `Cook' is connected to 0 objects of class `Chef'
  at association end `underSupervisionOf' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `HeadWaiterWaiter':
  Object `waiter40' of class `Waiter' is connected to 0 objects of class `HeadWaiter'
  at association end `headWaiter' but the multiplicity is specified as `1'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (3) `Restaurant::TotalOwnerShares': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 45 | 0.00% |
| Phones | 0 | 38 | 0.00% |

# Generation 5
## Category baseline
```
!new Restaurant('restaurant22')
!restaurant22.name := 'El Tazón Dorado'

!new Owner('owner49')
!owner49.name := 'Marta Hernandez'
!owner49.percentageShares := 40

!new Owner('owner50')
!owner50.name := 'Diego Torres'
!owner50.percentageShares := 30

!new Owner('owner51')
!owner51.name := 'Isabel Perez'
!owner51.percentageShares := 30

!insert (restaurant22, owner49) into RestaurantOwner
!insert (restaurant22, owner50) into RestaurantOwner
!insert (restaurant22, owner51) into RestaurantOwner

!new Table('table49')
!table49.number := 7
!table49.description := 'Enclosed family-style seating.'
!table49.capacity := 6

!new Table('table50')
!table50.number := 8
!table50.description := 'Outdoor patio seating with a view of the street parade.'
!table50.capacity := 4

!new RegularCustomer('customer14')
!customer14.name := 'Priya Kapoor'
!customer14.prefferedLanguage := #English  -- Using #English as placeholder for Hindi

!new Waiter('waiter42')
!waiter42.name := 'Ricardo Navarro'
!waiter42.dateOfBirth := Date('1990-12-15')
!waiter42.phoneNumber := '555-6650'

!new Individual('individualReservation15')
!individualReservation15.time := Time('13:00')
!individualReservation15.date := Date('2023-10-19')
!individualReservation15.numberPeople := 1
!individualReservation15.name := 'Priya Kapoor'
!individualReservation15.phoneNumber := '555-9055'
!individualReservation15.number := 9005
!individualReservation15.seating := #Inside  -- Using #Inside as a placeholder for Patio
!individualReservation15.smoking := #NonSmoking

!insert (restaurant22, individualReservation15) into RestaurantReservation
!insert (individualReservation15, table50) into ReservationTable
!insert (individualReservation15, waiter42) into ReservationWaiter

!insert (individualReservation15, customer14) into ReservationCustomer

!new MenuItem('menuItem37')
!menuItem37.description := 'Churros con Chocolate'
!menuItem37.prepTime := 10.0
!menuItem37.classification := #Dessert

!new Chef('chef30')
!chef30.name := 'Lucia Alvarez'
!chef30.dateOfBirth := Date('1968-04-07')
!chef30.phoneNumber := '555-2100'

!new Cook('cook37')
!cook37.name := 'Emilio Vargas'
!cook37.dateOfBirth := Date('1975-09-22')
!cook37.phoneNumber := '555-4849'
!cook37.yearsOfExperience := 20

!insert (menuItem37, chef30) into MenuItemChef
!insert (chef30, cook37) into ChefCook

!new ItemOrder('itemOrder32')
!itemOrder32.time := Time('13:10')
!insert (individualReservation15, itemOrder32) into ReservationItemOrdered
!insert (itemOrder32, menuItem37) into ItemOrderMenuItem

!new Banquet('banquet19')
!banquet19.date := Date('2023-10-19')
!banquet19.time := Time('14:30')
!banquet19.numberPeople := 5
!banquet19.name := 'Art Exhibition Team'
!banquet19.paymentMethod := #CreditCard  -- Placeholder for Bank Transfer
!banquet19.busService := false

!insert (restaurant22, banquet19) into RestaurantReservation
!insert (banquet19, table49) into ReservationTable

!new Waiter('waiter43')
!waiter43.name := 'Clara Morales'
!waiter43.dateOfBirth := Date('1992-11-01')
!waiter43.phoneNumber := '555-9934'

!insert (banquet19, waiter42) into ReservationWaiter
!insert (banquet19, waiter43) into ReservationWaiter

!new HeadWaiter('headWaiter20')
!headWaiter20.name := 'Fernando Iglesias'
!headWaiter20.dateOfBirth := Date('1983-03-11')
!headWaiter20.phoneNumber := '555-7766'

!insert (headWaiter20, waiter42) into HeadWaiterWaiter
!insert (headWaiter20, waiter43) into HeadWaiterWaiter

!new FoodItem('foodItem69')
!foodItem69.number := 9001
!foodItem69.description := 'All-purpose flour'
!foodItem69.purchaseFlag := true
!foodItem69.unit := #Pound  -- Using #Pound as placeholder for Kg

!new FoodItem('foodItem70')
!foodItem70.number := 9002
!foodItem70.description := 'Dark Chocolate Sauce'
!foodItem70.purchaseFlag := true
!foodItem70.unit := #Ounce  -- Using #Ounce as placeholder for Liters

!new FoodItem('foodItem71')
!foodItem71.number := 9003
!foodItem71.description := 'Mixed cinnamon and sugar'
!foodItem71.purchaseFlag := true
!foodItem71.unit := #Gram

!insert (menuItem37, foodItem69) into MenuItemFoodItem
!insert (menuItem37, foodItem70) into MenuItemFoodItem
!insert (menuItem37, foodItem71) into MenuItemFoodItem

!new Allergen('allergen29')
!allergen29.type := #Gluten

!new Allergen('allergen30')
!allergen30.type := #Lactose

!insert (foodItem69, allergen29) into FoodItemAllergen
!insert (foodItem70, allergen30) into FoodItemAllergen

!new DietaryRequirement('dietary9')
!dietary9.diet := #Vegan  -- Using #Vegan as placeholder for Nut-Free

!new Manager('manager8')
!manager8.name := 'Javier Cortez'
!manager8.dateOfBirth := Date('1965-02-08')
!manager8.phoneNumber := '555-3257'
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 112 | 0.00% |
| Multiplicities Errors | 0 | 22 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 8 | 0.00% |
| Phones | 0 | 7 | 0.00% |

## Category boundary
```
!new Restaurant('restaurant17')
!restaurant17.name := 'Sky High Elegance'

!new Owner('owner37')
!owner37.name := 'Isabella Martinez'
!owner37.percentageShares := 45

!new Owner('owner38')
!owner38.name := 'Thomas Elliott'
!owner38.percentageShares := 40

!new Owner('owner39')
!owner39.name := 'Chen Wei'
!owner39.percentageShares := 15

!insert (restaurant17, owner37) into RestaurantOwner
!insert (restaurant17, owner38) into RestaurantOwner
!insert (restaurant17, owner39) into RestaurantOwner

!new Table('table38')
!table38.number := 10
!table38.description := 'Private Rooftop View'
!table38.capacity := 2

!new Individual('individualReservation11')
!individualReservation11.time := Time('20:00')
!individualReservation11.date := Date('2023-09-30')
!individualReservation11.numberPeople := 1
!individualReservation11.name := 'Ava Thompson'
!individualReservation11.phoneNumber := '+44 701 234 5678'
!individualReservation11.number := 2023093002
!individualReservation11.seating := #Inside  -- Using #Inside as placeholder for VIP
!individualReservation11.smoking := #NonSmoking

!insert (restaurant17, individualReservation11) into RestaurantReservation
!insert (individualReservation11, table38) into ReservationTable

!new HeadWaiter('headWaiter16')
!headWaiter16.name := 'Oliver James'
!headWaiter16.dateOfBirth := Date('1982-11-08')
!headWaiter16.phoneNumber := '+44 701 345 6789'

!new Waiter('waiter34')
!waiter34.name := 'Lucy Carter'
!waiter34.dateOfBirth := Date('1990-02-12')
!waiter34.phoneNumber := '+44 701 456 7890'

!insert (headWaiter16, waiter34) into HeadWaiterWaiter
!insert (individualReservation11, waiter34) into ReservationWaiter

!new ItemOrder('itemOrder22')
!itemOrder22.time := Time('20:15')
!insert (individualReservation11, itemOrder22) into ReservationItemOrdered

!new MenuItem('menuItem27')
!menuItem27.description := 'Truffle Risotto'
!menuItem27.prepTime := 30.0
!menuItem27.classification := #Main

!insert (itemOrder22, menuItem27) into ItemOrderMenuItem

!new MenuItem('menuItem28')
!menuItem28.description := 'Filet Mignon'
!menuItem28.prepTime := 25.0
!menuItem28.classification := #Main

!new ItemOrder('itemOrder23')
!itemOrder23.time := Time('20:25')  -- Separate ItemOrder for the second menu item
!insert (individualReservation11, itemOrder23) into ReservationItemOrdered
!insert (itemOrder23, menuItem28) into ItemOrderMenuItem

!new Chef('chef23')
!chef23.name := 'Giorgio Russo'

!new Chef('chef24')
!chef24.name := 'Sophie Beaumont'

!insert (menuItem27, chef23) into MenuItemChef
!insert (menuItem28, chef24) into MenuItemChef

!new Cook('cook28')
!cook28.name := 'Marco Bellini'
!cook28.dateOfBirth := Date('1985-11-21')
!cook28.yearsOfExperience := 12

!new Cook('cook29')
!cook29.name := 'Alessandro Bianchi'  -- Dummy cook for chef24
!cook29.dateOfBirth := Date('1990-03-15') -- Dummy date of birth
!cook29.yearsOfExperience := 8  -- Dummy years of experience

!insert (chef23, cook28) into ChefCook
!insert (chef24, cook29) into ChefCook

!new FoodItem('foodItem49')
!foodItem49.number := 9001
!foodItem49.description := 'Black Truffles'
!foodItem49.purchaseFlag := true
!foodItem49.unit := #Ounce

!insert (menuItem27, foodItem49) into MenuItemFoodItem

!new FoodItem('foodItem50')
!foodItem50.number := 9002
!foodItem50.description := 'Cream'
!foodItem50.purchaseFlag := true
!foodItem50.unit := #Ounce  -- Using #Ounce as placeholder for Liters

!new Allergen('allergen24')
!allergen24.type := #Lactose

!insert (foodItem50, allergen24) into FoodItemAllergen

!new FoodItem('foodItem51')
!foodItem51.number := 9003
!foodItem51.description := 'Beef Filet'
!foodItem51.purchaseFlag := true
!foodItem51.unit := #Pound  -- Using #Pound as placeholder for Kilograms

!insert (menuItem28, foodItem51) into MenuItemFoodItem
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 91 | 0.00% |
| Multiplicities Errors | 0 | 18 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 5 | 0.00% |
| Phones | 0 | 3 | 0.00% |

## Category complex
```
!new Restaurant('restaurant29')
!restaurant29.name := 'Ultimate Spice Pavilion'

!new Owner('owner65')
!owner65.name := 'Maria Gonzalez'
!owner65.percentageShares := 45

!new Owner('owner66')
!owner66.name := 'Hassan Al-Majid'
!owner66.percentageShares := 30

!new Owner('owner67')
!owner67.name := 'Petra Novak'
!owner67.percentageShares := 25

!insert (restaurant29, owner65) into RestaurantOwner
!insert (restaurant29, owner66) into RestaurantOwner
!insert (restaurant29, owner67) into RestaurantOwner

!new RegularCustomer('customer22')
!customer22.name := 'Zhen Wei'
!customer22.prefferedLanguage := #English  -- Using #English as placeholder for Mandarin

!new RegularCustomer('customer23')
!customer23.name := 'Amina Bashir'
!customer23.prefferedLanguage := #English  -- Using #English as placeholder for Swahili

!new HeadWaiter('headWaiter25')
!headWaiter25.name := 'Lucas Wright'
!headWaiter25.dateOfBirth := Date('1978-11-05')
!headWaiter25.phoneNumber := '+27 555 789 0012'

!new Waiter('waiter57')
!waiter57.name := 'Sizwe Nkosi'
!waiter57.dateOfBirth := Date('1990-07-19')
!waiter57.phoneNumber := '+27 555 789 2345'

!new Waiter('waiter58')
!waiter58.name := 'Yasmin Farah'
!waiter58.dateOfBirth := Date('1985-09-27')
!waiter58.phoneNumber := '+27 555 789 9988'

!insert (headWaiter25, waiter57) into HeadWaiterWaiter
!insert (headWaiter25, waiter58) into HeadWaiterWaiter

!new Manager('manager11')
!manager11.name := 'Rajesh Iyer'
!manager11.dateOfBirth := Date('1972-02-15')
!manager11.phoneNumber := '+27 555 789 3200'

!new Chef('chef37')
!chef37.name := 'Elena Kozlova'
!chef37.dateOfBirth := Date('1988-05-03')
!chef37.phoneNumber := '+27 555 789 7564'

!new Cook('cook47')
!cook47.name := 'Omar Idris'
!cook47.dateOfBirth := Date('1993-04-11')
!cook47.phoneNumber := '+27 555 789 8743'
!cook47.yearsOfExperience := 6

!new Cook('cook48')
!cook48.name := 'Sophia Dubois'
!cook48.dateOfBirth := Date('1987-10-18')
!cook48.phoneNumber := '+27 555 789 9832'
!cook48.yearsOfExperience := 8

!insert (chef37, cook47) into ChefCook
!insert (chef37, cook48) into ChefCook

!new BusDriver('busdriver28')
!busdriver28.name := 'Vusi Dlamini'
!busdriver28.dateOfBirth := Date('1980-06-11')
!busdriver28.phoneNumber := '+27 555 789 4455'

!new Table('table67')
!table67.number := 13
!table67.description := 'Traditional woven mats, low seating'
!table67.capacity := 8

!new Table('table68')
!table68.number := 14
!table68.description := 'Sleek modern, adjustable lighting'
!table68.capacity := 15  -- Adjusting capacity to cover banquet needs

!new Table('table69')
!table69.number := 15
!table69.description := 'Central fountain, open seating'
!table69.capacity := 20  -- Adjusting capacity to cover banquet needs

!new Individual('individualReservation22')
!individualReservation22.time := Time('18:45')
!individualReservation22.date := Date('2023-11-05')
!individualReservation22.numberPeople := 1
!individualReservation22.name := 'Zhen Wei'
!individualReservation22.phoneNumber := '+86 555 5432'
!individualReservation22.number := 11223
!individualReservation22.seating := #Inside  -- Using #Inside as placeholder for Low Seating
!individualReservation22.smoking := #NonSmoking

!insert (restaurant29, individualReservation22) into RestaurantReservation
!insert (individualReservation22, table67) into ReservationTable
!insert (individualReservation22, waiter57) into ReservationWaiter

!insert (individualReservation22, customer22) into ReservationCustomer

!new Banquet('banquet26')
!banquet26.date := Date('2023-12-01')
!banquet26.time := Time('17:00')
!banquet26.numberPeople := 25
!banquet26.name := 'Spice Enthusiasts Conference'
!banquet26.paymentMethod := #CreditCard  -- Using #CreditCard as placeholder for Cryptocurrency
!banquet26.busService := true

!insert (restaurant29, banquet26) into RestaurantReservation
!insert (banquet26, table68) into ReservationTable
!insert (banquet26, table69) into ReservationTable
!insert (banquet26, busdriver28) into BanquetBusDriver

!insert (banquet26, waiter58) into ReservationWaiter
!insert (banquet26, waiter57) into ReservationWaiter  -- Use another waiter instead of head waiter

!new ItemOrder('itemOrder42')
!itemOrder42.time := Time('19:00')
!insert (individualReservation22, itemOrder42) into ReservationItemOrdered

!new MenuItem('menuItem47')
!menuItem47.description := 'Sichuan Stir-Fry'
!menuItem47.prepTime := 20.0
!menuItem47.classification := #Main

!insert (itemOrder42, menuItem47) into ItemOrderMenuItem
!insert (menuItem47, chef37) into MenuItemChef

!new MenuItem('menuItem48')
!menuItem48.description := 'Mango Sticky Rice'
!menuItem48.prepTime := 25.0
!menuItem48.classification := #Dessert

!new ItemOrder('itemOrder43')
!itemOrder43.time := Time('19:15')  -- Separate ItemOrder for the second menu item
!insert (individualReservation22, itemOrder43) into ReservationItemOrdered
!insert (itemOrder43, menuItem48) into ItemOrderMenuItem
!insert (menuItem48, chef37) into MenuItemChef

!new ItemOrder('itemOrder44')
!itemOrder44.time := Time('17:30')
!insert (banquet26, itemOrder44) into ReservationItemOrdered

!new MenuItem('menuItem49')
!menuItem49.description := 'Jollof Rice'
!menuItem49.prepTime := 30.0
!menuItem49.classification := #Main

!insert (itemOrder44, menuItem49) into ItemOrderMenuItem
!insert (menuItem49, chef37) into MenuItemChef

!new MenuItem('menuItem50')
!menuItem50.description := 'Spicy Lamb Tagine'
!menuItem50.prepTime := 40.0
!menuItem50.classification := #Main

!new ItemOrder('itemOrder45')
!itemOrder45.time := Time('17:45')  -- Separate ItemOrder for the second menu item
!insert (banquet26, itemOrder45) into ReservationItemOrdered
!insert (itemOrder45, menuItem50) into ItemOrderMenuItem
!insert (menuItem50, chef37) into MenuItemChef

!new FoodItem('foodItem91')
!foodItem91.number := 13001
!foodItem91.description := 'Chicken'
!foodItem91.purchaseFlag := false
!foodItem91.unit := #Pound  -- Using #Pound as placeholder for Kg

!new FoodItem('foodItem92')
!foodItem92.number := 13002
!foodItem92.description := 'Sichuan Peppers'
!foodItem92.purchaseFlag := true
!foodItem92.unit := #Gram

!new FoodItem('foodItem93')
!foodItem93.number := 13003
!foodItem93.description := 'Bell Peppers'
!foodItem93.purchaseFlag := true
!foodItem93.unit := #Pound  -- Using #Pound as placeholder for Kg

!insert (menuItem47, foodItem91) into MenuItemFoodItem
!insert (menuItem47, foodItem92) into MenuItemFoodItem
!insert (menuItem47, foodItem93) into MenuItemFoodItem

!new FoodItem('foodItem94')
!foodItem94.number := 13004
!foodItem94.description := 'Sticky Rice'
!foodItem94.purchaseFlag := true
!foodItem94.unit := #Pound  -- Using #Pound as placeholder for Kg

!new FoodItem('foodItem95')
!foodItem95.number := 13005
!foodItem95.description := 'Mango'
!foodItem95.purchaseFlag := true
!foodItem95.unit := #Ounce  -- Using #Ounce as flexible descriptor for Pieces

!new FoodItem('foodItem96')
!foodItem96.number := 13006
!foodItem96.description := 'Coconut Milk'
!foodItem96.purchaseFlag := true
!foodItem96.unit := #Ounce  -- Using #Ounce as placeholder for Liters

!insert (menuItem48, foodItem94) into MenuItemFoodItem
!insert (menuItem48, foodItem95) into MenuItemFoodItem
!insert (menuItem48, foodItem96) into MenuItemFoodItem

!new FoodItem('foodItem97')
!foodItem97.number := 13007
!foodItem97.description := 'Rice'
!foodItem97.purchaseFlag := true
!foodItem97.unit := #Pound  -- Using #Pound as placeholder for Kg

!new FoodItem('foodItem98')
!foodItem98.number := 13008
!foodItem98.description := 'Tomatoes'
!foodItem98.purchaseFlag := true
!foodItem98.unit := #Pound  -- Using #Pound as placeholder for Kg

!new FoodItem('foodItem99')
!foodItem99.number := 13009
!foodItem99.description := 'Spices Mix'
!foodItem99.purchaseFlag := true
!foodItem99.unit := #Gram

!insert (menuItem49, foodItem97) into MenuItemFoodItem
!insert (menuItem49, foodItem98) into MenuItemFoodItem
!insert (menuItem49, foodItem99) into MenuItemFoodItem

!new FoodItem('foodItem100')
!foodItem100.number := 13010
!foodItem100.description := 'Lamb'
!foodItem100.purchaseFlag := false
!foodItem100.unit := #Pound  -- Using #Pound as placeholder for Kg

!new FoodItem('foodItem101')
!foodItem101.number := 13011
!foodItem101.description := 'Hot Spices'
!foodItem101.purchaseFlag := true
!foodItem101.unit := #Gram

!new FoodItem('foodItem102')
!foodItem102.number := 13012
!foodItem102.description := 'Dates'
!foodItem102.purchaseFlag := true
!foodItem102.unit := #Ounce  -- Using #Ounce as flexible descriptor for Pieces

!insert (menuItem50, foodItem100) into MenuItemFoodItem
!insert (menuItem50, foodItem101) into MenuItemFoodItem
!insert (menuItem50, foodItem102) into MenuItemFoodItem

!new Allergen('allergen38')
!allergen38.type := #Lactose  -- Using #Lactose as placeholder for Soy

!new Allergen('allergen39')
!allergen39.type := #Lactose  -- Using #Lactose as placeholder for Tree Nuts

!insert (foodItem91, allergen38) into FoodItemAllergen
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 209 | 0.00% |
| Multiplicities Errors | 0 | 42 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 10 | 0.00% |
| Phones | 0 | 9 | 0.00% |

## Category edge
```
!new Restaurant('restaurant23')
!restaurant23.name := 'Silent Savories'

!new Owner('owner52')
!owner52.name := 'Isabella Castillo'
!owner52.percentageShares := 60

!new Owner('owner53')
!owner53.name := 'Mei Lin'
!owner53.percentageShares := 40

!insert (restaurant23, owner52) into RestaurantOwner
!insert (restaurant23, owner53) into RestaurantOwner

!new Table('table51')
!table51.number := 501
!table51.description := 'Quiet Garden View'
!table51.capacity := 6

!new Table('table52')
!table52.number := 502
!table52.description := 'Basement Lounge'
!table52.capacity := 40  -- Adjusted to accommodate the banquet reservation needs

!new Table('table53')
!table53.number := 503
!table53.description := 'VIP Private Alcove'
!table53.capacity := 2

!new RegularCustomer('customer15')
!customer15.name := 'Sahil Gupta'
!customer15.prefferedLanguage := #English  -- Using #English as placeholder for Hindi

!new Chef('chef31')
!chef31.name := 'Anjali Kapoor'

!new Cook('cook38')
!cook38.name := 'Michael O\'Reilly'
!cook38.dateOfBirth := Date('1981-06-12')  -- Dummy date of birth
!cook38.yearsOfExperience := 12

!new Cook('cook39')
!cook39.name := 'Tasha Bynum'
!cook39.dateOfBirth := Date('1995-08-09')  -- Dummy date of birth
!cook39.yearsOfExperience := 5

!insert (chef31, cook38) into ChefCook
!insert (chef31, cook39) into ChefCook

!new Individual('individualReservation16')
!individualReservation16.time := Time('19:30')
!individualReservation16.date := Date('2024-04-19')
!individualReservation16.numberPeople := 1
!individualReservation16.name := 'Claire Petit'
!individualReservation16.phoneNumber := '+33 1 64 78 90 12'
!individualReservation16.number := 20240419
!individualReservation16.seating := #Inside
!individualReservation16.smoking := #NonSmoking

!insert (restaurant23, individualReservation16) into RestaurantReservation
!insert (individualReservation16, table53) into ReservationTable

!new HeadWaiter('headWaiter21')
!headWaiter21.name := 'Rafael Kim'
!headWaiter21.dateOfBirth := Date('1983-02-10')  -- Dummy date of birth
!headWaiter21.phoneNumber := '+44 20 1234 5678'  -- Dummy phone number

!new Waiter('waiter44')
!waiter44.name := 'Carla Sanchez'
!waiter44.dateOfBirth := Date('1992-04-20')  -- Dummy date of birth
!waiter44.phoneNumber := '+44 20 2345 6789'  -- Dummy phone number

!new Waiter('waiter45')
!waiter45.name := 'Yuki Tanaka'
!waiter45.dateOfBirth := Date('1989-07-15')  -- Dummy date of birth
!waiter45.phoneNumber := '+44 20 3456 7890'  -- Dummy phone number

!new Waiter('waiter46')
!waiter46.name := 'Adwoa Boateng'
!waiter46.dateOfBirth := Date('1991-11-11')  -- Dummy date of birth
!waiter46.phoneNumber := '+44 20 4567 8901'  -- Dummy phone number

!insert (headWaiter21, waiter44) into HeadWaiterWaiter
!insert (headWaiter21, waiter45) into HeadWaiterWaiter
!insert (headWaiter21, waiter46) into HeadWaiterWaiter
!insert (individualReservation16, waiter44) into ReservationWaiter

!new ItemOrder('itemOrder33')
!itemOrder33.time := Time('19:45')
!insert (individualReservation16, itemOrder33) into ReservationItemOrdered

!new MenuItem('menuItem38')
!menuItem38.description := 'Gourmet Vegetable Tart'
!menuItem38.prepTime := 20.0
!menuItem38.classification := #Main

!insert (itemOrder33, menuItem38) into ItemOrderMenuItem

!new MenuItem('menuItem39')
!menuItem39.description := 'Truffle Mushroom Risotto'
!menuItem39.prepTime := 30.0
!menuItem39.classification := #Main

!new ItemOrder('itemOrder34')
!itemOrder34.time := Time('20:00')  -- Separate ItemOrder for the second menu item
!insert (individualReservation16, itemOrder34) into ReservationItemOrdered
!insert (itemOrder34, menuItem39) into ItemOrderMenuItem

!insert (menuItem38, chef31) into MenuItemChef
!insert (menuItem39, chef31) into MenuItemChef

!new FoodItem('foodItem72')
!foodItem72.number := 701
!foodItem72.description := 'Porcini Mushrooms'
!foodItem72.purchaseFlag := true
!foodItem72.unit := #Gram

!new FoodItem('foodItem73')
!foodItem73.number := 702
!foodItem73.description := 'Fresh Herb Mix'
!foodItem73.purchaseFlag := false
!foodItem73.unit := #Dozen  -- Using #Dozen as placeholder for Bunches

!insert (menuItem39, foodItem72) into MenuItemFoodItem
!insert (menuItem39, foodItem73) into MenuItemFoodItem

!new Banquet('banquet20')
!banquet20.date := Date('2024-04-19')
!banquet20.time := Time('20:00')
!banquet20.numberPeople := 60
!banquet20.name := 'Art & Peace Foundation'
!banquet20.phoneNumber := '+49 30 5555 1234'
!banquet20.number := 20240419
!banquet20.paymentMethod := #CreditCard  -- Using #CreditCard as placeholder for Crypto Payment
!banquet20.busService := false

!insert (restaurant23, banquet20) into RestaurantReservation
!insert (banquet20, table52) into ReservationTable

!insert (banquet20, waiter45) into ReservationWaiter
!insert (banquet20, waiter46) into ReservationWaiter

!new DietaryRequirement('dietary10')
!dietary10.diet := #Vegan  -- Using #Vegan as placeholder for Vegetarian

!new Allergen('allergen31')
!allergen31.type := #Lactose  -- Using #Lactose as placeholder for Egg

!new Allergen('allergen32')
!allergen32.type := #Lactose  -- Using #Lactose as placeholder for Tree nuts

!insert (foodItem72, allergen31) into FoodItemAllergen
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 118 | 0.00% |
| Multiplicities Errors | 1 | 23 | 4.35% |
| Invariants Errors | 1 | 4 | 25.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table51' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```

| Invariants Errors | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 8 | 0.00% |
| Phones | 0 | 6 | 0.00% |

## Category invalid
```
!new Restaurant('restaurant24')
!restaurant24.name := 'Elegant Essence'

!new Owner('owner54')
!owner54.name := 'Carla Mendes'
!owner54.percentageShares := 80

!new Owner('owner55')
!owner55.name := 'Ethan Cooper'
!owner55.percentageShares := 40

!insert (restaurant24, owner54) into RestaurantOwner
!insert (restaurant24, owner55) into RestaurantOwner

!new Table('table54')
!table54.number := 501
!table54.description := 'Exclusive private booth with velvet seats'
!table54.capacity := 2

!new Table('table55')
!table55.number := 502
!table55.description := 'Elegant long table for large gatherings'
!table55.capacity := 50

!new Waiter('waiter47')
!waiter47.name := 'Liam Chan'
!waiter47.dateOfBirth := Date('1991-12-11')
!waiter47.phoneNumber := '+46 70-112-3344'

!new Chef('chef32')
!chef32.name := 'Maya Patel'
!chef32.dateOfBirth := Date('1979-02-20')
!chef32.phoneNumber := '+46 70-445-6677'

!new Cook('cook40')
!cook40.name := 'Eva Berg'
!cook40.dateOfBirth := Date('1993-03-19')
!cook40.phoneNumber := '+46 70-889-0011'
!cook40.yearsOfExperience := 5

!insert (chef32, cook40) into ChefCook

!new RegularCustomer('customer16')
!customer16.name := 'Johann Müller'
!customer16.prefferedLanguage := #English  -- Using #English as placeholder for German

!new Individual('individualReservation17')
!individualReservation17.time := Time('20:00')
!individualReservation17.date := Date('2023-12-31')
!individualReservation17.numberPeople := 3
!individualReservation17.name := 'Nadia Johansson'
!individualReservation17.phoneNumber := '+46 70-345-6789'
!individualReservation17.number := 20231231
!individualReservation17.seating := #Inside
!individualReservation17.smoking := #NonSmoking

!insert (restaurant24, individualReservation17) into RestaurantReservation
!insert (individualReservation17, table54) into ReservationTable

!insert (individualReservation17, waiter47) into ReservationWaiter

!insert (individualReservation17, customer16) into ReservationCustomer

!new Banquet('banquet21')
!banquet21.date := Date('2023-12-31')
!banquet21.time := Time('22:00')
!banquet21.numberPeople := 100
!banquet21.name := 'Corporate Gala'
!banquet21.phoneNumber := '+46 70-987-6543'
!banquet21.number := 20231231
!banquet21.groupName := 'Global Ventures Inc.'
!banquet21.paymentMethod := #CreditCard  -- Using #CreditCard as placeholder for Bank Transfer
!banquet21.busService := false

!insert (restaurant24, banquet21) into RestaurantReservation
!insert (banquet21, table55) into ReservationTable

!insert (banquet21, waiter47) into ReservationWaiter
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 10 | 10.00% |
| Invariants Errors (Not included on General) | 2 | 4 | 50.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `HeadWaiterWaiter':
  Object `waiter47' of class `Waiter' is connected to 0 objects of class `HeadWaiter'
  at association end `headWaiter' but the multiplicity is specified as `1'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (3) `Restaurant::TotalOwnerShares': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 5 | 0.00% |
| Phones | 0 | 5 | 0.00% |

## Generation 5 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 591 | 0.00% |
| Multiplicities Errors | 1 | 105 | 0.95% |
| Invariants Errors | 1 | 16 | 6.25% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table51' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```

| Invariants Errors | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 10 | 10.00% |
| Invariants Errors (Not included on General) | 2 | 4 | 50.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `HeadWaiterWaiter':
  Object `waiter47' of class `Waiter' is connected to 0 objects of class `HeadWaiter'
  at association end `headWaiter' but the multiplicity is specified as `1'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (3) `Restaurant::TotalOwnerShares': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 36 | 0.00% |
| Phones | 0 | 30 | 0.00% |

# Generation 6
## Category baseline
```
!new Restaurant('restaurant25')
!restaurant25.name := 'Ocean Breeze Bistro'

!new Owner('owner56')
!owner56.name := 'Emily Collins'
!owner56.percentageShares := 50

!new Owner('owner57')
!owner57.name := 'Liam Johnson'
!owner57.percentageShares := 50

!insert (restaurant25, owner56) into RestaurantOwner
!insert (restaurant25, owner57) into RestaurantOwner

!new Table('table56')
!table56.number := 9
!table56.description := 'Seaside table for enjoying ocean views.'
!table56.capacity := 2

!new Table('table57')
!table57.number := 10
!table57.description := 'Spacious round table under the pergola.'
!table57.capacity := 8

!new RegularCustomer('customer17')
!customer17.name := 'Noah Kim'
!customer17.prefferedLanguage := #English  -- Using #English as placeholder for Korean

!new Waiter('waiter48')
!waiter48.name := 'Eliza Reed'
!waiter48.dateOfBirth := Date('1989-05-19')
!waiter48.phoneNumber := '555-7652'

!new Individual('individualReservation18')
!individualReservation18.time := Time('17:00')
!individualReservation18.date := Date('2023-10-20')
!individualReservation18.numberPeople := 2
!individualReservation18.name := 'Noah Kim'
!individualReservation18.phoneNumber := '555-4890'
!individualReservation18.number := 11006
!individualReservation18.seating := #Inside  -- Using #Inside as placeholder for Ocean View
!individualReservation18.smoking := #NonSmoking

!insert (restaurant25, individualReservation18) into RestaurantReservation
!insert (individualReservation18, table56) into ReservationTable
!insert (individualReservation18, waiter48) into ReservationWaiter

!insert (individualReservation18, customer17) into ReservationCustomer

!new MenuItem('menuItem40')
!menuItem40.description := 'Grilled Salmon with Lemon-Herb Sauce'
!menuItem40.prepTime := 20.0
!menuItem40.classification := #Main

!new Chef('chef33')
!chef33.name := 'Oliver Tran'
!chef33.dateOfBirth := Date('1979-11-08')
!chef33.phoneNumber := '555-2012'

!new Cook('cook41')
!cook41.name := 'Hannah Blake'
!cook41.dateOfBirth := Date('1983-01-15')
!cook41.phoneNumber := '555-4941'
!cook41.yearsOfExperience := 8

!insert (menuItem40, chef33) into MenuItemChef
!insert (chef33, cook41) into ChefCook

!new ItemOrder('itemOrder35')
!itemOrder35.time := Time('17:15')
!insert (individualReservation18, itemOrder35) into ReservationItemOrdered
!insert (itemOrder35, menuItem40) into ItemOrderMenuItem

!new Banquet('banquet22')
!banquet22.date := Date('2023-10-20')
!banquet22.time := Time('19:00')
!banquet22.numberPeople := 7
!banquet22.name := 'Sunset Yoga Group'
!banquet22.paymentMethod := #CreditCard
!banquet22.busService := true

!insert (restaurant25, banquet22) into RestaurantReservation
!insert (banquet22, table57) into ReservationTable

!new Waiter('waiter49')
!waiter49.name := 'Mark Stewart'
!waiter49.dateOfBirth := Date('1991-02-25')
!waiter49.phoneNumber := '555-6643'

!insert (banquet22, waiter48) into ReservationWaiter
!insert (banquet22, waiter49) into ReservationWaiter

!new HeadWaiter('headWaiter22')
!headWaiter22.name := 'Isabella Moore'
!headWaiter22.dateOfBirth := Date('1977-09-23')
!headWaiter22.phoneNumber := '555-3372'

!insert (headWaiter22, waiter48) into HeadWaiterWaiter
!insert (headWaiter22, waiter49) into HeadWaiterWaiter

!new BusDriver('busdriver21')
!busdriver21.name := 'Tom Gardner'
!busdriver21.dateOfBirth := Date('1981-08-10')
!busdriver21.phoneNumber := '555-8365'

!insert (banquet22, busdriver21) into BanquetBusDriver

!new FoodItem('foodItem74')
!foodItem74.number := 11001
!foodItem74.description := 'Atlantic salmon fillet'
!foodItem74.purchaseFlag := true
!foodItem74.unit := #Kilogram  -- Using a placeholder as the UML definition might need specific enumeration

!new FoodItem('foodItem75')
!foodItem75.number := 11002
!foodItem75.description := 'Fresh lemons'
!foodItem75.purchaseFlag := true
!foodItem75.unit := #Ounce  -- Using #Ounce as a nuanced placeholder

!new FoodItem('foodItem76')
!foodItem76.number := 11003
!foodItem76.description := 'Assorted herbs for seasoning'
!foodItem76.purchaseFlag := true
!foodItem76.unit := #Gram

!insert (menuItem40, foodItem74) into MenuItemFoodItem
!insert (menuItem40, foodItem75) into MenuItemFoodItem
!insert (menuItem40, foodItem76) into MenuItemFoodItem

!new Allergen('allergen33')
!allergen33.type := #Lactose  -- Using #Lactose as placeholder for Fish due to lack of specific literals

!insert (foodItem74, allergen33) into FoodItemAllergen

!new DietaryRequirement('dietary11')
!dietary11.diet := #Vegan  -- Using #Vegan as placeholder for Pescatarian

!new Manager('manager9')
!manager9.name := 'Sophia Kelly'
!manager9.dateOfBirth := Date('1975-03-17')
!manager9.phoneNumber := '555-7461'
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 1 | 110 | 0.91% |
| Multiplicities Errors | 0 | 21 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Syntax Errors | 
|---| 
```
<input>:1:0: generation of expression `#Kilogram' failed, with following error:
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 9 | 0.00% |
| Phones | 0 | 8 | 0.00% |

## Category boundary
```
!new Restaurant('restaurant21')
!restaurant21.name := 'Cultured Kitchen Studio'

!new Owner('owner46')
!owner46.name := 'Anjali Mehta'
!owner46.percentageShares := 50

!new Owner('owner47')
!owner47.name := 'David Yi'
!owner47.percentageShares := 30

!new Owner('owner48')
!owner48.name := 'Maria Silva'
!owner48.percentageShares := 20

!insert (restaurant21, owner46) into RestaurantOwner
!insert (restaurant21, owner47) into RestaurantOwner
!insert (restaurant21, owner48) into RestaurantOwner

!new Table('table48')
!table48.number := 7
!table48.description := 'Communal Teaching Table'
!table48.capacity := 15

!new Banquet('banquet18')
!banquet18.date := Date('2023-11-08')
!banquet18.time := Time('18:00')
!banquet18.numberPeople := 15
!banquet18.name := 'Local Veggie Lovers Club'
!banquet18.phoneNumber := '+1 555-9089'
!banquet18.number := 2023110804
!banquet18.groupName := 'Green Gourmet Society'
!banquet18.paymentMethod := #CreditCard  -- Using #CreditCard as placeholder for PayPal
!banquet18.busService := false

!insert (restaurant21, banquet18) into RestaurantReservation
!insert (banquet18, table48) into ReservationTable

!new ItemOrder('itemOrder30')
!itemOrder30.time := Time('18:20')
!insert (banquet18, itemOrder30) into ReservationItemOrdered

!new MenuItem('menuItem35')
!menuItem35.description := 'Stuffed Bell Peppers'
!menuItem35.prepTime := 35.0
!menuItem35.classification := #Main

!new ItemOrder('itemOrder31')
!itemOrder31.time := Time('18:25')  -- Separate ItemOrder for the second menu item
!insert (banquet18, itemOrder31) into ReservationItemOrdered

!new MenuItem('menuItem36')
!menuItem36.description := 'Chickpea Salad'
!menuItem36.prepTime := 15.0
!menuItem36.classification := #Apetizer

!insert (itemOrder30, menuItem35) into ItemOrderMenuItem
!insert (itemOrder31, menuItem36) into ItemOrderMenuItem

!new Chef('chef28')
!chef28.name := 'Nina Kapur'

!new Chef('chef29')
!chef29.name := 'Carlos Rivera'

!insert (menuItem35, chef28) into MenuItemChef
!insert (menuItem36, chef29) into MenuItemChef

!new Cook('cook35')
!cook35.name := 'Priya Shah'
!cook35.dateOfBirth := Date('1988-03-01')
!cook35.yearsOfExperience := 9

!insert (chef28, cook35) into ChefCook

!new Cook('cook36')  -- Associate a cook for the second chef
!cook36.name := 'James Lee'
!cook36.dateOfBirth := Date('1990-11-11')  -- Dummy date of birth
!cook36.yearsOfExperience := 5  -- Dummy years of experience

!insert (chef29, cook36) into ChefCook

!new FoodItem('foodItem66')
!foodItem66.number := 11001
!foodItem66.description := 'Bell Peppers'
!foodItem66.purchaseFlag := true
!foodItem66.unit := #Pound  -- Using #Pound as placeholder for Boxes

!new FoodItem('foodItem67')
!foodItem67.number := 11002
!foodItem67.description := 'Chickpeas'
!foodItem67.purchaseFlag := true
!foodItem67.unit := #Pound  -- Using #Pound as placeholder for Cans

!new FoodItem('foodItem68')
!foodItem68.number := 11003
!foodItem68.description := 'Olive Oil'
!foodItem68.purchaseFlag := true
!foodItem68.unit := #Ounce  -- Using #Ounce as placeholder for Bottles

!insert (menuItem35, foodItem66) into MenuItemFoodItem
!insert (menuItem36, foodItem67) into MenuItemFoodItem
!insert (menuItem36, foodItem68) into MenuItemFoodItem

!new HeadWaiter('headWaiter19')
!headWaiter19.name := 'Lucas Thompson'
!headWaiter19.dateOfBirth := Date('1990-07-22')
!headWaiter19.phoneNumber := '+1 555-7788'

!new Waiter('waiter41')
!waiter41.name := 'Emma Johnson'
!waiter41.dateOfBirth := Date('1993-12-03')
!waiter41.phoneNumber := '+1 555-8899'

!insert (headWaiter19, waiter41) into HeadWaiterWaiter
!insert (banquet18, waiter41) into ReservationWaiter
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 90 | 0.00% |
| Multiplicities Errors | 0 | 18 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 5 | 0.00% |
| Phones | 0 | 3 | 0.00% |

## Category complex
```
!new Restaurant('restaurant30')
!restaurant30.name := 'Harmony Lodge Gourmet Retreat'

!new Owner('owner68')
!owner68.name := 'Samuel Johnson'
!owner68.percentageShares := 35

!new Owner('owner69')
!owner69.name := 'Niamh O'Sullivan'
!owner69.percentageShares := 35

!new Owner('owner70')
!owner70.name := 'Lee Chang'
!owner70.percentageShares := 30

!insert (restaurant30, owner68) into RestaurantOwner
!insert (restaurant30, owner69) into RestaurantOwner
!insert (restaurant30, owner70) into RestaurantOwner

!new RegularCustomer('customer24')
!customer24.name := 'Jean-Paul Laurent'
!customer24.prefferedLanguage := #English  -- Using #English as placeholder for French

!new RegularCustomer('customer25')
!customer25.name := 'Lillian Ng'
!customer25.prefferedLanguage := #English  -- Using #English as placeholder for Cantonese

!new HeadWaiter('headWaiter26')
!headWaiter26.name := 'Anton Boskovic'
!headWaiter26.dateOfBirth := Date('1970-03-01')
!headWaiter26.phoneNumber := '+61 555 234 9876'

!new Waiter('waiter59')
!waiter59.name := 'Chloe Edwards'
!waiter59.dateOfBirth := Date('1992-05-18')
!waiter59.phoneNumber := '+61 555 234 1212'

!new Waiter('waiter60')
!waiter60.name := 'Akeem Olufemi'
!waiter60.dateOfBirth := Date('1987-11-22')
!waiter60.phoneNumber := '+61 555 234 3434'

!insert (headWaiter26, waiter59) into HeadWaiterWaiter
!insert (headWaiter26, waiter60) into HeadWaiterWaiter

!new Manager('manager12')
!manager12.name := 'Fatima Rahman'
!manager12.dateOfBirth := Date('1980-02-28')
!manager12.phoneNumber := '+61 555 234 5656'

!new Chef('chef38')
!chef38.name := 'Katarina Milosevic'
!chef38.dateOfBirth := Date('1976-10-10')
!chef38.phoneNumber := '+61 555 234 7878'

!new Cook('cook49')
!cook49.name := 'Yusuke Tanaka'
!cook49.dateOfBirth := Date('1988-12-05')
!cook49.phoneNumber := '+61 555 234 9090'
!cook49.yearsOfExperience := 9

!new Cook('cook50')
!cook50.name := 'Brenda Kealoha'
!cook50.dateOfBirth := Date('1985-08-28')
!cook50.phoneNumber := '+61 555 234 8080'
!cook50.yearsOfExperience := 12

!insert (chef38, cook49) into ChefCook
!insert (chef38, cook50) into ChefCook

!new BusDriver('busdriver29')
!busdriver29.name := 'Carlos Silva'
!busdriver29.dateOfBirth := Date('1973-04-14')
!busdriver29.phoneNumber := '+61 555 234 6767'

!new Table('table70')
!table70.number := 16
!table70.description := 'Elevated view, enclosed by glass'
!table70.capacity := 6

!new Table('table71')
!table71.number := 17
!table71.description := 'Rustic log seating, outdoor'
!table71.capacity := 4

!new Table('table72')
!table72.number := 18
!table72.description := 'Near waterfall, secluded'
!table72.capacity := 10

!new Individual('individualReservation23')
!individualReservation23.time := Time('13:00')
!individualReservation23.date := Date('2024-01-10')
!individualReservation23.numberPeople := 3
!individualReservation23.name := 'Jean-Paul Laurent'
!individualReservation23.phoneNumber := '+33 555 4567'
!individualReservation23.number := 34987
!individualReservation23.seating := #Inside  -- Using #Inside as placeholder for Enclosed
!individualReservation23.smoking := #NonSmoking

!insert (restaurant30, individualReservation23) into RestaurantReservation
!insert (individualReservation23, table70) into ReservationTable
!insert (individualReservation23, waiter59) into ReservationWaiter

!insert (individualReservation23, customer24) into ReservationCustomer

!new Banquet('banquet27')
!banquet27.date := Date('2024-01-15')
!banquet27.time := Time('11:30')
!banquet27.numberPeople := 20
!banquet27.name := 'Nature\'s Epicureans Club'
!banquet27.paymentMethod := #CreditCard  -- Using #CreditCard as placeholder for Bank Transfer
!banquet27.busService := true

!insert (restaurant30, banquet27) into RestaurantReservation
!insert (banquet27, table71) into ReservationTable
!insert (banquet27, table72) into ReservationTable
!insert (banquet27, busdriver29) into BanquetBusDriver

!insert (banquet27, waiter60) into ReservationWaiter
!insert (banquet27, waiter59) into ReservationWaiter

!new ItemOrder('itemOrder46')
!itemOrder46.time := Time('13:15')
!insert (individualReservation23, itemOrder46) into ReservationItemOrdered

!new MenuItem('menuItem51')
!menuItem51.description := 'Truffled Risotto'
!menuItem51.prepTime := 30.0
!menuItem51.classification := #Main

!insert (itemOrder46, menuItem51) into ItemOrderMenuItem
!insert (menuItem51, chef38) into MenuItemChef

!new MenuItem('menuItem52')
!menuItem52.description := 'Lemon Tart'
!menuItem52.prepTime := 45.0
!menuItem52.classification := #Dessert

!new ItemOrder('itemOrder47')
!itemOrder47.time := Time('13:30')  -- Separate ItemOrder for the second menu item
!insert (individualReservation23, itemOrder47) into ReservationItemOrdered
!insert (itemOrder47, menuItem52) into ItemOrderMenuItem
!insert (menuItem52, chef38) into MenuItemChef

!new ItemOrder('itemOrder48')
!itemOrder48.time := Time('12:00')
!insert (banquet27, itemOrder48) into ReservationItemOrdered

!new MenuItem('menuItem53')
!menuItem53.description := 'Grilled Barramundi'
!menuItem53.prepTime := 25.0
!menuItem53.classification := #Main

!insert (itemOrder48, menuItem53) into ItemOrderMenuItem
!insert (menuItem53, chef38) into MenuItemChef

!new MenuItem('menuItem54')
!menuItem54.description := 'Heirloom Tomato Salad'
!menuItem54.prepTime := 15.0
!menuItem54.classification := #Main  -- Using #Main as placeholder

!new ItemOrder('itemOrder49')
!itemOrder49.time := Time('12:15')  -- Separate ItemOrder for the second menu item
!insert (banquet27, itemOrder49) into ReservationItemOrdered
!insert (itemOrder49, menuItem54) into ItemOrderMenuItem
!insert (menuItem54, chef38) into MenuItemChef

!new FoodItem('foodItem103')
!foodItem103.number := 14001
!foodItem103.description := 'Arborio Rice'
!foodItem103.purchaseFlag := true
!foodItem103.unit := #Pound  -- Using #Pound as placeholder for Kilograms

!new FoodItem('foodItem104')
!foodItem104.number := 14002
!foodItem104.description := 'Black Truffle'
!foodItem104.purchaseFlag := true
!foodItem104.unit := #Gram

!new FoodItem('foodItem105')
!foodItem105.number := 14003
!foodItem105.description := 'Parmesan Cheese'
!foodItem105.purchaseFlag := true
!foodItem105.unit := #Gram

!insert (menuItem51, foodItem103) into MenuItemFoodItem
!insert (menuItem51, foodItem104) into MenuItemFoodItem
!insert (menuItem51, foodItem105) into MenuItemFoodItem

!new FoodItem('foodItem106')
!foodItem106.number := 14004
!foodItem106.description := 'Lemons'
!foodItem106.purchaseFlag := true
!foodItem106.unit := #Ounce  -- Using #Ounce as flexible descriptor for Pieces

!new FoodItem('foodItem107')
!foodItem107.number := 14005
!foodItem107.description := 'Flour'
!foodItem107.purchaseFlag := true
!foodItem107.unit := #Pound  -- Using #Pound as placeholder for Kilograms

!new FoodItem('foodItem108')
!foodItem108.number := 14006
!foodItem108.description := 'Butter'
!foodItem108.purchaseFlag := true
!foodItem108.unit := #Pound  -- Using #Pound as placeholder for Kilograms

!insert (menuItem52, foodItem106) into MenuItemFoodItem
!insert (menuItem52, foodItem107) into MenuItemFoodItem
!insert (menuItem52, foodItem108) into MenuItemFoodItem

!new FoodItem('foodItem109')
!foodItem109.number := 14007
!foodItem109.description := 'Barramundi'
!foodItem109.purchaseFlag := false
!foodItem109.unit := #Pound  -- Using #Pound as placeholder for Kilograms

!new FoodItem('foodItem110')
!foodItem110.number := 14008
!foodItem110.description := 'Mixed Herbs'
!foodItem110.purchaseFlag := true
!foodItem110.unit := #Gram

!new FoodItem('foodItem111')
!foodItem111.number := 14009
!foodItem111.description := 'Olive Oil'
!foodItem111.purchaseFlag := true
!foodItem111.unit := #Ounce  -- Using #Ounce as placeholder for Liters

!insert (menuItem53, foodItem109) into MenuItemFoodItem
!insert (menuItem53, foodItem110) into MenuItemFoodItem
!insert (menuItem53, foodItem111) into MenuItemFoodItem

!new FoodItem('foodItem112')
!foodItem112.number := 14010
!foodItem112.description := 'Tomatoes'
!foodItem112.purchaseFlag := true
!foodItem112.unit := #Pound  -- Using #Pound as placeholder for Kilograms

!new FoodItem('foodItem113')
!foodItem113.number := 14011
!foodItem113.description := 'Basil'
!foodItem113.purchaseFlag := true
!foodItem113.unit := #Ounce  -- Using #Ounce as placeholder for Bunches

!new FoodItem('foodItem114')
!foodItem114.number := 14012
!foodItem114.description := 'Balsamic Vinegar'
!foodItem114.purchaseFlag := true
!foodItem114.unit := #Ounce  -- Using #Ounce as placeholder for Liters

!insert (menuItem54, foodItem112) into MenuItemFoodItem
!insert (menuItem54, foodItem113) into MenuItemFoodItem
!insert (menuItem54, foodItem114) into MenuItemFoodItem

!new Allergen('allergen40')
!allergen40.type := #Lactose  -- Using #Lactose as placeholder for Dairy

!new Allergen('allergen41')
!allergen41.type := #Lactose  -- Using #Lactose as placeholder for Gluten

!insert (foodItem107, allergen41) into FoodItemAllergen
!insert (foodItem108, allergen40) into FoodItemAllergen
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 1 | 210 | 0.48% |
| Multiplicities Errors | 0 | 43 | 0.00% |
| Invariants Errors | 1 | 4 | 25.00% |

| Syntax Errors | 
|---| 
```
<input>:line 1:34 mismatched character '<EOF>' expecting '''
```

| Invariants Errors | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 10 | 0.00% |
| Phones | 0 | 9 | 0.00% |

## Category edge
```
!new Restaurant('restaurant27')
!restaurant27.name := 'Celestial Flavors'

!new Owner('owner60')
!owner60.name := 'Li Chen'
!owner60.percentageShares := 40

!new Owner('owner61')
!owner61.name := 'Ana Torres'
!owner61.percentageShares := 30

!new Owner('owner62')
!owner62.name := 'Ahmed Farouk'
!owner62.percentageShares := 30

!insert (restaurant27, owner60) into RestaurantOwner
!insert (restaurant27, owner61) into RestaurantOwner
!insert (restaurant27, owner62) into RestaurantOwner

!new Table('table61')
!table61.number := 601
!table61.description := 'Lunar Pod Room'
!table61.capacity := 8

!new Table('table62')
!table62.number := 602
!table62.description := 'Emperor\'s Round Table'
!table62.capacity := 10

!new Table('table63')
!table63.number := 603
!table63.description := 'Festive Courtyard'
!table63.capacity := 15

!new Table('table64')
!table64.number := 604
!table64.description := 'Zen Garden Space'
!table64.capacity := 120  -- Adjusted capacity to satisfy banquet requirements

!new RegularCustomer('customer20')
!customer20.name := 'Mei Wong'
!customer20.prefferedLanguage := #English  -- Using #English as placeholder for Mandarin

!new Chef('chef35')
!chef35.name := 'Yu Yan'

!new Cook('cook44')
!cook44.name := 'Juan Soto'
!cook44.dateOfBirth := Date('1985-09-12')  -- Dummy date of birth
!cook44.yearsOfExperience := 7

!new Cook('cook45')
!cook45.name := 'Selma Ridwan'
!cook45.dateOfBirth := Date('1987-05-20')  -- Dummy date of birth
!cook45.yearsOfExperience := 6

!insert (chef35, cook44) into ChefCook
!insert (chef35, cook45) into ChefCook

!new Individual('individualReservation20')
!individualReservation20.time := Time('18:30')
!individualReservation20.date := Date('2024-02-10')
!individualReservation20.numberPeople := 1
!individualReservation20.name := 'Li Wei'
!individualReservation20.phoneNumber := '+86 10 5858 5858'
!individualReservation20.number := 20240210
!individualReservation20.seating := #Inside  -- Using #Inside as placeholder for Zen Garden Space
!individualReservation20.smoking := #Smoking

!insert (restaurant27, individualReservation20) into RestaurantReservation
!insert (individualReservation20, table61) into ReservationTable  -- Assigning to table61 to avoid conflicts

!new HeadWaiter('headWaiter24')
!headWaiter24.name := 'Thomas Nguyen'
!headWaiter24.dateOfBirth := Date('1980-04-22')  -- Dummy date of birth
!headWaiter24.phoneNumber := '+44 20 1234 5678'  -- Dummy phone number

!new Waiter('waiter53')
!waiter53.name := 'Rina Patel'
!waiter53.dateOfBirth := Date('1990-03-10')  -- Dummy date of birth
!waiter53.phoneNumber := '+44 20 2345 6789'  -- Dummy phone number

!new Waiter('waiter54')
!waiter54.name := 'Javier Martinez'
!waiter54.dateOfBirth := Date('1988-08-25')  -- Dummy date of birth
!waiter54.phoneNumber := '+44 20 3456 7890'  -- Dummy phone number

!new Waiter('waiter55')
!waiter55.name := 'Aiko Koizumi'
!waiter55.dateOfBirth := Date('1992-11-05')  -- Dummy date of birth
!waiter55.phoneNumber := '+44 20 4567 8901'  -- Dummy phone number

!insert (headWaiter24, waiter53) into HeadWaiterWaiter
!insert (headWaiter24, waiter54) into HeadWaiterWaiter
!insert (headWaiter24, waiter55) into HeadWaiterWaiter
!insert (individualReservation20, waiter53) into ReservationWaiter

!new ItemOrder('itemOrder40')
!itemOrder40.time := Time('18:45')
!insert (individualReservation20, itemOrder40) into ReservationItemOrdered

!new MenuItem('menuItem45')
!menuItem45.description := 'Five-Spice Duck'
!menuItem45.prepTime := 30.0
!menuItem45.classification := #Main

!insert (itemOrder40, menuItem45) into ItemOrderMenuItem

!new MenuItem('menuItem46')
!menuItem46.description := 'Golden Prosperity Dumplings'
!menuItem46.prepTime := 25.0
!menuItem46.classification := #Main  -- Placeholder to accommodate classification type

!new ItemOrder('itemOrder41')
!itemOrder41.time := Time('19:00')  -- Separate ItemOrder for the second menu item
!insert (individualReservation20, itemOrder41) into ReservationItemOrdered
!insert (itemOrder41, menuItem46) into ItemOrderMenuItem

!insert (menuItem45, chef35) into MenuItemChef
!insert (menuItem46, chef35) into MenuItemChef

!new FoodItem('foodItem89')
!foodItem89.number := 801
!foodItem89.description := 'Duck Breast'
!foodItem89.purchaseFlag := true
!foodItem89.unit := #Pound  -- Using #Pound as placeholder for Kg

!new FoodItem('foodItem90')
!foodItem90.number := 802
!foodItem90.description := 'Homemade Dumpling Wrappers'
!foodItem90.purchaseFlag := false
!foodItem90.unit := #Ounce  -- Using #Ounce as placeholder to manage unit

!insert (menuItem45, foodItem89) into MenuItemFoodItem
!insert (menuItem46, foodItem90) into MenuItemFoodItem

!new Banquet('banquet24')
!banquet24.date := Date('2024-02-10')
!banquet24.time := Time('19:00')
!banquet24.numberPeople := 150
!banquet24.name := 'Community Cultural Society'
!banquet24.phoneNumber := '+1 415 999 9999'
!banquet24.number := 20240210
!banquet24.paymentMethod := #CreditCard  -- Using #CreditCard as placeholder for Community Fund
!banquet24.busService := true

!insert (restaurant27, banquet24) into RestaurantReservation
!insert (banquet24, table62) into ReservationTable
!insert (banquet24, table63) into ReservationTable
!insert (banquet24, table64) into ReservationTable

!insert (banquet24, waiter54) into ReservationWaiter
!insert (banquet24, waiter55) into ReservationWaiter

!new BusDriver('busdriver23')
!busdriver23.name := 'Keiko Yamamoto'
!busdriver23.dateOfBirth := Date('1965-12-20')  -- Dummy date of birth
!busdriver23.phoneNumber := '+1 415 102 3456'  -- Dummy phone number

!new BusDriver('busdriver24')
!busdriver24.name := 'Hassan Abdul'
!busdriver24.dateOfBirth := Date('1973-07-11')  -- Dummy date of birth
!busdriver24.phoneNumber := '+1 415 678 1234'  -- Dummy phone number

!new BusDriver('busdriver25')
!busdriver25.name := 'Kevin O\'Neil'
!busdriver25.dateOfBirth := Date('1980-06-18')  -- Dummy date of birth
!busdriver25.phoneNumber := '+1 415 987 6543'  -- Dummy phone number

!insert (banquet24, busdriver23) into BanquetBusDriver
!insert (banquet24, busdriver24) into BanquetBusDriver
!insert (banquet24, busdriver25) into BanquetBusDriver

!new DietaryRequirement('dietary12')
!dietary12.diet := #Vegan  -- Using #Vegan as placeholder for Halal

!new Allergen('allergen36')
!allergen36.type := #Lactose  -- Using #Lactose as placeholder for Gluten

!new Allergen('allergen37')
!allergen37.type := #Lactose  -- Using #Lactose as placeholder for Soy

!insert (foodItem90, allergen36) into FoodItemAllergen
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 143 | 0.00% |
| Multiplicities Errors | 0 | 29 | 0.00% |
| Invariants Errors | 1 | 4 | 25.00% |

| Invariants Errors | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 11 | 0.00% |
| Phones | 0 | 9 | 0.00% |

## Category invalid
```
!new Restaurant('restaurant28')
!restaurant28.name := 'Cultural Fusion Café'

!new Owner('owner63')
!owner63.name := 'Ravi Desai'
!owner63.percentageShares := 50

!new Owner('owner64')
!owner64.name := 'Sophia Bianchi'
!owner64.percentageShares := 60

!insert (restaurant28, owner63) into RestaurantOwner
!insert (restaurant28, owner64) into RestaurantOwner

!new Table('table65')
!table65.number := 601
!table65.description := 'Rooftop table with city skyline view'
!table65.capacity := 8

!new Table('table66')
!table66.number := 602
!table66.description := 'Central banquet hall table'
!table66.capacity := 40

!new BusDriver('busdriver26')
!busdriver26.name := 'Lucien Gautier'
!busdriver26.dateOfBirth := Date('1980-11-11')
!busdriver26.phoneNumber := '+33 1-2468-1357'

!new BusDriver('busdriver27')
!busdriver27.name := 'Hélène Barret'
!busdriver27.dateOfBirth := Date('1985-10-05')
!busdriver27.phoneNumber := '+33 1-3759-8642'

!new Waiter('waiter56')
!waiter56.name := 'Miguel Velasquez'
!waiter56.dateOfBirth := Date('1998-04-23')
!waiter56.phoneNumber := '+33 1-2034-6789'

!new Chef('chef36')
!chef36.name := 'Ling Wong'
!chef36.dateOfBirth := Date('1976-09-24')
!chef36.phoneNumber := '+33 1-5678-3452'

!new Cook('cook46')
!cook46.name := 'Alice Nowak'
!cook46.dateOfBirth := Date('1991-05-18')
!cook46.phoneNumber := '+33 1-4567-8910'
!cook46.yearsOfExperience := 7

!insert (chef36, cook46) into ChefCook

!new RegularCustomer('customer21')
!customer21.name := 'Anna Svensson'
!customer21.prefferedLanguage := #English  -- Using #English as placeholder for Swedish

!new Individual('individualReservation21')
!individualReservation21.time := Time('13:30')
!individualReservation21.date := Date('2023-11-25')
!individualReservation21.numberPeople := 1
!individualReservation21.name := 'Marie Curie'
!individualReservation21.phoneNumber := '+33 1-2345-6789'
!individualReservation21.number := 20231125
!individualReservation21.seating := #Inside  -- Using #Inside as placeholder for Terrace
!individualReservation21.smoking := #Smoking

!insert (restaurant28, individualReservation21) into RestaurantReservation
!insert (individualReservation21, table65) into ReservationTable

!insert (individualReservation21, waiter56) into ReservationWaiter

!insert (individualReservation21, customer21) into ReservationCustomer

!new Banquet('banquet25')
!banquet25.date := Date('2023-11-25')
!banquet25.time := Time('19:00')
!banquet25.numberPeople := 120
!banquet25.name := 'Culinary Enthusiasts Meet'
!banquet25.phoneNumber := '+33 1-9876-5432'
!banquet25.number := 20231125
!banquet25.groupName := 'Food Lovers Association'
!banquet25.paymentMethod := #CreditCard  -- Using #CreditCard as placeholder for PayPal
!banquet25.busService := true

!insert (restaurant28, banquet25) into RestaurantReservation
!insert (banquet25, table65) into ReservationTable
!insert (banquet25, table66) into ReservationTable

!insert (banquet25, waiter56) into ReservationWaiter

!insert (banquet25, busdriver26) into BanquetBusDriver
!insert (banquet25, busdriver27) into BanquetBusDriver
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 2 | 13 | 15.38% |
| Invariants Errors (Not included on General) | 2 | 4 | 50.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `HeadWaiterWaiter':
  Object `waiter56' of class `Waiter' is connected to 0 objects of class `HeadWaiter'
  at association end `headWaiter' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table65' of class `Table' is connected to 2 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (3) `Restaurant::TotalOwnerShares': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 7 | 0.00% |
| Phones | 0 | 7 | 0.00% |

## Generation 6 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 2 | 625 | 0.32% |
| Multiplicities Errors | 0 | 111 | 0.00% |
| Invariants Errors | 2 | 16 | 12.50% |

| Syntax Errors | 
|---| 
```
<input>:1:0: generation of expression `#Kilogram' failed, with following error:
```
```
<input>:line 1:34 mismatched character '<EOF>' expecting '''
```

| Invariants Errors | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 2 | 13 | 15.38% |
| Invariants Errors (Not included on General) | 2 | 4 | 50.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `HeadWaiterWaiter':
  Object `waiter56' of class `Waiter' is connected to 0 objects of class `HeadWaiter'
  at association end `headWaiter' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table65' of class `Table' is connected to 2 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (3) `Restaurant::TotalOwnerShares': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 42 | 0.00% |
| Phones | 0 | 36 | 0.00% |

# Summary for all generations
| Summary | Value | 
|---|---| 
| Model | GPT_4O | 
| Type | CoT | 
| System | restaurant | 
| Number of generations | 6 | 

| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 9 | 3618 | 0.25% |
| Multiplicities Errors | 8 | 651 | 1.23% |
| Invariants Errors | 6 | 96 | 6.25% |

| Syntax Errors | 
|---| 
```
Error: `itemOrder18.1' is not a valid object name
```
```
<input>:line 1:11 mismatched input '.' expecting :=
```
```
<input>:line 1:7 no viable alternative at input '('
```
```
<input>:line 1:7 no viable alternative at input '('
```
```
Error: `itemOrder18.2' is not a valid object name
```
```
<input>:line 1:11 mismatched input '.' expecting :=
```
```
<input>:line 1:7 no viable alternative at input '('
```
```
<input>:1:0: generation of expression `#Kilogram' failed, with following error:
```
```
<input>:line 1:34 mismatched character '<EOF>' expecting '''
```

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `ChefCook':
  Object `cook2' of class `Cook' is connected to 2 objects of class `Chef'
  at association end `underSupervisionOf' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ChefCook':
  Object `cook1' of class `Cook' is connected to 2 objects of class `Chef'
  at association end `underSupervisionOf' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `BanquetBusDriver':
  Object `busdriver11' of class `BusDriver' is connected to 0 objects of class `Banquet'
  at association end `banquet' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table27' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table35' of class `Table' is connected to 2 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table58' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table42' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table51' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```

| Invariants Errors | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 9 | 63 | 14.29% |
| Invariants Errors (Not included on General) | 11 | 24 | 45.83% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `HeadWaiterWaiter':
  Object `waiter3' of class `Waiter' is connected to 0 objects of class `HeadWaiter'
  at association end `headWaiter' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table19' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table20' of class `Table' is connected to 0 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ChefCook':
  Object `chef27' of class `Chef' is connected to 0 objects of class `Cook'
  at association end `supervises' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `ChefCook':
  Object `cook34' of class `Cook' is connected to 0 objects of class `Chef'
  at association end `underSupervisionOf' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `HeadWaiterWaiter':
  Object `waiter40' of class `Waiter' is connected to 0 objects of class `HeadWaiter'
  at association end `headWaiter' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `HeadWaiterWaiter':
  Object `waiter47' of class `Waiter' is connected to 0 objects of class `HeadWaiter'
  at association end `headWaiter' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `HeadWaiterWaiter':
  Object `waiter56' of class `Waiter' is connected to 0 objects of class `HeadWaiter'
  at association end `headWaiter' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `ReservationTable':
  Object `table65' of class `Table' is connected to 2 objects of class `Reservation'
  at association end `reservation' but the multiplicity is specified as `1'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (3) `Restaurant::TotalOwnerShares': FAILED.
```
```
checking invariant (3) `Restaurant::TotalOwnerShares': FAILED.
```
```
checking invariant (4) `Table::PositiveCapacity': FAILED.
```
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (3) `Restaurant::TotalOwnerShares': FAILED.
```
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (3) `Restaurant::TotalOwnerShares': FAILED.
```
```
checking invariant (2) `Reservation::TablesCapacityGreaterThanPeople': FAILED.
```
```
checking invariant (3) `Restaurant::TotalOwnerShares': FAILED.
```

| Restaurant | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 244 | 0.00% |
| Phones | 0 | 200 | 0.00% |

