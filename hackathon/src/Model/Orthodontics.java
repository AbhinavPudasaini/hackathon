package Model;

public class Orthodontics extends testdepatment {

    String doctor2 = "Dibas Adhikari", Degree2 = "MOMS, Orthodeontics",
            time2 = "4pm - 7pm", Department = "Ortho";

    int departmentId = 312;

    String doctor1 = "Suraj Shrestha", Degree1 = "MOMS, DOS",
            time1 = "1pm - 4pm";


    public void o1(){
        System.out.println("Doctor Name : " + doctor1);
        System.out.println("OPD time : " + time1);
        System.out.println("Degree : " + Degree1);
        System.out.println("Department , Department ID" + Department + ", "+ departmentId);

    }

    public void o2(){
        System.out.println("Doctor Name : " + doctor2);
        System.out.println("OPD time : " + time2);
        System.out.println("Degree : " + Degree2);
        System.out.println("Department , Department ID" + Department + ", "+ departmentId);

    }

}
