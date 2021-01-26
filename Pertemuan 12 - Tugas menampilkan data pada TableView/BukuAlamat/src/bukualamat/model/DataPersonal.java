/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ASUS - Development
 */
public class DataPersonal {
    private StringProperty namadepan = new SimpleStringProperty();
    private StringProperty namabelakang = new SimpleStringProperty();
    private StringProperty alamat = new SimpleStringProperty();
    private StringProperty kotakabupaten = new SimpleStringProperty();
    private StringProperty nohp = new SimpleStringProperty();

    public DataPersonal() {
    }
    
    public DataPersonal(String namadepan, String namabelakang) {
        //Inisialisasi dari parameter
        this.namadepan = new SimpleStringProperty(namadepan);
        this.namabelakang = new SimpleStringProperty(namabelakang);
        //Inisialisasi dengan nilai sekedar untuk memudahkan testing
        this.alamat = new SimpleStringProperty("Malang Jl.Soekarno Hatta No.005");
        this.kotakabupaten = new SimpleStringProperty("Malang");
        this.nohp = new SimpleStringProperty("085231391390");
    }
    
    public String getNohp() {
        return nohp.get();
    }

    public void setNohp(String value) {
        nohp.set(value);
    }

    public StringProperty nohpProperty() {
        return nohp;
    }
    

    public String getKotakabupaten() {
        return kotakabupaten.get();
    }

    public void setKotakabupaten(String value) {
        kotakabupaten.set(value);
    }

    public StringProperty kotakabupatenProperty() {
        return kotakabupaten;
    }
    

    public String getAlamat() {
        return alamat.get();
    }

    public void setAlamat(String value) {
        alamat.set(value);
    }

    public StringProperty alamatProperty() {
        return alamat;
    }
    

    public String getNamabelakang() {
        return namabelakang.get();
    }

    public void setNamabelakang(String value) {
        namabelakang.set(value);
    }

    public StringProperty namabelakangProperty() {
        return namabelakang;
    }
    

    public String getNamadepan() {
        return namadepan.get();
    }

    public void setNamadepan(String value) {
        namadepan.set(value);
    }

    public StringProperty namadepanProperty() {
        return namadepan;
    }

    public String getLabelNamaDepan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLabelNamaBelakang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLabelAlamat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLabelKotaKabupaten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNoHp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
