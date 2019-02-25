package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        /*Group root = new Group();
        Text txt = new Text("My love Shamissa.");
        txt.setFont(new Font("Papyrus",50));
        Label label = new Label("feeling: ");
        TextField textField = new TextField();
        GridPane gridPane = new GridPane();
        gridPane.add(label,0,0);
        gridPane.add(textField,1,0);
        gridPane.setHgap(20);
        Button button = new Button();
        button.setText("Say Mahnaz feeling");
        gridPane.add(button,1,1);
        //gridPane.setGridLinesVisible(true);
       // button.setOnAction(e-> System.out.println("Say Mahnaz feeling"));
        button.setOnAction(e-> System.out.printf("Mahnaz feels %s!%n",textField.getText()));
        VBox box = new VBox();
        box.getChildren().addAll(txt,gridPane);

        root.getChildren().add(box);
        //root.getChildren().add(txt);
        //root.getChildren().add(button);
        //txt.setX(20);
        txt.setY(50);*/
        primaryStage.setTitle("Mahnaz");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
