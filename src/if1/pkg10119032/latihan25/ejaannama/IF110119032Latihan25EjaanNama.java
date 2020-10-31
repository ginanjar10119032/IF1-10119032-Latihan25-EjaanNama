package if1.pkg10119032.latihan25.ejaannama;
import java.util.Scanner;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan
 * ejaan nama ke layar
 */
public class IF110119032Latihan25EjaanNama {

    public static void main(String[] args) {
        //pengguna memasukkan nama depannya untuk di eja
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String nama = scan.next();
        System.out.println("\nEjaan untuk \""+ nama + "\" adalah : ");
        
        char[] karakter = nama.toCharArray();

        int i=0;
        while(i<nama.length()){
            System.out.print("Huruf ke-" + (i+1) + " : ");
                System.out.println(karakter[i]);
            i++;
        }
    }
}
