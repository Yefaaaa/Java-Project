import java.util.Scanner;

/**
 * Created by Yefa on 12/29/16.
 */
public class Function {
    static String [] mon ={"1","2","3","4","5"};

    public static void main(String args[]) {
        loop();
        String s1 =getInput("Enter value 1: ");

        String s2 =getInput("Enter value 2: ");
        String s3 =getInput("Enter value 3: ");
        String s4 =getInput("Enter value 4: ");



        double result1 = addValue(s1,s2);
        System.out.println("The answer is: "+ result1);
        double result2 = addValue(s1,s2,s3);
        System.out.println("The answer is: "+ result2);
        double result3 = addValue(s1,s2,s3,s4);
        System.out.println("The answer is: "+ result3);





    }


    static void loop(){
        for (int i = 0; i <mon.length ; i++) {
            System.out.println(mon[i]);
        }
    }


    static String getInput(String prompt){
        System.out.println(prompt);
        Scanner sc =new Scanner(System.in);
        return sc.nextLine();
    }

    static double addValue(String s1,String s2){
        double d1 =Double.parseDouble(s1);
        double d2 =Double.parseDouble(s2);
        double result =d1+d2;
        return result;
    }

    static double addValue(String s1,String s2,String s3){
        double d1 =Double.parseDouble(s1);
        double d2 =Double.parseDouble(s2);
        double d3 =Double.parseDouble(s3);

        double result =d1+d2+d3;
        return result;
    }

    //overload method
    static double addValue(String ... values){
        double result =0;
        for (String value:values){
            double d =Double.parseDouble(value);
            result += d;
        }
        return result;
    }

}
