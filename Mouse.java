public class Mouse {
    public String merek;
    public int dpi;
    public String jenis;

    // Method untuk menambah DPI
    public void tambahDPI(int increment){
        dpi += increment;
    }

    // Method untuk mengurangi DPI
    public void kurangDPI(int decrement){
        dpi -= decrement;
    }

    // Method untuk menampilkan info mouse
    public void displayInfo(){
        System.out.println("Merek : " + merek);
        System.out.println("DPI   : " + dpi);
        System.out.println("Jenis : " + jenis);
        System.out.println("--------------------------------------------------");
    }
}