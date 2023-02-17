package med.voll.api.doctor.dto;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.CreateAddressDTO;

public record UpdateDoctorDTO(

        @NotNull
        Long id,

        String nome,

        String telefone,

        String email,

        CreateAddressDTO endereco
) {
}
