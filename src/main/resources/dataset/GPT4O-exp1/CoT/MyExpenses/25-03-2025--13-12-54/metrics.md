# Generation 1
## Category baseline
```
!new Expense('summerTravelToItaly')
!summerTravelToItaly.amount := 1200.00
!summerTravelToItaly.startDate := Date('2023-06-01')
!summerTravelToItaly.endDate := Date('2023-06-15')

!new Bill('flightTicket')
!flightTicket.amount := 600.00
!flightTicket.category := 'Travel'
!flightTicket.date := Date('2023-05-25')
!flightTicket.paymentMethod := #CREDIT_CARD
!flightTicket.status := #VERIFIED

!new Bill('hotelAccommodation')
!hotelAccommodation.amount := 400.00
!hotelAccommodation.category := 'Lodging'
!hotelAccommodation.date := Date('2023-06-05')
!hotelAccommodation.paymentMethod := #CHECK
!hotelAccommodation.status := #VALIDATED

!new Bill('foodAndDining')
!foodAndDining.amount := 200.00
!foodAndDining.category := 'Food'
!foodAndDining.date := Date('2023-06-06')
!foodAndDining.paymentMethod := #CASH
!foodAndDining.status := #VERIFIED

!new Currency('euro')
!euro.name := 'Euro'
!euro.abbreviation := 'EUR'

!insert (flightTicket, euro) into BillCurrency
!insert (hotelAccommodation, euro) into BillCurrency
!insert (foodAndDining, euro) into BillCurrency

!insert (summerTravelToItaly, flightTicket) into ExpenseContainsBills
!insert (summerTravelToItaly, hotelAccommodation) into ExpenseContainsBills
!insert (summerTravelToItaly, foodAndDining) into ExpenseContainsBills

!new Comment('comment1')
!comment1.text := 'Great experience with authentic Italian meals. The bill was well within budget.'

!new Comment('comment2')
!comment2.text := 'Worth every penny for the ambiance and service provided at the hotel.'

!insert (summerTravelToItaly, comment1) into ExpenseComment
!insert (summerTravelToItaly, comment2) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 8 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category boundary
```
!new Expense('boundaryCaseExpense')
!boundaryCaseExpense.amount := 0.00
!boundaryCaseExpense.startDate := Date('2023-10-01')
!boundaryCaseExpense.endDate := Date('2023-10-01')

!new Currency('japaneseYenBoundary')
!japaneseYenBoundary.name := 'Japanese Yen'
!japaneseYenBoundary.abbreviation := 'JPY'

!new Bill('dummyBill')
!dummyBill.amount := 100.00
!dummyBill.category := 'Utilities'
!dummyBill.date := Date('2023-10-01')
!dummyBill.paymentMethod := #CREDIT_CARD
!dummyBill.status := #DRAFT

!insert (dummyBill, japaneseYenBoundary) into BillCurrency
!insert (boundaryCaseExpense, dummyBill) into ExpenseContainsBills
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 15 | 0.00% |
| Multiplicities Errors | 0 | 2 | 0.00% |
| Invariants Errors | 1 | 2 | 50.00% |

| Invariants Errors | 
|---| 
```
checking invariant (1) `Expense::expenseSumOfBills': FAILED.
```

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category complex
```
!new Expense('octoberMonthlyExpense')
!octoberMonthlyExpense.amount := 800.00
!octoberMonthlyExpense.startDate := Date('2023-10-01')
!octoberMonthlyExpense.endDate := Date('2023-10-31')

!new Bill('groceryShopping')
!groceryShopping.amount := 250.00
!groceryShopping.category := 'Groceries'
!groceryShopping.date := Date('2023-10-02')
!groceryShopping.paymentMethod := #CREDIT_CARD
!groceryShopping.status := #VERIFIED

!new Bill('utilityPayment')
!utilityPayment.amount := 150.00
!utilityPayment.category := 'Utilities'
!utilityPayment.date := Date('2023-10-05')
!utilityPayment.paymentMethod := #CHECK
!utilityPayment.status := #PENDING

!new Bill('diningOut')
!diningOut.amount := 100.00
!diningOut.category := 'Entertainment'
!diningOut.date := Date('2023-10-15')
!diningOut.paymentMethod := #CASH
!diningOut.status := #VERIFIED

!new Bill('internetSubscription')
!internetSubscription.amount := 100.00
!internetSubscription.category := 'Internet and Communication'
!internetSubscription.date := Date('2023-10-20')
!internetSubscription.paymentMethod := #CREDIT_CARD
!internetSubscription.status := #VALIDATED

!new Bill('publicTransportRefill')
!publicTransportRefill.amount := 200.00
!publicTransportRefill.category := 'Transportation'
!publicTransportRefill.date := Date('2023-10-28')
!publicTransportRefill.paymentMethod := #CREDIT_CARD
!publicTransportRefill.status := #VERIFIED

!new Currency('australianDollar')
!australianDollar.name := 'Australian Dollar'
!australianDollar.abbreviation := 'AUD'

!insert (groceryShopping, australianDollar) into BillCurrency
!insert (utilityPayment, australianDollar) into BillCurrency
!insert (diningOut, australianDollar) into BillCurrency
!insert (internetSubscription, australianDollar) into BillCurrency
!insert (publicTransportRefill, australianDollar) into BillCurrency

!insert (octoberMonthlyExpense, groceryShopping) into ExpenseContainsBills
!insert (octoberMonthlyExpense, utilityPayment) into ExpenseContainsBills
!insert (octoberMonthlyExpense, diningOut) into ExpenseContainsBills
!insert (octoberMonthlyExpense, internetSubscription) into ExpenseContainsBills
!insert (octoberMonthlyExpense, publicTransportRefill) into ExpenseContainsBills

!new Comment('comment1')
!comment1.text := 'Reviewed and approved all transactions for groceries. Need to adjust expenditure next month.'

!new Comment('comment2')
!comment2.text := 'Utility payment pending confirmation from the service provider. Awaiting bill status update.'

!insert (octoberMonthlyExpense, comment1) into ExpenseComment
!insert (octoberMonthlyExpense, comment2) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 53 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category edge
```
!new Currency('usDollar')
!usDollar.name := 'US Dollar'
!usDollar.abbreviation := 'USD'

!new Currency('japaneseYen')
!japaneseYen.name := 'Japanese Yen'
!japaneseYen.abbreviation := 'JPY'

!new Currency('bitcoin')
!bitcoin.name := 'Bitcoin'
!bitcoin.abbreviation := 'BTC'

!new Bill('internationalFlights')
!internationalFlights.amount := 6000.00
!internationalFlights.category := 'International Flights'
!internationalFlights.date := Date('2023-01-01')
!internationalFlights.paymentMethod := #CREDIT_CARD
!internationalFlights.status := #VERIFIED

!new Bill('hotelAccommodationsTokyo')
!hotelAccommodationsTokyo.amount := 850000.00
!hotelAccommodationsTokyo.category := 'Hotel Accommodations - Tokyo'
!hotelAccommodationsTokyo.date := Date('2023-01-01')
!hotelAccommodationsTokyo.paymentMethod := #CHECK
!hotelAccommodationsTokyo.status := #VERIFIED

!new Bill('luxuryDining')
!luxuryDining.amount := 12000.00
!luxuryDining.category := 'Luxury Dining'
!luxuryDining.date := Date('2023-01-01')
!luxuryDining.paymentMethod := #CASH
!luxuryDining.status := #REFUNDED

!new Bill('travelInsurance')
!travelInsurance.amount := 1.50
!travelInsurance.category := 'Travel Insurance'
!travelInsurance.date := Date('2023-01-01')
!travelInsurance.paymentMethod := #CREDIT_CARD
!travelInsurance.status := #VERIFIED

!insert (internationalFlights, usDollar) into BillCurrency
!insert (hotelAccommodationsTokyo, japaneseYen) into BillCurrency
!insert (luxuryDining, usDollar) into BillCurrency
!insert (travelInsurance, bitcoin) into BillCurrency

!new Comment('comment1')
!comment1.text := 'Considerable expense due to unforeseen travel disruptions.'

!new Comment('comment2')
!comment2.text := 'Refund processed after itinerary adjustments.'

!new Comment('comment3')
!comment3.text := 'High expenses justified by strategic investment opportunities.'

!new Expense('corporateTravelExpense')
-- Assuming conversions and correct sum in USD
!corporateTravelExpense.amount := 182001.50

!corporateTravelExpense.startDate := Date('2023-01-01')
!corporateTravelExpense.endDate := Date('2023-12-31')

!insert (corporateTravelExpense, internationalFlights) into ExpenseContainsBills
!insert (corporateTravelExpense, hotelAccommodationsTokyo) into ExpenseContainsBills
!insert (corporateTravelExpense, luxuryDining) into ExpenseContainsBills
!insert (corporateTravelExpense, travelInsurance) into ExpenseContainsBills

!insert (corporateTravelExpense, comment1) into ExpenseComment
!insert (corporateTravelExpense, comment2) into ExpenseComment
!insert (corporateTravelExpense, comment3) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 54 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 1 | 2 | 50.00% |

| Invariants Errors | 
|---| 
```
checking invariant (1) `Expense::expenseSumOfBills': FAILED.
```

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category invalid
```
!new Expense('kyotoExplorationExpense')
!kyotoExplorationExpense.amount := 50000.00
!kyotoExplorationExpense.startDate := Date('2023-04-10')
!kyotoExplorationExpense.endDate := Date('2023-04-15')

!new Bill('kyotoAccommodation')
!kyotoAccommodation.amount := 20000.00
!kyotoAccommodation.category := 'Accommodation'
!kyotoAccommodation.date := Date('2023-04-10')
!kyotoAccommodation.paymentMethod := #CREDIT_CARD
!kyotoAccommodation.status := #VALIDATED

!new Bill('kyotoSightseeing')
!kyotoSightseeing.amount := 30000.00
!kyotoSightseeing.category := 'Sightseeing Tours'
!kyotoSightseeing.date := Date('2023-04-12')
!kyotoSightseeing.paymentMethod := #CASH
!kyotoSightseeing.status := #VERIFIED

!new Currency('japaneseYen')
!japaneseYen.name := 'Japanese Yen'
!japaneseYen.abbreviation := 'JPY'

!insert (kyotoAccommodation, japaneseYen) into BillCurrency
!insert (kyotoSightseeing, japaneseYen) into BillCurrency

!insert (kyotoExplorationExpense, kyotoAccommodation) into ExpenseContainsBills
!insert (kyotoExplorationExpense, kyotoSightseeing) into ExpenseContainsBills
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 4 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Generation 1 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 182 | 0.00% |
| Multiplicities Errors | 0 | 33 | 0.00% |
| Invariants Errors | 2 | 8 | 25.00% |

| Invariants Errors | 
|---| 
```
checking invariant (1) `Expense::expenseSumOfBills': FAILED.
```
```
checking invariant (1) `Expense::expenseSumOfBills': FAILED.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 4 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 5 | 0.00% |

