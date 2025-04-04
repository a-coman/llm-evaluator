# Generation 1
## Category baseline
```
!new RentalOffice('rentalOffice2')
!rentalOffice2.name := 'CityCenter Rentals'
!rentalOffice2.number := 101
!rentalOffice2.address := '123 Main Street, Columbus, OH, 43215'

!new Vehicle('vehicle1')
!vehicle1.id := 1
!vehicle1.registrationState := #CO
!vehicle1.licensePlateNumber := 'OH1234XYZ'
!vehicle1.vehicleTypeCode := #TRUCK10
!vehicle1.registrationLastMaintenanceDate := Date('2023-01-15')
!vehicle1.expirationDate := Date('2023-12-31')

!new Truck('truck1')
!truck1.id := 2
!truck1.registrationState := #CO
!truck1.licensePlateNumber := 'OH5678ABC'
!truck1.vehicleTypeCode := #TRUCK
!truck1.registrationLastMaintenanceDate := Date('2023-01-10')
!truck1.expirationDate := Date('2023-11-30')
!truck1.odometerReading := 123456
!truck1.gasTankCapacity := 30.0
!truck1.workingRadio := true
!truck1.mileage := 15

!new Individual('individualCustomer2')
!individualCustomer2.name := 'John Doe'
!individualCustomer2.address := '789 Elm Street, Dayton, OH, 45402'
!individualCustomer2.poorRisk := false
!individualCustomer2.homePhone := '555-123-4567'
!individualCustomer2.driverLicenseState := #CO
!individualCustomer2.driverLicenseNumber := 1234567
!individualCustomer2.driverLicenseExpirationDate := Date('2026-05-22')

!new Company('company1')
!company1.name := 'TechSolutions Inc.'
!company1.address := '456 Innovation Park, Cincinnati, OH, 45202'
!company1.poorRisk := false
!company1.idNumber := 285

!new RentalAgreement('rentalAgreement1')
!rentalAgreement1.number := 3001
!rentalAgreement1.rentalDate := Date('2023-08-01')
!rentalAgreement1.anticipatedDuration := 7
!rentalAgreement1.depositPaid := 250.00
!rentalAgreement1.quotedDailyRate := 45.00
!rentalAgreement1.quotedRatePerMile := 0.20

!new RentalAgreement('rentalAgreement2')
!rentalAgreement2.number := 3002
!rentalAgreement2.rentalDate := Date('2023-09-15')
!rentalAgreement2.anticipatedDuration := 14
!rentalAgreement2.depositPaid := 500.00
!rentalAgreement2.quotedDailyRate := 85.00
!rentalAgreement2.quotedRatePerMile := 0.40

!insert (rentalOffice2, vehicle1) into RentalOfficeVehicle
!insert (rentalOffice2, truck1) into RentalOfficeVehicle
!insert (rentalOffice2, rentalAgreement1) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice2, rentalAgreement1) into RentalOfficeRentalAgreementDrop
!insert (rentalOffice2, rentalAgreement2) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice2, rentalAgreement2) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement1, vehicle1) into RentalAgreementVehicle
!insert (rentalAgreement1, individualCustomer2) into RentalAgreementCustomer

!insert (rentalAgreement2, truck1) into RentalAgreementVehicle
!insert (rentalAgreement2, company1) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 59 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 3 | 3 | 100.00% |
| License Plates | 0 | 2 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
123 Main Street, Columbus, OH, 43215
```
```
789 Elm Street, Dayton, OH, 45402
```
```
456 Innovation Park, Cincinnati, OH, 45202
```

## Category boundary
```
!new RentalOffice('rentalOffice3')
!rentalOffice3.name := 'Deserts Edge Rentals'
!rentalOffice3.number := 001
!rentalOffice3.address := '789 Dry Sands Ave, Mojave, CA 93501'

!new Truck('truck2')
!truck2.id := 3
!truck2.registrationState := #CA
!truck2.licensePlateNumber := 'DES127S'
!truck2.vehicleTypeCode := #TRUCK
!truck2.registrationLastMaintenanceDate := Date('2023-01-10')
!truck2.expirationDate := Date('2025-01-10')
!truck2.odometerReading := 100000
!truck2.gasTankCapacity := 150.0
!truck2.workingRadio := true
!truck2.mileage := 8

!new Vehicle('vehicle2')
!vehicle2.id := 4
!vehicle2.registrationState := #CA
!vehicle2.licensePlateNumber := 'DES128S'
!vehicle2.vehicleTypeCode := #OPEN_TRAILER
!vehicle2.registrationLastMaintenanceDate := Date('2023-03-05')
!vehicle2.expirationDate := Date('2025-03-05')

!new RentalAgreement('rentalAgreement3')
!rentalAgreement3.number := 4001
!rentalAgreement3.rentalDate := Date('2023-09-01')
!rentalAgreement3.anticipatedDuration := 0
!rentalAgreement3.depositPaid := 0.00
!rentalAgreement3.quotedDailyRate := 0.00
!rentalAgreement3.quotedRatePerMile := 0.00

!new Company('company2')
!company2.name := 'Mojave Construction, Inc.'
!company2.address := '101 Stoneway Blvd, Lancaster, CA 93536'
!company2.poorRisk := false
!company2.idNumber := 92021

!insert (rentalOffice3, truck2) into RentalOfficeVehicle
!insert (rentalOffice3, vehicle2) into RentalOfficeVehicle
!insert (rentalOffice3, rentalAgreement3) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice3, rentalAgreement3) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement3, truck2) into RentalAgreementVehicle
!insert (rentalAgreement3, company2) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 40 | 0.00% |
| Multiplicities Errors | 0 | 6 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 2 | 2 | 100.00% |
| License Plates | 0 | 2 | 0.00% |
| Home Phones | 0 | 0 | 0.00% |

| Invalid Addresses | 
|---| 
```
789 Dry Sands Ave, Mojave, CA 93501
```
```
101 Stoneway Blvd, Lancaster, CA 93536
```

## Category complex
```
!new RentalOffice('rentalOffice5')
!rentalOffice5.name := 'Pacific Wheels Rental – Beachside'
!rentalOffice5.number := 102
!rentalOffice5.address := '123 Ocean Drive, Santa Monica, CA, 90401'

!new Truck('truck4')
!truck4.id := 7
!truck4.registrationState := #CA
!truck4.licensePlateNumber := 'SMK0921'
!truck4.vehicleTypeCode := #TRUCK
!truck4.registrationLastMaintenanceDate := Date('2023-05-15')
!truck4.expirationDate := Date('2024-05-14')
!truck4.odometerReading := 45300
!truck4.gasTankCapacity := 26.0
!truck4.workingRadio := true
!truck4.mileage := 12

!new Vehicle('vehicle4')
!vehicle4.id := 8
!vehicle4.registrationState := #AK
!vehicle4.licensePlateNumber := 'NVTR501'
!vehicle4.vehicleTypeCode := #OPEN_TRAILER
!vehicle4.registrationLastMaintenanceDate := Date('2023-07-22')
!vehicle4.expirationDate := Date('2024-07-21')

!new Individual('individualCustomer4')
!individualCustomer4.name := 'Emily Rodriguez'
!individualCustomer4.address := '456 Sunset Ave, Los Angeles, CA, 90028'
!individualCustomer4.poorRisk := false
!individualCustomer4.homePhone := '323-555-0198'
!individualCustomer4.driverLicenseState := #CA
!individualCustomer4.driverLicenseNumber := 1234567
!individualCustomer4.driverLicenseExpirationDate := Date('2025-10-03')

!new Company('company3')
!company3.name := 'Ocean Breeze Events'
!company3.address := 'Pier 7, San Francisco, CA, 94133'
!company3.poorRisk := false
!company3.idNumber := 987654321

!new RentalAgreement('rentalAgreement5')
!rentalAgreement5.number := 155
!rentalAgreement5.rentalDate := Date('2023-08-01')
!rentalAgreement5.anticipatedDuration := 5
!rentalAgreement5.depositPaid := 200.00
!rentalAgreement5.quotedDailyRate := 75.00
!rentalAgreement5.quotedRatePerMile := 0.50

!new RentalAgreement('rentalAgreement6')
!rentalAgreement6.number := 156
!rentalAgreement6.rentalDate := Date('2023-08-05')
!rentalAgreement6.anticipatedDuration := 10
!rentalAgreement6.depositPaid := 300.00
!rentalAgreement6.quotedDailyRate := 100.00
!rentalAgreement6.quotedRatePerMile := 0.65

!new RentalAgreement('rentalAgreement7')
!rentalAgreement7.number := 157
!rentalAgreement7.rentalDate := Date('2023-08-15')
!rentalAgreement7.anticipatedDuration := 3
!rentalAgreement7.depositPaid := 250.00
!rentalAgreement7.quotedDailyRate := 60.00
!rentalAgreement7.quotedRatePerMile := 0.55

!insert (rentalOffice5, truck4) into RentalOfficeVehicle
!insert (rentalOffice5, vehicle4) into RentalOfficeVehicle

!insert (rentalOffice5, rentalAgreement5) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice5, rentalAgreement5) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement5, truck4) into RentalAgreementVehicle
!insert (rentalAgreement5, individualCustomer4) into RentalAgreementCustomer

!insert (rentalOffice5, rentalAgreement6) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice5, rentalAgreement6) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement6, vehicle4) into RentalAgreementVehicle
!insert (rentalAgreement6, company3) into RentalAgreementCustomer

!insert (rentalOffice5, rentalAgreement7) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice5, rentalAgreement7) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement7, truck4) into RentalAgreementVehicle
!insert (rentalAgreement7, company3) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 70 | 0.00% |
| Multiplicities Errors | 0 | 14 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 1 | 3 | 33.33% |
| License Plates | 0 | 2 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
123 Ocean Drive, Santa Monica, CA, 90401
```

## Category edge
```
!new RentalOffice('rentalOffice4')
!rentalOffice4.name := 'Arctic Rentals'
!rentalOffice4.number := 007
!rentalOffice4.address := '123 Polar Road, Barrow, AK, 99723'

!new Vehicle('vehicle3')
!vehicle3.id := 5
!vehicle3.registrationState := #AK
!vehicle3.licensePlateNumber := 'TRL-90787'
!vehicle3.vehicleTypeCode := #OPEN_TRAILER
!vehicle3.registrationLastMaintenanceDate := Date('2021-02-20')
!vehicle3.expirationDate := Date('2023-02-19')

!new Truck('truck3')
!truck3.id := 6
!truck3.registrationState := #AK
!truck3.licensePlateNumber := 'TRK-29486'
!truck3.vehicleTypeCode := #TRUCK
!truck3.registrationLastMaintenanceDate := Date('2020-11-30')
!truck3.expirationDate := Date('2023-01-01')
!truck3.odometerReading := 0
!truck3.gasTankCapacity := 0.1
!truck3.workingRadio := true
!truck3.mileage := 0

!new RentalAgreement('rentalAgreement4')
!rentalAgreement4.number := 13
!rentalAgreement4.rentalDate := Date('2023-02-28')
!rentalAgreement4.anticipatedDuration := 0
!rentalAgreement4.depositPaid := 0.01
!rentalAgreement4.quotedDailyRate := 0.01
!rentalAgreement4.quotedRatePerMile := 0.01

!new Individual('individualCustomer3')
!individualCustomer3.name := 'Jane Doe'
!individualCustomer3.address := '456 Frost Street, Nome, AK, 99762'
!individualCustomer3.poorRisk := false
!individualCustomer3.homePhone := '+1-907-555-0136'
!individualCustomer3.driverLicenseState := #AK
!individualCustomer3.driverLicenseNumber := 987654
!individualCustomer3.driverLicenseExpirationDate := Date('2034-02-27')

!insert (rentalOffice4, vehicle3) into RentalOfficeVehicle
!insert (rentalOffice4, truck3) into RentalOfficeVehicle
!insert (rentalOffice4, rentalAgreement4) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice4, rentalAgreement4) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement4, truck3) into RentalAgreementVehicle
!insert (rentalAgreement4, individualCustomer3) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 43 | 0.00% |
| Multiplicities Errors | 0 | 6 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 2 | 2 | 100.00% |
| License Plates | 0 | 2 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
123 Polar Road, Barrow, AK, 99723
```
```
456 Frost Street, Nome, AK, 99762
```

## Category invalid
```
!new RentalOffice('rentalOffice1')
!rentalOffice1.name := 'Solo Wheels Rental'
!rentalOffice1.number := 001
!rentalOffice1.address := '123 Main Street, Chico, CA'

!new RentalAgreement('rentalAgreement1001')
!rentalAgreement1001.number := 1001
!rentalAgreement1001.rentalDate := Date('Previous summer')
!rentalAgreement1001.anticipatedDuration := 7
!rentalAgreement1001.depositPaid := 250.00
!rentalAgreement1001.quotedDailyRate := 40.00
!rentalAgreement1001.quotedRatePerMile := 0.15

!new Individual('individualCustomer1')
!individualCustomer1.name := 'John Doe'
!individualCustomer1.address := '456 South Street, Chico, CA'
!individualCustomer1.poorRisk := false
!individualCustomer1.homePhone := '530-555-0101'
!individualCustomer1.driverLicenseState := #CA
!individualCustomer1.driverLicenseNumber := 1234567
!individualCustomer1.driverLicenseExpirationDate := Date('2025-08-15')

!insert (rentalAgreement1001, individualCustomer1) into RentalAgreementCustomer
!insert (rentalOffice1, rentalAgreement1001) into RentalOfficeRentalAgreementOrigin
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 2 | 2 | 100.00% |
| Invariants Errors (Not included on General) | 0 | 5 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `RentalAgreementVehicle':
  Object `rentalAgreement1001' of class `RentalAgreement' is connected to 0 objects of class `Vehicle'
  at association end `vehicle' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RentalOfficeRentalAgreementDrop':
  Object `rentalAgreement1001' of class `RentalAgreement' is connected to 0 objects of class `RentalOffice'
  at association end `droppoffRentalOffice' but the multiplicity is specified as `1'.
