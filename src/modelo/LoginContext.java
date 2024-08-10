package modelo;

public class LoginContext{
     private Strategy strategy;
     
     
     public void setVerifyUser(Strategy strategy){
            this.strategy = strategy;
     }
    public Boolean executeLogin(String username, String password){
        return strategy.verifyUser(username,password);
     }
    
}