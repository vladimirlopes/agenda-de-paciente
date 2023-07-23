package com.vlsystem.agenda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.vlsystem.agenda.entity.Paciente;
import com.vlsystem.agenda.repository.PacienteRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional // se houver algum erro desfaz a tranzação com o banco
@RequiredArgsConstructor
public class PacienteService {

	private PacienteRepository pr;
	
	public Paciente salvar(Paciente paciente) {
		//TODO:para validar seo cpf não exite
		return pr.save(paciente);

	}

	public List<Paciente>  listarTodos() {
		return pr.findAll();

	}

	public Optional<Paciente> buscarPorId(long id) {
		return pr.findById(id);

	}

	public void deletar(long id) {
		pr.deleteById(id);

	}
}
