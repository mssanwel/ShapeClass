
/**
 * @author Muhammad Saad Shahid
 *subclass of Shape makes shape of diamond
 */
public class Diamond extends Shape{
	//public String[][] shape;
	
	/**
	 * @param length takes length of diamond side
	 */
	public Diamond(int length) {
		super();  
		int n=1;
		int inc=1;
		int index=0;
		int width=2*length-1;
		String[][] shape=new String[width][width];
		for (int x=0; x<2*length-1; x++) {
			index=0;
				for (int i=0; i<(int)(width-(2*n-1))/2; i++) {
					//System.out.print(" ");
					shape[x][index]=" ";
					index++;
				}
				for (int i=0; i<2*n-1; i++) {
					//System.out.print("*");
					shape[x][index]="*";
					index++;
				}
				for (int i=0; i<(int)(width-(2*n-1))/2; i++) {
					//System.out.print(" ");
					shape[x][index]=" ";
					index++;
				}
				//System.out.print("\n");
				n=n+inc;
				if (n==length){
					inc=-1;
				}
		}
		Final=shape;
	}
	
	
	/**
	 *override method for intersect method
	 */
	public Shape intersect(Shape newS) {
		String[][] newShape=newS.Final;
		return intersect(Final, newShape);
	}
	/**
	 *override method for union method
	 */
	public Shape union(Shape newS) {
		String[][] newShape=newS.Final;
		return union(Final, newShape);
	}
}
