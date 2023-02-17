package med.voll.api.doctor.controller;

import med.voll.api.doctor.Especialidade;
import med.voll.api.doctor.entities.Doctor;

public record GetAllDoctorsDTO(
        String nome,

        String email,

        String crm,

        Especialidade especialidade
) {

    public GetAllDoctorsDTO(Doctor doctor){
        this(doctor.getNome(),
                doctor.getEmail(),
                doctor.getCrm(),
                doctor.getEspecialidade()
                );
    }
}