```

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 1 | 2 | 50.00% |
| License Plates | 0 | 0 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
456 South Street, Chico, CA
```

## Generation 1 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 233 | 0.00% |
| Multiplicities Errors | 0 | 36 | 0.00% |
| Invariants Errors | 0 | 20 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 2 | 2 | 100.00% |
| Invariants Errors (Not included on General) | 0 | 5 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `RentalAgreementVehicle':
  Object `rentalAgreement1001' of class `RentalAgreement' is connected to 0 objects of class `Vehicle'
  at association end `vehicle' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RentalOfficeRentalAgreementDrop':
  Object `rentalAgreement1001' of class `RentalAgreement' is connected to 0 objects of class `RentalOffice'
  at association end `droppoffRentalOffice' but the multiplicity is specified as `1'.
```

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 9 | 12 | 75.00% |
| License Plates | 0 | 8 | 0.00% |
| Home Phones | 0 | 4 | 0.00% |

| Invalid Addresses | 
|---| 
```
123 Main Street, Columbus, OH, 43215
```
```
789 Elm Street, Dayton, OH, 45402
```
```
456 Innovation Park, Cincinnati, OH, 45202
```
```
789 Dry Sands Ave, Mojave, CA 93501
```
```
101 Stoneway Blvd, Lancaster, CA 93536
```
```
123 Ocean Drive, Santa Monica, CA, 90401
```
```
123 Polar Road, Barrow, AK, 99723
```
```
456 Frost Street, Nome, AK, 99762
```
```
456 South Street, Chico, CA
```

# Generation 2
## Category baseline
```
!new RentalOffice('rentalOffice7')
!rentalOffice7.name := 'Beachside Rentals'
!rentalOffice7.number := 202
!rentalOffice7.address := '321 Ocean Avenue, Miami, FL, 33139'

!new Vehicle('vehicle6')
!vehicle6.id := 11
!vehicle6.registrationState := #FL
!vehicle6.licensePlateNumber := 'FL7896MOT'
!vehicle6.vehicleTypeCode := #OPEN_TRAILER
!vehicle6.registrationLastMaintenanceDate := Date('2023-06-12')
!vehicle6.expirationDate := Date('2024-06-12')

!new Truck('truck6')
!truck6.id := 12
!truck6.registrationState := #FL
!truck6.licensePlateNumber := 'FL3421BOX'
!truck6.vehicleTypeCode := #TRUCK
!truck6.registrationLastMaintenanceDate := Date('2023-05-05')
!truck6.expirationDate := Date('2023-12-15')
!truck6.odometerReading := 255000
!truck6.gasTankCapacity := 60.0
!truck6.workingRadio := false
!truck6.mileage := 10

!new Individual('individualCustomer5')
!individualCustomer5.name := 'Maria Garcia'
!individualCustomer5.address := '101 Cypress Street, Orlando, FL, 32801'
!individualCustomer5.poorRisk := false
!individualCustomer5.homePhone := '305-987-6543'
!individualCustomer5.driverLicenseState := #FL
!individualCustomer5.driverLicenseNumber := 6543210
!individualCustomer5.driverLicenseExpirationDate := Date('2025-09-12')

!new Company('company5')
!company5.name := 'Sunshine Logistics'
!company5.address := '789 Coastline Boulevard, Fort Lauderdale, FL, 33301'
!company5.poorRisk := false
!company5.idNumber := 202345

!new RentalAgreement('rentalAgreement9')
!rentalAgreement9.number := 3003
!rentalAgreement9.rentalDate := Date('2023-10-05')
!rentalAgreement9.anticipatedDuration := 3
!rentalAgreement9.depositPaid := 100.00
!rentalAgreement9.quotedDailyRate := 25.00
!rentalAgreement9.quotedRatePerMile := 0.15

!new RentalAgreement('rentalAgreement10')
!rentalAgreement10.number := 3004
!rentalAgreement10.rentalDate := Date('2023-11-01')
!rentalAgreement10.anticipatedDuration := 30
!rentalAgreement10.depositPaid := 750.00
!rentalAgreement10.quotedDailyRate := 120.00
!rentalAgreement10.quotedRatePerMile := 0.35

!insert (rentalOffice7, vehicle6) into RentalOfficeVehicle
!insert (rentalOffice7, truck6) into RentalOfficeVehicle

!insert (rentalOffice7, rentalAgreement9) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice7, rentalAgreement9) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement9, vehicle6) into RentalAgreementVehicle
!insert (rentalAgreement9, individualCustomer5) into RentalAgreementCustomer

!insert (rentalOffice7, rentalAgreement10) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice7, rentalAgreement10) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement10, truck6) into RentalAgreementVehicle
!insert (rentalAgreement10, company5) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 59 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 1 | 3 | 33.33% |
| License Plates | 0 | 2 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
789 Coastline Boulevard, Fort Lauderdale, FL, 33301
```

## Category boundary
```
!new RentalOffice('rentalOffice8')
!rentalOffice8.name := 'Pine Ridge Mobilities'
!rentalOffice8.number := 45
!rentalOffice8.address := '234 Evergreen Lane, Boise, ID 83706'

!new Truck('truck7')
!truck7.id := 13
!truck7.registrationState := #CO
!truck7.licensePlateNumber := 'PRID123F'
!truck7.vehicleTypeCode := #TRUCK
!truck7.registrationLastMaintenanceDate := Date('2023-07-15')
!truck7.expirationDate := Date('2025-07-15')
!truck7.odometerReading := 1000000
!truck7.gasTankCapacity := 150.0
!truck7.workingRadio := true
!truck7.mileage := 5

!new Vehicle('vehicle7')
!vehicle7.id := 14
!vehicle7.registrationState := #CO
!vehicle7.licensePlateNumber := 'PRID124T'
!vehicle7.vehicleTypeCode := #OPEN_TRAILER
!vehicle7.registrationLastMaintenanceDate := Date('2022-12-01')
!vehicle7.expirationDate := Date('2024-12-01')

!new Vehicle('vehicle8')
!vehicle8.id := 15
!vehicle8.registrationState := #CO
!vehicle8.licensePlateNumber := 'PRID125C'
!vehicle8.vehicleTypeCode := #OPEN_TRAILER
!vehicle8.registrationLastMaintenanceDate := Date('2023-05-05')
!vehicle8.expirationDate := Date('2025-05-05')

!new RentalAgreement('rentalAgreement11')
!rentalAgreement11.number := 987
!rentalAgreement11.rentalDate := Date('2023-10-20')
!rentalAgreement11.anticipatedDuration := 1
!rentalAgreement11.depositPaid := 100.00
!rentalAgreement11.quotedDailyRate := 150.00
!rentalAgreement11.quotedRatePerMile := 0.10

!new RentalAgreement('rentalAgreement12')
!rentalAgreement12.number := 988
!rentalAgreement12.rentalDate := Date('2023-11-15')
!rentalAgreement12.anticipatedDuration := 0
!rentalAgreement12.depositPaid := 0.00
!rentalAgreement12.quotedDailyRate := 0.00
!rentalAgreement12.quotedRatePerMile := 0.0

!new Individual('individualCustomer6')
!individualCustomer6.name := 'Blake Jensen'
!individualCustomer6.address := '789 Pine St, Boise, ID 83702'
!individualCustomer6.poorRisk := true
!individualCustomer6.homePhone := '(208) 555-6789'
!individualCustomer6.driverLicenseState := #CO
!individualCustomer6.driverLicenseNumber := 98
!individualCustomer6.driverLicenseExpirationDate := Date('2034-05-10')

!insert (rentalOffice8, truck7) into RentalOfficeVehicle
!insert (rentalOffice8, vehicle7) into RentalOfficeVehicle
!insert (rentalOffice8, vehicle8) into RentalOfficeVehicle

!insert (rentalOffice8, rentalAgreement11) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice8, rentalAgreement11) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement11, truck7) into RentalAgreementVehicle
!insert (rentalAgreement11, individualCustomer6) into RentalAgreementCustomer

!insert (rentalOffice8, rentalAgreement12) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice8, rentalAgreement12) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement12, vehicle8) into RentalAgreementVehicle
!insert (rentalAgreement12, individualCustomer6) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 62 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 2 | 2 | 100.00% |
| License Plates | 0 | 3 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
234 Evergreen Lane, Boise, ID 83706
```
```
789 Pine St, Boise, ID 83702
```

## Category complex
```
!new RentalOffice('rentalOffice11')
!rentalOffice11.name := 'Desert Adventures Rentals'
!rentalOffice11.number := 211
!rentalOffice11.address := '789 Cactus Way, Scottsdale, AZ, 85251'

!new Truck('truck9')
!truck9.id := 20
!truck9.registrationState := #AZ
!truck9.licensePlateNumber := 'DSR7620'
!truck9.vehicleTypeCode := #TRUCK
!truck9.registrationLastMaintenanceDate := Date('2023-06-20')
!truck9.expirationDate := Date('2024-06-19')
!truck9.odometerReading := 30120
!truck9.gasTankCapacity := 30.0
!truck9.workingRadio := false
!truck9.mileage := 10

!new Vehicle('vehicle12')
!vehicle12.id := 21
!vehicle12.registrationState := #AZ
!vehicle12.licensePlateNumber := 'AZTR609'
!vehicle12.vehicleTypeCode := #OPEN_TRAILER
!vehicle12.registrationLastMaintenanceDate := Date('2023-05-18')
!vehicle12.expirationDate := Date('2024-05-17')

!new Vehicle('vehicle13')
!vehicle13.id := 22
!vehicle13.registrationState := #AZ
!vehicle13.licensePlateNumber := 'AZATV123'
!vehicle13.vehicleTypeCode := #COVERED_TRAILER
!vehicle13.registrationLastMaintenanceDate := Date('2023-07-10')
!vehicle13.expirationDate := Date('2024-07-09')

!new Individual('individualCustomer7')
!individualCustomer7.name := 'Derek Nguyen'
!individualCustomer7.address := '321 Mesa St, Mesa, AZ, 85201'
!individualCustomer7.poorRisk := false
!individualCustomer7.homePhone := '480-555-0345'
!individualCustomer7.driverLicenseState := #AZ
!individualCustomer7.driverLicenseNumber := 7845621
!individualCustomer7.driverLicenseExpirationDate := Date('2025-06-11')

!new Company('company9')
!company9.name := 'Desert Safari Tours, Inc.'
!company9.address := '45 Desert Rd, Glendale, AZ, 85301'
!company9.poorRisk := true
!company9.idNumber := 302145678

!new RentalAgreement('rentalAgreement15')
!rentalAgreement15.number := 20034
!rentalAgreement15.rentalDate := Date('2023-09-12')
!rentalAgreement15.anticipatedDuration := 7
!rentalAgreement15.depositPaid := 500.00
!rentalAgreement15.quotedDailyRate := 90.00
!rentalAgreement15.quotedRatePerMile := 0.60

!new RentalAgreement('rentalAgreement16')
!rentalAgreement16.number := 20035
!rentalAgreement16.rentalDate := Date('2023-09-15')
!rentalAgreement16.anticipatedDuration := 12
!rentalAgreement16.depositPaid := 700.00
!rentalAgreement16.quotedDailyRate := 110.00
!rentalAgreement16.quotedRatePerMile := 0.75

!new RentalAgreement('rentalAgreement17')
!rentalAgreement17.number := 20036
!rentalAgreement17.rentalDate := Date('2023-09-18')
!rentalAgreement17.anticipatedDuration := 5
!rentalAgreement17.depositPaid := 300.00
!rentalAgreement17.quotedDailyRate := 50.00
!rentalAgreement17.quotedRatePerMile := 0.40

!insert (rentalOffice11, truck9) into RentalOfficeVehicle
!insert (rentalOffice11, vehicle12) into RentalOfficeVehicle
!insert (rentalOffice11, vehicle13) into RentalOfficeVehicle

!insert (rentalOffice11, rentalAgreement15) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice11, rentalAgreement15) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement15, truck9) into RentalAgreementVehicle
!insert (rentalAgreement15, individualCustomer7) into RentalAgreementCustomer

!insert (rentalOffice11, rentalAgreement16) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice11, rentalAgreement16) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement16, vehicle12) into RentalAgreementVehicle
!insert (rentalAgreement16, company9) into RentalAgreementCustomer

!insert (rentalOffice11, rentalAgreement17) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice11, rentalAgreement17) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement17, vehicle13) into RentalAgreementVehicle
!insert (rentalAgreement17, individualCustomer7) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 78 | 0.00% |
| Multiplicities Errors | 0 | 15 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 2 | 3 | 66.67% |
| License Plates | 0 | 3 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
789 Cactus Way, Scottsdale, AZ, 85251
```
```
45 Desert Rd, Glendale, AZ, 85301
```

## Category edge
```
!new RentalOffice('rentalOffice9')
!rentalOffice9.name := 'Sun-Sand Rentals'
!rentalOffice9.number := 21
!rentalOffice9.address := '456 Seaside Blvd, Key West, FL, 33040'

!new Vehicle('vehicle9')
!vehicle9.id := 16
!vehicle9.registrationState := #FL
!vehicle9.licensePlateNumber := 'TRL-444KU'
!vehicle9.vehicleTypeCode := #OPEN_TRAILER
!vehicle9.registrationLastMaintenanceDate := Date('2023-04-01')
!vehicle9.expirationDate := Date('2025-04-02')

!new Truck('truck8')
!truck8.id := 17
!truck8.registrationState := #FL
!truck8.licensePlateNumber := 'TRK-556LW'
!truck8.vehicleTypeCode := #TRUCK
!truck8.registrationLastMaintenanceDate := Date('2022-12-15')
!truck8.expirationDate := Date('2025-12-20')
!truck8.odometerReading := 150000
!truck8.gasTankCapacity := 100.0
!truck8.workingRadio := false
!truck8.mileage := 1

