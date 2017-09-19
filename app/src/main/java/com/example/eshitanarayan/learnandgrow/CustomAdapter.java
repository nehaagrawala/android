package com.example.eshitanarayan.learnandgrow;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.eshitanarayan.learnandgrow.Home.list;
import static com.example.eshitanarayan.learnandgrow.Home.recyclerView;
import static com.example.eshitanarayan.learnandgrow.R.id.nameCartTextView;

/**
 * Created by Eshita Narayan on 16-01-2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder1>
{
    private Context context;
   // ArrayList<Allsection> list = new ArrayList<Allsection>();

    public CustomAdapter(Context context) {
        this.context = context;
    }


    @Override
    public CustomAdapter.MyViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_card,parent,false);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = recyclerView.getChildAdapterPosition(v);
                if (pos == 0)
                {

                    Intent intent = new Intent(context,Resume.class);
                    context.startActivity(intent);
                }
                else if (pos == 1)
                {

                    Intent intent = new Intent(context,Aptitude.class);

                    context.startActivity(intent);
                }
                else if (pos == 2)
                {
                    Intent intent = new Intent(context,Technical.class);

                    context.startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(context,PersonalityDevelopment.class);

                    context.startActivity(intent);
                }
//                if (pos >= 0 && pos < getItemCount()) {
//                    Toast.makeText(context,String.valueOf(pos), Toast.LENGTH_SHORT).show();
//                }
            }
        });

        return new MyViewHolder1(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(CustomAdapter.MyViewHolder1 holder, int position) {

        holder.imageView.setImageDrawable(context.getDrawable(list.get(position).getImgid()));
        holder.nameTextView.setText(list.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class MyViewHolder1 extends RecyclerView.ViewHolder  {

    public TextView nameTextView;
        public ImageView imageView;

        public MyViewHolder1(View itemView) {
            super(itemView);
            nameTextView = (TextView)itemView.findViewById(nameCartTextView);
            imageView = (ImageView)itemView.findViewById(R.id.recimageview);
        }


    }
}