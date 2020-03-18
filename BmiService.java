public class BmiService {
    public float calculate(int weight, float height) {
        float squareHeight = height * height;
        float bmi = weight / squareHeight;
        return bmi;
    }

}
