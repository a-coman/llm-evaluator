# Generation 1
## Category baseline
```
!new Booking('booking1')
!booking1.bookingId := 12345
!booking1.startDate := 'March 15, 2023'
!booking1.endDate := 'March 20, 2023'
!booking1.canceled := false
!booking1.confirmed := true

!new Customer('customer1')
!customer1.firstName := 'Anaïs'
!customer1.lastName := 'Gómez'

!new RoomReservation('roomreservation1')
!roomreservation1.checkInDate := 'March 15, 2023'
!roomreservation1.checkOutDate := 'March 20, 2023'

!new Room('room1')
!room1.roomNumber := 408
!room1.numBeds := 2
!room1.pricePerNight := 150.0
!room1.occupied := true
!room1.blocked := false

!new RoomExtra('roomextra1')
!roomextra1.price := 20.0
!roomextra1.description := 'Breakfast buffet'

!new RoomExtra('roomextra2')
!roomextra2.price := 50.0
!roomextra2.description := 'Spa package'

!new Bill('bill1')
!bill1.billId := 56789
!bill1.price := 870.0

!new FreeRoomTypesDTO('freeroomtypesdto1')
!freeroomtypesdto1.roomTypeDescription := 'Deluxe Double'
!freeroomtypesdto1.numBeds := 2
!freeroomtypesdto1.pricePerNight := 200.0
!freeroomtypesdto1.numFreeRooms := 5

!insert (booking1, customer1) into BookingCustomer
!insert (booking1, bill1) into BookingBill
!insert (booking1, roomreservation1) into BookingRoomReservation
!insert (roomreservation1, room1) into RoomReservationRoom
!insert (roomreservation1, roomextra1) into RoomReservationExtras
!insert (roomreservation1, roomextra2) into RoomReservationExtras
!insert (bill1, roomreservation1) into BillRoomReservation
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 39 | 0.00% |
| Multiplicities Errors | 0 | 7 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category boundary
```
!new Booking('booking2')
!booking2.bookingId := 1
!booking2.startDate := '2024-12-31'
!booking2.endDate := '2025-01-01'
!booking2.canceled := false
!booking2.confirmed := true

!new Customer('customer2')
!customer2.firstName := 'Amina'
!customer2.lastName := 'Takahashi'

!new Bill('bill2')
!bill2.billId := 1
!bill2.price := 0.00

!new Bill('bill3')
!bill3.billId := 2
!bill3.price := 9999.99

!new RoomReservation('roomreservation2')
!roomreservation2.checkInDate := '2024-12-31'
!roomreservation2.checkOutDate := '2025-01-01'

!new Room('room2')
!room2.roomNumber := 101
!room2.numBeds := 1
!room2.pricePerNight := 0.00
!room2.occupied := false
!room2.blocked := false

!new Room('room3')
!room3.roomNumber := 999
!room3.numBeds := 10
!room3.pricePerNight := 1000.00
!room3.occupied := true
!room3.blocked := false

!new RoomExtra('roomextra3')
!roomextra3.description := 'Complimentary Water Bottle'
!roomextra3.price := 0.00

!new RoomExtra('roomextra4')
!roomextra4.description := 'Private Jet Transport'
!roomextra4.price := 5000.00

!new FreeRoomTypesDTO('freeroomtypesdto2')
!freeroomtypesdto2.roomTypeDescription := 'Luxury Suite'
!freeroomtypesdto2.numBeds := 10
!freeroomtypesdto2.pricePerNight := 5000.00
!freeroomtypesdto2.numFreeRooms := 1

!insert (booking2, customer2) into BookingCustomer
!insert (booking2, roomreservation2) into BookingRoomReservation
!insert (booking2, bill2) into BookingBill
!insert (booking2, bill3) into BookingBill
!insert (roomreservation2, room2) into RoomReservationRoom
!insert (roomreservation2, room3) into RoomReservationRoom
!insert (roomreservation2, roomextra3) into RoomReservationExtras
!insert (roomreservation2, roomextra4) into RoomReservationExtras
!insert (bill2, roomreservation2) into BillRoomReservation
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 50 | 0.00% |
| Multiplicities Errors | 1 | 9 | 11.11% |
| Invariants Errors | 0 | 3 | 0.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `bill3' of class `Bill' is connected to 0 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category complex
```
!new Booking('booking3')
!booking3.bookingId := 15
!booking3.startDate := 'March 15, 2024'
!booking3.endDate := 'March 20, 2024'
!booking3.canceled := false
!booking3.confirmed := true

!new Customer('customer3')
!customer3.firstName := 'Alejandro'
!customer3.lastName := 'Costa'

!new RoomReservation('roomreservation3')
!roomreservation3.checkInDate := 'March 15, 2024'
!roomreservation3.checkOutDate := 'March 20, 2024'

!new RoomReservation('roomreservation4')
!roomreservation4.checkInDate := 'March 16, 2024'
!roomreservation4.checkOutDate := 'March 18, 2024'

!new Room('room4')
!room4.roomNumber := 101
!room4.numBeds := 2
!room4.pricePerNight := 150.00
!room4.occupied := true
!room4.blocked := false

!new Room('room5')
!room5.roomNumber := 102
!room5.numBeds := 3
!room5.pricePerNight := 200.00
!room5.occupied := true
!room5.blocked := false

!new Room('room6')
!room6.roomNumber := 203
!room6.numBeds := 1
!room6.pricePerNight := 100.00
!room6.occupied := true
!room6.blocked := false

!new RoomExtra('roomextra5')
!roomextra5.price := 75.00
!roomextra5.description := 'A premium bottle of champagne with assorted chocolates and fresh flowers.'

!new RoomExtra('roomextra6')
!roomextra6.price := 120.00
!roomextra6.description := 'Includes 60-minute full-body massage and access to the sauna and jacuzzi.'

!new RoomExtra('roomextra7')
!roomextra7.price := 25.00
!roomextra7.description := 'Daily continental breakfast delivered to room with fresh espresso and pastries.'

!new Bill('bill4')
!bill4.billId := 98765
!bill4.price := 1025.00

!new Bill('bill5')
!bill5.billId := 98766
!bill5.price := 250.00

!new FreeRoomTypesDTO('freeroomtypesdto3')
!freeroomtypesdto3.roomTypeDescription := 'Spacious suite with a comfortable living area and mountain view.'
!freeroomtypesdto3.numBeds := 3
!freeroomtypesdto3.pricePerNight := 270.00
!freeroomtypesdto3.numFreeRooms := 2

!new FreeRoomTypesDTO('freeroomtypesdto4')
!freeroomtypesdto4.roomTypeDescription := 'Cozy room designed for solo travelers, featuring a king-size bed.'
!freeroomtypesdto4.numBeds := 1
!freeroomtypesdto4.pricePerNight := 120.00
!freeroomtypesdto4.numFreeRooms := 5

!insert (booking3, customer3) into BookingCustomer
!insert (booking3, roomreservation3) into BookingRoomReservation
!insert (booking3, roomreservation4) into BookingRoomReservation
!insert (booking3, bill4) into BookingBill
!insert (booking3, bill5) into BookingBill

!insert (roomreservation3, room4) into RoomReservationRoom
!insert (roomreservation3, room5) into RoomReservationRoom
!insert (roomreservation3, roomextra5) into RoomReservationExtras
!insert (roomreservation3, roomextra6) into RoomReservationExtras

!insert (bill4, roomreservation3) into BillRoomReservation

!insert (roomreservation4, room6) into RoomReservationRoom
!insert (roomreservation4, roomextra7) into RoomReservationExtras

!insert (bill5, roomreservation4) into BillRoomReservation
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 71 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category edge
```
!new Customer('customer5')
!customer5.firstName := 'Hiroshi'
!customer5.lastName := 'Nakamura'

!new Booking('booking5')
!booking5.bookingId := 1001
!booking5.startDate := 'March 1, 2024'
!booking5.endDate := 'September 1, 2024'
!booking5.canceled := false
!booking5.confirmed := true

!new RoomReservation('roomreservation6')
!roomreservation6.checkInDate := 'March 1, 2024'
!roomreservation6.checkOutDate := 'May 1, 2024'

!new RoomReservation('roomreservation7')
!roomreservation7.checkInDate := 'May 1, 2024'
!roomreservation7.checkOutDate := 'July 1, 2024'

!new RoomReservation('roomreservation8')
!roomreservation8.checkInDate := 'July 1, 2024'
!roomreservation8.checkOutDate := 'September 1, 2024'

!new Room('room10')
!room10.roomNumber := 101
!room10.numBeds := 2
!room10.pricePerNight := 250.00
!room10.occupied := true
!room10.blocked := false

!new Room('room11')
!room11.roomNumber := 202
!room11.numBeds := 2
!room11.pricePerNight := 150.00
!room11.occupied := true
!room11.blocked := false

!new Room('room12')
!room12.roomNumber := 303
!room12.numBeds := 3
!room12.pricePerNight := 300.00
!room12.occupied := true
!room12.blocked := false

!new RoomExtra('roomextra10')
!roomextra10.price := 30.00
!roomextra10.description := 'Daily breakfast package'

!new RoomExtra('roomextra11')
!roomextra11.price := 50.00
!roomextra11.description := 'Evening lounge access'

!new RoomExtra('roomextra12')
!roomextra12.price := 100.00
!roomextra12.description := 'Private car service'

!new Bill('bill7')
!bill7.billId := 3001
!bill7.price := 15200.00

!new Bill('bill8')
!bill8.billId := 3002
!bill8.price := 9200.00

!new Bill('bill9')
!bill9.billId := 3003
!bill9.price := 18600.00

!new FreeRoomTypesDTO('freeroomtypesdto5')
!freeroomtypesdto5.roomTypeDescription := 'Budget Single'
!freeroomtypesdto5.numBeds := 1
!freeroomtypesdto5.pricePerNight := 70.00
!freeroomtypesdto5.numFreeRooms := 15

!insert (booking5, customer5) into BookingCustomer
!insert (booking5, roomreservation6) into BookingRoomReservation
!insert (booking5, roomreservation7) into BookingRoomReservation
!insert (booking5, roomreservation8) into BookingRoomReservation

