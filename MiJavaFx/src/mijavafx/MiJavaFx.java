/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mijavafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Fabri
 */
public class MiJavaFx extends Application{
    
    private int contador;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        //EJEMPLO CONTADOR        
        /*Label lbl = new Label("Hola mundo");
        
        TextField txtNombre = new TextField();
        
        Button boton = new Button("Cambiar");
        
        boton.setOnAction((t)->{
            this.contador++;
            lbl.setText("Cantidad de clicks: "+this.contador);
        });*/
        
        //EJEMPLO FORMULARIO NOMBRE Y APELLIDO        
        Label lblNombre = new Label("Nombre");
        TextField txtNombre = new TextField();
        Label lblApellido = new Label("Apellido");
        TextField txtApellido = new TextField();
        Button botonIngreso = new Button("Ingresar");
        Label lblCartel = new Label("");
        txtNombre.setMaxWidth(200);
        txtApellido.setMaxWidth(200);
        
        //manejador de eventos. en este caso captura el evento que dispara al presionar el boton del formulario
        botonIngreso.setOnAction((t)->{
            lblCartel.setText(txtNombre.getText()+ " "+txtApellido.getText());
        });
        
        
        
        //VBox root = new VBox(10,lblNombre,txtNombre,lblApellido,txtApellido,botonIngreso,lblCartel);
        
        GridPane root = new GridPane();
        
        root.setHgap(10);
        root.setVgap(10);
        
        root.add(lblNombre,0,0);
        root.add(txtNombre,1,0);
        root.add(lblApellido,0,1);
        root.add(txtApellido,1,1);
        root.add(botonIngreso,1,2);
        root.add(lblCartel,1,3);
        
        root.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(root, 400, 200);
        
        stage.setScene(scene);
        
        stage.setTitle("Mi app javaFX");
        
        stage.show();
    }
    
    
    public static void main(String[] args) {
        Application.launch();
    }
   
    
}
