package park.omar.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import park.omar.demo.entities.Affectation;
import park.omar.demo.entities.Conducteur;
import park.omar.demo.entities.Vehicule;
import park.omar.demo.repositories.AffectationRepository;
import park.omar.demo.repositories.ConducteurRepository;
import park.omar.demo.repositories.VehiculeRepository;

import java.util.List;

@Service
public class AffectationServiceImp implements AffectationService{
    @Autowired
    AffectationRepository affectationRepository;
    @Autowired
    VehiculeSrevice vehiculeSrevice;
    @Autowired
    ConducteurService conducteurService;
    @Override
    public Affectation add(Affectation affectation) {
        Conducteur conducteur = conducteurService.getById(affectation.getConducteur().getIdConducteur());
        Vehicule vehicule = vehiculeSrevice.getById(affectation.getVehicule().getIdVehicule());
        Affectation affectation1 = Affectation.builder()
                .dateRetour(affectation.getDateRetour())
                .dateDepart(affectation.getDateDepart())
                .conducteur(conducteur)
                .vehicule(vehicule)
                .build() ;
        return affectationRepository.save(affectation);
    }

    @Override
    public List<Affectation> getAll() {
        return affectationRepository.findAll();
    }
}
