package Projekat4;

public abstract class GameObject {

	   protected double x, y;
	    protected Collidable collider;

	    public GameObject(double x, double y, Collidable collider) {
	        if (collider == null)
	            throw new IllegalArgumentException("Collider cannot be null");

	        this.x = x;
	        this.y = y;
	        this.collider = collider;
	    }

	    public double getX() { return x; }
	    public double getY() { return y; }
	    public Collidable getCollider() { return collider; }

	    public abstract String getDisplayName();
	
}
