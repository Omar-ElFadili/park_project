package park.omar.demo.services;

import park.omar.demo.entities.Affectation;

import java.util.List;

public interface AffectationService {
    public Affectation add(Affectation affectation);

    public List<Affectation> getAll() ;
}
