package foreach;

public class FePerson{
    private final int idPerson;
    private String name;
    private static int countPersons;

    public FePerson(String name){
        this.idPerson = ++countPersons;
        this.name = name;
    }

    // Getters
    public String getName(){ return this.name;}

    // Setters
    public void setName(String name){
        this.name = name;
    }
}

