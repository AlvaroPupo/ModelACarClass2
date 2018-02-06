package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private Scanner input = new Scanner(System.in);

    protected  void createCar() {

        System.out.println("what kind of car would you like to create?");
        System.out.println("1. Custom Car \n2. Ready to go \n3. Exit ");
        try {
            switch (input.nextInt()) {
                case 1:
                    //Acelerate
                    Car car = new Car();
                    car.getCarInfo();
                    menu(car);
                    break;
                case 2:
                    //decelerate
                    Corvette corvette = new Corvette(2018,"corvette,", "Z06", 0, 100, "Red" );
                    corvette.getCorvetteInfo();
                    menu(corvette);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("please enter a number between 1 and 3.");
                    createCar();
            }

        }catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("please enter a number between 1 and 4.");
            createCar();
        }
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
                    car.driveCar(car);
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
