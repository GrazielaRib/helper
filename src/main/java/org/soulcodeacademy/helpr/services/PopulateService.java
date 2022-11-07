package org.soulcodeacademy.helpr.services;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // indica para o Spring que esta classe sera gerenciar por ele
public class PopulateService {
    @Autowired // injetar o objetivo direto na classe
    private CargoRepository cargoRepository;

    public void populares() {
        //integer
        Cargo c1 = new Cargo(null, 'Diretor Geral', 'Gerencia a empresa', 3000.0);
        Cargo c2 = new Cargo(null, 'Diretor de Setor', 'Gerencia um setor da empresa', 18000.0)

    }
}

// o objetivo desta classe é inserir no banco, dados ficticios (de teste)
// IOC = Inversion of