# Generation 1
```
-- Creating instances of Clients
!new Client('client1')
!client1.clientId := 1
!client1.isSuspended := false

!new Client('client2')
!client2.clientId := 2
!client2.isSuspended := true

-- Creating instances of Rentals with Dates
!new Rental('rental1')
!rental1.date := Date('2023-10-01')

!new Rental('rental2')
!rental2.date := Date('2023-10-02')

-- Creating instances of Movies, a subclass of Cassette
!new Movie('movie1')
!movie1.title := 'Action Movie'
!movie1.availableCopies := 5
!movie1.genre := #Action

!new Movie('movie2')
!movie2.title := 'Comedy Flick'
!movie2.availableCopies := 3
!movie2.genre := #Comedy

-- Creating instances of Series, a subclass of Cassette
!new Series('series1')
!series1.title := 'Drama Series'
!series1.availableCopies := 2
!series1.episode := 1

!new Series('series2')
!series2.title := 'Adventure Series'
!series2.availableCopies := 1
!series2.episode := 5

-- Creating instances of Actors
!new Actor('actor1')
!actor1.name := 'John Doe'

!new Actor('actor2')
!actor2.name := 'Jane Smith'

-- Establishing associations between Clients and Rentals
!insert (client1, rental1) into ClientRental
!insert (client2, rental2) into ClientRental

-- Establishing associations between Rentals and Cassettes
!insert (rental1, movie1) into RentalCassette
!insert (rental1, series1) into RentalCassette
!insert (rental2, movie2) into RentalCassette
!insert (rental2, series2) into RentalCassette

-- Establishing associations between Cassettes and Actors
!insert (movie1, actor1) into CassetteActor
!insert (movie2, actor2) into CassetteActor
!insert (series1, actor2) into CassetteActor
!insert (series2, actor1) into CassetteActor

-- Corner cases

-- Client with the minimum positive clientId value
!new Client('client3')
!client3.clientId := 3
!client3.isSuspended := false

-- Series with the minimum allowed episode number
!new Series('series3')
!series3.title := 'Minimal Episode Series'
!series3.availableCopies := 1
!series3.episode := 1

-- Establishing association between series3 and an actor to satisfy the constraint
!insert (series3, actor1) into CassetteActor
```
## Generation 1 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 48 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 2 | 5 | 40.00% |
| Types (out of valid Titles) | 0 | 3 | 0.00% |
| Genres (out of valid Titles) | 0 | 1 | 0.00% |
| Actors (out of valid Titles) | 3 | 3 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 3 | 0.00% |

| Failed Titles | 
|---| 
```
Comedy Flick
```
```
Minimal Episode Series
```

| Failed Actors | 
|---| 
```
John Doe for movie: Action Movie
```
```
John Doe for movie: Adventure Series
```
```
Jane Smith for movie: Drama Series
```

# Generation 2
```
-- New Client instance
!new Client('client4')
!client4.clientId := 4
!client4.isSuspended := true

-- New Rental instance
!new Rental('rental3')
!rental3.date := Date('2023-09-15')

-- New Movie instance with a different genre
!new Movie('movie3')
!movie3.title := 'Thrilling Action'
!movie3.availableCopies := 7
!movie3.genre := #Action

-- New Series instance with more episodes
!new Series('series4')
!series4.title := 'Endless Mystery'
!series4.availableCopies := 4
!series4.episode := 10

-- New Actor instance
!new Actor('actor3')
!actor3.name := 'Alice Brown'

-- Establishing associations for the new Rental
!insert (client4, rental3) into ClientRental

-- Establishing associations between rental3 and cassettes
!insert (rental3, movie3) into RentalCassette
!insert (rental3, series4) into RentalCassette

-- Establishing association between cassettes and the new actor
!insert (movie3, actor3) into CassetteActor
!insert (series4, actor3) into CassetteActor
```
## Generation 2 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 2 | 2 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Thrilling Action
```
```
Endless Mystery
```

# Generation 3
```
-- New Client instance
!new Client('client5')
!client5.clientId := 5
!client5.isSuspended := false

-- New Rental instance with a unique date
!new Rental('rental4')
!rental4.date := Date('2023-11-20')

-- New Movie instance with a distinct title and genre
!new Movie('movie4')
!movie4.title := 'Laughter Riot'
!movie4.availableCopies := 6
!movie4.genre := #Comedy

-- New Series instance with maximum copies and a unique episode number
!new Series('series5')
!series5.title := 'Sci-Fi Adventure'
!series5.availableCopies := 10
!series5.episode := 3

-- New Actor instance with a unique name
!new Actor('actor4')
!actor4.name := 'Michael Green'

-- Establishing a unique set of associations
!insert (client5, rental4) into ClientRental

-- Associating the new rental with different cassettes
!insert (rental4, movie4) into RentalCassette
!insert (rental4, series5) into RentalCassette

-- Associating cassettes with actors
!insert (movie4, actor4) into CassetteActor
!insert (series5, actor4) into CassetteActor
```
## Generation 3 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 2 | 2 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Sci-Fi Adventure
```
```
Laughter Riot
```

