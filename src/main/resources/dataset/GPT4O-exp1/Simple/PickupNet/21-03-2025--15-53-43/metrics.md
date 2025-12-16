# Generation 1
```
!new Driver('driver1')
!driver1.id := 'D001'
!driver1.name := 'Alice Johnson'

!new Driver('driver2')
!driver2.id := 'D002'
!driver2.name := 'Bob Smith'

!new Shipment('shipment1')
!shipment1.id := 'S001'
!shipment1.status := #NEW

!new Shipment('shipment2')
!shipment2.id := 'S002'
!shipment2.status := #DELIVERED

!new Shipment('shipment3')
!shipment3.id := 'S003'
!shipment3.status := #ASSIGNED

!new Address('address1')
!address1.text := '123 Elm Street'

!new Address('address2')
!address2.text := '456 Oak Avenue'

!new Address('address3')
!address3.text := '789 Pine Road'

!new Address('address4')
!address4.text := '321 Maple Lane'

!new GeoLocation('geoLocation1')
!geoLocation1.latitude := 42.3601
!geoLocation1.longitude := -71.0589

!new GeoLocation('geoLocation2')
!geoLocation2.latitude := 34.0522
!geoLocation2.longitude := -118.2437

!new GeoLocation('geoLocation3')
!geoLocation3.latitude := 40.7128
!geoLocation3.longitude := -74.0060

!new GeoLocation('geoLocation4')
!geoLocation4.latitude := 37.7749
!geoLocation4.longitude := -122.4194

!new Customer('customer1')
!customer1.id := 'C001'
!customer1.name := 'Charlie Brown'
!customer1.twitterUserName := '@charlie_b'

!new Customer('customer2')
!customer2.id := 'C002'
!customer2.name := 'Daisy Green'
!customer2.twitterUserName := '@daisy_green'

!new Station('station1')

!insert (driver1, shipment2) into DriverShipment
!insert (driver2, shipment3) into DriverShipment

!insert (shipment1, address1) into ShipmentContainsPickUpAddress
!insert (shipment1, address2) into ShipmentContainsDeliveryAddress

!insert (shipment2, address3) into ShipmentContainsPickUpAddress
!insert (shipment2, address4) into ShipmentContainsDeliveryAddress

!insert (shipment3, address4) into ShipmentContainsPickUpAddress
!insert (shipment3, address1) into ShipmentContainsDeliveryAddress

!insert (address1, geoLocation1) into AddressContainsGeoLocation
!insert (address2, geoLocation2) into AddressContainsGeoLocation
!insert (address3, geoLocation3) into AddressContainsGeoLocation
!insert (address4, geoLocation4) into AddressContainsGeoLocation

!insert (customer1, shipment1) into CustomerConsistsOfShipment
!insert (customer2, shipment2) into CustomerConsistsOfShipment
!insert (customer2, shipment3) into CustomerConsistsOfShipment

!insert (station1, customer1) into StationContainsCustomer
!insert (station1, customer2) into StationContainsCustomer

!insert (station1, shipment1) into StationShipment
!insert (station1, shipment2) into StationShipment
!insert (station1, shipment3) into StationShipment

!insert (station1, driver1) into StationContainsDriver
!insert (station1, driver2) into StationContainsDriver
```
## Generation 1 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 66 | 0.00% |
| Multiplicities Errors | 0 | 22 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 3 | 4 | 75.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 2 | 0.00% |

| Invalid Addresses | 
|---| 
```
789 Pine Road
```
```
456 Oak Avenue
```
```
123 Elm Street
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 37.7749 Lon: -122.4194 for address: 321 Maple Lane
```

# Generation 2
```
!new Driver('driver3')
!driver3.id := 'D003'
!driver3.name := 'Eve Williams'

!new Shipment('shipment4')
!shipment4.id := 'S004'
!shipment4.status := #UNDERWAY

!new Shipment('shipment5')
!shipment5.id := 'S005'
!shipment5.status := #NEW

!new Address('address5')
!address5.text := '654 Willow Drive'

!new Address('address6')
!address6.text := '987 Walnut Street'

!new GeoLocation('geoLocation5')
!geoLocation5.latitude := 51.5074
!geoLocation5.longitude := -0.1278

!new GeoLocation('geoLocation6')
!geoLocation6.latitude := 48.8566
!geoLocation6.longitude := 2.3522

!new Customer('customer3')
!customer3.id := 'C003'
!customer3.name := 'Fiona Clark'
!customer3.twitterUserName := '@fiona_clark'

!new Station('station2')

!insert (driver3, shipment4) into DriverShipment
!insert (driver3, shipment5) into DriverShipment

!insert (shipment4, address5) into ShipmentContainsPickUpAddress
!insert (shipment4, address6) into ShipmentContainsDeliveryAddress

!insert (shipment5, address6) into ShipmentContainsPickUpAddress
!insert (shipment5, address5) into ShipmentContainsDeliveryAddress

!insert (address5, geoLocation5) into AddressContainsGeoLocation
!insert (address6, geoLocation6) into AddressContainsGeoLocation

!insert (customer3, shipment4) into CustomerConsistsOfShipment
!insert (customer3, shipment5) into CustomerConsistsOfShipment

!insert (station2, customer3) into StationContainsCustomer

!insert (station2, shipment4) into StationShipment
!insert (station2, shipment5) into StationShipment

!insert (station2, driver3) into StationContainsDriver
```
## Generation 2 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 14 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
987 Walnut Street
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 51.5074 Lon: -0.1278 for address: 654 Willow Drive
```

# Generation 3
```
!new Driver('driver4')
!driver4.id := 'D004'
!driver4.name := 'George King'

!new Shipment('shipment6')
!shipment6.id := 'S006'
!shipment6.status := #NEW

!new Shipment('shipment7')
!shipment7.id := 'S007'
!shipment7.status := #UNDERWAY

!new Address('address7')
!address7.text := '222 Cedar Lane'

!new Address('address8')
!address8.text := '333 Birch Boulevard'

!new GeoLocation('geoLocation7')
!geoLocation7.latitude := 35.6895
!geoLocation7.longitude := 139.6917

!new GeoLocation('geoLocation8')
!geoLocation8.latitude := -33.8688
!geoLocation8.longitude := 151.2093

!new Customer('customer4')
!customer4.id := 'C004'
!customer4.name := 'Hannah Bell'
!customer4.twitterUserName := '@hannah_bell'

!new Station('station3')

!insert (driver4, shipment7) into DriverShipment

!insert (shipment6, address7) into ShipmentContainsPickUpAddress
!insert (shipment6, address8) into ShipmentContainsDeliveryAddress

!insert (shipment7, address8) into ShipmentContainsPickUpAddress
!insert (shipment7, address7) into ShipmentContainsDeliveryAddress

!insert (address7, geoLocation7) into AddressContainsGeoLocation
!insert (address8, geoLocation8) into AddressContainsGeoLocation

!insert (customer4, shipment6) into CustomerConsistsOfShipment
!insert (customer4, shipment7) into CustomerConsistsOfShipment

!insert (station3, customer4) into StationContainsCustomer

!insert (station3, shipment6) into StationShipment
!insert (station3, shipment7) into StationShipment

!insert (station3, driver4) into StationContainsDriver
```
## Generation 3 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 0 | 2 | 0.00% |
| Lat/Lon (out of valid addresses) | 2 | 2 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 35.6895 Lon: 139.6917 for address: 222 Cedar Lane
```
```
Invalid Lat: -33.8688 Lon: 151.2093 for address: 333 Birch Boulevard
```

