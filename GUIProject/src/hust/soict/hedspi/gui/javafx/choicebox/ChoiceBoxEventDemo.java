package hust.soict.hedspi.gui.javafx.choicebox;

import hust.soict.hedspi.media.Language;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class ChoiceBoxEventDemo extends Application {
 
    @Override
    public void start(Stage primaryStage) {
 
        Language vietnamese = new Language("vi", "Vietnamese", "Xin Chào");
        Language english = new Language("en", "English", "Hello");
        Language russian = new Language("ru", "Russian", "привет");
 
        FlowPane root = new FlowPane();
 
        Label label = new Label("Select Language:");
        Label greetingLabel = new Label("");
 
        ObservableList<Language> languages //
                = FXCollections.observableArrayList(vietnamese, english, russian);
 
        ChoiceBox<Language> choiceBox = new ChoiceBox<Language>(languages);
 
        ChangeListener<Language> changeListener = new ChangeListener<Language>() {
 
            @Override
            public void changed(ObservableValue<? extends Language> observable, //
                    Language oldValue, Language newValue) {
                if (newValue != null) {
                    greetingLabel.setText(newValue.getGreeting());
                }
            }
        };
        // Selected Item Changed.
        choiceBox.getSelectionModel().selectedItemProperty().addListener(changeListener);
 
        root.setPadding(new Insets(10));
 
        root.getChildren().addAll(label, choiceBox, greetingLabel);
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