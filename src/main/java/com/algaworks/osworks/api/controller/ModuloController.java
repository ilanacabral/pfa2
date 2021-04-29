package com.algaworks.osworks.api.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Modulo;
import com.algaworks.osworks.domain.repository.ModuloRepository;

@RestController
@RequestMapping(value = "/modulos", produces = MediaType.APPLICATION_JSON_VALUE)
public class ModuloController {

	@Autowired
	private ModuloRepository moduloRepository;

	@GetMapping
	public List<Modulo> listar() {
		return moduloRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Modulo> listarById(@PathVariable Long id) {
		Optional<Modulo> Modulos = moduloRepository.findById(id);
		if (Modulos.isPresent()) {
			return ResponseEntity.ok(Modulos.get());
		}

		return ResponseEntity.notFound().build();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Modulo adicionarModulo(@Valid @RequestBody Modulo Modulo) {
		return moduloRepository.save(Modulo);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Modulo> atualizarModulo(@PathVariable Long id, @Valid @RequestBody Modulo Modulo) {
		if (!moduloRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}

		Modulo.setId(id);
		Modulo = moduloRepository.save(Modulo);

		return ResponseEntity.ok(Modulo);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> apagarModulo(@PathVariable Long id) {
		if (!moduloRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}

		moduloRepository.deleteById(id);

		return ResponseEntity.noContent().build();
	}
}
