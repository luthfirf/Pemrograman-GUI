/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guijava1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author luthfiramdhanfaqih
 */
public class MyApp extends Application {
    
    @Override
    public void start(Stage stage) {
        //label nama
        Text text1 = new Text("Nama  :");
        //label telepon
        Text text2 = new Text("Telepon :");
        //label alamat
        Text text3 = new Text("Alamat :");
        
        //TextField untuk nama
        TextField textField1 = new TextField();
        //textfield untuk telepone
        TextField textField2 = new TextField();
        //textarea untuk alamat
        TextArea textArea = new TextArea();
        
        //Tombol
        Button button1 = new Button("Kirim");
        Button button2 = new Button("Hapus");
        
        // Grid Pane
        GridPane gridPane = new GridPane();
        
        // setting ukuran Pane
        gridPane.setMinSize(400, 200);
        
        //setting padding
        gridPane.setPadding(new Insets(20, 20, 10, 10));
        
        //Setting celah vertikal dan horizontal antara kolom
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        
        //Setting perataan Grid
        gridPane.setAlignment(Pos.CENTER);
        
        //Menyusun semua node grid
            //bagian grid nama
            gridPane.add(text1, 0, 0);
            gridPane.add(textField1, 1, 0);
        
            //bagian grid telepon
            gridPane.add(text2, 0, 1);
            gridPane.add(textField2, 1, 1);
        
            //bagian grid alamat
            gridPane.add(text3, 0, 2);
            gridPane.add(textArea, 1, 2);
            
            //bagian grid tombol
            gridPane.add(button1, 0, 3);
            gridPane.add(button2, 1, 3);
        
        //scene object
        Scene scene = new Scene(gridPane);
        
        //Setting nama stage / Event
        stage.setTitle("Form Pendaftaran");
        
        //Menambahkan scene ke stage
        stage.setScene(scene);
        
        //Menampilkan konten ke stage
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
