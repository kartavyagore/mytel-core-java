import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        /*
            Welcome to Mytel:
            Enter option 1 for mobile recharge
            Enter option 2 for pay bills
            Enter option 3 to convert prepaid to postpaid / postpaid to prepaid
            Enter option 4 to know the balance
            Enter option 5 for profile details
            Enter 0 to exit
          */
        do{
            System.out.println("---------- Welcome to Mytel ----------");
            System.out.println(" Enter option 1 for mobile recharge ");
            System.out.println(" Enter option 2 for pay bills ");
            System.out.println(" Enter option 3 to convert prepaid to postpaid / postpaid to prepaid ");
            System.out.println(" Enter option 4 to know the balance ");
            System.out.println(" Enter option 5 to profile details ");
            System.out.println(" Enter option 0 to exit ");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 : {
                    Mobile_Recharge m1 = new Mobile_Recharge();
                    long num,debitCardNumber;
                    String expiryDate;
                    int cvv;

                    System.out.print("Enter mobile number : ");
                    num = sc.nextLong();
                    m1.setMobileNumber(num);

                    System.out.print("Enter your debit Card Number : ");
                    debitCardNumber = sc.nextLong();
                    m1.setDebitCardNumber(debitCardNumber);

                    System.out.print("Enter expiry date of card: ");
                    expiryDate = sc.next();
                    m1.setDate(expiryDate);

                    System.out.print("Enter cvv of card: ");
                    cvv = sc.nextInt();
                    m1.setCvv(cvv);

                    int userChoice = m1.getPack();

                    if(userChoice == 1){
                        System.out.println("Congrats, You have successfully recharged your mobile.");
                        System.out.println("Package selected : package 1 : Amount $200, Validity 30 days, Data 3GB/day");
                        System.out.println("---------- ************* ----------");
                    } else if (userChoice == 2) {
                        System.out.println("Congrats, You have successfully recharged your mobile.");
                        System.out.println("Package selected : package 2 : Amount $300, Validity 30 days, Data 6GB/day");
                        System.out.println("--------- ************* ---------");

                    }else{
                        System.out.println("Wrong choice entered.");
                        System.out.println("--------- ************* ---------");

                    }
                    break;
                }
                case 2 : {
                    BillPay b1 = new BillPay();
                    long postCardNumber,debitCardNumber;
                    String expiryDate;
                    int cvv;

                    System.out.print("Enter mobile number : ");
                    postCardNumber = sc.nextLong();
                    b1.setMobileNumber(postCardNumber);

                    b1.getDueAmount();

                    System.out.println("Enter 1 to continue to payment process : ");
                    int ch3 = sc.nextInt();

                    if(ch3 == 1){
                        System.out.print("Enter your debit Card Number : ");
                        debitCardNumber = sc.nextLong();
                        b1.setDebitCardNumber(debitCardNumber);

                        System.out.print("Enter expiry date of card: ");
                        expiryDate = sc.next();
                        b1.setExpiryDate(expiryDate);

                        System.out.print("Enter cvv of card: ");
                        cvv = sc.nextInt();
                        b1.setCvv(cvv);

                        System.out.println("You have successfully paid your due amount.");
                        System.out.println("--------- ************* ---------");
                    }else{
                        System.out.println("Payment process is cancelled.");
                        System.out.println("--------- ************* ---------");
                    }
                    break;
                }
                case 3 : {
                    Convert c1 = new Convert();
                    long mobileNumber;

                    System.out.println("Enter mobile number : ");
                    mobileNumber = sc.nextLong();
                    c1.setMobileNumber(mobileNumber);

                    int userChoice = c1.convertSim();

                    if(userChoice == 1){
                        System.out.println("Congrats!!your prepaid to postpaid sim conversion request is received. You new SIM will be delivered within 2 days to your address");
                        System.out.println("--------- ************* ---------");
                    }else if(userChoice == 2){
                        System.out.println("Congrats!!your postpaid to prepaid sim conversion request is received. You new SIM will be delivered within 2 days to your address");
                        System.out.println("--------- ************* ---------");
                    } else if (userChoice == 3) {
                        System.out.println("Your cancellation request is received.");
                        System.out.println("--------- ************* ---------");
                    }
                    break;
                }
                case 4 : {
                    Balance b1 = new Balance();
                    long mobi;

                    System.out.println("enter mobile number : ");
                    mobi = sc.nextLong();
                    b1.setMobileNum(mobi);

                    b1.getBalance();
                    System.out.println("--------- ************* ---------");
                    System.out.println();
                    break;
                }
                case 5 : {
                    System.out.println("Enter mobile number : ");
                    long mobiNum = sc.nextLong();

                    Profile_Details pd1 = new Profile_Details("Kartavya","Pune",20,mobiNum);

                    pd1.getDetails();
                }
            }
        }while(choice != 0);

        sc.close();
    }
}