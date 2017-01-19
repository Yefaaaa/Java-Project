import java.util.Scanner;

/**
 * Created by Yefa on 12/29/16.
 */
public class Multiple_value_string {
    public static void main(String args[]) {

        String s1 = "Helllo";
        String  s2 = "World";

        String s3 = s1 + " "+s2 ;
        System.out.println(s3);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", ");
        sb.append("world");
        sb.append("!");
        System.out.println(sb);


        Scanner s =new Scanner(System.in);
        System.out.print("Enter value: ");
        String input = s.nextLine();
        System.out.print(input);

        sb.delete(0,sb.length());
        for (int i = 0; i <3 ; i++) {
            System.out.print("Enter value: ");
            input = s.nextLine();
            sb.append(input+"\n");

        }
        System.out.print(sb);






    }
}