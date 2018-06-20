package tree;

public class BinaryTree {

    public static void test(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(3, 333);
        binaryTree.insert(1, 111);
        binaryTree.insert(2, 222);
        binaryTree.insert(4, 444);

        binaryTree.printAllTree();
    }

    private Node root;

    public void insert(int index, int value) {
        Node newNode = new Node(index, value);

        Node current = root;
        Node parent;
        while (current != null) {
            parent = current;

            if (current.getIndex() > index) {
                current = current.getLeftNode();

                if (current == null)
                    parent.setLeftNode(newNode);
            } else {
                current = current.getRightNode();

                if (current == null)
                    parent.setRightNode(newNode);
            }
        }

        if (root == null)
            root = newNode;
    }

    public void printAllTree() {
        if (root != null) {
            printTree(root);
        }
    }

    private void printTree(Node parent) {
        if (parent != null)
            parent.printData();

        if (parent.getLeftNode() != null)
            printTree(parent.getLeftNode());

        if (parent.getRightNode() != null)
            printTree(parent.getRightNode());
    }


    public class Node {
        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }

        public void printData() {
            System.out.println(String.format("index:%d,value:%d", index, value));
        }

        private int index;
        private int value;
        private Node leftNode;
        private Node rightNode;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(Node leftNode) {
            this.leftNode = leftNode;
        }

        public Node getRightNode() {
            return rightNode;
        }

        public void setRightNode(Node rightNode) {
            this.rightNode = rightNode;
        }
    }
}

