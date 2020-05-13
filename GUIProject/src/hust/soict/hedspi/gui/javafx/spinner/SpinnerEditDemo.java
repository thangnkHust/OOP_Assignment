package hust.soict.hedspi.gui.javafx.spinner;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.SpinnerValueFactory.ListSpinnerValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
 
public class SpinnerEditDemo extends Application {
 
   @Override
   public void start(Stage stage) {
 
       Label label = new Label("Select Level:");
       final Spinner<Integer> spinner = new Spinner<Integer>();
 
       // Editable.
       spinner.setEditable(true);
 
       // Item List.
       ObservableList<Integer> items = FXCollections.observableArrayList(1, 2, 3);
 
       // Value Factory:
       SpinnerValueFactory<Integer> valueFactory = //
               new SpinnerValueFactory.ListSpinnerValueFactory<>(items);
 
       // The converter to convert between text and item object.
       MyConverter converter = new MyConverter();
       valueFactory.setConverter(converter);
 
       spinner.setValueFactory(valueFactory);
 
       spinner.getEditor().setOnAction(new EventHandler<ActionEvent>() {
 
           @Override
           public void handle(ActionEvent event) {
               String text = spinner.getEditor().getText();
               SpinnerValueFactory.ListSpinnerValueFactory<Integer>//
               valueFactory = (ListSpinnerValueFactory<Integer>) spinner.getValueFactory();
 
               StringConverter<Integer> converter = valueFactory.getConverter();
               Integer enterValue = converter.fromString(text);
 
               // If the list does not contains 'enterValue'.
               if (!valueFactory.getItems().contains(enterValue)) {
                   // Add new item to list
                   valueFactory.getItems().add(enterValue);
                   // Set to current
                   valueFactory.setValue(enterValue);
               } else {
                   // Set to current
                   valueFactory.setValue(enterValue);
               }
 
           }
       });
 
       //
       FlowPane root = new FlowPane();
       root.setHgap(10);
       root.setVgap(10);
       root.setPadding(new Insets(10));
 
       root.getChildren().addAll(label, spinner);
 
       Scene scene = new Scene(root, 400, 200);
 
       stage.setTitle("JavaFX Spinner (o7planning.org)");
       stage.setScene(scene);
       stage.show();
   }
 
   class MyConverter extends StringConverter<Integer> {
 
       @Override
       public String toString(Integer object) {
           return object + "";
       }
 
       @Override
       public Integer fromString(String string) {
           return Integer.parseInt(string);
       }
 
   }
 
   public static void main(String[] args) {
       Application.launch(args);
   }
 
}