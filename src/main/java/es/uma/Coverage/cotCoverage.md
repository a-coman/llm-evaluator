# CoT

## Restaurant

### gen1

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 8.0000 | 19.0000 | 0.4211 | 
| **attributes** | 28.0000 | 58.0000 | 0.4828 | 
| **relationships** | 6.0000 | 13.0000 | 0.4615 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 12.0000 | Infinity | 0.0000 | 
| **attributes** | 40.0000 | 43.0000 | 0.9302 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Class: HeadWaiter, Attribute: HeadWaiter.name, Attribute: HeadWaiter.dateOfBirth, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Relationship: HeadWaiterWaiter]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 15.0000 | 19.0000 | 0.7895 | 
| **attributes** | 36.0000 | 58.0000 | 0.6207 | 
| **relationships** | 13.0000 | 13.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 27.0000 | Infinity | 0.0000 | 
| **attributes** | 68.0000 | 86.0000 | 0.7907 | 
| **relationships** | 27.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 12.0000 | 19.0000 | 0.6316 | 
| **attributes** | 34.0000 | 58.0000 | 0.5862 | 
| **relationships** | 10.0000 | 13.0000 | 0.7692 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 30.0000 | Infinity | 0.0000 | 
| **attributes** | 73.0000 | 85.0000 | 0.8588 | 
| **relationships** | 29.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Relationship: MenuItemFoodItem]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 17.0000 | 19.0000 | 0.8947 | 
| **attributes** | 52.0000 | 58.0000 | 0.8966 | 
| **relationships** | 13.0000 | 13.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 23.0000 | Infinity | 0.0000 | 
| **attributes** | 68.0000 | 73.0000 | 0.9315 | 
| **relationships** | 22.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Banquet.phoneNumber, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr]

#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 19.0000 | 0.8421 | 
| **attributes** | 50.0000 | 58.0000 | 0.8621 | 
| **relationships** | 13.0000 | 13.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 30.0000 | Infinity | 0.0000 | 
| **attributes** | 90.0000 | 96.0000 | 0.9375 | 
| **relationships** | 30.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr]

#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 68.0000 | 95.0000 | 0.7158 | 
| **attributes** | 200.0000 | 290.0000 | 0.6897 | 
| **relationships** | 55.0000 | 65.0000 | 0.8462 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 122.0000 | Infinity | 0.0000 | 
| **attributes** | 339.0000 | 383.0000 | 0.8851 | 
| **relationships** | 118.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Class: HeadWaiter, Attribute: HeadWaiter.name, Attribute: HeadWaiter.dateOfBirth, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Relationship: HeadWaiterWaiter, Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Relationship: MenuItemFoodItem, Attribute: Banquet.phoneNumber, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr]

### gen2

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 8.0000 | 19.0000 | 0.4211 | 
| **attributes** | 27.0000 | 58.0000 | 0.4655 | 
| **relationships** | 6.0000 | 13.0000 | 0.4615 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 35.0000 | 36.0000 | 0.9722 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Banquet, Attribute: Banquet.time, Attribute: Banquet.date, Attribute: Banquet.numberPeople, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Attribute: Banquet.paymentMethod, Attribute: Banquet.busService, Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 14.0000 | 19.0000 | 0.7368 | 
| **attributes** | 43.0000 | 58.0000 | 0.7414 | 
| **relationships** | 11.0000 | 13.0000 | 0.8462 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 23.0000 | Infinity | 0.0000 | 
| **attributes** | 67.0000 | 74.0000 | 0.9054 | 
| **relationships** | 24.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 12.0000 | 19.0000 | 0.6316 | 
| **attributes** | 33.0000 | 58.0000 | 0.5690 | 
| **relationships** | 10.0000 | 13.0000 | 0.7692 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 20.0000 | Infinity | 0.0000 | 
| **attributes** | 52.0000 | 59.0000 | 0.8814 | 
| **relationships** | 16.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Banquet, Attribute: Banquet.time, Attribute: Banquet.date, Attribute: Banquet.numberPeople, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Attribute: Banquet.paymentMethod, Attribute: Banquet.busService, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Relationship: MenuItemFoodItem]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 19.0000 | 0.8421 | 
| **attributes** | 48.0000 | 58.0000 | 0.8276 | 
| **relationships** | 12.0000 | 13.0000 | 0.9231 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 21.0000 | Infinity | 0.0000 | 
| **attributes** | 64.0000 | 69.0000 | 0.9275 | 
| **relationships** | 20.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver]

#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 19.0000 | 0.8421 | 
| **attributes** | 50.0000 | 58.0000 | 0.8621 | 
| **relationships** | 12.0000 | 13.0000 | 0.9231 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 40.0000 | Infinity | 0.0000 | 
| **attributes** | 123.0000 | 130.0000 | 0.9462 | 
| **relationships** | 40.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver]

#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 66.0000 | 95.0000 | 0.6947 | 
| **attributes** | 201.0000 | 290.0000 | 0.6931 | 
| **relationships** | 51.0000 | 65.0000 | 0.7846 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 115.0000 | Infinity | 0.0000 | 
| **attributes** | 341.0000 | 368.0000 | 0.9266 | 
| **relationships** | 107.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Banquet, Attribute: Banquet.time, Attribute: Banquet.date, Attribute: Banquet.numberPeople, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Attribute: Banquet.paymentMethod, Attribute: Banquet.busService, Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Class: Banquet, Attribute: Banquet.time, Attribute: Banquet.date, Attribute: Banquet.numberPeople, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Attribute: Banquet.paymentMethod, Attribute: Banquet.busService, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Relationship: MenuItemFoodItem, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver]

### gen3

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 11.0000 | 19.0000 | 0.5789 | 
| **attributes** | 34.0000 | 58.0000 | 0.5862 | 
| **relationships** | 10.0000 | 13.0000 | 0.7692 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 12.0000 | Infinity | 0.0000 | 
| **attributes** | 37.0000 | 39.0000 | 0.9487 | 
| **relationships** | 12.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 19.0000 | 0.8421 | 
| **attributes** | 47.0000 | 58.0000 | 0.8103 | 
| **relationships** | 12.0000 | 13.0000 | 0.9231 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 30.0000 | Infinity | 0.0000 | 
| **attributes** | 84.0000 | 95.0000 | 0.8842 | 
| **relationships** | 30.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer]

Hallucinations: [Relationship: CustomerDietary]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 13.0000 | 19.0000 | 0.6842 | 
| **attributes** | 37.0000 | 58.0000 | 0.6379 | 
| **relationships** | 11.0000 | 13.0000 | 0.8462 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 24.0000 | Infinity | 0.0000 | 
| **attributes** | 62.0000 | 71.0000 | 0.8732 | 
| **relationships** | 22.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: MenuItemFoodItem]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 17.0000 | 19.0000 | 0.8947 | 
| **attributes** | 51.0000 | 58.0000 | 0.8793 | 
| **relationships** | 13.0000 | 13.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 22.0000 | Infinity | 0.0000 | 
| **attributes** | 67.0000 | 73.0000 | 0.9178 | 
| **relationships** | 21.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr]

#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 19.0000 | 0.8421 | 
| **attributes** | 50.0000 | 58.0000 | 0.8621 | 
| **relationships** | 13.0000 | 13.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 40.0000 | Infinity | 0.0000 | 
| **attributes** | 124.0000 | 130.0000 | 0.9538 | 
| **relationships** | 42.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr]

#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 73.0000 | 95.0000 | 0.7684 | 
| **attributes** | 219.0000 | 290.0000 | 0.7552 | 
| **relationships** | 59.0000 | 65.0000 | 0.9077 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 128.0000 | Infinity | 0.0000 | 
| **attributes** | 374.0000 | 408.0000 | 0.9167 | 
| **relationships** | 127.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: MenuItemFoodItem, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr]

Hallucinations: [Relationship: CustomerDietary]

### gen4

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 10.0000 | 19.0000 | 0.5263 | 
| **attributes** | 38.0000 | 58.0000 | 0.6552 | 
| **relationships** | 6.0000 | 13.0000 | 0.4615 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 46.0000 | 49.0000 | 0.9388 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


Uncovered: [Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Class: HeadWaiter, Attribute: HeadWaiter.name, Attribute: HeadWaiter.dateOfBirth, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Relationship: ChefCook, Relationship: HeadWaiterWaiter]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 19.0000 | 0.8421 | 
| **attributes** | 47.0000 | 58.0000 | 0.8103 | 
| **relationships** | 13.0000 | 13.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 28.0000 | Infinity | 0.0000 | 
| **attributes** | 79.0000 | 89.0000 | 0.8876 | 
| **relationships** | 27.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 13.0000 | 19.0000 | 0.6842 | 
| **attributes** | 36.0000 | 58.0000 | 0.6207 | 
| **relationships** | 11.0000 | 13.0000 | 0.8462 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 24.0000 | Infinity | 0.0000 | 
| **attributes** | 63.0000 | 76.0000 | 0.8289 | 
| **relationships** | 22.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Attribute: ItemOrder.time, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: MenuItemFoodItem]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 19.0000 | 0.8421 | 
| **attributes** | 48.0000 | 58.0000 | 0.8276 | 
| **relationships** | 12.0000 | 13.0000 | 0.9231 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 21.0000 | Infinity | 0.0000 | 
| **attributes** | 64.0000 | 69.0000 | 0.9275 | 
| **relationships** | 20.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver]

Hallucinations: [Relationship: CustomerDietary]

#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 19.0000 | 0.8421 | 
| **attributes** | 50.0000 | 58.0000 | 0.8621 | 
| **relationships** | 13.0000 | 13.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 41.0000 | Infinity | 0.0000 | 
| **attributes** | 127.0000 | 134.0000 | 0.9478 | 
| **relationships** | 41.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr]

#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 71.0000 | 95.0000 | 0.7474 | 
| **attributes** | 219.0000 | 290.0000 | 0.7552 | 
| **relationships** | 55.0000 | 65.0000 | 0.8462 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 127.0000 | Infinity | 0.0000 | 
| **attributes** | 379.0000 | 417.0000 | 0.9089 | 
| **relationships** | 121.0000 | Infinity | 0.0000 | 


Uncovered: [Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Class: HeadWaiter, Attribute: HeadWaiter.name, Attribute: HeadWaiter.dateOfBirth, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Relationship: ChefCook, Relationship: HeadWaiterWaiter, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Attribute: ItemOrder.time, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: MenuItemFoodItem, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr]

Hallucinations: [Relationship: CustomerDietary]

### gen5

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 9.0000 | 19.0000 | 0.4737 | 
| **attributes** | 35.0000 | 58.0000 | 0.6034 | 
| **relationships** | 6.0000 | 13.0000 | 0.4615 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 40.0000 | 41.0000 | 0.9756 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


Uncovered: [Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Class: HeadWaiter, Attribute: HeadWaiter.name, Attribute: HeadWaiter.dateOfBirth, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Relationship: HeadWaiterWaiter]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 15.0000 | 19.0000 | 0.7895 | 
| **attributes** | 44.0000 | 58.0000 | 0.7586 | 
| **relationships** | 11.0000 | 13.0000 | 0.8462 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 25.0000 | Infinity | 0.0000 | 
| **attributes** | 70.0000 | 78.0000 | 0.8974 | 
| **relationships** | 23.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 12.0000 | 19.0000 | 0.6316 | 
| **attributes** | 33.0000 | 58.0000 | 0.5690 | 
| **relationships** | 11.0000 | 13.0000 | 0.8462 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 20.0000 | Infinity | 0.0000 | 
| **attributes** | 53.0000 | 60.0000 | 0.8833 | 
| **relationships** | 18.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Banquet, Attribute: Banquet.time, Attribute: Banquet.date, Attribute: Banquet.numberPeople, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Attribute: Banquet.paymentMethod, Attribute: Banquet.busService, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 19.0000 | 0.8421 | 
| **attributes** | 48.0000 | 58.0000 | 0.8276 | 
| **relationships** | 12.0000 | 13.0000 | 0.9231 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 23.0000 | Infinity | 0.0000 | 
| **attributes** | 67.0000 | 72.0000 | 0.9306 | 
| **relationships** | 22.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver]

