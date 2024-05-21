package home.app.model;


import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Categoria_Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_categoria;

    String nomeServico;


}
