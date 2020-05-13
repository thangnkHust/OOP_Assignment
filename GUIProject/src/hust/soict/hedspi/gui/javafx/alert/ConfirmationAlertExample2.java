package hust.soict.hedspi.gui.javafx.alert;

import java.util.Optional;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class ConfirmationAlertExample2 extends Application {
 
    private Label label;
 
    private void showConfirmation() {
 
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Select");
        alert.setHeaderText("Choose the sport you like:");
 
        ButtonType football = new ButtonType("Football");
        ButtonType badminton = new ButtonType("Badminton");
        ButtonType volleyball = new ButtonType("Volleyball");
 
        // Remove default ButtonTypes
        alert.getButtonTypes().clear();
 
        alert.getButtonTypes().addAll(football, badminton, volleyball);
 
        // option != null.
        Optional<ButtonType> option = alert.showAndWait();
 
        if (option.get() == null) {
            this.label.setText("No selection!");
        } else if (option.get() == football) {
            this.label.setText("You like Football");
        } else if (option.get() == badminton) {
            this.label.setText("You like Badminton");
        } else if (option.get() == volleyball) {
            this.label.setText("You like Volleyball");
        } else {
            this.label.setText("-");
        }
    }
 
    @Override
    public void start(Stage stage) {
 
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);
 
        this.label = new Label();
 
        Button button = new Button("Click here to select a Sport");
 
        button.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                showConfirmation();
            }
        });
 
        root.getChildren().addAll(button, label);
 
        Scene scene = new Scene(root, 450, 250);
        stage.setTitle("JavaFX Confirmation Alert (o7planning.org)");
        stage.setScene(scene);
 
        stage.show();
 
    }
 
    public static void main(String args[]) {
        launch(args);
    }
}