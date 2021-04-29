package com.algaworks.osworks.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.osworks.domain.model.Modulo;

@Repository
public interface ModuloRepository extends JpaRepository<Modulo, Long> {

	List<Modulo> findByNome(String nome);

	List<Modulo> findByNomeContaining(String nome);

}
