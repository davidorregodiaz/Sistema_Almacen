package modelo;

public class LoginService {
    LoginContext loginContext;
    
    public LoginService(){
        loginContext = new LoginContext();
    }
    
    public Boolean loginAsAdmin(String username, String password){
        this.loginContext.setVerifyUser(new AdminStrategy(username, password));
        return this.loginContext.executeLogin(username, password);
    }
}