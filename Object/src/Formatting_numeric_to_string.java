import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by Yefa on 12/29/16.
 */
public class Formatting_numeric_to_string {
    public static void main(String args[]) {

        Locale lo = new Locale("da","DK");

        double d = 1_234_567.65789;
        NumberFormat numf =NumberFormat.getNumberInstance(lo);
        System.out.println("Number: "+ numf.format(d));

        NumberFormat curf = NumberFormat.getCurrencyInstance();
        System.out.println("Number: "+ curf.format(d));


        NumberFormat inf =NumberFormat.getIntegerInstance();
        System.out.println("Number: "+ inf.format(d));





    }
}