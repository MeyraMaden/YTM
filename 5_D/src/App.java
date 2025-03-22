public class App {
    public static void main(String[] args) throws Exception {
        Kullanici kullanici=new Kullanici("meyra", "meyramaden@gmail.com", "175.68.34", 545);
        Haber haber=new Haber();
        haber.bilgilendir(kullanici, "deneme mesaj");
    }
}
