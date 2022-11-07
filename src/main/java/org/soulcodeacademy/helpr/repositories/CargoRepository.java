package org.soulcodeacademy.helpr.repositories;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // Indicar que a interface é um repository
public interface CargoRepository extends CrudRepository<Cargo, Integer> {

    }

    // Repository = é um recurso que permite manipular a entidade no banco de dados
    // Adicionar entidade, atualizar entidades, remover entidades e listar (CRUD)
    // Indicar qualaentidade vai ser gerenciada pelo repository e qual o tipo da PK
    // Obs: O Spring gera uma classe dinamica com base
