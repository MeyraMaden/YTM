public class DBFactory {
    public static final int MYSQL = 1;
    public static final int ORACLE = 2;
    public static final int MSSQL = 3;

    public IDB getDB(int type) {
        if (type == MYSQL){
            return new MYSQL();
        } 
        else if (type == ORACLE){
            return new ORACLE();
        } 
        else if (type == MSSQL){
            return new MSSQL();
        } 
        else 
            return null;
    }
}
