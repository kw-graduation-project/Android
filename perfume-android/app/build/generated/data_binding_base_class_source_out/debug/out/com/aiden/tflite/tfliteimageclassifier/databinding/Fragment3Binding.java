// Generated by view binder compiler. Do not edit!
package com.aiden.tflite.tfliteimageclassifier.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aiden.tflite.tfliteimageclassifier.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class Fragment3Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnRefresh;

  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvError;

  @NonNull
  public final RecyclerView weatherRecyclerView;

  private Fragment3Binding(@NonNull ConstraintLayout rootView, @NonNull Button btnRefresh,
      @NonNull TextView tvDate, @NonNull TextView tvError,
      @NonNull RecyclerView weatherRecyclerView) {
    this.rootView = rootView;
    this.btnRefresh = btnRefresh;
    this.tvDate = tvDate;
    this.tvError = tvError;
    this.weatherRecyclerView = weatherRecyclerView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Fragment3Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Fragment3Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_3, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Fragment3Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnRefresh;
      Button btnRefresh = ViewBindings.findChildViewById(rootView, id);
      if (btnRefresh == null) {
        break missingId;
      }

      id = R.id.tvDate;
      TextView tvDate = ViewBindings.findChildViewById(rootView, id);
      if (tvDate == null) {
        break missingId;
      }

      id = R.id.tvError;
      TextView tvError = ViewBindings.findChildViewById(rootView, id);
      if (tvError == null) {
        break missingId;
      }

      id = R.id.weatherRecyclerView;
      RecyclerView weatherRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (weatherRecyclerView == null) {
        break missingId;
      }

      return new Fragment3Binding((ConstraintLayout) rootView, btnRefresh, tvDate, tvError,
          weatherRecyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
