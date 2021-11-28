
public class Customer {
	
	private String custName;
	private int id;
	
	public Customer (String name, int idNum) {
		custName = name;
		id = idNum;
	}
	
	public String getName() {
		return custName;
	}
	
	public int getID() {
		return id;
	}
	
	public int compareCustomer (Customer other) {
		int comp = getName().compareTo(other.getName());
		if (comp != 0) {
			return comp;
		}
		int diff = getID() - other.getID();
		return diff;
	}
	
	public static Customer[] prefixMerge (Customer[] list1, Customer[] list2, Customer[] result) {
		
		int len1 = list1.length;
		int len2 = list2.length;
		int lenRes = result.length;
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < len1 && j < len2 && k < lenRes) {
			if (list1[i].compareCustomer(list2[j]) <= 0) {
				boolean isRepeat = false;
				for (int l = 0; l < k; l++) {
					if (result[l].compareCustomer(list1[i]) == 0) {
						isRepeat = true;
					}
				}
				if (isRepeat) {
					k--;
				}
				else {
					result[k] = list1[i];
				}
				i++;
			}
			else {
				boolean isRepeat = false;
				for (int l = 0; l < k; l++) {
					if (result[l].compareCustomer(list2[j]) == 0) {
						isRepeat = true;
					}
				}
				if (isRepeat) {
					k--;
				}
				else {
					result[k] = list2[j];
				}
				j++;
			}
			k++;
		}

		return result;
	}
	
	public static void main(String[] args) {
		Customer arthur = new Customer("Arthur", 4920);
		Customer burton = new Customer("Burton", 3911);
		Customer burton2 = new Customer("Burton", 4944);
		Customer jones = new Customer("Jones", 5554);
		Customer miller = new Customer("Miller", 9360);
		
		Customer[] list1 = new Customer[5];
		list1[0] = arthur;
		list1[1] = burton;
		list1[2] = burton2;
		list1[3] = jones;
		list1[4] = miller;
		
		Customer aaron = new Customer("Aaron", 1729);
		Customer burton3 = new Customer("Burton", 3911);
		Customer dillard = new Customer("Dillard", 6552);
		Customer miller2 = new Customer("Miller", 9360);
		
		Customer[] list2 = new Customer[4];
		list2[0] = aaron;
		list2[1] = burton3;
		list2[2] = dillard;
		list2[3] = miller2;
		
		Customer[] result = new Customer[4];
		
		result = prefixMerge(list1, list2, result);
		
		for (Customer cust : result) {
			System.out.println(cust.getName() + " " + cust.getID());
		}
	}
	
}
