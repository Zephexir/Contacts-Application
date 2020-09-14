package christian.duvick;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class Controller {
    FXMLLoader loader = new FXMLLoader();
    Pane view;

    @FXML
    private ListView<Contact> contactListView;
    @FXML
    private GridPane gridPane;

    //works with when list view not populated
    public void onNextButtonClicked() throws IOException {
//        gridPane.getChildren().remove(view);
//        view = loader.getPage("CreateContactGUI");
//        gridPane.add(view, 1, 1, 2, 1);
    }

    //works with when list view not populated
    public void otherButton() throws IOException {
//        gridPane.getChildren().remove(view);
//        view = loader.getPage("New");
//        gridPane.add(view, 1, 1, 2, 1);
    }

    //With the two lines inside of initialize commented out the buttons work
    // for switching the view in the grid pane
    //if the two lines are uncommented then there is an error
    //but if you comment out the code in the two above methods the list view will populate
    //with no issue. but then switching the object within the pane does not work.
    public void initialize() {
        contactListView.getItems().setAll(ContactList.getContactList());
        contactListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }


    //to implement later
    public static void onSaveButtonClicked() throws IOException {
        FileOutputStream file = new FileOutputStream("contacts");
        ObjectOutputStream outputStream = new ObjectOutputStream(file);

        outputStream.writeObject(ContactList.getContactList());
        System.out.println("Saved");
    }
}
