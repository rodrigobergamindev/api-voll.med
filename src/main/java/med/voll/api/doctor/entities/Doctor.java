package med.voll.api.doctor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.doctor.Especialidade;
import med.voll.api.doctor.dto.CreateDoctorDTO;
import med.voll.api.doctor.dto.UpdateDoctorDTO;
import med.voll.api.endereco.Endereco;

@Table(name = "doctors")
@Entity(name = "Doctor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    private String telefone;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;


    public Doctor(CreateDoctorDTO data){
        this.nome = data.nome();
        this.email = data.email();
        this.telefone = data.telefone();
        this.crm = data.crm();
        this.especialidade = data.especialidade();
        this.endereco = new Endereco(data.endereco());

    }

    public void update(UpdateDoctorDTO data) {

        if(data.nome() != null){
            this.nome = data.nome();
        }

        if(data.telefone() != null){
            this.telefone = data.telefone();
        }

        if(data.endereco() != null){
            this.endereco.update(data.endereco());
        }
    }
}