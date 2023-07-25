package com.vlsystem.agenda.api.mapper;

import com.vlsystem.agenda.api.request.PacienteRequest;
import com.vlsystem.agenda.api.response.PacienteResponse;
import com.vlsystem.agenda.entity.Paciente;

public class PacienteMapper {
	public static Paciente toPaciente(PacienteRequest request) {
		 Paciente paciente = new Paciente();
		 paciente.setNome(request.getNome());
		 paciente.setSobrenome(request.getSobrenome());
		 paciente.setFone(request.getFone());
		 paciente.setCpf(request.getCpf());
		 paciente.setEmail(request.getEmail());
		return paciente;
		
	}
	public static PacienteResponse toPacienteResponse(Paciente paciente) {
		 PacienteResponse response = new PacienteResponse();
		 response.setId(paciente.getId());
		 response.setNome(paciente.getNome());
		 response.setSobrenome(paciente.getSobrenome());
		 response.setFone(paciente.getFone());
		 response.setCpf(paciente.getCpf());
		 response.setEmail(paciente.getEmail());
		return response;
		
	}

}
