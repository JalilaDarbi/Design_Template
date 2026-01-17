package templates;

public class TemplateImpl  extends Template{

    @Override
    public int param1() {
        return 7;
    }

    @Override
    public double compute(int a, int b) {
        return Math.pow(a,b);
    }
}