# Generation 4
```
!new Driver('driver5')
!driver5.id := 'D005'
!driver5.name := 'Isla Becker'

!new Shipment('shipment8')
!shipment8.id := 'S008'
!shipment8.status := #DELIVERED

!new Shipment('shipment9')
!shipment9.id := 'S009'
!shipment9.status := #NEW

!new Address('address9')
!address9.text := '111 Spruce Way'

!new Address('address10')
!address10.text := '444 Palm Ave'

!new GeoLocation('geoLocation9')
!geoLocation9.latitude := 52.5200
!geoLocation9.longitude := 13.4050

!new GeoLocation('geoLocation10')
!geoLocation10.latitude := 55.7558
!geoLocation10.longitude := 37.6173

!new Customer('customer5')
!customer5.id := 'C005'
!customer5.name := 'Jackie Neal'
!customer5.twitterUserName := '@jackie_neal'

!new Station('station4')

!insert (driver5, shipment8) into DriverShipment
!insert (driver5, shipment9) into DriverShipment

!insert (shipment8, address9) into ShipmentContainsPickUpAddress
!insert (shipment8, address10) into ShipmentContainsDeliveryAddress

!insert (shipment9, address10) into ShipmentContainsPickUpAddress
!insert (shipment9, address9) into ShipmentContainsDeliveryAddress

!insert (address9, geoLocation9) into AddressContainsGeoLocation
!insert (address10, geoLocation10) into AddressContainsGeoLocation

!insert (customer5, shipment8) into CustomerConsistsOfShipment
!insert (customer5, shipment9) into CustomerConsistsOfShipment

!insert (station4, customer5) into StationContainsCustomer

!insert (station4, shipment8) into StationShipment
!insert (station4, shipment9) into StationShipment

!insert (station4, driver5) into StationContainsDriver
```
## Generation 4 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 38 | 0.00% |
| Multiplicities Errors | 0 | 14 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 0 | 2 | 0.00% |
| Lat/Lon (out of valid addresses) | 2 | 2 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 55.7558 Lon: 37.6173 for address: 444 Palm Ave
```
```
Invalid Lat: 52.52 Lon: 13.405 for address: 111 Spruce Way
```

# Generation 5
```
!new Driver('driver6')
!driver6.id := 'D006'
!driver6.name := 'Liam Harris'

!new Shipment('shipment10')
!shipment10.id := 'S010'
!shipment10.status := #ASSIGNED

!new Address('address11')
!address11.text := '555 River Road'

!new Address('address12')
!address12.text := '666 Lake View Street'

!new GeoLocation('geoLocation11')
!geoLocation11.latitude := 41.8781
!geoLocation11.longitude := -87.6298

!new GeoLocation('geoLocation12')
!geoLocation12.latitude := 34.6937
!geoLocation12.longitude := 135.5022

!new Customer('customer6')
!customer6.id := 'C006'
!customer6.name := 'Mona Evans'
!customer6.twitterUserName := '@mona_evans'

!new Station('station5')

!insert (driver6, shipment10) into DriverShipment

!insert (shipment10, address11) into ShipmentContainsPickUpAddress
!insert (shipment10, address12) into ShipmentContainsDeliveryAddress

!insert (address11, geoLocation11) into AddressContainsGeoLocation
!insert (address12, geoLocation12) into AddressContainsGeoLocation

!insert (customer6, shipment10) into CustomerConsistsOfShipment

!insert (station5, customer6) into StationContainsCustomer

!insert (station5, shipment10) into StationShipment

!insert (station5, driver6) into StationContainsDriver
```
## Generation 5 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 30 | 0.00% |
| Multiplicities Errors | 0 | 9 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
555 River Road
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 34.6937 Lon: 135.5022 for address: 666 Lake View Street
```

# Generation 6
```
!new Driver('driver7')
!driver7.id := 'D007'
!driver7.name := 'Nora Johnson'

!new Shipment('shipment11')
!shipment11.id := 'S011'
!shipment11.status := #NEW

!new Shipment('shipment12')
!shipment12.id := 'S012'
!shipment12.status := #DELIVERED

!new Address('address13')
!address13.text := '777 Ocean Drive'

!new Address('address14')
!address14.text := '888 Forest Circle'

!new GeoLocation('geoLocation13')
!geoLocation13.latitude := -23.5505
!geoLocation13.longitude := -46.6333

!new GeoLocation('geoLocation14')
!geoLocation14.latitude := 19.4326
!geoLocation14.longitude := -99.1332

!new Customer('customer7')
!customer7.id := 'C007'
!customer7.name := 'Olivia Martin'
!customer7.twitterUserName := '@olivia_martin'

!new Station('station6')

!insert (driver7, shipment11) into DriverShipment

!insert (shipment11, address13) into ShipmentContainsPickUpAddress
!insert (shipment11, address14) into ShipmentContainsDeliveryAddress

!insert (shipment12, address14) into ShipmentContainsPickUpAddress
!insert (shipment12, address13) into ShipmentContainsDeliveryAddress

!insert (address13, geoLocation13) into AddressContainsGeoLocation
!insert (address14, geoLocation14) into AddressContainsGeoLocation

!insert (customer7, shipment11) into CustomerConsistsOfShipment
!insert (customer7, shipment12) into CustomerConsistsOfShipment

!insert (station6, customer7) into StationContainsCustomer

!insert (station6, shipment11) into StationShipment
!insert (station6, shipment12) into StationShipment

!insert (station6, driver7) into StationContainsDriver
```
## Generation 6 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 0 | 2 | 0.00% |
| Lat/Lon (out of valid addresses) | 2 | 2 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: -23.5505 Lon: -46.6333 for address: 777 Ocean Drive
```
```
Invalid Lat: 19.4326 Lon: -99.1332 for address: 888 Forest Circle
```

# Generation 7
```
!new Driver('driver8')
!driver8.id := 'D008'
!driver8.name := 'Paul Martinez'

!new Shipment('shipment13')
!shipment13.id := 'S013'
!shipment13.status := #UNDERWAY

!new Shipment('shipment14')
!shipment14.id := 'S014'
!shipment14.status := #NEW

!new Address('address15')
!address15.text := '999 Sunset Boulevard'

!new Address('address16')
!address16.text := '1010 Mountain Path'

!new GeoLocation('geoLocation15')
!geoLocation15.latitude := 37.7749
!geoLocation15.longitude := -122.4194

!new GeoLocation('geoLocation16')
!geoLocation16.latitude := 51.1657
!geoLocation16.longitude := 10.4515

!new Customer('customer8')
!customer8.id := 'C008'
!customer8.name := 'Quinn Perez'
!customer8.twitterUserName := '@quinn_p'

!new Station('station7')

!insert (driver8, shipment13) into DriverShipment

!insert (shipment13, address15) into ShipmentContainsPickUpAddress
!insert (shipment13, address16) into ShipmentContainsDeliveryAddress

!insert (shipment14, address16) into ShipmentContainsPickUpAddress
!insert (shipment14, address15) into ShipmentContainsDeliveryAddress

!insert (address15, geoLocation15) into AddressContainsGeoLocation
!insert (address16, geoLocation16) into AddressContainsGeoLocation

!insert (customer8, shipment13) into CustomerConsistsOfShipment
!insert (customer8, shipment14) into CustomerConsistsOfShipment

!insert (station7, customer8) into StationContainsCustomer

!insert (station7, shipment13) into StationShipment
!insert (station7, shipment14) into StationShipment

!insert (station7, driver8) into StationContainsDriver
```
## Generation 7 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
1010 Mountain Path
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 37.7749 Lon: -122.4194 for address: 999 Sunset Boulevard
```

