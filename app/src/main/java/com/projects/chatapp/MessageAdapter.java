package com.projects.chatapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.List;

public class MessageAdapter extends ArrayAdapter<ChatModelClass> {

    private static final String TAG = "MessageAdapter";

    public MessageAdapter(Context context, int resource, List<ChatModelClass> list) {
        super(context, resource, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.message_item, parent, false);
        }
        ImageView photoMessage = convertView.findViewById(R.id.photoImageView);
        TextView messageTextView = convertView.findViewById(R.id.messageTextView);
        TextView nameTextView = convertView.findViewById(R.id.nameTextView);
        ChatModelClass modelClass = getItem(position);
        assert modelClass != null;
        if (modelClass.getImageUrl() != null) {
            messageTextView.setVisibility(View.GONE);
            photoMessage.setVisibility(View.VISIBLE);
            Glide.with(photoMessage.getContext()).load(modelClass.getImageUrl()).into(photoMessage);
            Log.e(TAG, "getView: " + modelClass.getImageUrl());
        } else {
            messageTextView.setVisibility(View.VISIBLE);
            photoMessage.setVisibility(View.GONE);
            messageTextView.setText(modelClass.getMessage());
        }
        nameTextView.setText(modelClass.getName());
        return convertView;
    }
}
