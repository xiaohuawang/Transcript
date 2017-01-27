import java.util.Scanner;

public class Validator {

	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("invalid");
			}
			sc.nextLine();
		}
		return d;
	}
	
	public static double getDouble(Scanner sc, String prompt, double min, double max){
        double d = 0;
        boolean isValid = false;
        while(isValid == false){
            d = getDouble(sc, prompt);
            if(d < min){
                System.out.println("Error! Number must not be less than " + min + ".");
            }else if(d > max){
                System.out.println("Error! Number must not be greater than " + max + ".");
            }else{
                isValid = true;
            }
        }
        return d;
    }


}
