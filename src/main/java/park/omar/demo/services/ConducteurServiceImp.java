package park.omar.demo.services;

import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import park.omar.demo.entities.Conducteur;
import park.omar.demo.repositories.ConducteurRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ConducteurServiceImp implements ConducteurService{
    @Autowired
    ConducteurRepository conducteurRepository;
    @Override
    public Conducteur add(Conducteur conducteur) {
        return conducteurRepository.save(conducteur);
    }

    public List<Conducteur> getAll() {
        List<Conducteur> conductors = conducteurRepository.findAll();
        return conductors ;

    }

    @Override
    public Conducteur getById(String id)  {
        Optional<Conducteur> conductor = conducteurRepository.findById(id);


        return conductor.get();
    }
}
