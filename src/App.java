import foreach.FePerson;
import poo.Alumno;

import codeblocks.Person;
import enumeration.Continents;
import enumeration.Days;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * // ENUMS
         * // Days enum
         * System.out.println("-------------------- ENUMS --------------------");
         * System.out.println("Day -> " + Days.MONDAY);
         * indicateDay(Days.FRIDAY);
         * // Continents enum
         * System.out.println("\nContinent 4 -> " + Continents.AMERICA +
         * ", number of countries -> " + Continents.AMERICA.getCountries());
         * printContinents();
         * 
         * // Code blocks
         * System.out.println("-------------------- CODE BLOCKS --------------------");
         * Person p1 = new Person();
         * int idPerson = p1.getIdPerson();
         * System.out.println("idPerson = " + idPerson);
         * 
         * // Code blocks
         * System.out.println("-------------------- FOR EACH--------------------");
         * // Array
         * int ages[] = {23,22,56};
         * for(int age:ages){
         * System.out.println("Age -> " + age);
         * }
         * // Object
         * FePerson fe_persons[] = {new FePerson("Juan"), new FePerson("Pedro")};
         * for(FePerson fe_person: fe_persons){
         * String name = fe_person.getName();
         * System.out.println("Name person -> " + name);
         * }
         */

        // Java Arrays
        System.out.println("-------------------- POO --------------------");
        Alumno alumno = new Alumno();
        alumno.setName("Paul");
        alumno.setLastName("Ramon");
        alumno.setId(25);
        alumno.showName();

        System.out.println("\n-------------------- Cadenas --------------------");

        // Crt + Alt + N
        // Substring
        String frase = "Hoy es un buen dia para aprender Java";
        String frase_extracto = frase.substring(frase.length() - 13, frase.length());
        System.out.println(frase_extracto + "para aprovechar el tiempo al 100%");

        // Equals
        String alumno1, alumno2;
        alumno1 = "David";
        alumno2 = "DavId";

        System.out.println(alumno1.equals(alumno2));
        System.out.println(alumno1.equalsIgnoreCase(alumno2));

        System.out.println("\n-------------------- APIS --------------------");

    }

    public static void indicateDay(Days days) {
        switch (days) {
            case MONDAY:
                System.out.println("Fifth day of the week");
                break;
            case TUESDAY:
                System.out.println("Fifth day of the week");
                break;
            case WENESDAY:
                System.out.println("Fifth day of the week");
                break;
            case THURSDAY:
                System.out.println("Fifth day of the week");
                break;
            case FRIDAY:
                System.out.println("Fifth day of the week");
                break;
            case SATURDAY:
                System.out.println("Fifth day of the week");
                break;
            case SUNDAY:
                System.out.println("Fifth day of the week");
                break;
        }
    }

    public static void printContinents() {
        for (Continents c : Continents.values()) {
            System.out.println("Continents -> " + c + " have to " + c.getCountries() + " countries");
        }
    }
}
