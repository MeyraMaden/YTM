from Iletisim import Iletisim
from Mail import Mail
from Bildirim import Bildirim

class Haber:
    def __init__(self):
        self.iletisimListesi=[]
        self.mail=Mail()            #ordaki bilgiyi alıp burda kullanıyorum ilişki
        self.bildirim=Bildirim()
        self.iletisimListesi.append(self.mail)
        self.iletisimListesi.append(self.bildirim)      #javada add işlemi

    def bilgilendir(self,kullanici,mesaj):
        for iletisim in self.iletisimListesi:
            iletisim.bilgiGonder(kullanici, mesaj)

     

    