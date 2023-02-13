package Model;

public class maxillary extends Orthodontics{


    String doctor1 = "Anubhav Sherestha", Department = "Maxillary Surgeon", Degree1 = "MBBS, MOMS, DDS";
    String time1 = "10 Am - 1pm";
    int departmentId = 121;

    String doctor2 = "Sumit Singh", Degree2 = "MBBS, MOMS, DDS, Surgron",
            time2 = "2pm - 7pm";


    public void max1(){
        System.out.println("Doctor Name : " + doctor1);
        System.out.println("OPD time : " + time1);
        System.out.println("Degree : " + Degree1);
        System.out.println("Department , Department ID" + Department + ", "+ departmentId);

    }

    public void max2(){
        System.out.println("Doctor Name : " + doctor2);
        System.out.println("OPD time : " + time2);
        System.out.println("Degree : " + Degree2);
        System.out.println("Department , Department ID" + Department + ", "+ departmentId);

    }
}
