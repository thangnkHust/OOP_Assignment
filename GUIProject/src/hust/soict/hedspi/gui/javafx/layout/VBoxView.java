package hust.soict.hedspi.gui.javafx.layout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VBoxView extends Application {
    
	  
    // Read file fxml and draw interface.
  @Override
public void start(Stage primaryStage) {
   try {
		
       
       Parent root1 = FXMLLoader.load(getClass().getResource("VBoxView.fxml"));
       primaryStage.setTitle("VBox");
       primaryStage.setScene(new Scene(root1));
       primaryStage.show();
    
   } catch(Exception e) {
       e.printStackTrace();
   }
}

public static void main(String[] args) {
   launch(args);
}

}