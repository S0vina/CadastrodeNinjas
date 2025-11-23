package dev.hillanzinho.AluguelDeCarros.Carros;

import dev.hillanzinho.AluguelDeCarros.Compradores.CompradoresModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "tb_carros")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarrosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String descricao;
    private String especificacoes;
    private boolean estado; // True para alugado e False para nao alugado
    // Um carro só pode ter um comprador
    @ManyToOne
    @JoinColumn(name = "compradoresId")
    private CompradoresModel comprador;
}