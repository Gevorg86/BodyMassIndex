public class BodyMassService {

    public int calculate(int mass, double height) {
        double result = mass / (height * height);
        return (int) result;

    }
}

