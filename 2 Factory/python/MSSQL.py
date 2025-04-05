from IDB import IDB

class MSSQL(IDB):
    def select_data(self):
        print("MSSQL veritabanından veri okundu.")

    def insert_data(self):
        print("MSSQL veritabanına veri yazıldı.")