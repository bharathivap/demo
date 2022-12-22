package task.create_api.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import task.create_api.demo.modal.School;

@Repository
public interface SchoolRepository extends JpaRepository<School,Integer> {
}
