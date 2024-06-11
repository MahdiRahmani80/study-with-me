// Generated by view binder compiler. Do not edit!
package ir.m3.rahmani.studywithme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ir.m3.rahmani.studywithme.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ComposePomodoroBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guideline1;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final ComposeView pomodoroClock;

  private ComposePomodoroBinding(@NonNull ConstraintLayout rootView, @NonNull Guideline guideline1,
      @NonNull Guideline guideline2, @NonNull Guideline guideline3,
      @NonNull ComposeView pomodoroClock) {
    this.rootView = rootView;
    this.guideline1 = guideline1;
    this.guideline2 = guideline2;
    this.guideline3 = guideline3;
    this.pomodoroClock = pomodoroClock;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ComposePomodoroBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ComposePomodoroBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.compose_pomodoro, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ComposePomodoroBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline1;
      Guideline guideline1 = ViewBindings.findChildViewById(rootView, id);
      if (guideline1 == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = ViewBindings.findChildViewById(rootView, id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.guideline3;
      Guideline guideline3 = ViewBindings.findChildViewById(rootView, id);
      if (guideline3 == null) {
        break missingId;
      }

      id = R.id.pomodoroClock;
      ComposeView pomodoroClock = ViewBindings.findChildViewById(rootView, id);
      if (pomodoroClock == null) {
        break missingId;
      }

      return new ComposePomodoroBinding((ConstraintLayout) rootView, guideline1, guideline2,
          guideline3, pomodoroClock);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}