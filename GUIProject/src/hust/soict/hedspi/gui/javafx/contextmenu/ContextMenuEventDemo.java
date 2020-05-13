package hust.soict.hedspi.gui.javafx.contextmenu;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
 
public class ContextMenuEventDemo extends Application {
 
  private int index = 1;
 
  @Override
  public void start(Stage stage) {
 
      TextArea textArea = new TextArea();
      textArea.setMinHeight(100);
 
      Circle circle = new Circle();
      circle.setRadius(80);
      circle.setFill(Color.GRAY);
 
      VBox root = new VBox();
      root.setPadding(new Insets(5));
      root.setSpacing(5);
 
      root.getChildren().addAll(textArea, circle);
 
      // Create ContextMenu
      ContextMenu contextMenu = new ContextMenu();
      MenuItem menuItem = new MenuItem("Menu Item");
      contextMenu.getItems().add(menuItem);
 
      // When user right-click on Circle
      circle.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
 
          @Override
          public void handle(ContextMenuEvent event) {
 
              contextMenu.show(circle, event.getScreenX(), event.getScreenY());
          }
      });
      // Called just prior to the ContextMenu being shown.
      // Add new MenuItem to ContextMenu.
      contextMenu.setOnShowing(new EventHandler<WindowEvent>() {
 
          @Override
          public void handle(WindowEvent event) {
              textArea.appendText("On Showing..\n");
 
              MenuItem menuItem = new MenuItem("New Menu Item " + index++);
              contextMenu.getItems().add(menuItem);
          }
      });
 
      // Called just after the ContextMenu is shown.
      contextMenu.setOnShown(new EventHandler<WindowEvent>() {
 
          @Override
          public void handle(WindowEvent event) {
              textArea.appendText("On Show..\n");
          }
      });
    
      // Called just prior to the ContextMenu being hidden.
      contextMenu.setOnHiding(new EventHandler<WindowEvent>() {
 
          @Override
          public void handle(WindowEvent event) {
              textArea.appendText("On Hiding..\n");
          }
      });
    
      // Called just after the ContextMenu has been hidden.
      contextMenu.setOnHidden(new EventHandler<WindowEvent>() {
 
          @Override
          public void handle(WindowEvent event) {
              textArea.appendText("On Hidden..\n");
          }
      });
 
      Scene scene = new Scene(root, 400, 250);
 
      stage.setTitle("JavaFX ContextMenu (o7planning.org)");
      stage.setScene(scene);
      stage.show();
  }
 
  public static void main(String[] args) {
      Application.launch(args);
  }
 
}