package hust.soict.hedspi.gui.javafx.menubutton;

import java.io.InputStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class MenuButtonDemo extends Application {
 
   // resourcePath: "/org/o7planning/javafx/icon/flag-vi.png"
   private ImageView getIcon(String resourcePath) {
       InputStream input //
               = this.getClass().getResourceAsStream(resourcePath);
       Image image = new Image(input);
       return new ImageView(image);
   }
 
   @Override
   public void start(Stage primaryStage) throws Exception {
 
       ImageView imageViewVI = this.getIcon("/hust/soict/hedspi/gui/javafx/utils/1.png");
       ImageView imageViewEN = this.getIcon("/hust/soict/hedspi/gui/javafx/utils/1.png");
       ImageView imageViewIN = this.getIcon("/hust/soict/hedspi/gui/javafx/utils/1.png");
 
       // Create MenuItems
       MenuItem menuItemVI = new MenuItem("Vietnamese", imageViewVI);
       MenuItem menuItemEN = new MenuItem("English", imageViewEN);
       MenuItem menuItemIN = new MenuItem("India", imageViewIN);
 
       ImageView imageViewLang = this.getIcon("/hust/soict/hedspi/gui/javafx/utils/1.png");
 
       // Create a MenuButton with Text & Icon & 3 Items
       MenuButton menuButton = new MenuButton("Languages", imageViewLang, //
               menuItemVI, menuItemEN, menuItemIN);
 
       FlowPane root = new FlowPane();
       root.setPadding(new Insets(10));
       root.setVgap(5);
       root.setHgap(5);
 
       root.getChildren().addAll(menuButton);
 
       Scene scene = new Scene(root, 320, 150);
 
       primaryStage.setTitle("JavaFX MenuButton (o7planning.org)");
       primaryStage.setScene(scene);
       primaryStage.show();
   }
 
   public static void main(String[] args) {
       Application.launch(args);
   }
 
}