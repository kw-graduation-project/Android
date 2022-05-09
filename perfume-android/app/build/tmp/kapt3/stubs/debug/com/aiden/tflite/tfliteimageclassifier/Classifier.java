package com.aiden.tflite.tfliteimageclassifier;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u0017H\u0002J\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0019\u001a\u00020\u001aJ\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0019\u001a\u00020\u001aJ\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0019\u001a\u00020\u001aJ\u0018\u0010\u001d\u001a\n \u001e*\u0004\u0018\u00010\u001a0\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J\b\u0010#\u001a\u00020!H\u0002J\u0010\u0010$\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/aiden/tflite/tfliteimageclassifier/Classifier;", "", "context", "Landroid/content/Context;", "modelName", "", "(Landroid/content/Context;Ljava/lang/String;)V", "inputImage", "Lorg/tensorflow/lite/support/image/TensorImage;", "labels", "", "model", "Lorg/tensorflow/lite/support/model/Model;", "modelInputChannel", "", "modelInputHeight", "modelInputWidth", "outputBuffer", "Lorg/tensorflow/lite/support/tensorbuffer/TensorBuffer;", "argmax", "Lkotlin/Pair;", "", "map", "", "classify", "image", "Landroid/graphics/Bitmap;", "classify1", "classify2", "convertBitmapToARGB8888", "kotlin.jvm.PlatformType", "bitmap", "finish", "", "init", "initModelShape", "loadImage", "Companion", "app_debug"})
public final class Classifier {
    private android.content.Context context;
    private final java.lang.String modelName = null;
    private org.tensorflow.lite.support.model.Model model;
    private org.tensorflow.lite.support.image.TensorImage inputImage;
    private org.tensorflow.lite.support.tensorbuffer.TensorBuffer outputBuffer;
    private int modelInputChannel = 0;
    private int modelInputWidth = 0;
    private int modelInputHeight = 0;
    private final java.util.List<java.lang.String> labels = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.aiden.tflite.tfliteimageclassifier.Classifier.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGENET_CLASSIFY_MODEL = "perfume1_model.tflite";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LABEL_FILE = "perfume_list";
    
    public Classifier(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String modelName) {
        super();
    }
    
    public final void init() {
    }
    
    private final void initModelShape() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.String, java.lang.Float> classify(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap image) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.String, java.lang.Float> classify1(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap image) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.String, java.lang.Float> classify2(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap image) {
        return null;
    }
    
    private final org.tensorflow.lite.support.image.TensorImage loadImage(android.graphics.Bitmap bitmap) {
        return null;
    }
    
    private final android.graphics.Bitmap convertBitmapToARGB8888(android.graphics.Bitmap bitmap) {
        return null;
    }
    
    private final kotlin.Pair<java.lang.String, java.lang.Float> argmax(java.util.Map<java.lang.String, java.lang.Float> map) {
        return null;
    }
    
    public final void finish() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/aiden/tflite/tfliteimageclassifier/Classifier$Companion;", "", "()V", "IMAGENET_CLASSIFY_MODEL", "", "LABEL_FILE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}