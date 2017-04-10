package cn.edu.wx.swfu.test3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/**
 * TableLayout 继承LineLayout
 *
 * strechColumns：拉伸某一列。让布局显得不那么紧凑
 * shrinkColumns：回缩某一列。让其整体内容得以显示，自适应父容器的大小
 * ollapseColums：掩藏某一列
 *
 * TableROW的框和高可以不指定，系统会自动给定宽和高
 */

public class activity_table extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
    }
}
