class Driver extends Account {
    constructor(name, document, email, password){
        super(name, document, email, password);
    }

    printDataDriver(){
        console.log(this.name)
        console.log(this.document)
    }
}