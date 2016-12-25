package warmigration.external;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/noauth")
public class ExternalNoAuthResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response simpleRequest() {
        System.out.println("bah");
        return Response.ok("Looks good without auth").build();
    }

}