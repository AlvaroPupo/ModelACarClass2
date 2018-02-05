package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private Scanner input = new Scanner(System.in);

    protected  void createCar() {

        Car car = new Car();
        car.getCarInfo();
    }

    public void menu (Car car) {

        System.out.println("what would you like to do with the " + car.getMake() + " " + car.getModel() + "?");
        System.out.println("1. Acelerate \n2. Decelerate \n3. Fill up with gas \n4. Exit ");
        try {
            switch (input.nextInt()) {
                case 1:
                    //Acelerate
                    car.driveCar(car);
                    break;
                case 2:
                    //decelerate
                    car.driveCar(car);
                    break;
                case 3:
                    //fill up with gas
                    break;
                case 4:
                    //Exit
                    System.exit(0);
                    break;
                default:
                    System.out.println("please enter a number between 1 and 4.");
                    menu(car);
            }

        }catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("please enter a number between 1 and 4.");
            menu(car);
        }
    }
}
