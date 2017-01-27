import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the transcript application!");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		String choice="y";
		Transcript transcript=new Transcript();
		
		
		while(choice.equals("y")){
			CourseEnrollment course=new CourseEnrollment();
		    transcript.addItem(course);
			String coursecode=Validator.getString(sc, "Enter couse code: ");
		    course.setCoursecode(coursecode);
		    Double credits=Validator.getDouble(sc, "Enter credit ");
		    course.setCredits(credits);
		    String grade=Validator.getString(sc, "Enter grade ");
		    course.setGrade(grade);
		    course.setQualitypoints();
		    
		    choice = Validator.getString(sc, "Another course? (y/n): ");
		    
		
		    
//		    transcript.addItem(course);
		}

		System.out.println("------------------------------------------------------Transcript------------------------------------------------------");
		System.out.format("%-30s%-30s%-30s%-30s", "Course", "Credits", "Grade", "Quality Points");
		System.out.println();
		System.out.format("%-30s%-30s%-30s%-30s", "------", "-------", "-----", "--------------");
		System.out.println();
		
		double totalCredit=0.0;
		double totalgpa=0.0;
		for(int i=0;i<transcript.getTranscript().size();i++){
			System.out.format("%-30s%-30s%-30s%-30s",
					transcript.getTranscript().get(i).getCoursecode(),
					transcript.getTranscript().get(i).getCredits(),
					transcript.getTranscript().get(i).getGrade(),
					transcript.getTranscript().get(i).getQualitypoints());
			totalCredit=totalCredit+transcript.getTranscript().get(i).getCredits();
			totalgpa=totalgpa+transcript.getTranscript().get(i).getCredits()*
					transcript.getTranscript().get(i).getQualitypoints();
			
			System.out.println();
		}
		
		System.out.println("size= "+transcript.getTranscript().size());
		System.out.println("gpa= "+totalgpa/totalCredit);

	}
	

}
