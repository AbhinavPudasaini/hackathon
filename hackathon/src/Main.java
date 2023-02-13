import Model.*;

import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.jar.JarOutputStream;


public class Main {
    public static void main(String[] args) {


        boolean exit = true;
        while (exit != false) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("-------------- WELCOME TO SWASTIKA DENTAL ------------------");
            System.out.println("-----------------------------------------------------------");
            System.out.println("NEW  | OLD | Emergency");
            Scanner quest = new Scanner(System.in);
            String quest1 = quest.next();


            if (quest1.equalsIgnoreCase("stop")) {
                break;
            } else {

                runporogram(quest1, quest);

            }
        }


    }

    private static void runporogram(String quest1, Scanner quest) {

        String choice, detail1, detail2, detail3, ans1, depart, space, register1, age1, no1, tested, confirm;
        int id, total = 0;
        int disAmt, disPer = 50;
        Patients newp;

        ArrayList<Oldpatients> old = new ArrayList<>();
        Oldpatients p1 = new Oldpatients("Abhinav", "Pudasaini", "Danchhi", "984002811", "18", "1");
        Oldpatients p2 = new Oldpatients("Avarna", "Shrestha", "Thulobharang", "982336988", "17", "2");
        Oldpatients p3 = new Oldpatients("Tatsam", "Gautam", "Chabahil", "984002800", "16", "3");
        Oldpatients p4 = new Oldpatients("Sushant", "Nepal", "Boudha", "984128110", "18", "4");
        Oldpatients p5 = new Oldpatients("Biplov", "Khadka", "Koteshhwor", "984928110", "18", "5");

        old.add(p1);
        old.add(p2);
        old.add(p3);
        old.add(p4);
        old.add(p5);


        if (quest1.equalsIgnoreCase("old")) {

            System.out.println("Your Phone Number , Please ?");
            String phone = quest.next();

            for (Oldpatients o : old) {
                String oldno = o.getPhoneno();
                if (oldno.equalsIgnoreCase(phone)) {
                    System.out.println("Name : " + o.getFirstname() + " " + o.getLastname());
                    System.out.println("Address : " + o.getAddress());
                    System.out.println("Age : " + o.getAge());
                    System.out.println("Phone Number : " + o.getPhoneno());
                    System.out.println("ID : " + o.getId());
                }
            }
        }

        if (quest1.equalsIgnoreCase("new")) {

            Scanner justtry = new Scanner(System.in);

            ArrayList<String> lists = new ArrayList<>();
            int size;

            System.out.println("How many Patients do you want to register : ");
            size = justtry.nextInt();


            for (int i = 0; i < size; i++) {

                System.out.println("Patient FirstName : ");
                detail1 = justtry.next();
                System.out.println("Patient Lastname : ");
                detail2 = justtry.next();
                System.out.println("Patient Address : ");
                detail3 = justtry.next();
                System.out.println("Patient phone number : ");
                no1 = justtry.next();
                System.out.println("Patient age : ");
                age1 = justtry.next();
                System.out.println("Your ID : " + (i + 6));

                lists.add(detail1);
                lists.add(detail2);
                lists.add(detail3);
                lists.add(no1);
                lists.add(age1);


                newp = new Patients(detail1, detail2, detail3, age1, no1);
                System.out.println("Patient Details : ");
                System.out.println(" ");
                System.out.println(lists);
                newp.getDetails();
                System.out.println("ID : " + (i + 6));
                System.out.println(" ");


            }
        }

        System.out.println(" ");

        System.out.println("Enter 'T' to get the details about different tests.");
        space = quest.next();


        System.out.println();
        do {
            System.out.println("The Tests are : ");
            System.out.println(" ");
            testdepatment testnames = new testdepatment();
            testnames.getTestName();
            System.out.println(" ");
            System.out.println("Choose any test :");

            ans1 = quest.next();
            generate_bil billa = new generate_bil("OPD", 500);
            generate_bil oper = new generate_bil("radiology", 50000);
            generate_bil rtc = new generate_bil("RTC", 1000);
            generate_bil ct = new generate_bil("CT Scan", 3000);
            generate_bil xx = new generate_bil("X-Ray", 1500);


            if (ans1.equalsIgnoreCase("opd")) {

                System.out.println(" ");

                System.out.println("Which department ? ");
                System.out.println("Hygiene  |  Maxillary  |  Ortho");
                depart = quest.next();
                Hygiene doct1 = new Hygiene();
                total += billa.getAmount();


                if (depart.equalsIgnoreCase("Hygiene")) {

                    System.out.println("List of Doctors : ");
                    System.out.println(" ");
                    System.out.println("Hygiene Doctors : ");
                    System.out.println(" ");
                    doct1.h1();
                    System.out.println(" ");
                    doct1.h2();
                    System.out.println(" ");
                    doct1.h3();
                    System.out.println(" ");

                    System.out.println("Please Enter the Doctor name : ");
                    register1 = quest.next();

                    register reg = new register(register1);
                    reg.getRegistered();
                    billa.getBills();


                } else if (depart.equalsIgnoreCase("maxillary")) {

                    System.out.println("List of Doctors : ");
                    System.out.println(" ");

                    System.out.println("Maxillary Surgeons : ");
                    System.out.println(" ");

                    doct1.max1();
                    System.out.println(" ");
                    doct1.max2();
                    System.out.println(" ");
                    System.out.println("Please Enter the Doctor name : ");
                    register1 = quest.next();
                    register reg = new register(register1);
                    reg.getRegistered();
                    billa.getBills();


                } else if (depart.equalsIgnoreCase("Ortho")) {

                    System.out.println("List of Doctors : ");
                    System.out.println(" ");

                    System.out.println("Orthodontist : ");
                    System.out.println(" ");
                    doct1.o1();
                    System.out.println(" ");
                    doct1.o2();
                    System.out.println(" ");
                    System.out.println("Please Enter the Doctor name : ");
                    register1 = quest.next();
                    register reg = new register(register1);
                    reg.getRegistered();
                    billa.getBills();
                } else {
                    System.out.println("Error");
                }


            }

            if (ans1.equalsIgnoreCase("Operation") | ans1.equalsIgnoreCase("RTC") | ans1.equalsIgnoreCase("Ct") | ans1.equalsIgnoreCase("Test") | ans1.equalsIgnoreCase("x-ray")) {

                /*System.out.println("Enter Your email address : ");
                String getemail = quest.next();
                testEmail email1 = new testEmail(getemail);*/
                System.out.println(" ");
                testdepatment test11 = new testdepatment();
                test11.test1();
                System.out.println(" ");
                test11.Ct1();
                System.out.println(" ");
                test11.xray();
                System.out.println(" ");
                test11.xray1();
                System.out.println(" ");
                test11.xray3();
                System.out.println(" ");

                System.out.println("Which test ? Radiology | X-ray | Ct | RTC | Operation");
                tested = quest.next();

                if (tested.equalsIgnoreCase("radiology")) {

                    oper.getBills();
                    total += oper.getAmount();


                } else if (tested.equalsIgnoreCase("X-ray")) {

                    xx.getBills();
                    total += xx.getAmount();


                } else if (tested.equalsIgnoreCase("CT")) {


                    ct.getBills();
                    total += ct.getAmount();

                } else if (tested.equalsIgnoreCase("rtc")) {
                    rtc.getBills();
                    total += rtc.getAmount();

                } else if (tested.equalsIgnoreCase("Operation")) {
                    oper.getBills();
                } else {
                    System.out.println("Error");
                }


            }
            System.out.println("If your want to Do other tests then enter 'Y' for Yes : 'N'  for No");

            choice = quest.next();
        } while (choice.equalsIgnoreCase("Y"));

        System.out.println("The total amount is : " + (total));
        System.out.println(" ");
        String share;
        System.out.println("Shareholder Family or Not : ");
        share = quest.next();
        int afterPrice = 0;
        if (share.equalsIgnoreCase("Yes")) {


            disAmt = (total / 100) * disPer;
            afterPrice += total - disAmt;

            System.out.println("Your final amount is : " + afterPrice);
            System.out.println(" ");

        }

        int afterpriceset = afterPrice;
        System.out.println("Confirm Appointment : 'Y' | 'N'");
        confirm = quest.next();

        if (confirm.equalsIgnoreCase("Y")) {


            System.out.println("Your appointment has been fixed.");
            System.out.println(" ");
            System.out.println("Please choose payment method :  Cash   |  Digital   | ................. Exception Cheque");
            if (share.equalsIgnoreCase("yes")) {
                String method = quest.next();
                if (method.equalsIgnoreCase("cash")) {

                    System.out.println("The payment of Rs." + afterPrice + " has been done.");

                } else if (method.equalsIgnoreCase("cheque")) {
                    System.out.println("Give any valid governmental document :  Citizenship Card  |  Voters Card  |  License   |  Other douments");
                    String document = quest.next();
                    paymentMethod pay = new paymentMethod(document);
                    pay.getCheaque();
                    System.out.println(" ");
                } else if (method.equalsIgnoreCase("digital")) {
                    paymentMethod pay2 = new paymentMethod("hello");
                    pay2.getDigital();
                    System.out.println("Pay the amount : ");
                    String wait = quest.next();
                    System.out.println("Your payment has been done.");

                } else {
                    System.out.println("......................Error...-.- :( ..................");
                }
            }

            if (share.equalsIgnoreCase("not")) {
                String method = quest.next();
                if (method.equalsIgnoreCase("cash")) {

                    System.out.println("The payment of Rs." + total + " has been done.");
                } else if (method.equalsIgnoreCase("cheque")) {

                    System.out.println("Give any valid governmental document :  Citizenship Card  |  Voters Card  |  License   |  Other douments");
                    String document = quest.next();
                    paymentMethod pay = new paymentMethod(document);
                    pay.getCheaque();
                    System.out.println(" ");

                } else if (method.equalsIgnoreCase("digital")) {
                    paymentMethod pay3 = new paymentMethod("hello");
                    pay3.getDigital();
                    System.out.println("Pay the amount : ");
                    String wait = quest.next();
                    System.out.println("Your payment has been done.");
                } else {
                    System.out.println("......................Error...-.- :( ..................");
                }
            }
        }
            if (confirm.equalsIgnoreCase("n")){
                System.out.println("Your appointment has been canceled");
                System.out.println(" ");
            }
        }
}
