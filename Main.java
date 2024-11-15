import java.util.Arrays;
import java.util.Comparator;


class Main {

    
    public static void main(String[] args) {
        // Create an array of Car objects with sample data
        Car[] cars = {
                new Car("Toyota", "Japan", 8000, 180, 2008),
                new Car("BMW", "Germany", 15000, 200, 2015),
                new Car("Bentley", "England", 20000, 220, 2018),
                new Car("Fiat", "Italy", 7000, 160, 2006),
                new Car("Renault", "France", 10000, 190, 2011)
        };

        // Sort cars by price in ascending order and max speed in descending order
        Arrays.sort(cars, Comparator.comparingInt(Car::getPrice)
                .thenComparing((car1, car2) -> Integer.compare(car2.getMaxSpeed(), car1.getMaxSpeed())));

        // Display sorted cars
        System.out.println("Sorted cars:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Define a target car to search for
        Car targetCar = new Car("Toyota", "Japan", 8000, 180, 2008);

        // Find the target car in the sorted array
        int index = Arrays.binarySearch(cars, targetCar, 
                Comparator.comparing(Car::getPrice).thenComparing(Car::getMaxSpeed));

        // Display the search result
        if (index >= 0) {
            System.out.println("\nCar found at index " + index + ": " + cars[index]);
        } else {
            System.out.println("\nCar not found in the array.");
        }
    }
}
