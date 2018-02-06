
public class StudentController {
	private StudentView sView;

	private Student student;


	public StudentController(Student student, StudentView studentView) {

		this.student = student;

		this.sView = studentView;

	}


	public void printStudentDetails() {

		this.sView.printStudentDetails(this.student);

	}
}
