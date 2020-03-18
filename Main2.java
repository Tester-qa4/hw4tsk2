public class Main2 {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 70;
        float height = 1.7f;
        float bmi = service.calculate(weight, height);
        System.out.println("Индекс массы тела =  " + bmi);
    }
}
