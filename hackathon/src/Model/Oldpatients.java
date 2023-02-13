package Model;

public class Oldpatients {


    String Firstname, lastname, address,phoneno, age, id;

    public Oldpatients(String firstname, String lastname, String address, String phoneno, String age, String id) {
        Firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phoneno = phoneno;
        this.age = age;
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

  /*  public void getOld(){

        System.out.println("Your are already a patient.");
        System.out.println("Your Details");this.getFirstname();
        this.getLastname();
        this.getAddress();
        this.ge


    }

*/

public void getNew(){



}
}
