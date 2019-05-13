package com.example.medishop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class sam extends AppCompatActivity implements AdapterView.OnItemClickListener {

//    String weeks[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
ArrayList<String> weeks;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sam);
        ListView List;
        List= findViewById(R.id.listvw);
        weeks = new ArrayList<>();
        weeks.add("Monday");
        weeks.add("Tuesday");
        weeks.add("Wednesday");
        weeks.add("Thursday");
        weeks.add("Friday");
        weeks.add("Saturday");
        weeks.add("Sunday");
//        weeks.add('');
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,weeks);
               List.setAdapter(arrayAdapter);
        List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                   @Override
                   public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                       Toast.makeText(sam.this, "selected "+weeks.get(position), Toast.LENGTH_SHORT).show();
                   }
               });

    }
//    public <Position> void OnItemClick(AdapterView<?> parent View view, int Position, long id){
//        TextView tv=(TextView)View;
//        Toast.makeText(this,"selected"+tv.getText()+position, Toast.LENGTH_SHORT).show();
//    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
