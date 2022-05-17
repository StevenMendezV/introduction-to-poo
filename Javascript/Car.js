class Car {
    constructor(license, driver) {
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }
    printDataCar() {
        console.table(this.driver);
        console.log(this.driver.name);
        console.log(this.license);
    }
}

