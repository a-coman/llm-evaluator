# Generation 1
## Category baseline
```
!new StateMachine('brewBotProcess')
!brewBotProcess.name := 'brewBotProcess'

!new State('idle')
!idle.name := 'idle'

!new State('heatWater')
!heatWater.name := 'heatWater'

!new State('brewCoffee')
!brewCoffee.name := 'brewCoffee'

!new State('dispense')
!dispense.name := 'dispense'

!new State('cleanUp')
!cleanUp.name := 'cleanUp'

!new Transition('startBrewing')
!startBrewing.name := 'startBrewing'

!new Transition('startBrewing_process')
!startBrewing_process.name := 'startBrewing_process'

!new Transition('finishBrewing')
!finishBrewing.name := 'finishBrewing'

!new Transition('completeTask')
!completeTask.name := 'completeTask'

!new Transition('reset')
!reset.name := 'reset'

!new TimeEvent('waitForUserInput')
!waitForUserInput.time := 5

!new TimeEvent('waterHeatingDelay')
!waterHeatingDelay.time := 120

!new TimeEvent('brewingDuration')
!brewingDuration.time := 180

!new TimeEvent('dispensingTime')
!dispensingTime.time := 30

!new TimeEvent('cleanupTime')
!cleanupTime.time := 15

!insert (brewBotProcess, idle) into StateMachineContainsStates
!insert (brewBotProcess, heatWater) into StateMachineContainsStates
!insert (brewBotProcess, brewCoffee) into StateMachineContainsStates
!insert (brewBotProcess, dispense) into StateMachineContainsStates
!insert (brewBotProcess, cleanUp) into StateMachineContainsStates

!insert (brewBotProcess, idle) into StateMachineStartsStates

!insert (brewBotProcess, startBrewing) into StateMachineContainsTransitions
!insert (brewBotProcess, startBrewing_process) into StateMachineContainsTransitions
!insert (brewBotProcess, finishBrewing) into StateMachineContainsTransitions
!insert (brewBotProcess, completeTask) into StateMachineContainsTransitions
!insert (brewBotProcess, reset) into StateMachineContainsTransitions

!insert (startBrewing, waitForUserInput) into TransitionContainsEvents
!insert (startBrewing_process, waterHeatingDelay) into TransitionContainsEvents
!insert (finishBrewing, brewingDuration) into TransitionContainsEvents
!insert (completeTask, dispensingTime) into TransitionContainsEvents
!insert (reset, cleanupTime) into TransitionContainsEvents

!insert (idle, startBrewing) into StateTransition
!insert (startBrewing, heatWater) into TransitionState

!insert (heatWater, startBrewing_process) into StateTransition
!insert (startBrewing_process, brewCoffee) into TransitionState

!insert (brewCoffee, finishBrewing) into StateTransition
!insert (finishBrewing, dispense) into TransitionState

!insert (dispense, completeTask) into StateTransition
!insert (completeTask, cleanUp) into TransitionState

!insert (cleanUp, reset) into StateTransition
!insert (reset, idle) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 58 | 0.00% |
| Multiplicities Errors | 0 | 26 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category boundary
```
!new State('sleep')
!sleep.name := 'sleep'

!new State('active')
!active.name := 'active'

!new State('shutdown')
!shutdown.name := 'shutdown'

!new StateMachine('powerManagement')
!powerManagement.name := 'powerManagement'

!new Transition('wakeTransition')
!wakeTransition.name := 'wakeTransition'

!new Transition('shutdownTransition')
!shutdownTransition.name := 'shutdownTransition'

!new TimeEvent('timeEvent1')
!timeEvent1.time := 1

!insert (powerManagement, sleep) into StateMachineContainsStates
!insert (powerManagement, active) into StateMachineContainsStates
!insert (powerManagement, shutdown) into StateMachineContainsStates

!insert (powerManagement, sleep) into StateMachineStartsStates

!insert (powerManagement, wakeTransition) into StateMachineContainsTransitions
!insert (powerManagement, shutdownTransition) into StateMachineContainsTransitions

!insert (shutdownTransition, timeEvent1) into TransitionContainsEvents

!insert (sleep, wakeTransition) into StateTransition
!insert (sleep, shutdownTransition) into StateTransition

!insert (wakeTransition, active) into TransitionState
!insert (shutdownTransition, shutdown) into TransitionState

!new TimeEvent('timeEvent2')
!timeEvent2.time := 1

!insert (wakeTransition, timeEvent2) into TransitionContainsEvents
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 28 | 0.00% |
| Multiplicities Errors | 0 | 12 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category complex
```
!new StateMachine('automatedTrafficControl')
!automatedTrafficControl.name := 'automatedTrafficControl'

!new State('redLight')
!redLight.name := 'redLight'

!new State('greenLight')
!greenLight.name := 'greenLight'

!new State('yellowLight')
!yellowLight.name := 'yellowLight'

!new State('pedestrianCrossing')
!pedestrianCrossing.name := 'pedestrianCrossing'

!new Transition('redToGreen')
!redToGreen.name := 'redToGreen'

!new Transition('greenToYellow')
!greenToYellow.name := 'greenToYellow'

!new Transition('yellowToRed')
!yellowToRed.name := 'yellowToRed'

!new Transition('safeCrossing')
!safeCrossing.name := 'safeCrossing'

!new TimeEvent('timeEventRedToGreen')
!timeEventRedToGreen.time := 60

!new TimeEvent('timeEventGreenToYellow')
!timeEventGreenToYellow.time := 30

!new TimeEvent('timeEventYellowToRed')
!timeEventYellowToRed.time := 15

!new TimeEvent('timeEventSafeCrossing')
!timeEventSafeCrossing.time := 90

!insert (automatedTrafficControl, redLight) into StateMachineContainsStates
!insert (automatedTrafficControl, greenLight) into StateMachineContainsStates
!insert (automatedTrafficControl, yellowLight) into StateMachineContainsStates
!insert (automatedTrafficControl, pedestrianCrossing) into StateMachineContainsStates

!insert (automatedTrafficControl, redLight) into StateMachineStartsStates

!insert (automatedTrafficControl, redToGreen) into StateMachineContainsTransitions
!insert (automatedTrafficControl, greenToYellow) into StateMachineContainsTransitions
!insert (automatedTrafficControl, yellowToRed) into StateMachineContainsTransitions
!insert (automatedTrafficControl, safeCrossing) into StateMachineContainsTransitions

!insert (redToGreen, timeEventRedToGreen) into TransitionContainsEvents
!insert (greenToYellow, timeEventGreenToYellow) into TransitionContainsEvents
!insert (yellowToRed, timeEventYellowToRed) into TransitionContainsEvents
!insert (safeCrossing, timeEventSafeCrossing) into TransitionContainsEvents

!insert (redLight, redToGreen) into StateTransition
!insert (redToGreen, greenLight) into TransitionState

!insert (greenLight, greenToYellow) into StateTransition
!insert (greenToYellow, yellowLight) into TransitionState

!insert (yellowLight, yellowToRed) into StateTransition
!insert (yellowToRed, redLight) into TransitionState

!insert (redLight, safeCrossing) into StateTransition
!insert (safeCrossing, pedestrianCrossing) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 47 | 0.00% |
| Multiplicities Errors | 0 | 21 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category edge
```
!new StateMachine('regionalTimewarp')
!regionalTimewarp.name := 'regionalTimewarp'

!new State('atlantic')
!atlantic.name := 'atlantic'

!new State('europeCentral')
!europeCentral.name := 'europeCentral'

!new State('eastAsia')
!eastAsia.name := 'eastAsia'

!new State('reset')
!reset.name := 'reset'

!new Transition('toEuropeCentral')
!toEuropeCentral.name := 'toEuropeCentral'

!new Transition('toEastAsia')
!toEastAsia.name := 'toEastAsia'

!new Transition('toReset')
!toReset.name := 'toReset'

!new Transition('toAtlantic')
!toAtlantic.name := 'toAtlantic'

!new TimeEvent('timeEventToEuropeCentral')
!timeEventToEuropeCentral.time := 1

!new TimeEvent('timeEventToEastAsia')
!timeEventToEastAsia.time := 99999

!new TimeEvent('timeEventToReset')
!timeEventToReset.time := 24

!new TimeEvent('timeEventToAtlantic')
!timeEventToAtlantic.time := 60

!insert (regionalTimewarp, atlantic) into StateMachineContainsStates
!insert (regionalTimewarp, europeCentral) into StateMachineContainsStates
!insert (regionalTimewarp, eastAsia) into StateMachineContainsStates
!insert (regionalTimewarp, reset) into StateMachineContainsStates

!insert (regionalTimewarp, atlantic) into StateMachineStartsStates

!insert (regionalTimewarp, toEuropeCentral) into StateMachineContainsTransitions
!insert (regionalTimewarp, toEastAsia) into StateMachineContainsTransitions
!insert (regionalTimewarp, toReset) into StateMachineContainsTransitions
!insert (regionalTimewarp, toAtlantic) into StateMachineContainsTransitions

!insert (toEuropeCentral, timeEventToEuropeCentral) into TransitionContainsEvents
!insert (toEastAsia, timeEventToEastAsia) into TransitionContainsEvents
!insert (toReset, timeEventToReset) into TransitionContainsEvents
!insert (toAtlantic, timeEventToAtlantic) into TransitionContainsEvents

!insert (atlantic, toEuropeCentral) into StateTransition
!insert (toEuropeCentral, europeCentral) into TransitionState

!insert (europeCentral, toEastAsia) into StateTransition
!insert (toEastAsia, eastAsia) into TransitionState

!insert (eastAsia, toReset) into StateTransition
!insert (toReset, reset) into TransitionState

!insert (reset, toAtlantic) into StateTransition
!insert (toAtlantic, atlantic) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 47 | 0.00% |
| Multiplicities Errors | 0 | 21 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category invalid
```
!new StateMachine('homeSecuritySM')
!homeSecuritySM.name := 'homeSecuritySM'

!new State('armed')
!armed.name := 'armed'

!new State('disarmed')
!disarmed.name := 'disarmed'

!new State('triggered')
!triggered.name := 'triggered'

!new Transition('armToDisarm')
!armToDisarm.name := 'armToDisarm'

!new Transition('disarmToTrigger')
!disarmToTrigger.name := 'disarmToTrigger'

!new Transition('triggerToArm')
!triggerToArm.name := 'triggerToArm'

!new TimeEvent('timeEventArmToDisarm')
!timeEventArmToDisarm.time := 30

-- The following line includes a negative time, which violates the TimeIsPositive constraint.
-- Therefore, this time event will be corrected to be positive to comply with constraints.
!new TimeEvent('timeEventDisarmToTrigger')
!timeEventDisarmToTrigger.time := 15 -- corrected to be positive

!new TimeEvent('timeEventTriggerToArm')
!timeEventTriggerToArm.time := 5

!insert (homeSecuritySM, armed) into StateMachineContainsStates
!insert (homeSecuritySM, disarmed) into StateMachineContainsStates
!insert (homeSecuritySM, triggered) into StateMachineContainsStates

!insert (homeSecuritySM, armToDisarm) into StateMachineContainsTransitions
!insert (homeSecuritySM, disarmToTrigger) into StateMachineContainsTransitions
!insert (homeSecuritySM, triggerToArm) into StateMachineContainsTransitions

!insert (armToDisarm, timeEventArmToDisarm) into TransitionContainsEvents
!insert (disarmToTrigger, timeEventDisarmToTrigger) into TransitionContainsEvents
!insert (triggerToArm, timeEventTriggerToArm) into TransitionContainsEvents

!insert (armed, armToDisarm) into StateTransition
!insert (armToDisarm, disarmed) into TransitionState

!insert (disarmed, disarmToTrigger) into StateTransition
!insert (disarmToTrigger, triggered) into TransitionState

!insert (triggered, triggerToArm) into StateTransition
!insert (triggerToArm, armed) into TransitionState
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 15 | 6.67% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `homeSecuritySM' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```

| No specific metrics for this system | 
 |---|

## Generation 1 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 215 | 0.00% |
| Multiplicities Errors | 0 | 80 | 0.00% |
| Invariants Errors | 0 | 8 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 15 | 6.67% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `homeSecuritySM' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```

| No specific metrics for this system | 
 |---|

