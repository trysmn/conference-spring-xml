import com.conference.service.SpeakerService;
import com.conference.service.SpeakerServiceImplementation;

public class Application {
    public static void main(String[] args) {
        SpeakerService speakerService = new SpeakerServiceImplementation();

        System.out.println(speakerService.findAll().get(0).getFirstName());
        System.out.println(speakerService.findAll().get(0).getLastName());
    }
}
