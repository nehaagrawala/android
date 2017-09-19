package com.example.eshitanarayan.learnandgrow;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.eshitanarayan.learnandgrow.Home.recyclerView;
import static com.example.eshitanarayan.learnandgrow.QuantFragment.quantTopicsArrayList;

/**
 * Created by neha on 23-01-2017.
 */

public class CustomAdapterQuant extends RecyclerView.Adapter<CustomAdapterQuant.MyViewHolder1>
{
    private Context context;


    public CustomAdapterQuant(Context context) {
        this.context = context;
    }

    @Override
    public CustomAdapterQuant.MyViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_card_quant, parent, false);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = recyclerView.getChildAdapterPosition(v);
                if (pos == 0) {

                    //Toast.makeText(context, String.valueOf(pos) + "First", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context,Quant_sectionActivity.class);
                    intent.putExtra("Pos",String.valueOf(pos));
                    context.startActivity(intent);

                } else if (pos == 1) {
                    //Toast.makeText(context, String.valueOf(pos) + "Second", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context,Quant_sectionActivity.class);
                    intent.putExtra("Pos",String.valueOf(pos));
                    context.startActivity(intent);

                } else if (pos == 2) {
                   // Toast.makeText(context, String.valueOf(pos) + "Third", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context,Quant_sectionActivity.class);
                    intent.putExtra("Pos",String.valueOf(pos));
                    context.startActivity(intent);
                } else {
                    //Toast.makeText(context, String.valueOf(pos) + "Fourth", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context,Quant_sectionActivity.class);
                    intent.putExtra("Pos",String.valueOf(pos));
                    context.startActivity(intent);
                }
            }
        });

        return new CustomAdapterQuant.MyViewHolder1(view);

    }
        @Override
        public void onBindViewHolder (CustomAdapterQuant.MyViewHolder1 holder,int position){


            holder.nameTVquant.setText(quantTopicsArrayList.get(position).getQuanttopics());

        }

        @Override
        public int getItemCount () {
            return 4;
        }

        public class MyViewHolder1 extends RecyclerView.ViewHolder {

            public TextView nameTVquant;


            public MyViewHolder1(View itemView) {
                super(itemView);
                nameTVquant = (TextView) itemView.findViewById(R.id.namequant);

            }


        }
    }



