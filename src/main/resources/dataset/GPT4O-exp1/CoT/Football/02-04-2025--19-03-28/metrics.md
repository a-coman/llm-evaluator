# Generation 1
## Category baseline
```
!new Club('club2')
!club2.name := 'Vienna Stars'
!club2.homeGround := 'Stadion Wien'
!club2.chairman := 'Ludwig Bauer'

!new Team('teamC')
!teamC.name := 'Vienna Warriors'

!insert (club2, teamC) into ClubTeam

!new Player('player4')
!player4.name := 'Leo Graf'
!player4.age := 27
!player4.bestFoot := #BOTH
!player4.phoneNumber := '+43-1-1234567'

!insert (teamC, player4) into TeamPlayer

!new Position('position5')
!position5.positionName := #FORWARD

!insert (player4, position5) into PlayerPositions

!new Competition('competition2')
!competition2.name := 'Central European Cup'
!competition2.type := 'International Tournament'

!new Match('match2')
!match2.date := '2023-10-15'
!match2.homeAway := true

!insert (competition2, match2) into CompetitionMatch

!insert (teamC, match2) into LocalMatch

!new Club('club3')
!club3.name := 'Berlin Bears Club'
!club3.homeGround := 'Berlin Stadium'
!club3.chairman := 'Michael Jordan'

!new Team('teamD')
!teamD.name := 'Berlin Bears'

!insert (club3, teamD) into ClubTeam

!new Player('player2')
!player2.name := 'Hans Müller'
!player2.age := 24
!player2.bestFoot := #RIGHT
!player2.phoneNumber := '+49-30-123456'

!insert (teamD, player2) into TeamPlayer

!new Position('position3')
!position3.positionName := #FORWARD

!insert (player2, position3) into PlayerPositions

!new PlayerNotes('playerNote2')
!playerNote2.note := 'Quick player with excellent dribbling skills.'
!playerNote2.date := '2023-09-25'

!insert (player2, playerNote2) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective3')
!trainingObjective3.areaToImprove := 'Endurance'
!trainingObjective3.startDate := '2023-08-01'
!trainingObjective3.endDate := '2023-12-01'
!trainingObjective3.success := false

!insert (trainingObjective3, player2) into TrainingObjectivePlayer

!new Player('player3')
!player3.name := 'Franziska Schmidt'
!player3.age := 21
!player3.bestFoot := #LEFT
!player3.phoneNumber := '+49-30-654321'

!insert (teamD, player3) into TeamPlayer

!new Position('position4')
!position4.positionName := #DEFENDER

!insert (player3, position4) into PlayerPositions

!insert (teamD, match2) into VisitorMatch

!new MatchReport('matchReport2')
!matchReport2.duration := 90
!matchReport2.scoreVisitor := 2
!matchReport2.scoreLocal := 3

!insert (match2, matchReport2) into MatchMatchReport

!new MatchEvent('matchEvent1')
!matchEvent1.eventType := #GOAL
!matchEvent1.time := 15

!new MatchEvent('matchEvent2')
!matchEvent2.eventType := #GOAL
!matchEvent2.time := 37

!new MatchEvent('matchEvent3')
!matchEvent3.eventType := #GOAL
!matchEvent3.time := 59

!new MatchEvent('matchEvent4')
!matchEvent4.eventType := #FOUL
!matchEvent4.time := 72

!new MatchEvent('matchEvent5')
!matchEvent5.eventType := #GOAL
!matchEvent5.time := 88

!insert (match2, matchEvent1) into MatchMatchEvent
!insert (match2, matchEvent2) into MatchMatchEvent
!insert (match2, matchEvent3) into MatchMatchEvent
!insert (match2, matchEvent4) into MatchMatchEvent
!insert (match2, matchEvent5) into MatchMatchEvent

!new MatchNote('matchNote1')
!matchNote1.note := 'Unfortunate offside that resulted in a controversy.'
!matchNote1.date := '2023-10-15'

!insert (match2, matchNote1) into MatchMatchNote

!new MatchPlayer('matchPlayer2')
!matchPlayer2.booked := false
!matchPlayer2.goals := 1
!matchPlayer2.rating := 8

!insert (player2, matchPlayer2) into PlayerMatch
!insert (match2, matchPlayer2) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition2')
!matchPlayerPosition2.positionName := #FORWARD
!matchPlayerPosition2.number := 9

!insert (matchPlayer2, matchPlayerPosition2) into MatchPlayerMatchPlayerPosition

!new MatchPlayer('matchPlayer3')
!matchPlayer3.booked := true
!matchPlayer3.goals := 0
!matchPlayer3.rating := 6

!insert (player3, matchPlayer3) into PlayerMatch
!insert (match2, matchPlayer3) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition3')
!matchPlayerPosition3.positionName := #MIDFIELDER
!matchPlayerPosition3.number := 10

!insert (matchPlayer3, matchPlayerPosition3) into MatchPlayerMatchPlayerPosition

!new TrainingSession('trainingSession2')
!trainingSession2.date := '2023-10-10'
!trainingSession2.location := 'Berlin Training Grounds'
!trainingSession2.purpose := 'Pre-Match Preparations'

!insert (teamD, trainingSession2) into TeamTraining

!new TrainingNotes('trainingNote3')
!trainingNote3.note := 'Focused on defensive strategies.'
!trainingNote3.date := '2023-10-10'

!new TrainingNotes('trainingNote4')
!trainingNote4.note := 'Endurance drills at the end.'
!trainingNote4.date := '2023-10-10'

!insert (trainingSession2, trainingNote3) into TrainingTrainingNotes
!insert (trainingSession2, trainingNote4) into TrainingTrainingNotes

!new TrainingFailedToAttend('failedAttend1')
!failedAttend1.reason := 'Illness'

!insert (trainingSession2, failedAttend1) into TrainingFailded
!insert (failedAttend1, player3) into FailedPlayer

!new TrainingObjective('trainingObjective4')
!trainingObjective4.areaToImprove := 'Defensive Skills'
!trainingObjective4.startDate := '2023-07-01'
!trainingObjective4.endDate := '2023-11-01'
!trainingObjective4.success := true

!insert (trainingObjective4, player3) into TrainingObjectivePlayer

!new TrainingSession('trainingSession3')
!trainingSession3.date := '2023-10-09'
!trainingSession3.location := 'Vienna Warriors Training Ground'
!trainingSession3.purpose := 'Strategic Planning'

!insert (teamC, trainingSession3) into TeamTraining

!new TrainingNotes('trainingNote5')
!trainingNote5.note := 'Tactical formation setup.'
!trainingNote5.date := '2023-10-09'

!insert (trainingSession3, trainingNote5) into TrainingTrainingNotes

!new TrainingObjective('trainingObjective5')
!trainingObjective5.areaToImprove := 'Scoring'
!trainingObjective5.startDate := '2023-08-01'
!trainingObjective5.endDate := '2023-12-01'
!trainingObjective5.success := false

!insert (trainingObjective5, player4) into TrainingObjectivePlayer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 147 | 0.00% |
| Multiplicities Errors | 0 | 35 | 0.00% |
| Invariants Errors | 1 | 4 | 25.00% |

| Invariants Errors | 
|---| 
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 14 | 0.00% |

## Category boundary
```
!new Club('club1')
!club1.name := 'Northern Eagles FC'
!club1.homeGround := 'Eagle Stadium'
!club1.chairman := 'Jonathan High'

!new Team('teamA')
!teamA.name := 'Eagles First'

!new Team('teamB')
!teamB.name := 'Eagles Reserve'

!insert (club1, teamA) into ClubTeam
!insert (club1, teamB) into ClubTeam

!new Player('player1')
!player1.name := 'Alice Swift'
!player1.age := 18
!player1.bestFoot := #LEFT
!player1.phoneNumber := '+447700900123'

!insert (teamA, player1) into TeamPlayer

!new Position('position1')
!position1.positionName := #GOALKEEPER

!new Position('position2')
!position2.positionName := #DEFENDER

!insert (player1, position1) into PlayerPositions
!insert (player1, position2) into PlayerPositions

!new PlayerNotes('playerNote1')
!playerNote1.note := 'Excellent reflexes'
!playerNote1.date := '2023-02-02'

!insert (player1, playerNote1) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective1')
!trainingObjective1.areaToImprove := 'Goalkeeping skills'
!trainingObjective1.startDate := '2023-02-01'
!trainingObjective1.endDate := '2023-02-28'
!trainingObjective1.success := false

!new TrainingObjective('trainingObjective2')
!trainingObjective2.areaToImprove := 'Passing accuracy'
!trainingObjective2.startDate := '2023-03-01'
!trainingObjective2.endDate := '2023-03-31'
!trainingObjective2.success := true

!insert (trainingObjective1, player1) into TrainingObjectivePlayer
!insert (trainingObjective2, player1) into TrainingObjectivePlayer

!new Competition('competition1')
!competition1.name := 'National League'
!competition1.type := 'League'

!new Match('match1')
!match1.date := '2023-05-28'
!match1.homeAway := true

!insert (competition1, match1) into CompetitionMatch

!insert (teamA, match1) into LocalMatch

!new Team('teamVisitor')
!teamVisitor.name := 'Southern Hawks'

!new Club('clubVisitor')
!clubVisitor.name := 'Southern Hawks Club'
!clubVisitor.homeGround := 'Hawks Ground'
!clubVisitor.chairman := 'John Doe'

!insert (clubVisitor, teamVisitor) into ClubTeam

!new Player('visitorPlayer1')
!visitorPlayer1.name := 'John Smith'
!visitorPlayer1.age := 22
!visitorPlayer1.bestFoot := #RIGHT
!visitorPlayer1.phoneNumber := '+447700900000'

!insert (teamVisitor, visitorPlayer1) into TeamPlayer

!new Position('visitorPosition1')
!visitorPosition1.positionName := #FORWARD

!insert (visitorPlayer1, visitorPosition1) into PlayerPositions

!insert (teamVisitor, match1) into VisitorMatch

!new MatchReport('matchReport1')
!matchReport1.duration := 90
!matchReport1.scoreVisitor := 0
!matchReport1.scoreLocal := 0

!insert (match1, matchReport1) into MatchMatchReport

!new MatchPlayer('matchPlayer1')
!matchPlayer1.booked := false
!matchPlayer1.goals := 0
!matchPlayer1.rating := 7

!insert (player1, matchPlayer1) into PlayerMatch
!insert (match1, matchPlayer1) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition1')
!matchPlayerPosition1.positionName := #GOALKEEPER
!matchPlayerPosition1.number := 1

!insert (matchPlayer1, matchPlayerPosition1) into MatchPlayerMatchPlayerPosition

!new TrainingSession('trainingSession1')
!trainingSession1.date := '2023-05-26'
!trainingSession1.location := 'Eagles Training Ground'
!trainingSession1.purpose := 'Pre-match preparation'

!insert (teamA, trainingSession1) into TeamTraining

!insert (teamB, trainingSession1) into TeamTraining

!insert (teamVisitor, trainingSession1) into TeamTraining

!new TrainingNotes('trainingNote1')
!trainingNote1.note := 'Light workout focused on agility'
!trainingNote1.date := '2023-05-26'

!insert (trainingSession1, trainingNote1) into TrainingTrainingNotes

!new TrainingObjective('trainingObjectiveVisitor1')
!trainingObjectiveVisitor1.areaToImprove := 'Speed'
!trainingObjectiveVisitor1.startDate := '2023-04-01'
!trainingObjectiveVisitor1.endDate := '2023-04-30'
!trainingObjectiveVisitor1.success := false

!insert (trainingObjectiveVisitor1, visitorPlayer1) into TrainingObjectivePlayer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 95 | 0.00% |
| Multiplicities Errors | 2 | 23 | 8.70% |
| Invariants Errors | 0 | 4 | 0.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamB' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `trainingSession1' of class `TrainingSession' is connected to 3 objects of class `Team'
  at association end `team' but the multiplicity is specified as `1'.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 10 | 0.00% |

## Category complex
```
!new Club('club4')
!club4.name := 'FC Barcelona'
!club4.homeGround := 'Camp Nou'
!club4.chairman := 'Joan Laporta'

!new Club('club5')
!club5.name := 'Real Madrid C.F.'
!club5.homeGround := 'Santiago Bernabéu Stadium'
!club5.chairman := 'Florentino Pérez'

!new Team('teamE')
!teamE.name := 'Barcelona A-Team'

!new Team('teamF')
!teamF.name := 'Real Madrid A-Team'

!insert (club4, teamE) into ClubTeam
!insert (club5, teamF) into ClubTeam

!new Competition('competition3')
!competition3.name := 'La Liga'
!competition3.type := 'Domestic League'

!new Match('match3')
!match3.date := '2023-10-29'
!match3.homeAway := true

!insert (competition3, match3) into CompetitionMatch

!insert (teamE, match3) into LocalMatch
!insert (teamF, match3) into VisitorMatch

!new Player('player5')
!player5.name := 'Lionel Messi'
!player5.age := 36
!player5.bestFoot := #LEFT
!player5.phoneNumber := '+34 912345678'

!new Player('player6')
!player6.name := 'Karim Benzema'
!player6.age := 35
!player6.bestFoot := #RIGHT
!player6.phoneNumber := '+34 987654321'

!insert (teamE, player5) into TeamPlayer
!insert (teamF, player6) into TeamPlayer

!new Position('position6')
!position6.positionName := #FORWARD

!new Position('position7')
!position7.positionName := #FORWARD

!insert (player5, position6) into PlayerPositions
!insert (player6, position7) into PlayerPositions

!new MatchReport('matchReport3')
!matchReport3.duration := 94
!matchReport3.scoreVisitor := 2
!matchReport3.scoreLocal := 1

!insert (match3, matchReport3) into MatchMatchReport

!new MatchEvent('matchEvent6')
!matchEvent6.eventType := #GOAL
!matchEvent6.time := 23

!new MatchEvent('matchEvent8')
!matchEvent8.eventType := #GOAL
!matchEvent8.time := 45

!insert (match3, matchEvent6) into MatchMatchEvent
!insert (match3, matchEvent8) into MatchMatchEvent

!new MatchNote('matchNote2')
!matchNote2.note := 'The match saw an intense first half with equal control from both teams.'
!matchNote2.date := '2023-10-29'

!insert (match3, matchNote2) into MatchMatchNote

!new MatchPlayer('matchPlayer4')
!matchPlayer4.booked := false
!matchPlayer4.goals := 1
!matchPlayer4.rating := 9

!insert (player5, matchPlayer4) into PlayerMatch
!insert (match3, matchPlayer4) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition4')
!matchPlayerPosition4.positionName := #FORWARD
!matchPlayerPosition4.number := 10

!insert (matchPlayer4, matchPlayerPosition4) into MatchPlayerMatchPlayerPosition

!new MatchPlayer('matchPlayer5')
!matchPlayer5.booked := true
!matchPlayer5.goals := 1
!matchPlayer5.rating := 8

!insert (player6, matchPlayer5) into PlayerMatch
!insert (match3, matchPlayer5) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition5')
!matchPlayerPosition5.positionName := #FORWARD
!matchPlayerPosition5.number := 9

!insert (matchPlayer5, matchPlayerPosition5) into MatchPlayerMatchPlayerPosition

!new TrainingSession('trainingSession4')
!trainingSession4.date := '2023-10-27'
!trainingSession4.location := 'Barcelona Training Ground'
!trainingSession4.purpose := 'Tactical Training for Upcoming Match'

!insert (teamE, trainingSession4) into TeamTraining

!new TrainingNotes('trainingNote6')
!trainingNote6.note := 'Focused on defensive strategies and quick counter-attacks.'
!trainingNote6.date := '2023-10-27'

!insert (trainingSession4, trainingNote6) into TrainingTrainingNotes

!new TrainingFailedToAttend('failedAttend2')
!failedAttend2.reason := 'Family Emergency - Messi'

!insert (trainingSession4, failedAttend2) into TrainingFailded
!insert (failedAttend2, player5) into FailedPlayer

!new TrainingObjective('trainingObjective6')
!trainingObjective6.areaToImprove := 'Long-range shooting accuracy'
!trainingObjective6.startDate := '2023-10-01'
!trainingObjective6.endDate := '2023-11-30'
!trainingObjective6.success := false

!insert (trainingObjective6, player5) into TrainingObjectivePlayer

!new PlayerNotes('playerNote3')
!playerNote3.note := 'Has shown excellent skill and versatility even beyond optimal years.'
!playerNote3.date := '2023-10-20'

!new PlayerNotes('playerNote4')
!playerNote4.note := 'Key player in maintaining attacking momentum.'
!playerNote4.date := '2023-10-21'

!insert (player5, playerNote3) into PlayerPlayerNotes
!insert (player6, playerNote4) into PlayerPlayerNotes

!new TrainingSession('trainingSession5')
!trainingSession5.date := '2023-10-27'
!trainingSession5.location := 'Real Madrid Training Ground'
!trainingSession5.purpose := 'Set-piece Tactics'

!insert (teamF, trainingSession5) into TeamTraining

!new TrainingNotes('trainingNote7')
!trainingNote7.note := 'Enhancing precision in set-pieces.'
!trainingNote7.date := '2023-10-27'

!insert (trainingSession5, trainingNote7) into TrainingTrainingNotes

!new TrainingObjective('trainingObjective7')
!trainingObjective7.areaToImprove := 'Precision in finishing'
!trainingObjective7.startDate := '2023-10-01'
!trainingObjective7.endDate := '2023-11-15'
!trainingObjective7.success := true

!insert (trainingObjective7, player6) into TrainingObjectivePlayer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 120 | 0.00% |
| Multiplicities Errors | 0 | 29 | 0.00% |
| Invariants Errors | 1 | 4 | 25.00% |

| Invariants Errors | 
|---| 
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

## Category edge
```
!new Club('club17')
!club17.name := 'Coastal Falcons FC'
!club17.homeGround := 'Seaside Stadium'
!club17.chairman := 'Mr. Harold Seabright'

!new Team('teamR')
!teamR.name := 'Falcons United'

!new Team('teamS')
!teamS.name := 'Seaside Thunder'

!insert (club17, teamR) into ClubTeam
!insert (club17, teamS) into ClubTeam

!new Competition('competition9')
!competition9.name := 'Inter-Coastal Cup'
!competition9.type := 'Knockout'

!new TrainingSession('trainingSession16')
!trainingSession16.date := '2023-10-12'
!trainingSession16.location := 'Falcon Field'
!trainingSession16.purpose := 'Mid-season Fitness Assessment'

!new TrainingNotes('trainingNote17')
!trainingNote17.note := 'Focus on endurance improvement'
!trainingNote17.date := '2023-10-12'

!new TrainingNotes('trainingNote18')
!trainingNote18.note := 'Review defensive strategies due to low attendance'
!trainingNote18.date := '2023-10-12'

!insert (trainingSession16, trainingNote17) into TrainingTrainingNotes
!insert (trainingSession16, trainingNote18) into TrainingTrainingNotes

!insert (teamR, trainingSession16) into TeamTraining

!new TrainingFailedToAttend('failedAttend8')
!failedAttend8.reason := 'Severe weather conditions impeded transport'

!insert (trainingSession16, failedAttend8) into TrainingFailded

!new Player('player17')
!player17.name := 'John Storm'
!player17.age := 24
!player17.bestFoot := #BOTH
!player17.phoneNumber := '+441234567890'

!insert (teamR, player17) into TeamPlayer

!new Player('player18')
!player18.name := 'Alex Rivers'
!player18.age := 25
!player18.bestFoot := #LEFT
!player18.phoneNumber := '+449876543210'

!insert (teamS, player18) into TeamPlayer

!new Position('position26')
!position26.positionName := #GOALKEEPER

!new Position('position27')
!position27.positionName := #DEFENDER

!new Position('position28')
!position28.positionName := #MIDFIELDER

!insert (player17, position26) into PlayerPositions
!insert (player17, position27) into PlayerPositions
!insert (player17, position28) into PlayerPositions

!insert (player18, position26) into PlayerPositions
!insert (player18, position27) into PlayerPositions

!new PlayerNotes('playerNote13')
!playerNote13.note := 'Remarkable tactical adaptability'
!playerNote13.date := '2023-09-30'

!insert (player17, playerNote13) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective16')
!trainingObjective16.areaToImprove := 'Long passes'
!trainingObjective16.startDate := '2023-09-01'
!trainingObjective16.endDate := '2023-09-30'
!trainingObjective16.success := true

!new TrainingObjective('trainingObjective17')
!trainingObjective17.areaToImprove := 'Footwork dribbles'
!trainingObjective17.startDate := '2023-09-15'
!trainingObjective17.endDate := '2023-10-15'
!trainingObjective17.success := true

!new TrainingObjective('trainingObjective18')
!trainingObjective18.areaToImprove := 'Defensive coverage'
!trainingObjective18.startDate := '2023-09-01'
!trainingObjective18.endDate := '2023-09-30'
!trainingObjective18.success := true

!insert (trainingObjective16, player17) into TrainingObjectivePlayer
!insert (trainingObjective17, player17) into TrainingObjectivePlayer
!insert (trainingObjective18, player17) into TrainingObjectivePlayer

!new TrainingObjective('trainingObjective19')
!trainingObjective19.areaToImprove := 'Agility'
!trainingObjective19.startDate := '2023-08-01'
!trainingObjective19.endDate := '2023-09-30'
!trainingObjective19.success := false

!insert (trainingObjective19, player18) into TrainingObjectivePlayer

!new Match('match9')
!match9.date := '2023-11-01'
!match9.homeAway := true

!insert (competition9, match9) into CompetitionMatch

!new Club('club18')
!club18.name := 'Oceanic Club'
!club18.homeGround := 'Oceanic Stadium'
!club18.chairman := 'Mr. Sea Breeze'

!new Team('teamT')
!teamT.name := 'Oceanic Warriors'

!insert (club18, teamT) into ClubTeam

!insert (teamR, match9) into LocalMatch
!insert (teamT, match9) into VisitorMatch

!new MatchReport('matchReport9')
!matchReport9.duration := 90
!matchReport9.scoreVisitor := 8
!matchReport9.scoreLocal := 5

!insert (match9, matchReport9) into MatchMatchReport

!new MatchEvent('matchEvent26')
!matchEvent26.eventType := #GOAL
!matchEvent26.time := 5

!new MatchEvent('matchEvent27')
!matchEvent27.eventType := #GOAL
!matchEvent27.time := 20

!new MatchEvent('matchEvent28')
!matchEvent28.eventType := #FOUL
!matchEvent28.time := 25

!new MatchEvent('matchEvent29')
!matchEvent29.eventType := #GOAL
!matchEvent29.time := 30

!new MatchEvent('matchEvent30')
!matchEvent30.eventType := #GOAL
!matchEvent30.time := 35

!new MatchEvent('matchEvent31')
!matchEvent31.eventType := #GOAL
!matchEvent31.time := 40

!new MatchEvent('matchEvent32')
!matchEvent32.eventType := #GOAL
!matchEvent32.time := 50

!new MatchEvent('matchEvent33')
!matchEvent33.eventType := #GOAL
!matchEvent33.time := 55

!new MatchEvent('matchEvent34')
!matchEvent34.eventType := #GOAL
!matchEvent34.time := 60

!new MatchEvent('matchEvent35')
!matchEvent35.eventType := #GOAL
!matchEvent35.time := 65

!new MatchEvent('matchEvent36')
!matchEvent36.eventType := #GOAL
!matchEvent36.time := 70

!new MatchEvent('matchEvent37')
!matchEvent37.eventType := #FOUL
!matchEvent37.time := 75

!new MatchEvent('matchEvent38')
!matchEvent38.eventType := #GOAL
!matchEvent38.time := 80

!new MatchEvent('matchEvent39')
!matchEvent39.eventType := #GOAL
!matchEvent39.time := 85