#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 19.0000 | 0.8421 | 
| **attributes** | 50.0000 | 58.0000 | 0.8621 | 
| **relationships** | 13.0000 | 13.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 41.0000 | Infinity | 0.0000 | 
| **attributes** | 126.0000 | 132.0000 | 0.9545 | 
| **relationships** | 42.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr]

#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 68.0000 | 95.0000 | 0.7158 | 
| **attributes** | 210.0000 | 290.0000 | 0.7241 | 
| **relationships** | 53.0000 | 65.0000 | 0.8154 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 120.0000 | Infinity | 0.0000 | 
| **attributes** | 356.0000 | 383.0000 | 0.9295 | 
| **relationships** | 115.0000 | Infinity | 0.0000 | 


Uncovered: [Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Class: HeadWaiter, Attribute: HeadWaiter.name, Attribute: HeadWaiter.dateOfBirth, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Relationship: HeadWaiterWaiter, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Class: Banquet, Attribute: Banquet.time, Attribute: Banquet.date, Attribute: Banquet.numberPeople, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Attribute: Banquet.paymentMethod, Attribute: Banquet.busService, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr]

### gen6

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 10.0000 | 19.0000 | 0.5263 | 
| **attributes** | 38.0000 | 58.0000 | 0.6552 | 
| **relationships** | 7.0000 | 13.0000 | 0.5385 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 46.0000 | 49.0000 | 0.9388 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


Uncovered: [Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Class: HeadWaiter, Attribute: HeadWaiter.name, Attribute: HeadWaiter.dateOfBirth, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Relationship: HeadWaiterWaiter]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 19.0000 | 0.8421 | 
| **attributes** | 47.0000 | 58.0000 | 0.8103 | 
| **relationships** | 12.0000 | 13.0000 | 0.9231 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 30.0000 | Infinity | 0.0000 | 
| **attributes** | 84.0000 | 95.0000 | 0.8842 | 
| **relationships** | 29.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 11.0000 | 19.0000 | 0.5789 | 
| **attributes** | 33.0000 | 58.0000 | 0.5690 | 
| **relationships** | 10.0000 | 13.0000 | 0.7692 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 19.0000 | Infinity | 0.0000 | 
| **attributes** | 53.0000 | 60.0000 | 0.8833 | 
| **relationships** | 18.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Relationship: FoodItemAllergen]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 17.0000 | 19.0000 | 0.8947 | 
| **attributes** | 51.0000 | 58.0000 | 0.8793 | 
| **relationships** | 13.0000 | 13.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 22.0000 | Infinity | 0.0000 | 
| **attributes** | 67.0000 | 73.0000 | 0.9178 | 
| **relationships** | 21.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr]

#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 19.0000 | 0.8421 | 
| **attributes** | 50.0000 | 58.0000 | 0.8621 | 
| **relationships** | 13.0000 | 13.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 41.0000 | Infinity | 0.0000 | 
| **attributes** | 126.0000 | 132.0000 | 0.9545 | 
| **relationships** | 43.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr]

#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 70.0000 | 95.0000 | 0.7368 | 
| **attributes** | 219.0000 | 290.0000 | 0.7552 | 
| **relationships** | 55.0000 | 65.0000 | 0.8462 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 125.0000 | Infinity | 0.0000 | 
| **attributes** | 376.0000 | 409.0000 | 0.9193 | 
| **relationships** | 124.0000 | Infinity | 0.0000 | 


Uncovered: [Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Class: HeadWaiter, Attribute: HeadWaiter.name, Attribute: HeadWaiter.dateOfBirth, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Relationship: HeadWaiterWaiter, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Relationship: FoodItemAllergen, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr]

### ALL Gen 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 416.0000 | 570.0000 | 0.7298 | 
| **attributes** | 1268.0000 | 1740.0000 | 0.7287 | 
| **relationships** | 328.0000 | 390.0000 | 0.8410 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 737.0000 | Infinity | 0.0000 | 
| **attributes** | 2165.0000 | 2368.0000 | 0.9143 | 
| **relationships** | 712.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Class: HeadWaiter, Attribute: HeadWaiter.name, Attribute: HeadWaiter.dateOfBirth, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Relationship: HeadWaiterWaiter, Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Relationship: MenuItemFoodItem, Attribute: Banquet.phoneNumber, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Class: Banquet, Attribute: Banquet.time, Attribute: Banquet.date, Attribute: Banquet.numberPeople, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Attribute: Banquet.paymentMethod, Attribute: Banquet.busService, Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Class: Banquet, Attribute: Banquet.time, Attribute: Banquet.date, Attribute: Banquet.numberPeople, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Attribute: Banquet.paymentMethod, Attribute: Banquet.busService, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Relationship: MenuItemFoodItem, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: MenuItemFoodItem, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Class: HeadWaiter, Attribute: HeadWaiter.name, Attribute: HeadWaiter.dateOfBirth, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Relationship: ChefCook, Relationship: HeadWaiterWaiter, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Attribute: ItemOrder.time, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: MenuItemFoodItem, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Class: HeadWaiter, Attribute: HeadWaiter.name, Attribute: HeadWaiter.dateOfBirth, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Relationship: HeadWaiterWaiter, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Class: Banquet, Attribute: Banquet.time, Attribute: Banquet.date, Attribute: Banquet.numberPeople, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Attribute: Banquet.paymentMethod, Attribute: Banquet.busService, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Class: HeadWaiter, Attribute: HeadWaiter.name, Attribute: HeadWaiter.dateOfBirth, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Relationship: HeadWaiterWaiter, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Relationship: FoodItemAllergen, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr]

Hallucinations: [Relationship: CustomerDietary, Relationship: CustomerDietary]

## Statemachine

### gen1

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 5.0000 | 6.0000 | 0.8333 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


Uncovered: [Relationship: StateMachineStartsStates]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 21.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 12.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 16.0000 | Infinity | 0.0000 | 
| **attributes** | 16.0000 | 16.0000 | 1.0000 | 
| **relationships** | 26.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 21.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 20.0000 | 20.0000 | 1.0000 | 
| **attributes** | 20.0000 | 20.0000 | 1.0000 | 
| **relationships** | 29.0000 | 30.0000 | 0.9667 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 60.0000 | Infinity | 0.0000 | 
| **attributes** | 60.0000 | 60.0000 | 1.0000 | 
| **relationships** | 95.0000 | Infinity | 0.0000 | 


Uncovered: [Relationship: StateMachineStartsStates]

### gen2

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 5.0000 | 6.0000 | 0.8333 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 15.0000 | Infinity | 0.0000 | 
| **attributes** | 15.0000 | 15.0000 | 1.0000 | 
| **relationships** | 24.0000 | Infinity | 0.0000 | 


Uncovered: [Relationship: StateMachineStartsStates]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 21.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 21.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 19.0000 | Infinity | 0.0000 | 
| **attributes** | 19.0000 | 19.0000 | 1.0000 | 
| **relationships** | 31.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 21.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 20.0000 | 20.0000 | 1.0000 | 
| **attributes** | 20.0000 | 20.0000 | 1.0000 | 
| **relationships** | 29.0000 | 30.0000 | 0.9667 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 73.0000 | Infinity | 0.0000 | 
| **attributes** | 73.0000 | 73.0000 | 1.0000 | 
| **relationships** | 118.0000 | Infinity | 0.0000 | 


Uncovered: [Relationship: StateMachineStartsStates]

### gen3

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 5.0000 | 6.0000 | 0.8333 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 16.0000 | Infinity | 0.0000 | 
| **attributes** | 16.0000 | 16.0000 | 1.0000 | 
| **relationships** | 25.0000 | Infinity | 0.0000 | 


Uncovered: [Relationship: StateMachineStartsStates]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 19.0000 | Infinity | 0.0000 | 
| **attributes** | 19.0000 | 19.0000 | 1.0000 | 
| **relationships** | 31.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 21.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 19.0000 | Infinity | 0.0000 | 
| **attributes** | 19.0000 | 19.0000 | 1.0000 | 
| **relationships** | 31.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 15.0000 | Infinity | 0.0000 | 
| **attributes** | 15.0000 | 15.0000 | 1.0000 | 
| **relationships** | 25.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 20.0000 | 20.0000 | 1.0000 | 
| **attributes** | 20.0000 | 20.0000 | 1.0000 | 
| **relationships** | 29.0000 | 30.0000 | 0.9667 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 82.0000 | Infinity | 0.0000 | 
| **attributes** | 82.0000 | 82.0000 | 1.0000 | 
| **relationships** | 133.0000 | Infinity | 0.0000 | 


Uncovered: [Relationship: StateMachineStartsStates]

### gen4

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 5.0000 | 6.0000 | 0.8333 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 14.0000 | Infinity | 0.0000 | 
| **attributes** | 14.0000 | 14.0000 | 1.0000 | 
| **relationships** | 23.0000 | Infinity | 0.0000 | 


Uncovered: [Relationship: StateMachineStartsStates]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 16.0000 | Infinity | 0.0000 | 
| **attributes** | 16.0000 | 16.0000 | 1.0000 | 
| **relationships** | 26.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 21.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 21.0000 | Infinity | 0.0000 | 
| **attributes** | 21.0000 | 21.0000 | 1.0000 | 
| **relationships** | 35.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 15.0000 | Infinity | 0.0000 | 
| **attributes** | 15.0000 | 15.0000 | 1.0000 | 
| **relationships** | 25.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 20.0000 | 20.0000 | 1.0000 | 
| **attributes** | 20.0000 | 20.0000 | 1.0000 | 
| **relationships** | 29.0000 | 30.0000 | 0.9667 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 79.0000 | Infinity | 0.0000 | 
| **attributes** | 79.0000 | 79.0000 | 1.0000 | 
| **relationships** | 130.0000 | Infinity | 0.0000 | 


Uncovered: [Relationship: StateMachineStartsStates]

### gen5

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 5.0000 | 6.0000 | 0.8333 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 15.0000 | Infinity | 0.0000 | 
| **attributes** | 15.0000 | 15.0000 | 1.0000 | 
| **relationships** | 24.0000 | Infinity | 0.0000 | 


Uncovered: [Relationship: StateMachineStartsStates]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 16.0000 | Infinity | 0.0000 | 
| **attributes** | 16.0000 | 16.0000 | 1.0000 | 
| **relationships** | 26.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 16.0000 | Infinity | 0.0000 | 
| **attributes** | 16.0000 | 16.0000 | 1.0000 | 
| **relationships** | 26.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 21.0000 | Infinity | 0.0000 | 
| **attributes** | 21.0000 | 21.0000 | 1.0000 | 
| **relationships** | 35.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 18.0000 | Infinity | 0.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 30.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 20.0000 | 20.0000 | 1.0000 | 
| **attributes** | 20.0000 | 20.0000 | 1.0000 | 
| **relationships** | 29.0000 | 30.0000 | 0.9667 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 86.0000 | Infinity | 0.0000 | 
| **attributes** | 86.0000 | 86.0000 | 1.0000 | 
| **relationships** | 141.0000 | Infinity | 0.0000 | 


Uncovered: [Relationship: StateMachineStartsStates]

