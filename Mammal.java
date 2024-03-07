
/**
 *
 *
 * @invariant commonName.length > 0 AND genus.length > 0 AND species.length > 0 AND legCount >= 0
 *
 * @corresponds
 *
 */
public class Mammal implements IMammal{

    private String commonName;
    private String genus;
    private String species;
    private int legCount;

    /**
     *
     *
     */
    public Mammal(String aCommonName, String aGenus, String aSpecies, int aLegCount)
    {
        commonName = aCommonName;
        genus = aGenus;
        species = aSpecies;
        legCount = aLegCount;
    }

    public String getGenus()
    {
        return genus;
    }

    public String getSpecies()
    {
        return species;
    }

    public String getCommonName()
    {
        return commonName;
    }

    public int getLegCount()
    {
        return legCount;
    }
}
