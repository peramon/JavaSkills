package poo;

public class Alumno {
    int id;
    String name;
    String last_name;

    // Getters
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getKLastName() {
        return this.last_name;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    // Methods
    public void showName() {
        System.out.println("Alumno: " + id + ", Nombre: " + name + last_name);
    }
}
