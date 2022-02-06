package com.trabalho.ric.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.ric.model.Municipio;
import com.trabalho.ric.servise.MunicipiService;

@RestController
@RequestMapping(value = "/municipio")
public class MunicipioController {
	@Autowired
	private MunicipiService service;
	@GetMapping
	public ResponseEntity<List<Municipio>> ListarMunicipiosController(){
		return ResponseEntity.ok(service.ListarMunicipio());
	}
	@PostMapping
	public ResponseEntity<Municipio> AddMunicipioController(@RequestBody Municipio municipio){
		service.AddMunicipio(municipio);
		return ResponseEntity.ok(municipio);
	}
}
