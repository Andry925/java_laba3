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

    /**
     * Retrieves the name of the car.
     *
     * @return The name of the car.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the manufacturer of the car.
     *
     * @return The manufacturer of the car.
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Retrieves the price of the car.
     *
     * @return The price of the car in USD.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Retrieves the maximum speed of the car.
     *
     * @return The maximum speed of the car in kilometers per hour.
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Retrieves the year the car was produced.
     *
     * @return The year of production of the car.
     */
    public int getYearProduced() {
        return yearProduced;
    }

    /**
     * Compares this car to another car based on their price.
     * Cars are first compared by price in ascending order.
     *
     * @param other The other car to compare with.
     * @return A negative integer, zero, or a positive integer as this car is less than,
     * equal to, or greater than the specified car.
     */
    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.price, other.price);
    }

   
}
