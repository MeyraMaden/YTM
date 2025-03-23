
import __main__
from Kullanici import Kullanici
from Bildirim import Bildirim
from Iletisim import Iletisim
from Mail import Mail
from Haber import Haber

if __name__== '__main__':
    kullanici=Kullanici("meyra","meyra@gmail.com","616100","0545 464 7253")
    haber=Haber()
    haber.bilgilendir(kullanici, "deneme mesajidir.")