!insert (match9, matchEvent26) into MatchMatchEvent
!insert (match9, matchEvent27) into MatchMatchEvent
!insert (match9, matchEvent28) into MatchMatchEvent
!insert (match9, matchEvent29) into MatchMatchEvent
!insert (match9, matchEvent30) into MatchMatchEvent
!insert (match9, matchEvent31) into MatchMatchEvent
!insert (match9, matchEvent32) into MatchMatchEvent
!insert (match9, matchEvent33) into MatchMatchEvent
!insert (match9, matchEvent34) into MatchMatchEvent
!insert (match9, matchEvent35) into MatchMatchEvent
!insert (match9, matchEvent36) into MatchMatchEvent
!insert (match9, matchEvent37) into MatchMatchEvent
!insert (match9, matchEvent38) into MatchMatchEvent
!insert (match9, matchEvent39) into MatchMatchEvent

!new MatchNote('matchNote7')
!matchNote7.note := 'Spectacular offensive showdown with unpredictable weather challenges'
!matchNote7.date := '2023-11-01'

!insert (match9, matchNote7) into MatchMatchNote

!new MatchPlayer('matchPlayer13')
!matchPlayer13.booked := false
!matchPlayer13.goals := 2
!matchPlayer13.rating := 8

!insert (player17, matchPlayer13) into PlayerMatch
!insert (match9, matchPlayer13) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition14')
!matchPlayerPosition14.positionName := #FORWARD
!matchPlayerPosition14.number := 9

!insert (matchPlayer13, matchPlayerPosition14) into MatchPlayerMatchPlayerPosition

!insert (failedAttend8, player17) into FailedPlayer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 169 | 0.00% |
| Multiplicities Errors | 5 | 42 | 11.90% |
| Invariants Errors | 1 | 4 | 25.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `PlayerPositions':
  Object `position26' of class `Position' is connected to 2 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `PlayerPositions':
  Object `position27' of class `Position' is connected to 2 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamT' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamS' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamT' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```

| Invariants Errors | 
|---| 
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 14 | 0.00% |

## Category invalid
```
!new Club('club6')
!club6.name := 'Manchester Celts'
!club6.homeGround := 'Celt Park'
!club6.chairman := 'Eamon Gallagher'

!new Club('club7')
!club7.name := 'Liverpool Warriors'
!club7.homeGround := 'Redstone Arena'
!club7.chairman := 'Sophie Elissade'

!new Club('club8')
!club8.name := 'London Knights'
!club8.homeGround := 'King’s Field'
!club8.chairman := 'Oliver Smith'

!new Team('teamG')
!teamG.name := 'Celts United'

!new Team('teamH')
!teamH.name := 'Warriors FC'

!new Team('teamI')
!teamI.name := 'Knights Elite'

!insert (club6, teamG) into ClubTeam
!insert (club7, teamH) into ClubTeam
!insert (club8, teamI) into ClubTeam

!new Player('player7')
!player7.name := 'John Brogan'
!player7.age := 25
!player7.bestFoot := #RIGHT
!player7.phoneNumber := '+44123456789'

!new Player('player8')
!player8.name := 'Liam Hart'
!player8.age := 28
!player8.bestFoot := #LEFT
!player8.phoneNumber := '+44987654321'

!insert (teamG, player7) into TeamPlayer
!insert (teamH, player8) into TeamPlayer

!new Position('position8')
!position8.positionName := #GOALKEEPER

!new Position('position9')
!position9.positionName := #DEFENDER

!insert (player7, position8) into PlayerPositions
!insert (player8, position9) into PlayerPositions

!new Competition('competition4')
!competition4.name := 'British Isles Cup'
!competition4.type := 'Knockout'

!new Match('match4')
!match4.date := '2023-05-10'
!match4.homeAway := false

!insert (competition4, match4) into CompetitionMatch

!insert (teamG, match4) into LocalMatch
!insert (teamG, match4) into VisitorMatch

!new MatchReport('matchReport4')
!matchReport4.duration := 90
!matchReport4.scoreVisitor := 0
!matchReport4.scoreLocal := 0

!insert (match4, matchReport4) into MatchMatchReport

!new MatchEvent('matchEvent9')
!matchEvent9.eventType := #FOUL
!matchEvent9.time := 45

!insert (match4, matchEvent9) into MatchMatchEvent

!new MatchNote('matchNote3')
!matchNote3.note := 'Both teams displayed poor sportsmanship.'
!matchNote3.date := '2023-05-11'

!insert (match4, matchNote3) into MatchMatchNote

!new TrainingSession('trainingSession6')
!trainingSession6.date := '2023-03-12'
!trainingSession6.location := 'Celt Park Training Grounds'
!trainingSession6.purpose := 'To strengthen the defensive strategy'

!insert (teamG, trainingSession6) into TeamTraining

!new TrainingNotes('trainingNote8')
!trainingNote8.note := 'Incorporate new defensive plays into upcoming match strategy.'
!trainingNote8.date := '2023-03-13'

!insert (trainingSession6, trainingNote8) into TrainingTrainingNotes

!new TrainingSession('trainingSession7')
!trainingSession7.date := '2023-03-15'
!trainingSession7.location := 'King’s Field Training Center'
!trainingSession7.purpose := 'To enhance goalkeeping reflexes'

!insert (teamI, trainingSession7) into TeamTraining

!new TrainingSession('trainingSession8')
!trainingSession8.date := '2023-03-18'
!trainingSession8.location := 'Redstone Arena Training Facility'
!trainingSession8.purpose := 'Precision shooting and placement'

!insert (teamH, trainingSession8) into TeamTraining

!new TrainingFailedToAttend('failedAttend3')
!failedAttend3.reason := 'Injury recovery in progress.'

!insert (trainingSession6, failedAttend3) into TrainingFailded
!insert (failedAttend3, player7) into FailedPlayer

!new TrainingObjective('trainingObjective8')
!trainingObjective8.areaToImprove := 'Tackling Techniques'
!trainingObjective8.startDate := '2023-02-01'
!trainingObjective8.endDate := '2023-06-01'
!trainingObjective8.success := false

!insert (trainingObjective8, player8) into TrainingObjectivePlayer

!new PlayerNotes('playerNote5')
!playerNote5.note := 'Considered for Captaincy next season.'
!playerNote5.date := '2023-02-15'

!insert (player7, playerNote5) into PlayerPlayerNotes

!new MatchPlayer('matchPlayer6')
!matchPlayer6.booked := false
!matchPlayer6.goals := 0
!matchPlayer6.rating := 7

!insert (player7, matchPlayer6) into PlayerMatch
!insert (match4, matchPlayer6) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition6')
!matchPlayerPosition6.positionName := #GOALKEEPER
!matchPlayerPosition6.number := 1

!insert (matchPlayer6, matchPlayerPosition6) into MatchPlayerMatchPlayerPosition
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 4 | 24 | 16.67% |
| Invariants Errors (Not included on General) | 2 | 4 | 50.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamI' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player7' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession7' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession8' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 9 | 0.00% |

## Generation 1 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 635 | 0.00% |
| Multiplicities Errors | 7 | 129 | 5.43% |
| Invariants Errors | 3 | 16 | 18.75% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamB' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `trainingSession1' of class `TrainingSession' is connected to 3 objects of class `Team'
  at association end `team' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `PlayerPositions':
  Object `position26' of class `Position' is connected to 2 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `PlayerPositions':
  Object `position27' of class `Position' is connected to 2 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamT' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamS' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamT' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```

| Invariants Errors | 
|---| 
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 4 | 24 | 16.67% |
| Invariants Errors (Not included on General) | 2 | 4 | 50.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamI' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player7' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession7' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession8' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 59 | 0.00% |

# Generation 2
## Category baseline
```
!new Club('club9')
!club9.name := 'Buenos Aires Athletic'
!club9.homeGround := 'Estadio Monumental'
!club9.chairman := 'Santiago Alvarez'

!new Team('teamJ')
!teamJ.name := 'Buenos Aires Condors'

!insert (club9, teamJ) into ClubTeam

!new Club('club10')
!club10.name := 'Sao Paulo Football Club'
!club10.homeGround := 'Morumbi Stadium'
!club10.chairman := 'Carlos Miguel'

!new Team('teamK')
!teamK.name := 'Sao Paulo Panthers'

!insert (club10, teamK) into ClubTeam

!new Player('player9')
!player9.name := 'Roberto Silva'
!player9.age := 30
!player9.bestFoot := #BOTH
!player9.phoneNumber := '+55-11-987654'

!insert (teamK, player9) into TeamPlayer

!new Position('position10')
!position10.positionName := #MIDFIELDER

!new Position('position11')
!position11.positionName := #DEFENDER

!insert (player9, position10) into PlayerPositions
!insert (player9, position11) into PlayerPositions

!new PlayerNotes('playerNote6')
!playerNote6.note := 'Versatile player trusted to handle multiple roles.'
!playerNote6.date := '2023-09-10'

!insert (player9, playerNote6) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective9')
!trainingObjective9.areaToImprove := 'Leadership'
!trainingObjective9.startDate := '2023-09-01'
!trainingObjective9.endDate := '2023-11-01'
!trainingObjective9.success := true

!new TrainingObjective('trainingObjective10')
!trainingObjective10.areaToImprove := 'Speed'
!trainingObjective10.startDate := '2023-08-15'
!trainingObjective10.endDate := '2023-10-15'
!trainingObjective10.success := false

!insert (trainingObjective9, player9) into TrainingObjectivePlayer
!insert (trainingObjective10, player9) into TrainingObjectivePlayer

!new Player('player10')
!player10.name := 'Ana Gomes'
!player10.age := 26
!player10.bestFoot := #LEFT
!player10.phoneNumber := '+55-11-678543'

!insert (teamK, player10) into TeamPlayer

!new Position('position12')
!position12.positionName := #FORWARD

!insert (player10, position12) into PlayerPositions

!new PlayerNotes('playerNote7')
!playerNote7.note := 'Known for her precise shots and quick pace.'
!playerNote7.date := '2023-09-01'

!insert (player10, playerNote7) into PlayerPlayerNotes

!new Competition('competition5')
!competition5.name := 'South American League'
!competition5.type := 'Regional League'

!new Match('match5')
!match5.date := '2023-09-20'
!match5.homeAway := false

!insert (competition5, match5) into CompetitionMatch

!insert (teamJ, match5) into LocalMatch
!insert (teamK, match5) into VisitorMatch

!new MatchReport('matchReport5')
!matchReport5.duration := 120
!matchReport5.scoreVisitor := 1
!matchReport5.scoreLocal := 1

!insert (match5, matchReport5) into MatchMatchReport

!new MatchEvent('matchEvent10')
!matchEvent10.eventType := #GOAL
!matchEvent10.time := 33

!new MatchEvent('matchEvent11')
!matchEvent11.eventType := #FOUL
!matchEvent11.time := 44

!new MatchEvent('matchEvent12')
!matchEvent12.eventType := #GOAL
!matchEvent12.time := 81

!new MatchEvent('matchEvent13')
!matchEvent13.eventType := #FOUL
!matchEvent13.time := 110

!insert (match5, matchEvent10) into MatchMatchEvent
!insert (match5, matchEvent11) into MatchMatchEvent
!insert (match5, matchEvent12) into MatchMatchEvent
!insert (match5, matchEvent13) into MatchMatchEvent

!new MatchNote('matchNote4')
!matchNote4.note := 'Match ended in penalties due to a tie after extra time.'
!matchNote4.date := '2023-09-20'

!insert (match5, matchNote4) into MatchMatchNote

!new MatchPlayer('matchPlayer7')
!matchPlayer7.booked := false
!matchPlayer7.goals := 1
!matchPlayer7.rating := 7

!insert (player9, matchPlayer7) into PlayerMatch
!insert (match5, matchPlayer7) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition7')
!matchPlayerPosition7.positionName := #MIDFIELDER
!matchPlayerPosition7.number := 8

!insert (matchPlayer7, matchPlayerPosition7) into MatchPlayerMatchPlayerPosition

!new MatchPlayer('matchPlayer8')
!matchPlayer8.booked := true
!matchPlayer8.goals := 0
!matchPlayer8.rating := 5

!insert (player10, matchPlayer8) into PlayerMatch
!insert (match5, matchPlayer8) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition8')
!matchPlayerPosition8.positionName := #DEFENDER
!matchPlayerPosition8.number := 5

!insert (matchPlayer8, matchPlayerPosition8) into MatchPlayerMatchPlayerPosition

!new TrainingSession('trainingSession9')
!trainingSession9.date := '2023-08-18'
!trainingSession9.location := 'Sao Paulo Training Facility'
!trainingSession9.purpose := 'Tactical Adjustments'

!insert (teamK, trainingSession9) into TeamTraining

!new TrainingNotes('trainingNote9')
!trainingNote9.note := 'Intensive focus on counter-attacking drills.'
!trainingNote9.date := '2023-08-18'

!new TrainingNotes('trainingNote10')
!trainingNote10.note := 'Review of previous match tape for improvements.'
!trainingNote10.date := '2023-08-18'

!insert (trainingSession9, trainingNote9) into TrainingTrainingNotes
!insert (trainingSession9, trainingNote10) into TrainingTrainingNotes

!new TrainingFailedToAttend('failedAttend4')
!failedAttend4.reason := 'Family Emergency'

!insert (trainingSession9, failedAttend4) into TrainingFailded
!insert (failedAttend4, player10) into FailedPlayer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 126 | 0.00% |
| Multiplicities Errors | 3 | 31 | 9.68% |
| Invariants Errors | 0 | 4 | 0.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamJ' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamJ' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player10' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 11 | 0.00% |

## Category boundary
```
!new Club('club11')
!club11.name := 'Southern Tigers FC'
!club11.homeGround := 'Tiger Arena'
!club11.chairman := 'Emily Zhang'

!new Team('teamL')
!teamL.name := 'Tigers Elite'

!insert (club11, teamL) into ClubTeam

!new Player('player11')
!player11.name := 'Carlos Mendes'
!player11.age := 32
!player11.bestFoot := #BOTH
!player11.phoneNumber := '+351910000111'

!insert (teamL, player11) into TeamPlayer

!new Position('position13')
!position13.positionName := #FORWARD

!new Position('position14')
!position14.positionName := #MIDFIELDER

!new Position('position15')
!position15.positionName := #DEFENDER

!insert (player11, position13) into PlayerPositions
!insert (player11, position14) into PlayerPositions
!insert (player11, position15) into PlayerPositions

!new PlayerNotes('playerNote8')
!playerNote8.note := 'Top scorer of the season'
!playerNote8.date := '2023-04-01'

!new PlayerNotes('playerNote9')
!playerNote9.note := 'Consistent performer in mid-field'
!playerNote9.date := '2023-03-20'

!insert (player11, playerNote8) into PlayerPlayerNotes
!insert (player11, playerNote9) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective11')
!trainingObjective11.areaToImprove := 'Versatility'
!trainingObjective11.startDate := '2023-01-01'
!trainingObjective11.endDate := '2023-12-31'
!trainingObjective11.success := true

!insert (trainingObjective11, player11) into TrainingObjectivePlayer

!new Competition('competition6')
!competition6.name := 'City Championship'
!competition6.type := 'Cup'

!new Match('match6')
!match6.date := '2023-06-15'
!match6.homeAway := false

!insert (competition6, match6) into CompetitionMatch

!new Team('teamM')
!teamM.name := 'East Leopards'

!new Club('club12')
!club12.name := 'East Leopards Club'
!club12.homeGround := 'Leopard Stadium'
!club12.chairman := 'John Doe'

!insert (club12, teamM) into ClubTeam

!new Player('player12')
!player12.name := 'Igor Silva'
!player12.age := 28
!player12.bestFoot := #LEFT
!player12.phoneNumber := '+55-21-9876543'

!insert (teamM, player12) into TeamPlayer

!new Position('position16')
!position16.positionName := #MIDFIELDER

!insert (player12, position16) into PlayerPositions

!new TrainingObjective('trainingObjective12')
!trainingObjective12.areaToImprove := 'Midfield Control'
!trainingObjective12.startDate := '2023-02-01'
!trainingObjective12.endDate := '2023-06-01'
!trainingObjective12.success := false

!insert (trainingObjective12, player12) into TrainingObjectivePlayer

!insert (teamM, match6) into LocalMatch
!insert (teamL, match6) into VisitorMatch

!new MatchReport('matchReport6')
!matchReport6.duration := 120
!matchReport6.scoreVisitor := 3
!matchReport6.scoreLocal := 3

!insert (match6, matchReport6) into MatchMatchReport

!new MatchEvent('matchEvent14')
!matchEvent14.eventType := #GOAL
!matchEvent14.time := 22

!new MatchEvent('matchEvent15')
!matchEvent15.eventType := #GOAL
!matchEvent15.time := 35

!new MatchEvent('matchEvent16')
!matchEvent16.eventType := #GOAL
!matchEvent16.time := 47

!new MatchEvent('matchEvent17')
!matchEvent17.eventType := #GOAL
!matchEvent17.time := 59

!new MatchEvent('matchEvent18')
!matchEvent18.eventType := #GOAL
!matchEvent18.time := 76

!new MatchEvent('matchEvent19')
!matchEvent19.eventType := #GOAL
!matchEvent19.time := 89

!insert (match6, matchEvent14) into MatchMatchEvent
!insert (match6, matchEvent15) into MatchMatchEvent
!insert (match6, matchEvent16) into MatchMatchEvent
!insert (match6, matchEvent17) into MatchMatchEvent
!insert (match6, matchEvent18) into MatchMatchEvent
!insert (match6, matchEvent19) into MatchMatchEvent

!new MatchPlayer('matchPlayer9')
!matchPlayer9.booked := true
!matchPlayer9.goals := 2
!matchPlayer9.rating := 8

!insert (player11, matchPlayer9) into PlayerMatch
!insert (match6, matchPlayer9) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition9')
!matchPlayerPosition9.positionName := #FORWARD
!matchPlayerPosition9.number := 9

!insert (matchPlayer9, matchPlayerPosition9) into MatchPlayerMatchPlayerPosition

!new TrainingSession('trainingSession10')
!trainingSession10.date := '2023-06-10'
!trainingSession10.location := 'Tiger Arena Training Complex'
!trainingSession10.purpose := 'Routine skills enhancement'

!insert (teamL, trainingSession10) into TeamTraining

!new TrainingNotes('trainingNote11')
!trainingNote11.note := 'Intensity set to high'
!trainingNote11.date := '2023-06-10'

!new TrainingNotes('trainingNote12')
!trainingNote12.note := 'Emphasis on team collaboration'
!trainingNote12.date := '2023-06-10'

!insert (trainingSession10, trainingNote11) into TrainingTrainingNotes
!insert (trainingSession10, trainingNote12) into TrainingTrainingNotes

!new TrainingFailedToAttend('failedAttend5')
!failedAttend5.reason := 'Personal commitments'

!insert (trainingSession10, failedAttend5) into TrainingFailded
!insert (failedAttend5, player11) into FailedPlayer

!new TrainingSession('trainingSession11')
!trainingSession11.date := '2023-06-12'
!trainingSession11.location := 'Leopard Stadium Training Ground'
!trainingSession11.purpose := 'Midfield Tactics'

!insert (teamM, trainingSession11) into TeamTraining

!new TrainingNotes('trainingNote13')
!trainingNote13.note := 'Focus on player positioning'
!trainingNote13.date := '2023-06-12'

!insert (trainingSession11, trainingNote13) into TrainingTrainingNotes
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 132 | 0.00% |
| Multiplicities Errors | 0 | 32 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

## Category complex
```
!new Club('club13')
!club13.name := 'Manchester United FC'
!club13.homeGround := 'Old Trafford'
!club13.chairman := 'Joel Glazer'

!new Club('club14')
!club14.name := 'Liverpool FC'
!club14.homeGround := 'Anfield'
!club14.chairman := 'Tom Werner'

!new Team('teamN')
!teamN.name := 'Manchester United Senior Team'

!new Team('teamO')
!teamO.name := 'Liverpool Senior Team'

!insert (club13, teamN) into ClubTeam
!insert (club14, teamO) into ClubTeam

!new Competition('competition7')
!competition7.name := 'English Premier League'
!competition7.type := 'Top Tier League'

!new Match('match7')
!match7.date := '2023-11-05'
!match7.homeAway := false

!insert (competition7, match7) into CompetitionMatch

!insert (teamO, match7) into LocalMatch
!insert (teamN, match7) into VisitorMatch

!new Player('player13')
!player13.name := 'Marcus Rashford'
!player13.age := 26
!player13.bestFoot := #RIGHT
!player13.phoneNumber := '+44 7709123456'

!new Player('player14')
!player14.name := 'Mohamed Salah'
!player14.age := 31
!player14.bestFoot := #LEFT
!player14.phoneNumber := '+44 7712345678'

!insert (teamN, player13) into TeamPlayer
!insert (teamO, player14) into TeamPlayer

!new Position('position17')
!position17.positionName := #FORWARD

!new Position('position19')
!position19.positionName := #MIDFIELDER

!insert (player13, position17) into PlayerPositions
!insert (player14, position19) into PlayerPositions

!new MatchReport('matchReport7')
!matchReport7.duration := 90
!matchReport7.scoreVisitor := 3
!matchReport7.scoreLocal := 3

!insert (match7, matchReport7) into MatchMatchReport

!new MatchEvent('matchEvent20')
!matchEvent20.eventType := #GOAL
!matchEvent20.time := 15

!new MatchEvent('matchEvent21')
!matchEvent21.eventType := #GOAL
!matchEvent21.time := 27

!new MatchEvent('matchEvent22')
!matchEvent22.eventType := #GOAL
!matchEvent22.time := 47

!new MatchEvent('matchEvent23')
!matchEvent23.eventType := #GOAL
!matchEvent23.time := 75

!new MatchEvent('matchEvent24')
!matchEvent24.eventType := #GOAL
!matchEvent24.time := 89

!insert (match7, matchEvent20) into MatchMatchEvent
!insert (match7, matchEvent21) into MatchMatchEvent
!insert (match7, matchEvent22) into MatchMatchEvent
!insert (match7, matchEvent23) into MatchMatchEvent
!insert (match7, matchEvent24) into MatchMatchEvent

!new MatchNote('matchNote5')
!matchNote5.note := 'An exhilarating match with outstanding offensive displays from both teams.'
!matchNote5.date := '2023-11-05'

!insert (match7, matchNote5) into MatchMatchNote

!new MatchPlayer('matchPlayer10')
!matchPlayer10.booked := false
!matchPlayer10.goals := 2
!matchPlayer10.rating := 9

!insert (player13, matchPlayer10) into PlayerMatch
!insert (match7, matchPlayer10) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition10')
!matchPlayerPosition10.positionName := #FORWARD
!matchPlayerPosition10.number := 10

!insert (matchPlayer10, matchPlayerPosition10) into MatchPlayerMatchPlayerPosition

!new MatchPlayer('matchPlayer11')
!matchPlayer11.booked := false
!matchPlayer11.goals := 1
!matchPlayer11.rating := 8

!insert (player14, matchPlayer11) into PlayerMatch
!insert (match7, matchPlayer11) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition12')
!matchPlayerPosition12.positionName := #MIDFIELDER
!matchPlayerPosition12.number := 11

!insert (matchPlayer11, matchPlayerPosition12) into MatchPlayerMatchPlayerPosition

!new TrainingSession('trainingSession12')
!trainingSession12.date := '2023-11-03'
!trainingSession12.location := 'Carrington Training Centre'
!trainingSession12.purpose := 'Tactical Review of Opponent Strategies'

!insert (teamN, trainingSession12) into TeamTraining

!new TrainingNotes('trainingNote14')
!trainingNote14.note := 'Emphasis on weaknesses in opponent defense identified through video analysis.'
!trainingNote14.date := '2023-11-03'

!insert (trainingSession12, trainingNote14) into TrainingTrainingNotes

!new TrainingFailedToAttend('failedAttend6')
!failedAttend6.reason := 'Illness - Rashford'

!insert (trainingSession12, failedAttend6) into TrainingFailded
!insert (failedAttend6, player13) into FailedPlayer

!new TrainingObjective('trainingObjective13')
!trainingObjective13.areaToImprove := 'Penalty accuracy'
!trainingObjective13.startDate := '2023-10-01'
!trainingObjective13.endDate := '2023-11-30'
!trainingObjective13.success := true

!insert (trainingObjective13, player14) into TrainingObjectivePlayer

