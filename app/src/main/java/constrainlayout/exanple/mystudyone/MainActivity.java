package constrainlayout.exanple.mystudyone;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 *  author xh
 *  user cjcd
 *   1 首先获取DecoView对象
 *   2 设置掩藏的系统控件
 *       SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN  让主体的内容占用状态栏的空间 配合SYSTEM_UI_FLAG_LAYOUT_STABLE
 *       SYSTEM_UI_FLAG_FULLSCREEN 隐藏状态栏
 *       SYSTEM_UI_FLAG_HIDE_NAVIGATION 隐藏标题栏
 *       SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION 让主体内容占用标题栏的空间
 *   3 调用DecoView的setSystemUiVisisblity()
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(Build.VERSION.SDK_INT>=21) {
            View decoview = getWindow().getDecorView();
            decoview.setSystemUiVisibility
                    (View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                            View.SYSTEM_UI_FLAG_LAYOUT_STABLE|
                            View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                           );//隐藏状态栏|设置
            getWindow().setStatusBarColor(Color.TRANSPARENT);//设置装天栏的颜色
            getWindow().setNavigationBarColor(Color.TRANSPARENT);//设置标题栏的蓝色

        }
        ActionBar action = getSupportActionBar();
        action.hide();
    }
}