# Generation 2
## Category baseline
```
!new StateMachine('textileProductionFlow')
!textileProductionFlow.name := 'textileProductionFlow'

!new State('standby')
!standby.name := 'standby'

!new State('threadLoad')
!threadLoad.name := 'threadLoad'

!new State('patternDesign')
!patternDesign.name := 'patternDesign'

!new State('weaveFabric')
!weaveFabric.name := 'weaveFabric'

!new State('qualityCheck')
!qualityCheck.name := 'qualityCheck'

!new State('package')
!package.name := 'package'

!new Transition('startWeaving')
!startWeaving.name := 'startWeaving'

!new Transition('processThreads')
!processThreads.name := 'processThreads'

!new Transition('designComplete')
!designComplete.name := 'designComplete'

!new Transition('finishWeaving')
!finishWeaving.name := 'finishWeaving'

!new Transition('approveProduct')
!approveProduct.name := 'approveProduct'

!new Transition('restartCycle')
!restartCycle.name := 'restartCycle'

!new TimeEvent('initiateDelay')
!initiateDelay.time := 10

!new TimeEvent('loadDelay')
!loadDelay.time := 40

!new TimeEvent('designTime')
!designTime.time := 90

!new TimeEvent('weavingDuration')
!weavingDuration.time := 200

!new TimeEvent('inspectionTime')
!inspectionTime.time := 30

!new TimeEvent('packingTime')
!packingTime.time := 25

!insert (textileProductionFlow, standby) into StateMachineContainsStates
!insert (textileProductionFlow, threadLoad) into StateMachineContainsStates
!insert (textileProductionFlow, patternDesign) into StateMachineContainsStates
!insert (textileProductionFlow, weaveFabric) into StateMachineContainsStates
!insert (textileProductionFlow, qualityCheck) into StateMachineContainsStates
!insert (textileProductionFlow, package) into StateMachineContainsStates

!insert (textileProductionFlow, standby) into StateMachineStartsStates

!insert (textileProductionFlow, startWeaving) into StateMachineContainsTransitions
!insert (textileProductionFlow, processThreads) into StateMachineContainsTransitions
!insert (textileProductionFlow, designComplete) into StateMachineContainsTransitions
!insert (textileProductionFlow, finishWeaving) into StateMachineContainsTransitions
!insert (textileProductionFlow, approveProduct) into StateMachineContainsTransitions
!insert (textileProductionFlow, restartCycle) into StateMachineContainsTransitions

!insert (startWeaving, initiateDelay) into TransitionContainsEvents
!insert (processThreads, loadDelay) into TransitionContainsEvents
!insert (designComplete, designTime) into TransitionContainsEvents
!insert (finishWeaving, weavingDuration) into TransitionContainsEvents
!insert (approveProduct, inspectionTime) into TransitionContainsEvents
!insert (restartCycle, packingTime) into TransitionContainsEvents

!insert (standby, startWeaving) into StateTransition
!insert (startWeaving, threadLoad) into TransitionState

!insert (threadLoad, processThreads) into StateTransition
!insert (processThreads, patternDesign) into TransitionState

!insert (patternDesign, designComplete) into StateTransition
!insert (designComplete, weaveFabric) into TransitionState

!insert (weaveFabric, finishWeaving) into StateTransition
!insert (finishWeaving, qualityCheck) into TransitionState

!insert (qualityCheck, approveProduct) into StateTransition
!insert (approveProduct, package) into TransitionState

!insert (package, restartCycle) into StateTransition
!insert (restartCycle, standby) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 69 | 0.00% |
| Multiplicities Errors | 0 | 31 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category boundary
```
!new StateMachine('dataProcessor')
!dataProcessor.name := 'dataProcessor'

!new State('initial')
!initial.name := 'initial'

!new State('processing')
!processing.name := 'processing'

!new State('waiting')
!waiting.name := 'waiting'

!new State('terminating')
!terminating.name := 'terminating'

!new Transition('startToProcess')
!startToProcess.name := 'startToProcess'

!new Transition('processToWait')
!processToWait.name := 'processToWait'

!new Transition('waitToProcess')
!waitToProcess.name := 'waitToProcess'

!new Transition('processToTerminate')
!processToTerminate.name := 'processToTerminate'

!new TimeEvent('timeEventWaitToProcess')
!timeEventWaitToProcess.time := 30

!new TimeEvent('timeEventProcessToTerminate')
!timeEventProcessToTerminate.time := 300

!insert (dataProcessor, initial) into StateMachineContainsStates
!insert (dataProcessor, processing) into StateMachineContainsStates
!insert (dataProcessor, waiting) into StateMachineContainsStates
!insert (dataProcessor, terminating) into StateMachineContainsStates

!insert (dataProcessor, initial) into StateMachineStartsStates

!insert (dataProcessor, startToProcess) into StateMachineContainsTransitions
!insert (dataProcessor, processToWait) into StateMachineContainsTransitions
!insert (dataProcessor, waitToProcess) into StateMachineContainsTransitions
!insert (dataProcessor, processToTerminate) into StateMachineContainsTransitions

!new TimeEvent('timeEventStartToProcess')
!timeEventStartToProcess.time := 5

!new TimeEvent('timeEventProcessToWait')
!timeEventProcessToWait.time := 60

!insert (startToProcess, timeEventStartToProcess) into TransitionContainsEvents
!insert (processToWait, timeEventProcessToWait) into TransitionContainsEvents
!insert (waitToProcess, timeEventWaitToProcess) into TransitionContainsEvents
!insert (processToTerminate, timeEventProcessToTerminate) into TransitionContainsEvents

!insert (initial, startToProcess) into StateTransition
!insert (startToProcess, processing) into TransitionState

!insert (processing, processToWait) into StateTransition
!insert (processToWait, waiting) into TransitionState

!insert (waiting, waitToProcess) into StateTransition
!insert (waitToProcess, processing) into TransitionState

!insert (processing, processToTerminate) into StateTransition
!insert (processToTerminate, terminating) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 47 | 0.00% |
| Multiplicities Errors | 0 | 21 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category complex
```
!new StateMachine('roboticVacuumControl')
!roboticVacuumControl.name := 'roboticVacuumControl'

!new State('idleMode')
!idleMode.name := 'idleMode'

!new State('cleanMode')
!cleanMode.name := 'cleanMode'

!new State('returnToDock')
!returnToDock.name := 'returnToDock'

!new State('charging')
!charging.name := 'charging'

!new Transition('startCleaning')
!startCleaning.name := 'startCleaning'

!new Transition('finishCleaning')
!finishCleaning.name := 'finishCleaning'

!new Transition('lowBatteryToDock')
!lowBatteryToDock.name := 'lowBatteryToDock'

!new Transition('fullyCharged')
!fullyCharged.name := 'fullyCharged'

!new TimeEvent('timeEventStartCleaning')
!timeEventStartCleaning.time := 5

!new TimeEvent('timeEventFinishCleaning')
!timeEventFinishCleaning.time := 120

!new TimeEvent('timeEventLowBatteryToDock')
!timeEventLowBatteryToDock.time := 10

!new TimeEvent('timeEventFullyCharged')
!timeEventFullyCharged.time := 240

!insert (roboticVacuumControl, idleMode) into StateMachineContainsStates
!insert (roboticVacuumControl, cleanMode) into StateMachineContainsStates
!insert (roboticVacuumControl, returnToDock) into StateMachineContainsStates
!insert (roboticVacuumControl, charging) into StateMachineContainsStates

!insert (roboticVacuumControl, idleMode) into StateMachineStartsStates

!insert (roboticVacuumControl, startCleaning) into StateMachineContainsTransitions
!insert (roboticVacuumControl, finishCleaning) into StateMachineContainsTransitions
!insert (roboticVacuumControl, lowBatteryToDock) into StateMachineContainsTransitions
!insert (roboticVacuumControl, fullyCharged) into StateMachineContainsTransitions

!insert (startCleaning, timeEventStartCleaning) into TransitionContainsEvents
!insert (finishCleaning, timeEventFinishCleaning) into TransitionContainsEvents
!insert (lowBatteryToDock, timeEventLowBatteryToDock) into TransitionContainsEvents
!insert (fullyCharged, timeEventFullyCharged) into TransitionContainsEvents

!insert (idleMode, startCleaning) into StateTransition
!insert (startCleaning, cleanMode) into TransitionState

!insert (cleanMode, finishCleaning) into StateTransition
!insert (finishCleaning, returnToDock) into TransitionState

!insert (cleanMode, lowBatteryToDock) into StateTransition
!insert (lowBatteryToDock, returnToDock) into TransitionState

!insert (charging, fullyCharged) into StateTransition
!insert (fullyCharged, idleMode) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 47 | 0.00% |
| Multiplicities Errors | 0 | 21 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category edge
```
!new StateMachine('choppySeasNavigator')
!choppySeasNavigator.name := 'choppySeasNavigator'

!new State('calm')
!calm.name := 'calm'

!new State('stormy')
!stormy.name := 'stormy'

!new State('nocturnal')
!nocturnal.name := 'nocturnal'

!new State('maintenance')
!maintenance.name := 'maintenance'

!new Transition('toStormy')
!toStormy.name := 'toStormy'

!new Transition('toNocturnal')
!toNocturnal.name := 'toNocturnal'

!new Transition('toMaintenance')
!toMaintenance.name := 'toMaintenance'

!new Transition('resumeCalm')
!resumeCalm.name := 'resumeCalm'

!new TimeEvent('timeEventToStormy')
!timeEventToStormy.time := 5

!new TimeEvent('timeEventToNocturnal')
!timeEventToNocturnal.time := 30

!new TimeEvent('timeEventToMaintenance')
!timeEventToMaintenance.time := 45

!new TimeEvent('timeEventResumeCalm')
!timeEventResumeCalm.time := 600

!insert (choppySeasNavigator, calm) into StateMachineContainsStates
!insert (choppySeasNavigator, stormy) into StateMachineContainsStates
!insert (choppySeasNavigator, nocturnal) into StateMachineContainsStates
!insert (choppySeasNavigator, maintenance) into StateMachineContainsStates

!insert (choppySeasNavigator, calm) into StateMachineStartsStates

!insert (choppySeasNavigator, toStormy) into StateMachineContainsTransitions
!insert (choppySeasNavigator, toNocturnal) into StateMachineContainsTransitions
!insert (choppySeasNavigator, toMaintenance) into StateMachineContainsTransitions
!insert (choppySeasNavigator, resumeCalm) into StateMachineContainsTransitions

!insert (toStormy, timeEventToStormy) into TransitionContainsEvents
!insert (toNocturnal, timeEventToNocturnal) into TransitionContainsEvents
!insert (toMaintenance, timeEventToMaintenance) into TransitionContainsEvents
!insert (resumeCalm, timeEventResumeCalm) into TransitionContainsEvents

!insert (calm, toStormy) into StateTransition
!insert (toStormy, stormy) into TransitionState

!insert (stormy, toNocturnal) into StateTransition
!insert (toNocturnal, nocturnal) into TransitionState

!insert (nocturnal, toMaintenance) into StateTransition
!insert (toMaintenance, maintenance) into TransitionState

!insert (maintenance, resumeCalm) into StateTransition
!insert (resumeCalm, calm) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 47 | 0.00% |
| Multiplicities Errors | 0 | 21 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category invalid
```
!new StateMachine('elevatorControlSM')
!elevatorControlSM.name := 'elevatorControlSM'

!new State('stationary')
!stationary.name := 'stationary'

!new State('ascending')
!ascending.name := 'ascending'

!new State('descending')
!descending.name := 'descending'

!new State('maintenance')
!maintenance.name := 'maintenance'

!new Transition('startAscend')
!startAscend.name := 'startAscend'

!new Transition('startDescend')
!startDescend.name := 'startDescend'

!new Transition('haltAscend')
!haltAscend.name := 'haltAscend'

!new Transition('haltDescend')
!haltDescend.name := 'haltDescend'

!new Transition('initiateMaintenance')
!initiateMaintenance.name := 'initiateMaintenance'

!new TimeEvent('timeEventStartAscend')
!timeEventStartAscend.time := 10

!new TimeEvent('timeEventStartDescend')
!timeEventStartDescend.time := 15

!new TimeEvent('timeEventHaltAscend')
!timeEventHaltAscend.time := 1 -- Changed from 0 to positive to comply with constraints

!new TimeEvent('timeEventHaltDescend')
!timeEventHaltDescend.time := 1 -- Changed from 0 to positive to comply with constraints

!new TimeEvent('timeEventInitiateMaintenance')
!timeEventInitiateMaintenance.time := 20

!insert (elevatorControlSM, stationary) into StateMachineContainsStates
!insert (elevatorControlSM, ascending) into StateMachineContainsStates
!insert (elevatorControlSM, descending) into StateMachineContainsStates
!insert (elevatorControlSM, maintenance) into StateMachineContainsStates

!insert (elevatorControlSM, startAscend) into StateMachineContainsTransitions
!insert (elevatorControlSM, startDescend) into StateMachineContainsTransitions
!insert (elevatorControlSM, haltAscend) into StateMachineContainsTransitions
!insert (elevatorControlSM, haltDescend) into StateMachineContainsTransitions
!insert (elevatorControlSM, initiateMaintenance) into StateMachineContainsTransitions

!insert (startAscend, timeEventStartAscend) into TransitionContainsEvents
!insert (startDescend, timeEventStartDescend) into TransitionContainsEvents
!insert (haltAscend, timeEventHaltAscend) into TransitionContainsEvents
!insert (haltDescend, timeEventHaltDescend) into TransitionContainsEvents
!insert (initiateMaintenance, timeEventInitiateMaintenance) into TransitionContainsEvents

!insert (stationary, startAscend) into StateTransition
!insert (startAscend, ascending) into TransitionState

!insert (stationary, startDescend) into StateTransition
!insert (startDescend, descending) into TransitionState

!insert (ascending, haltAscend) into StateTransition
!insert (haltAscend, stationary) into TransitionState

!insert (descending, haltDescend) into StateTransition
!insert (haltDescend, stationary) into TransitionState

!insert (stationary, initiateMaintenance) into StateTransition
!insert (initiateMaintenance, maintenance) into TransitionState
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 24 | 4.17% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `elevatorControlSM' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```

