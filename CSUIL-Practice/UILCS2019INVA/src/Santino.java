import java.util.*;
import java.io.*;

public class Santino {
    private static int[][] grid;
    private static boolean[][] visits;

    private static PriorityQueue<Path> pq;

    public static void main(String[] args) throws Exception {
        String file = "santino";
        Scanner input = new Scanner(new File("./jud/" + file + ".dat"));

        int t = input.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.print("CASE #" + i + ": ");

            int n = input.nextInt();
            int m = input.nextInt();
            int startRow = input.nextInt();
            int startCol = input.nextInt();
            int endRow = input.nextInt();
            int endCol = input.nextInt();

            grid = new int[n][m];
            visits = new boolean[n][m];

            input.nextLine();
            for (int j = 0; j < n; j++) {
                String[] row = input.nextLine().split(" ");

                for (int k = 0; k < m; k++) {
                    String direction = row[k];
                    int val;
                    switch (direction) {
                        case "NW": {
                            val = 7;
                            break;
                        }
                        case "W": {
                            val = 6;
                            break;
                        }
                        case "SW": {
                            val = 5;
                            break;
                        }
                        case "S": {
                            val = 4;
                            break;
                        }
                        case "SE": {
                            val = 3;
                            break;
                        }
                        case "E": {
                            val = 2;
                            break;
                        }
                        case "NE": {
                            val = 1;
                            break;
                        }
                        default: {
                            val = 0;
                        }
                    }

                    grid[j][k] = val;
                }
            }

            pq = new PriorityQueue<>();

            Path start = new Path(startRow, startCol, grid[startRow][startCol], 0);

            visits[startRow][startCol] = true;
            pq.offer(start);

            while (!pq.isEmpty() && !pq.peek().atPoint(endRow, endCol)) {
                Path cur = pq.poll();
                getPaths(cur);
            }

            if (pq.isEmpty()) {
                System.out.print("Lost in the playground\n");
            } else {
                System.out.print(pq.peek().steps + "\n");
            }
        }

    }

    private static void getPaths(Path path) {
        int row = path.curRow;
        int col = path.curCol;

        while (true) {
            switch(path.dir) {
                case 7: {
                    row--;
                }
                case 6: {
                    col--;
                    break;
                }
                case 5: {
                    col--;
                }
                case 4: {
                    row++;
                    break;
                }
                case 3: {
                    row++;
                }
                case 2: {
                    col++;
                    break;
                }
                case 1: {
                    col++;
                }
                default: {
                    row--;
                }
            }
        
            if (row < 0 || col < 0 || row >= grid.length || col >= grid[row].length) {
                break;
            }
            
            if (!visits[row][col]) {
                Path nextPath = new Path(row, col, grid[row][col], path.steps+1);
                pq.offer(nextPath);
                visits[row][col] = true;
            }
        }
    }
}

class Path implements Comparable<Path> {
    public int curRow;
    public int curCol;
    public int dir;
    public int steps;

    public Path(int curRow, int curCol, int dir, int steps) {
        this.curRow = curRow;
        this.curCol = curCol;
        this.dir = dir;
        this.steps = steps;
    }

    public boolean atPoint(int row, int col) {
        return (curRow == row) && (curCol == col);
    }

    public int compareTo(Path o) {
        return this.steps - o.steps;
    }
}
