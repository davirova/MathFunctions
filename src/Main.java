import java.util.Scanner;

public class Main {

    static {
        System.out.println("Static method va static blocklar mavzusi bo'yicha amaliy topshiriq \n ");
    }
    static double mpi = 3.14159265359;
    static double me = 2.71828182846;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
//    stataic berilgan pi dan foydalanib berilgan radiusli doiraning yuzasini topiish uchun static metod
        double dyuza = yuza.d_yuza(5);
        System.out.println("Radiusi "+ 5 + " ga teng bo'lgan " + " doiraning yuzi: "+dyuza+"\n");
//    static bulgan e ning a-darajaga kutarish buyicha topshiriq funksiyasi
        double edaraja = daraja.edaraja(5);
        System.out.println( me + " ning "+ 5 +" - darajasi = "+edaraja+"\n");
       geron(4.5, 6.3,7.9);
    }
    public static void  geron(double a, double b, double c){
        double p =(a+b+c)/2;
        double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Geron formulasi bo'yicha tomonlari "+ a+" , "+ b+" , "+ c + " bulgan uchburchak yuzi: "+s);
    }

}