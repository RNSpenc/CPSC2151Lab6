/**
 * IMammal creates an interface to describe different mammal, such as the number of
 * legs a certain mammal has
 *
 * @defines the behaviors specific to mammals, extending the general animal behavior
 *
 * @constraints legCount >= 0
 *
 * @initialization_ensures that legCount is initialized to 0
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