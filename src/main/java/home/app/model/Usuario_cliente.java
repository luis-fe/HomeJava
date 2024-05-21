package home.app.model;


import lombok.Data;
import lombok.Generated;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
public class Usuario_cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_cliente;


    String nomeUsuario;
    String cpf;
    String email;
    String rua_logadouro;
    String bairro;
    String cidade;
    String estado;

};
