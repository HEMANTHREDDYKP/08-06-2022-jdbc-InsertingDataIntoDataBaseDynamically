package hi;

import java.util.Scanner;

public class helper {

	public static void main(String[] args) {

		
		Employee employee=new Employee();

		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the id");
		int id=scanner.nextInt();
		System.out.println("enter the name");
		String name=scanner.next();
		
		employee.setId(id);
		employee.setName(name);
		
		
		Employees employees=new Employees();
		employees.addDynamically(employee);
		
	}

}
