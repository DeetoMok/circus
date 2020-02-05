public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        System.out.println(d.speak());
        Bird b = (Bird)d;  // upcasting
        Animal a = (Animal)b; // upcasting
        System.out.println(a.speak());
        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
         train(new Parrot());     //this will run an error since parrot cannot be casted to a duck
//        Animal a2 = new Animal();
//        Bird b2 = new Bird();
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;       //bird must be converted into a duck first for the bird to swim
            d.swim();
        }
    }
}
