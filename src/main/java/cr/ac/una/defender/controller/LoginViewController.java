/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.defender.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Haymara
 */
public class LoginViewController extends Controller implements Initializable {

    @FXML
    private Label lblTituloInicio;
    @FXML
    private JFXTextField txtUsuario;
    @FXML
    private JFXPasswordField txtClave;
    @FXML
    private Label labelOlvidarClave;
    @FXML
    private JFXButton btnIngresar;
    @FXML
    private JFXButton btnRegistro;
    @FXML
    private JFXButton btnCreditos;
    @FXML
    private JFXButton btnSalir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onActionLabelOlvidasteClave(MouseEvent event) {
    }

    @FXML
    private void onActionBtnIngresar(ActionEvent event) {
    }

    @FXML
    private void onActionBtnRegistro(ActionEvent event) {
    }

    @FXML
    private void onActionBtnCreditos(ActionEvent event) {
    }

    @FXML
    private void onActionBtnSalir(ActionEvent event) {
    }

    @Override
    public void initialize() {
    }
    
}
