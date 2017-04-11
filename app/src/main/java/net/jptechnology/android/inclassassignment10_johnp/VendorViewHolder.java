package net.jptechnology.android.inclassassignment10_johnp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class VendorViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView vendorNameView;
    private TextView vendorInfoView;
    private ImageView vendorLogoView;
    private Context context;

    public VendorViewHolder(View itemView, Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        vendorNameView = (TextView) itemView.findViewById(R.id.vendor_name);
        vendorInfoView = (TextView) itemView.findViewById(R.id.vendor_info);
        vendorLogoView = (ImageView) itemView.findViewById(R.id.vendor_logo);
        this.context = context;
    }

    public void bind(final Vendor vendor) {
        vendorNameView.setText(vendor.name);
        vendorInfoView.setText(vendor.info);
        vendorLogoView.setImageResource(vendor.logoId);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vendor passvendor = new Vendor(vendor.name, vendor.info, vendor.logoId);
                Intent intent = SecondActivity.makeIntent(context, passvendor);
                context.startActivity(intent);
                Toast.makeText(context, vendorNameView.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
