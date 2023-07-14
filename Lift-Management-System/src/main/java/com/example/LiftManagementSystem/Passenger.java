package com.example.LiftManagementSystem;

public class Passenger {
    private int passengerId;
    private Lift lift;
    private int weight;

    public Passenger() {
    }

    public Passenger(int passengerId, Lift lift, int weight) {
        this.passengerId = passengerId;
        this.lift = lift;
        this.weight = weight;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public Lift getLift() {
        return lift;
    }

    public void setLift(Lift lift) {
        this.lift = lift;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerId=" + passengerId +
                ", lift=" + lift +
                ", weight=" + weight +
                '}';
    }
}
