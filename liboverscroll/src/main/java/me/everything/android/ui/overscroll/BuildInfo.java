package me.everything.android.ui.overscroll;

import me.everything.BuildConfig;

/**
 * 全局公共编译类型参数相关
 */
public final class BuildInfo {

    /**
     * 当前app是否处于debug调试模式
     * 建议跟log相关的输出控制都用这个变量来控制
     */
    public static final boolean DEBUG_MODE = BuildConfig.DEBUG_MODE;

}
