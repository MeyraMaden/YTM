public class MYSQL implements IDB {
    @Override
    public void selectData() {
        System.out.println("MYSQL veritabanından veri okundu.");
    }
    
    @Override
    public void insertData() {
        System.out.println("MYSQL veritabanına veri yazıldı.");
    }
}
