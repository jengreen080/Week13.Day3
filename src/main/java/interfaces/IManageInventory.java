package interfaces;

import components.ProductDetails;

public interface IManageInventory {
    public void addProductToInventory(ProductDetails details);
    int vend(String code);

}
