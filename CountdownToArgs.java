//CountdownToArgs.java

public class CountdownToArgs {
	public static void main(String[] args){
		try {
			int maxCount = Integer.parseInt(args[0]);
			if (maxCount <= 0) {
				System.out.println("ERROR: " + args[0] + " must be greater than zero");
			} 
			for (int i = 0; maxCount >= 0; maxCount = maxCount-1) {
				System.out.println(maxCount);
			} 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR: No argument provided");
		
		} catch (NumberFormatException e) {
        System.err.println("ERROR: Argument " + args[0] + " must be an integer.");
        System.exit(1);
    	}
	}
}
 
