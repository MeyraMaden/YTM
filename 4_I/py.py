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
        

    
    
            
          
          