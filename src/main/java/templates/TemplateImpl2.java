package templates;

public class TemplateImpl2 extends Template{

    @Override
    public int param1() {
        return 9;
    }

    @Override
    public double compute(int a, int b) {
        return Math.sqrt(a)*5;
    }
}
