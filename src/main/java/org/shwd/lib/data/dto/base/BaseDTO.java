package org.shwd.lib.data.dto.base;

import lombok.Data;

import java.time.LocalDate;

@Data
public abstract class BaseDTO {
    Integer id;
    LocalDate fechaCreacion;
    String creadoPor;
    LocalDate ultimaModificacion;
    String modificadoPor;
    boolean activo;
}
