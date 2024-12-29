import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            TaxiFleet fleet = new TaxiFleet();

            fleet.addCar(new ElectricCar("Tesla", "Model 3", 15, 260, 1500000));
            fleet.addCar(new HybridCar("Toyota", "Prius", 4.5, 180, 800000));
            fleet.addCar(new DieselCar("Volkswagen", "Passat", 6, 220, 600000));

            System.out.println("Автопарк:");
            fleet.displayCars();

            System.out.println("\nЗагальна вартість автопарку: " + fleet.calculateTotalCost() + " грн");

            fleet.sortByFuelConsumption();
            System.out.println("\nАвтомобілі після сортування за витратами палива:");
            fleet.displayCars();

            System.out.println("\nАвтомобілі у діапазоні швидкості 200-300 км/год:");
            List<Car> filteredCars = fleet.findCarsBySpeedRange(200, 300);
            filteredCars.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("Сталася помилка: " + e.getMessage());
        }
    }
}