!new TrainingObjective('trainingObjective14')
!trainingObjective14.areaToImprove := 'Endurance'
!trainingObjective14.startDate := '2023-10-01'
!trainingObjective14.endDate := '2023-12-31'
!trainingObjective14.success := false

!insert (trainingObjective14, player13) into TrainingObjectivePlayer

!new TrainingSession('trainingSession13')
!trainingSession13.date := '2023-11-04'
!trainingSession13.location := 'Melwood Training Ground'
!trainingSession13.purpose := 'Match Preparation'

!insert (teamO, trainingSession13) into TeamTraining

!new TrainingNotes('trainingNote15')
!trainingNote15.note := 'Full focus on set-piece strategies.'
!trainingNote15.date := '2023-11-04'

!insert (trainingSession13, trainingNote15) into TrainingTrainingNotes

!new PlayerNotes('playerNote10')
!playerNote10.note := 'Demonstrated tactical awareness and resilience in attack.'
!playerNote10.date := '2023-10-31'

!new PlayerNotes('playerNote11')
!playerNote11.note := 'Consistently poses a threat to defenders with his speed and precision.'
!playerNote11.date := '2023-10-28'

!insert (player13, playerNote10) into PlayerPlayerNotes
!insert (player14, playerNote11) into PlayerPlayerNotes
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 132 | 0.00% |
| Multiplicities Errors | 0 | 32 | 0.00% |
| Invariants Errors | 1 | 4 | 25.00% |

| Invariants Errors | 
|---| 
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

## Category edge
```
!new Club('club30')
!club30.name := 'Mountain Eagles FC'
!club30.homeGround := "Eagle's Nest Arena"
!club30.chairman := 'Ms. Diana Peak'

!new Team('teamAF')
!teamAF.name := 'Eagle Defenders'

!new Team('teamAG')
!teamAG.name := 'Summit Strikers'

!insert (club30, teamAF) into ClubTeam
!insert (club30, teamAG) into ClubTeam

!new Competition('competition15')
!competition15.name := 'Highland Challenge'
!competition15.type := 'Round Robin'

!new TrainingSession('trainingSession27')
!trainingSession27.date := '2023-09-20'
!trainingSession27.location := "Eagle's Nest - Practice Field"
!trainingSession27.purpose := 'Skill Development Workshop'

!new TrainingNotes('trainingNote28')
!trainingNote28.note := 'Improvement of strategic play'
!trainingNote28.date := '2023-09-20'

!new TrainingNotes('trainingNote29')
!trainingNote29.note := 'Special focus on defensive drills in low-pressure situations'
!trainingNote29.date := '2023-09-20'

!insert (trainingSession27, trainingNote28) into TrainingTrainingNotes
!insert (trainingSession27, trainingNote29) into TrainingTrainingNotes

!insert (teamAF, trainingSession27) into TeamTraining

!new Player('player31')
!player31.name := 'Amy Swift'
!player31.age := 27
!player31.bestFoot := #RIGHT
!player31.phoneNumber := '+442345678901'

!insert (teamAF, player31) into TeamPlayer

!new Player('player32')
!player32.name := 'Jack Mountain'
!player32.age := 24
!player32.bestFoot := #LEFT
!player32.phoneNumber := '+442367890123'

!insert (teamAG, player32) into TeamPlayer

!new PlayerNotes('playerNote22')
!playerNote22.note := 'Excellent versatility and creative thinking'
!playerNote22.date := '2023-08-15'

!insert (player31, playerNote22) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective32')
!trainingObjective32.areaToImprove := 'Free kicks'
!trainingObjective32.startDate := '2023-08-01'
!trainingObjective32.endDate := '2023-08-31'
!trainingObjective32.success := true

!new TrainingObjective('trainingObjective33')
!trainingObjective33.areaToImprove := 'Corner control'
!trainingObjective33.startDate := '2023-09-01'
!trainingObjective33.endDate := '2023-10-01'
!trainingObjective33.success := true

!new TrainingObjective('trainingObjective34')
!trainingObjective34.areaToImprove := 'Passing accuracy under pressure'
!trainingObjective34.startDate := '2023-08-15'
!trainingObjective34.endDate := '2023-09-15'
!trainingObjective34.success := true

!insert (trainingObjective32, player31) into TrainingObjectivePlayer
!insert (trainingObjective33, player31) into TrainingObjectivePlayer
!insert (trainingObjective34, player31) into TrainingObjectivePlayer

!new TrainingObjective('trainingObjective35')
!trainingObjective35.areaToImprove := 'Speed and Agility'
!trainingObjective35.startDate := '2023-06-01'
!trainingObjective35.endDate := '2023-07-01'
!trainingObjective35.success := true

!insert (trainingObjective35, player32) into TrainingObjectivePlayer

!new Position('position44')
!position44.positionName := #MIDFIELDER

!new Position('position45')
!position45.positionName := #FORWARD

!new Position('position46')
!position46.positionName := #DEFENDER

!insert (player31, position44) into PlayerPositions
!insert (player31, position45) into PlayerPositions

!insert (player32, position46) into PlayerPositions

!new Match('match15')
!match15.date := '2023-10-18'
!match15.homeAway := false

!insert (competition15, match15) into CompetitionMatch

!insert (teamAG, match15) into VisitorMatch
!insert (teamAF, match15) into LocalMatch

!new MatchReport('matchReport15')
!matchReport15.duration := 90
!matchReport15.scoreVisitor := 0
!matchReport15.scoreLocal := 0

!insert (match15, matchReport15) into MatchMatchReport

!new MatchEvent('matchEvent52')
!matchEvent52.eventType := #FOUL
!matchEvent52.time := 10

!new MatchEvent('matchEvent53')
!matchEvent53.eventType := #FOUL
!matchEvent53.time := 25

!new MatchEvent('matchEvent54')
!matchEvent54.eventType := #FOUL
!matchEvent54.time := 35

!new MatchEvent('matchEvent55')
!matchEvent55.eventType := #FOUL
!matchEvent55.time := 45

!new MatchEvent('matchEvent56')
!matchEvent56.eventType := #FOUL
!matchEvent56.time := 60

!new MatchEvent('matchEvent57')
!matchEvent57.eventType := #FOUL
!matchEvent57.time := 75

!new MatchEvent('matchEvent58')
!matchEvent58.eventType := #FOUL
!matchEvent58.time := 80

!insert (match15, matchEvent52) into MatchMatchEvent
!insert (match15, matchEvent53) into MatchMatchEvent
!insert (match15, matchEvent54) into MatchMatchEvent
!insert (match15, matchEvent55) into MatchMatchEvent
!insert (match15, matchEvent56) into MatchMatchEvent
!insert (match15, matchEvent57) into MatchMatchEvent
!insert (match15, matchEvent58) into MatchMatchEvent

!new MatchNote('matchNote11')
!matchNote11.note := 'Tightly contested match with high tactical discipline'
!matchNote11.date := '2023-10-18'

!insert (match15, matchNote11) into MatchMatchNote

!new MatchPlayer('matchPlayer21')
!matchPlayer21.booked := true
!matchPlayer21.goals := 0
!matchPlayer21.rating := 7

!insert (player31, matchPlayer21) into PlayerMatch
!insert (match15, matchPlayer21) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition22')
!matchPlayerPosition22.positionName := #MIDFIELDER
!matchPlayerPosition22.number := 6

!insert (matchPlayer21, matchPlayerPosition22) into MatchPlayerMatchPlayerPosition
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 1 | 128 | 0.78% |
| Multiplicities Errors | 1 | 30 | 3.33% |
| Invariants Errors | 1 | 4 | 25.00% |

| Syntax Errors | 
|---| 
```
<input>:line 1:6 mismatched input '.' expecting :=
```

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamAG' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```

| Invariants Errors | 
|---| 
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 14 | 0.00% |

## Category invalid
```
!new Club('club15')
!club15.name := 'Buenos Aires Argentinos'
!club15.homeGround := 'La Casa Azul'
!club15.chairman := 'Ricardo Martinez'

!new Club('club16')
!club16.name := 'Paris Enforcers'
!club16.homeGround := 'Enforcer Stadium'
!club16.chairman := 'Isabelle Moreau'

!new Team('teamP')
!teamP.name := 'Dreamers FC'

!new Team('teamQ')
!teamQ.name := 'Defenders Co.'

!insert (club15, teamP) into ClubTeam
!insert (club16, teamQ) into ClubTeam

!new Player('player15')
!player15.name := 'Marco Diaz'
!player15.age := 29
!player15.bestFoot := #BOTH
!player15.phoneNumber := '+5491112345678'

!new Player('player16')
!player16.name := 'Thomas Laurent'
!player16.age := 32
!player16.bestFoot := #RIGHT
!player16.phoneNumber := '+33123459876'

!insert (teamP, player15) into TeamPlayer
!insert (teamQ, player16) into TeamPlayer

!new Position('position20')
!position20.positionName := #MIDFIELDER

!new Position('position21')
!position21.positionName := #FORWARD

!new Position('position22')
!position22.positionName := #GOALKEEPER

!insert (player15, position20) into PlayerPositions
!insert (player15, position21) into PlayerPositions
!insert (player16, position22) into PlayerPositions

!new Competition('competition8')
!competition8.name := 'Global League Cup'
!competition8.type := 'Round Robin'

!new Match('match8')
!match8.date := '2023-09-22'
!match8.homeAway := true

!insert (competition8, match8) into CompetitionMatch

!insert (teamP, match8) into LocalMatch
!insert (teamP, match8) into VisitorMatch

!new MatchReport('matchReport8')
!matchReport8.duration := 90
!matchReport8.scoreVisitor := 1
!matchReport8.scoreLocal := 2

!insert (match8, matchReport8) into MatchMatchReport

!new MatchEvent('matchEvent25')
!matchEvent25.eventType := #FOUL
!matchEvent25.time := 20

!insert (match8, matchEvent25) into MatchMatchEvent

!new MatchNote('matchNote6')
!matchNote6.note := 'Intense atmosphere with several controversial decision points.'
!matchNote6.date := '2023-09-23'

!insert (match8, matchNote6) into MatchMatchNote

!new TrainingSession('trainingSession14')
!trainingSession14.date := '2023-07-10'
!trainingSession14.location := 'La Casa Azul Training Fields'
!trainingSession14.purpose := 'Enhance player transitions and ball control'

!insert (teamP, trainingSession14) into TeamTraining

!new TrainingNotes('trainingNote16')
!trainingNote16.note := 'Focus on building team synergy and rapid transitions.'
!trainingNote16.date := '2023-07-11'

!insert (trainingSession14, trainingNote16) into TrainingTrainingNotes

!new TrainingSession('trainingSession15')
!trainingSession15.date := '2023-07-15'
!trainingSession15.location := 'Enforcer Stadium Practice Area'
!trainingSession15.purpose := 'Reinforcement of defensive tactics'

!insert (teamQ, trainingSession15) into TeamTraining

!new TrainingFailedToAttend('failedAttend7')
!failedAttend7.reason := 'Family emergency'

!insert (trainingSession14, failedAttend7) into TrainingFailded
!insert (failedAttend7, player15) into FailedPlayer

!new TrainingObjective('trainingObjective15')
!trainingObjective15.areaToImprove := 'Reflex Saves'
!trainingObjective15.startDate := '2023-05-01'
!trainingObjective15.endDate := '2023-09-30'
!trainingObjective15.success := true

!insert (trainingObjective15, player16) into TrainingObjectivePlayer

!new PlayerNotes('playerNote12')
!playerNote12.note := 'Displayed leadership potential; could be pivotal in future strategies.'
!playerNote12.date := '2023-06-20'

!insert (player15, playerNote12) into PlayerPlayerNotes

!new MatchPlayer('matchPlayer12')
!matchPlayer12.booked := true
!matchPlayer12.goals := 1
!matchPlayer12.rating := 8

!insert (player15, matchPlayer12) into PlayerMatch
!insert (match8, matchPlayer12) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition13')
!matchPlayerPosition13.positionName := #FORWARD
!matchPlayerPosition13.number := 10

!insert (matchPlayer12, matchPlayerPosition13) into MatchPlayerMatchPlayerPosition
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 2 | 23 | 8.70% |
| Invariants Errors (Not included on General) | 3 | 4 | 75.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player15' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession15' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 8 | 0.00% |

## Generation 2 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 1 | 613 | 0.16% |
| Multiplicities Errors | 4 | 125 | 3.20% |
| Invariants Errors | 2 | 16 | 12.50% |

| Syntax Errors | 
|---| 
```
<input>:line 1:6 mismatched input '.' expecting :=
```

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamJ' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamJ' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player10' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamAG' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```

| Invariants Errors | 
|---| 
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 2 | 23 | 8.70% |
| Invariants Errors (Not included on General) | 3 | 4 | 75.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player15' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession15' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 57 | 0.00% |

# Generation 3
## Category baseline
```
!new Club('club21')
!club21.name := 'Auckland United'
!club21.homeGround := 'Eden Park'
!club21.chairman := 'Mathew O''Connor'

!new Team('teamW')
!teamW.name := 'Auckland Rangers'

!insert (club21, teamW) into ClubTeam

!new Player('player23')
!player23.name := 'James Thompson'
!player23.age := 28
!player23.bestFoot := #RIGHT
!player23.phoneNumber := '+64-9-112233'

!insert (teamW, player23) into TeamPlayer

!new Player('player24')
!player24.name := 'Oliver Harris'
!player24.age := 30
!player24.bestFoot := #LEFT
!player24.phoneNumber := '+64-9-445566'

!insert (teamW, player24) into TeamPlayer

!new Position('position34')
!position34.positionName := #FORWARD

!new Position('position35')
!position35.positionName := #DEFENDER

!insert (player23, position34) into PlayerPositions
!insert (player24, position35) into PlayerPositions

!new TrainingObjective('trainingObjective23')
!trainingObjective23.areaToImprove := 'Tactical Awareness'
!trainingObjective23.startDate := '2023-10-01'
!trainingObjective23.endDate := '2023-12-01'
!trainingObjective23.success := true

!insert (trainingObjective23, player23) into TrainingObjectivePlayer

!new TrainingObjective('trainingObjective25')
!trainingObjective25.areaToImprove := 'Strength Training'
!trainingObjective25.startDate := '2023-09-01'
!trainingObjective25.endDate := '2023-10-31'
!trainingObjective25.success := false

!insert (trainingObjective25, player24) into TrainingObjectivePlayer

!new TrainingSession('trainingSession20')
!trainingSession20.date := '2023-10-01'
!trainingSession20.location := 'Auckland Training Grounds'
!trainingSession20.purpose := 'Technique Enhancement'

!insert (teamW, trainingSession20) into TeamTraining

!new TrainingNotes('trainingNote22')
!trainingNote22.note := 'Improving agility and ball control.'
!trainingNote22.date := '2023-10-01'

!insert (trainingSession20, trainingNote22) into TrainingTrainingNotes

!new Competition('competition11')
!competition11.name := 'Oceanic Champions Cup'
!competition11.type := 'Continental Championship'

!new Match('match11')
!match11.date := '2023-11-05'
!match11.homeAway := true

!insert (competition11, match11) into CompetitionMatch

!insert (teamW, match11) into LocalMatch

!new Team('teamX')
!teamX.name := 'Sydney Sharks'

!new Club('club22')
!club22.name := 'Sydney Club'
!club22.homeGround := 'Sydney Stadium'
!club22.chairman := 'Peter Doyle'

!insert (club22, teamX) into ClubTeam

!insert (teamX, match11) into VisitorMatch

!new MatchReport('matchReport11')
!matchReport11.duration := 90
!matchReport11.scoreVisitor := 0
!matchReport11.scoreLocal := 4

!insert (match11, matchReport11) into MatchMatchReport

!new MatchEvent('matchEvent42')
!matchEvent42.eventType := #GOAL
!matchEvent42.time := 9

!new MatchEvent('matchEvent43')
!matchEvent43.eventType := #GOAL
!matchEvent43.time := 23

!new MatchEvent('matchEvent44')
!matchEvent44.eventType := #GOAL
!matchEvent44.time := 66

!new MatchEvent('matchEvent45')
!matchEvent45.eventType := #GOAL
!matchEvent45.time := 89

!new MatchEvent('matchEvent46')
!matchEvent46.eventType := #FOUL
!matchEvent46.time := 54

!insert (match11, matchEvent42) into MatchMatchEvent
!insert (match11, matchEvent43) into MatchMatchEvent
!insert (match11, matchEvent44) into MatchMatchEvent
!insert (match11, matchEvent45) into MatchMatchEvent
!insert (match11, matchEvent46) into MatchMatchEvent

!new MatchNote('matchNote8')
!matchNote8.note := 'Dominant performance on home turf with fan support.'
!matchNote8.date := '2023-11-05'

!insert (match11, matchNote8) into MatchMatchNote

!new MatchPlayer('matchPlayer15')
!matchPlayer15.booked := false
!matchPlayer15.goals := 2
!matchPlayer15.rating := 9

!insert (player23, matchPlayer15) into PlayerMatch
!insert (match11, matchPlayer15) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition16')
!matchPlayerPosition16.positionName := #FORWARD
!matchPlayerPosition16.number := 11

!insert (matchPlayer15, matchPlayerPosition16) into MatchPlayerMatchPlayerPosition

!new MatchPlayer('matchPlayer16')
!matchPlayer16.booked := false
!matchPlayer16.goals := 0
!matchPlayer16.rating := 8

!insert (player24, matchPlayer16) into PlayerMatch
!insert (match11, matchPlayer16) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition17')
!matchPlayerPosition17.positionName := #DEFENDER
!matchPlayerPosition17.number := 4

!insert (matchPlayer16, matchPlayerPosition17) into MatchPlayerMatchPlayerPosition

!new Player('player21')
!player21.name := 'Liam Johnson'
!player21.age := 27
!player21.bestFoot := #RIGHT
!player21.phoneNumber := '+61-2-111222'

!insert (teamX, player21) into TeamPlayer

!new Position('position31')
!position31.positionName := #FORWARD

!new Position('position32')
!position32.positionName := #MIDFIELDER

!insert (player21, position31) into PlayerPositions
!insert (player21, position32) into PlayerPositions

!new PlayerNotes('playerNote15')
!playerNote15.note := 'Noted for versatility and high stamina.'
!playerNote15.date := '2023-10-15'

!insert (player21, playerNote15) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective22')
!trainingObjective22.areaToImprove := 'Scoring Accuracy'
!trainingObjective22.startDate := '2023-09-10'
!trainingObjective22.endDate := '2023-11-10'
!trainingObjective22.success := true

!insert (trainingObjective22, player21) into TrainingObjectivePlayer

!new Player('player22')
!player22.name := 'Sophie Wright'
!player22.age := 23
!player22.bestFoot := #LEFT
!player22.phoneNumber := '+61-2-333444'

!insert (teamX, player22) into TeamPlayer

!new Position('position33')
!position33.positionName := #GOALKEEPER

!insert (player22, position33) into PlayerPositions

!new PlayerNotes('playerNote16')
!playerNote16.note := 'Outstanding reflexes and shot-stopping ability.'
!playerNote16.date := '2023-10-10'

!insert (player22, playerNote16) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective24')
!trainingObjective24.areaToImprove := 'Agility'
!trainingObjective24.startDate := '2023-08-01'
!trainingObjective24.endDate := '2023-10-01'
!trainingObjective24.success := true

!insert (trainingObjective24, player22) into TrainingObjectivePlayer

!new TrainingSession('trainingSession19')
!trainingSession19.date := '2023-09-30'
!trainingSession19.location := 'Sydney Training Centre'
!trainingSession19.purpose := 'Defensive Drill Reinforcement'

!insert (teamX, trainingSession19) into TeamTraining

!new TrainingNotes('trainingNote21')
!trainingNote21.note := 'Focused on defensive positioning and tackling.'
!trainingNote21.date := '2023-09-30'

!insert (trainingSession19, trainingNote21) into TrainingTrainingNotes
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 161 | 0.00% |
| Multiplicities Errors | 0 | 37 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 16 | 0.00% |

## Category boundary
```
!new Club('club19')
!club19.name := 'Western Warriors SC'
!club19.homeGround := 'Warrior Dome'
!club19.chairman := 'Liam O''Connor'

!new Team('teamU')
!teamU.name := 'Warriors First XI'

!insert (club19, teamU) into ClubTeam

!new Player('player19')
!player19.name := 'Jagjeet Singh'
!player19.age := 25
!player19.bestFoot := #RIGHT
!player19.phoneNumber := '+919876543210'

!insert (teamU, player19) into TeamPlayer

!new Position('position29')
!position29.positionName := #DEFENDER

!insert (player19, position29) into PlayerPositions

!new PlayerNotes('playerNote14')
!playerNote14.note := 'Agile with exceptional tackling'
!playerNote14.date := '2023-02-01'

!insert (player19, playerNote14) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective20')
!trainingObjective20.areaToImprove := 'Defensive coordination'
!trainingObjective20.startDate := '2023-03-01'
!trainingObjective20.endDate := '2023-03-30'
!trainingObjective20.success := false

!insert (trainingObjective20, player19) into TrainingObjectivePlayer

!new Competition('competition10')
!competition10.name := 'Interstate Knockout'
!competition10.type := 'Tournament'

!new Match('match10')
!match10.date := '2023-07-22'
!match10.homeAway := true

!insert (competition10, match10) into CompetitionMatch

!new Team('teamV')
!teamV.name := 'Highland Rangers'

!new Club('club20')
!club20.name := 'Highland Club'
!club20.homeGround := 'Highland Stadium'
!club20.chairman := 'John Highland'

!insert (club20, teamV) into ClubTeam

!new Player('player20')
!player20.name := 'Alex Cooper'
!player20.age := 27
!player20.bestFoot := #LEFT
!player20.phoneNumber := '+449876543211'

!insert (teamV, player20) into TeamPlayer

!new Position('position30')
!position30.positionName := #FORWARD

!insert (player20, position30) into PlayerPositions

!new TrainingObjective('trainingObjective21')
!trainingObjective21.areaToImprove := 'Finishing'
!trainingObjective21.startDate := '2023-06-01'
!trainingObjective21.endDate := '2023-07-20'
!trainingObjective21.success := true

!insert (trainingObjective21, player20) into TrainingObjectivePlayer

!insert (teamU, match10) into LocalMatch
!insert (teamV, match10) into VisitorMatch

!new MatchReport('matchReport10')
!matchReport10.duration := 90
!matchReport10.scoreVisitor := 1
!matchReport10.scoreLocal := 1

!insert (match10, matchReport10) into MatchMatchReport

!new MatchEvent('matchEvent40')
!matchEvent40.eventType := #GOAL
!matchEvent40.time := 45

!new MatchEvent('matchEvent41')
!matchEvent41.eventType := #GOAL
!matchEvent41.time := 65

!insert (match10, matchEvent40) into MatchMatchEvent
!insert (match10, matchEvent41) into MatchMatchEvent

!new MatchPlayer('matchPlayer14')
!matchPlayer14.booked := false
!matchPlayer14.goals := 0
!matchPlayer14.rating := 7

!insert (player19, matchPlayer14) into PlayerMatch
!insert (match10, matchPlayer14) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition15')
!matchPlayerPosition15.positionName := #DEFENDER
!matchPlayerPosition15.number := 5

!insert (matchPlayer14, matchPlayerPosition15) into MatchPlayerMatchPlayerPosition

!new TrainingSession('trainingSession17')
!trainingSession17.date := '2023-07-20'
!trainingSession17.location := 'Warrior Dome Practice Field'
!trainingSession17.purpose := 'Match readiness'

!insert (teamU, trainingSession17) into TeamTraining

!new TrainingNotes('trainingNote19')
!trainingNote19.note := 'Focused on defensive drills'
!trainingNote19.date := '2023-07-20'

!insert (trainingSession17, trainingNote19) into TrainingTrainingNotes

!new TrainingSession('trainingSession18')
!trainingSession18.date := '2023-07-21'
!trainingSession18.location := 'Highland Stadium Training Field'
!trainingSession18.purpose := 'Preparation for match'

