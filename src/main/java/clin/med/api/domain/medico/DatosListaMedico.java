package clin.med.api.domain.medico;

public record DatosListaMedico(Long id, String nombre, String email, String documentoIdentidad) {
    public DatosListaMedico(Medico medico) {
        this(medico.getId(), medico.getNombre(), medico.getEmail(), medico.getDocumento());
    }
}
