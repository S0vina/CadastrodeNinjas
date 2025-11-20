package dev.hillanzinho.AluguelDeCarros.Carros;

import dev.hillanzinho.AluguelDeCarros.Compradores.CompradoresModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_carros")
public class CarrosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String descricao;
    private String especificacoes;
    private boolean estado; // True para alugado e False para nao alugado
    private CompradoresModel comprador;

    // Construtor no args
    public CarrosModel() {
    }

    public CarrosModel(String descricao, String modelo, String especificacoes) {
        this.modelo = modelo;
        this.descricao = descricao;
        this.especificacoes = especificacoes;
    }

    public String getDescricao() {return this.descricao;}

    public void setDescricao(String descricao){this.descricao = descricao;}

    public String getDificuldade() {return modelo;}

    public void setDificuldade(String modelo) {this.modelo = modelo;}

    public String getEspecificacoes() {return this.especificacoes;}

    public void setEspecificacoes(String especificacoes) {this.especificacoes = especificacoes;}
}