!insert (teamV, trainingSession18) into TeamTraining

!new TrainingNotes('trainingNote20')
!trainingNote20.note := 'Reviewing set-piece strategies'
!trainingNote20.date := '2023-07-21'

!insert (trainingSession18, trainingNote20) into TrainingTrainingNotes
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 98 | 0.00% |
| Multiplicities Errors | 0 | 22 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 10 | 0.00% |

## Category complex
```
!new Club('club26')
!club26.name := 'Juventus FC'
!club26.homeGround := 'Allianz Stadium'
!club26.chairman := 'Andrea Agnelli'

!new Club('club27')
!club27.name := 'AC Milan'
!club27.homeGround := 'San Siro'
!club27.chairman := 'Paolo Scaroni'

!new Team('teamAB')
!teamAB.name := 'Juventus First Team'

!new Team('teamAC')
!teamAC.name := 'Milan First Team'

!insert (club26, teamAB) into ClubTeam
!insert (club27, teamAC) into ClubTeam

!new Competition('competition13')
!competition13.name := 'Serie A'
!competition13.type := 'National League'

!new Match('match13')
!match13.date := '2023-12-12'
!match13.homeAway := true

!insert (competition13, match13) into CompetitionMatch

!insert (teamAB, match13) into LocalMatch
!insert (teamAC, match13) into VisitorMatch

!new Player('player27')
!player27.name := 'Federico Chiesa'
!player27.age := 26
!player27.bestFoot := #BOTH
!player27.phoneNumber := '+39 3381234567'

!new Player('player28')
!player28.name := 'Theo Hernández'
!player28.age := 26
!player28.bestFoot := #LEFT
!player28.phoneNumber := '+39 3397654321'

!insert (teamAB, player27) into TeamPlayer
!insert (teamAC, player28) into TeamPlayer

!new Position('position39')
!position39.positionName := #MIDFIELDER

!new Position('position40')
!position40.positionName := #DEFENDER

!insert (player27, position39) into PlayerPositions
!insert (player28, position40) into PlayerPositions

!new MatchReport('matchReport13')
!matchReport13.duration := 93
!matchReport13.scoreVisitor := 1
!matchReport13.scoreLocal := 4

!insert (match13, matchReport13) into MatchMatchReport

!new MatchEvent('matchEvent47')
!matchEvent47.eventType := #GOAL
!matchEvent47.time := 10

!new MatchEvent('matchEvent48')
!matchEvent48.eventType := #GOAL
!matchEvent48.time := 50

!new MatchEvent('matchEvent49')
!matchEvent49.eventType := #GOAL
!matchEvent49.time := 70

!new MatchEvent('matchEvent50')
!matchEvent50.eventType := #GOAL
!matchEvent50.time := 80

!new MatchEvent('matchEvent51')
!matchEvent51.eventType := #FOUL
!matchEvent51.time := 60

!insert (match13, matchEvent47) into MatchMatchEvent
!insert (match13, matchEvent48) into MatchMatchEvent
!insert (match13, matchEvent49) into MatchMatchEvent
!insert (match13, matchEvent50) into MatchMatchEvent
!insert (match13, matchEvent51) into MatchMatchEvent

!new MatchNote('matchNote10')
!matchNote10.note := 'Juventus dominated with swift counter-attacks and solid defense.'
!matchNote10.date := '2023-12-12'

!insert (match13, matchNote10) into MatchMatchNote

!new MatchPlayer('matchPlayer18')
!matchPlayer18.booked := true
!matchPlayer18.goals := 2
!matchPlayer18.rating := 9

!insert (player27, matchPlayer18) into PlayerMatch
!insert (match13, matchPlayer18) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition19')
!matchPlayerPosition19.positionName := #MIDFIELDER
!matchPlayerPosition19.number := 22

!insert (matchPlayer18, matchPlayerPosition19) into MatchPlayerMatchPlayerPosition

!new MatchPlayer('matchPlayer19')
!matchPlayer19.booked := false
!matchPlayer19.goals := 1
!matchPlayer19.rating := 7

!insert (player28, matchPlayer19) into PlayerMatch
!insert (match13, matchPlayer19) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition20')
!matchPlayerPosition20.positionName := #DEFENDER
!matchPlayerPosition20.number := 19

!insert (matchPlayer19, matchPlayerPosition20) into MatchPlayerMatchPlayerPosition

!new TrainingSession('trainingSession23')
!trainingSession23.date := '2023-12-10'
!trainingSession23.location := 'Juventus Training Center'
!trainingSession23.purpose := 'Enhance Set Piece Strategies'

!insert (teamAB, trainingSession23) into TeamTraining

!new TrainingNotes('trainingNote24')
!trainingNote24.note := 'Focused on defensive formations during opponents set pieces.'
!trainingNote24.date := '2023-12-10'

!insert (trainingSession23, trainingNote24) into TrainingTrainingNotes

!new TrainingFailedToAttend('failedAttend10')
!failedAttend10.reason := 'Personal Reasons - Chiesa'

!insert (trainingSession23, failedAttend10) into TrainingFailded
!insert (failedAttend10, player27) into FailedPlayer

!new TrainingObjective('trainingObjective27')
!trainingObjective27.areaToImprove := 'Stamina Endurance'
!trainingObjective27.startDate := '2023-11-01'
!trainingObjective27.endDate := '2023-12-31'
!trainingObjective27.success := true

!insert (trainingObjective27, player27) into TrainingObjectivePlayer

!new TrainingSession('trainingSession24')
!trainingSession24.date := '2023-12-11'
!trainingSession24.location := 'Milanello Sports Center'
!trainingSession24.purpose := 'Stamina and Agility Training'

!insert (teamAC, trainingSession24) into TeamTraining

!new TrainingNotes('trainingNote25')
!trainingNote25.note := 'Building endurance and response times.'
!trainingNote25.date := '2023-12-11'

!insert (trainingSession24, trainingNote25) into TrainingTrainingNotes

!new TrainingObjective('trainingObjective28')
!trainingObjective28.areaToImprove := 'Crossing Accuracy'
!trainingObjective28.startDate := '2023-10-01'
!trainingObjective28.endDate := '2023-12-01'
!trainingObjective28.success := false

!insert (trainingObjective28, player28) into TrainingObjectivePlayer

!new PlayerNotes('playerNote18')
!playerNote18.note := 'Versatile and continuously adapting to varying play styles.'
!playerNote18.date := '2023-12-09'

!new PlayerNotes('playerNote19')
!playerNote19.note := 'Demonstrates exceptional pace on the left flank.'
!playerNote19.date := '2023-12-01'

!insert (player27, playerNote18) into PlayerPlayerNotes
!insert (player28, playerNote19) into PlayerPlayerNotes
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 132 | 0.00% |
| Multiplicities Errors | 0 | 32 | 0.00% |
| Invariants Errors | 1 | 4 | 25.00% |

| Invariants Errors | 
|---| 
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

## Category edge
```
!new Club('club38')
!club38.name := 'Global Rangers FC'
!club38.homeGround := 'Universal Dome'
!club38.chairman := 'Dr. Lydia Globetrotter'

!new Team('teamAO')
!teamAO.name := 'Rangers Elite'

!new Team('teamAP')
!teamAP.name := 'Globetrot Warriors'

!insert (club38, teamAO) into ClubTeam
!insert (club38, teamAP) into ClubTeam

!new Competition('competition19')
!competition19.name := 'World Club Championship'
!competition19.type := 'International'

!new TrainingSession('trainingSession33')
!trainingSession33.date := '2023-07-10'
!trainingSession33.location := 'Globetrot Training Complex'
!trainingSession33.purpose := 'Emergency Strategy Assessment'

!new TrainingNotes('trainingNote33')
!trainingNote33.note := 'Simulate unexpected match disruptions'
!trainingNote33.date := '2023-07-10'

!new TrainingNotes('trainingNote34')
!trainingNote34.note := 'Evaluate team response to incomplete drills'
!trainingNote34.date := '2023-07-10'

!insert (trainingSession33, trainingNote33) into TrainingTrainingNotes
!insert (trainingSession33, trainingNote34) into TrainingTrainingNotes

!insert (teamAO, trainingSession33) into TeamTraining
!insert (teamAP, trainingSession33) into TeamTraining

!new TrainingFailedToAttend('failedAttend13')
!failedAttend13.reason := 'Unexpected team emergency exercise invoked'

!insert (trainingSession33, failedAttend13) into TrainingFailded

!new Player('player41')
!player41.name := 'Max Venture'
!player41.age := 29
!player41.bestFoot := #LEFT
!player41.phoneNumber := '+447654321098'

!insert (teamAO, player41) into TeamPlayer

!new Player('player42')
!player42.name := 'Sam Journey'
!player42.age := 25
!player42.bestFoot := #RIGHT
!player42.phoneNumber := '+447655443322'

!insert (teamAP, player42) into TeamPlayer

!new PlayerNotes('playerNote29')
!playerNote29.note := 'Demonstrated exceptional crisis management skills'
!playerNote29.date := '2023-06-25'

!insert (player41, playerNote29) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective43')
!trainingObjective43.areaToImprove := 'Penalty kicks under stress'
!trainingObjective43.startDate := '2023-06-01'
!trainingObjective43.endDate := '2023-06-30'
!trainingObjective43.success := false

!new TrainingObjective('trainingObjective44')
!trainingObjective44.areaToImprove := 'Midfield coordination'
!trainingObjective44.startDate := '2023-06-15'
!trainingObjective44.endDate := '2023-07-15'
!trainingObjective44.success := true

!insert (trainingObjective43, player41) into TrainingObjectivePlayer
!insert (trainingObjective44, player41) into TrainingObjectivePlayer

!new TrainingObjective('trainingObjective45')
!trainingObjective45.areaToImprove := 'Defensive positioning'
!trainingObjective45.startDate := '2023-06-01'
!trainingObjective45.endDate := '2023-06-30'
!trainingObjective45.success := true

!insert (trainingObjective45, player42) into TrainingObjectivePlayer

!new Position('position59')
!position59.positionName := #DEFENDER

!new Position('position60')
!position60.positionName := #MIDFIELDER

!new Position('position61')
!position61.positionName := #FORWARD

!insert (player41, position59) into PlayerPositions
!insert (player41, position60) into PlayerPositions
!insert (player42, position61) into PlayerPositions

!new Match('match19')
!match19.date := '2023-08-05'
!match19.homeAway := true

!insert (competition19, match19) into CompetitionMatch

!insert (teamAO, match19) into LocalMatch
!insert (teamAP, match19) into VisitorMatch

!new MatchReport('matchReport19')
!matchReport19.duration := 90
!matchReport19.scoreVisitor := 2
!matchReport19.scoreLocal := 2

!insert (match19, matchReport19) into MatchMatchReport

!new MatchEvent('matchEvent68')
!matchEvent68.eventType := #GOAL
!matchEvent68.time := 12

!new MatchEvent('matchEvent69')
!matchEvent69.eventType := #FOUL
!matchEvent69.time := 22

!new MatchEvent('matchEvent70')
!matchEvent70.eventType := #CAUTION
!matchEvent70.time := 28

!new MatchEvent('matchEvent71')
!matchEvent71.eventType := #CAUTION
!matchEvent71.time := 33

!new MatchEvent('matchEvent72')
!matchEvent72.eventType := #CAUTION
!matchEvent72.time := 42

!new MatchEvent('matchEvent73')
!matchEvent73.eventType := #GOAL
!matchEvent73.time := 44

!new MatchEvent('matchEvent74')
!matchEvent74.eventType := #CAUTION
!matchEvent74.time := 50

!new MatchEvent('matchEvent75')
!matchEvent75.eventType := #SUBSTITUTE
!matchEvent75.time := 60

!new MatchEvent('matchEvent76')
!matchEvent76.eventType := #FOUL
!matchEvent76.time := 68

!new MatchEvent('matchEvent77')
!matchEvent77.eventType := #CAUTION
!matchEvent77.time := 78

!insert (match19, matchEvent68) into MatchMatchEvent
!insert (match19, matchEvent69) into MatchMatchEvent
!insert (match19, matchEvent70) into MatchMatchEvent
!insert (match19, matchEvent71) into MatchMatchEvent
!insert (match19, matchEvent72) into MatchMatchEvent
!insert (match19, matchEvent73) into MatchMatchEvent
!insert (match19, matchEvent74) into MatchMatchEvent
!insert (match19, matchEvent75) into MatchMatchEvent
!insert (match19, matchEvent76) into MatchMatchEvent
!insert (match19, matchEvent77) into MatchMatchEvent

!new MatchNote('matchNote14')
!matchNote14.note := 'Intense match with record-breaking number of bookings'
!matchNote14.date := '2023-08-05'

!insert (match19, matchNote14) into MatchMatchNote

!new MatchPlayer('matchPlayer26')
!matchPlayer26.booked := true
!matchPlayer26.goals := 1
!matchPlayer26.rating := 6

!insert (player41, matchPlayer26) into PlayerMatch
!insert (match19, matchPlayer26) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition27')
!matchPlayerPosition27.positionName := #DEFENDER
!matchPlayerPosition27.number := 4

!insert (matchPlayer26, matchPlayerPosition27) into MatchPlayerMatchPlayerPosition

!insert (failedAttend13, player41) into FailedPlayer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 11 | 139 | 7.91% |
| Multiplicities Errors | 1 | 35 | 2.86% |
| Invariants Errors | 2 | 4 | 50.00% |

| Syntax Errors | 
|---| 
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```
```
<input>:1:27: Undefined enumeration literal `CAUTION'.
```
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```
```
<input>:1:27: Undefined enumeration literal `CAUTION'.
```
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```
```
<input>:1:27: Undefined enumeration literal `CAUTION'.
```
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```
```
<input>:1:27: Undefined enumeration literal `CAUTION'.
```
```
<input>:1:0: generation of expression `#SUBSTITUTE' failed, with following error:
```
```
<input>:1:27: Undefined enumeration literal `SUBSTITUTE'.
```
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `TeamTraining':
  Object `trainingSession33' of class `TrainingSession' is connected to 2 objects of class `Team'
  at association end `team' but the multiplicity is specified as `1'.
```

| Invariants Errors | 
|---| 
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

## Category invalid
```
!new Club('club23')
!club23.name := 'Tokyo Samurais'
!club23.homeGround := 'Samurai Dome'
!club23.chairman := 'Hiroshi Tanaka'

!new Club('club24')
!club24.name := 'Berlin Eagles'
!club24.homeGround := 'Eagle Nest Stadium'
!club24.chairman := 'Greta Kaufmann'

!new Club('club25')
!club25.name := 'Cape Town Strikers'
!club25.homeGround := 'Striker Field'
!club25.chairman := 'Mpho Mathabane'

!new Team('teamY')
!teamY.name := 'Tokyo Juniors'

!new Team('teamZ')
!teamZ.name := 'Berlin Thunder'

!new Team('teamAA')
!teamAA.name := 'Cape Lions'

!insert (club23, teamY) into ClubTeam
!insert (club24, teamZ) into ClubTeam
!insert (club25, teamAA) into ClubTeam

!new Player('player25')
!player25.name := 'Akira Yamamoto'
!player25.age := 18
!player25.bestFoot := #LEFT
!player25.phoneNumber := '+819011223344'

!insert (teamY, player25) into TeamPlayer

!new Player('player26')
!player26.name := 'Franz Müller'
!player26.age := 19
!player26.bestFoot := #RIGHT
!player26.phoneNumber := '+493012345678'

!insert (teamZ, player26) into TeamPlayer

!new Position('position36')
!position36.positionName := #FORWARD

!new Position('position37')
!position37.positionName := #DEFENDER

!new Position('position38')
!position38.positionName := #MIDFIELDER

!insert (player25, position36) into PlayerPositions
!insert (player26, position37) into PlayerPositions
!insert (player26, position38) into PlayerPositions

!new Competition('competition12')
!competition12.name := 'Under-20 World Cup'
!competition12.type := 'Tournament'

!new Match('match12')
!match12.date := '2023-07-18'
!match12.homeAway := true

!insert (competition12, match12) into CompetitionMatch

!insert (teamY, match12) into LocalMatch
!insert (teamY, match12) into VisitorMatch

!new MatchReport('matchReport12')
!matchReport12.duration := 120
!matchReport12.scoreVisitor := 2
!matchReport12.scoreLocal := 2

!insert (match12, matchReport12) into MatchMatchReport

!new MatchNote('matchNote9')
!matchNote9.note := 'A highly competitive match that went into extra time with no clear winner.'
!matchNote9.date := '2023-07-19'

!insert (match12, matchNote9) into MatchMatchNote

!new TrainingSession('trainingSession21')
!trainingSession21.date := '2023-06-30'
!trainingSession21.location := 'Samurai Dome Training Camp'
!trainingSession21.purpose := 'Enhancing attackers precision and power'

!insert (teamY, trainingSession21) into TeamTraining

!new TrainingNotes('trainingNote23')
!trainingNote23.note := 'Encourage more aggressive offensive play styles.'
!trainingNote23.date := '2023-07-01'

!insert (trainingSession21, trainingNote23) into TrainingTrainingNotes

!new TrainingSession('trainingSession22')
!trainingSession22.date := '2023-07-03'
!trainingSession22.location := 'Eagle Nest Practice Grounds'
!trainingSession22.purpose := 'Improving coordination and tactical defense'

!insert (teamZ, trainingSession22) into TeamTraining

!new TrainingFailedToAttend('failedAttend9')
!failedAttend9.reason := 'Academic exams'

!insert (trainingSession21, failedAttend9) into TrainingFailded
!insert (failedAttend9, player25) into FailedPlayer

!new TrainingObjective('trainingObjective26')
!trainingObjective26.areaToImprove := 'Field Vision'
!trainingObjective26.startDate := '2023-03-01'
!trainingObjective26.endDate := '2023-08-01'
!trainingObjective26.success := false

!insert (trainingObjective26, player26) into TrainingObjectivePlayer

!new PlayerNotes('playerNote17')
!playerNote17.note := 'Impressive tactical awareness needs further honing.'
!playerNote17.date := '2023-04-15'

!insert (player26, playerNote17) into PlayerPlayerNotes

!new MatchPlayer('matchPlayer17')
!matchPlayer17.booked := false
!matchPlayer17.goals := 1
!matchPlayer17.rating := 9

!insert (player26, matchPlayer17) into PlayerMatch
!insert (match12, matchPlayer17) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition18')
!matchPlayerPosition18.positionName := #MIDFIELDER
!matchPlayerPosition18.number := 5

!insert (matchPlayer17, matchPlayerPosition18) into MatchPlayerMatchPlayerPosition
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 4 | 23 | 17.39% |
| Invariants Errors (Not included on General) | 3 | 4 | 75.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamAA' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamAA' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player25' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession22' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 8 | 0.00% |

## Generation 3 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 11 | 628 | 1.75% |
| Multiplicities Errors | 1 | 126 | 0.79% |
| Invariants Errors | 3 | 16 | 18.75% |

| Syntax Errors | 
|---| 
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```
```
<input>:1:27: Undefined enumeration literal `CAUTION'.
```
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```
```
<input>:1:27: Undefined enumeration literal `CAUTION'.
```
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```
```
<input>:1:27: Undefined enumeration literal `CAUTION'.
```
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```
```
<input>:1:27: Undefined enumeration literal `CAUTION'.
```
```
<input>:1:0: generation of expression `#SUBSTITUTE' failed, with following error:
```
```
<input>:1:27: Undefined enumeration literal `SUBSTITUTE'.
```
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `TeamTraining':
  Object `trainingSession33' of class `TrainingSession' is connected to 2 objects of class `Team'
  at association end `team' but the multiplicity is specified as `1'.
```

| Invariants Errors | 
|---| 
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 4 | 23 | 17.39% |
| Invariants Errors (Not included on General) | 3 | 4 | 75.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamAA' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamAA' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player25' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession22' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 58 | 0.00% |

# Generation 4
## Category baseline
```
!new Club('club31')
!club31.name := 'Cape Town Eagles'
!club31.homeGround := 'Cape Town Stadium'
!club31.chairman := 'Thandiwe Ntuli'

!new Team('teamAH')
!teamAH.name := 'Cape Town Falcons'

!insert (club31, teamAH) into ClubTeam

!new Player('player35')
!player35.name := 'Mbulelo Khumalo'
!player35.age := 24
!player35.bestFoot := #RIGHT
!player35.phoneNumber := '+27-21-1234567'

!insert (teamAH, player35) into TeamPlayer

!new Player('player36')
!player36.name := 'Thando Mokoena'
!player36.age := 26
!player36.bestFoot := #LEFT
!player36.phoneNumber := '+27-21-7654321'

!insert (teamAH, player36) into TeamPlayer

!new Position('position50')
!position50.positionName := #FORWARD

!new Position('position51')
!position51.positionName := #MIDFIELDER

!insert (player35, position50) into PlayerPositions
!insert (player36, position51) into PlayerPositions

!new Competition('competition16')
!competition16.name := 'African Nations League'
!competition16.type := 'National Tournament'

!new Match('match16')
!match16.date := '2023-07-18'
!match16.homeAway := false

!insert (competition16, match16) into CompetitionMatch

!insert (teamAH, match16) into VisitorMatch

!new Team('teamAI')
!teamAI.name := 'Lagos Lions'

!new Club('club32')
!club32.name := 'Lagos Football Club'
!club32.homeGround := 'Lagos National Stadium'
!club32.chairman := 'Olusegun Adebayo'

!insert (club32, teamAI) into ClubTeam

!insert (teamAI, match16) into LocalMatch

!new MatchReport('matchReport16')
!matchReport16.duration := 120
!matchReport16.scoreVisitor := 3
!matchReport16.scoreLocal := 3

!insert (match16, matchReport16) into MatchMatchReport

!new MatchEvent('matchEvent59')
!matchEvent59.eventType := #GOAL
!matchEvent59.time := 12

!new MatchEvent('matchEvent60')
!matchEvent60.eventType := #GOAL
!matchEvent60.time := 25

!new MatchEvent('matchEvent61')
!matchEvent61.eventType := #GOAL
!matchEvent61.time := 47

!new MatchEvent('matchEvent62')
!matchEvent62.eventType := #FOUL
!matchEvent62.time := 60

!new MatchEvent('matchEvent63')
!matchEvent63.eventType := #GOAL
!matchEvent63.time := 90

!new MatchEvent('matchEvent64')
!matchEvent64.eventType := #GOAL
!matchEvent64.time := 105

!new MatchEvent('matchEvent65')
!matchEvent65.eventType := #GOAL
!matchEvent65.time := 115

!insert (match16, matchEvent59) into MatchMatchEvent
!insert (match16, matchEvent60) into MatchMatchEvent
!insert (match16, matchEvent61) into MatchMatchEvent
!insert (match16, matchEvent62) into MatchMatchEvent
!insert (match16, matchEvent63) into MatchMatchEvent
!insert (match16, matchEvent64) into MatchMatchEvent
!insert (match16, matchEvent65) into MatchMatchEvent

!new MatchNote('matchNote12')
!matchNote12.note := 'Exciting match that extended to extra time with dramatic goals.'
!matchNote12.date := '2023-07-18'

!insert (match16, matchNote12) into MatchMatchNote

!new MatchPlayer('matchPlayer22')
!matchPlayer22.booked := true
!matchPlayer22.goals := 1
!matchPlayer22.rating := 8

!insert (player35, matchPlayer22) into PlayerMatch
!insert (match16, matchPlayer22) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition23')
!matchPlayerPosition23.positionName := #FORWARD
!matchPlayerPosition23.number := 7

!insert (matchPlayer22, matchPlayerPosition23) into MatchPlayerMatchPlayerPosition

!new MatchPlayer('matchPlayer23')
!matchPlayer23.booked := false
!matchPlayer23.goals := 1
!matchPlayer23.rating := 9

!insert (player36, matchPlayer23) into PlayerMatch
!insert (match16, matchPlayer23) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition24')
!matchPlayerPosition24.positionName := #MIDFIELDER
!matchPlayerPosition24.number := 6

!insert (matchPlayer23, matchPlayerPosition24) into MatchPlayerMatchPlayerPosition

