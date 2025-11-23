package dev.hillanzinho.AluguelDeCarros.Compradores;

import dev.hillanzinho.AluguelDeCarros.Carros.CarrosModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompradoresModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private String senha;
    // Um comprador pode ter vários carros
    @OneToMany(mappedBy = "comprador")
    private List<CarrosModel> carros;

}
