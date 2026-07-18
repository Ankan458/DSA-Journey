class Node {
    int val;
    Node next;

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    Node(int val) {
        this(val, null);
    }
}

class MyLinkedList {
    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size || head == null) {
            return -1;
        }

        else {
            Node curr = head;

            for(int i = 0; i < index; i++) {
                curr = curr.next;
            }

            return curr.val;
        }
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);

        if(head == null) {
            head = tail = newNode;
        }

        else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if(tail == null) {
            head = tail = newNode;
        }

        else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) {
            return;
        }

        if(index == 0) {
            addAtHead(val);
            return;
        }

        if(index == size) {
            addAtTail(val);
            return;
        }

        Node newNode = new Node(val);
        Node curr = head;

        for(int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size || head == null) {
            return;
        }

        else if(head == tail) {
            head = null;
            tail = null;
            size--;
        }

        else if(index == 0) {
            head = head.next;
            size--;
        }

        else if(index == size - 1) {
            Node curr = head;

            while(curr.next != tail) {
                curr = curr.next;
            }

            curr.next = null;
            tail = curr;
            size--;
        }

        else {
            Node curr = head;

            for(int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }

            curr.next = curr.next.next;
            size--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */