package com.mongo.repo.repository;

import java.awt.print.Pageable;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.mongo.repo.documents.CaseDTO;

@RepositoryRestResource(collectionResourceRel = "Cases", path = "cases")
public interface CasesRepository extends CrudRepository<CaseDTO, Serializable> {

	@RestResource(path = "byBusinessUnit", rel = "BusinessUnitSearch")
	@Query("{businessUnit : ?0}&sort=businessUnit&dir=1")
	public List<CaseDTO> findByBusinessUnit(
			@Param("unit") String unit, Pageable pageable);

	@Override
	@RestResource(exported = false)
	void delete(CaseDTO entity);

}
