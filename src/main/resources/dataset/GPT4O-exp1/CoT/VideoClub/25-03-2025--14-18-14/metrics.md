# Generation 1
## Category baseline
```
!new Client('client101')
!client101.clientId := 101
!client101.isSuspended := false

!new Client('client102')
!client102.clientId := 102
!client102.isSuspended := true

!new Rental('rental1')
!rental1.date := Date('2023-09-15')

!new Rental('rental2')
!rental2.date := Date('2023-10-01')

!new Movie('movie1')
!movie1.title := 'High-Speed Chase'
!movie1.availableCopies := 3
!movie1.genre := #Action

!new Series('series1')
!series1.title := 'The Laughter House'
!series1.availableCopies := 2
!series1.episode := 1

!new Actor('actor1')
!actor1.name := 'John Fast'

!new Actor('actor2')
!actor2.name := 'Comica Joy'

!insert (client101, rental1) into ClientRental
!insert (client102, rental2) into ClientRental

!insert (rental1, movie1) into RentalCassette
!insert (rental2, series1) into RentalCassette

!insert (movie1, actor1) into CassetteActor
!insert (series1, actor2) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 28 | 0.00% |
| Multiplicities Errors | 0 | 6 | 0.00% |
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
The Laughter House
```

| Failed Types | 
|---| 
```
Parsed type: movie != API type: series
```

| Failed Genres | 
|---| 
```
Parsed genre: Action != API genre: [Crime]
```

| Failed Actors | 
|---| 
```
John Fast for movie: High-Speed Chase
```

## Category boundary
```
!new Client('clientBoundary1')
!clientBoundary1.clientId := 1
!clientBoundary1.isSuspended := false

!new Client('clientBoundary2')
!clientBoundary2.clientId := 2147483647
!clientBoundary2.isSuspended := true

!new Rental('rentalBoundary1')
!rentalBoundary1.date := Date('2023-01-01')

!new Movie('movieBoundary1')
!movieBoundary1.title := 'Fast Affair'
!movieBoundary1.availableCopies := 0
!movieBoundary1.genre := #Action

!new Series('seriesBoundary1')
!seriesBoundary1.title := 'TechVenture Ep.1'
!seriesBoundary1.availableCopies := 1
!seriesBoundary1.episode := 1

!new Movie('movieBoundary2')
!movieBoundary2.title := 'The Comedy Show'
!movieBoundary2.availableCopies := 9999
!movieBoundary2.genre := #Comedy

!new Actor('actorBoundary1')
!actorBoundary1.name := 'John Doe'

!new Actor('actorBoundary2')
!actorBoundary2.name := 'Jane Smith'

!insert (clientBoundary1, rentalBoundary1) into ClientRental

!insert (rentalBoundary1, movieBoundary1) into RentalCassette
!insert (rentalBoundary1, seriesBoundary1) into RentalCassette

!insert (movieBoundary1, actorBoundary1) into CassetteActor
!insert (seriesBoundary1, actorBoundary2) into CassetteActor

!insert (movieBoundary2, actorBoundary1) into CassetteActor
!insert (movieBoundary2, actorBoundary2) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 31 | 0.00% |
| Multiplicities Errors | 0 | 7 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 2 | 3 | 66.67% |
| Types (out of valid Titles) | 1 | 1 | 100.00% |
| Genres (out of valid Titles) | 0 | 1 | 0.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
TechVenture Ep.1
```
```
Fast Affair
```

| Failed Types | 
|---| 
```
Parsed type: movie != API type: series
```

| Failed Actors | 
|---| 
```
John Doe for movie: The Comedy Show
```
```
Jane Smith for movie: The Comedy Show
```

## Category complex
```
!new Client('martaLopez')
!martaLopez.clientId := 101
!martaLopez.isSuspended := false

!new Client('giorgioDiLuca')
!giorgioDiLuca.clientId := 102
!giorgioDiLuca.isSuspended := true

!new Rental('rentalMarta')
!rentalMarta.date := Date('2023-09-15')

!new Rental('rentalGiorgio')
!rentalGiorgio.date := Date('2023-09-12')

!new Movie('movieLaViaLactea')
!movieLaViaLactea.title := 'La Vía Láctea'
!movieLaViaLactea.availableCopies := 5
!movieLaViaLactea.genre := #Comedy

!new Movie('movieDesperadoAction')
!movieDesperadoAction.title := 'Desperado in Action'
!movieDesperadoAction.availableCopies := 3
!movieDesperadoAction.genre := #Action

!new Series('seriesBCChronicles')
!seriesBCChronicles.title := 'Barcelona Chronicles'
!seriesBCChronicles.availableCopies := 2
!seriesBCChronicles.episode := 4

!new Actor('actorJavierBardem')
!actorJavierBardem.name := 'Javier Bardem'

!new Actor('actorPenelopeCruz')
!actorPenelopeCruz.name := 'Penelope Cruz'

!new Actor('actorChloeZhang')
!actorChloeZhang.name := 'Chloe Zhang'

!insert (martaLopez, rentalMarta) into ClientRental
!insert (giorgioDiLuca, rentalGiorgio) into ClientRental

!insert (rentalMarta, movieLaViaLactea) into RentalCassette
!insert (rentalMarta, seriesBCChronicles) into RentalCassette
!insert (rentalGiorgio, movieDesperadoAction) into RentalCassette

!insert (movieLaViaLactea, actorJavierBardem) into CassetteActor
!insert (movieLaViaLactea, actorPenelopeCruz) into CassetteActor
!insert (movieDesperadoAction, actorJavierBardem) into CassetteActor
!insert (seriesBCChronicles, actorChloeZhang) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 37 | 0.00% |
| Multiplicities Errors | 0 | 9 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 2 | 3 | 66.67% |
| Types (out of valid Titles) | 0 | 1 | 0.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Desperado in Action
```
```
Barcelona Chronicles
```

| Failed Genres | 
|---| 
```
Parsed genre: Comedy != API genre: [Short, Family, Fantasy]
```

| Failed Actors | 
|---| 
```
Javier Bardem for movie: La Vía Láctea
```
```
Penelope Cruz for movie: La Vía Láctea
```

## Category edge
```
!new Client('clientEdge1')
!clientEdge1.clientId := 1
!clientEdge1.isSuspended := false

!new Rental('rentalEdge1')
!rentalEdge1.date := Date('2023-09-20')

!new Rental('rentalEdge2')
!rentalEdge2.date := Date('2023-09-21')

!new Movie('cassetteOnlyCopy')
!cassetteOnlyCopy.title := 'The Only Copy'
!cassetteOnlyCopy.availableCopies := 1
!cassetteOnlyCopy.genre := #Action

!new Series('cassetteSingleEpisode')
!cassetteSingleEpisode.title := 'Single Episode Saga'
!cassetteSingleEpisode.availableCopies := 0
!cassetteSingleEpisode.episode := 1

!new Actor('actorJohnSmith')
!actorJohnSmith.name := 'John Smith'

!new Actor('actorJaneDoe')
!actorJaneDoe.name := 'Jane Doe'

!new Actor('actorCarlosMendes')
!actorCarlosMendes.name := 'Carlos Mendes'

!insert (clientEdge1, rentalEdge1) into ClientRental
!insert (clientEdge1, rentalEdge2) into ClientRental

!insert (rentalEdge1, cassetteOnlyCopy) into RentalCassette
!insert (rentalEdge1, cassetteSingleEpisode) into RentalCassette
!insert (rentalEdge2, cassetteOnlyCopy) into RentalCassette

!insert (cassetteOnlyCopy, actorJohnSmith) into CassetteActor
!insert (cassetteOnlyCopy, actorJaneDoe) into CassetteActor
!insert (cassetteSingleEpisode, actorCarlosMendes) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 29 | 0.00% |
| Multiplicities Errors | 0 | 8 | 0.00% |
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
The Only Copy
```
```
Single Episode Saga
```

## Category invalid
```
!new Client('mariaAlvarez')
!mariaAlvarez.clientId := 203
!mariaAlvarez.isSuspended := false

!new Client('zhangWei')
!zhangWei.clientId := 204
!zhangWei.isSuspended := false

!new Rental('rentalTorontoEvening')
!rentalTorontoEvening.date := Date('2023-09-15')

!new Rental('rentalCulturalDiscoveries')
!rentalCulturalDiscoveries.date := Date('2023-09-20')

!new Series('cassetteAlmodovarMasterpieces')
!cassetteAlmodovarMasterpieces.title := 'Almodóvar Masterpieces'
!cassetteAlmodovarMasterpieces.availableCopies := 5
!cassetteAlmodovarMasterpieces.episode := 3

!new Movie('cassetteJackieChanClassics')
!cassetteJackieChanClassics.title := 'Jackie Chan Classics'
!cassetteJackieChanClassics.availableCopies := 2
!cassetteJackieChanClassics.genre := #Action

!new Series('cassetteCulturalSeriesVolume1')
!cassetteCulturalSeriesVolume1.title := 'Cultural Series: Volume 1'
!cassetteCulturalSeriesVolume1.availableCopies := 3
!cassetteCulturalSeriesVolume1.episode := 1

!new Actor('actorPenelopeCruz')
!actorPenelopeCruz.name := 'Penélope Cruz'

!new Actor('actorJackieChan')
!actorJackieChan.name := 'Jackie Chan'

!new Actor('actorVariousArtists')
!actorVariousArtists.name := 'Various Artists'

!insert (mariaAlvarez, rentalTorontoEvening) into ClientRental
!insert (zhangWei, rentalCulturalDiscoveries) into ClientRental

!insert (rentalTorontoEvening, cassetteAlmodovarMasterpieces) into RentalCassette
!insert (rentalTorontoEvening, cassetteJackieChanClassics) into RentalCassette

!insert (rentalCulturalDiscoveries, cassetteJackieChanClassics) into RentalCassette
!insert (rentalCulturalDiscoveries, cassetteCulturalSeriesVolume1) into RentalCassette

!insert (cassetteAlmodovarMasterpieces, actorPenelopeCruz) into CassetteActor
!insert (cassetteJackieChanClassics, actorJackieChan) into CassetteActor
!insert (cassetteCulturalSeriesVolume1, actorVariousArtists) into CassetteActor
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 9 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 3 | 3 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Cultural Series: Volume 1
```
```
Jackie Chan Classics
```
```
Almodóvar Masterpieces
```

## Generation 1 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 162 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 12 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 9 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 10 | 13 | 76.92% |
| Types (out of valid Titles) | 2 | 3 | 66.67% |
| Genres (out of valid Titles) | 2 | 3 | 66.67% |
| Actors (out of valid Titles) | 5 | 5 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 2 | 0.00% |

| Failed Titles | 
|---| 
```
The Laughter House
```
```
TechVenture Ep.1
```
```
Fast Affair
```
```
Desperado in Action
```
```
Barcelona Chronicles
```
```
The Only Copy
```
```
Single Episode Saga
```
```
Cultural Series: Volume 1
```
```
Jackie Chan Classics
```
```
Almodóvar Masterpieces
```

