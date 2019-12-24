package mojtabaeshaghi.duke13.databinding;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import mojtabaeshaghi.duke13.databinding.databinding.ActivityMainBinding;
import mojtabaeshaghi.duke13.databinding.handeler.Handerl;
import mojtabaeshaghi.duke13.databinding.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Handerl ha = new Handerl(this);

        mainBinding.setHanderl(ha);
        /*
        * just put that */

    }
}
