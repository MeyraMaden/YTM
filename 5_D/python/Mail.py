from Iletisim import Iletisim
from Kullanici import Kullanici
from abc import ABC,abstractmethod

class Mail(Iletisim):
    
    def bildirimGoster(self,mail,mesaj):
        print(f"{mail} adresine {mesaj} gönderildi")
   
    def bilgiGonder(self,kullanici,mesaj):
        self.bildirimGoster(kullanici.getMail(),mesaj)
     
    
        
