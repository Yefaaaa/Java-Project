package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class Controller {
    @FXML private Label myMessage;
    @FXML  private Label lol;


    public void gen_ran(ActionEvent event){
        Random r =new Random();
        int rand =r.nextInt(50)+1;
        myMessage.setText(Integer.toString(rand));
        System.out.println(Integer.toString(rand));
    }


}
