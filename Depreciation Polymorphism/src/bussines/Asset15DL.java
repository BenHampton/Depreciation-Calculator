
package bussines;

/**
 *
 * @author Ben Hampton
 */
public class Asset15DL extends AssetDL{
//    private double[] begbal, endbal, anndep;
//    boolean built;
    public static final double FACTOR = 1.5;
    
    public Asset15DL(){
        super();
        this.built = false;
    }
    
    public Asset15DL(String nm, double c, double s, int lf){
        super(nm,c,s,lf, Asset15DL.FACTOR);
        if(super.isValid()){
            build();
        }
    }
    
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
//                    double d15Rate = (1.0/super.getLife()) * 1.5;
//
//                    this.begbal[0] = super.getCost();
//
//                    for (int i = 0; i < super.getLife(); i++){
//                    if (i > 0){
//                        this.begbal[i] = this.endbal[i-1];
//                    }
//
//                    double dlWrk = this.begbal[i] * d15Rate;
//                    if(dlWrk < depStraight) {
//                        dlWrk = depStraight;
//                    }
//                    if((this.begbal[i] - dlWrk) < super.getSalvage()){
//                            dlWrk = this.begbal[i] - super.getSalvage();
//                    }
//
//                    this.anndep[i] = dlWrk;
//                    this.endbal[i] = this.begbal[i] - this.anndep[i];
//                }
//                    this.built = true; 
//            } catch (Exception e){
//                super.setErrorMessage("Build Error: " + e.getMessage());
//                this.built = false;
//            }
//        }        
//    }
//    public double getAnnDep(int year){
//        if(!built){
//            build();
//            if(!built){
//                return -1;
//            }
//        } 
//        if (year <  1 || year > super.getLife()){
//             return -1;
//             //super
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
}