# Generation 2
## Category baseline
```
!new Expense('tokyoBusinessConference')
!tokyoBusinessConference.amount := 1450.00
!tokyoBusinessConference.startDate := Date('2023-09-10')
!tokyoBusinessConference.endDate := Date('2023-09-14')

!new Bill('conferenceRegistration')
!conferenceRegistration.amount := 750.00
!conferenceRegistration.category := 'Professional Development'
!conferenceRegistration.date := Date('2023-08-15')
!conferenceRegistration.paymentMethod := #CREDIT_CARD
!conferenceRegistration.status := #VERIFIED

!new Bill('airlineTicketToTokyo')
!airlineTicketToTokyo.amount := 500.00
!airlineTicketToTokyo.category := 'Travel'
!airlineTicketToTokyo.date := Date('2023-08-30')
!airlineTicketToTokyo.paymentMethod := #CASH
!airlineTicketToTokyo.status := #PENDING

!new Bill('tokyoHotelStay')
!tokyoHotelStay.amount := 200.00
!tokyoHotelStay.category := 'Lodging'
!tokyoHotelStay.date := Date('2023-09-12')
!tokyoHotelStay.paymentMethod := #CHECK
!tokyoHotelStay.status := #VALIDATED

!new Currency('japaneseYen')
!japaneseYen.name := 'Japanese Yen'
!japaneseYen.abbreviation := 'JPY'

!insert (conferenceRegistration, japaneseYen) into BillCurrency
!insert (airlineTicketToTokyo, japaneseYen) into BillCurrency
!insert (tokyoHotelStay, japaneseYen) into BillCurrency

!insert (tokyoBusinessConference, conferenceRegistration) into ExpenseContainsBills
!insert (tokyoBusinessConference, airlineTicketToTokyo) into ExpenseContainsBills
!insert (tokyoBusinessConference, tokyoHotelStay) into ExpenseContainsBills

!new Comment('commentConference')
!commentConference.text := 'The conference was a valuable experience for meeting industry leaders and learning new trends.'

!new Comment('commentTransport')
!commentTransport.text := 'Despite the high costs, exploring public transport options provided significant savings and convenience.'

!insert (tokyoBusinessConference, commentConference) into ExpenseComment
!insert (tokyoBusinessConference, commentTransport) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 8 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category boundary
```
!new Expense('highValueCorporateExpense')
!highValueCorporateExpense.amount := 1000000.00
!highValueCorporateExpense.startDate := Date('2023-01-01')
!highValueCorporateExpense.endDate := Date('2023-01-15')

!new Bill('corporateInvestmentBill')
!corporateInvestmentBill.amount := 1000000.00
!corporateInvestmentBill.category := 'Corporate Investment'
!corporateInvestmentBill.date := Date('2023-01-01')
!corporateInvestmentBill.paymentMethod := #CHECK
!corporateInvestmentBill.status := #VERIFIED

!new Currency('britishPound')
!britishPound.name := 'British Pound'
!britishPound.abbreviation := 'GBP'

!insert (corporateInvestmentBill, britishPound) into BillCurrency

!insert (highValueCorporateExpense, corporateInvestmentBill) into ExpenseContainsBills

!new Comment('commentFinancialStrategy')
!commentFinancialStrategy.text := 'Annual Financial Strategy Payment'

!new Comment('commentVerifiedAccountant')
!commentVerifiedAccountant.text := 'Verified by Senior Accountant'

!insert (highValueCorporateExpense, commentFinancialStrategy) into ExpenseComment
!insert (highValueCorporateExpense, commentVerifiedAccountant) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 21 | 0.00% |
| Multiplicities Errors | 0 | 4 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category complex
```
!new Currency('euro')
!euro.name := 'Euro'
!euro.abbreviation := 'EUR'

!new Currency('swissFranc')
!swissFranc.name := 'Swiss Franc'
!swissFranc.abbreviation := 'CHF'

!new Expense('europeanBusinessTripExpense')
!europeanBusinessTripExpense.amount := 1250.00
!europeanBusinessTripExpense.startDate := Date('2023-08-01')
!europeanBusinessTripExpense.endDate := Date('2023-08-15')

!new Bill('hotelAccommodationParis')
!hotelAccommodationParis.amount := 600.00
!hotelAccommodationParis.category := 'Accommodation'
!hotelAccommodationParis.date := Date('2023-08-03')
!hotelAccommodationParis.paymentMethod := #CREDIT_CARD
!hotelAccommodationParis.status := #VALIDATED

!new Bill('trainTicketToZurich')
!trainTicketToZurich.amount := 150.00
!trainTicketToZurich.category := 'Transportation'
!trainTicketToZurich.date := Date('2023-08-05')
!trainTicketToZurich.paymentMethod := #CASH
!trainTicketToZurich.status := #VERIFIED

!new Bill('businessDinnerZurich')
!businessDinnerZurich.amount := 200.00
!businessDinnerZurich.category := 'Meals'
!businessDinnerZurich.date := Date('2023-08-07')
!businessDinnerZurich.paymentMethod := #CREDIT_CARD
!businessDinnerZurich.status := #PENDING

!new Bill('conferenceEntryFee')
!conferenceEntryFee.amount := 300.00
!conferenceEntryFee.category := 'Conference'
!conferenceEntryFee.date := Date('2023-08-09')
!conferenceEntryFee.paymentMethod := #CHECK
!conferenceEntryFee.status := #VERIFIED

!insert (hotelAccommodationParis, euro) into BillCurrency
!insert (trainTicketToZurich, euro) into BillCurrency
!insert (businessDinnerZurich, swissFranc) into BillCurrency
!insert (conferenceEntryFee, euro) into BillCurrency

!insert (europeanBusinessTripExpense, hotelAccommodationParis) into ExpenseContainsBills
!insert (europeanBusinessTripExpense, trainTicketToZurich) into ExpenseContainsBills
!insert (europeanBusinessTripExpense, businessDinnerZurich) into ExpenseContainsBills
!insert (europeanBusinessTripExpense, conferenceEntryFee) into ExpenseContainsBills

!new Comment('commentHotel')
!commentHotel.text := 'Hotel bill includes all amenities, satisfying experience. Will book the same for future visits.'

!new Comment('commentDinner')
!commentDinner.text := 'Pending the business dinner bill receipt confirmation, awaiting the venue\'s email.'

!new Comment('commentTransport')
!commentTransport.text := 'Explored alternative transport options, achieved cost efficiency with the train.'

!insert (europeanBusinessTripExpense, commentHotel) into ExpenseComment
!insert (europeanBusinessTripExpense, commentDinner) into ExpenseComment
!insert (europeanBusinessTripExpense, commentTransport) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 51 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category edge
```
!new Currency('euro')
!euro.name := 'Euro'
!euro.abbreviation := 'EUR'

!new Currency('britishPound')
!britishPound.name := 'British Pound'
!britishPound.abbreviation := 'GBP'

!new Currency('swissFranc')
!swissFranc.name := 'Swiss Franc'
!swissFranc.abbreviation := 'CHF'

!new Bill('monthlyHostelRent')
!monthlyHostelRent.amount := 350.00
!monthlyHostelRent.category := 'Monthly Hostel Rent'
!monthlyHostelRent.date := Date('2023-05-01')
!monthlyHostelRent.paymentMethod := #CASH
!monthlyHostelRent.status := #PENDING

!new Bill('textbooks')
!textbooks.amount := 60.00
!textbooks.category := 'Textbooks'
!textbooks.date := Date('2023-05-01')
!textbooks.paymentMethod := #CREDIT_CARD
!textbooks.status := #DRAFT

!new Bill('cafeteriaMeals')
!cafeteriaMeals.amount := 25.00
!cafeteriaMeals.category := 'Cafeteria Meals'
!cafeteriaMeals.date := Date('2023-05-01')
!cafeteriaMeals.paymentMethod := #CASH
!cafeteriaMeals.status := #VALIDATED

!new Bill('localTransport')
!localTransport.amount := 15.00
!localTransport.category := 'Local Transport'
!localTransport.date := Date('2023-05-01')
!localTransport.paymentMethod := #CREDIT_CARD
!localTransport.status := #VALIDATED

!new Bill('scholarshipGrant')
!scholarshipGrant.amount := 0.00
!scholarshipGrant.category := 'Scholarship Grant'
!scholarshipGrant.date := Date('2023-05-01')
!scholarshipGrant.paymentMethod := #CREDIT_CARD
!scholarshipGrant.status := #VALIDATED

!insert (monthlyHostelRent, euro) into BillCurrency
!insert (textbooks, britishPound) into BillCurrency
!insert (cafeteriaMeals, britishPound) into BillCurrency
!insert (localTransport, swissFranc) into BillCurrency
!insert (scholarshipGrant, euro) into BillCurrency

!new Comment('commentHostelReceipt')
!commentHostelReceipt.text := 'Pending verification of hostel receipts.'

!new Comment('commentTextbooks')
!commentTextbooks.text := 'Draft expenses for newly rented textbooks.'