!insert (roomreservation6, room10) into RoomReservationRoom
!insert (roomreservation7, room11) into RoomReservationRoom
!insert (roomreservation8, room12) into RoomReservationRoom

!insert (roomreservation6, roomextra10) into RoomReservationExtras
!insert (roomreservation7, roomextra11) into RoomReservationExtras
!insert (roomreservation8, roomextra12) into RoomReservationExtras

!insert (bill7, roomreservation6) into BillRoomReservation
!insert (bill8, roomreservation7) into BillRoomReservation
!insert (bill9, roomreservation8) into BillRoomReservation

!insert (booking5, bill7) into BookingBill
!insert (booking5, bill8) into BookingBill
!insert (booking5, bill9) into BookingBill
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 75 | 0.00% |
| Multiplicities Errors | 0 | 16 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category invalid
```
!new Customer('customer4')
!customer4.firstName := 'Marta'
!customer4.lastName := 'González'

!new Booking('booking4')
!booking4.bookingId := 2023101501
!booking4.startDate := 'July 20, 2024'
!booking4.endDate := 'July 27, 2024'
!booking4.canceled := false
!booking4.confirmed := true

!new RoomReservation('roomreservation5')
!roomreservation5.checkInDate := 'July 20, 2024'
!roomreservation5.checkOutDate := 'July 27, 2024'

!new Room('room7')
!room7.roomNumber := 101
!room7.numBeds := 1
!room7.pricePerNight := 300.00
!room7.occupied := true
!room7.blocked := false

!new Room('room8')
!room8.roomNumber := 102
!room8.numBeds := 3
!room8.pricePerNight := 450.00
!room8.occupied := false
!room8.blocked := false

!new Room('room9')
!room9.roomNumber := 103
!room9.numBeds := 2
!room9.pricePerNight := 500.00
!room9.occupied := false
!room9.blocked := true

!new RoomExtra('roomextra8')
!roomextra8.price := 50.00
!roomextra8.description := 'A bottle of premium Spanish cava to welcome guests.'

!new RoomExtra('roomextra9')
!roomextra9.price := 100.00
!roomextra9.description := 'Exclusive dinner with sea view, including a three-course meal.'

!new Bill('bill6')
!bill6.billId := 2023101501
!bill6.price := 2850.00

!insert (booking4, customer4) into BookingCustomer
!insert (booking4, roomreservation5) into BookingRoomReservation
!insert (booking4, bill6) into BookingBill

!insert (roomreservation5, room7) into RoomReservationRoom
!insert (roomreservation5, room8) into RoomReservationRoom
!insert (roomreservation5, room9) into RoomReservationRoom
!insert (roomreservation5, roomextra8) into RoomReservationExtras
!insert (roomreservation5, roomextra9) into RoomReservationExtras

!insert (bill6, roomreservation5) into BillRoomReservation
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 9 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Generation 1 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 283 | 0.00% |
| Multiplicities Errors | 1 | 45 | 2.22% |
| Invariants Errors | 0 | 12 | 0.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `bill3' of class `Bill' is connected to 0 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 9 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 5 | 0.00% |
| checkOutDate <= endDate | 0 | 5 | 0.00% |

# Generation 2
## Category baseline
```
!new Customer('customer6')
!customer6.firstName := 'Hiroshi'
!customer6.lastName := 'Tanaka'

!new Booking('booking6')
!booking6.bookingId := 67891
!booking6.startDate := 'December 24, 2023'
!booking6.endDate := 'December 28, 2023'
!booking6.canceled := true
!booking6.confirmed := false

!new RoomReservation('roomreservation9')
!roomreservation9.checkInDate := 'December 24, 2023'
!roomreservation9.checkOutDate := 'December 26, 2023'

!new RoomReservation('roomreservation10')
!roomreservation10.checkInDate := 'December 26, 2023'
!roomreservation10.checkOutDate := 'December 28, 2023'

!new Room('room13')
!room13.roomNumber := 101
!room13.numBeds := 1
!room13.pricePerNight := 90.00
!room13.occupied := false
!room13.blocked := false

!new Room('room14')
!room14.roomNumber := 203
!room14.numBeds := 3
!room14.pricePerNight := 250.00
!room14.occupied := false
!room14.blocked := true

!new RoomExtra('roomextra13')
!roomextra13.price := 15.00
!roomextra13.description := 'Evening Cocktail'

!new Bill('bill10')
!bill10.billId := 89012
!bill10.price := 0.00

!new FreeRoomTypesDTO('freeroomtypesdto6')
!freeroomtypesdto6.roomTypeDescription := 'Single Economy'
!freeroomtypesdto6.numBeds := 1
!freeroomtypesdto6.pricePerNight := 60.00
!freeroomtypesdto6.numFreeRooms := 10

!insert (booking6, customer6) into BookingCustomer
!insert (booking6, roomreservation9) into BookingRoomReservation
!insert (booking6, roomreservation10) into BookingRoomReservation
!insert (booking6, bill10) into BookingBill

!insert (roomreservation9, room13) into RoomReservationRoom
!insert (roomreservation10, room14) into RoomReservationRoom

!insert (roomreservation9, roomextra13) into RoomReservationExtras

!new RoomExtra('roomextra14')
!roomextra14.price := 15.00
!roomextra14.description := 'Evening Cocktail'
!insert (roomreservation10, roomextra14) into RoomReservationExtras

!new Bill('bill11')
!bill11.billId := 89013
!bill11.price := 0.00
!insert (bill10, roomreservation9) into BillRoomReservation
!insert (bill11, roomreservation10) into BillRoomReservation
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 54 | 0.00% |
| Multiplicities Errors | 1 | 10 | 10.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `BookingBill':
  Object `bill11' of class `Bill' is connected to 0 objects of class `Booking'
  at association end `booking' but the multiplicity is specified as `1'.
```

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category boundary
```
!new Customer('customer7')
!customer7.firstName := 'Lin'
!customer7.lastName := 'Nguyen'

!new Booking('booking7')
!booking7.bookingId := 2
!booking7.startDate := '2025-08-15'
!booking7.endDate := '2025-08-15'
!booking7.canceled := false
!booking7.confirmed := true

!new Bill('bill12')
!bill12.billId := 3
!bill12.price := 0.01

!new Bill('bill13')
!bill13.billId := 4
!bill13.price := 9999.98

!new RoomReservation('roomreservation11')
!roomreservation11.checkInDate := '2025-08-15'
!roomreservation11.checkOutDate := '2025-08-15'

!new Room('room15')
!room15.roomNumber := 202
!room15.numBeds := 1
!room15.pricePerNight := 5.00
!room15.occupied := true
!room15.blocked := false

!new Room('room16')
!room16.roomNumber := 303
!room16.numBeds := 2
!room16.pricePerNight := 50.00
!room16.occupied := false
!room16.blocked := false

!new RoomExtra('roomextra15')
!roomextra15.price := 30.00
!roomextra15.description := 'Traditional Vietnamese Dinner Experience'

!new RoomExtra('roomextra16')
!roomextra16.price := 20.00
!roomextra16.description := 'Tai Chi Session at the Park'

!new FreeRoomTypesDTO('freeroomtypesdto7')
!freeroomtypesdto7.roomTypeDescription := 'Standard Family Room'
!freeroomtypesdto7.numBeds := 4
!freeroomtypesdto7.pricePerNight := 100.00
!freeroomtypesdto7.numFreeRooms := 3

!insert (booking7, customer7) into BookingCustomer
!insert (booking7, roomreservation11) into BookingRoomReservation
!insert (booking7, bill12) into BookingBill
!insert (booking7, bill13) into BookingBill

!insert (roomreservation11, room15) into RoomReservationRoom
!insert (roomreservation11, room16) into RoomReservationRoom

!insert (roomreservation11, roomextra15) into RoomReservationExtras
!insert (roomreservation11, roomextra16) into RoomReservationExtras

!insert (bill12, roomreservation11) into BillRoomReservation

!new RoomReservation('roomreservation12')
!roomreservation12.checkInDate := '2025-08-15'
!roomreservation12.checkOutDate := '2025-08-15'
!insert (booking7, roomreservation12) into BookingRoomReservation
!insert (roomreservation12, room15) into RoomReservationRoom
!insert (roomreservation12, room16) into RoomReservationRoom
!insert (roomreservation12, roomextra15) into RoomReservationExtras
!insert (roomreservation12, roomextra16) into RoomReservationExtras
!insert (bill13, roomreservation12) into BillRoomReservation
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 59 | 0.00% |
| Multiplicities Errors | 4 | 15 | 26.67% |
| Invariants Errors | 0 | 3 | 0.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `RoomReservationExtras':
  Object `roomextra16' of class `RoomExtra' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationExtras':
  Object `roomextra15' of class `RoomExtra' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationRoom':
  Object `room15' of class `Room' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationRoom':
  Object `room16' of class `Room' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category complex