# Generation 8
```
!new Driver('driver9')
!driver9.id := 'D009'
!driver9.name := 'Rachel Brooks'

!new Shipment('shipment15')
!shipment15.id := 'S015'
!shipment15.status := #ASSIGNED

!new Address('address17')
!address17.text := '2020 Broadway Street'

!new Address('address18')
!address18.text := '3030 Hilltop Terrace'

!new GeoLocation('geoLocation17')
!geoLocation17.latitude := 60.1699
!geoLocation17.longitude := 24.9384

!new GeoLocation('geoLocation18')
!geoLocation18.latitude := 35.6895
!geoLocation18.longitude := 139.6917

!new Customer('customer9')
!customer9.id := 'C009'
!customer9.name := 'Sam Taylor'
!customer9.twitterUserName := '@sam_taylor'

!new Station('station8')

!insert (driver9, shipment15) into DriverShipment

!insert (shipment15, address17) into ShipmentContainsPickUpAddress
!insert (shipment15, address18) into ShipmentContainsDeliveryAddress

!insert (address17, geoLocation17) into AddressContainsGeoLocation
!insert (address18, geoLocation18) into AddressContainsGeoLocation

!insert (customer9, shipment15) into CustomerConsistsOfShipment

!insert (station8, customer9) into StationContainsCustomer

!insert (station8, shipment15) into StationShipment

!insert (station8, driver9) into StationContainsDriver
```
## Generation 8 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 30 | 0.00% |
| Multiplicities Errors | 0 | 9 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 2 | 2 | 100.00% |
| Lat/Lon (out of valid addresses) | 0 | 0 | 0.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
2020 Broadway Street
```
```
3030 Hilltop Terrace
```

# Generation 9
```
!new Driver('driver10')
!driver10.id := 'D010'
!driver10.name := 'Taylor Scott'

!new Shipment('shipment16')
!shipment16.id := 'S016'
!shipment16.status := #DELIVERED

!new Shipment('shipment17')
!shipment17.id := 'S017'
!shipment17.status := #NEW

!new Address('address19')
!address19.text := '4040 Maple Leaf Drive'

!new Address('address20')
!address20.text := '5050 Crescent Lane'

!new GeoLocation('geoLocation19')
!geoLocation19.latitude := 59.9343
!geoLocation19.longitude := 30.3351

!new GeoLocation('geoLocation20')
!geoLocation20.latitude := 31.2304
!geoLocation20.longitude := 121.4737

!new Customer('customer10')
!customer10.id := 'C010'
!customer10.name := 'Vera Johnson'
!customer10.twitterUserName := '@ver_j'

!new Station('station9')

!insert (driver10, shipment16) into DriverShipment

!insert (shipment16, address19) into ShipmentContainsPickUpAddress
!insert (shipment16, address20) into ShipmentContainsDeliveryAddress

!insert (shipment17, address20) into ShipmentContainsPickUpAddress
!insert (shipment17, address19) into ShipmentContainsDeliveryAddress

!insert (address19, geoLocation19) into AddressContainsGeoLocation
!insert (address20, geoLocation20) into AddressContainsGeoLocation

!insert (customer10, shipment16) into CustomerConsistsOfShipment
!insert (customer10, shipment17) into CustomerConsistsOfShipment

!insert (station9, customer10) into StationContainsCustomer

!insert (station9, shipment16) into StationShipment
!insert (station9, shipment17) into StationShipment

!insert (station9, driver10) into StationContainsDriver
```
## Generation 9 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
5050 Crescent Lane
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 59.9343 Lon: 30.3351 for address: 4040 Maple Leaf Drive
```

# Generation 10
```
!new Driver('driver11')
!driver11.id := 'D011'
!driver11.name := 'Isaac Newton'

!new Shipment('shipment18')
!shipment18.id := 'S018'
!shipment18.status := #ASSIGNED

!new Shipment('shipment19')
!shipment19.id := 'S019'
!shipment19.status := #UNDERWAY

!new Address('address21')
!address21.text := '6060 Horizon Ridge'

!new Address('address22')
!address22.text := '7070 Valley Road'

!new GeoLocation('geoLocation21')
!geoLocation21.latitude := 48.8566
!geoLocation21.longitude := 2.3522

!new GeoLocation('geoLocation22')
!geoLocation22.latitude := -34.6037
!geoLocation22.longitude := -58.3816

!new Customer('customer11')
!customer11.id := 'C011'
!customer11.name := 'Nina Hart'
!customer11.twitterUserName := '@nina_hart'

!new Station('station10')

!insert (driver11, shipment18) into DriverShipment

!insert (shipment18, address21) into ShipmentContainsPickUpAddress
!insert (shipment18, address22) into ShipmentContainsDeliveryAddress

!insert (shipment19, address22) into ShipmentContainsPickUpAddress
!insert (shipment19, address21) into ShipmentContainsDeliveryAddress

!insert (address21, geoLocation21) into AddressContainsGeoLocation
!insert (address22, geoLocation22) into AddressContainsGeoLocation

!insert (customer11, shipment18) into CustomerConsistsOfShipment
!insert (customer11, shipment19) into CustomerConsistsOfShipment

!insert (station10, customer11) into StationContainsCustomer

!insert (station10, shipment18) into StationShipment
!insert (station10, shipment19) into StationShipment

!insert (station10, driver11) into StationContainsDriver
```
## Generation 10 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 2 | 2 | 100.00% |
| Lat/Lon (out of valid addresses) | 0 | 0 | 0.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
6060 Horizon Ridge
```
```
7070 Valley Road
```

# Generation 11
```
!new Driver('driver12')
!driver12.id := 'D012'
!driver12.name := 'Olivia Reed'

!new Shipment('shipment20')
!shipment20.id := 'S020'
!shipment20.status := #NEW

!new Shipment('shipment21')
!shipment21.id := 'S021'
!shipment21.status := #DELIVERED

!new Address('address23')
!address23.text := '8080 Seaside Avenue'

!new Address('address24')
!address24.text := '9090 Highland Road'

!new GeoLocation('geoLocation23')
!geoLocation23.latitude := 25.276987
!geoLocation23.longitude := 55.296249

!new GeoLocation('geoLocation24')
!geoLocation24.latitude := 1.352083
!geoLocation24.longitude := 103.819836

!new Customer('customer12')
!customer12.id := 'C012'
!customer12.name := 'Patrick Lane'
!customer12.twitterUserName := '@patrick_lane'

!new Station('station11')

!insert (driver12, shipment20) into DriverShipment

!insert (shipment20, address23) into ShipmentContainsPickUpAddress
!insert (shipment20, address24) into ShipmentContainsDeliveryAddress

!insert (shipment21, address24) into ShipmentContainsPickUpAddress
!insert (shipment21, address23) into ShipmentContainsDeliveryAddress

!insert (address23, geoLocation23) into AddressContainsGeoLocation
!insert (address24, geoLocation24) into AddressContainsGeoLocation

!insert (customer12, shipment20) into CustomerConsistsOfShipment
!insert (customer12, shipment21) into CustomerConsistsOfShipment

!insert (station11, customer12) into StationContainsCustomer

!insert (station11, shipment20) into StationShipment
!insert (station11, shipment21) into StationShipment

!insert (station11, driver12) into StationContainsDriver
```
## Generation 11 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 2 | 2 | 100.00% |
| Lat/Lon (out of valid addresses) | 0 | 0 | 0.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
8080 Seaside Avenue
```
```
9090 Highland Road
```

# Generation 12
```
!new Driver('driver13')
!driver13.id := 'D013'
!driver13.name := 'Emily Carter'

!new Shipment('shipment22')
!shipment22.id := 'S022'
!shipment22.status := #UNDERWAY

!new Address('address25')
!address25.text := '1111 Autumn Leaves Street'

!new Address('address26')
!address26.text := '2222 Meadow Lane'

!new GeoLocation('geoLocation25')
!geoLocation25.latitude := 40.730610
!geoLocation25.longitude := -73.935242

!new GeoLocation('geoLocation26')
!geoLocation26.latitude := 51.509865
!geoLocation26.longitude := -0.118092

!new Customer('customer13')
!customer13.id := 'C013'
!customer13.name := 'Sophia Green'
!customer13.twitterUserName := '@sophia_green'

!new Station('station12')

!insert (driver13, shipment22) into DriverShipment

!insert (shipment22, address25) into ShipmentContainsPickUpAddress
!insert (shipment22, address26) into ShipmentContainsDeliveryAddress

!insert (address25, geoLocation25) into AddressContainsGeoLocation
!insert (address26, geoLocation26) into AddressContainsGeoLocation

!insert (customer13, shipment22) into CustomerConsistsOfShipment

!insert (station12, customer13) into StationContainsCustomer

!insert (station12, shipment22) into StationShipment

!insert (station12, driver13) into StationContainsDriver
```
## Generation 12 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 30 | 0.00% |
| Multiplicities Errors | 0 | 9 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 2 | 2 | 100.00% |
| Lat/Lon (out of valid addresses) | 0 | 0 | 0.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
1111 Autumn Leaves Street
```
```
2222 Meadow Lane
```

# Generation 13
```
!new Driver('driver14')
!driver14.id := 'D014'
!driver14.name := 'Thomas Wright'