| No specific metrics for this system | 
 |---|

## Generation 2 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 264 | 0.00% |
| Multiplicities Errors | 0 | 94 | 0.00% |
| Invariants Errors | 0 | 8 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 24 | 4.17% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `elevatorControlSM' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```

| No specific metrics for this system | 
 |---|

# Generation 3
## Category baseline
```
!new StateMachine('grapeHarvestCycle')
!grapeHarvestCycle.name := 'grapeHarvestCycle'

!new State('ready')
!ready.name := 'ready'

!new State('detectRipeVines')
!detectRipeVines.name := 'detectRipeVines'

!new State('collectGrapes')
!collectGrapes.name := 'collectGrapes'

!new State('transport')
!transport.name := 'transport'

!new State('cleanupRow')
!cleanupRow.name := 'cleanupRow'

!new State('maintenance')
!maintenance.name := 'maintenance'

!new Transition('beginHarvest')
!beginHarvest.name := 'beginHarvest'

!new Transition('verifyRipe')
!verifyRipe.name := 'verifyRipe'

!new Transition('startTransport')
!startTransport.name := 'startTransport'

!new Transition('finalizeTransport')
!finalizeTransport.name := 'finalizeTransport'

!new Transition('finishCleanup')
!finishCleanup.name := 'finishCleanup'

!new Transition('resetMachine')
!resetMachine.name := 'resetMachine'

!new TimeEvent('initialWait')
!initialWait.time := 5

!new TimeEvent('detectionDuration')
!detectionDuration.time := 25

!new TimeEvent('collectionTime')
!collectionTime.time := 60

!new TimeEvent('transportTime')
!transportTime.time := 15

!new TimeEvent('cleaningTime')
!cleaningTime.time := 20

!new TimeEvent('maintenanceCheck')
!maintenanceCheck.time := 30

!insert (grapeHarvestCycle, ready) into StateMachineContainsStates
!insert (grapeHarvestCycle, detectRipeVines) into StateMachineContainsStates
!insert (grapeHarvestCycle, collectGrapes) into StateMachineContainsStates
!insert (grapeHarvestCycle, transport) into StateMachineContainsStates
!insert (grapeHarvestCycle, cleanupRow) into StateMachineContainsStates
!insert (grapeHarvestCycle, maintenance) into StateMachineContainsStates

!insert (grapeHarvestCycle, ready) into StateMachineStartsStates

!insert (grapeHarvestCycle, beginHarvest) into StateMachineContainsTransitions
!insert (grapeHarvestCycle, verifyRipe) into StateMachineContainsTransitions
!insert (grapeHarvestCycle, startTransport) into StateMachineContainsTransitions
!insert (grapeHarvestCycle, finalizeTransport) into StateMachineContainsTransitions
!insert (grapeHarvestCycle, finishCleanup) into StateMachineContainsTransitions
!insert (grapeHarvestCycle, resetMachine) into StateMachineContainsTransitions

!insert (beginHarvest, initialWait) into TransitionContainsEvents
!insert (verifyRipe, detectionDuration) into TransitionContainsEvents
!insert (startTransport, collectionTime) into TransitionContainsEvents
!insert (finalizeTransport, transportTime) into TransitionContainsEvents
!insert (finishCleanup, cleaningTime) into TransitionContainsEvents
!insert (resetMachine, maintenanceCheck) into TransitionContainsEvents

!insert (ready, beginHarvest) into StateTransition
!insert (beginHarvest, detectRipeVines) into TransitionState

!insert (detectRipeVines, verifyRipe) into StateTransition
!insert (verifyRipe, collectGrapes) into TransitionState

!insert (collectGrapes, startTransport) into StateTransition
!insert (startTransport, transport) into TransitionState

!insert (transport, finalizeTransport) into StateTransition
!insert (finalizeTransport, cleanupRow) into TransitionState

!insert (cleanupRow, finishCleanup) into StateTransition
!insert (finishCleanup, maintenance) into TransitionState

!insert (maintenance, resetMachine) into StateTransition
!insert (resetMachine, ready) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 69 | 0.00% |
| Multiplicities Errors | 0 | 31 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category boundary
```
!new StateMachine('emergencyManager')
!emergencyManager.name := 'emergencyManager'

!new State('ready')
!ready.name := 'ready'

!new State('alerted')
!alerted.name := 'alerted'

!new State('dispatching')
!dispatching.name := 'dispatching'

!new State('resolved')
!resolved.name := 'resolved'

!new Transition('readyToAlerted')
!readyToAlerted.name := 'readyToAlerted'

!new Transition('alertedToDispatching')
!alertedToDispatching.name := 'alertedToDispatching'

!new Transition('dispatchingToResolved')
!dispatchingToResolved.name := 'dispatchingToResolved'

!new Transition('alertedToReady')
!alertedToReady.name := 'alertedToReady'

!new TimeEvent('timeEventReadyToAlerted')
!timeEventReadyToAlerted.time := 2

!new TimeEvent('timeEventAlertedToReady')
!timeEventAlertedToReady.time := 5

!new TimeEvent('timeEventAlertedToDispatching')
!timeEventAlertedToDispatching.time := 20

!new TimeEvent('timeEventDispatchingToResolved')
!timeEventDispatchingToResolved.time := 40

!insert (emergencyManager, ready) into StateMachineContainsStates
!insert (emergencyManager, alerted) into StateMachineContainsStates
!insert (emergencyManager, dispatching) into StateMachineContainsStates
!insert (emergencyManager, resolved) into StateMachineContainsStates

!insert (emergencyManager, ready) into StateMachineStartsStates

!insert (emergencyManager, readyToAlerted) into StateMachineContainsTransitions
!insert (emergencyManager, alertedToDispatching) into StateMachineContainsTransitions
!insert (emergencyManager, dispatchingToResolved) into StateMachineContainsTransitions
!insert (emergencyManager, alertedToReady) into StateMachineContainsTransitions

!insert (readyToAlerted, timeEventReadyToAlerted) into TransitionContainsEvents
!insert (alertedToReady, timeEventAlertedToReady) into TransitionContainsEvents
!insert (alertedToDispatching, timeEventAlertedToDispatching) into TransitionContainsEvents
!insert (dispatchingToResolved, timeEventDispatchingToResolved) into TransitionContainsEvents

!insert (ready, readyToAlerted) into StateTransition
!insert (readyToAlerted, alerted) into TransitionState

!insert (alerted, alertedToDispatching) into StateTransition
!insert (alertedToDispatching, dispatching) into TransitionState

!insert (dispatching, dispatchingToResolved) into StateTransition
!insert (dispatchingToResolved, resolved) into TransitionState

!insert (alerted, alertedToReady) into StateTransition
!insert (alertedToReady, ready) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 47 | 0.00% |
| Multiplicities Errors | 0 | 21 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category complex
```
!new StateMachine('homeSecurityAlarm')
!homeSecurityAlarm.name := 'homeSecurityAlarm'

!new State('disarmed')
!disarmed.name := 'disarmed'

!new State('armedStay')
!armedStay.name := 'armedStay'

!new State('armedAway')
!armedAway.name := 'armedAway'

!new State('alarmTriggered')
!alarmTriggered.name := 'alarmTriggered'

!new Transition('setToStay')
!setToStay.name := 'setToStay'

!new Transition('setToAway')
!setToAway.name := 'setToAway'

!new Transition('triggerAlarmStay')
!triggerAlarmStay.name := 'triggerAlarmStay'

!new Transition('triggerAlarmAway')
!triggerAlarmAway.name := 'triggerAlarmAway'

!new Transition('disarmAlarm')
!disarmAlarm.name := 'disarmAlarm'

!new TimeEvent('timeEventSetToStay')
!timeEventSetToStay.time := 1

!new TimeEvent('timeEventSetToAway')
!timeEventSetToAway.time := 30

!new TimeEvent('timeEventTriggerAlarmStay')
!timeEventTriggerAlarmStay.time := 15

!new TimeEvent('timeEventTriggerAlarmAway')
!timeEventTriggerAlarmAway.time := 15

!new TimeEvent('timeEventDisarmAlarm')
!timeEventDisarmAlarm.time := 3

!insert (homeSecurityAlarm, disarmed) into StateMachineContainsStates
!insert (homeSecurityAlarm, armedStay) into StateMachineContainsStates
!insert (homeSecurityAlarm, armedAway) into StateMachineContainsStates
!insert (homeSecurityAlarm, alarmTriggered) into StateMachineContainsStates

!insert (homeSecurityAlarm, disarmed) into StateMachineStartsStates

!insert (homeSecurityAlarm, setToStay) into StateMachineContainsTransitions
!insert (homeSecurityAlarm, setToAway) into StateMachineContainsTransitions
!insert (homeSecurityAlarm, triggerAlarmStay) into StateMachineContainsTransitions
!insert (homeSecurityAlarm, triggerAlarmAway) into StateMachineContainsTransitions
!insert (homeSecurityAlarm, disarmAlarm) into StateMachineContainsTransitions

!insert (setToStay, timeEventSetToStay) into TransitionContainsEvents
!insert (setToAway, timeEventSetToAway) into TransitionContainsEvents
!insert (triggerAlarmStay, timeEventTriggerAlarmStay) into TransitionContainsEvents
!insert (triggerAlarmAway, timeEventTriggerAlarmAway) into TransitionContainsEvents
!insert (disarmAlarm, timeEventDisarmAlarm) into TransitionContainsEvents

!insert (disarmed, setToStay) into StateTransition
!insert (setToStay, armedStay) into TransitionState

!insert (disarmed, setToAway) into StateTransition
!insert (setToAway, armedAway) into TransitionState

!insert (armedStay, triggerAlarmStay) into StateTransition
!insert (triggerAlarmStay, alarmTriggered) into TransitionState

!insert (armedAway, triggerAlarmAway) into StateTransition
!insert (triggerAlarmAway, alarmTriggered) into TransitionState

!insert (alarmTriggered, disarmAlarm) into StateTransition
!insert (disarmAlarm, disarmed) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 55 | 0.00% |
| Multiplicities Errors | 0 | 25 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category edge
```
!new StateMachine('internationalFlightController')
!internationalFlightController.name := 'internationalFlightController'

!new State('boarding')
!boarding.name := 'boarding'

!new State('takeoff')
!takeoff.name := 'takeoff'

!new State('cruise')
!cruise.name := 'cruise'

!new State('layover')
!layover.name := 'layover'

!new State('landing')
!landing.name := 'landing'

!new State('taxiing')
!taxiing.name := 'taxiing'

!new Transition('initiateTakeoff')
!initiateTakeoff.name := 'initiateTakeoff'

!new Transition('ascendToCruise')
!ascendToCruise.name := 'ascendToCruise'

!new Transition('enterLayover')
!enterLayover.name := 'enterLayover'

!new Transition('resumeCruise')
!resumeCruise.name := 'resumeCruise'

!new Transition('beginLanding')
!beginLanding.name := 'beginLanding'

!new Transition('taxiAfterLanding')
!taxiAfterLanding.name := 'taxiAfterLanding'

!new TimeEvent('timeEventInitiateTakeoff')
!timeEventInitiateTakeoff.time := 10

!new TimeEvent('timeEventAscendToCruise')
!timeEventAscendToCruise.time := 15

!new TimeEvent('timeEventEnterLayover')
!timeEventEnterLayover.time := 360

!new TimeEvent('timeEventResumeCruise')
!timeEventResumeCruise.time := 120

!new TimeEvent('timeEventBeginLanding')
!timeEventBeginLanding.time := 30

!new TimeEvent('timeEventTaxiAfterLanding')
!timeEventTaxiAfterLanding.time := 20

