package heaps1;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
//		MinHeap minHeap = new MinHeap(4);
//		minHeap.insert(2);
//		minHeap.insert(10);
//		
//		minHeap.printHeap();
//		System.out.println(minHeap.extractMin());
//		minHeap.printHeap();
//		
//		minHeap.insert(15);
//		minHeap.insert(1);
//	
//		minHeap.printHeap();
//		System.out.println(minHeap.extractMin());
//		minHeap.printHeap();
		
		int a[] = {0, 2, 9, 4, 7, 1, 6, 8};
		MinHeap minHeap = new MinHeap(a);
		minHeap.printHeap();
		
		minHeap.heapSort();
		
	}

}
