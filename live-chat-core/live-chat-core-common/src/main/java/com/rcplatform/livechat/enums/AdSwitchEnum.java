package com.rcplatform.livechat.enums;

/**
 * Created by admin on 2017/4/19.
 */
public enum  AdSwitchEnum  implements IEnum{


    UN_SHOW(0,"全部不展示"),


    PAY_UN_SHOW(1,"付费用户不展示"),


    SHOW(2,"全部展示");




    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    AdSwitchEnum(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }



    @Override
    public int key() {
        return key;
    }

    @Override
    public String desc() {
        return desc;
    }
}
