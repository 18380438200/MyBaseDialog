package com.example.mybasedialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;

/**
 * Created by libo on 2018/2/24.
 */

public class MenuDialog extends BaseDialog{

    public MenuDialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);

        setContentView(R.layout.create_add_menu);
    }

}