| Failed Types | 
|---| 
```
Parsed type: movie != API type: series
```
```
Parsed type: movie != API type: series
```

| Failed Genres | 
|---| 
```
Parsed genre: Action != API genre: [Crime]
```
```
Parsed genre: Comedy != API genre: [Short, Family, Fantasy]
```

| Failed Actors | 
|---| 
```
John Fast for movie: High-Speed Chase
```
```
John Doe for movie: The Comedy Show
```
```
Jane Smith for movie: The Comedy Show
```
```
Javier Bardem for movie: La Vía Láctea
```
```
Penelope Cruz for movie: La Vía Láctea
```

# Generation 2
## Category baseline
```
!new Client('clientGlobal1')
!clientGlobal1.clientId := 201
!clientGlobal1.isSuspended := false

!new Client('clientGlobal2')
!clientGlobal2.clientId := 202
!clientGlobal2.isSuspended := false

!new Rental('rentalGlobal1')
!rentalGlobal1.date := Date('2023-10-03')

!new Rental('rentalGlobal2')
!rentalGlobal2.date := Date('2023-10-10')

!new Movie('movieChateauMysteres')
!movieChateauMysteres.title := 'Château de Mystères'
!movieChateauMysteres.availableCopies := 5
!movieChateauMysteres.genre := #Comedy

!new Series('seriesTeknologiRevolusi')
!seriesTeknologiRevolusi.title := 'Teknologi Revolusi'
!seriesTeknologiRevolusi.availableCopies := 1
!seriesTeknologiRevolusi.episode := 3

!new Actor('actorFrancoisHumour')
!actorFrancoisHumour.name := 'François Humour'

!new Actor('actorIndahSarjana')
!actorIndahSarjana.name := 'Indah Sarjana'

!new Actor('actorRinaEkstra')
!actorRinaEkstra.name := 'Rina Ekstra'

!insert (clientGlobal1, rentalGlobal1) into ClientRental
!insert (clientGlobal2, rentalGlobal2) into ClientRental

!insert (rentalGlobal1, movieChateauMysteres) into RentalCassette
!insert (rentalGlobal2, seriesTeknologiRevolusi) into RentalCassette

!insert (movieChateauMysteres, actorFrancoisHumour) into CassetteActor
!insert (seriesTeknologiRevolusi, actorIndahSarjana) into CassetteActor
!insert (seriesTeknologiRevolusi, actorRinaEkstra) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 31 | 0.00% |
| Multiplicities Errors | 0 | 7 | 0.00% |
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
Château de Mystères
```
```
Teknologi Revolusi
```

## Category boundary
```
!new Client('clientBoundary3')
!clientBoundary3.clientId := 2
!clientBoundary3.isSuspended := true

!new Client('clientBoundary4')
!clientBoundary4.clientId := 1000000
!clientBoundary4.isSuspended := false

!new Rental('rentalBoundary2')
!rentalBoundary2.date := Date('2024-01-01')

!new Movie('cassetteGalaxyQuestXX')
!cassetteGalaxyQuestXX.title := 'Galaxy Quest XX'
!cassetteGalaxyQuestXX.availableCopies := 10000
!cassetteGalaxyQuestXX.genre := #Action

!new Series('cassetteDetectiveChronicles')
!cassetteDetectiveChronicles.title := 'Detective Chronicles Ep.5'
!cassetteDetectiveChronicles.availableCopies := 5
!cassetteDetectiveChronicles.episode := 5

!new Movie('cassetteStreetLaughs')
!cassetteStreetLaughs.title := 'Street Laughs'
!cassetteStreetLaughs.availableCopies := 0
!cassetteStreetLaughs.genre := #Comedy

!new Actor('actorCarlosSanz')
!actorCarlosSanz.name := 'Carlos Sanz'

!new Actor('actorMiyukiTanaka')
!actorMiyukiTanaka.name := 'Miyuki Tanaka'

!insert (clientBoundary3, rentalBoundary2) into ClientRental

!insert (rentalBoundary2, cassetteGalaxyQuestXX) into RentalCassette
!insert (rentalBoundary2, cassetteDetectiveChronicles) into RentalCassette

!insert (cassetteGalaxyQuestXX, actorCarlosSanz) into CassetteActor
!insert (cassetteDetectiveChronicles, actorMiyukiTanaka) into CassetteActor

!insert (cassetteStreetLaughs, actorCarlosSanz) into CassetteActor
!insert (cassetteStreetLaughs, actorMiyukiTanaka) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 31 | 0.00% |
| Multiplicities Errors | 0 | 7 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 3 | 3 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Detective Chronicles Ep.5
```
```
Galaxy Quest XX
```
```
Street Laughs
```

## Category complex
```
!new Client('ivanPopovic')
!ivanPopovic.clientId := 201
!ivanPopovic.isSuspended := false

!new Client('anaKovacevic')
!anaKovacevic.clientId := 202
!anaKovacevic.isSuspended := false

!new Client('johnSmith')
!johnSmith.clientId := 203
!johnSmith.isSuspended := true

!new Rental('rentalIvan')
!rentalIvan.date := Date('2023-10-01')

!new Rental('rentalAna')
!rentalAna.date := Date('2023-10-02')

!new Movie('movieAdriaticHeist')
!movieAdriaticHeist.title := 'The Adriatic Heist'
!movieAdriaticHeist.availableCopies := 7
!movieAdriaticHeist.genre := #Action

!new Movie('movieNightsInSplit')
!movieNightsInSplit.title := 'Nights in Split'
!movieNightsInSplit.availableCopies := 4
!movieNightsInSplit.genre := #Comedy

!new Series('seriesDalmatianDays')
!seriesDalmatianDays.title := 'Dalmatian Days'
!seriesDalmatianDays.availableCopies := 1
!seriesDalmatianDays.episode := 10

!new Actor('actorGoranVisnjic')
!actorGoranVisnjic.name := 'Goran Visnjic'

!new Actor('actorMillaJovovich')
!actorMillaJovovich.name := 'Milla Jovovich'

!new Actor('actorEllaMorales')
!actorEllaMorales.name := 'Ella Morales'

!insert (ivanPopovic, rentalIvan) into ClientRental
!insert (anaKovacevic, rentalAna) into ClientRental

!insert (rentalIvan, movieAdriaticHeist) into RentalCassette
!insert (rentalAna, movieNightsInSplit) into RentalCassette
!insert (rentalAna, seriesDalmatianDays) into RentalCassette

!insert (movieAdriaticHeist, actorGoranVisnjic) into CassetteActor
!insert (movieNightsInSplit, actorMillaJovovich) into CassetteActor
!insert (seriesDalmatianDays, actorEllaMorales) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 39 | 0.00% |
| Multiplicities Errors | 0 | 8 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 3 | 3 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Nights in Split
```
```
The Adriatic Heist
```
```
Dalmatian Days
```

## Category edge
```
!new Client('clientEdge101')
!clientEdge101.clientId := 101
!clientEdge101.isSuspended := false

!new Client('clientEdge102')
!clientEdge102.clientId := 102
!clientEdge102.isSuspended := true

!new Rental('rentalEdge1')
!rentalEdge1.date := Date('2023-10-01')

!new Rental('rentalEdge2')
!rentalEdge2.date := Date('2023-10-01')

!new Movie('cassetteCrouchingTiger')
!cassetteCrouchingTiger.title := 'Crouching Tiger'
!cassetteCrouchingTiger.availableCopies := 3
!cassetteCrouchingTiger.genre := #Action

!new Series('cassetteFinaleFrenzy')
!cassetteFinaleFrenzy.title := 'Finale Frenzy'
!cassetteFinaleFrenzy.availableCopies := 1
!cassetteFinaleFrenzy.episode := 48

!new Movie('cassetteSilentComedy')
!cassetteSilentComedy.title := 'Silent Comedy'
!cassetteSilentComedy.availableCopies := 2
!cassetteSilentComedy.genre := #Comedy

!new Actor('actorJetLi')
!actorJetLi.name := 'Jet Li'

!new Actor('actorTomHanks')
!actorTomHanks.name := 'Tom Hanks'

!new Actor('actorJessicaAlba')
!actorJessicaAlba.name := 'Jessica Alba'

!new Actor('actorCharlieChaplin')
!actorCharlieChaplin.name := 'Charlie Chaplin'

!insert (clientEdge101, rentalEdge1) into ClientRental
!insert (clientEdge102, rentalEdge2) into ClientRental

!insert (rentalEdge1, cassetteCrouchingTiger) into RentalCassette
!insert (rentalEdge1, cassetteFinaleFrenzy) into RentalCassette

!insert (rentalEdge2, cassetteSilentComedy) into RentalCassette

!insert (cassetteCrouchingTiger, actorJetLi) into CassetteActor
!insert (cassetteFinaleFrenzy, actorTomHanks) into CassetteActor
!insert (cassetteFinaleFrenzy, actorJessicaAlba) into CassetteActor
!insert (cassetteSilentComedy, actorCharlieChaplin) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 39 | 0.00% |
| Multiplicities Errors | 0 | 9 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 1 | 3 | 33.33% |
| Types (out of valid Titles) | 0 | 2 | 0.00% |
| Genres (out of valid Titles) | 0 | 2 | 0.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 2 | 0.00% |

| Failed Titles | 
|---| 
```
Finale Frenzy
```

| Failed Actors | 
|---| 
```
Charlie Chaplin for movie: Silent Comedy
```
```
Jet Li for movie: Crouching Tiger
```

## Category invalid
```
!new Client('kojiTanaka')
!kojiTanaka.clientId := 501
!kojiTanaka.isSuspended := false

!new Client('aishaKapoor')
!aishaKapoor.clientId := 502
!aishaKapoor.isSuspended := false

!new Rental('rentalWeekendCinemaNight')
!rentalWeekendCinemaNight.date := Date('2023-11-10')

!new Rental('rentalHumorDelightBox')
!rentalHumorDelightBox.date := Date('2023-11-12')

!new Series('cassetteSamuraiStories')
!cassetteSamuraiStories.title := 'Samurai Stories'
!cassetteSamuraiStories.availableCopies := 7
!cassetteSamuraiStories.episode := 5

!new Movie('cassetteModernJapaneseComedy')
!cassetteModernJapaneseComedy.title := 'Modern Japanese Comedy'
!cassetteModernJapaneseComedy.availableCopies := 4
!cassetteModernJapaneseComedy.genre := #Comedy

!new Series('cassetteBritishWitCollection')
!cassetteBritishWitCollection.title := 'British Wit Collection'
!cassetteBritishWitCollection.availableCopies := 6
!cassetteBritishWitCollection.episode := 8

!new Actor('actorKenWatanabe')
!actorKenWatanabe.name := 'Ken Watanabe'

!new Actor('actorYukiYamada')
!actorYukiYamada.name := 'Yūki Yamada'

!new Actor('actorBenedictCumberbatch')
!actorBenedictCumberbatch.name := 'Benedict Cumberbatch'

!insert (kojiTanaka, rentalWeekendCinemaNight) into ClientRental
!insert (aishaKapoor, rentalHumorDelightBox) into ClientRental

