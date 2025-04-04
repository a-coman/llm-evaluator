# Generation 1
```
!new Club('club1')
!club1.name := 'FC Falcons'
!club1.homeGround := 'Falcon Stadium'
!club1.chairman := 'John Smith'

!new Club('club2')
!club2.name := 'FC Eagles'
!club2.homeGround := 'Eagle Stadium'
!club2.chairman := 'Jane Doe'

!new Team('team1')
!team1.name := 'Falcon Warriors'
!insert (club1, team1) into ClubTeam

!new Team('team2')
!team2.name := 'Eagle Fighters'
!insert (club2, team2) into ClubTeam

!new Player('player1')
!player1.name := 'Mike Andrews'
!player1.age := 24
!player1.bestFoot := #RIGHT
!player1.phoneNumber := '123-456-7890'
!insert (team1, player1) into TeamPlayer

!new Player('player2')
!player2.name := 'Jimmy Clark'
!player2.age := 21
!player2.bestFoot := #LEFT
!player2.phoneNumber := '987-654-3210'
!insert (team1, player2) into TeamPlayer

!new Player('player3')
!player3.name := 'Jose Sanchez'
!player3.age := 29
!player3.bestFoot := #BOTH
!player3.phoneNumber := '555-123-4567'
!insert (team2, player3) into TeamPlayer

!new Position('position1')
!position1.positionName := #FORWARD
!insert (player1, position1) into PlayerPositions

!new Position('position2')
!position2.positionName := #MIDFIELDER
!insert (player2, position2) into PlayerPositions

!new Position('position3')
!position3.positionName := #GOALKEEPER
!insert (player3, position3) into PlayerPositions

!new TrainingSession('training1')
!training1.date := '2023-10-24'
!training1.location := 'Falcon Training Ground'
!training1.purpose := 'Skill Improvement'
!insert (team1, training1) into TeamTraining

!new TrainingSession('training2')
!training2.date := '2023-10-25'
!training2.location := 'Eagle Training Facility'
!training2.purpose := 'Team Strategy'
!insert (team2, training2) into TeamTraining

!new TrainingNotes('trainingNotes1')
!trainingNotes1.note := 'Focused on passing drills'
!trainingNotes1.date := '2023-10-24'
!insert (training1, trainingNotes1) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes2')
!trainingNotes2.note := 'Practiced defensive strategies'
!trainingNotes2.date := '2023-10-25'
!insert (training2, trainingNotes2) into TrainingTrainingNotes

!new TrainingFailedToAttend('failed1')
!failed1.reason := 'Family emergency'
!insert (training1, failed1) into TrainingFailded
!insert (failed1, player2) into FailedPlayer

!new TrainingObjective('objective1')
!objective1.areaToImprove := 'Agility'
!objective1.startDate := '2023-10-01'
!objective1.endDate := '2023-12-01'
!objective1.success := true
!insert (objective1, player1) into TrainingObjectivePlayer

!new TrainingObjective('objective2')
!objective2.areaToImprove := 'Stamina'
!objective2.startDate := '2023-09-15'
!objective2.endDate := '2023-11-30'
!objective2.success := false
!insert (objective2, player2) into TrainingObjectivePlayer

!new TrainingObjective('objective3')
!objective3.areaToImprove := 'Endurance'
!objective3.startDate := '2023-08-10'
!objective3.endDate := '2023-11-10'
!objective3.success := true
!insert (objective3, player3) into TrainingObjectivePlayer

!new Competition('competition1')
!competition1.name := 'Champions League'
!competition1.type := 'Knockout'

!new Match('match1')
!match1.date := '2023-11-05'
!match1.homeAway := true
!insert (competition1, match1) into CompetitionMatch
!insert (team1, match1) into LocalMatch
!insert (team2, match1) into VisitorMatch

!new MatchReport('report1')
!report1.duration := 90
!report1.scoreVisitor := 1
!report1.scoreLocal := 2
!insert (match1, report1) into MatchMatchReport

!new MatchPlayer('matchPlayer1')
!matchPlayer1.booked := false
!matchPlayer1.goals := 2
!matchPlayer1.rating := 8
!insert (player1, matchPlayer1) into PlayerMatch
!insert (match1, matchPlayer1) into MatchMatchPlayer

!new MatchPlayer('matchPlayer3')
!matchPlayer3.booked := false
!matchPlayer3.goals := 1
!matchPlayer3.rating := 6
!insert (player3, matchPlayer3) into PlayerMatch
!insert (match1, matchPlayer3) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition1')
!matchPlayerPosition1.positionName := #FORWARD
!matchPlayerPosition1.number := 9
!insert (matchPlayer1, matchPlayerPosition1) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition3')
!matchPlayerPosition3.positionName := #GOALKEEPER
!matchPlayerPosition3.number := 1
!insert (matchPlayer3, matchPlayerPosition3) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event1')
!event1.eventType := #GOAL
!event1.time := 30
!insert (match1, event1) into MatchMatchEvent

!new MatchEvent('event2')
!event2.eventType := #GOAL
!event2.time := 70
!insert (match1, event2) into MatchMatchEvent

!new MatchEvent('event3')
!event3.eventType := #GOAL
!event3.time := 85
!insert (match1, event3) into MatchMatchEvent

!new MatchNote('matchNote1')
!matchNote1.note := 'Exciting match with great goals'
!matchNote1.date := '2023-11-05'
!insert (match1, matchNote1) into MatchMatchNote
```
## Generation 1 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 131 | 0.00% |
| Multiplicities Errors | 0 | 31 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 2
```
!new Club('club3')
!club3.name := 'Lions FC'
!club3.homeGround := 'Lion Arena'
!club3.chairman := 'Oliver Brown'

!new Club('club4')
!club4.name := 'Tigers FC'
!club4.homeGround := 'Tiger Stadium'
!club4.chairman := 'Sophia Green'

!new Team('team3')
!team3.name := 'Lions Pride'
!insert (club3, team3) into ClubTeam

!new Team('team4')
!team4.name := 'Tiger Roar'
!insert (club4, team4) into ClubTeam

!new Player('player4')
!player4.name := 'David Gray'
!player4.age := 27
!player4.bestFoot := #RIGHT
!player4.phoneNumber := '321-654-9870'
!insert (team3, player4) into TeamPlayer

!new Player('player5')
!player5.name := 'Ethan White'
!player5.age := 23
!player5.bestFoot := #LEFT
!player5.phoneNumber := '654-321-0987'
!insert (team3, player5) into TeamPlayer

!new Player('player6')
!player6.name := 'Lucas Black'
!player6.age := 30
!player6.bestFoot := #BOTH
!player6.phoneNumber := '789-012-3456'
!insert (team4, player6) into TeamPlayer

!new Position('position4')
!position4.positionName := #DEFENDER
!insert (player4, position4) into PlayerPositions

!new Position('position5')
!position5.positionName := #FORWARD
!insert (player5, position5) into PlayerPositions

!new Position('position6')
!position6.positionName := #MIDFIELDER
!insert (player6, position6) into PlayerPositions

!new TrainingSession('training3')
!training3.date := '2023-10-26'
!training3.location := 'Lion Training Grounds'
!training3.purpose := 'Defense Drills'
!insert (team3, training3) into TeamTraining

!new TrainingSession('training4')
!training4.date := '2023-10-27'
!training4.location := 'Tiger Training Grounds'
!training4.purpose := 'Offense Strategy'
!insert (team4, training4) into TeamTraining

!new TrainingNotes('trainingNotes3')
!trainingNotes3.note := 'Focused on defensive formations'
!trainingNotes3.date := '2023-10-26'
!insert (training3, trainingNotes3) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes4')
!trainingNotes4.note := 'Practiced shooting tactics'
!trainingNotes4.date := '2023-10-27'
!insert (training4, trainingNotes4) into TrainingTrainingNotes

!new TrainingObjective('objective4')
!objective4.areaToImprove := 'Defensive tactics'
!objective4.startDate := '2023-10-02'
!objective4.endDate := '2023-12-02'
!objective4.success := true
!insert (objective4, player4) into TrainingObjectivePlayer

!new TrainingObjective('objective5')
!objective5.areaToImprove := 'Goal scoring'
!objective5.startDate := '2023-09-20'
!objective5.endDate := '2023-11-20'
!objective5.success := true
!insert (objective5, player5) into TrainingObjectivePlayer

!new TrainingObjective('objective6')
!objective6.areaToImprove := 'Ball control'
!objective6.startDate := '2023-08-15'
!objective6.endDate := '2023-11-15'
!objective6.success := false
!insert (objective6, player6) into TrainingObjectivePlayer

!new Competition('competition2')
!competition2.name := 'Premier Cup'
!competition2.type := 'League'

!new Match('match2')
!match2.date := '2023-11-12'
!match2.homeAway := false
!insert (competition2, match2) into CompetitionMatch
!insert (team3, match2) into LocalMatch
!insert (team4, match2) into VisitorMatch

!new MatchReport('report2')
!report2.duration := 90
!report2.scoreVisitor := 3
!report2.scoreLocal := 1
!insert (match2, report2) into MatchMatchReport

!new MatchPlayer('matchPlayer4')
!matchPlayer4.booked := true
!matchPlayer4.goals := 1
!matchPlayer4.rating := 6
!insert (player4, matchPlayer4) into PlayerMatch
!insert (match2, matchPlayer4) into MatchMatchPlayer

!new MatchPlayer('matchPlayer6')
!matchPlayer6.booked := false
!matchPlayer6.goals := 3
!matchPlayer6.rating := 9
!insert (player6, matchPlayer6) into PlayerMatch
!insert (match2, matchPlayer6) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition4')
!matchPlayerPosition4.positionName := #DEFENDER
!matchPlayerPosition4.number := 5
!insert (matchPlayer4, matchPlayerPosition4) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition6')
!matchPlayerPosition6.positionName := #MIDFIELDER
!matchPlayerPosition6.number := 10
!insert (matchPlayer6, matchPlayerPosition6) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event4')
!event4.eventType := #GOAL
!event4.time := 18
!insert (match2, event4) into MatchMatchEvent

!new MatchEvent('event5')
!event5.eventType := #GOAL
!event5.time := 45
!insert (match2, event5) into MatchMatchEvent

!new MatchEvent('event6')
!event6.eventType := #GOAL
!event6.time := 75
!insert (match2, event6) into MatchMatchEvent

!new MatchEvent('event7')
!event7.eventType := #GOAL
!event7.time := 85
!insert (match2, event7) into MatchMatchEvent

!new MatchNote('matchNote2')
!matchNote2.note := 'Dominant performance by Tigers FC'
!matchNote2.date := '2023-11-12'
!insert (match2, matchNote2) into MatchMatchNote
```
## Generation 2 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 131 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 3
```
!new Club('club5')
!club5.name := 'Hawks United'
!club5.homeGround := 'Hawk Stadium'
!club5.chairman := 'Michael Turner'

!new Club('club6')
!club6.name := 'Wolves FC'
!club6.homeGround := 'Wolf Arena'
!club6.chairman := 'Emily Foster'

!new Team('team5')
!team5.name := 'Hawk Warriors'
!insert (club5, team5) into ClubTeam

!new Team('team6')
!team6.name := 'Wolf Pack'
!insert (club6, team6) into ClubTeam

!new Player('player7')
!player7.name := 'Nathan Green'
!player7.age := 26
!player7.bestFoot := #LEFT
!player7.phoneNumber := '111-222-3333'
!insert (team5, player7) into TeamPlayer

!new Player('player8')
!player8.name := 'Olivia Brown'
!player8.age := 22
!player8.bestFoot := #RIGHT
!player8.phoneNumber := '444-555-6666'
!insert (team5, player8) into TeamPlayer

!new Player('player9')
!player9.name := 'Sophia Smith'
!player9.age := 28
!player9.bestFoot := #BOTH
!player9.phoneNumber := '777-888-9999'
!insert (team6, player9) into TeamPlayer

!new Position('position7')
!position7.positionName := #MIDFIELDER
!insert (player7, position7) into PlayerPositions

!new Position('position8')
!position8.positionName := #DEFENDER
!insert (player8, position8) into PlayerPositions

!new Position('position9')
!position9.positionName := #FORWARD
!insert (player9, position9) into PlayerPositions

!new TrainingSession('training5')
!training5.date := '2023-11-01'
!training5.location := 'Hawk Training Center'
!training5.purpose := 'Passing and Dribbling'
!insert (team5, training5) into TeamTraining

!new TrainingSession('training6')
!training6.date := '2023-11-02'
!training6.location := 'Wolf Training Grounds'
!training6.purpose := 'Goalkeeping Techniques'
!insert (team6, training6) into TeamTraining

!new TrainingNotes('trainingNotes5')
!trainingNotes5.note := 'Emphasis on precision passing'
!trainingNotes5.date := '2023-11-01'
!insert (training5, trainingNotes5) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes6')
!trainingNotes6.note := 'Focused on reflex training for goalkeepers'
!trainingNotes6.date := '2023-11-02'
!insert (training6, trainingNotes6) into TrainingTrainingNotes

!new TrainingObjective('objective7')
!objective7.areaToImprove := 'Accuracy'
!objective7.startDate := '2023-10-10'
!objective7.endDate := '2023-12-10'
!objective7.success := true
!insert (objective7, player7) into TrainingObjectivePlayer

!new TrainingObjective('objective8')
!objective8.areaToImprove := 'Defense Skills'
!objective8.startDate := '2023-09-25'
!objective8.endDate := '2023-11-25'
!objective8.success := false
!insert (objective8, player8) into TrainingObjectivePlayer

!new TrainingObjective('objective9')
!objective9.areaToImprove := 'Agility'
!objective9.startDate := '2023-08-15'
!objective9.endDate := '2023-11-15'
!objective9.success := true
!insert (objective9, player9) into TrainingObjectivePlayer

!new Competition('competition3')
!competition3.name := 'National League'
!competition3.type := 'Group Stage'

!new Match('match3')
!match3.date := '2023-11-18'
!match3.homeAway := true
!insert (competition3, match3) into CompetitionMatch
!insert (team5, match3) into LocalMatch
!insert (team6, match3) into VisitorMatch

!new MatchReport('report3')
!report3.duration := 90
!report3.scoreVisitor := 2
!report3.scoreLocal := 2
!insert (match3, report3) into MatchMatchReport

!new MatchPlayer('matchPlayer7')
!matchPlayer7.booked := true
!matchPlayer7.goals := 1
!matchPlayer7.rating := 7
!insert (player7, matchPlayer7) into PlayerMatch
!insert (match3, matchPlayer7) into MatchMatchPlayer

!new MatchPlayer('matchPlayer9')
!matchPlayer9.booked := false
!matchPlayer9.goals := 2
!matchPlayer9.rating := 8
!insert (player9, matchPlayer9) into PlayerMatch
!insert (match3, matchPlayer9) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition7')
!matchPlayerPosition7.positionName := #MIDFIELDER
!matchPlayerPosition7.number := 12
!insert (matchPlayer7, matchPlayerPosition7) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition9')
!matchPlayerPosition9.positionName := #FORWARD
!matchPlayerPosition9.number := 11
!insert (matchPlayer9, matchPlayerPosition9) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event8')
!event8.eventType := #GOAL
!event8.time := 24
!insert (match3, event8) into MatchMatchEvent

!new MatchEvent('event9')
!event9.eventType := #GOAL
!event9.time := 53
!insert (match3, event9) into MatchMatchEvent

!new MatchEvent('event10')
!event10.eventType := #GOAL
!event10.time := 67
!insert (match3, event10) into MatchMatchEvent

!new MatchEvent('event11')
!event11.eventType := #GOAL
!event11.time := 84
!insert (match3, event11) into MatchMatchEvent

!new MatchNote('matchNote3')
!matchNote3.note := 'Thrilling draw between Hawks and Wolves'
!matchNote3.date := '2023-11-18'
!insert (match3, matchNote3) into MatchMatchNote
```
## Generation 3 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 131 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 4
```
!new Club('club7')
!club7.name := 'Eagles FC'
!club7.homeGround := 'Eagle Nest Stadium'
!club7.chairman := 'James Perry'

!new Club('club8')
!club8.name := 'Panthers Club'
!club8.homeGround := 'Panther Park'
!club8.chairman := 'Laura Bennett'

!new Team('team7')
!team7.name := 'Eagle Grasp'
!insert (club7, team7) into ClubTeam

!new Team('team8')
!team8.name := 'Panther Pounce'
!insert (club8, team8) into ClubTeam

!new Player('player10')
!player10.name := 'Liam Johnson'
!player10.age := 29
!player10.bestFoot := #BOTH
!player10.phoneNumber := '112-334-5566'
!insert (team7, player10) into TeamPlayer

!new Player('player11')
!player11.name := 'Emma Wilson'
!player11.age := 24
!player11.bestFoot := #LEFT
!player11.phoneNumber := '223-445-6677'
!insert (team7, player11) into TeamPlayer

!new Player('player12')
!player12.name := 'Olivia Jones'
!player12.age := 25
!player12.bestFoot := #RIGHT
!player12.phoneNumber := '334-556-7788'
!insert (team8, player12) into TeamPlayer

!new Position('position10')
!position10.positionName := #FORWARD
!insert (player10, position10) into PlayerPositions

!new Position('position11')
!position11.positionName := #DEFENDER
!insert (player11, position11) into PlayerPositions

!new Position('position12')
!position12.positionName := #MIDFIELDER
!insert (player12, position12) into PlayerPositions

!new TrainingSession('training7')
!training7.date := '2023-11-03'
!training7.location := 'Eagle Training Complex'
!training7.purpose := 'Stamina Building'
!insert (team7, training7) into TeamTraining

!new TrainingSession('training8')
!training8.date := '2023-11-04'
!training8.location := 'Panther Development Ground'
!training8.purpose := 'Tactical Awareness'
!insert (team8, training8) into TeamTraining

!new TrainingNotes('trainingNotes7')
!trainingNotes7.note := 'Endurance and stamina were the main focus'
!trainingNotes7.date := '2023-11-03'
!insert (training7, trainingNotes7) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes8')
!trainingNotes8.note := 'Worked on improving tactical decision-making'
!trainingNotes8.date := '2023-11-04'
!insert (training8, trainingNotes8) into TrainingTrainingNotes

!new TrainingObjective('objective10')
!objective10.areaToImprove := 'Endurance'
!objective10.startDate := '2023-10-01'
!objective10.endDate := '2023-12-01'
!objective10.success := true
!insert (objective10, player10) into TrainingObjectivePlayer

!new TrainingObjective('objective11')
!objective11.areaToImprove := 'Defensive Strategy'
!objective11.startDate := '2023-09-20'
!objective11.endDate := '2023-11-20'
!objective11.success := false
!insert (objective11, player11) into TrainingObjectivePlayer

!new TrainingObjective('objective12')
!objective12.areaToImprove := 'Speed'
!objective12.startDate := '2023-08-10'
!objective12.endDate := '2023-11-10'
!objective12.success := true
!insert (objective12, player12) into TrainingObjectivePlayer

!new Competition('competition4')
!competition4.name := 'Super Cup'
!competition4.type := 'Tournament'

!new Match('match4')
!match4.date := '2023-11-25'
!match4.homeAway := true
!insert (competition4, match4) into CompetitionMatch
!insert (team7, match4) into LocalMatch
!insert (team8, match4) into VisitorMatch

!new MatchReport('report4')
!report4.duration := 90
!report4.scoreVisitor := 1
!report4.scoreLocal := 3
!insert (match4, report4) into MatchMatchReport

!new MatchPlayer('matchPlayer10')
!matchPlayer10.booked := false
!matchPlayer10.goals := 2
!matchPlayer10.rating := 9
!insert (player10, matchPlayer10) into PlayerMatch
!insert (match4, matchPlayer10) into MatchMatchPlayer

!new MatchPlayer('matchPlayer12')
!matchPlayer12.booked := true
!matchPlayer12.goals := 1
!matchPlayer12.rating := 7
!insert (player12, matchPlayer12) into PlayerMatch
!insert (match4, matchPlayer12) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition10')
!matchPlayerPosition10.positionName := #FORWARD
!matchPlayerPosition10.number := 10
!insert (matchPlayer10, matchPlayerPosition10) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition12')
!matchPlayerPosition12.positionName := #MIDFIELDER
!matchPlayerPosition12.number := 8
!insert (matchPlayer12, matchPlayerPosition12) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event12')
!event12.eventType := #GOAL
!event12.time := 20
!insert (match4, event12) into MatchMatchEvent

!new MatchEvent('event13')
!event13.eventType := #GOAL
!event13.time := 40
!insert (match4, event13) into MatchMatchEvent

!new MatchEvent('event14')
!event14.eventType := #GOAL
!event14.time := 65
!insert (match4, event14) into MatchMatchEvent

!new MatchEvent('event15')
!event15.eventType := #GOAL
!event15.time := 88
!insert (match4, event15) into MatchMatchEvent

!new MatchNote('matchNote4')
!matchNote4.note := 'Eagles FC displayed dominant offensive play'
!matchNote4.date := '2023-11-25'
!insert (match4, matchNote4) into MatchMatchNote
```
## Generation 4 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 131 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 5
```
!new Club('club9')
!club9.name := 'Sharks United'
!club9.homeGround := 'Shark Bay Stadium'
!club9.chairman := 'George Harris'

!new Club('club10')
!club10.name := 'Rhinos FC'
!club10.homeGround := 'Rhino Dome'
!club10.chairman := 'Catherine Lewis'

!new Team('team9')
!team9.name := 'Shark Strikers'
!insert (club9, team9) into ClubTeam

!new Team('team10')
!team10.name := 'Rhino Rampage'
!insert (club10, team10) into ClubTeam

!new Player('player13')
!player13.name := 'Chris Baker'
!player13.age := 32
!player13.bestFoot := #BOTH
!player13.phoneNumber := '010-123-4567'
!insert (team9, player13) into TeamPlayer

!new Player('player14')
!player14.name := 'Alex Hunter'
!player14.age := 27
!player14.bestFoot := #LEFT
!player14.phoneNumber := '020-234-5678'
!insert (team9, player14) into TeamPlayer

!new Player('player15')
!player15.name := 'Sandra Black'
!player15.age := 22
!player15.bestFoot := #RIGHT
!player15.phoneNumber := '030-345-6789'
!insert (team10, player15) into TeamPlayer

!new Position('position13')
!position13.positionName := #GOALKEEPER
!insert (player13, position13) into PlayerPositions

!new Position('position14')
!position14.positionName := #MIDFIELDER
!insert (player14, position14) into PlayerPositions

!new Position('position15')
!position15.positionName := #DEFENDER
!insert (player15, position15) into PlayerPositions

!new TrainingSession('training9')
!training9.date := '2023-11-05'
!training9.location := 'Shark Training Grounds'
!training9.purpose := 'Team Coordination'
!insert (team9, training9) into TeamTraining

!new TrainingSession('training10')
!training10.date := '2023-11-06'
!training10.location := 'Rhino Training Complex'
!training10.purpose := 'Strength Conditioning'
!insert (team10, training10) into TeamTraining

!new TrainingNotes('trainingNotes9')
!trainingNotes9.note := 'Improved synchronization among teammates'
!trainingNotes9.date := '2023-11-05'
!insert (training9, trainingNotes9) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes10')
!trainingNotes10.note := 'Focused on building physical strength'
!trainingNotes10.date := '2023-11-06'
!insert (training10, trainingNotes10) into TrainingTrainingNotes

!new TrainingObjective('objective13')
!objective13.areaToImprove := 'Coordination'
!objective13.startDate := '2023-10-15'
!objective13.endDate := '2023-12-15'
!objective13.success := true
!insert (objective13, player13) into TrainingObjectivePlayer

!new TrainingObjective('objective14')
!objective14.areaToImprove := 'Ball Handling'
!objective14.startDate := '2023-09-10'
!objective14.endDate := '2023-11-10'
!objective14.success := false
!insert (objective14, player14) into TrainingObjectivePlayer

!new TrainingObjective('objective15')
!objective15.areaToImprove := 'Defensive Agility'
!objective15.startDate := '2023-08-01'
!objective15.endDate := '2023-10-30'
!objective15.success := true
!insert (objective15, player15) into TrainingObjectivePlayer

!new Competition('competition5')
!competition5.name := 'Intercontinental Cup'
!competition5.type := 'Knockout Stage'

!new Match('match5')
!match5.date := '2023-12-01'
!match5.homeAway := false
!insert (competition5, match5) into CompetitionMatch
!insert (team9, match5) into LocalMatch
!insert (team10, match5) into VisitorMatch

!new MatchReport('report5')
!report5.duration := 120
!report5.scoreVisitor := 2
!report5.scoreLocal := 2
!insert (match5, report5) into MatchMatchReport

!new MatchPlayer('matchPlayer13')
!matchPlayer13.booked := true
!matchPlayer13.goals := 0
!matchPlayer13.rating := 6
!insert (player13, matchPlayer13) into PlayerMatch
!insert (match5, matchPlayer13) into MatchMatchPlayer

!new MatchPlayer('matchPlayer15')
!matchPlayer15.booked := false
!matchPlayer15.goals := 1
!matchPlayer15.rating := 8
!insert (player15, matchPlayer15) into PlayerMatch
!insert (match5, matchPlayer15) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition13')
!matchPlayerPosition13.positionName := #GOALKEEPER
!matchPlayerPosition13.number := 1
!insert (matchPlayer13, matchPlayerPosition13) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition15')
!matchPlayerPosition15.positionName := #DEFENDER
!matchPlayerPosition15.number := 3
!insert (matchPlayer15, matchPlayerPosition15) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event16')
!event16.eventType := #GOAL
!event16.time := 30
!insert (match5, event16) into MatchMatchEvent

!new MatchEvent('event17')
!event17.eventType := #GOAL
!event17.time := 70
!insert (match5, event17) into MatchMatchEvent

!new MatchEvent('event18')
!event18.eventType := #GOAL
!event18.time := 95
!insert (match5, event18) into MatchMatchEvent

!new MatchEvent('event19')
!event19.eventType := #GOAL
!event19.time := 115
!insert (match5, event19) into MatchMatchEvent

!new MatchNote('matchNote5')
!matchNote5.note := 'Intense match ending in penalty shootout'
!matchNote5.date := '2023-12-01'
!insert (match5, matchNote5) into MatchMatchNote
```
## Generation 5 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 131 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 6
```
!new Club('club11')
!club11.name := 'Dragons FC'
!club11.homeGround := 'Dragon Lair Stadium'
!club11.chairman := 'Victoria Clark'

!new Club('club12')
!club12.name := 'Phoenix FC'
!club12.homeGround := 'Phoenix Nest'
!club12.chairman := 'Daniel Edwards'

!new Team('team11')
!team11.name := 'Dragon Flames'
!insert (club11, team11) into ClubTeam

!new Team('team12')
!team12.name := 'Phoenix Wings'
!insert (club12, team12) into ClubTeam

!new Player('player16')
!player16.name := 'Jordan Miles'
!player16.age := 30
!player16.bestFoot := #RIGHT
!player16.phoneNumber := '045-678-9101'
!insert (team11, player16) into TeamPlayer

!new Player('player17')
!player17.name := 'Blake Foster'
!player17.age := 25
!player17.bestFoot := #BOTH
!player17.phoneNumber := '056-789-0112'
!insert (team11, player17) into TeamPlayer

!new Player('player18')
!player18.name := 'Taylor Kim'
!player18.age := 28
!player18.bestFoot := #LEFT
!player18.phoneNumber := '067-890-1234'
!insert (team12, player18) into TeamPlayer

!new Position('position16')
!position16.positionName := #FORWARD
!insert (player16, position16) into PlayerPositions

!new Position('position17')
!position17.positionName := #MIDFIELDER
!insert (player17, position17) into PlayerPositions

!new Position('position18')
!position18.positionName := #GOALKEEPER
!insert (player18, position18) into PlayerPositions

!new TrainingSession('training11')
!training11.date := '2023-11-10'
!training11.location := 'Dragon Training Grounds'
!training11.purpose := 'Speed Drills'
!insert (team11, training11) into TeamTraining

!new TrainingSession('training12')
!training12.date := '2023-11-11'
!training12.location := 'Phoenix Practice Arena'
!training12.purpose := 'Team Dynamics'
!insert (team12, training12) into TeamTraining

!new TrainingNotes('trainingNotes11')
!trainingNotes11.note := 'Focused on improving sprint times'
!trainingNotes11.date := '2023-11-10'
!insert (training11, trainingNotes11) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes12')
!trainingNotes12.note := 'Emphasized on cohesive team play'
!trainingNotes12.date := '2023-11-11'
!insert (training12, trainingNotes12) into TrainingTrainingNotes

!new TrainingObjective('objective16')
!objective16.areaToImprove := 'Sprint Speed'
!objective16.startDate := '2023-09-01'
!objective16.endDate := '2023-11-30'
!objective16.success := false
!insert (objective16, player16) into TrainingObjectivePlayer

!new TrainingObjective('objective17')
!objective17.areaToImprove := 'Tactical Awareness'
!objective17.startDate := '2023-08-15'
!objective17.endDate := '2023-10-15'
!objective17.success := true
!insert (objective17, player17) into TrainingObjectivePlayer

!new TrainingObjective('objective18')
!objective18.areaToImprove := 'Reaction Time'
!objective18.startDate := '2023-07-10'
!objective18.endDate := '2023-10-10'
!objective18.success := false
!insert (objective18, player18) into TrainingObjectivePlayer

!new Competition('competition6')
!competition6.name := 'Continental Cup'
!competition6.type := 'Group Stage'

!new Match('match6')
!match6.date := '2023-11-21'
!match6.homeAway := true
!insert (competition6, match6) into CompetitionMatch
!insert (team11, match6) into LocalMatch
!insert (team12, match6) into VisitorMatch

!new MatchReport('report6')
!report6.duration := 90
!report6.scoreVisitor := 1
!report6.scoreLocal := 3
!insert (match6, report6) into MatchMatchReport

!new MatchPlayer('matchPlayer16')
!matchPlayer16.booked := false
!matchPlayer16.goals := 1
!matchPlayer16.rating := 8
!insert (player16, matchPlayer16) into PlayerMatch
!insert (match6, matchPlayer16) into MatchMatchPlayer

!new MatchPlayer('matchPlayer18')
!matchPlayer18.booked := true
!matchPlayer18.goals := 1
!matchPlayer18.rating := 7
!insert (player18, matchPlayer18) into PlayerMatch
!insert (match6, matchPlayer18) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition16')
!matchPlayerPosition16.positionName := #FORWARD
!matchPlayerPosition16.number := 9
!insert (matchPlayer16, matchPlayerPosition16) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition18')
!matchPlayerPosition18.positionName := #GOALKEEPER
!matchPlayerPosition18.number := 1
!insert (matchPlayer18, matchPlayerPosition18) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event20')
!event20.eventType := #GOAL
!event20.time := 10
!insert (match6, event20) into MatchMatchEvent

!new MatchEvent('event21')
!event21.eventType := #GOAL
!event21.time := 35
!insert (match6, event21) into MatchMatchEvent

!new MatchEvent('event22')
!event22.eventType := #GOAL
!event22.time := 67
!insert (match6, event22) into MatchMatchEvent

!new MatchEvent('event23')
!event23.eventType := #GOAL
!event23.time := 80
!insert (match6, event23) into MatchMatchEvent

!new MatchNote('matchNote6')
!matchNote6.note := 'Dragons FC showed excellent performance with quick goals'
!matchNote6.date := '2023-11-21'
!insert (match6, matchNote6) into MatchMatchNote
```
## Generation 6 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 131 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 7
```
!new Club('club13')
!club13.name := 'Heroes United'
!club13.homeGround := 'Heroes Stadium'
!club13.chairman := 'Nancy King'

!new Club('club14')
!club14.name := 'Titans FC'
!club14.homeGround := 'Titan Fortress'
!club14.chairman := 'Andrew Stone'

!new Team('team13')
!team13.name := 'Heroic Squad'
!insert (club13, team13) into ClubTeam

!new Team('team14')
!team14.name := 'Titan Warriors'
!insert (club14, team14) into ClubTeam

!new Player('player19')
!player19.name := 'Zara Patel'
!player19.age := 23
!player19.bestFoot := #LEFT
!player19.phoneNumber := '123-678-9012'
!insert (team13, player19) into TeamPlayer

!new Player('player20')
!player20.name := 'Lucas Green'
!player20.age := 31
!player20.bestFoot := #BOTH
!player20.phoneNumber := '234-789-0123'
!insert (team13, player20) into TeamPlayer

!new Player('player21')
!player21.name := 'Maya Spencer'
!player21.age := 27
!player21.bestFoot := #RIGHT
!player21.phoneNumber := '345-890-1234'
!insert (team14, player21) into TeamPlayer

!new Position('position19')
!position19.positionName := #DEFENDER
!insert (player19, position19) into PlayerPositions

!new Position('position20')
!position20.positionName := #FORWARD
!insert (player20, position20) into PlayerPositions

!new Position('position21')
!position21.positionName := #MIDFIELDER
!insert (player21, position21) into PlayerPositions

!new TrainingSession('training13')
!training13.date := '2023-11-07'
!training13.location := 'Hero Training Zone'
!training13.purpose := 'Passing Efficiency'
!insert (team13, training13) into TeamTraining

!new TrainingSession('training14')
!training14.date := '2023-11-08'
!training14.location := 'Titan Gym'
!training14.purpose := 'Strength Building'
!insert (team14, training14) into TeamTraining

!new TrainingNotes('trainingNotes13')
!trainingNotes13.note := 'Players focused on improving pass accuracy'
!trainingNotes13.date := '2023-11-07'
!insert (training13, trainingNotes13) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes14')
!trainingNotes14.note := 'Strength and conditioning were the key focus areas'
!trainingNotes14.date := '2023-11-08'
!insert (training14, trainingNotes14) into TrainingTrainingNotes

!new TrainingObjective('objective19')
!objective19.areaToImprove := 'Pass Accuracy'
!objective19.startDate := '2023-10-05'
!objective19.endDate := '2023-12-05'
!objective19.success := false
!insert (objective19, player19) into TrainingObjectivePlayer

!new TrainingObjective('objective20')
!objective20.areaToImprove := 'Scoring'
!objective20.startDate := '2023-09-20'
!objective20.endDate := '2023-11-20'
!objective20.success := true
!insert (objective20, player20) into TrainingObjectivePlayer

!new TrainingObjective('objective21')
!objective21.areaToImprove := 'Stamina'
!objective21.startDate := '2023-08-12'
!objective21.endDate := '2023-10-25'
!objective21.success := true
!insert (objective21, player21) into TrainingObjectivePlayer

!new Competition('competition7')
!competition7.name := 'Galaxy League'
!competition7.type := 'League'

!new Match('match7')
!match7.date := '2023-11-28'
!match7.homeAway := true
!insert (competition7, match7) into CompetitionMatch
!insert (team13, match7) into LocalMatch
!insert (team14, match7) into VisitorMatch

!new MatchReport('report7')
!report7.duration := 90
!report7.scoreVisitor := 1
!report7.scoreLocal := 2
!insert (match7, report7) into MatchMatchReport

!new MatchPlayer('matchPlayer19')
!matchPlayer19.booked := false
!matchPlayer19.goals := 1
!matchPlayer19.rating := 8
!insert (player19, matchPlayer19) into PlayerMatch
!insert (match7, matchPlayer19) into MatchMatchPlayer

!new MatchPlayer('matchPlayer20')
!matchPlayer20.booked := false
!matchPlayer20.goals := 1
!matchPlayer20.rating := 9
!insert (player20, matchPlayer20) into PlayerMatch
!insert (match7, matchPlayer20) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition19')
!matchPlayerPosition19.positionName := #DEFENDER
!matchPlayerPosition19.number := 4
!insert (matchPlayer19, matchPlayerPosition19) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition20')
!matchPlayerPosition20.positionName := #FORWARD
!matchPlayerPosition20.number := 10
!insert (matchPlayer20, matchPlayerPosition20) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event24')
!event24.eventType := #GOAL
!event24.time := 15
!insert (match7, event24) into MatchMatchEvent

!new MatchEvent('event25')
!event25.eventType := #GOAL
!event25.time := 50
!insert (match7, event25) into MatchMatchEvent

!new MatchEvent('event26')
!event26.eventType := #GOAL
!event26.time := 70
!insert (match7, event26) into MatchMatchEvent

!new MatchNote('matchNote7')
!matchNote7.note := 'Heroic Squad showed resilience and strong defense'
!matchNote7.date := '2023-11-28'
!insert (match7, matchNote7) into MatchMatchNote
```
## Generation 7 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 127 | 0.00% |
| Multiplicities Errors | 0 | 29 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 8
```
!new Club('club15')
!club15.name := 'Wanderers FC'
!club15.homeGround := 'Wanderers Arena'
!club15.chairman := 'Emma Knight'

!new Club('club16')
!club16.name := 'Mavericks FC'
!club16.homeGround := 'Maverick Dome'
!club16.chairman := 'Liam Peterson'

!new Team('team15')
!team15.name := 'Wandering Stars'
!insert (club15, team15) into ClubTeam

!new Team('team16')
!team16.name := 'Maverick Rangers'
!insert (club16, team16) into ClubTeam

!new Player('player22')
!player22.name := 'Oliver Scott'
!player22.age := 35
!player22.bestFoot := #RIGHT
!player22.phoneNumber := '456-789-1011'
!insert (team15, player22) into TeamPlayer

!new Player('player23')
!player23.name := 'Grace Lee'
!player23.age := 29
!player23.bestFoot := #LEFT
!player23.phoneNumber := '567-890-1122'
!insert (team15, player23) into TeamPlayer

!new Player('player24')
!player24.name := 'Ryan Adams'
!player24.age := 26
!player24.bestFoot := #BOTH
!player24.phoneNumber := '678-901-2233'
!insert (team16, player24) into TeamPlayer

!new Position('position22')
!position22.positionName := #GOALKEEPER
!insert (player22, position22) into PlayerPositions

!new Position('position23')
!position23.positionName := #DEFENDER
!insert (player23, position23) into PlayerPositions

!new Position('position24')
!position24.positionName := #FORWARD
!insert (player24, position24) into PlayerPositions

!new TrainingSession('training15')
!training15.date := '2023-11-15'
!training15.location := 'Wanderer Training Field'
!training15.purpose := 'Goalkeeping Technique'
!insert (team15, training15) into TeamTraining

!new TrainingSession('training16')
!training16.date := '2023-11-16'
!training16.location := 'Maverick Practice Grounds'
!training16.purpose := 'Offensive Drills'
!insert (team16, training16) into TeamTraining

!new TrainingNotes('trainingNotes15')
!trainingNotes15.note := 'Enhanced shot-stopping skills for goalkeepers'
!trainingNotes15.date := '2023-11-15'
!insert (training15, trainingNotes15) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes16')
!trainingNotes16.note := 'Focused on quick transition attacks'
!trainingNotes16.date := '2023-11-16'
!insert (training16, trainingNotes16) into TrainingTrainingNotes

!new TrainingObjective('objective22')
!objective22.areaToImprove := 'Reaction Time'
!objective22.startDate := '2023-09-01'
!objective22.endDate := '2023-11-30'
!objective22.success := true
!insert (objective22, player22) into TrainingObjectivePlayer

!new TrainingObjective('objective23')
!objective23.areaToImprove := 'Defensive Positioning'
!objective23.startDate := '2023-08-15'
!objective23.endDate := '2023-10-15'
!objective23.success := false
!insert (objective23, player23) into TrainingObjectivePlayer

!new TrainingObjective('objective24')
!objective24.areaToImprove := 'Finishing'
!objective24.startDate := '2023-07-10'
!objective24.endDate := '2023-10-10'
!objective24.success := true
!insert (objective24, player24) into TrainingObjectivePlayer

!new Competition('competition8')
!competition8.name := 'World Club Championship'
!competition8.type := 'Tournament'

!new Match('match8')
!match8.date := '2023-12-05'
!match8.homeAway := false
!insert (competition8, match8) into CompetitionMatch
!insert (team15, match8) into LocalMatch
!insert (team16, match8) into VisitorMatch

!new MatchReport('report8')
!report8.duration := 90
!report8.scoreVisitor := 3
!report8.scoreLocal := 3
!insert (match8, report8) into MatchMatchReport

!new MatchPlayer('matchPlayer22')
!matchPlayer22.booked := false
!matchPlayer22.goals := 0
!matchPlayer22.rating := 7
!insert (player22, matchPlayer22) into PlayerMatch
!insert (match8, matchPlayer22) into MatchMatchPlayer

!new MatchPlayer('matchPlayer24')
!matchPlayer24.booked := false
!matchPlayer24.goals := 2
!matchPlayer24.rating := 9
!insert (player24, matchPlayer24) into PlayerMatch
!insert (match8, matchPlayer24) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition22')
!matchPlayerPosition22.positionName := #GOALKEEPER
!matchPlayerPosition22.number := 1
!insert (matchPlayer22, matchPlayerPosition22) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition24')
!matchPlayerPosition24.positionName := #FORWARD
!matchPlayerPosition24.number := 9
!insert (matchPlayer24, matchPlayerPosition24) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event28')
!event28.eventType := #GOAL
!event28.time := 18
!insert (match8, event28) into MatchMatchEvent

!new MatchEvent('event29')
!event29.eventType := #GOAL
!event29.time := 30
!insert (match8, event29) into MatchMatchEvent

!new MatchEvent('event30')
!event30.eventType := #GOAL
!event30.time := 45
!insert (match8, event30) into MatchMatchEvent

!new MatchEvent('event31')
!event31.eventType := #GOAL
!event31.time := 65
!insert (match8, event31) into MatchMatchEvent

!new MatchEvent('event32')
!event32.eventType := #GOAL
!event32.time := 73
!insert (match8, event32) into MatchMatchEvent

!new MatchEvent('event33')
!event33.eventType := #GOAL
!event33.time := 85
!insert (match8, event33) into MatchMatchEvent

!new MatchNote('matchNote8')
!matchNote8.note := 'Dramatic draw with goals scored at both ends'
!matchNote8.date := '2023-12-05'
!insert (match8, matchNote8) into MatchMatchNote
```
## Generation 8 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 139 | 0.00% |
| Multiplicities Errors | 0 | 32 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 9
```
!new Club('club17')
!club17.name := 'Vikings FC'
!club17.homeGround := 'Viking Ground'
!club17.chairman := 'Alice Thompson'

!new Club('club18')
!club18.name := 'Royals FC'
!club18.homeGround := 'Royal Palace Stadium'
!club18.chairman := 'Henry Williams'

!new Team('team17')
!team17.name := 'Viking Raiders'
!insert (club17, team17) into ClubTeam

!new Team('team18')
!team18.name := 'Royal Knights'
!insert (club18, team18) into ClubTeam

!new Player('player25')
!player25.name := 'Aiden Clarke'
!player25.age := 28
!player25.bestFoot := #RIGHT
!player25.phoneNumber := '101-234-5678'
!insert (team17, player25) into TeamPlayer

!new Player('player26')
!player26.name := 'Sophia Young'
!player26.age := 26
!player26.bestFoot := #LEFT
!player26.phoneNumber := '202-345-6789'
!insert (team17, player26) into TeamPlayer

!new Player('player27')
!player27.name := 'Ethan Bell'
!player27.age := 29
!player27.bestFoot := #BOTH
!player27.phoneNumber := '303-456-7890'
!insert (team18, player27) into TeamPlayer

!new Position('position25')
!position25.positionName := #FORWARD
!insert (player25, position25) into PlayerPositions

!new Position('position26')
!position26.positionName := #DEFENDER
!insert (player26, position26) into PlayerPositions

!new Position('position27')
!position27.positionName := #MIDFIELDER
!insert (player27, position27) into PlayerPositions

!new TrainingSession('training17')
!training17.date := '2023-11-20'
!training17.location := 'Viking Fortress'
!training17.purpose := 'Tactical Practice'
!insert (team17, training17) into TeamTraining

!new TrainingSession('training18')
!training18.date := '2023-11-21'
!training18.location := 'Royal Fields'
!training18.purpose := 'Endurance Training'
!insert (team18, training18) into TeamTraining

!new TrainingNotes('trainingNotes17')
!trainingNotes17.note := 'Focused on strategic positioning and passing'
!trainingNotes17.date := '2023-11-20'
!insert (training17, trainingNotes17) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes18')
!trainingNotes18.note := 'Included high-intensity interval runs'
!trainingNotes18.date := '2023-11-21'
!insert (training18, trainingNotes18) into TrainingTrainingNotes

!new TrainingObjective('objective25')
!objective25.areaToImprove := 'Vision on the Field'
!objective25.startDate := '2023-10-01'
!objective25.endDate := '2023-12-01'
!objective25.success := true
!insert (objective25, player25) into TrainingObjectivePlayer

!new TrainingObjective('objective26')
!objective26.areaToImprove := 'Marking Technique'
!objective26.startDate := '2023-09-15'
!objective26.endDate := '2023-11-15'
!objective26.success := false
!insert (objective26, player26) into TrainingObjectivePlayer

!new TrainingObjective('objective27')
!objective27.areaToImprove := 'Dribbling Skills'
!objective27.startDate := '2023-08-10'
!objective27.endDate := '2023-10-10'
!objective27.success := true
!insert (objective27, player27) into TrainingObjectivePlayer

!new Competition('competition9')
!competition9.name := 'Premier Tournament'
!competition9.type := 'Elimination Round'

!new Match('match9')
!match9.date := '2023-12-10'
!match9.homeAway := true
!insert (competition9, match9) into CompetitionMatch
!insert (team17, match9) into LocalMatch
!insert (team18, match9) into VisitorMatch

!new MatchReport('report9')
!report9.duration := 90
!report9.scoreVisitor := 0
!report9.scoreLocal := 2
!insert (match9, report9) into MatchMatchReport

!new MatchPlayer('matchPlayer25')
!matchPlayer25.booked := false
!matchPlayer25.goals := 1
!matchPlayer25.rating := 9
!insert (player25, matchPlayer25) into PlayerMatch
!insert (match9, matchPlayer25) into MatchMatchPlayer

!new MatchPlayer('matchPlayer26')
!matchPlayer26.booked := false
!matchPlayer26.goals := 0
!matchPlayer26.rating := 8
!insert (player26, matchPlayer26) into PlayerMatch
!insert (match9, matchPlayer26) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition25')
!matchPlayerPosition25.positionName := #FORWARD
!matchPlayerPosition25.number := 11
!insert (matchPlayer25, matchPlayerPosition25) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition26')
!matchPlayerPosition26.positionName := #DEFENDER
!matchPlayerPosition26.number := 5
!insert (matchPlayer26, matchPlayerPosition26) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event34')
!event34.eventType := #GOAL
!event34.time := 12
!insert (match9, event34) into MatchMatchEvent

!new MatchEvent('event35')
!event35.eventType := #GOAL
!event35.time := 77
!insert (match9, event35) into MatchMatchEvent

!new MatchNote('matchNote9')
!matchNote9.note := 'Viking Raiders displayed excellent defensive and offensive balance'
!matchNote9.date := '2023-12-10'
!insert (match9, matchNote9) into MatchMatchNote
```
## Generation 9 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 123 | 0.00% |
| Multiplicities Errors | 0 | 28 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 10
```
!new Club('club19')
!club19.name := 'Falcons FC'
!club19.homeGround := 'Falcon Grounds'
!club19.chairman := 'Richard Harris'

!new Club('club20')
!club20.name := 'Hawks FC'
!club20.homeGround := 'Hawk Nest Stadium'
!club20.chairman := 'Grace Evans'

!new Team('team19')
!team19.name := 'Falcon Flyers'
!insert (club19, team19) into ClubTeam

!new Team('team20')
!team20.name := 'Hawk Hunters'
!insert (club20, team20) into ClubTeam

!new Player('player28')
!player28.name := 'Liam Howard'
!player28.age := 24
!player28.bestFoot := #RIGHT
!player28.phoneNumber := '404-567-8901'
!insert (team19, player28) into TeamPlayer

!new Player('player29')
!player29.name := 'Emma Johnson'
!player29.age := 22
!player29.bestFoot := #BOTH
!player29.phoneNumber := '505-678-9012'
!insert (team19, player29) into TeamPlayer

!new Player('player30')
!player30.name := 'Ethan Richards'
!player30.age := 31
!player30.bestFoot := #LEFT
!player30.phoneNumber := '606-789-0123'
!insert (team20, player30) into TeamPlayer

!new Position('position28')
!position28.positionName := #MIDFIELDER
!insert (player28, position28) into PlayerPositions

!new Position('position29')
!position29.positionName := #FORWARD
!insert (player29, position29) into PlayerPositions

!new Position('position30')
!position30.positionName := #DEFENDER
!insert (player30, position30) into PlayerPositions

!new TrainingSession('training19')
!training19.date := '2023-11-25'
!training19.location := 'Falcon Training Facility'
!training19.purpose := 'Tactical Analysis'
!insert (team19, training19) into TeamTraining

!new TrainingSession('training20')
!training20.date := '2023-11-26'
!training20.location := 'Hawk Flight Academy'
!training20.purpose := 'Speed Endurance'
!insert (team20, training20) into TeamTraining

!new TrainingNotes('trainingNotes19')
!trainingNotes19.note := 'Reviewed match strategies and defensive formations'
!trainingNotes19.date := '2023-11-25'
!insert (training19, trainingNotes19) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes20')
!trainingNotes20.note := 'Focused on long-distance sprints and recovery'
!trainingNotes20.date := '2023-11-26'
!insert (training20, trainingNotes20) into TrainingTrainingNotes

!new TrainingObjective('objective28')
!objective28.areaToImprove := 'Game Vision'
!objective28.startDate := '2023-09-05'
!objective28.endDate := '2023-11-25'
!objective28.success := true
!insert (objective28, player28) into TrainingObjectivePlayer

!new TrainingObjective('objective29')
!objective29.areaToImprove := 'Attacking Prowess'
!objective29.startDate := '2023-08-20'
!objective29.endDate := '2023-10-20'
!objective29.success := false
!insert (objective29, player29) into TrainingObjectivePlayer

!new TrainingObjective('objective30')
!objective30.areaToImprove := 'Defensive Skills'
!objective30.startDate := '2023-07-15'
!objective30.endDate := '2023-10-15'
!objective30.success := true
!insert (objective30, player30) into TrainingObjectivePlayer

!new Competition('competition10')
!competition10.name := 'International Club Cup'
!competition10.type := 'Group Stage'

!new Match('match10')
!match10.date := '2023-12-15'
!match10.homeAway := false
!insert (competition10, match10) into CompetitionMatch
!insert (team19, match10) into VisitorMatch
!insert (team20, match10) into LocalMatch

!new MatchReport('report10')
!report10.duration := 90
!report10.scoreVisitor := 2
!report10.scoreLocal := 2
!insert (match10, report10) into MatchMatchReport

!new MatchPlayer('matchPlayer28')
!matchPlayer28.booked := true
!matchPlayer28.goals := 1
!matchPlayer28.rating := 8
!insert (player28, matchPlayer28) into PlayerMatch
!insert (match10, matchPlayer28) into MatchMatchPlayer

!new MatchPlayer('matchPlayer30')
!matchPlayer30.booked := false
!matchPlayer30.goals := 0
!matchPlayer30.rating := 7
!insert (player30, matchPlayer30) into PlayerMatch
!insert (match10, matchPlayer30) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition28')
!matchPlayerPosition28.positionName := #MIDFIELDER
!matchPlayerPosition28.number := 8
!insert (matchPlayer28, matchPlayerPosition28) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition30')
!matchPlayerPosition30.positionName := #DEFENDER
!matchPlayerPosition30.number := 4
!insert (matchPlayer30, matchPlayerPosition30) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event36')
!event36.eventType := #GOAL
!event36.time := 22
!insert (match10, event36) into MatchMatchEvent

!new MatchEvent('event37')
!event37.eventType := #GOAL
!event37.time := 47
!insert (match10, event37) into MatchMatchEvent

!new MatchEvent('event38')
!event38.eventType := #GOAL
!event38.time := 65
!insert (match10, event38) into MatchMatchEvent

!new MatchEvent('event39')
!event39.eventType := #GOAL
!event39.time := 85
!insert (match10, event39) into MatchMatchEvent

!new MatchNote('matchNote10')
!matchNote10.note := 'Thrilling match with both teams showing strong form'
!matchNote10.date := '2023-12-15'
!insert (match10, matchNote10) into MatchMatchNote
```
## Generation 10 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 131 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 11
```
!new Club('club21')
!club21.name := 'Comets FC'
!club21.homeGround := 'Comet Stadium'
!club21.chairman := 'Diana Roberts'

!new Club('club22')
!club22.name := 'Asteroids FC'
!club22.homeGround := 'Asteroid Arena'
!club22.chairman := 'Thomas Clark'

!new Team('team21')
!team21.name := 'Comet Chasers'
!insert (club21, team21) into ClubTeam

!new Team('team22')
!team22.name := 'Asteroid Avengers'
!insert (club22, team22) into ClubTeam

!new Player('player31')
!player31.name := 'Ryan Matthews'
!player31.age := 27
!player31.bestFoot := #LEFT
!player31.phoneNumber := '707-234-5678'
!insert (team21, player31) into TeamPlayer

!new Player('player32')
!player32.name := 'Sophia Turner'
!player32.age := 28
!player32.bestFoot := #RIGHT
!player32.phoneNumber := '808-345-6789'
!insert (team21, player32) into TeamPlayer

!new Player('player33')
!player33.name := 'James Carter'
!player33.age := 26
!player33.bestFoot := #BOTH
!player33.phoneNumber := '909-456-7890'
!insert (team22, player33) into TeamPlayer

!new Position('position31')
!position31.positionName := #DEFENDER
!insert (player31, position31) into PlayerPositions

!new Position('position32')
!position32.positionName := #FORWARD
!insert (player32, position32) into PlayerPositions

!new Position('position33')
!position33.positionName := #MIDFIELDER
!insert (player33, position33) into PlayerPositions

!new TrainingSession('training21')
!training21.date := '2023-12-01'
!training21.location := 'Comet Training Center'
!training21.purpose := 'Defensive Strategies'
!insert (team21, training21) into TeamTraining

!new TrainingSession('training22')
!training22.date := '2023-12-02'
!training22.location := 'Asteroid Field'
!training22.purpose := 'Attack Dynamics'
!insert (team22, training22) into TeamTraining

!new TrainingNotes('trainingNotes21')
!trainingNotes21.note := 'Enhanced defensive tactics against fast break plays'
!trainingNotes21.date := '2023-12-01'
!insert (training21, trainingNotes21) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes22')
!trainingNotes22.note := 'Practiced offensive movements and finishing'
!trainingNotes22.date := '2023-12-02'
!insert (training22, trainingNotes22) into TrainingTrainingNotes

!new TrainingObjective('objective31')
!objective31.areaToImprove := 'Defensive Positioning'
!objective31.startDate := '2023-09-15'
!objective31.endDate := '2023-12-01'
!objective31.success := true
!insert (objective31, player31) into TrainingObjectivePlayer

!new TrainingObjective('objective32')
!objective32.areaToImprove := 'Goal Scoring'
!objective32.startDate := '2023-09-10'
!objective32.endDate := '2023-11-15'
!objective32.success := false
!insert (objective32, player32) into TrainingObjectivePlayer

!new TrainingObjective('objective33')
!objective33.areaToImprove := 'Ball Control'
!objective33.startDate := '2023-08-05'
!objective33.endDate := '2023-10-20'
!objective33.success := true
!insert (objective33, player33) into TrainingObjectivePlayer

!new Competition('competition11')
!competition11.name := 'Universal League'
!competition11.type := 'Round Robin'

!new Match('match11')
!match11.date := '2023-12-18'
!match11.homeAway := true
!insert (competition11, match11) into CompetitionMatch
!insert (team21, match11) into LocalMatch
!insert (team22, match11) into VisitorMatch

!new MatchReport('report11')
!report11.duration := 90
!report11.scoreVisitor := 1
!report11.scoreLocal := 2
!insert (match11, report11) into MatchMatchReport

!new MatchPlayer('matchPlayer31')
!matchPlayer31.booked := false
!matchPlayer31.goals := 1
!matchPlayer31.rating := 8
!insert (player31, matchPlayer31) into PlayerMatch
!insert (match11, matchPlayer31) into MatchMatchPlayer

!new MatchPlayer('matchPlayer32')
!matchPlayer32.booked := true
!matchPlayer32.goals := 1
!matchPlayer32.rating := 9
!insert (player32, matchPlayer32) into PlayerMatch
!insert (match11, matchPlayer32) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition31')
!matchPlayerPosition31.positionName := #DEFENDER
!matchPlayerPosition31.number := 3
!insert (matchPlayer31, matchPlayerPosition31) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition32')
!matchPlayerPosition32.positionName := #FORWARD
!matchPlayerPosition32.number := 11
!insert (matchPlayer32, matchPlayerPosition32) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event40')
!event40.eventType := #GOAL
!event40.time := 10
!insert (match11, event40) into MatchMatchEvent

!new MatchEvent('event41')
!event41.eventType := #GOAL
!event41.time := 52
!insert (match11, event41) into MatchMatchEvent

!new MatchEvent('event42')
!event42.eventType := #GOAL
!event42.time := 80
!insert (match11, event42) into MatchMatchEvent

!new MatchNote('matchNote11')
!matchNote11.note := 'Comet Chasers took the lead with strong defense and smart plays'
!matchNote11.date := '2023-12-18'
!insert (match11, matchNote11) into MatchMatchNote
```
## Generation 11 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 127 | 0.00% |
| Multiplicities Errors | 0 | 29 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 12
```
!new Club('club23')
!club23.name := 'Thunder FC'
!club23.homeGround := 'Thunder Dome'
!club23.chairman := 'Helen Brooks'

!new Club('club24')
!club24.name := 'Lightning FC'
!club24.homeGround := 'Lightning Arena'
!club24.chairman := 'Samuel Wright'

!new Team('team23')
!team23.name := 'Thunder Strikers'
!insert (club23, team23) into ClubTeam

!new Team('team24')
!team24.name := 'Lightning Bolts'
!insert (club24, team24) into ClubTeam

!new Player('player34')
!player34.name := 'Oliver King'
!player34.age := 30
!player34.bestFoot := #BOTH
!player34.phoneNumber := '123-567-8901'
!insert (team23, player34) into TeamPlayer

!new Player('player35')
!player35.name := 'Ella Moore'
!player35.age := 25
!player35.bestFoot := #RIGHT
!player35.phoneNumber := '234-678-9012'
!insert (team23, player35) into TeamPlayer

!new Player('player36')
!player36.name := 'Jack Mason'
!player36.age := 28
!player36.bestFoot := #LEFT
!player36.phoneNumber := '345-789-0123'
!insert (team24, player36) into TeamPlayer

!new Position('position34')
!position34.positionName := #MIDFIELDER
!insert (player34, position34) into PlayerPositions

!new Position('position35')
!position35.positionName := #DEFENDER
!insert (player35, position35) into PlayerPositions

!new Position('position36')
!position36.positionName := #FORWARD
!insert (player36, position36) into PlayerPositions

!new TrainingSession('training23')
!training23.date := '2023-11-30'
!training23.location := 'Thunder Training Complex'
!training23.purpose := 'Fitness Drills'
!insert (team23, training23) into TeamTraining

!new TrainingSession('training24')
!training24.date := '2023-12-01'
!training24.location := 'Lightning Practice Field'
!training24.purpose := 'Tactical Exercises'
!insert (team24, training24) into TeamTraining

!new TrainingNotes('trainingNotes23')
!trainingNotes23.note := 'Conducted high-intensity fitness circuits'
!trainingNotes23.date := '2023-11-30'
!insert (training23, trainingNotes23) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes24')
!trainingNotes24.note := 'Refined positional and movement strategies'
!trainingNotes24.date := '2023-12-01'
!insert (training24, trainingNotes24) into TrainingTrainingNotes

!new TrainingObjective('objective34')
!objective34.areaToImprove := 'Stamina and Endurance'
!objective34.startDate := '2023-10-01'
!objective34.endDate := '2023-12-05'
!objective34.success := true
!insert (objective34, player34) into TrainingObjectivePlayer

!new TrainingObjective('objective35')
!objective35.areaToImprove := 'Defensive Coverage'
!objective35.startDate := '2023-09-20'
!objective35.endDate := '2023-11-25'
!objective35.success := false
!insert (objective35, player35) into TrainingObjectivePlayer

!new TrainingObjective('objective36')
!objective36.areaToImprove := 'Finishing Techniques'
!objective36.startDate := '2023-08-15'
!objective36.endDate := '2023-11-15'
!objective36.success := true
!insert (objective36, player36) into TrainingObjectivePlayer

!new Competition('competition12')
!competition12.name := 'Champions Series'
!competition12.type := 'Knockout'

!new Match('match12')
!match12.date := '2023-12-20'
!match12.homeAway := true
!insert (competition12, match12) into CompetitionMatch
!insert (team23, match12) into LocalMatch
!insert (team24, match12) into VisitorMatch

!new MatchReport('report12')
!report12.duration := 90
!report12.scoreVisitor := 1
!report12.scoreLocal := 3
!insert (match12, report12) into MatchMatchReport

!new MatchPlayer('matchPlayer34')
!matchPlayer34.booked := false
!matchPlayer34.goals := 1
!matchPlayer34.rating := 8
!insert (player34, matchPlayer34) into PlayerMatch
!insert (match12, matchPlayer34) into MatchMatchPlayer

!new MatchPlayer('matchPlayer36')
!matchPlayer36.booked := true
!matchPlayer36.goals := 1
!matchPlayer36.rating := 7
!insert (player36, matchPlayer36) into PlayerMatch
!insert (match12, matchPlayer36) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition34')
!matchPlayerPosition34.positionName := #MIDFIELDER
!matchPlayerPosition34.number := 8
!insert (matchPlayer34, matchPlayerPosition34) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition36')
!matchPlayerPosition36.positionName := #FORWARD
!matchPlayerPosition36.number := 10
!insert (matchPlayer36, matchPlayerPosition36) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event43')
!event43.eventType := #GOAL
!event43.time := 25
!insert (match12, event43) into MatchMatchEvent

!new MatchEvent('event44')
!event44.eventType := #GOAL
!event44.time := 55
!insert (match12, event44) into MatchMatchEvent

!new MatchEvent('event45')
!event45.eventType := #GOAL
!event45.time := 70
!insert (match12, event45) into MatchMatchEvent

!new MatchEvent('event46')
!event46.eventType := #GOAL
!event46.time := 82
!insert (match12, event46) into MatchMatchEvent

!new MatchNote('matchNote12')
!matchNote12.note := 'Thunder Strikers executed a flawless game with strong offensive plays'
!matchNote12.date := '2023-12-20'
!insert (match12, matchNote12) into MatchMatchNote
```
## Generation 12 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 131 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 13
```
!new Club('club25')
!club25.name := 'Lions FC'
!club25.homeGround := 'Lion Den Stadium'
!club25.chairman := 'Gregory Long'

!new Club('club26')
!club26.name := 'Tigers FC'
!club26.homeGround := 'Tiger Arena'
!club26.chairman := 'Monica Ellis'

!new Team('team25')
!team25.name := 'Lion Pride'
!insert (club25, team25) into ClubTeam

!new Team('team26')
!team26.name := 'Tiger Roar'
!insert (club26, team26) into ClubTeam

!new Player('player37')
!player37.name := 'Noah Wright'
!player37.age := 29
!player37.bestFoot := #LEFT
!player37.phoneNumber := '789-101-1122'
!insert (team25, player37) into TeamPlayer

!new Player('player38')
!player38.name := 'Amelia Scott'
!player38.age := 27
!player38.bestFoot := #RIGHT
!player38.phoneNumber := '890-112-2233'
!insert (team25, player38) into TeamPlayer

!new Player('player39')
!player39.name := 'Lucas Brown'
!player39.age := 32
!player39.bestFoot := #BOTH
!player39.phoneNumber := '901-123-3344'
!insert (team26, player39) into TeamPlayer

!new Position('position37')
!position37.positionName := #DEFENDER
!insert (player37, position37) into PlayerPositions

!new Position('position38')
!position38.positionName := #MIDFIELDER
!insert (player38, position38) into PlayerPositions

!new Position('position39')
!position39.positionName := #FORWARD
!insert (player39, position39) into PlayerPositions

!new TrainingSession('training25')
!training25.date := '2023-12-05'
!training25.location := 'Lion Roar Grounds'
!training25.purpose := 'Agility and Speed'
!insert (team25, training25) into TeamTraining

!new TrainingSession('training26')
!training26.date := '2023-12-06'
!training26.location := 'Tiger Tracks'
!training26.purpose := 'Passing Accuracy'
!insert (team26, training26) into TeamTraining

!new TrainingNotes('trainingNotes25')
!trainingNotes25.note := 'Enhanced agility with ladder drills'
!trainingNotes25.date := '2023-12-05'
!insert (training25, trainingNotes25) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes26')
!trainingNotes26.note := 'Focused on precision and distance in passing'
!trainingNotes26.date := '2023-12-06'
!insert (training26, trainingNotes26) into TrainingTrainingNotes

!new TrainingObjective('objective37')
!objective37.areaToImprove := 'Agility'
!objective37.startDate := '2023-10-01'
!objective37.endDate := '2023-12-01'
!objective37.success := true
!insert (objective37, player37) into TrainingObjectivePlayer

!new TrainingObjective('objective38')
!objective38.areaToImprove := 'Playmaking'
!objective38.startDate := '2023-08-15'
!objective38.endDate := '2023-11-15'
!objective38.success := false
!insert (objective38, player38) into TrainingObjectivePlayer

!new TrainingObjective('objective39')
!objective39.areaToImprove := 'Shooting'
!objective39.startDate := '2023-09-10'
!objective39.endDate := '2023-11-10'
!objective39.success := true
!insert (objective39, player39) into TrainingObjectivePlayer

!new Competition('competition13')
!competition13.name := 'National Challenge Cup'
!competition13.type := 'Finals'

!new Match('match13')
!match13.date := '2023-12-22'
!match13.homeAway := false
!insert (competition13, match13) into CompetitionMatch
!insert (team25, match13) into VisitorMatch
!insert (team26, match13) into LocalMatch

!new MatchReport('report13')
!report13.duration := 90
!report13.scoreVisitor := 3
!report13.scoreLocal := 2
!insert (match13, report13) into MatchMatchReport

!new MatchPlayer('matchPlayer37')
!matchPlayer37.booked := true
!matchPlayer37.goals := 1
!matchPlayer37.rating := 8
!insert (player37, matchPlayer37) into PlayerMatch
!insert (match13, matchPlayer37) into MatchMatchPlayer

!new MatchPlayer('matchPlayer39')
!matchPlayer39.booked := false
!matchPlayer39.goals := 1
!matchPlayer39.rating := 9
!insert (player39, matchPlayer39) into PlayerMatch
!insert (match13, matchPlayer39) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition37')
!matchPlayerPosition37.positionName := #DEFENDER
!matchPlayerPosition37.number := 3
!insert (matchPlayer37, matchPlayerPosition37) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition39')
!matchPlayerPosition39.positionName := #FORWARD
!matchPlayerPosition39.number := 9
!insert (matchPlayer39, matchPlayerPosition39) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event47')
!event47.eventType := #GOAL
!event47.time := 15
!insert (match13, event47) into MatchMatchEvent

!new MatchEvent('event48')
!event48.eventType := #GOAL
!event48.time := 28
!insert (match13, event48) into MatchMatchEvent

!new MatchEvent('event49')
!event49.eventType := #GOAL
!event49.time := 42
!insert (match13, event49) into MatchMatchEvent

!new MatchEvent('event50')
!event50.eventType := #GOAL
!event50.time := 68
!insert (match13, event50) into MatchMatchEvent

!new MatchEvent('event51')
!event51.eventType := #GOAL
!event51.time := 84
!insert (match13, event51) into MatchMatchEvent

!new MatchNote('matchNote13')
!matchNote13.note := 'Exciting final with Lions FC triumphing over Tigers FC'
!matchNote13.date := '2023-12-22'
!insert (match13, matchNote13) into MatchMatchNote
```
## Generation 13 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 135 | 0.00% |
| Multiplicities Errors | 0 | 31 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 14
```
!new Club('club27')
!club27.name := 'Eagles FC'
!club27.homeGround := 'Eagle Nest Stadium'
!club27.chairman := 'Peter Collins'

!new Club('club28')
!club28.name := 'Sharks FC'
!club28.homeGround := 'Shark Arena'
!club28.chairman := 'Linda Parker'

!new Team('team27')
!team27.name := 'Eagle Soar'
!insert (club27, team27) into ClubTeam

!new Team('team28')
!team28.name := 'Shark Attack'
!insert (club28, team28) into ClubTeam

!new Player('player40')
!player40.name := 'Ethan Coleman'
!player40.age := 30
!player40.bestFoot := #RIGHT
!player40.phoneNumber := '234-567-8901'
!insert (team27, player40) into TeamPlayer

!new Player('player41')
!player41.name := 'Sophie Bennett'
!player41.age := 24
!player41.bestFoot := #LEFT
!player41.phoneNumber := '345-678-9012'
!insert (team27, player41) into TeamPlayer

!new Player('player42')
!player42.name := 'Henry Mitchell'
!player42.age := 28
!player42.bestFoot := #BOTH
!player42.phoneNumber := '456-789-0123'
!insert (team28, player42) into TeamPlayer

!new Position('position40')
!position40.positionName := #MIDFIELDER
!insert (player40, position40) into PlayerPositions

!new Position('position41')
!position41.positionName := #FORWARD
!insert (player41, position41) into PlayerPositions

!new Position('position42')
!position42.positionName := #DEFENDER
!insert (player42, position42) into PlayerPositions

!new TrainingSession('training27')
!training27.date := '2024-01-08'
!training27.location := 'Eagle Flight Field'
!training27.purpose := 'Ball Control'
!insert (team27, training27) into TeamTraining

!new TrainingSession('training28')
!training28.date := '2024-01-09'
!training28.location := 'Shark Training Grounds'
!training28.purpose := 'Defensive Tactics'
!insert (team28, training28) into TeamTraining

!new TrainingNotes('trainingNotes27')
!trainingNotes27.note := 'Improved dribbling and close ball skills'
!trainingNotes27.date := '2024-01-08'
!insert (training27, trainingNotes27) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes28')
!trainingNotes28.note := 'Focused on blocking and intercepting strategies'
!trainingNotes28.date := '2024-01-09'
!insert (training28, trainingNotes28) into TrainingTrainingNotes

!new TrainingObjective('objective40')
!objective40.areaToImprove := 'Pass Precision'
!objective40.startDate := '2023-11-10'
!objective40.endDate := '2024-01-10'
!objective40.success := true
!insert (objective40, player40) into TrainingObjectivePlayer

!new TrainingObjective('objective41')
!objective41.areaToImprove := 'Finishing Under Pressure'
!objective41.startDate := '2023-09-05'
!objective41.endDate := '2023-12-05'
!objective41.success := false
!insert (objective41, player41) into TrainingObjectivePlayer

!new TrainingObjective('objective42')
!objective42.areaToImprove := 'Tackling'
!objective42.startDate := '2023-08-20'
!objective42.endDate := '2023-11-20'
!objective42.success := true
!insert (objective42, player42) into TrainingObjectivePlayer

!new Competition('competition14')
!competition14.name := 'Super League Finals'
!competition14.type := 'One-off'

!new Match('match14')
!match14.date := '2024-01-15'
!match14.homeAway := true
!insert (competition14, match14) into CompetitionMatch
!insert (team27, match14) into LocalMatch
!insert (team28, match14) into VisitorMatch

!new MatchReport('report14')
!report14.duration := 90
!report14.scoreVisitor := 2
!report14.scoreLocal := 3
!insert (match14, report14) into MatchMatchReport

!new MatchPlayer('matchPlayer40')
!matchPlayer40.booked := false
!matchPlayer40.goals := 1
!matchPlayer40.rating := 8
!insert (player40, matchPlayer40) into PlayerMatch
!insert (match14, matchPlayer40) into MatchMatchPlayer

!new MatchPlayer('matchPlayer42')
!matchPlayer42.booked := false
!matchPlayer42.goals := 1
!matchPlayer42.rating := 7
!insert (player42, matchPlayer42) into PlayerMatch
!insert (match14, matchPlayer42) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition40')
!matchPlayerPosition40.positionName := #MIDFIELDER
!matchPlayerPosition40.number := 8
!insert (matchPlayer40, matchPlayerPosition40) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition42')
!matchPlayerPosition42.positionName := #DEFENDER
!matchPlayerPosition42.number := 4
!insert (matchPlayer42, matchPlayerPosition42) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event52')
!event52.eventType := #GOAL
!event52.time := 14
!insert (match14, event52) into MatchMatchEvent

!new MatchEvent('event53')
!event53.eventType := #GOAL
!event53.time := 29
!insert (match14, event53) into MatchMatchEvent

!new MatchEvent('event54')
!event54.eventType := #GOAL
!event54.time := 41
!insert (match14, event54) into MatchMatchEvent

!new MatchEvent('event55')
!event55.eventType := #GOAL
!event55.time := 63
!insert (match14, event55) into MatchMatchEvent

!new MatchEvent('event56')
!event56.eventType := #GOAL
!event56.time := 87
!insert (match14, event56) into MatchMatchEvent

!new MatchNote('matchNote14')
!matchNote14.note := 'Thrilling match with Eagles FC edging out in a nail-biter'
!matchNote14.date := '2024-01-15'
!insert (match14, matchNote14) into MatchMatchNote
```
## Generation 14 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 135 | 0.00% |
| Multiplicities Errors | 0 | 31 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 15
```
!new Club('club29')
!club29.name := 'Warriors FC'
!club29.homeGround := 'Warrior Arena'
!club29.chairman := 'Steven Adams'

!new Club('club30')
!club30.name := 'Monarchs FC'
!club30.homeGround := 'Monarch Stadium'
!club30.chairman := 'Susan Carter'

!new Team('team29')
!team29.name := 'Warrior Kings'
!insert (club29, team29) into ClubTeam

!new Team('team30')
!team30.name := 'Monarch Lions'
!insert (club30, team30) into ClubTeam

!new Player('player43')
!player43.name := 'Zachary White'
!player43.age := 27
!player43.bestFoot := #BOTH
!player43.phoneNumber := '567-890-1234'
!insert (team29, player43) into TeamPlayer

!new Player('player44')
!player44.name := 'Lily Johnson'
!player44.age := 26
!player44.bestFoot := #LEFT
!player44.phoneNumber := '678-901-2345'
!insert (team29, player44) into TeamPlayer

!new Player('player45')
!player45.name := 'Nathan Wilson'
!player45.age := 28
!player45.bestFoot := #RIGHT
!player45.phoneNumber := '789-012-3456'
!insert (team30, player45) into TeamPlayer

!new Position('position43')
!position43.positionName := #GOALKEEPER
!insert (player43, position43) into PlayerPositions

!new Position('position44')
!position44.positionName := #MIDFIELDER
!insert (player44, position44) into PlayerPositions

!new Position('position45')
!position45.positionName := #FORWARD
!insert (player45, position45) into PlayerPositions

!new TrainingSession('training29')
!training29.date := '2024-01-12'
!training29.location := 'Warrior Field'
!training29.purpose := 'Reflex Training'
!insert (team29, training29) into TeamTraining

!new TrainingSession('training30')
!training30.date := '2024-01-13'
!training30.location := 'Monarch Grounds'
!training30.purpose := 'Offensive Formations'
!insert (team30, training30) into TeamTraining

!new TrainingNotes('trainingNotes29')
!trainingNotes29.note := 'Worked on improving goalkeeper reflexes with rapid-fire drills'
!trainingNotes29.date := '2024-01-12'
!insert (training29, trainingNotes29) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes30')
!trainingNotes30.note := 'Drilled various attacking formations and finishing moves'
!trainingNotes30.date := '2024-01-13'
!insert (training30, trainingNotes30) into TrainingTrainingNotes

!new TrainingObjective('objective43')
!objective43.areaToImprove := 'Reflexes'
!objective43.startDate := '2023-11-01'
!objective43.endDate := '2024-01-15'
!objective43.success := true
!insert (objective43, player43) into TrainingObjectivePlayer

!new TrainingObjective('objective44')
!objective44.areaToImprove := 'Playmaking Vision'
!objective44.startDate := '2023-09-20'
!objective44.endDate := '2023-12-20'
!objective44.success := false
!insert (objective44, player44) into TrainingObjectivePlayer

!new TrainingObjective('objective45')
!objective45.areaToImprove := 'Shooting Accuracy'
!objective45.startDate := '2023-08-10'
!objective45.endDate := '2023-11-10'
!objective45.success := true
!insert (objective45, player45) into TrainingObjectivePlayer

!new Competition('competition15')
!competition15.name := 'Ultimate Championship'
!competition15.type := 'Finals'

!new Match('match15')
!match15.date := '2024-01-20'
!match15.homeAway := false
!insert (competition15, match15) into CompetitionMatch
!insert (team29, match15) into VisitorMatch
!insert (team30, match15) into LocalMatch

!new MatchReport('report15')
!report15.duration := 90
!report15.scoreVisitor := 1
!report15.scoreLocal := 1
!insert (match15, report15) into MatchMatchReport

!new MatchPlayer('matchPlayer43')
!matchPlayer43.booked := true
!matchPlayer43.goals := 0
!matchPlayer43.rating := 8
!insert (player43, matchPlayer43) into PlayerMatch
!insert (match15, matchPlayer43) into MatchMatchPlayer

!new MatchPlayer('matchPlayer45')
!matchPlayer45.booked := false
!matchPlayer45.goals := 1
!matchPlayer45.rating := 9
!insert (player45, matchPlayer45) into PlayerMatch
!insert (match15, matchPlayer45) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition43')
!matchPlayerPosition43.positionName := #GOALKEEPER
!matchPlayerPosition43.number := 1
!insert (matchPlayer43, matchPlayerPosition43) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition45')
!matchPlayerPosition45.positionName := #FORWARD
!matchPlayerPosition45.number := 7
!insert (matchPlayer45, matchPlayerPosition45) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event57')
!event57.eventType := #GOAL
!event57.time := 33
!insert (match15, event57) into MatchMatchEvent

!new MatchEvent('event58')
!event58.eventType := #GOAL
!event58.time := 76
!insert (match15, event58) into MatchMatchEvent

!new MatchNote('matchNote15')
!matchNote15.note := 'Intense final match with teams evenly matched, ending in a draw'
!matchNote15.date := '2024-01-20'
!insert (match15, matchNote15) into MatchMatchNote
```
## Generation 15 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 123 | 0.00% |
| Multiplicities Errors | 0 | 28 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 16
```
!new Club('club31')
!club31.name := 'Raptors FC'
!club31.homeGround := 'Raptor Den'
!club31.chairman := 'Fiona Adams'

!new Club('club32')
!club32.name := 'Cougars FC'
!club32.homeGround := 'Cougar Claw Stadium'
!club32.chairman := 'George Phillips'

!new Team('team31')
!team31.name := 'Raptor Claws'
!insert (club31, team31) into ClubTeam

!new Team('team32')
!team32.name := 'Cougar Prowl'
!insert (club32, team32) into ClubTeam

!new Player('player46')
!player46.name := 'Chloe Scott'
!player46.age := 23
!player46.bestFoot := #LEFT
!player46.phoneNumber := '123-345-6789'
!insert (team31, player46) into TeamPlayer

!new Player('player47')
!player47.name := 'Jake Evans'
!player47.age := 26
!player47.bestFoot := #RIGHT
!player47.phoneNumber := '234-456-7890'
!insert (team31, player47) into TeamPlayer

!new Player('player48')
!player48.name := 'Mia Rogers'
!player48.age := 27
!player48.bestFoot := #BOTH
!player48.phoneNumber := '345-567-8901'
!insert (team32, player48) into TeamPlayer

!new Position('position46')
!position46.positionName := #MIDFIELDER
!insert (player46, position46) into PlayerPositions

!new Position('position47')
!position47.positionName := #DEFENDER
!insert (player47, position47) into PlayerPositions

!new Position('position48')
!position48.positionName := #FORWARD
!insert (player48, position48) into PlayerPositions

!new TrainingSession('training31')
!training31.date := '2024-02-02'
!training31.location := 'Raptor Training Camp'
!training31.purpose := 'Team Coordination and Drills'
!insert (team31, training31) into TeamTraining

!new TrainingSession('training32')
!training32.date := '2024-02-03'
!training32.location := 'Cougar Ground'
!training32.purpose := 'Offensive Drills'
!insert (team32, training32) into TeamTraining

!new TrainingNotes('trainingNotes31')
!trainingNotes31.note := 'Focused on team passing drills and coordination'
!trainingNotes31.date := '2024-02-02'
!insert (training31, trainingNotes31) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes32')
!trainingNotes32.note := 'Worked on offensive movements and finishing under pressure'
!trainingNotes32.date := '2024-02-03'
!insert (training32, trainingNotes32) into TrainingTrainingNotes

!new TrainingObjective('objective46')
!objective46.areaToImprove := 'Team Coordination'
!objective46.startDate := '2023-11-20'
!objective46.endDate := '2024-02-20'
!objective46.success := true
!insert (objective46, player46) into TrainingObjectivePlayer

!new TrainingObjective('objective47')
!objective47.areaToImprove := 'Defensive Coordination'
!objective47.startDate := '2023-10-10'
!objective47.endDate := '2024-01-10'
!objective47.success := false
!insert (objective47, player47) into TrainingObjectivePlayer

!new TrainingObjective('objective48')
!objective48.areaToImprove := 'Goal Scoring Efficiency'
!objective48.startDate := '2023-09-15'
!objective48.endDate := '2023-12-15'
!objective48.success := true
!insert (objective48, player48) into TrainingObjectivePlayer

!new Competition('competition16')
!competition16.name := 'World Series Cup'
!competition16.type := 'Group Stage'

!new Match('match16')
!match16.date := '2024-02-10'
!match16.homeAway := true
!insert (competition16, match16) into CompetitionMatch
!insert (team31, match16) into LocalMatch
!insert (team32, match16) into VisitorMatch

!new MatchReport('report16')
!report16.duration := 90
!report16.scoreVisitor := 2
!report16.scoreLocal := 3
!insert (match16, report16) into MatchMatchReport

!new MatchPlayer('matchPlayer46')
!matchPlayer46.booked := false
!matchPlayer46.goals := 1
!matchPlayer46.rating := 8
!insert (player46, matchPlayer46) into PlayerMatch
!insert (match16, matchPlayer46) into MatchMatchPlayer

!new MatchPlayer('matchPlayer48')
!matchPlayer48.booked := true
!matchPlayer48.goals := 2
!matchPlayer48.rating := 9
!insert (player48, matchPlayer48) into PlayerMatch
!insert (match16, matchPlayer48) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition46')
!matchPlayerPosition46.positionName := #MIDFIELDER
!matchPlayerPosition46.number := 10
!insert (matchPlayer46, matchPlayerPosition46) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition48')
!matchPlayerPosition48.positionName := #FORWARD
!matchPlayerPosition48.number := 11
!insert (matchPlayer48, matchPlayerPosition48) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event59')
!event59.eventType := #GOAL
!event59.time := 12
!insert (match16, event59) into MatchMatchEvent

!new MatchEvent('event60')
!event60.eventType := #GOAL
!event60.time := 34
!insert (match16, event60) into MatchMatchEvent

!new MatchEvent('event61')
!event61.eventType := #GOAL
!event61.time := 49
!insert (match16, event61) into MatchMatchEvent

!new MatchEvent('event62')
!event62.eventType := #GOAL
!event62.time := 66
!insert (match16, event62) into MatchMatchEvent

!new MatchEvent('event63')
!event63.eventType := #GOAL
!event63.time := 81
!insert (match16, event63) into MatchMatchEvent

!new MatchNote('matchNote16')
!matchNote16.note := 'Hard-fought match with Raptor Claws clinching a narrow win'
!matchNote16.date := '2024-02-10'
!insert (match16, matchNote16) into MatchMatchNote
```
## Generation 16 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 135 | 0.00% |
| Multiplicities Errors | 0 | 31 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 17
```
!new Club('club33')
!club33.name := 'Dragons FC'
!club33.homeGround := 'Dragon Fortress'
!club33.chairman := 'Alice Hamilton'

!new Club('club34')
!club34.name := 'Phoenix FC'
!club34.homeGround := 'Phoenix Nest'
!club34.chairman := 'Michael Torres'

!new Team('team33')
!team33.name := 'Dragon Warriors'
!insert (club33, team33) into ClubTeam

!new Team('team34')
!team34.name := 'Phoenix Flames'
!insert (club34, team34) into ClubTeam

!new Player('player49')
!player49.name := 'Oliver Bennett'
!player49.age := 25
!player49.bestFoot := #RIGHT
!player49.phoneNumber := '678-912-3456'
!insert (team33, player49) into TeamPlayer

!new Player('player50')
!player50.name := 'Charlotte Young'
!player50.age := 28
!player50.bestFoot := #LEFT
!player50.phoneNumber := '789-023-4567'
!insert (team33, player50) into TeamPlayer

!new Player('player51')
!player51.name := 'Daniel Green'
!player51.age := 30
!player51.bestFoot := #BOTH
!player51.phoneNumber := '890-134-5678'
!insert (team34, player51) into TeamPlayer

!new Position('position49')
!position49.positionName := #FORWARD
!insert (player49, position49) into PlayerPositions

!new Position('position50')
!position50.positionName := #MIDFIELDER
!insert (player50, position50) into PlayerPositions

!new Position('position51')
!position51.positionName := #DEFENDER
!insert (player51, position51) into PlayerPositions

!new TrainingSession('training33')
!training33.date := '2024-02-15'
!training33.location := 'Dragon Lair'
!training33.purpose := 'Attacking Drills'
!insert (team33, training33) into TeamTraining

!new TrainingSession('training34')
!training34.date := '2024-02-16'
!training34.location := 'Phoenix Arena'
!training34.purpose := 'Defensive Strategies'
!insert (team34, training34) into TeamTraining

!new TrainingNotes('trainingNotes33')
!trainingNotes33.note := 'Practiced off-the-ball movements and finishing'
!trainingNotes33.date := '2024-02-15'
!insert (training33, trainingNotes33) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes34')
!trainingNotes34.note := 'Focused on defensive line management and clearances'
!trainingNotes34.date := '2024-02-16'
!insert (training34, trainingNotes34) into TrainingTrainingNotes

!new TrainingObjective('objective49')
!objective49.areaToImprove := 'Attacking Movement'
!objective49.startDate := '2023-12-01'
!objective49.endDate := '2024-02-28'
!objective49.success := true
!insert (objective49, player49) into TrainingObjectivePlayer

!new TrainingObjective('objective50')
!objective50.areaToImprove := 'Vision and Passing'
!objective50.startDate := '2023-11-10'
!objective50.endDate := '2024-01-10'
!objective50.success := false
!insert (objective50, player50) into TrainingObjectivePlayer

!new TrainingObjective('objective51')
!objective51.areaToImprove := 'Tackling Techniques'
!objective51.startDate := '2023-10-15'
!objective51.endDate := '2024-01-15'
!objective51.success := true
!insert (objective51, player51) into TrainingObjectivePlayer

!new Competition('competition17')
!competition17.name := 'Galaxy Cup'
!competition17.type := 'Playoff'

!new Match('match17')
!match17.date := '2024-02-25'
!match17.homeAway := false
!insert (competition17, match17) into CompetitionMatch
!insert (team33, match17) into VisitorMatch
!insert (team34, match17) into LocalMatch

!new MatchReport('report17')
!report17.duration := 90
!report17.scoreVisitor := 2
!report17.scoreLocal := 2
!insert (match17, report17) into MatchMatchReport

!new MatchPlayer('matchPlayer49')
!matchPlayer49.booked := false
!matchPlayer49.goals := 1
!matchPlayer49.rating := 8
!insert (player49, matchPlayer49) into PlayerMatch
!insert (match17, matchPlayer49) into MatchMatchPlayer

!new MatchPlayer('matchPlayer51')
!matchPlayer51.booked := false
!matchPlayer51.goals := 1
!matchPlayer51.rating := 7
!insert (player51, matchPlayer51) into PlayerMatch
!insert (match17, matchPlayer51) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition49')
!matchPlayerPosition49.positionName := #FORWARD
!matchPlayerPosition49.number := 9
!insert (matchPlayer49, matchPlayerPosition49) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition51')
!matchPlayerPosition51.positionName := #DEFENDER
!matchPlayerPosition51.number := 5
!insert (matchPlayer51, matchPlayerPosition51) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event64')
!event64.eventType := #GOAL
!event64.time := 22
!insert (match17, event64) into MatchMatchEvent

!new MatchEvent('event65')
!event65.eventType := #GOAL
!event65.time := 35
!insert (match17, event65) into MatchMatchEvent

!new MatchEvent('event66')
!event66.eventType := #GOAL
!event66.time := 55
!insert (match17, event66) into MatchMatchEvent

!new MatchEvent('event67')
!event67.eventType := #GOAL
!event67.time := 78
!insert (match17, event67) into MatchMatchEvent

!new MatchNote('matchNote17')
!matchNote17.note := 'Intense playoff match ending in a draw, showcasing both teams\' skills'
!matchNote17.date := '2024-02-25'
!insert (match17, matchNote17) into MatchMatchNote
```
## Generation 17 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 131 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 18
```
!new Club('club35')
!club35.name := 'Vipers FC'
!club35.homeGround := 'Viper Pit'
!club35.chairman := 'Rachel Turner'

!new Club('club36')
!club36.name := 'Wolves FC'
!club36.homeGround := 'Wolf Lair'
!club36.chairman := 'Bruce Anderson'

!new Team('team35')
!team35.name := 'Viper Strike'
!insert (club35, team35) into ClubTeam

!new Team('team36')
!team36.name := 'Wolf Pack'
!insert (club36, team36) into ClubTeam

!new Player('player52')
!player52.name := 'Samuel Harper'
!player52.age := 24
!player52.bestFoot := #LEFT
!player52.phoneNumber := '111-222-3333'
!insert (team35, player52) into TeamPlayer

!new Player('player53')
!player53.name := 'Liam Holmes'
!player53.age := 29
!player53.bestFoot := #RIGHT
!player53.phoneNumber := '444-555-6666'
!insert (team35, player53) into TeamPlayer

!new Player('player54')
!player54.name := 'Ella Brooks'
!player54.age := 26
!player54.bestFoot := #BOTH
!player54.phoneNumber := '777-888-9999'
!insert (team36, player54) into TeamPlayer

!new Position('position52')
!position52.positionName := #FORWARD
!insert (player52, position52) into PlayerPositions

!new Position('position53')
!position53.positionName := #DEFENDER
!insert (player53, position53) into PlayerPositions

!new Position('position54')
!position54.positionName := #MIDFIELDER
!insert (player54, position54) into PlayerPositions

!new TrainingSession('training35')
!training35.date := '2024-03-10'
!training35.location := 'Viper Grounds'
!training35.purpose := 'Shooting Drills'
!insert (team35, training35) into TeamTraining

!new TrainingSession('training36')
!training36.date := '2024-03-11'
!training36.location := 'Wolf Den'
!training36.purpose := 'Defensive Alignment'
!insert (team36, training36) into TeamTraining

!new TrainingNotes('trainingNotes35')
!trainingNotes35.note := 'Focused on improving precision in finishing shots'
!trainingNotes35.date := '2024-03-10'
!insert (training35, trainingNotes35) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes36')
!trainingNotes36.note := 'Enhanced team defensive structure and communication'
!trainingNotes36.date := '2024-03-11'
!insert (training36, trainingNotes36) into TrainingTrainingNotes

!new TrainingObjective('objective52')
!objective52.areaToImprove := 'Shot Accuracy'
!objective52.startDate := '2024-01-01'
!objective52.endDate := '2024-03-15'
!objective52.success := true
!insert (objective52, player52) into TrainingObjectivePlayer

!new TrainingObjective('objective53')
!objective53.areaToImprove := 'Tactical Awareness'
!objective53.startDate := '2024-01-20'
!objective53.endDate := '2024-04-20'
!objective53.success := false
!insert (objective53, player53) into TrainingObjectivePlayer

!new TrainingObjective('objective54')
!objective54.areaToImprove := 'Passing Under Pressure'
!objective54.startDate := '2023-12-10'
!objective54.endDate := '2024-02-10'
!objective54.success := true
!insert (objective54, player54) into TrainingObjectivePlayer

!new Competition('competition18')
!competition18.name := 'Continental Clash'
!competition18.type := 'Knockout Stage'

!new Match('match18')
!match18.date := '2024-03-20'
!match18.homeAway := true
!insert (competition18, match18) into CompetitionMatch
!insert (team35, match18) into LocalMatch
!insert (team36, match18) into VisitorMatch

!new MatchReport('report18')
!report18.duration := 90
!report18.scoreVisitor := 1
!report18.scoreLocal := 3
!insert (match18, report18) into MatchMatchReport

!new MatchPlayer('matchPlayer52')
!matchPlayer52.booked := false
!matchPlayer52.goals := 2
!matchPlayer52.rating := 9
!insert (player52, matchPlayer52) into PlayerMatch
!insert (match18, matchPlayer52) into MatchMatchPlayer

!new MatchPlayer('matchPlayer54')
!matchPlayer54.booked := true
!matchPlayer54.goals := 1
!matchPlayer54.rating := 7
!insert (player54, matchPlayer54) into PlayerMatch
!insert (match18, matchPlayer54) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition52')
!matchPlayerPosition52.positionName := #FORWARD
!matchPlayerPosition52.number := 10
!insert (matchPlayer52, matchPlayerPosition52) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition54')
!matchPlayerPosition54.positionName := #MIDFIELDER
!matchPlayerPosition54.number := 8
!insert (matchPlayer54, matchPlayerPosition54) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event68')
!event68.eventType := #GOAL
!event68.time := 23
!insert (match18, event68) into MatchMatchEvent

!new MatchEvent('event69')
!event69.eventType := #GOAL
!event69.time := 37
!insert (match18, event69) into MatchMatchEvent

!new MatchEvent('event70')
!event70.eventType := #GOAL
!event70.time := 49
!insert (match18, event70) into MatchMatchEvent

!new MatchEvent('event71')
!event71.eventType := #GOAL
!event71.time := 66
!insert (match18, event71) into MatchMatchEvent

!new MatchNote('matchNote18')
!matchNote18.note := 'Viper Strike dominated the match with excellent attacking plays'
!matchNote18.date := '2024-03-20'
!insert (match18, matchNote18) into MatchMatchNote
```
## Generation 18 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 131 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 19
```
!new Club('club37')
!club37.name := 'Gladiators FC'
!club37.homeGround := 'Coliseum Stadium'
!club37.chairman := 'Emma Gale'

!new Club('club38')
!club38.name := 'Titans FC'
!club38.homeGround := 'Titan Arena'
!club38.chairman := 'Victor Lopez'

!new Team('team37')
!team37.name := 'Gladiator Squad'
!insert (club37, team37) into ClubTeam

!new Team('team38')
!team38.name := 'Titan Force'
!insert (club38, team38) into ClubTeam

!new Player('player55')
!player55.name := 'Finn Taylor'
!player55.age := 31
!player55.bestFoot := #RIGHT
!player55.phoneNumber := '555-987-6543'
!insert (team37, player55) into TeamPlayer

!new Player('player56')
!player56.name := 'Hannah Lee'
!player56.age := 29
!player56.bestFoot := #LEFT
!player56.phoneNumber := '555-876-5432'
!insert (team37, player56) into TeamPlayer

!new Player('player57')
!player57.name := 'Jackson Smith'
!player57.age := 27
!player57.bestFoot := #BOTH
!player57.phoneNumber := '555-765-4321'
!insert (team38, player57) into TeamPlayer

!new Position('position55')
!position55.positionName := #MIDFIELDER
!insert (player55, position55) into PlayerPositions

!new Position('position56')
!position56.positionName := #GOALKEEPER
!insert (player56, position56) into PlayerPositions

!new Position('position57')
!position57.positionName := #FORWARD
!insert (player57, position57) into PlayerPositions

!new TrainingSession('training37')
!training37.date := '2024-03-25'
!training37.location := 'Gladiator Grounds'
!training37.purpose := 'Stamina Building'
!insert (team37, training37) into TeamTraining

!new TrainingSession('training38')
!training38.date := '2024-03-27'
!training38.location := 'Titan Fortress'
!training38.purpose := 'Strategic Plays'
!insert (team38, training38) into TeamTraining

!new TrainingNotes('trainingNotes37')
!trainingNotes37.note := 'Intensive interval training to boost endurance'
!trainingNotes37.date := '2024-03-25'
!insert (training37, trainingNotes37) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes38')
!trainingNotes38.note := 'Focus on coordinating strategic attacks'
!trainingNotes38.date := '2024-03-27'
!insert (training38, trainingNotes38) into TrainingTrainingNotes

!new TrainingObjective('objective55')
!objective55.areaToImprove := 'Endurance'
!objective55.startDate := '2024-01-05'
!objective55.endDate := '2024-04-05'
!objective55.success := true
!insert (objective55, player55) into TrainingObjectivePlayer

!new TrainingObjective('objective56')
!objective56.areaToImprove := 'Save Techniques'
!objective56.startDate := '2024-02-01'
!objective56.endDate := '2024-05-01'
!objective56.success := false
!insert (objective56, player56) into TrainingObjectivePlayer

!new TrainingObjective('objective57')
!objective57.areaToImprove := 'Attacking Maneuvers'
!objective57.startDate := '2024-01-20'
!objective57.endDate := '2024-04-20'
!objective57.success := true
!insert (objective57, player57) into TrainingObjectivePlayer

!new Competition('competition19')
!competition19.name := 'Continental Cup'
!competition19.type := 'Quarter Finals'

!new Match('match19')
!match19.date := '2024-04-15'
!match19.homeAway := false
!insert (competition19, match19) into CompetitionMatch
!insert (team37, match19) into VisitorMatch
!insert (team38, match19) into LocalMatch

!new MatchReport('report19')
!report19.duration := 120
!report19.scoreVisitor := 1
!report19.scoreLocal := 0
!insert (match19, report19) into MatchMatchReport

!new MatchPlayer('matchPlayer55')
!matchPlayer55.booked := false
!matchPlayer55.goals := 0
!matchPlayer55.rating := 8
!insert (player55, matchPlayer55) into PlayerMatch
!insert (match19, matchPlayer55) into MatchMatchPlayer

!new MatchPlayer('matchPlayer57')
!matchPlayer57.booked := true
!matchPlayer57.goals := 0
!matchPlayer57.rating := 7
!insert (player57, matchPlayer57) into PlayerMatch
!insert (match19, matchPlayer57) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition55')
!matchPlayerPosition55.positionName := #MIDFIELDER
!matchPlayerPosition55.number := 6
!insert (matchPlayer55, matchPlayerPosition55) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition57')
!matchPlayerPosition57.positionName := #FORWARD
!matchPlayerPosition57.number := 11
!insert (matchPlayer57, matchPlayerPosition57) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event72')
!event72.eventType := #FOUL
!event72.time := 40
!insert (match19, event72) into MatchMatchEvent

!new MatchEvent('event73')
!event73.eventType := #GOAL
!event73.time := 110
!insert (match19, event73) into MatchMatchEvent

!new MatchNote('matchNote19')
!matchNote19.note := 'Tense match with Gladiator Squad securing victory in extra time'
!matchNote19.date := '2024-04-15'
!insert (match19, matchNote19) into MatchMatchNote
```
## Generation 19 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 123 | 0.00% |
| Multiplicities Errors | 0 | 28 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 20
```
!new Club('club39')
!club39.name := 'Panthers FC'
!club39.homeGround := 'Panther Park'
!club39.chairman := 'Charles Murphy'

!new Club('club40')
!club40.name := 'Leopards FC'
!club40.homeGround := 'Leopard Lair'
!club40.chairman := 'Diana Collins'

!new Team('team39')
!team39.name := 'Panther Prowlers'
!insert (club39, team39) into ClubTeam

!new Team('team40')
!team40.name := 'Leopard Spots'
!insert (club40, team40) into ClubTeam

!new Player('player58')
!player58.name := 'Alex Morgan'
!player58.age := 26
!player58.bestFoot := #LEFT
!player58.phoneNumber := '123-456-7890'
!insert (team39, player58) into TeamPlayer

!new Player('player59')
!player59.name := 'Emily Davis'
!player59.age := 28
!player59.bestFoot := #RIGHT
!player59.phoneNumber := '234-567-8901'
!insert (team39, player59) into TeamPlayer

!new Player('player60')
!player60.name := 'Ryan Fisher'
!player60.age := 30
!player60.bestFoot := #BOTH
!player60.phoneNumber := '345-678-9012'
!insert (team40, player60) into TeamPlayer

!new Position('position58')
!position58.positionName := #DEFENDER
!insert (player58, position58) into PlayerPositions

!new Position('position59')
!position59.positionName := #MIDFIELDER
!insert (player59, position59) into PlayerPositions

!new Position('position60')
!position60.positionName := #FORWARD
!insert (player60, position60) into PlayerPositions

!new TrainingSession('training39')
!training39.date := '2024-05-05'
!training39.location := 'Panther Arena'
!training39.purpose := 'Passing and Ball Control'
!insert (team39, training39) into TeamTraining

!new TrainingSession('training40')
!training40.date := '2024-05-06'
!training40.location := 'Leopard Grounds'
!training40.purpose := 'Shooting Techniques'
!insert (team40, training40) into TeamTraining

!new TrainingNotes('trainingNotes39')
!trainingNotes39.note := 'Focused on tight ball control and accurate passing'
!trainingNotes39.date := '2024-05-05'
!insert (training39, trainingNotes39) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes40')
!trainingNotes40.note := 'Worked on various shooting drills for precision'
!trainingNotes40.date := '2024-05-06'
!insert (training40, trainingNotes40) into TrainingTrainingNotes

!new TrainingObjective('objective58')
!objective58.areaToImprove := 'Passing Accuracy'
!objective58.startDate := '2024-02-01'
!objective58.endDate := '2024-05-01'
!objective58.success := true
!insert (objective58, player58) into TrainingObjectivePlayer

!new TrainingObjective('objective59')
!objective59.areaToImprove := 'Vision and Creativity'
!objective59.startDate := '2024-03-10'
!objective59.endDate := '2024-06-10'
!objective59.success := false
!insert (objective59, player59) into TrainingObjectivePlayer

!new TrainingObjective('objective60')
!objective60.areaToImprove := 'Finishing Skills'
!objective60.startDate := '2024-01-15'
!objective60.endDate := '2024-04-15'
!objective60.success := true
!insert (objective60, player60) into TrainingObjectivePlayer

!new Competition('competition20')
!competition20.name := 'Global Trophy'
!competition20.type := 'Semi-Finals'

!new Match('match20')
!match20.date := '2024-06-10'
!match20.homeAway := false
!insert (competition20, match20) into CompetitionMatch
!insert (team39, match20) into VisitorMatch
!insert (team40, match20) into LocalMatch

!new MatchReport('report20')
!report20.duration := 120
!report20.scoreVisitor := 2
!report20.scoreLocal := 3
!insert (match20, report20) into MatchMatchReport

!new MatchPlayer('matchPlayer58')
!matchPlayer58.booked := true
!matchPlayer58.goals := 0
!matchPlayer58.rating := 7
!insert (player58, matchPlayer58) into PlayerMatch
!insert (match20, matchPlayer58) into MatchMatchPlayer

!new MatchPlayer('matchPlayer60')
!matchPlayer60.booked := false
!matchPlayer60.goals := 2
!matchPlayer60.rating := 9
!insert (player60, matchPlayer60) into PlayerMatch
!insert (match20, matchPlayer60) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition58')
!matchPlayerPosition58.positionName := #DEFENDER
!matchPlayerPosition58.number := 4
!insert (matchPlayer58, matchPlayerPosition58) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition60')
!matchPlayerPosition60.positionName := #FORWARD
!matchPlayerPosition60.number := 10
!insert (matchPlayer60, matchPlayerPosition60) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event74')
!event74.eventType := #GOAL
!event74.time := 18
!insert (match20, event74) into MatchMatchEvent

!new MatchEvent('event75')
!event75.eventType := #GOAL
!event75.time := 52
!insert (match20, event75) into MatchMatchEvent

!new MatchEvent('event76')
!event76.eventType := #GOAL
!event76.time := 67
!insert (match20, event76) into MatchMatchEvent

!new MatchEvent('event77')
!event77.eventType := #GOAL
!event77.time := 85
!insert (match20, event77) into MatchMatchEvent

!new MatchEvent('event78')
!event78.eventType := #GOAL
!event78.time := 105
!insert (match20, event78) into MatchMatchEvent

!new MatchNote('matchNote20')
!matchNote20.note := 'Thrilling semi-final with Leopards FC edging victory in extra time'
!matchNote20.date := '2024-06-10'
!insert (match20, matchNote20) into MatchMatchNote
```
## Generation 20 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 135 | 0.00% |
| Multiplicities Errors | 0 | 31 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 21
```
!new Club('club41')
!club41.name := 'Eagles United'
!club41.homeGround := 'Eagle Nest'
!club41.chairman := 'Linda Rodriguez'

!new Club('club42')
!club42.name := 'Lions Brigade'
!club42.homeGround := 'Lion Heart Stadium'
!club42.chairman := 'David King'

!new Team('team41')
!team41.name := 'Eagle Warriors'
!insert (club41, team41) into ClubTeam

!new Team('team42')
!team42.name := 'Lions Guard'
!insert (club42, team42) into ClubTeam

!new Player('player61')
!player61.name := 'Logan Hill'
!player61.age := 24
!player61.bestFoot := #RIGHT
!player61.phoneNumber := '765-432-1098'
!insert (team41, player61) into TeamPlayer

!new Player('player62')
!player62.name := 'Sophia White'
!player62.age := 27
!player62.bestFoot := #LEFT
!player62.phoneNumber := '654-321-9870'
!insert (team41, player62) into TeamPlayer

!new Player('player63')
!player63.name := 'Benjamin Carter'
!player63.age := 30
!player63.bestFoot := #BOTH
!player63.phoneNumber := '543-210-8765'
!insert (team42, player63) into TeamPlayer

!new Position('position61')
!position61.positionName := #MIDFIELDER
!insert (player61, position61) into PlayerPositions

!new Position('position62')
!position62.positionName := #DEFENDER
!insert (player62, position62) into PlayerPositions

!new Position('position63')
!position63.positionName := #FORWARD
!insert (player63, position63) into PlayerPositions

!new TrainingSession('training41')
!training41.date := '2024-06-15'
!training41.location := 'Eagle High Roost'
!training41.purpose := 'Precision Passing'
!insert (team41, training41) into TeamTraining

!new TrainingSession('training42')
!training42.date := '2024-06-16'
!training42.location := 'Lions Den'
!training42.purpose := 'Power Striking'
!insert (team42, training42) into TeamTraining

!new TrainingNotes('trainingNotes41')
!trainingNotes41.note := 'Intensive drills on short and long-range passing accuracy'
!trainingNotes41.date := '2024-06-15'
!insert (training41, trainingNotes41) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes42')
!trainingNotes42.note := 'Focused on enhancing striking power and shot placement'
!trainingNotes42.date := '2024-06-16'
!insert (training42, trainingNotes42) into TrainingTrainingNotes

!new TrainingObjective('objective61')
!objective61.areaToImprove := 'Passing Precision'
!objective61.startDate := '2024-03-01'
!objective61.endDate := '2024-05-01'
!objective61.success := true
!insert (objective61, player61) into TrainingObjectivePlayer

!new TrainingObjective('objective62')
!objective62.areaToImprove := 'Defensive Blocking'
!objective62.startDate := '2024-02-05'
!objective62.endDate := '2024-04-05'
!objective62.success := false
!insert (objective62, player62) into TrainingObjectivePlayer

!new TrainingObjective('objective63')
!objective63.areaToImprove := 'Goal Accuracy'
!objective63.startDate := '2024-01-10'
!objective63.endDate := '2024-03-10'
!objective63.success := true
!insert (objective63, player63) into TrainingObjectivePlayer

!new Competition('competition21')
!competition21.name := 'Elite Champions Cup'
!competition21.type := 'Grand Final'

!new Match('match21')
!match21.date := '2024-07-05'
!match21.homeAway := true
!insert (competition21, match21) into CompetitionMatch
!insert (team41, match21) into LocalMatch
!insert (team42, match21) into VisitorMatch

!new MatchReport('report21')
!report21.duration := 90
!report21.scoreVisitor := 2
!report21.scoreLocal := 2
!insert (match21, report21) into MatchMatchReport

!new MatchPlayer('matchPlayer61')
!matchPlayer61.booked := false
!matchPlayer61.goals := 1
!matchPlayer61.rating := 8
!insert (player61, matchPlayer61) into PlayerMatch
!insert (match21, matchPlayer61) into MatchMatchPlayer

!new MatchPlayer('matchPlayer63')
!matchPlayer63.booked := true
!matchPlayer63.goals := 2
!matchPlayer63.rating := 9
!insert (player63, matchPlayer63) into PlayerMatch
!insert (match21, matchPlayer63) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition61')
!matchPlayerPosition61.positionName := #MIDFIELDER
!matchPlayerPosition61.number := 8
!insert (matchPlayer61, matchPlayerPosition61) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition63')
!matchPlayerPosition63.positionName := #FORWARD
!matchPlayerPosition63.number := 10
!insert (matchPlayer63, matchPlayerPosition63) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event79')
!event79.eventType := #GOAL
!event79.time := 20
!insert (match21, event79) into MatchMatchEvent

!new MatchEvent('event80')
!event80.eventType := #GOAL
!event80.time := 38
!insert (match21, event80) into MatchMatchEvent

!new MatchEvent('event81')
!event81.eventType := #GOAL
!event81.time := 55
!insert (match21, event81) into MatchMatchEvent

!new MatchEvent('event82')
!event82.eventType := #GOAL
!event82.time := 78
!insert (match21, event82) into MatchMatchEvent

!new MatchNote('matchNote21')
!matchNote21.note := 'Electrifying grand final with both teams displaying excellent form'
!matchNote21.date := '2024-07-05'
!insert (match21, matchNote21) into MatchMatchNote
```
## Generation 21 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 131 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 22
```
!new Club('club43')
!club43.name := 'Storm FC'
!club43.homeGround := 'Storm Cellar'
!club43.chairman := 'Natalie Fisher'

!new Club('club44')
!club44.name := 'Hurricanes FC'
!club44.homeGround := 'Hurricane Stadium'
!club44.chairman := 'Ethan Riley'

!new Team('team43')
!team43.name := 'Storm Chasers'
!insert (club43, team43) into ClubTeam

!new Team('team44')
!team44.name := 'Hurricane Force'
!insert (club44, team44) into ClubTeam

!new Player('player64')
!player64.name := 'Isaac Turner'
!player64.age := 27
!player64.bestFoot := #RIGHT
!player64.phoneNumber := '456-789-0123'
!insert (team43, player64) into TeamPlayer

!new Player('player65')
!player65.name := 'Grace Bennett'
!player65.age := 25
!player65.bestFoot := #LEFT
!player65.phoneNumber := '567-890-1234'
!insert (team43, player65) into TeamPlayer

!new Player('player66')
!player66.name := 'Oliver Price'
!player66.age := 28
!player66.bestFoot := #BOTH
!player66.phoneNumber := '678-901-2345'
!insert (team44, player66) into TeamPlayer

!new Position('position64')
!position64.positionName := #MIDFIELDER
!insert (player64, position64) into PlayerPositions

!new Position('position65')
!position65.positionName := #FORWARD
!insert (player65, position65) into PlayerPositions

!new Position('position66')
!position66.positionName := #DEFENDER
!insert (player66, position66) into PlayerPositions

!new TrainingSession('training43')
!training43.date := '2024-08-10'
!training43.location := 'Storm Fortress'
!training43.purpose := 'Ball Control and Dribbling'
!insert (team43, training43) into TeamTraining

!new TrainingSession('training44')
!training44.date := '2024-08-11'
!training44.location := 'Hurricane Winds'
!training44.purpose := 'Defensive Set Pieces'
!insert (team44, training44) into TeamTraining

!new TrainingNotes('trainingNotes43')
!trainingNotes43.note := 'Focused on maintaining control under pressure'
!trainingNotes43.date := '2024-08-10'
!insert (training43, trainingNotes43) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes44')
!trainingNotes44.note := 'Practiced defending against corners and free kicks'
!trainingNotes44.date := '2024-08-11'
!insert (training44, trainingNotes44) into TrainingTrainingNotes

!new TrainingObjective('objective64')
!objective64.areaToImprove := 'Ball Retention'
!objective64.startDate := '2024-05-01'
!objective64.endDate := '2024-08-01'
!objective64.success := true
!insert (objective64, player64) into TrainingObjectivePlayer

!new TrainingObjective('objective65')
!objective65.areaToImprove := 'Finishing Under Pressure'
!objective65.startDate := '2024-06-10'
!objective65.endDate := '2024-09-10'
!objective65.success := false
!insert (objective65, player65) into TrainingObjectivePlayer

!new TrainingObjective('objective66')
!objective66.areaToImprove := 'Tactical Awareness'
!objective66.startDate := '2024-04-15'
!objective66.endDate := '2024-07-15'
!objective66.success := true
!insert (objective66, player66) into TrainingObjectivePlayer

!new Competition('competition22')
!competition22.name := 'World Challenge Cup'
!competition22.type := 'Final'

!new Match('match22')
!match22.date := '2024-08-20'
!match22.homeAway := false
!insert (competition22, match22) into CompetitionMatch
!insert (team43, match22) into VisitorMatch
!insert (team44, match22) into LocalMatch

!new MatchReport('report22')
!report22.duration := 90
!report22.scoreVisitor := 1
!report22.scoreLocal := 3
!insert (match22, report22) into MatchMatchReport

!new MatchPlayer('matchPlayer64')
!matchPlayer64.booked := false
!matchPlayer64.goals := 1
!matchPlayer64.rating := 8
!insert (player64, matchPlayer64) into PlayerMatch
!insert (match22, matchPlayer64) into MatchMatchPlayer

!new MatchPlayer('matchPlayer66')
!matchPlayer66.booked := true
!matchPlayer66.goals := 0
!matchPlayer66.rating := 7
!insert (player66, matchPlayer66) into PlayerMatch
!insert (match22, matchPlayer66) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition64')
!matchPlayerPosition64.positionName := #MIDFIELDER
!matchPlayerPosition64.number := 8
!insert (matchPlayer64, matchPlayerPosition64) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition66')
!matchPlayerPosition66.positionName := #DEFENDER
!matchPlayerPosition66.number := 4
!insert (matchPlayer66, matchPlayerPosition66) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event83')
!event83.eventType := #GOAL
!event83.time := 15
!insert (match22, event83) into MatchMatchEvent

!new MatchEvent('event84')
!event84.eventType := #GOAL
!event84.time := 35
!insert (match22, event84) into MatchMatchEvent

!new MatchEvent('event85')
!event85.eventType := #GOAL
!event85.time := 55
!insert (match22, event85) into MatchMatchEvent

!new MatchEvent('event86')
!event86.eventType := #GOAL
!event86.time := 75
!insert (match22, event86) into MatchMatchEvent

!new MatchNote('matchNote22')
!matchNote22.note := 'Dominant performance by Hurricanes FC, sealing a strong victory'
!matchNote22.date := '2024-08-20'
!insert (match22, matchNote22) into MatchMatchNote
```
## Generation 22 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 131 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 23
```
!new Club('club45')
!club45.name := 'Falcons United'
!club45.homeGround := 'Falcon Nest'
!club45.chairman := 'Steven Moore'

!new Club('club46')
!club46.name := 'Grizzlies FC'
!club46.homeGround := 'Grizzly Grounds'
!club46.chairman := 'Laura Carter'

!new Team('team45')
!team45.name := 'Falcon Flyers'
!insert (club45, team45) into ClubTeam

!new Team('team46')
!team46.name := 'Grizzly Bears'
!insert (club46, team46) into ClubTeam

!new Player('player67')
!player67.name := 'Jack Hunter'
!player67.age := 28
!player67.bestFoot := #BOTH
!player67.phoneNumber := '123-456-7890'
!insert (team45, player67) into TeamPlayer

!new Player('player68')
!player68.name := 'Emma Kline'
!player68.age := 24
!player68.bestFoot := #LEFT
!player68.phoneNumber := '234-567-8901'
!insert (team45, player68) into TeamPlayer

!new Player('player69')
!player69.name := 'Max Walters'
!player69.age := 29
!player69.bestFoot := #RIGHT
!player69.phoneNumber := '345-678-9012'
!insert (team46, player69) into TeamPlayer

!new Position('position67')
!position67.positionName := #FORWARD
!insert (player67, position67) into PlayerPositions

!new Position('position68')
!position68.positionName := #MIDFIELDER
!insert (player68, position68) into PlayerPositions

!new Position('position69')
!position69.positionName := #DEFENDER
!insert (player69, position69) into PlayerPositions

!new TrainingSession('training45')
!training45.date := '2024-09-05'
!training45.location := 'Falcon Heights'
!training45.purpose := 'Team Building and Coordination'
!insert (team45, training45) into TeamTraining

!new TrainingSession('training46')
!training46.date := '2024-09-06'
!training46.location := 'Grizzly Arena'
!training46.purpose := 'Strength and Endurance'
!insert (team46, training46) into TeamTraining

!new TrainingNotes('trainingNotes45')
!trainingNotes45.note := 'Improved team dynamics through small-sided games'
!trainingNotes45.date := '2024-09-05'
!insert (training45, trainingNotes45) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes46')
!trainingNotes46.note := 'Focused on building physical strength and stamina'
!trainingNotes46.date := '2024-09-06'
!insert (training46, trainingNotes46) into TrainingTrainingNotes

!new TrainingObjective('objective67')
!objective67.areaToImprove := 'Attack Coordination'
!objective67.startDate := '2024-06-10'
!objective67.endDate := '2024-09-10'
!objective67.success := true
!insert (objective67, player67) into TrainingObjectivePlayer

!new TrainingObjective('objective68')
!objective68.areaToImprove := 'Vision and Passing'
!objective68.startDate := '2024-07-15'
!objective68.endDate := '2024-10-15'
!objective68.success := false
!insert (objective68, player68) into TrainingObjectivePlayer

!new TrainingObjective('objective69')
!objective69.areaToImprove := 'Defensive Resilience'
!objective69.startDate := '2024-08-01'
!objective69.endDate := '2024-11-01'
!objective69.success := true
!insert (objective69, player69) into TrainingObjectivePlayer

!new Competition('competition23')
!competition23.name := 'Mountain Cup'
!competition23.type := 'Finals'

!new Match('match23')
!match23.date := '2024-10-10'
!match23.homeAway := false
!insert (competition23, match23) into CompetitionMatch
!insert (team45, match23) into VisitorMatch
!insert (team46, match23) into LocalMatch

!new MatchReport('report23')
!report23.duration := 90
!report23.scoreVisitor := 1
!report23.scoreLocal := 3
!insert (match23, report23) into MatchMatchReport

!new MatchPlayer('matchPlayer67')
!matchPlayer67.booked := true
!matchPlayer67.goals := 1
!matchPlayer67.rating := 8
!insert (player67, matchPlayer67) into PlayerMatch
!insert (match23, matchPlayer67) into MatchMatchPlayer

!new MatchPlayer('matchPlayer69')
!matchPlayer69.booked := false
!matchPlayer69.goals := 0
!matchPlayer69.rating := 9
!insert (player69, matchPlayer69) into PlayerMatch
!insert (match23, matchPlayer69) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition67')
!matchPlayerPosition67.positionName := #FORWARD
!matchPlayerPosition67.number := 9
!insert (matchPlayer67, matchPlayerPosition67) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition69')
!matchPlayerPosition69.positionName := #DEFENDER
!matchPlayerPosition69.number := 4
!insert (matchPlayer69, matchPlayerPosition69) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event87')
!event87.eventType := #GOAL
!event87.time := 18
!insert (match23, event87) into MatchMatchEvent

!new MatchEvent('event88')
!event88.eventType := #GOAL
!event88.time := 35
!insert (match23, event88) into MatchMatchEvent

!new MatchEvent('event89')
!event89.eventType := #GOAL
!event89.time := 58
!insert (match23, event89) into MatchMatchEvent

!new MatchEvent('event90')
!event90.eventType := #GOAL
!event90.time := 78
!insert (match23, event90) into MatchMatchEvent

!new MatchNote('matchNote23')
!matchNote23.note := 'Grizzly Bears dominated with superior defensive and offensive plays'
!matchNote23.date := '2024-10-10'
!insert (match23, matchNote23) into MatchMatchNote
```
## Generation 23 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 131 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 24
```
!new Club('club47')
!club47.name := 'Ravens FC'
!club47.homeGround := 'Raven Roost'
!club47.chairman := 'Jessica Hill'

!new Club('club48')
!club48.name := 'Cobras FC'
!club48.homeGround := 'Cobra Den'
!club48.chairman := 'Matthew Evans'

!new Team('team47')
!team47.name := 'Raven Talons'
!insert (club47, team47) into ClubTeam

!new Team('team48')
!team48.name := 'Cobra Strike'
!insert (club48, team48) into ClubTeam

!new Player('player70')
!player70.name := 'Olivia Clarke'
!player70.age := 26
!player70.bestFoot := #RIGHT
!player70.phoneNumber := '987-654-3210'
!insert (team47, player70) into TeamPlayer

!new Player('player71')
!player71.name := 'Lucas Martin'
!player71.age := 27
!player71.bestFoot := #LEFT
!player71.phoneNumber := '876-543-2109'
!insert (team47, player71) into TeamPlayer

!new Player('player72')
!player72.name := 'Amelia Johnson'
!player72.age := 28
!player72.bestFoot := #BOTH
!player72.phoneNumber := '765-432-1098'
!insert (team48, player72) into TeamPlayer

!new Position('position70')
!position70.positionName := #MIDFIELDER
!insert (player70, position70) into PlayerPositions

!new Position('position71')
!position71.positionName := #FORWARD
!insert (player71, position71) into PlayerPositions

!new Position('position72')
!position72.positionName := #DEFENDER
!insert (player72, position72) into PlayerPositions

!new TrainingSession('training47')
!training47.date := '2024-11-05'
!training47.location := 'Raven Nest'
!training47.purpose := 'Dynamic Drills and Set Pieces'
!insert (team47, training47) into TeamTraining

!new TrainingSession('training48')
!training48.date := '2024-11-06'
!training48.location := 'Cobra Training Ground'
!training48.purpose := 'Counter-Attack Strategies'
!insert (team48, training48) into TeamTraining

!new TrainingNotes('trainingNotes47')
!trainingNotes47.note := 'Improved set-piece execution and dynamic plays'
!trainingNotes47.date := '2024-11-05'
!insert (training47, trainingNotes47) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes48')
!trainingNotes48.note := 'Emphasized quick transitions and counter-attacks'
!trainingNotes48.date := '2024-11-06'
!insert (training48, trainingNotes48) into TrainingTrainingNotes

!new TrainingObjective('objective70')
!objective70.areaToImprove := 'Set-Piece Efficiency'
!objective70.startDate := '2024-08-01'
!objective70.endDate := '2024-11-01'
!objective70.success := true
!insert (objective70, player70) into TrainingObjectivePlayer

!new TrainingObjective('objective71')
!objective71.areaToImprove := 'Goal Scoring Techniques'
!objective71.startDate := '2024-08-15'
!objective71.endDate := '2024-11-15'
!objective71.success := false
!insert (objective71, player71) into TrainingObjectivePlayer

!new TrainingObjective('objective72')
!objective72.areaToImprove := 'Defensive Stability'
!objective72.startDate := '2024-07-10'
!objective72.endDate := '2024-10-10'
!objective72.success := true
!insert (objective72, player72) into TrainingObjectivePlayer

!new Competition('competition24')
!competition24.name := 'Oceanic League Final'
!competition24.type := 'Championship Match'

!new Match('match24')
!match24.date := '2024-11-20'
!match24.homeAway := true
!insert (competition24, match24) into CompetitionMatch
!insert (team47, match24) into LocalMatch
!insert (team48, match24) into VisitorMatch

!new MatchReport('report24')
!report24.duration := 90
!report24.scoreVisitor := 2
!report24.scoreLocal := 3
!insert (match24, report24) into MatchMatchReport

!new MatchPlayer('matchPlayer70')
!matchPlayer70.booked := true
!matchPlayer70.goals := 1
!matchPlayer70.rating := 8
!insert (player70, matchPlayer70) into PlayerMatch
!insert (match24, matchPlayer70) into MatchMatchPlayer

!new MatchPlayer('matchPlayer72')
!matchPlayer72.booked := false
!matchPlayer72.goals := 0
!matchPlayer72.rating := 7
!insert (player72, matchPlayer72) into PlayerMatch
!insert (match24, matchPlayer72) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition70')
!matchPlayerPosition70.positionName := #MIDFIELDER
!matchPlayerPosition70.number := 6
!insert (matchPlayer70, matchPlayerPosition70) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition72')
!matchPlayerPosition72.positionName := #DEFENDER
!matchPlayerPosition72.number := 3
!insert (matchPlayer72, matchPlayerPosition72) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event91')
!event91.eventType := #GOAL
!event91.time := 12
!insert (match24, event91) into MatchMatchEvent

!new MatchEvent('event92')
!event92.eventType := #GOAL
!event92.time := 30
!insert (match24, event92) into MatchMatchEvent

!new MatchEvent('event93')
!event93.eventType := #GOAL
!event93.time := 47
!insert (match24, event93) into MatchMatchEvent

!new MatchEvent('event94')
!event94.eventType := #GOAL
!event94.time := 69
!insert (match24, event94) into MatchMatchEvent

!new MatchEvent('event95')
!event95.eventType := #GOAL
!event95.time := 85
!insert (match24, event95) into MatchMatchEvent

!new MatchNote('matchNote24')
!matchNote24.note := 'Raven Talons edged out a victory in a high-intensity match'
!matchNote24.date := '2024-11-20'
!insert (match24, matchNote24) into MatchMatchNote
```
## Generation 24 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 135 | 0.00% |
| Multiplicities Errors | 0 | 31 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 25
```
!new Club('club49')
!club49.name := 'Wolverines FC'
!club49.homeGround := 'Wolverine Den'
!club49.chairman := 'Liam Roberts'

!new Club('club50')
!club50.name := 'Pythons FC'
!club50.homeGround := 'Python Pit'
!club50.chairman := 'Sophia White'

!new Team('team49')
!team49.name := 'Wolverine Warriors'
!insert (club49, team49) into ClubTeam

!new Team('team50')
!team50.name := 'Python Slayers'
!insert (club50, team50) into ClubTeam

!new Player('player73')
!player73.name := 'Henry Clarke'
!player73.age := 29
!player73.bestFoot := #BOTH
!player73.phoneNumber := '654-789-3210'
!insert (team49, player73) into TeamPlayer

!new Player('player74')
!player74.name := 'Jessica Taylor'
!player74.age := 26
!player74.bestFoot := #LEFT
!player74.phoneNumber := '543-678-2109'
!insert (team49, player74) into TeamPlayer

!new Player('player75')
!player75.name := 'Daniel Walker'
!player75.age := 28
!player75.bestFoot := #RIGHT
!player75.phoneNumber := '432-567-1098'
!insert (team50, player75) into TeamPlayer

!new Position('position73')
!position73.positionName := #DEFENDER
!insert (player73, position73) into PlayerPositions

!new Position('position74')
!position74.positionName := #MIDFIELDER
!insert (player74, position74) into PlayerPositions

!new Position('position75')
!position75.positionName := #FORWARD
!insert (player75, position75) into PlayerPositions

!new TrainingSession('training49')
!training49.date := '2024-12-01'
!training49.location := 'Wolverine Arena'
!training49.purpose := 'Strength and Conditioning'
!insert (team49, training49) into TeamTraining

!new TrainingSession('training50')
!training50.date := '2024-12-02'
!training50.location := 'Python Gym'
!training50.purpose := 'Advanced Tactics'
!insert (team50, training50) into TeamTraining

!new TrainingNotes('trainingNotes49')
!trainingNotes49.note := 'Focused on enhancing player strength and endurance'
!trainingNotes49.date := '2024-12-01'
!insert (training49, trainingNotes49) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes50')
!trainingNotes50.note := 'Reviewed complex offensive and defensive tactics'
!trainingNotes50.date := '2024-12-02'
!insert (training50, trainingNotes50) into TrainingTrainingNotes

!new TrainingObjective('objective73')
!objective73.areaToImprove := 'Defensive Physicality'
!objective73.startDate := '2024-09-01'
!objective73.endDate := '2024-12-01'
!objective73.success := true
!insert (objective73, player73) into TrainingObjectivePlayer

!new TrainingObjective('objective74')
!objective74.areaToImprove := 'Creative Playmaking'
!objective74.startDate := '2024-10-10'
!objective74.endDate := '2025-01-10'
!objective74.success := false
!insert (objective74, player74) into TrainingObjectivePlayer

!new TrainingObjective('objective75')
!objective75.areaToImprove := 'Finishing Precision'
!objective75.startDate := '2024-11-15'
!objective75.endDate := '2025-02-15'
!objective75.success := true
!insert (objective75, player75) into TrainingObjectivePlayer

!new Competition('competition25')
!competition25.name := 'National Super Cup'
!competition25.type := 'Finals'

!new Match('match25')
!match25.date := '2024-12-15'
!match25.homeAway := true
!insert (competition25, match25) into CompetitionMatch
!insert (team49, match25) into LocalMatch
!insert (team50, match25) into VisitorMatch

!new MatchReport('report25')
!report25.duration := 90
!report25.scoreVisitor := 1
!report25.scoreLocal := 2
!insert (match25, report25) into MatchMatchReport

!new MatchPlayer('matchPlayer73')
!matchPlayer73.booked := false
!matchPlayer73.goals := 0
!matchPlayer73.rating := 7
!insert (player73, matchPlayer73) into PlayerMatch
!insert (match25, matchPlayer73) into MatchMatchPlayer

!new MatchPlayer('matchPlayer75')
!matchPlayer75.booked := true
!matchPlayer75.goals := 1
!matchPlayer75.rating := 8
!insert (player75, matchPlayer75) into PlayerMatch
!insert (match25, matchPlayer75) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition73')
!matchPlayerPosition73.positionName := #DEFENDER
!matchPlayerPosition73.number := 5
!insert (matchPlayer73, matchPlayerPosition73) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition75')
!matchPlayerPosition75.positionName := #FORWARD
!matchPlayerPosition75.number := 9
!insert (matchPlayer75, matchPlayerPosition75) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event96')
!event96.eventType := #GOAL
!event96.time := 22
!insert (match25, event96) into MatchMatchEvent

!new MatchEvent('event97')
!event97.eventType := #GOAL
!event97.time := 41
!insert (match25, event97) into MatchMatchEvent

!new MatchEvent('event98')
!event98.eventType := #GOAL
!event98.time := 78
!insert (match25, event98) into MatchMatchEvent

!new MatchNote('matchNote25')
!matchNote25.note := 'Wolverine Warriors clinched the cup with tactical superiority'
!matchNote25.date := '2024-12-15'
!insert (match25, matchNote25) into MatchMatchNote
```
## Generation 25 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 127 | 0.00% |
| Multiplicities Errors | 0 | 29 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 26
```
!new Club('club51')
!club51.name := 'Dragons United'
!club51.homeGround := 'Dragons Lair'
!club51.chairman := 'Alan Reed'

!new Club('club52')
!club52.name := 'Giants FC'
!club52.homeGround := 'Giants Arena'
!club52.chairman := 'Sarah Jones'

!new Team('team51')
!team51.name := 'Dragon Flames'
!insert (club51, team51) into ClubTeam

!new Team('team52')
!team52.name := 'Giant Guardians'
!insert (club52, team52) into ClubTeam

!new Player('player76')
!player76.name := 'Ethan Foster'
!player76.age := 31
!player76.bestFoot := #RIGHT
!player76.phoneNumber := '345-678-9012'
!insert (team51, player76) into TeamPlayer

!new Player('player77')
!player77.name := 'Lily Adams'
!player77.age := 29
!player77.bestFoot := #LEFT
!player77.phoneNumber := '456-789-0123'
!insert (team51, player77) into TeamPlayer

!new Player('player78')
!player78.name := 'Noah Turner'
!player78.age := 28
!player78.bestFoot := #BOTH
!player78.phoneNumber := '567-890-1234'
!insert (team52, player78) into TeamPlayer

!new Position('position76')
!position76.positionName := #GOALKEEPER
!insert (player76, position76) into PlayerPositions

!new Position('position77')
!position77.positionName := #MIDFIELDER
!insert (player77, position77) into PlayerPositions

!new Position('position78')
!position78.positionName := #DEFENDER
!insert (player78, position78) into PlayerPositions

!new TrainingSession('training51')
!training51.date := '2025-01-05'
!training51.location := 'Dragons Den'
!training51.purpose := 'Agility and Flexibility'
!insert (team51, training51) into TeamTraining

!new TrainingSession('training52')
!training52.date := '2025-01-06'
!training52.location := 'Giants Stronghold'
!training52.purpose := 'Strength Training'
!insert (team52, training52) into TeamTraining

!new TrainingNotes('trainingNotes51')
!trainingNotes51.note := 'Worked on enhancing quick changes in direction and flexibility'
!trainingNotes51.date := '2025-01-05'
!insert (training51, trainingNotes51) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes52')
!trainingNotes52.note := 'Focused on muscle strength and overall stamina'
!trainingNotes52.date := '2025-01-06'
!insert (training52, trainingNotes52) into TrainingTrainingNotes

!new TrainingObjective('objective76')
!objective76.areaToImprove := 'Reflexes and Saves'
!objective76.startDate := '2024-10-01'
!objective76.endDate := '2025-01-01'
!objective76.success := true
!insert (objective76, player76) into TrainingObjectivePlayer

!new TrainingObjective('objective77')
!objective77.areaToImprove := 'Passing and Control'
!objective77.startDate := '2024-11-01'
!objective77.endDate := '2025-02-01'
!objective77.success := false
!insert (objective77, player77) into TrainingObjectivePlayer

!new TrainingObjective('objective78')
!objective78.areaToImprove := 'Defensive Tactics'
!objective78.startDate := '2024-12-01'
!objective78.endDate := '2025-03-01'
!objective78.success := true
!insert (objective78, player78) into TrainingObjectivePlayer

!new Competition('competition26')
!competition26.name := 'Island Championship'
!competition26.type := 'One-off Match'

!new Match('match26')
!match26.date := '2025-01-20'
!match26.homeAway := false
!insert (competition26, match26) into CompetitionMatch
!insert (team51, match26) into VisitorMatch
!insert (team52, match26) into LocalMatch

!new MatchReport('report26')
!report26.duration := 90
!report26.scoreVisitor := 2
!report26.scoreLocal := 2
!insert (match26, report26) into MatchMatchReport

!new MatchPlayer('matchPlayer76')
!matchPlayer76.booked := false
!matchPlayer76.goals := 0
!matchPlayer76.rating := 8
!insert (player76, matchPlayer76) into PlayerMatch
!insert (match26, matchPlayer76) into MatchMatchPlayer

!new MatchPlayer('matchPlayer78')
!matchPlayer78.booked := true
!matchPlayer78.goals := 1
!matchPlayer78.rating := 9
!insert (player78, matchPlayer78) into PlayerMatch
!insert (match26, matchPlayer78) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition76')
!matchPlayerPosition76.positionName := #GOALKEEPER
!matchPlayerPosition76.number := 1
!insert (matchPlayer76, matchPlayerPosition76) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition78')
!matchPlayerPosition78.positionName := #DEFENDER
!matchPlayerPosition78.number := 4
!insert (matchPlayer78, matchPlayerPosition78) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event99')
!event99.eventType := #GOAL
!event99.time := 28
!insert (match26, event99) into MatchMatchEvent

!new MatchEvent('event100')
!event100.eventType := #GOAL
!event100.time := 42
!insert (match26, event100) into MatchMatchEvent

!new MatchEvent('event101')
!event101.eventType := #GOAL
!event101.time := 60
!insert (match26, event101) into MatchMatchEvent

!new MatchEvent('event102')
!event102.eventType := #GOAL
!event102.time := 88
!insert (match26, event102) into MatchMatchEvent

!new MatchNote('matchNote26')
!matchNote26.note := 'Thrilling draw with both teams capitalizing on goals in the critical moments'
!matchNote26.date := '2025-01-20'
!insert (match26, matchNote26) into MatchMatchNote
```
## Generation 26 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 131 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 27
```
!new Club('club53')
!club53.name := 'Panthers FC'
!club53.homeGround := 'Panther Arena'
!club53.chairman := 'Mia Carter'

!new Club('club54')
!club54.name := 'Eagles FC'
!club54.homeGround := 'Eagle Nest'
!club54.chairman := 'Oliver Hayes'

!new Team('team53')
!team53.name := 'Panther Prowlers'
!insert (club53, team53) into ClubTeam

!new Team('team54')
!team54.name := 'Eagle Runners'
!insert (club54, team54) into ClubTeam

!new Player('player79')
!player79.name := 'Ava Simmons'
!player79.age := 26
!player79.bestFoot := #RIGHT
!player79.phoneNumber := '789-012-3456'
!insert (team53, player79) into TeamPlayer

!new Player('player80')
!player80.name := 'James Bennett'
!player80.age := 27
!player80.bestFoot := #LEFT
!player80.phoneNumber := '890-123-4567'
!insert (team53, player80) into TeamPlayer

!new Player('player81')
!player81.name := 'Liam Brooks'
!player81.age := 28
!player81.bestFoot := #BOTH
!player81.phoneNumber := '901-234-5678'
!insert (team54, player81) into TeamPlayer

!new Position('position79')
!position79.positionName := #DEFENDER
!insert (player79, position79) into PlayerPositions

!new Position('position80')
!position80.positionName := #MIDFIELDER
!insert (player80, position80) into PlayerPositions

!new Position('position81')
!position81.positionName := #FORWARD
!insert (player81, position81) into PlayerPositions

!new TrainingSession('training53')
!training53.date := '2025-02-10'
!training53.location := 'Panther Grounds'
!training53.purpose := 'Ball Distribution and Control'
!insert (team53, training53) into TeamTraining

!new TrainingSession('training54')
!training54.date := '2025-02-11'
!training54.location := 'Eagle Flight Zone'
!training54.purpose := 'Precision Shooting'
!insert (team54, training54) into TeamTraining

!new TrainingNotes('trainingNotes53')
!trainingNotes53.note := 'Improved ball control under tight conditions'
!trainingNotes53.date := '2025-02-10'
!insert (training53, trainingNotes53) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes54')
!trainingNotes54.note := 'Focused on accuracy and timing of shots'
!trainingNotes54.date := '2025-02-11'
!insert (training54, trainingNotes54) into TrainingTrainingNotes

!new TrainingObjective('objective79')
!objective79.areaToImprove := 'Passing Accuracy'
!objective79.startDate := '2024-11-05'
!objective79.endDate := '2025-02-05'
!objective79.success := true
!insert (objective79, player79) into TrainingObjectivePlayer

!new TrainingObjective('objective80')
!objective80.areaToImprove := 'Midfield Vision'
!objective80.startDate := '2024-12-01'
!objective80.endDate := '2025-03-01'
!objective80.success := false
!insert (objective80, player80) into TrainingObjectivePlayer

!new TrainingObjective('objective81')
!objective81.areaToImprove := 'Finishing Techniques'
!objective81.startDate := '2024-10-20'
!objective81.endDate := '2025-01-20'
!objective81.success := true
!insert (objective81, player81) into TrainingObjectivePlayer

!new Competition('competition27')
!competition27.name := 'Intercontinental Cup'
!competition27.type := 'Quarter-Finals'

!new Match('match27')
!match27.date := '2025-02-25'
!match27.homeAway := true
!insert (competition27, match27) into CompetitionMatch
!insert (team53, match27) into LocalMatch
!insert (team54, match27) into VisitorMatch

!new MatchReport('report27')
!report27.duration := 90
!report27.scoreVisitor := 1
!report27.scoreLocal := 3
!insert (match27, report27) into MatchMatchReport

!new MatchPlayer('matchPlayer79')
!matchPlayer79.booked := false
!matchPlayer79.goals := 1
!matchPlayer79.rating := 8
!insert (player79, matchPlayer79) into PlayerMatch
!insert (match27, matchPlayer79) into MatchMatchPlayer

!new MatchPlayer('matchPlayer81')
!matchPlayer81.booked := true
!matchPlayer81.goals := 0
!matchPlayer81.rating := 6
!insert (player81, matchPlayer81) into PlayerMatch
!insert (match27, matchPlayer81) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition79')
!matchPlayerPosition79.positionName := #DEFENDER
!matchPlayerPosition79.number := 5
!insert (matchPlayer79, matchPlayerPosition79) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition81')
!matchPlayerPosition81.positionName := #FORWARD
!matchPlayerPosition81.number := 7
!insert (matchPlayer81, matchPlayerPosition81) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event103')
!event103.eventType := #GOAL
!event103.time := 17
!insert (match27, event103) into MatchMatchEvent

!new MatchEvent('event104')
!event104.eventType := #GOAL
!event104.time := 36
!insert (match27, event104) into MatchMatchEvent

!new MatchEvent('event105')
!event105.eventType := #GOAL
!event105.time := 60
!insert (match27, event105) into MatchMatchEvent

!new MatchEvent('event106')
!event106.eventType := #GOAL
!event106.time := 82
!insert (match27, event106) into MatchMatchEvent

!new MatchNote('matchNote27')
!matchNote27.note := 'Panther Prowlers controlled the match with solid defense and attack'
!matchNote27.date := '2025-02-25'
!insert (match27, matchNote27) into MatchMatchNote
```
## Generation 27 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 131 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 28
```
!new Club('club55')
!club55.name := 'Tigers FC'
!club55.homeGround := 'Tiger Valley'
!club55.chairman := 'Nathan Diaz'

!new Club('club56')
!club56.name := 'Sharks United'
!club56.homeGround := 'Shark Bay'
!club56.chairman := 'Lucy Knight'

!new Team('team55')
!team55.name := 'Tiger Stripes'
!insert (club55, team55) into ClubTeam

!new Team('team56')
!team56.name := 'Shark Savages'
!insert (club56, team56) into ClubTeam

!new Player('player82')
!player82.name := 'Zara Lee'
!player82.age := 24
!player82.bestFoot := #RIGHT
!player82.phoneNumber := '234-567-8910'
!insert (team55, player82) into TeamPlayer

!new Player('player83')
!player83.name := 'Jack Perez'
!player83.age := 28
!player83.bestFoot := #LEFT
!player83.phoneNumber := '345-678-9011'
!insert (team55, player83) into TeamPlayer

!new Player('player84')
!player84.name := 'Sophia Gray'
!player84.age := 30
!player84.bestFoot := #BOTH
!player84.phoneNumber := '456-789-0122'
!insert (team56, player84) into TeamPlayer

!new Position('position82')
!position82.positionName := #FORWARD
!insert (player82, position82) into PlayerPositions

!new Position('position83')
!position83.positionName := #MIDFIELDER
!insert (player83, position83) into PlayerPositions

!new Position('position84')
!position84.positionName := #DEFENDER
!insert (player84, position84) into PlayerPositions

!new TrainingSession('training55')
!training55.date := '2025-03-15'
!training55.location := 'Tiger Training Grounds'
!training55.purpose := 'Intensity and Speed Drills'
!insert (team55, training55) into TeamTraining

!new TrainingSession('training56')
!training56.date := '2025-03-16'
!training56.location := 'Shark Workout Center'
!training56.purpose := 'Tactical Flexibility'
!insert (team56, training56) into TeamTraining

!new TrainingNotes('trainingNotes55')
!trainingNotes55.note := 'Performed high-intensity sprinting and agility circuits'
!trainingNotes55.date := '2025-03-15'
!insert (training55, trainingNotes55) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes56')
!trainingNotes56.note := 'Focused on adapting strategies for different opposition'
!trainingNotes56.date := '2025-03-16'
!insert (training56, trainingNotes56) into TrainingTrainingNotes

!new TrainingObjective('objective82')
!objective82.areaToImprove := 'Speed and Acceleration'
!objective82.startDate := '2024-12-01'
!objective82.endDate := '2025-03-01'
!objective82.success := true
!insert (objective82, player82) into TrainingObjectivePlayer

!new TrainingObjective('objective83')
!objective83.areaToImprove := 'Playmaker Role'
!objective83.startDate := '2025-01-10'
!objective83.endDate := '2025-04-10'
!objective83.success := false
!insert (objective83, player83) into TrainingObjectivePlayer

!new TrainingObjective('objective84')
!objective84.areaToImprove := 'Defensive Cohesion'
!objective84.startDate := '2024-11-05'
!objective84.endDate := '2025-02-05'
!objective84.success := true
!insert (objective84, player84) into TrainingObjectivePlayer

!new Competition('competition28')
!competition28.name := 'Atlantic Trophy'
!competition28.type := 'Semi-Final'

!new Match('match28')
!match28.date := '2025-04-05'
!match28.homeAway := true
!insert (competition28, match28) into CompetitionMatch
!insert (team55, match28) into LocalMatch
!insert (team56, match28) into VisitorMatch

!new MatchReport('report28')
!report28.duration := 90
!report28.scoreVisitor := 2
!report28.scoreLocal := 1
!insert (match28, report28) into MatchMatchReport

!new MatchPlayer('matchPlayer82')
!matchPlayer82.booked := false
!matchPlayer82.goals := 1
!matchPlayer82.rating := 7
!insert (player82, matchPlayer82) into PlayerMatch
!insert (match28, matchPlayer82) into MatchMatchPlayer

!new MatchPlayer('matchPlayer84')
!matchPlayer84.booked := true
!matchPlayer84.goals := 0
!matchPlayer84.rating := 8
!insert (player84, matchPlayer84) into PlayerMatch
!insert (match28, matchPlayer84) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition82')
!matchPlayerPosition82.positionName := #FORWARD
!matchPlayerPosition82.number := 11
!insert (matchPlayer82, matchPlayerPosition82) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition84')
!matchPlayerPosition84.positionName := #DEFENDER
!matchPlayerPosition84.number := 3
!insert (matchPlayer84, matchPlayerPosition84) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event107')
!event107.eventType := #GOAL
!event107.time := 25
!insert (match28, event107) into MatchMatchEvent

!new MatchEvent('event108')
!event108.eventType := #GOAL
!event108.time := 40
!insert (match28, event108) into MatchMatchEvent

!new MatchEvent('event109')
!event109.eventType := #GOAL
!event109.time := 65
!insert (match28, event109) into MatchMatchEvent

!new MatchNote('matchNote28')
!matchNote28.note := 'Shark Savages advance with solid defensive play'
!matchNote28.date := '2025-04-05'
!insert (match28, matchNote28) into MatchMatchNote
```
## Generation 28 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 127 | 0.00% |
| Multiplicities Errors | 0 | 29 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 29
```
!new Club('club57')
!club57.name := 'Wolves FC'
!club57.homeGround := 'Wolf Den Stadium'
!club57.chairman := 'Eva Martin'

!new Club('club58')
!club58.name := 'Raptors FC'
!club58.homeGround := 'Raptor Arena'
!club58.chairman := 'John Baxter'

!new Team('team57')
!team57.name := 'Wolf Pack'
!insert (club57, team57) into ClubTeam

!new Team('team58')
!team58.name := 'Raptor Claws'
!insert (club58, team58) into ClubTeam

!new Player('player85')
!player85.name := 'Ethan Black'
!player85.age := 27
!player85.bestFoot := #RIGHT
!player85.phoneNumber := '789-321-4567'
!insert (team57, player85) into TeamPlayer

!new Player('player86')
!player86.name := 'Chloe Adams'
!player86.age := 26
!player86.bestFoot := #LEFT
!player86.phoneNumber := '678-210-3456'
!insert (team57, player86) into TeamPlayer

!new Player('player87')
!player87.name := 'Lucas Reed'
!player87.age := 28
!player87.bestFoot := #BOTH
!player87.phoneNumber := '567-123-2345'
!insert (team58, player87) into TeamPlayer

!new Position('position85')
!position85.positionName := #MIDFIELDER
!insert (player85, position85) into PlayerPositions

!new Position('position86')
!position86.positionName := #FORWARD
!insert (player86, position86) into PlayerPositions

!new Position('position87')
!position87.positionName := #DEFENDER
!insert (player87, position87) into PlayerPositions

!new TrainingSession('training57')
!training57.date := '2025-04-20'
!training57.location := 'Wolf Training Fields'
!training57.purpose := 'High-Press Strategy'
!insert (team57, training57) into TeamTraining

!new TrainingSession('training58')
!training58.date := '2025-04-21'
!training58.location := 'Raptor Flight Cage'
!training58.purpose := 'Counter Defense'
!insert (team58, training58) into TeamTraining

!new TrainingNotes('trainingNotes57')
!trainingNotes57.note := 'Emphasized strong pressuring tactics in opponent half'
!trainingNotes57.date := '2025-04-20'
!insert (training57, trainingNotes57) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes58')
!trainingNotes58.note := 'Focused on quick recovery and counter-attacks'
!trainingNotes58.date := '2025-04-21'
!insert (training58, trainingNotes58) into TrainingTrainingNotes

!new TrainingObjective('objective85')
!objective85.areaToImprove := 'Pressing and Possession'
!objective85.startDate := '2025-01-01'
!objective85.endDate := '2025-04-01'
!objective85.success := true
!insert (objective85, player85) into TrainingObjectivePlayer

!new TrainingObjective('objective86')
!objective86.areaToImprove := 'Finishing Under Pressure'
!objective86.startDate := '2025-02-15'
!objective86.endDate := '2025-05-15'
!objective86.success := false
!insert (objective86, player86) into TrainingObjectivePlayer

!new TrainingObjective('objective87')
!objective87.areaToImprove := 'Defensive Agility'
!objective87.startDate := '2024-12-10'
!objective87.endDate := '2025-03-10'
!objective87.success := true
!insert (objective87, player87) into TrainingObjectivePlayer

!new Competition('competition29')
!competition29.name := 'Northern Cup'
!competition29.type := 'Final Match'

!new Match('match29')
!match29.date := '2025-05-05'
!match29.homeAway := false
!insert (competition29, match29) into CompetitionMatch
!insert (team57, match29) into VisitorMatch
!insert (team58, match29) into LocalMatch

!new MatchReport('report29')
!report29.duration := 90
!report29.scoreVisitor := 3
!report29.scoreLocal := 3
!insert (match29, report29) into MatchMatchReport

!new MatchPlayer('matchPlayer85')
!matchPlayer85.booked := false
!matchPlayer85.goals := 1
!matchPlayer85.rating := 8
!insert (player85, matchPlayer85) into PlayerMatch
!insert (match29, matchPlayer85) into MatchMatchPlayer

!new MatchPlayer('matchPlayer87')
!matchPlayer87.booked := false
!matchPlayer87.goals := 1
!matchPlayer87.rating := 9
!insert (player87, matchPlayer87) into PlayerMatch
!insert (match29, matchPlayer87) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition85')
!matchPlayerPosition85.positionName := #MIDFIELDER
!matchPlayerPosition85.number := 6
!insert (matchPlayer85, matchPlayerPosition85) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition87')
!matchPlayerPosition87.positionName := #DEFENDER
!matchPlayerPosition87.number := 4
!insert (matchPlayer87, matchPlayerPosition87) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event110')
!event110.eventType := #GOAL
!event110.time := 18
!insert (match29, event110) into MatchMatchEvent

!new MatchEvent('event111')
!event111.eventType := #GOAL
!event111.time := 37
!insert (match29, event111) into MatchMatchEvent

!new MatchEvent('event112')
!event112.eventType := #GOAL
!event112.time := 59
!insert (match29, event112) into MatchMatchEvent

!new MatchEvent('event113')
!event113.eventType := #GOAL
!event113.time := 71
!insert (match29, event113) into MatchMatchEvent

!new MatchEvent('event114')
!event114.eventType := #GOAL
!event114.time := 83
!insert (match29, event114) into MatchMatchEvent

!new MatchEvent('event115')
!event115.eventType := #GOAL
!event115.time := 88
!insert (match29, event115) into MatchMatchEvent

!new MatchNote('matchNote29')
!matchNote29.note := 'Thrilling draw with an intense second half'
!matchNote29.date := '2025-05-05'
!insert (match29, matchNote29) into MatchMatchNote
```
## Generation 29 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 139 | 0.00% |
| Multiplicities Errors | 0 | 32 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Generation 30
```
!new Club('club59')
!club59.name := 'Falcons FC'
!club59.homeGround := 'Falcon Field'
!club59.chairman := 'Laura Thompson'

!new Club('club60')
!club60.name := 'Lynx FC'
!club60.homeGround := 'Lynx Lair'
!club60.chairman := 'Simon Turner'

!new Team('team59')
!team59.name := 'Falcon Flyers'
!insert (club59, team59) into ClubTeam

!new Team('team60')
!team60.name := 'Lynx Leap'
!insert (club60, team60) into ClubTeam

!new Player('player88')
!player88.name := 'Emma Walsh'
!player88.age := 29
!player88.bestFoot := #RIGHT
!player88.phoneNumber := '321-654-9870'
!insert (team59, player88) into TeamPlayer

!new Player('player89')
!player89.name := 'Aiden Griffin'
!player89.age := 27
!player89.bestFoot := #LEFT
!player89.phoneNumber := '213-546-8790'
!insert (team59, player89) into TeamPlayer

!new Player('player90')
!player90.name := 'Lucas Hayes'
!player90.age := 30
!player90.bestFoot := #BOTH
!player90.phoneNumber := '178-953-6420'
!insert (team60, player90) into TeamPlayer

!new Position('position88')
!position88.positionName := #FORWARD
!insert (player88, position88) into PlayerPositions

!new Position('position89')
!position89.positionName := #DEFENDER
!insert (player89, position89) into PlayerPositions

!new Position('position90')
!position90.positionName := #MIDFIELDER
!insert (player90, position90) into PlayerPositions

!new TrainingSession('training59')
!training59.date := '2025-06-01'
!training59.location := 'Falcon Nest'
!training59.purpose := 'Coordinated Offensives'
!insert (team59, training59) into TeamTraining

!new TrainingSession('training60')
!training60.date := '2025-06-02'
!training60.location := 'Lynx Ground'
!training60.purpose := 'Defensive Drills'
!insert (team60, training60) into TeamTraining

!new TrainingNotes('trainingNotes59')
!trainingNotes59.note := 'Worked on synchronizing offensive plays to break defenses'
!trainingNotes59.date := '2025-06-01'
!insert (training59, trainingNotes59) into TrainingTrainingNotes

!new TrainingNotes('trainingNotes60')
!trainingNotes60.note := 'Concentrated on defensive rigidity and counter-tactics'
!trainingNotes60.date := '2025-06-02'
!insert (training60, trainingNotes60) into TrainingTrainingNotes

!new TrainingObjective('objective88')
!objective88.areaToImprove := 'Attacking Dynamics'
!objective88.startDate := '2025-03-01'
!objective88.endDate := '2025-06-01'
!objective88.success := true
!insert (objective88, player88) into TrainingObjectivePlayer

!new TrainingObjective('objective89')
!objective89.areaToImprove := 'Defensive Positional Play'
!objective89.startDate := '2025-03-10'
!objective89.endDate := '2025-06-10'
!objective89.success := false
!insert (objective89, player89) into TrainingObjectivePlayer

!new TrainingObjective('objective90')
!objective90.areaToImprove := 'Tactical Vision'
!objective90.startDate := '2025-02-15'
!objective90.endDate := '2025-05-15'
!objective90.success := true
!insert (objective90, player90) into TrainingObjectivePlayer

!new Competition('competition30')
!competition30.name := 'Skyline Cup'
!competition30.type := 'Final'

!new Match('match30')
!match30.date := '2025-07-10'
!match30.homeAway := false
!insert (competition30, match30) into CompetitionMatch
!insert (team59, match30) into VisitorMatch
!insert (team60, match30) into LocalMatch

!new MatchReport('report30')
!report30.duration := 90
!report30.scoreVisitor := 0
!report30.scoreLocal := 1
!insert (match30, report30) into MatchMatchReport

!new MatchPlayer('matchPlayer88')
!matchPlayer88.booked := true
!matchPlayer88.goals := 0
!matchPlayer88.rating := 6
!insert (player88, matchPlayer88) into PlayerMatch
!insert (match30, matchPlayer88) into MatchMatchPlayer

!new MatchPlayer('matchPlayer90')
!matchPlayer90.booked := false
!matchPlayer90.goals := 1
!matchPlayer90.rating := 9
!insert (player90, matchPlayer90) into PlayerMatch
!insert (match30, matchPlayer90) into MatchMatchPlayer

!new MatchPlayerPosition('matchPlayerPosition88')
!matchPlayerPosition88.positionName := #FORWARD
!matchPlayerPosition88.number := 11
!insert (matchPlayer88, matchPlayerPosition88) into MatchPlayerMatchPlayerPosition

!new MatchPlayerPosition('matchPlayerPosition90')
!matchPlayerPosition90.positionName := #MIDFIELDER
!matchPlayerPosition90.number := 8
!insert (matchPlayer90, matchPlayerPosition90) into MatchPlayerMatchPlayerPosition

!new MatchEvent('event116')
!event116.eventType := #GOAL
!event116.time := 62
!insert (match30, event116) into MatchMatchEvent

!new MatchNote('matchNote30')
!matchNote30.note := 'Lynx Leap secured victory through tactical mastery'
!matchNote30.date := '2025-07-10'
!insert (match30, matchNote30) into MatchMatchNote
```
## Generation 30 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 119 | 0.00% |
| Multiplicities Errors | 0 | 27 | 0.00% |
| Invariants Errors | 0 | 4 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 12 | 0.00% |

# Summary for all generations
| Summary | Value | 
|---|---| 
| Model | GPT_4O | 
| Type | Simple | 
| System | football | 
| Number of generations | 30 | 

| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 3914 | 0.00% |
| Multiplicities Errors | 0 | 897 | 0.00% |
| Invariants Errors | 0 | 120 | 0.00% |

| Football | Invalid | Total | Failure (%) | 
|---|---|---|---| 
| Dates | 0 | 360 | 0.00% |

