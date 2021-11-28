public class Mather {
	
	public static void main(String[] args) {
		int[] act = new int[] {
				0,
				1,
				1,
				1,
				2,
				3,
				3,
				3,
				4,
				5,
				5,
				5,
				6,
				7,
				7,
				7,
				8,
				9,
				9,
				9,
				10,
				11,
				11,
				11,
				12,
				13,
				13,
				13,
				14,
				15,
				15,
				15,
				16,
				17,
				17,
				17,};
		int j = 0;
		for (int i = 0; i <= 35; i++) {
			int result = (i+6)/3;
			System.out.println("i: " + i + ", result: " + result + ", actual: " + act[i] + ", diff: " + (result-act[i]));
		}
	}
	
}
/*
00 - -2
01 - -1
02 - -1
03 - -2
04 - -1
05 - -0
06 - -1
07 - -1
08 - -0
09 - -0
10 - -0
11 - +0
12 - +0
13 - +1
14 - +1
15 - +0

0 1 2 3 4 5 6 7 8 9 10 11
2 1 1 2 1 0 1 1 0 0  0  0

011 012 112 222 
233 234 334 444
*/