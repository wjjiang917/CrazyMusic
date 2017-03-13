package me.crazyjiang.crazymusic.util;

import android.content.Context;
import android.content.SharedPreferences;

import me.crazyjiang.crazymusic.App;
import me.crazyjiang.crazymusic.common.Constant;

/**
 * Created by Jiangwenjin on 2017/3/7.
 */

public class SPUtil {
    public static SharedPreferences getSP() {
        return App.getInstance().getSharedPreferences(Constant.NAME_SP, Context.MODE_PRIVATE);
    }

    public static int getCurrentPage() {
        return getSP().getInt(Constant.KEY_CURRENT_PAGE, 0);
    }

    public static void setCurrentPage(int item) {
        getSP().edit().putInt(Constant.KEY_CURRENT_PAGE, item).apply();
    }
}
