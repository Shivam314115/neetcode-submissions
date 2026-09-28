class Node {
    int val;
    Node next;

    public Node(int x) {
        this.val = x;
        this.next = null;
    }
}

class MyHashSet {

    private static final int SIZE = 10; // number of buckets
    private Node[] arr;

    public MyHashSet() {
        arr = new Node[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        int index = hash(key);

        Node head = arr[index];

        // 🔁 Check if key already exists
        Node temp = head;
        while (temp != null) {
            if (temp.val == key) return; // no duplicates
            temp = temp.next;
        }

        // ➕ Insert at beginning
        Node newNode = new Node(key);
        newNode.next = head;
        arr[index] = newNode;
    }

    public void remove(int key) {
        int index = hash(key);
        Node temp = arr[index];
        Node prev = null;

        while (temp != null) {
            if (temp.val == key) {
                if (prev == null) {
                    arr[index] = temp.next; // remove head
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public boolean contains(int key) {
        int index = hash(key);
        Node temp = arr[index];

        while (temp != null) {
            if (temp.val == key) return true;
            temp = temp.next; // ❗ move forward
        }

        return false;
    }
}
