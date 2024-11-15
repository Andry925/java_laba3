import java.util.Objects;

/**
 * Represents a car with specified attributes such as name, manufacturer, price, max speed, and year of production.
 */
public class Car implements Comparable<Car> {
    private final String name;
    private final String manufacturer;
    private final int price;
    private final int maxSpeed;
    private final int yearProduced;

    /**
     * Constructs a Car instance with the specified attributes.
     *
     * @param name         The name of the car.
     * @param manufacturer The manufacturer of the car.
     * @param price        The price of the car in USD.
     * @param maxSpeed     The maximum speed of the car in kilometers per hour.
     * @param yearProduced The year the car was produced.
     */
    public Car(String name, String manufacturer, int price, int maxSpeed, int yearProduced) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.yearProduced = yearProduced;
    }

   
}
