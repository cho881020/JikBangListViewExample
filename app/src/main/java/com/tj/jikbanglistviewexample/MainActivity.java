package com.tj.jikbanglistviewexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tj.jikbanglistviewexample.adapters.RoomAdapter;
import com.tj.jikbanglistviewexample.databinding.ActivityMainBinding;
import com.tj.jikbanglistviewexample.datas.Room;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RoomAdapter mRoomAdapter;

    List<Room> roomList = new ArrayList<>();

    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);

        act.cleanRoomCountTxt.setText("32개");

        fillRooms();


        mRoomAdapter = new RoomAdapter(MainActivity.this, roomList);
        act.roomListView.setAdapter(mRoomAdapter);


    }

    void fillRooms() {
        roomList.add(new Room(500, 35, "서구 둔산동", 7, "타임월드 인근~~"));
        roomList.add(new Room(500, 45, "동구 둔산동", 3, "갤러리백화점 부근 투룸"));
        roomList.add(new Room(500, 35, "북구 둔산동", 20, "둔산동 아너스빌"));
        roomList.add(new Room(500, 35, "남구 둔산동", 2, "시세대비 저렴"));
        roomList.add(new Room(500, 40, "서구 둔산동", 15, "리치빌오피스텔 15평형"));
        roomList.add(new Room(500, 35, "북구 둔산동", 15, "시청역부근 리치빌"));
    }
}
