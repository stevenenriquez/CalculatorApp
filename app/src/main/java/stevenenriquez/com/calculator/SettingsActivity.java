/*
 File: SettingsActivity.java
 Authors: Steven E & Andres S
 */

package stevenenriquez.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity {

    Switch lSwitch;
    View view;
    Boolean colorFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        lSwitch = findViewById(R.id.lightSwitch);
        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.backgroundColorLight);
        colorFlag = false;

        // switching the night mode off/on
        lSwitch.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(!colorFlag)
                {
                    view.setBackgroundResource(R.color.backgroundColorDark);
                    colorFlag = true;
                }
                else
                {
                    view.setBackgroundResource(R.color.backgroundColorLight);
                    colorFlag = false;
                }
            }
        });

    }
}
