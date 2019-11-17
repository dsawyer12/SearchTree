public class Main {
    public static void main(String[] args) {
        Tree<Customer> tree = new Tree<>();
        tree.insertBinarySearchTree(new Customer("Moutafis", "295-1492"));
        tree.insertBinarySearchTree(new Customer("Ikerd", "291-1864"));
        tree.insertBinarySearchTree(new Customer("Gladwin", "295-1601"));
        tree.insertBinarySearchTree(new Customer("Robson", "293-6122"));
        tree.insertBinarySearchTree(new Customer("Dang", "295-1882"));
        tree.insertBinarySearchTree(new Customer("Bird", "291-7890"));
        tree.insertBinarySearchTree(new Customer("Harris", "294-8075"));
        tree.insertBinarySearchTree(new Customer("Ortiz", "584-3622"));
        try {
            System.out.println(tree.findCustomerIterative("Ortiz").getItem().phone);
            System.out.println(tree.findCustomerRecursive("Bird", tree.root).getItem().phone);
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