!new Player('player33')
!player33.name := 'Oluwaseun Adeyemi'
!player33.age := 29
!player33.bestFoot := #BOTH
!player33.phoneNumber := '+234-1-987123'

!new Player('player34')
!player34.name := 'Nia Amara'
!player34.age := 22
!player34.bestFoot := #RIGHT
!player34.phoneNumber := '+234-1-654321'

!insert (teamAI, player33) into TeamPlayer
!insert (teamAI, player34) into TeamPlayer

!new Position('position47')
!position47.positionName := #FORWARD

!new Position('position48')
!position48.positionName := #MIDFIELDER

!new Position('position49')
!position49.positionName := #DEFENDER

!insert (player33, position47) into PlayerPositions
!insert (player33, position48) into PlayerPositions
!insert (player34, position49) into PlayerPositions

!new PlayerNotes('playerNote23')
!playerNote23.note := 'Known for strategic play and leadership.'
!playerNote23.date := '2023-06-15'

!insert (player33, playerNote23) into PlayerPlayerNotes

!new PlayerNotes('playerNote24')
!playerNote24.note := 'Strong defensive skills with agility on the field.'
!playerNote24.date := '2023-06-20'

!insert (player34, playerNote24) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective36')
!trainingObjective36.areaToImprove := 'Passing Accuracy'
!trainingObjective36.startDate := '2023-05-10'
!trainingObjective36.endDate := '2023-08-10'
!trainingObjective36.success := true

!insert (trainingObjective36, player33) into TrainingObjectivePlayer

!new TrainingObjective('trainingObjective37')
!trainingObjective37.areaToImprove := 'Tactical Awareness'
!trainingObjective37.startDate := '2023-07-01'
!trainingObjective37.endDate := '2023-09-01'
!trainingObjective37.success := false

!insert (trainingObjective37, player34) into TrainingObjectivePlayer

!new TrainingSession('trainingSession28')
!trainingSession28.date := '2023-06-01'
!trainingSession28.location := 'Lagos Sports Complex'
!trainingSession28.purpose := 'Team Coordination'

!insert (teamAI, trainingSession28) into TeamTraining

!insert (teamAH, trainingSession28) into TeamTraining

!new TrainingNotes('trainingNote30')
!trainingNote30.note := 'Focused on developing team chemistry and intricate passing drills.'
!trainingNote30.date := '2023-06-01'

!insert (trainingSession28, trainingNote30) into TrainingTrainingNotes

!new TrainingFailedToAttend('failedAttend11')
!failedAttend11.reason := 'Travel Delay'

!insert (trainingSession28, failedAttend11) into TrainingFailded
!insert (failedAttend11, player34) into FailedPlayer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 153 | 0.00% |
| Multiplicities Errors | 3 | 38 | 7.89% |
| Invariants Errors | 0 | 4 | 0.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `TeamTraining':
  Object `trainingSession28' of class `TrainingSession' is connected to 2 objects of class `Team'
  at association end `team' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player35' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player36' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 10 | 0.00% |

## Category boundary
```
!new Club('club28')
!club28.name := 'Central Stars FC'
!club28.homeGround := 'Star Field'
!club28.chairman := 'Margaret Faulkner'

!new Team('teamAD')
!teamAD.name := 'Stars Juniors'

!insert (club28, teamAD) into ClubTeam

!new Player('player29')
!player29.name := 'Konstantinos Georgiou'
!player29.age := 29
!player29.bestFoot := #BOTH
!player29.phoneNumber := '+302109876543'

!insert (teamAD, player29) into TeamPlayer

!new Position('position41')
!position41.positionName := #MIDFIELDER

!new Position('position42')
!position42.positionName := #FORWARD

!insert (player29, position41) into PlayerPositions
!insert (player29, position42) into PlayerPositions

!new PlayerNotes('playerNote20')
!playerNote20.note := 'Creative playmaker, excellent vision on the field.'
!playerNote20.date := '2023-01-10'

!new PlayerNotes('playerNote21')
!playerNote21.note := 'Needs improvement on physical endurance.'
!playerNote21.date := '2023-05-05'

!insert (player29, playerNote20) into PlayerPlayerNotes
!insert (player29, playerNote21) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective29')
!trainingObjective29.areaToImprove := 'Tactical awareness'
!trainingObjective29.startDate := '2023-02-01'
!trainingObjective29.endDate := '2023-03-01'
!trainingObjective29.success := true

!new TrainingObjective('trainingObjective30')
!trainingObjective30.areaToImprove := 'Dribbling under pressure'
!trainingObjective30.startDate := '2023-03-02'
!trainingObjective30.endDate := '2023-04-02'
!trainingObjective30.success := false

!insert (trainingObjective29, player29) into TrainingObjectivePlayer
!insert (trainingObjective30, player29) into TrainingObjectivePlayer

!new Competition('competition14')
!competition14.name := 'Regional Friendship Cup'
!competition14.type := 'Friendly'

!new Match('match14')
!match14.date := '2023-08-14'
!match14.homeAway := false

!insert (competition14, match14) into CompetitionMatch

!new Team('teamAE')
!teamAE.name := 'Northern Pirates'

!new Club('club29')
!club29.name := 'Northern Club'
!club29.homeGround := 'Northern Stadium'
!club29.chairman := 'John Smith'

!insert (club29, teamAE) into ClubTeam

!new Player('player30')
!player30.name := 'Victor Sanchez'
!player30.age := 28
!player30.bestFoot := #RIGHT
!player30.phoneNumber := '+341234567890'

!insert (teamAE, player30) into TeamPlayer

!new Position('position43')
!position43.positionName := #DEFENDER

!insert (player30, position43) into PlayerPositions

!new TrainingObjective('trainingObjective31')
!trainingObjective31.areaToImprove := 'Positional Awareness'
!trainingObjective31.startDate := '2023-07-01'
!trainingObjective31.endDate := '2023-08-01'
!trainingObjective31.success := false

!insert (trainingObjective31, player30) into TrainingObjectivePlayer

!new TrainingSession('trainingSession26')
!trainingSession26.date := '2023-08-10'
!trainingSession26.location := 'Northern Stadium Practice Area'
!trainingSession26.purpose := 'Defensive coordination session'

!insert (teamAE, trainingSession26) into TeamTraining

!new TrainingNotes('trainingNote27')
!trainingNote27.note := 'Working on player positioning in defensive scenarios.'
!trainingNote27.date := '2023-08-10'

!insert (trainingSession26, trainingNote27) into TrainingTrainingNotes

!insert (teamAE, match14) into LocalMatch
!insert (teamAD, match14) into VisitorMatch

!new MatchReport('matchReport14')
!matchReport14.duration := 90
!matchReport14.scoreVisitor := 0
!matchReport14.scoreLocal := 0

!insert (match14, matchReport14) into MatchMatchReport

!new MatchPlayer('matchPlayer20')
!matchPlayer20.booked := true
!matchPlayer20.goals := 0
!matchPlayer20.rating := 6

!insert (player29, matchPlayer20) into PlayerMatch
!insert (match14, matchPlayer20) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition21')
!matchPlayerPosition21.positionName := #MIDFIELDER
!matchPlayerPosition21.number := 10

!insert (matchPlayer20, matchPlayerPosition21) into MatchPlayerMatchPlayerPosition

!new TrainingSession('trainingSession25')
!trainingSession25.date := '2023-08-12'
!trainingSession25.location := 'Star Field Annex'
!trainingSession25.purpose := 'Strategic planning for upcoming matches'

!insert (teamAD, trainingSession25) into TeamTraining

!new TrainingNotes('trainingNote26')
!trainingNote26.note := 'Detailed analysis of opponents strategy.'
!trainingNote26.date := '2023-08-12'

!insert (trainingSession25, trainingNote26) into TrainingTrainingNotes
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 103 | 0.00% |
| Multiplicities Errors | 0 | 23 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 13 | 0.00% |

## Category complex
```
!new Club('club39')
!club39.name := 'Paris Saint-Germain F.C.'
!club39.homeGround := 'Parc des Princes'
!club39.chairman := 'Nasser Al-Khelaifi'

!new Club('club40')
!club40.name := 'FC Bayern Munich'
!club40.homeGround := 'Allianz Arena'
!club40.chairman := 'Herbert Hainer'

!new Team('teamAQ')
!teamAQ.name := 'PSG First Team'

!new Team('teamAR')
!teamAR.name := 'Bayern Munich First Team'

!insert (club39, teamAQ) into ClubTeam
!insert (club40, teamAR) into ClubTeam

!new Competition('competition20')
!competition20.name := 'UEFA Champions League'
!competition20.type := 'International Club Tournament'

!new Match('match20')
!match20.date := '2024-02-20'
!match20.homeAway := false

!insert (competition20, match20) into CompetitionMatch

!insert (teamAR, match20) into LocalMatch
!insert (teamAQ, match20) into VisitorMatch

!new MatchReport('matchReport20')
!matchReport20.duration := 95
!matchReport20.scoreVisitor := 2
!matchReport20.scoreLocal := 2

!insert (match20, matchReport20) into MatchMatchReport

!new MatchEvent('matchEvent78')
!matchEvent78.eventType := #GOAL
!matchEvent78.time := 12

!new MatchEvent('matchEvent79')
!matchEvent79.eventType := #GOAL
!matchEvent79.time := 34

!new MatchEvent('matchEvent80')
!matchEvent80.eventType := #GOAL
!matchEvent80.time := 56

!new MatchEvent('matchEvent81')
!matchEvent81.eventType := #GOAL
!matchEvent81.time := 72

!new MatchEvent('matchEvent82')
!matchEvent82.eventType := #FOUL
!matchEvent82.time := 89

!insert (match20, matchEvent78) into MatchMatchEvent
!insert (match20, matchEvent79) into MatchMatchEvent
!insert (match20, matchEvent80) into MatchMatchEvent
!insert (match20, matchEvent81) into MatchMatchEvent
!insert (match20, matchEvent82) into MatchMatchEvent

!new MatchNote('matchNote15')
!matchNote15.note := 'The match featured brilliant individual performances and tactical masterclass from both managers.'
!matchNote15.date := '2024-02-20'

!insert (match20, matchNote15) into MatchMatchNote

!new Player('player43')
!player43.name := 'Kylian Mbappé'
!player43.age := 24
!player43.bestFoot := #RIGHT
!player43.phoneNumber := '+33 6012345678'

!new Player('player44')
!player44.name := 'Joshua Kimmich'
!player44.age := 29
!player44.bestFoot := #BOTH
!player44.phoneNumber := '+49 1712345678'

!insert (teamAQ, player43) into TeamPlayer
!insert (teamAR, player44) into TeamPlayer

!new Position('position62')
!position62.positionName := #FORWARD

!new Position('position63')
!position63.positionName := #MIDFIELDER

!insert (player43, position62) into PlayerPositions
!insert (player44, position63) into PlayerPositions

!new MatchPlayer('matchPlayer27')
!matchPlayer27.booked := false
!matchPlayer27.goals := 1
!matchPlayer27.rating := 8

!insert (player43, matchPlayer27) into PlayerMatch
!insert (match20, matchPlayer27) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition28')
!matchPlayerPosition28.positionName := #FORWARD
!matchPlayerPosition28.number := 7

!insert (matchPlayer27, matchPlayerPosition28) into MatchPlayerMatchPlayerPosition

!new MatchPlayer('matchPlayer28')
!matchPlayer28.booked := true
!matchPlayer28.goals := 0
!matchPlayer28.rating := 7

!insert (player44, matchPlayer28) into PlayerMatch
!insert (match20, matchPlayer28) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition29')
!matchPlayerPosition29.positionName := #MIDFIELDER
!matchPlayerPosition29.number := 6

!insert (matchPlayer28, matchPlayerPosition29) into MatchPlayerMatchPlayerPosition

!new TrainingSession('trainingSession34')
!trainingSession34.date := '2024-02-18'
!trainingSession34.location := 'Camp des Loges'
!trainingSession34.purpose := 'Preparatory Defensive Formations'

!insert (teamAQ, trainingSession34) into TeamTraining

!new TrainingNotes('trainingNote35')
!trainingNote35.note := 'Focused on drills simulating high-pressure situations.'
!trainingNote35.date := '2024-02-17'

!insert (trainingSession34, trainingNote35) into TrainingTrainingNotes

!new TrainingFailedToAttend('failedAttend14')
!failedAttend14.reason := 'Injury - Sprain - Mbappé'

!insert (trainingSession34, failedAttend14) into TrainingFailded
!insert (failedAttend14, player43) into FailedPlayer

!new TrainingSession('trainingSession35')
!trainingSession35.date := '2024-02-15'
!trainingSession35.location := 'Bayern Training Grounds'
!trainingSession35.purpose := 'Tactical Analysis and Recovery'

!insert (teamAR, trainingSession35) into TeamTraining

!new TrainingNotes('trainingNote36')
!trainingNote36.note := 'Strategies focused on fast recovery and adaptability.'
!trainingNote36.date := '2024-02-14'

!insert (trainingSession35, trainingNote36) into TrainingTrainingNotes

!new TrainingObjective('trainingObjective46')
!trainingObjective46.areaToImprove := 'Agility and Recovery Speed'
!trainingObjective46.startDate := '2024-01-01'
!trainingObjective46.endDate := '2024-02-29'
!trainingObjective46.success := true

!insert (trainingObjective46, player44) into TrainingObjectivePlayer

!new TrainingObjective('trainingObjective47')
!trainingObjective47.areaToImprove := 'Dribbling Control'
!trainingObjective47.startDate := '2024-02-01'
!trainingObjective47.endDate := '2024-03-01'
!trainingObjective47.success := true

!insert (trainingObjective47, player43) into TrainingObjectivePlayer

!new PlayerNotes('playerNote30')
!playerNote30.note := 'Demonstrates exceptional pace and tactical versatility in offensive roles.'
!playerNote30.date := '2024-02-15'

!new PlayerNotes('playerNote31')
!playerNote31.note := 'Known for his leadership on the pitch and crucial interceptions.'
!playerNote31.date := '2024-02-16'

!insert (player43, playerNote30) into PlayerPlayerNotes
!insert (player44, playerNote31) into PlayerPlayerNotes
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 132 | 0.00% |
| Multiplicities Errors | 0 | 32 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

## Category edge
```
!new Club('club47')
!set club47.name := 'Desert Scorpions FC'
!set club47.homeGround := 'Sandstorm Arena'
!set club47.chairman := 'Mr. Khalid Alam'

!new Team('teamAY')
!set teamAY.name := 'Scorpion Stingers'

!new Team('teamAZ')
!set teamAZ.name := 'Pyramid Warriors'

!insert (club47, teamAY) into ClubTeam
!insert (club47, teamAZ) into ClubTeam

!new Player('player54')
!set player54.name := 'Rami El-Sayed'
!set player54.age := 28
!set player54.bestFoot := #LEFT
!set player54.phoneNumber := '+442020202020'

!insert (teamAZ, player54) into TeamPlayer

!new Position('position78')
!set position78.positionName := #DEFENDER

!insert (player54, position78) into PlayerPositions

!new TrainingObjective('trainingObjective57')
!set trainingObjective57.areaToImprove := 'Tactical Awareness'
!set trainingObjective57.startDate := '2023-03-01'
!set trainingObjective57.endDate := '2023-05-01'
!set trainingObjective57.success := true

!insert (trainingObjective57, player54) into TrainingObjectivePlayer

!new Competition('competition24')
!set competition24.name := 'Desert Cup Finals'
!set competition24.type := 'Single Elimination'

!new TrainingSession('trainingSession42')
!set trainingSession42.date := '2023-05-15'
!set trainingSession42.location := 'Desert Training Camp'
!set trainingSession42.purpose := 'Mental Fortitude Enhancement'

!new TrainingNotes('trainingNote43')
!set trainingNote43.note := 'Emphasize staying calm under pressure'
!set trainingNote43.date := '2023-05-15'

!new TrainingNotes('trainingNote44')
!set trainingNote44.note := 'Stress management techniques for high-stakes situations'
!set trainingNote44.date := '2023-05-15'

!insert (trainingSession42, trainingNote43) into TrainingTrainingNotes
!insert (trainingSession42, trainingNote44) into TrainingTrainingNotes

!insert (teamAY, trainingSession42) into TeamTraining
!insert (teamAZ, trainingSession42) into TeamTraining

!new Player('player53')
!set player53.name := 'Lina Nassar'
!set player53.age := 22
!set player53.bestFoot := #RIGHT
!set player53.phoneNumber := '+441112223333'

!insert (teamAY, player53) into TeamPlayer

!new PlayerNotes('playerNote37')
!set playerNote37.note := 'Showed exceptional resilience in match situations'
!set playerNote37.date := '2023-04-30'

!insert (player53, playerNote37) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective55')
!set trainingObjective55.areaToImprove := 'Long-range shots'
!set trainingObjective55.startDate := '2023-04-01'
!set trainingObjective55.endDate := '2023-05-01'
!set trainingObjective55.success := true

!new TrainingObjective('trainingObjective56')
!set trainingObjective56.areaToImprove := 'Quick decision-making'
!set trainingObjective56.startDate := '2023-04-15'
!set trainingObjective56.endDate := '2023-05-15'
!set trainingObjective56.success := true

!insert (trainingObjective55, player53) into TrainingObjectivePlayer
!insert (trainingObjective56, player53) into TrainingObjectivePlayer

!new Position('position76')
!set position76.positionName := #MIDFIELDER

!new Position('position77')
!set position77.positionName := #FORWARD

!insert (player53, position76) into PlayerPositions
!insert (player53, position77) into PlayerPositions

!new Match('match24')
!set match24.date := '2023-06-20'
!set match24.homeAway := false

!insert (competition24, match24) into CompetitionMatch

!insert (teamAZ, match24) into LocalMatch
!insert (teamAY, match24) into VisitorMatch

!new MatchReport('matchReport24')
!set matchReport24.duration := 90
!set matchReport24.scoreVisitor := 7
!set matchReport24.scoreLocal := 1

!insert (match24, matchReport24) into MatchMatchReport

!new MatchEvent('matchEvent94')
!set matchEvent94.eventType := #GOAL
!set matchEvent94.time := 7

!new MatchEvent('matchEvent95')
!set matchEvent95.eventType := #GOAL
!set matchEvent95.time := 18

!new MatchEvent('matchEvent96')
!set matchEvent96.eventType := #GOAL
!set matchEvent96.time := 24

!new MatchEvent('matchEvent97')
!set matchEvent97.eventType := #FOUL
!set matchEvent97.time := 30

!new MatchEvent('matchEvent98')
!set matchEvent98.eventType := #GOAL
!set matchEvent98.time := 41

!new MatchEvent('matchEvent99')
!set matchEvent99.eventType := #GOAL
!set matchEvent99.time := 50

!new MatchEvent('matchEvent100')
!set matchEvent100.eventType := #SUBSTITUTION
!set matchEvent100.time := 60

!new MatchEvent('matchEvent101')
!set matchEvent101.eventType := #GOAL
!set matchEvent101.time := 70

!new MatchEvent('matchEvent102')
!set matchEvent102.eventType := #GOAL
!set matchEvent102.time := 83

!new MatchEvent('matchEvent103')
!set matchEvent103.eventType := #GOAL
!set matchEvent103.time := 85

!insert (match24, matchEvent94) into MatchMatchEvent
!insert (match24, matchEvent95) into MatchMatchEvent
!insert (match24, matchEvent96) into MatchMatchEvent
!insert (match24, matchEvent97) into MatchMatchEvent
!insert (match24, matchEvent98) into MatchMatchEvent
!insert (match24, matchEvent99) into MatchMatchEvent
!insert (match24, matchEvent100) into MatchMatchEvent
!insert (match24, matchEvent101) into MatchMatchEvent
!insert (match24, matchEvent102) into MatchMatchEvent
!insert (match24, matchEvent103) into MatchMatchEvent

!new MatchNote('matchNote18')
!set matchNote18.note := 'Dominant performance by the visiting team in a high-intensity showdown'
!set matchNote18.date := '2023-06-20'

!insert (match24, matchNote18) into MatchMatchNote

!new MatchPlayer('matchPlayer33')
!set matchPlayer33.booked := false
!set matchPlayer33.goals := 3
!set matchPlayer33.rating := 9

!insert (player53, matchPlayer33) into PlayerMatch
!insert (match24, matchPlayer33) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition34')
!set matchPlayerPosition34.positionName := #FORWARD
!set matchPlayerPosition34.number := 10

!insert (matchPlayer33, matchPlayerPosition34) into MatchPlayerMatchPlayerPosition
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 1 | 135 | 0.74% |
| Multiplicities Errors | 1 | 33 | 3.03% |
| Invariants Errors | 1 | 4 | 25.00% |

| Syntax Errors | 
|---| 
```
<input>:1:0: generation of expression `#SUBSTITUTION' failed, with following error:
```

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `TeamTraining':
  Object `trainingSession42' of class `TrainingSession' is connected to 2 objects of class `Team'
  at association end `team' but the multiplicity is specified as `1'.
```

| Invariants Errors | 
|---| 
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 0 | 0.00% |

## Category invalid
```
!new Club('club35')
!club35.name := 'Athens Olympians'
!club35.homeGround := 'Olympian Arena'
!club35.chairman := 'Nikos Papadopoulos'

!new Club('club36')
!club36.name := 'Barcelona Pirates'
!club36.homeGround := 'Pirate Cove Stadium'
!club36.chairman := 'Carla Martinez'

!new Club('club37')
!club37.name := 'Naples Scorpions'
!club37.homeGround := 'Scorpion Pit'
!club37.chairman := 'Giovanni Russo'

!new Team('teamAL')
!teamAL.name := 'Athens Titans'

!new Team('teamAM')
!teamAM.name := 'Barcelona Buccaneers'

!new Team('teamAN')
!teamAN.name := 'Naples Stingers'

!insert (club35, teamAL) into ClubTeam
!insert (club36, teamAM) into ClubTeam
!insert (club37, teamAN) into ClubTeam

!new Player('player39')
!player39.name := 'Dimitrios Georgiou'
!player39.age := 27
!player39.bestFoot := #LEFT
!player39.phoneNumber := '+302101234567'

!insert (teamAL, player39) into TeamPlayer

!new Player('player40')
!player40.name := 'Miguel Santos'
!player40.age := 23
!player40.bestFoot := #BOTH
!player40.phoneNumber := '+34791765432'

!insert (teamAM, player40) into TeamPlayer

!new Position('position56')
!position56.positionName := #GOALKEEPER

!new Position('position57')
!position57.positionName := #FORWARD

!new Position('position58')
!position58.positionName := #DEFENDER

!insert (player39, position56) into PlayerPositions
!insert (player40, position57) into PlayerPositions
!insert (player40, position58) into PlayerPositions

!new Competition('competition18')
!competition18.name := 'Mediterranean Championship'
!competition18.type := 'League'

!new Match('match18')
!match18.date := '2023-08-14'
!match18.homeAway := false

!insert (competition18, match18) into CompetitionMatch

!insert (teamAM, match18) into LocalMatch
!insert (teamAM, match18) into VisitorMatch

!new MatchReport('matchReport18')
!matchReport18.duration := 90
!matchReport18.scoreVisitor := 3
!matchReport18.scoreLocal := 3

!insert (match18, matchReport18) into MatchMatchReport

!new MatchEvent('matchEvent66')
!matchEvent66.eventType := #FOUL
!matchEvent66.time := 10

!new MatchEvent('matchEvent67')
!matchEvent67.eventType := #FOUL
!matchEvent67.time := 55

!insert (match18, matchEvent66) into MatchMatchEvent
!insert (match18, matchEvent67) into MatchMatchEvent

!new MatchNote('matchNote13')
!matchNote13.note := 'Historic rematch awaited with great anticipation, crowd erupted with excitement.'
!matchNote13.date := '2023-08-15'

!insert (match18, matchNote13) into MatchMatchNote

!new TrainingSession('trainingSession31')
!trainingSession31.date := '2023-06-20'
!trainingSession31.location := 'Olympian Arena Training Grounds'
!trainingSession31.purpose := 'Advance team strategic development'

!insert (teamAL, trainingSession31) into TeamTraining