!new Comment('commentMeals')
!commentMeals.text := 'Validated meal expenses for on-campus dining.'

!new Expense('studentExchangeProgramExpense')
!studentExchangeProgramExpense.amount := 450.00
!studentExchangeProgramExpense.startDate := Date('2023-05-01')
!studentExchangeProgramExpense.endDate := Date('2023-11-30')

!insert (studentExchangeProgramExpense, monthlyHostelRent) into ExpenseContainsBills
!insert (studentExchangeProgramExpense, textbooks) into ExpenseContainsBills
!insert (studentExchangeProgramExpense, cafeteriaMeals) into ExpenseContainsBills
!insert (studentExchangeProgramExpense, localTransport) into ExpenseContainsBills
!insert (studentExchangeProgramExpense, scholarshipGrant) into ExpenseContainsBills

!insert (studentExchangeProgramExpense, commentHostelReceipt) into ExpenseComment
!insert (studentExchangeProgramExpense, commentTextbooks) into ExpenseComment
!insert (studentExchangeProgramExpense, commentMeals) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 62 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category invalid
```
!new Expense('homeOfficeSetup')
!homeOfficeSetup.amount := 20000.00
!homeOfficeSetup.startDate := Date('2023-09-05')
!homeOfficeSetup.endDate := Date('2023-09-05')

!new Bill('officeFurniture')
!officeFurniture.amount := 10000.00
!officeFurniture.category := 'Office Furniture'
!officeFurniture.date := Date('2023-09-05')
!officeFurniture.paymentMethod := #CASH
!officeFurniture.status := #DRAFT

!new Bill('computerAccessories')
!computerAccessories.amount := 5000.00
!computerAccessories.category := 'Computer Accessories'
!computerAccessories.date := Date('2023-09-05')
!computerAccessories.paymentMethod := #CHECK
!computerAccessories.status := #PENDING

!new Currency('indianRupee')
!indianRupee.name := 'Indian Rupee'
!indianRupee.abbreviation := 'INR'

!insert (officeFurniture, indianRupee) into BillCurrency
!insert (computerAccessories, indianRupee) into BillCurrency

!insert (homeOfficeSetup, officeFurniture) into ExpenseContainsBills
!insert (homeOfficeSetup, computerAccessories) into ExpenseContainsBills

!new Comment('commentErgonomicFurniture')
!commentErgonomicFurniture.text := 'Investing in ergonomic furniture to boost productivity.'

!new Comment('commentRAM')
!commentRAM.text := 'Purchased additional RAM for smoother design workflow.'

!insert (homeOfficeSetup, commentErgonomicFurniture) into ExpenseComment
!insert (homeOfficeSetup, commentRAM) into ExpenseComment
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 6 | 0.00% |
| Invariants Errors (Not included on General) | 1 | 2 | 50.00% |

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (1) `Expense::expenseSumOfBills': FAILED.
```

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Generation 2 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 200 | 0.00% |
| Multiplicities Errors | 0 | 36 | 0.00% |
| Invariants Errors | 0 | 8 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 6 | 0.00% |
| Invariants Errors (Not included on General) | 1 | 2 | 50.00% |

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (1) `Expense::expenseSumOfBills': FAILED.
```

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 5 | 0.00% |

# Generation 3
## Category baseline
```
!new Expense('crossCountryFamilyVacation')
!crossCountryFamilyVacation.amount := 1850.00
!crossCountryFamilyVacation.startDate := Date('2023-07-20')
!crossCountryFamilyVacation.endDate := Date('2023-08-05')

!new Bill('gasolineAndTollFees')
!gasolineAndTollFees.amount := 400.00
!gasolineAndTollFees.category := 'Transportation'
!gasolineAndTollFees.date := Date('2023-07-21')
!gasolineAndTollFees.paymentMethod := #CASH
!gasolineAndTollFees.status := #VERIFIED

!new Bill('campgroundFees')
!campgroundFees.amount := 200.00
!campgroundFees.category := 'Accommodations'
!campgroundFees.date := Date('2023-07-23')
!campgroundFees.paymentMethod := #CREDIT_CARD
!campgroundFees.status := #REFUNDED

!new Bill('nationalParkEntryFee')
!nationalParkEntryFee.amount := 150.00
!nationalParkEntryFee.category := 'Entertainment'
!nationalParkEntryFee.date := Date('2023-07-27')
!nationalParkEntryFee.paymentMethod := #CHECK
!nationalParkEntryFee.status := #VALIDATED

!new Bill('familyDiningOut')
!familyDiningOut.amount := 350.00
!familyDiningOut.category := 'Food'
!familyDiningOut.date := Date('2023-07-30')
!familyDiningOut.paymentMethod := #CREDIT_CARD
!familyDiningOut.status := #VERIFIED

!new Bill('souvenirsAndGifts')
!souvenirsAndGifts.amount := 750.00
!souvenirsAndGifts.category := 'Shopping'
!souvenirsAndGifts.date := Date('2023-08-01')
!souvenirsAndGifts.paymentMethod := #CHECK
!souvenirsAndGifts.status := #PENDING

!new Currency('usDollar')
!usDollar.name := 'United States Dollar'
!usDollar.abbreviation := 'USD'

!insert (gasolineAndTollFees, usDollar) into BillCurrency
!insert (campgroundFees, usDollar) into BillCurrency
!insert (nationalParkEntryFee, usDollar) into BillCurrency
!insert (familyDiningOut, usDollar) into BillCurrency
!insert (souvenirsAndGifts, usDollar) into BillCurrency

!insert (crossCountryFamilyVacation, gasolineAndTollFees) into ExpenseContainsBills
!insert (crossCountryFamilyVacation, campgroundFees) into ExpenseContainsBills
!insert (crossCountryFamilyVacation, nationalParkEntryFee) into ExpenseContainsBills
!insert (crossCountryFamilyVacation, familyDiningOut) into ExpenseContainsBills
!insert (crossCountryFamilyVacation, souvenirsAndGifts) into ExpenseContainsBills

!new Comment('commentCampfire')
!commentCampfire.text := 'The kids loved the outdoor cooking and stargazing during our camping stops.'

!new Comment('commentFoodCulture')
!commentFoodCulture.text := 'Exploring local cuisines at various states added a rich flavor to our journey.'

!new Comment('commentDriving')
!commentDriving.text := 'Minimal hassle with the vehicle and service stations were incredibly friendly.'

!insert (crossCountryFamilyVacation, commentCampfire) into ExpenseComment
!insert (crossCountryFamilyVacation, commentFoodCulture) into ExpenseComment
!insert (crossCountryFamilyVacation, commentDriving) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 56 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category boundary
```
!new Expense('minimalTransactionExpense')
!minimalTransactionExpense.amount := 0.01
!minimalTransactionExpense.startDate := Date('2023-11-15')
!minimalTransactionExpense.endDate := Date('2023-11-15')

!new Bill('minimalAmountBill')
!minimalAmountBill.amount := 0.01
!minimalAmountBill.category := 'Digital Services'
!minimalAmountBill.date := Date('2023-11-15')
!minimalAmountBill.paymentMethod := #CASH
!minimalAmountBill.status := #REFUSED

!new Currency('canadianDollar')
!canadianDollar.name := 'Canadian Dollar'
!canadianDollar.abbreviation := 'CAD'

!insert (minimalAmountBill, canadianDollar) into BillCurrency

!insert (minimalTransactionExpense, minimalAmountBill) into ExpenseContainsBills

!new Comment('commentMinimalTransaction')
!commentMinimalTransaction.text := 'Minimal Transaction Test'

!new Comment('commentRefusedTransaction')
!commentRefusedTransaction.text := 'Refused Due to Insufficient Funds'

!new Comment('commentTimestampAudit')
!commentTimestampAudit.text := 'Timestamped for Audit'

!insert (minimalTransactionExpense, commentMinimalTransaction) into ExpenseComment
!insert (minimalTransactionExpense, commentRefusedTransaction) into ExpenseComment
!insert (minimalTransactionExpense, commentTimestampAudit) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 24 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category complex
```
!new Currency('chineseYuan')
!chineseYuan.name := 'Chinese Yuan'
!chineseYuan.abbreviation := 'CNY'

!new Expense('lunarNewYearCelebrationExpense')
!lunarNewYearCelebrationExpense.amount := 5000.00
!lunarNewYearCelebrationExpense.startDate := Date('2023-01-10')
!lunarNewYearCelebrationExpense.endDate := Date('2023-01-30')

!new Bill('newYearDecorations')
!newYearDecorations.amount := 800.00
!newYearDecorations.category := 'Decoration'
!newYearDecorations.date := Date('2023-01-12')
!newYearDecorations.paymentMethod := #CASH
!newYearDecorations.status := #VERIFIED

!new Bill('familyReunionDinner')
!familyReunionDinner.amount := 2000.00
!familyReunionDinner.category := 'Meals'
!familyReunionDinner.date := Date('2023-01-21')
!familyReunionDinner.paymentMethod := #CREDIT_CARD
!familyReunionDinner.status := #VALIDATED

!new Bill('traditionalClothesPurchase')
!traditionalClothesPurchase.amount := 1200.00
!traditionalClothesPurchase.category := 'Clothing'
!traditionalClothesPurchase.date := Date('2023-01-15')
!traditionalClothesPurchase.paymentMethod := #CREDIT_CARD
!traditionalClothesPurchase.status := #VERIFIED

!new Bill('redEnvelopes')
!redEnvelopes.amount := 1000.00
!redEnvelopes.category := 'Gifts'
!redEnvelopes.date := Date('2023-01-22')
!redEnvelopes.paymentMethod := #CHECK
!redEnvelopes.status := #DRAFT

!insert (newYearDecorations, chineseYuan) into BillCurrency
!insert (familyReunionDinner, chineseYuan) into BillCurrency
!insert (traditionalClothesPurchase, chineseYuan) into BillCurrency
!insert (redEnvelopes, chineseYuan) into BillCurrency

