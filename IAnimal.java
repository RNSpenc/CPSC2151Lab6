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
     *
     */
    public String getCommonName();

    /**
     *
     *
     *
     */
    public String getGenus();

    /**
     *
     *
     *
     */
    public String getSpecies();

    /**
     *
     *
     *
     */
    public default String getDescription(){
        String properGenusFormatting = getGenus().substring(0,1).toUpperCase() + getGenus().substring(1).toLowerCase();
        return getCommonName() + " (" + properGenusFormatting + " " + getSpecies().toLowerCase() + ")";
    }


}
