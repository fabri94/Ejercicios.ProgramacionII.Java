/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosjavafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EjerciciosJavaFX extends Application{

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        TextField txtNumero1 = new TextField();
        TextField txtNumero2 = new TextField();
        txtNumero1.setMaxWidth(200);
        txtNumero2.setMaxWidth(200);
        Button btnSumar = new Button("SUMAR");
        Label lblResultado = new Label();
        
        btnSumar.setOnAction((t)->{
            try{
                double numeroUno = Double.parseDouble(txtNumero1.getText());
                double numeroDos = Double.parseDouble(txtNumero2.getText());
                double resultado = numeroUno + numeroDos;
                lblResultado.setText("Resultado = "+resultado);
            }catch(NumberFormatException e){
                lblResultado.setText("Error numero invalido");
            }
            
        });
        
        VBox root = new VBox(10,txtNumero1, txtNumero2, btnSumar, lblResultado);
        root.setStyle("-fx-background-color: #000000;");
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root,400,200);
        stage.setScene(scene);
        stage.setTitle("Sumadora");
        stage.show();
    }
    
}
