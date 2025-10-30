package aa;

public class MeeleEnemy extends Enemy{

	public MeeleEnemy(int x, int y, int width, int height, String type, int x2, int y2, int width2, int height2,
			int damage) {
		super(x, y, width, height, type, x2, y2, width2, height2, damage);
	}

	@Override
	public String toString() {
		return "MeeleEnemy [getType()=" + getType() + ", getX()=" + getX() + ", getY()=" + getY() + ", getWidth()="
				+ getWidth() + ", getHeight()=" + getHeight() + ", getDamage()=" + getDamage();
	}

	
	
	
}
