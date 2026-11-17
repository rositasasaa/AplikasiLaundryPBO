package model;

import exception.InputTidakValidException;

public class LayananKiloan extends Layanan {
    public LayananKiloan(String kode, String nama, double hargaPerKg) throws InputTidakValidException {
        super(kode, nama, hargaPerKg); // Memanggil konstruktor induk
    }

    @Override
    public double hitungBiaya(double beratKg) {
        double beratHitung = Math.max(beratKg, 2.0); // Minimal 2 kg
        return beratHitung * hargaDasar;
    }

    @Override
    public int estimasiHari() {
        return 3;
    }
}