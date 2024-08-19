public class PrintSolution {
    public static void print(int test, int[] listData1, int[] listData2, int[] expected){
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode expectedList = new ListNode();
        ListNode listNode = new ListNode();

        
        listNode.initList(list1, listData1);
        listNode.initList(list2, listData2);
        listNode.initList(expectedList, expected);
        
        System.out.println("============ Тест " + test + " ============\n");
        System.out.println(" list 1 = " + listNode.toString(list1, ""));
        System.out.println(" list2 = " + listNode.toString(list2, ""));


    }
}
