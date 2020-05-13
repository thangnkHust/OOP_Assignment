package hust.soict.hedspi.gui.javafx.htmleditor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
 
public class HTMLEditorWebViewDemo extends Application {
 
    @Override
    public void start(Stage stage) {
 
        // HTML Editor.
        HTMLEditor htmlEditor = new HTMLEditor();
        htmlEditor.setPrefHeight(245);
        htmlEditor.setMinHeight(220);
 
        String INITIAL_TEXT = "<h2>Apollo 11</h2>" //
                + "Apollo 11 was the spaceflight that landed the first humans,"//
                + " Americans <a href='http://en.wikipedia.org/wiki/Neil_Armstrong'>Neil Armstrong</a>"
                + " and <a href='http://en.wikipedia.org/wiki/Buzz_Aldrin'>Buzz Aldrin</a>,"//
                + " on the Moon on July 20, 1969, at 20:18 UTC."//
                + " <b>Armstrong</b> became the first to step onto"//
                + " the lunar surface 6 hours later on July 21 at 02:56 UTC.";
 
        htmlEditor.setHtmlText(INITIAL_TEXT);
 
        Button showHTMLButton = new Button("Show in WebView");
 
        // WebView
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();
 
        //
        showHTMLButton.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                webEngine.loadContent(htmlEditor.getHtmlText(), "text/html");
            }
        });
 
        VBox root = new VBox();
        root.setPadding(new Insets(5));
        root.setSpacing(5);
        root.getChildren().addAll(htmlEditor, showHTMLButton, webView);
        Scene scene = new Scene(root, 600, 450);
 
        stage.setTitle("JavaFX HTMLEditor (o7planning.org)");
 
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
 
}