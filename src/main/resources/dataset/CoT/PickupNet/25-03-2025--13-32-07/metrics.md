# Generation 1
## Category baseline
```
!new Driver('driver1')
!driver1.id := 'D001'
!driver1.name := 'John Martinez'

!new Shipment('shipment1')
!shipment1.id := 'SHP001'
!shipment1.status := #ASSIGNED

!new Address('pickupAddress')
!pickupAddress.text := '123 Elm St, Springfield, IL'

!new GeoLocation('pickupGeoLocation')
!pickupGeoLocation.latitude := 39.7817
!pickupGeoLocation.longitude := -89.6501

!new Address('deliveryAddress')
!deliveryAddress.text := '789 Maple Ave, Chicago, IL'

!new GeoLocation('deliveryGeoLocation')
!deliveryGeoLocation.latitude := 41.8781
!deliveryGeoLocation.longitude := -87.6298

!new Station('station1')

!new Customer('customer1')
!customer1.id := 'CUST001'
!customer1.name := 'Alice French'
!customer1.twitterUserName := '@aliceFrenchChi'

!insert (driver1, shipment1) into DriverShipment

!insert (shipment1, pickupAddress) into ShipmentContainsPickUpAddress

!insert (shipment1, deliveryAddress) into ShipmentContainsDeliveryAddress

!insert (pickupAddress, pickupGeoLocation) into AddressContainsGeoLocation

!insert (deliveryAddress, deliveryGeoLocation) into AddressContainsGeoLocation

!insert (customer1, shipment1) into CustomerConsistsOfShipment

!insert (station1, customer1) into StationContainsCustomer

!insert (station1, shipment1) into StationShipment

!insert (station1, driver1) into StationContainsDriver
```
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
123 Elm St, Springfield, IL
```
```
789 Maple Ave, Chicago, IL
```

## Category boundary
```
!new Driver('driver3')
!driver3.id := 'DRV0001'
!driver3.name := 'Isabela Fernandez'

!new Shipment('shipment3')
!shipment3.id := 'SHIP001'
!shipment3.status := #DELIVERED

!new Address('pickupAddress3')
!pickupAddress3.text := '123 Orchard Avenue, Wellington, New Zealand'

!new GeoLocation('pickupGeoLocation3')
!pickupGeoLocation3.latitude := -41.28664
!pickupGeoLocation3.longitude := 174.77557

!new Address('deliveryAddress3')
!deliveryAddress3.text := '456 Maple Street, Toronto, Canada'

!new GeoLocation('deliveryGeoLocation3')
!deliveryGeoLocation3.latitude := 43.65107
!deliveryGeoLocation3.longitude := -79.347015

!new Station('station3')

!new Customer('customer3')
!customer3.id := 'CUST001'
!customer3.name := 'Sophia Liang'
!customer3.twitterUserName := '@sophiaL'

!insert (driver3, shipment3) into DriverShipment

!insert (shipment3, pickupAddress3) into ShipmentContainsPickUpAddress

!insert (shipment3, deliveryAddress3) into ShipmentContainsDeliveryAddress

!insert (pickupAddress3, pickupGeoLocation3) into AddressContainsGeoLocation

!insert (deliveryAddress3, deliveryGeoLocation3) into AddressContainsGeoLocation

!insert (customer3, shipment3) into CustomerConsistsOfShipment

!insert (station3, customer3) into StationContainsCustomer

!insert (station3, shipment3) into StationShipment

!insert (station3, driver3) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 30 | 0.00% |
| Multiplicities Errors | 0 | 9 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 0 | 1 | 0.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
123 Orchard Avenue, Wellington, New Zealand
```

## Category complex
```
!new Driver('driver5')
!driver5.id := 'D-001'
!driver5.name := 'Emma Johnson'

!new Driver('driver6')
!driver6.id := 'D-002'
!driver6.name := 'Lucas Garcia'

!new Customer('customer5')
!customer5.id := 'C-001'
!customer5.name := 'Olivia Chan'
!customer5.twitterUserName := '@oliviaC_global'

!new Customer('customer6')
!customer6.id := 'C-002'
!customer6.name := 'Rajesh Patel'
!customer6.twitterUserName := '@rajpatel_ekart'

!new Shipment('shipment5')
!shipment5.id := 'S-1001'
!shipment5.status := #NEW

!new Address('pickupAddress5')
!pickupAddress5.text := '123 Market St, San Francisco, CA, USA'

!new GeoLocation('pickupGeoLocation5')
!pickupGeoLocation5.latitude := 37.7749
!pickupGeoLocation5.longitude := -122.4194

!new Address('deliveryAddress5')
!deliveryAddress5.text := '456 Queen St W, Toronto, ON, Canada'

!new GeoLocation('deliveryGeoLocation5')
!deliveryGeoLocation5.latitude := 43.6510
!deliveryGeoLocation5.longitude := -79.3470

!new Shipment('shipment6')
!shipment6.id := 'S-1002'
!shipment6.status := #ASSIGNED

!new Address('pickupAddress6')
!pickupAddress6.text := '789 Park Ave, New York, NY, USA'

!new GeoLocation('pickupGeoLocation6')
!pickupGeoLocation6.latitude := 40.7128
!pickupGeoLocation6.longitude := -74.0060

!new Address('deliveryAddress6')
!deliveryAddress6.text := '65 Oxford Cir, Birmingham, UK'

!new GeoLocation('deliveryGeoLocation6')
!deliveryGeoLocation6.latitude := 52.4862
!deliveryGeoLocation6.longitude := -1.8904

!new Station('station5')

!insert (shipment5, pickupAddress5) into ShipmentContainsPickUpAddress

!insert (shipment5, deliveryAddress5) into ShipmentContainsDeliveryAddress

!insert (pickupAddress5, pickupGeoLocation5) into AddressContainsGeoLocation

!insert (deliveryAddress5, deliveryGeoLocation5) into AddressContainsGeoLocation

!insert (shipment6, pickupAddress6) into ShipmentContainsPickUpAddress

!insert (shipment6, deliveryAddress6) into ShipmentContainsDeliveryAddress

!insert (pickupAddress6, pickupGeoLocation6) into AddressContainsGeoLocation

!insert (deliveryAddress6, deliveryGeoLocation6) into AddressContainsGeoLocation

!insert (customer5, shipment5) into CustomerConsistsOfShipment

!insert (customer6, shipment6) into CustomerConsistsOfShipment

!insert (driver5, shipment6) into DriverShipment

!insert (station5, shipment5) into StationShipment

!insert (station5, shipment6) into StationShipment

!insert (station5, driver5) into StationContainsDriver

!insert (station5, driver6) into StationContainsDriver

!insert (station5, customer5) into StationContainsCustomer

!insert (station5, customer6) into StationContainsCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 58 | 0.00% |
| Multiplicities Errors | 0 | 17 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 0 | 4 | 0.00% |
| Lat/Lon (out of valid addresses) | 0 | 4 | 0.00% |
| Twitter | 0 | 2 | 0.00% |

## Category edge
```
!new Driver('driver2')
!driver2.id := 'DL001'
!driver2.name := 'Leonie Schmidt'

!new Shipment('shipment2')
!shipment2.id := 'SH7890'
!shipment2.status := #NEW

!new Address('pickupAddressEco')
!pickupAddressEco.text := 'Farmer\'s Market, Ashoka Road, Delhi, India'

!new GeoLocation('pickupGeoLocationEco')
!pickupGeoLocationEco.latitude := 28.6139
!pickupGeoLocationEco.longitude := 77.2090

!new Address('deliveryAddressEco')
!deliveryAddressEco.text := 'O\'Hare International Airport Cargo Terminal, Chicago, Illinois, USA'

!new GeoLocation('deliveryGeoLocationEco')
!deliveryGeoLocationEco.latitude := 41.9742
!deliveryGeoLocationEco.longitude := -87.9073

!new Station('station2')

!new Customer('customer2')
!customer2.id := 'CST345'
!customer2.name := 'BioGreen International Ltd.'
!customer2.twitterUserName := '@BioGreenIntl'

!insert (shipment2, pickupAddressEco) into ShipmentContainsPickUpAddress

!insert (shipment2, deliveryAddressEco) into ShipmentContainsDeliveryAddress

!insert (pickupAddressEco, pickupGeoLocationEco) into AddressContainsGeoLocation

!insert (deliveryAddressEco, deliveryGeoLocationEco) into AddressContainsGeoLocation

!insert (customer2, shipment2) into CustomerConsistsOfShipment

!insert (station2, customer2) into StationContainsCustomer

!insert (station2, shipment2) into StationShipment

!insert (station2, driver2) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 29 | 0.00% |
| Multiplicities Errors | 0 | 8 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 2 | 2 | 100.00% |
| Lat/Lon (out of valid addresses) | 0 | 0 | 0.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
O\Hare International Airport Cargo Terminal, Chicago, Illinois, USA
```
```
Farmer\s Market, Ashoka Road, Delhi, India
```

## Category invalid
```
!new Driver('driver4')
!driver4.id := 'DRV1001'
!driver4.name := 'Maria Gonzalez'

!new Shipment('shipment4')
!shipment4.id := 'SHP5001'
!shipment4.status := #DELIVERED

!new Address('pickupAddress4')
!pickupAddress4.text := '123 Market St, San Francisco, CA 94103, USA'

!new GeoLocation('geoLocation4')
!geoLocation4.latitude := 37.7749
!geoLocation4.longitude := -122.4194

!new Customer('customer4')
!customer4.id := 'CUST304'
!customer4.name := 'Emily Nguyen'
!customer4.twitterUserName := '@emily_ng'

!new Station('station4')

!insert (driver4, shipment4) into DriverShipment

!insert (shipment4, pickupAddress4) into ShipmentContainsPickUpAddress

!insert (shipment4, pickupAddress4) into ShipmentContainsDeliveryAddress

!insert (pickupAddress4, geoLocation4) into AddressContainsGeoLocation

!insert (customer4, shipment4) into CustomerConsistsOfShipment

!insert (station4, customer4) into StationContainsCustomer

!insert (station4, shipment4) into StationShipment

!insert (station4, driver4) into StationContainsDriver
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 8 | 0.00% |
| Invariants Errors (Not included on General) | 1 | 4 | 25.00% |

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (3) `Shipment::differentPickupAndDeliveryAddress': FAILED.
```

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 0 | 1 | 0.00% |
| Lat/Lon (out of valid addresses) | 0 | 1 | 0.00% |
| Twitter | 0 | 1 | 0.00% |

## Generation 1 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 171 | 0.00% |
| Multiplicities Errors | 0 | 43 | 0.00% |
| Invariants Errors | 0 | 16 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 8 | 0.00% |
| Invariants Errors (Not included on General) | 1 | 4 | 25.00% |

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (3) `Shipment::differentPickupAndDeliveryAddress': FAILED.
```

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 5 | 11 | 45.45% |
| Lat/Lon (out of valid addresses) | 0 | 6 | 0.00% |
| Twitter | 0 | 6 | 0.00% |

| Invalid Addresses | 
|---| 
```
123 Elm St, Springfield, IL
```
```
789 Maple Ave, Chicago, IL
```
```
123 Orchard Avenue, Wellington, New Zealand
```
```
O\Hare International Airport Cargo Terminal, Chicago, Illinois, USA
```
```
Farmer\s Market, Ashoka Road, Delhi, India
```

# Generation 2
## Category baseline
```
!new Driver('driver7')
!driver7.id := 'D002'
!driver7.name := 'Akira Tanaka'

!new Shipment('shipment7')
!shipment7.id := 'SHP002'
!shipment7.status := #UNDERWAY

!new Address('pickupAddress7')
!pickupAddress7.text := '15 Chome-9-1 Marunouchi, Chiyoda City, Tokyo 100-0005, Japan'

!new GeoLocation('pickupGeoLocation7')
!pickupGeoLocation7.latitude := 35.6824
!pickupGeoLocation7.longitude := 139.7661

!new Address('deliveryAddress7')
!deliveryAddress7.text := '221B Baker Street, London NW1 6XE, UK'

!new GeoLocation('deliveryGeoLocation7')
!deliveryGeoLocation7.latitude := 51.5237
!deliveryGeoLocation7.longitude := -0.1586

!new Station('station6')

!new Customer('customer7')
!customer7.id := 'CUST002'
!customer7.name := 'Emily Collins'
!customer7.twitterUserName := '@emilyLondoner'

!insert (driver7, shipment7) into DriverShipment

!insert (shipment7, pickupAddress7) into ShipmentContainsPickUpAddress

!insert (shipment7, deliveryAddress7) into ShipmentContainsDeliveryAddress

!insert (pickupAddress7, pickupGeoLocation7) into AddressContainsGeoLocation

!insert (deliveryAddress7, deliveryGeoLocation7) into AddressContainsGeoLocation

!insert (customer7, shipment7) into CustomerConsistsOfShipment

!insert (station6, customer7) into StationContainsCustomer

!insert (station6, shipment7) into StationShipment

!insert (station6, driver7) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 30 | 0.00% |
| Multiplicities Errors | 0 | 9 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 0 | 1 | 0.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
15 Chome-9-1 Marunouchi, Chiyoda City, Tokyo 100-0005, Japan
```

## Category boundary
```
!new Driver('driver8')
!driver8.id := 'DRV002'
!driver8.name := 'Ali Al-Sayed'

!new Driver('driver9')
!driver9.id := 'DRV003'
!driver9.name := 'Koji Tanaka'

!new Shipment('shipment8')
!shipment8.id := 'SHIP002'
!shipment8.status := #UNDERWAY

!new Address('pickupAddress8')
!pickupAddress8.text := '789 Olive Way, Seattle, USA'

!new GeoLocation('pickupGeoLocation8')
!pickupGeoLocation8.latitude := 47.6062
!pickupGeoLocation8.longitude := -122.3321

!new Address('deliveryAddress8')
!deliveryAddress8.text := '1010 Fifth Ave, New York, USA'

!new GeoLocation('deliveryGeoLocation8')
!deliveryGeoLocation8.latitude := 40.7128
!deliveryGeoLocation8.longitude := -74.0060

