package open_close.r1;

/**
 * 满100减20的活动，在结算价格的时候代码是这样的
 */
public class Activity {
    private Product product;

    public Activity(Product product) {
        this.product = product;
    }
    public int getPrice(){
        int ret = product.getPrice();
        if(ret >= 100*100){
            ret = ret - 20 *100;
        }
        return ret;
    }

    //现在又有一个全场9折的活动，
    // 恰巧有一个商品参与了以上两个活动，
    // 而且还可以叠加使用(假设活动参与的顺序是先折扣后满减)。
    // 代码就变成了这样
    public int getPrice_1(){
        //9折活动
        int ret = product.getPrice() * 90 / 100;
        //满减活动
        if(ret >= 100*100){
            ret = ret - 20 *100;
        }
        return ret;
    }

    //假如现在又来一个类似活动，那这块代码还需要修改，严重违反了开放关闭原则，
    // 而且频繁修改已经上线的代码，bug的几率会大大增高

}
