package StudentService;

import java.util.List;

import Model.Student;

public interface StudentService {
	
	Student addStudent(Student student);
	Student getStudent(int id);
	List<Student> getStudents();
	void delStudent(int id);

}
