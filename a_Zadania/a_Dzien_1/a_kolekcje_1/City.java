package a_Zadania.a_Dzien_1.a_kolekcje_1;

public class City {
    private String name;
    private Integer population;

    public City(String name, Integer population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
