import java.util.Scanner;

public class Solution {

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		
        LinkedListNode<Integer> begin = head;
        LinkedListNode<Integer> sor = head;
        LinkedListNode<Integer> s = head;
        int count = 0;
        while(begin != null)
        {
            count+=1;
            begin = begin.next;
        }
        int arr[] = new int[count];
        int i=0;
        while(sor != null)
        {
            arr[i] = sor.data;
            sor = sor.next;
            i+=1;
        }
        i=0;
        java.util.Arrays.sort(arr);
        while(head != null)
        {
            head.data = arr[i];
            i+=1;
            head = head.next;
        }
        return s;
	}

}

class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}

public class Runner {
	private static Scanner s = new Scanner(System.in);

	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();

		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		print(Solution.mergeSort(input()));

	}
}