### gen6

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 5.0000 | 6.0000 | 0.8333 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 18.0000 | Infinity | 0.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 29.0000 | Infinity | 0.0000 | 


Uncovered: [Relationship: StateMachineStartsStates]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 19.0000 | Infinity | 0.0000 | 
| **attributes** | 19.0000 | 19.0000 | 1.0000 | 
| **relationships** | 31.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 19.0000 | Infinity | 0.0000 | 
| **attributes** | 19.0000 | 19.0000 | 1.0000 | 
| **relationships** | 31.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 24.0000 | Infinity | 0.0000 | 
| **attributes** | 24.0000 | 24.0000 | 1.0000 | 
| **relationships** | 40.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 4.0000 | 4.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 16.0000 | Infinity | 0.0000 | 
| **attributes** | 16.0000 | 16.0000 | 1.0000 | 
| **relationships** | 26.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 20.0000 | 20.0000 | 1.0000 | 
| **attributes** | 20.0000 | 20.0000 | 1.0000 | 
| **relationships** | 29.0000 | 30.0000 | 0.9667 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 96.0000 | Infinity | 0.0000 | 
| **attributes** | 96.0000 | 96.0000 | 1.0000 | 
| **relationships** | 157.0000 | Infinity | 0.0000 | 


Uncovered: [Relationship: StateMachineStartsStates]

### ALL Gen 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 120.0000 | 120.0000 | 1.0000 | 
| **attributes** | 120.0000 | 120.0000 | 1.0000 | 
| **relationships** | 174.0000 | 180.0000 | 0.9667 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 476.0000 | Infinity | 0.0000 | 
| **attributes** | 476.0000 | 476.0000 | 1.0000 | 
| **relationships** | 774.0000 | Infinity | 0.0000 | 


Uncovered: [Relationship: StateMachineStartsStates, Relationship: StateMachineStartsStates, Relationship: StateMachineStartsStates, Relationship: StateMachineStartsStates, Relationship: StateMachineStartsStates, Relationship: StateMachineStartsStates]

## Bank

### gen1

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 16.0000 | 16.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 5.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 5.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 16.0000 | 16.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 21.0000 | 21.0000 | 1.0000 | 
| **relationships** | 14.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 15.0000 | 15.0000 | 1.0000 | 
| **attributes** | 40.0000 | 40.0000 | 1.0000 | 
| **relationships** | 15.0000 | 15.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 30.0000 | Infinity | 0.0000 | 
| **attributes** | 79.0000 | 79.0000 | 1.0000 | 
| **relationships** | 48.0000 | Infinity | 0.0000 | 


### gen2

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 19.0000 | 19.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 5.0000 | Infinity | 0.0000 | 
| **attributes** | 14.0000 | 14.0000 | 1.0000 | 
| **relationships** | 5.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 24.0000 | 24.0000 | 1.0000 | 
| **relationships** | 12.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 23.0000 | 23.0000 | 1.0000 | 
| **relationships** | 17.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 15.0000 | 15.0000 | 1.0000 | 
| **attributes** | 40.0000 | 40.0000 | 1.0000 | 
| **relationships** | 15.0000 | 15.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 37.0000 | Infinity | 0.0000 | 
| **attributes** | 98.0000 | 98.0000 | 1.0000 | 
| **relationships** | 55.0000 | Infinity | 0.0000 | 


### gen3

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 19.0000 | 19.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 16.0000 | 16.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 14.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 28.0000 | 28.0000 | 1.0000 | 
| **relationships** | 20.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 15.0000 | 15.0000 | 1.0000 | 
| **attributes** | 40.0000 | 40.0000 | 1.0000 | 
| **relationships** | 15.0000 | 15.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 39.0000 | Infinity | 0.0000 | 
| **attributes** | 103.0000 | 103.0000 | 1.0000 | 
| **relationships** | 61.0000 | Infinity | 0.0000 | 


### gen4

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 19.0000 | 19.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 16.0000 | 16.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 21.0000 | 21.0000 | 1.0000 | 
| **relationships** | 14.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 21.0000 | 21.0000 | 1.0000 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 26.0000 | 26.0000 | 1.0000 | 
| **relationships** | 17.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 15.0000 | 15.0000 | 1.0000 | 
| **attributes** | 40.0000 | 40.0000 | 1.0000 | 
| **relationships** | 15.0000 | 15.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 39.0000 | Infinity | 0.0000 | 
| **attributes** | 103.0000 | 103.0000 | 1.0000 | 
| **relationships** | 60.0000 | Infinity | 0.0000 | 


### gen5

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 19.0000 | 19.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 5.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 16.0000 | 16.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 28.0000 | 28.0000 | 1.0000 | 
| **relationships** | 20.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 15.0000 | 15.0000 | 1.0000 | 
| **attributes** | 40.0000 | 40.0000 | 1.0000 | 
| **relationships** | 15.0000 | 15.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 37.0000 | Infinity | 0.0000 | 
| **attributes** | 98.0000 | 98.0000 | 1.0000 | 
| **relationships** | 58.0000 | Infinity | 0.0000 | 


### gen6

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 19.0000 | 19.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 16.0000 | 16.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 23.0000 | 23.0000 | 1.0000 | 
| **relationships** | 19.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 27.0000 | 27.0000 | 1.0000 | 
| **relationships** | 16.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 3.0000 | 1.0000 | 
| **attributes** | 8.0000 | 8.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 24.0000 | 24.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 15.0000 | 15.0000 | 1.0000 | 
| **attributes** | 40.0000 | 40.0000 | 1.0000 | 
| **relationships** | 15.0000 | 15.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 41.0000 | Infinity | 0.0000 | 
| **attributes** | 109.0000 | 109.0000 | 1.0000 | 
| **relationships** | 65.0000 | Infinity | 0.0000 | 


### ALL Gen 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 90.0000 | 90.0000 | 1.0000 | 
| **attributes** | 240.0000 | 240.0000 | 1.0000 | 
| **relationships** | 90.0000 | 90.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 223.0000 | Infinity | 0.0000 | 
| **attributes** | 590.0000 | 590.0000 | 1.0000 | 
| **relationships** | 347.0000 | Infinity | 0.0000 | 


## PickupNet

### gen1

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 7.0000 | 8.0000 | 0.8750 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


Uncovered: [Relationship: DriverShipment]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 15.0000 | Infinity | 0.0000 | 
| **attributes** | 26.0000 | 26.0000 | 1.0000 | 
| **relationships** | 17.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 30.0000 | 30.0000 | 1.0000 | 
| **attributes** | 50.0000 | 50.0000 | 1.0000 | 
| **relationships** | 39.0000 | 40.0000 | 0.9750 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 45.0000 | Infinity | 0.0000 | 
| **attributes** | 75.0000 | 75.0000 | 1.0000 | 
| **relationships** | 51.0000 | Infinity | 0.0000 | 


Uncovered: [Relationship: DriverShipment]

### gen2

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 15.0000 | 15.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 23.0000 | Infinity | 0.0000 | 
| **attributes** | 39.0000 | 39.0000 | 1.0000 | 
| **relationships** | 26.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 30.0000 | 30.0000 | 1.0000 | 
| **attributes** | 50.0000 | 50.0000 | 1.0000 | 
| **relationships** | 40.0000 | 40.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 60.0000 | Infinity | 0.0000 | 
| **attributes** | 103.0000 | 103.0000 | 1.0000 | 
| **relationships** | 67.0000 | Infinity | 0.0000 | 


### gen3

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 14.0000 | Infinity | 0.0000 | 
| **attributes** | 24.0000 | 24.0000 | 1.0000 | 
| **relationships** | 17.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 21.0000 | 21.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 16.0000 | Infinity | 0.0000 | 
| **attributes** | 26.0000 | 26.0000 | 1.0000 | 
| **relationships** | 17.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 14.0000 | Infinity | 0.0000 | 
| **attributes** | 24.0000 | 24.0000 | 1.0000 | 
| **relationships** | 16.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 24.0000 | Infinity | 0.0000 | 
| **attributes** | 39.0000 | 39.0000 | 1.0000 | 
| **relationships** | 26.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 30.0000 | 30.0000 | 1.0000 | 
| **attributes** | 50.0000 | 50.0000 | 1.0000 | 
| **relationships** | 40.0000 | 40.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 81.0000 | Infinity | 0.0000 | 
| **attributes** | 134.0000 | 134.0000 | 1.0000 | 
| **relationships** | 91.0000 | Infinity | 0.0000 | 


### gen4

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 15.0000 | Infinity | 0.0000 | 
| **attributes** | 26.0000 | 26.0000 | 1.0000 | 
| **relationships** | 17.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 23.0000 | 23.0000 | 1.0000 | 
| **relationships** | 17.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 21.0000 | Infinity | 0.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 26.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 14.0000 | Infinity | 0.0000 | 
| **attributes** | 24.0000 | 24.0000 | 1.0000 | 
| **relationships** | 16.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 28.0000 | Infinity | 0.0000 | 
| **attributes** | 47.0000 | 47.0000 | 1.0000 | 
| **relationships** | 33.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 30.0000 | 30.0000 | 1.0000 | 
| **attributes** | 50.0000 | 50.0000 | 1.0000 | 
| **relationships** | 40.0000 | 40.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 91.0000 | Infinity | 0.0000 | 
| **attributes** | 156.0000 | 156.0000 | 1.0000 | 
| **relationships** | 109.0000 | Infinity | 0.0000 | 


### gen5

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 16.0000 | Infinity | 0.0000 | 
| **attributes** | 26.0000 | 26.0000 | 1.0000 | 
| **relationships** | 18.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 14.0000 | Infinity | 0.0000 | 
| **attributes** | 24.0000 | 24.0000 | 1.0000 | 
| **relationships** | 16.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 18.0000 | Infinity | 0.0000 | 
| **attributes** | 31.0000 | 31.0000 | 1.0000 | 
| **relationships** | 20.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 15.0000 | 15.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 28.0000 | Infinity | 0.0000 | 
| **attributes** | 47.0000 | 47.0000 | 1.0000 | 
| **relationships** | 33.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 30.0000 | 30.0000 | 1.0000 | 
| **attributes** | 50.0000 | 50.0000 | 1.0000 | 
| **relationships** | 40.0000 | 40.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 85.0000 | Infinity | 0.0000 | 
| **attributes** | 143.0000 | 143.0000 | 1.0000 | 
| **relationships** | 97.0000 | Infinity | 0.0000 | 


### gen6

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 16.0000 | Infinity | 0.0000 | 
| **attributes** | 26.0000 | 26.0000 | 1.0000 | 
| **relationships** | 18.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 21.0000 | 21.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 16.0000 | 16.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 8.0000 | 8.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 28.0000 | Infinity | 0.0000 | 
| **attributes** | 47.0000 | 47.0000 | 1.0000 | 
| **relationships** | 33.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 30.0000 | 30.0000 | 1.0000 | 
| **attributes** | 50.0000 | 50.0000 | 1.0000 | 
| **relationships** | 40.0000 | 40.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 76.0000 | Infinity | 0.0000 | 
| **attributes** | 128.0000 | 128.0000 | 1.0000 | 
| **relationships** | 87.0000 | Infinity | 0.0000 | 


### ALL Gen 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 180.0000 | 180.0000 | 1.0000 | 
| **attributes** | 300.0000 | 300.0000 | 1.0000 | 
| **relationships** | 239.0000 | 240.0000 | 0.9958 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 438.0000 | Infinity | 0.0000 | 
| **attributes** | 739.0000 | 739.0000 | 1.0000 | 
| **relationships** | 502.0000 | Infinity | 0.0000 | 


Uncovered: [Relationship: DriverShipment]

## AddressBook