!new Station('station7')

!new Customer('customer8')
!customer8.id := 'CUST002'
!customer8.name := 'Anna Müller'
!customer8.twitterUserName := '@annamu'

!insert (driver8, shipment8) into DriverShipment

!insert (shipment8, pickupAddress8) into ShipmentContainsPickUpAddress

!insert (shipment8, deliveryAddress8) into ShipmentContainsDeliveryAddress

!insert (pickupAddress8, pickupGeoLocation8) into AddressContainsGeoLocation

!insert (deliveryAddress8, deliveryGeoLocation8) into AddressContainsGeoLocation

!insert (customer8, shipment8) into CustomerConsistsOfShipment

!insert (station7, customer8) into StationContainsCustomer

!insert (station7, shipment8) into StationShipment

!insert (station7, driver8) into StationContainsDriver

!insert (station7, driver9) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 34 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 0 | 2 | 0.00% |
| Lat/Lon (out of valid addresses) | 0 | 2 | 0.00% |
| Twitter | 0 | 1 | 0.00% |

## Category complex
```
!new Driver('driver14')
!driver14.id := 'D-101'
!driver14.name := 'Alessandro Rossi'

!new Driver('driver15')
!driver15.id := 'D-102'
!driver15.name := 'Marta Müller'

!new Driver('driver16')
!driver16.id := 'D-103'
!driver16.name := 'Nina Novak'

!new Customer('customer13')
!customer13.id := 'C-101'
!customer13.name := 'Ayşe Yılmaz'
!customer13.twitterUserName := '@ayseyil_global'

!new Customer('customer14')
!customer14.id := 'C-102'
!customer14.name := 'Carlos Gutierrez'
!customer14.twitterUserName := '@cgut_express'

!new Customer('customer15')
!customer15.id := 'C-103'
!customer15.name := 'Søren Larsen'
!customer15.twitterUserName := '@sorenlarsen_dk'

!new Shipment('shipment11')
!shipment11.id := 'S-2001'
!shipment11.status := #DELIVERED

!new Address('pickupAddress11')
!pickupAddress11.text := 'Piazza della Signoria, Florence, Italy'

!new GeoLocation('pickupGeoLocation11')
!pickupGeoLocation11.latitude := 43.7696
!pickupGeoLocation11.longitude := 11.2558

!new Address('deliveryAddress11')
!deliveryAddress11.text := 'Avenue des Champs-Élysées, Paris, France'

!new GeoLocation('deliveryGeoLocation11')
!deliveryGeoLocation11.latitude := 48.8566
!deliveryGeoLocation11.longitude := 2.3522

!new Shipment('shipment12')
!shipment12.id := 'S-2002'
!shipment12.status := #UNDERWAY

!new Address('pickupAddress12')
!pickupAddress12.text := 'Gran Via, Madrid, Spain'

!new GeoLocation('pickupGeoLocation12')
!pickupGeoLocation12.latitude := 40.4168
!pickupGeoLocation12.longitude := -3.7038

!new Address('deliveryAddress12')
!deliveryAddress12.text := 'Karl Johans Gate, Oslo, Norway'

!new GeoLocation('deliveryGeoLocation12')
!deliveryGeoLocation12.latitude := 59.9139
!deliveryGeoLocation12.longitude := 10.7522

!new Shipment('shipment13')
!shipment13.id := 'S-2003'
!shipment13.status := #NEW

!new Address('pickupAddress13')
!pickupAddress13.text := 'Nyhavn, Copenhagen, Denmark'

!new GeoLocation('pickupGeoLocation13')
!pickupGeoLocation13.latitude := 55.6761
!pickupGeoLocation13.longitude := 12.5683

!new Address('deliveryAddress13')
!deliveryAddress13.text := 'Rebagliati Street, Lima, Peru'

!new GeoLocation('deliveryGeoLocation13')
!deliveryGeoLocation13.latitude := -12.0464
!deliveryGeoLocation13.longitude := -77.0428

!new Station('station10')

!new Station('station11')

!insert (driver14, shipment11) into DriverShipment

!insert (shipment11, pickupAddress11) into ShipmentContainsPickUpAddress

!insert (shipment11, deliveryAddress11) into ShipmentContainsDeliveryAddress

!insert (pickupAddress11, pickupGeoLocation11) into AddressContainsGeoLocation

!insert (deliveryAddress11, deliveryGeoLocation11) into AddressContainsGeoLocation

!insert (customer13, shipment11) into CustomerConsistsOfShipment

!insert (station10, shipment11) into StationShipment

!insert (station10, driver14) into StationContainsDriver

!insert (station10, customer13) into StationContainsCustomer

!insert (driver15, shipment12) into DriverShipment

!insert (shipment12, pickupAddress12) into ShipmentContainsPickUpAddress

!insert (shipment12, deliveryAddress12) into ShipmentContainsDeliveryAddress

!insert (pickupAddress12, pickupGeoLocation12) into AddressContainsGeoLocation

!insert (deliveryAddress12, deliveryGeoLocation12) into AddressContainsGeoLocation

!insert (customer14, shipment12) into CustomerConsistsOfShipment

!insert (station10, shipment12) into StationShipment

!insert (station10, driver15) into StationContainsDriver

!insert (station10, customer14) into StationContainsCustomer

!insert (shipment13, pickupAddress13) into ShipmentContainsPickUpAddress

!insert (shipment13, deliveryAddress13) into ShipmentContainsDeliveryAddress

!insert (pickupAddress13, pickupGeoLocation13) into AddressContainsGeoLocation

!insert (deliveryAddress13, deliveryGeoLocation13) into AddressContainsGeoLocation

!insert (customer15, shipment13) into CustomerConsistsOfShipment

!insert (station11, shipment13) into StationShipment

!insert (station11, driver16) into StationContainsDriver

!insert (station11, customer15) into StationContainsCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 88 | 0.00% |
| Multiplicities Errors | 0 | 26 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 0 | 6 | 0.00% |
| Lat/Lon (out of valid addresses) | 0 | 6 | 0.00% |
| Twitter | 0 | 3 | 0.00% |

## Category edge
```
!new Driver('driver12')
!driver12.id := 'DL002'
!driver12.name := 'Hiroshi Tanaka'

!new Driver('driver13')
!driver13.id := 'DL003'
!driver13.name := 'Mai Nguyen'

!new Shipment('shipment10')
!shipment10.id := 'SH0567'
!shipment10.status := #UNDERWAY

!new Address('pickupAddress10')
!pickupAddress10.text := 'Hospital Warehouse, Davao City, Philippines'

!new GeoLocation('pickupGeoLocation10')
!pickupGeoLocation10.latitude := 7.1907
!pickupGeoLocation10.longitude := 125.4553

!new Address('deliveryAddress10')
!deliveryAddress10.text := 'Health Clinic, Koror, Palau'

!new GeoLocation('deliveryGeoLocation10')
!deliveryGeoLocation10.latitude := 7.3451
!deliveryGeoLocation10.longitude := 134.4790

!new Station('station9')

!new Customer('customer11')
!customer11.id := 'CST678'
!customer11.name := 'Global Aid Network'
!customer11.twitterUserName := '@GlobalAidNet'

!new Customer('customer12')
!customer12.id := 'CST999'
!customer12.name := 'Palau Medical Services'
!customer12.twitterUserName := '@PalauMed'

!insert (driver12, shipment10) into DriverShipment

!insert (shipment10, pickupAddress10) into ShipmentContainsPickUpAddress

!insert (shipment10, deliveryAddress10) into ShipmentContainsDeliveryAddress

!insert (pickupAddress10, pickupGeoLocation10) into AddressContainsGeoLocation

!insert (deliveryAddress10, deliveryGeoLocation10) into AddressContainsGeoLocation

!insert (customer11, shipment10) into CustomerConsistsOfShipment

!insert (station9, customer11) into StationContainsCustomer

!insert (station9, customer12) into StationContainsCustomer

!insert (station9, shipment10) into StationShipment

!insert (station9, driver12) into StationContainsDriver

!insert (station9, driver13) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 39 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 2 | 2 | 100.00% |
| Lat/Lon (out of valid addresses) | 0 | 0 | 0.00% |
| Twitter | 0 | 2 | 0.00% |

| Invalid Addresses | 
|---| 
```
Health Clinic, Koror, Palau
```
```
Hospital Warehouse, Davao City, Philippines
```

## Category invalid
```
!new Driver('driver10')
!driver10.id := 'DRV2002'
!driver10.name := 'Thomas White'

!new Driver('driver11')
!driver11.id := 'DRV2003'
!driver11.name := 'Sophie Taylor'

!new Shipment('shipment9')
!shipment9.id := 'SHP7003'
!shipment9.status := #NEW

!new Address('pickupAddress9')
!pickupAddress9.text := 'Haworth Farm, Moorland Rd, Haworth, BD22 8BS, UK'

!new GeoLocation('pickupGeoLocation9')
!pickupGeoLocation9.latitude := 53.8321
!pickupGeoLocation9.longitude := -1.9572

!new Address('deliveryAddress9')
!deliveryAddress9.text := 'Bolton Abbey, Skipton, BD23 6EX, UK'

!new GeoLocation('deliveryGeoLocation9')
!deliveryGeoLocation9.latitude := 53.9734
!deliveryGeoLocation9.longitude := -1.8923

!new Station('station8')

!new Customer('customer9')
!customer9.id := 'CUST601'
!customer9.name := 'George Dawson'
!customer9.twitterUserName := '@georgedw'

!new Customer('customer10')
!customer10.id := 'CUST602'
!customer10.name := 'Emma Collins'
!customer10.twitterUserName := '@emmacollins'

!insert (driver10, shipment9) into DriverShipment

!insert (shipment9, pickupAddress9) into ShipmentContainsPickUpAddress

!insert (shipment9, deliveryAddress9) into ShipmentContainsDeliveryAddress

!insert (pickupAddress9, pickupGeoLocation9) into AddressContainsGeoLocation

!insert (deliveryAddress9, deliveryGeoLocation9) into AddressContainsGeoLocation

!insert (customer9, shipment9) into CustomerConsistsOfShipment

!insert (station8, customer9) into StationContainsCustomer

!insert (station8, customer10) into StationContainsCustomer

!insert (station8, shipment9) into StationShipment

!insert (station8, driver10) into StationContainsDriver

!insert (station8, driver11) into StationContainsDriver
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 11 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 2 | 2 | 100.00% |
| Lat/Lon (out of valid addresses) | 0 | 0 | 0.00% |
| Twitter | 0 | 2 | 0.00% |

| Invalid Addresses | 
|---| 
```
Bolton Abbey, Skipton, BD23 6EX, UK
```
```
Haworth Farm, Moorland Rd, Haworth, BD22 8BS, UK
```

## Generation 2 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 230 | 0.00% |
| Multiplicities Errors | 0 | 56 | 0.00% |
| Invariants Errors | 0 | 16 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 11 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 5 | 14 | 35.71% |
| Lat/Lon (out of valid addresses) | 0 | 9 | 0.00% |
| Twitter | 0 | 9 | 0.00% |

| Invalid Addresses | 
|---| 
```
15 Chome-9-1 Marunouchi, Chiyoda City, Tokyo 100-0005, Japan
```
```
Health Clinic, Koror, Palau
```
```
Hospital Warehouse, Davao City, Philippines
```
```
Bolton Abbey, Skipton, BD23 6EX, UK
```
```
Haworth Farm, Moorland Rd, Haworth, BD22 8BS, UK
```

# Generation 3
## Category baseline
```
!new Driver('driver19')
!driver19.id := 'D003'
!driver19.name := 'Carlos Rodriguez'

!new Shipment('shipment16')
!shipment16.id := 'SHP003'
!shipment16.status := #DELIVERED

!new Shipment('shipment17')
!shipment17.id := 'SHP004'
!shipment17.status := #ASSIGNED

!new Address('pickupAddress16')
!pickupAddress16.text := 'Green Valley Farms, Route 602, Valleyfield, NM'

!new GeoLocation('pickupGeoLocation16')
!pickupGeoLocation16.latitude := 35.0088
!pickupGeoLocation16.longitude := -106.9956

!new Address('deliveryAddress16')
!deliveryAddress16.text := '215 Orchard St, Farmington, NM'

!new GeoLocation('deliveryGeoLocation16')
!deliveryGeoLocation16.latitude := 36.7281
!deliveryGeoLocation16.longitude := -108.2187

!new Address('pickupAddress17')
!pickupAddress17.text := 'Sunrise Organic Gardens, Route 850, Bloomfield, NM'

!new GeoLocation('pickupGeoLocation17')
!pickupGeoLocation17.latitude := 36.7128
!pickupGeoLocation17.longitude := -108.1579

!new Address('deliveryAddress17')
!deliveryAddress17.text := '12314 Main St, Aztec, NM'

!new GeoLocation('deliveryGeoLocation17')
!deliveryGeoLocation17.latitude := 36.8225
!deliveryGeoLocation17.longitude := -107.9929

!new Station('station14')

!new Customer('customer18')
!customer18.id := 'CUST003'
!customer18.name := 'Linda Perez'
!customer18.twitterUserName := '@perezLindaNM'

!new Customer('customer19')
!customer19.id := 'CUST004'
!customer19.name := 'Martha Thompson'
!customer19.twitterUserName := '@marthaT_green'

!insert (driver19, shipment17) into DriverShipment

!insert (shipment16, pickupAddress16) into ShipmentContainsPickUpAddress

!insert (shipment16, deliveryAddress16) into ShipmentContainsDeliveryAddress

!insert (pickupAddress16, pickupGeoLocation16) into AddressContainsGeoLocation

!insert (deliveryAddress16, deliveryGeoLocation16) into AddressContainsGeoLocation

!insert (shipment17, pickupAddress17) into ShipmentContainsPickUpAddress

!insert (shipment17, deliveryAddress17) into ShipmentContainsDeliveryAddress

!insert (pickupAddress17, pickupGeoLocation17) into AddressContainsGeoLocation

