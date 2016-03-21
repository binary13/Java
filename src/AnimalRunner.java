/**
 * Created by justin on 3/20/2016.
 */
public class AnimalRunner {
    public static void main(String[] args) {
        Dog dog = new Dog("Yappie");

        dog.breathe();
        dog.eat();

        Parrot polly = new Parrot("Polly");
        polly.eat();
        polly.breathe();
        polly.fly();

        Penguin paul = new Penguin("Paul");
        paul.eat();
        paul.breathe();
        paul.fly();
    }
}
