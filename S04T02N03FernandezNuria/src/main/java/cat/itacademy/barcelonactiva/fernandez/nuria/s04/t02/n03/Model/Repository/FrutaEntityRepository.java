package cat.itacademy.barcelonactiva.fernandez.nuria.s04.t02.n03.Model.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import cat.itacademy.barcelonactiva.fernandez.nuria.s04.t02.n03.Model.Domain.FrutaEntity;

public interface FrutaEntityRepository extends MongoRepository<FrutaEntity, ObjectId>{

}
