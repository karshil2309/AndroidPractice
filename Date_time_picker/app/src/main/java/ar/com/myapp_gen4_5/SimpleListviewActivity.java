package ar.com.myapp_gen4_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SimpleListviewActivity extends AppCompatActivity {

ListView listView;
String strLang[] = {"Android","JAVA",".net","PHP","C","C++"};
int imgdata[] = {R.drawable.ic_android,R.drawable.ic_java,R.drawable.ic_php,R.drawable.ic_net,R.drawable.ic_c,R.drawable.ic_home};

ArrayList<DataModel> dataModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_listview);
        listView = (ListView)findViewById(R.id.list);

       // String[] strings = getResources().getStringArray(R.array.strname);
      //  ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.raw_list,R.id.tv_data,strLang);
       // listView.setAdapter(arrayAdapter);

        dataModelArrayList = new ArrayList<DataModel>();
        for (int i = 0; strLang.length >i ; i++){

            DataModel dataModel = new DataModel(strLang[i],imgdata[i]);

            dataModelArrayList.add(dataModel);

        }


        MyBaseAdapter myBaseAdapter = new MyBaseAdapter(this,dataModelArrayList);
        listView.setAdapter(myBaseAdapter);
    }
}