!insert (rentalWeekendCinemaNight, cassetteSamuraiStories) into RentalCassette
!insert (rentalWeekendCinemaNight, cassetteModernJapaneseComedy) into RentalCassette

!insert (rentalHumorDelightBox, cassetteModernJapaneseComedy) into RentalCassette
!insert (rentalHumorDelightBox, cassetteBritishWitCollection) into RentalCassette

!insert (cassetteSamuraiStories, actorKenWatanabe) into CassetteActor
!insert (cassetteModernJapaneseComedy, actorYukiYamada) into CassetteActor
!insert (cassetteBritishWitCollection, actorBenedictCumberbatch) into CassetteActor
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 9 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 3 | 3 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
British Wit Collection
```
```
Modern Japanese Comedy
```
```
Samurai Stories
```

## Generation 2 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 177 | 0.00% |
| Multiplicities Errors | 0 | 31 | 0.00% |
| Invariants Errors | 0 | 12 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 9 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 12 | 14 | 85.71% |
| Types (out of valid Titles) | 0 | 2 | 0.00% |
| Genres (out of valid Titles) | 0 | 2 | 0.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 2 | 0.00% |

| Failed Titles | 
|---| 
```
Château de Mystères
```
```
Teknologi Revolusi
```
```
Detective Chronicles Ep.5
```
```
Galaxy Quest XX
```
```
Street Laughs
```
```
Nights in Split
```
```
The Adriatic Heist
```
```
Dalmatian Days
```
```
Finale Frenzy
```
```
British Wit Collection
```
```
Modern Japanese Comedy
```
```
Samurai Stories
```

| Failed Actors | 
|---| 
```
Charlie Chaplin for movie: Silent Comedy
```
```
Jet Li for movie: Crouching Tiger
```

# Generation 3
## Category baseline
```
!new Client('client301')
!client301.clientId := 301
!client301.isSuspended := false

!new Client('client302')
!client302.clientId := 302
!client302.isSuspended := true

!new Client('client303')
!client303.clientId := 303
!client303.isSuspended := false

!new Rental('rental1')
!rental1.date := Date('2023-08-12')

!new Rental('rental2')
!rental2.date := Date('2023-09-25')

!new Movie('movieEspionajeLluvia')
!movieEspionajeLluvia.title := 'El Espionaje en la Lluvia'
!movieEspionajeLluvia.availableCopies := 2
!movieEspionajeLluvia.genre := #Action

!new Series('seriesFablesFarEast')
!seriesFablesFarEast.title := 'Fables of the Far East'
!seriesFablesFarEast.availableCopies := 4
!seriesFablesFarEast.episode := 5

!new Movie('movieVintageLaughter')
!movieVintageLaughter.title := 'Vintage Laughter'
!movieVintageLaughter.availableCopies := 10
!movieVintageLaughter.genre := #Comedy

!new Actor('actorLolaEstrada')
!actorLolaEstrada.name := 'Lola Estrada'

!new Actor('actorCarlosMartinez')
!actorCarlosMartinez.name := 'Carlos Martinez'

!new Actor('actorAkiraYamato')
!actorAkiraYamato.name := 'Akira Yamato'

!new Actor('actorMonaHalden')
!actorMonaHalden.name := 'Mona Halden'

!insert (client301, rental1) into ClientRental
!insert (client303, rental2) into ClientRental

!insert (rental1, movieEspionajeLluvia) into RentalCassette
!insert (rental2, seriesFablesFarEast) into RentalCassette

!insert (movieEspionajeLluvia, actorLolaEstrada) into CassetteActor
!insert (movieEspionajeLluvia, actorCarlosMartinez) into CassetteActor
!insert (seriesFablesFarEast, actorAkiraYamato) into CassetteActor
!insert (movieVintageLaughter, actorMonaHalden) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 41 | 0.00% |
| Multiplicities Errors | 0 | 8 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 3 | 3 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Vintage Laughter
```
```
El Espionaje en la Lluvia
```
```
Fables of the Far East
```

## Category boundary
```
!new Client('clientBoundary5')
!clientBoundary5.clientId := 3
!clientBoundary5.isSuspended := true

!new Client('clientBoundary6')
!clientBoundary6.clientId := 123456789
!clientBoundary6.isSuspended := false

!new Rental('rentalBoundary3')
!rentalBoundary3.date := Date('2023-12-31')

!new Movie('cassetteLegendsOfTheFall')
!cassetteLegendsOfTheFall.title := 'Legends of the Fall'
!cassetteLegendsOfTheFall.availableCopies := 1
!cassetteLegendsOfTheFall.genre := #Action

!new Series('cassetteMysteryInTheNorth')
!cassetteMysteryInTheNorth.title := 'Mystery in the North Ep.20'
!cassetteMysteryInTheNorth.availableCopies := 2
!cassetteMysteryInTheNorth.episode := 20

!new Actor('actorAnnaMuller')
!actorAnnaMuller.name := 'Anna Müller'

!new Actor('actorRajeshKumar')
!actorRajeshKumar.name := 'Rajesh Kumar'

!insert (clientBoundary5, rentalBoundary3) into ClientRental

!insert (rentalBoundary3, cassetteLegendsOfTheFall) into RentalCassette
!insert (rentalBoundary3, cassetteMysteryInTheNorth) into RentalCassette

!insert (cassetteLegendsOfTheFall, actorAnnaMuller) into CassetteActor
!insert (cassetteLegendsOfTheFall, actorRajeshKumar) into CassetteActor
!insert (cassetteMysteryInTheNorth, actorRajeshKumar) into CassetteActor
!insert (cassetteMysteryInTheNorth, actorAnnaMuller) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 27 | 0.00% |
| Multiplicities Errors | 0 | 7 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 1 | 2 | 50.00% |
| Types (out of valid Titles) | 0 | 1 | 0.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Mystery in the North Ep.20
```

| Failed Genres | 
|---| 
```
Parsed genre: Action != API genre: [Drama, Romance, War]
```

| Failed Actors | 
|---| 
```
Anna Müller for movie: Legends of the Fall
```
```
Rajesh Kumar for movie: Legends of the Fall
```

## Category complex
```
!new Client('priyaSharma')
!priyaSharma.clientId := 301
!priyaSharma.isSuspended := false

!new Client('arjunNair')
!arjunNair.clientId := 302
!arjunNair.isSuspended := true

!new Rental('rentalPriya')
!rentalPriya.date := Date('2023-11-05')

!new Rental('rentalArjun')
!rentalArjun.date := Date('2023-10-25')

!new Movie('movieDanceOfTheTigers')
!movieDanceOfTheTigers.title := 'Dance of the Tigers'
!movieDanceOfTheTigers.availableCopies := 8
!movieDanceOfTheTigers.genre := #Action

!new Movie('movieChaiAndChatter')
!movieChaiAndChatter.title := 'Chai & Chatter'
!movieChaiAndChatter.availableCopies := 6
!movieChaiAndChatter.genre := #Comedy

!new Series('seriesSpiceRoutes')
!seriesSpiceRoutes.title := 'Spice Routes'
!seriesSpiceRoutes.availableCopies := 3
!seriesSpiceRoutes.episode := 7

!new Actor('actorAmitabhBachchan')
!actorAmitabhBachchan.name := 'Amitabh Bachchan'

!new Actor('actorDeepikaPadukone')
!actorDeepikaPadukone.name := 'Deepika Padukone'

!new Actor('actorRanveerSingh')
!actorRanveerSingh.name := 'Ranveer Singh'

!new Actor('actorPriyankaChopra')
!actorPriyankaChopra.name := 'Priyanka Chopra'

!insert (priyaSharma, rentalPriya) into ClientRental
!insert (arjunNair, rentalArjun) into ClientRental

!insert (rentalPriya, movieDanceOfTheTigers) into RentalCassette
!insert (rentalPriya, seriesSpiceRoutes) into RentalCassette

!insert (rentalArjun, movieChaiAndChatter) into RentalCassette

!insert (movieDanceOfTheTigers, actorAmitabhBachchan) into CassetteActor
!insert (movieDanceOfTheTigers, actorDeepikaPadukone) into CassetteActor
!insert (movieChaiAndChatter, actorRanveerSingh) into CassetteActor
!insert (movieChaiAndChatter, actorPriyankaChopra) into CassetteActor
!insert (seriesSpiceRoutes, actorDeepikaPadukone) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 40 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 3 | 3 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Dance of the Tigers
```
```
Chai & Chatter
```
```
Spice Routes
```

## Category edge
```
!new Client('client200')
!client200.clientId := 200
!client200.isSuspended := false

!new Client('client201')
!client201.clientId := 201
!client201.isSuspended := false

!new Client('client202')
!client202.clientId := 202
!client202.isSuspended := false

!new Rental('rental1')
!rental1.date := Date('2023-09-15')

!new Rental('rental2')
!rental2.date := Date('2023-09-16')

!new Rental('rental3')
!rental3.date := Date('2023-09-17')

!new Movie('cassetteDirectorsVision')
!cassetteDirectorsVision.title := 'Director’s Vision'
!cassetteDirectorsVision.availableCopies := 0
!cassetteDirectorsVision.genre := #Action

!new Series('cassetteEpicConclusion')
!cassetteEpicConclusion.title := 'Epic Conclusion'
!cassetteEpicConclusion.availableCopies := 1
!cassetteEpicConclusion.episode := 30

!new Movie('cassetteEveningLaughs')
!cassetteEveningLaughs.title := 'Evening Laughs'
!cassetteEveningLaughs.availableCopies := 2
!cassetteEveningLaughs.genre := #Comedy

!new Actor('actorCateBlanchett')
!actorCateBlanchett.name := 'Cate Blanchett'

!new Actor('actorDenzelWashington')
!actorDenzelWashington.name := 'Denzel Washington'

!new Actor('actorEmmaWatson')
!actorEmmaWatson.name := 'Emma Watson'

!new Actor('actorRyanReynolds')
!actorRyanReynolds.name := 'Ryan Reynolds'

!insert (client200, rental1) into ClientRental
!insert (client201, rental2) into ClientRental
!insert (client202, rental3) into ClientRental

!insert (rental1, cassetteDirectorsVision) into RentalCassette
!insert (rental1, cassetteEpicConclusion) into RentalCassette

!insert (rental2, cassetteEpicConclusion) into RentalCassette
!insert (rental2, cassetteEveningLaughs) into RentalCassette

!insert (rental3, cassetteDirectorsVision) into RentalCassette
!insert (rental3, cassetteEveningLaughs) into RentalCassette

!insert (cassetteDirectorsVision, actorCateBlanchett) into CassetteActor
!insert (cassetteDirectorsVision, actorDenzelWashington) into CassetteActor

!insert (cassetteEpicConclusion, actorEmmaWatson) into CassetteActor