# Generation 4
```
-- New Client instance
!new Client('client6')
!client6.clientId := 6
!client6.isSuspended := true

-- New Rental instance with a future date
!new Rental('rental5')
!rental5.date := Date('2023-12-25')

-- New Movie instance with a unique genre and title
!new Movie('movie5')
!movie5.title := 'Epic Quest'
!movie5.availableCopies := 1
!movie5.genre := #Action

-- New Series instance with different attributes
!new Series('series6')
!series6.title := 'Historical Saga'
!series6.availableCopies := 5
!series6.episode := 8

-- New Actor instance with another unique name
!new Actor('actor5')
!actor5.name := 'Clara White'

-- Establishing a unique set of associations
!insert (client6, rental5) into ClientRental

-- Associating the rental with the new cassettes
!insert (rental5, movie5) into RentalCassette
!insert (rental5, series6) into RentalCassette

-- Associating the new cassettes with a different actor
!insert (movie5, actor5) into CassetteActor
!insert (series6, actor5) into CassetteActor
```
## Generation 4 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 1 | 2 | 50.00% |
| Types (out of valid Titles) | 0 | 1 | 0.00% |
| Genres (out of valid Titles) | 0 | 1 | 0.00% |
| Actors (out of valid Titles) | 1 | 1 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Historical Saga
```

| Failed Actors | 
|---| 
```
Clara White for movie: Epic Quest
```

# Generation 5
```
-- New Client instance with a different suspension status
!new Client('client7')
!client7.clientId := 7
!client7.isSuspended := false

-- New Rental instance with a unique date
!new Rental('rental6')
!rental6.date := Date('2024-01-10')

-- New Movie instance with different genre and copies
!new Movie('movie6')
!movie6.title := 'Comedic Chaos'
!movie6.availableCopies := 4
!movie6.genre := #Comedy

-- New Series instance with unique episode and available copies
!new Series('series7')
!series7.title := 'Mystery Thriller'
!series7.availableCopies := 3
!series7.episode := 12

-- New Actor instance with another unique name
!new Actor('actor6')
!actor6.name := 'Oliver Black'

-- Establishing a unique set of associations
!insert (client7, rental6) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental6, movie6) into RentalCassette
!insert (rental6, series7) into RentalCassette

-- Associating the new cassettes with the new actor
!insert (movie6, actor6) into CassetteActor
!insert (series7, actor6) into CassetteActor
```
## Generation 5 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 1 | 2 | 50.00% |
| Types (out of valid Titles) | 1 | 1 | 100.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 1 | 1 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Comedic Chaos
```

| Failed Types | 
|---| 
```
Parsed type: series != API type: movie
```

| Failed Actors | 
|---| 
```
Oliver Black for movie: Mystery Thriller
```

# Generation 6
```
-- New Client instance with different attributes
!new Client('client8')
!client8.clientId := 8
!client8.isSuspended := false

-- New Rental instance with a unique date
!new Rental('rental7')
!rental7.date := Date('2023-08-20')

-- New Movie instance with a distinctive title and genre
!new Movie('movie7')
!movie7.title := 'Journey Beyond'
!movie7.availableCopies := 5
!movie7.genre := #Action

-- New Series instance with unique combinations of episodes and copies
!new Series('series8')
!series8.title := 'The Forgotten Era'
!series8.availableCopies := 8
!series8.episode := 6

-- New Actor instance with a new name
!new Actor('actor7')
!actor7.name := 'Sophia Blue'

-- Establishing relationships between the client and the rental
!insert (client8, rental7) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental7, movie7) into RentalCassette
!insert (rental7, series8) into RentalCassette

-- Associating the new movie and series with the actor
!insert (movie7, actor7) into CassetteActor
!insert (series8, actor7) into CassetteActor
```
## Generation 6 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 1 | 2 | 50.00% |
| Types (out of valid Titles) | 0 | 1 | 0.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 1 | 1 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
The Forgotten Era
```

| Failed Genres | 
|---| 
```
Parsed genre: Action != API genre: [Animation, Musical]
```

| Failed Actors | 
|---| 
```
Sophia Blue for movie: Journey Beyond
```

# Generation 7
```
-- New Client instance with a distinct ID and suspended status
!new Client('client9')
!client9.clientId := 9
!client9.isSuspended := true

-- New Rental instance with a unique date
!new Rental('rental8')
!rental8.date := Date('2023-07-04')

-- New Movie instance with a different genre and minimal copies
!new Movie('movie8')
!movie8.title := 'Classic Humor'
!movie8.availableCopies := 2
!movie8.genre := #Comedy

-- New Series instance with the least number of episodes and copies
!new Series('series9')
!series9.title := 'Beginning of Time'
!series9.availableCopies := 1
!series9.episode := 1

-- New Actor instance with a unique name
!new Actor('actor8')
!actor8.name := 'Emma Green'

-- Establishing relationships between the client and the rental
!insert (client9, rental8) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental8, movie8) into RentalCassette
!insert (rental8, series9) into RentalCassette

-- Associating the new movie and series with the actor
!insert (movie8, actor8) into CassetteActor
!insert (series9, actor8) into CassetteActor
```
## Generation 7 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 1 | 2 | 50.00% |
| Types (out of valid Titles) | 1 | 1 | 100.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 1 | 1 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Classic Humor
```

| Failed Types | 
|---| 
```
Parsed type: series != API type: movie
```

| Failed Actors | 
|---| 
```
Emma Green for movie: Beginning of Time
```

# Generation 8
```
-- New Client instance with a unique client ID and suspension status
!new Client('client10')
!client10.clientId := 10
!client10.isSuspended := false

-- New Rental instance with a unique date
!new Rental('rental9')
!rental9.date := Date('2023-06-15')

-- New Movie instance with a unique title, genre, and multiple copies
!new Movie('movie9')
!movie9.title := 'Sci-Fi Odyssey'
!movie9.availableCopies := 7
!movie9.genre := #Action

-- New Series instance with numerous episodes and available copies
!new Series('series10')
!series10.title := 'Uncharted Realm'
!series10.availableCopies := 6
!series10.episode := 15

-- New Actor instance with a distinctive name
!new Actor('actor9')
!actor9.name := 'Liam Hayes'

-- Establishing a unique client-rental association
!insert (client10, rental9) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental9, movie9) into RentalCassette
!insert (rental9, series10) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie9, actor9) into CassetteActor
!insert (series10, actor9) into CassetteActor
```
## Generation 8 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 2 | 2 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Sci-Fi Odyssey
```
```
Uncharted Realm
```

# Generation 9
```
-- New Client instance with a unique client ID and different suspension status
!new Client('client11')
!client11.clientId := 11
!client11.isSuspended := true

