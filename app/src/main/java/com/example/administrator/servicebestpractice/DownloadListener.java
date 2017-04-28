package com.example.administrator.servicebestpractice;

/**
 * Created by Administrator on 2017/4/27.
 */
public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
