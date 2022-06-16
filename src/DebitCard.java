
public class DebitCard {
private Integer cardNumber;
private Integer cvv;
private String endDate;
public DebitCard(Integer cardNumber, Integer cvv, String endDate) {
	super();
	this.cardNumber = cardNumber;
	this.cvv = cvv;
	this.endDate = endDate;
}
public Integer getCardNumber() {
	return cardNumber;
}
public void setCardNumber(Integer cardNumber) {
	this.cardNumber = cardNumber;
}
public Integer getCvv() {
	return cvv;
}
public void setCvv(Integer cvv) {
	this.cvv = cvv;
}
public String getenddate() {
	return endDate;
}
public void setenddate(String endDate) {
	this.endDate = endDate;
}
@Override
public String toString() {
	return "DebitCard [cardNumber=" + cardNumber + ", cvv=" + cvv + ", endDate=" + endDate + "]";
}

}
