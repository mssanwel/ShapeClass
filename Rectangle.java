
/**
 * @author Muhammad Saad Shahid
 *subclass of Shape makes shape rectangle
 */
public class Rectangle extends Shape{
	
	/**
	 * @param height the height of rectangle
	 * @param width the width of rectangle
	 */
	public Rectangle(int height, int width) {
		super();
		String[][] shape=new String[width][height];
		for (int i=0; i<shape.length; i++) {
			for (int j=0; j<shape[0].length; j++) {
				shape[i][j]="*";
			}
		}
		//super.printn(shape);
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
