class OwnException extends Exception {
    public OwnException(String msg){
        super(msg);
    }
   }
 class BhatMara {
    String name;
    int amountofbhat;
public BhatMara(String name,int amountofbhat)throws OwnException{
if(amountofbhat < 1 || amountofbhat>1000 ){
    throw new OwnException("k gareko yo ");
}
else{
    this.name=name;
this.amountofbhat=amountofbhat;
}
 }
}
class Check{
    public static void main(String[]args){
         try{
            BhatMara b=new BhatMara("abishek", 1001);
         }catch(OwnException e){
            System.out.print(e.getMessage());
         }
    }

}
 