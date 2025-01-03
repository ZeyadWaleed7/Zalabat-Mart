public interface ListOperations {
    void addProduct(Product product);
    void removeProduct(Product product);
    Product findProductByName(String itemName);
    void sortBy(int choice);
    void displayInfo();
}
