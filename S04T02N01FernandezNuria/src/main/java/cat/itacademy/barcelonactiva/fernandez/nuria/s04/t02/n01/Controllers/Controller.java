package cat.itacademy.barcelonactiva.fernandez.nuria.s04.t02.n01.Controllers;

import cat.itacademy.barcelonactiva.fernandez.nuria.s04.t02.n01.model.domain.FrutaEntity;
import cat.itacademy.barcelonactiva.fernandez.nuria.s04.t02.n01.model.repository.FrutaEntityRepository;
import cat.itacademy.barcelonactiva.fernandez.nuria.s04.t02.n01.model.services.FrutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fruita")
public class Controller {
    @Autowired
    private FrutaService frutaService;
    @PostMapping("/add")
    public ResponseEntity<FrutaEntity> crear(@RequestBody FrutaEntity fruta) {
        FrutaEntity frutaEntity = frutaService.crear(fruta);

        return ResponseEntity.status(HttpStatus.CREATED).body(frutaEntity);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<FrutaEntity> actualizar(@PathVariable int id, @RequestBody FrutaEntity fruta){
        ResponseEntity<FrutaEntity> responseEntity;
        FrutaEntity nuevaFruta = frutaService.actualizar(id, fruta);
        if(nuevaFruta != null){
            responseEntity = ResponseEntity.ok(nuevaFruta);
        }else{
            responseEntity = ResponseEntity.notFound().build();
        }
        return responseEntity;

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFruitaEntity (@PathVariable int id) {
        String mensaje = frutaService.borrar(id);

        return ResponseEntity.ok(mensaje);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<FrutaEntity>> getAllFruitaEntity() {
        List<FrutaEntity> listaFrutas = frutaService.findAll();
        ResponseEntity <List<FrutaEntity>> responseEntity;
        if (listaFrutas.isEmpty()){
            responseEntity = ResponseEntity.noContent().build();
        } else {
            responseEntity = ResponseEntity.ok(listaFrutas);
        }
        return responseEntity;
    }
    @GetMapping("/getOne/{id}")
    public ResponseEntity<FrutaEntity> getOne (@PathVariable int id){
        Optional<FrutaEntity> frutaOptional= frutaService.findById(id);
        ResponseEntity<FrutaEntity> responseEntity;

        if (frutaOptional.isPresent()) {
            responseEntity = ResponseEntity.ok(frutaOptional.get());
        } else {
            responseEntity = ResponseEntity.notFound().build();
        }
        return responseEntity;
    }


}
