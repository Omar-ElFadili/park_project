package park.omar.demo.services;

import park.omar.demo.entities.Conducteur;

import java.util.List;

public interface ConducteurService {
    public Conducteur add (Conducteur conducteur);
    Conducteur getById(String id);

    List<Conducteur> getAll();
}
