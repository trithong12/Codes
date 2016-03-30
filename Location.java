package Exercise9_13;

public class Location {
	public static int row, column;
	public static double minValue;
		
	public Location() {
		// TODO Auto-generated constructor stub
	}
	
	public static Location locateSmallest(double[][] array) {
		minValue = array[0][0];
		Location L1 = new Location();
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				if (array[i][j]<minValue) {
					minValue=array[i][j];
					row=i;
					column=j;
				}
			}
		}
		return L1;
	}
}
