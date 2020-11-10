/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author ASUS - Development
 */
public class KalkulatorController implements Initializable {

    @FXML
    private Button btTiga;
    @FXML
    private Button btSatu;
    @FXML
    private Button btNol;
    @FXML
    private Button btEmpat;
    @FXML
    private Button btLima;
    @FXML
    private Button btEnam;
    @FXML
    private Button btPlus;
    @FXML
    private Button btDua;
    @FXML
    private Button btKali;
    @FXML
    private Button btMinus;
    @FXML
    private Button btClear;
    @FXML
    private Button btEnter;
    @FXML
    private TextArea display;
    @FXML
    private Button btTujuh;
    @FXML
    private Button btDelapan;
    @FXML
    private Button btSembilan;
    @FXML
    private Button btBagi;
    @FXML
    private int angka1 = 0;
    private int angka2 = 0;
    private int hasil;
    private String operasi = "netral";

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonClicked(ActionEvent event) {
        if(event.getSource()== btNol){
            if(!display.getText().isBlank()){
                display.setText(display.getText() + "0");
            }
        }
        if(event.getSource()== btSatu){
            display.setText(display.getText() + "1");
        }else if(event.getSource()== btDua){
            display.setText(display.getText() + "2");
        }else if(event.getSource()== btTiga){
            display.setText(display.getText() + "3");
        }else if(event.getSource()== btEmpat){
            display.setText(display.getText() + "4");
        }else if(event.getSource()== btLima){
            display.setText(display.getText() + "5");
        }else if(event.getSource()== btEnam){
            display.setText(display.getText() + "6");
        }else if(event.getSource()== btTujuh){
            display.setText(display.getText() + "7");
        }else if(event.getSource()== btDelapan){
            display.setText(display.getText() + "8");
        }else if(event.getSource()== btSembilan){
            display.setText(display.getText() + "9");
        }else if(event.getSource()== btClear){
            display.setText("");
        }else if(event.getSource()== btPlus){
            angka1 = Integer.parseInt(display.getText());
            operasi = "plus";
            display.setText("");
        }else if(event.getSource()== btMinus){
            angka1 = Integer.parseInt(display.getText());
            operasi = "minus";
            display.setText("");
        }else if(event.getSource()== btKali){
            angka1 = Integer.parseInt(display.getText());
            operasi = "kali";
            display.setText("");
        }else if(event.getSource()== btBagi){
            angka1 = Integer.parseInt(display.getText());
            operasi = "bagi";
            display.setText("");
        }else if(event.getSource()== btEnter){
            angka2 = Integer.parseInt(display.getText());
            if (operasi.equals("plus")){
                hasil = angka1 + angka2;
            }
            if (operasi.equals("minus")){
                hasil = angka1 - angka2;
            }
            if (operasi.equals("kali")){
                hasil = angka1 * angka2;
            }
            if (operasi.equals("bagi")){
                hasil = angka1 / angka2;
            }
            display.setText(String.valueOf(hasil));
                operasi = "netral";
        }
        
    }
    
}
