package com.example.ander.drawer.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ander.drawer.R;
import com.example.ander.drawer.vo.Cancion;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by ur00 on 17/06/2016.
 */
public class CancionAdapter extends BaseAdapter {

    private static final String TAG = "CancionAdapter";
    private static int convertViewCounter = 0;
    private Context context;

    private ArrayList<Cancion> data;
    private LayoutInflater inflater = null;

    static class ViewHolder
    {
        ImageView ivCancion;
        TextView  tvCancion;
        TextView  tvArtista;
        TextView  tvDuracion;
    }

    public CancionAdapter(Context ctx, ArrayList<Cancion> data ){
        Log.v(TAG, "Constructing CustomAdapter");
        this.context = ctx;
        this.data = data;
        inflater = LayoutInflater.from(ctx);
    }


    @Override
    public int getCount() {
        Log.v(TAG, "in getCount()");
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        Log.v(TAG, "in getItem() for position " + position);
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        Log.v(TAG, "in getItem() for position " + position);
        return position;
    }

    @Override
    public int getViewTypeCount()
    {
        Log.v(TAG, "in getViewTypeCount()");
        return 1;
    }

    @Override
    public int getItemViewType(int position)
    {
        Log.v(TAG, "in getItemViewType() for position " + position);
        return 0;
    }

    @Override
    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.v(TAG, "in getView for position " + position + ", convertView is " + ((convertView == null) ? "null" : "being recycled"));
        ViewHolder holder;
        if ( convertView == null ){

            convertView = inflater.inflate(R.layout.list_item_cancion, null);
            convertViewCounter++;
            Log.v(TAG, convertViewCounter + " convertViews have been created");

            holder = new ViewHolder();
            holder.ivCancion = (ImageView)convertView.findViewById(R.id.imageCancion);
            holder.tvCancion = (TextView)convertView.findViewById(R.id.tvCancion);
            holder.tvArtista = (TextView)convertView.findViewById(R.id.tvArtista);
            holder.tvDuracion = (TextView)convertView.findViewById(R.id.tvDuracion);
            convertView.setTag(holder);

        }else{ // reciclamos la vista
            holder = (ViewHolder) convertView.getTag();
        }

        //rellenar layout
        Picasso.with(context).load(data.get(position).getImagen()).into(holder.ivCancion);
        holder.tvCancion.setText( data.get(position).getNombre());
        holder.tvArtista.setText( data.get(position).getArtista());
        holder.tvDuracion.setText( data.get(position).getDuracion());
        return convertView;
    }

}
