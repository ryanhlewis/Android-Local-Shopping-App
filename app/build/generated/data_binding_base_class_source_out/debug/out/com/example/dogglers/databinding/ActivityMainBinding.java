// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.dogglers.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button CartButton;

  @NonNull
  public final Button gridBtn;

  @NonNull
  public final Button horizontalBtn;

  @NonNull
  public final Button phonesButton;

  @NonNull
  public final Button verticalBtn;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button CartButton,
      @NonNull Button gridBtn, @NonNull Button horizontalBtn, @NonNull Button phonesButton,
      @NonNull Button verticalBtn) {
    this.rootView = rootView;
    this.CartButton = CartButton;
    this.gridBtn = gridBtn;
    this.horizontalBtn = horizontalBtn;
    this.phonesButton = phonesButton;
    this.verticalBtn = verticalBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.CartButton;
      Button CartButton = rootView.findViewById(id);
      if (CartButton == null) {
        break missingId;
      }

      id = R.id.grid_btn;
      Button gridBtn = rootView.findViewById(id);
      if (gridBtn == null) {
        break missingId;
      }

      id = R.id.horizontal_btn;
      Button horizontalBtn = rootView.findViewById(id);
      if (horizontalBtn == null) {
        break missingId;
      }

      id = R.id.phones_button;
      Button phonesButton = rootView.findViewById(id);
      if (phonesButton == null) {
        break missingId;
      }

      id = R.id.vertical_btn;
      Button verticalBtn = rootView.findViewById(id);
      if (verticalBtn == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, CartButton, gridBtn,
          horizontalBtn, phonesButton, verticalBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
