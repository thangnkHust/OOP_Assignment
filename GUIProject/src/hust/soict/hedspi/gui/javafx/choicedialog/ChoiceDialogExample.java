package hust.soict.hedspi.gui.javafx.choicedialog;

import java.util.Optional;

import hust.soict.hedspi.media.Book;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class ChoiceDialogExample extends Application {
 
    private Label label;
 
    private void showChoiceDialog() {
 
        Book java = new Book(1L, "J01", "Java Tutorial for Beginners");
        Book csharp = new Book(2L, "C01", "CSharp Tutoral for Beginners");
        Book python = new Book(3L, "P01", "Python for Beginners");
 
        Book defaultBook = csharp;
 
        ChoiceDialog<Book> dialog = new ChoiceDialog<Book>(defaultBook, java, csharp, python);
 
        dialog.setTitle("o7planning");
        dialog.setHeaderText("Select a Book:");
        dialog.setContentText("Book:");
 
        Optional<Book> result = dialog.showAndWait();
 
        result.ifPresent(book -> {
            this.label.setText(book.getName());
        });
    }
 
    @Override
    public void start(Stage stage) {
 
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);
 
        this.label = new Label();
 
        Button button = new Button("Select a book");
 
        button.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                showChoiceDialog();
            }
        });
 
        root.getChildren().addAll(button, label);
 
        Scene scene = new Scene(root, 450, 250);
        stage.setTitle("JavaFX ChoiceDialog (o7planning.org)");
        stage.setScene(scene);
 
        stage.show();
 
    }
 
    public static void main(String args[]) {
        launch(args);
    }
 
}