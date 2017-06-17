package id.swhp.javaee.shiro.presentation;

import java.io.IOException;
import javax.enterprise.inject.Model;
import org.apache.shiro.SecurityUtils;
import org.omnifaces.util.Faces;

/**
 * @Model is shortcut for @Named and @RequestScoped.
 * 
 * @author Sukma Wardana
 * @since 1.0.0
 */
@Model
public class Logout {

    public static final String HOME_URL = "login.xhtml";

    public void submit() throws IOException {
        SecurityUtils.getSubject().logout();
        Faces.invalidateSession();
        Faces.redirect(HOME_URL);
    }
}