```
!new Customer('customer8')
!customer8.firstName := 'Li'
!customer8.lastName := 'Zhang'

!new Booking('booking8')
!booking8.bookingId := 123
!booking8.startDate := 'October 10, 2024'
!booking8.endDate := 'October 17, 2024'
!booking8.canceled := false
!booking8.confirmed := true

!new RoomReservation('roomreservation13')
!roomreservation13.checkInDate := 'October 10, 2024'
!roomreservation13.checkOutDate := 'October 14, 2024'

!new RoomReservation('roomreservation14')
!roomreservation14.checkInDate := 'October 14, 2024'
!roomreservation14.checkOutDate := 'October 17, 2024'

!new Room('room17')
!room17.roomNumber := 305
!room17.numBeds := 1
!room17.pricePerNight := 180.00
!room17.occupied := true
!room17.blocked := false

!new Room('room18')
!room18.roomNumber := 401
!room18.numBeds := 2
!room18.pricePerNight := 220.00
!room18.occupied := true
!room18.blocked := false

!new RoomExtra('roomextra17')
!roomextra17.price := 200.00
!roomextra17.description := 'Guided safari tour inclusive of transportation, meals, and a night safari experience.'

!new RoomExtra('roomextra18')
!roomextra18.price := 50.00
!roomextra18.description := 'Evening show featuring traditional dances of the local tribes.'

!new RoomExtra('roomextra19')
!roomextra19.price := 150.00
!roomextra19.description := 'Exclusive dinner experience on the savannah, complete with gourmet cuisine and wine.'

!new RoomExtra('roomextra20')
!roomextra20.price := 300.00
!roomextra20.description := 'Personalized game drive with a dedicated ranger, inclusive of photography sessions.'

!new Bill('bill14')
!bill14.billId := 12345
!bill14.price := 970.00

!new Bill('bill15')
!bill15.billId := 12346
!bill15.price := 1010.00

!new FreeRoomTypesDTO('freeroomtypesdto8')
!freeroomtypesdto8.roomTypeDescription := 'Luxurious tent offering a unique blend of camping experience with high-end amenities.'
!freeroomtypesdto8.numBeds := 2
!freeroomtypesdto8.pricePerNight := 250.00
!freeroomtypesdto8.numFreeRooms := 1

!new FreeRoomTypesDTO('freeroomtypesdto9')
!freeroomtypesdto9.roomTypeDescription := 'Elegant villa with panoramic views of the savannah, featuring private pools and verandas.'
!freeroomtypesdto9.numBeds := 3
!freeroomtypesdto9.pricePerNight := 350.00
!freeroomtypesdto9.numFreeRooms := 2

!insert (booking8, customer8) into BookingCustomer
!insert (booking8, roomreservation13) into BookingRoomReservation
!insert (booking8, roomreservation14) into BookingRoomReservation

!insert (roomreservation13, room17) into RoomReservationRoom
!insert (roomreservation14, room18) into RoomReservationRoom

!insert (roomreservation13, roomextra17) into RoomReservationExtras
!insert (roomreservation13, roomextra18) into RoomReservationExtras
!insert (roomreservation14, roomextra19) into RoomReservationExtras
!insert (roomreservation14, roomextra20) into RoomReservationExtras

!insert (bill14, roomreservation13) into BillRoomReservation
!insert (bill15, roomreservation14) into BillRoomReservation

!insert (booking8, bill14) into BookingBill
!insert (booking8, bill15) into BookingBill
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 68 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category edge
```
!new Customer('customer10')
!customer10.firstName := 'Alejandro'
!customer10.lastName := 'Muñoz'

!new Booking('booking10')
!booking10.bookingId := 2002
!booking10.startDate := 'April 1, 2024'
!booking10.endDate := 'July 1, 2024'
!booking10.canceled := false
!booking10.confirmed := true

!new RoomReservation('roomreservation16')
!roomreservation16.checkInDate := 'April 1, 2024'
!roomreservation16.checkOutDate := 'July 1, 2024'

!new RoomReservation('roomreservation17')
!roomreservation17.checkInDate := 'April 1, 2024'
!roomreservation17.checkOutDate := 'July 1, 2024'

!new Room('room20')
!room20.roomNumber := 401
!room20.numBeds := 10
!room20.pricePerNight := 500.00
!room20.occupied := true
!room20.blocked := false

!new Room('room21')
!room21.roomNumber := 402
!room21.numBeds := 1
!room21.pricePerNight := 180.00
!room21.occupied := true
!room21.blocked := false

!new RoomExtra('roomextra23')
!roomextra23.price := 0.00
!roomextra23.description := 'Complimentary access to study facilities'

!new RoomExtra('roomextra24')
!roomextra24.price := 0.00
!roomextra24.description := 'No-cost laundry service'

!new Bill('bill20')
!bill20.billId := 5004
!bill20.price := 40500.00

!new Bill('bill21')
!bill21.billId := 5005
!bill21.price := 16200.00

!new FreeRoomTypesDTO('freeroomtypesdto10')
!freeroomtypesdto10.roomTypeDescription := 'Twin Room'
!freeroomtypesdto10.numBeds := 2
!freeroomtypesdto10.pricePerNight := 120.00
!freeroomtypesdto10.numFreeRooms := 5

!insert (booking10, customer10) into BookingCustomer
!insert (booking10, roomreservation16) into BookingRoomReservation
!insert (booking10, roomreservation17) into BookingRoomReservation

!insert (roomreservation16, room20) into RoomReservationRoom
!insert (roomreservation17, room21) into RoomReservationRoom

!insert (roomreservation16, roomextra23) into RoomReservationExtras
!insert (roomreservation17, roomextra24) into RoomReservationExtras

!insert (bill20, roomreservation16) into BillRoomReservation
!insert (bill21, roomreservation17) into BillRoomReservation

!insert (booking10, bill20) into BookingBill
!insert (booking10, bill21) into BookingBill
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 55 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category invalid
```
!new Customer('customer9')
!customer9.firstName := 'Hiroshi'
!customer9.lastName := 'Yamamoto'

!new Booking('booking9')
!booking9.bookingId := 31009
!booking9.startDate := 'March 25, 2024'
!booking9.endDate := 'April 1, 2024'
!booking9.canceled := false
!booking9.confirmed := true

!new RoomReservation('roomreservation15')
!roomreservation15.checkInDate := 'March 25, 2024'
!roomreservation15.checkOutDate := 'April 1, 2024'

!new Room('room19')
!room19.roomNumber := 501
!room19.numBeds := 2
!room19.pricePerNight := 50000
!room19.occupied := true
!room19.blocked := false

!new RoomExtra('roomextra21')
!roomextra21.price := 5000
!roomextra21.description := 'An authentic Japanese tea ceremony experience.'

!new RoomExtra('roomextra22')
!roomextra22.price := 20000
!roomextra22.description := 'A private Geisha performance showcasing traditional arts.'

!new Bill('bill16')
!bill16.billId := 310091
!bill16.price := 350000

!new Bill('bill17')
!bill17.billId := 310092
!bill17.price := 25000

!new Bill('bill18')
!bill18.billId := 310093
!bill18.price := 50000

!new Bill('bill19')
!bill19.billId := 310094
!bill19.price := 10000

!insert (booking9, customer9) into BookingCustomer
!insert (booking9, roomreservation15) into BookingRoomReservation

!insert (roomreservation15, room19) into RoomReservationRoom

!insert (roomreservation15, roomextra21) into RoomReservationExtras
!insert (roomreservation15, roomextra22) into RoomReservationExtras

!insert (bill16, roomreservation15) into BillRoomReservation
!insert (bill17, roomreservation15) into BillRoomReservation
!insert (bill18, roomreservation15) into BillRoomReservation
!insert (bill19, roomreservation15) into BillRoomReservation

!insert (booking9, bill16) into BookingBill
!insert (booking9, bill17) into BookingBill
!insert (booking9, bill18) into BookingBill
!insert (booking9, bill19) into BookingBill
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 13 | 7.69% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `roomreservation15' of class `RoomReservation' is connected to 4 objects of class `Bill'
  at association end `bill' but the multiplicity is specified as `1'.
```

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Generation 2 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 285 | 0.00% |
| Multiplicities Errors | 5 | 49 | 10.20% |
| Invariants Errors | 0 | 12 | 0.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `BookingBill':
  Object `bill11' of class `Bill' is connected to 0 objects of class `Booking'
  at association end `booking' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationExtras':
  Object `roomextra16' of class `RoomExtra' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationExtras':
  Object `roomextra15' of class `RoomExtra' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationRoom':
  Object `room15' of class `Room' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationRoom':
  Object `room16' of class `Room' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 13 | 7.69% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `roomreservation15' of class `RoomReservation' is connected to 4 objects of class `Bill'
  at association end `bill' but the multiplicity is specified as `1'.
```

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 5 | 0.00% |
| checkOutDate <= endDate | 0 | 5 | 0.00% |

# Generation 3
## Category baseline
```
!new Customer('customer11')
!customer11.firstName := 'Fatima'
!customer11.lastName := 'Oumarou'

!new Booking('booking11')
!booking11.bookingId := 34567
!booking11.startDate := 'July 1, 2023'
!booking11.endDate := 'July 10, 2023'
!booking11.canceled := false
!booking11.confirmed := true

!new RoomReservation('roomreservation18')
!roomreservation18.checkInDate := 'July 1, 2023'
!roomreservation18.checkOutDate := 'July 5, 2023'

!new RoomReservation('roomreservation19')
!roomreservation19.checkInDate := 'July 5, 2023'
!roomreservation19.checkOutDate := 'July 10, 2023'

!new Room('room22')
!room22.roomNumber := 302
!room22.numBeds := 2
!room22.pricePerNight := 180.00
!room22.occupied := true
!room22.blocked := false

!new Room('room23')
!room23.roomNumber := 501
!room23.numBeds := 1
!room23.pricePerNight := 120.00
!room23.occupied := true
!room23.blocked := false

!new RoomExtra('roomextra25')
!roomextra25.price := 30.00
!roomextra25.description := 'On-call doctor service'

!new RoomExtra('roomextra26')
!roomextra26.price := 40.00
!roomextra26.description := 'Guided city tour'

!new Bill('bill22')
!bill22.billId := 123456
!bill22.price := 770.00

!new Bill('bill23')
!bill23.billId := 123457
!bill23.price := 770.00

!new FreeRoomTypesDTO('freeroomtypesdto11')
!freeroomtypesdto11.roomTypeDescription := 'Family Suite'
!freeroomtypesdto11.numBeds := 4
!freeroomtypesdto11.pricePerNight := 400.00
!freeroomtypesdto11.numFreeRooms := 3

!insert (booking11, customer11) into BookingCustomer
!insert (booking11, roomreservation18) into BookingRoomReservation
!insert (booking11, roomreservation19) into BookingRoomReservation
!insert (booking11, bill22) into BookingBill
!insert (booking11, bill23) into BookingBill

!insert (roomreservation18, room22) into RoomReservationRoom
!insert (roomreservation19, room23) into RoomReservationRoom

!insert (roomreservation18, roomextra25) into RoomReservationExtras
!insert (roomreservation19, roomextra26) into RoomReservationExtras

