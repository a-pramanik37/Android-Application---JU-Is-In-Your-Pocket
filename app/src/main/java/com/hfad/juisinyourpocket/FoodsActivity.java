package com.hfad.juisinyourpocket;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class FoodsActivity extends AppCompatActivity {
    ListView list;
    String[] foodNames;
    String[] foodPrices;

    Toolbar toolbar;

   /* int[] images={R.drawable.rice, R.drawable.broiler, R.drawable.deshimurgi, R.drawable.goru, R.drawable.khashi, R.drawable.shorsheilish, R.drawable.chhotomach, R.drawable.chingri, R.drawable.pangash, R.drawable.koi,R.drawable.ruimach, R.drawable.sobji, R.drawable.porota, R.drawable.roast, R.drawable.dim, R.drawable.khichuri, R.drawable.tehari, R.drawable.vorta, R.drawable.duck, R.drawable.pigeon, R.drawable.polao};*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);
        Intent intent = getIntent();


        toolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Bot Tola's Foods");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        Resources res = getResources();

        foodNames = res.getStringArray(R.array.foodNames);
        foodPrices = res.getStringArray(R.array.foodPrices);

        list = (ListView) findViewById(R.id.listView);

        myAdapter adapter = new myAdapter(this, foodNames, foodPrices);
        list.setAdapter(adapter);


    }
}

class myAdapter extends ArrayAdapter<String>
{
    Context context;

    String[] foodNames;
    String[] foodPrices;
    myAdapter(Context c, String[] foodNames,  String[] prices)
    {
        super(c, R.layout.single_row, R.id.textView1, foodNames);
        this.context=c;

        this.foodNames=foodNames;
        this.foodPrices=prices;
    }

    class MyViewHolder
    {

        TextView myFoodName;
        TextView myFoodPrice;
        MyViewHolder(View v)
        {

            myFoodName = (TextView) v.findViewById(R.id.textView1);
            myFoodPrice = (TextView) v.findViewById(R.id.textView2);
        }

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;
        MyViewHolder holder = null;

        if(row==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_row, parent, false);
            holder = new MyViewHolder(row);
            row.setTag(holder);
        }

        else{
            holder = (MyViewHolder) row.getTag();
        }



        holder.myFoodName.setText(foodNames[position]);
        holder.myFoodPrice.setText(foodPrices[position]);


        return row;
    }
}
