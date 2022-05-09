package com.aiden.tflite.tfliteimageclassifier;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J&\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u001a\u00106\u001a\u00020-2\u0006\u00107\u001a\u0002012\b\u0010.\u001a\u0004\u0018\u00010/H\u0017J\u0016\u00108\u001a\u00020-2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J.\u00108\u001a\u00020-2\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010!\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001a\u0010$\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010\'\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001a\u00a8\u0006>"}, d2 = {"Lcom/aiden/tflite/tfliteimageclassifier/Fragment3;", "Landroidx/fragment/app/Fragment;", "()V", "basedate", "", "basetime", "btnRefresh", "Landroid/widget/Button;", "getBtnRefresh", "()Landroid/widget/Button;", "setBtnRefresh", "(Landroid/widget/Button;)V", "iv_imageview", "Landroid/widget/ImageView;", "getIv_imageview", "()Landroid/widget/ImageView;", "setIv_imageview", "(Landroid/widget/ImageView;)V", "nx", "", "ny", "tvHumidity", "Landroid/widget/TextView;", "getTvHumidity", "()Landroid/widget/TextView;", "setTvHumidity", "(Landroid/widget/TextView;)V", "tvRainRatio", "getTvRainRatio", "setTvRainRatio", "tvRainType", "getTvRainType", "setTvRainType", "tvSky", "getTvSky", "setTvSky", "tvTemp", "getTvTemp", "setTvTemp", "tv_name", "getTv_name", "setTv_name", "getTime", "time", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setWeather", "rainRatio", "rainType", "humidity", "sky", "temp", "app_debug"})
public final class Fragment3 extends androidx.fragment.app.Fragment {
    public android.widget.TextView tvRainRatio;
    public android.widget.TextView tvRainType;
    public android.widget.TextView tvHumidity;
    public android.widget.TextView tvSky;
    public android.widget.TextView tvTemp;
    public android.widget.Button btnRefresh;
    public android.widget.ImageView iv_imageview;
    public android.widget.TextView tv_name;
    private java.lang.String basedate = "20220509";
    private java.lang.String basetime = "0500";
    private int nx = 55;
    private int ny = 127;
    
    public Fragment3() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvRainRatio() {
        return null;
    }
    
    public final void setTvRainRatio(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvRainType() {
        return null;
    }
    
    public final void setTvRainType(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvHumidity() {
        return null;
    }
    
    public final void setTvHumidity(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvSky() {
        return null;
    }
    
    public final void setTvSky(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvTemp() {
        return null;
    }
    
    public final void setTvTemp(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getBtnRefresh() {
        return null;
    }
    
    public final void setBtnRefresh(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getIv_imageview() {
        return null;
    }
    
    public final void setIv_imageview(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTv_name() {
        return null;
    }
    
    public final void setTv_name(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setWeather(int nx, int ny) {
    }
    
    public final void setWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String rainRatio, @org.jetbrains.annotations.NotNull()
    java.lang.String rainType, @org.jetbrains.annotations.NotNull()
    java.lang.String humidity, @org.jetbrains.annotations.NotNull()
    java.lang.String sky, @org.jetbrains.annotations.NotNull()
    java.lang.String temp) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime(@org.jetbrains.annotations.NotNull()
    java.lang.String time) {
        return null;
    }
}