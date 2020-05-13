package hust.soict.hedspi.gui.javafx.line;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
 
public class LineDemo extends Application {
 
    @Override
    public void start(Stage stage) {
 
        // A line in Ox Axis
        Line oxLine1 = new Line(0, 0, 400, 0);
 
        // Stroke Width
        oxLine1.setStrokeWidth(5);
        oxLine1.setStroke(Color.BLUE);
 
        // A line in Oy Axis
        Line oyLine = new Line(0, 0, 0, 200);
 
        // Stroke Width
        oyLine.setStrokeWidth(5);
        oyLine.setStroke(Color.BLUEVIOLET);
 
        // An other Line
        Line line = new Line();
        line.setStartX(100.0f);
        line.setStartY(200.0f);
        line.setEndX(300.0f);
        line.setEndY(70.0f);
        line.setStrokeWidth(10);
        line.setStroke(Color.PINK);
 
        AnchorPane root = new AnchorPane();
        root.setPadding(new Insets(15));
 
        final Scene scene = new Scene(root, 400, 250);
 
        scene.setFill(null);
        root.getChildren().addAll(oyLine, oxLine1, line);
 
        stage.setTitle("JavaFX Line (o7planning.org)");
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}