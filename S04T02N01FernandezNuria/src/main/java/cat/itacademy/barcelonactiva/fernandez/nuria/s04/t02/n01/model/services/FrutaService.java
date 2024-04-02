package cat.itacademy.barcelonactiva.fernandez.nuria.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.fernandez.nuria.s04.t02.n01.model.domain.FrutaEntity;
import cat.itacademy.barcelonactiva.fernandez.nuria.s04.t02.n01.model.repository.FrutaEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class FrutaService {

    @Autowired
    FrutaEntityRepository frutaEntityRepository;

    public FrutaEntity crear(FrutaEntity fruta){
        return frutaEntityRepository.save(fruta);
    }
    public FrutaEntity actualizar(int id, FrutaEntity fruta){

        FrutaEntity nuevaFruta = frutaEntityRepository.findById(id).get();
        nuevaFruta.setName(fruta.getName());
        nuevaFruta.setCantidadKilos(fruta.getCantidadKilos());

        return frutaEntityRepository.save(nuevaFruta);
    }
    public String borrar(int id){
        frutaEntityRepository.deleteById(id);
        return "Se ha borrado el producto con el número " + id;
    }
    public List<FrutaEntity> findAll() {
        return frutaEntityRepository.findAll();
    }


    public Optional<FrutaEntity> findById(int id) {
        return frutaEntityRepository.findById(id);
    }

}
