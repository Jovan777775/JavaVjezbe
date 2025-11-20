package Projekat4;

public class CircleCollider implements Collidable {
    private double x, y, radius;


	public CircleCollider(double x, double y, double radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	 public void updatePosition(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }


	 public boolean intersects(Collidable other) {
	        if (!(other instanceof CircleCollider)) return false;

	        CircleCollider o = (CircleCollider) other;
	        double dx = x - o.x;
	        double dy = y - o.y;

	        return Math.sqrt(dx*dx + dy*dy) <= radius + o.radius;
	    }

}