!insert (cassetteEveningLaughs, actorRyanReynolds) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 48 | 0.00% |
| Multiplicities Errors | 0 | 13 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 2 | 3 | 66.67% |
| Types (out of valid Titles) | 0 | 1 | 0.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Epic Conclusion
```
```
Evening Laughs
```

| Failed Genres | 
|---| 
```
Parsed genre: Action != API genre: [Documentary, Short]
```

| Failed Actors | 
|---| 
```
Cate Blanchett for movie: Director’s Vision
```
```
Denzel Washington for movie: Director’s Vision
```

## Category invalid
```
!new Client('anaDeSouza')
!anaDeSouza.clientId := 345
!anaDeSouza.isSuspended := true

!new Client('pedroGomez')
!pedroGomez.clientId := 346
!pedroGomez.isSuspended := false

!new Rental('rentalSaoPauloShowcase')
!rentalSaoPauloShowcase.date := Date('2023-08-18')

!new Rental('rentalFestivalCinemaBrasileiro')
!rentalFestivalCinemaBrasileiro.date := Date('2023-09-05')

!new Series('cassetteSambaRhythm')
!cassetteSambaRhythm.title := 'Samba and Rhythm Series'
!cassetteSambaRhythm.availableCopies := 10
!cassetteSambaRhythm.episode := 12

!new Movie('cassetteTangoInAction')
!cassetteTangoInAction.title := 'Tango in Action'
!cassetteTangoInAction.availableCopies := 2
!cassetteTangoInAction.genre := #Action

!new Series('cassetteBrazilianClassics')
!cassetteBrazilianClassics.title := 'Brazilian Classics: The Golden Age'
!cassetteBrazilianClassics.availableCopies := 0
!cassetteBrazilianClassics.episode := 6

!new Movie('cassetteMysteryAmazonRainforest')
!cassetteMysteryAmazonRainforest.title := 'Mystery of the Amazon Rainforest'
!cassetteMysteryAmazonRainforest.availableCopies := 3
!cassetteMysteryAmazonRainforest.genre := #Action

!new Actor('actorSoniaBraga')
!actorSoniaBraga.name := 'Sonia Braga'

!new Actor('actorRicardoDarin')
!actorRicardoDarin.name := 'Ricardo Darín'

!new Actor('actorWagnerMoura')
!actorWagnerMoura.name := 'Wagner Moura'

!insert (pedroGomez, rentalSaoPauloShowcase) into ClientRental
!insert (anaDeSouza, rentalFestivalCinemaBrasileiro) into ClientRental

!insert (rentalSaoPauloShowcase, cassetteSambaRhythm) into RentalCassette
!insert (rentalSaoPauloShowcase, cassetteTangoInAction) into RentalCassette

!insert (rentalFestivalCinemaBrasileiro, cassetteBrazilianClassics) into RentalCassette
!insert (rentalFestivalCinemaBrasileiro, cassetteMysteryAmazonRainforest) into RentalCassette

!insert (cassetteBrazilianClassics, actorSoniaBraga) into CassetteActor
!insert (cassetteTangoInAction, actorRicardoDarin) into CassetteActor
!insert (cassetteMysteryAmazonRainforest, actorWagnerMoura) into CassetteActor
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 9 | 11.11% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `CassetteActor':
  Object `cassetteSambaRhythm' of class `Series' is connected to 0 objects of class `Actor'
  at association end `has' but the multiplicity is specified as `1..*'.
```

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 4 | 4 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Brazilian Classics: The Golden Age
```
```
Samba and Rhythm Series
```
```
Mystery of the Amazon Rainforest
```
```
Tango in Action
```

## Generation 3 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 197 | 0.00% |
| Multiplicities Errors | 0 | 38 | 0.00% |
| Invariants Errors | 0 | 12 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 9 | 11.11% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `CassetteActor':
  Object `cassetteSambaRhythm' of class `Series' is connected to 0 objects of class `Actor'
  at association end `has' but the multiplicity is specified as `1..*'.
```

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 13 | 15 | 86.67% |
| Types (out of valid Titles) | 0 | 2 | 0.00% |
| Genres (out of valid Titles) | 2 | 2 | 100.00% |
| Actors (out of valid Titles) | 4 | 4 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 2 | 0.00% |

| Failed Titles | 
|---| 
```
Vintage Laughter
```
```
El Espionaje en la Lluvia
```
```
Fables of the Far East
```
```
Mystery in the North Ep.20
```
```
Dance of the Tigers
```
```
Chai & Chatter
```
```
Spice Routes
```
```
Epic Conclusion
```
```
Evening Laughs
```
```
Brazilian Classics: The Golden Age
```
```
Samba and Rhythm Series
```
```
Mystery of the Amazon Rainforest
```
```
Tango in Action
```

| Failed Genres | 
|---| 
```
Parsed genre: Action != API genre: [Drama, Romance, War]
```
```
Parsed genre: Action != API genre: [Documentary, Short]
```

| Failed Actors | 
|---| 
```
Anna Müller for movie: Legends of the Fall
```
```
Rajesh Kumar for movie: Legends of the Fall
```
```
Cate Blanchett for movie: Director’s Vision
```
```
Denzel Washington for movie: Director’s Vision
```

# Generation 4
## Category baseline
```
!new Client('client401')
!client401.clientId := 401
!client401.isSuspended := false

!new Client('client402')
!client402.clientId := 402
!client402.isSuspended := false

!new Client('client403')
!client403.clientId := 403
!client403.isSuspended := true

!new Rental('rental1')
!rental1.date := Date('2023-11-22')

!new Rental('rental2')
!rental2.date := Date('2023-11-05')

!new Rental('rental3')
!rental3.date := Date('2023-11-12')

!new Movie('cassetteKilimanjaroChronicles')
!cassetteKilimanjaroChronicles.title := 'Kilimanjaro Chronicles'
!cassetteKilimanjaroChronicles.availableCopies := 3
!cassetteKilimanjaroChronicles.genre := #Action

!new Series('cassetteEveningTalksVenice')
!cassetteEveningTalksVenice.title := 'Evening Talks in Venice'
!cassetteEveningTalksVenice.availableCopies := 2
!cassetteEveningTalksVenice.episode := 10

!new Series('cassetteFuturesFolly')
!cassetteFuturesFolly.title := 'Future\'s Folly'
!cassetteFuturesFolly.availableCopies := 5
!cassetteFuturesFolly.episode := 2

!new Actor('actorDayoAkin')
!actorDayoAkin.name := 'Dayo Akin'

!new Actor('actorGiuliaRizzo')
!actorGiuliaRizzo.name := 'Giulia Rizzo'

!new Actor('actorMarcoLombardi')
!actorMarcoLombardi.name := 'Marco Lombardi'

!new Actor('actorZaraKim')
!actorZaraKim.name := 'Zara Kim'

!insert (client401, rental1) into ClientRental
!insert (client401, rental3) into ClientRental
!insert (client402, rental2) into ClientRental

!insert (rental1, cassetteKilimanjaroChronicles) into RentalCassette
!insert (rental2, cassetteEveningTalksVenice) into RentalCassette
!insert (rental3, cassetteKilimanjaroChronicles) into RentalCassette

!insert (cassetteKilimanjaroChronicles, actorDayoAkin) into CassetteActor
!insert (cassetteEveningTalksVenice, actorGiuliaRizzo) into CassetteActor
!insert (cassetteEveningTalksVenice, actorMarcoLombardi) into CassetteActor
!insert (cassetteFuturesFolly, actorZaraKim) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 45 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 3 | 3 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Evening Talks in Venice
```
```
Future\s Folly
```
```
Kilimanjaro Chronicles
```

## Category boundary
```
!new Client('client7')
!client7.clientId := 4
!client7.isSuspended := false

!new Client('client8')
!client8.clientId := 987654321
!client8.isSuspended := true

!new Rental('rental4')
!rental4.date := Date('2023-02-28')

!new Movie('cassetteSilentNight')
!cassetteSilentNight.title := 'Silent Night'
!cassetteSilentNight.availableCopies := 500
!cassetteSilentNight.genre := #Comedy

!new Series('cassetteDragonsTale')
!cassetteDragonsTale.title := 'Dragon\'s Tale Ep.45'
!cassetteDragonsTale.availableCopies := 3
!cassetteDragonsTale.episode := 45

!new Actor('actorKevinCheng')
!actorKevinCheng.name := 'Kevin Cheng'

!new Actor('actorLunaSofia')
!actorLunaSofia.name := 'Luna Sofia'

!insert (client7, rental4) into ClientRental

!insert (rental4, cassetteSilentNight) into RentalCassette
!insert (rental4, cassetteDragonsTale) into RentalCassette

!insert (cassetteSilentNight, actorKevinCheng) into CassetteActor
!insert (cassetteSilentNight, actorLunaSofia) into CassetteActor
!insert (cassetteDragonsTale, actorLunaSofia) into CassetteActor
!insert (cassetteDragonsTale, actorKevinCheng) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 27 | 0.00% |
| Multiplicities Errors | 0 | 7 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 1 | 2 | 50.00% |
| Types (out of valid Titles) | 0 | 1 | 0.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Dragon\s Tale Ep.45
```

| Failed Genres | 
|---| 
```
Parsed genre: Comedy != API genre: [Action, Thriller]
```

| Failed Actors | 
|---| 
```
Kevin Cheng for movie: Silent Night
```
```
Luna Sofia for movie: Silent Night
```

## Category complex
```
!new Client('selimKaya')
!selimKaya.clientId := 401
!selimKaya.isSuspended := false

!new Client('leylaAydin')
!leylaAydin.clientId := 402
!leylaAydin.isSuspended := false

!new Client('mehmetDemir')
!mehmetDemir.clientId := 403
!mehmetDemir.isSuspended := true

!new Rental('rentalSelim')
!rentalSelim.date := Date('2023-08-18')

!new Rental('rentalLeyla')
!rentalLeyla.date := Date('2023-08-20')

!new Movie('cassetteSultansSecret')
!cassetteSultansSecret.title := 'The Sultan\'s Secret'
!cassetteSultansSecret.availableCopies := 5
!cassetteSultansSecret.genre := #Action

!new Movie('cassetteCafePera')
!cassetteCafePera.title := 'Café Pera'
!cassetteCafePera.availableCopies := 4
!cassetteCafePera.genre := #Comedy

!new Series('cassetteGoldenHornChronicles')
!cassetteGoldenHornChronicles.title := 'Golden Horn Chronicles'
!cassetteGoldenHornChronicles.availableCopies := 2
!cassetteGoldenHornChronicles.episode := 22

!new Actor('actorTubaBuyukustun')
!actorTubaBuyukustun.name := 'Tuba Büyüküstün'

!new Actor('actorKivancTatlitug')
!actorKivancTatlitug.name := 'Kıvanç Tatlıtuğ'

!new Actor('actorCagatayUlusoy')
!actorCagatayUlusoy.name := 'Çağatay Ulusoy'

!new Actor('actorBerenSaat')
!actorBerenSaat.name := 'Beren Saat'

!insert (selimKaya, rentalSelim) into ClientRental
!insert (leylaAydin, rentalLeyla) into ClientRental

!insert (rentalSelim, cassetteSultansSecret) into RentalCassette
!insert (rentalLeyla, cassetteCafePera) into RentalCassette
!insert (rentalLeyla, cassetteGoldenHornChronicles) into RentalCassette