!insert (lunarNewYearCelebrationExpense, newYearDecorations) into ExpenseContainsBills
!insert (lunarNewYearCelebrationExpense, familyReunionDinner) into ExpenseContainsBills
!insert (lunarNewYearCelebrationExpense, traditionalClothesPurchase) into ExpenseContainsBills
!insert (lunarNewYearCelebrationExpense, redEnvelopes) into ExpenseContainsBills

!new Comment('commentDecorations')
!commentDecorations.text := 'All decorations followed traditional designs, added a special touch to the home.'

!new Comment('commentDinner')
!commentDinner.text := 'The family dinner was a success, everyone enjoyed the meal and ambiance.'

!new Comment('commentClothes')
!commentClothes.text := 'Shopping for clothes during the festival was vibrant but crowded, need to plan better next year.'

!insert (lunarNewYearCelebrationExpense, commentDecorations) into ExpenseComment
!insert (lunarNewYearCelebrationExpense, commentDinner) into ExpenseComment
!insert (lunarNewYearCelebrationExpense, commentClothes) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 53 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category edge
```
!new Currency('canadianDollar')
!canadianDollar.name := 'Canadian Dollar'
!canadianDollar.abbreviation := 'CAD'

!new Currency('australianDollar')
!australianDollar.name := 'Australian Dollar'
!australianDollar.abbreviation := 'AUD'

!new Currency('indianRupee')
!indianRupee.name := 'Indian Rupee'
!indianRupee.abbreviation := 'INR'

!new Bill('workshopVenueHire')
!workshopVenueHire.amount := 1000.00
!workshopVenueHire.category := 'Workshop Venue Hire'
!workshopVenueHire.date := Date('2023-03-15')
!workshopVenueHire.paymentMethod := #CREDIT_CARD
!workshopVenueHire.status := #DRAFT

!new Bill('educationalMaterials')
!educationalMaterials.amount := 150.00
!educationalMaterials.category := 'Educational Materials'
!educationalMaterials.date := Date('2023-03-15')
!educationalMaterials.paymentMethod := #CASH
!educationalMaterials.status := #PENDING

!new Bill('volunteerAccommodation')
!volunteerAccommodation.amount := 200.00
!volunteerAccommodation.category := 'Volunteer Accommodation'
!volunteerAccommodation.date := Date('2023-03-15')
!volunteerAccommodation.paymentMethod := #CREDIT_CARD
!volunteerAccommodation.status := #REFUSED

!new Bill('localCateringServices')
!localCateringServices.amount := 15000.00
!localCateringServices.category := 'Local Catering Services'
!localCateringServices.date := Date('2023-03-15')
!localCateringServices.paymentMethod := #CASH
!localCateringServices.status := #PENDING

!new Bill('transportationParticipants')
!transportationParticipants.amount := 300.00
!transportationParticipants.category := 'Transportation for Participants'
!transportationParticipants.date := Date('2023-03-15')
!transportationParticipants.paymentMethod := #CREDIT_CARD
!transportationParticipants.status := #DRAFT

!insert (workshopVenueHire, canadianDollar) into BillCurrency
!insert (educationalMaterials, australianDollar) into BillCurrency
!insert (volunteerAccommodation, canadianDollar) into BillCurrency
!insert (localCateringServices, indianRupee) into BillCurrency
!insert (transportationParticipants, australianDollar) into BillCurrency

!new Expense('workshopExpenses')
-- Converting amounts to a common currency and ensuring the total amount is correct
!workshopExpenses.amount := 16650.00
!workshopExpenses.startDate := Date('2023-03-15')
!workshopExpenses.endDate := Date('2023-06-20')

!insert (workshopExpenses, workshopVenueHire) into ExpenseContainsBills
!insert (workshopExpenses, educationalMaterials) into ExpenseContainsBills
!insert (workshopExpenses, volunteerAccommodation) into ExpenseContainsBills
!insert (workshopExpenses, localCateringServices) into ExpenseContainsBills
!insert (workshopExpenses, transportationParticipants) into ExpenseContainsBills

!new Comment('commentVenueBoardApproval')
!commentVenueBoardApproval.text := 'Venue expenses awaiting board approval.'

!new Comment('commentMaterialsReview')
!commentMaterialsReview.text := 'Review pending materials expenditure.'

!new Comment('commentAccommodationBudget')
!commentAccommodationBudget.text := 'Accommodation costs exceeding budget needs.'

!new Comment('commentCateringPartners')
!commentCateringPartners.text := 'Catering handled by local partners, currency fluctuations noted.'

!insert (workshopExpenses, commentVenueBoardApproval) into ExpenseComment
!insert (workshopExpenses, commentMaterialsReview) into ExpenseComment
!insert (workshopExpenses, commentAccommodationBudget) into ExpenseComment
!insert (workshopExpenses, commentCateringPartners) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 65 | 0.00% |
| Multiplicities Errors | 0 | 14 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category invalid
```
!new Expense('culinaryWorkshopExpense')
!culinaryWorkshopExpense.amount := 350.00
!culinaryWorkshopExpense.startDate := Date('2023-03-01')
!culinaryWorkshopExpense.endDate := Date('2023-03-03')

!new Bill('workshopFee')
!workshopFee.amount := 250.00
!workshopFee.category := 'Workshop Fee'
!workshopFee.date := Date('2023-03-01')
!workshopFee.paymentMethod := #CREDIT_CARD
!workshopFee.status := #VERIFIED

!new Bill('cookingSupplies')
!cookingSupplies.amount := 100.00
!cookingSupplies.category := 'Cooking Supplies'
!cookingSupplies.date := Date('2023-03-02')
!cookingSupplies.paymentMethod := #CASH
!cookingSupplies.status := #VERIFIED

!new Bill('placeholderEntry')
!placeholderEntry.amount := 0.00
!placeholderEntry.category := 'Placeholder Entry'
!placeholderEntry.date := Date('2023-03-03')
!placeholderEntry.paymentMethod := #CHECK
!placeholderEntry.status := #DRAFT

!new Currency('euro')
!euro.name := 'Euro'
!euro.abbreviation := 'EUR'

!insert (workshopFee, euro) into BillCurrency
!insert (cookingSupplies, euro) into BillCurrency
!insert (placeholderEntry, euro) into BillCurrency

!insert (culinaryWorkshopExpense, workshopFee) into ExpenseContainsBills
!insert (culinaryWorkshopExpense, cookingSupplies) into ExpenseContainsBills
!insert (culinaryWorkshopExpense, placeholderEntry) into ExpenseContainsBills

!new Comment('commentWorkshop')
!commentWorkshop.text := 'Attending the workshop exceeded expectations but was worth every cent!'

!insert (culinaryWorkshopExpense, commentWorkshop) into ExpenseComment
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 7 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Generation 3 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 232 | 0.00% |
| Multiplicities Errors | 0 | 43 | 0.00% |
| Invariants Errors | 0 | 8 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 7 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 5 | 0.00% |

# Generation 4
## Category baseline
```
!new Expense('traditionalWeddingCeremony')
!traditionalWeddingCeremony.amount := 2500.00
!traditionalWeddingCeremony.startDate := Date('2023-11-10')
!traditionalWeddingCeremony.endDate := Date('2023-11-12')

!new Bill('venueRental')
!venueRental.amount := 1000.00
!venueRental.category := 'Event'
!venueRental.date := Date('2023-10-05')
!venueRental.paymentMethod := #CHECK
!venueRental.status := #VERIFIED

!new Bill('cateringServices')
!cateringServices.amount := 750.00
!cateringServices.category := 'Food'
!cateringServices.date := Date('2023-11-11')
!cateringServices.paymentMethod := #CREDIT_CARD
!cateringServices.status := #VALIDATED

!new Bill('photographyVideography')
!photographyVideography.amount := 500.00
!photographyVideography.category := 'Services'
!photographyVideography.date := Date('2023-11-12')
!photographyVideography.paymentMethod := #CASH
!photographyVideography.status := #DRAFT

!new Bill('traditionalAttireAccessories')
!traditionalAttireAccessories.amount := 250.00
!traditionalAttireAccessories.category := 'Clothing'
!traditionalAttireAccessories.date := Date('2023-10-20')
!traditionalAttireAccessories.paymentMethod := #CASH
!traditionalAttireAccessories.status := #REFUSED

!new Currency('indianRupee')
!indianRupee.name := 'Indian Rupee'
!indianRupee.abbreviation := 'INR'

!insert (venueRental, indianRupee) into BillCurrency
!insert (cateringServices, indianRupee) into BillCurrency
!insert (photographyVideography, indianRupee) into BillCurrency
!insert (traditionalAttireAccessories, indianRupee) into BillCurrency

!insert (traditionalWeddingCeremony, venueRental) into ExpenseContainsBills
!insert (traditionalWeddingCeremony, cateringServices) into ExpenseContainsBills
!insert (traditionalWeddingCeremony, photographyVideography) into ExpenseContainsBills
!insert (traditionalWeddingCeremony, traditionalAttireAccessories) into ExpenseContainsBills

!new Comment('commentVenueDecor')
!commentVenueDecor.text := 'The location added a majestic touch to the wedding, with traditional Indian decor.'

!new Comment('commentCulinaryExperience')
!commentCulinaryExperience.text := 'Guests raved about the variety of dishes, bringing authentic flavors to every table.'

!new Comment('commentPhotography')
!commentPhotography.text := 'The team did an excellent job capturing candid moments and details.'

!insert (traditionalWeddingCeremony, commentVenueDecor) into ExpenseComment
!insert (traditionalWeddingCeremony, commentCulinaryExperience) into ExpenseComment
!insert (traditionalWeddingCeremony, commentPhotography) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 48 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category boundary
```
!new Currency('euro')
!euro.name := 'Euro'
!euro.abbreviation := 'EUR'

!new Expense('juneMonthlyExpense')
!juneMonthlyExpense.amount := 5000.00
!juneMonthlyExpense.startDate := Date('2023-06-01')
!juneMonthlyExpense.endDate := Date('2023-06-30')

