package com.example.evra3;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

public class Main2Activity extends Activity {
    private TextView name;
    final String LOG_TAG = "myLogs";
    ListView lvMain;
    String[] names;

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lvMain = (ListView) findViewById(R.id.lvMain);


        // устанавливаем режим выбора пунктов списка
        lvMain.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        // Создаем адаптер, используя массив из файла ресурсов
        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.names,
                android.R.layout.simple_list_item_multiple_choice);
        lvMain.setAdapter(adapter);
        Button btnChecked = (Button) findViewById(R.id.btnChecked);
        btnChecked.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                SparseBooleanArray checked = lvMain.getCheckedItemPositions();
                ArrayList<String> selectedItems = new ArrayList<String>();
                for (int i = 0; i < checked.size(); i++) {
                    // Item position in adapter
                    int position = checked.keyAt(i);
                    // Add sport if it is checked i.e.) == TRUE!
                    if (checked.valueAt(i))
                        selectedItems.add(adapter.getItem(position).toString());
                }

                String outputStr = "";

                for (int i = 0; i < selectedItems.size(); i++) {
                    outputStr += "\n"+ selectedItems.get(i);
                }

                 Intent intent = new Intent(Main2Activity.this,finish.class);
                intent.putExtra("fname",outputStr);
                startActivity(intent);
            }
        });


        // получаем массив из файла ресурсов
        names = getResources().getStringArray(R.array.names);


    }


}