package Model;

public class Hygiene extends maxillary{

    String doctor1 = "Baniya Gautam", Department = "Hygiene", Degree1 = "MBBS, DDS";
    String time1 = "7 Am - 11am";
    int departmentId = 212;

    String doctor2 = "Sushmita Nepal", Degree2 = "MOMS",
            time2 = "2pm - 5pm";

    String doctor3 = "Sushmita Nepal", Degree3 = "MOMS,DMD",
            time3 = "6pm - 8pm";

    public void h1(){
        System.out.println("Doctor Name : " + doctor1);
        System.out.println("OPD time : " + time1);
        System.out.println("Degree : " + Degree1);
        System.out.println("Department , Department ID" + Department + ", "+ departmentId);

    }

    public void h2(){
        System.out.println("Doctor Name : " + doctor2);
        System.out.println("OPD time : " + time2);
        System.out.println("Degree : " + Degree2);
        System.out.println("Department , Department ID" + Department + ", "+ departmentId);



    }

    public void h3(){
        System.out.println("Doctor Name : " + doctor3);
        System.out.println("OPD time : " + time3);
        System.out.println("Degree : " + Degree3);
        System.out.println("Department , Department ID" + Department + ", "+ departmentId);



    }

}
