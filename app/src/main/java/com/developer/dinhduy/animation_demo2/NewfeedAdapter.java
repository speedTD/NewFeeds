package com.developer.dinhduy.animation_demo2;

import android.content.Context;
import android.graphics.Color;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class NewfeedAdapter extends RecyclerView.Adapter<NewfeedAdapter.NewFeedsHoder> {
    private Context context;
    private List<Noidung> noidungs;

    public NewfeedAdapter(Context context, List<Noidung> noidungs) {
        this.context = context;
        this.noidungs = noidungs;
    }

    @Override
    public NewFeedsHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.layout_ui_newfeeds,parent,false);
        return new NewFeedsHoder(view);
    }

    @Override
    public void onBindViewHolder(NewFeedsHoder holder, int position) {
        Noidung noidung=noidungs.get(position);
        holder.Nickname.setText(noidung.getName());
        Picasso.get().load(noidung.getLinkAnh()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return noidungs.size();
    }
    private  Boolean check =false;
    public class NewFeedsHoder extends RecyclerView.ViewHolder {

        TextView Nickname ,Noidung;
        ImageView imageView;
        public NewFeedsHoder(View itemView) {

            super(itemView);
            Nickname=(TextView) itemView.findViewById(R.id.Nickname);
            Noidung=(TextView) itemView.findViewById(R.id.Like);
            imageView=(ImageView) itemView.findViewById(R.id.upanh);
            Noidung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    check=!check;
                    Noidung.setText("liked");
                    Noidung.setTextColor(Color.GREEN);
                    if(check==false){
                        Noidung.setText("like");
                        Noidung.setTextColor(Color.BLUE);
                    }

                }
            });

        }
    }
}
