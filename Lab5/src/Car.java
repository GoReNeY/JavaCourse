
// Абстрактний клас для опису легкових автомобілів
abstract class Car {
    private String brand;
    private String model;
    private double fuelConsumption; // Літри на 100 км
    private double maxSpeed;
    private double price;

    public Car(String brand, String model, double fuelConsumption, double maxSpeed, double price) {
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s %s: [Витрати палива: %.2f л/100 км, Макс. швидкість: %.2f км/год, Ціна: %.2f грн]",
                brand, model, fuelConsumption, maxSpeed, price);
    }
}