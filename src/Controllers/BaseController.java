package Controllers;

import Helpers.Session;
import Libraries.PanitiaApi;

public class BaseController {
    protected Session session;
    protected PanitiaApi panitiaApi = new PanitiaApi();
}
