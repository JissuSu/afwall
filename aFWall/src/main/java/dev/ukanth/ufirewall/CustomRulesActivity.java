package dev.ukanth.ufirewall;

import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

import java.util.List;

import dev.ukanth.ufirewall.util.CustomRule;
import dev.ukanth.ufirewall.util.G;
import dev.ukanth.ufirewall.util.Rule;

public class CustomRulesActivity { /*extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final SharedPreferences prefs = getSharedPreferences(Api.CUSTOM_RULE_PREFS, 0);
        final View view = getLayoutInflater().inflate(R.layout.activity_custom_rules, null);
        setTitle(R.string.custom_rules);

        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.activity_custom_rules);
        try {
            List<Rule> rules = CustomRule.getRules(getApplicationContext());
            for (final Rule rule : rules) {
                CardView cardView = new CardView(this);
                cardView.setRadius(dpToPixels(5));
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                params.height = dpToPixels(50);
                params.gravity = Gravity.CENTER;
                int margin = dpToPixels(10);
                params.setMargins(margin, margin, margin, margin);
                cardView.setLayoutParams(params);


                Switch switchButton = new Switch(this);
                switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        prefs.edit().putBoolean(rule.getId(), isChecked).commit();
                    }
                });
                switchButton.setChecked(prefs.getBoolean(rule.getId(), false));
                switchButton.setContentDescription(rule.getDesc());
                switchButton.setText(rule.getName());
                switchButton.setTextSize(18);

                switchButton.setLayoutParams(params);

                cardView.addView(switchButton);
                linearLayout.addView(cardView);
            }
        } catch (Exception e) {

        }

        setContentView(view);

        Toolbar toolbar = (Toolbar) findViewById(R.id.custom_toolbar_rules);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public int dpToPixels(int dp) {
        DisplayMetrics displayMetrics = getApplicationContext().getResources().getDisplayMetrics();
        int px = Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
        return px;
    } */
}
