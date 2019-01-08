package com.example.chintan.research.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.chintan.research.BuildConfig;
import com.example.chintan.research.R;
import com.example.chintan.research.widget.fixheader.wrapper.TableFixHeaderAdapter;

import java.util.List;


public class BasicCellViewGroup extends FrameLayout
        implements
        TableFixHeaderAdapter.FirstHeaderBinder<String>,
        TableFixHeaderAdapter.HeaderBinder<String>,
        TableFixHeaderAdapter.FirstBodyBinder<List<String>>,
        TableFixHeaderAdapter.BodyBinder<List<String>>,
        TableFixHeaderAdapter.SectionBinder<List<String>> {

    public Holder holder;
    private View view;
    private Context mContext;


    public BasicCellViewGroup(Context context) {
        super(context);
        this.mContext = context;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_table1, this, true);
            holder = new Holder(view);
            view.setTag(holder); // setting Holder as arbitrary object for row
        } else {
            holder = (Holder) view.getTag();
        }
    }


    @Override
    public void bindFirstHeader(String headerName) {
        holder.getViewGroup().setBackgroundResource(R.drawable.bg_table_color1);
        holder.getTextView().setTextAlignment(TEXT_ALIGNMENT_CENTER);
        holder.getTextView().setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        holder.getTextView().setTextColor(ContextCompat.getColor(mContext, R.color.colorHeader));
        if (BasicTableFixHeaderAdapter.mColumn == -1)
            holder.getTextView().setTypeface(Typeface.DEFAULT_BOLD);
        else
            holder.getTextView().setTypeface(Typeface.DEFAULT);
        holder.getTextView().setText(headerName);
    }

    @Override
    public void bindHeader(String headerName, int column) {
        holder.getViewGroup().setBackgroundResource(R.drawable.bg_table_color1);
        holder.getTextView().setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        holder.getTextView().setTextColor(ContextCompat.getColor(mContext, R.color.colorHeader));
        if (BasicTableFixHeaderAdapter.mColumn == column)
            holder.getTextView().setTypeface(Typeface.DEFAULT_BOLD);
        else
            holder.getTextView().setTypeface(Typeface.DEFAULT);
        holder.getTextView().setText(headerName);
    }

    @Override
    public void bindFirstBody(List<String> items, int row) {

        holder.getTextView().setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
        holder.getTextView().setTextColor(ContextCompat.getColor(mContext, android.R.color.black));
        holder.getViewGroup().setBackgroundResource(R.drawable.bg_cell_data);
        String[] numberType = items.get(0).split("~");
        holder.getTextView().setText(numberType[0]);
        holder.getImageView().setImageResource(getDashboardDetailImage(numberType[1]));
    }

    @Override
    public void bindBody(List<String> items, int row, int column) {
        holder.getTextView().setTextAlignment(TEXT_ALIGNMENT_CENTER);
        holder.getTextView().setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
        holder.getTextView().setTextColor(ContextCompat.getColor(mContext, android.R.color.black));
        holder.getViewGroup().setBackgroundResource(R.drawable.bg_cell_data);

        holder.getTextView().setText(items.get(column + 1));

    }

    @Override
    public void bindSection(List<String> item, int row, int column) {
        holder.getTextView().setTextAlignment(TEXT_ALIGNMENT_CENTER);
        holder.getTextView().setText(column == 0 ? "Section:" + (row + 1) : "");
    }

    public int getDashboardDetailImage(String vehicleType) {
        int resID = mContext.getResources().getIdentifier(vehicleType.toLowerCase().trim(), "drawable", BuildConfig.APPLICATION_ID);
        if (resID != 0) { //image exist
            return resID;
        } else {//find default  image
            //drawable isn't there. so find default image status wise
            int resIdDef = mContext.getResources().getIdentifier("v_default", "drawable", mContext.getPackageName());
            if (resIdDef != 0) {
                return resIdDef;
            } else {
                return R.drawable.v_default;
            }
        }
    }

    public class Holder {

        private View row;
        private TextView textView;
        private ViewGroup layout;
        private ImageView ivVehicle;

        Holder(View row) {
            this.row = row;
        }

        TextView getTextView() {
            if (textView == null) {
                textView = findViewById(android.R.id.text1);
            }
            return textView;
        }

        ImageView getImageView() {
            if (ivVehicle == null) {
                ivVehicle = findViewById(R.id.iv_vehicle);
            }
            return ivVehicle;
        }

        ViewGroup getViewGroup() {
            if (layout == null) {
                layout = findViewById(R.id.layout);
            }
            return layout;
        }
    }
}