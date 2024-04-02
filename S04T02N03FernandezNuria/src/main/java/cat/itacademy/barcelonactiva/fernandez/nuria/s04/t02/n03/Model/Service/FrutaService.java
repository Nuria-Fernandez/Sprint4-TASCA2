package cat.itacademy.barcelonactiva.fernandez.nuria.s04.t02.n03.Model.Service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.fernandez.nuria.s04.t02.n03.Model.Domain.FrutaEntity;
import cat.itacademy.barcelonactiva.fernandez.nuria.s04.t02.n03.Model.Repository.FrutaEntityRepository;

@Service
public class FrutaService {

    @Autowired
    FrutaEntityRepository frutaEntityRepository;

    public FrutaEntity crear(FrutaEntity fruta){
        return frutaEntityRepository.save(fruta);
    }
    public FrutaEntity actualizar(ObjectId id, FrutaEntity fruta){

        FrutaEntity nuevaFruta = frutaEntityRepository.findById(id).get();
        nuevaFruta.setName(fruta.getName());
        nuevaFruta.setCantidadKilos(fruta.getCantidadKilos());

        return frutaEntityRepository.save(nuevaFruta);
    }
    public String borrar(ObjectId id){
        frutaEntityRepository.deleteById(id);
        return "Se ha borrado el producto con el número " + id;
    }
    public List<FrutaEntity> findAll() {
        return frutaEntityRepository.findAll();
    }


    public Optional<FrutaEntity> findById(ObjectId id) {
        return frutaEntityRepository.findById(id);
    }

}

