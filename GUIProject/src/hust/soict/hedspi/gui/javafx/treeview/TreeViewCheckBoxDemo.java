package hust.soict.hedspi.gui.javafx.treeview;

import hust.soict.hedspi.media.Layer;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Callback;
 
public class TreeViewCheckBoxDemo extends Application {
 
    @Override
    public void start(Stage primaryStage) {
 
        Layer layer0 = new Layer("Layers", false);
 
        Layer layer1 = new Layer("Wet Area", false);
        Layer layer2 = new Layer("Titles", true);
        Layer layer3 = new Layer("Logos", true);
 
        // Root Item
        TreeItem<Layer> rootItem = new TreeItem<Layer>(layer0);
        rootItem.setExpanded(true);
 
        // Item 1
        CheckBoxTreeItem<Layer> item1 = new CheckBoxTreeItem<Layer>(layer1);
        item1.setSelected(layer1.isSelected());
 
        // Item 2
        CheckBoxTreeItem<Layer> item2 = new CheckBoxTreeItem<Layer>(layer2);
        item1.setSelected(layer2.isSelected());
 
        // Item 3
        CheckBoxTreeItem<Layer> item3 = new CheckBoxTreeItem<Layer>(layer3);
        item1.setSelected(layer3.isSelected());
 
        // Add to Root
        rootItem.getChildren().addAll(item1, item2, item3);
 
        TreeView<Layer> treeView = new TreeView<Layer>(rootItem);
 
        // Set Cell Factory. 
 
        treeView.setCellFactory(new Callback<TreeView<Layer>, TreeCell<Layer>>() {
 
            @Override
            public TreeCell<Layer> call(TreeView<Layer> param) {
 
                return new CheckBoxTreeCell<Layer>();
            }
        });
 
        StackPane root = new StackPane();
        root.setPadding(new Insets(5));
        root.getChildren().add(treeView);
 
        primaryStage.setTitle("JavaFX TreeView (o7planning.org)");
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
 
}