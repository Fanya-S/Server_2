package servlets;

import accounts.AccountsService;
import accounts.UserProfile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignUpServlet extends HttpServlet {
    private final AccountsService accountsService;

    public SignUpServlet(AccountsService accountsService) {
        this.accountsService = accountsService;
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String pass = req.getParameter("pass");

        accountsService.addNewUser(new UserProfile(login, pass, login));


    }
}
