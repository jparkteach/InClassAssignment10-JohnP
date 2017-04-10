package net.jptechnology.android.inclassassignment10_johnp;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class VendorViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView vendorName;
    private TextView vendorInfo;
    private ImageView vendorLogo;
    private Context context;


    public VendorViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        vendorName = (TextView) itemView.findViewById(R.id.vendor_name);
        vendorInfo = (TextView) itemView.findViewById(R.id.vendor_info);
        vendorLogo = (ImageView) itemView.findViewById(R.id.vendor_logo);
        this.context = context;
    }

    public void bind(Vendor vendor) {
        vendorName.setText(vendor.name);
        vendorInfo.setText(vendor.info);
        vendorLogo.setImageResource(vendor.logoId);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, vendorName.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}