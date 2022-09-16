package Unit2.Examples;

public class PhoneDriver {
    //SOUT
    //PSVM

    public static void main(String[] args) {
        Phone one = new Phone("Samsung", 64, true);
        Phone two = new Phone("Apple", 24);

        one.turnOffService();
        two.turnOnService();

        one.printPhoneDetails();
        two.printPhoneDetails();

        one.setBrand("Google");
        one.setService(true);
        one.setStorage(128);

        one.printPhoneDetails();

        System.out.println(two.getBrand());
        System.out.println(two.getStorage());
        System.out.println(two.getService());
    }
}
