import java.io.*;
import java.util.*;
import java.util.function.BiFunction;

@SuppressWarnings("unchecked")
public class UCFJ {
  private static BufferedReader in;

  private static int n;
  private static long[] val;
  private static long numSols;
  private static long numUnique;

  private static HashMap<Long, Long> interval;
  private static HashMap<Long, Long> subInterval;

  private static final long ZERO = (long) 0;
  private static final long NEGONE = (long) -1;

  public static void main (String [] args) throws IOException {

    // There are numInt intervals [a, b] such that 0 <= a < b-1; b < n; val[a] =/= val[b]
    // For each interval [a, b] there are m unique mid-leaders where m is the number of unique, single-instance values v in (a, b) such that val[a] =/= v =/= val[b]

    in = new BufferedReader(new InputStreamReader(System.in));

    n = Integer.parseInt(in.readLine());
    val = new long[n];
    Interval.initVal(val);
    numSols = ZERO;
    numUnique = ZERO;

    interval = new HashMap<>();

    StringTokenizer st = new StringTokenizer(in.readLine());
    for (int i = 0; i < n; i++) {
      long value = Long.parseLong(st.nextToken());
      val[i] = value;
      Interval.setValue(i, value);

      if (i > 1) {
	addIntervals(i);
      }

      putInterval(value);
    }

    System.out.println(numSols);
  }

  private static void putInterval(long value) {
    if (!interval.containsKey(value)) {
      interval.put(value, ZERO);
      numUnique++;
    } else {
      long old = interval.get(value);
      interval.put(value, old+1);
      if (old == 0) {
	numUnique--;
      }
    }
  }

  private static void addIntervals(int b) {
    // Find all values a in [0, b-1) such that val[a] =/= val[b] and val[a], val[b] =/= val[i] for all i in the interval (a, b)
    long subUnique = numUnique;
    subInterval = (HashMap<Long, Long>) interval.clone();

    long keyb = val[b];

    for (int a = 0; a < b-1; a++) {
      long key = val[a];
      long value = subInterval.get(key);

      if (value == 0) {
	subInterval.remove(key);
	subUnique--;
      } else {
        subInterval.put(key, value-1);
	if (value == 1) {
	  subUnique++;
	}
      }

      if (!(key == keyb || subInterval.containsKey(key) || subInterval.containsKey(keyb))) {
	numSols += subUnique;
      }
    }
  }

}

class Interval {
  private long start;
  private long mid;
  private long end;

  private int sIdx;
  private int mIdx;
  private int eIdx;

  private static long[] val;

  private HashMap<Long, Long> interval;
  private HashMap<Long, Long> beforeMid;

  public static void initVal(long[] values) {
    val = values;
  }

  public static void setValue(int idx, long value) {
    val[idx] = value;
  }

  public Interval(long start, long mid, long end, int sIdx, int mIdx, int eIdx, HashMap<Long, Long> interval) {
    this.start = start;
    this.mid = mid;
    this.end = end;

    this.sIdx = sIdx;
    this.mIdx = mIdx;
    this.eIdx = eIdx;

    this.interval = interval;
    beforeMid = getBeforeMid();
  }

  public Interval(long start, long mid, long end, int sIdx, int mIdx, int eIdx, HashMap<Long, Long> interval, long additional) {
    this.start = start;
    this.mid = mid;
    this.end = end;

    this.sIdx = sIdx;
    this.mIdx = mIdx;
    this.eIdx = eIdx;

    this.interval = interval;
    interval.put(additional, (long) 0);
    beforeMid = getBeforeMid();
  }

  public HashSet<Interval> getSolutions(long newEnd, int idx) {
    HashSet<Interval> intervals = new HashSet<Interval>();

    // start -> mid -> newEnd; start -> end -> newEnd
    if (!(start == newEnd || end == newEnd || interval.containsKey(newEnd))) {
      intervals.add(new Interval(start, mid, newEnd, sIdx, mIdx, idx, interval, end));
      intervals.add(new Interval(start, end, newEnd, sIdx, eIdx, idx, interval));
    }

    // mid -> end -> newEnd
    if (!(mid == newEnd || end == newEnd || beforeMid.containsKey(newEnd))) {
      intervals.add(new Interval(mid, end, newEnd, mIdx, eIdx, idx, beforeMid, end));
    }

    // end -> ? -> newEnd
    

  }

  private static HashMap<Long, Long> getBeforeMid() {
    HashMap<Long, Long> clone = interval.clone();

    for (int i = sIdx+1; i <= mIdx; i++) {
      long key = val[i];
      long value = clone.get(key);

      if (value == 0) {
	clone.remove(key);
      } else {
        clone.put(key, value-1);
      }
    }

    return clone;
  }

  public boolean containsUnique(long key) {
    return interval.get(key) == 0;
  }
}



/*
class IntervalMap<K> extends HashMap<K, Integer> {
  private HashMap<E, HashSet<Integer>> orderMap;

  public IntervalMap<K>() {
    super();
    orderMap = new HashMap<E, HashSet<Integer>>();
  }

  public boolean put(K key) {
    int value = 1;
    if (containsKey(key)) {
      value += get(key);
    }
    this.put(key, value);

    if (super(key, value) == null) {
      HashSet<Integer> idxSet = new HashSet<>();
      orderMap.put(e, idxSet);
    }
    orderMap.get(e).add(size()-1);
  }

  public Integer put(K key, Integer value) {
    super(key, value);
  }

  public boolean containsKey(K key) {
    super(key);
  }

  public IntervalMap<K> subMap(int fromIdx, int toIdx) {
    return new SubMap<K>(fromIdx, toIdx);
  }

  private final class SubMap<K> extends IntervalSet<K> {
    final int min;
    final int max;

    SubMap (int min, int max) {
      super();
      this.min = min;
      this.max = max;
    }

    public boolean inRange(K key) {
      HashSet<Integer> idxSet = orderMap.get(key);
      return (idx > min) && (idx < max);
    }

    public boolean containsKey(K key) {
      return inRange(key) && IntervalMap.this.containsKey(key);
    }
  }
}
*/