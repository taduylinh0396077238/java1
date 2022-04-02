public class Account {
    private String id;
    private String name;
    private int balance;



    public  Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("số lượng vượt quá");

        }
        return balance;


    }
    public int transferTo(Account another , int amount){
        if (amount <= balance){
            balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Không đủ tiền để chuyển ");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }

    public static void main(String[] args) {
        Account tien = new Account("1","DL",30000000);
        System.out.println("ID =" + tien.id );
        System.out.println("Tên =" + tien.name);
        System.out.println("Số tièn =" + tien.balance);
    }
}