!new TrainingSession('trainingSession32')
!trainingSession32.date := '2023-06-25'
!trainingSession32.location := 'Pirate Cove Practice Facility'
!trainingSession32.purpose := 'Foster adaptable play styles across roles'

!insert (teamAM, trainingSession32) into TeamTraining

!new TrainingNotes('trainingNote32')
!trainingNote32.note := 'Encourage cross-position competency.'
!trainingNote32.date := '2023-06-26'

!insert (trainingSession32, trainingNote32) into TrainingTrainingNotes

!new TrainingFailedToAttend('failedAttend12')
!failedAttend12.reason := 'Injury recuperation'

!insert (trainingSession31, failedAttend12) into TrainingFailded
!insert (failedAttend12, player39) into FailedPlayer

!new TrainingObjective('trainingObjective42')
!trainingObjective42.areaToImprove := 'Cross-field vision'
!trainingObjective42.startDate := '2023-04-01'
!trainingObjective42.endDate := '2023-09-01'
!trainingObjective42.success := true

!insert (trainingObjective42, player40) into TrainingObjectivePlayer

!new PlayerNotes('playerNote28')
!playerNote28.note := 'Scheduled for return post recovery; monitor fitness levels closely.'
!playerNote28.date := '2023-05-15'

!insert (player39, playerNote28) into PlayerPlayerNotes

!new MatchPlayer('matchPlayer25')
!matchPlayer25.booked := false
!matchPlayer25.goals := 2
!matchPlayer25.rating := 8

!insert (player40, matchPlayer25) into PlayerMatch
!insert (match18, matchPlayer25) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition26')
!matchPlayerPosition26.positionName := #FORWARD
!matchPlayerPosition26.number := 9

!insert (matchPlayer25, matchPlayerPosition26) into MatchPlayerMatchPlayerPosition
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 4 | 25 | 16.00% |
| Invariants Errors (Not included on General) | 3 | 4 | 75.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamAN' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamAN' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player39' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession31' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 8 | 0.00% |

## Generation 4 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 1 | 629 | 0.16% |
| Multiplicities Errors | 4 | 126 | 3.17% |
| Invariants Errors | 1 | 16 | 6.25% |

| Syntax Errors | 
|---| 
```
<input>:1:0: generation of expression `#SUBSTITUTION' failed, with following error:
```

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `TeamTraining':
  Object `trainingSession28' of class `TrainingSession' is connected to 2 objects of class `Team'
  at association end `team' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player35' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player36' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `trainingSession42' of class `TrainingSession' is connected to 2 objects of class `Team'
  at association end `team' but the multiplicity is specified as `1'.
```

| Invariants Errors | 
|---| 
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 4 | 25 | 16.00% |
| Invariants Errors (Not included on General) | 3 | 4 | 75.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamAN' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamAN' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player39' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession31' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 43 | 0.00% |

# Generation 5
## Category baseline
```
!new Club('club41')
!club41.name := 'Riyadh Royals'
!club41.homeGround := 'King Fahd Stadium'
!club41.chairman := 'Khalid Al-Mansoor'

!new Team('teamAS')
!teamAS.name := 'Riyadh Falcons'

!insert (club41, teamAS) into ClubTeam

!new Player('player47')
!player47.name := 'Salim Al-Farsi'
!player47.age := 30
!player47.bestFoot := #RIGHT
!player47.phoneNumber := '+966-55-1234567'

!new Player('player48')
!player48.name := 'Yusuf Arif'
!player48.age := 27
!player48.bestFoot := #LEFT
!player48.phoneNumber := '+966-55-7654321'

!insert (teamAS, player47) into TeamPlayer
!insert (teamAS, player48) into TeamPlayer

!new Position('position67')
!position67.positionName := #MIDFIELDER

!new Position('position68')
!position68.positionName := #DEFENDER

!insert (player47, position67) into PlayerPositions
!insert (player48, position68) into PlayerPositions

!new TrainingObjective('trainingObjective51')
!trainingObjective51.areaToImprove := 'Passing Accuracy'
!trainingObjective51.startDate := '2023-03-01'
!trainingObjective51.endDate := '2023-05-01'
!trainingObjective51.success := true

!insert (trainingObjective51, player47) into TrainingObjectivePlayer

!new TrainingObjective('trainingObjective49')
!trainingObjective49.areaToImprove := 'Stamina'
!trainingObjective49.startDate := '2023-03-01'
!trainingObjective49.endDate := '2023-05-01'
!trainingObjective49.success := true

!insert (trainingObjective49, player48) into TrainingObjectivePlayer

!new TrainingSession('trainingSession37')
!trainingSession37.date := '2023-03-10'
!trainingSession37.location := 'Royals Training Ground'
!trainingSession37.purpose := 'Midfield Coordination'

!insert (teamAS, trainingSession37) into TeamTraining

!new TrainingNotes('trainingNote38')
!trainingNote38.note := 'Emphasized on quick playmaking and transitions.'
!trainingNote38.date := '2023-03-10'

!insert (trainingSession37, trainingNote38) into TrainingTrainingNotes

!new Competition('competition21')
!competition21.name := 'Middle Eastern Super Cup'
!competition21.type := 'Regional Championship'

!new Match('match21')
!match21.date := '2023-05-22'
!match21.homeAway := false

!insert (competition21, match21) into CompetitionMatch

!insert (teamAS, match21) into VisitorMatch

!new Team('teamAT')
!teamAT.name := 'Doha Dragons'

!new Club('club42')
!club42.name := 'Doha Football Club'
!club42.homeGround := 'Doha Stadium'
!club42.chairman := 'Amir Khan'

!insert (club42, teamAT) into ClubTeam

!insert (teamAT, match21) into LocalMatch

!new MatchReport('matchReport21')
!matchReport21.duration := 90
!matchReport21.scoreVisitor := 2
!matchReport21.scoreLocal := 2

!insert (match21, matchReport21) into MatchMatchReport

!new MatchEvent('matchEvent83')
!matchEvent83.eventType := #GOAL
!matchEvent83.time := 18

!new MatchEvent('matchEvent84')
!matchEvent84.eventType := #FOUL
!matchEvent84.time := 25

!new MatchEvent('matchEvent85')
!matchEvent85.eventType := #GOAL
!matchEvent85.time := 42

!new MatchEvent('matchEvent86')
!matchEvent86.eventType := #GOAL
!matchEvent86.time := 58

!new MatchEvent('matchEvent87')
!matchEvent87.eventType := #FOUL
!matchEvent87.time := 67

!new MatchEvent('matchEvent88')
!matchEvent88.eventType := #GOAL
!matchEvent88.time := 77

!insert (match21, matchEvent83) into MatchMatchEvent
!insert (match21, matchEvent84) into MatchMatchEvent
!insert (match21, matchEvent85) into MatchMatchEvent
!insert (match21, matchEvent86) into MatchMatchEvent
!insert (match21, matchEvent87) into MatchMatchEvent
!insert (match21, matchEvent88) into MatchMatchEvent

!new MatchNote('matchNote16')
!matchNote16.note := 'The match was a thrilling tie with strategic plays from both teams.'
!matchNote16.date := '2023-05-22'

!insert (match21, matchNote16) into MatchMatchNote

!new MatchPlayer('matchPlayer29')
!matchPlayer29.booked := false
!matchPlayer29.goals := 1
!matchPlayer29.rating := 8

!insert (player47, matchPlayer29) into PlayerMatch
!insert (match21, matchPlayer29) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition30')
!matchPlayerPosition30.positionName := #MIDFIELDER
!matchPlayerPosition30.number := 10

!insert (matchPlayer29, matchPlayerPosition30) into MatchPlayerMatchPlayerPosition

!new MatchPlayer('matchPlayer30')
!matchPlayer30.booked := true
!matchPlayer30.goals := 0
!matchPlayer30.rating := 7

!insert (player48, matchPlayer30) into PlayerMatch
!insert (match21, matchPlayer30) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition31')
!matchPlayerPosition31.positionName := #DEFENDER
!matchPlayerPosition31.number := 3

!insert (matchPlayer30, matchPlayerPosition31) into MatchPlayerMatchPlayerPosition

!new Player('player45')
!player45.name := 'Ahmed Zahir'
!player45.age := 25
!player45.bestFoot := #RIGHT
!player45.phoneNumber := '+974-44-567890'

!new Player('player46')
!player46.name := 'Leila Nassif'
!player46.age := 28
!player46.bestFoot := #LEFT
!player46.phoneNumber := '+974-44-098765'

!insert (teamAT, player45) into TeamPlayer
!insert (teamAT, player46) into TeamPlayer

!new Position('position64')
!position64.positionName := #MIDFIELDER

!new Position('position65')
!position65.positionName := #FORWARD

!new Position('position66')
!position66.positionName := #GOALKEEPER

!insert (player45, position64) into PlayerPositions
!insert (player45, position65) into PlayerPositions
!insert (player46, position66) into PlayerPositions

!new PlayerNotes('playerNote32')
!playerNote32.note := 'Tactical genius known for assisting and creating goal opportunities.'
!playerNote32.date := '2023-05-01'

!insert (player45, playerNote32) into PlayerPlayerNotes

!new PlayerNotes('playerNote33')
!playerNote33.note := 'Renowned for her steadfast presence and saves under pressure.'
!playerNote33.date := '2023-04-20'

!insert (player46, playerNote33) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective48')
!trainingObjective48.areaToImprove := 'Dribbling'
!trainingObjective48.startDate := '2023-04-01'
!trainingObjective48.endDate := '2023-06-01'
!trainingObjective48.success := true

!insert (trainingObjective48, player45) into TrainingObjectivePlayer

!new TrainingObjective('trainingObjective50')
!trainingObjective50.areaToImprove := 'Reflexes'
!trainingObjective50.startDate := '2023-03-01'
!trainingObjective50.endDate := '2023-05-01'
!trainingObjective50.success := false

!insert (trainingObjective50, player46) into TrainingObjectivePlayer

!new TrainingSession('trainingSession36')
!trainingSession36.date := '2023-04-15'
!trainingSession36.location := 'Doha Football Academy'
!trainingSession36.purpose := 'Advanced Defensive Tactics'

!insert (teamAT, trainingSession36) into TeamTraining

!new TrainingNotes('trainingNote37')
!trainingNote37.note := 'Emphasized mastering defensive formations and counter-attack responses.'
!trainingNote37.date := '2023-04-15'

!insert (trainingSession36, trainingNote37) into TrainingTrainingNotes

!new TrainingFailedToAttend('failedAttend15')
!failedAttend15.reason := 'Injury'

!insert (trainingSession36, failedAttend15) into TrainingFailded
!insert (failedAttend15, player46) into FailedPlayer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 169 | 0.00% |
| Multiplicities Errors | 0 | 40 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 16 | 0.00% |

## Category boundary
```
!new Club('club33')
!club33.name := 'Eastern Dragons FC'
!club33.homeGround := 'Dragon Den'
!club33.chairman := 'Hiroshi Tanaka'

!new Team('teamAJ')
!teamAJ.name := 'Dragons Primary'

!insert (club33, teamAJ) into ClubTeam

!new Player('player37')
!player37.name := 'Amelia Brighton'
!player37.age := 27
!player37.bestFoot := #RIGHT
!player37.phoneNumber := '+61730001010'

!insert (teamAJ, player37) into TeamPlayer

!new Position('position52')
!position52.positionName := #GOALKEEPER

!new Position('position53')
!position53.positionName := #MIDFIELDER

!new Position('position54')
!position54.positionName := #FORWARD

!insert (player37, position52) into PlayerPositions
!insert (player37, position53) into PlayerPositions
!insert (player37, position54) into PlayerPositions

!new PlayerNotes('playerNote25')
!playerNote25.note := 'Exceptional footwork and versatility in positions.'
!playerNote25.date := '2023-06-15'

!new PlayerNotes('playerNote26')
!playerNote26.note := 'Recommended for leadership roles on the field.'
!playerNote26.date := '2023-06-30'

!new PlayerNotes('playerNote27')
!playerNote27.note := 'Needs to develop defensive skills.'
!playerNote27.date := '2023-07-01'

!insert (player37, playerNote25) into PlayerPlayerNotes
!insert (player37, playerNote26) into PlayerPlayerNotes
!insert (player37, playerNote27) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective38')
!trainingObjective38.areaToImprove := 'Passing accuracy'
!trainingObjective38.startDate := '2023-05-01'
!trainingObjective38.endDate := '2023-06-01'
!trainingObjective38.success := true

!new TrainingObjective('trainingObjective39')
!trainingObjective39.areaToImprove := 'Shooting technique'
!trainingObjective39.startDate := '2023-06-02'
!trainingObjective39.endDate := '2023-07-02'
!trainingObjective39.success := false

!new TrainingObjective('trainingObjective40')
!trainingObjective40.areaToImprove := 'Endurance under fatigue'
!trainingObjective40.startDate := '2023-07-03'
!trainingObjective40.endDate := '2023-08-03'
!trainingObjective40.success := true

!insert (trainingObjective38, player37) into TrainingObjectivePlayer
!insert (trainingObjective39, player37) into TrainingObjectivePlayer
!insert (trainingObjective40, player37) into TrainingObjectivePlayer

!new Competition('competition17')
!competition17.name := 'Summer Invitational'
!competition17.type := 'Exhibition'

!new Match('match17')
!match17.date := '2023-09-10'
!match17.homeAway := true

!insert (competition17, match17) into CompetitionMatch

!insert (teamAJ, match17) into LocalMatch

!new Team('teamAK')
!teamAK.name := 'Western Wolves'

!new Club('club34')
!club34.name := 'Wolves United'
!club34.homeGround := 'Wolf Arena'
!club34.chairman := 'Liam Howl'

!insert (club34, teamAK) into ClubTeam

!new Player('player38')
!player38.name := 'Jordan Chase'
!player38.age := 28
!player38.bestFoot := #LEFT
!player38.phoneNumber := '+61740002222'

!insert (teamAK, player38) into TeamPlayer

!new Position('position55')
!position55.positionName := #DEFENDER

!insert (player38, position55) into PlayerPositions

!new TrainingObjective('trainingObjective41')
!trainingObjective41.areaToImprove := 'Tactical Defense'
!trainingObjective41.startDate := '2023-04-01'
!trainingObjective41.endDate := '2023-04-30'
!trainingObjective41.success := false

!insert (trainingObjective41, player38) into TrainingObjectivePlayer

!new TrainingSession('trainingSession30')
!trainingSession30.date := '2023-08-20'
!trainingSession30.location := 'Wolf Arena Training Grounds'
!trainingSession30.purpose := 'Defensive Formations'

!insert (teamAK, trainingSession30) into TeamTraining

!insert (teamAK, match17) into VisitorMatch

!new MatchReport('matchReport17')
!matchReport17.duration := 90
!matchReport17.scoreVisitor := 0
!matchReport17.scoreLocal := 0

!insert (match17, matchReport17) into MatchMatchReport

!new MatchPlayer('matchPlayer24')
!matchPlayer24.booked := false
!matchPlayer24.goals := 0
!matchPlayer24.rating := 7

!insert (player37, matchPlayer24) into PlayerMatch
!insert (match17, matchPlayer24) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition25')
!matchPlayerPosition25.positionName := #MIDFIELDER
!matchPlayerPosition25.number := 6

!insert (matchPlayer24, matchPlayerPosition25) into MatchPlayerMatchPlayerPosition

!new TrainingSession('trainingSession29')
!trainingSession29.date := '2023-09-08'
!trainingSession29.location := 'Dragon Den Training Facility'
!trainingSession29.purpose := 'Focus on team cohesion'

!insert (teamAJ, trainingSession29) into TeamTraining

!new TrainingNotes('trainingNote31')
!trainingNote31.note := 'Worked on team dynamics, practice drills emphasizing speed.'
!trainingNote31.date := '2023-09-08'

!insert (trainingSession29, trainingNote31) into TrainingTrainingNotes
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 112 | 0.00% |
| Multiplicities Errors | 1 | 25 | 4.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession30' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 15 | 0.00% |

## Category complex
```
!new Club('club56')
!set club56.name := 'Ajax Amsterdam'
!set club56.homeGround := 'Johan Cruyff Arena'
!set club56.chairman := 'Frank Eikelboom'

!new Club('club57')
!set club57.name := 'PSV Eindhoven'
!set club57.homeGround := 'Philips Stadion'
!set club57.chairman := 'Jan Albers'

!new Team('teamBH')
!set teamBH.name := 'Ajax Main Squad'

!new Team('teamBI')
!set teamBI.name := 'PSV Main Squad'

!insert (club56, teamBH) into ClubTeam
!insert (club57, teamBI) into ClubTeam

!new Competition('competition28')
!set competition28.name := 'Eredivisie'
!set competition28.type := 'Dutch National League'

!new Match('match28')
!set match28.date := '2024-03-01'
!set match28.homeAway := true

!insert (competition28, match28) into CompetitionMatch

!insert (teamBH, match28) into LocalMatch
!insert (teamBI, match28) into VisitorMatch

!new MatchReport('matchReport28')
!set matchReport28.duration := 92
!set matchReport28.scoreVisitor := 1
!set matchReport28.scoreLocal := 3

!insert (match28, matchReport28) into MatchMatchReport

!new Player('player63')
!set player63.name := 'Dusan Tadic'
!set player63.age := 35
!set player63.bestFoot := #LEFT
!set player63.phoneNumber := '+31 6123456789'

!new Player('player64')
!set player64.name := 'Cody Gakpo'
!set player64.age := 24
!set player64.bestFoot := #RIGHT
!set player64.phoneNumber := '+31 6145678901'

!insert (teamBH, player63) into TeamPlayer
!insert (teamBI, player64) into TeamPlayer

!new Position('position89')
!set position89.positionName := #ATTACKING_MIDFIELDER

!new Position('position90')
!set position90.positionName := #WING

!insert (player63, position89) into PlayerPositions
!insert (player64, position90) into PlayerPositions

!new MatchEvent('matchEvent118')
!set matchEvent118.eventType := #GOAL
!set matchEvent118.time := 17

!new MatchEvent('matchEvent119')
!set matchEvent119.eventType := #GOAL
!set matchEvent119.time := 48

!new MatchEvent('matchEvent120')
!set matchEvent120.eventType := #GOAL
!set matchEvent120.time := 81

!new MatchEvent('matchEvent121')
!set matchEvent121.eventType := #GOAL
!set matchEvent121.time := 88

!insert (match28, matchEvent118) into MatchMatchEvent
!insert (match28, matchEvent119) into MatchMatchEvent
!insert (match28, matchEvent120) into MatchMatchEvent
!insert (match28, matchEvent121) into MatchMatchEvent

!new MatchPlayer('matchPlayer38')
!set matchPlayer38.booked := true
!set matchPlayer38.goals := 2
!set matchPlayer38.rating := 8

!insert (player63, matchPlayer38) into PlayerMatch
!insert (match28, matchPlayer38) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition39')
!set matchPlayerPosition39.positionName := #ATTACKING_MIDFIELDER
!set matchPlayerPosition39.number := 10

!insert (matchPlayer38, matchPlayerPosition39) into MatchPlayerMatchPlayerPosition

!new MatchPlayer('matchPlayer39')
!set matchPlayer39.booked := false
!set matchPlayer39.goals := 1
!set matchPlayer39.rating := 7

!insert (player64, matchPlayer39) into PlayerMatch
!insert (match28, matchPlayer39) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition40')
!set matchPlayerPosition40.positionName := #WING
!set matchPlayerPosition40.number := 11

!insert (matchPlayer39, matchPlayerPosition40) into MatchPlayerMatchPlayerPosition

!new MatchNote('matchNote22')
!set matchNote22.note := 'Ajax displayed superior tactical acumen, capitalizing on key opportunities.'
!set matchNote22.date := '2024-03-01'

!insert (match28, matchNote22) into MatchMatchNote

!new TrainingSession('trainingSession49')
!set trainingSession49.date := '2024-02-27'
!set trainingSession49.location := 'De Toekomst'
!set trainingSession49.purpose := 'Tactical Drills and Set Pieces'

!insert (teamBH, trainingSession49) into TeamTraining

!new TrainingNotes('trainingNote52')
!set trainingNote52.note := 'Included an intensive review of defensive scenarios.'
!set trainingNote52.date := '2024-02-26'

!insert (trainingSession49, trainingNote52) into TrainingTrainingNotes

!new TrainingFailedToAttend('failedAttend19')
!set failedAttend19.reason := 'Personal Leave - Tadic'

!insert (trainingSession49, failedAttend19) into TrainingFailded
!insert (failedAttend19, player63) into FailedPlayer

!new TrainingObjective('trainingObjective66')
!set trainingObjective66.areaToImprove := 'Crossing Accuracy'
!set trainingObjective66.startDate := '2024-02-10'
!set trainingObjective66.endDate := '2024-03-30'
!set trainingObjective66.success := false

!insert (trainingObjective66, player64) into TrainingObjectivePlayer

!new TrainingObjective('trainingObjective67')
!set trainingObjective67.areaToImprove := 'Leadership Skills'
!set trainingObjective67.startDate := '2024-02-01'
!set trainingObjective67.endDate := '2024-03-01'
!set trainingObjective67.success := true

!insert (trainingObjective67, player63) into TrainingObjectivePlayer

!new PlayerNotes('playerNote42')
!set playerNote42.note := 'Despite being booked, led the team with precise passes and leadership on the field.'
!set playerNote42.date := '2024-02-28'

!new PlayerNotes('playerNote43')
!set playerNote43.note := 'Notable speed and control on the wing, though needs to improve crossing accuracy.'
!set playerNote43.date := '2024-03-01'

!insert (player63, playerNote42) into PlayerPlayerNotes
!insert (player64, playerNote43) into PlayerPlayerNotes
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 7 | 119 | 5.88% |
| Multiplicities Errors | 1 | 29 | 3.45% |
| Invariants Errors | 0 | 4 | 0.00% |

| Syntax Errors | 
|---| 
```
<input>:1:0: generation of expression `#ATTACKING_MIDFIELDER' failed, with following error:
```
```
<input>:1:32: Undefined enumeration literal `ATTACKING_MIDFIELDER'.
```
```
<input>:1:0: generation of expression `#WING' failed, with following error:
```
```
<input>:1:32: Undefined enumeration literal `WING'.
```
```
<input>:1:0: generation of expression `#ATTACKING_MIDFIELDER' failed, with following error:
```
```
<input>:1:43: Undefined enumeration literal `ATTACKING_MIDFIELDER'.
```
```
<input>:1:0: generation of expression `#WING' failed, with following error:
```

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamBI' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 0 | 0.00% |

## Category edge
```
!new Club('club54')
!set club54.name := 'Sprouting Seeds FC'
!set club54.homeGround := 'Youth Development Park'
!set club54.chairman := 'Ms. Harriet Gardener'

!new Team('teamBF')
!set teamBF.name := 'Seeds Youngsters'

!new Team('teamBG')
!set teamBG.name := 'Budding Stars'

!insert (club54, teamBF) into ClubTeam

!new Club('club55')
!set club55.name := 'Youth Pioneers'
!set club55.homeGround := 'Pioneers Arena'
!set club55.chairman := 'Mr. John Evergreen'

!insert (club55, teamBG) into ClubTeam

!new Player('player62')
!set player62.name := 'Emma Blossom'
!set player62.age := 17
!set player62.bestFoot := #RIGHT
!set player62.phoneNumber := '+447812345678'

!insert (teamBG, player62) into TeamPlayer

!new Position('position88')
!set position88.positionName := #MIDFIELDER

!insert (player62, position88) into PlayerPositions

!new TrainingObjective('trainingObjective65')
!set trainingObjective65.areaToImprove := 'Game Vision'
!set trainingObjective65.startDate := '2023-02-01'
!set trainingObjective65.endDate := '2023-04-01'
!set trainingObjective65.success := true

!insert (trainingObjective65, player62) into TrainingObjectivePlayer

!new TrainingSession('trainingSession48')
!set trainingSession48.date := '2023-03-25'
!set trainingSession48.location := 'Pioneers Training Field'
!set trainingSession48.purpose := 'Enhanced Ball Control Skills'

