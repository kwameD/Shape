/* File Name : Project3.java
* Author    : Kwame Duodu
* Date      : June 14, 2020 
* Purpose   : A program that draws two types of shapes, ovals and rectangles.  
*/ 

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public abstract class Shape extends Rectangle {

private String color;
private String isSolid;
private static int numberOfShape;

//Constructor
public Shape( Rectangle r, String color, String isSolid) {
	   
	this.color = color;
	this.isSolid = isSolid;
	this.setRect(r.x, r.y, r.width, r.height);
	 numberOfShape++;
}

	//set the color for the next draw operation
public String setColor(Graphics g) {
	if(color.equalsIgnoreCase("black"))
		g.setColor(Color.BLACK);
	else if(color.equalsIgnoreCase("red"))
		g.setColor(Color.RED);
	else if(color.equalsIgnoreCase("orange"))
		g.setColor(Color.ORANGE);
	else if(color.equalsIgnoreCase("yellow"))
		g.setColor(Color.YELLOW);
	else if(color.equalsIgnoreCase("green"))
		g.setColor(Color.GREEN);
	else if(color.equalsIgnoreCase("magenta"))
		g.setColor(Color.MAGENTA);
	else if(color.equalsIgnoreCase("blue"))
		g.setColor(Color.BLUE);
	return color;
}

	//returns whether the shape is solid or hollow
public String isSolid() {
	return isSolid;
}

	//returns the number of shapes created so far
public int getNoOfShapes() {
		return numberOfShape;
}
	// abstract class name draw that accept graphics as a parameter
public abstract void draw(Graphics g);
}
	