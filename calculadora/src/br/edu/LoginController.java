/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * FXML Controller class
 *
 * @author 03704323209
 */
public class LoginController implements Initializable {

    @FXML
    private JFXButton btnentrar;
    @FXML
    private JFXTextField txtsenha;
    @FXML
    private JFXTextField txtusuario;
    @FXML
    private JFXButton btnnovo;

    private void handleButtonAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void abrirCalculadora(ActionEvent event) throws IOException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        
        Query query = em.createQuery ("SELECT f FROM Login as f WHERE f.usuario = :user");
        query.setParameter("user", txtusuario.getText());
        
        if(query.getResultList() .isEmpty()){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("O Usuário não existe!");
            alert.showAndWait();
        }
        else{
             LoginController f = (LoginController) query.getSingleResult();
             if (!f.getSenha().equals(txtsenha.getText())){
             Alert alert = new Alert(Alert.AlertType.WARNING);
             alert.setHeaderText("Senha incorreta!");
             alert.showAndWait();
        }
            else{
                 FXMLLoader fxmlLoader = new FXMLLoader();
                 fxmlLoader.setLocation(getClass().getResource("telaPrincipal.fxml"));
                 Scene scene = new Scene(fxmlLoader.load(), 700, 600);
                 Stage stage = new Stage();
                 stage.setTitle("Tela Principal");
                 stage.setScene(scene);
                 stage.show();
            }
    }

}
    @FXML
    private void abrirUsuario(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("usuario.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastro de Usuario");
        stage.setScene(scene);
        stage.show();
}

    private Object getSenha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}