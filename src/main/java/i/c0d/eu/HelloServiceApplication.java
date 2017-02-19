package i.c0d.eu;

import i.c0d.eu.resources.HelloResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloServiceApplication extends Application<HelloServiceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "helloService";
    }

    @Override
    public void initialize(final Bootstrap<HelloServiceConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HelloServiceConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(HelloResource.class);
    }

}
