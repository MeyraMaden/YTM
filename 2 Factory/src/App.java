public class App {
    public static void main(String[] args) throws Exception {
        DBFactory dbFactory = new DBFactory();

        IDB mysql = dbFactory.getDB(DBFactory.MYSQL);
        IDB oracle = dbFactory.getDB(DBFactory.ORACLE);
        IDB mssql = dbFactory.getDB(3);

        mysql.selectData(); 
        mysql.insertData();

        oracle.selectData(); 
        oracle.insertData();

        mssql.selectData(); 
        mssql.insertData();

    }
}
