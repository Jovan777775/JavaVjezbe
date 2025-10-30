package aa;

public class Enemy extends gameObject{

	private String type;
	private int x,y;
	private int width, height;
	private int damage;
	

	public Enemy(int x, int y, int width, int height, String type, int x2, int y2, int width2, int height2,
			int damage) {
		super(x, y, width, height);
		this.type = type;
		x = x2;
		y = y2;
		width = width2;
		height = height2;
		this.damage = damage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if (type == null || type.trim().isEmpty()) {
            this.type = "Unknown";
		}else {
	            this.type = type.trim().toLowerCase();

		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		if (damage < 0) {
			this.damage = 0;
		} else if (damage > 100) {
				this.damage = 100;
			}else {
				this.damage = damage;
			}

		
		
	}

	@Override
	public String toString() {
		return "Enemy [type=" + type + ", x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", damage="
				+ damage + "]";
	}
	
	
	
}
