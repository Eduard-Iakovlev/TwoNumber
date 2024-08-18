public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;}

      public static void initList(ListNode head, int[] data){
        head.val = data[0];
        ListNode current = head;
        for(int i : data){
            current.next = new ListNode(i);
            current = current.next;
        }
      }
}
