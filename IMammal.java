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
     * @return the number of legs a certain mammal may have
     */
    public int getLegCount();
}