-- New Rental instance with another unique date
!new Rental('rental10')
!rental10.date := Date('2024-02-28')

-- New Movie instance with varying title, genre, and minimal available copies
!new Movie('movie10')
!movie10.title := 'Mystic Adventures'
!movie10.availableCopies := 1
!movie10.genre := #Action

-- New Series instance with moderate episodes and copies
!new Series('series11')
!series11.title := 'Legends Awaken'
!series11.availableCopies := 4
!series11.episode := 5

-- New Actor instance with a unique name
!new Actor('actor10')
!actor10.name := 'Zara Quinn'

-- Establishing a distinct client-rental association
!insert (client11, rental10) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental10, movie10) into RentalCassette
!insert (rental10, series11) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie10, actor10) into CassetteActor
!insert (series11, actor10) into CassetteActor
```
## Generation 9 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 2 | 2 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Legends Awaken
```
```
Mystic Adventures
```

# Generation 10
```
-- New Client instance with a unique client ID and different suspension status
!new Client('client12')
!client12.clientId := 12
!client12.isSuspended := false

-- New Rental instance with an additional unique date
!new Rental('rental11')
!rental11.date := Date('2024-03-17')

-- New Movie instance with diverse title, genre, and a generous number of copies
!new Movie('movie11')
!movie11.title := 'Comedy of Errors'
!movie11.availableCopies := 9
!movie11.genre := #Comedy

-- New Series instance with many episodes and available copies
!new Series('series12')
!series12.title := 'Epic Journey'
!series12.availableCopies := 10
!series12.episode := 20

-- New Actor instance with a distinctive name
!new Actor('actor11')
!actor11.name := 'Noah Grey'

-- Establishing a distinct client-rental association
!insert (client12, rental11) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental11, movie11) into RentalCassette
!insert (rental11, series12) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie11, actor11) into CassetteActor
!insert (series12, actor11) into CassetteActor
```
## Generation 10 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 0 | 2 | 0.00% |
| Types (out of valid Titles) | 1 | 2 | 50.00% |
| Genres (out of valid Titles) | 0 | 1 | 0.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 2 | 0.00% |

| Failed Types | 
|---| 
```
Parsed type: series != API type: movie
```

| Failed Actors | 
|---| 
```
Noah Grey for movie: Comedy of Errors
```
```
Noah Grey for movie: Epic Journey
```

# Generation 11
```
-- New Client instance with a unique client ID and suspension status
!new Client('client13')
!client13.clientId := 13
!client13.isSuspended := false

-- New Rental instance with a completely new date
!new Rental('rental12')
!rental12.date := Date('2024-04-10')

-- New Movie instance with a distinctive title, genre, and a unique number of copies
!new Movie('movie12')
!movie12.title := 'Daring Pursuit'
!movie12.availableCopies := 4
!movie12.genre := #Action

-- New Series instance with a unique set of episodes and copies
!new Series('series13')
!series13.title := 'Chronicles of Old'
!series13.availableCopies := 2
!series13.episode := 25

-- New Actor instance with a unique name
!new Actor('actor12')
!actor12.name := 'Lucas Sky'

-- Establishing a unique client-rental association
!insert (client13, rental12) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental12, movie12) into RentalCassette
!insert (rental12, series13) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie12, actor12) into CassetteActor
!insert (series13, actor12) into CassetteActor
```
## Generation 11 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 2 | 2 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Daring Pursuit
```
```
Chronicles of Old
```

# Generation 12
```
-- New Client instance with a unique client ID and suspension status
!new Client('client14')
!client14.clientId := 14
!client14.isSuspended := true

-- New Rental instance with a newly chosen date
!new Rental('rental13')
!rental13.date := Date('2024-05-18')

-- New Movie instance with a unique title, genre, and a specified number of copies
!new Movie('movie13')
!movie13.title := 'Silent Whispers'
!movie13.availableCopies := 5
!movie13.genre := #Comedy

-- New Series instance with different episodes and a set number of copies
!new Series('series14')
!series14.title := 'Hidden Mysteries'
!series14.availableCopies := 3
!series14.episode := 10

-- New Actor instance with a different name
!new Actor('actor13')
!actor13.name := 'Sophia Lane'

-- Establishing a distinct client-rental association
!insert (client14, rental13) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental13, movie13) into RentalCassette
!insert (rental13, series14) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie13, actor13) into CassetteActor
!insert (series14, actor13) into CassetteActor
```
## Generation 12 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 1 | 2 | 50.00% |
| Types (out of valid Titles) | 0 | 1 | 0.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 1 | 1 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Hidden Mysteries
```

| Failed Genres | 
|---| 
```
Parsed genre: Comedy != API genre: [Short]
```

| Failed Actors | 
|---| 
```
Sophia Lane for movie: Silent Whispers
```

# Generation 13
```
-- New Client instance with a distinctive client ID and suspension status
!new Client('client15')
!client15.clientId := 15
!client15.isSuspended := false

-- New Rental instance with a fresh date
!new Rental('rental14')
!rental14.date := Date('2024-06-25')

-- New Movie instance with a novel title, genre, and a limited number of copies
!new Movie('movie14')
!movie14.title := 'Laugh Out Loud'
!movie14.availableCopies := 2
!movie14.genre := #Comedy

-- New Series instance with varied episode count and copies
!new Series('series15')
!series15.title := 'Galactic Conquest'
!series15.availableCopies := 7
!series15.episode := 12

-- New Actor instance with a unique name
!new Actor('actor14')
!actor14.name := 'Ethan Cross'

-- Establishing a unique client-rental association
!insert (client15, rental14) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental14, movie14) into RentalCassette
!insert (rental14, series15) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie14, actor14) into CassetteActor
!insert (series15, actor14) into CassetteActor
```
## Generation 13 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 1 | 2 | 50.00% |
| Types (out of valid Titles) | 0 | 1 | 0.00% |
| Genres (out of valid Titles) | 0 | 1 | 0.00% |
| Actors (out of valid Titles) | 1 | 1 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Galactic Conquest
```

| Failed Actors | 
|---| 
```
Ethan Cross for movie: Laugh Out Loud
```

# Generation 14
```
-- New Client instance with an exclusive client ID and suspension status
!new Client('client16')
!client16.clientId := 16
!client16.isSuspended := true