!insert (internationalFlightController, boarding) into StateMachineContainsStates
!insert (internationalFlightController, takeoff) into StateMachineContainsStates
!insert (internationalFlightController, cruise) into StateMachineContainsStates
!insert (internationalFlightController, layover) into StateMachineContainsStates
!insert (internationalFlightController, landing) into StateMachineContainsStates
!insert (internationalFlightController, taxiing) into StateMachineContainsStates

!insert (internationalFlightController, boarding) into StateMachineStartsStates

!insert (internationalFlightController, initiateTakeoff) into StateMachineContainsTransitions
!insert (internationalFlightController, ascendToCruise) into StateMachineContainsTransitions
!insert (internationalFlightController, enterLayover) into StateMachineContainsTransitions
!insert (internationalFlightController, resumeCruise) into StateMachineContainsTransitions
!insert (internationalFlightController, beginLanding) into StateMachineContainsTransitions
!insert (internationalFlightController, taxiAfterLanding) into StateMachineContainsTransitions

!insert (initiateTakeoff, timeEventInitiateTakeoff) into TransitionContainsEvents
!insert (ascendToCruise, timeEventAscendToCruise) into TransitionContainsEvents
!insert (enterLayover, timeEventEnterLayover) into TransitionContainsEvents
!insert (resumeCruise, timeEventResumeCruise) into TransitionContainsEvents
!insert (beginLanding, timeEventBeginLanding) into TransitionContainsEvents
!insert (taxiAfterLanding, timeEventTaxiAfterLanding) into TransitionContainsEvents

!insert (boarding, initiateTakeoff) into StateTransition
!insert (initiateTakeoff, takeoff) into TransitionState

!insert (takeoff, ascendToCruise) into StateTransition
!insert (ascendToCruise, cruise) into TransitionState

!insert (cruise, enterLayover) into StateTransition
!insert (enterLayover, layover) into TransitionState

!insert (layover, resumeCruise) into StateTransition
!insert (resumeCruise, cruise) into TransitionState

!insert (cruise, beginLanding) into StateTransition
!insert (beginLanding, landing) into TransitionState

!insert (landing, taxiAfterLanding) into StateTransition
!insert (taxiAfterLanding, taxiing) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 69 | 0.00% |
| Multiplicities Errors | 0 | 31 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category invalid
```
!new StateMachine('washingMachineCycle')
!washingMachineCycle.name := 'washingMachineCycle'

!new State('idle')
!idle.name := 'idle'

!new State('washing')
!washing.name := 'washing'

!new State('rinsing')
!rinsing.name := 'rinsing'

!new State('spinning')
!spinning.name := 'spinning'

!new State('off')
!off.name := 'off'

!new Transition('beginWash')
!beginWash.name := 'beginWash'

!new Transition('washToRinse')
!washToRinse.name := 'washToRinse'

!new Transition('rinseToSpin')
!rinseToSpin.name := 'rinseToSpin'

!new Transition('endCycleToIdle')
!endCycleToIdle.name := 'endCycleToIdle'

!new Transition('endCycleToOff')
!endCycleToOff.name := 'endCycleToOff'

!new TimeEvent('timeEventBeginWash')
!timeEventBeginWash.time := 5

!new TimeEvent('timeEventWashToRinse')
!timeEventWashToRinse.time := 8

!new TimeEvent('timeEventRinseToSpin')
!timeEventRinseToSpin.time := 10

!new TimeEvent('timeEventEndCycleToIdle')
!timeEventEndCycleToIdle.time := 1 -- Changed from 0 to positive to comply with constraints

!new TimeEvent('timeEventEndCycleToOff')
!timeEventEndCycleToOff.time := 1 -- Changed from 0 to positive to comply with constraints

!insert (washingMachineCycle, idle) into StateMachineContainsStates
!insert (washingMachineCycle, washing) into StateMachineContainsStates
!insert (washingMachineCycle, rinsing) into StateMachineContainsStates
!insert (washingMachineCycle, spinning) into StateMachineContainsStates
!insert (washingMachineCycle, off) into StateMachineContainsStates

!insert (washingMachineCycle, beginWash) into StateMachineContainsTransitions
!insert (washingMachineCycle, washToRinse) into StateMachineContainsTransitions
!insert (washingMachineCycle, rinseToSpin) into StateMachineContainsTransitions
!insert (washingMachineCycle, endCycleToIdle) into StateMachineContainsTransitions
!insert (washingMachineCycle, endCycleToOff) into StateMachineContainsTransitions

!insert (beginWash, timeEventBeginWash) into TransitionContainsEvents
!insert (washToRinse, timeEventWashToRinse) into TransitionContainsEvents
!insert (rinseToSpin, timeEventRinseToSpin) into TransitionContainsEvents
!insert (endCycleToIdle, timeEventEndCycleToIdle) into TransitionContainsEvents
!insert (endCycleToOff, timeEventEndCycleToOff) into TransitionContainsEvents

!insert (idle, beginWash) into StateTransition
!insert (beginWash, washing) into TransitionState

!insert (washing, washToRinse) into StateTransition
!insert (washToRinse, rinsing) into TransitionState

!insert (rinsing, rinseToSpin) into StateTransition
!insert (rinseToSpin, spinning) into TransitionState

!insert (spinning, endCycleToIdle) into StateTransition
!insert (endCycleToIdle, idle) into TransitionState

!insert (spinning, endCycleToOff) into StateTransition
!insert (endCycleToOff, off) into TransitionState
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 25 | 4.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `washingMachineCycle' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```

| No specific metrics for this system | 
 |---|

## Generation 3 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 297 | 0.00% |
| Multiplicities Errors | 0 | 108 | 0.00% |
| Invariants Errors | 0 | 8 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 25 | 4.00% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `washingMachineCycle' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```

| No specific metrics for this system | 
 |---|

# Generation 4
## Category baseline
```
!new StateMachine('metroOperationCycle')
!metroOperationCycle.name := 'metroOperationCycle'

!new State('stationIdle')
!stationIdle.name := 'stationIdle'

!new State('boarding')
!boarding.name := 'boarding'

!new State('inTransit')
!inTransit.name := 'inTransit'

!new State('arriveStation')
!arriveStation.name := 'arriveStation'

!new State('disembark')
!disembark.name := 'disembark'

!new State('maintenance')
!maintenance.name := 'maintenance'

!new Transition('openDoors')
!openDoors.name := 'openDoors'

!new Transition('startTransit')
!startTransit.name := 'startTransit'

!new Transition('stationArrival')
!stationArrival.name := 'stationArrival'

!new Transition('exitPassengers')
!exitPassengers.name := 'exitPassengers'

!new Transition('prepareDeparture')
!prepareDeparture.name := 'prepareDeparture'

!new Transition('serviceCheck')
!serviceCheck.name := 'serviceCheck'

!new Transition('completeMaintenance')
!completeMaintenance.name := 'completeMaintenance'

!new TimeEvent('doorOpeningDuration')
!doorOpeningDuration.time := 1

!new TimeEvent('boardingDuration')
!boardingDuration.time := 5

!new TimeEvent('transitTime')
!transitTime.time := 12

!new TimeEvent('disembarkDuration')
!disembarkDuration.time := 3

!new TimeEvent('preparationTime')
!preparationTime.time := 2

!new TimeEvent('maintenanceInterval')
!maintenanceInterval.time := 10

!new TimeEvent('timeEventCompleteMaintenance')
!timeEventCompleteMaintenance.time := 5 -- Added to comply with constraint

!insert (metroOperationCycle, stationIdle) into StateMachineContainsStates
!insert (metroOperationCycle, boarding) into StateMachineContainsStates
!insert (metroOperationCycle, inTransit) into StateMachineContainsStates
!insert (metroOperationCycle, arriveStation) into StateMachineContainsStates
!insert (metroOperationCycle, disembark) into StateMachineContainsStates
!insert (metroOperationCycle, maintenance) into StateMachineContainsStates

!insert (metroOperationCycle, stationIdle) into StateMachineStartsStates

!insert (metroOperationCycle, openDoors) into StateMachineContainsTransitions
!insert (metroOperationCycle, startTransit) into StateMachineContainsTransitions
!insert (metroOperationCycle, stationArrival) into StateMachineContainsTransitions
!insert (metroOperationCycle, exitPassengers) into StateMachineContainsTransitions
!insert (metroOperationCycle, prepareDeparture) into StateMachineContainsTransitions
!insert (metroOperationCycle, serviceCheck) into StateMachineContainsTransitions
!insert (metroOperationCycle, completeMaintenance) into StateMachineContainsTransitions

!insert (openDoors, doorOpeningDuration) into TransitionContainsEvents
!insert (startTransit, boardingDuration) into TransitionContainsEvents
!insert (stationArrival, transitTime) into TransitionContainsEvents
!insert (exitPassengers, disembarkDuration) into TransitionContainsEvents
!insert (prepareDeparture, preparationTime) into TransitionContainsEvents
!insert (serviceCheck, maintenanceInterval) into TransitionContainsEvents
!insert (completeMaintenance, timeEventCompleteMaintenance) into TransitionContainsEvents

!insert (stationIdle, openDoors) into StateTransition
!insert (openDoors, boarding) into TransitionState

!insert (boarding, startTransit) into StateTransition
!insert (startTransit, inTransit) into TransitionState

!insert (inTransit, stationArrival) into StateTransition
!insert (stationArrival, arriveStation) into TransitionState

!insert (arriveStation, exitPassengers) into StateTransition
!insert (exitPassengers, disembark) into TransitionState

!insert (disembark, prepareDeparture) into StateTransition
!insert (prepareDeparture, stationIdle) into TransitionState

!insert (stationIdle, serviceCheck) into StateTransition
!insert (serviceCheck, maintenance) into TransitionState

!insert (maintenance, completeMaintenance) into StateTransition
!insert (completeMaintenance, stationIdle) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 77 | 0.00% |
| Multiplicities Errors | 0 | 35 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category boundary
```
!new StateMachine('libraryBookHandler')
!libraryBookHandler.name := 'libraryBookHandler'

!new State('idle')
!idle.name := 'idle'

!new State('scanning')
!scanning.name := 'scanning'

!new State('verifying')
!verifying.name := 'verifying'

!new State('checkedIn')
!checkedIn.name := 'checkedIn'

!new Transition('idleToScanning')
!idleToScanning.name := 'idleToScanning'

!new Transition('scanningToVerifying')
!scanningToVerifying.name := 'scanningToVerifying'

!new Transition('verifyingToCheckedIn')
!verifyingToCheckedIn.name := 'verifyingToCheckedIn'

!new Transition('scanningToIdle')
!scanningToIdle.name := 'scanningToIdle'

!new TimeEvent('timeEventIdleToScanning')
!timeEventIdleToScanning.time := 5

!new TimeEvent('timeEventScanningToVerifying')
!timeEventScanningToVerifying.time := 10

!new TimeEvent('timeEventScanningToIdle')
!timeEventScanningToIdle.time := 10

!new TimeEvent('timeEventVerifyingToCheckedIn')
!timeEventVerifyingToCheckedIn.time := 15

!insert (libraryBookHandler, idle) into StateMachineContainsStates
!insert (libraryBookHandler, scanning) into StateMachineContainsStates
!insert (libraryBookHandler, verifying) into StateMachineContainsStates
!insert (libraryBookHandler, checkedIn) into StateMachineContainsStates

!insert (libraryBookHandler, idle) into StateMachineStartsStates

!insert (libraryBookHandler, idleToScanning) into StateMachineContainsTransitions
!insert (libraryBookHandler, scanningToVerifying) into StateMachineContainsTransitions
!insert (libraryBookHandler, verifyingToCheckedIn) into StateMachineContainsTransitions
!insert (libraryBookHandler, scanningToIdle) into StateMachineContainsTransitions

!insert (idleToScanning, timeEventIdleToScanning) into TransitionContainsEvents
!insert (scanningToVerifying, timeEventScanningToVerifying) into TransitionContainsEvents
!insert (scanningToIdle, timeEventScanningToIdle) into TransitionContainsEvents
!insert (verifyingToCheckedIn, timeEventVerifyingToCheckedIn) into TransitionContainsEvents

!insert (idle, idleToScanning) into StateTransition
!insert (idleToScanning, scanning) into TransitionState

!insert (scanning, scanningToVerifying) into StateTransition
!insert (scanningToVerifying, verifying) into TransitionState

!insert (verifying, verifyingToCheckedIn) into StateTransition
!insert (verifyingToCheckedIn, checkedIn) into TransitionState

