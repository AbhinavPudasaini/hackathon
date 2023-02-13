package Model;

public class register  {

    String regist;

    public register(String regist) {
        this.regist = regist;
    }

    public String getRegist() {
        return regist;
    }

    public void setRegist(String regist) {
        this.regist = regist;
    }

    public void getRegistered(){

        System.out.println("Your appointment with Dr." + regist + " has been fixed.");

    }
    public void getCanceled(){
        System.out.println("Your appointment with Dr. "+ regist+" is canceled.");

    }

}
