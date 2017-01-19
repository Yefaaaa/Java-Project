/**
 * Created by Yefa on 12/29/16.
 */
public class Try_catch {
    public static void main(String args[]) {

        String welcome ="Welcome!";
        char[] chr= welcome.toCharArray();

        try {
            // new exception
            if(chr.length <10){
                throw (new Exception("My coustom message"));
            }
            char lastchar = chr[chr.length-1];
            System.out.println(lastchar);
            String sub = welcome.substring(10);
            System.exit(1);


        }catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("ArrayIndexProblem");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("BoundProblem");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // always execute
            System.out.println("No error");
        }

    }
}