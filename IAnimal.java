/**
 * IAnimal represents an animal, either a fish or a mammal
 * strings should not be empty and ints should not be negative
 *
 * @defines genus: aGenus
 *          species: aSpecies
 *          commonName: aName
 *          if Fish(
 *          fin: finCount
 *          )
 *          if Mammal(
 *          leg: legCount
 *          )
 *
 * @constraints commonName.length > 0 AND species.length > 0 and genus.length > 0
 *
 * @initialization_ensures an animal will have a commonName a species and a genus
 */
public interface IAnimal
{
    /**
     * returns the value of commonName
     *
     * @return commonName, a String
     *
     * @pre none
     *
     * @post
     *      getCommonName = commonName AND genus = #genus AND species = #species
     */
    public String getCommonName();

    /**
     * returns the value of genus
     *
     * @return genus, a String
     *
     * @pre none
     *
     * @post
     *      getGenus = genus AND commonName = #commonName AND species = #species
     */
    public String getGenus();

    /**
     * returns the value of species
     *
     * @return species, a String
     *
     * @pre none
     *
     * @post
     * getSpecies = species AND genus = #genus AND commonName = #commonName
     */
    public String getSpecies();

    /**
     * returns the description of the animal
     *
     * @return a combination of strings as a single String
     *
     * @pre none
     *
     * @post
     * getDescription = getCommonName() + properGenusFormatting + getSpecies()
     * commonName = #commonName AND genus = #genus AND species = #species
     */
    public default String getDescription(){
        String properGenusFormatting = getGenus().substring(0,1).toUpperCase() + getGenus().substring(1).toLowerCase();
        return getCommonName() + " (" + properGenusFormatting + " " + getSpecies().toLowerCase() + ")";
    }


}