### gen1

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 35.0000 | 35.0000 | 1.0000 | 
| **relationships** | 12.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 15.0000 | Infinity | 0.0000 | 
| **attributes** | 46.0000 | 46.0000 | 1.0000 | 
| **relationships** | 17.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 15.0000 | Infinity | 0.0000 | 
| **attributes** | 43.0000 | 43.0000 | 1.0000 | 
| **relationships** | 18.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 12.0000 | Infinity | 0.0000 | 
| **attributes** | 38.0000 | 38.0000 | 1.0000 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 39.0000 | 39.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 30.0000 | 30.0000 | 1.0000 | 
| **attributes** | 90.0000 | 90.0000 | 1.0000 | 
| **relationships** | 25.0000 | 25.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 66.0000 | Infinity | 0.0000 | 
| **attributes** | 201.0000 | 201.0000 | 1.0000 | 
| **relationships** | 75.0000 | Infinity | 0.0000 | 


### gen2

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 14.0000 | Infinity | 0.0000 | 
| **attributes** | 45.0000 | 45.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 16.0000 | Infinity | 0.0000 | 
| **attributes** | 50.0000 | 50.0000 | 1.0000 | 
| **relationships** | 18.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 15.0000 | Infinity | 0.0000 | 
| **attributes** | 43.0000 | 43.0000 | 1.0000 | 
| **relationships** | 18.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 12.0000 | Infinity | 0.0000 | 
| **attributes** | 38.0000 | 38.0000 | 1.0000 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 16.0000 | Infinity | 0.0000 | 
| **attributes** | 51.0000 | 51.0000 | 1.0000 | 
| **relationships** | 18.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 30.0000 | 30.0000 | 1.0000 | 
| **attributes** | 90.0000 | 90.0000 | 1.0000 | 
| **relationships** | 25.0000 | 25.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 73.0000 | Infinity | 0.0000 | 
| **attributes** | 227.0000 | 227.0000 | 1.0000 | 
| **relationships** | 82.0000 | Infinity | 0.0000 | 


### gen3

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 12.0000 | Infinity | 0.0000 | 
| **attributes** | 35.0000 | 35.0000 | 1.0000 | 
| **relationships** | 14.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 17.0000 | Infinity | 0.0000 | 
| **attributes** | 53.0000 | 53.0000 | 1.0000 | 
| **relationships** | 19.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 39.0000 | 39.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 12.0000 | Infinity | 0.0000 | 
| **attributes** | 38.0000 | 38.0000 | 1.0000 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 16.0000 | Infinity | 0.0000 | 
| **attributes** | 51.0000 | 51.0000 | 1.0000 | 
| **relationships** | 18.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 30.0000 | 30.0000 | 1.0000 | 
| **attributes** | 90.0000 | 90.0000 | 1.0000 | 
| **relationships** | 25.0000 | 25.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 70.0000 | Infinity | 0.0000 | 
| **attributes** | 216.0000 | 216.0000 | 1.0000 | 
| **relationships** | 79.0000 | Infinity | 0.0000 | 


### gen4

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 14.0000 | Infinity | 0.0000 | 
| **attributes** | 42.0000 | 42.0000 | 1.0000 | 
| **relationships** | 16.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 15.0000 | Infinity | 0.0000 | 
| **attributes** | 46.0000 | 46.0000 | 1.0000 | 
| **relationships** | 17.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 26.0000 | 26.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 12.0000 | Infinity | 0.0000 | 
| **attributes** | 38.0000 | 38.0000 | 1.0000 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 17.0000 | Infinity | 0.0000 | 
| **attributes** | 52.0000 | 52.0000 | 1.0000 | 
| **relationships** | 20.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 30.0000 | 30.0000 | 1.0000 | 
| **attributes** | 90.0000 | 90.0000 | 1.0000 | 
| **relationships** | 25.0000 | 25.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 67.0000 | Infinity | 0.0000 | 
| **attributes** | 204.0000 | 204.0000 | 1.0000 | 
| **relationships** | 76.0000 | Infinity | 0.0000 | 


### gen5

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 12.0000 | Infinity | 0.0000 | 
| **attributes** | 35.0000 | 35.0000 | 1.0000 | 
| **relationships** | 14.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 15.0000 | Infinity | 0.0000 | 
| **attributes** | 46.0000 | 46.0000 | 1.0000 | 
| **relationships** | 17.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 12.0000 | Infinity | 0.0000 | 
| **attributes** | 38.0000 | 38.0000 | 1.0000 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 12.0000 | Infinity | 0.0000 | 
| **attributes** | 38.0000 | 38.0000 | 1.0000 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 17.0000 | Infinity | 0.0000 | 
| **attributes** | 52.0000 | 52.0000 | 1.0000 | 
| **relationships** | 20.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 30.0000 | 30.0000 | 1.0000 | 
| **attributes** | 90.0000 | 90.0000 | 1.0000 | 
| **relationships** | 25.0000 | 25.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 68.0000 | Infinity | 0.0000 | 
| **attributes** | 209.0000 | 209.0000 | 1.0000 | 
| **relationships** | 77.0000 | Infinity | 0.0000 | 


### gen6

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 39.0000 | 39.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 16.0000 | Infinity | 0.0000 | 
| **attributes** | 49.0000 | 49.0000 | 1.0000 | 
| **relationships** | 18.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 39.0000 | 39.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 12.0000 | Infinity | 0.0000 | 
| **attributes** | 38.0000 | 38.0000 | 1.0000 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 17.0000 | Infinity | 0.0000 | 
| **attributes** | 52.0000 | 52.0000 | 1.0000 | 
| **relationships** | 20.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 30.0000 | 30.0000 | 1.0000 | 
| **attributes** | 90.0000 | 90.0000 | 1.0000 | 
| **relationships** | 25.0000 | 25.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 71.0000 | Infinity | 0.0000 | 
| **attributes** | 217.0000 | 217.0000 | 1.0000 | 
| **relationships** | 81.0000 | Infinity | 0.0000 | 


### ALL Gen 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 180.0000 | 180.0000 | 1.0000 | 
| **attributes** | 540.0000 | 540.0000 | 1.0000 | 
| **relationships** | 150.0000 | 150.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 415.0000 | Infinity | 0.0000 | 
| **attributes** | 1274.0000 | 1274.0000 | 1.0000 | 
| **relationships** | 470.0000 | Infinity | 0.0000 | 


## MyExpenses

### gen1

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 4.0000 | 0.7500 | 
| **attributes** | 10.0000 | 11.0000 | 0.9091 | 
| **relationships** | 2.0000 | 3.0000 | 0.6667 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 4.0000 | Infinity | 0.0000 | 
| **attributes** | 15.0000 | 15.0000 | 1.0000 | 
| **relationships** | 4.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Comment, Attribute: Comment.text, Relationship: ExpenseComment]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 32.0000 | 32.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 4.0000 | 0.7500 | 
| **attributes** | 10.0000 | 11.0000 | 0.9091 | 
| **relationships** | 2.0000 | 3.0000 | 0.6667 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 3.0000 | Infinity | 0.0000 | 
| **attributes** | 10.0000 | 10.0000 | 1.0000 | 
| **relationships** | 2.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Comment, Attribute: Comment.text, Relationship: ExpenseComment]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 32.0000 | 32.0000 | 1.0000 | 
| **relationships** | 12.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 18.0000 | 20.0000 | 0.9000 | 
| **attributes** | 53.0000 | 55.0000 | 0.9636 | 
| **relationships** | 13.0000 | 15.0000 | 0.8667 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 34.0000 | Infinity | 0.0000 | 
| **attributes** | 111.0000 | 111.0000 | 1.0000 | 
| **relationships** | 37.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Comment, Attribute: Comment.text, Relationship: ExpenseComment, Class: Comment, Attribute: Comment.text, Relationship: ExpenseComment]

### gen2

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 17.0000 | 17.0000 | 1.0000 | 
| **relationships** | 6.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 12.0000 | Infinity | 0.0000 | 
| **attributes** | 37.0000 | 37.0000 | 1.0000 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 5.0000 | Infinity | 0.0000 | 
| **attributes** | 12.0000 | 12.0000 | 1.0000 | 
| **relationships** | 4.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 30.0000 | 30.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 20.0000 | 20.0000 | 1.0000 | 
| **attributes** | 55.0000 | 55.0000 | 1.0000 | 
| **relationships** | 15.0000 | 15.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 40.0000 | Infinity | 0.0000 | 
| **attributes** | 118.0000 | 118.0000 | 1.0000 | 
| **relationships** | 42.0000 | Infinity | 0.0000 | 


### gen3

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 21.0000 | 21.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 38.0000 | 38.0000 | 1.0000 | 
| **relationships** | 14.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 5.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 33.0000 | 33.0000 | 1.0000 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 28.0000 | 28.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 20.0000 | 20.0000 | 1.0000 | 
| **attributes** | 55.0000 | 55.0000 | 1.0000 | 
| **relationships** | 15.0000 | 15.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 44.0000 | Infinity | 0.0000 | 
| **attributes** | 133.0000 | 133.0000 | 1.0000 | 
| **relationships** | 50.0000 | Infinity | 0.0000 | 


### gen4

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 21.0000 | 21.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 38.0000 | 38.0000 | 1.0000 | 
| **relationships** | 14.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 28.0000 | 28.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 28.0000 | 28.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 20.0000 | 20.0000 | 1.0000 | 
| **attributes** | 55.0000 | 55.0000 | 1.0000 | 
| **relationships** | 15.0000 | 15.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 44.0000 | Infinity | 0.0000 | 
| **attributes** | 133.0000 | 133.0000 | 1.0000 | 
| **relationships** | 50.0000 | Infinity | 0.0000 | 


### gen5

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 14.0000 | Infinity | 0.0000 | 
| **attributes** | 39.0000 | 39.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 28.0000 | 28.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 29.0000 | 29.0000 | 1.0000 | 
| **relationships** | 12.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 20.0000 | 20.0000 | 1.0000 | 
| **attributes** | 55.0000 | 55.0000 | 1.0000 | 
| **relationships** | 15.0000 | 15.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 47.0000 | Infinity | 0.0000 | 
| **attributes** | 136.0000 | 136.0000 | 1.0000 | 
| **relationships** | 53.0000 | Infinity | 0.0000 | 


### gen6

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 14.0000 | Infinity | 0.0000 | 
| **attributes** | 39.0000 | 39.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 5.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 28.0000 | 28.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 4.0000 | 1.0000 | 
| **attributes** | 11.0000 | 11.0000 | 1.0000 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 28.0000 | 28.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 20.0000 | 20.0000 | 1.0000 | 
| **attributes** | 55.0000 | 55.0000 | 1.0000 | 
| **relationships** | 15.0000 | 15.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 45.0000 | Infinity | 0.0000 | 
| **attributes** | 130.0000 | 130.0000 | 1.0000 | 
| **relationships** | 50.0000 | Infinity | 0.0000 | 


### ALL Gen 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 118.0000 | 120.0000 | 0.9833 | 
| **attributes** | 328.0000 | 330.0000 | 0.9939 | 
| **relationships** | 88.0000 | 90.0000 | 0.9778 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 254.0000 | Infinity | 0.0000 | 
| **attributes** | 761.0000 | 761.0000 | 1.0000 | 
| **relationships** | 282.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Comment, Attribute: Comment.text, Relationship: ExpenseComment, Class: Comment, Attribute: Comment.text, Relationship: ExpenseComment]

## VideoClub

### gen1

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 16.0000 | 16.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 14.0000 | 14.0000 | 1.0000 | 
| **relationships** | 6.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 25.0000 | 30.0000 | 0.8333 | 
| **attributes** | 50.0000 | 60.0000 | 0.8333 | 
| **relationships** | 15.0000 | 15.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 44.0000 | Infinity | 0.0000 | 
| **attributes** | 79.0000 | 79.0000 | 1.0000 | 
| **relationships** | 39.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