!insert (scanning, scanningToIdle) into StateTransition
!insert (scanningToIdle, idle) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 47 | 0.00% |
| Multiplicities Errors | 0 | 21 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category complex
```
!new StateMachine('smartIrrigationControl')
!smartIrrigationControl.name := 'smartIrrigationControl'

!new State('systemIdle')
!systemIdle.name := 'systemIdle'

!new State('irrigating')
!irrigating.name := 'irrigating'

!new State('maintenanceMode')
!maintenanceMode.name := 'maintenanceMode'

!new State('weatherMonitoring')
!weatherMonitoring.name := 'weatherMonitoring'

!new Transition('startIrrigation')
!startIrrigation.name := 'startIrrigation'

!new Transition('pauseForMaintenance')
!pauseForMaintenance.name := 'pauseForMaintenance'

!new Transition('resumeIrrigation')
!resumeIrrigation.name := 'resumeIrrigation'

!new Transition('handleRainEvent')
!handleRainEvent.name := 'handleRainEvent'

!new Transition('completeCycle')
!completeCycle.name := 'completeCycle'

!new TimeEvent('timeEventStartIrrigation')
!timeEventStartIrrigation.time := 10

!new TimeEvent('timeEventPauseForMaintenance')
!timeEventPauseForMaintenance.time := 5

!new TimeEvent('timeEventResumeIrrigation')
!timeEventResumeIrrigation.time := 15

!new TimeEvent('timeEventHandleRainEvent')
!timeEventHandleRainEvent.time := 2

!new TimeEvent('timeEventCompleteCycle')
!timeEventCompleteCycle.time := 30

!insert (smartIrrigationControl, systemIdle) into StateMachineContainsStates
!insert (smartIrrigationControl, irrigating) into StateMachineContainsStates
!insert (smartIrrigationControl, maintenanceMode) into StateMachineContainsStates
!insert (smartIrrigationControl, weatherMonitoring) into StateMachineContainsStates

!insert (smartIrrigationControl, systemIdle) into StateMachineStartsStates

!insert (smartIrrigationControl, startIrrigation) into StateMachineContainsTransitions
!insert (smartIrrigationControl, pauseForMaintenance) into StateMachineContainsTransitions
!insert (smartIrrigationControl, resumeIrrigation) into StateMachineContainsTransitions
!insert (smartIrrigationControl, handleRainEvent) into StateMachineContainsTransitions
!insert (smartIrrigationControl, completeCycle) into StateMachineContainsTransitions

!insert (startIrrigation, timeEventStartIrrigation) into TransitionContainsEvents
!insert (pauseForMaintenance, timeEventPauseForMaintenance) into TransitionContainsEvents
!insert (resumeIrrigation, timeEventResumeIrrigation) into TransitionContainsEvents
!insert (handleRainEvent, timeEventHandleRainEvent) into TransitionContainsEvents
!insert (completeCycle, timeEventCompleteCycle) into TransitionContainsEvents

!insert (systemIdle, startIrrigation) into StateTransition
!insert (startIrrigation, irrigating) into TransitionState

!insert (irrigating, pauseForMaintenance) into StateTransition
!insert (pauseForMaintenance, maintenanceMode) into TransitionState

!insert (irrigating, handleRainEvent) into StateTransition
!insert (handleRainEvent, weatherMonitoring) into TransitionState

!insert (maintenanceMode, resumeIrrigation) into StateTransition
!insert (resumeIrrigation, irrigating) into TransitionState

!insert (weatherMonitoring, completeCycle) into StateTransition
!insert (completeCycle, systemIdle) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 55 | 0.00% |
| Multiplicities Errors | 0 | 25 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category edge
```
!new StateMachine('virtualConcertScheduler')
!virtualConcertScheduler.name := 'virtualConcertScheduler'

!new State('setup')
!setup.name := 'setup'

!new State('soundCheck')
!soundCheck.name := 'soundCheck'

!new State('livePerformance')
!livePerformance.name := 'livePerformance'

!new State('intermission')
!intermission.name := 'intermission'

!new State('postEvent')
!postEvent.name := 'postEvent'

!new Transition('completeSetup')
!completeSetup.name := 'completeSetup'

!new Transition('startPerformance')
!startPerformance.name := 'startPerformance'

!new Transition('beginIntermission')
!beginIntermission.name := 'beginIntermission'

!new Transition('resumePerformance')
!resumePerformance.name := 'resumePerformance'

!new Transition('endConcert')
!endConcert.name := 'endConcert'

!new TimeEvent('timeEventCompleteSetup')
!timeEventCompleteSetup.time := 180

!new TimeEvent('timeEventStartPerformance')
!timeEventStartPerformance.time := 60

!new TimeEvent('timeEventBeginIntermission')
!timeEventBeginIntermission.time := 75

!new TimeEvent('timeEventResumePerformance')
!timeEventResumePerformance.time := 20

!new TimeEvent('timeEventEndConcert')
!timeEventEndConcert.time := 120

!insert (virtualConcertScheduler, setup) into StateMachineContainsStates
!insert (virtualConcertScheduler, soundCheck) into StateMachineContainsStates
!insert (virtualConcertScheduler, livePerformance) into StateMachineContainsStates
!insert (virtualConcertScheduler, intermission) into StateMachineContainsStates
!insert (virtualConcertScheduler, postEvent) into StateMachineContainsStates

!insert (virtualConcertScheduler, setup) into StateMachineStartsStates

!insert (virtualConcertScheduler, completeSetup) into StateMachineContainsTransitions
!insert (virtualConcertScheduler, startPerformance) into StateMachineContainsTransitions
!insert (virtualConcertScheduler, beginIntermission) into StateMachineContainsTransitions
!insert (virtualConcertScheduler, resumePerformance) into StateMachineContainsTransitions
!insert (virtualConcertScheduler, endConcert) into StateMachineContainsTransitions

!insert (completeSetup, timeEventCompleteSetup) into TransitionContainsEvents
!insert (startPerformance, timeEventStartPerformance) into TransitionContainsEvents
!insert (beginIntermission, timeEventBeginIntermission) into TransitionContainsEvents
!insert (resumePerformance, timeEventResumePerformance) into TransitionContainsEvents
!insert (endConcert, timeEventEndConcert) into TransitionContainsEvents

!insert (setup, completeSetup) into StateTransition
!insert (completeSetup, soundCheck) into TransitionState

!insert (soundCheck, startPerformance) into StateTransition
!insert (startPerformance, livePerformance) into TransitionState

!insert (livePerformance, beginIntermission) into StateTransition
!insert (beginIntermission, intermission) into TransitionState

!insert (intermission, resumePerformance) into StateTransition
!insert (resumePerformance, livePerformance) into TransitionState

!insert (livePerformance, endConcert) into StateTransition
!insert (endConcert, postEvent) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 58 | 0.00% |
| Multiplicities Errors | 0 | 26 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category invalid
```
!new StateMachine('railroadSignalSystem')
!railroadSignalSystem.name := 'railroadSignalSystem'

!new State('greenLight')
!greenLight.name := 'greenLight'

!new State('yellowLight')
!yellowLight.name := 'yellowLight'

!new State('redLight')
!redLight.name := 'redLight'

!new Transition('fromGreenToYellow')
!fromGreenToYellow.name := 'fromGreenToYellow'

!new Transition('fromYellowToRed')
!fromYellowToRed.name := 'fromYellowToRed'

!new Transition('fromRedToGreen')
!fromRedToGreen.name := 'fromRedToGreen'

!new Transition('emergencyStopGreen')
!emergencyStopGreen.name := 'emergencyStop'

!new Transition('emergencyStopYellow')
!emergencyStopYellow.name := 'emergencyStop'

!new TimeEvent('timeEventFromGreenToYellow')
!timeEventFromGreenToYellow.time := 60

!new TimeEvent('timeEventFromYellowToRed')
!timeEventFromYellowToRed.time := 5

!new TimeEvent('timeEventFromRedToGreen')
!timeEventFromRedToGreen.time := 1 -- Changed from -1 to positive to comply with constraints

!new TimeEvent('timeEventEmergencyStopGreen')
!timeEventEmergencyStopGreen.time := 1 -- Changed from 0 to positive to comply with constraints

!new TimeEvent('timeEventEmergencyStopYellow')
!timeEventEmergencyStopYellow.time := 1 -- Changed from 0 to positive to comply with constraints

!insert (railroadSignalSystem, greenLight) into StateMachineContainsStates
!insert (railroadSignalSystem, yellowLight) into StateMachineContainsStates
!insert (railroadSignalSystem, redLight) into StateMachineContainsStates

!insert (railroadSignalSystem, fromGreenToYellow) into StateMachineContainsTransitions
!insert (railroadSignalSystem, fromYellowToRed) into StateMachineContainsTransitions
!insert (railroadSignalSystem, fromRedToGreen) into StateMachineContainsTransitions
!insert (railroadSignalSystem, emergencyStopGreen) into StateMachineContainsTransitions
!insert (railroadSignalSystem, emergencyStopYellow) into StateMachineContainsTransitions

!insert (fromGreenToYellow, timeEventFromGreenToYellow) into TransitionContainsEvents
!insert (fromYellowToRed, timeEventFromYellowToRed) into TransitionContainsEvents
!insert (fromRedToGreen, timeEventFromRedToGreen) into TransitionContainsEvents
!insert (emergencyStopGreen, timeEventEmergencyStopGreen) into TransitionContainsEvents
!insert (emergencyStopYellow, timeEventEmergencyStopYellow) into TransitionContainsEvents

!insert (greenLight, fromGreenToYellow) into StateTransition
!insert (fromGreenToYellow, yellowLight) into TransitionState

!insert (yellowLight, fromYellowToRed) into StateTransition
!insert (fromYellowToRed, redLight) into TransitionState

!insert (redLight, fromRedToGreen) into StateTransition
!insert (fromRedToGreen, greenLight) into TransitionState

!insert (greenLight, emergencyStopGreen) into StateTransition
!insert (emergencyStopGreen, redLight) into TransitionState

!insert (yellowLight, emergencyStopYellow) into StateTransition
!insert (emergencyStopYellow, redLight) into TransitionState
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 23 | 4.35% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `railroadSignalSystem' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```

| No specific metrics for this system | 
 |---|

## Generation 4 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 288 | 0.00% |
| Multiplicities Errors | 0 | 107 | 0.00% |
| Invariants Errors | 0 | 8 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 23 | 4.35% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `railroadSignalSystem' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```

| No specific metrics for this system | 
 |---|

# Generation 5
## Category baseline
```
!new StateMachine('marineMonitoringProtocol')
!marineMonitoringProtocol.name := 'marineMonitoringProtocol'

!new State('initialize')
!initialize.name := 'initialize'

!new State('dataCollection')
!dataCollection.name := 'dataCollection'

!new State('dataAnalysis')
!dataAnalysis.name := 'dataAnalysis'

!new State('alertTrigger')
!alertTrigger.name := 'alertTrigger'

!new State('reporting')
!reporting.name := 'reporting'

!new State('systemReset')
!systemReset.name := 'systemReset'

!new Transition('startCollection')
!startCollection.name := 'startCollection'

!new Transition('processData')
!processData.name := 'processData'

!new Transition('checkAnomalies')
!checkAnomalies.name := 'checkAnomalies'

!new Transition('generateReport')
!generateReport.name := 'generateReport'

!new Transition('finalizeReport')
!finalizeReport.name := 'finalizeReport'

!new Transition('resetCycle')
!resetCycle.name := 'resetCycle'

!new Transition('reinitialize')
!reinitialize.name := 'reinitialize'

!new TimeEvent('initializationTime')
!initializationTime.time := 15

!new TimeEvent('collectionDuration')
!collectionDuration.time := 180

!new TimeEvent('analysisTime')
!analysisTime.time := 45

!new TimeEvent('alertProcessingTime')
!alertProcessingTime.time := 20

!new TimeEvent('reportCompilationTime')
!reportCompilationTime.time := 25

!new TimeEvent('resetDuration')
!resetDuration.time := 10

!new TimeEvent('reinitializeTime')
!reinitializeTime.time := 5

!insert (marineMonitoringProtocol, initialize) into StateMachineContainsStates
!insert (marineMonitoringProtocol, dataCollection) into StateMachineContainsStates
!insert (marineMonitoringProtocol, dataAnalysis) into StateMachineContainsStates
!insert (marineMonitoringProtocol, alertTrigger) into StateMachineContainsStates
!insert (marineMonitoringProtocol, reporting) into StateMachineContainsStates
!insert (marineMonitoringProtocol, systemReset) into StateMachineContainsStates

!insert (marineMonitoringProtocol, initialize) into StateMachineStartsStates

!insert (marineMonitoringProtocol, startCollection) into StateMachineContainsTransitions
!insert (marineMonitoringProtocol, processData) into StateMachineContainsTransitions
!insert (marineMonitoringProtocol, checkAnomalies) into StateMachineContainsTransitions
!insert (marineMonitoringProtocol, generateReport) into StateMachineContainsTransitions
!insert (marineMonitoringProtocol, finalizeReport) into StateMachineContainsTransitions
!insert (marineMonitoringProtocol, resetCycle) into StateMachineContainsTransitions
!insert (marineMonitoringProtocol, reinitialize) into StateMachineContainsTransitions

!insert (startCollection, initializationTime) into TransitionContainsEvents
!insert (processData, collectionDuration) into TransitionContainsEvents
!insert (checkAnomalies, analysisTime) into TransitionContainsEvents
!insert (generateReport, alertProcessingTime) into TransitionContainsEvents
!insert (finalizeReport, reportCompilationTime) into TransitionContainsEvents
!insert (resetCycle, resetDuration) into TransitionContainsEvents
!insert (reinitialize, reinitializeTime) into TransitionContainsEvents

!insert (initialize, startCollection) into StateTransition
!insert (startCollection, dataCollection) into TransitionState

!insert (dataCollection, processData) into StateTransition
!insert (processData, dataAnalysis) into TransitionState

!insert (dataAnalysis, checkAnomalies) into StateTransition
!insert (checkAnomalies, alertTrigger) into TransitionState

!insert (dataAnalysis, finalizeReport) into StateTransition
!insert (finalizeReport, reporting) into TransitionState

!insert (alertTrigger, generateReport) into StateTransition
!insert (generateReport, reporting) into TransitionState

!insert (reporting, resetCycle) into StateTransition
!insert (resetCycle, systemReset) into TransitionState

!insert (systemReset, reinitialize) into StateTransition
!insert (reinitialize, initialize) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 77 | 0.00% |
| Multiplicities Errors | 0 | 35 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category boundary
```
!new StateMachine('airQualityControl')
!airQualityControl.name := 'airQualityControl'

