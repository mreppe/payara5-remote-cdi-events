package at.aiti.example;

import fish.payara.micro.cdi.Inbound;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;

/**
 *
 * @author reppe
 */
@ApplicationScoped
public class RemoteEventReceiver {
    
    public void init(@Observes @Initialized(ApplicationScoped.class) Object init) {
        System.out.println("ReceiverWarWithEJB - RemoteEventReceiver.init");
    }
    
    public void receiveEvent(@Observes @Inbound(eventName = "testEvent") String payload) {
        System.out.println("ReceiverWarWithEJB - RemoteEventReceiver.receiveEvent payload: " + payload);
    }
    
}
