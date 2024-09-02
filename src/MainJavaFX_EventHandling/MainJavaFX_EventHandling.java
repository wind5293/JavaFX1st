package MainJavaFX_EventHandling;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainJavaFX_EventHandling extends Application{
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryScene) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
            Scene scene = new Scene(root);

            primaryScene.setScene(scene);
            primaryScene.show();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