!new State('standby')
!standby.name := 'standby'

!new State('sensing')
!sensing.name := 'sensing'

!new State('analyzing')
!analyzing.name := 'analyzing'

!new State('alert')
!alert.name := 'alert'

!new State('reporting')
!reporting.name := 'reporting'

!new Transition('standbyToSensing')
!standbyToSensing.name := 'standbyToSensing'

!new Transition('sensingToAnalyzing')
!sensingToAnalyzing.name := 'sensingToAnalyzing'

!new Transition('analyzingToAlert')
!analyzingToAlert.name := 'analyzingToAlert'

!new Transition('alertToReporting')
!alertToReporting.name := 'alertToReporting'

!new Transition('analyzingToReporting')
!analyzingToReporting.name := 'analyzingToReporting'

!new TimeEvent('timeEventStandbyToSensing')
!timeEventStandbyToSensing.time := 60

!new TimeEvent('timeEventSensingToAnalyzing')
!timeEventSensingToAnalyzing.time := 60

!new TimeEvent('timeEventAnalyzingToAlert')
!timeEventAnalyzingToAlert.time := 15

!new TimeEvent('timeEventAnalyzingToReporting')
!timeEventAnalyzingToReporting.time := 15

!new TimeEvent('timeEventAlertToReporting')
!timeEventAlertToReporting.time := 10

!insert (airQualityControl, standby) into StateMachineContainsStates
!insert (airQualityControl, sensing) into StateMachineContainsStates
!insert (airQualityControl, analyzing) into StateMachineContainsStates
!insert (airQualityControl, alert) into StateMachineContainsStates
!insert (airQualityControl, reporting) into StateMachineContainsStates

!insert (airQualityControl, standby) into StateMachineStartsStates

!insert (airQualityControl, standbyToSensing) into StateMachineContainsTransitions
!insert (airQualityControl, sensingToAnalyzing) into StateMachineContainsTransitions
!insert (airQualityControl, analyzingToAlert) into StateMachineContainsTransitions
!insert (airQualityControl, alertToReporting) into StateMachineContainsTransitions
!insert (airQualityControl, analyzingToReporting) into StateMachineContainsTransitions

!insert (standbyToSensing, timeEventStandbyToSensing) into TransitionContainsEvents
!insert (sensingToAnalyzing, timeEventSensingToAnalyzing) into TransitionContainsEvents
!insert (analyzingToAlert, timeEventAnalyzingToAlert) into TransitionContainsEvents
!insert (analyzingToReporting, timeEventAnalyzingToReporting) into TransitionContainsEvents
!insert (alertToReporting, timeEventAlertToReporting) into TransitionContainsEvents

!insert (standby, standbyToSensing) into StateTransition
!insert (standbyToSensing, sensing) into TransitionState

!insert (sensing, sensingToAnalyzing) into StateTransition
!insert (sensingToAnalyzing, analyzing) into TransitionState

!insert (analyzing, analyzingToAlert) into StateTransition
!insert (analyzingToAlert, alert) into TransitionState

!insert (analyzing, analyzingToReporting) into StateTransition
!insert (analyzingToReporting, reporting) into TransitionState

!insert (alert, alertToReporting) into StateTransition
!insert (alertToReporting, reporting) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 58 | 0.00% |
| Multiplicities Errors | 0 | 26 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category complex
```
!new StateMachine('cinematicLightControl')
!cinematicLightControl.name := 'cinematicLightControl'

!new State('lightsOff')
!lightsOff.name := 'lightsOff'

!new State('introductionScene')
!introductionScene.name := 'introductionScene'

!new State('actionScene')
!actionScene.name := 'actionScene'

!new State('romanticScene')
!romanticScene.name := 'romanticScene'

!new State('intermission')
!intermission.name := 'intermission'

!new Transition('beginIntroScene')
!beginIntroScene.name := 'beginIntroScene'

!new Transition('switchToAction')
!switchToAction.name := 'switchToAction'

!new Transition('switchToRomantic')
!switchToRomantic.name := 'switchToRomantic'

!new Transition('startIntermissionFromAction')
!startIntermissionFromAction.name := 'startIntermission'

!new Transition('startIntermissionFromRomantic')
!startIntermissionFromRomantic.name := 'startIntermission'

!new Transition('resumeFromIntermission')
!resumeFromIntermission.name := 'resumeFromIntermission'

!new TimeEvent('timeEventBeginIntroScene')
!timeEventBeginIntroScene.time := 5

!new TimeEvent('timeEventSwitchToAction')
!timeEventSwitchToAction.time := 10

!new TimeEvent('timeEventSwitchToRomantic')
!timeEventSwitchToRomantic.time := 7

!new TimeEvent('timeEventStartIntermissionFromAction')
!timeEventStartIntermissionFromAction.time := 20

!new TimeEvent('timeEventStartIntermissionFromRomantic')
!timeEventStartIntermissionFromRomantic.time := 20

!new TimeEvent('timeEventResumeFromIntermission')
!timeEventResumeFromIntermission.time := 15

!insert (cinematicLightControl, lightsOff) into StateMachineContainsStates
!insert (cinematicLightControl, introductionScene) into StateMachineContainsStates
!insert (cinematicLightControl, actionScene) into StateMachineContainsStates
!insert (cinematicLightControl, romanticScene) into StateMachineContainsStates
!insert (cinematicLightControl, intermission) into StateMachineContainsStates

!insert (cinematicLightControl, lightsOff) into StateMachineStartsStates

!insert (cinematicLightControl, beginIntroScene) into StateMachineContainsTransitions
!insert (cinematicLightControl, switchToAction) into StateMachineContainsTransitions
!insert (cinematicLightControl, switchToRomantic) into StateMachineContainsTransitions
!insert (cinematicLightControl, startIntermissionFromAction) into StateMachineContainsTransitions
!insert (cinematicLightControl, startIntermissionFromRomantic) into StateMachineContainsTransitions
!insert (cinematicLightControl, resumeFromIntermission) into StateMachineContainsTransitions

!insert (beginIntroScene, timeEventBeginIntroScene) into TransitionContainsEvents
!insert (switchToAction, timeEventSwitchToAction) into TransitionContainsEvents
!insert (switchToRomantic, timeEventSwitchToRomantic) into TransitionContainsEvents
!insert (startIntermissionFromAction, timeEventStartIntermissionFromAction) into TransitionContainsEvents
!insert (startIntermissionFromRomantic, timeEventStartIntermissionFromRomantic) into TransitionContainsEvents
!insert (resumeFromIntermission, timeEventResumeFromIntermission) into TransitionContainsEvents

!insert (lightsOff, beginIntroScene) into StateTransition
!insert (beginIntroScene, introductionScene) into TransitionState

!insert (introductionScene, switchToAction) into StateTransition
!insert (switchToAction, actionScene) into TransitionState

!insert (actionScene, switchToRomantic) into StateTransition
!insert (switchToRomantic, romanticScene) into TransitionState

!insert (actionScene, startIntermissionFromAction) into StateTransition
!insert (startIntermissionFromAction, intermission) into TransitionState

!insert (romanticScene, startIntermissionFromRomantic) into StateTransition
!insert (startIntermissionFromRomantic, intermission) into TransitionState

!insert (intermission, resumeFromIntermission) into StateTransition
!insert (resumeFromIntermission, introductionScene) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 66 | 0.00% |
| Multiplicities Errors | 0 | 30 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category edge
```
!new StateMachine('roboticFactoryWorkflow')
!roboticFactoryWorkflow.name := 'roboticFactoryWorkflow'

!new State('idle')
!idle.name := 'idle'

!new State('assembly')
!assembly.name := 'assembly'

!new State('qualityCheck')
!qualityCheck.name := 'qualityCheck'

!new State('packaging')
!packaging.name := 'packaging'

!new State('shutdown')
!shutdown.name := 'shutdown'

!new Transition('startAssembly')
!startAssembly.name := 'startAssembly'

!new Transition('moveToQualityCheck')
!moveToQualityCheck.name := 'moveToQualityCheck'

!new Transition('approveForPackaging')
!approveForPackaging.name := 'approveForPackaging'

!new Transition('returnToIdle')
!returnToIdle.name := 'returnToIdle'

!new Transition('initiateShutdown')
!initiateShutdown.name := 'initiateShutdown'

!new TimeEvent('timeEventStartAssembly')
!timeEventStartAssembly.time := 5

!new TimeEvent('timeEventMoveToQualityCheck')
!timeEventMoveToQualityCheck.time := 60

!new TimeEvent('timeEventApproveForPackaging')
!timeEventApproveForPackaging.time := 30

!new TimeEvent('timeEventReturnToIdle')
!timeEventReturnToIdle.time := 90

!new TimeEvent('timeEventInitiateShutdown')
!timeEventInitiateShutdown.time := 10

!insert (roboticFactoryWorkflow, idle) into StateMachineContainsStates
!insert (roboticFactoryWorkflow, assembly) into StateMachineContainsStates
!insert (roboticFactoryWorkflow, qualityCheck) into StateMachineContainsStates
!insert (roboticFactoryWorkflow, packaging) into StateMachineContainsStates
!insert (roboticFactoryWorkflow, shutdown) into StateMachineContainsStates

!insert (roboticFactoryWorkflow, idle) into StateMachineStartsStates

!insert (roboticFactoryWorkflow, startAssembly) into StateMachineContainsTransitions
!insert (roboticFactoryWorkflow, moveToQualityCheck) into StateMachineContainsTransitions
!insert (roboticFactoryWorkflow, approveForPackaging) into StateMachineContainsTransitions
!insert (roboticFactoryWorkflow, returnToIdle) into StateMachineContainsTransitions
!insert (roboticFactoryWorkflow, initiateShutdown) into StateMachineContainsTransitions

!insert (startAssembly, timeEventStartAssembly) into TransitionContainsEvents
!insert (moveToQualityCheck, timeEventMoveToQualityCheck) into TransitionContainsEvents
!insert (approveForPackaging, timeEventApproveForPackaging) into TransitionContainsEvents
!insert (returnToIdle, timeEventReturnToIdle) into TransitionContainsEvents
!insert (initiateShutdown, timeEventInitiateShutdown) into TransitionContainsEvents

!insert (idle, startAssembly) into StateTransition
!insert (startAssembly, assembly) into TransitionState

!insert (assembly, moveToQualityCheck) into StateTransition
!insert (moveToQualityCheck, qualityCheck) into TransitionState

!insert (qualityCheck, approveForPackaging) into StateTransition
!insert (approveForPackaging, packaging) into TransitionState

!insert (qualityCheck, initiateShutdown) into StateTransition
!insert (initiateShutdown, shutdown) into TransitionState

