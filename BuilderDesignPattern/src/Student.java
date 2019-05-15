
public class Student {

	private String firstName;
	private String lastName;
	private String email;
	private String Dept;
	
	private Student(StudentBuilder studentBuilder)
	{
		this.firstName = studentBuilder.firstName;
		this.lastName = studentBuilder.lastName;
		this.email = studentBuilder.email;
		this.Dept = studentBuilder.Dept;
	}
	
	public static class StudentBuilder
	{
		
		private String firstName;
		private String lastName;
		private String email;
		private String Dept;
		
		public StudentBuilder(String fname , String lname)
		{
			firstName = fname;
			lastName = lname;
		}

		public StudentBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public StudentBuilder setDept(String dept) {
			Dept = dept;
			return this;
		}
		
		public Student build()
		{
			return new Student(this);
		}
		
		
		
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", Dept=" + Dept
				+ "]";
	}
	
}
