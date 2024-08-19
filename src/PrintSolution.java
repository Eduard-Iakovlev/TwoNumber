public class PrintSolution {
    public void print(int test, int[] listData1, int[] listData2, int[] expected){
        Solution solution = new Solution();

        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode expectedList = new ListNode();
        ListNode listNode = new ListNode();
        
        
        listNode.initList(l1, listData1);
        listNode.initList(l2, listData2);
        listNode.initList(expectedList, expected);
        
        System.out.println("============ Тест " + test + " ============\n");
        System.out.println(" list 1 = " + listNode.toString(l1, ""));
        System.out.println(" list 2 = " + listNode.toString(l2, ""));
        System.out.println(" Expected: " + listNode.toString(expectedList, ""));
        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.println(" Actual result: " + listNode.toString(result, ""));
        System.out.println("\n------------ Проверка ------------");
        System.out.println(listNode.printCheck(result, expectedList));
        System.out.println("----------------------------------\n");


    }
}
