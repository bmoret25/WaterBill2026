public class Main {

    public static void main(String[] args) {

        Customer MalloryCustomer = new Customer();
        System.out.println(MalloryCustomer.name);
        MalloryCustomer.name = "Mallory";
        System.out.println(MalloryCustomer.name);   //. allows me to access properties

        Customer dumbCustomer = new Customer();
        System.out.println(dumbCustomer.gallonsUsed);   //classes have their own default values, I don't need to initialize them
    }
}