-- New Rental instance with a distinctive date
!new Rental('rental15')
!rental15.date := Date('2024-07-30')

-- New Movie instance with a fresh title, genre, and ample number of copies
!new Movie('movie15')
!movie15.title := 'Adrenaline Rush'
!movie15.availableCopies := 8
!movie15.genre := #Action

-- New Series instance with a unique title, several episodes, and multiple copies
!new Series('series16')
!series16.title := 'Tales of the Future'
!series16.availableCopies := 6
!series16.episode := 18

-- New Actor instance with a unique name
!new Actor('actor15')
!actor15.name := 'Lily Stone'

-- Establishing a distinct client-rental relationship
!insert (client16, rental15) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental15, movie15) into RentalCassette
!insert (rental15, series16) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie15, actor15) into CassetteActor
!insert (series16, actor15) into CassetteActor
```
## Generation 14 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 1 | 2 | 50.00% |
| Types (out of valid Titles) | 0 | 1 | 0.00% |
| Genres (out of valid Titles) | 0 | 1 | 0.00% |
| Actors (out of valid Titles) | 1 | 1 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Tales of the Future
```

| Failed Actors | 
|---| 
```
Lily Stone for movie: Adrenaline Rush
```

# Generation 15
```
-- New Client instance with a different client ID and suspension status
!new Client('client17')
!client17.clientId := 17
!client17.isSuspended := false

-- New Rental instance with another unique date
!new Rental('rental16')
!rental16.date := Date('2024-08-05')

-- New Movie instance with a unique title, genre, and a decent number of copies
!new Movie('movie16')
!movie16.title := 'The Great Escape'
!movie16.availableCopies := 6
!movie16.genre := #Action

-- New Series instance with varied episodes and available copies
!new Series('series17')
!series17.title := 'Space Chronicles'
!series17.availableCopies := 10
!series17.episode := 14

-- New Actor instance with a different name
!new Actor('actor16')
!actor16.name := 'Oscar Reed'

-- Establishing a distinct client-rental association
!insert (client17, rental16) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental16, movie16) into RentalCassette
!insert (rental16, series17) into RentalCassette

-- Associating the newly created movie and series with the new actor
!insert (movie16, actor16) into CassetteActor
!insert (series17, actor16) into CassetteActor
```
## Generation 15 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 0 | 2 | 0.00% |
| Types (out of valid Titles) | 0 | 2 | 0.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 2 | 0.00% |

| Failed Genres | 
|---| 
```
Parsed genre: Action != API genre: [Adventure, Drama, Thriller]
```

| Failed Actors | 
|---| 
```
Oscar Reed for movie: Space Chronicles
```
```
Oscar Reed for movie: The Great Escape
```

# Generation 16
```
-- New Client instance with another unique client ID and suspension status
!new Client('client18')
!client18.clientId := 18
!client18.isSuspended := true

-- New Rental instance with a unique date
!new Rental('rental17')
!rental17.date := Date('2024-09-10')

-- New Movie instance with a special title, genre, and moderate number of copies
!new Movie('movie17')
!movie17.title := 'Romantic Interlude'
!movie17.availableCopies := 3
!movie17.genre := #Comedy

-- New Series instance with unique episodes and distinct available copies
!new Series('series18')
!series18.title := 'Enigma Unearthed'
!series18.availableCopies := 5
!series18.episode := 8

-- New Actor instance with a unique name
!new Actor('actor17')
!actor17.name := 'Grace Harper'

-- Establishing a unique client-rental association
!insert (client18, rental17) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental17, movie17) into RentalCassette
!insert (rental17, series18) into RentalCassette

-- Associating the new movie and series with the new actor
!insert (movie17, actor17) into CassetteActor
!insert (series18, actor17) into CassetteActor
```
## Generation 16 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 1 | 2 | 50.00% |
| Types (out of valid Titles) | 1 | 1 | 100.00% |
| Genres (out of valid Titles) | 0 | 1 | 0.00% |
| Actors (out of valid Titles) | 1 | 1 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Enigma Unearthed
```

| Failed Types | 
|---| 
```
Parsed type: movie != API type: series
```

| Failed Actors | 
|---| 
```
Grace Harper for movie: Romantic Interlude
```

# Generation 17
```
-- New Client instance with a new unique client ID and suspension status
!new Client('client19')
!client19.clientId := 19
!client19.isSuspended := false

-- New Rental instance with a fresh unique date
!new Rental('rental18')
!rental18.date := Date('2024-10-12')

-- New Movie instance with a novel title, genre, and diverse number of copies
!new Movie('movie18')
!movie18.title := 'Into the Wild'
!movie18.availableCopies := 4
!movie18.genre := #Action

-- New Series instance with different episodes and a unique set of copies
!new Series('series19')
!series19.title := 'Forgotten Worlds'
!series19.availableCopies := 7
!series19.episode := 16

-- New Actor instance with a distinctive name
!new Actor('actor18')
!actor18.name := 'Victor Hale'