!new RentalAgreement('rentalAgreement13a')
!rentalAgreement13a.number := 9999
!rentalAgreement13a.rentalDate := Date('2023-06-01')
!rentalAgreement13a.anticipatedDuration := 365
!rentalAgreement13a.depositPaid := 5.00
!rentalAgreement13a.quotedDailyRate := 75.00
!rentalAgreement13a.quotedRatePerMile := 0.75

!new RentalAgreement('rentalAgreement13b')
!rentalAgreement13b.number := 10000
!rentalAgreement13b.rentalDate := Date('2023-06-01')
!rentalAgreement13b.anticipatedDuration := 365
!rentalAgreement13b.depositPaid := 5.00
!rentalAgreement13b.quotedDailyRate := 75.00
!rentalAgreement13b.quotedRatePerMile := 0.75

!new Company('company6')
!company6.name := 'Coral Reef Expeditions, Inc.'
!company6.address := '230 Ocean Way, Miami, FL, 33139'
!company6.poorRisk := true
!company6.idNumber := 91923

!insert (rentalOffice9, vehicle9) into RentalOfficeVehicle
!insert (rentalOffice9, truck8) into RentalOfficeVehicle

!insert (rentalOffice9, rentalAgreement13a) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice9, rentalAgreement13a) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement13a, truck8) into RentalAgreementVehicle
!insert (rentalAgreement13a, company6) into RentalAgreementCustomer

!insert (rentalOffice9, rentalAgreement13b) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice9, rentalAgreement13b) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement13b, vehicle9) into RentalAgreementVehicle
!insert (rentalAgreement13b, company6) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 51 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 2 | 2 | 100.00% |
| License Plates | 0 | 2 | 0.00% |
| Home Phones | 0 | 0 | 0.00% |

| Invalid Addresses | 
|---| 
```
456 Seaside Blvd, Key West, FL, 33040
```
```
230 Ocean Way, Miami, FL, 33139
```

## Category invalid
```
!new RentalOffice('rentalOffice6')
!rentalOffice6.name := 'Hollywood Wheels Rentals'
!rentalOffice6.number := 102
!rentalOffice6.address := '456 Studio Drive, Los Angeles, CA'

!new Truck('truck5')
!truck5.id := 9
!truck5.registrationState := #CA
!truck5.licensePlateNumber := 'MOV123'
!truck5.vehicleTypeCode := #TRUCK
!truck5.registrationLastMaintenanceDate := Date('2023-09-01')
!truck5.expirationDate := Date('2024-01-01')
!truck5.odometerReading := 0
!truck5.gasTankCapacity := 0
!truck5.workingRadio := true
!truck5.mileage := 0

!new Vehicle('vehicle5')
!vehicle5.id := 10
!vehicle5.registrationState := #AK
!vehicle5.licensePlateNumber := 'TRAILER1'
!vehicle5.vehicleTypeCode := #OPEN_TRAILER
!vehicle5.registrationLastMaintenanceDate := Date('2023-08-15')
!vehicle5.expirationDate := Date('2024-04-01')

!new RentalAgreement('rentalAgreement8')
!rentalAgreement8.number := 2001
!rentalAgreement8.rentalDate := Date('2023-10-15')
!rentalAgreement8.anticipatedDuration := 30
!rentalAgreement8.depositPaid := 5000.00
!rentalAgreement8.quotedDailyRate := 120.00
!rentalAgreement8.quotedRatePerMile := 0.10

!new Company('company4')
!company4.name := 'Cinematic Productions Inc.'
!company4.address := '789 Film Lane, Burbank, CA'
!company4.poorRisk := false
!company4.idNumber := 890

!insert (rentalOffice6, truck5) into RentalOfficeVehicle
!insert (rentalOffice6, vehicle5) into RentalOfficeVehicle

!insert (rentalOffice6, rentalAgreement8) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice6, rentalAgreement8) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement8, truck5) into RentalAgreementVehicle
!insert (rentalAgreement8, vehicle5) into RentalAgreementVehicle

!insert (rentalAgreement8, company4) into RentalAgreementCustomer
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 7 | 14.29% |
| Invariants Errors (Not included on General) | 0 | 5 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `RentalAgreementVehicle':
  Object `rentalAgreement8' of class `RentalAgreement' is connected to 2 objects of class `Vehicle'
  at association end `vehicle' but the multiplicity is specified as `1'.
```

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 2 | 2 | 100.00% |
| License Plates | 0 | 2 | 0.00% |
| Home Phones | 0 | 0 | 0.00% |

| Invalid Addresses | 
|---| 
```
456 Studio Drive, Los Angeles, CA
```
```
789 Film Lane, Burbank, CA
```

## Generation 2 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 291 | 0.00% |
| Multiplicities Errors | 0 | 46 | 0.00% |
| Invariants Errors | 0 | 20 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 7 | 14.29% |
| Invariants Errors (Not included on General) | 0 | 5 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `RentalAgreementVehicle':
  Object `rentalAgreement8' of class `RentalAgreement' is connected to 2 objects of class `Vehicle'
  at association end `vehicle' but the multiplicity is specified as `1'.
```

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 9 | 12 | 75.00% |
| License Plates | 0 | 12 | 0.00% |
| Home Phones | 0 | 3 | 0.00% |

| Invalid Addresses | 
|---| 
```
789 Coastline Boulevard, Fort Lauderdale, FL, 33301
```
```
234 Evergreen Lane, Boise, ID 83706
```
```
789 Pine St, Boise, ID 83702
```
```
789 Cactus Way, Scottsdale, AZ, 85251
```
```
45 Desert Rd, Glendale, AZ, 85301
```
```
456 Seaside Blvd, Key West, FL, 33040
```
```
230 Ocean Way, Miami, FL, 33139
```
```
456 Studio Drive, Los Angeles, CA
```
```
789 Film Lane, Burbank, CA
```

# Generation 3
## Category baseline
```
!new RentalOffice('rentalOffice12')
!rentalOffice12.name := 'MountainView Rentals'
!rentalOffice12.number := 303
!rentalOffice12.address := '500 High Peak Drive, Denver, CO, 80202'

!new Vehicle('vehicle14')
!vehicle14.id := 23
!vehicle14.registrationState := #CO
!vehicle14.licensePlateNumber := 'CO1122SUV'
!vehicle14.vehicleTypeCode := #TRUCK10
!vehicle14.registrationLastMaintenanceDate := Date('2023-02-20')
!vehicle14.expirationDate := Date('2024-02-19')

!new Truck('truck10')
!truck10.id := 24
!truck10.registrationState := #CO
!truck10.licensePlateNumber := 'CO3344FLT'
!truck10.vehicleTypeCode := #TRUCK
!truck10.registrationLastMaintenanceDate := Date('2023-07-01')
!truck10.expirationDate := Date('2024-01-15')
!truck10.odometerReading := 180000
!truck10.gasTankCapacity := 50.0
!truck10.workingRadio := true
!truck10.mileage := 8

!new Individual('individualCustomer8')
!individualCustomer8.name := 'Chad Anderson'
!individualCustomer8.address := '222 Pine Street, Boulder, CO, 80302'
!individualCustomer8.poorRisk := false
!individualCustomer8.homePhone := '720-123-9876'
!individualCustomer8.driverLicenseState := #CO
!individualCustomer8.driverLicenseNumber := 9876543
!individualCustomer8.driverLicenseExpirationDate := Date('2027-11-25')

!new Company('company10')
!company10.name := 'Summit Construction'
!company10.address := '999 Rock Quarry Road, Colorado Springs, CO, 80903'
!company10.poorRisk := true
!company10.idNumber := 303600

!new RentalAgreement('rentalAgreement18')
!rentalAgreement18.number := 3005
!rentalAgreement18.rentalDate := Date('2023-12-10')
!rentalAgreement18.anticipatedDuration := 5
!rentalAgreement18.depositPaid := 150.00
!rentalAgreement18.quotedDailyRate := 60.00
!rentalAgreement18.quotedRatePerMile := 0.25

!new RentalAgreement('rentalAgreement19')
!rentalAgreement19.number := 3006
!rentalAgreement19.rentalDate := Date('2023-12-20')
!rentalAgreement19.anticipatedDuration := 21
!rentalAgreement19.depositPaid := 850.00
!rentalAgreement19.quotedDailyRate := 150.00
!rentalAgreement19.quotedRatePerMile := 0.50

!insert (rentalOffice12, vehicle14) into RentalOfficeVehicle
!insert (rentalOffice12, truck10) into RentalOfficeVehicle

!insert (rentalOffice12, rentalAgreement18) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice12, rentalAgreement18) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement18, vehicle14) into RentalAgreementVehicle
!insert (rentalAgreement18, individualCustomer8) into RentalAgreementCustomer

!insert (rentalOffice12, rentalAgreement19) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice12, rentalAgreement19) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement19, truck10) into RentalAgreementVehicle
!insert (rentalAgreement19, company10) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 59 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 3 | 3 | 100.00% |
| License Plates | 0 | 2 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
500 High Peak Drive, Denver, CO, 80202
```
```
222 Pine Street, Boulder, CO, 80302
```
```
999 Rock Quarry Road, Colorado Springs, CO, 80903
```

## Category boundary
```
!new RentalOffice('rentalOffice14')
!rentalOffice14.name := 'Heritage Auto Rentals'
!rentalOffice14.number := 98
!rentalOffice14.address := '456 Old Timers Street, Portsmouth, NH 03801'

!new Truck('truck12')
!truck12.id := 26
!truck12.registrationState := #DE
!truck12.licensePlateNumber := 'HARNH456'
!truck12.vehicleTypeCode := #TRUCK
!truck12.registrationLastMaintenanceDate := Date('2022-11-11')
!truck12.expirationDate := Date('2024-11-11')
!truck12.odometerReading := 500000
!truck12.gasTankCapacity := 100.0
!truck12.workingRadio := false
!truck12.mileage := 6

!new Vehicle('vehicle15')
!vehicle15.id := 27
!vehicle15.registrationState := #DE
!vehicle15.licensePlateNumber := 'HARNT789'
!vehicle15.vehicleTypeCode := #OPEN_TRAILER
!vehicle15.registrationLastMaintenanceDate := Date('2023-04-07')
!vehicle15.expirationDate := Date('2025-04-07')

!new RentalAgreement('rentalAgreement22')
!rentalAgreement22.number := 2000
!rentalAgreement22.rentalDate := Date('2023-12-01')
!rentalAgreement22.anticipatedDuration := 365
!rentalAgreement22.depositPaid := 500.00
!rentalAgreement22.quotedDailyRate := 50.00
!rentalAgreement22.quotedRatePerMile := 0.50

!new Company('company12')
!company12.name := 'New England Farm Supplies Co.'
!company12.address := '163 Maple Tree Road, Concord, NH 03301'
!company12.poorRisk := false
!company12.idNumber := 2023

!insert (rentalOffice14, truck12) into RentalOfficeVehicle
!insert (rentalOffice14, vehicle15) into RentalOfficeVehicle

!insert (rentalOffice14, rentalAgreement22) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice14, rentalAgreement22) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement22, truck12) into RentalAgreementVehicle
!insert (rentalAgreement22, company12) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 40 | 0.00% |
| Multiplicities Errors | 0 | 6 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 2 | 2 | 100.00% |
| License Plates | 0 | 2 | 0.00% |
| Home Phones | 0 | 0 | 0.00% |

| Invalid Addresses | 
|---| 
```
456 Old Timers Street, Portsmouth, NH 03801
```
```
163 Maple Tree Road, Concord, NH 03301
```

## Category complex
```
!new RentalOffice('rentalOffice17')
!rentalOffice17.name := 'Urban Mobility Rentals – Downtown Branch'
!rentalOffice17.number := 401
!rentalOffice17.address := '500 Michigan Ave, Chicago, IL, 60611'

!new Truck('truck15')
!truck15.id := 32
!truck15.registrationState := #CO
!truck15.licensePlateNumber := 'CHI5890'
!truck15.vehicleTypeCode := #TRUCK
!truck15.registrationLastMaintenanceDate := Date('2023-04-25')
!truck15.expirationDate := Date('2024-04-24')
!truck15.odometerReading := 22000
!truck15.gasTankCapacity := 24.0
!truck15.workingRadio := true
!truck15.mileage := 14

!new Vehicle('vehicle18')
!vehicle18.id := 33
!vehicle18.registrationState := #CO
!vehicle18.licensePlateNumber := 'CHICAR21'
!vehicle18.vehicleTypeCode := #TRUCK10
!vehicle18.registrationLastMaintenanceDate := Date('2023-08-05')
!vehicle18.expirationDate := Date('2024-08-04')

!new Vehicle('vehicle19')
!vehicle19.id := 34
!vehicle19.registrationState := #CO
!vehicle19.licensePlateNumber := 'ILES304'
!vehicle19.vehicleTypeCode := #OPEN_TRAILER
!vehicle19.registrationLastMaintenanceDate := Date('2023-06-15')
!vehicle19.expirationDate := Date('2024-06-14')

!new Individual('individualCustomer12')
!individualCustomer12.name := 'Jamal Carter'
!individualCustomer12.address := '905 W Jackson Blvd, Chicago, IL, 60607'
!individualCustomer12.poorRisk := false
!individualCustomer12.homePhone := '312-555-0294'
!individualCustomer12.driverLicenseState := #CO
!individualCustomer12.driverLicenseNumber := 9087654
!individualCustomer12.driverLicenseExpirationDate := Date('2026-05-05')

!new Company('company14')
!company14.name := 'Midtown Delivery Services'
!company14.address := '1500 State St, Chicago, IL, 60610'
!company14.poorRisk := false
!company14.idNumber := 776543210

!new RentalAgreement('rentalAgreement26')
!rentalAgreement26.number := 30501
!rentalAgreement26.rentalDate := Date('2023-10-03')
!rentalAgreement26.anticipatedDuration := 2
!rentalAgreement26.depositPaid := 150.00
!rentalAgreement26.quotedDailyRate := 65.00
!rentalAgreement26.quotedRatePerMile := 0.35

!new RentalAgreement('rentalAgreement27')
!rentalAgreement27.number := 30502
!rentalAgreement27.rentalDate := Date('2023-10-05')
!rentalAgreement27.anticipatedDuration := 5
!rentalAgreement27.depositPaid := 250.00
!rentalAgreement27.quotedDailyRate := 45.00
!rentalAgreement27.quotedRatePerMile := 0.25

!new RentalAgreement('rentalAgreement28')
!rentalAgreement28.number := 30503
!rentalAgreement28.rentalDate := Date('2023-10-07')
!rentalAgreement28.anticipatedDuration := 3
!rentalAgreement28.depositPaid := 100.00
!rentalAgreement28.quotedDailyRate := 60.00
!rentalAgreement28.quotedRatePerMile := 0.40

!insert (rentalOffice17, truck15) into RentalOfficeVehicle
!insert (rentalOffice17, vehicle18) into RentalOfficeVehicle
!insert (rentalOffice17, vehicle19) into RentalOfficeVehicle

!insert (rentalOffice17, rentalAgreement26) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice17, rentalAgreement26) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement26, truck15) into RentalAgreementVehicle
!insert (rentalAgreement26, individualCustomer12) into RentalAgreementCustomer

!insert (rentalOffice17, rentalAgreement27) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice17, rentalAgreement27) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement27, vehicle18) into RentalAgreementVehicle
!insert (rentalAgreement27, company14) into RentalAgreementCustomer

!insert (rentalOffice17, rentalAgreement28) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice17, rentalAgreement28) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement28, vehicle19) into RentalAgreementVehicle
!insert (rentalAgreement28, individualCustomer12) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 78 | 0.00% |
| Multiplicities Errors | 0 | 15 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 0 | 3 | 0.00% |
| License Plates | 0 | 3 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

## Category edge
```
!new RentalOffice('rentalOffice15')
!rentalOffice15.name := 'Desert Oasis Rentals'
!rentalOffice15.number := 33
!rentalOffice15.address := '789 Mirage Lane, Las Vegas, NV, 89109'

