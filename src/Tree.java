class Tree<T extends Comparable<T>> {
    public Node<T> root = null;

    public void insertBinarySearchTree(T item) {
        boolean finished = false;
        Node<T> newNode = new Node<>(item);
        if (root == null)
            root = newNode;
        else {
            Node<T> temp = root;
            while(!finished) {
                if (item.compareTo(temp.getItem()) < 0) {
                    if (temp.getL_link() != null)
                        temp = temp.getL_link();
                    else {
                        if (item.compareTo(temp.getItem()) < 0) {
                            temp.setL_link(newNode);
                            temp.setL_tag(true);
                        }
                        else {
                            temp.setR_link(newNode);
                            temp.setR_tag(true);
                        }
                        finished = true;
                    }
                }
                else if (item.compareTo(temp.getItem()) > 0) {
                    if (temp.getR_link() != null)
                        temp = temp.getR_link();
                    else {
                        if (item.compareTo(temp.getItem()) < 0) {
                            temp.setL_link(newNode);
                            temp.setR_tag(true);
                        }
                        else {
                            temp.setR_link(newNode);
                            temp.setR_tag(true);
                        }
                        finished = true;
                    }
                }
                else {
                    if (temp.getL_link() != null) {
                        Node<T> n = temp.getL_link();
                        temp.setL_link(newNode);
                        newNode.setL_link(n);
                    }
                    else
                        temp.setL_link(newNode);
                    finished = true;
                }
            }
        }
    }

    public Node<T> findCustomerIterative(String key) {
        Node<T> temp = root;
        if (temp == null)
            return null;
        else {
            while (temp != null) {
                if (key.compareTo(temp.getItem().toString()) < 0)
                    temp = temp.getL_link();
                else if (key.compareTo(temp.getItem().toString()) > 0)
                    temp = temp.getR_link();
                else
                    return temp;
            }
        }
        return null;
    }

    public Node<T> findCustomerRecursive(String key, Node<T> PT) {
        if (PT != null) {
            if (key.compareTo(PT.getItem().toString()) < 0)
                return findCustomerRecursive(key, PT.getL_link());
            else if (key.compareTo(PT.getItem().toString()) > 0)
                return findCustomerRecursive(key, PT.getR_link());
            else
                return PT;
        }
        return PT;
    }

    public Node<T> inOrderSuccessor(String key) {
        Node<T> Q, keyNode = findCustomerIterative(key);
        String tempKey = key;
        do {
            Q = keyNode.getR_link();
            if (!keyNode.hasR_tag())
                ;
                // keyNode points to the inorder successor
            else {
                while(Q.hasL_tag())
                    Q = Q.getL_link();
            }
        }
        while(keyNode != null || tempKey != key);
        return null;
    }

    public Node customerName(Customer customer) {
        return null;
    }

    public Node customerPhone() {
        return null;
    }

    public void preOrderTraverseIterative() {

    }

    public void postOrderTraverseIterative() {

    }
}













