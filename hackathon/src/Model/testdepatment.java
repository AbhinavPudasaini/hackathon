package Model;

public class testdepatment {


    String radiologist = "Ishan khadka", Degree2 = "radiology",test= "radiologies", test2="Bitewing X-Ray"
,  test3 = "Panoramic X-Ray", time2 = "8am - 8pm", departmentId = "111", test4 = "Cone Beam X-ray";

    String Ct = "Sushmita Parajuli", Degree1 = "MOMS", test1 = "CT scan",
            time1 = "2pm - 5pm";

    public void test1(){
        System.out.println("Doctor Name : " + radiologist);
        System.out.println("Test : " + test);
        System.out.println("OPD time : " + time2);
        System.out.println("Degree : " + Degree2);
        System.out.println(" Department ID"  + ", "+ departmentId);

    }


    public void Ct1(){
        System.out.println("Doctor Name : " + radiologist);
        System.out.println("Test : " + test1);
        System.out.println("OPD time : " + time1);
        System.out.println("Degree : " + Degree1);
        System.out.println(" Department ID"  + ", "+ departmentId);

    }

    public void xray(){
        System.out.println("Doctor Name : " + Ct);
        System.out.println("Test : " + test2);
        System.out.println("OPD time : " + time1);
        System.out.println("Degree : " + Degree1);
        System.out.println(" Department ID"  + ", "+ departmentId);

    }
    public void xray1(){
        System.out.println("Doctor Name : " + Ct);
        System.out.println("Test : " + test3);
        System.out.println("OPD time : " + time1);
        System.out.println("Degree : " + Degree1);
        System.out.println(" Department ID"  + ", "+ departmentId);
    }
    public void xray3(){
        System.out.println("Doctor Name : " + Ct);
        System.out.println("Test : " + test4);
        System.out.println("OPD time : " + time1);
        System.out.println("Degree : " + Degree1);
        System.out.println(" Department ID"  + ", "+ departmentId);

    }

    public void getTestName(){

        System.out.println("  OPD , Amount :  500");
        System.out.println("  Operation , Amount :  50000");
        System.out.println("  RTC , Amount :  1000");
        System.out.println("  X-Ray , Amount :  1500");
        System.out.println("  CT-Scan , Amount :  3000");
        System.out.println("  Blood Test , Amount :  500");
        System.out.println("  Oral dental Hygiene , Amount :  500\t");
    }





}
