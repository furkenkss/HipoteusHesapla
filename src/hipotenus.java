import java.util.Scanner;
//      Dik Üçgende Hipotenüs Bulan Program
//      Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
//
//      Ödev
//      Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
//
//      Formül
//      Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
//
//      𝑢 = (a+b+c) / 2 
//
//      Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
public class hipotenus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int birinciDikKenar, ikinciDikKenar;
        System.out.println("Birinci dik kenarı giriniz.");
        birinciDikKenar = inp.nextInt();
        System.out.println("İkinci dik kenarı giriniz.");
        ikinciDikKenar = inp.nextInt();
        inp.close();

        double hipotenus = Math.sqrt((birinciDikKenar*birinciDikKenar)+ (ikinciDikKenar*ikinciDikKenar));
        System.out.println("Hipotenüs : " + hipotenus);
        double ucgeninCevresi = (birinciDikKenar + ikinciDikKenar + hipotenus);
        double u = ucgeninCevresi/2;

        double ucgeninAlani = Math.sqrt((u*(u-birinciDikKenar)*(u-ikinciDikKenar)*(u-hipotenus)));
        System.out.println("Üçgenin alanı : " + ucgeninAlani);
    }
}
