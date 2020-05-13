package hust.soict.hedspi.gui.javafx.areachart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
public class CssAreaChartDemo extends Application {
 
    @Override
    public void start(Stage stage) {
 
        final NumberAxis xAxis = new NumberAxis(1, 12, 1);
        final NumberAxis yAxis = new NumberAxis();
        final AreaChart<Number, Number> areaChart = new AreaChart<Number, Number>(xAxis, yAxis);
        areaChart.setTitle("Revenue");
      
 
        // Series data of 2014
        XYChart.Series<Number, Number> series2014 = new XYChart.Series<Number, Number>();
 
        
        series2014.setName("2014");
        
        
        series2014.getData().add(new XYChart.Data<Number, Number>(1, 400));
        series2014.getData().add(new XYChart.Data<Number, Number>(3, 1000));
        series2014.getData().add(new XYChart.Data<Number, Number>(4, 1500));
        series2014.getData().add(new XYChart.Data<Number, Number>(5, 800));
        series2014.getData().add(new XYChart.Data<Number, Number>(7, 500));
        series2014.getData().add(new XYChart.Data<Number, Number>(8, 1800));
        series2014.getData().add(new XYChart.Data<Number, Number>(10, 1500));
        series2014.getData().add(new XYChart.Data<Number, Number>(12, 1300));
 
        // Series data of 2015
        XYChart.Series<Number, Number> series2015 = new XYChart.Series<Number, Number>();
        series2015.setName("2015");
        series2015.getData().add(new XYChart.Data<Number, Number>(1, 2000));
        series2015.getData().add(new XYChart.Data<Number, Number>(3, 1500));
        series2015.getData().add(new XYChart.Data<Number, Number>(4, 1300));
        series2015.getData().add(new XYChart.Data<Number, Number>(5, 1200));
        series2015.getData().add(new XYChart.Data<Number, Number>(7, 1400));
        series2015.getData().add(new XYChart.Data<Number, Number>(8, 1080));
        series2015.getData().add(new XYChart.Data<Number, Number>(10, 2050));
        series2015.getData().add(new XYChart.Data<Number, Number>(12, 2005)); 
          
 
        stage.setTitle("AreaChart (o7planning.org)");
        Scene scene = new Scene(areaChart, 400, 300);
        
        // Add stylesheet to the Scene. .
        scene.getStylesheets().add("/hust/soict/hedspi/gui/javafx/areachart/style.css");
                
                
        areaChart.getData().addAll(series2014, series2015);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
    
}