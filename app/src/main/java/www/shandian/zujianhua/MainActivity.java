package www.shandian.zujianhua;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.hello);
        textView.setText("MainActivity");
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("hhhhhhhhhhhhhh","==================");
                ARouter.getInstance().build("/news/center")
                        .withLong("key1", 666L)
                        .withString("key3", "888")
                        .navigation();
            }
        });
    }



}
