package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    @FXML
    private Label status;
    @FXML
    private TextField user;

    @FXML
    private PasswordField pass;

    public void login(ActionEvent event) throws Exception {
        if (user.getText().equals("yefa")&& pass.getText().equals("maiyefa")){
            status.setText("Login Successfule");
            w1();
        }else{
            status.setText("Enter either wrong username or password");
        }

    }

    public void w1() throws Exception {
        //open a new window
        Parent root = FXMLLoader.load(getClass().getResource("another.fxml"));
        Stage primaryStage =new Stage();
        primaryStage.setTitle("Login_app");

        Scene scene =new Scene(root, 400, 500);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
