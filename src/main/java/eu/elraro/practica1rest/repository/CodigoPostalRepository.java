package eu.elraro.practica1rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.elraro.practica1rest.model.CodigoPostal;

public interface CodigoPostalRepository extends JpaRepository<CodigoPostal, Long> {
	CodigoPostal findByCodigoPostal(long codigoPostal);
}
