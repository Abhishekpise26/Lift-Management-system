package com.example.LiftManagementSystem;

import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public class LiftRepositoryImpl implements LiftRepository {
    private final Map<Integer, Lift> lifts;

    public LiftRepositoryImpl() {
        this.lifts = new HashMap<>();
    }

    @Override
    public Lift addLift(Lift lift) {
        lifts.put(lift.getLiftNo(), lift);
        return lift;
    }

    @Override
    public Passenger addPassenger(int liftNo, Passenger passenger) {
        Lift lift = lifts.get(liftNo);
        if (lift != null) {
            lift.getPassengers().add(passenger);
            passenger.setLift(lift);
            return passenger;
        }
        return null;
    }

    @Override
    public void deletePassengersWithIdLessThan(int liftNo, int passengerId) {
        Lift lift = lifts.get(liftNo);
        if (lift != null) {
            lift.getPassengers().removeIf(passenger -> passenger.getPassengerId() < passengerId);
        }
    }

    @Override
    public int getMaxPeopleWithWeight(int liftNo, int weight) {
        Lift lift = lifts.get(liftNo);
        if (lift != null) {
            int maxPeople = 0;
            int currentWeight = 0;
            for (Passenger passenger : lift.getPassengers()) {
                if (currentWeight + passenger.getWeight() <= weight) {
                    currentWeight += passenger.getWeight();
                    maxPeople++;
                }
            }
            return maxPeople;
        }
        return 0;
    }

    @Override
    public int getPeopleWithWeightGreaterThan50(int liftNo) {
        Lift lift = lifts.get(liftNo);
        if (lift != null) {
            int count = 0;
            for (Passenger passenger : lift.getPassengers()) {
                if (passenger.getWeight() > 50) {
                    count++;
                }
            }
            return count;
        }
        return 0;
    }
}

