package interfaces;

public interface IManageInventory {
    public void addProductToHashMap(ProductType type, ProductDetails details);
    public ProductDetails getProductDetails(ProductType type);

}
