import banksystem.Client;

public class App {
    public static void main(String[] args) throws Exception {
        Client client1 = new Client();
        Client client2 = new Client();

        // Test deposit
        client1.Deposit(500);
        System.out.println("Client1 balance after deposit: " + client1.getbalance());

        // Test withdraw
        client1.Withdraw(200);
        System.out.println("Client1 balance after withdrawal: " + client1.getbalance());

        // Test transfer
        client1.TransferTo(100, client2);
        System.out.println("Client1 balance after transfer: " + client1.getbalance());
        System.out.println("Client2 balance after receiving transfer: " + client2.getbalance());
    }
}