-- Establishing a distinct client-rental relationship
!insert (client19, rental18) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental18, movie18) into RentalCassette
!insert (rental18, series19) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie18, actor18) into CassetteActor
!insert (series19, actor18) into CassetteActor
```
## Generation 17 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 1 | 2 | 50.00% |
| Types (out of valid Titles) | 0 | 1 | 0.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 1 | 1 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Forgotten Worlds
```

| Failed Genres | 
|---| 
```
Parsed genre: Action != API genre: [Adventure, Biography, Drama]
```

| Failed Actors | 
|---| 
```
Victor Hale for movie: Into the Wild
```

# Generation 18
```
-- New Client instance with a unique client ID and suspension status
!new Client('client20')
!client20.clientId := 20
!client20.isSuspended := false

-- New Rental instance with a distinct date
!new Rental('rental19')
!rental19.date := Date('2024-11-15')

-- New Movie instance with a special title, genre, and multiple copies
!new Movie('movie19')
!movie19.title := 'Comedy of Life'
!movie19.availableCopies := 6
!movie19.genre := #Comedy

-- New Series instance with unique episodes and several copies
!new Series('series20')
!series20.title := 'Ancient Secrets'
!series20.availableCopies := 3
!series20.episode := 22

-- New Actor instance with a unique name
!new Actor('actor19')
!actor19.name := 'Fiona Lake'

-- Establishing a unique client-rental relationship
!insert (client20, rental19) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental19, movie19) into RentalCassette
!insert (rental19, series20) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie19, actor19) into CassetteActor
!insert (series20, actor19) into CassetteActor
```
## Generation 18 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 0 | 2 | 0.00% |
| Types (out of valid Titles) | 1 | 2 | 50.00% |
| Genres (out of valid Titles) | 0 | 1 | 0.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 2 | 0.00% |

| Failed Types | 
|---| 
```
Parsed type: series != API type: movie
```

| Failed Actors | 
|---| 
```
Fiona Lake for movie: Comedy of Life
```
```
Fiona Lake for movie: Ancient Secrets
```

# Generation 19
```
-- New Client instance with a distinct client ID and suspension status
!new Client('client21')
!client21.clientId := 21
!client21.isSuspended := true

-- New Rental instance with a remarkable date
!new Rental('rental20')
!rental20.date := Date('2024-12-01')

-- New Movie instance with an original title, genre, and available copies
!new Movie('movie20')
!movie20.title := 'Thrill Seeker'
!movie20.availableCopies := 9
!movie20.genre := #Action

-- New Series instance with distinct episodes and copy count
!new Series('series21')
!series21.title := 'Echoes of Time'
!series21.availableCopies := 4
!series21.episode := 11

-- New Actor instance with a unique name
!new Actor('actor20')
!actor20.name := 'Nathan Brooks'

-- Establishing a unique client-rental association
!insert (client21, rental20) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental20, movie20) into RentalCassette
!insert (rental20, series21) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie20, actor20) into CassetteActor
!insert (series21, actor20) into CassetteActor
```
## Generation 19 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 1 | 2 | 50.00% |
| Types (out of valid Titles) | 1 | 1 | 100.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 1 | 1 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Thrill Seeker
```

| Failed Types | 
|---| 
```
Parsed type: series != API type: movie
```

| Failed Actors | 
|---| 
```
Nathan Brooks for movie: Echoes of Time
```

# Generation 20
```
-- New Client instance with a unique client ID and suspension status
!new Client('client22')
!client22.clientId := 22
!client22.isSuspended := false

-- New Rental instance with a different unique date
!new Rental('rental21')
!rental21.date := Date('2025-01-10')

-- New Movie instance with a fresh title, genre, and limited available copies
!new Movie('movie21')
!movie21.title := 'The Great Masquerade'
!movie21.availableCopies := 3
!movie21.genre := #Comedy

-- New Series instance with distinct episodes and available copies
!new Series('series22')
!series22.title := 'Journey Through History'
!series22.availableCopies := 8
!series22.episode := 13

-- New Actor instance with a unique name
!new Actor('actor21')
!actor21.name := 'Amelia Frost'

-- Establishing a unique client-rental association
!insert (client22, rental21) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental21, movie21) into RentalCassette
!insert (rental21, series22) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie21, actor21) into CassetteActor
!insert (series22, actor21) into CassetteActor
```
## Generation 20 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 0 | 2 | 0.00% |
| Types (out of valid Titles) | 1 | 2 | 50.00% |
| Genres (out of valid Titles) | 0 | 1 | 0.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 2 | 0.00% |

| Failed Types | 
|---| 
```
Parsed type: series != API type: movie
```

| Failed Actors | 
|---| 
```
Amelia Frost for movie: Journey Through History
```
```
Amelia Frost for movie: The Great Masquerade
```

# Generation 21
```
-- New Client instance with a new client ID and suspension status
!new Client('client23')
!client23.clientId := 23
!client23.isSuspended := true

-- New Rental instance with a fresh date
!new Rental('rental22')
!rental22.date := Date('2025-02-20')

-- New Movie instance with a unique title, genre, and a number of available copies
!new Movie('movie22')
!movie22.title := 'Around the World'
!movie22.availableCopies := 5
!movie22.genre := #Action

-- New Series instance with a unique set of episodes and copies
!new Series('series23')
!series23.title := 'Secrets of the Deep'
!series23.availableCopies := 4
!series23.episode := 7

-- New Actor instance with a distinct name
!new Actor('actor22')
!actor22.name := 'Oliver Stone'

