package home.app.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class AtribuicaoPrestador {

    @Id
    private Long idPrestador_Servico;

    @ManyToOne
    @JoinColumn(name = "cod_prestador")
    private Long codPrestador;

    @ManyToOne
    @JoinColumn(name = "cod_categoria")
    private Long cod_categoria;

};
