package DateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class CalculateAgeEx11 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        LocalDate birthDate = LocalDate.parse(sc.nextLine());
	        System.out.println(getAge(birthDate));
	    }

	    public static int getAge(LocalDate dt) {
	        LocalDate today = LocalDate.now();
	        int age = today.getYear() - dt.getYear();
	        if (today.getDayOfYear() < dt.getDayOfYear()) {
	            age--;
	        }
	        return age;
	    }
}
