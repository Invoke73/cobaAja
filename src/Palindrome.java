import java.util.Scanner;

/**
 * @Author Danang Romadhon
 * @see <a href="https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/"></a>
 *
 * sebuah kelas untuk melakukan pengecekan palindrome atau bukan
 * kata atau kalimat diambil dari input user
 */


public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Palindrome Check");
        System.out.println("=========================");

        System.out.print("Masukkan kata atau kalimat : ");
        String kata = input.nextLine();

        if(palindromeCheck(kata)) {
            System.out.println("Kalimat atau kata termasuk palindrome!!");
        } else {
            System.out.println("Kalimat atau kata bukan palindrome!!");
        }
    }

    /**
     * Sebuah method untuk pengecekan kata atau kalimat apakah palindrome atau bukan
     *
     * @param kata adalah kata yang diinput user
     * @return akan mengembalikan nilai true atau false saat pengecekan kata atau kalimat palindrome atau bukan
     * @see String#toLowerCase() convert to lower case
     * @see StringBuffer using this to get method reverse
     * @see StringBuffer#reverse() reverse string
     *
     */

    public static boolean palindromeCheck(String kata) {
        if(kata.isEmpty()){
            return true;
        }

        String original = kata.toLowerCase();
        original.replaceAll("[^a-zA-Z0-9]","");

        StringBuffer reverse = new StringBuffer(original);

        reverse.reverse();

        String after = reverse.toString();

        if(original.equals(after)){
            return true;
        }

        return false;
    }
}
