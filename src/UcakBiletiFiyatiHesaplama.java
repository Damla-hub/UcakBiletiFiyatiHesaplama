import java.util.Scanner;
public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int km,age,select;
        double result=0;
        System.out.print("Mesafeyi(km) giriniz: ");
        km=input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age=input.nextInt();
        System.out.println("1-Tek yön\n2-Gidiş-Dönüş\nGidiş-dönüş tercihine özel %20 İNDİRİM!");
        select=input.nextInt();
        switch(select){
            case 1 :
                System.out.print("Tek yön tercihi seçilmiştir.");
                break;
            case 2 :
                System.out.print("Gidiş-Dönüş tercihi seçilmiştir.%20 indirim uygulanmıştır.");
                km=km*2;
                break;
            default:
                System.out.print("Yolculuk tipi seçilemediği için tutar hesaplanamadı!");
        }
        if(age>0 && km>0) {
            result = km * 0.10;

            if (age < 12) {
                result = result - (result / 2);
            } else if (age >= 12 && age <= 24) {
                result = result - (result * 0.10);
            } else if (age > 65) {
                result = result - (result * 0.30);
            }
        }
        if(select==2){
            result=result-(result*0.20);
        }
        if((select!=1 && select!=2)||(age<0||km<0)){
             System.out.print("\nHatalı veri girdiniz!");
         }else{
            System.out.print("\nToplam Tutar : "+result+"TL'dir.İyi yolculuklar...=)");
        }


    }
}
