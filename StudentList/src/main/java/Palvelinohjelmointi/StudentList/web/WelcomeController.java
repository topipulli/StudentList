package Palvelinohjelmointi.StudentList.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Palvelinohjelmointi.StudentList.domain.Student;

@Controller
public class WelcomeController {


	@GetMapping("students")
	public String showStudents(Model model) {

	ArrayList<Student> students = new ArrayList<>();


	students.add(new Student("Sakke", "Kuisma"));
	students.add(new Student("Tammen", "Terho"));
	students.add(new Student("Heikki", "McMetal"));
	
	model.addAttribute("studentsList", students);
	
	return "Welcome";
}
}
