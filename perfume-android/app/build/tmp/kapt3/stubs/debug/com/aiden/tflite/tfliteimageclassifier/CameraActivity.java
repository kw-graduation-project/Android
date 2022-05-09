package com.aiden.tflite.tfliteimageclassifier;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0012H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/aiden/tflite/tfliteimageclassifier/CameraActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/aiden/tflite/tfliteimageclassifier/databinding/ActivityCameraBinding;", "getBinding", "()Lcom/aiden/tflite/tfliteimageclassifier/databinding/ActivityCameraBinding;", "binding$delegate", "Lkotlin/Lazy;", "cameraResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "classifier", "Lcom/aiden/tflite/tfliteimageclassifier/Classifier;", "imageUri", "getTmpFileUri", "initClassifier", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "app_debug"})
public final class CameraActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy binding$delegate = null;
    private com.aiden.tflite.tfliteimageclassifier.Classifier classifier;
    private android.net.Uri imageUri;
    private final androidx.activity.result.ActivityResultLauncher<android.net.Uri> cameraResult = null;
    
    public CameraActivity() {
        super();
    }
    
    private final com.aiden.tflite.tfliteimageclassifier.databinding.ActivityCameraBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void initClassifier() {
    }
    
    private final android.net.Uri getTmpFileUri() {
        return null;
    }
}