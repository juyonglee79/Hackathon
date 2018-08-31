package com.dsm2018.project;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class CustomDialogActivity {
    private Context context;
    public CustomDialogActivity(Context context){
        this.context=context;
    }
    void CallFunction(){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_save);
        dialog.show();
        ImageView img_cancle=dialog.findViewById(R.id.img_cancle);
        Button bt_okay=dialog.findViewById(R.id.bt_okay);
        bt_okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"피드백이 전송되었습니다",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context,MainActivity.class);
                context.startActivity(intent);
            }
        });
        img_cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"피드백전송이 취소되었습니다",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context,MapActivity.class);
                context.startActivity(intent);
            }
        });
    }

}
