package cat.itacademy.barcelonactiva.fernandez.nuria.s04.t02.n01.model.repository;

import cat.itacademy.barcelonactiva.fernandez.nuria.s04.t02.n01.model.domain.FrutaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrutaEntityRepository extends JpaRepository<FrutaEntity, Integer> {
}
