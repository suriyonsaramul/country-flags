package com.example.countryflags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Country> countries = new ArrayList<Country>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Country country = new Country("Algeria", "North Africa", R.drawable.algeria);
        countries.add(country);
        countries.add(new Country("Australia", "Australia", R.drawable.australia));
        countries.add(new Country("Austria", "Europe", R.drawable.austria));
        countries.add(new Country("Belgium", "Europe", R.drawable.belgium));
        countries.add(new Country("Bulgaria", "Europe", R.drawable.bulgaria));
        countries.add(new Country("Catalonia", "Europe", R.drawable.catalonia));
        countries.add(new Country("Egypt", "North Africa", R.drawable.egypt));
        countries.add(new Country("Estonia", "Europe", R.drawable.estonia));
        countries.add(new Country("France", "Europe", R.drawable.france));
        countries.add(new Country("Germany", "Europe", R.drawable.germany));
        countries.add(new Country("Greece", "Europe", R.drawable.greece));
        countries.add(new Country("India", "Asia", R.drawable.india));
        countries.add(new Country("Ireland", "Europe", R.drawable.ireland));
        countries.add(new Country("Italy", "Europe", R.drawable.italy));
        countries.add(new Country("Liberia", "North Africa", R.drawable.liberia));
        countries.add(new Country("Lithuania", "Europe", R.drawable.lithuania));
        countries.add(new Country("Luxembourg", "Europe", R.drawable.luxembourg));
        countries.add(new Country("Mexico", "North America", R.drawable.mexico));
        countries.add(new Country("Nauru", "Africa", R.drawable.nauru));
        countries.add(new Country("Nicaragua", "Middle America", R.drawable.nicaragua));
        countries.add(new Country("Norway", "Europe", R.drawable.norway));
        countries.add(new Country("Philippines", "South East Asia", R.drawable.philippines));
        countries.add(new Country("Spain", "Europe", R.drawable.spain));
        countries.add(new Country("Taiwan", "Asia", R.drawable.taiwan));
        countries.add(new Country("Tanzania", "Africa", R.drawable.tanzania));

        CountryAdapter adapter = new CountryAdapter(MainActivity.this, countries);
        ListView lv = findViewById(R.id.lv_country);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,
                        "You clicked: " + countries.get(position).getName(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