!insert (bill22, roomreservation18) into BillRoomReservation
!insert (bill23, roomreservation19) into BillRoomReservation
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 55 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category boundary
```
!new Customer('customer12')
!customer12.firstName := 'Fatima'
!customer12.lastName := 'Al-Maari'

!new Booking('booking12')
!booking12.bookingId := 3
!booking12.startDate := '2024-10-01'
!booking12.endDate := '2024-10-15'
!booking12.canceled := false
!booking12.confirmed := true

!new Bill('bill24')
!bill24.billId := 5
!bill24.price := 4000.00

!new RoomReservation('roomreservation20')
!roomreservation20.checkInDate := '2024-10-01'
!roomreservation20.checkOutDate := '2024-10-15'

!new Room('room24')
!room24.roomNumber := 501
!room24.numBeds := 3
!room24.pricePerNight := 300.00
!room24.occupied := true
!room24.blocked := false

!new Room('room25')
!room25.roomNumber := 123
!room25.numBeds := 2
!room25.pricePerNight := 150.00
!room25.occupied := false
!room25.blocked := false

!new RoomExtra('roomextra27')
!roomextra27.price := 100.00
!roomextra27.description := 'Arabian Nights Dance Performance'

!new RoomExtra('roomextra28')
!roomextra28.price := 250.00
!roomextra28.description := 'All-day Desert Tour with Dune Bashing'

!new RoomExtra('roomextra29')
!roomextra29.price := 200.00
!roomextra29.description := 'Full-day Relaxation and Wellness'

!new FreeRoomTypesDTO('freeroomtypesdto12')
!freeroomtypesdto12.roomTypeDescription := 'Family Bungalow'
!freeroomtypesdto12.numBeds := 5
!freeroomtypesdto12.pricePerNight := 450.00
!freeroomtypesdto12.numFreeRooms := 2

!insert (booking12, customer12) into BookingCustomer
!insert (booking12, roomreservation20) into BookingRoomReservation
!insert (booking12, bill24) into BookingBill

!insert (roomreservation20, room24) into RoomReservationRoom
!insert (roomreservation20, room25) into RoomReservationRoom

!insert (roomreservation20, roomextra27) into RoomReservationExtras
!insert (roomreservation20, roomextra28) into RoomReservationExtras
!insert (roomreservation20, roomextra29) into RoomReservationExtras

!insert (bill24, roomreservation20) into BillRoomReservation
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 50 | 0.00% |
| Multiplicities Errors | 0 | 9 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category complex
```
!new Customer('customer14')
!customer14.firstName := 'Sofia'
!customer14.lastName := 'Müller'

!new Booking('booking14')
!booking14.bookingId := 345
!booking14.startDate := 'December 5, 2024'
!booking14.endDate := 'December 10, 2024'
!booking14.canceled := false
!booking14.confirmed := true

!new RoomReservation('roomreservation22')
!roomreservation22.checkInDate := 'December 5, 2024'
!roomreservation22.checkOutDate := 'December 8, 2024'

!new RoomReservation('roomreservation23')
!roomreservation23.checkInDate := 'December 8, 2024'
!roomreservation23.checkOutDate := 'December 10, 2024'

!new Room('room27')
!room27.roomNumber := 201
!room27.numBeds := 1
!room27.pricePerNight := 130.00
!room27.occupied := true
!room27.blocked := false

!new Room('room28')
!room28.roomNumber := 305
!room28.numBeds := 2
!room28.pricePerNight := 160.00
!room28.occupied := true
!room28.blocked := false

!new RoomExtra('roomextra32')
!roomextra32.price := 80.00
!roomextra32.description := 'A guided tour of the local vineyards with exclusive wine tastings and cheese pairing.'

!new RoomExtra('roomextra33')
!roomextra33.price := 40.00
!roomextra33.description := 'Assorted local cheeses and meats served in the room.'

!new RoomExtra('roomextra34')
!roomextra34.price := 60.00
!roomextra34.description := 'An evening event showcasing the finest selections from the vineyard’s collection.'

!new RoomExtra('roomextra35')
!roomextra35.price := 110.00
!roomextra35.description := 'Includes a multi-course dinner at the inn’s acclaimed restaurant paired with curated wines.'

!new Bill('bill28')
!bill28.billId := 56789
!bill28.price := 530.00

!new Bill('bill29')
!bill29.billId := 56790
!bill29.price := 490.00

!new FreeRoomTypesDTO('freeroomtypesdto13')
!freeroomtypesdto13.roomTypeDescription := 'Opulent suite with breathtaking views of the vineyard, private terrace, and elegant décor.'
!freeroomtypesdto13.numBeds := 2
!freeroomtypesdto13.pricePerNight := 280.00
!freeroomtypesdto13.numFreeRooms := 3

!new FreeRoomTypesDTO('freeroomtypesdto14')
!freeroomtypesdto14.roomTypeDescription := 'Comfortable double room featuring rustic charm and modern amenities.'
!freeroomtypesdto14.numBeds := 2
!freeroomtypesdto14.pricePerNight := 190.00
!freeroomtypesdto14.numFreeRooms := 4

!insert (booking14, customer14) into BookingCustomer
!insert (booking14, roomreservation22) into BookingRoomReservation
!insert (booking14, roomreservation23) into BookingRoomReservation

!insert (roomreservation22, room27) into RoomReservationRoom
!insert (roomreservation23, room28) into RoomReservationRoom

!insert (roomreservation22, roomextra32) into RoomReservationExtras
!insert (roomreservation22, roomextra33) into RoomReservationExtras
!insert (roomreservation23, roomextra34) into RoomReservationExtras
!insert (roomreservation23, roomextra35) into RoomReservationExtras

!insert (bill28, roomreservation22) into BillRoomReservation
!insert (bill29, roomreservation23) into BillRoomReservation

!insert (booking14, bill28) into BookingBill
!insert (booking14, bill29) into BookingBill
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 68 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category edge
```
!new Customer('customer15')
!customer15.firstName := 'Priya'
!customer15.lastName := 'Desai'

!new Booking('booking15')
!booking15.bookingId := 3003
!booking15.startDate := 'November 15, 2024'
!booking15.endDate := 'December 15, 2024'
!booking15.canceled := false
!booking15.confirmed := true

!new RoomReservation('roomreservation24')
!roomreservation24.checkInDate := 'November 15, 2024'
!roomreservation24.checkOutDate := 'December 15, 2024'

!new RoomReservation('roomreservation25')
!roomreservation25.checkInDate := 'November 15, 2024'
!roomreservation25.checkOutDate := 'December 15, 2024'

!new Room('room29')
!room29.roomNumber := 501
!room29.numBeds := 2
!room29.pricePerNight := 0.00
!room29.occupied := false
!room29.blocked := true

!new Room('room30')
!room30.roomNumber := 502
!room30.numBeds := 2
!room30.pricePerNight := 0.00
!room30.occupied := false
!room30.blocked := true

!new RoomExtra('roomextra36')
!roomextra36.price := 200.00
!roomextra36.description := 'Specialized cleaning service'

!new RoomExtra('roomextra37')
!roomextra37.price := 150.00
!roomextra37.description := 'Minimal supplies delivery'

!new Bill('bill30')
!bill30.billId := 8006
!bill30.price := 200.00

!new Bill('bill31')
!bill31.billId := 8007
!bill31.price := 150.00

!new FreeRoomTypesDTO('freeroomtypesdto15')
!freeroomtypesdto15.roomTypeDescription := 'Deluxe Suite'
!freeroomtypesdto15.numBeds := 3
!freeroomtypesdto15.pricePerNight := 350.00
!freeroomtypesdto15.numFreeRooms := 2

!insert (booking15, customer15) into BookingCustomer
!insert (booking15, roomreservation24) into BookingRoomReservation
!insert (booking15, roomreservation25) into BookingRoomReservation

!insert (roomreservation24, room29) into RoomReservationRoom
!insert (roomreservation25, room30) into RoomReservationRoom

!insert (roomreservation24, roomextra36) into RoomReservationExtras
!insert (roomreservation25, roomextra37) into RoomReservationExtras

!insert (bill30, roomreservation24) into BillRoomReservation
!insert (bill31, roomreservation25) into BillRoomReservation

!insert (booking15, bill30) into BookingBill
!insert (booking15, bill31) into BookingBill
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 55 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category invalid
```
!new Customer('customer13')
!customer13.firstName := 'Carlos'
!customer13.lastName := 'Silva'

!new Booking('booking13')
!booking13.bookingId := 21105
!booking13.startDate := 'February 15, 2024'
!booking13.endDate := 'February 22, 2024'
!booking13.canceled := false
!booking13.confirmed := true

!new RoomReservation('roomreservation21')
!roomreservation21.checkInDate := 'February 15, 2024'
!roomreservation21.checkOutDate := 'February 22, 2024'

!new Room('room26')
!room26.roomNumber := 405
!room26.numBeds := 2
!room26.pricePerNight := 700.00
!room26.occupied := true
!room26.blocked := false

!new RoomExtra('roomextra30')
!roomextra30.price := 100.00
!roomextra30.description := 'Rental of traditional Carnaval costumes.'

!new RoomExtra('roomextra31')
!roomextra31.price := 50.00
!roomextra31.description := 'Exclusive breakfast with a view of Copacabana Beach.'

!new Bill('bill25')
!bill25.billId := 211051
!bill25.price := 0.00

!new Bill('bill26')
!bill26.billId := 211052
!bill26.price := 0.00

!new Bill('bill27')
!bill27.billId := 211053
!bill27.price := 0.00

!insert (booking13, customer13) into BookingCustomer
!insert (booking13, roomreservation21) into BookingRoomReservation

!insert (roomreservation21, room26) into RoomReservationRoom

!insert (roomreservation21, roomextra30) into RoomReservationExtras
!insert (roomreservation21, roomextra31) into RoomReservationExtras

!insert (bill25, roomreservation21) into BillRoomReservation
!insert (bill26, roomreservation21) into BillRoomReservation
!insert (bill27, roomreservation21) into BillRoomReservation

!insert (booking13, bill25) into BookingBill
!insert (booking13, bill26) into BookingBill
!insert (booking13, bill27) into BookingBill
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 11 | 9.09% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `roomreservation21' of class `RoomReservation' is connected to 3 objects of class `Bill'
  at association end `bill' but the multiplicity is specified as `1'.
