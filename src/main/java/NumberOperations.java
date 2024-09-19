import java.math.BigDecimal;
import java.util.ArrayList;

public class NumberOperations {

    public static void main(String[] args) {
        // Creating a list with numbers of different types
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20.5);
        numbers.add(30);
        numbers.add(40.7);
        numbers.add(50);
        numbers.add(60.3);
        numbers.add(70);
        numbers.add(80.1);
        numbers.add(90);
        numbers.add(100.9);

        //  Display the numbers on the screen
        printNumbers(numbers);

        // Output numbers in integer format
        printIntegers(numbers);

        // Output numbers in the format of float numbers with 2 decimal places
        printDoubles(numbers);

        // Storing numbers in different lists depending on their type
        separateNumbersByType(numbers);

        // Performing additional tasks
        printAsBigDecimal(numbers);
        calculateSum(numbers);
        calculateProductOfFirstFive(numbers);
        calculateAverage(numbers);
        findMaxNumber(numbers);
        createIntegerList(numbers);
        calculateSumOfSquares(numbers);
        calculateSumGreaterThanFifty(numbers);
        createDoubledList(numbers);
        applyFormula(numbers);
    }


    // A method for outputting numbers to the screen in the format
    public static void printNumbers(ArrayList<Number> numbers) {
        System.out.println("All numbers: " + numbers.toString());
        }


    // A method for outputting numbers in integer format
    public static void printIntegers(ArrayList<Number> numbers) {
        ArrayList<Integer> integerNumbers = new ArrayList<>();

        for (Number number : numbers) {
            integerNumbers.add(number.intValue());
        }

        System.out.println("Numbers in integer format: " + integerNumbers);

    }

    // A method for outputting numbers as float numbers with 2 decimal places
    public static void printDoubles(ArrayList<Number> numbers) {
        System.out.println("Numbers in float format with 2 decimal places:");
        ArrayList<Double> DoubleNumbers = new ArrayList<>();

        for (Number number : numbers) {
            DoubleNumbers.add(number.doubleValue());
        }
        System.out.println(DoubleNumbers);
    }

    // A method for storing numbers in different lists depending on their type
    public static void separateNumbersByType(ArrayList<Number> numbers) {
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();

        for (Number number : numbers) {
            if (number instanceof Integer) {
                integers.add((Integer) number);
            } else if (number instanceof Double) {
                doubles.add((Double) number);
            }
        }

        // Use toString() to print both lists
        System.out.println("Int numbers:\n" + integers);
        System.out.println("Fractional numbers:\n" + doubles);
    }

    // A method for outputting numbers in BigDecimal format
    public static void printAsBigDecimal(ArrayList<Number> numbers) {
        ArrayList<BigDecimal> bigDecimals = new ArrayList<>();

        for (Number number : numbers) {
            BigDecimal bigDecimal = new BigDecimal(number.toString());
            bigDecimals.add(bigDecimal);
        }

        System.out.println("Numbers in BigDecimal format:\n" + bigDecimals);
    }

    // A method to calculate the sum of all numbers in a list
    public static void calculateSum(ArrayList<Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        System.out.println("Sum all numbers: " + sum);
    }

    // A method for calculating the product of the first five numbers in a list
    public static void calculateProductOfFirstFive(ArrayList<Number> numbers) {
        BigDecimal product = BigDecimal.ONE;
        for (int i = 0; i < 5; i++) {
            BigDecimal bigDecimal = new BigDecimal(numbers.get(i).toString());
            product = product.multiply(bigDecimal);
        }
        System.out.println("The product of the first five numbers: " + product);
    }

    // A method to calculate the average of all numbers in a list
    public static void calculateAverage(ArrayList<Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        double average = sum / numbers.size();
        System.out.println("Average value of all numbers: " + average);
    }

    //A method for finding the largest number in a list
    public static void findMaxNumber(ArrayList<Number> numbers) {
        double max = Double.MIN_VALUE;
        for (Number number : numbers) {
            if (number.doubleValue() > max) {
                max = number.doubleValue();
            }
        }
        System.out.println("The largest number in the list: " + max);
    }

    // A method to create a new list that contains only integers from the original list
    public static void createIntegerList(ArrayList<Number> numbers) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (Number number : numbers) {
            if (number instanceof Integer) {
                integers.add((Integer) number);
            }
        }
        System.out.println("List of integers:\n" + integers);
    }

    // A method for calculating the sum of squares of all numbers
    public static void calculateSumOfSquares(ArrayList<Number> numbers) {
        double sumOfSquares = 0;
        for (Number number : numbers) {
            sumOfSquares += Math.pow(number.doubleValue(), 2);
        }
        System.out.println("The sum of the squares of all numbers: " + sumOfSquares);
    }

    //A method for finding the sum of all numbers greater than 50
    public static void calculateSumGreaterThanFifty(ArrayList<Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            if (number.doubleValue() > 50) {
                sum += number.doubleValue();
            }
        }
        System.out.println("The sum of all numbers greater than 50: " + sum);
    }

    // A method to create a new list where each number in the original list is multiplied by 2
    public static void createDoubledList(ArrayList<Number> numbers) {
        ArrayList<Double> doubledList = new ArrayList<>();
        for (Number number : numbers) {
            doubledList.add(number.doubleValue() * 2);
        }

        System.out.println("List of numbers multiplied by 2:\n" + doubledList);

    }

    // A method for applying the formula (number + 10) / 2 to each number
    public static void applyFormula(ArrayList<Number> numbers) {
        ArrayList<Double> results = new ArrayList<>();
        for (Number number : numbers) {
            double result = (number.doubleValue() + 10) / 2;
            results.add(result);
        }
        System.out.println("The results of applying the formula (number + 10) / 2:\n" + results);
    }

}
