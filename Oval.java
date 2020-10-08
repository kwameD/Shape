import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Oval extends Shape{

	//Constructor that accepts three parameters
	public Oval( Rectangle r, String color,String isSolid) {
		super(r, color, isSolid);
	}
	
	//draws the Oval object on the Graphics
	@Override
public void draw(Graphics g) {
		setColor(g);
		
		if (isSolid().equalsIgnoreCase("Oval")) {
		      g.fillOval(this.x, this.y, this.width, this.height);
		    } else {
		      g.drawOval(this.x, this.y, this.width, this.height);
		    		}
			}
		}