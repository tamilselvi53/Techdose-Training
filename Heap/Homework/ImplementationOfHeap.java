public class Heap
{
    int capacity;
    int size;
    int[] arr;
    Heap(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }
    //O(log n)
    public void heap_push(int val) {
        if (size < capacity) {
            int index = ++size;
            arr[index] = val;
            while (index > 1 && arr[(index - 1) / 2] < arr[index]) {
                swap(arr, index, (index - 1) / 2);
                index = (index - 1) / 2;
            }
        }
    }
    //O(log n)
    public int heap_pop() {
        int len = arr.length;
        int maxVal = 0;
        swap(arr, 0, len - 1);
        maxVal = arr[len - 1];
        max_heapify(0);
        size--;
        return maxVal;
    }
    //O(log n)
    public void increaseKey(int diff, int index) {
        if (diff < 0) {
            System.out.println("Invalid");
        }
        arr[index] += diff;
        while (index > 1 && arr[(index - 1) / 2] < arr[index]) {
            swap(arr, (index - 1) / 2, index);
            index = (index - 1) / 2;
        }
    }
    //O(log n)
    public void decreaseKey(int diff, int index) {
        if (diff > 0) {
            System.out.println("Invalid");
        }
        arr[index] += diff;
        max_heapify(index);
    }
    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    //O(log n)
    public void max_heapify(int idx) {
        int l = 2 * idx + 1;
        int r = 2 * idx + 2;
        int largest = idx;
        if (l < size && arr[l] > arr[largest]) {
            largest = l;    
        }
        if (r < size && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != idx) {
            swap(arr, idx, largest);
            max_heapify(largest);
        }
    }
}


class Main {
	public static void main(String[] args) {
		int[] arr = {1, 8, 6, 3, 4, 2, 5};
		Heap obj = new Heap(10);
		for (int i = 0; i < arr.length; i++) {
		    obj.heap_push(arr[i]);
		}
		System.out.println(obj.heap_pop());
		obj.increaseKey(3, 1);
		obj.decreaseKey(-2, 4);
		for (int i = 0; i < obj.size; i++) {
		    System.out.println(arr[i]);
		}
	}
}
