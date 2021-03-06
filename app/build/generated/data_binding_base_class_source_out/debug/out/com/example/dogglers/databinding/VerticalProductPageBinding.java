// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VerticalProductPageBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final Button AddToCart;

  @NonNull
  public final TextView dogAge;

  @NonNull
  public final TextView dogAge2;

  @NonNull
  public final TextView dogHobby;

  @NonNull
  public final TextView dogName;

  @NonNull
  public final ImageView dogPicture;

  @NonNull
  public final TextView textView7;

  private VerticalProductPageBinding(@NonNull MaterialCardView rootView, @NonNull Button AddToCart,
      @NonNull TextView dogAge, @NonNull TextView dogAge2, @NonNull TextView dogHobby,
      @NonNull TextView dogName, @NonNull ImageView dogPicture, @NonNull TextView textView7) {
    this.rootView = rootView;
    this.AddToCart = AddToCart;
    this.dogAge = dogAge;
    this.dogAge2 = dogAge2;
    this.dogHobby = dogHobby;
    this.dogName = dogName;
    this.dogPicture = dogPicture;
    this.textView7 = textView7;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static VerticalProductPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VerticalProductPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.vertical_product_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VerticalProductPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AddToCart;
      Button AddToCart = rootView.findViewById(id);
      if (AddToCart == null) {
        break missingId;
      }

      id = R.id.dogAge;
      TextView dogAge = rootView.findViewById(id);
      if (dogAge == null) {
        break missingId;
      }

      id = R.id.dogAge2;
      TextView dogAge2 = rootView.findViewById(id);
      if (dogAge2 == null) {
        break missingId;
      }

      id = R.id.dogHobby;
      TextView dogHobby = rootView.findViewById(id);
      if (dogHobby == null) {
        break missingId;
      }

      id = R.id.dogName;
      TextView dogName = rootView.findViewById(id);
      if (dogName == null) {
        break missingId;
      }

      id = R.id.dogPicture;
      ImageView dogPicture = rootView.findViewById(id);
      if (dogPicture == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = rootView.findViewById(id);
      if (textView7 == null) {
        break missingId;
      }

      return new VerticalProductPageBinding((MaterialCardView) rootView, AddToCart, dogAge, dogAge2,
          dogHobby, dogName, dogPicture, textView7);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
