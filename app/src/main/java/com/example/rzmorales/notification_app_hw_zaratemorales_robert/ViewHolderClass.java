package com.example.rzmorales.notification_app_hw_zaratemorales_robert;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.PublicKey;

public class ViewHolderClass extends RecyclerView.ViewHolder {
    private static String TAG = "Image_call";
    private ImageView imageView;
    private TextView textView;
    private SharedPreferences sharedPreferences;
    private Intent intent;

    public ViewHolderClass(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.ImageViewID);
        textView=itemView.findViewById(R.id.textid);
        sharedPreferences = itemView.getContext().getApplicationContext().getSharedPreferences(TAG,Context.MODE_PRIVATE);

    }

    public void onBind(final ModelClass modelClass){
        imageView.setImageResource(modelClass.getPicture());
        textView.setText(modelClass.getText());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(itemView.getContext(),SecondActivity.class);
                intent.putExtra("text",modelClass.getText());
                intent.putExtra("image",modelClass.getPicture());
                itemView.getContext().startActivity(intent);

            }
        });

    }

}
