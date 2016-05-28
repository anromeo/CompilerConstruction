
public class Throw {
    public static void main(String[] args) throws Exception {
    	try{
    		throwIt();
    	}catch (Exception e){
    		System.out.println("exception caught");
    	}
    	
    }
    
    private static void throwIt() throws Exception {
    	throw new Exception();
    }
}
