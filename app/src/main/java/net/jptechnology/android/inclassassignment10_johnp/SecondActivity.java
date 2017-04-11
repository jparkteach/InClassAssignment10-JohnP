package net.jptechnology.android.inclassassignment10_johnp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String EXTRA_NAME = "net.jptechnology.android.inclassassignment10_johnp.SecondActivity - vendorName";
    private static final String EXTRA_INFO = "net.jptechnology.android.inclassassignment10_johnp.SecondActivity - vendorInfo";
    private static final String EXTRA_LOGOID = "net.jptechnology.android.inclassassignment10_johnp.SecondActivity - vendorLogoId";

    private Vendor vendor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        extractDataFromIntent();

        setupEndActivityButton();
    }

    private void extractDataFromIntent() {
        Intent intent = getIntent();
        String vendorName = intent.getStringExtra(EXTRA_NAME);
        String vendorInfo = intent.getStringExtra(EXTRA_INFO);
        int vendorLogoId = intent.getIntExtra(EXTRA_LOGOID, 0);
        vendor2 = new Vendor(vendorName, vendorInfo, vendorLogoId);
    }

    private void setupEndActivityButton() {
        Button button = (Button) findViewById(R.id.close);
        ImageView vendorLogoView = (ImageView) findViewById(R.id.vendor_logo2);
        TextView vendorNameView = (TextView) findViewById(R.id.vendor_name2);
        TextView vendorInfoView = (TextView) findViewById(R.id.vendor_info2);
        vendorLogoView.setImageResource(vendor2.getLogoId());
        vendorNameView.setText(vendor2.getName());
        vendorInfoView.setText(vendor2.getInfo());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public static Intent makeIntent(Context context, Vendor vendor) {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra(EXTRA_NAME, vendor.getName());
        intent.putExtra(EXTRA_INFO, vendor.getInfo());
        intent.putExtra(EXTRA_LOGOID, vendor.getLogoId());
        return intent;
    }
}
