package at.aiti.example;

import fish.payara.micro.cdi.Outbound;
import java.util.UUID;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;

/**
 *
 * @author reppe
 */
@ApplicationScoped
public class RemoteEventSender {    

    @Inject
    @Outbound(eventName = "testEvent", loopBack = true)
    Event<String> testEvent;
    
    public void send() {
        String uuid = UUID.randomUUID().toString();
        System.out.println("Sending payload: " + uuid);
        testEvent.fire(uuid);
    }
    
}
