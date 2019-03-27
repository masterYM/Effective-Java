package open_close.r2;

import java.util.Map;

/**
 * 满减活动
 */
public class ReductionActivity extends BaseActivity{
    private BaseProduct product;
    //满减的对应表
    private Map<Integer,Integer> reductMap;

    public ReductionActivity(BaseProduct product, Map<Integer, Integer> reductMap) {
        this.product = product;
        this.reductMap = reductMap;
    }

    @Override
    public int getPrice() {
        int ret = product.getPrice();
        for(Map.Entry<Integer,Integer> entry : reductMap.entrySet()){
            if(entry.getKey() <= ret){
                ret = ret - entry.getValue();
                break;
            }
        }
        this.price = ret;
        return ret;
    }
}
