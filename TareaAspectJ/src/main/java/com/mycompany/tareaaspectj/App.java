package com.mycompany.tareaaspectj;

import javafx.application.Application;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root,300,200);
        stage.setScene(scene);
        stage.setTitle("DEBER ASPECTOS");
        stage.show();
        
        VBox butonera= new VBox();
        Button btny= new Button("Cambiar a Amarillo");
        btny.setFont(new Font(15));
        btny.setCursor(Cursor.HAND);
        btny.setMaxWidth(150);
        btny.setOnAction(event ->{
            root.setStyle("-fx-background-color: yellow");
        });
        
        
      
        
        Button btnb= new Button("Cambiar a Azul");
        btnb.setFont(new Font(15));
        btnb.setCursor(Cursor.HAND);
        btnb.setMaxWidth(150);
        btnb.setOnAction(event ->{
            BlueButton(root);
            /*root.setStyle("-fx-background-color: blue");*/
        });
        
        
        
        
        Button btnr = new Button("Cambiar a Rojo");
        btnr.setFont(new Font(15));
        btnr.setCursor(Cursor.HAND);
        btnr.setMaxWidth(200);
        btnr.setOnAction(event ->{
            root.setStyle("-fx-background-color: red");
        });
        
        
        root.getChildren().add(butonera);
        butonera.getChildren().addAll(btny,btnb,btnr);
        butonera.setAlignment(Pos.CENTER);
        
        VBox.setMargin(btny, new Insets(20,0,0,0));
        VBox.setMargin(btnb, new Insets(20,0,0,0));
        VBox.setMargin(btnr, new Insets(20,0,0,0));
        
        
    }

    public static void main(String[] args) {
        launch();
    }
    
    
    private void YellowButton(StackPane root){
        
            root.setStyle("-fx-background-color: yellow");
        
    }
    
    private void BlueButton(StackPane root){
        root.setStyle("-fx-background-color: blue");
    }
    
    private void RedButton(){
        
    }
    
}