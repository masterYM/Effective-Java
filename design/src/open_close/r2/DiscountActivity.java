package open_close.r2;

/**
 * 打折活动
 */
public class DiscountActivity extends BaseActivity{
    private BaseProduct product = null;
    private int discount;
    public DiscountActivity(int discount, BaseProduct _product)
    {
        this.discount = discount;
        this.product = _product;
    }

    //折扣，比如 90折 即为90
    //获取折扣之后的价格
    @Override
    public int getPrice() {
        int price =  product.getPrice() * discount/100;
        this.price = price;
        return price;
    }
}
