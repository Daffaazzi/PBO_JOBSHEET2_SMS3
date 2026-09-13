public class MouseDemo {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI MOUSE (PARADIGMA PBO) ===\n");

        // Objek pertama
        Mouse mouse1 = new Mouse();
        mouse1.merek = "Logitech";
        mouse1.dpi = 800;
        mouse1.jenis = "Wireless";

        // Update nilai atribut & eksekusi method
        mouse1.tambahDPI(10);
        mouse1.kurangDPI(5);
        mouse1.displayInfo();

        // Objek kedua
        Mouse mouse2 = new Mouse();
        mouse2.merek = "Razer";
        mouse2.dpi = 1200;
        mouse2.jenis = "Wired";

        // Update nilai atribut & eksekusi method
        mouse2.tambahDPI(20);
        mouse2.kurangDPI(10);
        mouse2.displayInfo();
    }
}