```

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Generation 3 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 272 | 0.00% |
| Multiplicities Errors | 0 | 44 | 0.00% |
| Invariants Errors | 0 | 12 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 11 | 9.09% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `roomreservation21' of class `RoomReservation' is connected to 3 objects of class `Bill'
  at association end `bill' but the multiplicity is specified as `1'.
```

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 5 | 0.00% |
| checkOutDate <= endDate | 0 | 5 | 0.00% |

# Generation 4
## Category baseline
```
!new Customer('customer16')
!customer16.firstName := 'Vijay'
!customer16.lastName := 'Patel'

!new Booking('booking16')
!booking16.bookingId := 89012
!booking16.startDate := 'October 15, 2023'
!booking16.endDate := 'October 18, 2023'
!booking16.canceled := false
!booking16.confirmed := true

!new RoomReservation('roomreservation26')
!roomreservation26.checkInDate := 'October 15, 2023'
!roomreservation26.checkOutDate := 'October 18, 2023'

!new Room('room31')
!room31.roomNumber := 102
!room31.numBeds := 2
!room31.pricePerNight := 160.00
!room31.occupied := true
!room31.blocked := false

!new Room('room32')
!room32.roomNumber := 204
!room32.numBeds := 1
!room32.pricePerNight := 110.00
!room32.occupied := false
!room32.blocked := true

!new RoomExtra('roomextra38')
!roomextra38.price := 25.00
!roomextra38.description := 'Airport shuttle service'

!new Bill('bill32')
!bill32.billId := 234567
!bill32.price := 505.00

!new FreeRoomTypesDTO('freeroomtypesdto16')
!freeroomtypesdto16.roomTypeDescription := 'Luxury King Room'
!freeroomtypesdto16.numBeds := 1
!freeroomtypesdto16.pricePerNight := 300.00
!freeroomtypesdto16.numFreeRooms := 2

!insert (booking16, customer16) into BookingCustomer
!insert (booking16, roomreservation26) into BookingRoomReservation
!insert (booking16, bill32) into BookingBill

!insert (roomreservation26, room31) into RoomReservationRoom

!insert (roomreservation26, roomextra38) into RoomReservationExtras

!insert (bill32, roomreservation26) into BillRoomReservation

!insert (roomreservation26, room32) into RoomReservationRoom
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 42 | 0.00% |
| Multiplicities Errors | 0 | 7 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category boundary
```
!new Customer('customer17')
!customer17.firstName := 'Sven'
!customer17.lastName := 'Bjorklund'

!new Booking('booking17')
!booking17.bookingId := 4
!booking17.startDate := '2024-03-15'
!booking17.endDate := '2024-03-16'
!booking17.canceled := false
!booking17.confirmed := true

!new Bill('bill33')
!bill33.billId := 6
!bill33.price := 50.00

!new RoomReservation('roomreservation27')
!roomreservation27.checkInDate := '2024-03-15'
!roomreservation27.checkOutDate := '2024-03-16'

!new Room('room33')
!room33.roomNumber := 7
!room33.numBeds := 1
!room33.pricePerNight := 45.00
!room33.occupied := true
!room33.blocked := false

!new RoomExtra('roomextra39')
!roomextra39.price := 5.00
!roomextra39.description := '24-hour Internet Access'

!new FreeRoomTypesDTO('freeroomtypesdto17')
!freeroomtypesdto17.roomTypeDescription := 'Economy Single Room'
!freeroomtypesdto17.numBeds := 1
!freeroomtypesdto17.pricePerNight := 40.00
!freeroomtypesdto17.numFreeRooms := 5

!insert (booking17, customer17) into BookingCustomer
!insert (booking17, roomreservation27) into BookingRoomReservation
!insert (booking17, bill33) into BookingBill

!insert (roomreservation27, room33) into RoomReservationRoom

!insert (roomreservation27, roomextra39) into RoomReservationExtras

!insert (bill33, roomreservation27) into BillRoomReservation
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 35 | 0.00% |
| Multiplicities Errors | 0 | 6 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category complex
```
!new Customer('customer18')
!customer18.firstName := 'Hiroshi'
!customer18.lastName := 'Tanaka'

!new Booking('booking18')
!booking18.bookingId := 456
!booking18.startDate := 'June 21, 2024'
!booking18.endDate := 'June 26, 2024'
!booking18.canceled := false
!booking18.confirmed := true

!new RoomReservation('roomreservation28')
!roomreservation28.checkInDate := 'June 21, 2024'
!roomreservation28.checkOutDate := 'June 26, 2024'

!new Room('room34')
!room34.roomNumber := 707
!room34.numBeds := 1
!room34.pricePerNight := 20000
!room34.occupied := true
!room34.blocked := false

!new RoomExtra('roomextra40')
!roomextra40.price := 15000
!roomextra40.description := 'Includes access to meeting rooms with conference facilities and in-house catering services.'

!new RoomExtra('roomextra41')
!roomextra41.price := 5000
!roomextra41.description := 'Daily laundry service for business attire with same-day delivery.'

!new RoomExtra('roomextra42')
!roomextra42.price := 8000
!roomextra42.description := 'Private car transfer from Narita International Airport to the hotel.'

!new Bill('bill34')
!bill34.billId := 67890
!bill34.price := 123000

!new FreeRoomTypesDTO('freeroomtypesdto18')
!freeroomtypesdto18.roomTypeDescription := 'Spacious suite with separate living area, ideal for business travelers seeking comfort and convenience.'
!freeroomtypesdto18.numBeds := 1
!freeroomtypesdto18.pricePerNight := 35000
!freeroomtypesdto18.numFreeRooms := 2

!new FreeRoomTypesDTO('freeroomtypesdto19')
!freeroomtypesdto19.roomTypeDescription := 'Comfortable twin room suitable for colleagues traveling together.'
!freeroomtypesdto19.numBeds := 2
!freeroomtypesdto19.pricePerNight := 22000
!freeroomtypesdto19.numFreeRooms := 5

!insert (booking18, customer18) into BookingCustomer
!insert (booking18, roomreservation28) into BookingRoomReservation
!insert (booking18, bill34) into BookingBill

!insert (roomreservation28, room34) into RoomReservationRoom

!insert (roomreservation28, roomextra40) into RoomReservationExtras
!insert (roomreservation28, roomextra41) into RoomReservationExtras
!insert (roomreservation28, roomextra42) into RoomReservationExtras

!insert (bill34, roomreservation28) into BillRoomReservation
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 48 | 0.00% |
| Multiplicities Errors | 0 | 8 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category edge
```
!new Customer('customer21')
!customer21.firstName := 'Emily'
!customer21.lastName := 'Thompson'

!new Booking('booking21')
!booking21.bookingId := 4004
!booking21.startDate := 'October 15, 2024'
!booking21.endDate := 'October 18, 2024'
!booking21.canceled := false
!booking21.confirmed := true

!new RoomReservation('roomreservation33')
!roomreservation33.checkInDate := 'October 15, 2024'
!roomreservation33.checkOutDate := 'October 18, 2024'

!new RoomReservation('roomreservation34')
!roomreservation34.checkInDate := 'October 15, 2024'
!roomreservation34.checkOutDate := 'October 18, 2024'

!new RoomReservation('roomreservation35')
!roomreservation35.checkInDate := 'October 16, 2024'
!roomreservation35.checkOutDate := 'October 17, 2024'

!new Room('room38')
!room38.roomNumber := 601
!room38.numBeds := 2
!room38.pricePerNight := 500.00
!room38.occupied := true
!room38.blocked := false

!new Room('room39')
!room39.roomNumber := 602
!room39.numBeds := 2
!room39.pricePerNight := 500.00
!room39.occupied := true
!room39.blocked := false

!new Room('room40')
!room40.roomNumber := 700
!room40.numBeds := 1  -- Adjusted to comply with the positive number of beds invariant
!room40.pricePerNight := 400.00
!room40.occupied := true
!room40.blocked := false

!new RoomExtra('roomextra47')
!roomextra47.price := 500.00
!roomextra47.description := 'Private Chef Service'

!new RoomExtra('roomextra48')
!roomextra48.price := 400.00
!roomextra48.description := 'In-room Spa Treatment'

!new RoomExtra('roomextra49')
!roomextra49.price := 300.00
!roomextra49.description := 'Advanced Audio-Visual Setup'

!new Bill('bill38')
!bill38.billId := 9008
!bill38.price := 2000.00

!new Bill('bill39')
!bill39.billId := 9009
!bill39.price := 2000.00

!new Bill('bill40')
!bill40.billId := 9010
!bill40.price := 1100.00

!new FreeRoomTypesDTO('freeroomtypesdto21')
!freeroomtypesdto21.roomTypeDescription := 'Standard Room'
!freeroomtypesdto21.numBeds := 1
!freeroomtypesdto21.pricePerNight := 200.00
!freeroomtypesdto21.numFreeRooms := 3

!insert (booking21, customer21) into BookingCustomer
!insert (booking21, roomreservation33) into BookingRoomReservation
!insert (booking21, roomreservation34) into BookingRoomReservation
!insert (booking21, roomreservation35) into BookingRoomReservation

!insert (roomreservation33, room38) into RoomReservationRoom
!insert (roomreservation34, room39) into RoomReservationRoom
!insert (roomreservation35, room40) into RoomReservationRoom

!insert (roomreservation33, roomextra47) into RoomReservationExtras
!insert (roomreservation34, roomextra48) into RoomReservationExtras
!insert (roomreservation35, roomextra49) into RoomReservationExtras

!insert (bill38, roomreservation33) into BillRoomReservation
!insert (bill39, roomreservation34) into BillRoomReservation
!insert (bill40, roomreservation35) into BillRoomReservation

!insert (booking21, bill38) into BookingBill
!insert (booking21, bill39) into BookingBill
!insert (booking21, bill40) into BookingBill
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 75 | 0.00% |
| Multiplicities Errors | 0 | 16 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category invalid
```
!new Customer('customer19')
!customer19.firstName := 'René'
!customer19.lastName := 'Dubois'