!new Truck('truck13')
!truck13.id := 28
!truck13.registrationState := #AK
!truck13.licensePlateNumber := 'TRK-007LV'
!truck13.vehicleTypeCode := #TRUCK
!truck13.registrationLastMaintenanceDate := Date('2023-08-01')
!truck13.expirationDate := Date('2024-08-15')
!truck13.odometerReading := 100000
!truck13.gasTankCapacity := 50.5
!truck13.workingRadio := true
!truck13.mileage := 3

!new Vehicle('vehicle16')
!vehicle16.id := 29
!vehicle16.registrationState := #AK
!vehicle16.licensePlateNumber := 'TRL-303NV'
!vehicle16.vehicleTypeCode := #OPEN_TRAILER
!vehicle16.registrationLastMaintenanceDate := Date('2023-06-15')
!vehicle16.expirationDate := Date('2026-06-15')

!new RentalAgreement('rentalAgreement23')
!rentalAgreement23.number := 1111
!rentalAgreement23.rentalDate := Date('2024-01-01')
!rentalAgreement23.anticipatedDuration := 1
!rentalAgreement23.depositPaid := 0.50
!rentalAgreement23.quotedDailyRate := 5.00
!rentalAgreement23.quotedRatePerMile := 0.20

!new Individual('individualCustomer10')
!individualCustomer10.name := 'Carlos Rivera'
!individualCustomer10.address := '1001 High Dunes Avenue, Phoenix, AZ, 85001'
!individualCustomer10.poorRisk := true
!individualCustomer10.homePhone := '+1-602-555-0420'
!individualCustomer10.driverLicenseState := #AZ
!individualCustomer10.driverLicenseNumber := 2233445
!individualCustomer10.driverLicenseExpirationDate := Date('2030-12-31')

!insert (rentalOffice15, truck13) into RentalOfficeVehicle
!insert (rentalOffice15, vehicle16) into RentalOfficeVehicle

!insert (rentalOffice15, rentalAgreement23) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice15, rentalAgreement23) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement23, truck13) into RentalAgreementVehicle

!insert (rentalAgreement23, individualCustomer10) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 43 | 0.00% |
| Multiplicities Errors | 0 | 6 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 2 | 2 | 100.00% |
| License Plates | 0 | 2 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
789 Mirage Lane, Las Vegas, NV, 89109
```
```
1001 High Dunes Avenue, Phoenix, AZ, 85001
```

## Category invalid
```
!new RentalOffice('rentalOffice10')
!rentalOffice10.name := 'Interstate Vehicle Hire'
!rentalOffice10.number := 205
!rentalOffice10.address := '123 Highway Blvd, Flagstaff, AZ'

!new Vehicle('vehicle10')
!vehicle10.id := 18
!vehicle10.registrationState := #AZ
!vehicle10.licensePlateNumber := 'FLEET10'
!vehicle10.vehicleTypeCode := #TRUCK
!vehicle10.registrationLastMaintenanceDate := Date('2023-07-20')
!vehicle10.expirationDate := Date('2024-05-20')

!new Vehicle('vehicle11')
!vehicle11.id := 19
!vehicle11.registrationState := #AZ
!vehicle11.licensePlateNumber := 'FLEET11'
!vehicle11.vehicleTypeCode := #TRUCK
!vehicle11.registrationLastMaintenanceDate := Date('2023-09-15')
!vehicle11.expirationDate := Date('2024-06-15')

!new RentalAgreement('rentalAgreement14')
!rentalAgreement14.number := 3010
!rentalAgreement14.rentalDate := Date('2023-11-01')
!rentalAgreement14.anticipatedDuration := 60
!rentalAgreement14.depositPaid := 8000.00
!rentalAgreement14.quotedDailyRate := 150.00
!rentalAgreement14.quotedRatePerMile := 0.20

!new Company('company7')
!company7.name := 'Southwest Logistics Ltd.'
!company7.address := '345 Transport Rd, Phoenix, AZ'
!company7.poorRisk := false
!company7.idNumber := 234

!new Company('company8')
!company8.name := 'Desert Transport Co.'
!company8.address := '678 Freight Ave, Las Vegas, NV'
!company8.poorRisk := false
!company8.idNumber := 567

!insert (rentalOffice10, vehicle10) into RentalOfficeVehicle
!insert (rentalOffice10, vehicle11) into RentalOfficeVehicle

!insert (rentalOffice10, rentalAgreement14) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice10, rentalAgreement14) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement14, vehicle10) into RentalAgreementVehicle

!insert (rentalAgreement14, company7) into RentalAgreementCustomer
!insert (rentalAgreement14, company8) into RentalAgreementCustomer
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 7 | 14.29% |
| Invariants Errors (Not included on General) | 0 | 5 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `RentalAgreementCustomer':
  Object `rentalAgreement14' of class `RentalAgreement' is connected to 2 objects of class `Customer'
  at association end `customer' but the multiplicity is specified as `1'.
```

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 3 | 3 | 100.00% |
| License Plates | 0 | 2 | 0.00% |
| Home Phones | 0 | 0 | 0.00% |

| Invalid Addresses | 
|---| 
```
123 Highway Blvd, Flagstaff, AZ
```
```
345 Transport Rd, Phoenix, AZ
```
```
678 Freight Ave, Las Vegas, NV
```

## Generation 3 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 262 | 0.00% |
| Multiplicities Errors | 0 | 37 | 0.00% |
| Invariants Errors | 0 | 20 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 7 | 14.29% |
| Invariants Errors (Not included on General) | 0 | 5 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `RentalAgreementCustomer':
  Object `rentalAgreement14' of class `RentalAgreement' is connected to 2 objects of class `Customer'
  at association end `customer' but the multiplicity is specified as `1'.
```

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 10 | 13 | 76.92% |
| License Plates | 0 | 11 | 0.00% |
| Home Phones | 0 | 3 | 0.00% |

| Invalid Addresses | 
|---| 
```
500 High Peak Drive, Denver, CO, 80202
```
```
222 Pine Street, Boulder, CO, 80302
```
```
999 Rock Quarry Road, Colorado Springs, CO, 80903
```
```
456 Old Timers Street, Portsmouth, NH 03801
```
```
163 Maple Tree Road, Concord, NH 03301
```
```
789 Mirage Lane, Las Vegas, NV, 89109
```
```
1001 High Dunes Avenue, Phoenix, AZ, 85001
```
```
123 Highway Blvd, Flagstaff, AZ
```
```
345 Transport Rd, Phoenix, AZ
```
```
678 Freight Ave, Las Vegas, NV
```

# Generation 4
## Category baseline
```
!new RentalOffice('rentalOffice16')
!rentalOffice16.name := 'DesertDune Rentals'
!rentalOffice16.number := 404
!rentalOffice16.address := '158 Cactus Road, Phoenix, AZ, 85001'

!new Vehicle('vehicle17')
!vehicle17.id := 30
!vehicle17.registrationState := #DE
!vehicle17.licensePlateNumber := 'AZ4590CVC'
!vehicle17.vehicleTypeCode := #TRUCK10
!vehicle17.registrationLastMaintenanceDate := Date('2023-04-18')
!vehicle17.expirationDate := Date('2024-04-17')

!new Truck('truck14')
!truck14.id := 31
!truck14.registrationState := #DE
!truck14.licensePlateNumber := 'AZ5512TOW'
!truck14.vehicleTypeCode := #TRUCK
!truck14.registrationLastMaintenanceDate := Date('2023-08-20')
!truck14.expirationDate := Date('2024-03-05')
!truck14.odometerReading := 230000
!truck14.gasTankCapacity := 45.0
!truck14.workingRadio := true
!truck14.mileage := 12

!new Individual('individualCustomer11')
!individualCustomer11.name := 'Rachel Lim'
!individualCustomer11.address := '321 West Palm Lane, Scottsdale, AZ, 85251'
!individualCustomer11.poorRisk := false
!individualCustomer11.homePhone := '480-678-4321'
!individualCustomer11.driverLicenseState := #AZ
!individualCustomer11.driverLicenseNumber := 4321981
!individualCustomer11.driverLicenseExpirationDate := Date('2028-01-14')

!new Company('company13')
!company13.name := 'Cacti Event Planning'
!company13.address := '456 Event Drive, Tucson, AZ, 85701'
!company13.poorRisk := false
!company13.idNumber := 404012

!new RentalAgreement('rentalAgreement24')
!rentalAgreement24.number := 3007
!rentalAgreement24.rentalDate := Date('2023-11-05')
!rentalAgreement24.anticipatedDuration := 10
!rentalAgreement24.depositPaid := 200.00
!rentalAgreement24.quotedDailyRate := 55.00
!rentalAgreement24.quotedRatePerMile := 0.18

!new RentalAgreement('rentalAgreement25')
!rentalAgreement25.number := 3008
!rentalAgreement25.rentalDate := Date('2023-12-15')
!rentalAgreement25.anticipatedDuration := 7
!rentalAgreement25.depositPaid := 300.00
!rentalAgreement25.quotedDailyRate := 95.00
!rentalAgreement25.quotedRatePerMile := 0.45

!insert (rentalOffice16, vehicle17) into RentalOfficeVehicle
!insert (rentalOffice16, truck14) into RentalOfficeVehicle

!insert (rentalOffice16, rentalAgreement24) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice16, rentalAgreement24) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement24, vehicle17) into RentalAgreementVehicle
!insert (rentalAgreement24, individualCustomer11) into RentalAgreementCustomer

!insert (rentalOffice16, rentalAgreement25) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice16, rentalAgreement25) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement25, truck14) into RentalAgreementVehicle
!insert (rentalAgreement25, company13) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 59 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 3 | 3 | 100.00% |
| License Plates | 0 | 2 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
158 Cactus Road, Phoenix, AZ, 85001
```
```
321 West Palm Lane, Scottsdale, AZ, 85251
```
```
456 Event Drive, Tucson, AZ, 85701
```

## Category boundary
```
!new RentalOffice('rentalOffice21')
!rentalOffice21.name := 'Bayside Haulers LLC'
!rentalOffice21.number := 43
!rentalOffice21.address := '789 Maritime Blvd, Newport, RI 02840'

!new Truck('truck19')
!truck19.id := 40
!truck19.registrationState := #DE
!truck19.licensePlateNumber := 'BHLRI567'
!truck19.vehicleTypeCode := #TRUCK
!truck19.registrationLastMaintenanceDate := Date('2023-02-28')
!truck19.expirationDate := Date('2026-02-28')
!truck19.odometerReading := 1500
!truck19.gasTankCapacity := 80.0
!truck19.workingRadio := true
!truck19.mileage := 12

!new Vehicle('vehicle22')
!vehicle22.id := 41
!vehicle22.registrationState := #DE
!vehicle22.licensePlateNumber := 'BHLRI568'
!vehicle22.vehicleTypeCode := #OPEN_TRAILER
!vehicle22.registrationLastMaintenanceDate := Date('2023-06-01')
!vehicle22.expirationDate := Date('2025-06-01')

!new Truck('truck20')
!truck20.id := 42
!truck20.registrationState := #DE
!truck20.licensePlateNumber := 'BHLRI569'
!truck20.vehicleTypeCode := #TRUCK
!truck20.registrationLastMaintenanceDate := Date('2023-09-15')
!truck20.expirationDate := Date('2025-09-15')
!truck20.odometerReading := 0
!truck20.gasTankCapacity := 100.0
!truck20.workingRadio := false
!truck20.mileage := 11

!new RentalAgreement('rentalAgreement34')
!rentalAgreement34.number := 3005
!rentalAgreement34.rentalDate := Date('2023-12-20')
!rentalAgreement34.anticipatedDuration := 7
!rentalAgreement34.depositPaid := 250.00
!rentalAgreement34.quotedDailyRate := 120.00
!rentalAgreement34.quotedRatePerMile := 0.30

