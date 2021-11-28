import java.util.*;

public class ReviewCollector {
	private ArrayList<ProductReview> reviewList;
	private ArrayList<String> productList;
	
	public ReviewCollector() {
		reviewList = new ArrayList<ProductReview>();
		productList = new ArrayList<String>();
	}
	
	public void addReview (ProductReview prodReview)
	{
		reviewList.add(prodReview);
		int prodInListAmount = 0;
		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).equals(prodReview.getName())) {
				prodInListAmount++;
			}
		}
		if (prodInListAmount == 0) {
			productList.add(prodReview.getName());
		}
	}
	
	public int getNumGoodReviews (String prodName)
	{
		int numGoodReviews = 0;
		for (int i = 0; i < reviewList.size(); i++) {
			String review = reviewList.get(i).getReview();
			if (reviewList.get(i).getName().equals(prodName)) {
				for (int j = 0; j < review.length() - 3; j++) {
					if (review.substring(j, j + 4).equals("best")) {
						numGoodReviews++;
						break;
					}
				}
			}
		}
		return numGoodReviews;
	}
	
	
	
	public static void main (String[] args) {
		String name = "uy";
		String r = "astosbest";
		ProductReview prod = new ProductReview(name, r);
		
		ReviewCollector col = new ReviewCollector();
		
		col.addReview(prod);
		col.addReview(prod);
		col.addReview(prod);
		col.addReview(prod);
		col.addReview(prod);
		col.addReview(prod);
		col.addReview(prod);
		col.addReview(prod);
		col.addReview(prod);
		col.addReview(prod);
		
		System.out.println(col.getNumGoodReviews(name));
	}
}
