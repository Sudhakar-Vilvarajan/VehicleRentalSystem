package service;

import DAO.SqlDAO;

import java.sql.ResultSet;

public class LoginService {

    public Boolean verifylogin (String user, String pass, String usertype){
        Boolean status = false;
        StringBuilder Query =new StringBuilder("select id from login where username =\"");
        Query.append(user);
        Query.append("\" and password =\"");
        Query.append(pass);
        Query.append("\" and usertype =\"");
        Query.append(usertype);
        Query.append("\"");
        System.out.println(Query);
        SqlDAO dao = new SqlDAO();
        ResultSet result = dao.runquery(Query.toString());
        if(result!=null)
        {
            status=true;
        }
        return status;
    }
}
