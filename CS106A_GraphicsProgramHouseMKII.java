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
		//door logic
		GRect doorRect = new GRect(
				baseRectXOrigin + (baseRectWidth / 2.5),
				baseRectYOrigin + (baseRectHeight / 3.5),
				baseRectWidth / 5,
				baseRectHeight - (baseRectHeight / 3.5)
		);
		doorRect.setColor(Color.PINK);
		add(doorRect);
		
		//doorknob logic
		GPoint doorLocation = doorRect.getLocation();
		double size = 5;
		double x = doorLocation.getX()+ doorRect.getWidth() - (size + 5);
		double y = doorLocation.getY()+ (doorRect.getHeight() / 2.3);
		GArc doorknobArc = new GArc(
				x,
				y,
				size,
				size,
				0,
				360
		);
		doorknobArc.setColor(Color.PINK);
		add(doorknobArc);
	}
	
	
	private void createWindows()
	{
		
	}
}