!new Shipment('shipment23')
!shipment23.id := 'S023'
!shipment23.status := #NEW

!new Shipment('shipment24')
!shipment24.id := 'S024'
!shipment24.status := #ASSIGNED

!new Address('address27')
!address27.text := '3333 River Bend Road'

!new Address('address28')
!address28.text := '4444 Ocean Breeze Drive'

!new GeoLocation('geoLocation27')
!geoLocation27.latitude := 35.6710
!geoLocation27.longitude := 139.7645

!new GeoLocation('geoLocation28')
!geoLocation28.latitude := 55.7558
!geoLocation28.longitude := 37.6173

!new Customer('customer14')
!customer14.id := 'C014'
!customer14.name := 'Lucas Brown'
!customer14.twitterUserName := '@lucas_brown'

!new Station('station13')

!insert (driver14, shipment24) into DriverShipment

!insert (shipment23, address27) into ShipmentContainsPickUpAddress
!insert (shipment23, address28) into ShipmentContainsDeliveryAddress

!insert (shipment24, address28) into ShipmentContainsPickUpAddress
!insert (shipment24, address27) into ShipmentContainsDeliveryAddress

!insert (address27, geoLocation27) into AddressContainsGeoLocation
!insert (address28, geoLocation28) into AddressContainsGeoLocation

!insert (customer14, shipment23) into CustomerConsistsOfShipment
!insert (customer14, shipment24) into CustomerConsistsOfShipment

!insert (station13, customer14) into StationContainsCustomer

!insert (station13, shipment23) into StationShipment
!insert (station13, shipment24) into StationShipment

!insert (station13, driver14) into StationContainsDriver
```
## Generation 13 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
3333 River Bend Road
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 55.7558 Lon: 37.6173 for address: 4444 Ocean Breeze Drive
```

# Generation 14
```
!new Driver('driver15')
!driver15.id := 'D015'
!driver15.name := 'Zara Cooper'

!new Shipment('shipment25')
!shipment25.id := 'S025'
!shipment25.status := #DELIVERED

!new Address('address29')
!address29.text := '5555 Rainbow Bridge Lane'

!new Address('address30')
!address30.text := '6666 Sunset Court'

!new GeoLocation('geoLocation29')
!geoLocation29.latitude := 49.2827
!geoLocation29.longitude := -123.1207

!new GeoLocation('geoLocation30')
!geoLocation30.latitude := 35.6895
!geoLocation30.longitude := 139.6917

!new Customer('customer15')
!customer15.id := 'C015'
!customer15.name := 'Nolan Turner'
!customer15.twitterUserName := '@nolan_turner'

!new Station('station14')

!insert (driver15, shipment25) into DriverShipment

!insert (shipment25, address29) into ShipmentContainsPickUpAddress
!insert (shipment25, address30) into ShipmentContainsDeliveryAddress

!insert (address29, geoLocation29) into AddressContainsGeoLocation
!insert (address30, geoLocation30) into AddressContainsGeoLocation

!insert (customer15, shipment25) into CustomerConsistsOfShipment

!insert (station14, customer15) into StationContainsCustomer

!insert (station14, shipment25) into StationShipment

!insert (station14, driver15) into StationContainsDriver
```
## Generation 14 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 30 | 0.00% |
| Multiplicities Errors | 0 | 9 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
5555 Rainbow Bridge Lane
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 35.6895 Lon: 139.6917 for address: 6666 Sunset Court
```

# Generation 15
```
!new Driver('driver16')
!driver16.id := 'D016'
!driver16.name := 'Ethan Clark'

!new Shipment('shipment26')
!shipment26.id := 'S026'
!shipment26.status := #ASSIGNED

!new Shipment('shipment27')
!shipment27.id := 'S027'
!shipment27.status := #UNDERWAY

!new Address('address31')
!address31.text := '7777 Pine Meadow Drive'

!new Address('address32')
!address32.text := '8888 Birchwood Avenue'

!new GeoLocation('geoLocation31')
!geoLocation31.latitude := 52.3676
!geoLocation31.longitude := 4.9041

!new GeoLocation('geoLocation32')
!geoLocation32.latitude := 41.9028
!geoLocation32.longitude := 12.4964

!new Customer('customer16')
!customer16.id := 'C016'
!customer16.name := 'Avery Lee'
!customer16.twitterUserName := '@avery_lee'

!new Station('station15')

!insert (driver16, shipment27) into DriverShipment

!insert (shipment26, address31) into ShipmentContainsPickUpAddress
!insert (shipment26, address32) into ShipmentContainsDeliveryAddress

!insert (shipment27, address32) into ShipmentContainsPickUpAddress
!insert (shipment27, address31) into ShipmentContainsDeliveryAddress

!insert (address31, geoLocation31) into AddressContainsGeoLocation
!insert (address32, geoLocation32) into AddressContainsGeoLocation

!insert (customer16, shipment26) into CustomerConsistsOfShipment
!insert (customer16, shipment27) into CustomerConsistsOfShipment

!insert (station15, customer16) into StationContainsCustomer

!insert (station15, shipment26) into StationShipment
!insert (station15, shipment27) into StationShipment

!insert (station15, driver16) into StationContainsDriver
```
## Generation 15 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 2 | 2 | 100.00% |
| Lat/Lon (out of valid addresses) | 0 | 0 | 0.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
7777 Pine Meadow Drive
```
```
8888 Birchwood Avenue
```

# Generation 16
```
!new Driver('driver17')
!driver17.id := 'D017'
!driver17.name := 'Sophia Anderson'

!new Shipment('shipment28')
!shipment28.id := 'S028'
!shipment28.status := #NEW

!new Shipment('shipment29')
!shipment29.id := 'S029'
!shipment29.status := #DELIVERED

!new Address('address33')
!address33.text := '9999 Sandy Beach Path'

!new Address('address34')
!address34.text := '1010 Desert Boulevard'

!new GeoLocation('geoLocation33')
!geoLocation33.latitude := 40.4168
!geoLocation33.longitude := -3.7038

!new GeoLocation('geoLocation34')
!geoLocation34.latitude := 55.7558
!geoLocation34.longitude := 37.6173

!new Customer('customer17')
!customer17.id := 'C017'
!customer17.name := 'Liam Walker'
!customer17.twitterUserName := '@liam_walker'

!new Station('station16')

!insert (driver17, shipment28) into DriverShipment

!insert (shipment28, address33) into ShipmentContainsPickUpAddress
!insert (shipment28, address34) into ShipmentContainsDeliveryAddress

!insert (shipment29, address34) into ShipmentContainsPickUpAddress
!insert (shipment29, address33) into ShipmentContainsDeliveryAddress

!insert (address33, geoLocation33) into AddressContainsGeoLocation
!insert (address34, geoLocation34) into AddressContainsGeoLocation

!insert (customer17, shipment28) into CustomerConsistsOfShipment
!insert (customer17, shipment29) into CustomerConsistsOfShipment

!insert (station16, customer17) into StationContainsCustomer

!insert (station16, shipment28) into StationShipment
!insert (station16, shipment29) into StationShipment

!insert (station16, driver17) into StationContainsDriver
```
## Generation 16 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
9999 Sandy Beach Path
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 55.7558 Lon: 37.6173 for address: 1010 Desert Boulevard
```

# Generation 17
```
!new Driver('driver18')
!driver18.id := 'D018'
!driver18.name := 'James Thompson'

