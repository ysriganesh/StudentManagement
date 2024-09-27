import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import Model.Student;
import StudentService.StudentService;
import StudentServiceImp.StudentIServieImplementation;

class StudentServiceTest {
	
	@InjectMocks
	
	private StudentIServieImplementation servieImplementation;
	
	@Mock
	private StudentService service;
	
	@BeforeEach
	
	public void setUp()
	{
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void testAddStudents()
	{
		Student s1 = new Student();
		s1.setId(1043);
		s1.setName("Ganesh");
		s1.setEmail("Gan@gamil.com");
		
		when(service.addStudent(s1)).thenReturn(s1);
		
		Student addedStudent = servieImplementation.addStudent(s1);
		
		ArgumentCaptor<Student> captor = ArgumentCaptor.forClass(Student.class);
		verify(service).addStudent(captor.capture());
		
		assertNotNull(addedStudent);
		assertEquals(1043, captor.getValue().getId());
		assertEquals(1043, addedStudent.getId());
		assertEquals("Ganesh", addedStudent.getName());
		assertEquals("Ganesh", captor.getValue().getName());
		
		
	}
	
	@Test
	public void testGetElement()
	{
		Student s1 = new Student();
		s1.setId(1043);
		s1.setName("Ganesh");
		s1.setEmail("Gan@gamil.com");
		
		when(service.getStudent(1043)).thenReturn(s1);
		
		Student foundStudent = servieImplementation.getStudent(1043);
		
		assertEquals(1043, foundStudent.getId());
		assertEquals("Ganesh", foundStudent.getName());
		
	}

}
