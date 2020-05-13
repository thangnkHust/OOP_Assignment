package hust.soict.hedspi.gui.javafx.choicebox;


import hust.soict.hedspi.media.Language;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class ChoiceBoxDemo extends Application {
 
    @Override
    public void start(Stage primaryStage) {
 
        Language vietnamese = new Language("vi", "Vietnamese");
        Language english = new Language("en", "English");
        Language russian = new Language("ru", "Russian");
 
        FlowPane root = new FlowPane();
 
        Label label = new Label("Select Language:");
 
        ObservableList<Language> languages //
                = FXCollections.observableArrayList(vietnamese, english, russian);
 
        ChoiceBox<Language> choiceBox = new ChoiceBox<Language>(languages);
 
        root.setPadding(new Insets(10));
 
        root.getChildren().addAll(label, choiceBox);
        root.setPadding(new Insets(10));
        root.setHgap(10);
 
        primaryStage.setTitle("ChoiceBox (o7planning.org)");
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
 
}