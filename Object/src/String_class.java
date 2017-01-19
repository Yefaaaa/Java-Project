/**
 * Created by Yefa on 12/29/16.
 */
public class String_class {
    public static void main(String args[]){
        // Both are the same
        String s1 = new String("hello!");
        String s2 ="Hello!";

        System.out.println("s1 is : "+ s1);
        System.out.println("s2 is : "+ s2);

        s1 = "world !";
        System.out.println("s1 is : "+ s1);

        char[] chars = {'h','e','l','l','o'};
        String s3 = new String(chars);
        System.out.println("s3 is : "+ s3);

        String s4 = s1 + s3 + 4;
        System.out.println("s4 is : "+ s4);

        char [] c2 = s1.toCharArray();
        for (char c : c2){
            System.out.print(c);
        }









    }
}
