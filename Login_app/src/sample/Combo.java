package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 * Created by Yefa on 1/11/17.
 */
public class Combo implements Initializable{
    @FXML
    public ComboBox<String> comboBox;
    @FXML
    public Label food;

    ObservableList<String> list = FXCollections.observableArrayList("apple","orange","peach");
    ObservableList<String> list1 = FXCollections.observableArrayList("mai","fa","ye");



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboBox.setItems(list);
    }


    public void comChange (ActionEvent event){
        comboBox.getItems().addAll("Ben","Jack","Frank");
        food.setText(comboBox.getValue());
    }

    public void button(ActionEvent event){
        comboBox.getItems().addAll("Ben","Jack","Frank","Yefa");

    }
}
