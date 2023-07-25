package com.vlsystem.agenda.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vlsystem.agenda.entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente ,Long>{
	 Optional<Paciente>findByCpf(String cpf);
		
	

}
