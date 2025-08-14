package in.anubhav.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.anubhav.dto.Student;


public interface StudentRepo extends JpaRepository<Student, Integer> {

}
