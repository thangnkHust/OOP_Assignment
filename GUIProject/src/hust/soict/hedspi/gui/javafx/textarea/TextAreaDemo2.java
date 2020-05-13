package hust.soict.hedspi.gui.javafx.textarea;

import java.util.Date;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class TextAreaDemo2 extends Application {
 
    private int i = 0;
 
    @Override
    public void start(Stage primaryStage) throws Exception {
 
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(5);
 
        // Label
        Label label = new Label("Enter message:");
 
        // TextArea
        TextArea textArea = new TextArea();
        textArea.setText("Hello\nHow Are You?\n");
 
        textArea.setStyle("-fx-highlight-fill: lightgray; -fx-highlight-text-fill: firebrick; -fx-font-size: 12px;");
 
        // After TextArea ready, highlighting a text.
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                textArea.selectRange(6, 9);
            }
        });
 
        // To contain the buttons
        HBox buttonBar = new HBox();
 
        // Button to Append text
        Button buttonAppend = new Button("Append Text");
 
        // Action event.
        buttonAppend.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                i++;
                textArea.appendText(i + " : " + new Date().toString());
                textArea.appendText("\n");
            }
        });
 
        Button buttonSelectText = new Button("Select Text");
 
        // Action event.
        buttonSelectText.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                // The caret postion.
                int from = textArea.getCaretPosition();
                int to = textArea.getLength() / 2;
                textArea.selectRange(from, to);
            }
 
        });
 
        buttonBar.getChildren().addAll(buttonAppend, buttonSelectText);
 
        root.getChildren().addAll(label, textArea, buttonBar);
 
        Scene scene = new Scene(root, 320, 150);
 
        primaryStage.setTitle("JavaFX TextArea (o7planning.org)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
}