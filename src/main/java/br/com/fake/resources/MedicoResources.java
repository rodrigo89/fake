package br.com.fake.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fake.model.Medico;
import br.com.fake.service.MedicoService;

@RestController
@RequestMapping("/api")
public class MedicoResources {
	@Autowired
	private MedicoService service;
	
	@PostMapping("/medicos")
	public void add() {
		
	}
	
	@DeleteMapping("/medicos/{id}")
	public void remove() {
		
	}
	
	@PutMapping("/medicos")
	public void edit() {
		
	}
	
	@GetMapping("/medicos")
	public ResponseEntity<List<Medico>> list(){
		List<Medico> medicos = this.service.lista();
		return !medicos.isEmpty() ? ResponseEntity.ok(medicos) : ResponseEntity.noContent().build();
	}
	
	@GetMapping("/medico/{id}")
	public Medico get(Long id){
		return null;
	}
	
	

}
