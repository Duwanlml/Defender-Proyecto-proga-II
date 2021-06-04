/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.defender.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import cr.ac.una.defender.util.AppContext;
import cr.ac.una.defender.util.FlowController;
import cr.ac.una.defender.util.Formato;
import cr.ac.una.defender.util.Mensaje;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Haymara
 */
public class LoginViewController extends Controller implements Initializable {

    @FXML
    private JFXTextField txtUsuario;
    @FXML
    private JFXButton btnIngresar;
    @FXML
    private JFXButton btnCreditos;
    @FXML
    private JFXButton btnSalir;
    @FXML
    private Label lblTituloInicio1;
    @FXML
    private JFXButton brnCancelar;
    @FXML
    private Label labelNuevoUsu;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      txtUsuario.setTextFormatter(Formato.getInstance().letrasFormat(15));
    }    


    @FXML
    private void onActionBtnIngresar(ActionEvent event) {
         try{
            
            if(txtUsuario.getText() == null || txtUsuario.getText().isEmpty()){
                new Mensaje().showModal(Alert.AlertType.ERROR, "Validacion de usuario", getStage(), "Es necesario digitar un usuario para ingresar al sistema.");
          }else{
                AppContext.getInstance().set("Usuario", txtUsuario.getText());
               //FlowController.getInstance().goMain(); para ingresar a la ventana principal
               FlowController.getInstance().goViewInWindow("GameView");
                getStage().close();
            }
        }catch(Exception ex){
            Logger.getLogger(LoginViewController.class.getName()).log(Level.SEVERE, "Error ingresando", ex);
        }
    }


    @FXML
    private void onActionBtnCreditos(ActionEvent event) {
        getStage().close();
        FlowController.getInstance().goViewInWindow("CreditosView");
    }

    @FXML
    private void onActionBtnSalir(ActionEvent event) {
        getStage().close();
    }

    @Override
    public void initialize() {
        this.txtUsuario.setText("");
    }

    @FXML
    private void onActionBtnCancelar(ActionEvent event) {
        txtUsuario.clear();
    }

    @FXML
    private void onActionLabelNuevoUsu(MouseEvent event) {
         FlowController.getInstance().goViewInWindowModal("Registro", this.getStage(), Boolean.TRUE);
    }
    
}
