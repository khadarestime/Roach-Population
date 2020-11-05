
public class RoachTester {

	public static void main(String[] args) {
		
		RoachPopulation bugs = new RoachPopulation(10);
		System.out.println("The Initial Roach population is " + bugs.getRoaches());
		
		bugs.breed();
		System.out.println("The Roach population after cycle 1 breeding is "+bugs.getRoaches());

		bugs.spray(.60);
		System.out.println("The roach population after cycle 1 60% spraying is "+bugs.getRoaches());
		
		bugs.breed();
		System.out.println("The Roach population after cycle 2 breeding is "+bugs.getRoaches());
		
		bugs.spray(.70);
		System.out.println("The Roach population after cycle 2 70% spraying is "+bugs.getRoaches());
		
		bugs.breed();
		System.out.println("The Roach population after cycle 3 breeding is "+bugs.getRoaches());
		
		bugs.spray(.80);
		System.out.println("The Roach population after cycle 3 80% spraying is "+bugs.getRoaches());
		
		bugs.breed();
		System.out.println("The Roach population after cycle 4 breeding is "+bugs.getRoaches());
		
		bugs.spray(.90);
		System.out.println("The Roach population after cycle 4 90% spraying is "+bugs.getRoaches());

	}
		
		
	
}


