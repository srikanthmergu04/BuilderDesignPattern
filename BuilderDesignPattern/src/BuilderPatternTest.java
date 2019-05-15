
public class BuilderPatternTest {

	public static void main(String args[])
	{
		Student s1 = new Student.StudentBuilder("Vinayak", "Deshpande").build();
		
		System.out.println(s1);
	}
	
}
