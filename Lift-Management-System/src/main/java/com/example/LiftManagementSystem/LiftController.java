package com.example.LiftManagementSystem;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lifts")
public class LiftController {
    private final LiftService liftService;

    public LiftController(LiftService liftService) {
        this.liftService = liftService;
    }

    @PostMapping
    public Lift addLift(@RequestBody Lift lift) {
        return liftService.addLift(lift);
    }




    @PostMapping("/{liftNo}/passengers")
    public Passenger addPassenger(@PathVariable int liftNo, @RequestBody Passenger passenger) {
        return liftService.addPassenger(liftNo, passenger);
    }

    @DeleteMapping("/{liftNo}/passengers")
    public void deletePassengersWithIdLessThan(@PathVariable int liftNo, @RequestParam int passengerId) {
        liftService.deletePassengersWithIdLessThan(liftNo, passengerId);
    }

    @GetMapping("/{liftNo}/max-people")
    public int getMaxPeopleWithWeight(@PathVariable int liftNo, @RequestParam int weight) {
        return liftService.getMaxPeopleWithWeight(liftNo, weight);
    }

    @GetMapping("/{liftNo}/people-weight-greater-than-50")
    public int getPeopleWithWeightGreaterThan50(@PathVariable int liftNo) {
        return liftService.getPeopleWithWeightGreaterThan50(liftNo);
    }
}