### gen2

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 19.0000 | 19.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 16.0000 | 16.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 15.0000 | 15.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 20.0000 | 20.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 25.0000 | 30.0000 | 0.8333 | 
| **attributes** | 50.0000 | 60.0000 | 0.8333 | 
| **relationships** | 15.0000 | 15.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 49.0000 | Infinity | 0.0000 | 
| **attributes** | 88.0000 | 88.0000 | 1.0000 | 
| **relationships** | 40.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

### gen3

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 21.0000 | 21.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 12.0000 | Infinity | 0.0000 | 
| **attributes** | 21.0000 | 21.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 19.0000 | 19.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 25.0000 | 30.0000 | 0.8333 | 
| **attributes** | 50.0000 | 60.0000 | 0.8333 | 
| **relationships** | 15.0000 | 15.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 54.0000 | Infinity | 0.0000 | 
| **attributes** | 96.0000 | 96.0000 | 1.0000 | 
| **relationships** | 47.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

### gen4

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 21.0000 | 21.0000 | 1.0000 | 
| **relationships** | 12.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 12.0000 | Infinity | 0.0000 | 
| **attributes** | 21.0000 | 21.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 25.0000 | 30.0000 | 0.8333 | 
| **attributes** | 50.0000 | 60.0000 | 0.8333 | 
| **relationships** | 15.0000 | 15.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 55.0000 | Infinity | 0.0000 | 
| **attributes** | 95.0000 | 95.0000 | 1.0000 | 
| **relationships** | 48.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

### gen5

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 18.0000 | 18.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 13.0000 | Infinity | 0.0000 | 
| **attributes** | 23.0000 | 23.0000 | 1.0000 | 
| **relationships** | 12.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 6.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 16.0000 | Infinity | 0.0000 | 
| **attributes** | 28.0000 | 28.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 12.0000 | Infinity | 0.0000 | 
| **attributes** | 20.0000 | 20.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 25.0000 | 30.0000 | 0.8333 | 
| **attributes** | 50.0000 | 60.0000 | 0.8333 | 
| **relationships** | 15.0000 | 15.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 58.0000 | Infinity | 0.0000 | 
| **attributes** | 102.0000 | 102.0000 | 1.0000 | 
| **relationships** | 48.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

### gen6

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 21.0000 | 21.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 16.0000 | Infinity | 0.0000 | 
| **attributes** | 27.0000 | 27.0000 | 1.0000 | 
| **relationships** | 14.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 13.0000 | 13.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 15.0000 | Infinity | 0.0000 | 
| **attributes** | 26.0000 | 26.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 10.0000 | 12.0000 | 0.8333 | 
| **relationships** | 3.0000 | 3.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 12.0000 | Infinity | 0.0000 | 
| **attributes** | 20.0000 | 20.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 25.0000 | 30.0000 | 0.8333 | 
| **attributes** | 50.0000 | 60.0000 | 0.8333 | 
| **relationships** | 15.0000 | 15.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 61.0000 | Infinity | 0.0000 | 
| **attributes** | 107.0000 | 107.0000 | 1.0000 | 
| **relationships** | 52.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

### ALL Gen 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 150.0000 | 180.0000 | 0.8333 | 
| **attributes** | 300.0000 | 360.0000 | 0.8333 | 
| **relationships** | 90.0000 | 90.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 321.0000 | Infinity | 0.0000 | 
| **attributes** | 567.0000 | 567.0000 | 1.0000 | 
| **relationships** | 274.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies]

## Football

### gen1

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 37.0000 | 37.0000 | 1.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 24.0000 | Infinity | 0.0000 | 
| **attributes** | 56.0000 | 56.0000 | 1.0000 | 
| **relationships** | 24.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 37.0000 | 37.0000 | 1.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 39.0000 | Infinity | 0.0000 | 
| **attributes** | 88.0000 | 88.0000 | 1.0000 | 
| **relationships** | 42.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 13.0000 | 16.0000 | 0.8125 | 
| **attributes** | 32.0000 | 37.0000 | 0.8649 | 
| **relationships** | 14.0000 | 18.0000 | 0.7778 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 21.0000 | Infinity | 0.0000 | 
| **attributes** | 51.0000 | 51.0000 | 1.0000 | 
| **relationships** | 23.0000 | Infinity | 0.0000 | 


Uncovered: [Class: MatchEvent, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchEvent, Relationship: MatchMatchNote]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 37.0000 | 37.0000 | 1.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 33.0000 | Infinity | 0.0000 | 
| **attributes** | 79.0000 | 79.0000 | 1.0000 | 
| **relationships** | 35.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 37.0000 | 37.0000 | 1.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 27.0000 | Infinity | 0.0000 | 
| **attributes** | 64.0000 | 64.0000 | 1.0000 | 
| **relationships** | 29.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 77.0000 | 80.0000 | 0.9625 | 
| **attributes** | 180.0000 | 185.0000 | 0.9730 | 
| **relationships** | 86.0000 | 90.0000 | 0.9556 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 144.0000 | Infinity | 0.0000 | 
| **attributes** | 338.0000 | 338.0000 | 1.0000 | 
| **relationships** | 153.0000 | Infinity | 0.0000 | 


Uncovered: [Class: MatchEvent, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchEvent, Relationship: MatchMatchNote]

### gen2

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 37.0000 | 37.0000 | 1.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 22.0000 | Infinity | 0.0000 | 
| **attributes** | 50.0000 | 50.0000 | 1.0000 | 
| **relationships** | 23.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 15.0000 | 16.0000 | 0.9375 | 
| **attributes** | 36.0000 | 37.0000 | 0.9730 | 
| **relationships** | 16.0000 | 18.0000 | 0.8889 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 29.0000 | Infinity | 0.0000 | 
| **attributes** | 69.0000 | 69.0000 | 1.0000 | 
| **relationships** | 30.0000 | Infinity | 0.0000 | 


Uncovered: [Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Relationship: TrainingFailded, Relationship: FailedPlayer]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 15.0000 | 16.0000 | 0.9375 | 
| **attributes** | 35.0000 | 37.0000 | 0.9459 | 
| **relationships** | 17.0000 | 18.0000 | 0.9444 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 31.0000 | Infinity | 0.0000 | 
| **attributes** | 69.0000 | 69.0000 | 1.0000 | 
| **relationships** | 32.0000 | Infinity | 0.0000 | 


Uncovered: [Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: MatchMatchNote]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 37.0000 | 37.0000 | 1.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 29.0000 | Infinity | 0.0000 | 
| **attributes** | 66.0000 | 66.0000 | 1.0000 | 
| **relationships** | 31.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 37.0000 | 37.0000 | 1.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 30.0000 | Infinity | 0.0000 | 
| **attributes** | 70.0000 | 70.0000 | 1.0000 | 
| **relationships** | 32.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 78.0000 | 80.0000 | 0.9750 | 
| **attributes** | 182.0000 | 185.0000 | 0.9838 | 
| **relationships** | 87.0000 | 90.0000 | 0.9667 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 141.0000 | Infinity | 0.0000 | 
| **attributes** | 324.0000 | 324.0000 | 1.0000 | 
| **relationships** | 148.0000 | Infinity | 0.0000 | 


Uncovered: [Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Relationship: TrainingFailded, Relationship: FailedPlayer, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: MatchMatchNote]

### gen3

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 15.0000 | 16.0000 | 0.9375 | 
| **attributes** | 35.0000 | 37.0000 | 0.9459 | 
| **relationships** | 17.0000 | 18.0000 | 0.9444 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 23.0000 | Infinity | 0.0000 | 
| **attributes** | 52.0000 | 52.0000 | 1.0000 | 
| **relationships** | 23.0000 | Infinity | 0.0000 | 


Uncovered: [Class: MatchEvent, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Relationship: MatchMatchEvent]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 37.0000 | 37.0000 | 1.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 32.0000 | Infinity | 0.0000 | 
| **attributes** | 72.0000 | 72.0000 | 1.0000 | 
| **relationships** | 35.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 14.0000 | 16.0000 | 0.8750 | 
| **attributes** | 34.0000 | 37.0000 | 0.9189 | 
| **relationships** | 15.0000 | 18.0000 | 0.8333 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 22.0000 | Infinity | 0.0000 | 
| **attributes** | 54.0000 | 54.0000 | 1.0000 | 
| **relationships** | 22.0000 | Infinity | 0.0000 | 


Uncovered: [Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchNote]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 15.0000 | 16.0000 | 0.9375 | 
| **attributes** | 36.0000 | 37.0000 | 0.9730 | 
| **relationships** | 16.0000 | 18.0000 | 0.8889 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 36.0000 | Infinity | 0.0000 | 
| **attributes** | 88.0000 | 88.0000 | 1.0000 | 
| **relationships** | 37.0000 | Infinity | 0.0000 | 


Uncovered: [Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Relationship: TrainingFailded, Relationship: FailedPlayer]

#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 37.0000 | 37.0000 | 1.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 30.0000 | Infinity | 0.0000 | 
| **attributes** | 70.0000 | 70.0000 | 1.0000 | 
| **relationships** | 32.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 76.0000 | 80.0000 | 0.9500 | 
| **attributes** | 179.0000 | 185.0000 | 0.9676 | 
| **relationships** | 84.0000 | 90.0000 | 0.9333 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 143.0000 | Infinity | 0.0000 | 
| **attributes** | 336.0000 | 336.0000 | 1.0000 | 
| **relationships** | 149.0000 | Infinity | 0.0000 | 


Uncovered: [Class: MatchEvent, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Relationship: MatchMatchEvent, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchNote, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Relationship: TrainingFailded, Relationship: FailedPlayer]

### gen4

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 37.0000 | 37.0000 | 1.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 25.0000 | Infinity | 0.0000 | 
| **attributes** | 56.0000 | 56.0000 | 1.0000 | 
| **relationships** | 25.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 15.0000 | 16.0000 | 0.9375 | 
| **attributes** | 0.0000 | 37.0000 | 0.0000 | 
| **relationships** | 16.0000 | 18.0000 | 0.8889 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 31.0000 | Infinity | 0.0000 | 
| **attributes** | 0.0000 | 71.0000 | 0.0000 | 
| **relationships** | 33.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Relationship: TrainingFailded, Relationship: FailedPlayer]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 13.0000 | 16.0000 | 0.8125 | 
| **attributes** | 32.0000 | 37.0000 | 0.8649 | 
| **relationships** | 14.0000 | 18.0000 | 0.7778 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 23.0000 | Infinity | 0.0000 | 
| **attributes** | 57.0000 | 57.0000 | 1.0000 | 
| **relationships** | 23.0000 | Infinity | 0.0000 | 


Uncovered: [Class: MatchEvent, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchEvent, Relationship: MatchMatchNote]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 37.0000 | 37.0000 | 1.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 35.0000 | Infinity | 0.0000 | 
| **attributes** | 80.0000 | 80.0000 | 1.0000 | 
| **relationships** | 38.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 37.0000 | 37.0000 | 1.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 30.0000 | Infinity | 0.0000 | 
| **attributes** | 70.0000 | 70.0000 | 1.0000 | 
| **relationships** | 32.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 76.0000 | 80.0000 | 0.9500 | 
| **attributes** | 143.0000 | 185.0000 | 0.7730 | 
| **relationships** | 84.0000 | 90.0000 | 0.9333 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 144.0000 | Infinity | 0.0000 | 
| **attributes** | 263.0000 | 334.0000 | 0.7874 | 
| **relationships** | 151.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Relationship: TrainingFailded, Relationship: FailedPlayer, Class: MatchEvent, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchEvent, Relationship: MatchMatchNote]

