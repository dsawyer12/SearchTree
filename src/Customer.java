public class Customer extends Node implements Comparable<Customer> {
    public String name, phone;

    public Customer() {
        super();
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
       return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public Comparable getItem() {
        return this.name;
    }

    @Override
    public int compareTo(Customer customer) {
        return this.name.compareTo(customer.getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass())
            return false;
        Customer customer = (Customer) obj;
        return name.equals(customer.name);
    }
}