!new Booking('booking19')
!booking19.bookingId := 122007
!booking19.startDate := 'December 18, 2024'
!booking19.endDate := 'December 22, 2024'
!booking19.canceled := false
!booking19.confirmed := true

!new RoomReservation('roomreservation29')
!roomreservation29.checkInDate := 'December 18, 2024'
!roomreservation29.checkOutDate := 'December 22, 2024'

!new RoomReservation('roomreservation30')
!roomreservation30.checkInDate := 'December 20, 2024'
!roomreservation30.checkOutDate := 'December 24, 2024'

!new Room('room35')
!room35.roomNumber := 305
!room35.numBeds := 1
!room35.pricePerNight := 250
!room35.occupied := true
!room35.blocked := false

!new RoomExtra('roomextra43')
!roomextra43.price := 70
!roomextra43.description := 'Traditional Swiss fondue dining evening.'

!new RoomExtra('roomextra44')
!roomextra44.price := 120
!roomextra44.description := 'Complete ski gear set for full snow sport enjoyment.'

!new Bill('bill35')
!bill35.billId := 1220071
!bill35.price := 1000

!insert (booking19, customer19) into BookingCustomer
!insert (booking19, roomreservation29) into BookingRoomReservation
!insert (booking19, roomreservation30) into BookingRoomReservation

!insert (roomreservation29, room35) into RoomReservationRoom
!insert (roomreservation30, room35) into RoomReservationRoom

!insert (roomreservation29, roomextra43) into RoomReservationExtras
!insert (roomreservation30, roomextra44) into RoomReservationExtras

!insert (bill35, roomreservation29) into BillRoomReservation
!insert (bill35, roomreservation30) into BillRoomReservation

!insert (booking19, bill35) into BookingBill
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 2 | 10 | 20.00% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `bill35' of class `Bill' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationRoom':
  Object `room35' of class `Room' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 1 | 1 | 100.00% |

| Invalid checkOutDate <= endDate | 
|---| 
```
December 24, 2024 !<= December 22, 2024
```

## Generation 4 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 240 | 0.00% |
| Multiplicities Errors | 0 | 37 | 0.00% |
| Invariants Errors | 0 | 12 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 2 | 10 | 20.00% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `bill35' of class `Bill' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationRoom':
  Object `room35' of class `Room' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 5 | 0.00% |
| checkOutDate <= endDate | 1 | 5 | 20.00% |

| Invalid checkOutDate <= endDate | 
|---| 
```
December 24, 2024 !<= December 22, 2024
```

# Generation 5
## Category baseline
```
!new Customer('customer20')
!customer20.firstName := 'Emiliana'
!customer20.lastName := 'Rossi'

!new Booking('booking20')
!booking20.bookingId := 56789
!booking20.startDate := 'April 10, 2023'
!booking20.endDate := 'April 17, 2023'
!booking20.canceled := false
!booking20.confirmed := true

!new RoomReservation('roomreservation31')
!roomreservation31.checkInDate := 'April 10, 2023'
!roomreservation31.checkOutDate := 'April 13, 2023'

!new RoomReservation('roomreservation32')
!roomreservation32.checkInDate := 'April 13, 2023'
!roomreservation32.checkOutDate := 'April 17, 2023'

!new Room('room36')
!room36.roomNumber := 210
!room36.numBeds := 3
!room36.pricePerNight := 220.00
!room36.occupied := true
!room36.blocked := false

!new Room('room37')
!room37.roomNumber := 312
!room37.numBeds := 2
!room37.pricePerNight := 180.00
!room37.occupied := true
!room37.blocked := false

!new RoomExtra('roomextra45')
!roomextra45.price := 35.00
!roomextra45.description := 'Private Yoga Session'

!new RoomExtra('roomextra46')
!roomextra46.price := 45.00
!roomextra46.description := 'Gourmet Dinner Experience'

!new Bill('bill36')
!bill36.billId := 345678
!bill36.price := 680.00

!new Bill('bill37')
!bill37.billId := 345679
!bill37.price := 680.00

!new FreeRoomTypesDTO('freeroomtypesdto20')
!freeroomtypesdto20.roomTypeDescription := 'Business Suite'
!freeroomtypesdto20.numBeds := 2
!freeroomtypesdto20.pricePerNight := 260.00
!freeroomtypesdto20.numFreeRooms := 4

!insert (booking20, customer20) into BookingCustomer
!insert (booking20, roomreservation31) into BookingRoomReservation
!insert (booking20, roomreservation32) into BookingRoomReservation
!insert (booking20, bill36) into BookingBill
!insert (booking20, bill37) into BookingBill

!insert (roomreservation31, room36) into RoomReservationRoom
!insert (roomreservation32, room37) into RoomReservationRoom

!insert (roomreservation31, roomextra45) into RoomReservationExtras
!insert (roomreservation32, roomextra46) into RoomReservationExtras

!insert (bill36, roomreservation31) into BillRoomReservation
!insert (bill37, roomreservation32) into BillRoomReservation
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 55 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category boundary
```
!new Customer('customer22')
!customer22.firstName := 'Rajiv'
!customer22.lastName := 'Kumar'

!new Booking('booking22')
!booking22.bookingId := 5
!booking22.startDate := '2025-05-01'
!booking22.endDate := '2025-05-03'
!booking22.canceled := false
!booking22.confirmed := true

!new RoomReservation('roomreservation36')
!roomreservation36.checkInDate := '2025-05-01'
!roomreservation36.checkOutDate := '2025-05-03'

!new Room('room41')
!room41.roomNumber := 1
!room41.numBeds := 1  -- Adjusted to comply with the positive number of beds invariant
!room41.pricePerNight := 2000.00
!room41.occupied := true
!room41.blocked := true

!new Room('room42')
!room42.roomNumber := 101
!room42.numBeds := 2
!room42.pricePerNight := 500.00
!room42.occupied := true
!room42.blocked := false

!new Room('room43')
!room43.roomNumber := 202
!room43.numBeds := 1
!room43.pricePerNight := 200.00
!room43.occupied := false
!room43.blocked := false

!new RoomExtra('roomextra50')
!roomextra50.price := 800.00
!roomextra50.description := 'Full-day Open Buffet'

!new RoomExtra('roomextra51')
!roomextra51.price := 300.00
!roomextra51.description := 'State-of-the-art AV Equipment'

!new RoomExtra('roomextra52')
!roomextra52.price := 200.00
!roomextra52.description := 'Shuttle Service for Attendees'

!new Bill('bill41')
!bill41.billId := 7
!bill41.price := 15000.00

!new FreeRoomTypesDTO('freeroomtypesdto22')
!freeroomtypesdto22.roomTypeDescription := 'Business Suite'
!freeroomtypesdto22.numBeds := 2
!freeroomtypesdto22.pricePerNight := 400.00
!freeroomtypesdto22.numFreeRooms := 4

!insert (booking22, customer22) into BookingCustomer
!insert (booking22, roomreservation36) into BookingRoomReservation
!insert (booking22, bill41) into BookingBill

!insert (roomreservation36, room41) into RoomReservationRoom
!insert (roomreservation36, room42) into RoomReservationRoom
!insert (roomreservation36, room43) into RoomReservationRoom

!insert (roomreservation36, roomextra50) into RoomReservationExtras
!insert (roomreservation36, roomextra51) into RoomReservationExtras
!insert (roomreservation36, roomextra52) into RoomReservationExtras

!insert (bill41, roomreservation36) into BillRoomReservation
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category complex
```
!new Customer('customer24')
!customer24.firstName := 'Maria'
!customer24.lastName := 'Ortiz'

!new Booking('booking24')
!booking24.bookingId := 789
!booking24.startDate := 'July 10, 2024'
!booking24.endDate := 'July 20, 2024'
!booking24.canceled := false
!booking24.confirmed := true

!new RoomReservation('roomreservation38')
!roomreservation38.checkInDate := 'July 10, 2024'
!roomreservation38.checkOutDate := 'July 15, 2024'

!new RoomReservation('roomreservation39')
!roomreservation39.checkInDate := 'July 15, 2024'
!roomreservation39.checkOutDate := 'July 20, 2024'

!new Room('room45')
!room45.roomNumber := 1103
!room45.numBeds := 2
!room45.pricePerNight := 250.00
!room45.occupied := true
!room45.blocked := false

!new Room('room46')
!room46.roomNumber := 1205
!room46.numBeds := 3
!room46.pricePerNight := 300.00
!room46.occupied := true
!room46.blocked := false

!new RoomExtra('roomextra55')
!roomextra55.price := 100.00
!roomextra55.description := 'Guided snorkeling tour with all necessary equipment provided, exploring colorful coral reefs.'

!new RoomExtra('roomextra56')
!roomextra56.price := 30.00
!roomextra56.description := 'In-room movie night setup with a selection of family-friendly DVDs, popcorn, and snacks.'

!new RoomExtra('roomextra57')
!roomextra57.price := 200.00
!roomextra57.description := 'Private barbecue dinner set up on the beach with a dedicated chef and a variety of grilled options.'

!new RoomExtra('roomextra58')
!roomextra58.price := 60.00
!roomextra58.description := 'Access to the resort\'s kids club, with daily activities and supervision included.'

!new Bill('bill44')
!bill44.billId := 89123
!bill44.price := 1330.00

!new Bill('bill45')
!bill45.billId := 89124
!bill45.price := 1660.00

!new FreeRoomTypesDTO('freeroomtypesdto23')
!freeroomtypesdto23.roomTypeDescription := 'Large suite with direct beach access, ideal for families needing extra space.'
!freeroomtypesdto23.numBeds := 3
!freeroomtypesdto23.pricePerNight := 350.00
!freeroomtypesdto23.numFreeRooms := 1

!new FreeRoomTypesDTO('freeroomtypesdto24')
!freeroomtypesdto24.roomTypeDescription := 'Comfortable room with a balcony view, perfect for small families or couples.'
!freeroomtypesdto24.numBeds := 2
!freeroomtypesdto24.pricePerNight := 270.00
!freeroomtypesdto24.numFreeRooms := 4

!insert (booking24, customer24) into BookingCustomer
!insert (booking24, roomreservation38) into BookingRoomReservation
!insert (booking24, roomreservation39) into BookingRoomReservation

!insert (roomreservation38, room45) into RoomReservationRoom
!insert (roomreservation39, room46) into RoomReservationRoom

!insert (roomreservation38, roomextra55) into RoomReservationExtras
!insert (roomreservation38, roomextra56) into RoomReservationExtras
!insert (roomreservation39, roomextra57) into RoomReservationExtras
!insert (roomreservation39, roomextra58) into RoomReservationExtras

!insert (bill44, roomreservation38) into BillRoomReservation
!insert (bill45, roomreservation39) into BillRoomReservation

!insert (booking24, bill44) into BookingBill
!insert (booking24, bill45) into BookingBill
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 68 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category edge
```
!new Customer('customer27')
!customer27.firstName := 'Amina'
!customer27.lastName := 'Jones'

