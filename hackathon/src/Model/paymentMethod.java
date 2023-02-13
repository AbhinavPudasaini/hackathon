package Model;
import java.util.Scanner;
public class paymentMethod {

String documents;

    public paymentMethod(String documents) {
        this.documents = documents;
    }

    public String getDocuments() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents = documents;
    }

    public void getCheaque(){
        System.out.println("Your cheque has been deposited.");
        System.out.println("Please come tomorrow to take your documents. As It is an exception method.");

    }
    public void getDigital(){

        String Bank_Details = "Nabil Bank ltd",Account_holder = "Swastika dental Hospital", Digital_id = "987987987";

        System.out.println("Bank Details : " + Bank_Details);
        System.out.println("Account Holder : " + Account_holder);
        System.out.println("Account ID : " + Digital_id);


    }

}
