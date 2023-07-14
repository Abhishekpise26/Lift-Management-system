package com.example.LiftManagementSystem;

import org.springframework.stereotype.Service;

@Service
public class LiftServiceImpl implements LiftService {
    private final LiftRepository liftRepository;

    public LiftServiceImpl(LiftRepository liftRepository) {
        this.liftRepository = liftRepository;
    }

    @Override
    public Lift addLift(Lift lift) {
        return liftRepository.addLift(lift);
    }

    @Override
    public Passenger addPassenger(int liftNo, Passenger passenger) {
        return liftRepository.addPassenger(liftNo, passenger);
    }

    @Override
    public void deletePassengersWithIdLessThan(int liftNo, int passengerId) {
        liftRepository.deletePassengersWithIdLessThan(liftNo, passengerId);
    }

    @Override
    public int getMaxPeopleWithWeight(int liftNo, int weight) {
        return liftRepository.getMaxPeopleWithWeight(liftNo, weight);
    }

    @Override
    public int getPeopleWithWeightGreaterThan50(int liftNo) {
        return liftRepository.getPeopleWithWeightGreaterThan50(liftNo);
    }
}
