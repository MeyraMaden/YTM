from Iletisim import Iletisim
from Kullanici import Kullanici
from abc import ABC,abstractmethod

class Bildirim(Iletisim):
    
    def bildirimGoster(self,ip,mesaj):
        print(f"{ip} adresine {mesaj} gönderildi")
        

    def bilgiGonder(self,kullanici,mesaj):
        self.bildirimGoster(kullanici.getIp(),mesaj)
     
    
        