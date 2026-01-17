import templates.Template;
import templates.TemplateImpl;
import templates.TemplateImpl2;

public class Main {
    public static void main(String[] args) {

        Template template = new TemplateImpl();
        System.out.println(template.perform(2,5));
        template = new TemplateImpl2();
        System.out.println(template.perform(2,5));

    }
}
