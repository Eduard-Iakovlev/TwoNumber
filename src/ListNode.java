public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;}
     

      public void initList(ListNode head, int[] data){
        head.val = data[0];
        ListNode current = head;
        for(int i : data){
            current.next = new ListNode(i);
            current = current.next;
        }
      }

      public String toString(ListNode list, String listPrint){
       ListNode current = list;
        while(current.next != null){
            listPrint += String.valueOf(current.next.val);
            current = current.next;
            if(current.next != null) listPrint += "->";
        }
        
     
       
        return listPrint;
      }

      public boolean compareLists(ListNode result, ListNode expectedList){
        ListNode current1 = result;
        ListNode current2 = expectedList;

        while(current2 != null){
          if(current1 == null) return false;
          if(current1.val != current2.val) return false;
          current1 = current1.next;
          current2 = current2.next;
        }
        if(current1 != null) return false;

        return true;
      }

      public String printCheck(ListNode result, ListNode expectedList){
        if(compareLists(result, expectedList)) {
          return " ВЕРНО!";
        }
        return " !!!НЕ ВЕРНО!!!";
      }
}
