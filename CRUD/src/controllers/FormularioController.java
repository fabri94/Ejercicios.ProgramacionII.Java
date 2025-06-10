package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Persona;

public class FormularioController{
    
    @FXML
    private Button btnConfirmar;
    @FXML
    private Button btnCancelar;
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    
    private Persona persona;
    
    private boolean confirmado; //corroborar que se va a realizar el cambio o no. a la hora de devolver la persona por ej
    
    @FXML
    private void confirmar(){
        String id = this.txtId.getText().trim();
        String nombre = this.txtNombre.getText().trim();
        String apellido = this.txtApellido.getText().trim();
        
        if(id.isEmpty()||nombre.isEmpty()||apellido.isEmpty()){
            System.out.println("Campos obligatorios");
            return;
        }
        
        int idParseado = Integer.parseInt(id);
        if(this.persona == null){
            this.persona = new Persona(nombre,idParseado,apellido);
        }else{
            this.persona.setApellido(apellido);
            this.persona.setNombre(nombre);
            this.persona.setId(idParseado);
        }
        this.confirmado = true;
        this.cerrarVentana();
    }
    @FXML
    private void cancelar(){
        this.cerrarVentana();
    }
    
    private void cerrarVentana(){
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        
        stage.close();
    }
    
    public Persona getPersona(){
        return this.confirmado ? this.persona : null; //si esta confirmado retorna una persona
    }
    
    public void setPersona(Persona persona){       
        try{
            this.persona = persona;
            if(persona!=null)
            {
                this.txtId.setText(String.valueOf(persona.getId()));
                this.txtNombre.setText(persona.getNombre());
                this.txtApellido.setText(persona.getApellido());
            }
        }catch(Exception e)
        {        
        }
    }   
    
}