!insert (deliveryAddress17, deliveryGeoLocation17) into AddressContainsGeoLocation

!insert (customer18, shipment16) into CustomerConsistsOfShipment

!insert (customer19, shipment17) into CustomerConsistsOfShipment

!insert (station14, customer18) into StationContainsCustomer

!insert (station14, customer19) into StationContainsCustomer

!insert (station14, shipment16) into StationShipment

!insert (station14, shipment17) into StationShipment

!insert (station14, driver19) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 54 | 0.00% |
| Multiplicities Errors | 0 | 16 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 4 | 4 | 100.00% |
| Lat/Lon (out of valid addresses) | 0 | 0 | 0.00% |
| Twitter | 0 | 2 | 0.00% |

| Invalid Addresses | 
|---| 
```
Sunrise Organic Gardens, Route 850, Bloomfield, NM
```
```
Green Valley Farms, Route 602, Valleyfield, NM
```
```
12314 Main St, Aztec, NM
```
```
215 Orchard St, Farmington, NM
```

## Category boundary
```
!new Driver('driver17')
!driver17.id := 'DRV004'
!driver17.name := 'Chloe Zhang'

!new Driver('driver18')
!driver18.id := 'DRV005'
!driver18.name := 'Anwar Saeed'

!new Shipment('shipment14')
!shipment14.id := 'SHIP003'
!shipment14.status := #NEW

!new Shipment('shipment15')
!shipment15.id := 'SHIP004'
!shipment15.status := #ASSIGNED

!new Address('pickupAddress14')
!pickupAddress14.text := 'Boulevarden 23, Copenhagen, Denmark'

!new GeoLocation('pickupGeoLocation14')
!pickupGeoLocation14.latitude := 55.6761
!pickupGeoLocation14.longitude := 12.5683

!new Address('deliveryAddress14')
!deliveryAddress14.text := '123 Sakura Lane, Kyoto, Japan'

!new GeoLocation('deliveryGeoLocation14')
!deliveryGeoLocation14.latitude := 35.0116
!deliveryGeoLocation14.longitude := 135.7681

!new Address('pickupAddress15')
!pickupAddress15.text := '789 Des Voeux Road, Hong Kong'

!new GeoLocation('pickupGeoLocation15')
!pickupGeoLocation15.latitude := 22.3193
!pickupGeoLocation15.longitude := 114.1694

!new Address('deliveryAddress15')
!deliveryAddress15.text := '1600 Amphitheatre Parkway, Mountain View, USA'

!new GeoLocation('deliveryGeoLocation15')
!deliveryGeoLocation15.latitude := 37.422
!deliveryGeoLocation15.longitude := -122.084

!new Station('station12')

!new Station('station13')

!new Customer('customer16')
!customer16.id := 'CUST003'
!customer16.name := 'Lars Svensson'
!customer16.twitterUserName := '@larsven'

!new Customer('customer17')
!customer17.id := 'CUST004'
!customer17.name := 'Mina Kim'
!customer17.twitterUserName := '@minak'

!insert (shipment14, pickupAddress14) into ShipmentContainsPickUpAddress

!insert (shipment14, deliveryAddress14) into ShipmentContainsDeliveryAddress

!insert (pickupAddress14, pickupGeoLocation14) into AddressContainsGeoLocation

!insert (deliveryAddress14, deliveryGeoLocation14) into AddressContainsGeoLocation

!insert (shipment15, pickupAddress15) into ShipmentContainsPickUpAddress

!insert (shipment15, deliveryAddress15) into ShipmentContainsDeliveryAddress

!insert (pickupAddress15, pickupGeoLocation15) into AddressContainsGeoLocation

!insert (deliveryAddress15, deliveryGeoLocation15) into AddressContainsGeoLocation

!insert (customer16, shipment14) into CustomerConsistsOfShipment

!insert (customer17, shipment15) into CustomerConsistsOfShipment

!insert (station12, customer16) into StationContainsCustomer

!insert (station13, customer17) into StationContainsCustomer

!insert (station12, shipment14) into StationShipment

!insert (station13, shipment15) into StationShipment

!insert (station12, driver17) into StationContainsDriver

!insert (station13, driver18) into StationContainsDriver

!insert (driver18, shipment15) into DriverShipment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 59 | 0.00% |
| Multiplicities Errors | 0 | 17 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 3 | 4 | 75.00% |
| Lat/Lon (out of valid addresses) | 0 | 1 | 0.00% |
| Twitter | 0 | 2 | 0.00% |

| Invalid Addresses | 
|---| 
```
Boulevarden 23, Copenhagen, Denmark
```
```
789 Des Voeux Road, Hong Kong
```
```
123 Sakura Lane, Kyoto, Japan
```

## Category complex
```
!new Driver('driver22')
!driver22.id := 'D-201'
!driver22.name := 'Takashi Yamamoto'

!new Driver('driver23')
!driver23.id := 'D-202'
!driver23.name := 'Harpreet Singh'

!new Driver('driver24')
!driver24.id := 'D-203'
!driver24.name := 'Siti Nurhaliza'

!new Customer('customer23')
!customer23.id := 'C-201'
!customer23.name := 'Li Wei'
!customer23.twitterUserName := '@liwei_china'

!new Customer('customer24')
!customer24.id := 'C-202'
!customer24.name := 'Kang Min Ho'
!customer24.twitterUserName := '@minho_k'

!new Customer('customer25')
!customer25.id := 'C-203'
!customer25.name := 'Amelia Tan'
!customer25.twitterUserName := '@ameliatan_sg'

!new Shipment('shipment22')
!shipment22.id := 'S-3001'
!shipment22.status := #NEW

!new Address('pickupAddress22')
!pickupAddress22.text := 'Nanjing Road, Shanghai, China'

!new GeoLocation('pickupGeoLocation22')
!pickupGeoLocation22.latitude := 31.2304
!pickupGeoLocation22.longitude := 121.4737

!new Address('deliveryAddress22')
!deliveryAddress22.text := 'Ginza, Tokyo, Japan'

!new GeoLocation('deliveryGeoLocation22')
!deliveryGeoLocation22.latitude := 35.6895
!deliveryGeoLocation22.longitude := 139.6917

!new Shipment('shipment23')
!shipment23.id := 'S-3002'
!shipment23.status := #UNDERWAY

!new Address('pickupAddress23')
!pickupAddress23.text := 'Myeong-dong, Seoul, South Korea'

!new GeoLocation('pickupGeoLocation23')
!pickupGeoLocation23.latitude := 37.5665
!pickupGeoLocation23.longitude := 126.9780

!new Address('deliveryAddress23')
!deliveryAddress23.text := 'Connaught Place, New Delhi, India'

!new GeoLocation('deliveryGeoLocation23')
!deliveryGeoLocation23.latitude := 28.6139
!deliveryGeoLocation23.longitude := 77.2090

!new Shipment('shipment24')
!shipment24.id := 'S-3003'
!shipment24.status := #DELIVERED

!new Address('pickupAddress24')
!pickupAddress24.text := 'Bugis Junction, Singapore'

!new GeoLocation('pickupGeoLocation24')
!pickupGeoLocation24.latitude := 1.3521
!pickupGeoLocation24.longitude := 103.8198

!new Address('deliveryAddress24')
!deliveryAddress24.text := 'Pitt Street, Sydney, Australia'

!new GeoLocation('deliveryGeoLocation24')
!deliveryGeoLocation24.latitude := -33.8688
!deliveryGeoLocation24.longitude := 151.2093

!new Station('station17')

!new Station('station18')

!new Station('station19')

!insert (shipment22, pickupAddress22) into ShipmentContainsPickUpAddress

!insert (shipment22, deliveryAddress22) into ShipmentContainsDeliveryAddress

!insert (pickupAddress22, pickupGeoLocation22) into AddressContainsGeoLocation

!insert (deliveryAddress22, deliveryGeoLocation22) into AddressContainsGeoLocation

!insert (customer23, shipment22) into CustomerConsistsOfShipment

!insert (station17, shipment22) into StationShipment

!insert (station17, driver22) into StationContainsDriver

!insert (station17, customer23) into StationContainsCustomer

!insert (driver23, shipment23) into DriverShipment

!insert (shipment23, pickupAddress23) into ShipmentContainsPickUpAddress

!insert (shipment23, deliveryAddress23) into ShipmentContainsDeliveryAddress

!insert (pickupAddress23, pickupGeoLocation23) into AddressContainsGeoLocation

!insert (deliveryAddress23, deliveryGeoLocation23) into AddressContainsGeoLocation

!insert (customer24, shipment23) into CustomerConsistsOfShipment

!insert (station18, shipment23) into StationShipment

!insert (station18, driver23) into StationContainsDriver

!insert (station18, customer24) into StationContainsCustomer

!insert (driver24, shipment24) into DriverShipment

!insert (shipment24, pickupAddress24) into ShipmentContainsPickUpAddress

!insert (shipment24, deliveryAddress24) into ShipmentContainsDeliveryAddress

!insert (pickupAddress24, pickupGeoLocation24) into AddressContainsGeoLocation

!insert (deliveryAddress24, deliveryGeoLocation24) into AddressContainsGeoLocation

!insert (customer25, shipment24) into CustomerConsistsOfShipment

!insert (station19, shipment24) into StationShipment

!insert (station19, driver24) into StationContainsDriver

!insert (station19, customer25) into StationContainsCustomer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 89 | 0.00% |
| Multiplicities Errors | 0 | 26 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 0 | 6 | 0.00% |
| Lat/Lon (out of valid addresses) | 0 | 6 | 0.00% |
| Twitter | 0 | 3 | 0.00% |

## Category edge
```
!new Driver('driver20')
!driver20.id := 'DL004'
!driver20.name := 'Ake Wolf'

!new Shipment('shipment18')
!shipment18.id := 'SH9012'
!shipment18.status := #ASSIGNED

!new Address('pickupAddress18')
!pickupAddress18.text := 'Marine Logistics Center, Tromsø, Norway'

!new GeoLocation('pickupGeoLocation18')
!pickupGeoLocation18.latitude := 69.6496
!pickupGeoLocation18.longitude := 18.9560

!new Address('deliveryAddress18')
!deliveryAddress18.text := 'Research Base Nord, Svalbard, Norway'

!new GeoLocation('deliveryGeoLocation18')
!deliveryGeoLocation18.latitude := 79.0039
!deliveryGeoLocation18.longitude := 16.0160

!new Shipment('shipment19')
!shipment19.id := 'SH3456'
!shipment19.status := #NEW

!new Address('pickupAddress19')
!pickupAddress19.text := 'Electronics Hub, Oslo, Norway'

!new GeoLocation('pickupGeoLocation19')
!pickupGeoLocation19.latitude := 59.9139
!pickupGeoLocation19.longitude := 10.7522

!new Address('deliveryAddress19')
!deliveryAddress19.text := 'Satellite Station, Longyearbyen, Svalbard, Norway'

!new GeoLocation('deliveryGeoLocation19')
!deliveryGeoLocation19.latitude := 78.2232
!deliveryGeoLocation19.longitude := 15.6469

!new Station('station15')

!new Customer('customer20')
!customer20.id := 'CST1234'
!customer20.name := 'Polar Expeditions Ltd.'
!customer20.twitterUserName := '@PolarExped'

!insert (driver20, shipment18) into DriverShipment

!insert (shipment18, pickupAddress18) into ShipmentContainsPickUpAddress

!insert (shipment18, deliveryAddress18) into ShipmentContainsDeliveryAddress

!insert (pickupAddress18, pickupGeoLocation18) into AddressContainsGeoLocation

!insert (deliveryAddress18, deliveryGeoLocation18) into AddressContainsGeoLocation

!insert (shipment19, pickupAddress19) into ShipmentContainsPickUpAddress

!insert (shipment19, deliveryAddress19) into ShipmentContainsDeliveryAddress

!insert (pickupAddress19, pickupGeoLocation19) into AddressContainsGeoLocation

!insert (deliveryAddress19, deliveryGeoLocation19) into AddressContainsGeoLocation

!insert (customer20, shipment18) into CustomerConsistsOfShipment

!insert (customer20, shipment19) into CustomerConsistsOfShipment

!insert (station15, customer20) into StationContainsCustomer

!insert (station15, shipment18) into StationShipment

!insert (station15, shipment19) into StationShipment

!insert (station15, driver20) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 49 | 0.00% |
| Multiplicities Errors | 0 | 15 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 4 | 4 | 100.00% |
| Lat/Lon (out of valid addresses) | 0 | 0 | 0.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
Satellite Station, Longyearbyen, Svalbard, Norway
```
```
Marine Logistics Center, Tromsø, Norway
```
```
Electronics Hub, Oslo, Norway
```
```
Research Base Nord, Svalbard, Norway
```

