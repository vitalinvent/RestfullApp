package com.vitalinvent.restfullapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vitalinvent.restfullapp.R;
import com.vitalinvent.restfullapp.models.User;

import java.util.List;

import butterknife.BindView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private LayoutInflater layoutInflater;
    ClickListener  clickListener;
    List<User> users;

    public UserAdapter(List<User> users) {
        this.users=users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.user_item,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = users.get(position);
        holder.tvLine1.setText((user.getName()==null)?user.getName1():user.getName()+" "+ ((user.getFathername1()==null)?user.getFathername1():""));
        holder.tvLine1.setOnClickListener(v -> {
            clickListener.onClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public interface ClickListener {
        void onClick(int position);
    }

    class UserViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.tvLine1)
        TextView tvLine1;

        public UserViewHolder(View itemView) {
            super(itemView);
        }
    }

}
