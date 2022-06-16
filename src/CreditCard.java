
public class CreditCard {
	private Integer cardNumber;
	private Integer cvv;
	private String date;
	public CreditCard(Integer cardNumber, Integer cvv, String date) {
		super();
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.date = date;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cvv=" + cvv + ", date=" + date + "]";
	}
	
}
