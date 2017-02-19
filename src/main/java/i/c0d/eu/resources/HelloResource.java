package i.c0d.eu.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloResource {

    private static final Logger log = LoggerFactory.getLogger(HelloResource.class);


    @GET
    public Response politeEndpoint(@QueryParam("name") String name) {
        log.info("politeEndpoint called with QueryParam %s", name);
        return Response.ok().entity(String.format("Hi %s!!!", name)).build();
    }

}
