package service;

import DAO.LoginDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginService {

    public boolean VerifyLogin (String user, String pass, String usertype) {
        boolean status = false;
        StringBuilder Query = new StringBuilder("select id from login where username =\"");
        Query.append(user);
        Query.append("\" and password =\"");
        Query.append(pass);
        Query.append("\" and usertype =\"");
        Query.append(usertype);
        Query.append("\"");
        System.out.println(Query);
        LoginDAO dao = new LoginDAO();
        status = dao.runquery(Query.toString());
        return status;
    }
}
