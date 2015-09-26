package wapi.graphical;

public class Perspective {
	int fromCenterX;
	int fromCenterY;
	int fromCenterZ;
	/** @deprecated Use fromCent<u>er</u>X instead. */
	int fromCentreX;
	/** @deprecated Use fromCent<u>er</u>Y instead. */
	int fromCentreY;
	/** @deprecated Use fromCent<u>er</u>Y instead. */
	int fromCentreZ;
	
	public Perspective(int x, int y, int z){
		fromCenterX = x;
		fromCenterY = y;
		fromCenterZ = z;
	}
	
	public Perspective(){}
}
