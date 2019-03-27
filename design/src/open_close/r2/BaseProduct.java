package open_close.r2;
//商品抽象类
public abstract class BaseProduct {
    public int price;

    public void setPrice(int price) {
        this.price = price;
    }


    //获取商品价格抽象方法
    public abstract int getPrice();
}
