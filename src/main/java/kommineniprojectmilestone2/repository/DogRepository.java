package kommineniprojectmilestone2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kommineniprojectmilestone2.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);

}
