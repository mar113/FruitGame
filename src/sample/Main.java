package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Label title;
    private Label response;
    private Label selected;

    //fruits;

    private CheckBox bananaCB;
    private CheckBox kiwiCB;
    private CheckBox papayaCB;
    private CheckBox mangoCB;
    private CheckBox appleCB;

    private  String fruits;
    @Override
    public void start(Stage primaryStage) throws Exception{
     primaryStage.setTitle("Best fruit");

     //setting up the stage and the scene
        FlowPane root = new FlowPane(Orientation.VERTICAL, 10,10);
        root.setAlignment(Pos.CENTER);
     title = new Label("what is your favorite fruit?");
     response = new Label();
     selected = new Label();

        bananaCB = new CheckBox("Banana");
        kiwiCB = new CheckBox("Kiwi");
        papayaCB = new CheckBox("Papaya");
        mangoCB = new CheckBox("Mango");
        appleCB = new CheckBox("Apple");

        // adding all controls;
        root.getChildren().add(title);
        root.getChildren().addAll(bananaCB,kiwiCB,papayaCB,mangoCB,appleCB);

        Scene scene = new Scene(root,400,250);
        primaryStage.setScene(scene);
        primaryStage.show();

        showAll();
    }
public void showAll(){

        fruits = "";

}

    public static void main(String[] args) {
        launch(args);
    }
}
