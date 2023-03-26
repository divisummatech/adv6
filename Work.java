package javaadvanced._5;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     *    prints it's stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        try {
            Files.createFile(Path.of("Test.txt"));
        } catch (IOException exception) {
            System.err.println("There was an error creating the file:");
            exception.printStackTrace();
        }
    }
//        Files.createFile(Path.of("Test.txt"));
}

    /**
     * 2:
     *
     * Write a try-catch block that attempts to open a file
     *
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        String userInputFileName = "test-file.txt";
        try {
            File file = new File(userInputFileName);
            Scanner scanner = new Scanner(file);
            scanner.close();
        } catch (FileNotFoundException exception) {
            System.err.println("Could not find file: " + userInputFileName);
        }
    }

    String userInputFileName = "test-file.txt";
}

/**
 * 3:
 *
 * Write a try-catch block that attempts to parse a string as an integer.
 *
 * In the catch block, print a message that informs the user that the input was not a valid integer.
 */
private static void exercise3() {
        System.out.println("\nExercise 3: ");
        try {
        Integer.parseInt("house");
        } catch (NumberFormatException e) {
        System.out.println("The input was not a valid integer.");
        e.printStackTrace();
        }

        //non sono sicuro

        Integer.parseInt("house");
        }

/**
 * 4:
 *
 * Write a try block that around this print statement that attempts to divide 2 numbers
 *
 * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
 *
 * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
 *
 */
private static void exercise4() {
        System.out.println("\nExercise 4: ");
        Double num1 = 10.0;
        String num2AsString = "0.0";


        Double num1 = 10.0;
        String num2AsString = "0.0";
        // try{
        System.out.println(num1/Double.parseDouble(num2AsString));
        //}
        } catch (NumberFormatException e) {
        System.err.println("Error: " + num2AsString + " is not a valid number.");
        } catch (ArithmeticException e) {
        System.err.println("Error: division by zero occurred.");
        } catch (Exception e) {
        System.err.println("Error: " + e.getMessage());
        }
        }

        }
        }
