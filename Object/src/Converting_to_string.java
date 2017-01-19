import java.text.NumberFormat;

/**
 * Created by Yefa on 12/29/16.
 */
public class Converting_to_string {
    public static void main(String args[]) {
        int i =42;
        String fI =Integer.toString(i);
        System.out.println(fI);

        boolean b =true;
        String fB =Boolean.toString(b);
        System.out.println(fB);

        long l = 10_000_000;
        NumberFormat fo =NumberFormat.getNumberInstance();

        String fl = fo.format(l);
        System.out.println(fl);
        String fl1 = Long.toString(l);
        System.out.println(fl1);




    }
}