!new RentalAgreement('rentalAgreement35')
!rentalAgreement35.number := 3006
!rentalAgreement35.rentalDate := Date('2023-12-23')
!rentalAgreement35.anticipatedDuration := 0
!rentalAgreement35.depositPaid := 0.00
!rentalAgreement35.quotedDailyRate := 0.00
!rentalAgreement35.quotedRatePerMile := 0.00

!new Individual('individualCustomer15')
!individualCustomer15.name := 'Avery Smith'
!individualCustomer15.address := '456 Ocean Drive, Newport, RI 02840'
!individualCustomer15.poorRisk := false
!individualCustomer15.homePhone := '(401) 555-1010'
!individualCustomer15.driverLicenseState := #DE
!individualCustomer15.driverLicenseNumber := 300
!individualCustomer15.driverLicenseExpirationDate := Date('2030-12-01')

!new Company('company18')
!company18.name := 'Coastal Logistics Corp.'
!company18.address := '333 Seaside Lane, Providence, RI 02903'
!company18.poorRisk := false
!company18.idNumber := 456789

!insert (rentalOffice21, truck19) into RentalOfficeVehicle
!insert (rentalOffice21, vehicle22) into RentalOfficeVehicle
!insert (rentalOffice21, truck20) into RentalOfficeVehicle

!insert (rentalOffice21, rentalAgreement34) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice21, rentalAgreement34) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement34, truck19) into RentalAgreementVehicle
!insert (rentalAgreement34, individualCustomer15) into RentalAgreementCustomer

!insert (rentalOffice21, rentalAgreement35) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice21, rentalAgreement35) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement35, vehicle22) into RentalAgreementVehicle
!insert (rentalAgreement35, company18) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 71 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 3 | 3 | 100.00% |
| License Plates | 0 | 3 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
789 Maritime Blvd, Newport, RI 02840
```
```
456 Ocean Drive, Newport, RI 02840
```
```
333 Seaside Lane, Providence, RI 02903
```

## Category complex
```
!new RentalOffice('rentalOffice23')
!rentalOffice23.name := 'New England Fleet Rentals'
!rentalOffice23.number := 502
!rentalOffice23.address := '200 Beacon St, Boston, MA, 02116'

!new Truck('truck22')
!truck22.id := 44
!truck22.registrationState := #CO
!truck22.licensePlateNumber := 'BOS1987'
!truck22.vehicleTypeCode := #TRUCK
!truck22.registrationLastMaintenanceDate := Date('2023-07-14')
!truck22.expirationDate := Date('2024-07-13')
!truck22.odometerReading := 58000
!truck22.gasTankCapacity := 32.0
!truck22.workingRadio := false
!truck22.mileage := 11

!new Vehicle('vehicle23')
!vehicle23.id := 45
!vehicle23.registrationState := #CO
!vehicle23.licensePlateNumber := 'MAFL459'
!vehicle23.vehicleTypeCode := #OPEN_TRAILER
!vehicle23.registrationLastMaintenanceDate := Date('2023-06-10')
!vehicle23.expirationDate := Date('2024-06-09')

!new Vehicle('vehicle24')
!vehicle24.id := 46
!vehicle24.registrationState := #CO
!vehicle24.licensePlateNumber := 'MAVAN345'
!vehicle24.vehicleTypeCode := #TRUCK10
!vehicle24.registrationLastMaintenanceDate := Date('2023-05-20')
!vehicle24.expirationDate := Date('2024-05-19')

!new Individual('individualCustomer17')
!individualCustomer17.name := 'Sarah Palmer'
!individualCustomer17.address := '789 Commonwealth Ave, Boston, MA, 02215'
!individualCustomer17.poorRisk := true
!individualCustomer17.homePhone := '617-555-0467'
!individualCustomer17.driverLicenseState := #CO
!individualCustomer17.driverLicenseNumber := 2398456
!individualCustomer17.driverLicenseExpirationDate := Date('2027-03-23')

!new Company('company20')
!company20.name := 'Boston Build Solutions, Inc.'
!company20.address := '645 Industrial Rd, Cambridge, MA, 02138'
!company20.poorRisk := false
!company20.idNumber := 215846372

!new RentalAgreement('rentalAgreement37')
!rentalAgreement37.number := 40876
!rentalAgreement37.rentalDate := Date('2023-11-01')
!rentalAgreement37.anticipatedDuration := 3
!rentalAgreement37.depositPaid := 400.00
!rentalAgreement37.quotedDailyRate := 90.00
!rentalAgreement37.quotedRatePerMile := 0.50

!new RentalAgreement('rentalAgreement38')
!rentalAgreement38.number := 40877
!rentalAgreement38.rentalDate := Date('2023-11-03')
!rentalAgreement38.anticipatedDuration := 10
!rentalAgreement38.depositPaid := 350.00
!rentalAgreement38.quotedDailyRate := 70.00
!rentalAgreement38.quotedRatePerMile := 0.30

!new RentalAgreement('rentalAgreement39')
!rentalAgreement39.number := 40878
!rentalAgreement39.rentalDate := Date('2023-11-04')
!rentalAgreement39.anticipatedDuration := 2
!rentalAgreement39.depositPaid := 100.00
!rentalAgreement39.quotedDailyRate := 60.00
!rentalAgreement39.quotedRatePerMile := 0.20

!insert (rentalOffice23, truck22) into RentalOfficeVehicle
!insert (rentalOffice23, vehicle23) into RentalOfficeVehicle
!insert (rentalOffice23, vehicle24) into RentalOfficeVehicle

!insert (rentalOffice23, rentalAgreement37) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice23, rentalAgreement37) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement37, truck22) into RentalAgreementVehicle
!insert (rentalAgreement37, company20) into RentalAgreementCustomer

!insert (rentalOffice23, rentalAgreement38) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice23, rentalAgreement38) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement38, vehicle23) into RentalAgreementVehicle
!insert (rentalAgreement38, company20) into RentalAgreementCustomer

!insert (rentalOffice23, rentalAgreement39) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice23, rentalAgreement39) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement39, vehicle24) into RentalAgreementVehicle
!insert (rentalAgreement39, individualCustomer17) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 78 | 0.00% |
| Multiplicities Errors | 0 | 15 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 1 | 3 | 33.33% |
| License Plates | 0 | 3 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
645 Industrial Rd, Cambridge, MA, 02138
```

## Category edge
```
!new RentalOffice('rentalOffice19')
!rentalOffice19.name := 'Rainforest Rentals'
!rentalOffice19.number := 44
!rentalOffice19.address := '101 Jungle Drive, Hilo, HI, 96720'

!new Truck('truck17')
!truck17.id := 37
!truck17.registrationState := #AK
!truck17.licensePlateNumber := 'TRK-ALOHA'
!truck17.vehicleTypeCode := #TRUCK
!truck17.registrationLastMaintenanceDate := Date('2023-07-10')
!truck17.expirationDate := Date('2024-07-10')
!truck17.odometerReading := 250000
!truck17.gasTankCapacity := 0.0
!truck17.workingRadio := false
!truck17.mileage := 2

!new RentalAgreement('rentalAgreement31')
!rentalAgreement31.number := 5000
!rentalAgreement31.rentalDate := Date('2025-01-01')
!rentalAgreement31.anticipatedDuration := 1095
!rentalAgreement31.depositPaid := 300.00
!rentalAgreement31.quotedDailyRate := 40.00
!rentalAgreement31.quotedRatePerMile := 0.50

!new Company('company16')
!company16.name := 'Island Transport Solutions'
!company16.address := '808 Shoreline Drive, Honolulu, HI, 96801'
!company16.poorRisk := false
!company16.idNumber := 2025

!insert (rentalOffice19, truck17) into RentalOfficeVehicle

!insert (rentalOffice19, rentalAgreement31) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice19, rentalAgreement31) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement31, truck17) into RentalAgreementVehicle
!insert (rentalAgreement31, company16) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 32 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 2 | 2 | 100.00% |
| License Plates | 0 | 1 | 0.00% |
| Home Phones | 0 | 0 | 0.00% |

| Invalid Addresses | 
|---| 
```
101 Jungle Drive, Hilo, HI, 96720
```
```
808 Shoreline Drive, Honolulu, HI, 96801
```

## Category invalid
```
!new RentalOffice('rentalOffice13')
!rentalOffice13.name := 'Rapid Response Rentals'
!rentalOffice13.number := 309
!rentalOffice13.address := '789 Quick St, Miami, FL'

!new Truck('truck11')
!truck11.id := 25
!truck11.registrationState := #FL
!truck11.licensePlateNumber := 'EMRG001'
!truck11.vehicleTypeCode := #TRUCK
!truck11.registrationLastMaintenanceDate := Date('2023-10-05')
!truck11.expirationDate := Date('2024-03-01')
!truck11.odometerReading := 0
!truck11.gasTankCapacity := 0
!truck11.workingRadio := true
!truck11.mileage := 0

!new RentalAgreement('rentalAgreement20')
!rentalAgreement20.number := 4020
!rentalAgreement20.rentalDate := Date('2023-10-20')
!rentalAgreement20.anticipatedDuration := 14
!rentalAgreement20.depositPaid := 1000.00
!rentalAgreement20.quotedDailyRate := 100.00
!rentalAgreement20.quotedRatePerMile := 0.25

!new RentalAgreement('rentalAgreement21')
!rentalAgreement21.number := 4021
!rentalAgreement21.rentalDate := Date('2023-10-21')
!rentalAgreement21.anticipatedDuration := 3
!rentalAgreement21.depositPaid := 500.00
!rentalAgreement21.quotedDailyRate := 120.00
!rentalAgreement21.quotedRatePerMile := 0.30

!new Individual('individualCustomer9')
!individualCustomer9.name := 'Maria Gonzalez'
!individualCustomer9.address := '123 Bayside Ln, Miami, FL'
!individualCustomer9.poorRisk := true
!individualCustomer9.homePhone := '305-555-0111'
!individualCustomer9.driverLicenseState := #FL
!individualCustomer9.driverLicenseNumber := 876543
!individualCustomer9.driverLicenseExpirationDate := Date('2026-02-11')

!new Company('company11')
!company11.name := 'Event Services Inc.'
!company11.address := '456 Fest St, Miami, FL'
!company11.poorRisk := false
!company11.idNumber := 909

!insert (rentalOffice13, truck11) into RentalOfficeVehicle

!insert (rentalOffice13, rentalAgreement20) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice13, rentalAgreement20) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement20, truck11) into RentalAgreementVehicle
!insert (rentalAgreement20, individualCustomer9) into RentalAgreementCustomer

!insert (rentalOffice13, rentalAgreement21) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice13, rentalAgreement21) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement21, truck11) into RentalAgreementVehicle
!insert (rentalAgreement21, company11) into RentalAgreementCustomer
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 9 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 3 | 3 | 100.00% |
| License Plates | 0 | 1 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
789 Quick St, Miami, FL
```
```
123 Bayside Ln, Miami, FL
```
```
456 Fest St, Miami, FL
```

## Generation 4 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 291 | 0.00% |
| Multiplicities Errors | 0 | 41 | 0.00% |
| Invariants Errors | 0 | 20 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 9 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 12 | 14 | 85.71% |
| License Plates | 0 | 10 | 0.00% |
| Home Phones | 0 | 4 | 0.00% |

| Invalid Addresses | 
|---| 
```
158 Cactus Road, Phoenix, AZ, 85001
```
```
321 West Palm Lane, Scottsdale, AZ, 85251
```
```
456 Event Drive, Tucson, AZ, 85701
```
```
789 Maritime Blvd, Newport, RI 02840
```
```
456 Ocean Drive, Newport, RI 02840
```
```
333 Seaside Lane, Providence, RI 02903
```
```
645 Industrial Rd, Cambridge, MA, 02138
```
```
101 Jungle Drive, Hilo, HI, 96720
```
```
808 Shoreline Drive, Honolulu, HI, 96801
```
```
789 Quick St, Miami, FL
```
```
123 Bayside Ln, Miami, FL
```
```
456 Fest St, Miami, FL
```

# Generation 5
## Category baseline
```
!new RentalOffice('rentalOffice20')
!rentalOffice20.name := 'BayArea Rentals'
!rentalOffice20.number := 505
!rentalOffice20.address := '742 Bay Street, San Francisco, CA, 94109'

!new Vehicle('vehicle21')
!vehicle21.id := 38
!vehicle21.registrationState := #CA
!vehicle21.licensePlateNumber := 'CA9910HYB'
!vehicle21.vehicleTypeCode := #TRUCK10
!vehicle21.registrationLastMaintenanceDate := Date('2023-03-22')
!vehicle21.expirationDate := Date('2024-03-21')

!new Truck('truck18')
!truck18.id := 39
!truck18.registrationState := #CA
!truck18.licensePlateNumber := 'CA7810RFT'
!truck18.vehicleTypeCode := #TRUCK
!truck18.registrationLastMaintenanceDate := Date('2023-09-05')
!truck18.expirationDate := Date('2024-05-01')
!truck18.odometerReading := 160000
!truck18.gasTankCapacity := 55.0
!truck18.workingRadio := true
!truck18.mileage := 9

!new Individual('individualCustomer14')
!individualCustomer14.name := 'Jorge Hernandez'
!individualCustomer14.address := '100 Forest Hill Drive, Palo Alto, CA, 94301'
!individualCustomer14.poorRisk := true
!individualCustomer14.homePhone := '650-321-5678'
!individualCustomer14.driverLicenseState := #CA
!individualCustomer14.driverLicenseNumber := 8765432
!individualCustomer14.driverLicenseExpirationDate := Date('2029-08-30')

!new Company('company17')
!company17.name := 'FreshFoods Suppliers'
!company17.address := '888 Market Lane, Oakland, CA, 94607'
!company17.poorRisk := false
!company17.idNumber := 505900

!new RentalAgreement('rentalAgreement32')
!rentalAgreement32.number := 3009
!rentalAgreement32.rentalDate := Date('2023-09-25')
!rentalAgreement32.anticipatedDuration := 2
!rentalAgreement32.depositPaid := 300.00
!rentalAgreement32.quotedDailyRate := 75.00
!rentalAgreement32.quotedRatePerMile := 0.22

!new RentalAgreement('rentalAgreement33')
!rentalAgreement33.number := 3010
!rentalAgreement33.rentalDate := Date('2023-10-10')
!rentalAgreement33.anticipatedDuration := 5
!rentalAgreement33.depositPaid := 1000.00
!rentalAgreement33.quotedDailyRate := 130.00
!rentalAgreement33.quotedRatePerMile := 0.55

!insert (rentalOffice20, vehicle21) into RentalOfficeVehicle
!insert (rentalOffice20, truck18) into RentalOfficeVehicle

!insert (rentalOffice20, rentalAgreement32) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice20, rentalAgreement32) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement32, vehicle21) into RentalAgreementVehicle
!insert (rentalAgreement32, individualCustomer14) into RentalAgreementCustomer

!insert (rentalOffice20, rentalAgreement33) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice20, rentalAgreement33) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement33, truck18) into RentalAgreementVehicle
!insert (rentalAgreement33, company17) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 59 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 2 | 3 | 66.67% |
| License Plates | 0 | 2 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
100 Forest Hill Drive, Palo Alto, CA, 94301
```
```
888 Market Lane, Oakland, CA, 94607
```

