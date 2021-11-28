import java.util.Arrays;

public class Robot {
	private int[] hall;
	private int pos;
	private boolean facingRight;
	
	public Robot (int[] h, int p, boolean r) {
		hall = h;
		pos = p;
		facingRight = r;
	}
	
	private boolean forwardMoveBlocked()
	{	
		if (!facingRight && pos == 0) {
			return true;
		}
		if (facingRight && pos == hall.length - 1) {
			return true;
		}
		return false;
	}
	
	private void move()
	{
		if (hall[pos] > 0) {
			hall[pos]--;
		}
		if (hall[pos] > 0) {
			return;
		}
		if (!forwardMoveBlocked()) {
			if (facingRight) {
				pos++;
			} else {
				pos--;
			}
		} else {
			facingRight = facingRight ^ true;
		}
	}
	
	public int clearHall()
	{
		int moveCount = 0;
		while (!hallIsClear()) {
			move();
			moveCount++;
		}
		return moveCount;
	}
	
	private boolean hallIsClear()
	{
		int hallTotal = 0;
		for (int i = 0; i < hall.length; i++) {
			hallTotal += hall[i];
		}
		if (hallTotal == 0) {
			return true;
		}
		return false;
	}
	
	public int[] getHall() {
		return hall;
	}
	
	public static void main (String[] args) {
		int[] hall = new int[4];
		hall[0] = 1;
		hall[1] = 1;
		hall[2] = 2;
		hall[3] = 2;
		Robot robot = new Robot(hall, 1, true);
		System.out.println(robot.clearHall());
	}
}
