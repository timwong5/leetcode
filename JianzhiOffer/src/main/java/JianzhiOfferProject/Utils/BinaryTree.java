package JianzhiOfferProject.Utils;

import java.util.LinkedList;

/**
 * @author timwong5
 * @date 2022-07-11 14:34
 */
public class BinaryTree<Item> {


    public static class Node<T> {
        private T data;
        private Node<T> leftChild;
        private Node<T> rightChild;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node<T> getLeftChild() {
            return leftChild;
        }

        public Node<T> getRightChild() {
            return rightChild;
        }


        @Override
        public String toString() {
            String leftChildInfo = leftChild == null ? null : leftChild.getData().toString();
            String rightChildInfo = rightChild == null ? null : rightChild.getData().toString();
            return "Node{" +
                    "data=" + data +
                    ", leftChild=" + leftChild +
                    ", rightChild=" + rightChild +
                    '}';
        }
    }

    private Node<Item> root;
    private int nodeSum;

    public void setRoot(Item data) {
        root = new Node<>(data);
        nodeSum++;
    }

    public void addLeftChild(Item data, Node<Item> parent) {
        parent.leftChild = new Node<>(data);
        nodeSum++;
    }

    public void addRightChild(Item data, Node<Item> parent) {
        parent.rightChild = new Node<>(data);
        nodeSum++;
    }

    /**
     * 递归查找子节点
     *
     * @param node
     * @return
     */
    public Node<Item> parentTo(Node<Item> node) {
        return parentTo(root, node);
    }

    private Node<Item> parentTo(Node<Item> currentNode, Node<Item> node) {
        if (currentNode == null) {
            return null;
        }

        if (node == currentNode.leftChild || node == currentNode.rightChild) {
            return currentNode;
        }

        Node<Item> p = parentTo(currentNode.leftChild, node);
        if (p != null) {
            return p;
        } else {
            return parentTo(currentNode.rightChild, node);
        }
    }

    public Node<Item> getRoot() {
        return root;
    }


    /**
     * 查找节点的深度
     *
     * @param node
     * @return
     */
    public int degreeForNode(Node<Item> node) {
        if (node.leftChild != null && node.rightChild != null) {
            return 2;
        } else if (node.leftChild != null || node.rightChild == null) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * 二叉树的度数 二叉树的度是指树中所有节点的度数的最大值， 节点的度数是指节点有几个叉
     * 1度就代表只有一个子节点或者它是单子树,
     * 2度就代表有两个子节点或是左右子树都有,二叉树就是一个连通的无环图,并且每一个顶点的度不大于3。
     * 二叉树的度小于等于2,因为二叉树的定义要求二叉树中任意节点的度数(节点的分支数)小于等于2
     *
     * @return
     */
    public int degree() {
        // 无非三种情况
        // 1. 只有一个根结点，度为0
        // 2. 斜树，度为1
        // 3.其余情况度是2
        if (root.leftChild == null && root.rightChild == null) {
            return 0;
            // 斜树的结点数等于其深度，包括了只有根结点的情况，所以上面的条件要先判断
        } else if (nodeSum == depth()) {
            return 1;
        } else {
            return 2;
        }
    }

    /**
     * 求二叉树的深度
     *
     * @return
     */
    private int depth() {
        return depthForSubTree(root);
    }

    public int depthForSubTree(Node<Item> node) {
        if (node == null) {
            return 0;
        }
        // 从上到下递归，从下到上返回深度，下面就是返回某结点两个孩子中深度最大的那个，加1继续返回到上一层
        int lDepth = depthForSubTree(node.leftChild);
        int rDepth = depthForSubTree(node.rightChild);
        return lDepth > rDepth ? lDepth + 1 : rDepth + 1;
    }

    public int getNodeSum() {
        return nodeSum;
    }


    /**
     * 递归前序遍历
     *
     * @param node
     */
    public void preOrder(Node<Item> node) {
        if (node == null) {
            return;
        } else {
            //root -> left -> right
            System.out.println(node.getData() + " ");
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }

    public void preOrderNoRecu(Node<Item> node) {
        // 用栈保存已经访问过的结点，便于返回到父结点
        LinkedList<Node<Item>> stack = new LinkedList<>();
        // 当前结点不为空，或者为空但有可以返回的父结点（可以进行pop操作）都可以进入循环
        while (root != null || !stack.isEmpty()) {
            // 只要存在当前结点，就打印，同时入栈
            while (root != null) {
                stack.push(root);
                System.out.println(root.getData() + " ");
                root = root.leftChild;
            }
            // 上面while终止说明当前结点为空；返回到父结点并处理它的右子树。由于要执行pop操作，先判空
            if (!stack.isEmpty()) {
                // 返回到父结点。由于左孩子为空返回时已经弹出过父结点了，所以若是由于右孩子为空返回，会一次性返回到多层
                root = stack.pop();
                // 开始右子树的大循环（第一个while)
                root = root.rightChild;
            }

        }


    }

    public void inOrder(Node<Item> node) {
        if (node == null) {
            return;
        } else {
            //left -> root -> right
            inOrder(node.leftChild);
            System.out.println(node.getData() + " ");
            inOrder(node.rightChild);
        }

    }

    /**
     * 中序非递归
     *
     * @param node
     */
    public void inOrderNoRec(Node<Item> node) {
        LinkedList<Node<Item>> stack = new LinkedList<>();
        //left -> root -> right
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(node);
                node = node.leftChild;

            }
            node = stack.pop();
            System.out.println(node.getData() + " ");
            node = node.rightChild;
        }
    }

    public void postOrder(Node<Item> node) {
        if (node == null) {
            return;
        }
        // left -> right -> root
        else {
            postOrder(node.leftChild);
            postOrder(node.rightChild);
            System.out.println(node.getData() + " ");
        }
    }

    //Todo postOrderNoRecu


    public void levelOrder(Node<Item> root){
        
    }


}
