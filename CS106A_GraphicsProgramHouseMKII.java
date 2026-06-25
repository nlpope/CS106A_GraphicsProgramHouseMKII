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
	//below two global vars are the same idea written differently
	GRect baseRect;
	GRect doorRect = null;
	
	public void run()
	{
		createBase();
		createRoof();
		createDoor();
		createWindows();
	}
	
	
	private void createBase()
	{
		baseRect = new GRect(250, 250, 150, 75);
		baseRect.setFilled(false);
		baseRect.setColor(Color.PINK);
		add(baseRect);
	}
	
	
	private void createRoof()
	{
		GLine roofLine1 = new GLine(
				baseRect.getX(), 
				baseRect.getY(), 
				baseRect.getX() + (baseRect.getWidth() / 2), 
				baseRect.getY() - 50
		);
		roofLine1.setColor(Color.PINK);
		add(roofLine1);
		
		GLine roofLine2 = new GLine(
				baseRect.getX() + (baseRect.getWidth() / 2), 
				baseRect.getY() - 50, 
				baseRect.getX() + baseRect.getWidth(), 
				baseRect.getY()
		);
		roofLine2.setColor(Color.PINK);
		add(roofLine2);
	}
	
	
	private void createDoor()
	{
		//door logic
		doorRect = new GRect(
				baseRect.getX() + (baseRect.getWidth() / 2.5),
				baseRect.getY() + (baseRect.getHeight() / 3.5),
				baseRect.getWidth() / 5,
				baseRect.getHeight() - (baseRect.getHeight() / 3.5)
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
		//left window logic
		double padding = 13;
		double size = 35;
		GRect leftWindowRect = new GRect(
				doorRect.getX() - size - padding,
				doorRect.getY() - (padding / 2),
				size,
				size
		);
		leftWindowRect.setColor(Color.PINK);
		add(leftWindowRect);
		
		//right window logic 
		GRect rightWindowRect = new GRect(
				doorRect.getX() + doorRect.getWidth() + padding,
				doorRect.getY() - (padding / 2),
				size,
				size
		);
		rightWindowRect.setColor(Color.PINK);
		add(rightWindowRect);
		
		println("donezo");
	}
}