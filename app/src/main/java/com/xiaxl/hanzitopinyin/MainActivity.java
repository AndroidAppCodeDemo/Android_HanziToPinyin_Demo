package com.xiaxl.hanzitopinyin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button001);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hanzi2Pinyin();

            }
        });


    }

    private void hanzi2Pinyin() {
        //
        StringBuffer sb = new StringBuffer();
        //
        ArrayList<HanziToPinyin.Token> list = HanziToPinyin.getInstance().get("我爱祖国");
        for (int i = 0; i < list.size(); i++) {
            HanziToPinyin.Token token = list.get(i);
            sb.append(token.toString());
        }
        btn.setText(sb.toString());
    }

}