!new Bill('travelBill')
!travelBill.amount := 2000.00
!travelBill.category := 'Travel'
!travelBill.date := Date('2023-06-05')
!travelBill.paymentMethod := #CREDIT_CARD
!travelBill.status := #VALIDATED

!new Bill('accommodationsBill')
!accommodationsBill.amount := 3000.00
!accommodationsBill.category := 'Accommodations'
!accommodationsBill.date := Date('2023-06-28')
!accommodationsBill.paymentMethod := #CHECK
!accommodationsBill.status := #VERIFIED

!insert (travelBill, euro) into BillCurrency
!insert (accommodationsBill, euro) into BillCurrency

!insert (juneMonthlyExpense, travelBill) into ExpenseContainsBills
!insert (juneMonthlyExpense, accommodationsBill) into ExpenseContainsBills

!new Comment('commentQuarterReview')
!commentQuarterReview.text := 'Expenses for June Quarter Review'

!new Comment('commentBusinessTrip')
!commentBusinessTrip.text := 'Travel and stay for business trip to Germany'

!new Comment('commentPaymentSchedule')
!commentPaymentSchedule.text := 'Managed payment schedule successfully'

!insert (juneMonthlyExpense, commentQuarterReview) into ExpenseComment
!insert (juneMonthlyExpense, commentBusinessTrip) into ExpenseComment
!insert (juneMonthlyExpense, commentPaymentSchedule) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 32 | 0.00% |
| Multiplicities Errors | 0 | 7 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category complex
```
!new Currency('indianRupee')
!indianRupee.name := 'Indian Rupee'
!indianRupee.abbreviation := 'INR'

!new Expense('weddingAnniversaryCelebrationExpense')
!weddingAnniversaryCelebrationExpense.amount := 75000.00
!weddingAnniversaryCelebrationExpense.startDate := Date('2023-11-05')
!weddingAnniversaryCelebrationExpense.endDate := Date('2023-11-30')

!new Bill('anniversaryDinnerAtTaj')
!anniversaryDinnerAtTaj.amount := 25000.00
!anniversaryDinnerAtTaj.category := 'Dining'
!anniversaryDinnerAtTaj.date := Date('2023-11-09')
!anniversaryDinnerAtTaj.paymentMethod := #CREDIT_CARD
!anniversaryDinnerAtTaj.status := #VALIDATED

!new Bill('weekendGetawayToKerala')
!weekendGetawayToKerala.amount := 30000.00
!weekendGetawayToKerala.category := 'Travel'
!weekendGetawayToKerala.date := Date('2023-11-15')
!weekendGetawayToKerala.paymentMethod := #CHECK
!weekendGetawayToKerala.status := #VERIFIED

!new Bill('jewelryGiftForSpouse')
!jewelryGiftForSpouse.amount := 15000.00
!jewelryGiftForSpouse.category := 'Gifts'
!jewelryGiftForSpouse.date := Date('2023-11-10')
!jewelryGiftForSpouse.paymentMethod := #CASH
!jewelryGiftForSpouse.status := #VERIFIED

!new Bill('romanticPhotoshoot')
!romanticPhotoshoot.amount := 5000.00
!romanticPhotoshoot.category := 'Photography'
!romanticPhotoshoot.date := Date('2023-11-20')
!romanticPhotoshoot.paymentMethod := #CREDIT_CARD
!romanticPhotoshoot.status := #VERIFIED

!insert (anniversaryDinnerAtTaj, indianRupee) into BillCurrency
!insert (weekendGetawayToKerala, indianRupee) into BillCurrency
!insert (jewelryGiftForSpouse, indianRupee) into BillCurrency
!insert (romanticPhotoshoot, indianRupee) into BillCurrency

!insert (weddingAnniversaryCelebrationExpense, anniversaryDinnerAtTaj) into ExpenseContainsBills
!insert (weddingAnniversaryCelebrationExpense, weekendGetawayToKerala) into ExpenseContainsBills
!insert (weddingAnniversaryCelebrationExpense, jewelryGiftForSpouse) into ExpenseContainsBills
!insert (weddingAnniversaryCelebrationExpense, romanticPhotoshoot) into ExpenseContainsBills

!new Comment('commentTajDinner')
!commentTajDinner.text := 'Taj dinner exceeded expectations; ambiance was superb, a night to remember.'

!new Comment('commentGetaway')
!commentGetaway.text := 'Getaway was relaxing and picturesque, great choice for celebrating a milestone.'

!new Comment('commentPhotoshoot')
!commentPhotoshoot.text := 'Photoshoot captured unforgettable moments, a perfect keepsake.'

!insert (weddingAnniversaryCelebrationExpense, commentTajDinner) into ExpenseComment
!insert (weddingAnniversaryCelebrationExpense, commentGetaway) into ExpenseComment
!insert (weddingAnniversaryCelebrationExpense, commentPhotoshoot) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 48 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category edge
```
!new Currency('euro')
!euro.name := 'Euro'
!euro.abbreviation := 'EUR'

!new Currency('mexicanPeso')
!mexicanPeso.name := 'Mexican Peso'
!mexicanPeso.abbreviation := 'MXN'

!new Currency('virtualCoin')
!virtualCoin.name := 'Virtual Coin'
!virtualCoin.abbreviation := 'VRC'

!new Bill('gallerySpaceRental')
!gallerySpaceRental.amount := 2500.00
!gallerySpaceRental.category := 'Gallery Space Rental'
!gallerySpaceRental.date := Date('2023-08-01')
!gallerySpaceRental.paymentMethod := #CREDIT_CARD
!gallerySpaceRental.status := #VALIDATED

!new Bill('artSupplies')
!artSupplies.amount := 500.00
!artSupplies.category := 'Art Supplies'
!artSupplies.date := Date('2023-08-01')
!artSupplies.paymentMethod := #CASH
!artSupplies.status := #REFUSED

!new Bill('digitalExhibitionPlatformSubscription')
!digitalExhibitionPlatformSubscription.amount := 75.00
!digitalExhibitionPlatformSubscription.category := 'Digital Exhibition Platform Subscription'
!digitalExhibitionPlatformSubscription.date := Date('2023-08-01')
!digitalExhibitionPlatformSubscription.paymentMethod := #CASH
!digitalExhibitionPlatformSubscription.status := #VALIDATED

!new Bill('marketingPromotion')
!marketingPromotion.amount := 1000.00
!marketingPromotion.category := 'Marketing and Promotion'
!marketingPromotion.date := Date('2023-08-01')
!marketingPromotion.paymentMethod := #CREDIT_CARD
!marketingPromotion.status := #VERIFIED

!new Bill('craftWorkshopMaterials')
!craftWorkshopMaterials.amount := 150.00
!craftWorkshopMaterials.category := 'Craft Workshop Materials'
!craftWorkshopMaterials.date := Date('2023-08-01')
!craftWorkshopMaterials.paymentMethod := #CREDIT_CARD
!craftWorkshopMaterials.status := #VERIFIED

!insert (gallerySpaceRental, euro) into BillCurrency
!insert (artSupplies, mexicanPeso) into BillCurrency
!insert (digitalExhibitionPlatformSubscription, virtualCoin) into BillCurrency
!insert (marketingPromotion, euro) into BillCurrency
!insert (craftWorkshopMaterials, virtualCoin) into BillCurrency

!new Expense('artistsCooperativeProjectExpenses')
-- Correct total amount reflects only validated and verified expenses
-- Make sure to include all bills to satisfy multiplicity
!artistsCooperativeProjectExpenses.amount := 3725.00
!artistsCooperativeProjectExpenses.startDate := Date('2023-08-01')
!artistsCooperativeProjectExpenses.endDate := Date('2023-12-31')

!insert (artistsCooperativeProjectExpenses, gallerySpaceRental) into ExpenseContainsBills
!insert (artistsCooperativeProjectExpenses, artSupplies) into ExpenseContainsBills
!insert (artistsCooperativeProjectExpenses, digitalExhibitionPlatformSubscription) into ExpenseContainsBills
!insert (artistsCooperativeProjectExpenses, marketingPromotion) into ExpenseContainsBills
!insert (artistsCooperativeProjectExpenses, craftWorkshopMaterials) into ExpenseContainsBills

!new Comment('commentValidatedRental')
!commentValidatedRental.text := 'Validated rental expenses for the exhibition.'

!new Comment('commentRefusedArtSupplies')
!commentRefusedArtSupplies.text := 'Refused art supplies purchase due to quality concerns.'

!new Comment('commentSubscriptionConfirmed')
!commentSubscriptionConfirmed.text := 'Subscription for virtual platform confirmed for entire project duration.'

!new Comment('commentPromotionalActivities')
!commentPromotionalActivities.text := 'Promotional activities extended due to increased artist participation.'

!insert (artistsCooperativeProjectExpenses, commentValidatedRental) into ExpenseComment
!insert (artistsCooperativeProjectExpenses, commentRefusedArtSupplies) into ExpenseComment
!insert (artistsCooperativeProjectExpenses, commentSubscriptionConfirmed) into ExpenseComment
!insert (artistsCooperativeProjectExpenses, commentPromotionalActivities) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 65 | 0.00% |
| Multiplicities Errors | 0 | 14 | 0.00% |
| Invariants Errors | 1 | 2 | 50.00% |

| Invariants Errors | 
|---| 
```
checking invariant (1) `Expense::expenseSumOfBills': FAILED.
```

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category invalid
```
!new Currency('brazilianReal')
!brazilianReal.name := 'Brazilian Real'
!brazilianReal.abbreviation := 'BRL'

!new Expense('conferenceTravelExpense')
!conferenceTravelExpense.amount := 550.00
!conferenceTravelExpense.startDate := Date('2023-05-15')
!conferenceTravelExpense.endDate := Date('2023-05-20')

!new Bill('conferenceRegistration')
!conferenceRegistration.amount := 300.00
!conferenceRegistration.category := 'Conference Registration'
!conferenceRegistration.date := Date('2023-05-15')
!conferenceRegistration.paymentMethod := #CREDIT_CARD
!conferenceRegistration.status := #VALIDATED

