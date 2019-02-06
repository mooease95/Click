package com.example.matt.click;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

/**
 * Created by matt on 27/03/17.
 */

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private Context context;
    private List<HomeCardData> data;

    public CustomAdapter(HomeActivityFull homeActivity, List<HomeCardData> homeCardDataList) {
        context = homeActivity;
        data = homeCardDataList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_card_view, parent, false);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(context, ChatActivity.class);
                context.startActivity(newIntent);
            }
        });
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.primaryInterest.setText(data.get(position).getPrimaryActivity());
        holder.groupSizeText.setText(data.get(position).getMembers() + "/" + data.get(position).getMaxMembers());
        holder.groupSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(context, GroupSettings.class);
                context.startActivity(newIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView primaryInterest;
        public TextView groupSizeText;
        public ImageButton groupSettingsButton;


        public ViewHolder(View itemView) {
            super(itemView);
            primaryInterest = (TextView) itemView.findViewById(R.id.primaryInterestText);
            groupSizeText = (TextView) itemView.findViewById(R.id.groupNumberText);
            groupSettingsButton = (ImageButton) itemView.findViewById(R.id.buttonGroupSettings);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
