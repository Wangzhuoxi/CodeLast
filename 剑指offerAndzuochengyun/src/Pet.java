import java.util.LinkedList;
import java.util.Queue;

public class Pet {
   private String type;
        public Pet(String type) { this.type = type; }
        public String getPetType() { return this.type; }
    public class Dog extends Pet { public Dog() { super("dog"); } }
    public class Cat extends Pet { public Cat() { super("cat"); } }
    public class PetEnterType
    {
        private Pet pet;
        private int count;

        public PetEnterType(Pet pet, int count) {
            this.pet = pet;
            this.count = count;
        }

        public Pet getPet() {
            return pet;
        }

        public int getCount() {
            return count;
        }
        public String getpetType()
        {
            return this.pet.getPetType();
        }
    }
    public class CatDogQueue {
        private Queue<PetEnterType> dogs;
        private Queue<PetEnterType> cats;
        private int count;

        public CatDogQueue() {
            this.cats = new LinkedList<PetEnterType>();
            this.dogs = new LinkedList<PetEnterType>();
            this.count = 0;
        }

        private void add(Pet pet) {
            if (pet.getPetType() == "dog")
                dogs.add(new PetEnterType(pet, this.count++));
            if (pet.getPetType() == "cat")
                cats.add(new PetEnterType(pet, this.count++));
        }

        public Pet pollAll() {
            if (!dogs.isEmpty() && !cats.isEmpty()) {
                if (dogs.peek().getCount() > cats.peek().getCount())
                    return cats.poll().getPet();

                else {
                    return this.cats.poll().getPet();
                }
            } else if (!dogs.isEmpty()) {
                return this.dogs.poll().getPet();
            } else if (!this.cats.isEmpty()) {
                return this.cats.poll().getPet();
            } else {
                throw new RuntimeException("err, queue is empty!");
            }
        }


    }
}
