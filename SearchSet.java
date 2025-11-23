public class SearchSet {
    private int numElements;
    private BinaryTreeNode head;

    public SearchSet() {
        this.numElements = 0;
        this.head = null;
    }

    public int getNumElements() {
        return numElements;
    }

    public boolean contains(int x) {
        BinaryTreeNode current = head;

        while (current != null) {
            if (x == current.getValue()) {
                return true;
            }
            else if (x < current.getValue()) {
                current = current.getLeft();
            }
            else {
                current = current.getRight();
            }
        }
        return false;
    }

    public void insert(int x) {
        if (head == null) {
            head = new BinaryTreeNode(x);
            numElements++;
            return;
        }

        BinaryTreeNode current = head;

        while (true) {
            if (x == current.getValue()) {
                // No duplicates allowed
                return;
            }
            else if (x < current.getValue()) {
                if (current.getLeft() == null) {
                    current.setLeft(new BinaryTreeNode(x));
                    numElements++;
                    return;
                }
                current = current.getLeft();
            }
            else {
                if (current.getRight() == null) {
                    current.setRight(new BinaryTreeNode(x));
                    numElements++;
                    return;
                }
                current = current.getRight();
            }
        }
    }

    public static void main(String[] args) {
        SearchSet set = new SearchSet();

        set.insert(5);
        set.insert(3);
        set.insert(7);
        set.insert(5); // duplicate ignored

        System.out.println(set.getNumElements()); // 3
        System.out.println(set.contains(3)); // true
        System.out.println(set.contains(8)); // false
    }
}
