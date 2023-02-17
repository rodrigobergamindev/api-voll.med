package med.voll.api.pacient.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.doctor.dto.CreateDoctorDTO;
import med.voll.api.endereco.Endereco;
import med.voll.api.pacient.dto.CreatePacientDTO;

@Table(name = "pacients")
@Entity(name = "Pacient")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pacient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private String email;

    private String telefone;

    @Embedded
    private Endereco endereco;


    public Pacient(CreatePacientDTO data){

        this.nome = data.nome();
        this.email = data.email();
        this.cpf = data.cpf();
        this.telefone = data.telefone();
        this.endereco = new Endereco(data.endereco());

    }

}
