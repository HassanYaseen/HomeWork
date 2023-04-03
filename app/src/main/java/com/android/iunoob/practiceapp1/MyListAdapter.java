package com.android.iunoob.practiceapp1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;


public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {
    private com.android.iunoob.practiceapp1.MyListData[] listdata;

    // RecyclerView recyclerView;
    public MyListAdapter(com.android.iunoob.practiceapp1.MyListData[] listdata) {
        this.listdata = listdata;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.list, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final com.android.iunoob.practiceapp1.MyListData myListData = listdata[position];
//        holder.textView.setText(listdata[position].gettitle());
        //holder.imageView.setImageResource(listdata[position].getImgId());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Click on: " + myListData.gettitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        //public ImageView imageView;
        public TextView textView;
        public RelativeLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
//            this.textView = (TextView) itemView.findViewById(R.id.wifi_Name);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.mainLayout);
        }
    }
}