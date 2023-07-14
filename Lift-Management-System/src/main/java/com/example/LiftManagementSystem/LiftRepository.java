package com.example.LiftManagementSystem;

public interface LiftRepository {
    Lift addLift(Lift lift);
    Passenger addPassenger(int liftNo, Passenger passenger);
    void deletePassengersWithIdLessThan(int liftNo, int passengerId);
    int getMaxPeopleWithWeight(int liftNo, int weight);
    int getPeopleWithWeightGreaterThan50(int liftNo);
}

