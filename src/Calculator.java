import java.util.*;

public class Calculator {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        int number1 = input.nextInt();

        System.out.print("Enter Number 2 : ");
        int number2 = input.nextInt();

        System.out.println("");

        System.out.println("a. Addition");
        System.out.println("b. Subtraction");//can't be negative
        System.out.println("c. Division");
        System.out.println("d. Multiplication");
        System.out.println("");
        System.out.print("Please Select One Option : ");

        String data = input.next();

        switch (data){
            case "a":
                int add = number1+number2;
                System.out.println("Addition : "+add);
                break;

            case "b":
                int sub;
                if(number1>number2){
                    sub = number1-number2;
                    System.out.println("Subtraction : "+sub);
                }else{
                    sub = number2-number1;
                    System.out.println("Subtraction : "+sub);
                }


                break;

            case "c":
                double div = (double)number1/(double)number2;
                System.out.println("Division : "+div);
                break;

            case "d":
                System.out.println("Multiplication : "+number1*number2);
                break;

            default:
                System.out.println("Invalid Entry");
        }





    }
}
