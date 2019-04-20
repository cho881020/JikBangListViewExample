package com.tj.jikbanglistviewexample.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

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

}
