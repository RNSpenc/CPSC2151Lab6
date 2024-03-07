/**
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
 * @constraints The strings cannot be empty and fin and leg cannot be less than 0
 *
 * @initialization_ensures an animal will have a name a species and a genus then if fish it will have a fin count and if it is a Mammal it will have a leg count
 */
public interface IAnimal
{
    /**
     * returns the value of commonName
     *
     * @return commonName, a String
     *
     * @pre commonName != NULL
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
     * @pre genus != NULL
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
     * @pre species != NULL
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
     * @pre string != NULL
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
