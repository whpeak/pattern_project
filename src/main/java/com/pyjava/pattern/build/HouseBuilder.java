package pattern.build;

/**
 * Created by wangheng on 16/7/4.
 * 规定创建的顺序(创建元素需要有实现一个接口)
 */
public  class HouseBuilder {
    private HourseMap hourseMap;
    public HouseBuilder(HourseMap hourseMap)
    {
        this.hourseMap=hourseMap;
    }

    public void createHouse()
    {
        this.hourseMap.men();
        this.hourseMap.di();
        this.hourseMap.chuang();
        this.hourseMap.qiang();
    }
}
