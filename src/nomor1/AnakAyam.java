package nomor1;
public class AnakAyam {
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 4;
        for (int i = n ; i> 0; i--) {
            System.out.println("Tek kotek, kotek kotek~");
            System.out.println("Anak ayam turunlah "+i);
            System.out.println("Mati satu, tinggallah "+((i-1) == 0?"induknya":i-1+"\n"));
        }
    }
    
}
