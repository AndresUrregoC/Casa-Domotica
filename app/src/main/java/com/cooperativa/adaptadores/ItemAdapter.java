package com.cooperativa.adaptadores;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cooperativa.casadomotica.R;

public class ItemAdapter extends BaseAdapter {
	 
    private Context context;
    private List<ItemH> items;
    
    public ItemAdapter(Context context, List items) {
        this.context = context;
        this.items = items;
    }
 
    @Override
    public int getCount() {
        return this.items.size();
    }
 
    @Override
    public Object getItem(int position) {
        return this.items.get(position);
    }
 
    @Override
    public long getItemId(int position) {
        return position;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
 
        // Create a new view into the list.
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_item, parent, false);
 
        // Set data into the view.
        ImageView ivIcono = (ImageView) rowView.findViewById(R.id.ivIcono);
        TextView ivTitle = (TextView) rowView.findViewById(R.id.ivTitle);
        
        ivIcono.setImageResource(this.items.get(position).getImage());
        ivTitle.setText(this.items.get(position).getTitle());
 
        return rowView;
    }
}