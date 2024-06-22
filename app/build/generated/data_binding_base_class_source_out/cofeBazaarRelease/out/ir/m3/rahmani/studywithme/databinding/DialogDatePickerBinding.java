// Generated by view binder compiler. Do not edit!
package ir.m3.rahmani.studywithme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ir.m3.rahmani.studywithme.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogDatePickerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CalendarView cal;

  @NonNull
  public final TextView save;

  @NonNull
  public final TextView setTime;

  private DialogDatePickerBinding(@NonNull LinearLayout rootView, @NonNull CalendarView cal,
      @NonNull TextView save, @NonNull TextView setTime) {
    this.rootView = rootView;
    this.cal = cal;
    this.save = save;
    this.setTime = setTime;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogDatePickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogDatePickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_date_picker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogDatePickerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cal;
      CalendarView cal = ViewBindings.findChildViewById(rootView, id);
      if (cal == null) {
        break missingId;
      }

      id = R.id.save;
      TextView save = ViewBindings.findChildViewById(rootView, id);
      if (save == null) {
        break missingId;
      }

      id = R.id.set_time;
      TextView setTime = ViewBindings.findChildViewById(rootView, id);
      if (setTime == null) {
        break missingId;
      }

      return new DialogDatePickerBinding((LinearLayout) rootView, cal, save, setTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}