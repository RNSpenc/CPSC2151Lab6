/**
 * IFish extends IMammal to allow for the inclusion of the unique function getFinCount
 *
 * @defines fin: finCount
 *
 * @constraints finCount >= 0
 *
 * @initialization_ensures fish will have a finCount, name, genus, and species when initialized
 */
public interface IFish extends IAnimal
{
    /**
     * returns the value of finCount
     *
     * @return finCount, an int
     *
     * @pre none
     *
     * @post
     * getFinCount = finCount AND finCount = #finCount AND commonName = #commonName AND genus = #genus AND species = #species
     *
     */
    public int getFinCount();
}
