public class BillPay {

    /*
        Enter Post paid number: 8765432567
        Bill due amount is 600 INR
        Enter payment details:
        Enter debit card/credit card number:898765432
        Enter Expiry date:12/04/2024
        Enter CVV number:123
        Congratulations..your bill amount is paid successful..
        Enter option 9 to go back to main options
        Enter 0 to exit
     */

    long postPaidNumber,debitCardNumber;
    String expiryDate;
    int cvv;
    float dueAmount = 600;

    public void setCvv(int cvv){
        this.cvv=cvv;
    }

    public void setExpiryDate(String date){
        this.expiryDate = date;
    }

    public void setDebitCardNumber(long number){
        this.debitCardNumber = number;
    }

    public void setMobileNumber(long number){
        this.postPaidNumber = number;
    }

    public void getDueAmount(){
        System.out.println("Your due amount is : "+dueAmount);
    }
}
