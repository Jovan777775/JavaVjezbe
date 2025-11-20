package Projekat4;

public class RectangleCollider implements Collidable {

	private double width, height;
    private double x, y;
    
    
	
	public RectangleCollider(double width, double height, double x, double y) {
		super();
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}

	 public void updatePosition(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }


	@Override
	public boolean intersects(Collidable other) {
		 if (!(other instanceof RectangleCollider)) return false;
	        RectangleCollider o = (RectangleCollider) other;
	        return !(x + width < o.x ||
	                 o.x + o.width < x ||
	                 y + height < o.y ||
	                 o.y + o.height < y);
	}

}
