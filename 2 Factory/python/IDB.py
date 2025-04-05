from abc import ABC, abstractmethod

class IDB(ABC):
    @abstractmethod
    def select_data(self):
        pass

    @abstractmethod
    def insert_data(self):
        pass