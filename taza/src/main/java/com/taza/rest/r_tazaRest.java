package com.taza.rest;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import com.taza.dao.r_tazaDAO;
import com.taza.model.r_taza;
@RestController
@RequestMapping("v1/taza")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class r_tazaRest {

	@Autowired
	private r_tazaDAO tazaDAO;
	//Metodos http 
	@PostMapping("/guardar")
	public void guardar(@RequestBody r_taza taza) {
		tazaDAO.save(taza);
	}
	@GetMapping("/lista")
	public List<r_taza> listar(){
		return tazaDAO.findAll();
	}
	
	@GetMapping("/lista/{id}")
	public Optional<r_taza> listar2(@PathVariable("id") Integer id){
		return tazaDAO.findById(id);
	}
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		 tazaDAO.deleteById(id);
	}
	
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody r_taza taza ) {
		 tazaDAO.save(taza);
	}
	
	
	
}
