package open_close.r2;
//各种活动的抽象基类，继承要包装的类型基类
//为什么要继承商品的基类呢？
// 主要是为了活动的基类能嵌套使用，这样我就可以实现多个活动同时使用
abstract class BaseActivity extends BaseProduct
{

}