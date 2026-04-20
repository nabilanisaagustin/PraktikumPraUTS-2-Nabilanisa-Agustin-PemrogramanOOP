package I2_Tugas2;

abstract class Kendaraan {
    abstract void bergerak();
}

class Mobil extends Kendaraan {
    void bergerak() {
        System.out.println("Mobil bergerak dengan roda");
    }
}

class Sepeda extends Kendaraan {
    void bergerak() {
        System.out.println("Sepeda bergerak dengan pedal");
    }
}