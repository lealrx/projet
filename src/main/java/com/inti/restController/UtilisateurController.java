package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Utilisateur;

@CrossOrigin
@RestController
public class UtilisateurController {
	
	@Autowired
	IUtilisateurService utilisateurService;
	
	@RequestMapping(value="utilisateurs", method=RequestMethod.GET)
	public List<Utilisateur> findAll() {
		return utilisateurService.findAll();
	}
	
	
	@RequestMapping(value="utilisateurs/{idUtilisateur}", method=RequestMethod.GET)
	public Utilisateur findOne(@PathVariable("idUtilisateur")Long id) {
		return utilisateurService.findOne(id);
	}
	
	@RequestMapping(value="utilisateurs", method=RequestMethod.POST)
    public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur) {
    	return utilisateurService.save(utilisateur);
	}
    
	@RequestMapping(value="utilisateurs/{idUtilisateur}", method=RequestMethod.DELETE)
    public void deleteUtilisateur(@PathVariable("idUtilisateur")Long id) {
		utilisateurService.delete(id);
	}
	
	@RequestMapping(value="utilisateurs/{idUtilisateur}", method=RequestMethod.PUT)
	public Utilisateur updateUtilisateur(@PathVariable("idUtilisateur")Long id,@RequestBody Utilisateur utilisateur) {
		Utilisateur currentUtilisateur= utilisateurService.findOne(id);
		currentUtilisateur.setNomUtilisateur(utilisateur.getNomUtilisateur());
		currentUtilisateur.setPrenomUtilisateur(utilisateur.getPrenomUtilisateur());
		currentUtilisateur.setUsername(utilisateur.getUsername());
		currentUtilisateur.setPassword(utilisateur.getPassword());
		currentUtilisateur.setEmail(utilisateur.getEmail());
		currentUtilisateur.setDateNaissance(utilisateur.getDateNaissance());
		currentUtilisateur.setImg(utilisateur.getImg());
		currentUtilisateur.setRoles(utilisateur.getRoles());
		currentUtilisateur.setClients(utilisateur.getClients());
		currentUtilisateur.setTaches(utilisateur.getTaches());
		
		return utilisateurService.save(currentUtilisateur);
	}

}
