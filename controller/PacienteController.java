package com.vlsystem.agenda.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vlsystem.agenda.entity.Paciente;
import com.vlsystem.agenda.service.PacienteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/paciente")
@RequiredArgsConstructor
public class PacienteController {
	
	
	private final PacienteService service;
	@PostMapping
	public ResponseEntity<Paciente> salvar(@RequestBody Paciente paciente){
	Paciente pacienteSalvo = service.salvar(paciente);
	return ResponseEntity.status(HttpStatus.CREATED).body(pacienteSalvo);
	}
	@GetMapping
	public ResponseEntity<List<Paciente>>listarTodos() {
	//List<Paciente>pacientes=service.listarTodos();
	//return ResponseEntity.status(HttpStatus.OK).body(pacientes);
		return ResponseEntity.status(HttpStatus.OK).body(service.listarTodos());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Paciente>buscarPoId(@PathVariable Long id) {
		Optional<Paciente> optPaciente =service.buscarPorId(id);
		//se o paciente não existir retorna um not found
		if(optPaciente.isEmpty()) {
			return ResponseEntity.notFound().build();
			
		}
		return ResponseEntity.status(HttpStatus.OK).body(optPaciente.get());
		
	}
	@PutMapping
	public ResponseEntity<Paciente>alterar(@RequestBody Paciente paciente){
		Paciente pacienteSalvo = service.salvar(paciente);
		return ResponseEntity.status(HttpStatus.OK).body(pacienteSalvo);
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		service.deletar(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		
	}
}