!insert (packaging, returnToIdle) into StateTransition
!insert (returnToIdle, idle) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 58 | 0.00% |
| Multiplicities Errors | 0 | 26 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category invalid
```
!new StateMachine('trafficControlSM')
!trafficControlSM.name := 'trafficControlSM'

!new State('green')
!green.name := 'green'

!new State('amber')
!amber.name := 'amber'

!new State('red')
!red.name := 'red'

!new State('flashingAmber')
!flashingAmber.name := 'flashingAmber'

!new Transition('greenToAmber')
!greenToAmber.name := 'greenToAmber'

!new Transition('amberToRed')
!amberToRed.name := 'amberToRed'

!new Transition('redToGreen')
!redToGreen.name := 'redToGreen'

!new Transition('emergencyFromGreen')
!emergencyFromGreen.name := 'emergency'

!new Transition('emergencyFromAmber')
!emergencyFromAmber.name := 'emergency'

!new TimeEvent('timeEventGreenToAmber')
!timeEventGreenToAmber.time := 30

!new TimeEvent('timeEventAmberToRed')
!timeEventAmberToRed.time := 5

!new TimeEvent('timeEventRedToGreen')
!timeEventRedToGreen.time := 60

!new TimeEvent('timeEventEmergencyFromGreen')
!timeEventEmergencyFromGreen.time := 1 -- Adjusted from 0 to positive

!new TimeEvent('timeEventEmergencyFromAmber')
!timeEventEmergencyFromAmber.time := 1 -- Adjusted from 0 to positive

!insert (trafficControlSM, green) into StateMachineContainsStates
!insert (trafficControlSM, amber) into StateMachineContainsStates
!insert (trafficControlSM, red) into StateMachineContainsStates
!insert (trafficControlSM, flashingAmber) into StateMachineContainsStates

!insert (trafficControlSM, greenToAmber) into StateMachineContainsTransitions
!insert (trafficControlSM, amberToRed) into StateMachineContainsTransitions
!insert (trafficControlSM, redToGreen) into StateMachineContainsTransitions
!insert (trafficControlSM, emergencyFromGreen) into StateMachineContainsTransitions
!insert (trafficControlSM, emergencyFromAmber) into StateMachineContainsTransitions

!insert (greenToAmber, timeEventGreenToAmber) into TransitionContainsEvents
!insert (amberToRed, timeEventAmberToRed) into TransitionContainsEvents
!insert (redToGreen, timeEventRedToGreen) into TransitionContainsEvents
!insert (emergencyFromGreen, timeEventEmergencyFromGreen) into TransitionContainsEvents
!insert (emergencyFromAmber, timeEventEmergencyFromAmber) into TransitionContainsEvents

!insert (green, greenToAmber) into StateTransition
!insert (greenToAmber, amber) into TransitionState

!insert (amber, amberToRed) into StateTransition
!insert (amberToRed, red) into TransitionState

!insert (red, redToGreen) into StateTransition
!insert (redToGreen, green) into TransitionState

!insert (green, emergencyFromGreen) into StateTransition
!insert (emergencyFromGreen, flashingAmber) into TransitionState

!insert (amber, emergencyFromAmber) into StateTransition
!insert (emergencyFromAmber, flashingAmber) into TransitionState
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 24 | 4.17% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `trafficControlSM' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```

| No specific metrics for this system | 
 |---|

## Generation 5 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 313 | 0.00% |
| Multiplicities Errors | 0 | 117 | 0.00% |
| Invariants Errors | 0 | 8 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 24 | 4.17% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `trafficControlSM' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```

| No specific metrics for this system | 
 |---|

# Generation 6
## Category baseline
```
!new StateMachine('wildlifeTrackingProtocol')
!wildlifeTrackingProtocol.name := 'wildlifeTrackingProtocol'

!new State('initializeSensors')
!initializeSensors.name := 'initializeSensors'

!new State('collectData')
!collectData.name := 'collectData'

!new State('analyzePatterns')
!analyzePatterns.name := 'analyzePatterns'

!new State('detectThreats')
!detectThreats.name := 'detectThreats'

!new State('initiateProtection')
!initiateProtection.name := 'initiateProtection'

!new State('reportFindings')
!reportFindings.name := 'reportFindings'

!new State('resetSystem')
!resetSystem.name := 'resetSystem'

!new Transition('activateTracking')
!activateTracking.name := 'activateTracking'

!new Transition('performAnalysis')
!performAnalysis.name := 'performAnalysis'

!new Transition('evaluateThreats')
!evaluateThreats.name := 'evaluateThreats'

!new Transition('raiseAlert')
!raiseAlert.name := 'raiseAlert'

!new Transition('compileData')
!compileData.name := 'compileData'

!new Transition('confirmSafety')
!confirmSafety.name := 'confirmSafety'

!new Transition('cycleReset')
!cycleReset.name := 'cycleReset'

!new Transition('startOver')
!startOver.name := 'startOver'

!new TimeEvent('setupTime')
!setupTime.time := 20

!new TimeEvent('dataCollectionDuration')
!dataCollectionDuration.time := 200

!new TimeEvent('analysisDuration')
!analysisDuration.time := 50

!new TimeEvent('threatResponseTime')
!threatResponseTime.time := 15

!new TimeEvent('reportingTime')
!reportingTime.time := 30

!new TimeEvent('resetDuration')
!resetDuration.time := 10

!new TimeEvent('confirmSafetyTime')
!confirmSafetyTime.time := 10

!new TimeEvent('startOverTime')
!startOverTime.time := 5

!insert (wildlifeTrackingProtocol, initializeSensors) into StateMachineContainsStates
!insert (wildlifeTrackingProtocol, collectData) into StateMachineContainsStates
!insert (wildlifeTrackingProtocol, analyzePatterns) into StateMachineContainsStates
!insert (wildlifeTrackingProtocol, detectThreats) into StateMachineContainsStates
!insert (wildlifeTrackingProtocol, initiateProtection) into StateMachineContainsStates
!insert (wildlifeTrackingProtocol, reportFindings) into StateMachineContainsStates
!insert (wildlifeTrackingProtocol, resetSystem) into StateMachineContainsStates

!insert (wildlifeTrackingProtocol, initializeSensors) into StateMachineStartsStates

!insert (wildlifeTrackingProtocol, activateTracking) into StateMachineContainsTransitions
!insert (wildlifeTrackingProtocol, performAnalysis) into StateMachineContainsTransitions
!insert (wildlifeTrackingProtocol, evaluateThreats) into StateMachineContainsTransitions
!insert (wildlifeTrackingProtocol, raiseAlert) into StateMachineContainsTransitions
!insert (wildlifeTrackingProtocol, compileData) into StateMachineContainsTransitions
!insert (wildlifeTrackingProtocol, confirmSafety) into StateMachineContainsTransitions
!insert (wildlifeTrackingProtocol, cycleReset) into StateMachineContainsTransitions
!insert (wildlifeTrackingProtocol, startOver) into StateMachineContainsTransitions

!insert (activateTracking, setupTime) into TransitionContainsEvents
!insert (performAnalysis, dataCollectionDuration) into TransitionContainsEvents
!insert (evaluateThreats, analysisDuration) into TransitionContainsEvents
!insert (raiseAlert, threatResponseTime) into TransitionContainsEvents
!insert (compileData, reportingTime) into TransitionContainsEvents
!insert (cycleReset, resetDuration) into TransitionContainsEvents
!insert (confirmSafety, confirmSafetyTime) into TransitionContainsEvents
!insert (startOver, startOverTime) into TransitionContainsEvents

!insert (initializeSensors, activateTracking) into StateTransition
!insert (activateTracking, collectData) into TransitionState

!insert (collectData, performAnalysis) into StateTransition
!insert (performAnalysis, analyzePatterns) into TransitionState

!insert (analyzePatterns, evaluateThreats) into StateTransition
!insert (evaluateThreats, detectThreats) into TransitionState

!insert (analyzePatterns, compileData) into StateTransition
!insert (compileData, reportFindings) into TransitionState

!insert (detectThreats, raiseAlert) into StateTransition
!insert (raiseAlert, initiateProtection) into TransitionState

!insert (initiateProtection, confirmSafety) into StateTransition
!insert (confirmSafety, reportFindings) into TransitionState

!insert (reportFindings, cycleReset) into StateTransition
!insert (cycleReset, resetSystem) into TransitionState

!insert (resetSystem, startOver) into StateTransition
!insert (startOver, initializeSensors) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 88 | 0.00% |
| Multiplicities Errors | 0 | 40 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category boundary
```
!new StateMachine('securityManager')
!securityManager.name := 'securityManager'

!new State('disarmed')
!disarmed.name := 'disarmed'

!new State('armed')
!armed.name := 'armed'

!new State('breachDetected')
!breachDetected.name := 'breachDetected'

!new State('alarmActivated')
!alarmActivated.name := 'alarmActivated'

!new State('resetting')
!resetting.name := 'resetting'

!new State('maintenance')
!maintenance.name := 'maintenance'

!new Transition('disarmedToArmed')
!disarmedToArmed.name := 'disarmedToArmed'

!new Transition('armedToBreachDetected')
!armedToBreachDetected.name := 'armedToBreachDetected'

!new Transition('breachDetectedToAlarmActivated')
!breachDetectedToAlarmActivated.name := 'breachDetectedToAlarmActivated'

!new Transition('alarmActivatedToResetting')
!alarmActivatedToResetting.name := 'alarmActivatedToResetting'

!new Transition('resettingToDisarmed')
!resettingToDisarmed.name := 'resettingToDisarmed'

!new Transition('armedToMaintenance')
!armedToMaintenance.name := 'armedToMaintenance'

!new TimeEvent('timeEventDisarmedToArmed')
!timeEventDisarmedToArmed.time := 3

!new TimeEvent('timeEventArmedToBreachDetected')
!timeEventArmedToBreachDetected.time := 1

!new TimeEvent('timeEventBreachDetectedToAlarmActivated')
!timeEventBreachDetectedToAlarmActivated.time := 1

!new TimeEvent('timeEventAlarmActivatedToResetting')
!timeEventAlarmActivatedToResetting.time := 5

!new TimeEvent('timeEventResettingToDisarmed')
!timeEventResettingToDisarmed.time := 2

!new TimeEvent('timeEventArmedToMaintenance')
!timeEventArmedToMaintenance.time := 5

!insert (securityManager, disarmed) into StateMachineContainsStates
!insert (securityManager, armed) into StateMachineContainsStates
!insert (securityManager, breachDetected) into StateMachineContainsStates
!insert (securityManager, alarmActivated) into StateMachineContainsStates
!insert (securityManager, resetting) into StateMachineContainsStates
!insert (securityManager, maintenance) into StateMachineContainsStates

!insert (securityManager, disarmed) into StateMachineStartsStates

!insert (securityManager, disarmedToArmed) into StateMachineContainsTransitions
!insert (securityManager, armedToBreachDetected) into StateMachineContainsTransitions
!insert (securityManager, breachDetectedToAlarmActivated) into StateMachineContainsTransitions
!insert (securityManager, alarmActivatedToResetting) into StateMachineContainsTransitions
!insert (securityManager, resettingToDisarmed) into StateMachineContainsTransitions
!insert (securityManager, armedToMaintenance) into StateMachineContainsTransitions

!insert (disarmedToArmed, timeEventDisarmedToArmed) into TransitionContainsEvents
!insert (armedToBreachDetected, timeEventArmedToBreachDetected) into TransitionContainsEvents
!insert (breachDetectedToAlarmActivated, timeEventBreachDetectedToAlarmActivated) into TransitionContainsEvents
!insert (alarmActivatedToResetting, timeEventAlarmActivatedToResetting) into TransitionContainsEvents
!insert (resettingToDisarmed, timeEventResettingToDisarmed) into TransitionContainsEvents
!insert (armedToMaintenance, timeEventArmedToMaintenance) into TransitionContainsEvents

!insert (disarmed, disarmedToArmed) into StateTransition
!insert (disarmedToArmed, armed) into TransitionState

!insert (armed, armedToBreachDetected) into StateTransition
!insert (armedToBreachDetected, breachDetected) into TransitionState

!insert (breachDetected, breachDetectedToAlarmActivated) into StateTransition
!insert (breachDetectedToAlarmActivated, alarmActivated) into TransitionState

!insert (alarmActivated, alarmActivatedToResetting) into StateTransition
!insert (alarmActivatedToResetting, resetting) into TransitionState

!insert (resetting, resettingToDisarmed) into StateTransition
!insert (resettingToDisarmed, disarmed) into TransitionState

