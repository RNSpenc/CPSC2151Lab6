/**
 *
 *
 * @defines
 *
 * @constraints
 *
 * @initialization_ensures
 */
public interface IFish extends IAnimal
{
    /**
     * returns the value of finCount
     *
     * @return finCount, an int
     *
     * @pre none
     * @post
     * getFinCount = finCount AND fincount = #finCOunt AND commonName = #commonName AND genus = #genus AND species = #species
     *
     */
    public int getFinCount();
}