!new Shipment('shipment30')
!shipment30.id := 'S030'
!shipment30.status := #NEW

!new Shipment('shipment31')
!shipment31.id := 'S031'
!shipment31.status := #ASSIGNED

!new Address('address35')
!address35.text := '1212 Cliff Edge Parkway'

!new Address('address36')
!address36.text := '1313 Mountain Pass Boulevard'

!new GeoLocation('geoLocation35')
!geoLocation35.latitude := 13.7563
!geoLocation35.longitude := 100.5018

!new GeoLocation('geoLocation36')
!geoLocation36.latitude := -33.4489
!geoLocation36.longitude := -70.6693

!new Customer('customer18')
!customer18.id := 'C018'
!customer18.name := 'Emma Hall'
!customer18.twitterUserName := '@emma_hall'

!new Station('station17')

!insert (driver18, shipment31) into DriverShipment

!insert (shipment30, address35) into ShipmentContainsPickUpAddress
!insert (shipment30, address36) into ShipmentContainsDeliveryAddress

!insert (shipment31, address36) into ShipmentContainsPickUpAddress
!insert (shipment31, address35) into ShipmentContainsDeliveryAddress

!insert (address35, geoLocation35) into AddressContainsGeoLocation
!insert (address36, geoLocation36) into AddressContainsGeoLocation

!insert (customer18, shipment30) into CustomerConsistsOfShipment
!insert (customer18, shipment31) into CustomerConsistsOfShipment

!insert (station17, customer18) into StationContainsCustomer

!insert (station17, shipment30) into StationShipment
!insert (station17, shipment31) into StationShipment

!insert (station17, driver18) into StationContainsDriver
```
## Generation 17 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 2 | 2 | 100.00% |
| Lat/Lon (out of valid addresses) | 0 | 0 | 0.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
1212 Cliff Edge Parkway
```
```
1313 Mountain Pass Boulevard
```

# Generation 18
```
!new Driver('driver19')
!driver19.id := 'D019'
!driver19.name := 'Amelia Turner'

!new Shipment('shipment32')
!shipment32.id := 'S032'
!shipment32.status := #NEW

!new Shipment('shipment33')
!shipment33.id := 'S033'
!shipment33.status := #UNDERWAY

!new Address('address37')
!address37.text := '1414 Sunflower Court'

!new Address('address38')
!address38.text := '1515 Snowy Peak Avenue'

!new GeoLocation('geoLocation37')
!geoLocation37.latitude := 59.3293
!geoLocation37.longitude := 18.0686

!new GeoLocation('geoLocation38')
!geoLocation38.latitude := 35.6762
!geoLocation38.longitude := 139.6503

!new Customer('customer19')
!customer19.id := 'C019'
!customer19.name := 'Jack Wilson'
!customer19.twitterUserName := '@jack_wilson'

!new Station('station18')

!insert (driver19, shipment32) into DriverShipment

!insert (shipment32, address37) into ShipmentContainsPickUpAddress
!insert (shipment32, address38) into ShipmentContainsDeliveryAddress

!insert (shipment33, address38) into ShipmentContainsPickUpAddress
!insert (shipment33, address37) into ShipmentContainsDeliveryAddress

!insert (address37, geoLocation37) into AddressContainsGeoLocation
!insert (address38, geoLocation38) into AddressContainsGeoLocation

!insert (customer19, shipment32) into CustomerConsistsOfShipment
!insert (customer19, shipment33) into CustomerConsistsOfShipment

!insert (station18, customer19) into StationContainsCustomer

!insert (station18, shipment32) into StationShipment
!insert (station18, shipment33) into StationShipment

!insert (station18, driver19) into StationContainsDriver
```
## Generation 18 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
1515 Snowy Peak Avenue
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 59.3293 Lon: 18.0686 for address: 1414 Sunflower Court
```

# Generation 19
```
!new Driver('driver20')
!driver20.id := 'D020'
!driver20.name := 'Oliver Garcia'

!new Shipment('shipment34')
!shipment34.id := 'S034'
!shipment34.status := #DELIVERED

!new Address('address39')
!address39.text := '1616 Emerald Glade'

!new Address('address40')
!address40.text := '1717 Mystic Falls Way'

!new GeoLocation('geoLocation39')
!geoLocation39.latitude := 45.4215
!geoLocation39.longitude := -75.6972

!new GeoLocation('geoLocation40')
!geoLocation40.latitude := 53.3498
!geoLocation40.longitude := -6.2603

!new Customer('customer20')
!customer20.id := 'C020'
!customer20.name := 'Grace Martinez'
!customer20.twitterUserName := '@grace_martinez'

!new Station('station19')

!insert (driver20, shipment34) into DriverShipment

!insert (shipment34, address39) into ShipmentContainsPickUpAddress
!insert (shipment34, address40) into ShipmentContainsDeliveryAddress

!insert (address39, geoLocation39) into AddressContainsGeoLocation
!insert (address40, geoLocation40) into AddressContainsGeoLocation

!insert (customer20, shipment34) into CustomerConsistsOfShipment

!insert (station19, customer20) into StationContainsCustomer

!insert (station19, shipment34) into StationShipment

!insert (station19, driver20) into StationContainsDriver
```
## Generation 19 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 30 | 0.00% |
| Multiplicities Errors | 0 | 9 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
1717 Mystic Falls Way
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 45.4215 Lon: -75.6972 for address: 1616 Emerald Glade
```

# Generation 20
```
!new Driver('driver21')
!driver21.id := 'D021'
!driver21.name := 'Sophia Roberts'

!new Shipment('shipment35')
!shipment35.id := 'S035'
!shipment35.status := #ASSIGNED

!new Shipment('shipment36')
!shipment36.id := 'S036'
!shipment36.status := #UNDERWAY

!new Address('address41')
!address41.text := '1818 Crescent Canyon'

!new Address('address42')
!address42.text := '1919 Maplewood Drive'

!new GeoLocation('geoLocation41')
!geoLocation41.latitude := 48.2082
!geoLocation41.longitude := 16.3738

!new GeoLocation('geoLocation42')
!geoLocation42.latitude := 37.7749
!geoLocation42.longitude := -122.4194

!new Customer('customer21')
!customer21.id := 'C021'
!customer21.name := 'Ella Parker'
!customer21.twitterUserName := '@ella_parker'

!new Station('station20')

!insert (driver21, shipment35) into DriverShipment

!insert (shipment35, address41) into ShipmentContainsPickUpAddress
!insert (shipment35, address42) into ShipmentContainsDeliveryAddress

!insert (shipment36, address42) into ShipmentContainsPickUpAddress
!insert (shipment36, address41) into ShipmentContainsDeliveryAddress

!insert (address41, geoLocation41) into AddressContainsGeoLocation
!insert (address42, geoLocation42) into AddressContainsGeoLocation

!insert (customer21, shipment35) into CustomerConsistsOfShipment
!insert (customer21, shipment36) into CustomerConsistsOfShipment

!insert (station20, customer21) into StationContainsCustomer

!insert (station20, shipment35) into StationShipment
!insert (station20, shipment36) into StationShipment

!insert (station20, driver21) into StationContainsDriver
```
## Generation 20 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
1818 Crescent Canyon
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 37.7749 Lon: -122.4194 for address: 1919 Maplewood Drive
```

# Generation 21
```
!new Driver('driver22')
!driver22.id := 'D022'
!driver22.name := 'Liam Adams'

!new Shipment('shipment37')
!shipment37.id := 'S037'
!shipment37.status := #NEW

!new Shipment('shipment38')
!shipment38.id := 'S038'
!shipment38.status := #DELIVERED

!new Address('address43')
!address43.text := '2020 Elmwood Lane'

!new Address('address44')
!address44.text := '2121 Whispering Pines Path'

