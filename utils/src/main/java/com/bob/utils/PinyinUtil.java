package com.bob.utils;

import com.github.promeg.pinyinhelper.Pinyin;

/**
 * @ClassName PinyinUtil
 * @Description TODO 内容
 * @Author biekangdong
 * @CreateDate 2023/2/10 11:42
 * @Version 1.0
 * @UpdateDate 2023/2/10 11:42
 * @UpdateRemark 更新说明
 */
public class PinyinUtil {
    public static String getPingYin(String inputString) {
        if (inputString == null) return "";
        return Pinyin.toPinyin(inputString, "").toLowerCase();
    }
}
