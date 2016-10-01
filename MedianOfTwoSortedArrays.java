
public class MedianOfTwoSortedArrays {

	/**
	 * @param args
	 */
	public void FindMedian(int first[], int sec[],int oneFirst, int firstLast,int secFirst, int secLast){
		
		int firstMedian = (oneFirst + firstLast)/2;
		int secMedian = (secFirst + secLast)/2;
		System.out.println("first = "+firstMedian +" sec = "+secMedian);
		if(first[firstMedian] == sec[secMedian]){
			System.out.println();
			System.exit(0);
		}
		else if(first[firstMedian]>sec[secMedian]){
//			FindMedian(first,sec,oneFirst,firstMedian,secMedian,secLast);
			System.exit(0);
		}
		else if(first[firstMedian]<sec[secMedian]){
			FindMedian(first,sec,firstMedian,firstLast,secFirst,secMedian);
			System.exit(0);
		}
		System.exit(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedianOfTwoSortedArrays obj = new MedianOfTwoSortedArrays();
		int a[] = {1, 12, 15, 26, 38};
		int b[] = {2, 13, 17, 30, 45};
		System.out.println("b of length = "+ b.length);
		obj.FindMedian(a,b,0,a.length,0,b.length);
		
	}

}