!new GeoLocation('geoLocation43')
!geoLocation43.latitude := 35.2271
!geoLocation43.longitude := -80.8431

!new GeoLocation('geoLocation44')
!geoLocation44.latitude := 43.651070
!geoLocation44.longitude := -79.347015

!new Customer('customer22')
!customer22.id := 'C022'
!customer22.name := 'Mia Hughes'
!customer22.twitterUserName := '@mia_hughes'

!new Station('station21')

!insert (driver22, shipment38) into DriverShipment

!insert (shipment37, address43) into ShipmentContainsPickUpAddress
!insert (shipment37, address44) into ShipmentContainsDeliveryAddress

!insert (shipment38, address44) into ShipmentContainsPickUpAddress
!insert (shipment38, address43) into ShipmentContainsDeliveryAddress

!insert (address43, geoLocation43) into AddressContainsGeoLocation
!insert (address44, geoLocation44) into AddressContainsGeoLocation

!insert (customer22, shipment37) into CustomerConsistsOfShipment
!insert (customer22, shipment38) into CustomerConsistsOfShipment

!insert (station21, customer22) into StationContainsCustomer

!insert (station21, shipment37) into StationShipment
!insert (station21, shipment38) into StationShipment

!insert (station21, driver22) into StationContainsDriver
```
## Generation 21 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
2121 Whispering Pines Path
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 35.2271 Lon: -80.8431 for address: 2020 Elmwood Lane
```

# Generation 22
```
!new Driver('driver23')
!driver23.id := 'D023'
!driver23.name := 'Noah Bennett'

!new Shipment('shipment39')
!shipment39.id := 'S039'
!shipment39.status := #UNDERWAY

!new Shipment('shipment40')
!shipment40.id := 'S040'
!shipment40.status := #ASSIGNED

!new Address('address45')
!address45.text := '2222 Pine Ridge Way'

!new Address('address46')
!address46.text := '2323 Birch Lane'

!new GeoLocation('geoLocation45')
!geoLocation45.latitude := 34.0522
!geoLocation45.longitude := -118.2437

!new GeoLocation('geoLocation46')
!geoLocation46.latitude := 40.7128
!geoLocation46.longitude := -74.0060

!new Customer('customer23')
!customer23.id := 'C023'
!customer23.name := 'Olivia Collins'
!customer23.twitterUserName := '@olivia_collins'

!new Station('station22')

!insert (driver23, shipment40) into DriverShipment

!insert (shipment39, address45) into ShipmentContainsPickUpAddress
!insert (shipment39, address46) into ShipmentContainsDeliveryAddress

!insert (shipment40, address46) into ShipmentContainsPickUpAddress
!insert (shipment40, address45) into ShipmentContainsDeliveryAddress

!insert (address45, geoLocation45) into AddressContainsGeoLocation
!insert (address46, geoLocation46) into AddressContainsGeoLocation

!insert (customer23, shipment39) into CustomerConsistsOfShipment
!insert (customer23, shipment40) into CustomerConsistsOfShipment

!insert (station22, customer23) into StationContainsCustomer

!insert (station22, shipment39) into StationShipment
!insert (station22, shipment40) into StationShipment

!insert (station22, driver23) into StationContainsDriver
```
## Generation 22 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 0 | 2 | 0.00% |
| Lat/Lon (out of valid addresses) | 2 | 2 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 34.0522 Lon: -118.2437 for address: 2222 Pine Ridge Way
```
```
Invalid Lat: 40.7128 Lon: -74.006 for address: 2323 Birch Lane
```

# Generation 23
```
!new Driver('driver24')
!driver24.id := 'D024'
!driver24.name := 'Emma Gonzalez'

!new Shipment('shipment41')
!shipment41.id := 'S041'
!shipment41.status := #NEW

!new Shipment('shipment42')
!shipment42.id := 'S042'
!shipment42.status := #UNDERWAY

!new Address('address47')
!address47.text := '2424 Oak Terrace'

!new Address('address48')
!address48.text := '2525 Cedar Avenue'

!new GeoLocation('geoLocation47')
!geoLocation47.latitude := 51.5074
!geoLocation47.longitude := -0.1278

!new GeoLocation('geoLocation48')
!geoLocation48.latitude := 48.8566
!geoLocation48.longitude := 2.3522

!new Customer('customer24')
!customer24.id := 'C024'
!customer24.name := 'Liam Morales'
!customer24.twitterUserName := '@liam_morales'

!new Station('station23')

!insert (driver24, shipment42) into DriverShipment

!insert (shipment41, address47) into ShipmentContainsPickUpAddress
!insert (shipment41, address48) into ShipmentContainsDeliveryAddress

!insert (shipment42, address48) into ShipmentContainsPickUpAddress
!insert (shipment42, address47) into ShipmentContainsDeliveryAddress

!insert (address47, geoLocation47) into AddressContainsGeoLocation
!insert (address48, geoLocation48) into AddressContainsGeoLocation

!insert (customer24, shipment41) into CustomerConsistsOfShipment
!insert (customer24, shipment42) into CustomerConsistsOfShipment

!insert (station23, customer24) into StationContainsCustomer

!insert (station23, shipment41) into StationShipment
!insert (station23, shipment42) into StationShipment

!insert (station23, driver24) into StationContainsDriver
```
## Generation 23 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
2424 Oak Terrace
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 48.8566 Lon: 2.3522 for address: 2525 Cedar Avenue
```

# Generation 24
```
!new Driver('driver25')
!driver25.id := 'D025'
!driver25.name := 'Lucas Scott'

!new Shipment('shipment43')
!shipment43.id := 'S043'
!shipment43.status := #ASSIGNED

!new Shipment('shipment44')
!shipment44.id := 'S044'
!shipment44.status := #DELIVERED

!new Address('address49')
!address49.text := '2626 Grove Street'

!new Address('address50')
!address50.text := '2727 Willow Lane'

!new GeoLocation('geoLocation49')
!geoLocation49.latitude := 55.6761
!geoLocation49.longitude := 12.5683

!new GeoLocation('geoLocation50')
!geoLocation50.latitude := 47.6062
!geoLocation50.longitude := -122.3321

!new Customer('customer25')
!customer25.id := 'C025'
!customer25.name := 'Chloe Davis'
!customer25.twitterUserName := '@chloe_davis'

!new Station('station24')

!insert (driver25, shipment43) into DriverShipment

!insert (shipment43, address49) into ShipmentContainsPickUpAddress
!insert (shipment43, address50) into ShipmentContainsDeliveryAddress

!insert (shipment44, address50) into ShipmentContainsPickUpAddress
!insert (shipment44, address49) into ShipmentContainsDeliveryAddress

!insert (address49, geoLocation49) into AddressContainsGeoLocation
!insert (address50, geoLocation50) into AddressContainsGeoLocation

!insert (customer25, shipment43) into CustomerConsistsOfShipment
!insert (customer25, shipment44) into CustomerConsistsOfShipment

!insert (station24, customer25) into StationContainsCustomer

!insert (station24, shipment43) into StationShipment
!insert (station24, shipment44) into StationShipment

!insert (station24, driver25) into StationContainsDriver
```
## Generation 24 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
2626 Grove Street
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 47.6062 Lon: -122.3321 for address: 2727 Willow Lane
```

# Generation 25
```
!new Driver('driver26')
!driver26.id := 'D026'
!driver26.name := 'Daniel Martinez'

!new Shipment('shipment45')
!shipment45.id := 'S045'
!shipment45.status := #NEW

!new Shipment('shipment46')
!shipment46.id := 'S046'
!shipment46.status := #ASSIGNED

!new Address('address51')
!address51.text := '2828 Riverbank Close'

!new Address('address52')
!address52.text := '2929 Shadow Mountain Drive'

!new GeoLocation('geoLocation51')
!geoLocation51.latitude := -37.8136
!geoLocation51.longitude := 144.9631

!new GeoLocation('geoLocation52')
!geoLocation52.latitude := 37.9838
!geoLocation52.longitude := 23.7275

