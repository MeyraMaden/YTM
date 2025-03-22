
class Kullanici:
    def __init__(self,isim=None ,mail=None,ip=None, tel=None):
        self.isim= isim
        self.mail= mail
        self.ip= ip
        self.tel= tel
    
    def getIsim(self):
        return self.isim
    def setIsim(self,isim):
        self.isim=isim

    def getMail(self):
        return self.mail
    def SetMail(self,mail):
        self.mail=mail
    
    def getIp(self):
        return self.ip
    def setIp(self,ip):
        self.ip=ip
    
    def getTel(self):
        return self.tel
    def setTel(self,tel):
        self.tel=tel

