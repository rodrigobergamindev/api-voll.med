package med.voll.api.endereco;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;

    private String complemento;

    private String cidade;

    private String uf;

    public Endereco(CreateAddressDTO data){
        this.logradouro = data.logradouro();
        this.cep = data.cep();
        this.numero = data.numero();
        this.cidade = data.cidade();
        this.bairro = data.bairro();
        this.complemento = data.complemento();
        this.uf = data.uf();
    }

    public void update(CreateAddressDTO data) {

        if(data.logradouro() != null){
            this.logradouro = data.logradouro();
        }

        if(data.cep() != null){
            this.cep = data.cep();
        }

        if(data.numero() != null){
            this.numero = data.numero();
        }

        if(data.cidade() != null){
            this.cidade = data.cidade();
        }

        if(data.bairro() != null){
            this.bairro = data.bairro();
        }

        if(data.complemento() != null){
            this.complemento = data.complemento();
        }

        if(data.uf() != null){
            this.uf = data.uf();
        }


    }
}
