// Generated by view binder compiler. Do not edit!
package com.aiden.tflite.tfliteimageclassifier.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class Fragment1Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout fragment1;

  @NonNull
  public final RecyclerView perfumeList;

  private Fragment1Binding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout fragment1,
      @NonNull RecyclerView perfumeList) {
    this.rootView = rootView;
    this.fragment1 = fragment1;
    this.perfumeList = perfumeList;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Fragment1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Fragment1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Fragment1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout fragment1 = (ConstraintLayout) rootView;

      id = R.id.perfume_list;
      RecyclerView perfumeList = ViewBindings.findChildViewById(rootView, id);
      if (perfumeList == null) {
        break missingId;
      }

      return new Fragment1Binding((ConstraintLayout) rootView, fragment1, perfumeList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
