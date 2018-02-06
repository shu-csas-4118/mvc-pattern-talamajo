public class Student {
	private String firstName;
	
	private String lastName;

	private int idNumber;
	
	private String Email;
	
	private String Courses;


	public Student (String firstName, String lastName, int idNumber, String Email, String Courses) {

		this.firstName = firstName;
		
		this.lastName = lastName;

		this.idNumber = idNumber;
		
		this.Email = Email;
		
		this.Courses = Courses;

	}


	public String getFirstName() {

		return this.firstName;

	}


	public void setFirstName (String firstName) {

		this.firstName = firstName;

	}


	public String getLastName() {

		return this.lastName;

	}


	public void setLastName (String lastName) {

		this.lastName = lastName;

	}

	
	public String getEmail() {

		return this.Email;
		
	}
	
	public void setEmail (String Email) {
		
		this.Email = Email;
		
	}

	public int getIdNumber() {

		return this.idNumber;

	}


	public void setIdNumber (int idNumber) {

		this.idNumber = idNumber;

	}
	
	public String getCourses() {

		return this.Courses;
		
	}
	
	public void setCourses (String Courses) {
		
		this.Courses = Courses;

}
}
