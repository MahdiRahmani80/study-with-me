// Generated by view binder compiler. Do not edit!
package ir.m3.rahmani.studywithme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ir.m3.rahmani.studywithme.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDonateBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final Button support1;

  @NonNull
  public final Button support100;

  @NonNull
  public final Button support20;

  @NonNull
  public final Button support5;

  @NonNull
  public final TextView title;

  @NonNull
  public final TextView titleHint;

  private ActivityDonateBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout main,
      @NonNull Button support1, @NonNull Button support100, @NonNull Button support20,
      @NonNull Button support5, @NonNull TextView title, @NonNull TextView titleHint) {
    this.rootView = rootView;
    this.main = main;
    this.support1 = support1;
    this.support100 = support100;
    this.support20 = support20;
    this.support5 = support5;
    this.title = title;
    this.titleHint = titleHint;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDonateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDonateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_donate, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDonateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.support1;
      Button support1 = ViewBindings.findChildViewById(rootView, id);
      if (support1 == null) {
        break missingId;
      }

      id = R.id.support100;
      Button support100 = ViewBindings.findChildViewById(rootView, id);
      if (support100 == null) {
        break missingId;
      }

      id = R.id.support20;
      Button support20 = ViewBindings.findChildViewById(rootView, id);
      if (support20 == null) {
        break missingId;
      }

      id = R.id.support5;
      Button support5 = ViewBindings.findChildViewById(rootView, id);
      if (support5 == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.title_hint;
      TextView titleHint = ViewBindings.findChildViewById(rootView, id);
      if (titleHint == null) {
        break missingId;
      }

      return new ActivityDonateBinding((ConstraintLayout) rootView, main, support1, support100,
          support20, support5, title, titleHint);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
