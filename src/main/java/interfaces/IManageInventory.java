package interfaces;

import components.ProductDetails;
import components.ProductType;

public interface IManageInventory {
    public void addProductToInventory(ProductDetails details);
    void sellProduct(String code);

}
