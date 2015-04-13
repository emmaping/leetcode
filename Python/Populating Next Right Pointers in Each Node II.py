def connect(self, root):
    dummy = TreeNode(0)
    head = root
    while head:
        cur = dummy
        dummy.next = None
        while head:
            if head.left:
                cur.next = head.left
                cur = cur.next
            if head.right:
                cur.next = head.right
                cur = cur.next
            head = head.next
        head = dummy.next 