!new Bill('transportation')
!transportation.amount := 150.00
!transportation.category := 'Transportation'
!transportation.date := Date('2023-05-18')
!transportation.paymentMethod := #CASH
!transportation.status := #REFUSED

!new Bill('meals')
!meals.amount := 100.00
!meals.category := 'Meals'
!meals.date := Date('2023-05-20')
!meals.paymentMethod := #CHECK
!meals.status := #VERIFIED

!insert (conferenceRegistration, brazilianReal) into BillCurrency
!insert (transportation, brazilianReal) into BillCurrency
!insert (meals, brazilianReal) into BillCurrency

!insert (conferenceTravelExpense, conferenceRegistration) into ExpenseContainsBills
!insert (conferenceTravelExpense, transportation) into ExpenseContainsBills
!insert (conferenceTravelExpense, meals) into ExpenseContainsBills

!new Comment('commentConference')
!commentConference.text := 'Conference was insightful, and the networking was invaluable.'

!insert (conferenceTravelExpense, commentConference) into ExpenseComment
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 7 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Generation 4 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 227 | 0.00% |
| Multiplicities Errors | 0 | 43 | 0.00% |
| Invariants Errors | 1 | 8 | 12.50% |

| Invariants Errors | 
|---| 
```
checking invariant (1) `Expense::expenseSumOfBills': FAILED.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 7 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 5 | 0.00% |

# Generation 5
## Category baseline
```
!new Currency('australianDollar')
!australianDollar.name := 'Australian Dollar'
!australianDollar.abbreviation := 'AUD'

!new Expense('scienceFairProjectExpenses')
!scienceFairProjectExpenses.amount := 600.00
!scienceFairProjectExpenses.startDate := Date('2023-03-01')
!scienceFairProjectExpenses.endDate := Date('2023-03-15')

!new Bill('materialsAndSupplies')
!materialsAndSupplies.amount := 250.00
!materialsAndSupplies.category := 'Supplies'
!materialsAndSupplies.date := Date('2023-02-20')
!materialsAndSupplies.paymentMethod := #CREDIT_CARD
!materialsAndSupplies.status := #VERIFIED

!new Bill('printingAndPosters')
!printingAndPosters.amount := 100.00
!printingAndPosters.category := 'Stationery'
!printingAndPosters.date := Date('2023-02-25')
!printingAndPosters.paymentMethod := #CASH
!printingAndPosters.status := #VERIFIED

!new Bill('entryFee')
!entryFee.amount := 50.00
!entryFee.category := 'Event'
!entryFee.date := Date('2023-03-01')
!entryFee.paymentMethod := #CHECK
!entryFee.status := #VALIDATED

!new Bill('refreshmentsForPresenters')
!refreshmentsForPresenters.amount := 200.00
!refreshmentsForPresenters.category := 'Food'
!refreshmentsForPresenters.date := Date('2023-03-10')
!refreshmentsForPresenters.paymentMethod := #CREDIT_CARD
!refreshmentsForPresenters.status := #PENDING

!insert (materialsAndSupplies, australianDollar) into BillCurrency
!insert (printingAndPosters, australianDollar) into BillCurrency
!insert (entryFee, australianDollar) into BillCurrency
!insert (refreshmentsForPresenters, australianDollar) into BillCurrency

!insert (scienceFairProjectExpenses, materialsAndSupplies) into ExpenseContainsBills
!insert (scienceFairProjectExpenses, printingAndPosters) into ExpenseContainsBills
!insert (scienceFairProjectExpenses, entryFee) into ExpenseContainsBills
!insert (scienceFairProjectExpenses, refreshmentsForPresenters) into ExpenseContainsBills

!new Comment('commentEcoFriendlyMaterials')
!commentEcoFriendlyMaterials.text := 'Managed to get all required materials within budget with an emphasis on sustainability.'

!new Comment('commentPosters')
!commentPosters.text := 'The design and print quality of the posters drew in a lot of attention from attendees.'

!new Comment('commentFeedback')
!commentFeedback.text := 'The project presentation was well-received, with positive feedback on both content and delivery.'

!insert (scienceFairProjectExpenses, commentEcoFriendlyMaterials) into ExpenseComment
!insert (scienceFairProjectExpenses, commentPosters) into ExpenseComment
!insert (scienceFairProjectExpenses, commentFeedback) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 48 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category boundary
```
!new Currency('australianDollar')
!australianDollar.name := 'Australian Dollar'
!australianDollar.abbreviation := 'AUD'

!new Expense('decemberExpense')
!decemberExpense.amount := 250.75
!decemberExpense.startDate := Date('2023-12-01')
!decemberExpense.endDate := Date('2023-12-31')

!new Bill('entertainmentEvent')
!entertainmentEvent.amount := 75.25
!entertainmentEvent.category := 'Entertainment'
!entertainmentEvent.date := Date('2023-12-10')
!entertainmentEvent.paymentMethod := #CASH
!entertainmentEvent.status := #DRAFT

!new Bill('holidayGifts')
!holidayGifts.amount := 175.50
!holidayGifts.category := 'Gifts'
!holidayGifts.date := Date('2023-12-20')
!holidayGifts.paymentMethod := #CREDIT_CARD
!holidayGifts.status := #VALIDATED

!insert (entertainmentEvent, australianDollar) into BillCurrency
!insert (holidayGifts, australianDollar) into BillCurrency

!insert (decemberExpense, entertainmentEvent) into ExpenseContainsBills
!insert (decemberExpense, holidayGifts) into ExpenseContainsBills

!new Comment('commentEntertainmentGiftsPlanning')
!commentEntertainmentGiftsPlanning.text := 'December entertainment and gift planning'

!new Comment('commentClubMembershipGifts')
!commentClubMembershipGifts.text := 'Expenses include annual club membership and gift purchases'

!new Comment('commentYearEndBudget')
!commentYearEndBudget.text := 'Monitored year-end budget constraints'

!insert (decemberExpense, commentEntertainmentGiftsPlanning) into ExpenseComment
!insert (decemberExpense, commentClubMembershipGifts) into ExpenseComment
!insert (decemberExpense, commentYearEndBudget) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 32 | 0.00% |
| Multiplicities Errors | 0 | 7 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category complex
```
!new Currency('mexicanPeso')
!mexicanPeso.name := 'Mexican Peso'
!mexicanPeso.abbreviation := 'MXN'

!new Expense('homeRenovationProjectExpense')
!homeRenovationProjectExpense.amount := 250000.00
!homeRenovationProjectExpense.startDate := Date('2023-03-01')
!homeRenovationProjectExpense.endDate := Date('2023-03-31')

!new Bill('constructionMaterials')
!constructionMaterials.amount := 100000.00
!constructionMaterials.category := 'Construction'
!constructionMaterials.date := Date('2023-03-05')
!constructionMaterials.paymentMethod := #CHECK
!constructionMaterials.status := #VERIFIED

!new Bill('interiorDesignServices')
!interiorDesignServices.amount := 50000.00
!interiorDesignServices.category := 'Design'
!interiorDesignServices.date := Date('2023-03-10')
!interiorDesignServices.paymentMethod := #CREDIT_CARD
!interiorDesignServices.status := #VALIDATED

!new Bill('furniturePurchase')
!furniturePurchase.amount := 60000.00
!furniturePurchase.category := 'Furnishing'
!furniturePurchase.date := Date('2023-03-15')
!furniturePurchase.paymentMethod := #CASH
!furniturePurchase.status := #VERIFIED

!new Bill('landscapingGardenSetup')
!landscapingGardenSetup.amount := 40000.00
!landscapingGardenSetup.category := 'Landscaping'
!landscapingGardenSetup.date := Date('2023-03-25')
!landscapingGardenSetup.paymentMethod := #CREDIT_CARD
!landscapingGardenSetup.status := #VERIFIED

!insert (constructionMaterials, mexicanPeso) into BillCurrency
!insert (interiorDesignServices, mexicanPeso) into BillCurrency
!insert (furniturePurchase, mexicanPeso) into BillCurrency
!insert (landscapingGardenSetup, mexicanPeso) into BillCurrency

!insert (homeRenovationProjectExpense, constructionMaterials) into ExpenseContainsBills
!insert (homeRenovationProjectExpense, interiorDesignServices) into ExpenseContainsBills
!insert (homeRenovationProjectExpense, furniturePurchase) into ExpenseContainsBills
!insert (homeRenovationProjectExpense, landscapingGardenSetup) into ExpenseContainsBills

!new Comment('commentConstructionPhase')
!commentConstructionPhase.text := 'Construction phase progressed smoothly, materials were top quality.'

!new Comment('commentDesignServices')
!commentDesignServices.text := 'Design services added a modern touch, very satisfied with the aesthetics.'

!new Comment('commentFurnitureDelivery')
!commentFurnitureDelivery.text := 'Furniture delivery was timely, fits perfectly with the new interiors.'

!new Comment('commentLandscapingTransformation')
!commentLandscapingTransformation.text := 'Landscaping transformed the exterior, received numerous compliments from neighbors.'

!insert (homeRenovationProjectExpense, commentConstructionPhase) into ExpenseComment
!insert (homeRenovationProjectExpense, commentDesignServices) into ExpenseComment
!insert (homeRenovationProjectExpense, commentFurnitureDelivery) into ExpenseComment
!insert (homeRenovationProjectExpense, commentLandscapingTransformation) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 51 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category edge
```
!new Currency('japaneseYen')
!japaneseYen.name := 'Japanese Yen'
!japaneseYen.abbreviation := 'JPY'

!new Currency('britishPound')
!britishPound.name := 'British Pound'
!britishPound.abbreviation := 'GBP'

!new Currency('canadianDollar')
!canadianDollar.name := 'Canadian Dollar'
!canadianDollar.abbreviation := 'CAD'

!new Bill('conferenceVenueRental')
!conferenceVenueRental.amount := 250000.00
!conferenceVenueRental.category := 'Conference Venue Rental'
!conferenceVenueRental.date := Date('2023-10-15')
!conferenceVenueRental.paymentMethod := #CHECK
!conferenceVenueRental.status := #PENDING

!new Bill('speakerHonorariums')
!speakerHonorariums.amount := 5000.00
!speakerHonorariums.category := 'Speaker Honorariums'
!speakerHonorariums.date := Date('2023-10-15')
!speakerHonorariums.paymentMethod := #CASH
!speakerHonorariums.status := #VALIDATED

!new Bill('cateringServices')
!cateringServices.amount := 1200.00
!cateringServices.category := 'Catering Services'
!cateringServices.date := Date('2023-10-15')
!cateringServices.paymentMethod := #CHECK
!cateringServices.status := #VERIFIED

!new Bill('administrativeSupplies')
!administrativeSupplies.amount := 750.00
!administrativeSupplies.category := 'Administrative Supplies'
!administrativeSupplies.date := Date('2023-10-15')
!administrativeSupplies.paymentMethod := #CASH
!administrativeSupplies.status := #VALIDATED

!new Bill('travelGrants')
!travelGrants.amount := 950.00
!travelGrants.category := 'Travel Grants for International Scholars'
!travelGrants.date := Date('2023-10-15')
!travelGrants.paymentMethod := #CHECK
!travelGrants.status := #PENDING

!insert (conferenceVenueRental, japaneseYen) into BillCurrency
!insert (speakerHonorariums, britishPound) into BillCurrency
!insert (cateringServices, britishPound) into BillCurrency
!insert (administrativeSupplies, canadianDollar) into BillCurrency
!insert (travelGrants, canadianDollar) into BillCurrency

!new Expense('academicResearchConferenceExpenses')
-- Correct total amount reflects only the sum of the bill amounts
!academicResearchConferenceExpenses.amount := 257900.00
!academicResearchConferenceExpenses.startDate := Date('2023-10-15')
!academicResearchConferenceExpenses.endDate := Date('2023-10-17')

!insert (academicResearchConferenceExpenses, conferenceVenueRental) into ExpenseContainsBills
!insert (academicResearchConferenceExpenses, speakerHonorariums) into ExpenseContainsBills
!insert (academicResearchConferenceExpenses, cateringServices) into ExpenseContainsBills
!insert (academicResearchConferenceExpenses, administrativeSupplies) into ExpenseContainsBills
!insert (academicResearchConferenceExpenses, travelGrants) into ExpenseContainsBills

!new Comment('commentVenueRental')
!commentVenueRental.text := 'Venue rental costs pending final confirmation and adjustment based on attendance.'

!new Comment('commentSpeakerPayments')
!commentSpeakerPayments.text := 'All speaker payments verified and processed successfully.'

!new Comment('commentCateringAudit')
!commentCateringAudit.text := 'Catering efficiently reconciled within budget, set for official audit.'

!new Comment('commentAdminSupplies')
!commentAdminSupplies.text := 'Administrative supply expenses validated, enabling smooth conference management.'

!new Comment('commentTravelGrants')
!commentTravelGrants.text := 'Pending verification of travel grants, subject to scholar documentation.'

!insert (academicResearchConferenceExpenses, commentVenueRental) into ExpenseComment
!insert (academicResearchConferenceExpenses, commentSpeakerPayments) into ExpenseComment
!insert (academicResearchConferenceExpenses, commentCateringAudit) into ExpenseComment
!insert (academicResearchConferenceExpenses, commentAdminSupplies) into ExpenseComment
!insert (academicResearchConferenceExpenses, commentTravelGrants) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 68 | 0.00% |
| Multiplicities Errors | 0 | 15 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category invalid
```
!new Currency('chineseYuan')
!chineseYuan.name := 'Chinese Yuan'
!chineseYuan.abbreviation := 'CNY'

!new Expense('programmingCourseExpense')
!programmingCourseExpense.amount := 3000.00
!programmingCourseExpense.startDate := Date('2023-02-01')
!programmingCourseExpense.endDate := Date('2023-02-10')

!new Bill('courseFee')
!courseFee.amount := 2000.00
!courseFee.category := 'Course Fee'
!courseFee.date := Date('2023-02-01')
!courseFee.paymentMethod := #CASH
!courseFee.status := #DRAFT

!new Bill('studyMaterials')
!studyMaterials.amount := 700.00
!studyMaterials.category := 'Study Materials'
!studyMaterials.date := Date('2023-02-05')
!studyMaterials.paymentMethod := #CHECK
!studyMaterials.status := #PENDING

!new Bill('transportation')
!transportation.amount := 300.00
!transportation.category := 'Transportation'
!transportation.date := Date('2023-02-09')
!transportation.paymentMethod := #CREDIT_CARD
!transportation.status := #VALIDATED

!insert (courseFee, chineseYuan) into BillCurrency
!insert (studyMaterials, chineseYuan) into BillCurrency
!insert (transportation, chineseYuan) into BillCurrency

!insert (programmingCourseExpense, courseFee) into ExpenseContainsBills
!insert (programmingCourseExpense, studyMaterials) into ExpenseContainsBills
!insert (programmingCourseExpense, transportation) into ExpenseContainsBills

!new Comment('commentEnthusiasm')
!commentEnthusiasm.text := 'Enthusiastic about learning the new programming languages.'

!new Comment('commentStudyMaterials')
!commentStudyMaterials.text := 'Unexpected cost of additional study materials ensured deeper understanding.'

!insert (programmingCourseExpense, commentEnthusiasm) into ExpenseComment
!insert (programmingCourseExpense, commentStudyMaterials) into ExpenseComment
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 8 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Generation 5 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 236 | 0.00% |
| Multiplicities Errors | 0 | 45 | 0.00% |
| Invariants Errors | 0 | 8 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 8 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 5 | 0.00% |

# Generation 6
## Category baseline
```
!new Currency('euro')
!euro.name := 'Euro'
!euro.abbreviation := 'EUR'

!new Expense('creativePaintingWorkshop')
!creativePaintingWorkshop.amount := 400.00
!creativePaintingWorkshop.startDate := Date('2023-04-08')
!creativePaintingWorkshop.endDate := Date('2023-04-09')

!new Bill('workshopVenueRental')
!workshopVenueRental.amount := 150.00
!workshopVenueRental.category := 'Event'
!workshopVenueRental.date := Date('2023-03-15')
!workshopVenueRental.paymentMethod := #CHECK
!workshopVenueRental.status := #VERIFIED

!new Bill('artSupplies')
!artSupplies.amount := 100.00
!artSupplies.category := 'Materials'
!artSupplies.date := Date('2023-03-20')
!artSupplies.paymentMethod := #CREDIT_CARD
!artSupplies.status := #REFUNDED

!new Bill('cateringServices')
!cateringServices.amount := 100.00
!cateringServices.category := 'Food'
!cateringServices.date := Date('2023-04-08')
!cateringServices.paymentMethod := #CASH
!cateringServices.status := #PENDING

!new Bill('promotionAndAdvertising')
!promotionAndAdvertising.amount := 50.00
!promotionAndAdvertising.category := 'Marketing'
!promotionAndAdvertising.date := Date('2023-03-25')
!promotionAndAdvertising.paymentMethod := #CREDIT_CARD
!promotionAndAdvertising.status := #VERIFIED

!insert (workshopVenueRental, euro) into BillCurrency
!insert (artSupplies, euro) into BillCurrency
!insert (cateringServices, euro) into BillCurrency
!insert (promotionAndAdvertising, euro) into BillCurrency

!insert (creativePaintingWorkshop, workshopVenueRental) into ExpenseContainsBills
!insert (creativePaintingWorkshop, artSupplies) into ExpenseContainsBills
!insert (creativePaintingWorkshop, cateringServices) into ExpenseContainsBills
!insert (creativePaintingWorkshop, promotionAndAdvertising) into ExpenseContainsBills

!new Comment('commentVenue')
!commentVenue.text := 'Participants appreciated the calm and inspiring environment for the workshop.'

!new Comment('commentArtSupplies')
!commentArtSupplies.text := 'High-quality paints and brushes enhanced the workshop experience.'

!new Comment('commentCatering')
!commentCatering.text := 'The refreshments were well-received, keeping energy levels high throughout.'

!insert (creativePaintingWorkshop, commentVenue) into ExpenseComment
!insert (creativePaintingWorkshop, commentArtSupplies) into ExpenseComment
!insert (creativePaintingWorkshop, commentCatering) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 48 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category boundary
```
!new Currency('swissFranc')
!swissFranc.name := 'Swiss Franc'
!swissFranc.abbreviation := 'CHF'

!new Expense('zeroExpense')
!zeroExpense.amount := 0.00
!zeroExpense.startDate := Date('2023-02-01')
!zeroExpense.endDate := Date('2023-02-28')

!new Bill('conferenceFees')
!conferenceFees.amount := 0.00
!conferenceFees.category := 'Conference Fees'
!conferenceFees.date := Date('2023-02-15')
!conferenceFees.paymentMethod := #CHECK
!conferenceFees.status := #REFUNDED

!insert (conferenceFees, swissFranc) into BillCurrency

!insert (zeroExpense, conferenceFees) into ExpenseContainsBills

!new Comment('commentCancelledRegistration')
!commentCancelledRegistration.text := 'Cancelled conference registration due to travel restrictions'

!new Comment('commentRefundProcessed')
!commentRefundProcessed.text := 'Refund processed successfully; no financial liabilities incurred'

!new Comment('commentFinancialAdjustments')
!commentFinancialAdjustments.text := 'Ensured seamless financial adjustments for better audit transparency'

!insert (zeroExpense, commentCancelledRegistration) into ExpenseComment
!insert (zeroExpense, commentRefundProcessed) into ExpenseComment
!insert (zeroExpense, commentFinancialAdjustments) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 24 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category complex
```
!new Currency('turkishLira')
!turkishLira.name := 'Turkish Lira'
!turkishLira.abbreviation := 'TRY'

