class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        // Car car = new Car("AMQ123", new Driver("Steven Mendez", "10101010", "user@mail.com", "*******"));
        // car.passenger = 4;
        // car.printDataCar();

        // Driver driver = new Driver("Steven Mendez", "10101010", "driver@mail.es", "*******");
        // driver.printDataDriver();

        // UberX uberX = new UberX("ABC123", new Driver("Cristian", "222222", "driver@mail.es", "*******"), "Toyota", "Hilux");
        // uberX.setPassenger(4);
        // uberX.printDataCar();

        UberVan uberVan = new UberVan("EFG123", new Driver("Steven Mendez", "10101010", "driver@mail.es", "*******"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}