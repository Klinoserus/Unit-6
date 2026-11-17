public class Octopus {
    int tentacles = 8;

    public static void main(String[] args) {
        Octopus octobuddy = new Octopus();
        System.out.println(octobuddy.tentacles);
        octobuddy.tentacles = octobuddy.tentacles - 2;
        System.out.println(octobuddy.tentacles);
    }
}
