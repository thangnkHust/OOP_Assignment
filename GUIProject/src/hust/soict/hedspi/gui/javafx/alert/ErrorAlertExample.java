package hust.soict.hedspi.gui.javafx.alert;

import java.io.PrintWriter;
import java.io.StringWriter;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class ErrorAlertExample extends Application {
 
    private void showError(Exception e) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error alert");
        alert.setHeaderText(e.getMessage());
 
        VBox dialogPaneContent = new VBox();
 
        Label label = new Label("Stack Trace:");
 
        String stackTrace = this.getStackTrace(e);
        TextArea textArea = new TextArea();
        textArea.setText(stackTrace);
 
        dialogPaneContent.getChildren().addAll(label, textArea);
 
        // Set content for Dialog Pane
        alert.getDialogPane().setContent(dialogPaneContent);
 
        alert.showAndWait();
    }
 
    private void doSomething() {
        try {
            // An error has occurred here.
            int a = 100 / 0;
        } catch (Exception e) {
            showError(e);
        }
    }
 
    private String getStackTrace(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        String s = sw.toString();
        return s;
    }
 
    @Override
    public void start(Stage stage) {
 
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);
 
        Button button1 = new Button("Error Alert");
 
        button1.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                doSomething();
            }
        });
 
        root.getChildren().addAll(button1);
 
        Scene scene = new Scene(root, 450, 250);
        stage.setTitle("JavaFX Error Alert (o7planning.org)");
        stage.setScene(scene);
 
        stage.show();
 
    }
 
    public static void main(String args[]) {
        launch(args);
    }
 
}