from abc import ABC,abstractmethod

class Iletisim(ABC):
    @abstractmethod           
    def bilgiGonder(self,kullanici,mesaj):
        pass
    
    