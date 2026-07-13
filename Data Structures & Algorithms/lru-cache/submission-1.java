
class Node {
    int key;
    int value;
    Node prev;
    Node next;
    Node(int k, int v) {
        key = k;
        value = v;
        prev = null;
        next = null;
    }
}
class LRUCache {
    private int capacity;
    private Node head;
    private Node tail;
    private HashMap<Integer, Node> map;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    /**************HELPER FUNCTIONS***************/
    private void addNode(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }
    private void removeNode(Node node) {
        Node previous = node.prev;
        Node nextNode = node.next;

        previous.next = nextNode;
        nextNode.prev = previous;
    }

    private void moveFront(Node node) {
        removeNode(node);
        addNode(node);
    }

    private Node removeLRU() {
        Node lru = tail.prev;
        removeNode(lru);
        return lru;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        moveFront(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);

            node.value = value;

            moveFront(node);
        } else {
            Node newNode = new Node(key, value);

            map.put(key, newNode);

            addNode(newNode);

            if (map.size() > capacity) {
                Node lru = removeLRU();

                map.remove(lru.key);
            }
        }
    }
}
