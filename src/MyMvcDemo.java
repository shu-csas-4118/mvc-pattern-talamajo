public class MVC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student GarettChang = new Student("Garett", "Chang", 123456,"garret.chang@shu.edu", "Software Engineering");
		Professor ProfessorGarett = new Professor("Garett", "Chang", 911, "changgar@shu.edu");
		Professor ProfessorMarlowe = new Professor("Thomas", "Marlowe", 404, "marlowetho@shu.edu");
		Professor ProfessorMinimair = new Professor("Manfred", "Minimair", 511, "minimairman@shu.edu");
		Course SoftwareEngineering = new Course("Software Engineering", 123456, 4, "ProfessorGarett");
		Course Calculus = new Course("Calculus", 234567, 4, "ProfessorMarlowe");
		Course DataMining = new Course("Data Mining", 345678, 3, "ProfessorMinimair");
		
		StudentView studentView = new StudentView();
		ProfessorView professorView = new ProfessorView();
		CourseView courseView = new CourseView();

		StudentController studentController =  new StudentController(GarettChang, studentView);
		ProfessorController professorController = new ProfessorController(ProfessorGarett, professorView);
		ProfessorController professorController1 = new ProfessorController(ProfessorMarlowe, professorView);
		ProfessorController professorController2 = new ProfessorController(ProfessorMinimair, professorView);
		CourseController courseController = new CourseController(SoftwareEngineering, courseView);
		CourseController courseController1 = new CourseController(Calculus, courseView);
		CourseController courseController2 = new CourseController(DataMining, courseView);
		
		studentController.printStudentDetails();
		professorController.printProfessorDetails();
		professorController1.printProfessorDetails();
		professorController2.printProfessorDetails();
		courseController.printCourseDetails();
		courseController1.printCourseDetails();
		courseController2.printCourseDetails();
	}

}
