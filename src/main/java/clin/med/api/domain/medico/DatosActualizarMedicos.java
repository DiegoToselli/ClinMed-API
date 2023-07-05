package clin.med.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import clin.med.api.domain.direccion.DatosDireccion;

public record DatosActualizarMedicos(@NotNull Long id, String nombre, String documento, DatosDireccion direccion) {

}
