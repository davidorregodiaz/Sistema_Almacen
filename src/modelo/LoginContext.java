package modelo;

public class LoginContext{
     private VerifyUser strategy;
     
     
     public void setVerifyUser(VerifyUser strategy){
            this.strategy = strategy;
     }
    public Boolean executeLogin(String username, String password){
        return strategy.verifyUser(username,password);
     }
    
}