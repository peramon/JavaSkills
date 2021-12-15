package codeblocks;

public class Person {
    private final int idPerson;
    private static int countPersons;

    // Code block static
    static{
        countPersons = 10;
        // Not use static vars
        // idPerson = 12;
        System.out.println("Execute static block");
    }


    // No static block
    {
        System.out.println("Execute no static block");
        this.idPerson = ++countPersons;
    }

    public Person(){
        System.out.println("Execute constructor");
    }

    public int getIdPerson(){
        return this.idPerson;
    }
}
