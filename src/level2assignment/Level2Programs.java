package level2assignment;
import java.util.Scanner;

class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("The Quotient is " + (number1 / number2) + " and Reminder is " + (number1 % number2) + " of two number " + number1 + " and " + number2);
    }
}

class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The results of Int Operations are " + (a + b * c) + ", " + (a * b + c) + ", " + (c + a / b) + ", " + (a % b + c));
    }
}

class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("The results of Double Operations are " + (a + b * c) + ", " + (a * b + c) + ", " + (c + a / b) + ", " + (a % b + c));
    }
}

class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        System.out.println("The " + celsius + " celsius is " + ((celsius * 9 / 5) + 32) + " fahrenheit");
    }
}

class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit = sc.nextDouble();
        System.out.println("The " + fahrenheit + " fahrenheit is " + ((fahrenheit - 32) * 5 / 9) + " celsius");
    }
}

class TotalIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        double bonus = sc.nextDouble();
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + (salary + bonus));
    }
}

class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}

class TravelDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String fromCity = sc.next();
        String viaCity = sc.next();
        String toCity = sc.next();
        double fromToVia = sc.nextDouble();
        double viaToFinalCity = sc.nextDouble();
        double timeTaken = sc.nextDouble();
        System.out.println("The distance travelled by " + name + " from " + fromCity + " via " + viaCity + " to " + toCity + " is " + (fromToVia + viaToFinalCity) + " miles in " + timeTaken + " hours");
    }
}

class AthleteRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        double rounds = 5000 / (side1 + side2 + side3);
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}

class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        System.out.println("The number of chocolates each child gets is " + (chocolates / children) + " and the number of remaining chocolates are " + (chocolates % children));
    }
}

class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        System.out.println("The Simple Interest is " + (principal * rate * time / 100) + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}

class PoundToKg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pound = sc.nextDouble();
        System.out.println("The weight of the person in pound is " + pound + " and in kg is " + (pound / 2.2));
    }
}
