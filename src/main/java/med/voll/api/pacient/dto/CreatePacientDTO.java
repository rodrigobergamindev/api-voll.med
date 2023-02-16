package med.voll.api.pacient.dto;

import med.voll.api.endereco.CreateAddressDTO;

public record CreatePacientDTO(
        String nome,
        String email,
        String telefone,
        String cpf,
        CreateAddressDTO endereco
) {

}