!new Expense('educationalConferenceTripExpense')
!educationalConferenceTripExpense.amount := 18000.00
!educationalConferenceTripExpense.startDate := Date('2023-04-01')
!educationalConferenceTripExpense.endDate := Date('2023-04-10')

!new Bill('flightTickets')
!flightTickets.amount := 6000.00
!flightTickets.category := 'Travel'
!flightTickets.date := Date('2023-04-01')
!flightTickets.paymentMethod := #CREDIT_CARD
!flightTickets.status := #VERIFIED

!new Bill('hotelAccommodation')
!hotelAccommodation.amount := 5000.00
!hotelAccommodation.category := 'Accommodation'
!hotelAccommodation.date := Date('2023-04-02')
!hotelAccommodation.paymentMethod := #CHECK
!hotelAccommodation.status := #PENDING

!new Bill('conferenceRegistration')
!conferenceRegistration.amount := 4000.00
!conferenceRegistration.category := 'Registration'
!conferenceRegistration.date := Date('2023-04-03')
!conferenceRegistration.paymentMethod := #CREDIT_CARD
!conferenceRegistration.status := #VALIDATED

!new Bill('mealsAndIncidentals')
!mealsAndIncidentals.amount := 3000.00
!mealsAndIncidentals.category := 'Meals'
!mealsAndIncidentals.date := Date('2023-04-05')
!mealsAndIncidentals.paymentMethod := #CASH
!mealsAndIncidentals.status := #DRAFT

!insert (flightTickets, turkishLira) into BillCurrency
!insert (hotelAccommodation, turkishLira) into BillCurrency
!insert (conferenceRegistration, turkishLira) into BillCurrency
!insert (mealsAndIncidentals, turkishLira) into BillCurrency

!insert (educationalConferenceTripExpense, flightTickets) into ExpenseContainsBills
!insert (educationalConferenceTripExpense, hotelAccommodation) into ExpenseContainsBills
!insert (educationalConferenceTripExpense, conferenceRegistration) into ExpenseContainsBills
!insert (educationalConferenceTripExpense, mealsAndIncidentals) into ExpenseContainsBills

!new Comment('commentFlight')
!commentFlight.text := 'Flight was comfortable, ensuring I arrived fresh and ready to engage.'

!new Comment('commentHotel')
!commentHotel.text := 'Hotel is conveniently located near the conference venue, awaiting confirmation.'

!new Comment('commentRegistration')
!commentRegistration.text := 'Registration process was smooth, access to all sessions confirmed.'

!insert (educationalConferenceTripExpense, commentFlight) into ExpenseComment
!insert (educationalConferenceTripExpense, commentHotel) into ExpenseComment
!insert (educationalConferenceTripExpense, commentRegistration) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 48 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category edge
```
!new Currency('swissFranc')
!swissFranc.name := 'Swiss Franc'
!swissFranc.abbreviation := 'CHF'

!new Currency('usDollar')
!usDollar.name := 'US Dollar'
!usDollar.abbreviation := 'USD'

!new Currency('indianRupee')
!indianRupee.name := 'Indian Rupee'
!indianRupee.abbreviation := 'INR'

!new Bill('accommodationSwissChalet')
!accommodationSwissChalet.amount := 3500.00
!accommodationSwissChalet.category := 'Accommodation in Swiss Chalet'
!accommodationSwissChalet.date := Date('2023-07-01')
!accommodationSwissChalet.paymentMethod := #CREDIT_CARD
!accommodationSwissChalet.status := #VALIDATED

!new Bill('familyDiningCatering')
!familyDiningCatering.amount := 1500.00
!familyDiningCatering.category := 'Family Dining and Catering'
!familyDiningCatering.date := Date('2023-07-01')
!familyDiningCatering.paymentMethod := #CASH
!familyDiningCatering.status := #VALIDATED

!new Bill('souvenirShopping')
!souvenirShopping.amount := 200.00
!souvenirShopping.category := 'Souvenir Shopping'
!souvenirShopping.date := Date('2023-07-01')
!souvenirShopping.paymentMethod := #CASH
!souvenirShopping.status := #REFUNDED

!new Bill('localTransportCarRental')
!localTransportCarRental.amount := 500.00
!localTransportCarRental.category := 'Local Transport and Car Rental'
!localTransportCarRental.date := Date('2023-07-01')
!localTransportCarRental.paymentMethod := #CHECK
!localTransportCarRental.status := #DRAFT

!new Bill('traditionalArtProjects')
!traditionalArtProjects.amount := 100.00
!traditionalArtProjects.category := 'Traditional Art Projects'
!traditionalArtProjects.date := Date('2023-07-01')
!traditionalArtProjects.paymentMethod := #CREDIT_CARD
!traditionalArtProjects.status := #VALIDATED

!insert (accommodationSwissChalet, swissFranc) into BillCurrency
!insert (familyDiningCatering, usDollar) into BillCurrency
!insert (souvenirShopping, usDollar) into BillCurrency
!insert (localTransportCarRental, swissFranc) into BillCurrency
!insert (traditionalArtProjects, indianRupee) into BillCurrency

!new Expense('familyReunionVacationExpenses')
-- The correct amount calculation excludes refunded expenses
!familyReunionVacationExpenses.amount := 5800.00
!familyReunionVacationExpenses.startDate := Date('2023-07-01')
!familyReunionVacationExpenses.endDate := Date('2023-07-14')

!insert (familyReunionVacationExpenses, accommodationSwissChalet) into ExpenseContainsBills
!insert (familyReunionVacationExpenses, familyDiningCatering) into ExpenseContainsBills
!insert (familyReunionVacationExpenses, souvenirShopping) into ExpenseContainsBills
!insert (familyReunionVacationExpenses, localTransportCarRental) into ExpenseContainsBills
!insert (familyReunionVacationExpenses, traditionalArtProjects) into ExpenseContainsBills

!new Comment('commentAccommodation')
!commentAccommodation.text := 'Accommodation validated seamlessly, enhancing family comfort.'

!new Comment('commentDiningOutcome')
!commentDiningOutcome.text := 'Verified dining outcome keeping family activities within the budget.'

!new Comment('commentSouvenirRefund')
!commentSouvenirRefund.text := 'Souvenir purchase refunded due to product quality issues.'

!new Comment('commentVehicleDraft')
!commentVehicleDraft.text := 'Vehicle expenses drafted for potential route adjustments.'

!new Comment('commentArtProjects')
!commentArtProjects.text := 'Art projects reflect local culture and family engagement.'

!insert (familyReunionVacationExpenses, commentAccommodation) into ExpenseComment
!insert (familyReunionVacationExpenses, commentDiningOutcome) into ExpenseComment
!insert (familyReunionVacationExpenses, commentSouvenirRefund) into ExpenseComment
!insert (familyReunionVacationExpenses, commentVehicleDraft) into ExpenseComment
!insert (familyReunionVacationExpenses, commentArtProjects) into ExpenseComment
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 68 | 0.00% |
| Multiplicities Errors | 0 | 15 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Category invalid
```
!new Currency('euro') 
!euro.name := 'Euro'
!euro.abbreviation := 'EUR'

!new Expense('renaissanceArtWorkshopExpense')
!renaissanceArtWorkshopExpense.amount := 700.00
!renaissanceArtWorkshopExpense.startDate := Date('2023-10-10')
!renaissanceArtWorkshopExpense.endDate := Date('2023-10-12')

!new Bill('venueRental')
!venueRental.amount := 450.00
!venueRental.category := 'Venue Rental'
!venueRental.date := Date('2023-10-10')
!venueRental.paymentMethod := #CHECK
!venueRental.status := #VERIFIED

!new Bill('promotionalMaterials')
!promotionalMaterials.amount := 150.00
!promotionalMaterials.category := 'Promotional Materials'
!promotionalMaterials.date := Date('2023-10-11')
!promotionalMaterials.paymentMethod := #CREDIT_CARD
!promotionalMaterials.status := #REFUNDED

!new Bill('catering')
!catering.amount := 100.00
!catering.category := 'Catering'
!catering.date := Date('2023-10-12')
!catering.paymentMethod := #CASH
!catering.status := #PENDING

!insert (venueRental, euro) into BillCurrency
!insert (promotionalMaterials, euro) into BillCurrency
!insert (catering, euro) into BillCurrency

!insert (renaissanceArtWorkshopExpense, venueRental) into ExpenseContainsBills
!insert (renaissanceArtWorkshopExpense, promotionalMaterials) into ExpenseContainsBills
!insert (renaissanceArtWorkshopExpense, catering) into ExpenseContainsBills

!new Comment('commentVenueAmbiance')
!commentVenueAmbiance.text := 'Venue choice was exceptional for the ambiance of the period.'

!new Comment('commentPromotionalMaterials')
!commentPromotionalMaterials.text := 'Promotional materials needed adjustments – refund facilitated revising strategy.'

!insert (renaissanceArtWorkshopExpense, commentVenueAmbiance) into ExpenseComment
!insert (renaissanceArtWorkshopExpense, commentPromotionalMaterials) into ExpenseComment
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 8 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 1 | 0.00% |

## Generation 6 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 225 | 0.00% |
| Multiplicities Errors | 0 | 42 | 0.00% |
| Invariants Errors | 0 | 8 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 8 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 5 | 0.00% |

# Summary for all generations
| Summary | Value | 
|---|---| 
| Model | GPT_4O | 
| Type | CoT | 
| System | myexpenses | 
| Number of generations | 6 | 

| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 1302 | 0.00% |
| Multiplicities Errors | 0 | 242 | 0.00% |
| Invariants Errors | 3 | 48 | 6.25% |

| Invariants Errors | 
|---| 
```
checking invariant (1) `Expense::expenseSumOfBills': FAILED.
```
```
checking invariant (1) `Expense::expenseSumOfBills': FAILED.
```
```
checking invariant (1) `Expense::expenseSumOfBills': FAILED.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 40 | 0.00% |
| Invariants Errors (Not included on General) | 1 | 12 | 8.33% |

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (1) `Expense::expenseSumOfBills': FAILED.
```

| MyExpenses | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 30 | 0.00% |

