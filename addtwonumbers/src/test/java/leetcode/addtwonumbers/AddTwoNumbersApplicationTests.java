package leetcode.addtwonumbers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AddTwoNumbersApplicationTests {

    @Test
    void populateArraysTest1() {
        assertArrayEquals(new int[]{0}, populateArray(new ListNode(0)));
    }

    @Test
    void populateArraysTest2() {
        ListNode myNode = new ListNode(9);
        myNode.next = new ListNode(9);
        int[] expectedArray = new int[]{9, 9};
        assertArrayEquals(expectedArray, populateArray(myNode));
    }
    @Test
    void populateArraysTest3() {
        ListNode myNode = new ListNode(8);
        myNode.next = new ListNode(9);
        int[] expectedArray = new int[]{9, 8};
        assertArrayEquals(expectedArray, populateArray(myNode));
    }
    @Test
    void populateArraysTest4() {
        ListNode myNode = new ListNode(3);
        myNode.next = new ListNode(2);
        myNode.next.next = new ListNode(1);
        int[] expectedArray = new int[]{1, 2, 3};
        assertArrayEquals(expectedArray, populateArray(myNode));
    }

    @Test
    void populateListNodeTest1() {
        assertEquals(1, populateListNode(new int[]{0, 1}).val);
        assertEquals(0, populateListNode(new int[]{0, 1}).next.val);
    }
    @Test
    void populateListNodeTest2() {
        assertEquals(2, populateListNode(new int[]{0, 1, 2}).val);
        assertEquals(1, populateListNode(new int[]{0, 1, 2}).next.val);
        assertEquals(0, populateListNode(new int[]{0, 1, 2}).next.next.val);
    }

    /**
     * Given two non-empty linked lists provided in reverse order,
     * each of their nodes containing a single digit, adds the two numbers
     * and return the sum as a linked-list in reverse order.
     *
     * @param ln1 first ListNode,
     * @param ln2 second ListNode,
     * @return ListNode provided by populateListNode( sumArrays(ln1Values, ln2Values))
     */
    public ListNode addTwoNumbers(ListNode ln1, ListNode ln2) {
        int[] ln1Values = populateArray(ln1);
        int[] ln2Values = populateArray(ln2);
        int[] ln3Values = sumArrays(ln1Values, ln2Values);
        return populateListNode(ln3Values);
    }

    /**
     * takes normal ordered array of numbers and provides a reverse ordered ListNode
     *
     * @param ints int[],
     * @return ListNode,
     */
    private ListNode populateListNode(int[] ints) {
//        if (ints.length == 0) return new ListNode();
        if (ints.length == 1) return new ListNode(ints[0]);
        if (ints.length == 2) {
            return new ListNode(ints[1], new ListNode(ints[0]));
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i =0; i<ints.length; i++){
                list.add(ints[i]);
            }
            System.out.println(list);
            Collections.reverse(list);
            System.out.println(list);
            ListNode head = new ListNode(list.get(0));
            ListNode returnedListNode = head;
            for(int i =0; i< list.size(); i++){
                head.next = new ListNode(list.get(i));
                returnedListNode = returnedListNode.next;
            }
            return returnedListNode;
        }
    }

    private int[] sumArrays(int[] ln1Values, int[] ln2Values) {
        return new int[]{0, 1};
    }

    /**
     * given a linked-list "ln1", with each node containing an int attribute named val,
     * returns the correctly ordered list as an int[]
     *
     * @param ln1 ListNode,
     * @return int[]
     */
    public static int[] populateArray(ListNode ln1) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(ln1.val);
        while(ln1.next!= null){
            ints.add(ln1.next.val);
            ln1 = ln1.next;
        }
        Collections.reverse(ints);

        return ints.stream().filter(Objects::nonNull).mapToInt(i->i).toArray();
    }
}
