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
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
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
        this.listaPersonas = new ArrayList<>();
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
    
    private void actualizarListView(){
        this.listViewPersonas.getItems().clear();//limpiamos la lista
        this.listViewPersonas.getItems().addAll(this.listaPersonas);//cargamos de vuelta asi se actualiza la lista
    }
    
    private void abrirFormulario(Persona personaExistente){
        try{
            FXMLLoader loaderFormulario = new FXMLLoader(getClass().getResource("/views/formulario.fxml")); 
            
            Scene sceneFormulario = new Scene(loaderFormulario.load());
            
            FormularioController controller = loaderFormulario.getController();
            
            controller.setPersona(personaExistente);            
            
            Stage stageFormulario = new Stage();
            
            stageFormulario.initModality(Modality.APPLICATION_MODAL);
            stageFormulario.setScene(sceneFormulario);            
            stageFormulario.showAndWait();
            
            Persona resultado = controller.getPersona();
            
            if(resultado!=null)
            {
                if(personaExistente==null)
                {
                    if(!this.listaPersonas.contains(resultado))
                    {
                        this.listaPersonas.add(resultado);
                    }else
                    {
                        System.out.println("La persona ya existe");
                    }
                }
            }
            this.actualizarListView();
        
        }catch(Exception e){
            
        }
    }
}
