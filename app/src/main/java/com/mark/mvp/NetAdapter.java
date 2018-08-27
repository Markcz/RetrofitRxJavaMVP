package com.mark.mvp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mark.mvp.bean.Book;

import java.util.List;

public class NetAdapter extends RecyclerView.Adapter<NetAdapter.MainViewHolder> {

    public NetAdapter(List<Book.BooksBean> items, Listener listener) {
        this.items = items;
        this.listener = listener;
    }

    interface Listener {
        void onItemClicked(int position);
    }

    private List<Book.BooksBean> items;
    private Listener listener;

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.reclcler_view_item, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, final int position) {
        final String item = items.get(position).getTitle();
        holder.textView.setText(item);
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClicked(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class MainViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        MainViewHolder(View  view) {
            super(view);
            this.textView = view.findViewById(R.id.tv_title);
        }
    }
}
