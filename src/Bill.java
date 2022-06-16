import java.util.Scanner;

public class Bill {
	public Integer billamount;
	public Bill() {
	
}
	public Bill(Integer billamount) {
	super();
	this.billamount = billamount;
}

	public Integer getBillamount() {
		return billamount;
	}

	public void setBillamount(Integer billamount) {
		this.billamount = billamount;
	}

	@Override
	public String toString() {
		return "Bill [billamount=" + billamount + "]";
	}

	public static void main(String[] args) throws InterruptedException {
	Payment payment=new Payment();
	System.err.println("Welcome to JIOMart");
	System.out.println("                   ");
	System.err.println("Enter the Bill Amount");
	@SuppressWarnings("resource")
	Scanner input=new Scanner(System.in);
	Integer bill=input.nextInt();
	@SuppressWarnings("unused")
	Bill bill1=new Bill(bill);
	  System.out.println("Please select payment Method \n1.press 1 for DebitCard \n2. press 2 for CreditCard \n3.press 3 for UPI ID");
     int x = input.nextInt();
      switch (x)
      {
      case 1:
    	  payment.debitcard();
    	  break;
      case 2:
	payment.creditcard();
	break;
      case 3:
	payment.upiPayment();

	}

}}
