package TestSkill2;

public class CheckIDandPass {
    private String id;
    private String password;
    String rightID = "quanli";
    String rightPasswords = "12345";

    public CheckIDandPass(String enterId, String enterPassword){
        this.id = enterId;
        this.password = enterPassword;
    }

    public  boolean IsAccount(){
        if (this.id.equals(rightID)){
            return true;
        }else
            return false;
    }
    public boolean IsPasswords(){
        if (this.password.equals(rightPasswords)){
            return true;
        }else
            return false;
    }
}