!insert (cassetteSultansSecret, actorKivancTatlitug) into CassetteActor
!insert (cassetteSultansSecret, actorTubaBuyukustun) into CassetteActor

!insert (cassetteCafePera, actorCagatayUlusoy) into CassetteActor

!insert (cassetteGoldenHornChronicles, actorBerenSaat) into CassetteActor
!insert (cassetteGoldenHornChronicles, actorTubaBuyukustun) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 43 | 0.00% |
| Multiplicities Errors | 0 | 10 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 3 | 3 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Café Pera
```
```
The Sultan\s Secret
```
```
Golden Horn Chronicles
```

## Category edge
```
!new Client('client300')
!client300.clientId := 300
!client300.isSuspended := false

!new Client('client301')
!client301.clientId := 301
!client301.isSuspended := true

!new Rental('rental1')
!rental1.date := Date('2023-10-05')

!new Rental('rental2')
!rental2.date := Date('2023-10-06')

!new Movie('cassetteTheFinalStand')
!cassetteTheFinalStand.title := 'The Final Stand'
!cassetteTheFinalStand.availableCopies := 5
!cassetteTheFinalStand.genre := #Action

!new Series('cassetteCrossBorderDrama')
!cassetteCrossBorderDrama.title := 'Cross-Border Drama'
!cassetteCrossBorderDrama.availableCopies := 2
!cassetteCrossBorderDrama.episode := 1

!new Series('cassetteGalacticVoyage')
!cassetteGalacticVoyage.title := 'Galactic Voyage'
!cassetteGalacticVoyage.availableCopies := 0
!cassetteGalacticVoyage.episode := 20

!new Actor('actorBruceLee')
!actorBruceLee.name := 'Bruce Lee'

!new Actor('actorPenelopeCruz')
!actorPenelopeCruz.name := 'Penélope Cruz'

!new Actor('actorJackieChan')
!actorJackieChan.name := 'Jackie Chan'

!new Actor('actorChrisEvans')
!actorChrisEvans.name := 'Chris Evans'

!new Actor('actorGalGadot')
!actorGalGadot.name := 'Gal Gadot'

!new Actor('actorBenedictCumberbatch')
!actorBenedictCumberbatch.name := 'Benedict Cumberbatch'

!insert (client300, rental1) into ClientRental
!insert (client301, rental2) into ClientRental

!insert (rental1, cassetteTheFinalStand) into RentalCassette
!insert (rental1, cassetteGalacticVoyage) into RentalCassette

!insert (rental2, cassetteCrossBorderDrama) into RentalCassette
!insert (rental2, cassetteGalacticVoyage) into RentalCassette

!insert (cassetteTheFinalStand, actorBruceLee) into CassetteActor

!insert (cassetteCrossBorderDrama, actorPenelopeCruz) into CassetteActor
!insert (cassetteCrossBorderDrama, actorJackieChan) into CassetteActor

!insert (cassetteGalacticVoyage, actorChrisEvans) into CassetteActor
!insert (cassetteGalacticVoyage, actorGalGadot) into CassetteActor
!insert (cassetteGalacticVoyage, actorBenedictCumberbatch) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 46 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 3 | 3 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
The Final Stand
```
```
Cross-Border Drama
```
```
Galactic Voyage
```

## Category invalid
```
!new Client('liamOConnor')
!liamOConnor.clientId := 740
!liamOConnor.isSuspended := false

!new Client('jasmineMing')
!jasmineMing.clientId := 741
!jasmineMing.isSuspended := false

!new Rental('rentalAdventureLands')
!rentalAdventureLands.date := Date('2023-07-22')

!new Rental('rentalDesertMirage')
!rentalDesertMirage.date := Date('2023-08-05')

!new Series('cassetteWalkaboutWonders')
!cassetteWalkaboutWonders.title := 'Walkabout Wonders'
!cassetteWalkaboutWonders.availableCopies := 8
!cassetteWalkaboutWonders.episode := 10

!new Movie('cassetteOutbackSafariAdventures')
!cassetteOutbackSafariAdventures.title := 'Outback Safari Adventures'
!cassetteOutbackSafariAdventures.availableCopies := 1
!cassetteOutbackSafariAdventures.genre := #Action

!new Movie('cassetteWildFrontierCowboys')
!cassetteWildFrontierCowboys.title := 'Wild Frontier: Cowboys'
!cassetteWildFrontierCowboys.availableCopies := 2
!cassetteWildFrontierCowboys.genre := #Action

!new Actor('actorDavidGulpilil')
!actorDavidGulpilil.name := 'David Gulpilil'

!new Actor('actorHughJackman')
!actorHughJackman.name := 'Hugh Jackman'

!new Actor('actorSamElliott')
!actorSamElliott.name := 'Sam Elliott'

!insert (liamOConnor, rentalAdventureLands) into ClientRental
!insert (jasmineMing, rentalDesertMirage) into ClientRental

!insert (rentalAdventureLands, cassetteWalkaboutWonders) into RentalCassette
!insert (rentalAdventureLands, cassetteOutbackSafariAdventures) into RentalCassette
!insert (rentalAdventureLands, cassetteWildFrontierCowboys) into RentalCassette

!insert (rentalDesertMirage, cassetteOutbackSafariAdventures) into RentalCassette

!insert (cassetteWalkaboutWonders, actorDavidGulpilil) into CassetteActor

!insert (cassetteOutbackSafariAdventures, actorHughJackman) into CassetteActor

!insert (cassetteWildFrontierCowboys, actorSamElliott) into CassetteActor
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 9 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 3 | 3 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Walkabout Wonders
```
```
Wild Frontier: Cowboys
```
```
Outback Safari Adventures
```

## Generation 4 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 198 | 0.00% |
| Multiplicities Errors | 0 | 39 | 0.00% |
| Invariants Errors | 0 | 12 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 9 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 13 | 14 | 92.86% |
| Types (out of valid Titles) | 0 | 1 | 0.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Evening Talks in Venice
```
```
Future\s Folly
```
```
Kilimanjaro Chronicles
```
```
Dragon\s Tale Ep.45
```
```
Café Pera
```
```
The Sultan\s Secret
```
```
Golden Horn Chronicles
```
```
The Final Stand
```
```
Cross-Border Drama
```
```
Galactic Voyage
```
```
Walkabout Wonders
```
```
Wild Frontier: Cowboys
```
```
Outback Safari Adventures
```

| Failed Genres | 
|---| 
```
Parsed genre: Comedy != API genre: [Action, Thriller]
```

| Failed Actors | 
|---| 
```
Kevin Cheng for movie: Silent Night
```
```
Luna Sofia for movie: Silent Night
```

# Generation 5
## Category baseline
```
!new Client('client501')
!client501.clientId := 501
!client501.isSuspended := false

!new Client('client502')
!client502.clientId := 502
!client502.isSuspended := true

!new Client('client503')
!client503.clientId := 503
!client503.isSuspended := false

!new Client('client504')
!client504.clientId := 504
!client504.isSuspended := false

!new Rental('rental1')
!rental1.date := Date('2023-07-18')

!new Rental('rental2')
!rental2.date := Date('2023-12-01')

!new Rental('rental3')
!rental3.date := Date('2023-11-02')

!new Movie('cassetteMediterraneanWhisper')
!cassetteMediterraneanWhisper.title := 'The Mediterranean Whisper'
!cassetteMediterraneanWhisper.availableCopies := 4
!cassetteMediterraneanWhisper.genre := #Comedy

!new Series('cassetteTalesOfTimbuktu')
!cassetteTalesOfTimbuktu.title := 'Tales of Timbuktu'
!cassetteTalesOfTimbuktu.availableCopies := 2
!cassetteTalesOfTimbuktu.episode := 4

!new Movie('cassetteNorthernLights')
!cassetteNorthernLights.title := 'Through the Northern Lights'
!cassetteNorthernLights.availableCopies := 0
!cassetteNorthernLights.genre := #Action

!new Series('cassetteDigitalDreamscapes')
!cassetteDigitalDreamscapes.title := 'Digital Dreamscapes'
!cassetteDigitalDreamscapes.availableCopies := 1
!cassetteDigitalDreamscapes.episode := 7

!new Actor('actorSophiaValdez')
!actorSophiaValdez.name := 'Sophia Valdez'

!new Actor('actorMaliKeita')
!actorMaliKeita.name := 'Mali Keita'

!new Actor('actorNinaKoulibaly')
!actorNinaKoulibaly.name := 'Nina Koulibaly'

!new Actor('actorErikNyman')
!actorErikNyman.name := 'Erik Nyman'

!new Actor('actorLianChen')
!actorLianChen.name := 'Lian Chen'

!insert (client501, rental1) into ClientRental
!insert (client503, rental2) into ClientRental
!insert (client504, rental3) into ClientRental

!insert (rental1, cassetteMediterraneanWhisper) into RentalCassette
!insert (rental2, cassetteTalesOfTimbuktu) into RentalCassette
!insert (rental3, cassetteNorthernLights) into RentalCassette

!insert (cassetteMediterraneanWhisper, actorSophiaValdez) into CassetteActor
!insert (cassetteTalesOfTimbuktu, actorMaliKeita) into CassetteActor
!insert (cassetteTalesOfTimbuktu, actorNinaKoulibaly) into CassetteActor
!insert (cassetteNorthernLights, actorErikNyman) into CassetteActor
!insert (cassetteDigitalDreamscapes, actorLianChen) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 55 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 4 | 4 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
The Mediterranean Whisper
```
```
Digital Dreamscapes
```
```
Through the Northern Lights
```
```
Tales of Timbuktu
```

## Category boundary
```
!new Client('client9')
!client9.clientId := 5
!client9.isSuspended := true

!new Client('client10')
!client10.clientId := 999999999
!client10.isSuspended := false

!new Rental('rental5')
!rental5.date := Date('2023-06-30')

!new Movie('cassetteGreatEscape')
!cassetteGreatEscape.title := 'The Great Escape'
!cassetteGreatEscape.availableCopies := 50
!cassetteGreatEscape.genre := #Action

!new Series('cassetteEpicOdyssey')
!cassetteEpicOdyssey.title := 'Epic Odyssey Ep.100'
!cassetteEpicOdyssey.availableCopies := 0
!cassetteEpicOdyssey.episode := 100

!new Actor('actorSamanthaONeill')
!actorSamanthaONeill.name := 'Samantha O\'Neill'

!new Actor('actorHirokiYamamoto')
!actorHirokiYamamoto.name := 'Hiroki Yamamoto'

!insert (client9, rental5) into ClientRental

!insert (rental5, cassetteGreatEscape) into RentalCassette

!insert (cassetteGreatEscape, actorSamanthaONeill) into CassetteActor
!insert (cassetteGreatEscape, actorHirokiYamamoto) into CassetteActor
!insert (cassetteEpicOdyssey, actorHirokiYamamoto) into CassetteActor
!insert (cassetteEpicOdyssey, actorSamanthaONeill) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 26 | 0.00% |
| Multiplicities Errors | 0 | 6 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 1 | 2 | 50.00% |
| Types (out of valid Titles) | 0 | 1 | 0.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Epic Odyssey Ep.100
```