## Category invalid
```
!new Driver('driver21')
!driver21.id := 'DRV3004'
!driver21.name := 'Anil Gupta'

!new Shipment('shipment20')
!shipment20.id := 'SHP9005'
!shipment20.status := #UNDERWAY

!new Shipment('shipment21')
!shipment21.id := 'SHP9006'
!shipment21.status := #NEW

!new Address('pickupAddress20')
!pickupAddress20.text := 'Dadar Market, Mumbai, MH 400014, India'

!new GeoLocation('pickupGeoLocation20')
!pickupGeoLocation20.latitude := 19.0180
!pickupGeoLocation20.longitude := 72.8446

!new Address('deliveryAddress20')
!deliveryAddress20.text := 'Colaba Causeway, Mumbai, MH 400005, India'

!new GeoLocation('deliveryGeoLocation20')
!deliveryGeoLocation20.latitude := 18.9218
!deliveryGeoLocation20.longitude := 72.8322

!new Address('pickupAddress21')
!pickupAddress21.text := 'Vile Parle West, Mumbai, MH 400056, India'

!new GeoLocation('pickupGeoLocation21')
!pickupGeoLocation21.latitude := 19.0990
!pickupGeoLocation21.longitude := 72.8543

!new Address('deliveryAddress21')
!deliveryAddress21.text := 'Juhu Beach, Mumbai, MH 400049, India'

!new GeoLocation('deliveryGeoLocation21')
!deliveryGeoLocation21.latitude := 19.1027
!deliveryGeoLocation21.longitude := 72.8258

!new Station('station16')

!new Customer('customer21')
!customer21.id := 'CUST701'
!customer21.name := 'Riya Mittal'
!customer21.twitterUserName := '@riya_mumbai'

!new Customer('customer22')
!customer22.id := 'CUST702'
!customer22.name := 'Vikram Desai'
!customer22.twitterUserName := '@vikramdesai'

!insert (driver21, shipment20) into DriverShipment

!insert (driver21, shipment21) into DriverShipment

!insert (shipment20, pickupAddress20) into ShipmentContainsPickUpAddress

!insert (shipment20, deliveryAddress20) into ShipmentContainsDeliveryAddress

!insert (pickupAddress20, pickupGeoLocation20) into AddressContainsGeoLocation

!insert (deliveryAddress20, deliveryGeoLocation20) into AddressContainsGeoLocation

!insert (shipment21, pickupAddress21) into ShipmentContainsPickUpAddress

!insert (shipment21, deliveryAddress21) into ShipmentContainsDeliveryAddress

!insert (pickupAddress21, pickupGeoLocation21) into AddressContainsGeoLocation

!insert (deliveryAddress21, deliveryGeoLocation21) into AddressContainsGeoLocation

!insert (customer21, shipment20) into CustomerConsistsOfShipment

!insert (customer21, shipment21) into CustomerConsistsOfShipment

!insert (station16, customer21) into StationContainsCustomer

!insert (station16, customer22) into StationContainsCustomer

!insert (station16, shipment20) into StationShipment

!insert (station16, shipment21) into StationShipment

!insert (station16, driver21) into StationContainsDriver
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 17 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 0 | 4 | 0.00% |
| Lat/Lon (out of valid addresses) | 0 | 4 | 0.00% |
| Twitter | 0 | 2 | 0.00% |

## Generation 3 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 306 | 0.00% |
| Multiplicities Errors | 0 | 74 | 0.00% |
| Invariants Errors | 0 | 16 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 17 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 11 | 22 | 50.00% |
| Lat/Lon (out of valid addresses) | 0 | 11 | 0.00% |
| Twitter | 0 | 10 | 0.00% |

| Invalid Addresses | 
|---| 
```
Sunrise Organic Gardens, Route 850, Bloomfield, NM
```
```
Green Valley Farms, Route 602, Valleyfield, NM
```
```
12314 Main St, Aztec, NM
```
```
215 Orchard St, Farmington, NM
```
```
Boulevarden 23, Copenhagen, Denmark
```
```
789 Des Voeux Road, Hong Kong
```
```
123 Sakura Lane, Kyoto, Japan
```
```
Satellite Station, Longyearbyen, Svalbard, Norway
```
```
Marine Logistics Center, Tromsø, Norway
```
```
Electronics Hub, Oslo, Norway
```
```
Research Base Nord, Svalbard, Norway
```

# Generation 4
## Category baseline
```
!new Driver('driver28')
!driver28.id := 'D004'
!driver28.name := 'Elena Fischer'

!new Shipment('shipment28')
!shipment28.id := 'SHP005'
!shipment28.status := #NEW

!new Shipment('shipment29')
!shipment29.id := 'SHP006'
!shipment29.status := #UNDERWAY

!new Address('pickupAddress28')
!pickupAddress28.text := 'TechHub Warehouse, 1005 Innovation Dr, Austin, TX'

!new GeoLocation('pickupGeoLocation28')
!pickupGeoLocation28.latitude := 30.2672
!pickupGeoLocation28.longitude := -97.7431

!new Address('deliveryAddress28')
!deliveryAddress28.text := '999 Startup Alley, Austin, TX'

!new GeoLocation('deliveryGeoLocation28')
!deliveryGeoLocation28.latitude := 30.2676
!deliveryGeoLocation28.longitude := -97.7497

!new Address('pickupAddress29')
!pickupAddress29.text := 'Future Tech Solutions, 2345 Tech Ave, San Jose, CA'

!new GeoLocation('pickupGeoLocation29')
!pickupGeoLocation29.latitude := 37.3382
!pickupGeoLocation29.longitude := -121.8863

!new Address('deliveryAddress29')
!deliveryAddress29.text := '4321 Innovation Blvd, Palo Alto, CA'

!new GeoLocation('deliveryGeoLocation29')
!deliveryGeoLocation29.latitude := 37.4419
!deliveryGeoLocation29.longitude := -122.1430

!new Station('station21')

!new Customer('customer28')
!customer28.id := 'CUST005'
!customer28.name := 'Nathan Wu'
!customer28.twitterUserName := '@nate_tech'

!new Customer('customer29')
!customer29.id := 'CUST006'
!customer29.name := 'Sophia Turner'
!customer29.twitterUserName := '@sophia_t_innovate'

!insert (driver28, shipment29) into DriverShipment

!insert (shipment28, pickupAddress28) into ShipmentContainsPickUpAddress

!insert (shipment28, deliveryAddress28) into ShipmentContainsDeliveryAddress

!insert (pickupAddress28, pickupGeoLocation28) into AddressContainsGeoLocation

!insert (deliveryAddress28, deliveryGeoLocation28) into AddressContainsGeoLocation

!insert (shipment29, pickupAddress29) into ShipmentContainsPickUpAddress

!insert (shipment29, deliveryAddress29) into ShipmentContainsDeliveryAddress

!insert (pickupAddress29, pickupGeoLocation29) into AddressContainsGeoLocation

!insert (deliveryAddress29, deliveryGeoLocation29) into AddressContainsGeoLocation

!insert (customer28, shipment28) into CustomerConsistsOfShipment

!insert (customer29, shipment29) into CustomerConsistsOfShipment

!insert (station21, customer28) into StationContainsCustomer

!insert (station21, customer29) into StationContainsCustomer

!insert (station21, shipment28) into StationShipment

!insert (station21, shipment29) into StationShipment

!insert (station21, driver28) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 54 | 0.00% |
| Multiplicities Errors | 0 | 16 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 4 | 4 | 100.00% |
| Lat/Lon (out of valid addresses) | 0 | 0 | 0.00% |
| Twitter | 1 | 2 | 50.00% |

| Invalid Addresses | 
|---| 
```
Future Tech Solutions, 2345 Tech Ave, San Jose, CA
```
```
TechHub Warehouse, 1005 Innovation Dr, Austin, TX
```
```
4321 Innovation Blvd, Palo Alto, CA
```
```
999 Startup Alley, Austin, TX
```

| Invalid Twitters | 
|---| 
```
@sophia_t_innovate
```

## Category boundary
```
!new Driver('driver25')
!driver25.id := 'DRV006'
!driver25.name := 'Fatima Khan'

!new Driver('driver26')
!driver26.id := 'DRV007'
!driver26.name := 'Lucas Müller'

!new Driver('driver27')
!driver27.id := 'DRV008'
!driver27.name := 'Hiroshi Yamada'

!new Shipment('shipment25')
!shipment25.id := 'SHIP005'
!shipment25.status := #ASSIGNED

!new Shipment('shipment26')
!shipment26.id := 'SHIP006'
!shipment26.status := #DELIVERED

!new Shipment('shipment27')
!shipment27.id := 'SHIP007'
!shipment27.status := #UNDERWAY

!new Address('pickupAddress25')
!pickupAddress25.text := '76 Quai de la Seine, Paris, France'

!new GeoLocation('pickupGeoLocation25')
!pickupGeoLocation25.latitude := 48.884
!pickupGeoLocation25.longitude := 2.370

!new Address('deliveryAddress25')
!deliveryAddress25.text := 'Main Street 2, Cairo, Egypt'

!new GeoLocation('deliveryGeoLocation25')
!deliveryGeoLocation25.latitude := 30.0444
!deliveryGeoLocation25.longitude := 31.2357

!new Address('pickupAddress26')
!pickupAddress26.text := 'Rua São João 128, Lisbon, Portugal'

!new GeoLocation('pickupGeoLocation26')
!pickupGeoLocation26.latitude := 38.7223
!pickupGeoLocation26.longitude := -9.1393

!new Address('deliveryAddress26')
!deliveryAddress26.text := 'Central Park Lane, New York, USA'

!new GeoLocation('deliveryGeoLocation26')
!deliveryGeoLocation26.latitude := 40.7851
!deliveryGeoLocation26.longitude := -73.9683

!new Address('pickupAddress27')
!pickupAddress27.text := 'Tokyo Tower, Tokyo, Japan'

!new GeoLocation('pickupGeoLocation27')
!pickupGeoLocation27.latitude := 35.6586
!pickupGeoLocation27.longitude := 139.7454

!new Address('deliveryAddress27')
!deliveryAddress27.text := 'Sydney Opera House, Sydney, Australia'

!new GeoLocation('deliveryGeoLocation27')
!deliveryGeoLocation27.latitude := -33.8568
!deliveryGeoLocation27.longitude := 151.2153

!new Station('station20')

!new Customer('customer26')
!customer26.id := 'CUST005'
!customer26.name := 'Omar El-Farouq'
!customer26.twitterUserName := '@omaref'

!new Customer('customer27')
!customer27.id := 'CUST006'
!customer27.name := 'Renata Rossi'
!customer27.twitterUserName := '@renataross'

!insert (driver25, shipment25) into DriverShipment

!insert (driver26, shipment26) into DriverShipment

!insert (driver27, shipment27) into DriverShipment

!insert (shipment25, pickupAddress25) into ShipmentContainsPickUpAddress

!insert (shipment25, deliveryAddress25) into ShipmentContainsDeliveryAddress

!insert (pickupAddress25, pickupGeoLocation25) into AddressContainsGeoLocation

!insert (deliveryAddress25, deliveryGeoLocation25) into AddressContainsGeoLocation

!insert (shipment26, pickupAddress26) into ShipmentContainsPickUpAddress

!insert (shipment26, deliveryAddress26) into ShipmentContainsDeliveryAddress

!insert (pickupAddress26, pickupGeoLocation26) into AddressContainsGeoLocation

!insert (deliveryAddress26, deliveryGeoLocation26) into AddressContainsGeoLocation

!insert (shipment27, pickupAddress27) into ShipmentContainsPickUpAddress

!insert (shipment27, deliveryAddress27) into ShipmentContainsDeliveryAddress

!insert (pickupAddress27, pickupGeoLocation27) into AddressContainsGeoLocation

!insert (deliveryAddress27, deliveryGeoLocation27) into AddressContainsGeoLocation

!insert (customer26, shipment25) into CustomerConsistsOfShipment

!insert (customer26, shipment26) into CustomerConsistsOfShipment

!insert (customer27, shipment27) into CustomerConsistsOfShipment

!insert (station20, customer26) into StationContainsCustomer

!insert (station20, customer27) into StationContainsCustomer

!insert (station20, shipment25) into StationShipment

!insert (station20, shipment26) into StationShipment

!insert (station20, shipment27) into StationShipment

!insert (station20, driver25) into StationContainsDriver

!insert (station20, driver26) into StationContainsDriver

!insert (station20, driver27) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 83 | 0.00% |
| Multiplicities Errors | 0 | 26 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 3 | 6 | 50.00% |
| Lat/Lon (out of valid addresses) | 0 | 3 | 0.00% |
| Twitter | 0 | 2 | 0.00% |

| Invalid Addresses | 
|---| 
```
76 Quai de la Seine, Paris, France
```
```
Main Street 2, Cairo, Egypt
```
```
Central Park Lane, New York, USA
```

## Category complex
```
!new Driver('driver37')
!driver37.id := 'D-301'
!driver37.name := 'Julia Santos'

!new Driver('driver38')
!driver38.id := 'D-302'
!driver38.name := 'Lucas Oliveira'

!new Driver('driver39')
!driver39.id := 'D-303'
!driver39.name := 'Pablo Hernández'

!new Customer('customer39')
!customer39.id := 'C-301'
!customer39.name := 'Mariana Pérez'
!customer39.twitterUserName := '@marianap_z'

!new Customer('customer40')
!customer40.id := 'C-302'
!customer40.name := 'Victoria Bazán'
!customer40.twitterUserName := '@victoriabaz'

!new Customer('customer41')
!customer41.id := 'C-303'
!customer41.name := 'Gustavo Rocha'
!customer41.twitterUserName := '@gusrocha'

!new Shipment('shipment38')
!shipment38.id := 'S-4001'
!shipment38.status := #ASSIGNED

!new Address('pickupAddress38')
!pickupAddress38.text := 'Avenida Paulista, São Paulo, Brazil'

!new GeoLocation('pickupGeoLocation38')
!pickupGeoLocation38.latitude := -23.5632
!pickupGeoLocation38.longitude := -46.6544

!new Address('deliveryAddress38')
!deliveryAddress38.text := 'Plaza Mayor, Bogotá, Colombia'

!new GeoLocation('deliveryGeoLocation38')
!deliveryGeoLocation38.latitude := 4.7109
!deliveryGeoLocation38.longitude := -74.0721

!new Shipment('shipment39')
!shipment39.id := 'S-4002'
!shipment39.status := #UNDERWAY

!new Address('pickupAddress39')
!pickupAddress39.text := 'Florida Street, Buenos Aires, Argentina'

!new GeoLocation('pickupGeoLocation39')
!pickupGeoLocation39.latitude := -34.6037
!pickupGeoLocation39.longitude := -58.3816

!new Address('deliveryAddress39')
!deliveryAddress39.text := 'Miraflores, Lima, Peru'

!new GeoLocation('deliveryGeoLocation39')
!deliveryGeoLocation39.latitude := -12.1211
!deliveryGeoLocation39.longitude := -77.0298

!new Shipment('shipment40')
!shipment40.id := 'S-4003'
!shipment40.status := #NEW

!new Address('pickupAddress40')
!pickupAddress40.text := 'Mercado Agrícola, Montevideo, Uruguay'

!new GeoLocation('pickupGeoLocation40')
!pickupGeoLocation40.latitude := -34.9011
!pickupGeoLocation40.longitude := -56.1645