!new Booking('booking27')
!booking27.bookingId := 5005
!booking27.startDate := 'January 5, 2025'
!booking27.endDate := 'January 10, 2025'
!booking27.canceled := false
!booking27.confirmed := true

!new RoomReservation('roomreservation43')
!roomreservation43.checkInDate := 'January 5, 2025'
!roomreservation43.checkOutDate := 'January 10, 2025'

!new RoomReservation('roomreservation44')
!roomreservation44.checkInDate := 'January 5, 2025'
!roomreservation44.checkOutDate := 'January 10, 2025'

!new Room('room50')
!room50.roomNumber := 101
!room50.numBeds := 1
!room50.pricePerNight := 0
!room50.occupied := true
!room50.blocked := false

!new Room('room51')
!room51.roomNumber := 102
!room51.numBeds := 1
!room51.pricePerNight := 0
!room51.occupied := true
!room51.blocked := false

!new Room('room52')
!room52.roomNumber := 200
!room52.numBeds := 1  -- Adjusted for positive number of beds invariant
!room52.pricePerNight := 0
!room52.occupied := true
!room52.blocked := false

!new RoomExtra('roomextra61')
!roomextra61.price := 0
!roomextra61.description := 'Complimentary Breakfast'

!new RoomExtra('roomextra62')
!roomextra62.price := 0
!roomextra62.description := 'Donation-driven Event Setup'

!new Bill('bill49')
!bill49.billId := 9011
!bill49.price := 0

!new Bill('bill50')
!bill50.billId := 9012
!bill50.price := 0

!new FreeRoomTypesDTO('freeroomtypesdto27')
!freeroomtypesdto27.roomTypeDescription := 'Family Suite'
!freeroomtypesdto27.numBeds := 3
!freeroomtypesdto27.pricePerNight := 400
!freeroomtypesdto27.numFreeRooms := 4

!insert (booking27, customer27) into BookingCustomer
!insert (booking27, roomreservation43) into BookingRoomReservation
!insert (booking27, roomreservation44) into BookingRoomReservation

!insert (roomreservation43, room50) into RoomReservationRoom
!insert (roomreservation43, room51) into RoomReservationRoom
!insert (roomreservation44, room52) into RoomReservationRoom

!insert (roomreservation43, roomextra61) into RoomReservationExtras
!insert (roomreservation44, roomextra62) into RoomReservationExtras

!insert (bill49, roomreservation43) into BillRoomReservation
!insert (bill50, roomreservation44) into BillRoomReservation

!insert (booking27, bill49) into BookingBill
!insert (booking27, bill50) into BookingBill
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 62 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category invalid
```
!new Customer('customer23')
!customer23.firstName := 'Priya'
!customer23.lastName := 'Patel'

!new Booking('booking23')
!booking23.bookingId := 30518003
!booking23.startDate := 'August 1, 2024'
!booking23.endDate := 'August 7, 2024'
!booking23.canceled := false
!booking23.confirmed := true

!new RoomReservation('roomreservation37')
!roomreservation37.checkInDate := 'August 1, 2024'
!roomreservation37.checkOutDate := 'August 7, 2024'

!new Room('room44')
!room44.roomNumber := 1201
!room44.numBeds := 2
!room44.pricePerNight := 10000
!room44.occupied := true
!room44.blocked := false

!new RoomExtra('roomextra53')
!roomextra53.price := 3000
!roomextra53.description := 'Guided tour through Mumbai’s historical sites and markets.'

!new RoomExtra('roomextra54')
!roomextra54.price := 2500
!roomextra54.description := 'Rejuvenating massage session at the spa.'

!new Bill('bill42')
!bill42.billId := 305180301
!bill42.price := 5500

!new Bill('bill43')
!bill43.billId := 305180302
!bill43.price := 15000

!insert (booking23, customer23) into BookingCustomer
!insert (booking23, roomreservation37) into BookingRoomReservation

!insert (roomreservation37, room44) into RoomReservationRoom

!insert (roomreservation37, roomextra53) into RoomReservationExtras
!insert (roomreservation37, roomextra54) into RoomReservationExtras

!insert (bill42, roomreservation37) into BillRoomReservation

!insert (booking23, bill42) into BookingBill
!insert (booking23, bill43) into BookingBill
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 8 | 12.50% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `bill43' of class `Bill' is connected to 0 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Generation 5 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 280 | 0.00% |
| Multiplicities Errors | 0 | 46 | 0.00% |
| Invariants Errors | 0 | 12 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 8 | 12.50% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `bill43' of class `Bill' is connected to 0 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 5 | 0.00% |
| checkOutDate <= endDate | 0 | 5 | 0.00% |

# Generation 6
## Category baseline
```
!new Customer('customer25')
!customer25.firstName := 'Ayesha'
!customer25.lastName := 'Ibrahim'

!new Booking('booking25')
!booking25.bookingId := 23456
!booking25.startDate := 'February 20, 2023'
!booking25.endDate := 'February 24, 2023'
!booking25.canceled := false
!booking25.confirmed := true

!new RoomReservation('roomreservation40')
!roomreservation40.checkInDate := 'February 20, 2023'
!roomreservation40.checkOutDate := 'February 22, 2023'

!new RoomReservation('roomreservation41')
!roomreservation41.checkInDate := 'February 22, 2023'
!roomreservation41.checkOutDate := 'February 24, 2023'

!new Room('room47')
!room47.roomNumber := 108
!room47.numBeds := 1
!room47.pricePerNight := 100.00
!room47.occupied := true
!room47.blocked := false

!new Room('room48')
!room48.roomNumber := 202
!room48.numBeds := 3
!room48.pricePerNight := 240.00
!room48.occupied := true
!room48.blocked := false

!new RoomExtra('roomextra59')
!roomextra59.price := 20.00
!roomextra59.description := 'Laundry Service'

!new RoomExtra('roomextra60')
!roomextra60.price := 60.00
!roomextra60.description := 'Adventure Park Tickets'

!new Bill('bill46')
!bill46.billId := 456789
!bill46.price := 360.00

!new Bill('bill47')
!bill47.billId := 456790
!bill47.price := 380.00

!new FreeRoomTypesDTO('freeroomtypesdto25')
!freeroomtypesdto25.roomTypeDescription := 'Standard Twin Room'
!freeroomtypesdto25.numBeds := 2
!freeroomtypesdto25.pricePerNight := 140.00
!freeroomtypesdto25.numFreeRooms := 5

!insert (booking25, customer25) into BookingCustomer
!insert (booking25, roomreservation40) into BookingRoomReservation
!insert (booking25, roomreservation41) into BookingRoomReservation
!insert (booking25, bill46) into BookingBill
!insert (booking25, bill47) into BookingBill

!insert (roomreservation40, room47) into RoomReservationRoom
!insert (roomreservation41, room48) into RoomReservationRoom

!insert (roomreservation40, roomextra59) into RoomReservationExtras
!insert (roomreservation41, roomextra60) into RoomReservationExtras

!insert (bill46, roomreservation40) into BillRoomReservation
!insert (bill47, roomreservation41) into BillRoomReservation
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 55 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category boundary
```
!new Customer('customer26')
!customer26.firstName := 'Anja'
!customer26.lastName := 'Petrovic'

!new Booking('booking26')
!booking26.bookingId := 6
!booking26.startDate := '2023-12-25'
!booking26.endDate := '2023-12-26'
!booking26.canceled := false
!booking26.confirmed := true

!new Bill('bill48')
!bill48.billId := 8
!bill48.price := 100.00

!new RoomReservation('roomreservation42')
!roomreservation42.checkInDate := '2023-12-25'
!roomreservation42.checkOutDate := '2023-12-26'

!new Room('room49')
!room49.roomNumber := 404
!room49.numBeds := 2
!room49.pricePerNight := 100.00
!room49.occupied := true
!room49.blocked := false

!new FreeRoomTypesDTO('freeroomtypesdto26')
!freeroomtypesdto26.roomTypeDescription := 'Emergency Double Room'
!freeroomtypesdto26.numBeds := 2
!freeroomtypesdto26.pricePerNight := 100.00
!freeroomtypesdto26.numFreeRooms := 0

!insert (booking26, customer26) into BookingCustomer
!insert (booking26, roomreservation42) into BookingRoomReservation
!insert (booking26, bill48) into BookingBill

!insert (roomreservation42, room49) into RoomReservationRoom