-- Establishing a unique client-rental association
!insert (client23, rental22) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental22, movie22) into RentalCassette
!insert (rental22, series23) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie22, actor22) into CassetteActor
!insert (series23, actor22) into CassetteActor
```
## Generation 21 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 0 | 2 | 0.00% |
| Types (out of valid Titles) | 1 | 2 | 50.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 2 | 0.00% |

| Failed Types | 
|---| 
```
Parsed type: series != API type: movie
```

| Failed Genres | 
|---| 
```
Parsed genre: Action != API genre: [Comedy, Musical]
```

| Failed Actors | 
|---| 
```
Oliver Stone for movie: Around the World
```
```
Oliver Stone for movie: Secrets of the Deep
```

# Generation 22
```
-- New Client instance with a distinctive client ID and suspension status
!new Client('client24')
!client24.clientId := 24
!client24.isSuspended := false

-- New Rental instance with a novel date
!new Rental('rental23')
!rental23.date := Date('2025-03-05')

-- New Movie instance with an innovative title, genre, and specific available copies
!new Movie('movie23')
!movie23.title := 'Wonders of the Universe'
!movie23.availableCopies := 7
!movie23.genre := #Comedy

-- New Series instance with unique episodes and available copies
!new Series('series24')
!series24.title := 'The Chronicles of Tomorrow'
!series24.availableCopies := 6
!series24.episode := 20

-- New Actor instance with a distinctive name
!new Actor('actor23')
!actor23.name := 'Elena Moon'

-- Establishing a unique client-rental association
!insert (client24, rental23) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental23, movie23) into RentalCassette
!insert (rental23, series24) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie23, actor23) into CassetteActor
!insert (series24, actor23) into CassetteActor
```
## Generation 22 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 1 | 2 | 50.00% |
| Types (out of valid Titles) | 1 | 1 | 100.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 1 | 1 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
The Chronicles of Tomorrow
```

| Failed Types | 
|---| 
```
Parsed type: movie != API type: series
```

| Failed Genres | 
|---| 
```
Parsed genre: Comedy != API genre: [Documentary, Family]
```

| Failed Actors | 
|---| 
```
Elena Moon for movie: Wonders of the Universe
```

# Generation 23
```
-- New Client instance with a unique client ID and different suspension status
!new Client('client25')
!client25.clientId := 25
!client25.isSuspended := true

-- New Rental instance with another unique date
!new Rental('rental24')
!rental24.date := Date('2025-04-10')

-- New Movie instance with a special title, genre, and number of available copies
!new Movie('movie24')
!movie24.title := 'The Last Laugh'
!movie24.availableCopies := 4
!movie24.genre := #Comedy

-- New Series instance with distinct episodes and limited available copies
!new Series('series25')
!series25.title := 'Voyage to the Unknown'
!series25.availableCopies := 3
!series25.episode := 15

-- New Actor instance with a unique name
!new Actor('actor24')
!actor24.name := 'Maximilian Chase'

-- Establishing a distinctive client-rental association
!insert (client25, rental24) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental24, movie24) into RentalCassette
!insert (rental24, series25) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie24, actor24) into CassetteActor
!insert (series25, actor24) into CassetteActor
```
## Generation 23 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 0 | 2 | 0.00% |
| Types (out of valid Titles) | 1 | 2 | 50.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 2 | 0.00% |

| Failed Types | 
|---| 
```
Parsed type: series != API type: movie
```

| Failed Genres | 
|---| 
```
Parsed genre: Comedy != API genre: [Drama, Horror]
```

| Failed Actors | 
|---| 
```
Maximilian Chase for movie: The Last Laugh
```
```
Maximilian Chase for movie: Voyage to the Unknown
```

# Generation 24
```
-- New Client instance with a unique client ID and suspension status
!new Client('client26')
!client26.clientId := 26
!client26.isSuspended := false

-- New Rental instance with a fresh date
!new Rental('rental25')
!rental25.date := Date('2025-05-20')

-- New Movie instance with a novel title, genre, and a reasonable number of copies
!new Movie('movie25')
!movie25.title := 'Epic Tales'
!movie25.availableCopies := 6
!movie25.genre := #Action

-- New Series instance with unique episodes and plentiful available copies
!new Series('series26')
!series26.title := 'Cosmic Journey'
!series26.availableCopies := 10
!series26.episode := 9

-- New Actor instance with a distinctive name
!new Actor('actor25')
!actor25.name := 'Catherine Knight'

-- Establishing a unique client-rental association
!insert (client26, rental25) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental25, movie25) into RentalCassette
!insert (rental25, series26) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie25, actor25) into CassetteActor
!insert (series26, actor25) into CassetteActor
```
## Generation 24 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 0 | 2 | 0.00% |
| Types (out of valid Titles) | 2 | 2 | 100.00% |
| Genres (out of valid Titles) | 0 | 1 | 0.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 2 | 0.00% |

| Failed Types | 
|---| 
```
Parsed type: movie != API type: series
```
```
Parsed type: series != API type: movie
```

| Failed Actors | 
|---| 
```
Catherine Knight for movie: Epic Tales
```
```
Catherine Knight for movie: Cosmic Journey
```

# Generation 25
```
-- New Client instance with a unique client ID and suspension status
!new Client('client27')
!client27.clientId := 27
!client27.isSuspended := true

-- New Rental instance with a unique date
!new Rental('rental26')
!rental26.date := Date('2025-06-15')

-- New Movie instance with a distinct title, genre, and several available copies
!new Movie('movie26')
!movie26.title := 'Mystery Nights'
!movie26.availableCopies := 5
!movie26.genre := #Comedy

-- New Series instance with different episodes and available copies
!new Series('series27')
!series27.title := 'Quest for the Past'
!series27.availableCopies := 4
!series27.episode := 7

-- New Actor instance with a unique name
!new Actor('actor26')
!actor26.name := 'Vincent Lane'

-- Establishing a unique client-rental association
!insert (client27, rental26) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental26, movie26) into RentalCassette
!insert (rental26, series27) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie26, actor26) into CassetteActor
!insert (series27, actor26) into CassetteActor
```
## Generation 25 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 2 | 2 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Quest for the Past
```
```
Mystery Nights
```

# Generation 26
```
-- New Client instance with a unique client ID and suspension status
!new Client('client28')
!client28.clientId := 28
!client28.isSuspended := false

