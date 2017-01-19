import java.util.Scanner;

/**
 * Created by Yefa on 12/29/16.
 */
public class Condition_logic {
    public static void main(String args[]){
        int mon =8;
        if (mon < 4){
            System.out.println("yes");
        }else if (mon <7){
            System.out.println("no");
        }else {
            System.out.println("Cancel");
        }

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a number ");
        String input =sc.nextLine();

        int number = Integer.parseInt(input);

        switch (number) {
            case 1:
                System.out.println("yes");
                break;
            case 2:
                System.out.println("Not");
                break;
            default:
                System.out.println("Exit");


        }


        Scanner ss =new Scanner(System.in);

        System.out.print("Enter a string ");
        String input_ =ss.nextLine();

        switch (input_){
            case "1":
                System.out.println("yes");
                break;
            case "a":
                System.out.println("Not");
                break;
            default:
                System.out.println("Exit");

        }
        //loop

        String[] m = {"1","2","3","4","5"};

        for (int i = 0; i <m.length ; i++) {
            System.out.print(m[i]);
        }
        System.out.println("\n");


        for (String month: m){
            System.out.print(month);
        }
        System.out.println("\n");


        int count =0;
        while (count<m.length){
            System.out.print(m[count]);
            count++;
        }
        System.out.println("\n");

        count =0;
        do {
            System.out.print(m[count]);
            count++;
        }while(count<m.length);


    }




}
