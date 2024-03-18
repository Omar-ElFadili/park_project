package park.omar.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import park.omar.demo.entities.Conducteur;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ConducteurRepository extends JpaRepository<Conducteur, String> {
    @Query("SELECT c FROM Conducteur c WHERE c.idConducteur NOT IN "
            + "(SELECT DISTINCT f.conducteur.idConducteur FROM Affectation f WHERE f.dateDepart >= :startDate AND f.dateRetour <= :endDate)")
    List<Conducteur> findAvailableConductors(@RequestParam("startDate") LocalDate startDate, @RequestParam("endDate") LocalDate endDate);



}
