package com.kusch.constants;

/**
 * 支持平台的常量
 *
 * @author Zhangzp
 * @date 2022年11月24日 15:26
 */
public class PlatformConstants {
    /**
     * 抖音
     */
    public final static String DOU_YIN = "douyin";

    /**
     * 皮皮虾
     */
    public final static String PI_PI_XIA = "pipix";

    /**
     * 最右
     */
    public static final String ZUI_YOU = "xiaochuankeji";

    public static String getRealPlatform(String url) {
        if (url.contains(DOU_YIN)) {
            return DOU_YIN;
        } else if (url.contains(PI_PI_XIA)) {
            return PI_PI_XIA;
        } else if (url.contains(ZUI_YOU)) {
            return ZUI_YOU;
        } else {
            throw new RuntimeException(url + "----暂不支持");
        }
    }
}
