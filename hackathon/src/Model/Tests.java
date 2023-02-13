package Model;

public class Tests{

    String testName;
    double amount;

    public Tests(String testName, double amount) {
        this.testName = testName;
        this.amount = amount;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }



}
