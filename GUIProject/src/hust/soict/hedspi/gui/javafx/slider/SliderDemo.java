package hust.soict.hedspi.gui.javafx.slider;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class SliderDemo extends Application {
 
    @Override
    public void start(Stage stage) {
 
        Label label = new Label("Select Brightness:");
 
        Slider slider = new Slider();
         
        // The minimum value.
        slider.setMin(0);
         
        // The maximum value.
        slider.setMax(100);
         
        // Current value
        slider.setValue(80);
         
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
         
        slider.setBlockIncrement(10);
 
        VBox root = new VBox();
        root.setPadding(new Insets(20));
        root.setSpacing(10);
        root.getChildren().addAll(label, slider);
 
        stage.setTitle("Slider (o7planning.org)");
        Scene scene = new Scene(root, 350, 200);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
}