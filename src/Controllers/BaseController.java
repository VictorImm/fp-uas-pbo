package Controllers;

import Helpers.Session;
import Libraries.PanitiaApi;

public class BaseController {
    Session session = new Session();
    PanitiaApi panitiaApi = new PanitiaApi();
}
