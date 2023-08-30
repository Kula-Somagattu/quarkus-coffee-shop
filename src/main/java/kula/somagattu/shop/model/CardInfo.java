package kula.somagattu.shop.model;

public class CardInfo {

    private String nameOnTheCard;
    private Number cardNumber;
    private String expDate;

    public String getNameOnTheCard() {
        return nameOnTheCard;
    }
    public void setNameOnTheCard(String nameOnTheCard) {
        this.nameOnTheCard = nameOnTheCard;
    }
    public Number getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(Number cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getExpDate() {
        return expDate;
    }
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    @Override
    public String toString() {
        return "CardInfo [nameOnTheCard=" + nameOnTheCard + ", cardNumber=" + cardNumber + ", expDate=" + expDate + "]";
    }  


}
