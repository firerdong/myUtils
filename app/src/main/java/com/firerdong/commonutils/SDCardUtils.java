package com.firerdong.commonutils;

import android.os.Environment;
import android.os.StatFs;

import java.io.File;

/**
 * Created by firer on 15-8-7.
 */
public class SDCardUtils {

    private SDCardUtils(){}

    public static boolean isSDCardEnable()
    {
        return Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED);

    }

    /**
     * 获取SD卡路径
     */
    public static String getSDCardPath()
    {
        return Environment.getExternalStorageDirectory().getAbsolutePath()
                + File.separator;
    }

    /**
     * 获取系统存储路径
     */
    public static String getRootDirectoryPath()
    {
        return Environment.getRootDirectory().getAbsolutePath();
    }

}
