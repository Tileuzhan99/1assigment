import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.example.Boxer;
import org.example.BoxingOrganization;
import org.example.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        Boxer boxer = context.getBean(Boxer.class);
        System.out.println("Boxer: " + boxer.getName() + ", Category: " + boxer.getWeightCategory());

      
        BoxingOrganization organization = context.getBean(BoxingOrganization.class);
        System.out.println("Organization: " + organization.getName() + ", Country: " + organization.getCountry());
    }
}
