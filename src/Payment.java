
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import java.util.Random;
import java.util.Scanner;


public class Payment {
public void debitcard() throws InterruptedException {
	
	System.err.println("enter card number");
	@SuppressWarnings("resource")
	Scanner input=new Scanner(System.in);
	Integer cardNumber=input.nextInt();
System.err.println("enter cvv number");
	Integer cvvNumber=input.nextInt();
System.err.println("enter Card-EndDate");
	String Date=input.next();
System.out.println("                ");
	System.err.println("TRANSACTION LOADING :::::::");
	Thread.sleep(3000);
	System.out.println("                ");
	System.err.println("verifying OTP :::::::");
	Thread.sleep(5000);
	System.out.println("                ");
	System.err.println("::::::::Transaction Successfull::::::::");
	System.out.println("\n");
	System.err.println("printing Bill::::::::");
	Thread.sleep(3000);
	System.out.println("                ");
	DebitCard debitcard=new DebitCard(cardNumber,cvvNumber,Date);
Bill bl=new Bill(2000);
Random random = new Random();
int num = random.nextInt(100000);
String formatted = String.format("%05d", num);
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
LocalDateTime now = LocalDateTime.now();

	System.err.println(":::::::Transaction Details:::: "+"\n");
	System.out.println("TransactionDate= "+dtf.format(now)+"\n"+"TransactionID="+formatted+"\n"+"cardNumber= "+debitcard.getCardNumber()+"\n"+" Bill Ammount = "+bl.getBillamount()+"\n");
System.err.println("THANK YOU WELCOME");
}
public void creditcard() throws InterruptedException {
	System.err.println("enter card number");
	@SuppressWarnings("resource")
	Scanner input=new Scanner(System.in);
	Integer cardNumber=input.nextInt();
System.err.println("enter cvv number");
	Integer cvvNumber=input.nextInt();
System.err.println("enter Card-EndDate");
	String Date=input.next();
System.out.println("                ");
	System.err.println("TRANSACTION LOADING :::::::");
	Thread.sleep(3000);
	System.out.println("                ");
	System.err.println("verifying OTP :::::::");
	Thread.sleep(5000);
	System.out.println("                ");
	System.err.println("::::::::Transaction Successfull::::::::");
	System.out.println("                ");
	System.err.println("printing Bill::::::::");
	Thread.sleep(3000);
	CreditCard creditcard=new CreditCard(cardNumber,cvvNumber,Date);
Bill bl=new Bill(3000);
Random random = new Random();
int num = random.nextInt(100000);
String formatted = String.format("%05d", num);
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
LocalDateTime now = LocalDateTime.now();
	System.err.println("::::::Transaction Details:::: "+"\n");
	System.out.println("TransactionDate= "+dtf.format(now)+"\n"+"TransactionID="+formatted+"\n"+"cardNumber= "+creditcard.getCardNumber()+"\n"+" Bill Ammount = "+bl.getBillamount()+"\n");
	System.err.println("THANK YOU WELCOME");
}
public void upiPayment() throws InterruptedException {
	System.err.println("Enter upiID ");
	@SuppressWarnings("resource")
	Scanner obj=new Scanner(System.in);
	String upid=obj.next();

	UpiPayment upi=new UpiPayment(upid);
	Bill bl=new Bill(4000);
	Random random = new Random();
	int num = random.nextInt(100000);
	String formatted = String.format("%05d", num);
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	LocalDateTime now = LocalDateTime.now();
	System.out.println("                ");
	System.err.println("TRANSACTION LOADING :::::::");
	Thread.sleep(3000);
	System.out.println("                ");
	System.err.println("verifying OTP :::::::");
	Thread.sleep(3000);
	System.out.println("                ");
	System.err.println("::::::::Transaction Successfull::::::::");
	System.out.println("                ");
	System.err.println("printing Bill::::::::");
	Thread.sleep(3000);
	System.out.println("                ");
	System.err.println(":::::::Transaction Details::::"+"\n");
	System.out.println("TransactionDate= "+dtf.format(now)+"\n"+"TransactionID="+formatted+"\n"+"UpiID="+upi.getUpiID()+"\n"+"BillAmount="+bl.getBillamount()+"\n");
	System.err.println("THANK YOU WELCOME");
}
}
