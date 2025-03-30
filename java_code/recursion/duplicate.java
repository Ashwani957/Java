public class duplicate {

    public static void   removeduplicate(String str, int idx,StringBuilder newstr, boolean map[])
    {
        if (idx==str.length()){
            System.out.println(newstr);
            return ; 
        }
        // kam


        char  currChar =str.charAt(idx);
        // if 
        // if present then leave it do not need to append into the string 
        if(map[currChar-'a']==true )  
        {
            // duplicate 
            removeduplicate(str,idx+1, newstr,map);
        }

// if the char is not present then we append it into the newstr
else {
    map[currChar-'a']=true ; 
    removeduplicate(str,idx+1,newstr.append(currChar),map);
}


    }
    public static void main (String args[])
    {
String str="appendapnacollege";
removeduplicate(str,0, new StringBuilder(""),new boolean[26]);
    }
}