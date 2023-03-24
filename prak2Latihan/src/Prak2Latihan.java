import java.util.ArrayList;

public class Prak2Latihan {
    public static void main(String[] args) {

        ArrayList<String> hewan = new ArrayList<String>();
        ArrayList<String> delete = new ArrayList<String>();

        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        System.out.println("Hewan awal\t\t\t: " + hewan);

        String hapus1 = hewan.remove(1);
        String hapus2 = hewan.remove(1);
        String hapus3 = hewan.remove(1);

        delete.add(hapus1);
        delete.add(hapus2);
        delete.add(hapus3);

        System.out.println("Hewan yang di hapus\t: " + delete);
        System.out.println("Sisa hewan\t\t\t: " + hewan);
    }
}