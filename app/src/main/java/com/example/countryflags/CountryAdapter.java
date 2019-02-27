package com.example.countryflags;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CountryAdapter extends BaseAdapter {
    private List<Country> countries;
    private LayoutInflater layoutInflater;

    public CountryAdapter(Context context, List<Country> countries) {
        this.countries = countries;
        layoutInflater = LayoutInflater.from(context);
    }

    class ViewHolder {
        TextView tvCountryName;
        TextView tvCountryZone;
        ImageView img;
    }

    @Override
    public int getCount() {
        return countries.size();
    }

    @Override
    public Object getItem(int position) {
        return countries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null) {
            convertView = layoutInflater.inflate(R.layout.flags_row,
                    parent, false);
            holder = new ViewHolder();
            holder.tvCountryName = convertView.findViewById(R.id.country_name);
            holder.tvCountryZone = convertView.findViewById(R.id.country_zone);
            holder.img = convertView.findViewById(R.id.country_flag);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tvCountryName.setText(countries.get(position).getName());
        holder.tvCountryZone.setText(countries.get(position).getZone());
        holder.img.setImageResource(countries.get(position).getFlag());

        return convertView;
    }
}
