package home.app.model;

import lombok.Data;

import javax.persistence.*;

@Data
public class Ordem_Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_Ordem;

    @ManyToOne
    @JoinColumn(name = "cod_prestador")
    private Long idPrestador_Servico;

    @ManyToOne
    @JoinColumn(name = "cod_cliente")
    private Long cod_cliente;

    private Integer status_servico;



}
