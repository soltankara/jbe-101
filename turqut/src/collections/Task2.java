package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {

    }

    //Arrays - DS
    public static List<Integer> reverseArray(List<Integer> a) {
        Collections.reverse(a);
        return a;
    }

    //2D Arrays - DS
    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(i).size() - 2; j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    //Left Rotation
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        Collections.rotate(arr, -d);
        return arr;
    }


    //Print the elements of a Linked List
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }

    //Insert a node at the tail of a Linked List
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (head == null) {
            return newNode;
        }
        SinglyLinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    //Insert a node at the head of a linked list
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = llist;
        return newNode;
    }

    //Insert a node at a specific position in a linked list
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (position == 0) {
            newNode.next = llist;
            return newNode;
        }
        SinglyLinkedListNode current = llist;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            return llist;
        }
        newNode.next = current.next;
        current.next = newNode;
        return llist;
    }

    //Delete a Node
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        if (position == 0) {
            return llist.next;
        }
        SinglyLinkedListNode current = llist;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            return llist;
        }
        current.next = current.next.next;
        return llist;
    }

    //Print in Reverse
    public static void reversePrint(SinglyLinkedListNode llist) {
        if (llist == null) {
            return;
        }
        reversePrint(llist.next);
        System.out.println(llist.data);
    }

    //Reverse a linked list
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode current = llist;
        SinglyLinkedListNode nextNode = null;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;

    }

    //Compare two linked lists
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode current1 = head1;
        SinglyLinkedListNode current2 = head2;
        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return current1 == null && current2 == null;
    }

    //Merge two sorted linked lists
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode result = null;
        SinglyLinkedListNode current1 = head1;
        SinglyLinkedListNode current2 = head2;

        if (current1 == null) {
            return current2;
        } else if (current2 == null) {
            return current1;
        }

        if (current1.data <= current2.data) {
            result = current1;
            result.next = mergeLists(current1.next, current2);
        } else {
            result = current2;
            result.next = mergeLists(current1, current2.next);
        }
        return result;
    }

    //Get Node Value
    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        SinglyLinkedListNode first = llist;
        SinglyLinkedListNode second = llist;

        for (int i = 0; i <= positionFromTail; i++) {
            if (first == null) {
                throw new IndexOutOfBoundsException("Position from tail out of bounds");
            }
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second.data;
    }

    //Delete duplicate-value nodes from a sorted linked list
    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
        SinglyLinkedListNode current = llist;
        SinglyLinkedListNode nextNode = null;

        while (current != null) {
            nextNode = current.next;
            while (nextNode != null && current.data == nextNode.data) {
                nextNode = nextNode.next;
            }
            current.next = nextNode;
            current = nextNode;
        }
        return llist;

    }

    //Find Merge Point of Two Lists
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode current1 = head1;
        SinglyLinkedListNode current2 = head2;

        while (current1 != current2) {
            current1 = (current1 == null) ? head2 : current1.next;
            current2 = (current2 == null) ? head1 : current2.next;
        }
        return current1.data;
    }

    //Inserting a Node Into a Sorted Doubly Linked List
    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if (llist == null || llist.data >= newNode.data) {
            newNode.next = llist;
            llist.prev = newNode;
            return newNode;
        }
        DoublyLinkedListNode current = llist;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;

        return llist;
    }

    //Reverse a doubly linked list
    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        DoublyLinkedListNode prev = null;
        DoublyLinkedListNode current = llist;
        DoublyLinkedListNode nextNode = null;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            current.prev = nextNode;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    //Dynamic Array
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> seqList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<>());
        }
        int lastAnswer = 0;
        for (List<Integer> query : queries) {
            int operation = query.get(0);
            int x = query.get(1);
            int y = query.get(2);
            int index = (x ^ lastAnswer) % n;
            if (operation == 1) {
                seqList.get(index).add(y);
            } else if (operation == 2) {
                lastAnswer = seqList.get(index).get(y % seqList.get(index).size());
                result.add(lastAnswer);
            }
        }
        return result;
    }

    //Sparse Arrays
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : stringList) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (String query : queries) {
            result.add(map.getOrDefault(query, 0));
        }

        return result;
    }

    //Cycle Detection (Floyd's cycle detection algorithm, complexity O(n) I mean.)
    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    //Array manipulation(complexity O(n + m) I mean.)
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] arr = new long[n + 1];
        long max = 0;
        long current = 0;
        for (List<Integer> query : queries) {
            int a = query.get(0) - 1;
            int b = query.get(1);
            int k = query.get(2);

            arr[a] += k;
            if (b < n) {
                arr[b] -= k;
            }
        }
        for (int i = 0; i < n; i++) {
            current += arr[i];
            max = Math.max(max, current);
        }
        return max;
    }


}

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class DoublyLinkedListNode {
    int data;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
