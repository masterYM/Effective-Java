package open_close.r3;


import open_close.r2.BaseProduct;

import java.util.List;

public class DiscountActivityList extends BaseActivityList {
    ActivityListProduct product = null;
    private int discount;

    public DiscountActivityList(ActivityListProduct product, int discount) {
        this.product = product;
        this.discount = discount;
    }

    public ActivityListProduct getProduct() {
        return product;
    }

    public void setProduct(ActivityListProduct product) {
        this.product = product;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public int getPrice() {
       int productPrice  = product.getPrice();
       this.price = productPrice * discount / 100;
        return price;
    }
}
