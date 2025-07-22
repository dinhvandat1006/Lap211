package week8.baitap2;

public class EastAsiaCountry extends Country {
    private String countryTerrain;

    public EastAsiaCountry(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public void display() {
        System.out.printf("%-10s %-20s %-10.2f %-20s\n", countryCode, countryName, totalArea, countryTerrain);
    }
}
