package enumeration;

public enum Continents {
    AFRICA(53),
    EUROPE(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    // Countrys atribute
    private final int countries;

    // Constructor of each element of the numbering
    Continents(int countries){
        this.countries = countries;
    }

    public int getCountries(){ return this.countries;}

}
