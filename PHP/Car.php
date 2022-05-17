<?php
require_once('Account.php');
class Car {
    public $id;
    public $license;
    public $driver;
    public $passengers;

    public function __construct($license, $driver){
        $this->driver = $driver;
        $this->license = $license;     
    }

    public function printDataCar() {
        echo "Licencia: $this->license Driver: ".$this->driver->name;
    }
}
?>