| Failed Genres | 
|---| 
```
Parsed genre: Action != API genre: [Adventure, Drama, Thriller]
```

| Failed Actors | 
|---| 
```
Samantha O\Neill for movie: The Great Escape
```
```
Hiroki Yamamoto for movie: The Great Escape
```

## Category complex
```
!new Client('chineduOkeke')
!chineduOkeke.clientId := 501
!chineduOkeke.isSuspended := false

!new Client('aishaMusa')
!aishaMusa.clientId := 502
!aishaMusa.isSuspended := false

!new Rental('rentalChinedu')
!rentalChinedu.date := Date('2023-07-21')

!new Rental('rentalAisha1')
!rentalAisha1.date := Date('2023-07-15')

!new Rental('rentalAisha2')
!rentalAisha2.date := Date('2023-07-28')

!new Movie('cassetteLionheartWarriors')
!cassetteLionheartWarriors.title := 'Lionheart Warriors'
!cassetteLionheartWarriors.availableCopies := 10
!cassetteLionheartWarriors.genre := #Action

!new Movie('cassetteWeddingBellsLagos')
!cassetteWeddingBellsLagos.title := 'Wedding Bells in Lagos'
!cassetteWeddingBellsLagos.availableCopies := 5
!cassetteWeddingBellsLagos.genre := #Comedy

!new Series('cassetteLagosLoveStories')
!cassetteLagosLoveStories.title := 'Lagos Love Stories'
!cassetteLagosLoveStories.availableCopies := 3
!cassetteLagosLoveStories.episode := 15

!new Actor('actorGenevieveNnaji')
!actorGenevieveNnaji.name := 'Genevieve Nnaji'

!new Actor('actorOluJacobs')
!actorOluJacobs.name := 'Olu Jacobs'

!new Actor('actorRichardMofeDamijo')
!actorRichardMofeDamijo.name := 'Richard Mofe-Damijo'

!new Actor('actorOmotolaJaladeEkeinde')
!actorOmotolaJaladeEkeinde.name := 'Omotola Jalade Ekeinde'

!insert (chineduOkeke, rentalChinedu) into ClientRental
!insert (aishaMusa, rentalAisha1) into ClientRental
!insert (aishaMusa, rentalAisha2) into ClientRental

!insert (rentalChinedu, cassetteLionheartWarriors) into RentalCassette
!insert (rentalAisha1, cassetteWeddingBellsLagos) into RentalCassette
!insert (rentalAisha2, cassetteLagosLoveStories) into RentalCassette

!insert (cassetteLionheartWarriors, actorGenevieveNnaji) into CassetteActor
!insert (cassetteLionheartWarriors, actorOluJacobs) into CassetteActor

!insert (cassetteWeddingBellsLagos, actorRichardMofeDamijo) into CassetteActor
!insert (cassetteWeddingBellsLagos, actorOmotolaJaladeEkeinde) into CassetteActor

!insert (cassetteLagosLoveStories, actorOmotolaJaladeEkeinde) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 43 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 3 | 3 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Wedding Bells in Lagos
```
```
Lagos Love Stories
```
```
Lionheart Warriors
```

## Category edge
```
!new Client('client400')
!client400.clientId := 400
!client400.isSuspended := false

!new Client('client401')
!client401.clientId := 401
!client401.isSuspended := true

!new Rental('rental1')
!rental1.date := Date('2023-09-18')

!new Rental('rental2')
!rental2.date := Date('2023-09-19')

!new Movie('cassetteTimelessAdventure')
!cassetteTimelessAdventure.title := 'Timeless Adventure'
!cassetteTimelessAdventure.availableCopies := 0
!cassetteTimelessAdventure.genre := #Action

!new Movie('cassetteLaughingMatters')
!cassetteLaughingMatters.title := 'Laughing Matters'
!cassetteLaughingMatters.availableCopies := 1
!cassetteLaughingMatters.genre := #Comedy

!new Series('cassetteTwilightTales')
!cassetteTwilightTales.title := 'Twilight Tales'
!cassetteTwilightTales.availableCopies := 0
!cassetteTwilightTales.episode := 13

!new Series('cassetteTomorrowsQuest')
!cassetteTomorrowsQuest.title := 'Tomorrow\'s Quest'
!cassetteTomorrowsQuest.availableCopies := 0
!cassetteTomorrowsQuest.episode := 22

!new Actor('actorMerylStreep')
!actorMerylStreep.name := 'Meryl Streep'

!new Actor('actorKevinHart')
!actorKevinHart.name := 'Kevin Hart'

!new Actor('actorZoeSaldana')
!actorZoeSaldana.name := 'Zoe Saldana'

!new Actor('actorKeanuReeves')
!actorKeanuReeves.name := 'Keanu Reeves'

!new Actor('actorNataliePortman')
!actorNataliePortman.name := 'Natalie Portman'

!insert (client400, rental1) into ClientRental
!insert (client401, rental2) into ClientRental

!insert (rental1, cassetteTimelessAdventure) into RentalCassette
!insert (rental1, cassetteLaughingMatters) into RentalCassette
!insert (rental1, cassetteTwilightTales) into RentalCassette

!insert (rental2, cassetteLaughingMatters) into RentalCassette
!insert (rental2, cassetteTomorrowsQuest) into RentalCassette

!insert (cassetteTimelessAdventure, actorMerylStreep) into CassetteActor
!insert (cassetteLaughingMatters, actorKevinHart) into CassetteActor
!insert (cassetteTwilightTales, actorZoeSaldana) into CassetteActor
!insert (cassetteTwilightTales, actorKeanuReeves) into CassetteActor
!insert (cassetteTomorrowsQuest, actorNataliePortman) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 48 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 3 | 4 | 75.00% |
| Types (out of valid Titles) | 0 | 1 | 0.00% |
| Genres (out of valid Titles) | 0 | 1 | 0.00% |
| Actors (out of valid Titles) | 1 | 1 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Tomorrow\s Quest
```
```
Timeless Adventure
```
```
Twilight Tales
```

| Failed Actors | 
|---| 
```
Kevin Hart for movie: Laughing Matters
```

## Category invalid
```
!new Client('elinaKoivisto')
!elinaKoivisto.clientId := 188
!elinaKoivisto.isSuspended := false

!new Client('johanNielsen')
!johanNielsen.clientId := 189
!johanNielsen.isSuspended := true

!new Rental('rentalArcticMystery')
!rentalArcticMystery.date := Date('2023-12-05')

!new Rental('rentalNordicCinema')
!rentalNordicCinema.date := Date('2023-11-20')

!new Series('cassetteFrozenShadows')
!cassetteFrozenShadows.title := 'Frozen Shadows: Crime Series'
!cassetteFrozenShadows.availableCopies := 5
!cassetteFrozenShadows.episode := 8

!new Movie('cassetteMidsummerLaughs')
!cassetteMidsummerLaughs.title := 'Midsummer Laughs'
!cassetteMidsummerLaughs.availableCopies := 0
!cassetteMidsummerLaughs.genre := #Comedy

!new Series('cassetteNordicNoirMasterpieces')
!cassetteNordicNoirMasterpieces.title := 'Nordic Noir Masterpieces'
!cassetteNordicNoirMasterpieces.availableCopies := 3
!cassetteNordicNoirMasterpieces.episode := 6

!new Actor('actorAliciaVikander')
!actorAliciaVikander.name := 'Alicia Vikander'

!new Actor('actorPeterStormare')
!actorPeterStormare.name := 'Peter Stormare'

!new Actor('actorMadsMikkelsen')
!actorMadsMikkelsen.name := 'Mads Mikkelsen'

!insert (elinaKoivisto, rentalArcticMystery) into ClientRental
!insert (johanNielsen, rentalNordicCinema) into ClientRental

!insert (rentalArcticMystery, cassetteFrozenShadows) into RentalCassette
!insert (rentalArcticMystery, cassetteMidsummerLaughs) into RentalCassette

!insert (rentalNordicCinema, cassetteNordicNoirMasterpieces) into RentalCassette

!insert (cassetteFrozenShadows, actorAliciaVikander) into CassetteActor
!insert (cassetteMidsummerLaughs, actorPeterStormare) into CassetteActor
!insert (cassetteNordicNoirMasterpieces, actorMadsMikkelsen) into CassetteActor
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 8 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 3 | 3 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Nordic Noir Masterpieces
```
```
Frozen Shadows: Crime Series
```
```
Midsummer Laughs
```

## Generation 5 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 208 | 0.00% |
| Multiplicities Errors | 0 | 40 | 0.00% |
| Invariants Errors | 0 | 12 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 0 | 8 | 0.00% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 14 | 16 | 87.50% |
| Types (out of valid Titles) | 0 | 2 | 0.00% |
| Genres (out of valid Titles) | 1 | 2 | 50.00% |
| Actors (out of valid Titles) | 3 | 3 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 2 | 0.00% |

| Failed Titles | 
|---| 
```
The Mediterranean Whisper
```
```
Digital Dreamscapes
```
```
Through the Northern Lights
```
```
Tales of Timbuktu
```
```
Epic Odyssey Ep.100
```
```
Wedding Bells in Lagos
```
```
Lagos Love Stories
```
```
Lionheart Warriors
```
```
Tomorrow\s Quest
```
```
Timeless Adventure
```
```
Twilight Tales
```
```
Nordic Noir Masterpieces
```
```
Frozen Shadows: Crime Series
```
```
Midsummer Laughs
```

| Failed Genres | 
|---| 
```
Parsed genre: Action != API genre: [Adventure, Drama, Thriller]
```

| Failed Actors | 
|---| 
```
Samantha O\Neill for movie: The Great Escape
```
```
Hiroki Yamamoto for movie: The Great Escape
```
```
Kevin Hart for movie: Laughing Matters
```

