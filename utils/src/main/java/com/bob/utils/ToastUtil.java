package com.bob.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * @ClassName ToastUtil
 * @Description TODO 内容
 * @Author biekangdong
 * @CreateDate 2023/2/9 10:06
 * @Version 1.0
 * @UpdateDate 2023/2/9 10:06
 * @UpdateRemark 更新说明
 */
public class ToastUtil {
    public static void showToast(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
