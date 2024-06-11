// Generated by view binder compiler. Do not edit!
package ir.m3.rahmani.studywithme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import ir.m3.rahmani.studywithme.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnRegister;

  @NonNull
  public final TextInputEditText etPhone;

  @NonNull
  public final TextInputEditText etUsername;

  @NonNull
  public final ImageView imgRegister;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView registerTopHlep;

  @NonNull
  public final TextView registerTopText;

  @NonNull
  public final TextView tvSignin;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnRegister,
      @NonNull TextInputEditText etPhone, @NonNull TextInputEditText etUsername,
      @NonNull ImageView imgRegister, @NonNull ConstraintLayout main,
      @NonNull TextView registerTopHlep, @NonNull TextView registerTopText,
      @NonNull TextView tvSignin) {
    this.rootView = rootView;
    this.btnRegister = btnRegister;
    this.etPhone = etPhone;
    this.etUsername = etUsername;
    this.imgRegister = imgRegister;
    this.main = main;
    this.registerTopHlep = registerTopHlep;
    this.registerTopText = registerTopText;
    this.tvSignin = tvSignin;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_register;
      Button btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.et_phone;
      TextInputEditText etPhone = ViewBindings.findChildViewById(rootView, id);
      if (etPhone == null) {
        break missingId;
      }

      id = R.id.et_username;
      TextInputEditText etUsername = ViewBindings.findChildViewById(rootView, id);
      if (etUsername == null) {
        break missingId;
      }

      id = R.id.img_register;
      ImageView imgRegister = ViewBindings.findChildViewById(rootView, id);
      if (imgRegister == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.register_top_hlep;
      TextView registerTopHlep = ViewBindings.findChildViewById(rootView, id);
      if (registerTopHlep == null) {
        break missingId;
      }

      id = R.id.register_top_text;
      TextView registerTopText = ViewBindings.findChildViewById(rootView, id);
      if (registerTopText == null) {
        break missingId;
      }

      id = R.id.tv_signin;
      TextView tvSignin = ViewBindings.findChildViewById(rootView, id);
      if (tvSignin == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, btnRegister, etPhone,
          etUsername, imgRegister, main, registerTopHlep, registerTopText, tvSignin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
