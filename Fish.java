
/**
 * Defines the fish object.
 *
 * @invariant
 * commonName.length > 0 AND genus.length > 0 AND species.length > 0 AND finCount > 0
 *
 * @corresponds
 *
 */
public class Fish implements IFish {

    private String commonName;
    private String genus;
    private String species;
    private int finCount;

    /**
     * the parameterized constructor for the Fish object
     *
     * @param aCommonName: the common name of the fish, a string
     * @param aFinCount: the fin count of the fish, an int
     * @param aGenus: the Genus of the fish, a string
     * @param aSpecies: the species of the fish, a string
     *
     * @pre
     * aCommonName.length > 0 AND aGenus.length > 0 AND aSpecies.length > 0 AND aFinCount > 0
     *
     * @post
     * this.commonName = aCommonName AND this.genus = aGenus AND this.species = aSpecies AND this.finCount = aFinCount
     *
     *
     */
    public Fish(String aCommonName, String aGenus, String aSpecies, int aFinCount)
    {
        commonName = aCommonName;
        genus = aGenus;
        species = aSpecies;
        finCount = aFinCount;
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

    public int getFinCount()
    {
        return finCount;
    }
}
