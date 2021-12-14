import java.io.*;
import java.util.*;

public class Advent4 {
  private static Scanner in;

  private static Queue<Integer> drawNums;
  private static ArrayList<int[][]> boards;
  private static ArrayList<boolean[][]> marked;

  public static void main (String [] args) throws IOException {

    in = new Scanner(new File("Advent4.in"));

    drawNums = new LinkedList<>();

    String[] draws = in.nextLine().split(",");
    for (String num : draws) {
      drawNums.offer(Integer.parseInt(num));
    }
    in.nextLine();

    boards = new ArrayList<>();
    marked = new ArrayList<>();

    int[][] board = new int[5][5];
    boolean[][] mark = new boolean[5][5];
    int idx = 0;
    while (in.hasNextLine()) {
      String line = in.nextLine();

      if (line.equals("")) {
	boards.add(board);
	marked.add(mark);

	board = new int[5][5];
	mark = new boolean[5][5];

	idx = 0;
	continue;
      }

      String[] row = line.trim().split("\\s+");
      for (int col = 0; col < 5; col++) {
	board[idx][col] = Integer.parseInt(row[col]);
      }

      idx++;
    }
    boards.add(board);
    marked.add(mark);

    boolean solved, solvedP2;
    solved = solvedP2 = false;
    int finalDraw, finalDrawP2;
    finalDraw = finalDrawP2 = drawNums.peek();
    int[][] boardP1, boardP2;
    boardP1 = boardP2 = boards.get(0);
    boolean[][] markP1, markP2;
    markP1 = markP2 = marked.get(0);

    while (!drawNums.isEmpty()) {
      int draw = drawNums.poll();

      for (int i = boards.size()-1; i >= 0; i--) {
	board = boards.get(i);
	mark = marked.get(i);

	solvedP2 = false;

	for (int r = 0; r < board.length; r++) {
	  int[] row = board[r];
	  for (int c = 0; c < row.length; c++) {
	    int val = row[c];
	    if (!mark[r][c] && val == draw) {
	      mark[r][c] = true;
	      solvedP2 = check(mark, r, c);

	      if (solvedP2) {
		finalDrawP2 = draw;
		boardP2 = board;
		markP2 = mark;

		if (!solved) {
		  solved = true;
		  finalDraw = draw;
		  boardP1 = board;
		  markP1 = mark;
		}

		boards.remove(i);
		marked.remove(i);
		break;
	      }
	    }
	  }

	  if (solvedP2) {
	    break;
	  }
	}

      }
    }

    int sumP1 = sumBoard(boardP1, markP1), sumP2 = sumBoard(boardP2, markP2);
    int scoreP1 = sumP1*finalDraw, scoreP2 = sumP2*finalDrawP2;

    System.out.println(scoreP1 + "\n" + scoreP2);

  }

  private static boolean check(boolean[][] mark, int r, int c) {
    return checkRow(mark, r) || checkCol(mark, c);
  }

  private static boolean checkRow(boolean[][] mark, int r) {
    for (int c = 0; c < mark[r].length; c++) {
      if (!mark[r][c]) {
	return false;
      }
    }

    return true;
  }

  private static boolean checkCol(boolean[][] mark, int c) {
    for (int r = 0; r < mark.length; r++) {
      if (!mark[r][c]) {
	return false;
      }
    }

    return true;
  }

  private static int sumBoard(int[][] board, boolean[][] mark) {
    int sum = 0;

    for (int r = 0; r < board.length; r++) {
      for (int c = 0; c < board[r].length; c++) {
	if (!mark[r][c]) {
	  sum += board[r][c];
	}
      }
    }

    return sum;
  }

}