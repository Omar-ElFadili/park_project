package park.omar.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import park.omar.demo.entities.Affectation;
import park.omar.demo.entities.AffectationId;

public interface AffectationRepository extends JpaRepository<Affectation, AffectationId> {
}
