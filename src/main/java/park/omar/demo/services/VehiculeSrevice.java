package park.omar.demo.services;

import park.omar.demo.entities.Vehicule;

public interface VehiculeSrevice {
    public Vehicule add(Vehicule vehicule);

    Vehicule getById(String id);
}
