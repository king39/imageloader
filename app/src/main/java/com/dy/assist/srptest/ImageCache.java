package com.dy.assist.srptest;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by dLi on 2019/6/16.
 */

public class ImageCache {
    //图片缓存
    LruCache<String,Bitmap> mImageCache;

    public ImageCache(){
        initImageCache();
    }

    private void initImageCache() {
        //计算可使用的最大内存
        final int maxMenory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        //取四分之一的可用内存作为缓存
        final int cacheSize = maxMenory / 4;
        mImageCache = new LruCache<String,Bitmap>(cacheSize){
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight() / 1024;
            }
        };
    }

    public void put(String string,Bitmap bitmap){
        mImageCache.put(string,bitmap);
    }

    public Bitmap get(String string,Bitmap bitmap){
        return mImageCache.get(string);
    }

}
