package park.omar.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import park.omar.demo.entities.Permis;

public interface PermisRepository extends JpaRepository<Permis,String> {
}
