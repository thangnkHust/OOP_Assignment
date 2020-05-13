package hust.soict.hedspi.gui.javafx.menubutton;

import java.io.InputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class SplitMenuButtonDemo extends Application {
 
    private int count = 1;
 
    // resourcePath: "/org/o7planning/javafx/icon/flag-vi.png"
    private ImageView getIcon(String resourcePath) {
        InputStream input //
                = this.getClass().getResourceAsStream(resourcePath);
        Image image = new Image(input);
        return new ImageView(image);
    }
 
    @Override
    public void start(Stage primaryStage) throws Exception {
 
        Label label = new Label();
 
        ImageView imageViewVI = this.getIcon("/hust/soict/hedspi/gui/javafx/utils/1.png");
        ImageView imageViewEN = this.getIcon("/hust/soict/hedspi/gui/javafx/utils/1.png");
        ImageView imageViewIN = this.getIcon("/hust/soict/hedspi/gui/javafx/utils/1.png");
 
        // Create MenuItems
        MenuItem menuItemVI = new MenuItem("Vietnamese", imageViewVI);
        MenuItem menuItemEN = new MenuItem("English", imageViewEN);
        MenuItem menuItemIN = new MenuItem("India", imageViewIN);
 
        ImageView imageViewLang = this.getIcon("/hust/soict/hedspi/gui/javafx/utils/1.png");
 
        // Create a MenuButton with 3 Items
        SplitMenuButton splitMenuButton = new SplitMenuButton(menuItemVI, menuItemEN, menuItemIN);
 
        splitMenuButton.setText("Language");
        splitMenuButton.setGraphic(imageViewLang);
 
        // Handling when the user clicks on the left side of SplitMenuButton.
        splitMenuButton.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                label.setText("Clicked " + count++);
            }
        });
 
        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10));
        root.setVgap(5);
        root.setHgap(5);
 
        root.getChildren().addAll(splitMenuButton, label);
 
        Scene scene = new Scene(root, 320, 150);
 
        primaryStage.setTitle("JavaFX SplitMenuButton (o7planning.org)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
}
