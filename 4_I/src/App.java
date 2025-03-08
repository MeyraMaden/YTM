public class App {
    public static void main(String[] args) throws Exception {
        DBLogger db_logger=new DBLogger();
        ConsoleLogger console_logger=new ConsoleLogger();

        db_logger.write("log 1");
        db_logger.openConnection();
        db_logger.write("log 2");

        console_logger.write("log 3");
        db_logger.write("log 4");
        db_logger.closeConnection();
        db_logger.write("log 5");

        for(String message: db_logger.database.getList()){
            System.out.println(message);
        }
    }
}
