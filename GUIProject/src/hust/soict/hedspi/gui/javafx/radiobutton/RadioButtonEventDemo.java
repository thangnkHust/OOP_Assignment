package hust.soict.hedspi.gui.javafx.radiobutton;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
 
@SuppressWarnings("unused")
public class RadioButtonEventDemo extends Application {
 
   @Override
   public void start(Stage stage) {
 
       Label label = new Label("Your Gender: ");
       Label labelInfo = new Label();
       labelInfo.setTextFill(Color.BLUE);
 
       // Group
       ToggleGroup group = new ToggleGroup();
 
       group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
           @Override
           public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
               // Has selection.
               if (group.getSelectedToggle() != null) {
                   RadioButton button = (RadioButton) group.getSelectedToggle();
                   System.out.println("Button: " + button.getText());
                   labelInfo.setText("You are " + button.getText());
               }
           }
       });
 
       // Radio 1: Male
       RadioButton button1 = new RadioButton("Male");
       button1.setToggleGroup(group);
       button1.setSelected(true);
 
       // Radio 2: Female.
       RadioButton button2 = new RadioButton("Female");
       button2.setToggleGroup(group);
 
       HBox root = new HBox();
       root.setPadding(new Insets(10));
       root.setSpacing(5);
       root.getChildren().addAll(label, button1, button2, labelInfo);
 
       Scene scene = new Scene(root, 400, 150);
       stage.setScene(scene);
       stage.setTitle("JavaFX RadioButton (o7planning.org)");
       scene.setRoot(root);
       stage.show();
   }
 
   public static void main(String[] args) {
       launch(args);
   }
 
}