package interfaces;

import components.Coin;

public interface IManageMoney {
    public void addToBalance(Coin coin);
    public void clearBalance();

}
