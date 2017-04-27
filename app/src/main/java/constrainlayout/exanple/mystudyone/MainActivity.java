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
 *   1 ���Ȼ�ȡDecoView����
 *   2 �����ڲص�ϵͳ�ؼ�
 *       SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN  �����������ռ��״̬���Ŀռ� ���SYSTEM_UI_FLAG_LAYOUT_STABLE
 *       SYSTEM_UI_FLAG_FULLSCREEN ����״̬��
 *       SYSTEM_UI_FLAG_HIDE_NAVIGATION ���ر�����
 *       SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION ����������ռ�ñ������Ŀռ�
 *   3 ����DecoView��setSystemUiVisisblity()
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
                           );//����״̬��|����
            getWindow().setStatusBarColor(Color.TRANSPARENT);//����װ��������ɫ
            getWindow().setNavigationBarColor(Color.TRANSPARENT);//���ñ���������ɫ

        }
        ActionBar action = getSupportActionBar();
        action.hide();
    }
}
