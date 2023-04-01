class LolException extends Exception{
    public LolException(String msg){
        super(msg);
    }
}
class BhatMara {
    int a;
    int b;
public BhatMara(int a,int b)throws LolException{
if(!(a+b>=100)){
    throw new LolException("not a gymer");
}
else{
    System.out.println("light weight");
    }
 }
}
class Check{
    public static void main(String[]args){
         try{
            new BhatMara(40, 40);
         }catch(LolException e){
            System.out.print(e.getMessage());
         }
    }

}

 