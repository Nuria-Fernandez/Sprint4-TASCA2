package cat.itacademy.barcelonactiva.fernandez.nuria.s04.t02.n03.Model.Domain;

import java.util.Objects;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;





@Document(collection = "Fruta")
public class FrutaEntity {
    
	@Id
    private ObjectId id;
    @Field("name")
    private String name;
    @Field("cantidadKilos")
    private int cantidadKilos;
    public FrutaEntity() {
    }
    public FrutaEntity(String name, int cantidadKilos) {
        this.name = name;
        this.cantidadKilos = cantidadKilos;
    }
    public ObjectId getId(){
        return id;
    }
    public void setId(ObjectId id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getCantidadKilos(){
        return cantidadKilos;
    }
    public void setCantidadKilos(int cantidadKilos){
        this.cantidadKilos = cantidadKilos;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FrutaEntity)) return false;
        FrutaEntity fruta = (FrutaEntity) o;
        return id == fruta.id &&
                Objects.equals(name, fruta.name) &&
                cantidadKilos == fruta.cantidadKilos;
    }
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.cantidadKilos);
    }

    @Override
    public String toString() {
        return "FrutaEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cantidadKilos=" + cantidadKilos +
                '}';
    }
}