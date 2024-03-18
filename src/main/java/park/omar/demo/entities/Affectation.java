package park.omar.demo.entities;

import jakarta.persistence.*;
import lombok.Builder;

import java.time.LocalDate;

@Builder
@Entity
public class Affectation {

    @EmbeddedId
    private AffectationId id;
    @Column
    private String typeVehicule;
    @Column
    private LocalDate dateAffectation;
    @Column
    private LocalDate dateDepart;
    @Column
    private LocalDate dateRetour;
    @ManyToOne
    @MapsId("idConducteur")
    @JoinColumn(name = "idConducteur")
    private Conducteur conducteur;
    @ManyToOne
    @MapsId("idVehicule")
    @JoinColumn(name = "idVehicule")
    private Vehicule vehicule;


    public Affectation(AffectationId id, String typeVehicule, LocalDate dateAffectation, LocalDate dateDepart, LocalDate dateRetour, Conducteur conducteur, Vehicule vehicule) {
        this.id = id;
        this.typeVehicule = typeVehicule;
        this.dateAffectation = dateAffectation;
        this.dateDepart = dateDepart;
        this.dateRetour = dateRetour;
        this.conducteur = conducteur;
        this.vehicule = vehicule;
    }


    public Affectation() {
    }

    public AffectationId getId() {
        return id;
    }

    public void setId(AffectationId id) {
        this.id = id;
    }

    public String getTypeVehicule() {
        return typeVehicule;
    }

    public void setTypeVehicule(String typeVehicule) {
        this.typeVehicule = typeVehicule;
    }

    public LocalDate getDateAffectation() {
        return dateAffectation;
    }

    public void setDateAffectation(LocalDate dateAffectation) {
        this.dateAffectation = dateAffectation;
    }

    public LocalDate getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(LocalDate dateDepart) {
        this.dateDepart = dateDepart;
    }

    public LocalDate getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(LocalDate dateRetour) {
        this.dateRetour = dateRetour;
    }

    public Conducteur getConducteur() {
        return conducteur;
    }

    public void setConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }
}

