import java.util.Scanner;

public class Mobile_Recharge {
    Scanner sc = new Scanner(System.in);
    long prepaidNumber, debitCardNumber;
    String expiryDate;
    int cvv;

    public void setCvv(int cvv){
        this.cvv=cvv;
    }

    public void setDate(String date){
        this.expiryDate = date;
    }

    public void setDebitCardNumber(long number){
        this.debitCardNumber = number;
    }

    public void setMobileNumber(long number){
        this.prepaidNumber = number;
    }

    public int getPack(){
        int ch;
        do{
            System.out.println("1. package 1 : Amount $200\n" + "Validity 30 days\n" + "Data 3GB/day");
            System.out.println("2. package 2 : Amount $300\n" + "Validity 30 days\n" + "Data 6GB/day");
            System.out.print("Enter appropriate choice ");
            ch = sc.nextInt();
        }while(ch != 1 && ch != 2);

        return ch;
    }

}
