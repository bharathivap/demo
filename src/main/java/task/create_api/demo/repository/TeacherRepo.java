package task.create_api.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import task.create_api.demo.modal.TeacherDetail;

@Repository
public interface TeacherRepo extends JpaRepository<TeacherDetail, Long> {

}
