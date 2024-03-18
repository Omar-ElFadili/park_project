package park.omar.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import park.omar.demo.entities.Vehicule;
import park.omar.demo.repositories.VehiculeRepository;

import java.util.Optional;

@Service
public class VehiculeServiceImp implements VehiculeSrevice{
    @Autowired
    VehiculeRepository vehiculeRepository;
    @Override
    public Vehicule add(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule getById(String id) {
        Optional<Vehicule> vehicule =  vehiculeRepository.findById(id) ;

        return vehicule.get();

    }

}
