from IDB import IDB

class MYSQL(IDB):
    def select_data(self):
        print("MYSQL veritabanından veri okundu.")

    def insert_data(self):
        print("MYSQL veritabanına veri yazıldı.")
