import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Rectangular extends Shape {
	
	//Constructor that accepts three parameters
	public Rectangular( Rectangle r, String color, String isSolid) {
		super(r, color, isSolid);
	}
	//draws the Rectangular object on the Graphics
	@Override
public void draw(Graphics g) {
		setColor(g);
		
		if (isSolid().equalsIgnoreCase("Rectangle")) {
		      g.fillRect(this.x, this.y, this.width, this.height);
		    } else {
		      g.drawRect(this.x, this.y, this.width, this.height);

		    }
	}
}
