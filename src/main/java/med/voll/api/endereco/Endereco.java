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
}
