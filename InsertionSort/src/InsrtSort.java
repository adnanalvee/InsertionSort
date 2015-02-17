
public class InsrtSort {
	private long[] a;
	private int nElems;
	
	public InsrtSort(int max) {
		a = new long[max];
		nElems = 0;
	}
	
	public void insert(int value){
		a[nElems] = value;
		nElems++;
	}
	
	public void display() {
		for (int i=0;i<nElems;i++) {
			System.out.print(a[i] + " ");
		System.out.println();	
		}
	}
	
	public void insertionSort(){
		
	
	}
	
	public static void main(String[] args) {
		
		int maxSize = 100;
		InsrtSort arr2 = new InsrtSort(maxSize);
		arr2.insert(10);
		arr2.insert(9);
		arr2.insert(8);
		arr2.insert(7);
		arr2.insert(6);
		arr2.insert(5);
		arr2.insert(4);
		arr2.insert(3);
		arr2.insert(2);
		arr2.insert(1);
		
		arr2.insertionSort();
		arr2.display();
	}

}