-- New Rental instance with a distinct date
!new Rental('rental27')
!rental27.date := Date('2025-07-22')

-- New Movie instance with a unique title, genre, and limited number of copies
!new Movie('movie27')
!movie27.title := 'Adventure Awaits'
!movie27.availableCopies := 3
!movie27.genre := #Action

-- New Series instance with unique episodes and ample available copies
!new Series('series28')
!series28.title := 'The Time Travelers'
!series28.availableCopies := 8
!series28.episode := 21

-- New Actor instance with a distinct name
!new Actor('actor27')
!actor27.name := 'Isabella Holt'

-- Establishing a unique client-rental association
!insert (client28, rental27) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental27, movie27) into RentalCassette
!insert (rental27, series28) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie27, actor27) into CassetteActor
!insert (series28, actor27) into CassetteActor
```
## Generation 26 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 0 | 2 | 0.00% |
| Types (out of valid Titles) | 1 | 2 | 50.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 2 | 0.00% |

| Failed Types | 
|---| 
```
Parsed type: series != API type: movie
```

| Failed Genres | 
|---| 
```
Parsed genre: Action != API genre: [Short, Musical]
```

| Failed Actors | 
|---| 
```
Isabella Holt for movie: The Time Travelers
```
```
Isabella Holt for movie: Adventure Awaits
```

# Generation 27
```
-- New Client instance with a unique client ID and suspension status
!new Client('client29')
!client29.clientId := 29
!client29.isSuspended := true

-- New Rental instance with a unique date
!new Rental('rental28')
!rental28.date := Date('2025-08-30')

-- New Movie instance with a different title, genre, and number of copies
!new Movie('movie28')
!movie28.title := 'Comedy Circus'
!movie28.availableCopies := 4
!movie28.genre := #Comedy

-- New Series instance with various episodes and available copies
!new Series('series29')
!series29.title := 'Mysteries Beyond'
!series29.availableCopies := 5
!series29.episode := 11

-- New Actor instance with a unique name
!new Actor('actor28')
!actor28.name := 'Dylan Forest'

-- Establishing a unique client-rental association
!insert (client29, rental28) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental28, movie28) into RentalCassette
!insert (rental28, series29) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie28, actor28) into CassetteActor
!insert (series29, actor28) into CassetteActor
```
## Generation 27 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 0 | 2 | 0.00% |
| Types (out of valid Titles) | 1 | 2 | 50.00% |
| Genres (out of valid Titles) | 0 | 1 | 0.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 2 | 0.00% |

| Failed Types | 
|---| 
```
Parsed type: movie != API type: series
```

| Failed Actors | 
|---| 
```
Dylan Forest for movie: Mysteries Beyond
```
```
Dylan Forest for movie: Comedy Circus
```

# Generation 28
```
-- New Client instance with a unique client ID and suspension status
!new Client('client30')
!client30.clientId := 30
!client30.isSuspended := false

-- New Rental instance with a different unique date
!new Rental('rental29')
!rental29.date := Date('2025-09-05')

-- New Movie instance with a novel title, genre, and specific available copies
!new Movie('movie29')
!movie29.title := 'Chasing the Horizon'
!movie29.availableCopies := 6
!movie29.genre := #Action

-- New Series instance with distinctive episodes and a new set of copies
!new Series('series30')
!series30.title := 'Epic Sagas'
!series30.availableCopies := 9
!series30.episode := 14

-- New Actor instance with a fresh name
!new Actor('actor29')
!actor29.name := 'Maya Blue'

-- Establishing a unique client-rental association
!insert (client30, rental29) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental29, movie29) into RentalCassette
!insert (rental29, series30) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie29, actor29) into CassetteActor
!insert (series30, actor29) into CassetteActor
```
## Generation 28 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 1 | 2 | 50.00% |
| Types (out of valid Titles) | 0 | 1 | 0.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 1 | 1 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Epic Sagas
```

| Failed Genres | 
|---| 
```
Parsed genre: Action != API genre: [Documentary, Adventure, Comedy]
```

| Failed Actors | 
|---| 
```
Maya Blue for movie: Chasing the Horizon
```

# Generation 29
```
-- New Client instance with a different client ID and suspension status
!new Client('client31')
!client31.clientId := 31
!client31.isSuspended := true

-- New Rental instance with a different unique date
!new Rental('rental30')
!rental30.date := Date('2025-10-15')

-- New Movie instance with a novel title, a mix of genres, and varied available copies
!new Movie('movie30')
!movie30.title := 'Laughs and Thrills'
!movie30.availableCopies := 5
!movie30.genre := #Comedy

-- New Series instance with unique episodes and available copies 
!new Series('series31')
!series31.title := 'Lost Dimensions'
!series31.availableCopies := 7
!series31.episode := 18

-- New Actor instance with a distinctive name
!new Actor('actor30')
!actor30.name := 'Zoe Winters'

-- Establishing a unique client-rental association
!insert (client31, rental30) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental30, movie30) into RentalCassette
!insert (rental30, series31) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie30, actor30) into CassetteActor
!insert (series31, actor30) into CassetteActor
```
## Generation 29 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 2 | 2 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Lost Dimensions
```
```
Laughs and Thrills
```

# Generation 30
```
-- New Client instance with a unique client ID and suspension status
!new Client('client32')
!client32.clientId := 32
!client32.isSuspended := false

-- New Rental instance with a different unique date
!new Rental('rental31')
!rental31.date := Date('2025-11-25')

-- New Movie instance with a unique title, genre, and specific available copies
!new Movie('movie31')
!movie31.title := 'Whispers of the Past'
!movie31.availableCopies := 2
!movie31.genre := #Action

