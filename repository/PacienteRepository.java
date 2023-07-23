package com.vlsystem.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vlsystem.agenda.entity.Paciente;
@Repository
public interface PacienteRepository extends JpaRepository<Paciente ,Long>{

}
