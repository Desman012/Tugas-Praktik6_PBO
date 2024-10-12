package nomor1;
public class BilanganPrima {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("Bilangan Prima dari 0 sampai "+n+":");
        for (int i = 0; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j == 0 ){
                    ++count;
                }
            }
            if(count == 2){
                System.out.print(i+" ");
            }
        }
        
        System.out.println("\n\nBilangan Bukan Prima dari 0 sampai "+n+":");
        for (int i = 0; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j == 0 ){
                    ++count;
                }
            }
            if(count != 2){
                System.out.print(i+" ");
            }
        }
    }
    
}
