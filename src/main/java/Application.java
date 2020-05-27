import com.conference.service.SpeakerService;
import com.conference.service.SpeakerServiceImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SpeakerService speakerService = applicationContext.getBean("speakerService", SpeakerService.class);

        System.out.println(speakerService.findAll().get(0).getFirstName());
        System.out.println(speakerService.findAll().get(0).getLastName());
    }
}
