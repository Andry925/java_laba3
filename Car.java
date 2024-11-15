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

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two cars are considered equal if they have the same name, manufacturer, price, maxSpeed, and yearProduced.
     *
     * @param obj The reference object with which to compare.
     * @return {@code true} if this car is the same as the obj argument; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return price == car.price &&
                maxSpeed == car.maxSpeed &&
                yearProduced == car.yearProduced &&
                Objects.equals(name, car.name) &&
                Objects.equals(manufacturer, car.manufacturer);
    }

    /**
     * Returns a hash code value for the object. This method is supported for the benefit of hash-based collections.
     *
     * @return A hash code value for this car, computed using its attributes.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, manufacturer, price, maxSpeed, yearProduced);
    }

    /**
     * Returns a string representation of the car, including the name, manufacturer, price,
     * maximum speed, and year of production.
     *
     * @return A string representation of the car's attributes.
     */
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", yearProduced=" + yearProduced +
                '}';
    }
}
