package park.omar.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import park.omar.demo.entities.Vehicule;

import java.util.Date;
import java.util.List;

public interface VehiculeRepository extends JpaRepository<Vehicule,String> {
    @Query("SELECT v FROM Vehicule v WHERE v.idVehicule NOT IN "
            + "(SELECT v2.vehicule.idVehicule FROM Affectation v2 WHERE v2.dateDepart <= :endDate AND v2.dateRetour >= :startDate)")
    List<Vehicule> findAvailableVehicles(Date startDate, Date endDate);
}
