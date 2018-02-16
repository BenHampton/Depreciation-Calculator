
package bussines;

/**
 *
 * @author Ben Hampton
 */
abstract public class Asset {
    private String name, emsg;
    private double cost, salvage;
    private int life;
    //double[][] begbal, anndep, endbal;
    //private boolean built;
    
    public Asset(){
        this.name = "";
        this.emsg = "";
        this.cost = 0;
        this.salvage = 0;
        this.life = 0;
        //this.built = false;
    }
    
    public Asset(String nm, double c, double s, int lf){
        this.name = nm;
        this.cost = c;
        this.salvage = s;
        this.life = lf;
        //this.built = false;
        this.emsg = "";
        if (isValid()){
            //buildAsset();
        }
    }
        protected boolean isValid(){
        this.emsg = "";
        
        if(this.name.isEmpty()){
            this.emsg += "Invaild Asset name entry";
        }
        if (this.cost <= 0){
            this.emsg += "Cost must be a positve value";
        }
        if (this.salvage >= this.cost){
            this.emsg += "Salvage is not less than cost";
        }
        if (this.salvage <= 0){
            this.emsg += "Salvage is not positve";
        }
        if (this.life <= 0){
            this.emsg += "Life can not be negative";
        }
        return this.emsg.isEmpty();
    }
    public String getName(){
        return this.name;
    }
    
    public double getCost(){
        return this.cost;
    }
    
    public double getSalvage(){
        return this.salvage;
    }
    
    public int getLife(){
        return this.life;
    }
    
    public String getErrorMessage(){
        return emsg;
    }
    
    protected void setErrorMessage(String emsg){
        this.emsg = emsg;
    }
    abstract public double getBegBal(int year);
    abstract public double getAnnDep(int year);
    abstract public double getEndBal(int year);
}
