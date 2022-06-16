
public class UpiPayment {
private String upiID;



public UpiPayment(String upiID) {
	
	this.upiID = upiID;
}

public String getUpiID() {
	return upiID;
}

public void setUpiID(String upiID) {
	this.upiID = upiID;
}

@Override
public String toString() {
	return "UpiPayment [upiID=" + upiID + "]";
}



}
