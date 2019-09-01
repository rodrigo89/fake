/**
 * 
 */
package br.com.fake.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fake.model.Medico;
import br.com.fake.repository.MedicoRepository;

/**
 * @author carlosbarbosagomesfilho
 * Aug 30, 2019
 * 
 */
@Service
public class MedicoService {

	@Autowired
	private MedicoRepository repository;
	
	@Transactional(readOnly=true)
	public List<Medico> lista(){
		return this.repository.findAll();
	}
	
	@Transactional
	public void salva(Medico medico) {
		this.repository.save(medico);
	}
	
}
