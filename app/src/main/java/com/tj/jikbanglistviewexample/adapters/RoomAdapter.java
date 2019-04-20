package com.tj.jikbanglistviewexample.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tj.jikbanglistviewexample.R;
import com.tj.jikbanglistviewexample.datas.Room;

import java.util.List;

public class RoomAdapter extends ArrayAdapter<Room> {

    Context mContext;
    List<Room> mList;
    LayoutInflater inf;

    public RoomAdapter(Context context, List<Room> list) {
        super(context, R.layout.room_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.room_list_item, null);
        }


        Room roomData = mList.get(position);

        TextView paymentTxt = row.findViewById(R.id.paymentTxt);
        TextView locationAndFloorTxt = row.findViewById(R.id.locationAndFloorTxt);
        TextView descriptionTxt = row.findViewById(R.id.descriptionTxt);

        paymentTxt.setText(String.format("%d/%d", roomData.deposit, roomData.month_pay));
        locationAndFloorTxt.setText(String.format("%s, %d층", roomData.location, roomData.floor));
        descriptionTxt.setText(roomData.description);

        return row;

    }
}












