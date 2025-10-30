package aa;

public class Player extends gameObject {
	
	
		private String ime;

	    private int x;

	    private int y;

	    private int width;

	    private int height;

	    private int health;



	

	  public Player(int x, int y, int width, int height, String ime, int x2, int y2, int width2, int height2,
				int health) {
			super(x, y, width, height);
			this.ime = ime;
			x = x2;
			y = y2;
			width = width2;
			height = height2;
			this.health = health;
		}







	public String getIme() {
		return ime;
	}







	public void setIme(String ime) {
		this.ime = ime;
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







	public int getHealth() {
		return health;
	}







	public void setHealth(int health) {
		this.health = health;
	}







	@Override

	public String toString() {



	   return String.format("Igrac '%s' | Pozicija: (%d, %d) | Dimenzije: %dx%d | Health: %d/100 (%s)",

	           ime, x, y, width, height, health );

	}
	class meeleEnemy {
			private String type;
		private int damage;

		public meeleEnemy(String type, int damage) {
			this.type = type;
			this.damage = damage;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getDamage() {
			return damage;
		}

		public void setDamage(int damage) {
			this.damage = damage;
		}

}}