## Category boundary
```
!new RentalOffice('rentalOffice26')
!rentalOffice26.name := 'Alpine Rentals & Logistics'
!rentalOffice26.number := 107
!rentalOffice26.address := '123 Summit Peaks Road, Denver, CO 80202'

!new Truck('truck24')
!truck24.id := 51
!truck24.registrationState := #CO
!truck24.licensePlateNumber := 'ARLCO777'
!truck24.vehicleTypeCode := #TRUCK
!truck24.registrationLastMaintenanceDate := Date('2023-09-10')
!truck24.expirationDate := Date('2024-09-10')
!truck24.odometerReading := 50
!truck24.gasTankCapacity := 120.0
!truck24.workingRadio := false
!truck24.mileage := 10

!new Vehicle('vehicle26')
!vehicle26.id := 52
!vehicle26.registrationState := #CO
!vehicle26.licensePlateNumber := 'ARLCO888'
!vehicle26.vehicleTypeCode := #OPEN_TRAILER
!vehicle26.registrationLastMaintenanceDate := Date('2023-08-15')
!vehicle26.expirationDate := Date('2025-08-15')

!new Truck('truck25')
!truck25.id := 53
!truck25.registrationState := #CO
!truck25.licensePlateNumber := 'ARLCO999'
!truck25.vehicleTypeCode := #TRUCK
!truck25.registrationLastMaintenanceDate := Date('2023-07-20')
!truck25.expirationDate := Date('2026-07-20')
!truck25.odometerReading := 999999
!truck25.gasTankCapacity := 150.0
!truck25.workingRadio := true
!truck25.mileage := 7

!new RentalAgreement('rentalAgreement43')
!rentalAgreement43.number := 5001
!rentalAgreement43.rentalDate := Date('2023-11-15')
!rentalAgreement43.anticipatedDuration := 30
!rentalAgreement43.depositPaid := 400.00
!rentalAgreement43.quotedDailyRate := 95.00
!rentalAgreement43.quotedRatePerMile := 0.25

!new RentalAgreement('rentalAgreement44')
!rentalAgreement44.number := 5002
!rentalAgreement44.rentalDate := Date('2023-11-22')
!rentalAgreement44.anticipatedDuration := 2
!rentalAgreement44.depositPaid := 0.00
!rentalAgreement44.quotedDailyRate := 0.00
!rentalAgreement44.quotedRatePerMile := 0.20

!new Individual('individualCustomer20')
!individualCustomer20.name := 'Jenna Thompson'
!individualCustomer20.address := '456 Mountain View Way, Boulder, CO 80302'
!individualCustomer20.poorRisk := false
!individualCustomer20.homePhone := '(303) 555-1122'
!individualCustomer20.driverLicenseState := #CO
!individualCustomer20.driverLicenseNumber := 5100
!individualCustomer20.driverLicenseExpirationDate := Date('2030-12-01')

!new Company('company22')
!company22.name := 'High Altitude Construction'
!company22.address := '890 Alpine Drive, Colorado Springs, CO 80903'
!company22.poorRisk := true
!company22.idNumber := 320045

!insert (rentalOffice26, truck24) into RentalOfficeVehicle
!insert (rentalOffice26, vehicle26) into RentalOfficeVehicle
!insert (rentalOffice26, truck25) into RentalOfficeVehicle

!insert (rentalOffice26, rentalAgreement43) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice26, rentalAgreement43) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement43, truck25) into RentalAgreementVehicle
!insert (rentalAgreement43, company22) into RentalAgreementCustomer

!insert (rentalOffice26, rentalAgreement44) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice26, rentalAgreement44) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement44, truck24) into RentalAgreementVehicle
!insert (rentalAgreement44, individualCustomer20) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 71 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 3 | 3 | 100.00% |
| License Plates | 0 | 3 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
123 Summit Peaks Road, Denver, CO 80202
```
```
456 Mountain View Way, Boulder, CO 80302
```
```
890 Alpine Drive, Colorado Springs, CO 80903
```

## Category complex
```
!new RentalOffice('rentalOffice27')
!rentalOffice27.name := 'Sunshine Vehicle Rentals – Biscayne Bay'
!rentalOffice27.number := 303
!rentalOffice27.address := '678 Biscayne Blvd, Miami, FL, 33132'

!new Truck('truck26')
!truck26.id := 54
!truck26.registrationState := #FL
!truck26.licensePlateNumber := 'FLRIDE89'
!truck26.vehicleTypeCode := #TRUCK
!truck26.registrationLastMaintenanceDate := Date('2023-09-01')
!truck26.expirationDate := Date('2024-08-31')
!truck26.odometerReading := 36500
!truck26.gasTankCapacity := 28.0
!truck26.workingRadio := true
!truck26.mileage := 13

!new Vehicle('vehicle27')
!vehicle27.id := 55
!vehicle27.registrationState := #FL
!vehicle27.licensePlateNumber := 'SUNFLY56'
!vehicle27.vehicleTypeCode := #TRUCK10
!vehicle27.registrationLastMaintenanceDate := Date('2023-08-15')
!vehicle27.expirationDate := Date('2024-08-14')

!new Vehicle('vehicle28')
!vehicle28.id := 56
!vehicle28.registrationState := #FL
!vehicle28.licensePlateNumber := 'FLYT701'
!vehicle28.vehicleTypeCode := #OPEN_TRAILER
!vehicle28.registrationLastMaintenanceDate := Date('2023-07-25')
!vehicle28.expirationDate := Date('2024-07-24')

!new Individual('individualCustomer21')
!individualCustomer21.name := 'Kiara Fernández'
!individualCustomer21.address := '245 Ocean Drive, Miami Beach, FL, 33139'
!individualCustomer21.poorRisk := false
!individualCustomer21.homePhone := '305-555-0912'
!individualCustomer21.driverLicenseState := #FL
!individualCustomer21.driverLicenseNumber := 3258967
!individualCustomer21.driverLicenseExpirationDate := Date('2025-11-30')

!new Company('company23')
!company23.name := 'Miami Maritime Logistics'
!company23.address := '120 Seaport Lane, Miami, FL, 33137'
!company23.poorRisk := false
!company23.idNumber := 992314578

!new RentalAgreement('rentalAgreement45')
!rentalAgreement45.number := 50987
!rentalAgreement45.rentalDate := Date('2023-12-01')
!rentalAgreement45.anticipatedDuration := 4
!rentalAgreement45.depositPaid := 450.00
!rentalAgreement45.quotedDailyRate := 110.00
!rentalAgreement45.quotedRatePerMile := 0.45

!new RentalAgreement('rentalAgreement46')
!rentalAgreement46.number := 50988
!rentalAgreement46.rentalDate := Date('2023-12-03')
!rentalAgreement46.anticipatedDuration := 7
!rentalAgreement46.depositPaid := 600.00
!rentalAgreement46.quotedDailyRate := 150.00
!rentalAgreement46.quotedRatePerMile := 0.60

!new RentalAgreement('rentalAgreement47')
!rentalAgreement47.number := 50989
!rentalAgreement47.rentalDate := Date('2023-12-05')
!rentalAgreement47.anticipatedDuration := 10
!rentalAgreement47.depositPaid := 700.00
!rentalAgreement47.quotedDailyRate := 140.00
!rentalAgreement47.quotedRatePerMile := 0.55

!insert (rentalOffice27, truck26) into RentalOfficeVehicle
!insert (rentalOffice27, vehicle27) into RentalOfficeVehicle
!insert (rentalOffice27, vehicle28) into RentalOfficeVehicle

!insert (rentalOffice27, rentalAgreement45) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice27, rentalAgreement45) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement45, truck26) into RentalAgreementVehicle
!insert (rentalAgreement45, company23) into RentalAgreementCustomer

!insert (rentalOffice27, rentalAgreement46) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice27, rentalAgreement46) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement46, vehicle27) into RentalAgreementVehicle
!insert (rentalAgreement46, individualCustomer21) into RentalAgreementCustomer

!insert (rentalOffice27, rentalAgreement47) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice27, rentalAgreement47) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement47, vehicle28) into RentalAgreementVehicle
!insert (rentalAgreement47, company23) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 78 | 0.00% |
| Multiplicities Errors | 0 | 15 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 1 | 3 | 33.33% |
| License Plates | 0 | 3 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
120 Seaport Lane, Miami, FL, 33137
```

## Category edge
```
!new RentalOffice('rentalOffice25')
!rentalOffice25.name := 'Alpine Car & Trailer Rentals'
!rentalOffice25.number := 55
!rentalOffice25.address := '202 Summit Road, Denver, CO, 80202'

!new Truck('electricTruck')
!electricTruck.id := 49
!electricTruck.registrationState := #CO
!electricTruck.licensePlateNumber := 'ECO-TRUK'
!electricTruck.vehicleTypeCode := #TRUCK
!electricTruck.registrationLastMaintenanceDate := Date('2023-05-20')
!electricTruck.expirationDate := Date('2024-05-20')
!electricTruck.odometerReading := 50
!electricTruck.gasTankCapacity := 0.0
!electricTruck.workingRadio := true
!electricTruck.mileage := 0

!new Vehicle('customTrailer')
!customTrailer.id := 50
!customTrailer.registrationState := #CO
!customTrailer.licensePlateNumber := 'CUST-089'
!customTrailer.vehicleTypeCode := #OPEN_TRAILER
!customTrailer.registrationLastMaintenanceDate := Date('2023-04-10')
!customTrailer.expirationDate := Date('2025-04-10')

!new RentalAgreement('rentalAgreement42a')
!rentalAgreement42a.number := 2001
!rentalAgreement42a.rentalDate := Date('2023-07-15')
!rentalAgreement42a.anticipatedDuration := 3
!rentalAgreement42a.depositPaid := 0.00
!rentalAgreement42a.quotedDailyRate := 10.00
!rentalAgreement42a.quotedRatePerMile := 0.00

!new RentalAgreement('rentalAgreement42b')
!rentalAgreement42b.number := 2002
!rentalAgreement42b.rentalDate := Date('2023-07-15')
!rentalAgreement42b.anticipatedDuration := 3
!rentalAgreement42b.depositPaid := 0.00
!rentalAgreement42b.quotedDailyRate := 10.00
!rentalAgreement42b.quotedRatePerMile := 0.00

!new Individual('individualCustomer19')
!individualCustomer19.name := 'Allison Green'
!individualCustomer19.address := '404 Pine Street, Boulder, CO, 80302'
!individualCustomer19.poorRisk := false
!individualCustomer19.homePhone := '+1-720-555-1379'
!individualCustomer19.driverLicenseState := #CO
!individualCustomer19.driverLicenseNumber := 678900
!individualCustomer19.driverLicenseExpirationDate := Date('2031-11-25')

!insert (rentalOffice25, electricTruck) into RentalOfficeVehicle
!insert (rentalOffice25, customTrailer) into RentalOfficeVehicle

!insert (rentalOffice25, rentalAgreement42a) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice25, rentalAgreement42a) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement42a, electricTruck) into RentalAgreementVehicle
!insert (rentalAgreement42a, individualCustomer19) into RentalAgreementCustomer

!insert (rentalOffice25, rentalAgreement42b) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice25, rentalAgreement42b) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement42b, customTrailer) into RentalAgreementVehicle
!insert (rentalAgreement42b, individualCustomer19) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 54 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 1 | 2 | 50.00% |
| License Plates | 0 | 2 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
202 Summit Road, Denver, CO, 80202
```

