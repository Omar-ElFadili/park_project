package park.omar.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Permis {


    @Id
    private String permisId;

    private String typePermis;

    private LocalDate dateRemisPermis;
    @OneToOne
    private Vehicule vehicule;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idConducteur", nullable = false)
    private Conducteur conducteur;

    public Permis( String typePermis, LocalDate dateRemisPermis, Conducteur conducteur,Vehicule vehicule) {
        this.typePermis = typePermis;
        this.dateRemisPermis = dateRemisPermis;
        this.conducteur = conducteur;
        this.vehicule=vehicule;
    }
    public Permis() {
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Conducteur getConducteur() {
        return conducteur;
    }

    public void setConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
    }

    public String getPermisId() {
        return permisId;
    }

    public void setPermisId(String permisId) {
        this.permisId = permisId;
    }

    public String getTypePermis() {
        return typePermis;
    }

    public void setTypePermis(String typePermis) {
        this.typePermis = typePermis;
    }

    public LocalDate getDateRemisPermis() {
        return dateRemisPermis;
    }

    public void setDateRemisPermis(LocalDate dateRemisPermis) {
        this.dateRemisPermis = dateRemisPermis;
    }


}