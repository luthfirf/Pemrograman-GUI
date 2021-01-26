package bukualamat.view;

import bukualamat.BukuAlamat;
import bukualamat.model.DataPersonal;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewBukuAlamatController {

    @FXML
    private TableView<DataPersonal> DataPerson;

    @FXML
    private TableColumn<DataPersonal, String> KolomNamaDepan;

    @FXML
    private TableColumn<DataPersonal, String> KolomNamaBelakang;

    @FXML
    private Label LabelNamaDepan;

    @FXML
    private Label LabelNamaBelakang;

    @FXML
    private Label LabelAlamat;

    @FXML
    private Label LabelKota;

    @FXML
    private Label LabelNoHp;
    
    //Referensi Kelas Utama
    private BukuAlamat kelasUtama;

    //Konstruktor
    private ViewBukuAlamatController(){
    }
    
    @FXML
    public void initialize() {
        KolomNamaDepan.setCellValueFactory(celldata -> celldata.getValue().namadepanProperty());
        KolomNamaBelakang.setCellValueFactory(celldata -> celldata.getValue().namabelakangProperty());
    }    
    // Metode setKelasUtama agar kontroler terhubung denang kelas BukuAlamat
    // untuk referensi kelas BukuAlamat Ke Variable KelasUtama
    // Sehingga dapat menambahkan ObservableList pada kelas utama kevariable tableperson dikelas ini
    // motode ini akan dipanggil dikelas utama 
    public void setkelasUtama(BukuAlamat bukualamat){
        this.kelasUtama = bukualamat;
        
        DataPerson.setItems(kelasUtama.getDataPersonal());   
    }

}
