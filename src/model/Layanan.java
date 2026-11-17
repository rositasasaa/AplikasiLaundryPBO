package model;

import exception.InputTidakValidException;

public abstract class Layanan {
    protected String kodeLayanan;
    protected String namaLayanan;
    protected double hargaDasar;

    public Layanan(String kodeLayanan, String namaLayanan, double hargaDasar) throws InputTidakValidException {
        this.kodeLayanan = kodeLayanan;
        this.namaLayanan = namaLayanan;
        setHargaDasar(hargaDasar);
    }

    public String getKodeLayanan() { return kodeLayanan; }
    public String getNamaLayanan() { return namaLayanan; }
    public double getHargaDasar() { return hargaDasar; }

    public void setHargaDasar(double hargaDasar) throws InputTidakValidException {
        if (hargaDasar <= 0) {
            throw new InputTidakValidException("Harga dasar layanan harus lebih dari 0!");
        }
        this.hargaDasar = hargaDasar;
    }

    // Method abstrak untuk polimorfisme
    public abstract double hitungBiaya(double kuantitas);
    public abstract int estimasiHari();

    @Override
    public String toString() {
        return namaLayanan + " (Rp" + (int) hargaDasar + ")";
    }
}