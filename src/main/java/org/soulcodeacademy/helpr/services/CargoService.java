package org.soulcodeacademy.helpr.services;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.uti

@Service
public class CargoService {
    @Autowired
    private CargoRepository cargoRepository

    // Lister todos
    public List<Cargo> listar() {
        // Retorna os dados da tabela em forma de lista
        return this.cargoRepository.findAll();

    }
    // Listar um pelo ID
    // Salvar
    // Atualizar
    // Deletar
}
