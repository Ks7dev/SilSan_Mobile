package br.com.tcc.silsan;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Activity extends AppCompatActivity {

EditText mEditTextEmail,mEditTextPassword;
TextView mTextViewNewUser,mTextViewForgotPassword;
Button mButtonLogin;
String mStringEmail,mStringPassoword;

private boolean isRequiredPassword(){
    return TextUtils.isEmpty(mEditTextPassword.getText());

}

private boolean isValidEmail(String mStringEmail){
    if (mStringEmail == null || mStringEmail.isEmpty()){
        return false;
    }
    return Patterns.EMAIL_ADDRESS.matcher(mStringEmail).matches();
}

private void showOrder(){
    Intent mIntent = new Intent(getApplicationContext() , OrderActivity.class);
    startActivity(mIntent);
    finish();

}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }
}