!new TrainingNotes('trainingNote51')
!set trainingNote51.note := 'Focus on ball control routines and vision exercises'
!set trainingNote51.date := '2023-03-25'

!insert (trainingSession48, trainingNote51) into TrainingTrainingNotes

!insert (teamBG, trainingSession48) into TeamTraining

!new Competition('competition27')
!set competition27.name := 'Local Youth League'
!set competition27.type := 'Youth Development'

!new TrainingSession('trainingSession47')
!set trainingSession47.date := '2023-04-01'
!set trainingSession47.location := 'Youth Academy Grounds'
!set trainingSession47.purpose := 'Foundation Skills Enhancement'

!new TrainingNotes('trainingNote49')
!set trainingNote49.note := 'Introduce basic tactical awareness'
!set trainingNote49.date := '2023-04-01'

!new TrainingNotes('trainingNote50')
!set trainingNote50.note := 'Emphasize teamwork and coordination'
!set trainingNote50.date := '2023-04-01'

!insert (trainingSession47, trainingNote49) into TrainingTrainingNotes
!insert (trainingSession47, trainingNote50) into TrainingTrainingNotes

!insert (teamBF, trainingSession47) into TeamTraining

!new Player('player61')
!set player61.name := 'Tommy Sprout'
!set player61.age := 16
!set player61.bestFoot := #LEFT
!set player61.phoneNumber := '+447899001122'

!insert (teamBF, player61) into TeamPlayer

!new PlayerNotes('playerNote41')
!set playerNote41.note := 'Promising defensive talent with excellent spatial awareness'
!set playerNote41.date := '2023-03-15'

!insert (player61, playerNote41) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective63')
!set trainingObjective63.areaToImprove := 'Basic dribbling skills'
!set trainingObjective63.startDate := '2023-03-01'
!set trainingObjective63.endDate := '2023-04-01'
!set trainingObjective63.success := true

!new TrainingObjective('trainingObjective64')
!set trainingObjective64.areaToImprove := 'Passing accuracy'
!set trainingObjective64.startDate := '2023-03-15'
!set trainingObjective64.endDate := '2023-04-15'
!set trainingObjective64.success := true

!insert (trainingObjective63, player61) into TrainingObjectivePlayer
!insert (trainingObjective64, player61) into TrainingObjectivePlayer

!new Position('position86')
!set position86.positionName := #DEFENDER

!new Position('position87')
!set position87.positionName := #MIDFIELDER

!insert (player61, position86) into PlayerPositions
!insert (player61, position87) into PlayerPositions

!new Match('match27')
!set match27.date := '2023-05-15'
!set match27.homeAway := true

!insert (competition27, match27) into CompetitionMatch

!insert (teamBF, match27) into LocalMatch
!insert (teamBG, match27) into VisitorMatch

!new MatchReport('matchReport27')
!set matchReport27.duration := 90
!set matchReport27.scoreVisitor := 0
!set matchReport27.scoreLocal := 0

!insert (match27, matchReport27) into MatchMatchReport

!new MatchEvent('matchEvent113')
!set matchEvent113.eventType := #FOUL
!set matchEvent113.time := 15

!new MatchEvent('matchEvent114')
!set matchEvent114.eventType := #SUBSTITUTION
!set matchEvent114.time := 45

!new MatchEvent('matchEvent115')
!set matchEvent115.eventType := #FOUL
!set matchEvent115.time := 70

!new MatchEvent('matchEvent116')
!set matchEvent116.eventType := #SUBSTITUTION
!set matchEvent116.time := 80

!new MatchEvent('matchEvent117')
!set matchEvent117.eventType := #CAUTION
!set matchEvent117.time := 85

!insert (match27, matchEvent113) into MatchMatchEvent
!insert (match27, matchEvent114) into MatchMatchEvent
!insert (match27, matchEvent115) into MatchMatchEvent
!insert (match27, matchEvent116) into MatchMatchEvent
!insert (match27, matchEvent117) into MatchMatchEvent

!new MatchNote('matchNote21')
!set matchNote21.note := 'Strong defensive showing from both sides, reflecting training improvements'
!set matchNote21.date := '2023-05-15'

!insert (match27, matchNote21) into MatchMatchNote

!new MatchPlayer('matchPlayer37')
!set matchPlayer37.booked := true
!set matchPlayer37.goals := 0
!set matchPlayer37.rating := 8

!insert (player61, matchPlayer37) into PlayerMatch
!insert (match27, matchPlayer37) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition38')
!set matchPlayerPosition38.positionName := #DEFENDER
!set matchPlayerPosition38.number := 3

!insert (matchPlayer37, matchPlayerPosition38) into MatchPlayerMatchPlayerPosition
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 5 | 127 | 3.94% |
| Multiplicities Errors | 0 | 29 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Syntax Errors | 
|---| 
```
<input>:1:0: generation of expression `#SUBSTITUTION' failed, with following error:
```
```
<input>:1:32: Undefined enumeration literal `SUBSTITUTION'.
```
```
<input>:1:0: generation of expression `#SUBSTITUTION' failed, with following error:
```
```
<input>:1:32: Undefined enumeration literal `SUBSTITUTION'.
```
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 0 | 0.00% |

## Category invalid
```
!new Club('club45')
!set club45.name := 'Sydney Surfers'
!set club45.homeGround := "Surfer's Stadium"
!set club45.chairman := 'Leah Murray'

!new Club('club46')
!set club46.name := 'Auckland Mariners'
!set club46.homeGround := "Mariner's Grounds"
!set club46.chairman := 'Jack Thompson'

!new Team('teamAW')
!set teamAW.name := 'Surf Sydney'

!new Team('teamAX')
!set teamAX.name := 'Auckland Waves'

!insert (club45, teamAW) into ClubTeam
!insert (club46, teamAX) into ClubTeam

!new Player('player51')
!set player51.name := 'Jake Wilson'
!set player51.age := 24
!set player51.bestFoot := #RIGHT
!set player51.phoneNumber := '+61412345678'

!new Player('player52')
!set player52.name := 'Tane Ngata'
!set player52.age := 26
!set player52.bestFoot := #BOTH
!set player52.phoneNumber := '+64987654321'

!insert (teamAW, player51) into TeamPlayer
!insert (teamAX, player52) into TeamPlayer

!new Position('position72')
!set position72.positionName := #GOALKEEPER

!new Position('position73')
!set position73.positionName := #DEFENDER

!new Position('position74')
!set position74.positionName := #MIDFIELDER

!new Position('position75')
!set position75.positionName := #FORWARD

!insert (player51, position72) into PlayerPositions
!insert (player51, position73) into PlayerPositions
!insert (player52, position74) into PlayerPositions
!insert (player52, position75) into PlayerPositions

!new Competition('competition23')
!set competition23.name := 'Pacific Cup'
!set competition23.type := 'Cup'

!new Match('match23')
!set match23.date := '2023-11-05'
!set match23.homeAway := true

!insert (competition23, match23) into CompetitionMatch

!insert (teamAX, match23) into LocalMatch
!insert (teamAX, match23) into VisitorMatch

!new MatchReport('matchReport23')
!set matchReport23.duration := 90
!set matchReport23.scoreVisitor := 2
!set matchReport23.scoreLocal := 2

!insert (match23, matchReport23) into MatchMatchReport

!new MatchEvent('matchEvent92')
!set matchEvent92.eventType := #FOUL
!set matchEvent92.time := 30

!new MatchEvent('matchEvent93')
!set matchEvent93.eventType := #FOUL
!set matchEvent93.time := 75

!insert (match23, matchEvent92) into MatchMatchEvent
!insert (match23, matchEvent93) into MatchMatchEvent

!new MatchNote('matchNote17')
!set matchNote17.note := 'A friendly yet fiercely contested match, showcasing skills and camaraderie.'
!set matchNote17.date := '2023-11-06'

!insert (match23, matchNote17) into MatchMatchNote

!new TrainingSession('trainingSession40')
!set trainingSession40.date := '2023-09-15'
!set trainingSession40.location := "Surfer's Stadium Practice Area"
!set trainingSession40.purpose := 'Enhance passing accuracy and interception skills'

!insert (teamAW, trainingSession40) into TeamTraining

!new TrainingSession('trainingSession41')
!set trainingSession41.date := '2023-09-20'
!set trainingSession41.location := "Mariner's Grounds Training Fields"
!set trainingSession41.purpose := 'Improving response times and saving techniques'

!insert (teamAX, trainingSession41) into TeamTraining

!new TrainingNotes('trainingNote42')
!set trainingNote42.note := 'Focus on high-pressure scenarios and penalty saves.'
!set trainingNote42.date := '2023-09-21'

!insert (trainingSession41, trainingNote42) into TrainingTrainingNotes

!new TrainingFailedToAttend('failedAttend16')
!set failedAttend16.reason := 'Personal reasons.'

!insert (trainingSession40, failedAttend16) into TrainingFailded
!insert (failedAttend16, player51) into FailedPlayer

!new TrainingObjective('trainingObjective54')
!set trainingObjective54.areaToImprove := 'Consistent Performance'
!set trainingObjective54.startDate := '2023-07-01'
!set trainingObjective54.endDate := '2023-12-01'
!set trainingObjective54.success := false

!insert (trainingObjective54, player52) into TrainingObjectivePlayer

!new PlayerNotes('playerNote36')
!set playerNote36.note := 'Requires boost in confidence following recent performances.'
!set playerNote36.date := '2023-08-10'

!insert (player51, playerNote36) into PlayerPlayerNotes

!new MatchPlayer('matchPlayer32')
!set matchPlayer32.booked := true
!set matchPlayer32.goals := 1
!set matchPlayer32.rating := 7

!insert (player52, matchPlayer32) into PlayerMatch
!insert (match23, matchPlayer32) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition33')
!set matchPlayerPosition33.positionName := #FORWARD
!set matchPlayerPosition33.number := 11

!insert (matchPlayer32, matchPlayerPosition33) into MatchPlayerMatchPlayerPosition
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 2 | 25 | 8.00% |
| Invariants Errors (Not included on General) | 3 | 4 | 75.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player51' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession40' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 0 | 0.00% |

## Generation 5 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 15 | 629 | 2.38% |
| Multiplicities Errors | 2 | 123 | 1.63% |
| Invariants Errors | 0 | 16 | 0.00% |

| Syntax Errors | 
|---| 
```
<input>:1:0: generation of expression `#ATTACKING_MIDFIELDER' failed, with following error:
```
```
<input>:1:32: Undefined enumeration literal `ATTACKING_MIDFIELDER'.
```
```
<input>:1:0: generation of expression `#WING' failed, with following error:
```
```
<input>:1:32: Undefined enumeration literal `WING'.
```
```
<input>:1:0: generation of expression `#ATTACKING_MIDFIELDER' failed, with following error:
```
```
<input>:1:43: Undefined enumeration literal `ATTACKING_MIDFIELDER'.
```
```
<input>:1:0: generation of expression `#WING' failed, with following error:
```
```
<input>:1:0: generation of expression `#SUBSTITUTION' failed, with following error:
```
```
<input>:1:32: Undefined enumeration literal `SUBSTITUTION'.
```
```
<input>:1:0: generation of expression `#SUBSTITUTION' failed, with following error:
```
```
<input>:1:32: Undefined enumeration literal `SUBSTITUTION'.
```
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```
```
<input>:line 1:0 no viable alternative at input 'set'
```
```
<input>:line 1:0 no viable alternative at input 'set'
```
```
<input>:line 1:0 no viable alternative at input 'set'
```

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession30' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamBI' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 2 | 25 | 8.00% |
| Invariants Errors (Not included on General) | 3 | 4 | 75.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player51' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession40' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 31 | 0.00% |

# Generation 6
## Category baseline
```
!new Club('club49')
!set club49.name := 'Tokyo Thunder'
!set club49.homeGround := 'Meiji Jingu Stadium'
!set club49.chairman := 'Satoshi Yamamoto'

!new Team('teamBA')
!set teamBA.name := 'Tokyo Typhoons'

!insert (club49, teamBA) into ClubTeam

!new Player('player57')
!set player57.name := 'Hiroshi Tanaka'
!set player57.age := 27
!set player57.bestFoot := #RIGHT
!set player57.phoneNumber := '+81312345678'

!new Player('player58')
!set player58.name := 'Kenji Ito'
!set player58.age := 25
!set player58.bestFoot := #LEFT
!set player58.phoneNumber := '+81387654321'

!insert (teamBA, player57) into TeamPlayer
!insert (teamBA, player58) into TeamPlayer

!new Position('position81')
!set position81.positionName := #FORWARD

!new Position('position82')
!set position82.positionName := #MIDFIELDER

!insert (player57, position81) into PlayerPositions
!insert (player58, position82) into PlayerPositions

!new TrainingObjective('trainingObjective61')
!set trainingObjective61.areaToImprove := 'Endurance'
!set trainingObjective61.startDate := '2023-05-01'
!set trainingObjective61.endDate := '2023-08-01'
!set trainingObjective61.success := true

!insert (trainingObjective61, player57) into TrainingObjectivePlayer

!new TrainingSession('trainingSession44')
!set trainingSession44.date := '2023-08-15'
!set trainingSession44.location := 'Tokyo Training Facility'
!set trainingSession44.purpose := 'Advanced Tactical Drills'

!new TrainingNotes('trainingNote47')
!set trainingNote47.note := 'Executed complex drills focusing on decision-making under pressure.'
!set trainingNote47.date := '2023-08-15'

!insert (trainingSession44, trainingNote47) into TrainingTrainingNotes

!insert (teamBA, trainingSession44) into TeamTraining

!new Competition('competition25')
!set competition25.name := 'Asia Pacific Cup'
!set competition25.type := 'Continental Championship'

!new Match('match25')
!set match25.date := '2023-09-01'
!set match25.homeAway := true

!insert (competition25, match25) into CompetitionMatch

!insert (teamBA, match25) into LocalMatch

!new Team('teamBB')
!set teamBB.name := 'Shanghai Sharks'

!new Club('club50')
!set club50.name := 'Shanghai Stars'
!set club50.homeGround := 'Shanghai Stadium'
!set club50.chairman := 'Li Wei'

!insert (club50, teamBB) into ClubTeam

!insert (teamBB, match25) into VisitorMatch

!new MatchReport('matchReport25')
!set matchReport25.duration := 90
!set matchReport25.scoreVisitor := 1
!set matchReport25.scoreLocal := 3

!insert (match25, matchReport25) into MatchMatchReport

!new MatchEvent('matchEvent104')
!set matchEvent104.eventType := #GOAL
!set matchEvent104.time := 15

!new MatchEvent('matchEvent105')
!set matchEvent105.eventType := #GOAL
!set matchEvent105.time := 35

!new MatchEvent('matchEvent106')
!set matchEvent106.eventType := #FOUL
!set matchEvent106.time := 50

!new MatchEvent('matchEvent107')
!set matchEvent107.eventType := #GOAL
!set matchEvent107.time := 70

!new MatchEvent('matchEvent108')
!set matchEvent108.eventType := #GOAL
!set matchEvent108.time := 80

!new MatchEvent('matchEvent109')
!set matchEvent109.eventType := #FOUL
!set matchEvent109.time := 88

!insert (match25, matchEvent104) into MatchMatchEvent
!insert (match25, matchEvent105) into MatchMatchEvent
!insert (match25, matchEvent106) into MatchMatchEvent
!insert (match25, matchEvent107) into MatchMatchEvent
!insert (match25, matchEvent108) into MatchMatchEvent
!insert (match25, matchEvent109) into MatchMatchEvent

!new MatchNote('matchNote19')
!set matchNote19.note := 'A commanding victory highlighted by strategic pressing and ball control.'
!set matchNote19.date := '2023-09-01'

!insert (match25, matchNote19) into MatchMatchNote

!new MatchPlayer('matchPlayer34')
!set matchPlayer34.booked := false
!set matchPlayer34.goals := 2
!set matchPlayer34.rating := 9

!insert (player57, matchPlayer34) into PlayerMatch
!insert (match25, matchPlayer34) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition35')
!set matchPlayerPosition35.positionName := #FORWARD
!set matchPlayerPosition35.number := 9

!insert (matchPlayer34, matchPlayerPosition35) into MatchPlayerMatchPlayerPosition

!new MatchPlayer('matchPlayer35')
!set matchPlayer35.booked := true
!set matchPlayer35.goals := 1
!set matchPlayer35.rating := 8

!insert (player58, matchPlayer35) into PlayerMatch
!insert (match25, matchPlayer35) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition36')
!set matchPlayerPosition36.positionName := #MIDFIELDER
!set matchPlayerPosition36.number := 8

!insert (matchPlayer35, matchPlayerPosition36) into MatchPlayerMatchPlayerPosition

!new Player('player55')
!set player55.name := 'Lin Chen'
!set player55.age := 24
!set player55.bestFoot := #RIGHT
!set player55.phoneNumber := '+86-21-123456'

!new Player('player56')
!set player56.name := 'Mei Zhang'
!set player56.age := 26
!set player56.bestFoot := #LEFT
!set player56.phoneNumber := '+86-21-654321'

!insert (teamBB, player55) into TeamPlayer
!insert (teamBB, player56) into TeamPlayer

!new Position('position79')
!set position79.positionName := #MIDFIELDER

!new Position('position80')
!set position80.positionName := #DEFENDER

!insert (player55, position79) into PlayerPositions
!insert (player56, position80) into PlayerPositions

!new PlayerNotes('playerNote38')
!set playerNote38.note := 'Agile playmaker with a vision for assists.'
!set playerNote38.date := '2023-08-15'

!insert (player55, playerNote38) into PlayerPlayerNotes

!new PlayerNotes('playerNote39')
!set playerNote39.note := 'Solid and reliable in cutting off attacks.'
!set playerNote39.date := '2023-08-05'

!insert (player56, playerNote39) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective58')
!set trainingObjective58.areaToImprove := 'Tactical Awareness'
!set trainingObjective58.startDate := '2023-07-01'
!set trainingObjective58.endDate := '2023-09-01'
!set trainingObjective58.success := true

!insert (trainingObjective58, player55) into TrainingObjectivePlayer

!new TrainingObjective('trainingObjective60')
!set trainingObjective60.areaToImprove := 'Positioning'
!set trainingObjective60.startDate := '2023-06-01'
!set trainingObjective60.endDate := '2023-08-01'
!set trainingObjective60.success := true

!insert (trainingObjective60, player56) into TrainingObjectivePlayer

!new TrainingSession('trainingSession43')
!set trainingSession43.date := '2023-07-20'
!set trainingSession43.location := 'Shanghai Sports Center'
!set trainingSession43.purpose := 'Team Synergy and Set Pieces'

!insert (teamBB, trainingSession43) into TeamTraining

!new TrainingNotes('trainingNote45')
!set trainingNote45.note := 'Focused on enhancing teamwork and mastering set pieces.'
!set trainingNote45.date := '2023-07-20'

!new TrainingNotes('trainingNote46')
!set trainingNote46.note := 'Incorporation of video analysis for performance improvement.'
!set trainingNote46.date := '2023-07-20'

!insert (trainingSession43, trainingNote45) into TrainingTrainingNotes
!insert (trainingSession43, trainingNote46) into TrainingTrainingNotes

!new TrainingFailedToAttend('failedAttend17')
!set failedAttend17.reason := 'Personal Reasons'

!insert (trainingSession43, failedAttend17) into TrainingFailded
!insert (failedAttend17, player55) into FailedPlayer
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 164 | 0.00% |
| Multiplicities Errors | 1 | 39 | 2.56% |
| Invariants Errors | 0 | 4 | 0.00% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player58' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 0 | 0.00% |

## Category boundary
```
!new Club('club43')
!club43.name := 'South Coast Sharks'
!club43.homeGround := 'Shark Park'
!club43.chairman := 'Diego Marquez'

!new Team('teamAU')
!teamAU.name := 'Sharks Reserves'

!insert (club43, teamAU) into ClubTeam

!new Player('player49')
!player49.name := 'Ling Zhang'
!player49.age := 24
!player49.bestFoot := #LEFT
!player49.phoneNumber := '+8613800001111'

!insert (teamAU, player49) into TeamPlayer

!new Position('position69')
!position69.positionName := #DEFENDER

!new Position('position70')
!position70.positionName := #MIDFIELDER

!insert (player49, position69) into PlayerPositions
!insert (player49, position70) into PlayerPositions

!new PlayerNotes('playerNote34')
!playerNote34.note := 'Outstanding defensive capabilities.'
!playerNote34.date := '2023-04-12'

!new PlayerNotes('playerNote35')
!playerNote35.note := 'Prone to late game fatigue.'
!playerNote35.date := '2023-05-22'

!insert (player49, playerNote34) into PlayerPlayerNotes
!insert (player49, playerNote35) into PlayerPlayerNotes

!new TrainingObjective('trainingObjective52')
!trainingObjective52.areaToImprove := 'Stamina during matches'
!trainingObjective52.startDate := '2023-06-01'
!trainingObjective52.endDate := '2023-06-30'
!trainingObjective52.success := false

!insert (trainingObjective52, player49) into TrainingObjectivePlayer

!new Competition('competition22')
!competition22.name := 'Local Derby Championship'
!competition22.type := 'League'

!new Team('teamAV')
!teamAV.name := 'Capital Comets'

!new Club('club44')
!club44.name := 'Capital Football Club'
!club44.homeGround := 'Capital Arena'
!club44.chairman := 'Richard Cometman'

!insert (club44, teamAV) into ClubTeam

!new Player('player50')
!player50.name := 'Ali Zaid'
!player50.age := 26
!player50.bestFoot := #RIGHT
!player50.phoneNumber := '+8613888888888'

!insert (teamAV, player50) into TeamPlayer

!new Position('position71')
!position71.positionName := #MIDFIELDER

!insert (player50, position71) into PlayerPositions

!new TrainingObjective('trainingObjective53')
!trainingObjective53.areaToImprove := 'Ball Control'
!trainingObjective53.startDate := '2023-09-01'
!trainingObjective53.endDate := '2023-09-30'
!trainingObjective53.success := true

!insert (trainingObjective53, player50) into TrainingObjectivePlayer

!new TrainingSession('trainingSession39')
!trainingSession39.date := '2023-09-28'
!trainingSession39.location := 'Capital Arena Training Ground'
!trainingSession39.purpose := 'Offensive Drills'

!insert (teamAV, trainingSession39) into TeamTraining

!new TrainingNotes('trainingNote40')
!trainingNote40.note := 'Focus on quick transition plays and maintaining possession.'
!trainingNote40.date := '2023-09-28'

!insert (trainingSession39, trainingNote40) into TrainingTrainingNotes

!new Match('match22')
!match22.date := '2023-10-05'
!match22.homeAway := false

!insert (competition22, match22) into CompetitionMatch

!insert (teamAV, match22) into LocalMatch
!insert (teamAU, match22) into VisitorMatch

!new MatchReport('matchReport22')
!matchReport22.duration := 90
!matchReport22.scoreVisitor := 2
!matchReport22.scoreLocal := 1

!insert (match22, matchReport22) into MatchMatchReport

!new MatchEvent('matchEvent89')
!matchEvent89.eventType := #GOAL
!matchEvent89.time := 15

!new MatchEvent('matchEvent90')
!matchEvent90.eventType := #GOAL
!matchEvent90.time := 45

!new MatchEvent('matchEvent91')
!matchEvent91.eventType := #GOAL
!matchEvent91.time := 75

!insert (match22, matchEvent89) into MatchMatchEvent
!insert (match22, matchEvent90) into MatchMatchEvent
!insert (match22, matchEvent91) into MatchMatchEvent

!new MatchPlayer('matchPlayer31')
!matchPlayer31.booked := true
!matchPlayer31.goals := 1
!matchPlayer31.rating := 8

!insert (player49, matchPlayer31) into PlayerMatch
!insert (match22, matchPlayer31) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition32')
!matchPlayerPosition32.positionName := #DEFENDER
!matchPlayerPosition32.number := 3

!insert (matchPlayer31, matchPlayerPosition32) into MatchPlayerMatchPlayerPosition

!new TrainingSession('trainingSession38')
!trainingSession38.date := '2023-10-03'
!trainingSession38.location := 'Shark Park Training Grounds'
!trainingSession38.purpose := 'Preparing for critical match'

!insert (teamAU, trainingSession38) into TeamTraining

!new TrainingNotes('trainingNote39')
!trainingNote39.note := 'Tactical setup focusing on counter-attacks.'
!trainingNote39.date := '2023-10-03'

!insert (trainingSession38, trainingNote39) into TrainingTrainingNotes
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 109 | 0.00% |
| Multiplicities Errors | 0 | 25 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 11 | 0.00% |

## Category complex
```
!new Club('club60')
!set club60.name := 'Santos FC'
!set club60.homeGround := 'Vila Belmiro'
!set club60.chairman := 'Andrés Rueda'

