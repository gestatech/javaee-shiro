package id.swhp.javaee.shiro.presentation;

import java.io.IOException;
import javax.enterprise.inject.Model;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;

/**
 * @Model is shortcut for @Named and @RequestScoped.
 * 
 * @author Sukma Wardana
 * @since 1.0.0
 */
@Model
public class Login {

    public static final String HOME_URL = "index.xhtml";

    private String username;
    private String password;
    private boolean remember;

    public void submit() throws IOException {
        try {
            SecurityUtils.getSubject().login(new UsernamePasswordToken(username, password, remember));
            SavedRequest savedRequest = WebUtils.getAndClearSavedRequest(Faces.getRequest());
            Faces.redirect(savedRequest != null ? savedRequest.getRequestUrl() : HOME_URL);
        } catch (AuthenticationException e) {
            Messages.addGlobalError("Unknown user, please try again!");
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRemember() {
        return remember;
    }

    public void setRemember(boolean remember) {
        this.remember = remember;
    }
}
