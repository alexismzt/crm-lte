package org.shwd.lib.data.entities.base;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import lombok.Data;
import org.shwd.lib.data.dto.base.BaseDTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
public abstract class Base extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column
    LocalDate fechaCreacion;
    @Column
    String creadoPor;
    @Column
    LocalDate ultimaModificacion;
    @Column
    String modificadoPor;
    @Column(columnDefinition = "tinyint")
    boolean activo;

    public BaseDTO refresh(BaseDTO obj){
        obj.setId(this.id);
        obj.setCreadoPor(this.creadoPor);
        obj.setModificadoPor(this.modificadoPor);
        obj.setUltimaModificacion(this.ultimaModificacion);
        return obj;
    }
}
