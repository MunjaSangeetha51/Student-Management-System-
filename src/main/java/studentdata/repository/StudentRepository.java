package studentdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studentdata.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}