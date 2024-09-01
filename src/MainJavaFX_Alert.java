/**
 * Thong bao alert
 */

import java.util.Optional;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainJavaFX_Alert extends Application {
    Button button;
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Alert Example");
        button = new Button();
        button.setText("Close");
        button.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText("You wanna close??");
            // alert.setContentText("Choose your option");

            ButtonType button_type_yes = new ButtonType("Yes", ButtonBar.ButtonData.YES);
            ButtonType button_type_no = new ButtonType("No", ButtonBar.ButtonData.NO);
            ButtonType button_type_cancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);

            alert.getButtonTypes().setAll(button_type_yes, button_type_no, button_type_cancel);

            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == button_type_yes) {
                System.out.println("YES");
            } else if (result.get().getButtonData() == ButtonBar.ButtonData.NO) {
                System.out.println("NO");
            } else {
                System.out.println("CANCEL");
            }
            String message = result.get().getText();

            Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
            alert1.setTitle("Information");
            alert1.setHeaderText("Notification");
            alert1.setContentText(message);
            alert1.show();
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
