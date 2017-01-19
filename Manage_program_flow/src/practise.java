import java.util.Scanner;

/**
 * Created by Yefa on 12/29/16.
 */
public class practise {
    public static void main(String args[]) {
        double n1 =input("first");
        double n2 =input("second");
        double result =result(n1,n2);
        System.out.println("The result is: "+result);





    }

    static double input(String time){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the "+time+" value: ");
        String input_ =sc.nextLine();
        Boolean check =false;
        Boolean loop;
        double number =0;
        do {
            try {
                number = Double.parseDouble(input_);
                loop = true;
            } catch (NumberFormatException e) {
                System.out.print("Please enter the "+ time + " number: ");
                check = true;
                loop =false;
                input_ =sc.nextLine();
            }
            if (loop)
            check =false;

        }while (check);
        return number;
    }

    static double result(double n1,double n2){
        double result =0;
        Scanner sc =new Scanner(System.in);
        System.out.print("Please enter the method (+,-,*,/,%): ");
        String input_ =sc.nextLine();
        Boolean check = false;
        do {
            switch (input_) {
                case "+":
                    result = n1 + n2;
                    check =false;
                    break;
                case "-":
                    result = n1 - n2;
                    check =false;
                    break;
                case "*":
                    result = n1 * n2;
                    check =false;
                    break;
                case "/":
                    result = n1 / n2;
                    check =false;
                    break;
                case "%":
                    result = n1 % n2;
                    check =false;
                    break;
                default:
                    check = true;
                    System.out.print("Please enter the method (+,-,*,/,%): ");
                    input_ =sc.nextLine();

            }
        }while (check);
        return result;


    }
}