

// this is my normal  calss withour any kind of generic 

// class Box1 {
 
//     private Object value;

//     public Object getValue(){
//         return value; 
//     }

//     public void setValue(Object value){
//         this.value=value;
//     }


// }


// This is my Generic class with generic type 
class Box <T> {

    // the datatype of the value is object 
//Replace T with 

    // private Object value
    // Here we use the generic type 
    private T value;
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    

}
    
public class Generic2 {
    public static void main(String args[])
    {


        Box <Integer> bx =new Box <>();
            bx.setValue(12);
            bx.setValue(13);
        int i = bx.getValue();
        System.out.println(i);
        System.out.println(i);
        


        





    }
}
