public class Node<T extends Comparable<T>>{

    private T item;
    private Node<T> L_link, R_link;
    private boolean L_tag, R_tag;

    public Node(T item) {
        this.item = item;
        L_link = null;
        R_link = null;
    }

    public Node() {}

    public T getItem() {
        return item;
    }

    public Node<T> getL_link() {
        return L_link;
    }

    public Node<T> getR_link() {
        return R_link;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void setL_link(Node<T> l_link) {
        L_link = l_link;
    }

    public void setR_link(Node<T> r_link) {
        R_link = r_link;
    }

    public boolean hasL_tag() {
        return L_tag;
    }

    public void setL_tag(boolean l_tag) {
        L_tag = l_tag;
    }

    public boolean hasR_tag() {
        return R_tag;
    }

    public void setR_tag(boolean r_tag) {
        R_tag = r_tag;
    }

    @Override
    public String toString() {
        return this.getItem().toString();
    }
}
