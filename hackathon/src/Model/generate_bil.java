package Model;

public class generate_bil {

    String test;
    int amount;

    public generate_bil(String test, int amount) {
        this.test = test;
        this.amount = amount;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void getBills(){

        System.out.println("The Amount is : " + amount);

    }
}
