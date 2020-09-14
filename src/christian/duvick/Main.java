package christian.duvick;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainGUI.fxml"));
        primaryStage.setTitle("Contacts");
        primaryStage.setScene(new Scene(root, 600, 425));
        primaryStage.show();
    }

    //loads up contact file on start
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("contacts");
        ObjectInputStream inputStream = new ObjectInputStream(file);
        ContactList.setContactList((ArrayList<Contact>) inputStream.readObject());

        launch(args);
    }
}
