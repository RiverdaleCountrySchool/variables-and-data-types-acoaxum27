public class EonsCalc {
    public static void main(String[] args) {

        long ageOfUniverse = Long.valueOf (args[0]);
        long yearsSinceDinosaurs = Long.valueOf (args[1]);
        long universeSinceDinosaurs = ageOfUniverse-yearsSinceDinosaurs;

        System.out.println ("The universe was " + universeSinceDinosaurs + " years old when Dinosaurs went extinct");
    }
}
