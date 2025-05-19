import java.util.Scanner;

public class Convert {
    Scanner sc = new Scanner(System.in);
    long mobileNumber;

    public void setMobileNumber(long number){
        this.mobileNumber = number;
    }

    public int convertSim(){
        int cho;
        do{
            System.out.println("1. convert prepaid sim -> postpaid sim.");
            System.out.println("2. convert postpaid sim -> prepaid sim.");
            System.out.println("3. Cancel request.");
            System.out.print("Enter your choice : ");
            cho = sc.nextInt();
            System.out.println();
        }while(cho != 1 && cho != 2 && cho != 3);

        return cho;
    }
}
