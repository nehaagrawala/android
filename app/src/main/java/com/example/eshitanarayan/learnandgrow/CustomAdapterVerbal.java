package com.example.eshitanarayan.learnandgrow;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.eshitanarayan.learnandgrow.Home.recyclerView;
import static com.example.eshitanarayan.learnandgrow.VerbalFragment.verbalTopicsArrayList;

/**
 * Created by neha on 23-01-2017.
 */

public class CustomAdapterVerbal extends RecyclerView.Adapter<CustomAdapterVerbal.MyViewHolder1>
{
    private Context context;


    public CustomAdapterVerbal(Context context) {
        this.context = context;
    }

    @Override
    public CustomAdapterVerbal.MyViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_card_verbal, parent, false);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = recyclerView.getChildAdapterPosition(v);
                if (pos == 0) {

                    //Toast.makeText(context, String.valueOf(pos) + "First", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, Verbal_sectionActivity.class);
                    intent.putExtra("Pos",String.valueOf(pos));
                    context.startActivity(intent);
                } else if (pos == 1) {
                    //Toast.makeText(context, String.valueOf(pos) + "Second", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, Verbal_sectionActivity.class);
                    intent.putExtra("Pos",String.valueOf(pos));
                    context.startActivity(intent);
                } else if (pos == 2) {
                    //Toast.makeText(context, String.valueOf(pos) + "Third", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, Verbal_sectionActivity.class);
                    intent.putExtra("Pos",String.valueOf(pos));
                    context.startActivity(intent);
                } else {
                    //Toast.makeText(context, String.valueOf(pos) + "Fourth", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, Verbal_sectionActivity.class);
                    intent.putExtra("Pos",String.valueOf(pos));
                    context.startActivity(intent);
                }

            }
        });

        return new CustomAdapterVerbal.MyViewHolder1(view);

    }
    @Override
    public void onBindViewHolder (CustomAdapterVerbal.MyViewHolder1 holder,int position){


        holder.nameTVverbel.setText(verbalTopicsArrayList.get(position).getVerbalTopics());

    }

    @Override
    public int getItemCount () {
        return 4;
    }

    public class MyViewHolder1 extends RecyclerView.ViewHolder {

        public TextView nameTVverbel;


        public MyViewHolder1(View itemView) {
            super(itemView);
            nameTVverbel = (TextView) itemView.findViewById(R.id.nameverbal);

        }


    }
}
