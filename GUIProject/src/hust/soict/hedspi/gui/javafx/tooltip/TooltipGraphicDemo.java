package hust.soict.hedspi.gui.javafx.tooltip;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class TooltipGraphicDemo extends Application {
 
    @Override
    public void start(Stage stage) {
 
        FlowPane root = new FlowPane();
        root.setHgap(5);
        root.setVgap(5);
        root.setPadding(new Insets(25));
 
        // Create a Button
        Button button = new Button("Button");
 
        Tooltip tooltip = new Tooltip();
        tooltip.setPrefSize(200, 100);
        tooltip.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
 
        // Set tooltip content
        tooltip.setGraphic(new Button("Button in a Tooltip"));
 
        // Install tooltip for button (same as button.setTooltip)
        Tooltip.install(button, tooltip);
 
        root.getChildren().add(button);
 
        Scene scene = new Scene(root, 350, 200);
 
        stage.setTitle("Tooltip Graphic Demo (o7planning.org)");
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
}