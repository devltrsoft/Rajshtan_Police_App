package com.ltrsoft.police_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.ltrsoft.police_app.Classes.Evidance;
import com.ltrsoft.police_app.R;

import java.util.ArrayList;

public class EvidenceAdapter1 extends RecyclerView.Adapter<EvidenceAdapter1.ViewHolder> {

    private ArrayList<Evidance> dataList;

    public EvidenceAdapter1(ArrayList<Evidance> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.evidenceccardview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Evidance item = dataList.get(position);

        holder.tvi.setText("Evidence ID: " + item.getEvidance_id());
        holder.textEvidenceName.setText("Evidence Name: " + item.getEvidance_name());
        holder.textEvidenceDate.setText("Evidence Date: " + item.getDiscription());


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                AppCompatActivity activity=(AppCompatActivity)v.getContext();
//                EvedenceSecondFragmet secondFragment = new EvedenceSecondFragmet();
//                activity.getSupportFragmentManager().beginTransaction().replace(R.id.main_container, secondFragment).addToBackStack(null).commit();

            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvi, textEvidenceName, textEvidenceDate;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvi = itemView.findViewById(R.id.textEvidenceId);
            textEvidenceName = itemView.findViewById(R.id.textEvidenceName);
            textEvidenceDate = itemView.findViewById(R.id.textEvidenceDate);
            cardView = itemView.findViewById(R.id.evidenceCard);
        }
    }
}
