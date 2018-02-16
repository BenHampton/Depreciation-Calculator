
package bussines;

/**
 *
 * @author Ben Hampton
 */
public class AssetSYD extends Asset{
    private double[] anndep, begbal, endbal, annrate;
    boolean built;
    
    public AssetSYD(){
        super();
        this.built = false;
    }
    public AssetSYD(String nm, double c, double s, int lf){
        super(nm, c, s, lf);
        if(super.isValid()){
            build();
        }
    }
    public void build(){
        if(!super.isValid()){
            this.built = false;
        } else {
            try{
                this.begbal = new double[super.getLife()];
                this.endbal = new double[super.getLife()];
                this.anndep = new double[super.getLife()];
                this.annrate = new double[super.getLife()];

                double depStraight = (super.getCost() - super.getSalvage()) / super.getLife();
                int syd = this.getLife() * ( this.getLife() + 1 ) / 2;
                
                this.begbal[0] = super.getCost();
                this.annrate[0] = super.getLife();

                for (int i = 0; i < super.getLife(); i++){
                    if (i > 0){
                        this.begbal[i] = this.endbal[i-1];
                        this.annrate[i] = super.getLife();
                    }
                    
                    double depRate = (this.annrate[i] - i) / syd;
                    
                    this.begbal[i] = this.begbal[i] - this.anndep[i];
                    this.anndep[i] = (this.begbal[0] - super.getSalvage()) * depRate;
                    this.endbal[i] = this.begbal[i] - this.anndep[i];
                    this.annrate[i] = depRate;
                }
                this.built = true;
            } catch (Exception e){
               super.setErrorMessage("Build error: " + e.getMessage());
               this.built = false;
           }
        } 
    }// end of build
    @Override
    public double getBegBal(int year){
        if(!built){
            build();
            if(!built){
                return -1;
            }
        } 
        return this.begbal[year - 1];
    }
    @Override
    public double getAnnDep(int year){
        if(!built){
            build();
            if(!built){
                return -1;
            }
        } 
        return this.anndep[year - 1];
    }
    @Override
    public double getEndBal(int year){
        if(!built){
            build();
            if(!built){
                return -1;
            }
        } 
        return this.endbal[year - 1];
    }
    public double getAnnRate(int year){
        if(!built){
            build();
            if(!built){
                return -1;
            }
        } 
        return this.annrate[year - 1];
    }
}
