package at.aiti.example;

import fish.payara.micro.cdi.Inbound;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class RemoteEventReceiverWeb {
    
    public void init(@Observes @Initialized(ApplicationScoped.class) Object init) {
        System.out.println("ReceiverEAR - RemoteEventReceiverWeb.init");
    }
    
    public void receiveEvent(@Observes @Inbound(eventName = "testEvent") String payload) {
        System.out.println("ReceiverEAR - RemoteEventReceiverWeb.receiveEvent payload: " + payload);
    }
    
}
