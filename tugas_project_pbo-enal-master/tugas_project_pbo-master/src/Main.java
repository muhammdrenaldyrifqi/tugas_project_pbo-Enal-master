import model.Pegawai;
import model.PegawaiMagang;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException) {

        // Object 1
        Pegawai rifqi = new Pegawai("KD-01", "M. Renaldy Rifqi", "Direktur", "kandangan", "25-07-2019", false);
        rifqi.absensiPegawai("M. Renaldy Rifqi");
        rifqi.tampilkanData();
        rifqi.hitungGaji();

        System.out.println();

        // Object 2
        Pegawai adhi = new Pegawai("KD-02", "adhi sukur", "Staf", "barabai", "26-07-2018", true);
        adhi.tampilkanData();
        adhi.hitungGaji();

        System.out.println();

        // Object 3
        PegawaiMagang matnor = new PegawaiMagang("MG-01", "Matnorahman", "rantau", "unlam", "27-07-2021", "17-09-2021");
        matnor.absensiPegawai("Matnorahman");
        matnor.tampilkanDataPegawaiMagang();
        matnor.hitungGajiMagang();

        System.out.println();

        // Object 4
        PegawaiMagang ilham = new PegawaiMagang("MG-02", "ilham farera", "amuntai", "UVAYA", "18-07-2021", "21-07-2021");
        ilham.tampilkanDataPegawaiMagang();
        ilham.hitungGajiMagang();

        System.out.println();

        // Object 5
        Pegawai hardi = new Pegawai("KD-03", "hardiansyah", "hardi", "hardi123");

        System.out.println();

        // Object 6
        Pegawai rustam = new Pegawai("KD-04", "rustam", "rustam", "rustam123");
    }

}
