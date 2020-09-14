package christian.duvick;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import java.io.IOException;
import java.net.URL;

public class FXMLLoader {
    private Pane view;
    private URL fileUrl;

    public Pane getPage(String fileName) throws IOException {
        try {
            fileUrl = christian.duvick.Main.class.getResource(fileName + ".fxml");
            if (fileUrl == null){
                throw new IOException("File can't be found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        view = javafx.fxml.FXMLLoader.load(fileUrl);
        return view;
    }

    public Node removeNodeByRowColumnIndex(final int row, final int column, GridPane gridPane) {

        ObservableList<Node> childrens = gridPane.getChildren();
        for(Node node : childrens) {
            if(node instanceof ImageView && GridPane.getRowIndex(node) == row && gridPane.getColumnIndex(node) == column) {
                Pane pane = new Pane(); // use what you want to remove
                gridPane.getChildren().remove(pane);
                break;
            }
        }
        return null;
    }
}
