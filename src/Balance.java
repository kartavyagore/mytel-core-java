public class Balance {
    /*
        Enter Mobile number: 8765432567
        Balance:
        SMS : 30
        Talktime : unlimited
        Data : 1.GB
        Enter option 9 to go back to main options
        Enter 0 to exit
    */

    long mobileNum;

    public void setMobileNum(long mobileNumber) {
        this.mobileNum = mobileNumber;
    }

    public void getBalance(){
        System.out.println();
        System.out.println("Balance : \nSMS : 30\nTalktime : unlimited\nData : 1 GB\n");
        System.out.println();
    }
}
