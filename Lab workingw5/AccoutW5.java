public class AccoutW5{
    private double bath;
    public AccoutW5(double money){
        if(money>=0){
            bath = money;
        }
    }
    public void credit(double money){
        bath = bath + money;
    }
    public void withdrawal(double money){
        if(bath>money){
            bath = bath - money;
        }else{
            System.out.println("Debit amount exceeded account balance.");
        }
    }
    public double getBalance(){
        return bath;
    }

}