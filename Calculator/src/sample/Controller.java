package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label result;
    private long a;
    private long b;
    private float output;
    private String operator = "";
    private boolean start = true;
    private Model m =new Model();
    private int count =0;
    private boolean check =false;

    @FXML
    public void processNumber(ActionEvent event){
        if (check == true){
            result.setText("");
            check =false;
        }
        if (start){
            result.setText("");
            start =false;
        }

        String value =((Button)event.getSource()).getText();
        result.setText(result.getText()+value);


    }

    @FXML
    public void processOperator(ActionEvent event){
        String value =((Button)event.getSource()).getText();
        if (count ==1){
        b = a;
        }
        if (count >1){
            b = (long) output;
        }
        if (!value.equals("=")){
            operator =value;
            a =Long.parseLong(result.getText());
            count ++;
            if (!operator.isEmpty()) {
                if (count>1){
                output =m.calculate(b,a,operator);
                result.setText(String.valueOf(output));}
                check = true;
            }
        }else{
            if (operator.isEmpty()){
                return;
            }
            if (count ==1){
            b = Long.parseLong(result.getText());
            output = m.calculate(b,a,operator);
            }else {
                output = m.calculate(b,a,operator);
            }
            result.setText("");
            result.setText(String.valueOf(output));
            operator ="";
            start =true;
            count =0;

        }


    }

}
