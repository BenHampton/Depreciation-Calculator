
package bussines;

/**
 *
 * @author Ben Hampton
 */
public class AssetSL extends Asset{
    private double[] begbal, endbal;
    private double anndep;
    private boolean built;
    
    public AssetSL(){
        super();
        built = false;
    }
    public AssetSL(String nm, double c, double s, int lf){
        super(nm, c, s, lf);
        if(super.isValid()){
            build();
        }
    }
    private void build(){
        if(!super.isValid()){
            this.built = false;
        } else {
            try{
                this.begbal = new double[super.getLife()];
                this.endbal = new double[super.getLife()];

                this.anndep = (super.getCost() - super.getSalvage()) / super.getLife();

                this.begbal[0] = super.getCost();

                for (int i = 0; i < super.getLife(); i++){
                    if (i > 0){
                        this.begbal[i] = this.endbal[i-1];
                    }

                    this.endbal[i] = this.begbal[i] - this.anndep;

                }
                this.built = true;
            } catch (Exception e){
               super.setErrorMessage("Build error: " + e.getMessage());
               this.built = false;
           }
        }     
    } // end of build
    
    @Override
    public double getAnnDep(int year){
        if(!this.built){
            build();
            if(!this.built){
                return -1;
            }
        }
        
        return anndep;
    }
    
    @Override
    public double getBegBal(int year){
        if(!this.built){
            build();
            if(!this.built){
                return -1;
            }
        }
        if(year < 1 || year > super.getLife()){
            super.setErrorMessage("Illegal year requested: " + year);
            return -1;
        }
        return begbal[year-1];
    }
    
    @Override
    public double getEndBal(int year){
        if(!this.built){
            build();
            if(!this.built){
                return -1;
            }
        }
        if(year < 1 || year > super.getLife()){
            super.setErrorMessage("Illegal year requested: " + year);
            return -1;
        }
        return endbal[year-1];
    }
}