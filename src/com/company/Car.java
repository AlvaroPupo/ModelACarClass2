package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Car extends Vehicle{

    private Scanner input = new Scanner(System.in);
    private int year;
    private String make;
    private String model;
    private int speed = 0;
    private int gas = 100;

    public Car(int year, String make, String model, int speed, int gas) {
        super(year, make, model);
        this.speed = speed;
        this.gas = gas;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setYear(){
        System.out.println("What is the year of the car you would like to make?");
        try{
            super.setYear() = input.nextInt();
        }catch (InputMismatchException ime){
            input.nextLine();
            System.out.println("Please enter a number for the year");
            setYear();
        }
    }

    public String getMake() {
        System.out.println(" What make would you like your car to be?");
        make = input.nextLine();
        return make;
    }

    public void setMake() {
        this.make = make;
    }


    public String getModel() {
        System.out.println("what model would you like your car to be?");
        model = input.nextLine();
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setModel(){

    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public void getCarInfo() {
        System.out.println("The current car is a " + getMake() + " " + getModel() +  " " + getYear() + ". It is going " + getSpeed() + " MPH and has " + getGas() + " % of it's gas left.");
}
    public void driveCar(Car car) {

        for (int seconds = 0; seconds <= 5; seconds++) {
            //Get current gas
            //Get current speed

            car.setSpeed(car.getSpeed() + 1);
            car.setGas(car.getGas() - 1);

            System.out.println("The" + car.getMake() + " " + car.getModel() + getYear() + " is going " + getSpeed() + " MPH and has " + getGas() + " % of it's gas left.");

        }
        public void driveCar (Car car){
            for (int seconds = 0; seconds <= 5; seconds++) {

                car.setSpeed(car.getSpeed() - 1);
                car.setGas(car.getGas() - 1);
                System.out.println("The" + car.getMake() + " " + car.getModel() + getYear() + " is going " + getSpeed() + " MPH and has " + getGas() + " % of it's gas left.");

            }
        }
    }
}
