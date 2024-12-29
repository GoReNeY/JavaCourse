# TextClass

This project implements a Java application to manage a fleet of cars (taxi fleet). It allows users to define a hierarchy of cars, calculate the total cost of the fleet, sort the cars by fuel consumption, and find cars within a specified speed range.
## How to Use

### Code Example
Below is an example demonstrating the usage of project functionality:

Set `originalText` String with your text
```java
fleet.addCar(new ElectricCar("Tesla", "Model 3", 15, 260, 1500000));
fleet.addCar(new HybridCar("Toyota", "Prius", 4.5, 180, 800000));
fleet.addCar(new DieselCar("Volkswagen", "Passat", 6, 220, 600000));
```
Output

```
Автопарк:
Tesla Model 3: [Витрати палива: 15,00 л/100 км, Макс. швидкість: 260,00 км/год, Ціна: 1500000,00 грн]
Toyota Prius: [Витрати палива: 4,50 л/100 км, Макс. швидкість: 180,00 км/год, Ціна: 800000,00 грн]
Volkswagen Passat: [Витрати палива: 6,00 л/100 км, Макс. швидкість: 220,00 км/год, Ціна: 600000,00 грн]

Загальна вартість автопарку: 2900000.0 грн

Автомобілі після сортування за витратами палива:
Toyota Prius: [Витрати палива: 4,50 л/100 км, Макс. швидкість: 180,00 км/год, Ціна: 800000,00 грн]
Volkswagen Passat: [Витрати палива: 6,00 л/100 км, Макс. швидкість: 220,00 км/год, Ціна: 600000,00 грн]
Tesla Model 3: [Витрати палива: 15,00 л/100 км, Макс. швидкість: 260,00 км/год, Ціна: 1500000,00 грн]

Автомобілі у діапазоні швидкості 200-300 км/год:
Volkswagen Passat: [Витрати палива: 6,00 л/100 км, Макс. швидкість: 220,00 км/год, Ціна: 600000,00 грн]
Tesla Model 3: [Витрати палива: 15,00 л/100 км, Макс. швидкість: 260,00 км/год, Ціна: 1500000,00 грн]
```