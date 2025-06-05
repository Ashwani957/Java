public class rethrow {
    public static void main(String[] args) {
        
        try {
            processFile();
        } catch (Exception  e) {
            System.out.println("Exception caught in main+"+e.getMessage());
        }

    }

    static void processFile() throws Exception{
        try{
throw new Exception("File not found");
        }
        catch(Exception e){
            System.out.println("loggin exception ");
            throw e; 
        }

    }
}




