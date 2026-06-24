/**
 * File: CS106A_GraphicsProgramHouseMKII.java
 * ----------------------------
 * Generates a simple picture of a house with a peaked roof,
 * two windows, and a door with a circular doorknob. Rewritten 
 * after git issues in MK1 (interrupted push for power failure)
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class CS106A_GraphicsProgramHouseMKII extends GraphicsProgram
{
	GRect baseRect = new GRect(250, 250, 150, 75);
	double baseRectXOrigin = baseRect.getX();
	double baseRectYOrigin = baseRect.getY();
	double baseRectWidth = baseRect.getWidth();
	double baseRectHeight = baseRect.getHeight();
	
	public void run()
	{
		createBase();
		createRoof();
		createDoor();
		createWindows();
	}
	
	
	private void createBase()
	{
		baseRect.setFilled(false);
		baseRect.setColor(Color.PINK);
		add(baseRect);
		println("start x = " + baseRectXOrigin);
		println("start y = " + baseRectYOrigin);
	}
	
	
	private void createRoof()
	{
		GLine roofLine1 = new GLine(
				baseRectXOrigin, 
				baseRectYOrigin, 
				baseRectXOrigin + (baseRectWidth / 2), 
				baseRectYOrigin - 50
		);
		roofLine1.setColor(Color.PINK);
		add(roofLine1);
		
		GLine roofLine2 = new GLine(
				baseRectXOrigin + (baseRectWidth / 2), 
				baseRectYOrigin - 50, 
				baseRectXOrigin + baseRectWidth, 
				baseRectYOrigin
		);
		roofLine2.setColor(Color.PINK);
		add(roofLine2);
	}
	
	
	private void createDoor()
	{
		// windows & doorknob will depend on door's 
		// position so making that first
		GRect doorRect = new GRect(
				baseRectXOrigin + (baseRectWidth / 3),
				baseRectYOrigin + (baseRectHeight / 3),
				baseRectWidth / 3,
				baseRectHeight - (baseRectHeight / 3)
		);
		doorRect.setColor(Color.PINK);
		add(doorRect);
	}
	
	
	private void createWindows()
	{
		
	}
}