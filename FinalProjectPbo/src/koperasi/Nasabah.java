package koperasi;

import java.util.*;
import javafx.beans.property.*;

public abstract class Nasabah {
    protected IntegerProperty ID;
    protected StringProperty nama;
    protected StringProperty alamat;
    protected IntegerProperty numAccount;
    protected ArrayList<Rekening> rekening;

    public Nasabah(int ID, String nama, String alamat, ArrayList<Rekening> rekening) {
        this.ID = new SimpleIntegerProperty(ID);
        this.nama = new SimpleStringProperty(nama);
        this.alamat = new SimpleStringProperty(alamat);
        this.rekening = rekening;
        this.numAccount = new SimpleIntegerProperty(this.rekening.size());
    }
    
    public Nasabah(int ID, String nama, String alamat, Rekening rekening) {
        this.rekening = new ArrayList<>();
        this.ID = new SimpleIntegerProperty(ID);
        this.nama = new SimpleStringProperty(nama);
        this.alamat = new SimpleStringProperty(alamat);
        this.rekening.add(rekening);
        this.numAccount = new SimpleIntegerProperty(this.rekening.size());
    }
    
    public int getID() {
        return ID.get();
    }

    public void setID(int ID) {
        this.ID.set(ID);
    }

    public String getNama() {
        return nama.get();
    }

    public void setNama(String nama) {
        this.nama.set(nama);
    }

    public String getAlamat() {
        return alamat.get();
    }

    public void setAlamat(String alamat) {
        this.alamat.set(alamat);
    }

    public int getNumAccount() {
        return numAccount.get();
    }

    public ArrayList<Rekening> getRekening() {
        return rekening;
    }

    public void setRekening(ArrayList<Rekening> rekening) {
        this.rekening = rekening;
    }
    
    public IntegerProperty IDProperty(){
        return this.ID;
    }
    
    public StringProperty namaProperty(){
        return this.nama;
    }
    
    public StringProperty alamatProperty(){
        return this.alamat;
    }
    
    public IntegerProperty numAccountProperty(){
        return this.numAccount;
    }
    
    public abstract void print();
}
