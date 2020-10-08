import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Drawing extends JPanel{
private	Shape shape;
	

	//Overridden method that draws the current shape on the Graphics
	   @Override
	   public void paint(Graphics g) {
		   super.paint(g);
		   shape.setColor(g);
		     shape.draw(g);
		     shape.getNoOfShapes();
		    
	   }         
	       
	   

//Overridden method that specifies the dimensions of the drawing panel
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(200, 200);
	}
	
	//checks whether the shape provided will completely fit within the panel
	 public void drawShape(Shape shape){
	     try {
		   if (contains(shape.x, shape.y) && contains(shape.x, shape.y + shape.height)
	                && contains(shape.x + shape.width, shape.y) && contains(shape.x + shape.width, shape.y + shape.height)) {
	            this.shape = shape; 
	        }throw new OutsideBounds("Shape cannot fit into panel!");
     }catch(OutsideBounds o) {
         JOptionPane.showMessageDialog(null, o.getMessage());
     }catch(Exception e) {
             JOptionPane.showMessageDialog(null, "Please enter valid dimension and coordinates!"); 
	        }
	     repaint();
	   	}
	}
	
	
	
	