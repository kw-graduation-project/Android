package com.aiden.tflite.tfliteimageclassifier;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eJ\u001c\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\fH\u0016R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u001d"}, d2 = {"Lcom/aiden/tflite/tfliteimageclassifier/WeatherAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/aiden/tflite/tfliteimageclassifier/WeatherAdapter$ViewHolder;", "items", "", "Lcom/aiden/tflite/tfliteimageclassifier/ModelWeather;", "([Lcom/aiden/tflite/tfliteimageclassifier/ModelWeather;)V", "getItems", "()[Lcom/aiden/tflite/tfliteimageclassifier/ModelWeather;", "setItems", "[Lcom/aiden/tflite/tfliteimageclassifier/ModelWeather;", "getItemCount", "", "getRainType", "", "rainType", "getRecommends", "temp", "getSky", "sky", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class WeatherAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.aiden.tflite.tfliteimageclassifier.WeatherAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private com.aiden.tflite.tfliteimageclassifier.ModelWeather[] items;
    
    public WeatherAdapter(@org.jetbrains.annotations.NotNull()
    com.aiden.tflite.tfliteimageclassifier.ModelWeather[] items) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.aiden.tflite.tfliteimageclassifier.ModelWeather[] getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    com.aiden.tflite.tfliteimageclassifier.ModelWeather[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.aiden.tflite.tfliteimageclassifier.WeatherAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.aiden.tflite.tfliteimageclassifier.WeatherAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRainType(@org.jetbrains.annotations.NotNull()
    java.lang.String rainType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSky(@org.jetbrains.annotations.NotNull()
    java.lang.String sky) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRecommends(int temp) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/aiden/tflite/tfliteimageclassifier/WeatherAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/aiden/tflite/tfliteimageclassifier/WeatherAdapter;Landroid/view/View;)V", "setItem", "", "item", "Lcom/aiden/tflite/tfliteimageclassifier/ModelWeather;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void setItem(@org.jetbrains.annotations.NotNull()
        com.aiden.tflite.tfliteimageclassifier.ModelWeather item) {
        }
    }
}