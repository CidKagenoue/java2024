import org.eclipse.jetty.ee10.servlet.ServletContextHandler;
import org.eclipse.jetty.ee10.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.eclipse.jetty.server.Server;

public class JettyServer {
    private Server server;

    public void start() {
        server = new Server(8000);

        // Configure Jersey ResourceConfig
        ResourceConfig config = new ResourceConfig();
        config.packages("controller"); // Replace with your package containing REST controllers

        // Setup Jetty ServletContextHandler
        ServletContextHandler handler = new ServletContextHandler();
        ServletHolder servletHolder = new ServletHolder(new ServletContainer(config));
        servletHolder.setInitOrder(0);
        servletHolder.setInitParameter("jersey.config.server.provider.packages", "controller");
        handler.addServlet(servletHolder, "/*"); // Map to root for better flexibility
        server.setHandler(handler);

        try {
            server.start();
            System.out.println("Server started at http://localhost:8000");
            server.join();
        } catch (Exception e) {
            System.err.println("Error starting server: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void stop() {
        if (server != null) {
            try {
                server.stop();
                System.out.println("Server stopped successfully.");
            } catch (Exception e) {
                System.err.println("Error stopping server: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}