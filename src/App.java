import codeblocks.Person;
import enumeration.Continents;
import enumeration.Days;

public class App {
    public static void main(String[] args) throws Exception {
        // ENUMS
        // Days enum
        System.out.println("-------------------- ENUMS --------------------");
        System.out.println("Day -> " + Days.MONDAY);
        indicateDay(Days.FRIDAY);
        // Continents enum
        System.out.println("\nContinent 4 -> " + Continents.AMERICA + ", number of countries -> " + Continents.AMERICA.getCountries());
        printContinents();

        // Code blocks
        System.out.println("-------------------- CODE BLOCKS --------------------");
        Person p1 = new Person();
        int idPerson = p1.getIdPerson();
        System.out.println("idPerson = " + idPerson);

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

    public static void printContinents(){
        for (Continents c : Continents.values()) {
            System.out.println("Continents -> " + c + " have to " + c.getCountries() + " countries");
        }
    }
}
