import java.util.*;
import java.util.stream.Collectors;


// Клас таксопарку
class TaxiFleet {
    private List<Car> cars;

    public TaxiFleet() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public double calculateTotalCost() {
        return cars.stream().mapToDouble(Car::getPrice).sum();
    }

    public void sortByFuelConsumption() {
        cars.sort(Comparator.comparingDouble(Car::getFuelConsumption));
    }

    public List<Car> findCarsBySpeedRange(double minSpeed, double maxSpeed) {
        return cars.stream()
                .filter(car -> car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed)
                .collect(Collectors.toList());
    }

    public void displayCars() {
        cars.forEach(System.out::println);
    }
}