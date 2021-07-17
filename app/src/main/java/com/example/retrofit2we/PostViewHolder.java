package com.example.retrofit2we;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvName;
    private TextView mTvEmail;
    private TextView mTvBody;
    public PostViewHolder(@NonNull  View itemView) {
        super(itemView);
        intitView(itemView);
    }

    private void intitView(View itemView) {
        mTvBody=itemView.findViewById(R.id.tvBody);
        mTvName=itemView.findViewById(R.id.tvName);
        mTvEmail=itemView.findViewById(R.id.tvEmail);
    }
    public void SetData(ResponseModel responseModel){
        mTvEmail.setText(responseModel.getEmail());
        mTvName.setText(responseModel.getName());
        mTvBody.setText(responseModel.getBody());
    }
}
