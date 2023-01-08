package leetcode.addtwonumbers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;
import java.util.*;

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
        assertEquals(0, populateListNode(new int[]{0, 1, 2}).val);
        assertEquals(1, populateListNode(new int[]{0, 1, 2}).next.val);
        assertEquals(2, populateListNode(new int[]{0, 1, 2}).next.next.val);
    }

    @Test
    void populateListNodeTest3() {
        assertEquals(0, populateListNode(new int[]{0, 1, 2, 3}).val);
        assertEquals(1, populateListNode(new int[]{0, 1, 2, 3}).next.val);
        assertEquals(2, populateListNode(new int[]{0, 1, 2, 3}).next.next.val);
        assertEquals(3, populateListNode(new int[]{0, 1, 2, 3}).next.next.next.val);
    }

    @Test
    void exampleOne() {
        ListNode listNodeHead1 = new ListNode(2);
        listNodeHead1.next = new ListNode(4);
        listNodeHead1.next.next = new ListNode(3);

        ListNode listNodeHead2 = new ListNode(5);
        listNodeHead2.next = new ListNode(6);
        listNodeHead2.next.next = new ListNode(4);

        ListNode listNodeHead3 = new ListNode(7);
        listNodeHead3.next = new ListNode(0);
        listNodeHead3.next.next = new ListNode(8);

        assertEquals(listNodeHead3.val, addTwoNumbers(listNodeHead1, listNodeHead2).val);
        assertEquals(listNodeHead3.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.val);
        assertEquals(listNodeHead3.next.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.next.val);
    }

    @Test
    void exampleTwo() {
        ListNode listNodeHead1 = new ListNode(0);
        ListNode listNodeHead2 = new ListNode(0);
        ListNode listNodeHead3 = new ListNode(0);
        assertEquals(listNodeHead3.val, addTwoNumbers(listNodeHead1, listNodeHead2).val);
    }


    @Test
    void examplethree() {
        ListNode listNodeHead1 = new ListNode(9);
        listNodeHead1.next = new ListNode(9);
        listNodeHead1.next.next = new ListNode(9);
        listNodeHead1.next.next.next = new ListNode(9);
        listNodeHead1.next.next.next.next = new ListNode(9);
        listNodeHead1.next.next.next.next.next = new ListNode(9);
        listNodeHead1.next.next.next.next.next.next = new ListNode(9);

        ListNode listNodeHead2 = new ListNode(9);
        listNodeHead2.next = new ListNode(9);
        listNodeHead2.next.next = new ListNode(9);
        listNodeHead2.next.next.next = new ListNode(9);

        ListNode listNodeHead3 = new ListNode(8);
        listNodeHead3.next = new ListNode(9);
        listNodeHead3.next.next = new ListNode(9);
        listNodeHead3.next.next.next = new ListNode(9);
        listNodeHead3.next.next.next.next = new ListNode(0);
        listNodeHead3.next.next.next.next.next = new ListNode(0);
        listNodeHead3.next.next.next.next.next.next = new ListNode(0);
        listNodeHead3.next.next.next.next.next.next.next = new ListNode(1);

        assertEquals(listNodeHead3.val, addTwoNumbers(listNodeHead1, listNodeHead2).val);
        assertEquals(listNodeHead3.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.val);
        assertEquals(listNodeHead3.next.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.next.val);
        assertEquals(listNodeHead3.next.next.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.next.next.val);
        assertEquals(listNodeHead3.next.next.next.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.next.next.next.val);
        assertEquals(listNodeHead3.next.next.next.next.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.next.next.next.next.val);
        assertEquals(listNodeHead3.next.next.next.next.next.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.next.next.next.next.next.val);
        assertEquals(listNodeHead3.next.next.next.next.next.next.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.next.next.next.next.next.next.val);
    }


    @Test
    void exampleFour() {
        ListNode listNodeHead1 = new ListNode(9);

        ListNode listNodeHead2 = new ListNode(1);
        listNodeHead2.next = new ListNode(9);
        listNodeHead2.next.next = new ListNode(9);
        listNodeHead2.next.next.next = new ListNode(9);
        listNodeHead2.next.next.next.next = new ListNode(9);
        listNodeHead2.next.next.next.next.next = new ListNode(9);
        listNodeHead2.next.next.next.next.next.next = new ListNode(9);
        listNodeHead2.next.next.next.next.next.next.next = new ListNode(9);
        listNodeHead2.next.next.next.next.next.next.next.next = new ListNode(9);
        listNodeHead2.next.next.next.next.next.next.next.next.next = new ListNode(9);

        ListNode listNodeHead3 = new ListNode(0);
        listNodeHead3.next = new ListNode(0);
        listNodeHead3.next.next = new ListNode(0);
        listNodeHead3.next.next.next = new ListNode(0);
        listNodeHead3.next.next.next.next = new ListNode(0);
        listNodeHead3.next.next.next.next.next = new ListNode(0);
        listNodeHead3.next.next.next.next.next.next = new ListNode(0);
        listNodeHead3.next.next.next.next.next.next.next = new ListNode(0);
        listNodeHead3.next.next.next.next.next.next.next.next = new ListNode(0);
        listNodeHead3.next.next.next.next.next.next.next.next.next = new ListNode(0);
        listNodeHead3.next.next.next.next.next.next.next.next.next.next = new ListNode(1);

        assertEquals(listNodeHead3.val, addTwoNumbers(listNodeHead1, listNodeHead2).val);
        assertEquals(listNodeHead3.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.val);
        assertEquals(listNodeHead3.next.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.next.val);
        assertEquals(listNodeHead3.next.next.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.next.next.val);
        assertEquals(listNodeHead3.next.next.next.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.next.next.next.val);
        assertEquals(listNodeHead3.next.next.next.next.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.next.next.next.next.val);
        assertEquals(listNodeHead3.next.next.next.next.next.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.next.next.next.next.next.val);
        assertEquals(listNodeHead3.next.next.next.next.next.next.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.next.next.next.next.next.next.val);
        assertEquals(listNodeHead3.next.next.next.next.next.next.next.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.next.next.next.next.next.next.next.val);
        assertEquals(listNodeHead3.next.next.next.next.next.next.next.next.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.next.next.next.next.next.next.next.next.val);
        assertEquals(listNodeHead3.next.next.next.next.next.next.next.next.next.next.val, addTwoNumbers(listNodeHead1, listNodeHead2).next.next.next.next.next.next.next.next.next.next.val);
    }

    @Test
    void exampleFive() {
        ListNode listNodeHead1 = new ListNode(0);
        ListNode listNodeHead2 = new ListNode(1);
        ListNode listNodeHead3 = new ListNode(1);
        assertEquals(listNodeHead3.val, addTwoNumbers(listNodeHead1, listNodeHead2).val);
    }
    @Test
    void exampleSix() {
        ListNode listNodeHead1 = new ListNode(2);
        ListNode listNodeHead2 = new ListNode(0);
        ListNode listNodeHead3 = new ListNode(2);
        assertEquals(listNodeHead3.val, addTwoNumbers(listNodeHead1, listNodeHead2).val);
    }


    @Test
    void exampleSeven() {
        //[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]

        ListNode lnh1 = populateListNode(new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1});
        ListNode listNodeHead1 = new ListNode(1);
        listNodeHead1.next = new ListNode(0);
        listNodeHead1.next.next = new ListNode(0);
        listNodeHead1.next.next.next = new ListNode(0);
        listNodeHead1.next.next.next.next = new ListNode(0);
        listNodeHead1.next.next.next.next.next = new ListNode(0);
        listNodeHead1.next.next.next.next.next.next = new ListNode(0);
        listNodeHead1.next.next.next.next.next.next.next = new ListNode(0);
        listNodeHead1.next.next.next.next.next.next.next.next = new ListNode(0);
        listNodeHead1.next.next.next.next.next.next.next.next.next = new ListNode(0);
        listNodeHead1.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        listNodeHead1.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        listNodeHead1.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        listNodeHead1.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        listNodeHead1.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        listNodeHead1.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        listNodeHead1.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);

        // [5,6,4]
        ListNode lnh2 = populateListNode(new int[]{5,6,4});
        ListNode listNodeHead2 = new ListNode(1);
        listNodeHead2.next = new ListNode(9);
        listNodeHead2.next.next = new ListNode(9);
        listNodeHead2.next.next.next = new ListNode(9);
        listNodeHead2.next.next.next.next = new ListNode(9);
        listNodeHead2.next.next.next.next.next = new ListNode(9);
        listNodeHead2.next.next.next.next.next.next = new ListNode(9);
        listNodeHead2.next.next.next.next.next.next.next = new ListNode(9);
        listNodeHead2.next.next.next.next.next.next.next.next = new ListNode(9);
        listNodeHead2.next.next.next.next.next.next.next.next.next = new ListNode(9);

        // [6,6,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
        ListNode lnh3 = populateListNode(new int[]{6,6,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1});
        ListNode listNodeHead3 = new ListNode(0);
        listNodeHead3.next = new ListNode(0);
        listNodeHead3.next.next = new ListNode(0);
        listNodeHead3.next.next.next = new ListNode(0);
        listNodeHead3.next.next.next.next = new ListNode(0);
        listNodeHead3.next.next.next.next.next = new ListNode(0);
        listNodeHead3.next.next.next.next.next.next = new ListNode(0);
        listNodeHead3.next.next.next.next.next.next.next = new ListNode(0);
        listNodeHead3.next.next.next.next.next.next.next.next = new ListNode(0);
        listNodeHead3.next.next.next.next.next.next.next.next.next = new ListNode(0);
        listNodeHead3.next.next.next.next.next.next.next.next.next.next = new ListNode(1);

        assertEquals(lnh3.val, addTwoNumbers(lnh1, lnh2).val);
        assertEquals(lnh3.next.val, addTwoNumbers(lnh1, lnh2).next.val);
        assertEquals(lnh3.next.next.val, addTwoNumbers(lnh1, lnh2).next.next.val);
        assertEquals(lnh3.next.next.next.val, addTwoNumbers(lnh1, lnh2).next.next.next.val);
        assertEquals(lnh3.next.next.next.next.val, addTwoNumbers(lnh1, lnh2).next.next.next.next.val);
        assertEquals(lnh3.next.next.next.next.next.val, addTwoNumbers(lnh1, lnh2).next.next.next.next.next.val);
        assertEquals(lnh3.next.next.next.next.next.next.val, addTwoNumbers(lnh1, lnh2).next.next.next.next.next.next.val);
        assertEquals(lnh3.next.next.next.next.next.next.next.val, addTwoNumbers(lnh1, lnh2).next.next.next.next.next.next.next.val);
        assertEquals(lnh3.next.next.next.next.next.next.next.next.val, addTwoNumbers(lnh1, lnh2).next.next.next.next.next.next.next.next.val);
        assertEquals(lnh3.next.next.next.next.next.next.next.next.next.val, addTwoNumbers(lnh1, lnh2).next.next.next.next.next.next.next.next.next.val);
        assertEquals(lnh3.next.next.next.next.next.next.next.next.next.next.val, addTwoNumbers(lnh1, lnh2).next.next.next.next.next.next.next.next.next.next.val);
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
        return (sumArrays(ln1Values, ln2Values));
    }

    /**
     * takes normal ordered array of numbers and provides a reverse ordered ListNode
     *
     * @param ints int[],
     * @return ListNode,
     */
    private ListNode populateListNode(int[] ints) {
        if (ints.length == 1) return new ListNode(ints[0]);
        if (ints.length == 2) {
            return new ListNode(ints[1], new ListNode(ints[0]));
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < ints.length; i++) {
                list.add(ints[i]);
            }
//            Collections.reverse(list);
            ListNode headNode = new ListNode(list.get(0));
            ListNode myList = headNode;

            if (list.size() > 1) {
                for (int i = 1; i < list.size(); i++) {
                    ListNode nextNode = new ListNode(list.get(i));
                    headNode.next = nextNode;
                    headNode = headNode.next;
                }
            }
            return myList;
        }
    }

    private ListNode sumArrays(int[] ln1Values, int[] ln2Values) {
        System.out.printf("%s + %s = ", Arrays.toString(ln1Values), Arrays.toString(ln2Values));
        BigInteger bisum1 = BigInteger.valueOf(0);
        for (int i = 0; i < ln1Values.length; i++) {
            long intSum = (long) (ln1Values[i] * Math.pow(10, ln1Values.length - i - 1));
            BigInteger bigintSum = BigInteger.valueOf((long) (ln1Values[i] * Math.pow(10, ln1Values.length - i - 1)));
            bisum1 = bisum1.add(BigInteger.valueOf(intSum));
        }
        BigInteger bisum2 = BigInteger.valueOf(0);
        for (int j = 0; j < ln2Values.length; j++) {
            long intSum = (long) (ln2Values[j] * Math.pow(10, ln2Values.length - j - 1));
            bisum2 = bisum2.add(BigInteger.valueOf(intSum));
        }

        BigInteger biTotal = (bisum1).add(bisum2);
        String strTotal = biTotal + "";
//        System.out.println("strTotals:" + strTotal);
        System.out.println(biTotal);
        String[] strArr = strTotal.split("");
        List<String> list = Arrays.asList(strArr);

        Collections.reverse(list);
        String[] reversedArray = list.toArray(strArr);
        System.out.println("(reversed)" + Arrays.toString(reversedArray));

        ListNode head = new ListNode(Integer.parseInt(reversedArray[0]));
        ListNode myList = head;
        for (int i = 1; i < reversedArray.length; i++) {
            try {
                head.next = new ListNode(Integer.parseInt(reversedArray[i]));
                head = head.next;
            } catch (NumberFormatException e) {
                head.next = new ListNode(0);
                head = head.next;
            }
        }
        return myList;
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
        while (ln1.next != null) {
            ints.add(ln1.next.val);
            ln1 = ln1.next;
        }
        Collections.reverse(ints);
        int[] returnArray = new int[ints.size()];
        int indx = 0;
        for (Integer i : ints) {
            returnArray[indx] = i;
            indx++;
        }
        return returnArray;
    }

}
