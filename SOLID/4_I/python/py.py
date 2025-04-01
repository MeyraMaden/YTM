from abc import ABC,abstractmethod

class Logger(ABC):
    @abstractmethod
    def write(self,message: str):
        pass
    
class Connection(ABC):
    @abstractmethod
    def open_connection(self):
        pass
    @abstractmethod
    def close_connection(self):
        pass

class ConsoleLogger(Logger):
    def write(self, message:str):
        print(message)
        

    
class DB:
    def __init__(self):
        self.list=[]
        self.check=False
    def get_list(self):
        return self.list
    def add_log(self, message:str):
        if self.check:
            self.list.append(message)
    def open_db(self):
        print("baglanti kuruldu")
        self.check=True
    def close_db(self):
        print("baglanti koparildi")
        self.check=False
class DBLogger(Logger,Connection):
        def __init__(self):
            self.database=DB()
        def write(self, message:str):
            self.database.add_log(message)
        def open_connection(self):
            self.database.open_db()
        def close_connection(self):
            self.database.close_db()
            
          
    
if __name__ == "__main__":           #tek tırnak olsa da çağırır #maini çalıştırmak için
    db_logger = DBLogger()
    console_logger = ConsoleLogger()

    db_logger.write("Log 1")
    db_logger.open_connection()
    db_logger.write("Log 2")
    console_logger.write("Log 3")
    db_logger.write("Log 4")
    db_logger.close_connection()
    db_logger.write("Log 5")

    for message in db_logger.database.get_list():
        print(message)      
          
          