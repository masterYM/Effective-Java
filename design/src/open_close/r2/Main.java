package open_close.r2;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 给商品做个促销活动--单个商品
 */
public class Main {

    public static void main(String[] args) {
        VirtualProduct product = new VirtualProduct(1000);
        //打折活动
        DiscountActivity discountActivity = new DiscountActivity(90,product);
        int price = discountActivity.getPrice();
        System.out.println("打折后价格: " + price);

        //叠加添加满减活动
        Map<Integer,Integer> map = new LinkedHashMap<>();
        map.put(1000,50);
        map.put(500,20);
        map.put(300,10);
        map.put(200,5);
//还能叠加参加满减活动
        ReductionActivity reductionActivity = new ReductionActivity(discountActivity,map);
        price = reductionActivity.getPrice();
        System.out.println("打折满减后的价格： " + price);

        ReductionActivity reductionActivity1 = new ReductionActivity(reductionActivity,map);
        price = reductionActivity1.getPrice();
        System.out.println("再打折后的价格:" + price);

    }

}
