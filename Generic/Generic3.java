//Here we create a Generic 
class Pair<A,B>{
  private  A key; 
  private B value; 
  public Pair(A key , B value ){
    this.key = key ; 
    this.value=value; 
  }
  public A getkey()
  {
    return key; 
  }
  public  B getvalue(){
    return value ; 
  }
}
class Generic3 {
public static void main(String args[]){
// Pair<String,Integer> pair=new Pair<Integer,String>("Age",30);
Pair<Integer,String> pair =new Pair<>(30,"Age");
System.out.println(pair.getkey());
System.out.println(pair.getvalue());
}
}
