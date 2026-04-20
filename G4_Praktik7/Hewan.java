package G4_Praktik7;

class Hewan {
    void suara() {
        System.out.println("Suara hewan");
    }
}

class Herbivora extends Hewan {
    void suara() {
        System.out.println("Suara herbivora");
    }
}

class Karnivora extends Hewan {
    void suara() {
        System.out.println("Suara karnivora");
    }
}