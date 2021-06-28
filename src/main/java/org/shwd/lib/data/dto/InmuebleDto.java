package org.shwd.lib.data.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;
import org.shwd.lib.data.dto.base.BaseDTO;

import java.util.Set;

@RegisterForReflection
@Data
public class InmuebleDto extends BaseDTO {
    String codeName;
    String direccion;
    String colonia;
    EstadoDTO estado;
    CiudadDTO ciudad;
    String observaciones;
    Set<MantenimientoDTO> mantenimientos;
}
