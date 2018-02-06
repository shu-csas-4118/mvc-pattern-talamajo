
public class StudentView {
	private Student student;


	public StudentView (Student student) {

		this.student = student;

	}


	public StudentView() {


	}


	public void printStudentDetails(Student student) {

		this.student = student;

		printStudentDetails();

	}


	public void setStudentDetails (Student student) {

	}


	public void printStudentDetails() {

	if (this.student == null) throw new IllegalArgumentException("student");


	if (this.student != null) {

		System.out.println("Student’s first name is " + this.student.getFirstName());

		System.out.println("Student’s last name is " + this.student.getLastName());

		System.out.println("Student’s id number is "+ this.student.getIdNumber());
		
		System.out.println("Student’s Email is "+ this.student.getEmail());
		
		System.out.println("Student’s Courses is "+ this.student.getCourses());
	
		}

	}





}
