package sample;

import javafx.event.ActionEvent;

import java.util.Random;

public class Controller {
    public void gen_random(ActionEvent event){
        Random w = new Random();
        int rand = w.nextInt(50)+1;
        System.out.println(Integer.toString(rand));

    }

}
