public class Shelter {
    public static void main(String[] args) {
        Dog millie = new Dog();
        millie.setName("Millie");
        millie.setAge(3);
        millie.setBreed("beagle");
        System.out.println("This here dog is named " + millie.getName() + "! She is " + millie.getAge()
                + " year(s) old, and she is a " + millie.getBreed()
                + ". She is super cute, and you should totally adopt her :D");
    }
}
