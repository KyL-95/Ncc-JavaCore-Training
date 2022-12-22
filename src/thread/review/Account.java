package thread.review;

public class Account {
    private String name;
    private double amount;

    public Account(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }
    // synchronized
    public synchronized void drawMoney(double money) throws InterruptedException {
        if(this.getAmount() >= money){
            Thread.sleep(2000L);
            this.amount = this.amount - money;
            System.out.println("Draw has been success!");
            System.out.println("Còn lại " + this.amount + "$");
        } else{
            System.out.println("Not enough money");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
