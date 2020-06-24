import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;



public class OddOcuuranceUsingTreeMap 
{



	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    int n=sc.nextInt();
    Map<Integer,Integer> map=new TreeMap<>();
    for(int i=0;i<n;i++)
    {
    	int k=sc.nextInt();
    int j=map.getOrDefault(k,0);
    j++;
    map.put(k, j);
    }
    Map sortedMap = sortByValues(map);
    Set set = sortedMap.entrySet();
    Iterator it = set.iterator();
    while(it.hasNext()) {
      Map.Entry pair = (Map.Entry)it.next();
      System.out.println(pair.getKey());
      return;
    }
    
	}


public static <K, V extends Comparable<V>> Map<K, V> 
sortByValues(final Map<K, V> map) {
  Comparator<K> valueComparator = 
           new Comparator<K>() {
    public int compare(K k1, K k2) {
      int compare = 
            map.get(k1).compareTo(map.get(k2));
      if (compare == 0) 
        return 1;
      else 
        return compare;
    }
  };

  Map<K, V> sortedByValues = 
    new TreeMap<K, V>(valueComparator);
  sortedByValues.putAll(map);
  return sortedByValues;
  }
}