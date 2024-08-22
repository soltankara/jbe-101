package session18;

public class Problems {
    public static void main(String[] args) {
        //21. Merge Two Sorted Lists
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode a = mergeTwoLists(list1, list2);
        while (a != null) {
            System.out.print(a.value + " ");
            a = a.next;
        }
        System.out.println();

        //83. Remove Duplicates from Sorted List
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        ListNode b = deleteDuplicates(head);
        while (b != null) {
            System.out.print(b.value + " ");
            b = b.next;
        }
        System.out.println();

        //141. Linked List Cycle
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(0);
        head1.next.next.next = new ListNode(-4);
        head1.next.next.next.next = head1.next;
        System.out.println("Is it cycle?: " + hasCycle(head1));

        //160. Intersection of Two Linked Lists
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(9);
        headA.next.next = new ListNode(1);
        ListNode join = new ListNode(2);
        headA.next.next.next = join;
        join.next = new ListNode(4);
        ListNode headB = new ListNode(3);
        headB.next = join;
        ListNode joinNode = getIntersectionNode(headA, headB);
        System.out.println(joinNode.value);


    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.value <= list2.value) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
        }
        current = current.next;
        current.next = list1 != null ? list1 : list2;
        return dummy.next;
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.value == current.next.value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        while (pointerA != pointerB) {
            pointerA = pointerA == null ? headB : pointerA.next;
            pointerB = pointerB == null ? headA : pointerB.next;
        }
        return pointerA;
    }

}
