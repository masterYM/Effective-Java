package open_close.r2;

//抽象商品（比如话费商品），继承商品基类
public  class VirtualProduct extends BaseProduct {
    public VirtualProduct(int price) {
        this.price = price;
    }

    public VirtualProduct() {
    }

    @Override
        public int getPrice() {
            return this.price;
        }
    }