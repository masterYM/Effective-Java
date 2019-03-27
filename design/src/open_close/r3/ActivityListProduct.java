package open_close.r3;

import open_close.r2.BaseProduct;

import java.util.List;

//商品列表的基类,用于活动结算使用
public class ActivityListProduct extends BaseProduct {
    List<BaseProduct> list;

    public ActivityListProduct() {

    }
    public ActivityListProduct(List<BaseProduct> list) {
        this.list = list;
    }


    @Override
    public  int getPrice() {
        int ret = 0;
        for(BaseProduct baseProduct : list){
             ret += baseProduct.getPrice();
        }
        this.price = ret;
        return ret;
    }
}
