public class Main {
    public static void main(String[] args) {
        BodyMassService service = new BodyMassService();
        int mass = 100;
        double height = 2.0;
        int index = service.calculate(mass, height);
        System.out.println(index);
    }
}