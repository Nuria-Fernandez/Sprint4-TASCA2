package cat.itacademy.barcelonactiva.Fernandez.nuria.s04.t02.n02.Model.Repository;

import cat.itacademy.barcelonactiva.Fernandez.nuria.s04.t02.n02.Model.Domain.FrutaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FrutaEntityRepository extends JpaRepository<FrutaEntity, Integer> {
}
