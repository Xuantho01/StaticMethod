public class StaticMethod {
     private int rollno;
     private String name;
     private static String college = "xuantho";

     StaticMethod(int rollno, String name){
         this.rollno = rollno;
         this.name = name;
     }

     static void change(){
         college = "XUANTHO";
     }

     void display(){
         System.out.println(rollno + " " + name + " "+college);
     }
}