!new Address('deliveryAddress40')
!deliveryAddress40.text := 'Historic Center, Quito, Ecuador'

!new GeoLocation('deliveryGeoLocation40')
!deliveryGeoLocation40.latitude := -0.1807
!deliveryGeoLocation40.longitude := -78.4678

!new Shipment('shipment41')
!shipment41.id := 'S-4004'
!shipment41.status := #DELIVERED

!new Address('pickupAddress41')
!pickupAddress41.text := 'Calle 8, Ciudad de México, México'

!new GeoLocation('pickupGeoLocation41')
!pickupGeoLocation41.latitude := 19.4326
!pickupGeoLocation41.longitude := -99.1332

!new Address('deliveryAddress41')
!deliveryAddress41.text := 'Salinas Beach, Salinas, Ecuador'

!new GeoLocation('deliveryGeoLocation41')
!deliveryGeoLocation41.latitude := -2.2040
!deliveryGeoLocation41.longitude := -80.9806

!new Station('station27')

!new Station('station28')

!insert (driver37, shipment38) into DriverShipment

!insert (driver38, shipment39) into DriverShipment

!insert (driver39, shipment41) into DriverShipment

!insert (shipment38, pickupAddress38) into ShipmentContainsPickUpAddress

!insert (shipment38, deliveryAddress38) into ShipmentContainsDeliveryAddress

!insert (pickupAddress38, pickupGeoLocation38) into AddressContainsGeoLocation

!insert (deliveryAddress38, deliveryGeoLocation38) into AddressContainsGeoLocation

!insert (shipment39, pickupAddress39) into ShipmentContainsPickUpAddress

!insert (shipment39, deliveryAddress39) into ShipmentContainsDeliveryAddress

!insert (pickupAddress39, pickupGeoLocation39) into AddressContainsGeoLocation

!insert (deliveryAddress39, deliveryGeoLocation39) into AddressContainsGeoLocation

!insert (shipment40, pickupAddress40) into ShipmentContainsPickUpAddress

!insert (shipment40, deliveryAddress40) into ShipmentContainsDeliveryAddress

!insert (pickupAddress40, pickupGeoLocation40) into AddressContainsGeoLocation

!insert (deliveryAddress40, deliveryGeoLocation40) into AddressContainsGeoLocation

!insert (shipment41, pickupAddress41) into ShipmentContainsPickUpAddress

!insert (shipment41, deliveryAddress41) into ShipmentContainsDeliveryAddress

!insert (pickupAddress41, pickupGeoLocation41) into AddressContainsGeoLocation

!insert (deliveryAddress41, deliveryGeoLocation41) into AddressContainsGeoLocation

!insert (customer39, shipment38) into CustomerConsistsOfShipment

!insert (customer40, shipment39) into CustomerConsistsOfShipment

!insert (customer41, shipment40) into CustomerConsistsOfShipment

!insert (customer40, shipment41) into CustomerConsistsOfShipment

!insert (station28, customer39) into StationContainsCustomer

!insert (station27, customer40) into StationContainsCustomer

!insert (station27, customer41) into StationContainsCustomer

!insert (station28, shipment38) into StationShipment

!insert (station27, shipment39) into StationShipment

!insert (station27, shipment40) into StationShipment

!insert (station27, shipment41) into StationShipment

!insert (station28, driver37) into StationContainsDriver

!insert (station27, driver38) into StationContainsDriver

!insert (station27, driver39) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 108 | 0.00% |
| Multiplicities Errors | 0 | 33 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 2 | 8 | 25.00% |
| Lat/Lon (out of valid addresses) | 1 | 6 | 16.67% |
| Twitter | 0 | 3 | 0.00% |

| Invalid Addresses | 
|---| 
```
Salinas Beach, Salinas, Ecuador
```
```
Calle 8, Ciudad de México, México
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: -12.1211 Lon: -77.0298 for address: Miraflores, Lima, Peru
```

## Category edge
```
!new Driver('driver29')
!driver29.id := 'DL005'
!driver29.name := 'Sara O\'Connell'

!new Driver('driver30')
!driver30.id := 'DL006'
!driver30.name := 'Youssef Ali'

!new Shipment('shipment30')
!shipment30.id := 'SH6789'
!shipment30.status := #DELIVERED

!new Shipment('shipment31')
!shipment31.id := 'SH2468'
!shipment31.status := #ASSIGNED

!new Address('pickupAddress30')
!pickupAddress30.text := 'GreenTech Warehouse, Phoenix, Arizona, USA'

!new GeoLocation('pickupGeoLocation30')
!pickupGeoLocation30.latitude := 33.4484
!pickupGeoLocation30.longitude := -112.0740

!new Address('pickupAddress31')
!pickupAddress31.text := 'Solar Innovations, Las Vegas, Nevada, USA'

!new GeoLocation('pickupGeoLocation31')
!pickupGeoLocation31.latitude := 36.1699
!pickupGeoLocation31.longitude := -115.1398

!new Address('deliveryAddress30')
!deliveryAddress30.text := 'Festival Grounds, Black Rock City, Nevada, USA'

!new GeoLocation('deliveryGeoLocation30')
!deliveryGeoLocation30.latitude := 40.7819
!deliveryGeoLocation30.longitude := -119.2067

!new Station('station22')

!new Customer('customer30')
!customer30.id := 'CST5678'
!customer30.name := 'Desert Eco Solutions'
!customer30.twitterUserName := '@DesertEco'

!new Customer('customer31')
!customer31.id := 'CST1357'
!customer31.name := 'Festival Energy Management'
!customer31.twitterUserName := '@FestivalEnergy'

!insert (driver29, shipment31) into DriverShipment

!insert (driver30, shipment30) into DriverShipment

!insert (shipment30, pickupAddress30) into ShipmentContainsPickUpAddress

!insert (shipment30, deliveryAddress30) into ShipmentContainsDeliveryAddress

!insert (pickupAddress30, pickupGeoLocation30) into AddressContainsGeoLocation

!insert (shipment31, pickupAddress31) into ShipmentContainsPickUpAddress

!insert (shipment31, deliveryAddress30) into ShipmentContainsDeliveryAddress

!insert (pickupAddress31, pickupGeoLocation31) into AddressContainsGeoLocation

!insert (deliveryAddress30, deliveryGeoLocation30) into AddressContainsGeoLocation

!insert (customer30, shipment30) into CustomerConsistsOfShipment

!insert (customer31, shipment31) into CustomerConsistsOfShipment

!insert (station22, customer30) into StationContainsCustomer

!insert (station22, customer31) into StationContainsCustomer

!insert (station22, shipment30) into StationShipment

!insert (station22, shipment31) into StationShipment

!insert (station22, driver29) into StationContainsDriver

!insert (station22, driver30) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 53 | 0.00% |
| Multiplicities Errors | 0 | 17 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 2 | 3 | 66.67% |
| Lat/Lon (out of valid addresses) | 0 | 1 | 0.00% |
| Twitter | 0 | 2 | 0.00% |

| Invalid Addresses | 
|---| 
```
Festival Grounds, Black Rock City, Nevada, USA
```
```
Solar Innovations, Las Vegas, Nevada, USA
```

## Category invalid
```
!new Driver('driver31')
!driver31.id := 'DRV4010'
!driver31.name := 'Wei Liu'

!new Driver('driver32')
!driver32.id := 'DRV4011'
!driver32.name := 'Xiao Chen'

!new Shipment('shipment32')
!shipment32.id := 'SHP11007'
!shipment32.status := #ASSIGNED

!new Shipment('shipment33')
!shipment33.id := 'SHP11008'
!shipment33.status := #NEW

!new Address('pickupAddress32')
!pickupAddress32.text := 'Nanshan Science & Technology Park, Shenzhen, GD 518057, China'

!new GeoLocation('pickupGeoLocation32')
!pickupGeoLocation32.latitude := 22.5408
!pickupGeoLocation32.longitude := 113.9523

!new Address('deliveryAddress32')
!deliveryAddress32.text := 'Huaqiangbei, Shenzhen, GD 518031, China'

!new GeoLocation('deliveryGeoLocation32')
!deliveryGeoLocation32.latitude := 22.5465
!deliveryGeoLocation32.longitude := 114.0661

!new Address('pickupAddress33')
!pickupAddress33.text := 'Shenzhen Bay, Shenzhen, GD 518054, China'

!new GeoLocation('pickupGeoLocation33')
!pickupGeoLocation33.latitude := 22.5120
!pickupGeoLocation33.longitude := 113.9294

!new Address('deliveryAddress33')
!deliveryAddress33.text := 'Lianhuashan Park, Shenzhen, GD 518028, China'

!new GeoLocation('deliveryGeoLocation33')
!deliveryGeoLocation33.latitude := 22.5481
!deliveryGeoLocation33.longitude := 114.0579

!new Station('station23')

!new Customer('customer32')
!customer32.id := 'CUST803'
!customer32.name := 'Jian Hong'
!customer32.twitterUserName := '@jianhtech'

!new Customer('customer33')
!customer33.id := 'CUST804'
!customer33.name := 'Mei Lin'
!customer33.twitterUserName := '@meilinnovate'

!insert (driver31, shipment32) into DriverShipment

!insert (shipment32, pickupAddress32) into ShipmentContainsPickUpAddress

!insert (shipment32, deliveryAddress32) into ShipmentContainsDeliveryAddress

!insert (pickupAddress32, pickupGeoLocation32) into AddressContainsGeoLocation

!insert (deliveryAddress32, deliveryGeoLocation32) into AddressContainsGeoLocation

!insert (shipment33, pickupAddress33) into ShipmentContainsPickUpAddress

!insert (shipment33, deliveryAddress33) into ShipmentContainsDeliveryAddress

!insert (pickupAddress33, pickupGeoLocation33) into AddressContainsGeoLocation

!insert (deliveryAddress33, deliveryGeoLocation33) into AddressContainsGeoLocation

!insert (customer32, shipment32) into CustomerConsistsOfShipment

!insert (customer33, shipment33) into CustomerConsistsOfShipment

!insert (station23, customer32) into StationContainsCustomer

!insert (station23, customer33) into StationContainsCustomer

!insert (station23, shipment32) into StationShipment

!insert (station23, shipment33) into StationShipment

!insert (station23, driver31) into StationContainsDriver

!insert (station23, driver32) into StationContainsDriver
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 17 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 0 | 4 | 0.00% |
| Lat/Lon (out of valid addresses) | 0 | 4 | 0.00% |
| Twitter | 0 | 2 | 0.00% |

## Generation 4 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 356 | 0.00% |
| Multiplicities Errors | 0 | 92 | 0.00% |
| Invariants Errors | 0 | 16 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 17 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 11 | 25 | 44.00% |
| Lat/Lon (out of valid addresses) | 1 | 14 | 7.14% |
| Twitter | 1 | 11 | 9.09% |

| Invalid Addresses | 
|---| 
```
Future Tech Solutions, 2345 Tech Ave, San Jose, CA
```
```
TechHub Warehouse, 1005 Innovation Dr, Austin, TX
```
```
4321 Innovation Blvd, Palo Alto, CA
```
```
999 Startup Alley, Austin, TX
```
```
76 Quai de la Seine, Paris, France
```
```
Main Street 2, Cairo, Egypt
```
```
Central Park Lane, New York, USA
```
```
Salinas Beach, Salinas, Ecuador
```
```
Calle 8, Ciudad de México, México
```
```
Festival Grounds, Black Rock City, Nevada, USA
```
```
Solar Innovations, Las Vegas, Nevada, USA
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: -12.1211 Lon: -77.0298 for address: Miraflores, Lima, Peru
```

| Invalid Twitters | 
|---| 
```
@sophia_t_innovate
```

# Generation 5
## Category baseline
```
!new Driver('driver40')
!driver40.id := 'D005'
!driver40.name := 'Liam O\'Brien'

!new Driver('driver41')
!driver41.id := 'D006'
!driver41.name := 'Yasmin Khan'

!new Shipment('shipment42')
!shipment42.id := 'SHP007'
!shipment42.status := #DELIVERED

!new Address('pickupAddress42')
!pickupAddress42.text := 'The Louvre Museum, Rue de Rivoli, 75001 Paris, France'

!new GeoLocation('pickupGeoLocation42')
!pickupGeoLocation42.latitude := 48.8606
!pickupGeoLocation42.longitude := 2.3376

!new Address('deliveryAddress42')
!deliveryAddress42.text := 'Metropolitan Museum of Art, 1000 5th Ave, New York, NY'

!new GeoLocation('deliveryGeoLocation42')
!deliveryGeoLocation42.latitude := 40.7794
!deliveryGeoLocation42.longitude := -73.9632

!new Station('station29')

!new Customer('customer42')
!customer42.id := 'CUST007'
!customer42.name := 'Global Art Consortium'
!customer42.twitterUserName := '@globalartnetwork'

!insert (driver40, shipment42) into DriverShipment

!insert (shipment42, pickupAddress42) into ShipmentContainsPickUpAddress

!insert (shipment42, deliveryAddress42) into ShipmentContainsDeliveryAddress

!insert (pickupAddress42, pickupGeoLocation42) into AddressContainsGeoLocation

!insert (deliveryAddress42, deliveryGeoLocation42) into AddressContainsGeoLocation

!insert (customer42, shipment42) into CustomerConsistsOfShipment

!insert (station29, customer42) into StationContainsCustomer

!insert (station29, shipment42) into StationShipment

!insert (station29, driver40) into StationContainsDriver

!insert (station29, driver41) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 34 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 0 | 1 | 0.00% |
| Twitter | 1 | 1 | 100.00% |

| Invalid Addresses | 
|---| 
```
The Louvre Museum, Rue de Rivoli, 75001 Paris, France
```

| Invalid Twitters | 
|---| 
```
@globalartnetwork
```

## Category boundary
```
!new Driver('driver33')
!driver33.id := 'DRV009'
!driver33.name := 'Maria Garcia'

!new Driver('driver34')
!driver34.id := 'DRV010'
!driver34.name := 'David Okeke'

