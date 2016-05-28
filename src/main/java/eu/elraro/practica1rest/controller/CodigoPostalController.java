package eu.elraro.practica1rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eu.elraro.practica1rest.model.CodigoPostal;
import eu.elraro.practica1rest.repository.CodigoPostalRepository;

@RestController
public class CodigoPostalController {

	@Autowired
	private CodigoPostalRepository repository;

	@RequestMapping(value = "/postal", method = RequestMethod.GET)
	public ResponseEntity<List<CodigoPostal>> getAllCodigoPostal() {
		return new ResponseEntity<List<CodigoPostal>>(repository.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value = "/postal/{codigoPostal}", method = RequestMethod.GET)
	public ResponseEntity<CodigoPostal> getCodigoPostal(@PathVariable(value = "codigoPostal") long codigoPostal) {
		CodigoPostal postalDb = repository.findByCodigoPostal(codigoPostal);
		if (postalDb == null) {
			return new ResponseEntity<CodigoPostal>(postalDb, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<CodigoPostal>(postalDb, HttpStatus.OK);
	}

	@RequestMapping(value = "/postal", method = RequestMethod.POST)
	public ResponseEntity<CodigoPostal> addCodigoPostal(@RequestBody CodigoPostal codigoPostal) {
		if (repository.findOne(codigoPostal.getCodigoPostal()) != null) {
			return new ResponseEntity<CodigoPostal>(HttpStatus.UNPROCESSABLE_ENTITY);
		}
		repository.save(codigoPostal);
		return new ResponseEntity<CodigoPostal>(codigoPostal, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/postal/{codigoPostal}", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> modifyCodigoPostal(@PathVariable(value = "codigoPostal") long codigoPostal, @RequestBody CodigoPostal postal) {
		CodigoPostal postalDb = repository.findOne(codigoPostal);
		if (postalDb == null) {
			return new ResponseEntity<Boolean>(HttpStatus.NOT_FOUND);
		}
		repository.save(postal);
		return new ResponseEntity<Boolean>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/postal/{codigoPostal}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteCodigoPostal(@PathVariable(value = "codigoPostal") long codigoPostal) {
		CodigoPostal postalDb = repository.findOne(codigoPostal);
		if (postalDb == null) {
			return new ResponseEntity<Boolean>(HttpStatus.NOT_FOUND);
		}
		repository.delete(postalDb);
		return new ResponseEntity<Boolean>(HttpStatus.OK);
	}
}

