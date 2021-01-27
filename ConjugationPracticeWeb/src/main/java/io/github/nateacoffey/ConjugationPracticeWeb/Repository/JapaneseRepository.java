package io.github.nateacoffey.ConjugationPracticeWeb.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface JapaneseRepository extends CrudRepository<Japanese, String> {
	
	@Query(value = "SELECT ending FROM languages.japanese", nativeQuery = true)
    List<String> getAllEndings();
	
	@Query(value = "SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = 'japanese'", nativeQuery = true)
    List<String> getAllColumns();
	
	
}
