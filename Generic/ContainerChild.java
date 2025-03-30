 interface Container<T>{
       
     void add(T item);
     T get();
}
public class ContainerChild <T> implements Container <T> {
     private T item;
     @Override
     public void add(T item){
          this.item=item;
     }
 @Override 
     public T (){
          
           return item; 
     }

    

}