package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Button btn = new Button("Click me");
        Button exit = new Button("exit");
        Button enter = new Button("enter");


        exit.setOnAction(e -> {
            System.out.println("Exit");
            System.exit(0);
        });

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World");
            }
        });

        VBox root = new VBox();
        root.getChildren().addAll(btn,exit);
        root.getChildren().add(enter);

        Scene s =new Scene(root,500,300);


        primaryStage.setTitle("App---1");
        primaryStage.setScene(s);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
