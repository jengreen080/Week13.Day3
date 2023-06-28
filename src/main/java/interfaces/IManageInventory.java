package interfaces;

import components.ProductDetails;
import components.ProductType;

public interface IManageInventory {
    public void addProductToInventory(ProductType type, ProductDetails details);
    void sellProduct(ProductType type, String code);

}
