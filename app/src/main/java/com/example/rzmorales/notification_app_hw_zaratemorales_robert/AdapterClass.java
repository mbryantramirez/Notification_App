package com.example.rzmorales.notification_app_hw_zaratemorales_robert;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<ViewHolderClass> {
    List<ModelClass> modelClassList;

    public AdapterClass(List<ModelClass> modelClassList){
        this.modelClassList = modelClassList;
    }

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view,viewGroup,false);
        return new ViewHolderClass(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass viewHolderClass, int i) {
    ModelClass modelClass = modelClassList.get(i);
    viewHolderClass.onBind(modelClass);
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }
}
