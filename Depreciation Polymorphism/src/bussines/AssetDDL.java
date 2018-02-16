
package bussines;

/**
 *
 * @author Ben Hampton
 */
public class AssetDDL extends AssetDL{
        public static final double FACTOR = 2.0;
//    private double[] anndep, begbal, endbal;
//    boolean built;
    
    public AssetDDL(){
        super();
//        this.built = false;
    }
    public AssetDDL(String nm, double c, double s, int lf){
        super(nm, c, s, lf, AssetDDL.FACTOR);
//        if(super.isValid()){
//            build();
//        }
//    }
//    public double getAnnDep(int year){
//        if(!built){
//            build();
//            if(!built){
//                return -1;
//            }
//        } 
//        if(year < 1 || year > super.getLife()){
//            super.setErrorMessage("Illegal year requested: " + year);
//            return -1;
//        }
//        return anndep[year-1];
//    }
//    
//    public double getBegBal(int year){
//        if(!built){
//            build();
//            if(!built){
//                return -1;
//            }
//        }
//        if(year < 1 || year > super.getLife()){
//            super.setErrorMessage("Illegal year requested: " + year);
//            return -1;
//        }
//        return begbal[year-1];
//    }
//    
//    public double getEndBal(int year){
//        if(!built){
//            build();
//            if(!built){
//                return -1;
//            }
//        }
//        if(year < 1 || year > super.getLife()){
//            super.setErrorMessage("Illegal year requested: " + year);
//            return -1;
//        }
//        return endbal[year-1];
//    }
//    
//    public void build(){
//        if(!super.isValid()){
//            this.built = false;           
//        } else{
//            try{
//                    this.begbal = new double[super.getLife()];
//                    this.endbal = new double[super.getLife()];
//                    this.anndep = new double[super.getLife()];
//
//                    double depStraight = (super.getCost() - super.getSalvage()) / super.getLife();
//                    double ddlRate = (1.0/super.getLife()) * 2.0;
//
//                    this.begbal[0] = super.getCost();
//
//                    for (int i = 0; i < super.getLife(); i++){
//                    if (i > 0){
//                        this.begbal[i] = this.endbal[i-1];
//                    }
//
//                    double ddlWrk = this.begbal[i] * ddlRate;
//                    if(ddlWrk < depStraight) {
//                        ddlWrk = depStraight;
//                    }
//                    if((this.begbal[i] - ddlWrk) < super.getSalvage()){
//                            ddlWrk = this.begbal[i] - super.getSalvage();
//                    }
//
//                    this.anndep[i] = ddlWrk;
//                    this.endbal[i] = this.begbal[i] - this.anndep[i];
//                }
//                    this.built = true; 
//            } catch (Exception e){
//                super.setErrorMessage("Build Error: " + e.getMessage());
//                this.built = false;
//            }
//        }        
    }
}
