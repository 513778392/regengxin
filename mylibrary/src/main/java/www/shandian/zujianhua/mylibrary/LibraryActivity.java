package www.shandian.zujianhua.mylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/news/center")
public class LibraryActivity extends AppCompatActivity {

    @Autowired
    long key1;
    @Autowired
    String key3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        ARouter.getInstance().inject(this);
        Log.v("ddddddddddddddddd",key1+"=============="+key3);
    }
}