!new Driver('driver35')
!driver35.id := 'DRV011'
!driver35.name := 'Lee Xiao'

!new Shipment('shipment34')
!shipment34.id := 'SHIP008'
!shipment34.status := #NEW

!new Shipment('shipment35')
!shipment35.id := 'SHIP009'
!shipment35.status := #UNDERWAY

!new Address('pickupAddress34')
!pickupAddress34.text := 'Paseo de la Reforma 222, Mexico City, Mexico'

!new GeoLocation('pickupGeoLocation34')
!pickupGeoLocation34.latitude := 19.4326
!pickupGeoLocation34.longitude := -99.1332

!new Address('deliveryAddress34')
!deliveryAddress34.text := '1 Infinite Loop, Cupertino, USA'

!new GeoLocation('deliveryGeoLocation34')
!deliveryGeoLocation34.latitude := 37.3318
!deliveryGeoLocation34.longitude := -122.0312

!new Address('pickupAddress35')
!pickupAddress35.text := '2-1-1 Nihonbashi, Tokyo, Japan'

!new GeoLocation('pickupGeoLocation35')
!pickupGeoLocation35.latitude := 35.6863
!pickupGeoLocation35.longitude := 139.7808

!new Address('deliveryAddress35')
!deliveryAddress35.text := '101 Collins St, Melbourne, Australia'

!new GeoLocation('deliveryGeoLocation35')
!deliveryGeoLocation35.latitude := -37.8136
!deliveryGeoLocation35.longitude := 144.9631

!new Station('station24')

!new Station('station25')

!new Customer('customer34')
!customer34.id := 'CUST007'
!customer34.name := 'Carlos Silva'
!customer34.twitterUserName := '@carlsilva'

!new Customer('customer35')
!customer35.id := 'CUST008'
!customer35.name := 'Yumi Sato'
!customer35.twitterUserName := '@yumixsato'

!new Customer('customer36')
!customer36.id := 'CUST009'
!customer36.name := 'Ahmed Patel'
!customer36.twitterUserName := '@ahmedp'

!insert (driver33, shipment34) into DriverShipment

!insert (driver34, shipment35) into DriverShipment

!insert (shipment34, pickupAddress34) into ShipmentContainsPickUpAddress

!insert (shipment34, deliveryAddress34) into ShipmentContainsDeliveryAddress

!insert (pickupAddress34, pickupGeoLocation34) into AddressContainsGeoLocation

!insert (deliveryAddress34, deliveryGeoLocation34) into AddressContainsGeoLocation

!insert (shipment35, pickupAddress35) into ShipmentContainsPickUpAddress

!insert (shipment35, deliveryAddress35) into ShipmentContainsDeliveryAddress

!insert (pickupAddress35, pickupGeoLocation35) into AddressContainsGeoLocation

!insert (deliveryAddress35, deliveryGeoLocation35) into AddressContainsGeoLocation

!insert (customer34, shipment34) into CustomerConsistsOfShipment

!insert (customer35, shipment35) into CustomerConsistsOfShipment

!insert (station24, customer34) into StationContainsCustomer

!insert (station25, customer35) into StationContainsCustomer

!insert (station25, customer36) into StationContainsCustomer

!insert (station24, shipment34) into StationShipment

!insert (station25, shipment35) into StationShipment

!insert (station24, driver33) into StationContainsDriver

!insert (station25, driver34) into StationContainsDriver

!insert (station25, driver35) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 69 | 0.00% |
| Multiplicities Errors | 0 | 20 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 4 | 25.00% |
| Lat/Lon (out of valid addresses) | 0 | 3 | 0.00% |
| Twitter | 0 | 3 | 0.00% |

| Invalid Addresses | 
|---| 
```
2-1-1 Nihonbashi, Tokyo, Japan
```

## Category complex
```
!new Driver('driver48')
!driver48.id := 'D-401'
!driver48.name := 'Omar Al-Masri'

!new Driver('driver49')
!driver49.id := 'D-402'
!driver49.name := 'Zara Khan'

!new Driver('driver50')
!driver50.id := 'D-403'
!driver50.name := 'Ahmed Ben Ali'

!new Customer('customer50')
!customer50.id := 'C-401'
!customer50.name := 'Fatima El-Tayeb'
!customer50.twitterUserName := '@fatima_global'

!new Customer('customer51')
!customer51.id := 'C-402'
!customer51.name := 'Yousef Habib'
!customer51.twitterUserName := '@yousefh_apex'

!new Customer('customer52')
!customer52.id := 'C-403'
!customer52.name := 'Layla Haddad'
!customer52.twitterUserName := '@laylah_addis'

!new Shipment('shipment49')
!shipment49.id := 'S-5001'
!shipment49.status := #NEW

!new Address('pickupAddress49')
!pickupAddress49.text := 'The Dubai Mall, Dubai, UAE'

!new GeoLocation('pickupGeoLocation49')
!pickupGeoLocation49.latitude := 25.2048
!pickupGeoLocation49.longitude := 55.2708

!new Address('deliveryAddress49')
!deliveryAddress49.text := 'Kingdom Center, Riyadh, Saudi Arabia'

!new GeoLocation('deliveryGeoLocation49')
!deliveryGeoLocation49.latitude := 24.7136
!deliveryGeoLocation49.longitude := 46.6753

!new Shipment('shipment50')
!shipment50.id := 'S-5002'
!shipment50.status := #UNDERWAY

!new Address('pickupAddress50')
!pickupAddress50.text := 'Tahrir Square, Cairo, Egypt'

!new GeoLocation('pickupGeoLocation50')
!pickupGeoLocation50.latitude := 30.0444
!pickupGeoLocation50.longitude := 31.2357

!new Address('deliveryAddress50')
!deliveryAddress50.text := 'Medina, Mecca Province, Saudi Arabia'

!new GeoLocation('deliveryGeoLocation50')
!deliveryGeoLocation50.latitude := 24.4686
!deliveryGeoLocation50.longitude := 39.6117

!new Shipment('shipment51')
!shipment51.id := 'S-5003'
!shipment51.status := #DELIVERED

!new Address('pickupAddress51')
!pickupAddress51.text := 'Jemaa el-Fnaa, Marrakech, Morocco'

!new GeoLocation('pickupGeoLocation51')
!pickupGeoLocation51.latitude := 31.6295
!pickupGeoLocation51.longitude := -7.9811

!new Address('deliveryAddress51')
!deliveryAddress51.text := 'Kasbah Market, Tunis, Tunisia'

!new GeoLocation('deliveryGeoLocation51')
!deliveryGeoLocation51.latitude := 36.8065
!deliveryGeoLocation51.longitude := 10.1815

!new Shipment('shipment52')
!shipment52.id := 'S-5004'
!shipment52.status := #ASSIGNED

!new Address('pickupAddress52')
!pickupAddress52.text := 'Khalifa City, Abu Dhabi, UAE'

!new GeoLocation('pickupGeoLocation52')
!pickupGeoLocation52.latitude := 24.4539
!pickupGeoLocation52.longitude := 54.3773

!new Address('deliveryAddress52')
!deliveryAddress52.text := 'Downtown Beirut, Lebanon'

!new GeoLocation('deliveryGeoLocation52')
!deliveryGeoLocation52.latitude := 33.8959
!deliveryGeoLocation52.longitude := 35.4784

!new Station('station35')

!new Station('station36')

!insert (shipment49, pickupAddress49) into ShipmentContainsPickUpAddress

!insert (shipment49, deliveryAddress49) into ShipmentContainsDeliveryAddress

!insert (pickupAddress49, pickupGeoLocation49) into AddressContainsGeoLocation

!insert (deliveryAddress49, deliveryGeoLocation49) into AddressContainsGeoLocation

!insert (driver49, shipment50) into DriverShipment

!insert (shipment50, pickupAddress50) into ShipmentContainsPickUpAddress

!insert (shipment50, deliveryAddress50) into ShipmentContainsDeliveryAddress

!insert (pickupAddress50, pickupGeoLocation50) into AddressContainsGeoLocation

!insert (deliveryAddress50, deliveryGeoLocation50) into AddressContainsGeoLocation

!insert (driver50, shipment51) into DriverShipment

!insert (shipment51, pickupAddress51) into ShipmentContainsPickUpAddress

!insert (shipment51, deliveryAddress51) into ShipmentContainsDeliveryAddress

!insert (pickupAddress51, pickupGeoLocation51) into AddressContainsGeoLocation

!insert (deliveryAddress51, deliveryGeoLocation51) into AddressContainsGeoLocation

!insert (driver48, shipment52) into DriverShipment

!insert (shipment52, pickupAddress52) into ShipmentContainsPickUpAddress

!insert (shipment52, deliveryAddress52) into ShipmentContainsDeliveryAddress

!insert (pickupAddress52, pickupGeoLocation52) into AddressContainsGeoLocation

!insert (deliveryAddress52, deliveryGeoLocation52) into AddressContainsGeoLocation

!insert (customer50, shipment49) into CustomerConsistsOfShipment

!insert (customer51, shipment50) into CustomerConsistsOfShipment

!insert (customer52, shipment51) into CustomerConsistsOfShipment

!insert (customer51, shipment52) into CustomerConsistsOfShipment

!insert (station35, customer50) into StationContainsCustomer

!insert (station35, customer51) into StationContainsCustomer

!insert (station36, customer52) into StationContainsCustomer

!insert (station35, shipment49) into StationShipment

!insert (station36, shipment50) into StationShipment

!insert (station36, shipment51) into StationShipment

!insert (station35, shipment52) into StationShipment

!insert (station35, driver48) into StationContainsDriver

!insert (station36, driver49) into StationContainsDriver

!insert (station36, driver50) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 108 | 0.00% |
| Multiplicities Errors | 0 | 33 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 3 | 8 | 37.50% |
| Lat/Lon (out of valid addresses) | 0 | 5 | 0.00% |
| Twitter | 0 | 3 | 0.00% |

| Invalid Addresses | 
|---| 
```
Medina, Mecca Province, Saudi Arabia
```
```
Kasbah Market, Tunis, Tunisia
```
```
Kingdom Center, Riyadh, Saudi Arabia
```

## Category edge
```
!new Driver('driver36')
!driver36.id := 'DL007'
!driver36.name := 'Xiao Ming'

!new Shipment('shipment36')
!shipment36.id := 'SH1359'
!shipment36.status := #ASSIGNED

!new Shipment('shipment37')
!shipment37.id := 'SH9753'
!shipment37.status := #UNDERWAY

!new Address('pickupAddress36')
!pickupAddress36.text := 'Art Essentials Depot, Kyoto, Japan'

!new GeoLocation('pickupGeoLocation36')
!pickupGeoLocation36.latitude := 35.0116
!pickupGeoLocation36.longitude := 135.7681

!new Address('deliveryAddress36')
!deliveryAddress36.text := 'International Art Venue, Tokyo, Japan'

!new GeoLocation('deliveryGeoLocation36')
!deliveryGeoLocation36.latitude := 35.6895
!deliveryGeoLocation36.longitude := 139.6917

!new Address('pickupAddress37')
!pickupAddress37.text := 'Creative Works, Osaka, Japan'

!new GeoLocation('pickupGeoLocation37')
!pickupGeoLocation37.latitude := 34.6937
!pickupGeoLocation37.longitude := 135.5023

!new Address('deliveryAddress37')
!deliveryAddress37.text := 'Artists\' Hub, Shibuya, Tokyo, Japan'

!new GeoLocation('deliveryGeoLocation37')
!deliveryGeoLocation37.latitude := 35.6628
!deliveryGeoLocation37.longitude := 139.7085

!new Station('station26')

!new Customer('customer37')
!customer37.id := 'CST8901'
!customer37.name := 'Tokyo Art Collective'
!customer37.twitterUserName := '@TokyoArtCo'

!new Customer('customer38')
!customer38.id := 'CST9987'
!customer38.name := 'Japanese Artisans Guild'
!customer38.twitterUserName := '@JapanArtisans'

!insert (driver36, shipment36) into DriverShipment

!insert (shipment36, pickupAddress36) into ShipmentContainsPickUpAddress

!insert (shipment36, deliveryAddress36) into ShipmentContainsDeliveryAddress

!insert (pickupAddress36, pickupGeoLocation36) into AddressContainsGeoLocation

!insert (deliveryAddress36, deliveryGeoLocation36) into AddressContainsGeoLocation

!insert (shipment37, pickupAddress37) into ShipmentContainsPickUpAddress

!insert (shipment37, deliveryAddress37) into ShipmentContainsDeliveryAddress

!insert (pickupAddress37, pickupGeoLocation37) into AddressContainsGeoLocation

!insert (deliveryAddress37, deliveryGeoLocation37) into AddressContainsGeoLocation

!insert (customer37, shipment36) into CustomerConsistsOfShipment

!insert (customer38, shipment37) into CustomerConsistsOfShipment

!insert (station26, customer37) into StationContainsCustomer

!insert (station26, customer38) into StationContainsCustomer

!insert (station26, shipment36) into StationShipment

!insert (station26, shipment37) into StationShipment

!insert (station26, driver36) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 54 | 0.00% |
| Multiplicities Errors | 0 | 16 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 3 | 4 | 75.00% |
| Lat/Lon (out of valid addresses) | 0 | 1 | 0.00% |
| Twitter | 0 | 2 | 0.00% |

| Invalid Addresses | 
|---| 
```
Art Essentials Depot, Kyoto, Japan
```
```
International Art Venue, Tokyo, Japan
```
```
Artists\ Hub, Shibuya, Tokyo, Japan
```

