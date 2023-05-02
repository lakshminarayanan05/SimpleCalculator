package module;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("!...Welcome to Simple Calculator...!");
        boolean tocontinue;
        do{
            System.out.println("***** Menu *****");
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
            System.out.println("Enter the number 1:");
            int num1 = scanner.nextInt();
            System.out.println("Enter the number 2:");
            int num2 = scanner.nextInt();
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.printf("Sum of %d and %d is %d",num1,num2,num1+num2);
                    break;
                case 2:
                    System.out.printf("Difference of %d and %d is %d",num1,num2,num1-num2);
                    break;
                case 3:
                    System.out.printf("Multiplication of %d and %d is %d",num1,num2,num1*num2);
                    break;
                case 4:
                    try{
                        System.out.printf("Division of %d and %d is %d",num1,num2,num1/num2);
                        break;
                    }
                    catch (Exception e){
                        System.out.println("Number is not divisible by 0");
                        break;
                    }
                default:
                    System.out.println("Enter a Valid number...");
            }
            System.out.println("\nEnter yes to continue and no to exit...");
            tocontinue = scanner.next().equalsIgnoreCase("yes");
        }while (tocontinue);
    }
}