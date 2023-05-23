package ma.projet.demo.repositories;

import java.util.Collection;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ma.projet.demo.entities.Garde;

public interface GardeRepository extends JpaRepository<Garde, Integer> {

	Garde findById(int id);
	Garde findByType( String type);
	

	
	/*@Query(value = "select * from Garde  where nom = :nom", nativeQuery = true)*/
//	@Query(value = "select * from Pharmacie p where p.zone_id = :id", nativeQuery = true)
//	Collection<?> findPharmaciesByZone(@Param("id") int id);
	
}


