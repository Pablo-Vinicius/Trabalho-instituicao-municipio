package com.trabalho.ric.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabalho.ric.model.Municipio;
import com.trabalho.ric.repository.MunicipioRepository;

@Service
public class MunicipiService {
	@Autowired
	private MunicipioRepository repository;
	
	public List<Municipio> ListarMunicipio(){
		List<Municipio> municipios = repository.findAll();
		return municipios;
	}
	
	public void AddMunicipio(Municipio municipio) {
		repository.save(municipio);
	}
}
