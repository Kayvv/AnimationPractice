package cc.kayvv.animationpractice;

import android.app.Activity;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.Window;

/**
 * Created by Kay on 2017/3/7.
 */

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        Transition explode = TransitionInflater.from(this).inflateTransition(R.transition.fade);
        //退出时使用
        getWindow().setExitTransition(explode);
//第一次进入时使用
        getWindow().setEnterTransition(explode);
//再次进入时使用
        getWindow().setReenterTransition(explode);

        setContentView(R.layout.activity_second);
    }
}
