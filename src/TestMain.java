
public class TestMain {

	public static void main(String[] args) {
		
		// Test Author class
	      Author2 a1 = new Author2("Tan Ah Teck", "ahteck@nowhere.com");
	      System.out.println(a1);

	      a1.setEmail("ahteck@somewhere.com");
	      System.out.println(a1);
	      System.out.println("name is: " + a1.getName());
	      System.out.println("email is: " + a1.getEmail());

	      // Test Book class
	      Book3 b1 = new Book3("12345", "Java for dummies", a1, 8.8, 88);
	      System.out.println(b1);

	      b1.setPrice(9.9);
	      b1.setQty(99);
	      System.out.println(b1);
	      System.out.println("isbn is: " + b1.getIsbn());
	      System.out.println("name is: " + b1.getName());
	      System.out.println("price is: " + b1.getPrice());
	      System.out.println("qty is: " + b1.getQty());
	      System.out.println("author is: " + b1.getAuthor());  // Author's toString()
	      System.out.println("author's name: " + b1.getAuthorName());
	      System.out.println("author's name: " + b1.getAuthor().getName());
	      System.out.println("author's email: " + b1.getAuthor().getEmail());

	      // Test Customer class
	      Customer c1 = new Customer(88, "Tan Ah Teck", 10);
	      System.out.println(c1);  // Customer's toString()

	      c1.setDiscount(8);
	      System.out.println(c1);
	      System.out.println("id is: " + c1.getId());
	      System.out.println("name is: " + c1.getName());
	      System.out.println("discount is: " + c1.getDiscount());

	      // Test Invoice class
	      Invoice inv1 = new Invoice(101, c1, 888.8);
	      System.out.println(inv1);

	      inv1.setAmount(999.9);
	      System.out.println(inv1);
	      System.out.println("id is: " + inv1.getId());
	      System.out.println("customer is: " + inv1.getCustomer());  // Customer's toString()
	      System.out.println("amount is: " + inv1.getAmount());
	      System.out.println("customer's id is: " + inv1.getCustomerId());
	      System.out.println("customer's name is: " + inv1.getCustomerName());
	      System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
	      System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
	      
	      // Test Customer & Account class
	      
	      Customer2 customer1 = new Customer2(101, "Alice", 'f');
	        System.out.println(customer1);

	        Account account1 = new Account(1001, customer1, 500.0);
	        System.out.println(account1);

	        Account account2 = new Account(1002, customer1);
	        System.out.println(account2);

	        System.out.println(customer1.getId());
	        System.out.println(customer1.getName());
	        System.out.println(customer1.getGender());

	        System.out.println("ID du compte: " + account1.getId());
	        System.out.println("Nom du titulaire: " + account1.getCustomerName());
	        System.out.println("Solde actuel: $" + account1.getBalance());

	        account1.deposit(200.0);
	        System.out.println("Après dépôt de $200: " + account1);

	        account1.withdraw(100.0);
	        System.out.println("Après retrait de $100: " + account1);

	        account1.withdraw(700.0);
	        System.out.println("Après tentative de retrait de $700: " + account1);
	}

}
