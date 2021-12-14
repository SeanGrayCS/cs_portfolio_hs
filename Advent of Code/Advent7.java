import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class Advent7 {
  private static Scanner in;

  private static PriorityQueue<Crab> minPQ, maxPQ;

  public static void main (String [] args) throws IOException {

    in = new Scanner(new File("Advent7.in"));

    minPQ = new PriorityQueue<>();
    maxPQ = new PriorityQueue<>((c1, c2) -> c1.compareToMax(c2));

    String[] crabs = in.nextLine().split(",");
    for (String num : crabs) {
      Crab crab = new Crab(Integer.parseInt(num));
      maxPQ.offer(crab);
      minPQ.offer(crab);
    }

    PriorityQueue<Crab>[] pqArr;

    Crab head = minPQ.poll();
    maxPQ.remove(head);
    pqArr = (PriorityQueue<Crab>[]) combineHead(minPQ, maxPQ, head);
    minPQ = pqArr[0];
    maxPQ = pqArr[1];

    head = maxPQ.poll();
    minPQ.remove(head);
    pqArr = (PriorityQueue<Crab>[]) combineHead(maxPQ, minPQ, head);
    maxPQ = pqArr[0];
    minPQ = pqArr[1];

    while (maxPQ.peek().getPos() != minPQ.peek().getPos()) {
      Crab min = minPQ.peek();
      Crab max = maxPQ.peek();

      if (min.compareCost(max) > 0) {
	maxPQ.remove(minPQ.poll());
	min.increasePos();

	pqArr = (PriorityQueue<Crab>[]) combineHead(minPQ, maxPQ, min);
	minPQ = pqArr[0];
	maxPQ = pqArr[1];
	continue;
      }

      minPQ.remove(maxPQ.poll());
      max.decreasePos();

      pqArr = (PriorityQueue<Crab>[]) combineHead(maxPQ, minPQ, max);
      maxPQ = pqArr[0];
      minPQ = pqArr[1];

    }

    int totalCost = 0;

    Iterator<Crab> it = maxPQ.iterator();

    while (it.hasNext()) {
      totalCost += it.next().getCost();
    }

    System.out.println(totalCost);

  }

  public static PriorityQueue[] combineHead (PriorityQueue<Crab> pq1, PriorityQueue<Crab> pq2, Crab newHead) {

    Crab curHead = pq1.peek();
    while (curHead != null && curHead.comparePos(newHead) == 0) {
      pq2.remove(pq1.poll());
      newHead.addCrab(curHead);
      curHead = pq1.peek();
    }

    pq1.offer(newHead);
    pq2.offer(newHead);

    return new PriorityQueue[] {pq1, pq2};

  }

}

class Crab implements Comparable<Crab> {

  private int pos;
  private int cost;
  private int nextCost;

  private ArrayList<Integer> amountChanged;

  public Crab(int pos) {
    this.pos = pos;
    cost = 0;
    nextCost = 1;
    this.amountChanged = new ArrayList<>();
    amountChanged.add(0);
  }

  public int getPos() {
    return pos;
  }

  public int getCost() {
    return cost;
  }

  public int getNextCost() {
    return nextCost;
  }

  public ArrayList<Integer> getAmountChanged() {
    return amountChanged;
  }

  public void addCrab(Crab other) {
    amountChanged.addAll(other.getAmountChanged());
    updateCost();
  }

  public void decreasePos() {
    pos--;
    increaseAmountChanged();
  }

  public void increasePos() {
    pos++;
    increaseAmountChanged();
  }

  private void increaseAmountChanged() {
    for (int i = 0; i < amountChanged.size(); i++) {
      amountChanged.set(i, amountChanged.get(i)+1);
    }
    updateCost();
  }

  private void updateCost() {
    int newCost = 0;
    int newNextCost = 0;
    for (int i = 0; i < amountChanged.size(); i++) {
      int indivCost = amountChanged.get(i);
      newCost += ((indivCost*(indivCost+1))/2);
      indivCost++;
      newNextCost += ((indivCost*(indivCost+1))/2);
    }
    cost = newCost;
    nextCost = newNextCost;
  }

  public int compareTo(Crab other) {
    int cmp = comparePos(other);
    return (cmp != 0) ? cmp : compareCost(other);
  }

  public int compareToMax(Crab other) {
    int cmp = comparePos(other);
    return (cmp != 0) ? (-1*cmp) : compareCost(other);
  }

  public int comparePos(Crab other) {
    return this.pos - other.pos;
  }

  public int compareCost(Crab other) {
    return (other.nextCost - other.cost) - (this.nextCost - this.cost);
  }
}