import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class GetData extends EmployeeManagementSystem{
	Scanner keyboardInput = new Scanner(System.in);
	ArrayList employee = new ArrayList();
	
	public void adanEmployee() {
		System.out.println("Enter Employee ID: ");
		SetEmpid(keyboardInput.nextInt());
		employee.add(GetEmpid());
		
		System.out.println("Enter Employee Name: ");
		SetEmpname(keyboardInput.next());
		employee.add(GetEmpname());
		
		System.out.println("Enter Employee Age: ");
		SetEmpage(keyboardInput.nextInt());
		employee.add(GetEmpage());
		
		System.out.println("Enter Employee Salary: ");
		SetEmpsalary(keyboardInput.nextInt());
		employee.add(GetEmpsalary());
		
	}
	public void displayAll() {
		Iterator it = employee.iterator();
		
		while(it.hasNext()) {
		System.out.println(it.next()+"\t"+it.next()+"\t   "+it.next()+"\t"+it.next());
		}
	}
}
