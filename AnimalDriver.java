import java.util.ArrayList;
import java.util.List;

public class AnimalDriver {

    public static void main(String[] args) {
        IAnimal human = new Mammal("Human", "Homo", "sapiens", 2);
        IAnimal wideBandAnemonefish = new Fish("wide-band anemonefish", "Amphiprion", "latezonatus", 8);

        IAnimal cat = new Mammal("house cat", "Felis", "Catus", 4);
        IAnimal shark = new Fish("great white shark", "Carcharodon", "carcharias", 5);

        List<IAnimal> myAnimals = new ArrayList<>();

        myAnimals.add(human);
        myAnimals.add(wideBandAnemonefish);
        myAnimals.add(cat);
        myAnimals.add(shark);

        //Do not change anything above this line------------------------------------------------------------------------

        //Print descriptions of each animal
        for(IAnimal animal : myAnimals){
            System.out.println(animal.getDescription());
        }

        int totalLegs = 0;
        int totalFins = 0;

        for (IAnimal animal : myAnimals) {
            if (animal instanceof IFish) {
                totalFins += ((IFish) animal).getFinCount();
            }
            else if (animal instanceof IMammal) {
                totalLegs += ((IMammal) animal).getLegCount();
            }
        }

        System.out.println("Total number of fins: " + totalFins);
        System.out.println("Total number of legs: " + totalLegs);

    }
}
