import java.util.*;
class Area{
    public static void main(String st[]){
        One ar=new One();
          Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
                ar.areaCalc(a);
        float b,c;
        b=sc.nextFloat();
        c=sc.nextFloat();
        ar.areaCalc(b,c);
        int d,e;
        d=sc.nextInt();
        e=sc.nextInt();
        ar.areaCalc(d,e);
        float f=sc.nextFloat();
        ar.areaCalc(f);
    }
}
class One{
       void areaCalc(int a){
              int area=a*a;
              System.out.println(area);
       }
       public void areaCalc(float a,float b){
             float area=a*b;
             System.out.println(String.format("%.2f",area));
       }
       public void areaCalc(int a,int b){
                float area=(float)(a*b)/2;
                System.out.println(String.format("%.2f",area));
       }   
       public void areaCalc(float r){
               float area=(float)3.14*r*r;
               System.out.println(String.format("%.2f",area));
       }
}
