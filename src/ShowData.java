import java.util.Scanner;

public class ShowData{
	Scanner keyboardInput = new Scanner(System.in);
	static int choice;
	
	public void menu(GetData objGet) {
		
		System.out.println("MAIN MENU");
		System.out.println("=========");
		System.out.println("1. Add an Employee");
		System.out.println("2. Display All");
		System.out.println("3. Exit");
		choice = keyboardInput.nextInt();
		switch(choice) {
		case 1:
			objGet.adanEmployee();
			break;
		case 2:
			System.out.println("====Peport====");
			System.out.println("ID"+"\t"+"Name"+"\t"+"   Age"+"\t"+"Salary");
			objGet.displayAll();
			break;
		case 3:
			System.exit(0);
		}

	}
	public void menuRepeat() {
		ShowData obj = new ShowData();
		GetData objGet= new GetData();
		do {
			obj.menu(objGet);
		}while(choice!=3);
	}
	public static void main(String[] args) {
		ShowData obj = new ShowData();
		obj.menuRepeat();
	}
	
}
