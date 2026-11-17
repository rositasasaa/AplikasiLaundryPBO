package model;

import exception.InputTidakValidException;

public class LayananSatuan extends Layanan {
    private String kategoriItem;

    public LayananSatuan(String kode, String nama, double hargaPerPcs, String kategoriItem) throws InputTidakValidException {
        super(kode, nama, hargaPerPcs);
        this.kategoriItem = kategoriItem;
    }

    public String getKategoriItem() { return kategoriItem; }

    @Override
    public double hitungBiaya(double jumlahPcs) {
        return jumlahPcs * hargaDasar;
    }

    @Override
    public int estimasiHari() {
        return 4;
    }
}