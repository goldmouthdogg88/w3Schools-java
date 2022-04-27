public class Main {

    static void myMethod(String firstName, int age) {
        // code to be executed
        System.out.println("I just go excited! " + firstName + ' ' + age);

    }


    public static void main(String[] args) {
        String name = "Desmond";
        System.out.println("Hello " + name); // This is a comment

        System.out.println(Math.max(5, 10));

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        int[] numbers = {10, 20, 30, 40};

        System.out.println(cars[0]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        // "Enhanced" for loop
        for (String car : cars) {
            System.out.println(car);
        }

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

        myMethod("Desmond", 27);
        myMethod("Goku", 43);
        myMethod("Piccilo", 31);

    }
} // End of Main() do not write beyond this point!
