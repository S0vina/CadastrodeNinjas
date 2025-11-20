package dev.hillanzinho.AluguelDeCarros.Compradores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CompradoresController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Funcionou CARALEO!!!";
    }


}
