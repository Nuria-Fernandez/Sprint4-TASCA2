package cat.itacademy.barcelonactiva.fernandez.nuria.s04.t02.n01.model.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Fruta")
public class FrutaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private int cantidadKilos;
    public FrutaEntity() {
    }
    public FrutaEntity(String name, int cantidadKilos) {
        this.name = name;
        this.cantidadKilos = cantidadKilos;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
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
