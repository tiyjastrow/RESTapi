import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.*;

/**
 * Created by johnjastrow on 4/20/16.
 */
public class UserController {
    public UserController(final UserService userService) {

        get("/users", new Route() {
            @Override
            public Object handle(Request request, Response response) {
                // process request
                return userService.getAllUsers();
            }
        });

        // more routes
    }
}