# Generation 6
## Category baseline
```
!new Client('client601')
!client601.clientId := 601
!client601.isSuspended := false

!new Client('client602')
!client602.clientId := 602
!client602.isSuspended := true

!new Client('client603')
!client603.clientId := 603
!client603.isSuspended := false

!new Rental('rental1')
!rental1.date := Date('2023-06-15')

!new Rental('rental2')
!rental2.date := Date('2023-08-22')

!new Rental('rental3')
!rental3.date := Date('2023-09-10')

!new Movie('cassetteSilentEchoes')
!cassetteSilentEchoes.title := 'Silent Echoes'
!cassetteSilentEchoes.availableCopies := 6
!cassetteSilentEchoes.genre := #Comedy

!new Series('cassetteArtOfIntrigue')
!cassetteArtOfIntrigue.title := 'The Art of Intrigue'
!cassetteArtOfIntrigue.availableCopies := 5
!cassetteArtOfIntrigue.episode := 12

!new Movie('cassetteTropicalOdyssey')
!cassetteTropicalOdyssey.title := 'Tropical Odyssey'
!cassetteTropicalOdyssey.availableCopies := 0
!cassetteTropicalOdyssey.genre := #Action

!new Series('cassetteEchoesOfThePast')
!cassetteEchoesOfThePast.title := 'Echoes of the Past'
!cassetteEchoesOfThePast.availableCopies := 2
!cassetteEchoesOfThePast.episode := 1

!new Actor('actorGretaMueller')
!actorGretaMueller.name := 'Greta Müller'

!new Actor('actorMarcelFournier')
!actorMarcelFournier.name := 'Marcel Fournier'

!new Actor('actorJeanBaptiste')
!actorJeanBaptiste.name := 'Jean Baptiste'

!new Actor('actorCarlosDias')
!actorCarlosDias.name := 'Carlos Dias'

!new Actor('actorElenaPetrov')
!actorElenaPetrov.name := 'Elena Petrov'

!insert (client601, rental1) into ClientRental
!insert (client603, rental2) into ClientRental
!insert (client601, rental3) into ClientRental

!insert (rental1, cassetteSilentEchoes) into RentalCassette
!insert (rental2, cassetteArtOfIntrigue) into RentalCassette
!insert (rental3, cassetteSilentEchoes) into RentalCassette

!insert (cassetteSilentEchoes, actorGretaMueller) into CassetteActor
!insert (cassetteArtOfIntrigue, actorMarcelFournier) into CassetteActor
!insert (cassetteArtOfIntrigue, actorJeanBaptiste) into CassetteActor
!insert (cassetteTropicalOdyssey, actorCarlosDias) into CassetteActor
!insert (cassetteEchoesOfThePast, actorElenaPetrov) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 52 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 2 | 4 | 50.00% |
| Types (out of valid Titles) | 1 | 2 | 50.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 1 | 1 | 100.00% |

| Failed Titles | 
|---| 
```
Tropical Odyssey
```
```
The Art of Intrigue
```

| Failed Types | 
|---| 
```
Parsed type: series != API type: movie
```

| Failed Genres | 
|---| 
```
Parsed genre: Comedy != API genre: [Short, Horror]
```

| Failed Actors | 
|---| 
```
Elena Petrov for movie: Echoes of the Past
```
```
Greta Müller for movie: Silent Echoes
```

| Failed Years | 
|---| 
```
Rental year: 2023 < Release year: 2024
```

## Category boundary
```
!new Client('client11')
!client11.clientId := 6
!client11.isSuspended := false

!new Client('client12')
!client12.clientId := 2147483646
!client12.isSuspended := true

!new Rental('rental6')
!rental6.date := Date('2023-07-01')

!new Movie('cassetteDarkNights')
!cassetteDarkNights.title := 'Dark Nights'
!cassetteDarkNights.availableCopies := 2
!cassetteDarkNights.genre := #Comedy

!new Series('cassetteSpaceFrontier')
!cassetteSpaceFrontier.title := 'Space Frontier Ep.50'
!cassetteSpaceFrontier.availableCopies := 8
!cassetteSpaceFrontier.episode := 50

!new Actor('actorFatimaAlHussein')
!actorFatimaAlHussein.name := 'Fatima Al-Hussein'

!new Actor('actorJeanLucPicard')
!actorJeanLucPicard.name := 'Jean-Luc Picard'

!insert (client11, rental6) into ClientRental

!insert (rental6, cassetteDarkNights) into RentalCassette
!insert (rental6, cassetteSpaceFrontier) into RentalCassette

!insert (cassetteDarkNights, actorFatimaAlHussein) into CassetteActor
!insert (cassetteDarkNights, actorJeanLucPicard) into CassetteActor
!insert (cassetteSpaceFrontier, actorJeanLucPicard) into CassetteActor
!insert (cassetteSpaceFrontier, actorFatimaAlHussein) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 27 | 0.00% |
| Multiplicities Errors | 0 | 7 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 1 | 2 | 50.00% |
| Types (out of valid Titles) | 0 | 1 | 0.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Space Frontier Ep.50
```

| Failed Genres | 
|---| 
```
Parsed genre: Comedy != API genre: [Short, Action]
```

| Failed Actors | 
|---| 
```
Fatima Al-Hussein for movie: Dark Nights
```
```
Jean-Luc Picard for movie: Dark Nights
```

## Category complex
```
!new Client('carlosDaSilva')
!carlosDaSilva.clientId := 601
!carlosDaSilva.isSuspended := false

!new Client('marianaOliveira')
!marianaOliveira.clientId := 602
!marianaOliveira.isSuspended := true

!new Rental('rentalCarlos1')
!rentalCarlos1.date := Date('2023-06-10')

!new Rental('rentalCarlos2')
!rentalCarlos2.date := Date('2023-06-15')

!new Rental('rentalMariana')
!rentalMariana.date := Date('2023-06-20')

!new Movie('cassetteCidadeDasLuzes')
!cassetteCidadeDasLuzes.title := 'Cidade das Luzes'
!cassetteCidadeDasLuzes.availableCopies := 7
!cassetteCidadeDasLuzes.genre := #Action

!new Movie('cassetteCarnavalCarioca')
!cassetteCarnavalCarioca.title := 'Carnaval Carioca'
!cassetteCarnavalCarioca.availableCopies := 6
!cassetteCarnavalCarioca.genre := #Comedy

!new Series('cassetteAmazonChronicles')
!cassetteAmazonChronicles.title := 'The Amazon Chronicles'
!cassetteAmazonChronicles.availableCopies := 3
!cassetteAmazonChronicles.episode := 12

!new Actor('actorWagnerMoura')
!actorWagnerMoura.name := 'Wagner Moura'

!new Actor('actorFernandaMontenegro')
!actorFernandaMontenegro.name := 'Fernanda Montenegro'

!new Actor('actorAliceBraga')
!actorAliceBraga.name := 'Alice Braga'

!new Actor('actorRodrigoSantoro')
!actorRodrigoSantoro.name := 'Rodrigo Santoro'

!insert (carlosDaSilva, rentalCarlos1) into ClientRental
!insert (carlosDaSilva, rentalCarlos2) into ClientRental
!insert (marianaOliveira, rentalMariana) into ClientRental

!insert (rentalCarlos1, cassetteCidadeDasLuzes) into RentalCassette
!insert (rentalCarlos2, cassetteAmazonChronicles) into RentalCassette
!insert (rentalMariana, cassetteCarnavalCarioca) into RentalCassette

!insert (cassetteCidadeDasLuzes, actorWagnerMoura) into CassetteActor
!insert (cassetteCidadeDasLuzes, actorAliceBraga) into CassetteActor

!insert (cassetteCarnavalCarioca, actorRodrigoSantoro) into CassetteActor
!insert (cassetteCarnavalCarioca, actorFernandaMontenegro) into CassetteActor

!insert (cassetteAmazonChronicles, actorFernandaMontenegro) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 43 | 0.00% |
| Multiplicities Errors | 0 | 11 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 2 | 3 | 66.67% |
| Types (out of valid Titles) | 0 | 1 | 0.00% |
| Genres (out of valid Titles) | 1 | 1 | 100.00% |
| Actors (out of valid Titles) | 2 | 2 | 100.00% |
| Release year > Rental year (out of valid Titles) | 0 | 1 | 0.00% |

| Failed Titles | 
|---| 
```
Cidade das Luzes
```
```
The Amazon Chronicles
```

| Failed Genres | 
|---| 
```
Parsed genre: Comedy != API genre: [Documentary, Short]
```

| Failed Actors | 
|---| 
```
Rodrigo Santoro for movie: Carnaval Carioca
```
```
Fernanda Montenegro for movie: Carnaval Carioca
```

## Category edge
```
!new Client('client500')
!client500.clientId := 500
!client500.isSuspended := false

!new Client('client501')
!client501.clientId := 501
!client501.isSuspended := false

!new Client('client502')
!client502.clientId := 502
!client502.isSuspended := true

!new Rental('rental1')
!rental1.date := Date('2023-08-25')

!new Rental('rental2')
!rental2.date := Date('2023-08-26')

!new Rental('rental3')
!rental3.date := Date('2023-08-27')

!new Movie('cassetteJourneyBeyondBorders')
!cassetteJourneyBeyondBorders.title := 'Journey Beyond Borders'
!cassetteJourneyBeyondBorders.availableCopies := 0
!cassetteJourneyBeyondBorders.genre := #Action

!new Movie('cassetteUnitedByLaughter')
!cassetteUnitedByLaughter.title := 'United by Laughter'
!cassetteUnitedByLaughter.availableCopies := 2
!cassetteUnitedByLaughter.genre := #Comedy

!new Series('cassetteParallelEarths')
!cassetteParallelEarths.title := 'Parallel Earths'
!cassetteParallelEarths.availableCopies := 0
!cassetteParallelEarths.episode := 5

!new Series('cassetteClimacticRevelations')
!cassetteClimacticRevelations.title := 'Climactic Revelations'
!cassetteClimacticRevelations.availableCopies := 0
!cassetteClimacticRevelations.episode := 99

!new Actor('actorChiwetelEjiofor')
!actorChiwetelEjiofor.name := 'Chiwetel Ejiofor'

!new Actor('actorSofiaVergara')
!actorSofiaVergara.name := 'Sofia Vergara'

!new Actor('actorKenJeong')
!actorKenJeong.name := 'Ken Jeong'

!new Actor('actorScarlettJohansson')
!actorScarlettJohansson.name := 'Scarlett Johansson'

!new Actor('actorMahershalaAli')
!actorMahershalaAli.name := 'Mahershala Ali'

!new Actor('actorViolaDavis')
!actorViolaDavis.name := 'Viola Davis'

!insert (client500, rental1) into ClientRental
!insert (client501, rental2) into ClientRental
!insert (client502, rental3) into ClientRental

!insert (rental1, cassetteJourneyBeyondBorders) into RentalCassette
!insert (rental1, cassetteUnitedByLaughter) into RentalCassette

!insert (rental2, cassetteUnitedByLaughter) into RentalCassette
!insert (rental2, cassetteParallelEarths) into RentalCassette

!insert (rental3, cassetteClimacticRevelations) into RentalCassette

!insert (cassetteJourneyBeyondBorders, actorChiwetelEjiofor) into CassetteActor

!insert (cassetteUnitedByLaughter, actorSofiaVergara) into CassetteActor
!insert (cassetteUnitedByLaughter, actorKenJeong) into CassetteActor

!insert (cassetteParallelEarths, actorScarlettJohansson) into CassetteActor

!insert (cassetteClimacticRevelations, actorMahershalaAli) into CassetteActor
!insert (cassetteClimacticRevelations, actorViolaDavis) into CassetteActor
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 57 | 0.00% |
| Multiplicities Errors | 0 | 14 | 0.00% |
| Invariants Errors | 0 | 3 | 0.00% |

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 4 | 4 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Parallel Earths
```
```
Journey Beyond Borders
```
```
United by Laughter
```
```
Climactic Revelations
```

