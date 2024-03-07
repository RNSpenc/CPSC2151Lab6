/**
 *
 *
 * @defines getFinCount as an extension of IFish
 *
 * @constraints finCount >= 0
 *
 * @initialization_ensures that getFinCount is implemented as an extension of IFish
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
     * getFinCount = finCount AND finCount = #finCOunt AND commonName = #commonName AND genus = #genus AND species = #species
     *
     */
    public int getFinCount();
}