## Category invalid
```
!new RentalOffice('rentalOffice18')
!rentalOffice18.name := 'City Tours Rentals'
!rentalOffice18.number := 412
!rentalOffice18.address := '237 Park Ave, Orlando, FL'

!new Truck('truck16')
!truck16.id := 35
!truck16.registrationState := #FL
!truck16.licensePlateNumber := 'TOUR123'
!truck16.vehicleTypeCode := #TRUCK
!truck16.registrationLastMaintenanceDate := Date('2022-08-15')
!truck16.expirationDate := Date('2024-06-30')
!truck16.odometerReading := 0
!truck16.gasTankCapacity := 0
!truck16.workingRadio := true
!truck16.mileage := 0

!new Vehicle('vehicle20')
!vehicle20.id := 36
!vehicle20.registrationState := #FL
!vehicle20.licensePlateNumber := 'TOUR456'
!vehicle20.vehicleTypeCode := #OPEN_TRAILER
!vehicle20.registrationLastMaintenanceDate := Date('2023-10-05')
!vehicle20.expirationDate := Date('2024-10-05')

!new RentalAgreement('rentalAgreement29')
!rentalAgreement29.number := 5030
!rentalAgreement29.rentalDate := Date('2023-12-15')
!rentalAgreement29.anticipatedDuration := 10
!rentalAgreement29.depositPaid := 2000.00
!rentalAgreement29.quotedDailyRate := 75.00
!rentalAgreement29.quotedRatePerMile := 0.10

!new RentalAgreement('rentalAgreement30')
!rentalAgreement30.number := 5031
!rentalAgreement30.rentalDate := Date('2023-12-16')
!rentalAgreement30.anticipatedDuration := 5
!rentalAgreement30.depositPaid := 1500.00
!rentalAgreement30.quotedDailyRate := 100.00
!rentalAgreement30.quotedRatePerMile := 0.15

!new Individual('individualCustomer13')
!individualCustomer13.name := 'Alex Rivera'
!individualCustomer13.address := '789 Sunshine Blvd, Miami, FL'
!individualCustomer13.poorRisk := false
!individualCustomer13.homePhone := '305-555-0222'
!individualCustomer13.driverLicenseState := #FL
!individualCustomer13.driverLicenseNumber := 234567
!individualCustomer13.driverLicenseExpirationDate := Date('2025-12-01')

!new Company('company15')
!company15.name := 'Holiday Adventures LLC'
!company15.address := '321 Experience St, Orlando, FL'
!company15.poorRisk := false
!company15.idNumber := 12345

!insert (rentalOffice18, truck16) into RentalOfficeVehicle
!insert (rentalOffice18, vehicle20) into RentalOfficeVehicle

!insert (rentalOffice18, rentalAgreement29) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice18, rentalAgreement29) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement29, truck16) into RentalAgreementVehicle
!insert (rentalAgreement29, individualCustomer13) into RentalAgreementCustomer

!insert (rentalOffice18, rentalAgreement30) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice18, rentalAgreement30) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement30, vehicle20) into RentalAgreementVehicle
!insert (rentalAgreement30, company15) into RentalAgreementCustomer
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 10 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 2 | 3 | 66.67% |
| License Plates | 0 | 2 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
789 Sunshine Blvd, Miami, FL
```
```
321 Experience St, Orlando, FL
```

## Generation 5 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 321 | 0.00% |
| Multiplicities Errors | 0 | 46 | 0.00% |
| Invariants Errors | 0 | 20 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 10 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 9 | 14 | 64.29% |
| License Plates | 0 | 12 | 0.00% |
| Home Phones | 0 | 5 | 0.00% |

| Invalid Addresses | 
|---| 
```
100 Forest Hill Drive, Palo Alto, CA, 94301
```
```
888 Market Lane, Oakland, CA, 94607
```
```
123 Summit Peaks Road, Denver, CO 80202
```
```
456 Mountain View Way, Boulder, CO 80302
```
```
890 Alpine Drive, Colorado Springs, CO 80903
```
```
120 Seaport Lane, Miami, FL, 33137
```
```
202 Summit Road, Denver, CO, 80202
```
```
789 Sunshine Blvd, Miami, FL
```
```
321 Experience St, Orlando, FL
```

# Generation 6
## Category baseline
```
!new RentalOffice('rentalOffice24')
!rentalOffice24.name := 'WindyCity Rentals'
!rentalOffice24.number := 606
!rentalOffice24.address := '960 Lake Shore Drive, Chicago, IL, 60611'

!new Vehicle('vehicle25')
!vehicle25.id := 47
!vehicle25.registrationState := #CO
!vehicle25.licensePlateNumber := 'IL5623ELS'
!vehicle25.vehicleTypeCode := #TRUCK10
!vehicle25.registrationLastMaintenanceDate := Date('2023-07-01')
!vehicle25.expirationDate := Date('2024-07-01')

!new Truck('truck23')
!truck23.id := 48
!truck23.registrationState := #CO
!truck23.licensePlateNumber := 'IL1122DMP'
!truck23.vehicleTypeCode := #TRUCK
!truck23.registrationLastMaintenanceDate := Date('2023-02-28')
!truck23.expirationDate := Date('2023-12-22')
!truck23.odometerReading := 140000
!truck23.gasTankCapacity := 70.0
!truck23.workingRadio := true
!truck23.mileage := 6

!new Individual('individualCustomer18')
!individualCustomer18.name := 'Emily Nguyen'
!individualCustomer18.address := '347 Oak Avenue, Evanston, IL, 60201'
!individualCustomer18.poorRisk := false
!individualCustomer18.homePhone := '847-555-7890'
!individualCustomer18.driverLicenseState := #CO
!individualCustomer18.driverLicenseNumber := 3479021
!individualCustomer18.driverLicenseExpirationDate := Date('2025-02-10')

!new Company('company21')
!company21.name := 'Midwest Builders'
!company21.address := '200 Construction Way, Naperville, IL, 60540'
!company21.poorRisk := true
!company21.idNumber := 606777

!new RentalAgreement('rentalAgreement40')
!rentalAgreement40.number := 3011
!rentalAgreement40.rentalDate := Date('2023-11-15')
!rentalAgreement40.anticipatedDuration := 4
!rentalAgreement40.depositPaid := 150.00
!rentalAgreement40.quotedDailyRate := 45.00
!rentalAgreement40.quotedRatePerMile := 0.30

!new RentalAgreement('rentalAgreement41')
!rentalAgreement41.number := 3012
!rentalAgreement41.rentalDate := Date('2023-11-30')
!rentalAgreement41.anticipatedDuration := 10
!rentalAgreement41.depositPaid := 1100.00
!rentalAgreement41.quotedDailyRate := 175.00
!rentalAgreement41.quotedRatePerMile := 0.60

!insert (rentalOffice24, vehicle25) into RentalOfficeVehicle
!insert (rentalOffice24, truck23) into RentalOfficeVehicle

!insert (rentalOffice24, rentalAgreement40) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice24, rentalAgreement40) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement40, vehicle25) into RentalAgreementVehicle
!insert (rentalAgreement40, individualCustomer18) into RentalAgreementCustomer

!insert (rentalOffice24, rentalAgreement41) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice24, rentalAgreement41) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement41, truck23) into RentalAgreementVehicle
!insert (rentalAgreement41, company21) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 59 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 2 | 3 | 66.67% |
| License Plates | 0 | 2 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
347 Oak Avenue, Evanston, IL, 60201
```
```
200 Construction Way, Naperville, IL, 60540
```

## Category boundary
```
!new RentalOffice('rentalOffice29')
!rentalOffice29.name := 'Coastal Rental Solutions'
!rentalOffice29.number := 212
!rentalOffice29.address := '321 Ocean Front Walk, Santa Monica, CA 90401'

!new Truck('truck30')
!truck30.id := 59
!truck30.registrationState := #CO
!truck30.licensePlateNumber := 'CRSCA123'
!truck30.vehicleTypeCode := #TRUCK
!truck30.registrationLastMaintenanceDate := Date('2023-10-05')
!truck30.expirationDate := Date('2024-10-05')
!truck30.odometerReading := 5000
!truck30.gasTankCapacity := 140.0
!truck30.workingRadio := true
!truck30.mileage := 9

!new Vehicle('vehicle30')
!vehicle30.id := 60
!vehicle30.registrationState := #CO
!vehicle30.licensePlateNumber := 'CRSCA456'
!vehicle30.vehicleTypeCode := #OPEN_TRAILER
!vehicle30.registrationLastMaintenanceDate := Date('2023-02-14')
!vehicle30.expirationDate := Date('2025-02-14')

!new Truck('truck31')
!truck31.id := 61
!truck31.registrationState := #CO
!truck31.licensePlateNumber := 'CRSCA789'
!truck31.vehicleTypeCode := #TRUCK
!truck31.registrationLastMaintenanceDate := Date('2023-05-20')
!truck31.expirationDate := Date('2025-05-20')
!truck31.odometerReading := 0
!truck31.gasTankCapacity := 130.0
!truck31.workingRadio := true
!truck31.mileage := 11

!new RentalAgreement('rentalAgreement49')
!rentalAgreement49.number := 4001
!rentalAgreement49.rentalDate := Date('2023-11-10')
!rentalAgreement49.anticipatedDuration := 7
!rentalAgreement49.depositPaid := 0.00
!rentalAgreement49.quotedDailyRate := 90.00
!rentalAgreement49.quotedRatePerMile := 0.15

!new RentalAgreement('rentalAgreement50')
!rentalAgreement50.number := 4002
!rentalAgreement50.rentalDate := Date('2023-12-05')
!rentalAgreement50.anticipatedDuration := 0
!rentalAgreement50.depositPaid := 0.00
!rentalAgreement50.quotedDailyRate := 0.00
!rentalAgreement50.quotedRatePerMile := 0.00

!new Individual('individualCustomer22')
!individualCustomer22.name := 'Miguel Fernández'
!individualCustomer22.address := '102 Sunset Strip, Santa Monica, CA 90405'
!individualCustomer22.poorRisk := false
!individualCustomer22.homePhone := '(424) 555-0090'
!individualCustomer22.driverLicenseState := #CO
!individualCustomer22.driverLicenseNumber := 4501
!individualCustomer22.driverLicenseExpirationDate := Date('2030-12-01')

!new Company('company25')
!company25.name := 'Pacific International Shipping'
!company25.address := '4100 Marina Blvd, Long Beach, CA 90803'
!company25.poorRisk := false
!company25.idNumber := 671004

!insert (rentalOffice29, truck30) into RentalOfficeVehicle
!insert (rentalOffice29, vehicle30) into RentalOfficeVehicle
!insert (rentalOffice29, truck31) into RentalOfficeVehicle

!insert (rentalOffice29, rentalAgreement49) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice29, rentalAgreement49) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement49, truck30) into RentalAgreementVehicle
!insert (rentalAgreement49, individualCustomer22) into RentalAgreementCustomer

!insert (rentalOffice29, rentalAgreement50) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice29, rentalAgreement50) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement50, truck31) into RentalAgreementVehicle
!insert (rentalAgreement50, company25) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 71 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 3 | 3 | 100.00% |
| License Plates | 0 | 3 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
321 Ocean Front Walk, Santa Monica, CA 90401
```
```
102 Sunset Strip, Santa Monica, CA 90405
```
```
4100 Marina Blvd, Long Beach, CA 90803
```

## Category complex
```
!new RentalOffice('rentalOffice30')
!rentalOffice30.name := 'Rocky Mountain Rentals – Downtown Branch'
!rentalOffice30.number := 707
!rentalOffice30.address := '1500 Larimer St, Denver, CO, 80202'

!new Truck('offRoadTruck')
!offRoadTruck.id := 62
!offRoadTruck.registrationState := #CO
!offRoadTruck.licensePlateNumber := 'COOFF78'
!offRoadTruck.vehicleTypeCode := #TRUCK
!offRoadTruck.registrationLastMaintenanceDate := Date('2023-03-28')
!offRoadTruck.expirationDate := Date('2024-03-27')
!offRoadTruck.odometerReading := 62400
!offRoadTruck.gasTankCapacity := 35.0
!offRoadTruck.workingRadio := true
!offRoadTruck.mileage := 9

!new Vehicle('mountainBikeTrailer')
!mountainBikeTrailer.id := 63
!mountainBikeTrailer.registrationState := #CO
!mountainBikeTrailer.licensePlateNumber := 'COTRAIL9'
!mountainBikeTrailer.vehicleTypeCode := #OPEN_TRAILER
!mountainBikeTrailer.registrationLastMaintenanceDate := Date('2023-05-10')
!mountainBikeTrailer.expirationDate := Date('2024-05-09')

!new Vehicle('snowmobile')
!snowmobile.id := 64
!snowmobile.registrationState := #CO
!snowmobile.licensePlateNumber := 'COSNOW45'
!snowmobile.vehicleTypeCode := #COVERED_TRAILER
!snowmobile.registrationLastMaintenanceDate := Date('2023-11-01')
!snowmobile.expirationDate := Date('2024-10-31')

!new Individual('individualCustomer23')
!individualCustomer23.name := 'Harper Collins'
!individualCustomer23.address := '325 Mountain Rd, Boulder, CO, 80301'
!individualCustomer23.poorRisk := false
!individualCustomer23.homePhone := '720-555-0123'
!individualCustomer23.driverLicenseState := #CO
!individualCustomer23.driverLicenseNumber := 889045
!individualCustomer23.driverLicenseExpirationDate := Date('2026-07-14')

!new Company('company26')
!company26.name := 'Alpine Adventures, LLC'
!company26.address := '889 Peak Ave, Colorado Springs, CO, 80903'
!company26.poorRisk := false
!company26.idNumber := 456987321

!new RentalAgreement('rentalAgreement51')
!rentalAgreement51.number := 61012
!rentalAgreement51.rentalDate := Date('2023-12-15')
!rentalAgreement51.anticipatedDuration := 5
!rentalAgreement51.depositPaid := 350.00
!rentalAgreement51.quotedDailyRate := 125.00
!rentalAgreement51.quotedRatePerMile := 0.55

!new RentalAgreement('rentalAgreement52')
!rentalAgreement52.number := 61013
!rentalAgreement52.rentalDate := Date('2023-12-17')
!rentalAgreement52.anticipatedDuration := 10
!rentalAgreement52.depositPaid := 500.00
!rentalAgreement52.quotedDailyRate := 100.00
!rentalAgreement52.quotedRatePerMile := 0.30

!new RentalAgreement('rentalAgreement53')
!rentalAgreement53.number := 61014
!rentalAgreement53.rentalDate := Date('2023-12-20')
!rentalAgreement53.anticipatedDuration := 3
!rentalAgreement53.depositPaid := 150.00
!rentalAgreement53.quotedDailyRate := 70.00
!rentalAgreement53.quotedRatePerMile := 0.25

!insert (rentalOffice30, offRoadTruck) into RentalOfficeVehicle
!insert (rentalOffice30, mountainBikeTrailer) into RentalOfficeVehicle
!insert (rentalOffice30, snowmobile) into RentalOfficeVehicle

!insert (rentalOffice30, rentalAgreement51) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice30, rentalAgreement51) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement51, offRoadTruck) into RentalAgreementVehicle
!insert (rentalAgreement51, individualCustomer23) into RentalAgreementCustomer

!insert (rentalOffice30, rentalAgreement52) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice30, rentalAgreement52) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement52, mountainBikeTrailer) into RentalAgreementVehicle
!insert (rentalAgreement52, company26) into RentalAgreementCustomer

!insert (rentalOffice30, rentalAgreement53) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice30, rentalAgreement53) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement53, snowmobile) into RentalAgreementVehicle
!insert (rentalAgreement53, individualCustomer23) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 78 | 0.00% |
| Multiplicities Errors | 0 | 15 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 0 | 3 | 0.00% |
| License Plates | 0 | 3 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

## Category edge
```
!new RentalOffice('rentalOffice28')
!rentalOffice28.name := 'Great Plains Rentals'
!rentalOffice28.number := 66
!rentalOffice28.address := '300 Prairie Way, Fargo, ND, 58102'