### gen5

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 0.0000 | 37.0000 | 0.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 24.0000 | Infinity | 0.0000 | 
| **attributes** | 0.0000 | 53.0000 | 0.0000 | 
| **relationships** | 25.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 15.0000 | 16.0000 | 0.9375 | 
| **attributes** | 0.0000 | 37.0000 | 0.0000 | 
| **relationships** | 16.0000 | 18.0000 | 0.8889 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 29.0000 | Infinity | 0.0000 | 
| **attributes** | 0.0000 | 69.0000 | 0.0000 | 
| **relationships** | 29.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Relationship: TrainingFailded, Relationship: FailedPlayer]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 13.0000 | 16.0000 | 0.8125 | 
| **attributes** | 32.0000 | 37.0000 | 0.8649 | 
| **relationships** | 14.0000 | 18.0000 | 0.7778 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 25.0000 | Infinity | 0.0000 | 
| **attributes** | 62.0000 | 62.0000 | 1.0000 | 
| **relationships** | 25.0000 | Infinity | 0.0000 | 


Uncovered: [Class: MatchEvent, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchEvent, Relationship: MatchMatchNote]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 37.0000 | 37.0000 | 1.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 38.0000 | Infinity | 0.0000 | 
| **attributes** | 91.0000 | 91.0000 | 1.0000 | 
| **relationships** | 40.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 0.0000 | 37.0000 | 0.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 27.0000 | Infinity | 0.0000 | 
| **attributes** | 0.0000 | 63.0000 | 0.0000 | 
| **relationships** | 29.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number]

#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 76.0000 | 80.0000 | 0.9500 | 
| **attributes** | 69.0000 | 185.0000 | 0.3730 | 
| **relationships** | 84.0000 | 90.0000 | 0.9333 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 143.0000 | Infinity | 0.0000 | 
| **attributes** | 153.0000 | 338.0000 | 0.4527 | 
| **relationships** | 148.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Relationship: TrainingFailded, Relationship: FailedPlayer, Class: MatchEvent, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchEvent, Relationship: MatchMatchNote, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number]

### gen6

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 0.0000 | 37.0000 | 0.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 26.0000 | Infinity | 0.0000 | 
| **attributes** | 0.0000 | 58.0000 | 0.0000 | 
| **relationships** | 26.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 14.0000 | 16.0000 | 0.8750 | 
| **attributes** | 0.0000 | 37.0000 | 0.0000 | 
| **relationships** | 15.0000 | 18.0000 | 0.8333 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 32.0000 | Infinity | 0.0000 | 
| **attributes** | 0.0000 | 75.0000 | 0.0000 | 
| **relationships** | 32.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Class: PlayerNotes, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: PlayerPlayerNotes]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 14.0000 | 16.0000 | 0.8750 | 
| **attributes** | 34.0000 | 37.0000 | 0.9189 | 
| **relationships** | 15.0000 | 18.0000 | 0.8333 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 25.0000 | Infinity | 0.0000 | 
| **attributes** | 59.0000 | 59.0000 | 1.0000 | 
| **relationships** | 25.0000 | Infinity | 0.0000 | 


Uncovered: [Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchNote]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 0.0000 | 37.0000 | 0.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 37.0000 | Infinity | 0.0000 | 
| **attributes** | 0.0000 | 88.0000 | 0.0000 | 
| **relationships** | 39.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number]

#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 16.0000 | 16.0000 | 1.0000 | 
| **attributes** | 0.0000 | 37.0000 | 0.0000 | 
| **relationships** | 18.0000 | 18.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 29.0000 | Infinity | 0.0000 | 
| **attributes** | 0.0000 | 68.0000 | 0.0000 | 
| **relationships** | 31.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number]

#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 76.0000 | 80.0000 | 0.9500 | 
| **attributes** | 34.0000 | 185.0000 | 0.1838 | 
| **relationships** | 84.0000 | 90.0000 | 0.9333 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 149.0000 | Infinity | 0.0000 | 
| **attributes** | 59.0000 | 348.0000 | 0.1695 | 
| **relationships** | 153.0000 | Infinity | 0.0000 | 


Uncovered: [Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Class: PlayerNotes, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: PlayerPlayerNotes, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchNote, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number]

### ALL Gen 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 459.0000 | 480.0000 | 0.9563 | 
| **attributes** | 787.0000 | 1110.0000 | 0.7090 | 
| **relationships** | 509.0000 | 540.0000 | 0.9426 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 864.0000 | Infinity | 0.0000 | 
| **attributes** | 1473.0000 | 2018.0000 | 0.7299 | 
| **relationships** | 902.0000 | Infinity | 0.0000 | 


Uncovered: [Class: MatchEvent, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchEvent, Relationship: MatchMatchNote, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Relationship: TrainingFailded, Relationship: FailedPlayer, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: MatchMatchNote, Class: MatchEvent, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Relationship: MatchMatchEvent, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchNote, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Relationship: TrainingFailded, Relationship: FailedPlayer, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Relationship: TrainingFailded, Relationship: FailedPlayer, Class: MatchEvent, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchEvent, Relationship: MatchMatchNote, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Relationship: TrainingFailded, Relationship: FailedPlayer, Class: MatchEvent, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchEvent, Relationship: MatchMatchNote, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Class: PlayerNotes, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: PlayerPlayerNotes, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchNote, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number]

## HotelManagement

### gen1

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 7.0000 | 0.8571 | 
| **attributes** | 18.0000 | 22.0000 | 0.8182 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 30.0000 | 30.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


