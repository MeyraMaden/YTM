public class MSSQL implements IDB {
    @Override
    public void selectData() {
        System.out.println("MSSQL veritabanından veri okundu.");
    }

    @Override
    public void insertData() {
        System.out.println("MSSQL veritabanına veri yazıldı.");
    }
}