!insert (bill48, roomreservation42) into BillRoomReservation
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 31 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category complex
```
!new Customer('customer28')
!customer28.firstName := 'Lars'
!customer28.lastName := 'Johansson'

!new Booking('booking28')
!booking28.bookingId := 987
!booking28.startDate := 'January 5, 2024'
!booking28.endDate := 'January 12, 2024'
!booking28.canceled := false
!booking28.confirmed := true

!new RoomReservation('roomreservation45')
!roomreservation45.checkInDate := 'January 5, 2024'
!roomreservation45.checkOutDate := 'January 12, 2024'

!new Room('room53')
!room53.roomNumber := 402
!room53.numBeds := 2
!room53.pricePerNight := 180.00
!room53.occupied := true
!room53.blocked := false

!new RoomExtra('roomextra63')
!roomextra63.price := 150.00
!roomextra63.description := 'Full set of skiing gear including skis, poles, boots, and helmet for the duration of the stay.'

!new RoomExtra('roomextra64')
!roomextra64.price := 90.00
!roomextra64.description := 'Unlimited access to the spa facilities, including sauna, steam room, and hot tubs.'

!new RoomExtra('roomextra65')
!roomextra65.price := 140.00  -- Calculated for 7 days
!roomextra65.description := 'Full access to the daily breakfast buffet featuring alpine specialties and international favorites.'

!new Bill('bill51')
!bill51.billId := 45230
!bill51.price := 1590.00

!new FreeRoomTypesDTO('freeroomtypesdto28')
!freeroomtypesdto28.roomTypeDescription := 'High-end suite with private terrace and panoramic mountain views, ideal for a luxury ski vacation.'
!freeroomtypesdto28.numBeds := 2
!freeroomtypesdto28.pricePerNight := 330.00
!freeroomtypesdto28.numFreeRooms := 2

!new FreeRoomTypesDTO('freeroomtypesdto29')
!freeroomtypesdto29.roomTypeDescription := 'Cozy studio with rustic charm, perfect for solo travelers or couples seeking convenience on the slopes.'
!freeroomtypesdto29.numBeds := 1
!freeroomtypesdto29.pricePerNight := 150.00
!freeroomtypesdto29.numFreeRooms := 3

!insert (booking28, customer28) into BookingCustomer
!insert (booking28, roomreservation45) into BookingRoomReservation
!insert (booking28, bill51) into BookingBill

!insert (roomreservation45, room53) into RoomReservationRoom

!insert (roomreservation45, roomextra63) into RoomReservationExtras
!insert (roomreservation45, roomextra64) into RoomReservationExtras
!insert (roomreservation45, roomextra65) into RoomReservationExtras

!insert (bill51, roomreservation45) into BillRoomReservation
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 48 | 0.00% |
| Multiplicities Errors | 0 | 8 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category edge
```
!new Customer('customer30')
!customer30.firstName := 'Pierre'
!customer30.lastName := 'Dubois'

!new Booking('booking30')
!booking30.bookingId := 6006
!booking30.startDate := 'April 1, 2025'
!booking30.endDate := 'April 10, 2025'
!booking30.canceled := false
!booking30.confirmed := true

!new RoomReservation('roomreservation47')
!roomreservation47.checkInDate := 'April 1, 2025'
!roomreservation47.checkOutDate := 'April 5, 2025'

!new RoomReservation('roomreservation48')
!roomreservation48.checkInDate := 'April 5, 2025'
!roomreservation48.checkOutDate := 'April 8, 2025'

!new RoomReservation('roomreservation49')
!roomreservation49.checkInDate := 'April 8, 2025'
!roomreservation49.checkOutDate := 'April 10, 2025'

!new Room('room55')
!room55.roomNumber := 801
!room55.numBeds := 1  -- Adjusted for positive number of beds invariant
!room55.pricePerNight := 250
!room55.occupied := true
!room55.blocked := false

!new Room('room56')
!room56.roomNumber := 802
!room56.numBeds := 3
!room56.pricePerNight := 400
!room56.occupied := true
!room56.blocked := false

!new Room('room57')
!room57.roomNumber := 803
!room57.numBeds := 3
!room57.pricePerNight := 400
!room57.occupied := true
!room57.blocked := false

!new RoomExtra('roomextra71')
!roomextra71.price := 150
!roomextra71.description := 'French Gourmet welcome package'

!new RoomExtra('roomextra72')
!roomextra72.price := 100
!roomextra72.description := 'German Beer and Snacks package'

!new RoomExtra('roomextra73')
!roomextra73.price := 200
!roomextra73.description := 'Traditional Japanese Tea Ceremony'

!new Bill('bill54')
!bill54.billId := 10013
!bill54.price := 1450

!new Bill('bill55')
!bill55.billId := 10014
!bill55.price := 1150

!new Bill('bill56')
!bill56.billId := 10015
!bill56.price := 1050

!new FreeRoomTypesDTO('freeroomtypesdto30')
!freeroomtypesdto30.roomTypeDescription := 'Standard Double'
!freeroomtypesdto30.numBeds := 2
!freeroomtypesdto30.pricePerNight := 150
!freeroomtypesdto30.numFreeRooms := 8

!insert (booking30, customer30) into BookingCustomer
!insert (booking30, roomreservation47) into BookingRoomReservation
!insert (booking30, roomreservation48) into BookingRoomReservation
!insert (booking30, roomreservation49) into BookingRoomReservation

!insert (roomreservation47, room55) into RoomReservationRoom
!insert (roomreservation48, room56) into RoomReservationRoom
!insert (roomreservation49, room57) into RoomReservationRoom

!insert (roomreservation47, roomextra71) into RoomReservationExtras
!insert (roomreservation48, roomextra72) into RoomReservationExtras
!insert (roomreservation49, roomextra73) into RoomReservationExtras

!insert (bill54, roomreservation47) into BillRoomReservation
!insert (bill55, roomreservation48) into BillRoomReservation
!insert (bill56, roomreservation49) into BillRoomReservation

!insert (booking30, bill54) into BookingBill
!insert (booking30, bill55) into BookingBill
!insert (booking30, bill56) into BookingBill
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 75 | 0.00% |
| Multiplicities Errors | 0 | 16 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Category invalid
```
!new Customer('customer29')
!customer29.firstName := 'Ana Maria'
!customer29.lastName := 'López'

!new Booking('booking29')
!booking29.bookingId := 712009
!booking29.startDate := 'July 15, 2024'
!booking29.endDate := 'July 22, 2024'
!booking29.canceled := false
!booking29.confirmed := true

!new RoomReservation('roomreservation46')
!roomreservation46.checkInDate := 'July 15, 2024'
!roomreservation46.checkOutDate := 'July 18, 2024'

!new Room('room54')
!room54.roomNumber := 203
!room54.numBeds := 2
!room54.pricePerNight := 120.00
!room54.occupied := true
!room54.blocked := false

!new RoomExtra('roomextra66')
!roomextra66.price := 40.00
!roomextra66.description := 'Nightly show of traditional Andean dances.'

!new RoomExtra('roomextra67')
!roomextra67.price := 50.00
!roomextra67.description := 'Guided tasting session of Peruvian pisco varieties.'

!new RoomExtra('roomextra68')
!roomextra68.price := 35.00
!roomextra68.description := 'Introduction to basic Quechua phrases and conversation.'

!new RoomExtra('roomextra69')
!roomextra69.price := 120.00
!roomextra69.description := 'Full-day guided tour of the Sacred Valley.'

!new RoomExtra('roomextra70')
!roomextra70.price := 60.00
!roomextra70.description := 'Hands-on cooking class featuring traditional Peruvian dishes.'

!new Bill('bill52')
!bill52.billId := 71200901
!bill52.price := 225.00

!new Bill('bill53')
!bill53.billId := 71200902
!bill53.price := 180.00

!insert (booking29, customer29) into BookingCustomer
!insert (booking29, roomreservation46) into BookingRoomReservation

!insert (roomreservation46, room54) into RoomReservationRoom

!insert (roomreservation46, roomextra66) into RoomReservationExtras
!insert (roomreservation46, roomextra67) into RoomReservationExtras
!insert (roomreservation46, roomextra68) into RoomReservationExtras

!insert (bill52, roomreservation46) into BillRoomReservation

!insert (booking29, bill52) into BookingBill
!insert (booking29, bill53) into BookingBill
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 3 | 9 | 33.33% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `bill53' of class `Bill' is connected to 0 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationExtras':
  Object `roomextra70' of class `RoomExtra' is connected to 0 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationExtras':
  Object `roomextra69' of class `RoomExtra' is connected to 0 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 1 | 0.00% |
| checkOutDate <= endDate | 0 | 1 | 0.00% |

## Generation 6 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 257 | 0.00% |
| Multiplicities Errors | 0 | 40 | 0.00% |
| Invariants Errors | 0 | 12 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 3 | 9 | 33.33% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `bill53' of class `Bill' is connected to 0 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationExtras':
  Object `roomextra70' of class `RoomExtra' is connected to 0 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationExtras':
  Object `roomextra69' of class `RoomExtra' is connected to 0 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 5 | 0.00% |
| checkOutDate <= endDate | 0 | 5 | 0.00% |

# Summary for all generations
| Summary | Value | 
|---|---| 
| Model | GPT_4O | 
| Type | CoT | 
| System | hotelmanagement | 
| Number of generations | 6 | 

| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 1617 | 0.00% |
| Multiplicities Errors | 6 | 261 | 2.30% |
| Invariants Errors | 0 | 72 | 0.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `bill3' of class `Bill' is connected to 0 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `BookingBill':
  Object `bill11' of class `Bill' is connected to 0 objects of class `Booking'
  at association end `booking' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationExtras':
  Object `roomextra16' of class `RoomExtra' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationExtras':
  Object `roomextra15' of class `RoomExtra' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationRoom':
  Object `room15' of class `Room' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationRoom':
  Object `room16' of class `Room' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 8 | 60 | 13.33% |
| Invariants Errors (Not included on General) | 0 | 18 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `roomreservation15' of class `RoomReservation' is connected to 4 objects of class `Bill'
  at association end `bill' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `roomreservation21' of class `RoomReservation' is connected to 3 objects of class `Bill'
  at association end `bill' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `bill35' of class `Bill' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationRoom':
  Object `room35' of class `Room' is connected to 2 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `bill43' of class `Bill' is connected to 0 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `BillRoomReservation':
  Object `bill53' of class `Bill' is connected to 0 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationExtras':
  Object `roomextra70' of class `RoomExtra' is connected to 0 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `RoomReservationExtras':
  Object `roomextra69' of class `RoomExtra' is connected to 0 objects of class `RoomReservation'
  at association end `roomReservation' but the multiplicity is specified as `1'.
```

| HotelManagement | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| checkInDate >= startDate | 0 | 30 | 0.00% |
| checkOutDate <= endDate | 1 | 30 | 3.33% |

| Invalid checkOutDate <= endDate | 
|---| 
```
December 24, 2024 !<= December 22, 2024
```

