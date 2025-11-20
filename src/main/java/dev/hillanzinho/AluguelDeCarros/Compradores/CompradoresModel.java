package dev.hillanzinho.AluguelDeCarros.Compradores;

import dev.hillanzinho.AluguelDeCarros.Carros.CarrosModel;

import jakarta.persistence.*;

import java.util.List;

// Entity Ninja no BD
@Entity
@Table (name = "tb_cadastro")
public class CompradoresModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private String senha;
    private List<CarrosModel> missoes;

    // Construtor "No args"
    public CompradoresModel() {
    }

    // Construtor "all args"
    public CompradoresModel(String nome, String email, int idade, String senha) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.senha = senha;
    }

    // Getters e setters

    public String getNome() {return this.nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getEmail() {return this.email;}

    public void setEmail(String email) {this.email = email;}

    public int getIdade() {return this.idade;}

    public void setIdade(int idade) {this.idade = idade;}

    public String getSenha() {return this.senha;}

    public void setSenha(String senha) {this.senha = senha;}

}
