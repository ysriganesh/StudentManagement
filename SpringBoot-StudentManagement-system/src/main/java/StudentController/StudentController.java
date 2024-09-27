package StudentController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Model.Student;
import StudentService.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
    
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id) {
        return studentService.getStudent(id);
    }
    
    @GetMapping("/all")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
    
    @DeleteMapping("/delete/{id}")
    public void delStudent(@PathVariable int id) {
        studentService.delStudent(id);
    }
}