!new Customer('customer26')
!customer26.id := 'C026'
!customer26.name := 'Sophia Evans'
!customer26.twitterUserName := '@sophia_evans'

!new Station('station25')

!insert (driver26, shipment46) into DriverShipment

!insert (shipment45, address51) into ShipmentContainsPickUpAddress
!insert (shipment45, address52) into ShipmentContainsDeliveryAddress

!insert (shipment46, address52) into ShipmentContainsPickUpAddress
!insert (shipment46, address51) into ShipmentContainsDeliveryAddress

!insert (address51, geoLocation51) into AddressContainsGeoLocation
!insert (address52, geoLocation52) into AddressContainsGeoLocation

!insert (customer26, shipment45) into CustomerConsistsOfShipment
!insert (customer26, shipment46) into CustomerConsistsOfShipment

!insert (station25, customer26) into StationContainsCustomer

!insert (station25, shipment45) into StationShipment
!insert (station25, shipment46) into StationShipment

!insert (station25, driver26) into StationContainsDriver
```
## Generation 25 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
2828 Riverbank Close
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 37.9838 Lon: 23.7275 for address: 2929 Shadow Mountain Drive
```

# Generation 26
```
!new Driver('driver27')
!driver27.id := 'D027'
!driver27.name := 'Benjamin Harris'

!new Shipment('shipment47')
!shipment47.id := 'S047'
!shipment47.status := #DELIVERED

!new Shipment('shipment48')
!shipment48.id := 'S048'
!shipment48.status := #UNDERWAY

!new Address('address53')
!address53.text := '3030 Maple Lane'

!new Address('address54')
!address54.text := '3131 Ocean View Drive'

!new GeoLocation('geoLocation53')
!geoLocation53.latitude := -12.0464
!geoLocation53.longitude := -77.0428

!new GeoLocation('geoLocation54')
!geoLocation54.latitude := 22.5726
!geoLocation54.longitude := 88.3639

!new Customer('customer27')
!customer27.id := 'C027'
!customer27.name := 'Grace Clark'
!customer27.twitterUserName := '@grace_clark'

!new Station('station26')

!insert (driver27, shipment48) into DriverShipment

!insert (shipment47, address53) into ShipmentContainsPickUpAddress
!insert (shipment47, address54) into ShipmentContainsDeliveryAddress

!insert (shipment48, address54) into ShipmentContainsPickUpAddress
!insert (shipment48, address53) into ShipmentContainsDeliveryAddress

!insert (address53, geoLocation53) into AddressContainsGeoLocation
!insert (address54, geoLocation54) into AddressContainsGeoLocation

!insert (customer27, shipment47) into CustomerConsistsOfShipment
!insert (customer27, shipment48) into CustomerConsistsOfShipment

!insert (station26, customer27) into StationContainsCustomer

!insert (station26, shipment47) into StationShipment
!insert (station26, shipment48) into StationShipment

!insert (station26, driver27) into StationContainsDriver
```
## Generation 26 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 0 | 2 | 0.00% |
| Lat/Lon (out of valid addresses) | 2 | 2 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: -12.0464 Lon: -77.0428 for address: 3030 Maple Lane
```
```
Invalid Lat: 22.5726 Lon: 88.3639 for address: 3131 Ocean View Drive
```

# Generation 27
```
!new Driver('driver28')
!driver28.id := 'D028'
!driver28.name := 'Emma Wilson'

!new Shipment('shipment49')
!shipment49.id := 'S049'
!shipment49.status := #ASSIGNED

!new Shipment('shipment50')
!shipment50.id := 'S050'
!shipment50.status := #NEW

!new Address('address55')
!address55.text := '3232 Forest Glen Drive'

!new Address('address56')
!address56.text := '3434 Desert Palm Avenue'

!new GeoLocation('geoLocation55')
!geoLocation55.latitude := 43.7384
!geoLocation55.longitude := 7.4246

!new GeoLocation('geoLocation56')
!geoLocation56.latitude := 55.9533
!geoLocation56.longitude := -3.1883

!new Customer('customer28')
!customer28.id := 'C028'
!customer28.name := 'William Johnson'
!customer28.twitterUserName := '@will_johnson'

!new Station('station27')

!insert (driver28, shipment49) into DriverShipment

!insert (shipment49, address55) into ShipmentContainsPickUpAddress
!insert (shipment49, address56) into ShipmentContainsDeliveryAddress

!insert (shipment50, address56) into ShipmentContainsPickUpAddress
!insert (shipment50, address55) into ShipmentContainsDeliveryAddress

!insert (address55, geoLocation55) into AddressContainsGeoLocation
!insert (address56, geoLocation56) into AddressContainsGeoLocation

!insert (customer28, shipment49) into CustomerConsistsOfShipment
!insert (customer28, shipment50) into CustomerConsistsOfShipment

!insert (station27, customer28) into StationContainsCustomer

!insert (station27, shipment49) into StationShipment
!insert (station27, shipment50) into StationShipment

!insert (station27, driver28) into StationContainsDriver
```
## Generation 27 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 2 | 2 | 100.00% |
| Lat/Lon (out of valid addresses) | 0 | 0 | 0.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
3232 Forest Glen Drive
```
```
3434 Desert Palm Avenue
```

# Generation 28
```
!new Driver('driver29')
!driver29.id := 'D029'
!driver29.name := 'Charlotte Brown'

!new Shipment('shipment51')
!shipment51.id := 'S051'
!shipment51.status := #NEW

!new Shipment('shipment52')
!shipment52.id := 'S052'
!shipment52.status := #DELIVERED

!new Address('address57')
!address57.text := '3535 Highland Meadow Circle'

!new Address('address58')
!address58.text := '3636 Golden Gate Avenue'

!new GeoLocation('geoLocation57')
!geoLocation57.latitude := 41.3851
!geoLocation57.longitude := 2.1734

!new GeoLocation('geoLocation58')
!geoLocation58.latitude := 37.7749
!geoLocation58.longitude := -122.4194

!new Customer('customer29')
!customer29.id := 'C029'
!customer29.name := 'Liam Anderson'
!customer29.twitterUserName := '@liam_anderson'

!new Station('station28')

!insert (driver29, shipment51) into DriverShipment

!insert (shipment51, address57) into ShipmentContainsPickUpAddress
!insert (shipment51, address58) into ShipmentContainsDeliveryAddress

!insert (shipment52, address58) into ShipmentContainsPickUpAddress
!insert (shipment52, address57) into ShipmentContainsDeliveryAddress

!insert (address57, geoLocation57) into AddressContainsGeoLocation
!insert (address58, geoLocation58) into AddressContainsGeoLocation

!insert (customer29, shipment51) into CustomerConsistsOfShipment
!insert (customer29, shipment52) into CustomerConsistsOfShipment

!insert (station28, customer29) into StationContainsCustomer

!insert (station28, shipment51) into StationShipment
!insert (station28, shipment52) into StationShipment

!insert (station28, driver29) into StationContainsDriver
```
## Generation 28 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
3535 Highland Meadow Circle
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 37.7749 Lon: -122.4194 for address: 3636 Golden Gate Avenue
```

# Generation 29
```
!new Driver('driver30')
!driver30.id := 'D030'
!driver30.name := 'Harper Taylor'

!new Shipment('shipment53')
!shipment53.id := 'S053'
!shipment53.status := #UNDERWAY

!new Shipment('shipment54')
!shipment54.id := 'S054'
!shipment54.status := #ASSIGNED

!new Address('address59')
!address59.text := '3737 Crystal Lake Way'

!new Address('address60')
!address60.text := '3838 Amber Ridge Drive'

!new GeoLocation('geoLocation59')
!geoLocation59.latitude := -22.9068
!geoLocation59.longitude := -43.1729

!new GeoLocation('geoLocation60')
!geoLocation60.latitude := -26.2041
!geoLocation60.longitude := 28.0473

