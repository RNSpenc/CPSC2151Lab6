/**
 *
 *
 * @defines the behaviors specific to mammals, extending the general animal behavior
 *
 * @constraints legCount >= 0
 *
 * @initialization_ensures that legcount is initiialized to 0
 */

public interface IMammal extends IAnimal
{
    /**
     * @return the number of legs a certain mammal may have
     */
    public int getLegCount();
}
