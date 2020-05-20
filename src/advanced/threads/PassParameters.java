package advanced.threads;

public class PassParameters {
	
	public static void main(String[] args) {
		Customer customer = new Customer("Ania");
		
		newName(customer);
		System.out.println(customer.getName());
		
		rename(customer);
		System.out.println(customer.getName());
		
		int value = 10;
		change(value);
		System.out.println(value);
	}

	private static void change(int value) {
		value = 12;
	}

	private static void rename(Customer customer) {
		customer.setName("Mariusz");
	}
	
	private static void newName(Customer customer) {
		customer = new Customer("Ala");
	}
}
