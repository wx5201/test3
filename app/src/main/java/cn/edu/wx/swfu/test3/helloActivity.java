package cn.edu.wx.swfu.test3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 线性布局LIneLayout
 * 其中控件可以按照水平或垂直的方式一次排列
 * 使用android：orientatiion="vertical"属性可以指定为垂直
 * 使用android：orientation=“horizontal”属性可以指定为水平，默认为水平
 * orientation用来指定当前线性布局排布方向
 * android：layout_weight属性
 *
 * margin 表示控件距离其他控件或屏幕边缘的间距....外边距
 * padding：表示控件内部内容距离控件边缘的距离....内边距
 */

public class helloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }
}
