public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Serge KONAN");
        Account acc = new Account(1, customer, 200000);

        System.out.println("New deposit : " + acc.deposit(100000));
        System.out.println("Withdraw : " + acc.withdraw(50000));
    }
}