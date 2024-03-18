package park.omar.demo.entities;


import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Conducteur {


    @Id
    private String idConducteur;
    private String nom;

    private String prenom;
    private  String matricule;
    private LocalDate dateNaissance;
    private String CIN;

    @OneToMany(mappedBy = "conducteur", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Permis> listPermis = new ArrayList<>();


    public Conducteur (){
    }

    public Conducteur(String nom, String prenom, String matricule, LocalDate dateNaissance, String CIN, List<Permis> listPermis) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.dateNaissance = dateNaissance;
        this.CIN = CIN;
        this.listPermis = listPermis;
    }

    public List<Permis> getListPermis() {
        return listPermis;
    }

    public void setListPermis(List<Permis> listPermis) {
        this.listPermis = listPermis;
    }

    public String getIdConducteur() {
        return idConducteur;
    }

    public void setIdConducteur(String idConducteur) {
        this.idConducteur = idConducteur;
    }



    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getMatricule() {
        return matricule;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }



}
