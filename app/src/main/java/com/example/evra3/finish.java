package com.example.evra3;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;
import android.net.Uri;

import java.util.ArrayList;

import static android.R.attr.name;
import static com.example.evra3.R.array.names;

public class finish extends Activity {
    TextView post;
String number = "123456";
    String abc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);



         ((TextView) findViewById(R.id.post)).setText(getIntent().getStringExtra("fname") );
abc= getIntent().getStringExtra("fname");
    }
    public void smsSend(View v) {
EditText adr= (EditText) findViewById(R.id.adress);

 //Intent smsIntent = new Intent(Intent.ACTION_SENDTO,Uri.parse("sms:123456"));
Intent smsIntent = new Intent(Intent.ACTION_VIEW);

        smsIntent.putExtra("sms_body",getIntent().getStringExtra("fname")+ "\nАдрес: "+adr.getText());
        smsIntent.setType("vnd.android-dir/mms-sms");
        smsIntent.putExtra("address","123465");
        startActivity(smsIntent);


    }}
