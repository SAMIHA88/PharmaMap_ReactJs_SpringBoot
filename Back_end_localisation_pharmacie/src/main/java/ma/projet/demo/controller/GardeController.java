package ma.projet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.projet.demo.entities.Garde;
import ma.projet.demo.entities.Zone;
import ma.projet.demo.repositories.GardeRepository;
import ma.projet.demo.repositories.ZoneRepository;

@RestController
@RequestMapping("/api/gardes")
public class GardeController {
	@Autowired
	private GardeRepository gardeRepository;
	
	@PostMapping("/save")
	public void save(@RequestBody Garde garde) {
		gardeRepository.save(garde);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Garde v = gardeRepository.findById(Integer.parseInt(id));
		gardeRepository.delete(v);
	}
	
	@GetMapping("/all")
	public List<Garde> findAll(){
		return gardeRepository.findAll();
	}

	@GetMapping("/count")
	public long countGarde(){
		return gardeRepository.count();
	}
	
  
}
