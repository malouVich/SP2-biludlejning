

public class Main {

    public static void main(String[] args) {
        FleetOfCars carFleet = new FleetOfCars();
        Car c1 = new GasolineCar("XY123Z", "Ford", "Focus", 5, 600);
        Car c2 = new GasolineCar("AB456C", "Audi", "A3", 3, 550);
        Car c3 = new DieselCar("CD789D", "BMW", "X5", 5, 700, true);
        Car c4 = new DieselCar("EF012E", "Mercedes-Benz", "C-Klasse", 4, 750, false);
        Car c5 = new ElectricCar("FG345F", "Tesla", "Model S", 5, 400, 100);
        Car c6 = new ElectricCar("GH678G", "Nissan", "Leaf", 5, 350, 60);
        Car c7 = new GasolineCar("IJ901I", "Volkswagen", "Golf", 5, 620);
        Car c8 = new DieselCar("JK234J", "Volvo", "XC60", 5, 680, false);
        Car c9 = new ElectricCar("KL567K", "Hyundai", "Kona Electric", 5, 450, 64);
        Car c10 = new GasolineCar("MN890M", "Toyota", "Corolla", 4, 580);
        carFleet.addCar(c1);
        carFleet.addCar(c2);
        carFleet.addCar(c3);
        carFleet.addCar(c4);
        carFleet.addCar(c5);
        carFleet.addCar(c6);
        carFleet.addCar(c7);
        carFleet.addCar(c8);
        carFleet.addCar(c9);
        carFleet.addCar(c10);

        System.out.println("This is the whole Car collection from where you can rent a car: \n" + carFleet);

        System.out.println("The total registration fee is "+carFleet.getTotalRegistrationFeeForFleet()+" kr.");

    }
}