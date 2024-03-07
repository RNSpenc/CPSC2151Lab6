
/**
 *
 *
 * @invariant commonName.length > 0 AND genus.length > 0 AND species.length > 0 AND legCount >= 0
 *
 * @corresponds commonName = commanName; genus = genus; species = species; legCount = legCount
 *
 */
public class Mammal implements IMammal{

    private String commonName;
    private String genus;
    private String species;
    private int legCount;

    /**
     * the parameterized constructor for the Mammal object
     *
     * @param aCommonName: the common name of the mammal, a string
     * @param aLegCount: the fin count of the mammal, an int
     * @param aGenus: the Genus of the mammal, a string
     * @param aSpecies: the species of the mammal, a string
     *
     * @pre
     * aCommonName.length > 0 AND aGenus.length > 0 AND aSpecies.length > 0 AND aLegCount > 0
     *
     * @post
     * this.commonName = aCommonName AND this.genus = aGenus AND this.species = aSpecies AND this.legCount = aLegCount
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
