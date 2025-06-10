package controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import models.Persona;

/**
 * FXML Controller class
 *
 * @author Fabri
 */
public class ViewController implements Initializable {
    
    @FXML
    private ListView<Persona> listViewPersonas;
    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnModificar;
    @FXML
    private Button btnEliminar;
    
    private List<Persona> listaPersonas;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.listaPersonas = new  ArrayList<>();
    }
    
    @FXML
    private void agregarPersona(ActionEvent e){
        this.abrirFormulario(null);
    }
    
    @FXML
    private void modificarPersona(ActionEvent e){
        this.abrirFormulario(null);
    }
    
    @FXML
    private void eliminarPersona(ActionEvent e){
        this.abrirFormulario(null);
    }
    
    private void abrirFormulario(Persona personaExistente){
        try{
            FXMLLoader loaderFormulario = new FXMLLoader(getClass().getResource("/views/formulario.fxml")); 
            
            Scene sceneFormulario = new Scene(loaderFormulario.load());
            
            Stage stageFormulario = new Stage();
            
            stageFormulario.setScene(sceneFormulario);
            
            stageFormulario.show();
        
        }catch(Exception e){
            
        }
    }
}