## Category invalid
```
!new Driver('driver45')
!driver45.id := 'DRV5012'
!driver45.name := 'Ahmed Youssef'

!new Driver('driver46')
!driver46.id := 'DRV5013'
!driver46.name := 'Fatima Hassan'

!new Shipment('shipment46')
!shipment46.id := 'SHP15009'
!shipment46.status := #ASSIGNED

!new Shipment('shipment47')
!shipment47.id := 'SHP15010'
!shipment47.status := #UNDERWAY

!new Address('pickupAddress46')
!pickupAddress46.text := 'Khan el-Khalili, Al-Azhar St, Cairo Governorate, Egypt'

!new GeoLocation('pickupGeoLocation46')
!pickupGeoLocation46.latitude := 30.0478
!pickupGeoLocation46.longitude := 31.2625

!new Address('deliveryAddress46')
!deliveryAddress46.text := 'Giza Necropolis, Giza Governorate, Egypt'

!new GeoLocation('deliveryGeoLocation46')
!deliveryGeoLocation46.latitude := 29.9773
!deliveryGeoLocation46.longitude := 31.1325

!new Address('pickupAddress47')
!pickupAddress47.text := 'Coptic Cairo, Misr Al Qadima, Cairo Governorate, Egypt'

!new GeoLocation('pickupGeoLocation47')
!pickupGeoLocation47.latitude := 30.0061
!pickupGeoLocation47.longitude := 31.2317

!new Address('deliveryAddress47')
!deliveryAddress47.text := 'The Egyptian Museum, Tahrir Square, Cairo Governorate, Egypt'

!new GeoLocation('deliveryGeoLocation47')
!deliveryGeoLocation47.latitude := 30.0478
!deliveryGeoLocation47.longitude := 31.2336

!new Station('station32')

!new Station('station33')

!new Customer('customer46')
!customer46.id := 'CUST902'
!customer46.name := 'Leila Mustafa'
!customer46.twitterUserName := '@leilacraft'

!new Customer('customer47')
!customer47.id := 'CUST903'
!customer47.name := 'Khaled El-Sayed'
!customer47.twitterUserName := '@khaledtravels'

!insert (driver45, shipment46) into DriverShipment

!insert (driver46, shipment47) into DriverShipment

!insert (shipment46, pickupAddress46) into ShipmentContainsPickUpAddress

!insert (shipment46, deliveryAddress46) into ShipmentContainsDeliveryAddress

!insert (pickupAddress46, pickupGeoLocation46) into AddressContainsGeoLocation

!insert (deliveryAddress46, deliveryGeoLocation46) into AddressContainsGeoLocation

!insert (shipment47, pickupAddress47) into ShipmentContainsPickUpAddress

!insert (shipment47, deliveryAddress47) into ShipmentContainsDeliveryAddress

!insert (pickupAddress47, pickupGeoLocation47) into AddressContainsGeoLocation

!insert (deliveryAddress47, deliveryGeoLocation47) into AddressContainsGeoLocation

!insert (customer46, shipment46) into CustomerConsistsOfShipment

!insert (customer47, shipment47) into CustomerConsistsOfShipment

!insert (station32, customer46) into StationContainsCustomer

!insert (station33, customer47) into StationContainsCustomer

!insert (station32, shipment46) into StationShipment

!insert (station33, shipment47) into StationShipment

!insert (station32, driver45) into StationContainsDriver

!insert (station33, driver46) into StationContainsDriver
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 18 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 4 | 4 | 100.00% |
| Lat/Lon (out of valid addresses) | 0 | 0 | 0.00% |
| Twitter | 0 | 2 | 0.00% |

| Invalid Addresses | 
|---| 
```
Coptic Cairo, Misr Al Qadima, Cairo Governorate, Egypt
```
```
Khan el-Khalili, Al-Azhar St, Cairo Governorate, Egypt
```
```
The Egyptian Museum, Tahrir Square, Cairo Governorate, Egypt
```
```
Giza Necropolis, Giza Governorate, Egypt
```

## Generation 5 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 325 | 0.00% |
| Multiplicities Errors | 0 | 79 | 0.00% |
| Invariants Errors | 0 | 16 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 18 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 12 | 22 | 54.55% |
| Lat/Lon (out of valid addresses) | 0 | 10 | 0.00% |
| Twitter | 1 | 11 | 9.09% |

| Invalid Addresses | 
|---| 
```
The Louvre Museum, Rue de Rivoli, 75001 Paris, France
```
```
2-1-1 Nihonbashi, Tokyo, Japan
```
```
Medina, Mecca Province, Saudi Arabia
```
```
Kasbah Market, Tunis, Tunisia
```
```
Kingdom Center, Riyadh, Saudi Arabia
```
```
Art Essentials Depot, Kyoto, Japan
```
```
International Art Venue, Tokyo, Japan
```
```
Artists\ Hub, Shibuya, Tokyo, Japan
```
```
Coptic Cairo, Misr Al Qadima, Cairo Governorate, Egypt
```
```
Khan el-Khalili, Al-Azhar St, Cairo Governorate, Egypt
```
```
The Egyptian Museum, Tahrir Square, Cairo Governorate, Egypt
```
```
Giza Necropolis, Giza Governorate, Egypt
```

| Invalid Twitters | 
|---| 
```
@globalartnetwork
```

# Generation 6
## Category baseline
```
!new Driver('driver47')
!driver47.id := 'D007'
!driver47.name := 'Fatima Al-Abbas'

!new Shipment('shipment48')
!shipment48.id := 'SHP008'
!shipment48.status := #UNDERWAY

!new Address('pickupAddress48')
!pickupAddress48.text := 'MicroHealth, 55 Virology Lane, Seattle, WA'

!new GeoLocation('pickupGeoLocation48')
!pickupGeoLocation48.latitude := 47.6062
!pickupGeoLocation48.longitude := -122.3321

!new Address('deliveryAddress48')
!deliveryAddress48.text := 'St. Mercy Hospital, 500 Health Ave, Portland, OR'

!new GeoLocation('deliveryGeoLocation48')
!deliveryGeoLocation48.latitude := 45.5051
!deliveryGeoLocation48.longitude := -122.6750

!new Station('station34')

!new Customer('customer48')
!customer48.id := 'CUST008'
!customer48.name := 'Northwest Health Alliance'
!customer48.twitterUserName := '@NWHealthAlliance'

!new Customer('customer49')
!customer49.id := 'CUST009'
!customer49.name := 'Portland Medical Trust'
!customer49.twitterUserName := '@PortlandMedTrust'

!insert (driver47, shipment48) into DriverShipment

!insert (shipment48, pickupAddress48) into ShipmentContainsPickUpAddress

!insert (shipment48, deliveryAddress48) into ShipmentContainsDeliveryAddress

!insert (pickupAddress48, pickupGeoLocation48) into AddressContainsGeoLocation

!insert (deliveryAddress48, deliveryGeoLocation48) into AddressContainsGeoLocation

!insert (customer48, shipment48) into CustomerConsistsOfShipment

!insert (station34, customer48) into StationContainsCustomer

!insert (station34, customer49) into StationContainsCustomer

!insert (station34, shipment48) into StationShipment

!insert (station34, driver47) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 35 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 2 | 2 | 100.00% |
| Lat/Lon (out of valid addresses) | 0 | 0 | 0.00% |
| Twitter | 2 | 2 | 100.00% |

| Invalid Addresses | 
|---| 
```
MicroHealth, 55 Virology Lane, Seattle, WA
```
```
St. Mercy Hospital, 500 Health Ave, Portland, OR
```

| Invalid Twitters | 
|---| 
```
@NWHealthAlliance
```
```
@PortlandMedTrust
```

## Category boundary
```
!new Driver('driver42')
!driver42.id := 'DRV012'
!driver42.name := 'Elena Popov'

!new Driver('driver43')
!driver43.id := 'DRV013'
!driver43.name := 'Samir Hassan'

!new Shipment('shipment43')
!shipment43.id := 'SHIP010'
!shipment43.status := #NEW

!new Address('pickupAddress43')
!pickupAddress43.text := 'Stroget 35, Malmö, Sweden'

!new GeoLocation('pickupGeoLocation43')
!pickupGeoLocation43.latitude := 55.6050
!pickupGeoLocation43.longitude := 13.0038

!new Address('deliveryAddress43')
!deliveryAddress43.text := 'Piazza del Duomo, Milan, Italy'

!new GeoLocation('deliveryGeoLocation43')
!deliveryGeoLocation43.latitude := 45.4642
!deliveryGeoLocation43.longitude := 9.1900

!new Station('station30')

!new Customer('customer43')
!customer43.id := 'CUST010'
!customer43.name := 'Giovanni Bellini'
!customer43.twitterUserName := '@giovanniart'

!new Customer('customer44')
!customer44.id := 'CUST011'
!customer44.name := 'Amina Ngugi'
!customer44.twitterUserName := '@aminan'

!insert (driver42, shipment43) into DriverShipment

!insert (shipment43, pickupAddress43) into ShipmentContainsPickUpAddress

!insert (shipment43, deliveryAddress43) into ShipmentContainsDeliveryAddress

!insert (pickupAddress43, pickupGeoLocation43) into AddressContainsGeoLocation

!insert (deliveryAddress43, deliveryGeoLocation43) into AddressContainsGeoLocation

!insert (customer43, shipment43) into CustomerConsistsOfShipment

!insert (station30, customer43) into StationContainsCustomer

!insert (station30, customer44) into StationContainsCustomer

!insert (station30, shipment43) into StationShipment

!insert (station30, driver42) into StationContainsDriver

!insert (station30, driver43) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 39 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 1 | 2 | 50.00% |
| Lat/Lon (out of valid addresses) | 0 | 1 | 0.00% |
| Twitter | 0 | 2 | 0.00% |

| Invalid Addresses | 
|---| 
```
Stroget 35, Malmö, Sweden
```

## Category complex
```
!new Driver('driver53')
!driver53.id := 'D-501'
!driver53.name := 'Elena Petrova'

!new Driver('driver54')
!driver54.id := 'D-502'
!driver54.name := 'George Müller'

!new Driver('driver55')
!driver55.id := 'D-503'
!driver55.name := 'Liam Murphy'

!new Customer('customer55')
!customer55.id := 'C-501'
!customer55.name := 'Anya Ivanova'
!customer55.twitterUserName := '@anyaCargo'

!new Customer('customer56')
!customer56.id := 'C-502'
!customer56.name := 'Seán O\'Sullivan'
!customer56.twitterUserName := '@sean_irishgoods'

!new Customer('customer57')
!customer57.id := 'C-503'
!customer57.name := 'Viktor Novak'
!customer57.twitterUserName := '@viktor_trades'

!new Shipment('shipment55')
!shipment55.id := 'S-6001'
!shipment55.status := #UNDERWAY

!new Address('pickupAddress55')
!pickupAddress55.text := 'Nevsky Prospect, Saint Petersburg, Russia'

!new GeoLocation('pickupGeoLocation55')
!pickupGeoLocation55.latitude := 59.9343
!pickupGeoLocation55.longitude := 30.3351

!new Address('deliveryAddress55')
!deliveryAddress55.text := 'Stureplan, Stockholm, Sweden'

!new GeoLocation('deliveryGeoLocation55')
!deliveryGeoLocation55.latitude := 59.3293
!deliveryGeoLocation55.longitude := 18.0686

!new Shipment('shipment56')
!shipment56.id := 'S-6002'
!shipment56.status := #ASSIGNED

!new Address('pickupAddress56')
!pickupAddress56.text := 'O\'Connell Street, Dublin, Ireland'

!new GeoLocation('pickupGeoLocation56')
!pickupGeoLocation56.latitude := 53.3498
!pickupGeoLocation56.longitude := -6.2603

!new Address('deliveryAddress56')
!deliveryAddress56.text := 'Prater, Vienna, Austria'

!new GeoLocation('deliveryGeoLocation56')
!deliveryGeoLocation56.latitude := 48.2082
!deliveryGeoLocation56.longitude := 16.3738

!new Shipment('shipment57')
!shipment57.id := 'S-6003'
!shipment57.status := #DELIVERED

!new Address('pickupAddress57')
!pickupAddress57.text := 'Plaza Mayor, Madrid, Spain'

!new GeoLocation('pickupGeoLocation57')
!pickupGeoLocation57.latitude := 40.4168
!pickupGeoLocation57.longitude := -3.7038

!new Address('deliveryAddress57')
!deliveryAddress57.text := 'Potsdamer Platz, Berlin, Germany'

!new GeoLocation('deliveryGeoLocation57')
!deliveryGeoLocation57.latitude := 52.5200
!deliveryGeoLocation57.longitude := 13.4050

!new Shipment('shipment58')
!shipment58.id := 'S-6004'
!shipment58.status := #NEW

!new Address('pickupAddress58')
!pickupAddress58.text := 'Old Town, Tallinn, Estonia'

!new GeoLocation('pickupGeoLocation58')
!pickupGeoLocation58.latitude := 59.4370
!pickupGeoLocation58.longitude := 24.7536

!new Address('deliveryAddress58')
!deliveryAddress58.text := 'Central Station, Copenhagen, Denmark'

!new GeoLocation('deliveryGeoLocation58')
!deliveryGeoLocation58.latitude := 55.6761
!deliveryGeoLocation58.longitude := 12.5683

!new Station('station39')

!new Station('station40')

!insert (driver53, shipment55) into DriverShipment

!insert (driver55, shipment56) into DriverShipment

!insert (driver54, shipment57) into DriverShipment

!insert (shipment55, pickupAddress55) into ShipmentContainsPickUpAddress

!insert (shipment55, deliveryAddress55) into ShipmentContainsDeliveryAddress

!insert (pickupAddress55, pickupGeoLocation55) into AddressContainsGeoLocation

!insert (deliveryAddress55, deliveryGeoLocation55) into AddressContainsGeoLocation

!insert (shipment56, pickupAddress56) into ShipmentContainsPickUpAddress

!insert (shipment56, deliveryAddress56) into ShipmentContainsDeliveryAddress

!insert (pickupAddress56, pickupGeoLocation56) into AddressContainsGeoLocation

!insert (deliveryAddress56, deliveryGeoLocation56) into AddressContainsGeoLocation

!insert (shipment57, pickupAddress57) into ShipmentContainsPickUpAddress

!insert (shipment57, deliveryAddress57) into ShipmentContainsDeliveryAddress

!insert (pickupAddress57, pickupGeoLocation57) into AddressContainsGeoLocation

!insert (deliveryAddress57, deliveryGeoLocation57) into AddressContainsGeoLocation

