/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

public class ComputePay {
	public static void main(String[] args) {
		int totalHours = 4 + 5 + 8 + 4;
		double salary = 8.75;
		double pay = totalHours *8.75;
		
		
		System.out.println("My total hours worked:");
		System.out.println(totalHours);
		System.out.println("My hourly salary:");
		System.out.println("$" + salary);
		System.out.println("My total pay:");
		System.out.println(totalHours * 8.75);
	}
}