!insert (armed, armedToMaintenance) into StateTransition
!insert (armedToMaintenance, maintenance) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 69 | 0.00% |
| Multiplicities Errors | 0 | 31 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category complex
```
!new StateMachine('patientMonitoringControl')
!patientMonitoringControl.name := 'patientMonitoringControl'

!new State('normalMonitoring')
!normalMonitoring.name := 'normalMonitoring'

!new State('alertCondition')
!alertCondition.name := 'alertCondition'

!new State('emergencyResponse')
!emergencyResponse.name := 'emergencyResponse'

!new State('maintenanceCheck')
!maintenanceCheck.name := 'maintenanceCheck'

!new State('systemReset')
!systemReset.name := 'systemReset'

!new Transition('detectAlert')
!detectAlert.name := 'detectAlert'

!new Transition('escalateEmergency')
!escalateEmergency.name := 'escalateEmergency'

!new Transition('performMaintenance')
!performMaintenance.name := 'performMaintenance'

!new Transition('completeMaintenance')
!completeMaintenance.name := 'completeMaintenance'

!new Transition('resetSystem')
!resetSystem.name := 'resetSystem'

!new TimeEvent('timeEventDetectAlert')
!timeEventDetectAlert.time := 1

!new TimeEvent('timeEventEscalateEmergency')
!timeEventEscalateEmergency.time := 2

!new TimeEvent('timeEventPerformMaintenance')
!timeEventPerformMaintenance.time := 10

!new TimeEvent('timeEventCompleteMaintenance')
!timeEventCompleteMaintenance.time := 5

!new TimeEvent('timeEventResetSystem')
!timeEventResetSystem.time := 3

!insert (patientMonitoringControl, normalMonitoring) into StateMachineContainsStates
!insert (patientMonitoringControl, alertCondition) into StateMachineContainsStates
!insert (patientMonitoringControl, emergencyResponse) into StateMachineContainsStates
!insert (patientMonitoringControl, maintenanceCheck) into StateMachineContainsStates
!insert (patientMonitoringControl, systemReset) into StateMachineContainsStates

!insert (patientMonitoringControl, normalMonitoring) into StateMachineStartsStates

!insert (patientMonitoringControl, detectAlert) into StateMachineContainsTransitions
!insert (patientMonitoringControl, escalateEmergency) into StateMachineContainsTransitions
!insert (patientMonitoringControl, performMaintenance) into StateMachineContainsTransitions
!insert (patientMonitoringControl, completeMaintenance) into StateMachineContainsTransitions
!insert (patientMonitoringControl, resetSystem) into StateMachineContainsTransitions

!insert (detectAlert, timeEventDetectAlert) into TransitionContainsEvents
!insert (escalateEmergency, timeEventEscalateEmergency) into TransitionContainsEvents
!insert (performMaintenance, timeEventPerformMaintenance) into TransitionContainsEvents
!insert (completeMaintenance, timeEventCompleteMaintenance) into TransitionContainsEvents
!insert (resetSystem, timeEventResetSystem) into TransitionContainsEvents

!insert (normalMonitoring, detectAlert) into StateTransition
!insert (detectAlert, alertCondition) into TransitionState

!insert (normalMonitoring, performMaintenance) into StateTransition
!insert (performMaintenance, maintenanceCheck) into TransitionState

!insert (alertCondition, escalateEmergency) into StateTransition
!insert (escalateEmergency, emergencyResponse) into TransitionState

!insert (emergencyResponse, resetSystem) into StateTransition
!insert (resetSystem, systemReset) into TransitionState

!insert (maintenanceCheck, completeMaintenance) into StateTransition
!insert (completeMaintenance, normalMonitoring) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 58 | 0.00% |
| Multiplicities Errors | 0 | 26 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category edge
```
!new StateMachine('solarPowerStationController')
!solarPowerStationController.name := 'solarPowerStationController'

!new State('standby')
!standby.name := 'standby'

!new State('panelAdjustment')
!panelAdjustment.name := 'panelAdjustment'

!new State('energyGeneration')
!energyGeneration.name := 'energyGeneration'

!new State('energyStorage')
!energyStorage.name := 'energyStorage'

!new State('powerSupply')
!powerSupply.name := 'powerSupply'

!new State('systemShutdown')
!systemShutdown.name := 'systemShutdown'

!new Transition('initiatePanelAdjustment')
!initiatePanelAdjustment.name := 'initiatePanelAdjustment'

!new Transition('startGeneration')
!startGeneration.name := 'startGeneration'

!new Transition('beginEnergyStorage')
!beginEnergyStorage.name := 'beginEnergyStorage'

!new Transition('distributePower')
!distributePower.name := 'distributePower'

!new Transition('revertToStandby')
!revertToStandby.name := 'revertToStandby'

!new Transition('emergencyShutdown')
!emergencyShutdown.name := 'emergencyShutdown'

!new TimeEvent('timeEventInitiatePanelAdjustment')
!timeEventInitiatePanelAdjustment.time := 10

!new TimeEvent('timeEventStartGeneration')
!timeEventStartGeneration.time := 15

!new TimeEvent('timeEventBeginEnergyStorage')
!timeEventBeginEnergyStorage.time := 120

!new TimeEvent('timeEventDistributePower')
!timeEventDistributePower.time := 180

!new TimeEvent('timeEventRevertToStandby')
!timeEventRevertToStandby.time := 240

!new TimeEvent('timeEventEmergencyShutdown')
!timeEventEmergencyShutdown.time := 5

!insert (solarPowerStationController, standby) into StateMachineContainsStates
!insert (solarPowerStationController, panelAdjustment) into StateMachineContainsStates
!insert (solarPowerStationController, energyGeneration) into StateMachineContainsStates
!insert (solarPowerStationController, energyStorage) into StateMachineContainsStates
!insert (solarPowerStationController, powerSupply) into StateMachineContainsStates
!insert (solarPowerStationController, systemShutdown) into StateMachineContainsStates

!insert (solarPowerStationController, standby) into StateMachineStartsStates

!insert (solarPowerStationController, initiatePanelAdjustment) into StateMachineContainsTransitions
!insert (solarPowerStationController, startGeneration) into StateMachineContainsTransitions
!insert (solarPowerStationController, beginEnergyStorage) into StateMachineContainsTransitions
!insert (solarPowerStationController, distributePower) into StateMachineContainsTransitions
!insert (solarPowerStationController, revertToStandby) into StateMachineContainsTransitions
!insert (solarPowerStationController, emergencyShutdown) into StateMachineContainsTransitions

!insert (initiatePanelAdjustment, timeEventInitiatePanelAdjustment) into TransitionContainsEvents
!insert (startGeneration, timeEventStartGeneration) into TransitionContainsEvents
!insert (beginEnergyStorage, timeEventBeginEnergyStorage) into TransitionContainsEvents
!insert (distributePower, timeEventDistributePower) into TransitionContainsEvents
!insert (revertToStandby, timeEventRevertToStandby) into TransitionContainsEvents
!insert (emergencyShutdown, timeEventEmergencyShutdown) into TransitionContainsEvents

!insert (standby, initiatePanelAdjustment) into StateTransition
!insert (initiatePanelAdjustment, panelAdjustment) into TransitionState

!insert (panelAdjustment, startGeneration) into StateTransition
!insert (startGeneration, energyGeneration) into TransitionState

!insert (energyGeneration, beginEnergyStorage) into StateTransition
!insert (beginEnergyStorage, energyStorage) into TransitionState

!insert (energyStorage, distributePower) into StateTransition
!insert (distributePower, powerSupply) into TransitionState

!insert (powerSupply, revertToStandby) into StateTransition
!insert (revertToStandby, standby) into TransitionState

!insert (energyGeneration, emergencyShutdown) into StateTransition
!insert (emergencyShutdown, systemShutdown) into TransitionState
```
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 69 | 0.00% |
| Multiplicities Errors | 0 | 31 | 0.00% |
| Invariants Errors | 0 | 2 | 0.00% |

| No specific metrics for this system | 
 |---|

## Category invalid
```
!new StateMachine('alarmClockSM')
!alarmClockSM.name := 'alarmClockSM'

!new State('setTime')
!setTime.name := 'setTime'

!new State('setAlarm')
!setAlarm.name := 'setAlarm'

!new State('alarmActive')
!alarmActive.name := 'alarmActive'

!new State('snooze')
!snooze.name := 'snooze'

!new State('off')
!off.name := 'off'

!new Transition('timeToAlarm')
!timeToAlarm.name := 'timeToAlarm'

!new Transition('activateAlarm')
!activateAlarm.name := 'activateAlarm'

!new Transition('snoozeAlarm')
!snoozeAlarm.name := 'snoozeAlarm'

!new Transition('alarmSnoozedToActive')
!alarmSnoozedToActive.name := 'alarmSnoozedToActive'

!new Transition('deactivateAlarmActive')
!deactivateAlarmActive.name := 'deactivateAlarm'

!new Transition('deactivateAlarmSnooze')
!deactivateAlarmSnooze.name := 'deactivateAlarm'

!new TimeEvent('timeEventTimeToAlarm')
!timeEventTimeToAlarm.time := 15

!new TimeEvent('timeEventActivateAlarm')
!timeEventActivateAlarm.time := 10

!new TimeEvent('timeEventSnoozeAlarm')
!timeEventSnoozeAlarm.time := 5

!new TimeEvent('timeEventAlarmSnoozedToActive')
!timeEventAlarmSnoozedToActive.time := 300

!new TimeEvent('timeEventDeactivateAlarmActive')
!timeEventDeactivateAlarmActive.time := 1 -- Adjusted from 0 to positive

!new TimeEvent('timeEventDeactivateAlarmSnooze')
!timeEventDeactivateAlarmSnooze.time := 1 -- Adjusted from 0 to positive

!insert (alarmClockSM, setTime) into StateMachineContainsStates
!insert (alarmClockSM, setAlarm) into StateMachineContainsStates
!insert (alarmClockSM, alarmActive) into StateMachineContainsStates
!insert (alarmClockSM, snooze) into StateMachineContainsStates
!insert (alarmClockSM, off) into StateMachineContainsStates

!insert (alarmClockSM, timeToAlarm) into StateMachineContainsTransitions
!insert (alarmClockSM, activateAlarm) into StateMachineContainsTransitions
!insert (alarmClockSM, snoozeAlarm) into StateMachineContainsTransitions
!insert (alarmClockSM, alarmSnoozedToActive) into StateMachineContainsTransitions
!insert (alarmClockSM, deactivateAlarmActive) into StateMachineContainsTransitions
!insert (alarmClockSM, deactivateAlarmSnooze) into StateMachineContainsTransitions

!insert (timeToAlarm, timeEventTimeToAlarm) into TransitionContainsEvents
!insert (activateAlarm, timeEventActivateAlarm) into TransitionContainsEvents
!insert (snoozeAlarm, timeEventSnoozeAlarm) into TransitionContainsEvents
!insert (alarmSnoozedToActive, timeEventAlarmSnoozedToActive) into TransitionContainsEvents
!insert (deactivateAlarmActive, timeEventDeactivateAlarmActive) into TransitionContainsEvents
!insert (deactivateAlarmSnooze, timeEventDeactivateAlarmSnooze) into TransitionContainsEvents

!insert (setTime, timeToAlarm) into StateTransition
!insert (timeToAlarm, setAlarm) into TransitionState

!insert (setAlarm, activateAlarm) into StateTransition
!insert (activateAlarm, alarmActive) into TransitionState

!insert (alarmActive, snoozeAlarm) into StateTransition
!insert (snoozeAlarm, snooze) into TransitionState

!insert (snooze, alarmSnoozedToActive) into StateTransition
!insert (alarmSnoozedToActive, alarmActive) into TransitionState

!insert (alarmActive, deactivateAlarmActive) into StateTransition
!insert (deactivateAlarmActive, off) into TransitionState

!insert (snooze, deactivateAlarmSnooze) into StateTransition
!insert (deactivateAlarmSnooze, off) into TransitionState
```
| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 29 | 3.45% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `alarmClockSM' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```

| No specific metrics for this system | 
 |---|

## Generation 6 summary
| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 349 | 0.00% |
| Multiplicities Errors | 0 | 128 | 0.00% |
| Invariants Errors | 0 | 8 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 1 | 29 | 3.45% |
| Invariants Errors (Not included on General) | 0 | 2 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `alarmClockSM' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```

| No specific metrics for this system | 
 |---|

# Summary for all generations
| Summary | Value | 
|---|---| 
| Model | GPT_4O | 
| Type | CoT | 
| System | statemachine | 
| Number of generations | 6 | 

| General | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Syntax Errors | 0 | 1726 | 0.00% |
| Multiplicities Errors | 0 | 634 | 0.00% |
| Invariants Errors | 0 | 48 | 0.00% |

| [Overconstraints Detection] | Errors | Total | Failure (%) | 
|---|---|---|---| 
| Multiplicities Errors (Not included on General) | 6 | 140 | 4.29% |
| Invariants Errors (Not included on General) | 0 | 12 | 0.00% |

| [Overconstraints Detection] Multiplicities Errors (Not included on General) | 
|---| 
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `homeSecuritySM' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `elevatorControlSM' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `washingMachineCycle' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `railroadSignalSystem' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `trafficControlSM' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```
```
Multiplicity constraint violation in association `StateMachineStartsStates':
  Object `alarmClockSM' of class `StateMachine' is connected to 0 objects of class `State'
  at association end `start' but the multiplicity is specified as `1'.
```

| No specific metrics for this system | 
 |---|

