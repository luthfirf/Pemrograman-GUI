/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat;

import bukualamat.model.DataPersonal;
import bukualamat.view.ViewBukuAlamatController;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.logging.Level;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ASUS - Development
 */
public class BukuAlamat extends Application {
    
//    Variable Kelas
    private Stage stageAplikasi;
    private BorderPane rootAplikasi;
    private ObservableList<DataPersonal> dataperson = FXCollections.observableArrayList();
    
    public BukuAlamat(){
        dataperson.add(new DataPersonal("Budi","Santoso"));
        dataperson.add(new DataPersonal("Luthfi","Ramdhan"));
        dataperson.add(new DataPersonal("Rebecc","Ria"));
        dataperson.add(new DataPersonal("Anies","Baswedan"));
        dataperson.add(new DataPersonal("Jokowi","Dodo"));
        
    }
    public ObservableList<DataPersonal> getDataPersonal(){
        return dataperson;
    }
    
    @Override
    public void start(Stage primaryStage){
        this.stageAplikasi = primaryStage;
        this.stageAplikasi.setTitle("Buku Alamat");
        
        initGuiKerangka(); //inisialisasi node dari GuiKerangka.fxml
        initViewBukuAlamat(); //inisialisasi node dari ViewBukuAlamat.fxml
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    private void initGuiKerangka(){
     
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(BukuAlamat.class.getResource("view/GuiKerangka.fxml"));
            rootAplikasi = (BorderPane)loader.load();
            
            Scene sceneAplikasi = new Scene(rootAplikasi);
            stageAplikasi.setScene(sceneAplikasi);
            stageAplikasi.show();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(BukuAlamat.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    private void initViewBukuAlamat() {
      
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation((BukuAlamat.class.getResource("view/ViewBukuAlamat.fxml")));
            AnchorPane guiIsi = (AnchorPane)loader.load();
            rootAplikasi.setCenter(guiIsi);
            
            ViewBukuAlamatController kontroler = loader.getController();
            kontroler.setkelasUtama(this);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(BukuAlamat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
