
/**
 * @author Muhammad Saad Shahid
 *Implementation of shape class
 */
public class Shape {
	/**
	 * This is array in the superclass Shape which stores the elements of all shapes even of subclasses
	 */
	public String[][] Final=new String[0][0];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	/**
	 * Empty constructor 
	 */
	public Shape() {}
	/**
	 * @param shapeNew constructor with one parameter. Take in an array in defined format and stores it into class array variable
	 */
	public Shape(String [][] shapeNew) {
		Final=shapeNew;
	}
	
	
	/**
	 *@return the array content as a string
	 */
	public String toString() {
		String temp=new String();
		for (int i=0; i<Final.length; i++) {
			for (int j=0; j<Final[0].length; j++) {
				temp=temp+Final[i][j];
			}
			if (i!=(Final.length-1)){
			temp=temp+"\n";
			}
		}
		return temp;
	}
	
	
	/**
	 * @return the area of the shape in final array
	 */
	public int getArea() {
		int temp=0;
		for (int i=0; i<Final.length; i++) {
			for (int j=0; j<Final[0].length; j++) {
				if (Final[i][j]=="*"){
				temp=temp+1;
				}
			}
		}
		return temp;
	}
	
	/**
	 * @param newS takes in shape object to apply intersection operation on shape in Final Array
	 * @return the shape after intersection operation
	 */
	public Shape intersect(Shape newS) {
		String[][] newShape=newS.Final;
		return intersect(Final, newShape);
	}
	/**
	 * Self note: Could have combined the two intersect methods
	 * @param shape1 first shape array to perform operation on
	 * @param shape2 second shape array to perform operation on
	 * @return returns result of intersection operation
	 */
	public Shape intersect(String[][] shape1,String[][] shape2) {
		//String[][] shape2=newS.Final;
		//String[][] shape1=Final;
		int x=0;
		int y=0;
		int x1=shape1.length;
		int x2=shape2.length;
		int y1=shape1[0].length;
		int y2=shape2[0].length;
		if (x1<x2) {
			x= x1;
		}
		else{
			x= x2;
		}
		if (y1<y2) {
			y= y1;
		}
		else {
			y=y2;
		}
		String[][] intersection=new String[x][y];
		for (int i=0; i<x; i++) {
			for (int j=0; j<y; j++) {
				if ((shape1[i][j]=="*") && (shape2[i][j]=="*")){
					intersection[i][j]="*";
				}
				else {
					intersection[i][j]=" ";
				}
			}
		}
		
		return new Shape(intersection);
	}
	
	
	/**
	 * @param newS Shape object of new shape to apply union operation on
	 * @return returns final result of operation
	 */
	public Shape union(Shape newS) {
		String[][] newShape=newS.Final;
		return union(Final, newShape);
	}
	/**
	 * @param shape1 is a string array of first shape to apply operation on
	 * @param shape2 is a string array of second shape to apply operation on 
	 * @return the result of union operation on shape 1 and shape 2
	 */
	public Shape union(String[][] shape1,String[][] shape2) {
		int x=0;
		int y=0;
		int x1=shape1.length;
		int x2=shape2.length;
		int y1=shape1[0].length;
		int y2=shape2[0].length;
		if (x1>x2) {
			x= x1;
		}
		else{
			x= x2;
		}
		if (y1>y2) {
			y= y1;
		}
		else {
			y= y2;
		}
		String[][] unionShape=new String[x][y];
		for (int i=0; i<x; i++) {
			for (int j=0; j<y; j++) {
				
					if (((i<x1)&&(j<y1)) && (shape1[i][j]=="*")) {
						unionShape[i][j]="*";
					}
					else if (((i<x2)&&(j<y2)) && (shape2[i][j]=="*")) {
						unionShape[i][j]="*";
					}
					else {
						unionShape[i][j]=" ";
					}

			}
		}
		return new Shape(unionShape);
	}
}

