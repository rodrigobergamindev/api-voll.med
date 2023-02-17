package med.voll.api.pacient.dto;

import med.voll.api.doctor.entities.Doctor;
import med.voll.api.endereco.Endereco;
import med.voll.api.pacient.entities.Pacient;

public record GetAllPatientsDTO(

        Long id,
        String nome,

        String email,

        String telefone,

        String cpf,

        Endereco endereco
) {
    public GetAllPatientsDTO(Pacient pacient){
        this(
                pacient.getId(),
                pacient.getNome(),
                pacient.getEmail(),
                pacient.getCpf(),
                pacient.getTelefone(),
                pacient.getEndereco()
        );
    }


}
