package home.app.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Usuario_prestador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_prestador;


    String nomePrestador;
    String cpf;
    String email;
    String rua_logadouro;
    String bairro;
    String cidade;
    String estado;

}
