package mojtabaeshaghi.duke13.databinding.handeler;

import android.content.Context;
import android.view.View;

import mojtabaeshaghi.duke13.databinding.model.User;

public class Handerl {


    Context context;

    public Handerl(Context context) {
        this.context = context;


    }


    public void btnClick(View view) {
        User.email.set("mr.mojtaba47@gmail.com");
        User.name.set("mojtabaeshaghi 😉");
    }
}
