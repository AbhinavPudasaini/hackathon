package Model;

public class Patients {

   String Firstname, Lastname, address, phoneno, age;

    public Patients(String firstname, String lastname, String address, String phoneno, String age) {
        Firstname = firstname;
        Lastname = lastname;
        this.address = address;
        this.phoneno = phoneno;
        this.age = age;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void getDetails(){
        System.out.println("Name : " + Firstname + " " + Lastname);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
        System.out.println("Phone number : " + phoneno);
    }


}
