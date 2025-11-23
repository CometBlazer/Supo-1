public class FunctionalArray {
    private final BinaryTreeNode root;
    private final int size;

    public FunctionalArray(int size) {
        this.size = size;
        this.root = buildTree(0, size - 1);
    }

    private BinaryTreeNode buildTree(int low, int high) {
        if (low > high) return null;

        int mid = (low + high) / 2;
        BinaryTreeNode node = new BinaryTreeNode(0);

        node.setLeft(buildTree(low, mid - 1));
        node.setRight(buildTree(mid + 1, high));

        return node;
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        BinaryTreeNode node = getNode(root, 0, size - 1, index);
        node.setValue(value);
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        return getNode(root, 0, size - 1, index).getValue();
    }

    private BinaryTreeNode getNode(BinaryTreeNode node, int low, int high, int index) {
        int mid = (low + high) / 2;

        if (index == mid) return node;
        else if (index < mid) return getNode(node.getLeft(), low, mid - 1, index);
        else return getNode(node.getRight(), mid + 1, high, index);
    }

    public static void main(String[] args) {
        FunctionalArray fa = new FunctionalArray(10);
        fa.set(3, 42);
        System.out.println(fa.get(3)); // Should print 42

        //out of bounds test
        try {
            fa.get(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds caught successfully.");
        }
    }
}
