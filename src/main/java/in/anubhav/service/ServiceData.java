package in.anubhav.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.anubhav.dto.Student;
import in.anubhav.repo.StudentRepo;

@Service
public class ServiceData {

	
	@Autowired
	private StudentRepo stuRepo;
	
	public List<Student> data() {
		List<Student> all = stuRepo.findAll();
		return all;
	}

	public Student putData(Student obj) {
		
		Student save = stuRepo.save(obj);
		return save;
	}
}
