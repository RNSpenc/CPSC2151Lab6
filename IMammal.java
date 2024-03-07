/**
 * IMammal creates an interface to describe different mammal, such as the number of
 * legs a certain mammal has
 *
 * @defines leg: legCount
 *
 * @constraints legCount >= 0
 *
 * @initialization_ensures mammal has a legCount, name, species and genus when initialized
 */
public interface IMammal extends IAnimal
{
    /**
     * returns the value of legCount
     *
     * @return legCount, an int
     *
     * @pre none
     * @post
     * getlegCount = legCount AND legCount = #legCount AND commonName = #commonName AND genus = #genus AND species = #species
     *
     */
    public int getLegCount();
}