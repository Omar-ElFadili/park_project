package park.omar.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Vehicule {


    @Id
    private String idVehicule;
    private  String marque;
    private String immatriculation;

    private String type;
    private LocalDate model;
    @OneToOne
    private Permis typePermis;
    public Vehicule() {
    }

    public Vehicule(String marque, String immatriculation, String type, LocalDate model,Permis typePermis) {
        this.marque = marque;
        this.immatriculation = immatriculation;
        this.type = type;
        this.model = model;
        this.typePermis=typePermis;

    }

    public Permis getTypePermis() {
        return typePermis;
    }

    public void setTypePermis(Permis typePermis) {
        this.typePermis = typePermis;
    }

    public String getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(String idVehicule) {
        this.idVehicule = idVehicule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getModel() {
        return model;
    }

    public void setModel(LocalDate model) {
        this.model = model;
    }
}

