/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 04121255283
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField txt1,txt2,txt3;
    @FXML
    private Label label;
    @FXML
    private Button Soma;
    @FXML
    private Button Sub;
    @FXML
    private Button Mult;
    @FXML
    private Button Div;
    @FXML
    private TextField resultado;
    @FXML
    private Button limpar;
    @FXML
    private TextField resultado1;
    @FXML
    private TextField resultado11;
    @FXML
    private Label Numero1;
    @FXML
    private Label Numero2;
    @FXML
    private Label Numero3;
   
    
    @FXML
    private void Soma(ActionEvent event) {
    Double Numero1,Numero2,Numero3;
    Numero1=Double.parseDouble(txt1.getText());
    Numero2=Double.parseDouble(txt2.getText());
    Numero3=Numero1+Numero2;
  
    txt3.setText(Numero3.toString());
    }
    @FXML
    private void Sub(ActionEvent event) {
    Double Numero1,Numero2,Numero3;
    Numero1=Double.parseDouble(txt1.getText());
    Numero2=Double.parseDouble(txt2.getText());
    Numero3=Numero1-Numero2;
   
    txt3.setText(Numero3.toString());
    }
    @FXML
    private void Mult(ActionEvent event) {
    Double Numero1,Numero2,Numero3;
    Numero1=Double.parseDouble(txt1.getText());
    Numero2=Double.parseDouble(txt2.getText());
    Numero3=Numero1*Numero2;
  
    txt3.setText(Numero3.toString());
    }
    @FXML
    private void Div(ActionEvent event) {
        Double Numero1,Numero2,Numero3;
    Numero1=Double.parseDouble(txt1.getText());
    Numero2=Double.parseDouble(txt2.getText());
    Numero3=Numero1/Numero2;
   
    txt3.setText(Numero3.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}