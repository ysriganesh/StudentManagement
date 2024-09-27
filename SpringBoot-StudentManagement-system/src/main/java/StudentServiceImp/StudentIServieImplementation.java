package StudentServiceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Model.Student;
import StudentService.StudentService;

@Service
public class StudentIServieImplementation implements StudentService{
	
	
	private final List<Student> students = new ArrayList<Student>();

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		
		students.add(student);
		return student;
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return students.stream().filter(s->s.getId()==id).findFirst().orElse(null);
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public void delStudent(int id) {
		// TODO Auto-generated method stub
		students.removeIf(s->s.getId()==id);
		
	}

	

}
