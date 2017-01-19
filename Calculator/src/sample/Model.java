package sample;

/**
 * Created by Yefa on 1/10/17.
 */
public class Model {
    public float calculate(long a,long b, String operator){
        switch (operator){
            case"+":
                return a+b;
            case"-":
                return a-b;
            case"/":
                if (b == 0){
                    return 0;
                }else{
                return a/b;}
            case"*":
                return a*b;
            default:
                return 0;
        }
    }


}
