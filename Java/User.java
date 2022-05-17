class User extends Account {
    public User(String name, String document, String email, String password){
        super(name, document, email, password);
    }

    void printDataUser(){
        System.out.println("Nombre :" + name + "\nCédula: " + document + "\nEmail: " + email + "\nContraseña: " + password);
    }
}
