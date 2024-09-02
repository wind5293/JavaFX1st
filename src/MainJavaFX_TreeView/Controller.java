package MainJavaFX_TreeView;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class Controller implements Initializable{
    @FXML
    TreeView<String> tree_view;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TreeItem<String> root = new TreeItem<>("C:");
        TreeItem<String> JavaFXTutorials = new TreeItem<>("JavaFXTutorials");
        TreeItem<String> sample = new TreeItem<>("sample");
        TreeItem<String> Main8 = new TreeItem<>("Main8");
        TreeItem<String> Main9 = new TreeItem<>("Main9");
        TreeItem<String> Main10 = new TreeItem<>("Main10");

        sample.getChildren().addAll(Main8, Main9, Main10);
        sample.setExpanded(true);
        JavaFXTutorials.getChildren().add(sample);
        JavaFXTutorials.setExpanded(true);
        root.getChildren().add(JavaFXTutorials);
        root.setExpanded(true);

        tree_view.setRoot(root);
        tree_view.setShowRoot(true);

        tree_view.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue.getValue());
        });
    } 
}
