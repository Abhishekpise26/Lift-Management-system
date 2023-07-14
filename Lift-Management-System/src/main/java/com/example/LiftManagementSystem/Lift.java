package com.example.LiftManagementSystem;
import java.util.List;
public class Lift {
    private int liftNo;
    private int capacityInWeight;
    private int capacityInPerson;
    private List<Passenger> passengers;

    public Lift() {
    }

    public Lift(int liftNo, int capacityInWeight, int capacityInPerson, List<Passenger> passengers) {
        this.liftNo = liftNo;
        this.capacityInWeight = capacityInWeight;
        this.capacityInPerson = capacityInPerson;
        this.passengers = passengers;
    }

    public int getLiftNo() {
        return liftNo;
    }

    public void setLiftNo(int liftNo) {
        this.liftNo = liftNo;
    }

    public int getCapacityInWeight() {
        return capacityInWeight;
    }

    public void setCapacityInWeight(int capacityInWeight) {
        this.capacityInWeight = capacityInWeight;
    }

    public int getCapacityInPerson() {
        return capacityInPerson;
    }

    public void setCapacityInPerson(int capacityInPerson) {
        this.capacityInPerson = capacityInPerson;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Lift{" +
                "liftNo=" + liftNo +
                ", capacityInWeight=" + capacityInWeight +
                ", capacityInPerson=" + capacityInPerson +
                ", passengers=" + passengers +
                '}';
    }
}
