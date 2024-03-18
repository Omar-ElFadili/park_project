package park.omar.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import park.omar.demo.entities.Conducteur;
import park.omar.demo.entities.Vehicule;
import park.omar.demo.repositories.AffectationRepository;
import park.omar.demo.repositories.ConducteurRepository;
import park.omar.demo.repositories.VehiculeRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DisponibilityServiceImp implements DisponibilityService{

    @Autowired
    VehiculeRepository vehiculeRepository ;
    @Autowired
    ConducteurRepository conducteurRepository ;
    @Autowired
    AffectationRepository vaffectationRepository ;
    @Override
    public List<Conducteur> getAvailableConducteur(LocalDate startDate, LocalDate endDate) {
        List<Conducteur> availableConductor =  conducteurRepository.findAvailableConductors(startDate , endDate) ;
        return availableConductor ;
    }

    @Override
    public List<Vehicule> getAvailableVehicule(Date startDate, Date endDate) {
        List<Vehicule> availableVehicule =  vehiculeRepository.findAvailableVehicles(startDate , endDate) ;
        return availableVehicule  ;
    }

    @Override
    public List<Conducteur> getAvailableDriversForVehicle(String idVehicule, LocalDate startDate, LocalDate endDate) {
        List <Conducteur> conducteurs = conducteurRepository.findAvailableConductors(startDate , endDate) ;
        Optional<Vehicule> vehicule = vehiculeRepository.findById(idVehicule) ;
        List <Conducteur> availableConducoreForVehicule  = conducteurs
                .stream()
                .filter(conducteur ->conducteur.getListPermis()==vehicule.get().getTypePermis()).toList() ;
        return availableConducoreForVehicule ;
    }
}
