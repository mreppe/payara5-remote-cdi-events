package at.aiti.example;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author reppe
 */
@Stateless
@Path("test")
public class TestResource {
    
    @Inject
    RemoteEventSender remoteEventSender;
    
    @GET
    public void test() {
        remoteEventSender.send();
    }
    
}