## Category invalid
```
!new Client('priyaKhanna')
!priyaKhanna.clientId := 452
!priyaKhanna.isSuspended := false

!new Client('amirChoudhary')
!amirChoudhary.clientId := 453
!amirChoudhary.isSuspended := false

!new Rental('rentalClassicBollywood')
!rentalClassicBollywood.date := Date('2023-10-10')

!new Rental('rentalHistoricalTapestry')
!rentalHistoricalTapestry.date := Date('2023-10-20')

!new Series('cassetteMusicalMoments')
!cassetteMusicalMoments.title := 'Musical Moments: A Bollywood Journey'
!cassetteMusicalMoments.availableCopies := 6
!cassetteMusicalMoments.episode := 12

!new Movie('cassetteEpicRomance')
!cassetteEpicRomance.title := 'Epic Romance: Eternal Love'
!cassetteEpicRomance.availableCopies := 3
!cassetteEpicRomance.genre := #Comedy

!new Movie('cassetteDancingThroughAges')
!cassetteDancingThroughAges.title := 'Dancing Through the Ages'
!cassetteDancingThroughAges.availableCopies := 2
!cassetteDancingThroughAges.genre := #Action

!new Series('cassetteEmpireOfIndia')
!cassetteEmpireOfIndia.title := 'Empire of India'
!cassetteEmpireOfIndia.availableCopies := 5
!cassetteEmpireOfIndia.episode := 8

!new Actor('actorShahrukhKhan')
!actorShahrukhKhan.name := 'Shahrukh Khan'

!new Actor('actorMadhuriDixit')
!actorMadhuriDixit.name := 'Madhuri Dixit'

!new Actor('actorAmitabhBachchan')
!actorAmitabhBachchan.name := 'Amitabh Bachchan'

!insert (priyaKhanna, rentalClassicBollywood) into ClientRental
!insert (amirChoudhary, rentalHistoricalTapestry) into ClientRental

!insert (rentalClassicBollywood, cassetteMusicalMoments) into RentalCassette
!insert (rentalClassicBollywood, cassetteEpicRomance) into RentalCassette
!insert (rentalClassicBollywood, cassetteDancingThroughAges) into RentalCassette

!insert (rentalHistoricalTapestry, cassetteEmpireOfIndia) into RentalCassette

!insert (cassetteEpicRomance, actorShahrukhKhan) into CassetteActor

!insert (cassetteDancingThroughAges, actorMadhuriDixit) into CassetteActor

!insert (cassetteEmpireOfIndia, actorAmitabhBachchan) into CassetteActor
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 9 | 11.11% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `CassetteActor':
  Object `cassetteMusicalMoments' of class `Series' is connected to 0 objects of class `Actor'
  at association end `has' but the multiplicity is specified as `1..*'.
```

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 4 | 4 | 100.00% |
| Types (out of valid Titles) | 0 | 0 | 0.00% |
| Genres (out of valid Titles) | 0 | 0 | 0.00% |
| Actors (out of valid Titles) | 0 | 0 | 0.00% |
| Release year > Rental year (out of valid Titles) | 0 | 0 | 0.00% |

| Failed Titles | 
|---| 
```
Dancing Through the Ages
```
```
Empire of India
```
```
Musical Moments: A Bollywood Journey
```
```
Epic Romance: Eternal Love
```

## Generation 6 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 220 | 0.00% |
| Multiplicities Errors | 0 | 43 | 0.00% |
| Invariants Errors | 0 | 12 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 9 | 11.11% |
| Invariants Errors (Not included on General) | 0 | 3 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `CassetteActor':
  Object `cassetteMusicalMoments' of class `Series' is connected to 0 objects of class `Actor'
  at association end `has' but the multiplicity is specified as `1..*'.
```

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 13 | 17 | 76.47% |
| Types (out of valid Titles) | 1 | 4 | 25.00% |
| Genres (out of valid Titles) | 3 | 3 | 100.00% |
| Actors (out of valid Titles) | 6 | 6 | 100.00% |
| Release year > Rental year (out of valid Titles) | 1 | 3 | 33.33% |

| Failed Titles | 
|---| 
```
Tropical Odyssey
```
```
The Art of Intrigue
```
```
Space Frontier Ep.50
```
```
Cidade das Luzes
```
```
The Amazon Chronicles
```
```
Parallel Earths
```
```
Journey Beyond Borders
```
```
United by Laughter
```
```
Climactic Revelations
```
```
Dancing Through the Ages
```
```
Empire of India
```
```
Musical Moments: A Bollywood Journey
```
```
Epic Romance: Eternal Love
```

| Failed Types | 
|---| 
```
Parsed type: series != API type: movie
```

| Failed Genres | 
|---| 
```
Parsed genre: Comedy != API genre: [Short, Horror]
```
```
Parsed genre: Comedy != API genre: [Short, Action]
```
```
Parsed genre: Comedy != API genre: [Documentary, Short]
```

| Failed Actors | 
|---| 
```
Elena Petrov for movie: Echoes of the Past
```
```
Greta Müller for movie: Silent Echoes
```
```
Fatima Al-Hussein for movie: Dark Nights
```
```
Jean-Luc Picard for movie: Dark Nights
```
```
Rodrigo Santoro for movie: Carnaval Carioca
```
```
Fernanda Montenegro for movie: Carnaval Carioca
```

| Failed Years | 
|---| 
```
Rental year: 2023 < Release year: 2024
```

# Summary for all generations
| Summary | Value | 
|---|---| 
| Model | GPT_4O | 
| Type | CoT | 
| System | videoclub | 
| Number of generations | 6 | 

| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 1162 | 0.00% |
| Multiplicities Errors | 0 | 221 | 0.00% |
| Invariants Errors | 0 | 72 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 2 | 53 | 3.77% |
| Invariants Errors (Not included on General) | 0 | 18 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `CassetteActor':
  Object `cassetteSambaRhythm' of class `Series' is connected to 0 objects of class `Actor'
  at association end `has' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `CassetteActor':
  Object `cassetteMusicalMoments' of class `Series' is connected to 0 objects of class `Actor'
  at association end `has' but the multiplicity is specified as `1..*'.
```

| Videoclub | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Titles | 75 | 89 | 84.27% |
| Types (out of valid Titles) | 3 | 14 | 21.43% |
| Genres (out of valid Titles) | 9 | 13 | 69.23% |
| Actors (out of valid Titles) | 22 | 22 | 100.00% |
| Release year > Rental year (out of valid Titles) | 1 | 12 | 8.33% |

| Failed Titles | 
|---| 
```
The Laughter House
```
```
TechVenture Ep.1
```
```
Fast Affair
```
```
Desperado in Action
```
```
Barcelona Chronicles
```
```
The Only Copy
```
```
Single Episode Saga
```
```
Cultural Series: Volume 1
```
```
Jackie Chan Classics
```
```
Almodóvar Masterpieces
```
```
Château de Mystères
```
```
Teknologi Revolusi
```
```
Detective Chronicles Ep.5
```
```
Galaxy Quest XX
```
```
Street Laughs
```
```
Nights in Split
```
```
The Adriatic Heist
```
```
Dalmatian Days
```
```
Finale Frenzy
```
```
British Wit Collection
```
```
Modern Japanese Comedy
```
```
Samurai Stories
```
```
Vintage Laughter
```
```
El Espionaje en la Lluvia
```
```
Fables of the Far East
```
```
Mystery in the North Ep.20
```
```
Dance of the Tigers
```
```
Chai & Chatter
```
```
Spice Routes
```
```
Epic Conclusion
```
```
Evening Laughs
```
```
Brazilian Classics: The Golden Age
```
```
Samba and Rhythm Series
```
```
Mystery of the Amazon Rainforest
```
```
Tango in Action
```
```
Evening Talks in Venice
```
```
Future\s Folly
```
```
Kilimanjaro Chronicles
```
```
Dragon\s Tale Ep.45
```
```
Café Pera
```
```
The Sultan\s Secret
```
```
Golden Horn Chronicles
```
```
The Final Stand
```
```
Cross-Border Drama
```
```
Galactic Voyage
```
```
Walkabout Wonders
```
```
Wild Frontier: Cowboys
```
```
Outback Safari Adventures
```
```
The Mediterranean Whisper
```
```
Digital Dreamscapes
```
```
Through the Northern Lights
```
```
Tales of Timbuktu
```
```
Epic Odyssey Ep.100
```
```
Wedding Bells in Lagos
```
```
Lagos Love Stories
```
```
Lionheart Warriors
```
```
Tomorrow\s Quest
```
```
Timeless Adventure
```
```
Twilight Tales
```
```
Nordic Noir Masterpieces
```
```
Frozen Shadows: Crime Series
```
```
Midsummer Laughs
```
```
Tropical Odyssey
```
```
The Art of Intrigue
```
```
Space Frontier Ep.50
```
```
Cidade das Luzes
```
```
The Amazon Chronicles
```
```
Parallel Earths
```
```
Journey Beyond Borders
```
```
United by Laughter
```
```
Climactic Revelations
```
```
Dancing Through the Ages
```
```
Empire of India
```
```
Musical Moments: A Bollywood Journey
```
```
Epic Romance: Eternal Love
```

| Failed Types | 
|---| 
```
Parsed type: movie != API type: series
```
```
Parsed type: movie != API type: series
```
```
Parsed type: series != API type: movie
```

| Failed Genres | 
|---| 
```
Parsed genre: Action != API genre: [Crime]
```
```
Parsed genre: Comedy != API genre: [Short, Family, Fantasy]
```
```
Parsed genre: Action != API genre: [Drama, Romance, War]
```
```
Parsed genre: Action != API genre: [Documentary, Short]
```
```
Parsed genre: Comedy != API genre: [Action, Thriller]
```
```
Parsed genre: Action != API genre: [Adventure, Drama, Thriller]
```
```
Parsed genre: Comedy != API genre: [Short, Horror]
```
```
Parsed genre: Comedy != API genre: [Short, Action]
```
```
Parsed genre: Comedy != API genre: [Documentary, Short]
```

| Failed Actors | 
|---| 
```
John Fast for movie: High-Speed Chase
```
```
John Doe for movie: The Comedy Show
```
```
Jane Smith for movie: The Comedy Show
```
```
Javier Bardem for movie: La Vía Láctea
```
```
Penelope Cruz for movie: La Vía Láctea
```
```
Charlie Chaplin for movie: Silent Comedy
```
```
Jet Li for movie: Crouching Tiger
```
```
Anna Müller for movie: Legends of the Fall
```
```
Rajesh Kumar for movie: Legends of the Fall
```
```
Cate Blanchett for movie: Director’s Vision
```
```
Denzel Washington for movie: Director’s Vision
```
```
Kevin Cheng for movie: Silent Night
```
```
Luna Sofia for movie: Silent Night
```
```
Samantha O\Neill for movie: The Great Escape
```
```
Hiroki Yamamoto for movie: The Great Escape
```
```
Kevin Hart for movie: Laughing Matters
```
```
Elena Petrov for movie: Echoes of the Past
```
```
Greta Müller for movie: Silent Echoes
```
```
Fatima Al-Hussein for movie: Dark Nights
```
```
Jean-Luc Picard for movie: Dark Nights
```
```
Rodrigo Santoro for movie: Carnaval Carioca
```
```
Fernanda Montenegro for movie: Carnaval Carioca
```

| Failed Years | 
|---| 
```
Rental year: 2023 < Release year: 2024
```