Uncovered: [Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 15.0000 | Infinity | 0.0000 | 
| **attributes** | 44.0000 | 44.0000 | 1.0000 | 
| **relationships** | 16.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 31.0000 | 31.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 24.0000 | 24.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 14.0000 | Infinity | 0.0000 | 
| **attributes** | 44.0000 | 44.0000 | 1.0000 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 34.0000 | 35.0000 | 0.9714 | 
| **attributes** | 106.0000 | 110.0000 | 0.9636 | 
| **relationships** | 30.0000 | 30.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 56.0000 | Infinity | 0.0000 | 
| **attributes** | 173.0000 | 173.0000 | 1.0000 | 
| **relationships** | 54.0000 | Infinity | 0.0000 | 


Uncovered: [Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms]

### gen2

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 7.0000 | 0.8571 | 
| **attributes** | 18.0000 | 22.0000 | 0.8182 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 26.0000 | 26.0000 | 1.0000 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


Uncovered: [Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 33.0000 | 33.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 33.0000 | 33.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 33.0000 | 33.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 14.0000 | Infinity | 0.0000 | 
| **attributes** | 41.0000 | 41.0000 | 1.0000 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 34.0000 | 35.0000 | 0.9714 | 
| **attributes** | 106.0000 | 110.0000 | 0.9636 | 
| **relationships** | 30.0000 | 30.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 57.0000 | Infinity | 0.0000 | 
| **attributes** | 166.0000 | 166.0000 | 1.0000 | 
| **relationships** | 62.0000 | Infinity | 0.0000 | 


Uncovered: [Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms]

### gen3

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 7.0000 | 0.8571 | 
| **attributes** | 18.0000 | 22.0000 | 0.8182 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 24.0000 | 24.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


Uncovered: [Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 33.0000 | 33.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 31.0000 | 31.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 33.0000 | 33.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 14.0000 | Infinity | 0.0000 | 
| **attributes** | 41.0000 | 41.0000 | 1.0000 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 34.0000 | 35.0000 | 0.9714 | 
| **attributes** | 106.0000 | 110.0000 | 0.9636 | 
| **relationships** | 30.0000 | 30.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 55.0000 | Infinity | 0.0000 | 
| **attributes** | 162.0000 | 162.0000 | 1.0000 | 
| **relationships** | 55.0000 | Infinity | 0.0000 | 


Uncovered: [Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms]

### gen4

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 7.0000 | 0.8571 | 
| **attributes** | 18.0000 | 22.0000 | 0.8182 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


Uncovered: [Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 15.0000 | Infinity | 0.0000 | 
| **attributes** | 44.0000 | 44.0000 | 1.0000 | 
| **relationships** | 16.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 27.0000 | 27.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 30.0000 | 30.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 34.0000 | 35.0000 | 0.9714 | 
| **attributes** | 106.0000 | 110.0000 | 0.9636 | 
| **relationships** | 30.0000 | 30.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 48.0000 | Infinity | 0.0000 | 
| **attributes** | 145.0000 | 145.0000 | 1.0000 | 
| **relationships** | 47.0000 | Infinity | 0.0000 | 


Uncovered: [Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms]

### gen5

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 7.0000 | 0.8571 | 
| **attributes** | 18.0000 | 22.0000 | 0.8182 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


Uncovered: [Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 12.0000 | Infinity | 0.0000 | 
| **attributes** | 38.0000 | 38.0000 | 1.0000 | 
| **relationships** | 12.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 33.0000 | 33.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 14.0000 | Infinity | 0.0000 | 
| **attributes** | 41.0000 | 41.0000 | 1.0000 | 
| **relationships** | 13.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 34.0000 | 35.0000 | 0.9714 | 
| **attributes** | 106.0000 | 110.0000 | 0.9636 | 
| **relationships** | 30.0000 | 30.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 56.0000 | Infinity | 0.0000 | 
| **attributes** | 170.0000 | 170.0000 | 1.0000 | 
| **relationships** | 54.0000 | Infinity | 0.0000 | 


Uncovered: [Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms]

### gen6

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 7.0000 | 0.8571 | 
| **attributes** | 18.0000 | 22.0000 | 0.8182 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 28.0000 | 28.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


Uncovered: [Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 15.0000 | Infinity | 0.0000 | 
| **attributes** | 44.0000 | 44.0000 | 1.0000 | 
| **relationships** | 16.0000 | Infinity | 0.0000 | 


#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 7.0000 | 0.8571 | 
| **attributes** | 20.0000 | 22.0000 | 0.9091 | 
| **relationships** | 5.0000 | 6.0000 | 0.8333 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 20.0000 | 20.0000 | 1.0000 | 
| **relationships** | 5.0000 | Infinity | 0.0000 | 


Uncovered: [Class: RoomExtra, Attribute: RoomExtra.price, Attribute: RoomExtra.description, Relationship: RoomReservationExtras]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 11.0000 | Infinity | 0.0000 | 
| **attributes** | 33.0000 | 33.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 7.0000 | 7.0000 | 1.0000 | 
| **attributes** | 22.0000 | 22.0000 | 1.0000 | 
| **relationships** | 6.0000 | 6.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 10.0000 | Infinity | 0.0000 | 
| **attributes** | 30.0000 | 30.0000 | 1.0000 | 
| **relationships** | 8.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 33.0000 | 35.0000 | 0.9429 | 
| **attributes** | 104.0000 | 110.0000 | 0.9455 | 
| **relationships** | 29.0000 | 30.0000 | 0.9667 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 53.0000 | Infinity | 0.0000 | 
| **attributes** | 155.0000 | 155.0000 | 1.0000 | 
| **relationships** | 49.0000 | Infinity | 0.0000 | 


Uncovered: [Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms, Class: RoomExtra, Attribute: RoomExtra.price, Attribute: RoomExtra.description, Relationship: RoomReservationExtras]

### ALL Gen 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 203.0000 | 210.0000 | 0.9667 | 
| **attributes** | 634.0000 | 660.0000 | 0.9606 | 
| **relationships** | 179.0000 | 180.0000 | 0.9944 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 325.0000 | Infinity | 0.0000 | 
| **attributes** | 971.0000 | 971.0000 | 1.0000 | 
| **relationships** | 321.0000 | Infinity | 0.0000 | 


Uncovered: [Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms, Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms, Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms, Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms, Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms, Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms, Class: RoomExtra, Attribute: RoomExtra.price, Attribute: RoomExtra.description, Relationship: RoomReservationExtras]

## VehicleRental

### gen1

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 3.0000 | 6.0000 | 0.5000 | 
| **attributes** | 16.0000 | 36.0000 | 0.4444 | 
| **relationships** | 2.0000 | 5.0000 | 0.4000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 3.0000 | Infinity | 0.0000 | 
| **attributes** | 16.0000 | 16.0000 | 1.0000 | 
| **relationships** | 2.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Vehicle, Attribute: Vehicle.id, Attribute: Vehicle.registrationState, Attribute: Vehicle.licensePlateNumber, Attribute: Vehicle.vehicleTypeCode, Attribute: Vehicle.registrationLastMaintenanceDate, Attribute: Vehicle.expirationDate, Class: Truck, Attribute: Truck.id, Attribute: Truck.registrationState, Attribute: Truck.licensePlateNumber, Attribute: Truck.vehicleTypeCode, Attribute: Truck.registrationLastMaintenanceDate, Attribute: Truck.expirationDate, Attribute: Truck.odometerReading, Attribute: Truck.gasTankCapacity, Attribute: Truck.workingRadio, Attribute: Truck.mileage, Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber, Relationship: RentalOfficeVehicle, Relationship: RentalOfficeRentalAgreementDrop, Relationship: RentalAgreementVehicle]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 32.0000 | 36.0000 | 0.8889 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 5.0000 | Infinity | 0.0000 | 
| **attributes** | 32.0000 | 32.0000 | 1.0000 | 
| **relationships** | 6.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 29.0000 | 36.0000 | 0.8056 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 5.0000 | Infinity | 0.0000 | 
| **attributes** | 29.0000 | 29.0000 | 1.0000 | 
| **relationships** | 6.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 42.0000 | 42.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 48.0000 | 48.0000 | 1.0000 | 
| **relationships** | 14.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 25.0000 | 30.0000 | 0.8333 | 
| **attributes** | 149.0000 | 180.0000 | 0.8278 | 
| **relationships** | 22.0000 | 25.0000 | 0.8800 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 28.0000 | Infinity | 0.0000 | 
| **attributes** | 167.0000 | 167.0000 | 1.0000 | 
| **relationships** | 38.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Vehicle, Attribute: Vehicle.id, Attribute: Vehicle.registrationState, Attribute: Vehicle.licensePlateNumber, Attribute: Vehicle.vehicleTypeCode, Attribute: Vehicle.registrationLastMaintenanceDate, Attribute: Vehicle.expirationDate, Class: Truck, Attribute: Truck.id, Attribute: Truck.registrationState, Attribute: Truck.licensePlateNumber, Attribute: Truck.vehicleTypeCode, Attribute: Truck.registrationLastMaintenanceDate, Attribute: Truck.expirationDate, Attribute: Truck.odometerReading, Attribute: Truck.gasTankCapacity, Attribute: Truck.workingRadio, Attribute: Truck.mileage, Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber, Relationship: RentalOfficeVehicle, Relationship: RentalOfficeRentalAgreementDrop, Relationship: RentalAgreementVehicle, Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate]

### gen2

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 29.0000 | 36.0000 | 0.8056 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 5.0000 | Infinity | 0.0000 | 
| **attributes** | 29.0000 | 29.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 29.0000 | 36.0000 | 0.8056 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 35.0000 | 35.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 32.0000 | 36.0000 | 0.8889 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 44.0000 | 44.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 42.0000 | 42.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 54.0000 | 54.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 27.0000 | 30.0000 | 0.9000 | 
| **attributes** | 162.0000 | 180.0000 | 0.9000 | 
| **relationships** | 25.0000 | 25.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 34.0000 | Infinity | 0.0000 | 
| **attributes** | 204.0000 | 204.0000 | 1.0000 | 
| **relationships** | 53.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate, Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber]

### gen3

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 6.0000 | 0.6667 | 
| **attributes** | 19.0000 | 36.0000 | 0.5278 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 29.0000 | 29.0000 | 1.0000 | 
| **relationships** | 7.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Truck, Attribute: Truck.id, Attribute: Truck.registrationState, Attribute: Truck.licensePlateNumber, Attribute: Truck.vehicleTypeCode, Attribute: Truck.registrationLastMaintenanceDate, Attribute: Truck.expirationDate, Attribute: Truck.odometerReading, Attribute: Truck.gasTankCapacity, Attribute: Truck.workingRadio, Attribute: Truck.mileage, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 32.0000 | 36.0000 | 0.8889 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 5.0000 | Infinity | 0.0000 | 
| **attributes** | 32.0000 | 32.0000 | 1.0000 | 
| **relationships** | 6.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 29.0000 | 36.0000 | 0.8056 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 5.0000 | Infinity | 0.0000 | 
| **attributes** | 29.0000 | 29.0000 | 1.0000 | 
| **relationships** | 6.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate]

#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 42.0000 | 42.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 54.0000 | 54.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 26.0000 | 30.0000 | 0.8667 | 
| **attributes** | 152.0000 | 180.0000 | 0.8444 | 
| **relationships** | 25.0000 | 25.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 32.0000 | Infinity | 0.0000 | 
| **attributes** | 186.0000 | 186.0000 | 1.0000 | 
| **relationships** | 44.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Truck, Attribute: Truck.id, Attribute: Truck.registrationState, Attribute: Truck.licensePlateNumber, Attribute: Truck.vehicleTypeCode, Attribute: Truck.registrationLastMaintenanceDate, Attribute: Truck.expirationDate, Attribute: Truck.odometerReading, Attribute: Truck.gasTankCapacity, Attribute: Truck.workingRadio, Attribute: Truck.mileage, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate, Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate]

### gen4

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 30.0000 | 36.0000 | 0.8333 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 9.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Vehicle, Attribute: Vehicle.id, Attribute: Vehicle.registrationState, Attribute: Vehicle.licensePlateNumber, Attribute: Vehicle.vehicleTypeCode, Attribute: Vehicle.registrationLastMaintenanceDate, Attribute: Vehicle.expirationDate]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 4.0000 | 6.0000 | 0.6667 | 
| **attributes** | 23.0000 | 36.0000 | 0.6389 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 4.0000 | Infinity | 0.0000 | 
| **attributes** | 23.0000 | 23.0000 | 1.0000 | 
| **relationships** | 5.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Vehicle, Attribute: Vehicle.id, Attribute: Vehicle.registrationState, Attribute: Vehicle.licensePlateNumber, Attribute: Vehicle.vehicleTypeCode, Attribute: Vehicle.registrationLastMaintenanceDate, Attribute: Vehicle.expirationDate, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 52.0000 | 52.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 42.0000 | 42.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 54.0000 | 54.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 27.0000 | 30.0000 | 0.9000 | 
| **attributes** | 161.0000 | 180.0000 | 0.8944 | 
| **relationships** | 25.0000 | 25.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 34.0000 | Infinity | 0.0000 | 
| **attributes** | 207.0000 | 207.0000 | 1.0000 | 
| **relationships** | 50.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Vehicle, Attribute: Vehicle.id, Attribute: Vehicle.registrationState, Attribute: Vehicle.licensePlateNumber, Attribute: Vehicle.vehicleTypeCode, Attribute: Vehicle.registrationLastMaintenanceDate, Attribute: Vehicle.expirationDate, Class: Vehicle, Attribute: Vehicle.id, Attribute: Vehicle.registrationState, Attribute: Vehicle.licensePlateNumber, Attribute: Vehicle.vehicleTypeCode, Attribute: Vehicle.registrationLastMaintenanceDate, Attribute: Vehicle.expirationDate, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate]

### gen5

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 42.0000 | 42.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 32.0000 | 36.0000 | 0.8889 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 38.0000 | 38.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 52.0000 | 52.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 42.0000 | 42.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 54.0000 | 54.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 29.0000 | 30.0000 | 0.9667 | 
| **attributes** | 176.0000 | 180.0000 | 0.9778 | 
| **relationships** | 25.0000 | 25.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 37.0000 | Infinity | 0.0000 | 
| **attributes** | 228.0000 | 228.0000 | 1.0000 | 
| **relationships** | 56.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber]

### gen6

#### invalid

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 30.0000 | 36.0000 | 0.8333 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 5.0000 | Infinity | 0.0000 | 
| **attributes** | 30.0000 | 30.0000 | 1.0000 | 
| **relationships** | 6.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Vehicle, Attribute: Vehicle.id, Attribute: Vehicle.registrationState, Attribute: Vehicle.licensePlateNumber, Attribute: Vehicle.vehicleTypeCode, Attribute: Vehicle.registrationLastMaintenanceDate, Attribute: Vehicle.expirationDate]

#### edge

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 5.0000 | 6.0000 | 0.8333 | 
| **attributes** | 29.0000 | 36.0000 | 0.8056 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 6.0000 | Infinity | 0.0000 | 
| **attributes** | 35.0000 | 35.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate]

#### boundary

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 8.0000 | Infinity | 0.0000 | 
| **attributes** | 52.0000 | 52.0000 | 1.0000 | 
| **relationships** | 11.0000 | Infinity | 0.0000 | 


#### baseline

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 7.0000 | Infinity | 0.0000 | 
| **attributes** | 42.0000 | 42.0000 | 1.0000 | 
| **relationships** | 10.0000 | Infinity | 0.0000 | 


#### complex

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 6.0000 | 6.0000 | 1.0000 | 
| **attributes** | 36.0000 | 36.0000 | 1.0000 | 
| **relationships** | 5.0000 | 5.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 9.0000 | Infinity | 0.0000 | 
| **attributes** | 54.0000 | 54.0000 | 1.0000 | 
| **relationships** | 15.0000 | Infinity | 0.0000 | 


#### ALL Categories 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 28.0000 | 30.0000 | 0.9333 | 
| **attributes** | 167.0000 | 180.0000 | 0.9278 | 
| **relationships** | 25.0000 | 25.0000 | 1.0000 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 35.0000 | Infinity | 0.0000 | 
| **attributes** | 213.0000 | 213.0000 | 1.0000 | 
| **relationships** | 52.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Vehicle, Attribute: Vehicle.id, Attribute: Vehicle.registrationState, Attribute: Vehicle.licensePlateNumber, Attribute: Vehicle.vehicleTypeCode, Attribute: Vehicle.registrationLastMaintenanceDate, Attribute: Vehicle.expirationDate, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate]

