import java.util.Scanner;

public class homework_1 {
    
    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        selectTask(in);
        in.close();
    }
    
    static int input(Scanner in, String text){
        System.out.printf("%s: ", text);
        return in.nextInt();
    }
    
    static void selectTask(Scanner in) {
        while (true) {
            printMenu();
            Integer inp = null; // добавляем инициализацию
            try {
                inp = input(in, "Input number");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
    
            switch(inp){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Triangular number: " + calculateTriangularNumber(input(in, "Enter n")));             
                    break;
                case 2:
                    PrimeNumbers();
                    break;
                case 3:
                    SimpleCalculator(in);
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid menu option.");
                    break;
            }
        }
    }
    
    static void printMenu() {
        System.out.println("\n-----------Main menu-----------\n");
        System.out.println("0 - Exit app");
        System.out.println("1 - Calculate triangular number");
        System.out.println("2 - Prime numbers");
        System.out.println("3 - Simple calculator");
        System.out.println("--------------------------------");
    }
    
    //region Task functions
    
    public static int calculateTriangularNumber(int n) {
        return (n * (n + 1)) / 2;
    }

    static void PrimeNumbers() {
        System.out.print(2 + " ");

        for (int i = 3; i <= 1000; i+=2) {
            boolean isPrime = true;
            for (int j = 3; j * j <= i; j+=2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }   
    }

    static void SimpleCalculator(Scanner in){
        System.out.println("\n---------Calculator menu-------\n");
        System.out.println("Choose an arithmetic action");
        System.out.println("0 - Exit calculator");
        System.out.println("1 - <+>");
        System.out.println("2 - <->");
        System.out.println("3 - <*>");
        System.out.println("4 - </>");
        System.out.println("-------------------------------");

        int sign = input(in, "Input action");
        int num_1 = input(in, "Input number one");
        int num_2 = input(in, "Input number two");

        switch (sign){
            case 0:
                return;
            case 1:
                System.out.println("------------RESULT-------------\n");
                System.out.printf("%s + %s = %s\n", num_1, num_2, num_1 + num_2);
                break;
            case 2:
                System.out.println("------------RESULT-------------\n");
                System.out.printf("%s - %s = %s\n", num_1, num_2, num_1 - num_2);
                break;
            case 3:
                System.out.println("------------RESULT-------------\n");
                System.out.printf("%s * %s = %s\n", num_1, num_2, num_1 * num_2);
                break;
            case 4:
                System.out.println("------------RESULT-------------\n");
                System.out.printf("%s / %s = %s\n", num_1, num_2, num_1 / num_2);
                break;
            default:
                System.out.println("Invalid input. Please enter a valid action.");
                break;
        }
    }

    //endregion
}
    

