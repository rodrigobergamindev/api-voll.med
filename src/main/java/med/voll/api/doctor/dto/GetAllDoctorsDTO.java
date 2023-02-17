package med.voll.api.doctor.dto;

import med.voll.api.doctor.Especialidade;
import med.voll.api.doctor.entities.Doctor;

public record GetAllDoctorsDTO(

        Long id,

        String nome,

        String email,

        String crm,

        Especialidade especialidade
) {

    public GetAllDoctorsDTO(Doctor doctor){
        this(
                doctor.getId(),
                doctor.getNome(),
                doctor.getEmail(),
                doctor.getCrm(),
                doctor.getEspecialidade()
                );
    }
}
