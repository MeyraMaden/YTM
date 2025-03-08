public class DBLogger implements ILogger,IConnection {
    Database database;
    
    public DBLogger(){
        database=new Database();
    }

    public void write(String message){
        database.addLog(message);
    }
    public void openConnection(){
        database.openDB();
    }

    public void closeConnection(){
        database.closeDB();
    }
}
