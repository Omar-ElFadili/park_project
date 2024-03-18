package park.omar.demo.services;

import park.omar.demo.entities.Conducteur;
import park.omar.demo.entities.Vehicule;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface DisponibilityService {

    List<Conducteur> getAvailableConducteur(LocalDate dateDepart, LocalDate dateRetour);

    List<Vehicule> getAvailableVehicule(Date dateDepart, Date dateRetour);



    public List<Conducteur> getAvailableDriversForVehicle(String idVehicule, LocalDate startDate, LocalDate endDate);
}