### ALL Gen 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 162.0000 | 180.0000 | 0.9000 | 
| **attributes** | 967.0000 | 1080.0000 | 0.8954 | 
| **relationships** | 147.0000 | 150.0000 | 0.9800 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 200.0000 | Infinity | 0.0000 | 
| **attributes** | 1205.0000 | 1205.0000 | 1.0000 | 
| **relationships** | 293.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Vehicle, Attribute: Vehicle.id, Attribute: Vehicle.registrationState, Attribute: Vehicle.licensePlateNumber, Attribute: Vehicle.vehicleTypeCode, Attribute: Vehicle.registrationLastMaintenanceDate, Attribute: Vehicle.expirationDate, Class: Truck, Attribute: Truck.id, Attribute: Truck.registrationState, Attribute: Truck.licensePlateNumber, Attribute: Truck.vehicleTypeCode, Attribute: Truck.registrationLastMaintenanceDate, Attribute: Truck.expirationDate, Attribute: Truck.odometerReading, Attribute: Truck.gasTankCapacity, Attribute: Truck.workingRadio, Attribute: Truck.mileage, Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber, Relationship: RentalOfficeVehicle, Relationship: RentalOfficeRentalAgreementDrop, Relationship: RentalAgreementVehicle, Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate, Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber, Class: Truck, Attribute: Truck.id, Attribute: Truck.registrationState, Attribute: Truck.licensePlateNumber, Attribute: Truck.vehicleTypeCode, Attribute: Truck.registrationLastMaintenanceDate, Attribute: Truck.expirationDate, Attribute: Truck.odometerReading, Attribute: Truck.gasTankCapacity, Attribute: Truck.workingRadio, Attribute: Truck.mileage, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate, Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate, Class: Vehicle, Attribute: Vehicle.id, Attribute: Vehicle.registrationState, Attribute: Vehicle.licensePlateNumber, Attribute: Vehicle.vehicleTypeCode, Attribute: Vehicle.registrationLastMaintenanceDate, Attribute: Vehicle.expirationDate, Class: Vehicle, Attribute: Vehicle.id, Attribute: Vehicle.registrationState, Attribute: Vehicle.licensePlateNumber, Attribute: Vehicle.vehicleTypeCode, Attribute: Vehicle.registrationLastMaintenanceDate, Attribute: Vehicle.expirationDate, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate, Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber, Class: Vehicle, Attribute: Vehicle.id, Attribute: Vehicle.registrationState, Attribute: Vehicle.licensePlateNumber, Attribute: Vehicle.vehicleTypeCode, Attribute: Vehicle.registrationLastMaintenanceDate, Attribute: Vehicle.expirationDate, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate]

# Coverage 

| Model Coverage | instantiated | defined | coverage |
|---|---|---|---|
| **classes** | 2078.0000 | 2310.0000 | 0.8996 | 
| **attributes** | 5484.0000 | 6480.0000 | 0.8463 | 
| **relationships** | 1994.0000 | 2100.0000 | 0.9495 | 


| Instantiation Stats | total instantiated | total possible | ratio |
|---|---|---|---|
| **classes** | 4253.0000 | Infinity | 0.0000 | 
| **attributes** | 10221.0000 | 10969.0000 | 0.9318 | 
| **relationships** | 4877.0000 | Infinity | 0.0000 | 


Uncovered: [Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Class: HeadWaiter, Attribute: HeadWaiter.name, Attribute: HeadWaiter.dateOfBirth, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Relationship: HeadWaiterWaiter, Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Relationship: MenuItemFoodItem, Attribute: Banquet.phoneNumber, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Class: Banquet, Attribute: Banquet.time, Attribute: Banquet.date, Attribute: Banquet.numberPeople, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Attribute: Banquet.paymentMethod, Attribute: Banquet.busService, Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Class: Banquet, Attribute: Banquet.time, Attribute: Banquet.date, Attribute: Banquet.numberPeople, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Attribute: Banquet.paymentMethod, Attribute: Banquet.busService, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Relationship: MenuItemFoodItem, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: MenuItemFoodItem, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Class: HeadWaiter, Attribute: HeadWaiter.name, Attribute: HeadWaiter.dateOfBirth, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Relationship: ChefCook, Relationship: HeadWaiterWaiter, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Attribute: ItemOrder.time, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: MenuItemFoodItem, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Class: HeadWaiter, Attribute: HeadWaiter.name, Attribute: HeadWaiter.dateOfBirth, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Relationship: HeadWaiterWaiter, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Class: Banquet, Attribute: Banquet.time, Attribute: Banquet.date, Attribute: Banquet.numberPeople, Attribute: Banquet.name, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Attribute: Banquet.paymentMethod, Attribute: Banquet.busService, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: BanquetBusDriver, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Class: ItemOrder, Attribute: ItemOrder.time, Class: MenuItem, Attribute: MenuItem.description, Attribute: MenuItem.prepTime, Attribute: MenuItem.classification, Class: FoodItem, Attribute: FoodItem.number, Attribute: FoodItem.description, Attribute: FoodItem.purchaseFlag, Attribute: FoodItem.unit, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Class: HeadWaiter, Attribute: HeadWaiter.name, Attribute: HeadWaiter.dateOfBirth, Attribute: HeadWaiter.phoneNumber, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationItemOrdered, Relationship: ItemOrderMenuItem, Relationship: MenuItemFoodItem, Relationship: FoodItemAllergen, Relationship: MenuItemChef, Relationship: HeadWaiterWaiter, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Class: Individual, Attribute: Individual.time, Attribute: Individual.date, Attribute: Individual.numberPeople, Attribute: Individual.name, Attribute: Individual.phoneNumber, Attribute: Individual.number, Attribute: Individual.seating, Attribute: Individual.smoking, Class: Allergen, Attribute: Allergen.type, Class: Person, Attribute: Person.name, Class: RegularCustomer, Attribute: RegularCustomer.name, Attribute: RegularCustomer.prefferedLanguage, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Class: Manager, Attribute: Manager.name, Attribute: Manager.dateOfBirth, Attribute: Manager.phoneNumber, Attribute: Cook.phoneNumber, Attribute: Chef.dateOfBirth, Attribute: Chef.phoneNumber, Class: BusDriver, Attribute: BusDriver.name, Attribute: BusDriver.dateOfBirth, Attribute: BusDriver.phoneNumber, Attribute: BusDriver.driverLicenseNr, Relationship: ReservationCustomer, Relationship: BanquetBusDriver, Relationship: FoodItemAllergen, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Attribute: Banquet.phoneNumber, Attribute: Banquet.number, Attribute: Banquet.groupName, Class: Person, Attribute: Person.name, Class: DietaryRequirement, Attribute: DietaryRequirement.diet, Class: ReportedAllergy, Attribute: ReportedAllergy.allergen, Attribute: Waiter.spokenLanguage, Attribute: BusDriver.driverLicenseNr, Relationship: StateMachineStartsStates, Relationship: StateMachineStartsStates, Relationship: StateMachineStartsStates, Relationship: StateMachineStartsStates, Relationship: StateMachineStartsStates, Relationship: StateMachineStartsStates, Relationship: DriverShipment, Class: Comment, Attribute: Comment.text, Relationship: ExpenseComment, Class: Comment, Attribute: Comment.text, Relationship: ExpenseComment, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: Cassette, Attribute: Cassette.title, Attribute: Cassette.availableCopies, Class: MatchEvent, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchEvent, Relationship: MatchMatchNote, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Relationship: TrainingFailded, Relationship: FailedPlayer, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: MatchMatchNote, Class: MatchEvent, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Relationship: MatchMatchEvent, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchNote, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Relationship: TrainingFailded, Relationship: FailedPlayer, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Relationship: TrainingFailded, Relationship: FailedPlayer, Class: MatchEvent, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchEvent, Relationship: MatchMatchNote, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Relationship: TrainingFailded, Relationship: FailedPlayer, Class: MatchEvent, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchEvent, Relationship: MatchMatchNote, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Class: PlayerNotes, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: PlayerPlayerNotes, Class: TrainingFailedToAttend, Attribute: TrainingFailedToAttend.reason, Class: MatchNote, Attribute: MatchNote.note, Attribute: MatchNote.date, Relationship: TrainingFailded, Relationship: FailedPlayer, Relationship: MatchMatchNote, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Attribute: Club.name, Attribute: Club.homeGround, Attribute: Club.chairman, Attribute: Team.name, Attribute: Competition.name, Attribute: Competition.type, Attribute: TrainingSession.date, Attribute: TrainingSession.location, Attribute: TrainingSession.purpose, Attribute: TrainingNotes.note, Attribute: TrainingNotes.date, Attribute: MatchEvent.eventType, Attribute: MatchEvent.time, Attribute: Match.date, Attribute: Match.homeAway, Attribute: TrainingFailedToAttend.reason, Attribute: Player.name, Attribute: Player.age, Attribute: Player.bestFoot, Attribute: Player.phoneNumber, Attribute: MatchReport.duration, Attribute: MatchReport.scoreVisitor, Attribute: MatchReport.scoreLocal, Attribute: MatchNote.note, Attribute: MatchNote.date, Attribute: TrainingObjective.areaToImprove, Attribute: TrainingObjective.startDate, Attribute: TrainingObjective.endDate, Attribute: TrainingObjective.success, Attribute: Position.positionName, Attribute: PlayerNotes.note, Attribute: PlayerNotes.date, Attribute: MatchPlayer.booked, Attribute: MatchPlayer.goals, Attribute: MatchPlayer.rating, Attribute: MatchPlayerPosition.positionName, Attribute: MatchPlayerPosition.number, Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms, Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms, Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms, Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms, Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms, Class: FreeRoomTypesDTO, Attribute: FreeRoomTypesDTO.roomTypeDescription, Attribute: FreeRoomTypesDTO.numBeds, Attribute: FreeRoomTypesDTO.pricePerNight, Attribute: FreeRoomTypesDTO.numFreeRooms, Class: RoomExtra, Attribute: RoomExtra.price, Attribute: RoomExtra.description, Relationship: RoomReservationExtras, Class: Vehicle, Attribute: Vehicle.id, Attribute: Vehicle.registrationState, Attribute: Vehicle.licensePlateNumber, Attribute: Vehicle.vehicleTypeCode, Attribute: Vehicle.registrationLastMaintenanceDate, Attribute: Vehicle.expirationDate, Class: Truck, Attribute: Truck.id, Attribute: Truck.registrationState, Attribute: Truck.licensePlateNumber, Attribute: Truck.vehicleTypeCode, Attribute: Truck.registrationLastMaintenanceDate, Attribute: Truck.expirationDate, Attribute: Truck.odometerReading, Attribute: Truck.gasTankCapacity, Attribute: Truck.workingRadio, Attribute: Truck.mileage, Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber, Relationship: RentalOfficeVehicle, Relationship: RentalOfficeRentalAgreementDrop, Relationship: RentalAgreementVehicle, Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate, Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber, Class: Truck, Attribute: Truck.id, Attribute: Truck.registrationState, Attribute: Truck.licensePlateNumber, Attribute: Truck.vehicleTypeCode, Attribute: Truck.registrationLastMaintenanceDate, Attribute: Truck.expirationDate, Attribute: Truck.odometerReading, Attribute: Truck.gasTankCapacity, Attribute: Truck.workingRadio, Attribute: Truck.mileage, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate, Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate, Class: Vehicle, Attribute: Vehicle.id, Attribute: Vehicle.registrationState, Attribute: Vehicle.licensePlateNumber, Attribute: Vehicle.vehicleTypeCode, Attribute: Vehicle.registrationLastMaintenanceDate, Attribute: Vehicle.expirationDate, Class: Vehicle, Attribute: Vehicle.id, Attribute: Vehicle.registrationState, Attribute: Vehicle.licensePlateNumber, Attribute: Vehicle.vehicleTypeCode, Attribute: Vehicle.registrationLastMaintenanceDate, Attribute: Vehicle.expirationDate, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate, Class: Company, Attribute: Company.name, Attribute: Company.address, Attribute: Company.poorRisk, Attribute: Company.idNumber, Class: Vehicle, Attribute: Vehicle.id, Attribute: Vehicle.registrationState, Attribute: Vehicle.licensePlateNumber, Attribute: Vehicle.vehicleTypeCode, Attribute: Vehicle.registrationLastMaintenanceDate, Attribute: Vehicle.expirationDate, Class: Individual, Attribute: Individual.name, Attribute: Individual.address, Attribute: Individual.poorRisk, Attribute: Individual.homePhone, Attribute: Individual.driverLicenseState, Attribute: Individual.driverLicenseNumber, Attribute: Individual.driverLicenseExpirationDate]

Hallucinations: [Relationship: CustomerDietary, Relationship: CustomerDietary]

