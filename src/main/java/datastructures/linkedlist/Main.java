package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList;

        // Test 1: Empty list
        System.out.println("Test 1: Empty List");
        myLinkedList = new LinkedList(1);
        myLinkedList.makeEmpty();
        myLinkedList.partitionList(3);
        System.out.println("List: (empty)");
        System.out.println("Expected: empty");
        myLinkedList.printList();
        System.out.println();

        // Test 2: Single node (< x)
        System.out.println("Test 2: Single Node (< x)");
        myLinkedList = new LinkedList(1);
        myLinkedList.partitionList(3);
        System.out.println("List: 1");
        System.out.println("Expected: 1");
        myLinkedList.printList();
        System.out.println();

        // Test 3: Single node (>= x)
        System.out.println("Test 3: Single Node (>= x)");
        myLinkedList = new LinkedList(5);
        myLinkedList.partitionList(3);
        System.out.println("List: 5");
        System.out.println("Expected: 5");
        myLinkedList.printList();
        System.out.println();

        // Test 4: All nodes < x
        System.out.println("Test 4: All Nodes < x");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(0);
        myLinkedList.partitionList(5);
        System.out.println("List: 1 -> 2 -> 0");
        System.out.println("Expected: 1 -> 2 -> 0");
        myLinkedList.printList();
        System.out.println();

        // Test 5: All nodes >= x
        System.out.println("Test 5: All Nodes >= x");
        myLinkedList = new LinkedList(5);
        myLinkedList.append(6);
        myLinkedList.append(7);
        myLinkedList.partitionList(5);
        System.out.println("List: 5 -> 6 -> 7");
        System.out.println("Expected: 5 -> 6 -> 7");
        myLinkedList.printList();
        System.out.println();

        // Test 6: Mixed nodes (< x and >= x)
        System.out.println("Test 6: Mixed Nodes");
        myLinkedList = new LinkedList(3);
        myLinkedList.append(5);
        myLinkedList.append(8);
        myLinkedList.append(5);
        myLinkedList.append(10);
        myLinkedList.append(2);
        myLinkedList.append(1);
        myLinkedList.partitionList(5);
        System.out.println("Original List: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1");
        System.out.println("Expected: 3 -> 2 -> 1 -> 5 -> 8 -> 5 -> 10");
        myLinkedList.printList();
        System.out.println();

        // Test 7: Nodes with duplicates around pivot
        System.out.println("Test 7: Duplicates Around Pivot");
        myLinkedList = new LinkedList(5);
        myLinkedList.append(1);
        myLinkedList.append(5);
        myLinkedList.append(0);
        myLinkedList.append(5);
        myLinkedList.partitionList(5);
        System.out.println("Original List: 5 -> 1 -> 5 -> 0 -> 5");
        System.out.println("Expected: 1 -> 0 -> 5 -> 5 -> 5");
        myLinkedList.printList();
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            Test 1: Empty List
            List: (empty)
            Expected: empty
            empty

            Test 2: Single Node (< x)
            List: 1
            Expected: 1
            1

            Test 3: Single Node (>= x)
            List: 5
            Expected: 5
            5

            Test 4: All Nodes < x
            List: 1 -> 2 -> 0
            Expected: 1 -> 2 -> 0
            1 -> 2 -> 0

            Test 5: All Nodes >= x
            List: 5 -> 6 -> 7
            Expected: 5 -> 6 -> 7
            5 -> 6 -> 7

            Test 6: Mixed Nodes
            Original List: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1
            Expected: 3 -> 2 -> 1 -> 5 -> 8 -> 5 -> 10
            3 -> 2 -> 1 -> 5 -> 8 -> 5 -> 10

            Test 7: Duplicates Around Pivot
            Original List: 5 -> 1 -> 5 -> 0 -> 5
            Expected: 1 -> 0 -> 5 -> 5 -> 5
            1 -> 0 -> 5 -> 5 -> 5
        */

    }

}