!new Customer('customer30')
!customer30.id := 'C030'
!customer30.name := 'Ava Martinez'
!customer30.twitterUserName := '@ava_martinez'

!new Station('station29')

!insert (driver30, shipment54) into DriverShipment

!insert (shipment53, address59) into ShipmentContainsPickUpAddress
!insert (shipment53, address60) into ShipmentContainsDeliveryAddress

!insert (shipment54, address60) into ShipmentContainsPickUpAddress
!insert (shipment54, address59) into ShipmentContainsDeliveryAddress

!insert (address59, geoLocation59) into AddressContainsGeoLocation
!insert (address60, geoLocation60) into AddressContainsGeoLocation

!insert (customer30, shipment53) into CustomerConsistsOfShipment
!insert (customer30, shipment54) into CustomerConsistsOfShipment

!insert (station29, customer30) into StationContainsCustomer

!insert (station29, shipment53) into StationShipment
!insert (station29, shipment54) into StationShipment

!insert (station29, driver30) into StationContainsDriver
```
## Generation 29 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
3737 Crystal Lake Way
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: -26.2041 Lon: 28.0473 for address: 3838 Amber Ridge Drive
```

# Generation 30
```
!new Driver('driver31')
!driver31.id := 'D031'
!driver31.name := 'Ethan Moore'

!new Shipment('shipment55')
!shipment55.id := 'S055'
!shipment55.status := #DELIVERED

!new Shipment('shipment56')
!shipment56.id := 'S056'
!shipment56.status := #NEW

!new Address('address61')
!address61.text := '3939 Silverleaf Avenue'

!new Address('address62')
!address62.text := '4040 Whisper Wind Way'

!new GeoLocation('geoLocation61')
!geoLocation61.latitude := 34.6937
!geoLocation61.longitude := 135.5022

!new GeoLocation('geoLocation62')
!geoLocation62.latitude := -1.2921
!geoLocation62.longitude := 36.8219

!new Customer('customer31')
!customer31.id := 'C031'
!customer31.name := 'Mia Harris'
!customer31.twitterUserName := '@mia_harris'

!new Station('station30')

!insert (driver31, shipment55) into DriverShipment

!insert (shipment55, address61) into ShipmentContainsPickUpAddress
!insert (shipment55, address62) into ShipmentContainsDeliveryAddress

!insert (shipment56, address62) into ShipmentContainsPickUpAddress
!insert (shipment56, address61) into ShipmentContainsDeliveryAddress

!insert (address61, geoLocation61) into AddressContainsGeoLocation
!insert (address62, geoLocation62) into AddressContainsGeoLocation

!insert (customer31, shipment55) into CustomerConsistsOfShipment
!insert (customer31, shipment56) into CustomerConsistsOfShipment

!insert (station30, customer31) into StationContainsCustomer

!insert (station30, shipment55) into StationShipment
!insert (station30, shipment56) into StationShipment

!insert (station30, driver31) into StationContainsDriver
```
## Generation 30 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 1 | 1 | 100.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
4040 Whisper Wind Way
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 34.6937 Lon: 135.5022 for address: 3939 Silverleaf Avenue
```

# Summary for all generations
| Summary | Value | 
|---|---| 
| Model | GPT_4O | 
| Type | Simple | 
| System | pickupnet | 
| Number of generations | 30 | 

| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 1106 | 0.00% |
| Multiplicities Errors | 0 | 381 | 0.00% |
| Invariants Errors | 0 | 120 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 34 | 62 | 54.84% |
| Lat/Lon (out of valid addresses) | 28 | 28 | 100.00% |
| Twitter | 0 | 31 | 0.00% |

| Invalid Addresses | 
|---| 
```
789 Pine Road
```
```
456 Oak Avenue
```
```
123 Elm Street
```
```
987 Walnut Street
```
```
555 River Road
```
```
1010 Mountain Path
```
```
2020 Broadway Street
```
```
3030 Hilltop Terrace
```
```
5050 Crescent Lane
```
```
6060 Horizon Ridge
```
```
7070 Valley Road
```
```
8080 Seaside Avenue
```
```
9090 Highland Road
```
```
1111 Autumn Leaves Street
```
```
2222 Meadow Lane
```
```
3333 River Bend Road
```
```
5555 Rainbow Bridge Lane
```
```
7777 Pine Meadow Drive
```
```
8888 Birchwood Avenue
```
```
9999 Sandy Beach Path
```
```
1212 Cliff Edge Parkway
```
```
1313 Mountain Pass Boulevard
```
```
1515 Snowy Peak Avenue
```
```
1717 Mystic Falls Way
```
```
1818 Crescent Canyon
```
```
2121 Whispering Pines Path
```
```
2424 Oak Terrace
```
```
2626 Grove Street
```
```
2828 Riverbank Close
```
```
3232 Forest Glen Drive
```
```
3434 Desert Palm Avenue
```
```
3535 Highland Meadow Circle
```
```
3737 Crystal Lake Way
```
```
4040 Whisper Wind Way
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: 37.7749 Lon: -122.4194 for address: 321 Maple Lane
```
```
Invalid Lat: 51.5074 Lon: -0.1278 for address: 654 Willow Drive
```
```
Invalid Lat: 35.6895 Lon: 139.6917 for address: 222 Cedar Lane
```
```
Invalid Lat: -33.8688 Lon: 151.2093 for address: 333 Birch Boulevard
```
```
Invalid Lat: 55.7558 Lon: 37.6173 for address: 444 Palm Ave
```
```
Invalid Lat: 52.52 Lon: 13.405 for address: 111 Spruce Way
```
```
Invalid Lat: 34.6937 Lon: 135.5022 for address: 666 Lake View Street
```
```
Invalid Lat: -23.5505 Lon: -46.6333 for address: 777 Ocean Drive
```
```
Invalid Lat: 19.4326 Lon: -99.1332 for address: 888 Forest Circle
```
```
Invalid Lat: 37.7749 Lon: -122.4194 for address: 999 Sunset Boulevard
```
```
Invalid Lat: 59.9343 Lon: 30.3351 for address: 4040 Maple Leaf Drive
```
```
Invalid Lat: 55.7558 Lon: 37.6173 for address: 4444 Ocean Breeze Drive
```
```
Invalid Lat: 35.6895 Lon: 139.6917 for address: 6666 Sunset Court
```
```
Invalid Lat: 55.7558 Lon: 37.6173 for address: 1010 Desert Boulevard
```
```
Invalid Lat: 59.3293 Lon: 18.0686 for address: 1414 Sunflower Court
```
```
Invalid Lat: 45.4215 Lon: -75.6972 for address: 1616 Emerald Glade
```
```
Invalid Lat: 37.7749 Lon: -122.4194 for address: 1919 Maplewood Drive
```
```
Invalid Lat: 35.2271 Lon: -80.8431 for address: 2020 Elmwood Lane
```
```
Invalid Lat: 34.0522 Lon: -118.2437 for address: 2222 Pine Ridge Way
```
```
Invalid Lat: 40.7128 Lon: -74.006 for address: 2323 Birch Lane
```
```
Invalid Lat: 48.8566 Lon: 2.3522 for address: 2525 Cedar Avenue
```
```
Invalid Lat: 47.6062 Lon: -122.3321 for address: 2727 Willow Lane
```
```
Invalid Lat: 37.9838 Lon: 23.7275 for address: 2929 Shadow Mountain Drive
```
```
Invalid Lat: -12.0464 Lon: -77.0428 for address: 3030 Maple Lane
```
```
Invalid Lat: 22.5726 Lon: 88.3639 for address: 3131 Ocean View Drive
```
```
Invalid Lat: 37.7749 Lon: -122.4194 for address: 3636 Golden Gate Avenue
```
```
Invalid Lat: -26.2041 Lon: 28.0473 for address: 3838 Amber Ridge Drive
```
```
Invalid Lat: 34.6937 Lon: 135.5022 for address: 3939 Silverleaf Avenue
```

