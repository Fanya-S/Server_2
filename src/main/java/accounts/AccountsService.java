package accounts;

import java.util.HashMap;
import java.util.Map;

public class AccountsService {
    private final Map<String, UserProfile> loginToProfile;
    private final Map<String, UserProfile> sessionIdProfile;

    public AccountsService() {
        loginToProfile = new HashMap<String, UserProfile>();
        sessionIdProfile = new HashMap<String, UserProfile>();
    }

    public void addNewUser(UserProfile userProfile) {
        loginToProfile.put(userProfile.getLogin(), userProfile);
    }

    public UserProfile getUserByLogin(String login) {
        return loginToProfile.get(login);
    }

    public UserProfile getUserBySessionId(String sessionId) {
        return sessionIdProfile.get(sessionId);
    }

    public void addSession(String sessionId, UserProfile userProfile) {
        sessionIdProfile.put(sessionId, userProfile);
    }

    public void deleteSession(String sessionId) {
        sessionIdProfile.remove(sessionId);
    }
}
