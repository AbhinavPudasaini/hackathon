package Model;

import java.util.Scanner;

public class reception{

String question;
int bill;

    public reception(String question, int bill) {
        super();
        this.question = question;
        this.bill = bill;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }


    public void getQue() {


        System.out.println(this.question);

    }
        public void bill(){
        System.out.println(this.bill);


    }


}

