package med.voll.api.domain.medico;

public record DatosPublicosMedicos(
    Long id,
    String nombre,
    String especialidad,
    String documento,
    String email
) {

    public DatosPublicosMedicos(Medico medico){
        this(medico.getId(), medico.getNombre(), medico.getEspecialidad().toString(), medico.getDocumento(), medico.getEmail());
    }
}