!new Club('club61')
!set club61.name := 'Flamengo'
!set club61.homeGround := 'Maracanã'
!set club61.chairman := 'Rodolfo Landim'

!new Team('teamBL')
!set teamBL.name := 'Santos Senior Team'

!new Team('teamBM')
!set teamBM.name := 'Flamengo First Team'

!insert (club60, teamBL) into ClubTeam
!insert (club61, teamBM) into ClubTeam

!new Competition('competition30')
!set competition30.name := 'Copa Libertadores'
!set competition30.type := 'International Club Competition'

!new Match('match30')
!set match30.date := '2024-04-25'
!set match30.homeAway := false

!insert (competition30, match30) into CompetitionMatch

!insert (teamBM, match30) into LocalMatch
!insert (teamBL, match30) into VisitorMatch

!new MatchReport('matchReport30')
!set matchReport30.duration := 90
!set matchReport30.scoreVisitor := 1
!set matchReport30.scoreLocal := 2

!insert (match30, matchReport30) into MatchMatchReport

!new Player('player67')
!set player67.name := 'Neymar Jr.'
!set player67.age := 32
!set player67.bestFoot := #RIGHT
!set player67.phoneNumber := '+55 21987654321'

!new Player('player68')
!set player68.name := 'Gabriel Barbosa'
!set player68.age := 27
!set player68.bestFoot := #LEFT
!set player68.phoneNumber := '+55 21876543210'

!insert (teamBL, player67) into TeamPlayer
!insert (teamBM, player68) into TeamPlayer

!new Position('position95')
!set position95.positionName := #FORWARD

!insert (player67, position95) into PlayerPositions

!new Position('position96')
!set position96.positionName := #FORWARD

!insert (player68, position96) into PlayerPositions

!new TrainingObjective('trainingObjective72')
!set trainingObjective72.areaToImprove := 'Dribbling Precision'
!set trainingObjective72.startDate := '2024-03-01'
!set trainingObjective72.endDate := '2024-04-15'
!set trainingObjective72.success := true

!insert (trainingObjective72, player67) into TrainingObjectivePlayer

!new MatchEvent('matchEvent132')
!set matchEvent132.eventType := #GOAL
!set matchEvent132.time := 22

!new MatchEvent('matchEvent133')
!set matchEvent133.eventType := #GOAL
!set matchEvent133.time := 45

!new MatchEvent('matchEvent134')
!set matchEvent134.eventType := #FOUL
!set matchEvent134.time := 60

!new MatchEvent('matchEvent135')
!set matchEvent135.eventType := #GOAL
!set matchEvent135.time := 70

!insert (match30, matchEvent132) into MatchMatchEvent
!insert (match30, matchEvent133) into MatchMatchEvent
!insert (match30, matchEvent134) into MatchMatchEvent
!insert (match30, matchEvent135) into MatchMatchEvent

!new MatchPlayer('matchPlayer41')
!set matchPlayer41.booked := false
!set matchPlayer41.goals := 1
!set matchPlayer41.rating := 9

!insert (player67, matchPlayer41) into PlayerMatch
!insert (match30, matchPlayer41) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition42')
!set matchPlayerPosition42.positionName := #FORWARD
!set matchPlayerPosition42.number := 10

!insert (matchPlayer41, matchPlayerPosition42) into MatchPlayerMatchPlayerPosition

!new MatchPlayer('matchPlayer42')
!set matchPlayer42.booked := true
!set matchPlayer42.goals := 2
!set matchPlayer42.rating := 8

!insert (player68, matchPlayer42) into PlayerMatch
!insert (match30, matchPlayer42) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition43')
!set matchPlayerPosition43.positionName := #FORWARD
!set matchPlayerPosition43.number := 9

!insert (matchPlayer42, matchPlayerPosition43) into MatchPlayerMatchPlayerPosition

!new MatchNote('matchNote24')
!set matchNote24.note := 'The clash was marked by intense competitive spirit and outstanding performances from forwards.'
!set matchNote24.date := '2024-04-25'

!insert (match30, matchNote24) into MatchMatchNote

!new TrainingSession('trainingSession52')
!set trainingSession52.date := '2024-04-23'
!set trainingSession52.location := 'CT Meninos Da Vila'
!set trainingSession52.purpose := 'Final Tactical Adjustments Before Match'

!insert (teamBL, trainingSession52) into TeamTraining

!new TrainingSession('trainingSession53')
!set trainingSession53.date := '2024-04-20'
!set trainingSession53.location := 'Gávea Training Center'
!set trainingSession53.purpose := 'Strategic Planning for Key Matches'

!insert (teamBM, trainingSession53) into TeamTraining

!new TrainingNotes('trainingNote56')
!set trainingNote56.note := 'Worked on team cohesion and counter-attacking drills.'
!set trainingNote56.date := '2024-04-22'

!insert (trainingSession52, trainingNote56) into TrainingTrainingNotes

!new TrainingNotes('trainingNote57')
!set trainingNote57.note := 'Focused on strategic plays and defensive maneuvers to handle opponent pressure.'
!set trainingNote57.date := '2024-04-19'

!insert (trainingSession53, trainingNote57) into TrainingTrainingNotes

!new TrainingFailedToAttend('failedAttend20')
!set failedAttend20.reason := 'Minor Injury Treatment - Neymar Jr.'

!insert (trainingSession52, failedAttend20) into TrainingFailded
!insert (failedAttend20, player67) into FailedPlayer

!new TrainingObjective('trainingObjective71')
!set trainingObjective71.areaToImprove := 'Finishing Technique'
!set trainingObjective71.startDate := '2024-04-01'
!set trainingObjective71.endDate := '2024-05-30'
!set trainingObjective71.success := true

!insert (trainingObjective71, player68) into TrainingObjectivePlayer

!new PlayerNotes('playerNote45')
!set playerNote45.note := 'Showed exceptional dribbling and scoring ability despite minor setbacks.'
!set playerNote45.date := '2024-04-20'

!new PlayerNotes('playerNote46')
!set playerNote46.note := 'Proved an offensive powerhouse with consistent performance throughout the match.'
!set playerNote46.date := '2024-04-26'

!insert (player67, playerNote45) into PlayerPlayerNotes
!insert (player68, playerNote46) into PlayerPlayerNotes
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 128 | 0.00% |
| Multiplicities Errors | 0 | 31 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 0 | 0.00% |

## Category edge
```
!new Club('club58')
!set club58.name := 'Cultural Exchange FC'
!set club58.homeGround := 'Harmony Stadium'
!set club58.chairman := 'Mr. Luis Fernández'

!new Team('teamBJ')
!set teamBJ.name := 'Global Harmony'

!new Team('teamBK')
!set teamBK.name := 'World Diplomats'

!insert (club58, teamBJ) into ClubTeam

!new Club('club59')
!set club59.name := 'World Football Union'
!set club59.homeGround := 'Diplomacy Dome'
!set club59.chairman := 'Ms. Emilia Russo'

!insert (club59, teamBK) into ClubTeam

!new Competition('competition29')
!set competition29.name := 'International Friendship Cup'
!set competition29.type := 'Exhibition'

!new TrainingSession('trainingSession50')
!set trainingSession50.date := '2023-03-01'
!set trainingSession50.location := 'Diversity Sports Complex'
!set trainingSession50.purpose := 'Cultural Adaptability and Technique Sharing'

!new TrainingNotes('trainingNote53')
!set trainingNote53.note := 'Encourage exchange of cultural play styles'
!set trainingNote53.date := '2023-03-01'

!new TrainingNotes('trainingNote54')
!set trainingNote54.note := 'Focus on building international camaraderie'
!set trainingNote54.date := '2023-03-01'

!insert (trainingSession50, trainingNote53) into TrainingTrainingNotes
!insert (trainingSession50, trainingNote54) into TrainingTrainingNotes

!insert (teamBJ, trainingSession50) into TeamTraining

!new Player('player65')
!set player65.name := 'Akira Tanaka'
!set player65.age := 25
!set player65.bestFoot := #BOTH
!set player65.phoneNumber := '+81345678901'

!insert (teamBJ, player65) into TeamPlayer

!new Player('player66')
!set player66.name := 'Liam Smith'
!set player66.age := 26
!set player66.bestFoot := #RIGHT
!set player66.phoneNumber := '+441234567890'

!insert (teamBK, player66) into TeamPlayer

!new Position('position91')
!set position91.positionName := #MIDFIELDER

!new Position('position93')
!set position93.positionName := #FORWARD

!insert (player65, position91) into PlayerPositions
!insert (player65, position93) into PlayerPositions

!new Position('position94')
!set position94.positionName := #DEFENDER

!insert (player66, position94) into PlayerPositions

!new TrainingObjective('trainingObjective68')
!set trainingObjective68.areaToImprove := 'Cross-cultural communication on-field'
!set trainingObjective68.startDate := '2023-02-01'
!set trainingObjective68.endDate := '2023-03-01'
!set trainingObjective68.success := true

!new TrainingObjective('trainingObjective69')
!set trainingObjective69.areaToImprove := 'Technique versatility'
!set trainingObjective69.startDate := '2023-02-10'
!set trainingObjective69.endDate := '2023-03-10'
!set trainingObjective69.success := true

!insert (trainingObjective68, player65) into TrainingObjectivePlayer
!insert (trainingObjective69, player65) into TrainingObjectivePlayer

!new TrainingSession('trainingSession51')
!set trainingSession51.date := '2023-03-02'
!set trainingSession51.location := 'Harmony Training Grounds'
!set trainingSession51.purpose := 'Advanced Defensive Tactics'

!insert (teamBK, trainingSession51) into TeamTraining

!new TrainingNotes('trainingNote55')
!set trainingNote55.note := 'Enhanced focus on defensive coordination'
!set trainingNote55.date := '2023-03-02'

!insert (trainingSession51, trainingNote55) into TrainingTrainingNotes

!new TrainingObjective('trainingObjective70')
!set trainingObjective70.areaToImprove := 'Positional Awareness'
!set trainingObjective70.startDate := '2023-01-15'
!set trainingObjective70.endDate := '2023-03-30'
!set trainingObjective70.success := true

!insert (trainingObjective70, player66) into TrainingObjectivePlayer

!new Match('match29')
!set match29.date := '2023-04-05'
!set match29.homeAway := false

!insert (competition29, match29) into CompetitionMatch

!insert (teamBK, match29) into LocalMatch
!insert (teamBJ, match29) into VisitorMatch

!new MatchReport('matchReport29')
!set matchReport29.duration := 90
!set matchReport29.scoreVisitor := 5
!set matchReport29.scoreLocal := 4

!insert (match29, matchReport29) into MatchMatchReport

!new MatchEvent('matchEvent122')
!set matchEvent122.eventType := #GOAL
!set matchEvent122.time := 10

!new MatchEvent('matchEvent123')
!set matchEvent123.eventType := #GOAL
!set matchEvent123.time := 15

!new MatchEvent('matchEvent124')
!set matchEvent124.eventType := #GOAL
!set matchEvent124.time := 30

!new MatchEvent('matchEvent125')
!set matchEvent125.eventType := #GOAL
!set matchEvent125.time := 35

!new MatchEvent('matchEvent127')
!set matchEvent127.eventType := #GOAL
!set matchEvent127.time := 60

!new MatchEvent('matchEvent128')
!set matchEvent128.eventType := #GOAL
!set matchEvent128.time := 75

!new MatchEvent('matchEvent129')
!set matchEvent129.eventType := #FOUL
!set matchEvent129.time := 80

!new MatchEvent('matchEvent130')
!set matchEvent130.eventType := #GOAL
!set matchEvent130.time := 85

!new MatchEvent('matchEvent131')
!set matchEvent131.eventType := #GOAL
!set matchEvent131.time := 88

!insert (match29, matchEvent122) into MatchMatchEvent
!insert (match29, matchEvent123) into MatchMatchEvent
!insert (match29, matchEvent124) into MatchMatchEvent
!insert (match29, matchEvent125) into MatchMatchEvent
!insert (match29, matchEvent127) into MatchMatchEvent
!insert (match29, matchEvent128) into MatchMatchEvent
!insert (match29, matchEvent129) into MatchMatchEvent
!insert (match29, matchEvent130) into MatchMatchEvent
!insert (match29, matchEvent131) into MatchMatchEvent

!new MatchNote('matchNote23')
!set matchNote23.note := 'A dynamic display of football and cultural unity, with balanced efforts from both teams'
!set matchNote23.date := '2023-04-05'

!insert (match29, matchNote23) into MatchMatchNote

!new MatchPlayer('matchPlayer40')
!set matchPlayer40.booked := false
!set matchPlayer40.goals := 2
!set matchPlayer40.rating := 9

!insert (player65, matchPlayer40) into PlayerMatch
!insert (match29, matchPlayer40) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition41')
!set matchPlayerPosition41.positionName := #MIDFIELDER
!set matchPlayerPosition41.number := 11

!insert (matchPlayer40, matchPlayerPosition41) into MatchPlayerMatchPlayerPosition
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 139 | 0.00% |
| Multiplicities Errors | 0 | 32 | 0.00% |
| Invariants Errors | 1 | 4 | 25.00% |

| Invariants Errors | 
|---| 
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 0 | 0.00% |

## Category invalid
```
!new Club('club51')
!set club51.name := 'Rio Rivals'
!set club51.homeGround := 'Carnival Stadium'
!set club51.chairman := 'Bianca Costa'

!new Club('club52')
!set club52.name := 'Lisbon Legends'
!set club52.homeGround := 'Legend Arena'
!set club52.chairman := 'Miguel Silva'

!new Club('club53')
!set club53.name := 'Seville Stars'
!set club53.homeGround := 'Star Field'
!set club53.chairman := 'Antonio Ramirez'

!new Team('teamBC')
!set teamBC.name := 'Rio Samba'

!new Team('teamBD')
!set teamBD.name := 'Lisbon Royals'

!new Team('teamBE')
!set teamBE.name := 'Sevilla Suns'

!insert (club51, teamBC) into ClubTeam
!insert (club52, teamBD) into ClubTeam
!insert (club53, teamBE) into ClubTeam

!new Player('player59')
!set player59.name := 'Fabio Ribeiro'
!set player59.age := 30
!set player59.bestFoot := #RIGHT
!set player59.phoneNumber := '+5521998765432'

!new Player('player60')
!set player60.name := 'Carlos Montoya'
!set player60.age := 28
!set player60.bestFoot := #LEFT
!set player60.phoneNumber := '+34678912345'

!insert (teamBC, player59) into TeamPlayer
!insert (teamBD, player60) into TeamPlayer

!new Position('position83')
!set position83.positionName := #MIDFIELDER

!new Position('position84')
!set position84.positionName := #FORWARD

!new Position('position85')
!set position85.positionName := #DEFENDER

!insert (player59, position83) into PlayerPositions
!insert (player59, position84) into PlayerPositions
!insert (player60, position85) into PlayerPositions

!new Competition('competition26')
!set competition26.name := 'Iberian Derby Series'
!set competition26.type := 'Series'

!new Match('match26')
!set match26.date := '2023-12-15'
!set match26.homeAway := false

!insert (competition26, match26) into CompetitionMatch

!insert (teamBC, match26) into LocalMatch
!insert (teamBC, match26) into VisitorMatch

!new MatchReport('matchReport26')
!set matchReport26.duration := 120
!set matchReport26.scoreVisitor := 1
!set matchReport26.scoreLocal := 1

!insert (match26, matchReport26) into MatchMatchReport

!new MatchEvent('matchEvent110')
!set matchEvent110.eventType := #FOUL
!set matchEvent110.time := 15

!new MatchEvent('matchEvent111')
!set matchEvent111.eventType := #FOUL
!set matchEvent111.time := 60

!new MatchEvent('matchEvent112')
!set matchEvent112.eventType := #FOUL
!set matchEvent112.time := 110

!insert (match26, matchEvent110) into MatchMatchEvent
!insert (match26, matchEvent111) into MatchMatchEvent
!insert (match26, matchEvent112) into MatchMatchEvent

!new MatchNote('matchNote20')
!set matchNote20.note := 'An incredible showcase reflecting the rich and vibrant football cultures meeting, with high skill and entertainment.'
!set matchNote20.date := '2023-12-16'

!insert (match26, matchNote20) into MatchMatchNote

!new TrainingSession('trainingSession45')
!set trainingSession45.date := '2023-10-05'
!set trainingSession45.location := 'Carnival Stadium Practice Grounds'
!set trainingSession45.purpose := 'Integrating diverse football techniques from different cultures'

!insert (teamBC, trainingSession45) into TeamTraining

!new TrainingSession('trainingSession46')
!set trainingSession46.date := '2023-10-10'
!set trainingSession46.location := 'Legend Arena Defense Zone'
!set trainingSession46.purpose := 'Enhancing player coordination in defensive setups'

!insert (teamBD, trainingSession46) into TeamTraining

!new TrainingNotes('trainingNote48')
!set trainingNote48.note := 'Prioritize blending traditional with innovative techniques.'
!set trainingNote48.date := '2023-10-06'

!insert (trainingSession45, trainingNote48) into TrainingTrainingNotes

!new TrainingFailedToAttend('failedAttend18')
!set failedAttend18.reason := 'Family commitment.'

!insert (trainingSession45, failedAttend18) into TrainingFailded
!insert (failedAttend18, player59) into FailedPlayer

!new TrainingObjective('trainingObjective62')
!set trainingObjective62.areaToImprove := 'Positional Awareness'
!set trainingObjective62.startDate := '2023-08-01'
!set trainingObjective62.endDate := '2023-12-31'
!set trainingObjective62.success := true

!insert (trainingObjective62, player60) into TrainingObjectivePlayer

!new PlayerNotes('playerNote40')
!set playerNote40.note := 'Vital part of team chemistry; offers leadership insight during gameplay.'
!set playerNote40.date := '2023-09-01'

!insert (player59, playerNote40) into PlayerPlayerNotes

!new MatchPlayer('matchPlayer36')
!set matchPlayer36.booked := true
!set matchPlayer36.goals := 0
!set matchPlayer36.rating := 8

!insert (player60, matchPlayer36) into PlayerMatch
!insert (match26, matchPlayer36) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition37')
!set matchPlayerPosition37.positionName := #DEFENDER
!set matchPlayerPosition37.number := 4

!insert (matchPlayer36, matchPlayerPosition37) into MatchPlayerMatchPlayerPosition
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 4 | 26 | 15.38% |
| Invariants Errors (Not included on General) | 3 | 4 | 75.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamBE' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamBE' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player59' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession46' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 0 | 0.00% |

## Generation 6 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 650 | 0.00% |
| Multiplicities Errors | 1 | 127 | 0.79% |
| Invariants Errors | 1 | 16 | 6.25% |

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player58' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```

| Invariants Errors | 
|---| 
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 4 | 26 | 15.38% |
| Invariants Errors (Not included on General) | 3 | 4 | 75.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamBE' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamBE' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player59' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession46' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 11 | 0.00% |

# Summary for all generations
| Summary | Value | 
|---|---| 
| Model | GPT_4O | 
| Type | CoT | 
| System | football | 
| Number of generations | 6 | 

| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 28 | 3784 | 0.74% |
| Multiplicities Errors | 19 | 756 | 2.51% |
| Invariants Errors | 10 | 96 | 10.42% |

| Syntax Errors | 
|---| 
```
<input>:line 1:6 mismatched input '.' expecting :=
```
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```
```
<input>:1:27: Undefined enumeration literal `CAUTION'.
```
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```
```
<input>:1:27: Undefined enumeration literal `CAUTION'.
```
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```
```
<input>:1:27: Undefined enumeration literal `CAUTION'.
```
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```
```
<input>:1:27: Undefined enumeration literal `CAUTION'.
```
```
<input>:1:0: generation of expression `#SUBSTITUTE' failed, with following error:
```
```
<input>:1:27: Undefined enumeration literal `SUBSTITUTE'.
```
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```
```
<input>:1:0: generation of expression `#SUBSTITUTION' failed, with following error:
```
```
<input>:1:0: generation of expression `#ATTACKING_MIDFIELDER' failed, with following error:
```
```
<input>:1:32: Undefined enumeration literal `ATTACKING_MIDFIELDER'.
```
```
<input>:1:0: generation of expression `#WING' failed, with following error:
```
```
<input>:1:32: Undefined enumeration literal `WING'.
```
```
<input>:1:0: generation of expression `#ATTACKING_MIDFIELDER' failed, with following error:
```
```
<input>:1:43: Undefined enumeration literal `ATTACKING_MIDFIELDER'.
```
```
<input>:1:0: generation of expression `#WING' failed, with following error:
```
```
<input>:1:0: generation of expression `#SUBSTITUTION' failed, with following error:
```
```
<input>:1:32: Undefined enumeration literal `SUBSTITUTION'.
```
```
<input>:1:0: generation of expression `#SUBSTITUTION' failed, with following error:
```
```
<input>:1:32: Undefined enumeration literal `SUBSTITUTION'.
```
```
<input>:1:0: generation of expression `#CAUTION' failed, with following error:
```
```
<input>:line 1:0 no viable alternative at input 'set'
```
```
<input>:line 1:0 no viable alternative at input 'set'
```
```
<input>:line 1:0 no viable alternative at input 'set'
```

| Multiplicities Errors | 
|---| 
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamB' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `trainingSession1' of class `TrainingSession' is connected to 3 objects of class `Team'
  at association end `team' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `PlayerPositions':
  Object `position26' of class `Position' is connected to 2 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `PlayerPositions':
  Object `position27' of class `Position' is connected to 2 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamT' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamS' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamT' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamJ' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamJ' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player10' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamAG' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `trainingSession33' of class `TrainingSession' is connected to 2 objects of class `Team'
  at association end `team' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `trainingSession28' of class `TrainingSession' is connected to 2 objects of class `Team'
  at association end `team' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player35' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player36' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `trainingSession42' of class `TrainingSession' is connected to 2 objects of class `Team'
  at association end `team' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession30' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamBI' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player58' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```

| Invariants Errors | 
|---| 
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 20 | 146 | 13.70% |
| Invariants Errors (Not included on General) | 17 | 24 | 70.83% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamI' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player7' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession7' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession8' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player15' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession15' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamAA' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamAA' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player25' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession22' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamAN' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamAN' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player39' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession31' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player51' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession40' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamPlayer':
  Object `teamBE' of class `Team' is connected to 0 objects of class `Player'
  at association end `player' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TeamTraining':
  Object `teamBE' of class `Team' is connected to 0 objects of class `TrainingSession'
  at association end `trainingSession' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingObjectivePlayer':
  Object `player59' of class `Player' is connected to 0 objects of class `TrainingObjective'
  at association end `trainingObjective' but the multiplicity is specified as `1..*'.
```
```
Multiplicity constraint violation in association `TrainingTrainingNotes':
  Object `trainingSession46' of class `TrainingSession' is connected to 0 objects of class `TrainingNotes'
  at association end `trainingNotes' but the multiplicity is specified as `1..*'.
```

| [Overconstraints Detection] Invariants Errors (Not included on General) | 
|---| 
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```
```
checking invariant (1) `Match::DifferentTeams': FAILED.
```
```
checking invariant (2) `Match::TeamsFromDifferentClubs': FAILED.
```
```
checking invariant (4) `MatchReport::SumOfScoresEqualsGoals': FAILED.
```

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 259 | 0.00% |

