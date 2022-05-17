class UberX extends Car {
    String brand;
    String model;

    public UberX(String license, Driver driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
    // void printDataUserX(){
    //     System.out.println("Nombre :" + driver.name + "\nVehículo: " + brand + "\nModelo: " + model + "\nPlaca: " + license + "\nCantidad de pasajeros: ");
    // }
    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: "+ model + " Marca: " + brand);
    }
}

