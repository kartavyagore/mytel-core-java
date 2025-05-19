public class Profile_Details {
    String name, address;
    int age;
    long mobile_No;

    public Profile_Details(String name, String address, int age, long mobile_No){
        this.name = name;
        this.address = address;
        this.age = age;
        this.mobile_No = mobile_No;
    }

    public void getDetails(){
        System.out.println();
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Age : "+age);
        System.out.println("Mobile No : "+mobile_No);
        System.out.println();
    }
}
