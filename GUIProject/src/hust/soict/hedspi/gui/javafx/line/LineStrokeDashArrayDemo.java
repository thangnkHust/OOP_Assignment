package hust.soict.hedspi.gui.javafx.line;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
 
public class LineStrokeDashArrayDemo extends Application {
 
    @Override
    public void start(Stage stage) {
 
        Line line1 = new Line(20, 40, 270, 40);
        line1.getStrokeDashArray().addAll(25.0, 20.0, 5.0, 20.0);
 
        Line line2 = new Line(20, 60, 270, 60);
        line2.getStrokeDashArray().addAll(50.0, 40.0);
 
        Line line3 = new Line(20, 80, 270, 80);
        line3.getStrokeDashArray().addAll(25.0, 10.0);
 
        Line line4 = new Line(20, 100, 270, 100);
        line4.getStrokeDashArray().addAll(2.0);
 
        Line line5 = new Line(20, 120, 270, 120);
        line5.getStrokeDashArray().addAll(2.0, 21.0);
 
        AnchorPane root = new AnchorPane();
        root.setPadding(new Insets(5));
 
        final Scene scene = new Scene(root, 400, 250);
 
        root.getChildren().addAll(line1, line2, line3, line4, line5);
 
        stage.setTitle("JavaFX Line (o7planning.org)");
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
