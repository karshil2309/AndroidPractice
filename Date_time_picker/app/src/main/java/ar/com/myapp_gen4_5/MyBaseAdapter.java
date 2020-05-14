package ar.com.myapp_gen4_5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyBaseAdapter extends BaseAdapter {

    Context context;
    ArrayList<DataModel> dataModelArrayList;
    public MyBaseAdapter(Context context, ArrayList<DataModel> dataModelArrayList) {

        this.context = context;
        this.dataModelArrayList = dataModelArrayList;
    }

    @Override
    public int getCount() {
        return dataModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.raw_list,null);
        TextView tvdata = (TextView)convertView.findViewById(R.id.tv_data);
        ImageView imgdata = (ImageView)convertView.findViewById(R.id.img_data);

        DataModel dataModel = (DataModel)getItem(position);
        tvdata.setText(dataModel.getStrdata());
        imgdata.setImageResource(dataModelArrayList.get(position).getImgdata());



        return convertView;
    }
}
