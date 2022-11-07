package org.soulcodeacademy.helpr.controllers;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

public class CargoController {

    private org.soulcodeacademy.helpr.controllers.CargoController cargoService;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController //Retorno de dados
    public class CargoController {

        private CargoService cargoServic;

        //Enpoint é o endereço que será acessado no backend
        @GetMapping("/oi")//com case de localhost:8080/oi retorna a String
        public String dizOla() {
            return "Batata!"; // resposta da requisicao
        }

        @GetMapping("/batata")
        public Integer valor()

        @GetMapping("/batata")
        public Integer valor() {
            return 1000; // resposta da requisição
        }

        @Autowired
        private CargoService cargoService;
    }

    @GetMapping("/cargos")
    public List<cargo> listar() {
        // Requisição -> 
        return this.cargoService.listar(); // JSON = JAVASCRIPT OBJECT NOTATION
    }
    @GetMapping("/cargos/{idCargo}") // indica que o valor apos a barra é dinamico!
    public Cargo getCargo(@PathVariable Integer idCargo) {
        // @PathVariable => extrai do endpoint o valor dinamico
        return this.cargoService.getCargo(idCargo)
    }

    // Podemos usar o mesmo endpoint para verbos diferentes
    @PostMapping("/cargos") // REQUISIÇÃO TIPO POST para /cargos
    public String salvar() {
        return "Batata!";
    }
}