!insert (shipment58, pickupAddress58) into ShipmentContainsPickUpAddress

!insert (shipment58, deliveryAddress58) into ShipmentContainsDeliveryAddress

!insert (pickupAddress58, pickupGeoLocation58) into AddressContainsGeoLocation

!insert (deliveryAddress58, deliveryGeoLocation58) into AddressContainsGeoLocation

!insert (customer55, shipment55) into CustomerConsistsOfShipment

!insert (customer56, shipment56) into CustomerConsistsOfShipment

!insert (customer57, shipment57) into CustomerConsistsOfShipment

!insert (customer57, shipment58) into CustomerConsistsOfShipment

!insert (station39, customer55) into StationContainsCustomer

!insert (station39, customer57) into StationContainsCustomer

!insert (station40, customer56) into StationContainsCustomer

!insert (station39, shipment55) into StationShipment

!insert (station40, shipment56) into StationShipment

!insert (station40, shipment57) into StationShipment

!insert (station39, shipment58) into StationShipment

!insert (station39, driver53) into StationContainsDriver

!insert (station40, driver54) into StationContainsDriver

!insert (station40, driver55) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 108 | 0.00% |
| Multiplicities Errors | 0 | 33 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 2 | 8 | 25.00% |
| Lat/Lon (out of valid addresses) | 0 | 6 | 0.00% |
| Twitter | 0 | 3 | 0.00% |

| Invalid Addresses | 
|---| 
```
Old Town, Tallinn, Estonia
```
```
Nevsky Prospect, Saint Petersburg, Russia
```

## Category edge
```
!new Driver('driver44')
!driver44.id := 'DL008'
!driver44.name := 'Carlos Mendes'

!new Shipment('shipment44')
!shipment44.id := 'SH1122'
!shipment44.status := #NEW

!new Shipment('shipment45')
!shipment45.id := 'SH2233'
!shipment45.status := #DELIVERED

!new Address('pickupAddress44')
!pickupAddress44.text := 'EV Parts Manufacturing Hub, Sao Paulo, Brazil'

!new GeoLocation('pickupGeoLocation44')
!pickupGeoLocation44.latitude := -23.5505
!pickupGeoLocation44.longitude := -46.6333

!new Address('deliveryAddress44')
!deliveryAddress44.text := 'Amazon Research Facility, Manaus, Brazil'

!new GeoLocation('deliveryGeoLocation44')
!deliveryGeoLocation44.latitude := -3.1190
!deliveryGeoLocation44.longitude := -60.0217

!new Address('pickupAddress45')
!pickupAddress45.text := 'EcoTech Distributors, Rio de Janeiro, Brazil'

!new GeoLocation('pickupGeoLocation45')
!pickupGeoLocation45.latitude := -22.9068
!pickupGeoLocation45.longitude := -43.1729

!new Address('deliveryAddress45')
!deliveryAddress45.text := 'University of Amazonas, Manaus, Brazil'

!new GeoLocation('deliveryGeoLocation45')
!deliveryGeoLocation45.latitude := -3.1019
!deliveryGeoLocation45.longitude := -60.0250

!new Station('station31')

!new Customer('customer45')
!customer45.id := 'CST5566'
!customer45.name := 'Manaus Innovation Hub'
!customer45.twitterUserName := '@ManausInnovate'

!insert (driver44, shipment44) into DriverShipment

!insert (shipment44, pickupAddress44) into ShipmentContainsPickUpAddress

!insert (shipment44, deliveryAddress44) into ShipmentContainsDeliveryAddress

!insert (pickupAddress44, pickupGeoLocation44) into AddressContainsGeoLocation

!insert (deliveryAddress44, deliveryGeoLocation44) into AddressContainsGeoLocation

!insert (shipment45, pickupAddress45) into ShipmentContainsPickUpAddress

!insert (shipment45, deliveryAddress45) into ShipmentContainsDeliveryAddress

!insert (pickupAddress45, pickupGeoLocation45) into AddressContainsGeoLocation

!insert (deliveryAddress45, deliveryGeoLocation45) into AddressContainsGeoLocation

!insert (customer45, shipment44) into CustomerConsistsOfShipment

!insert (customer45, shipment45) into CustomerConsistsOfShipment

!insert (station31, customer45) into StationContainsCustomer

!insert (station31, shipment44) into StationShipment

!insert (station31, shipment45) into StationShipment

!insert (station31, driver44) into StationContainsDriver
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 49 | 0.00% |
| Multiplicities Errors | 0 | 15 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 4 | 4 | 100.00% |
| Lat/Lon (out of valid addresses) | 0 | 0 | 0.00% |
| Twitter | 0 | 1 | 0.00% |

| Invalid Addresses | 
|---| 
```
EcoTech Distributors, Rio de Janeiro, Brazil
```
```
EV Parts Manufacturing Hub, Sao Paulo, Brazil
```
```
University of Amazonas, Manaus, Brazil
```
```
Amazon Research Facility, Manaus, Brazil
```

## Category invalid
```
!new Driver('driver51')
!driver51.id := 'DRV6014'
!driver51.name := 'Lucas Oliveira'

!new Driver('driver52')
!driver52.id := 'DRV6015'
!driver52.name := 'Mariana Ribeiro'

!new Shipment('shipment53')
!shipment53.id := 'SHP18011'
!shipment53.status := #DELIVERED

!new Shipment('shipment54')
!shipment54.id := 'SHP18012'
!shipment54.status := #ASSIGNED

!new Address('pickupAddress53')
!pickupAddress53.text := 'Mercadão São Paulo, Rua da Cantareira 306, São Paulo, SP 01024-000, Brazil'

!new GeoLocation('pickupGeoLocation53')
!pickupGeoLocation53.latitude := -23.5419
!pickupGeoLocation53.longitude := -46.6288

!new Address('deliveryAddress53')
!deliveryAddress53.text := 'Avenida Paulista, São Paulo, SP 01311-200, Brazil'

!new GeoLocation('deliveryGeoLocation53')
!deliveryGeoLocation53.latitude := -23.5612
!deliveryGeoLocation53.longitude := -46.6560

!new Address('pickupAddress54')
!pickupAddress54.text := 'Vila Madalena, São Paulo, SP 05434-020, Brazil'

!new GeoLocation('pickupGeoLocation54')
!pickupGeoLocation54.latitude := -23.5544
!pickupGeoLocation54.longitude := -46.6908

!new Address('deliveryAddress54')
!deliveryAddress54.text := 'Ibirapuera Park, São Paulo, SP 04094-050, Brazil'

!new GeoLocation('deliveryGeoLocation54')
!deliveryGeoLocation54.latitude := -23.5874
!deliveryGeoLocation54.longitude := -46.6572

!new Station('station37')

!new Station('station38')

!new Customer('customer53')
!customer53.id := 'CUST1005'
!customer53.name := 'Bianca Silva'
!customer53.twitterUserName := '@biancasilva'

!new Customer('customer54')
!customer54.id := 'CUST1006'
!customer54.name := 'Pedro Almeida'
!customer54.twitterUserName := '@pedroalmeidaBR'

!insert (driver51, shipment53) into DriverShipment

!insert (driver52, shipment54) into DriverShipment

!insert (shipment53, pickupAddress53) into ShipmentContainsPickUpAddress

!insert (shipment53, deliveryAddress53) into ShipmentContainsDeliveryAddress

!insert (pickupAddress53, pickupGeoLocation53) into AddressContainsGeoLocation

!insert (deliveryAddress53, deliveryGeoLocation53) into AddressContainsGeoLocation

!insert (shipment54, pickupAddress54) into ShipmentContainsPickUpAddress

!insert (shipment54, deliveryAddress54) into ShipmentContainsDeliveryAddress

!insert (pickupAddress54, pickupGeoLocation54) into AddressContainsGeoLocation

!insert (deliveryAddress54, deliveryGeoLocation54) into AddressContainsGeoLocation

!insert (customer53, shipment53) into CustomerConsistsOfShipment

!insert (customer54, shipment54) into CustomerConsistsOfShipment

!insert (station37, customer53) into StationContainsCustomer

!insert (station38, customer54) into StationContainsCustomer

!insert (station37, shipment53) into StationShipment

!insert (station38, shipment54) into StationShipment

!insert (station37, driver51) into StationContainsDriver

!insert (station38, driver52) into StationContainsDriver
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 18 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 0 | 4 | 0.00% |
| Lat/Lon (out of valid addresses) | 0 | 4 | 0.00% |
| Twitter | 0 | 2 | 0.00% |

## Generation 6 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 291 | 0.00% |
| Multiplicities Errors | 0 | 69 | 0.00% |
| Invariants Errors | 0 | 16 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 18 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 4 | 0.00% |

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 9 | 20 | 45.00% |
| Lat/Lon (out of valid addresses) | 0 | 11 | 0.00% |
| Twitter | 2 | 10 | 20.00% |

| Invalid Addresses | 
|---| 
```
MicroHealth, 55 Virology Lane, Seattle, WA
```
```
St. Mercy Hospital, 500 Health Ave, Portland, OR
```
```
Stroget 35, Malmö, Sweden
```
```
Old Town, Tallinn, Estonia
```
```
Nevsky Prospect, Saint Petersburg, Russia
```
```
EcoTech Distributors, Rio de Janeiro, Brazil
```
```
EV Parts Manufacturing Hub, Sao Paulo, Brazil
```
```
University of Amazonas, Manaus, Brazil
```
```
Amazon Research Facility, Manaus, Brazil
```

| Invalid Twitters | 
|---| 
```
@NWHealthAlliance
```
```
@PortlandMedTrust
```

# Summary for all generations
| Summary | Value | 
|---|---| 
| Model | GPT_4O | 
| Type | CoT | 
| System | pickupnet | 
| Number of generations | 6 | 

| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 1679 | 0.00% |
| Multiplicities Errors | 0 | 413 | 0.00% |
| Invariants Errors | 0 | 96 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 89 | 0.00% |
| Invariants Errors (Not included on General) | 1 | 24 | 4.17% |

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (3) `Shipment::differentPickupAndDeliveryAddress': FAILED.
```

| PickupNet | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Address | 53 | 114 | 46.49% |
| Lat/Lon (out of valid addresses) | 1 | 61 | 1.64% |
| Twitter | 4 | 57 | 7.02% |

| Invalid Addresses | 
|---| 
```
123 Elm St, Springfield, IL
```
```
789 Maple Ave, Chicago, IL
```
```
123 Orchard Avenue, Wellington, New Zealand
```
```
O\Hare International Airport Cargo Terminal, Chicago, Illinois, USA
```
```
Farmer\s Market, Ashoka Road, Delhi, India
```
```
15 Chome-9-1 Marunouchi, Chiyoda City, Tokyo 100-0005, Japan
```
```
Health Clinic, Koror, Palau
```
```
Hospital Warehouse, Davao City, Philippines
```
```
Bolton Abbey, Skipton, BD23 6EX, UK
```
```
Haworth Farm, Moorland Rd, Haworth, BD22 8BS, UK
```
```
Sunrise Organic Gardens, Route 850, Bloomfield, NM
```
```
Green Valley Farms, Route 602, Valleyfield, NM
```
```
12314 Main St, Aztec, NM
```
```
215 Orchard St, Farmington, NM
```
```
Boulevarden 23, Copenhagen, Denmark
```
```
789 Des Voeux Road, Hong Kong
```
```
123 Sakura Lane, Kyoto, Japan
```
```
Satellite Station, Longyearbyen, Svalbard, Norway
```
```
Marine Logistics Center, Tromsø, Norway
```
```
Electronics Hub, Oslo, Norway
```
```
Research Base Nord, Svalbard, Norway
```
```
Future Tech Solutions, 2345 Tech Ave, San Jose, CA
```
```
TechHub Warehouse, 1005 Innovation Dr, Austin, TX
```
```
4321 Innovation Blvd, Palo Alto, CA
```
```
999 Startup Alley, Austin, TX
```
```
76 Quai de la Seine, Paris, France
```
```
Main Street 2, Cairo, Egypt
```
```
Central Park Lane, New York, USA
```
```
Salinas Beach, Salinas, Ecuador
```
```
Calle 8, Ciudad de México, México
```
```
Festival Grounds, Black Rock City, Nevada, USA
```
```
Solar Innovations, Las Vegas, Nevada, USA
```
```
The Louvre Museum, Rue de Rivoli, 75001 Paris, France
```
```
2-1-1 Nihonbashi, Tokyo, Japan
```
```
Medina, Mecca Province, Saudi Arabia
```
```
Kasbah Market, Tunis, Tunisia
```
```
Kingdom Center, Riyadh, Saudi Arabia
```
```
Art Essentials Depot, Kyoto, Japan
```
```
International Art Venue, Tokyo, Japan
```
```
Artists\ Hub, Shibuya, Tokyo, Japan
```
```
Coptic Cairo, Misr Al Qadima, Cairo Governorate, Egypt
```
```
Khan el-Khalili, Al-Azhar St, Cairo Governorate, Egypt
```
```
The Egyptian Museum, Tahrir Square, Cairo Governorate, Egypt
```
```
Giza Necropolis, Giza Governorate, Egypt
```
```
MicroHealth, 55 Virology Lane, Seattle, WA
```
```
St. Mercy Hospital, 500 Health Ave, Portland, OR
```
```
Stroget 35, Malmö, Sweden
```
```
Old Town, Tallinn, Estonia
```
```
Nevsky Prospect, Saint Petersburg, Russia
```
```
EcoTech Distributors, Rio de Janeiro, Brazil
```
```
EV Parts Manufacturing Hub, Sao Paulo, Brazil
```
```
University of Amazonas, Manaus, Brazil
```
```
Amazon Research Facility, Manaus, Brazil
```

| Invalid Lat/Lon | 
|---| 
```
Invalid Lat: -12.1211 Lon: -77.0298 for address: Miraflores, Lima, Peru
```

| Invalid Twitters | 
|---| 
```
@sophia_t_innovate
```
```
@globalartnetwork
```
```
@NWHealthAlliance
```
```
@PortlandMedTrust
```

