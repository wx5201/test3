package cn.edu.wx.swfu.test3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**相对布局RelativelLayout
 * 一般来说相对布局都存在与id相关的属性
 * 相对布局中的视图的组建是按照相互之间的相对位置来确认的
 * 往往需要定义每一个控件的资源ID
 * layout_centerVertical垂直居中
 * Layout_centerHorizontal:水平居中
 * Layout_centerInparent:父类居中
 * alignParentRight：对其父亲类右部
 *layout_width和layout_height是在平面图形中必不可少的两个属性
 * toRightof：在某一个控件的右方，其中方向性的单词可以更换
 * alignBottom:底部对齐
 * alignRight：右部对齐
 * @id+id：表示的是系统中本来不存在的id值，需要将这个id添加到系统中
 * //@id：表示系统中去除已添加的标签
 *
 alignBaseline:基准线对齐
 *
 * 针对相对布局而言，一般不会过多的给定很多相关的属性，否则耦合性会大大增加
 *
 *
 *
 */

public class Realativellayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realativellayout);
    }
}
