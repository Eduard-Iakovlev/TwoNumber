public class Solution {
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode current = new ListNode();
         ListNode result = current;
        int over = 0;

        while(l1 != null || l2 != null){
            
            if(l1 != null){
                current.val += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                current.val += l2.val;
                l2 = l2.next;
            }
            if(current.val > 9){
                current.val %= 10;
                over = 1;
            }else over = 0;            
            
            if(l1 != null || l2 != null){
                current.next = new ListNode(over);
                current = current.next;
            }
        }
        if(over != 0){
            current.next = new ListNode();
            current = current.next;
            current.val = over;
        }
     

        return result;
    }
}
/*
Среда выполнения
2мс
Превосходит
15.28%
Анализ сложности
O(N)
Память
44.06MB
Превосходит
91,68%
Анализ сложности
O(N)
*/