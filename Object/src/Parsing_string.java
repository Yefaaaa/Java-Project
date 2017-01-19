/**
 * Created by Yefa on 12/29/16.
 */
public class Parsing_string {
    public static void main(String args[]) {

        String s1 ="Welcome to california";
        System.out.println("Length of string "+ s1.length());

        int po = s1.indexOf("california");
        System.out.println("Position of string "+ po);

        String sub = s1.substring(11);
        System.out.println(sub);

        String s2 ="welcome               ";
        System.out.println("Length of string "+ s2.length());
        String s3 = s2.trim();
        System.out.println("Length of string "+ s3.length());









    }

}