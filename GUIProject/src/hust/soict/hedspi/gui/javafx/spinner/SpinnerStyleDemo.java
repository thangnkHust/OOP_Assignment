package hust.soict.hedspi.gui.javafx.spinner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class SpinnerStyleDemo extends Application {
 
    @Override
    public void start(Stage stage) {
 
        String[] styleClasses = new String[] { "", // Default.
                Spinner.STYLE_CLASS_ARROWS_ON_RIGHT_HORIZONTAL, //
                Spinner.STYLE_CLASS_ARROWS_ON_LEFT_VERTICAL, //
                Spinner.STYLE_CLASS_ARROWS_ON_LEFT_HORIZONTAL, //
                Spinner.STYLE_CLASS_SPLIT_ARROWS_VERTICAL, //
                Spinner.STYLE_CLASS_SPLIT_ARROWS_HORIZONTAL
 
        };
 
        FlowPane root = new FlowPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(10));
 
        for (String styleClass : styleClasses) {
            Spinner<Integer> spinner = new Spinner<Integer>(1, 20, 10);
            spinner.getStyleClass().add(styleClass);
            root.getChildren().add(spinner);
        }
 
        Scene scene = new Scene(root, 400, 200);
 
        stage.setTitle("JavaFX Spinner (o7planning.org)");
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
}