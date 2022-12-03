
import java.util.Scanner;


public class Main {
    private static Kart[][] kartlar = new Kart[4][4];
    public static void main(String[] args) {
        
        
           
            
            kartlar[0][0] = new Kart('E');
            kartlar[0][1] = new Kart('A');
            kartlar[0][2] = new Kart('B');
            kartlar[0][3] = new Kart('F');
            kartlar[1][0] = new Kart('G');
            kartlar[1][1] = new Kart('A');    // tabloya sadece br defa ve 30 sn bakma hakkınız var fazlası yok maalesef
            kartlar[1][2] = new Kart('D');    // yapılan matris oyununu lütfen tabloya bakmadan yaponon 
            kartlar[1][3] = new Kart('H');
            kartlar[2][0] = new Kart('F');
            kartlar[2][1] = new Kart('C');
            kartlar[2][2] = new Kart('D');
            kartlar[2][3] = new Kart('H');
            kartlar[3][0] = new Kart('E');
            kartlar[3][1] = new Kart('G');
            kartlar[3][2] = new Kart('B');
            kartlar[3][3] = new Kart('C');
               
        //   OyunTahtası();
        
        while(OyunBittiMi() == false ){
            OyunTahtası();
            TahminEt();
        }
    }
    public static boolean OyunBittiMi(){
        
        for(int i= 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                
                if(kartlar[i][j].isTahmin() == false){
                    return false;
                    
                }
            }
        }
        return true;
        
    }
    public static void TahminEt(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("birinc tahmin ( i ve j değerleriniz bir boşluklu şekilde girin)");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        
        kartlar[i1][j1].setTahmin(true);
        OyunTahtası();
        
        
        
          
        System.out.println("ikinci tahmin ( i ve j değerleriniz bir boşluklu şekilde girin)");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        
        
        if(kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()){
            
            System.out.println("Doğru tahmin  tebrikler");
            
            kartlar[i2][j2].setTahmin(true);
            
            
        }
        else {
            System.out.println("yanlış tahmin");
            kartlar[i1][j1].setTahmin(false);
            
        }
        
    }
    public static void OyunTahtası(){
        
        for(int i= 0; i< 4; i++){
            System.out.println("*******************");
            for(int j= 0; j< 4; j++){
                if(kartlar[i][j].isTahmin()){
                    System.out.print(" i"+ kartlar[i][j].getDeger() + "j  ");
                }
                else{
                    
                    System.out.print(" i i ");
                }
            }
            System.out.println("");
        }
        System.out.println("*******************");
    }
}
