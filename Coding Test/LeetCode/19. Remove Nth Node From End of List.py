class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy=ListNode()
        dummy.next=head
        
        left=dummy
        right=dummy
        
        for i in range(n):
            right=right.next
        
        while right.next is not None:
            left=left.next
            right=right.next
            
        left.next=left.next.next
        
        return dummy.next
