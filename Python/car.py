from account import Account

class Car:
    id          = int
    license     = str
    driver      = Account
    passenger   = int

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver

    def print_dates(self):
        print(f'El conductor {self.driver.name} tiene la placa {self.license} y el número de identificación {self.driver.document}')