-- New Series instance with distinct episodes and a particular number of copies
!new Series('series32')
!series32.title := 'Kingdoms and Empires'
!series32.availableCopies := 10
!series32.episode := 12

-- New Actor instance with a different name
!new Actor('actor31')
!actor31.name := 'Liam Collins'

-- Establishing a unique client-rental association
!insert (client32, rental31) into ClientRental

-- Associating the rental with the new movie and series
!insert (rental31, movie31) into RentalCassette
!insert (rental31, series32) into RentalCassette

-- Associating the movie and series with the new actor
!insert (movie31, actor31) into CassetteActor
!insert (series32, actor31) into CassetteActor
```
## Generation 30 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 20 | 0.00% |
| Multiplicities Errors | 0 | 5 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 2 | 2 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Kingdoms and Empires
```
```
Whispers of the Past
```

# Summary for all generations
| Summary | Value | 
|---|---| 
| Model | GPT_4O | 
| Type | Simple | 
| System | videoclub | 
| Number of generations | 30 | 

| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 628 | 0.00% |
| Multiplicities Errors | 0 | 156 | 0.00% |
| Invariants Errors | 0 | 90 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 30 | 63 | 47.62% |
| Types (out of valid Titles) | 14 | 33 | 42.42% |
| Genres (out of valid Titles) | 9 | 19 | 47.37% |
| Actors (out of valid Titles) | 33 | 33 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 33 | 0.00% |

| Failed Titles | 
|---| 
```
Comedy Flick
```
```
Minimal Episode Series
```
```
Thrilling Action
```
```
Endless Mystery
```
```
Sci-Fi Adventure
```
```
Laughter Riot
```
```
Historical Saga
```
```
Comedic Chaos
```
```
The Forgotten Era
```
```
Classic Humor
```
```
Sci-Fi Odyssey
```
```
Uncharted Realm
```
```
Legends Awaken
```
```
Mystic Adventures
```
```
Daring Pursuit
```
```
Chronicles of Old
```
```
Hidden Mysteries
```
```
Galactic Conquest
```
```
Tales of the Future
```
```
Enigma Unearthed
```
```
Forgotten Worlds
```
```
Thrill Seeker
```
```
The Chronicles of Tomorrow
```
```
Quest for the Past
```
```
Mystery Nights
```
```
Epic Sagas
```
```
Lost Dimensions
```
```
Laughs and Thrills
```
```
Kingdoms and Empires
```
```
Whispers of the Past
```

| Failed Types | 
|---| 
```
Parsed type: series != API type: movie
```
```
Parsed type: series != API type: movie
```
```
Parsed type: series != API type: movie
```
```
Parsed type: movie != API type: series
```
```
Parsed type: series != API type: movie
```
```
Parsed type: series != API type: movie
```
```
Parsed type: series != API type: movie
```
```
Parsed type: series != API type: movie
```
```
Parsed type: movie != API type: series
```
```
Parsed type: series != API type: movie
```
```
Parsed type: movie != API type: series
```
```
Parsed type: series != API type: movie
```
```
Parsed type: series != API type: movie
```
```
Parsed type: movie != API type: series
```

| Failed Genres | 
|---| 
```
Parsed genre: Action != API genre: [Animation, Musical]
```
```
Parsed genre: Comedy != API genre: [Short]
```
```
Parsed genre: Action != API genre: [Adventure, Drama, Thriller]
```
```
Parsed genre: Action != API genre: [Adventure, Biography, Drama]
```
```
Parsed genre: Action != API genre: [Comedy, Musical]
```
```
Parsed genre: Comedy != API genre: [Documentary, Family]
```
```
Parsed genre: Comedy != API genre: [Drama, Horror]
```
```
Parsed genre: Action != API genre: [Short, Musical]
```
```
Parsed genre: Action != API genre: [Documentary, Adventure, Comedy]
```

| Failed Actors | 
|---| 
```
John Doe for movie: Action Movie
```
```
John Doe for movie: Adventure Series
```
```
Jane Smith for movie: Drama Series
```
```
Clara White for movie: Epic Quest
```
```
Oliver Black for movie: Mystery Thriller
```
```
Sophia Blue for movie: Journey Beyond
```
```
Emma Green for movie: Beginning of Time
```
```
Noah Grey for movie: Comedy of Errors
```
```
Noah Grey for movie: Epic Journey
```
```
Sophia Lane for movie: Silent Whispers
```
```
Ethan Cross for movie: Laugh Out Loud
```
```
Lily Stone for movie: Adrenaline Rush
```
```
Oscar Reed for movie: Space Chronicles
```
```
Oscar Reed for movie: The Great Escape
```
```
Grace Harper for movie: Romantic Interlude
```
```
Victor Hale for movie: Into the Wild
```
```
Fiona Lake for movie: Comedy of Life
```
```
Fiona Lake for movie: Ancient Secrets
```
```
Nathan Brooks for movie: Echoes of Time
```
```
Amelia Frost for movie: Journey Through History
```
```
Amelia Frost for movie: The Great Masquerade
```
```
Oliver Stone for movie: Around the World
```
```
Oliver Stone for movie: Secrets of the Deep
```
```
Elena Moon for movie: Wonders of the Universe
```
```
Maximilian Chase for movie: The Last Laugh
```
```
Maximilian Chase for movie: Voyage to the Unknown
```
```
Catherine Knight for movie: Epic Tales
```
```
Catherine Knight for movie: Cosmic Journey
```
```
Isabella Holt for movie: The Time Travelers
```
```
Isabella Holt for movie: Adventure Awaits
```
```
Dylan Forest for movie: Mysteries Beyond
```
```
Dylan Forest for movie: Comedy Circus
```
```
Maya Blue for movie: Chasing the Horizon
```