!new Truck('historicalTruck')
!historicalTruck.id := 57
!historicalTruck.registrationState := #MD
!historicalTruck.licensePlateNumber := 'HIST-1930'
!historicalTruck.vehicleTypeCode := #TRUCK
!historicalTruck.registrationLastMaintenanceDate := Date('2023-01-15')
!historicalTruck.expirationDate := Date('2024-01-15')
!historicalTruck.odometerReading := 1000000
!historicalTruck.gasTankCapacity := 25.0
!historicalTruck.workingRadio := false
!historicalTruck.mileage := 10

!new Vehicle('animalTrailer')
!animalTrailer.id := 58
!animalTrailer.registrationState := #MD
!animalTrailer.licensePlateNumber := 'ANIM-404'
!animalTrailer.vehicleTypeCode := #OPEN_TRAILER
!animalTrailer.registrationLastMaintenanceDate := Date('2023-02-05')
!animalTrailer.expirationDate := Date('2025-02-05')

!new RentalAgreement('rentalAgreement48a')
!rentalAgreement48a.number := 3738
!rentalAgreement48a.rentalDate := Date('2024-06-15')
!rentalAgreement48a.anticipatedDuration := 7
!rentalAgreement48a.depositPaid := 1.00
!rentalAgreement48a.quotedDailyRate := 0.00
!rentalAgreement48a.quotedRatePerMile := 0.00

!new RentalAgreement('rentalAgreement48b')
!rentalAgreement48b.number := 3739
!rentalAgreement48b.rentalDate := Date('2024-06-15')
!rentalAgreement48b.anticipatedDuration := 7
!rentalAgreement48b.depositPaid := 1.00
!rentalAgreement48b.quotedDailyRate := 0.00
!rentalAgreement48b.quotedRatePerMile := 0.00

!new Company('company24')
!company24.name := 'Fargo Heritage Society'
!company24.address := '789 History Ave, Fargo, ND, 58103'
!company24.poorRisk := false
!company24.idNumber := 2024

!insert (rentalOffice28, historicalTruck) into RentalOfficeVehicle
!insert (rentalOffice28, animalTrailer) into RentalOfficeVehicle

!insert (rentalOffice28, rentalAgreement48a) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice28, rentalAgreement48a) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement48a, historicalTruck) into RentalAgreementVehicle
!insert (rentalAgreement48a, company24) into RentalAgreementCustomer

!insert (rentalOffice28, rentalAgreement48b) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice28, rentalAgreement48b) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement48b, animalTrailer) into RentalAgreementVehicle
!insert (rentalAgreement48b, company24) into RentalAgreementCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 3 | 51 | 5.88% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 5 | 0.00% |

| Syntax Errors | 
|---| 
```
<input>:1:0: generation of expression `#MD' failed, with following error:
```
```
<input>:1:38: Undefined enumeration literal `MD'.
```
```
<input>:1:0: generation of expression `#MD' failed, with following error:
```

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 2 | 2 | 100.00% |
| License Plates | 0 | 2 | 0.00% |
| Home Phones | 0 | 0 | 0.00% |

| Invalid Addresses | 
|---| 
```
300 Prairie Way, Fargo, ND, 58102
```
```
789 History Ave, Fargo, ND, 58103
```

## Category invalid
```
!new RentalOffice('rentalOffice22')
!rentalOffice22.name := 'Global Vehicles Inc.'
!rentalOffice22.number := 525
!rentalOffice22.address := '50 North Blvd, El Paso, TX'

!new Truck('truck21')
!truck21.id := 43
!truck21.registrationState := #AL
!truck21.licensePlateNumber := 'INTL100'
!truck21.vehicleTypeCode := #TRUCK
!truck21.registrationLastMaintenanceDate := Date('2023-05-01')
!truck21.expirationDate := Date('2024-05-01')
!truck21.odometerReading := 0
!truck21.gasTankCapacity := 0
!truck21.workingRadio := true
!truck21.mileage := 0

!new RentalAgreement('rentalAgreement36')
!rentalAgreement36.number := 6040
!rentalAgreement36.rentalDate := Date('2023-09-01')
!rentalAgreement36.anticipatedDuration := 90
!rentalAgreement36.depositPaid := 3000.00
!rentalAgreement36.quotedDailyRate := 90.00
!rentalAgreement36.quotedRatePerMile := 0.18

!new Individual('individualCustomer16')
!individualCustomer16.name := 'Javier Ramirez'
!individualCustomer16.address := '102 Border Rd, Laredo, TX'
!individualCustomer16.poorRisk := false
!individualCustomer16.homePhone := '956-555-0333'
!individualCustomer16.driverLicenseState := #AL
!individualCustomer16.driverLicenseNumber := 345678
!individualCustomer16.driverLicenseExpirationDate := Date('2027-07-10')

!new Company('company19')
!company19.name := 'Cross Border Enterprises'
!company19.address := '88 Trade St, Monterrey, Mexico'
!company19.poorRisk := false
!company19.idNumber := 56789

!insert (rentalOffice22, truck21) into RentalOfficeVehicle

!insert (rentalOffice22, rentalAgreement36) into RentalOfficeRentalAgreementOrigin
!insert (rentalOffice22, rentalAgreement36) into RentalOfficeRentalAgreementDrop

!insert (rentalAgreement36, truck21) into RentalAgreementVehicle

!insert (rentalAgreement36, individualCustomer16) into RentalAgreementCustomer
!insert (rentalAgreement36, company19) into RentalAgreementCustomer
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 6 | 16.67% |
| Invariants Errors (Not included on General) | 0 | 5 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `RentalAgreementCustomer':
  Object `rentalAgreement36' of class `RentalAgreement' is connected to 2 objects of class `Customer'
  at association end `customer' but the multiplicity is specified as `1'.
```

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 3 | 3 | 100.00% |
| License Plates | 0 | 1 | 0.00% |
| Home Phones | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
50 North Blvd, El Paso, TX
```
```
102 Border Rd, Laredo, TX
```
```
88 Trade St, Monterrey, Mexico
```

## Generation 6 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 3 | 300 | 1.00% |
| Multiplicities Errors | 0 | 46 | 0.00% |
| Invariants Errors | 0 | 20 | 0.00% |

| Syntax Errors | 
|---| 
```
<input>:1:0: generation of expression `#MD' failed, with following error:
```
```
<input>:1:38: Undefined enumeration literal `MD'.
```
```
<input>:1:0: generation of expression `#MD' failed, with following error:
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 6 | 16.67% |
| Invariants Errors (Not included on General) | 0 | 5 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `RentalAgreementCustomer':
  Object `rentalAgreement36' of class `RentalAgreement' is connected to 2 objects of class `Customer'
  at association end `customer' but the multiplicity is specified as `1'.
```

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 10 | 14 | 71.43% |
| License Plates | 0 | 11 | 0.00% |
| Home Phones | 0 | 4 | 0.00% |

| Invalid Addresses | 
|---| 
```
347 Oak Avenue, Evanston, IL, 60201
```
```
200 Construction Way, Naperville, IL, 60540
```
```
321 Ocean Front Walk, Santa Monica, CA 90401
```
```
102 Sunset Strip, Santa Monica, CA 90405
```
```
4100 Marina Blvd, Long Beach, CA 90803
```
```
300 Prairie Way, Fargo, ND, 58102
```
```
789 History Ave, Fargo, ND, 58103
```
```
50 North Blvd, El Paso, TX
```
```
102 Border Rd, Laredo, TX
```
```
88 Trade St, Monterrey, Mexico
```

# Summary for all generations
| Summary | Value | 
|---|---| 
| Model | GPT_4O | 
| Type | CoT | 
| System | vehiclerental | 
| Number of generations | 6 | 

| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 3 | 1698 | 0.18% |
| Multiplicities Errors | 0 | 252 | 0.00% |
| Invariants Errors | 0 | 120 | 0.00% |

| Syntax Errors | 
|---| 
```
<input>:1:0: generation of expression `#MD' failed, with following error:
```
```
<input>:1:38: Undefined enumeration literal `MD'.
```
```
<input>:1:0: generation of expression `#MD' failed, with following error:
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 5 | 41 | 12.20% |
| Invariants Errors (Not included on General) | 0 | 30 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `RentalAgreementVehicle':
  Object `rentalAgreement1001' of class `RentalAgreement' is connected to 0 objects of class `Vehicle'
  at association end `vehicle' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RentalOfficeRentalAgreementDrop':
  Object `rentalAgreement1001' of class `RentalAgreement' is connected to 0 objects of class `RentalOffice'
  at association end `droppoffRentalOffice' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RentalAgreementVehicle':
  Object `rentalAgreement8' of class `RentalAgreement' is connected to 2 objects of class `Vehicle'
  at association end `vehicle' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RentalAgreementCustomer':
  Object `rentalAgreement14' of class `RentalAgreement' is connected to 2 objects of class `Customer'
  at association end `customer' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RentalAgreementCustomer':
  Object `rentalAgreement36' of class `RentalAgreement' is connected to 2 objects of class `Customer'
  at association end `customer' but the multiplicity is specified as `1'.
```

| VehicleRental | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Addresses | 59 | 79 | 74.68% |
| License Plates | 0 | 64 | 0.00% |
| Home Phones | 0 | 23 | 0.00% |

| Invalid Addresses | 
|---| 
```
123 Main Street, Columbus, OH, 43215
```
```
789 Elm Street, Dayton, OH, 45402
```
```
456 Innovation Park, Cincinnati, OH, 45202
```
```
789 Dry Sands Ave, Mojave, CA 93501
```
```
101 Stoneway Blvd, Lancaster, CA 93536
```
```
123 Ocean Drive, Santa Monica, CA, 90401
```
```
123 Polar Road, Barrow, AK, 99723
```
```
456 Frost Street, Nome, AK, 99762
```
```
456 South Street, Chico, CA
```
```
789 Coastline Boulevard, Fort Lauderdale, FL, 33301
```
```
234 Evergreen Lane, Boise, ID 83706
```
```
789 Pine St, Boise, ID 83702
```
```
789 Cactus Way, Scottsdale, AZ, 85251
```
```
45 Desert Rd, Glendale, AZ, 85301
```
```
456 Seaside Blvd, Key West, FL, 33040
```
```
230 Ocean Way, Miami, FL, 33139
```
```
456 Studio Drive, Los Angeles, CA
```
```
789 Film Lane, Burbank, CA
```
```
500 High Peak Drive, Denver, CO, 80202
```
```
222 Pine Street, Boulder, CO, 80302
```
```
999 Rock Quarry Road, Colorado Springs, CO, 80903
```
```
456 Old Timers Street, Portsmouth, NH 03801
```
```
163 Maple Tree Road, Concord, NH 03301
```
```
789 Mirage Lane, Las Vegas, NV, 89109
```
```
1001 High Dunes Avenue, Phoenix, AZ, 85001
```
```
123 Highway Blvd, Flagstaff, AZ
```
```
345 Transport Rd, Phoenix, AZ
```
```
678 Freight Ave, Las Vegas, NV
```
```
158 Cactus Road, Phoenix, AZ, 85001
```
```
321 West Palm Lane, Scottsdale, AZ, 85251
```
```
456 Event Drive, Tucson, AZ, 85701
```
```
789 Maritime Blvd, Newport, RI 02840
```
```
456 Ocean Drive, Newport, RI 02840
```
```
333 Seaside Lane, Providence, RI 02903
```
```
645 Industrial Rd, Cambridge, MA, 02138
```
```
101 Jungle Drive, Hilo, HI, 96720
```
```
808 Shoreline Drive, Honolulu, HI, 96801
```
```
789 Quick St, Miami, FL
```
```
123 Bayside Ln, Miami, FL
```
```
456 Fest St, Miami, FL
```
```
100 Forest Hill Drive, Palo Alto, CA, 94301
```
```
888 Market Lane, Oakland, CA, 94607
```
```
123 Summit Peaks Road, Denver, CO 80202
```
```
456 Mountain View Way, Boulder, CO 80302
```
```
890 Alpine Drive, Colorado Springs, CO 80903
```
```
120 Seaport Lane, Miami, FL, 33137
```
```
202 Summit Road, Denver, CO, 80202
```
```
789 Sunshine Blvd, Miami, FL
```
```
321 Experience St, Orlando, FL
```
```
347 Oak Avenue, Evanston, IL, 60201
```
```
200 Construction Way, Naperville, IL, 60540
```
```
321 Ocean Front Walk, Santa Monica, CA 90401
```
```
102 Sunset Strip, Santa Monica, CA 90405
```
```
4100 Marina Blvd, Long Beach, CA 90803
```
```
300 Prairie Way, Fargo, ND, 58102
```
```
789 History Ave, Fargo, ND, 58103
```
```
50 North Blvd, El Paso, TX
```
```
102 Border Rd, Laredo, TX
```
```
88 Trade St, Monterrey, Mexico
```

