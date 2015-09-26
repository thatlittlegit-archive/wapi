package wapi.graphical;

import wapi.graphical.conf.CameraConfiguration;
import wapi.core.CompiledValues;

public class Camera {
	Perspective perspective;
	Location location;
	
	public Camera(long x, long y, long z, int cx, int cy, int cz){
		perspective.fromCenterX = cx;
		perspective.fromCenterY = cy;
		perspective.fromCenterZ = cz;
		location.x = x;
		location.y = y;
		location.z = z;
	}
	
	public Camera(CameraConfiguration conf){
		perspective.fromCenterX = conf.cx;
		perspective.fromCenterY = conf.cy;
		perspective.fromCenterZ = conf.cz;
		location.x = conf.x;
		location.y = conf.y;
		location.z = conf.z;
	}
	
	/*
	 * When using CompiledValues:
	 * index  | name              |
	 * -------+-------------------|
	 * 0      | fromCenterX       |
	 * 1      | fromCenterY       |
	 * 2      | fromCenterZ       |
	 * 3      | cameraX           |
	 * 4      | cameraY           |
	 * 5      | cameraZ           |
	 * Note that these are all in the number table.
	 * See the wiki for more information on CompiledValues.
	 */
	public Camera(CompiledValues cv){
		perspective.fromCenterX = cv.getInt(0);
		perspective.fromCenterY = cv.getInt(1);
		perspective.fromCenterZ = cv.getInt(2);
		location.x = cv.getLong(3);
		location.y = cv.getLong(4);
		location.z = cv.getLong(5);
	}
	
}
