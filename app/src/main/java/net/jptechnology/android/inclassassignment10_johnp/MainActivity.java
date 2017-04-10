package net.jptechnology.android.inclassassignment10_johnp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Vendor> vendors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void initialData() {
        vendors = new ArrayList<>();
        vendors.add(new Vendor("Amazonia Cambio - Exchange", "$1 = 3.24 Reals\n$1 = 0.94 Euros\n$1 = 6.90 Yuan", R.drawable.amazonia));
        vendors.add(new Vendor("ARRM Cambio - Exchange", "$1 = 3.24 Reals\n$1 = 0.94 Euros\n$1 = 6.90 Yuan", R.drawable.arrmcambio));
        vendors.add(new Vendor("Avanti Cambio - Exchange", "$1 = 3.24 Reals\n$1 = 0.94 Euros\n$1 = 6.90 Yuan", R.drawable.avanti));
        vendors.add(new Vendor("GetMoney Cambio - Exchange", "$1 = 3.24 Reals\n$1 = 0.94 Euros\n$1 = 6.90 Yuan", R.drawable.getmoney));
        vendors.add(new Vendor("Green Cambio - Exchange", "$1 = 3.24 Reals\n$1 = 0.94 Euros\n$1 = 6.90 Yuan", R.drawable.greencambio));
        vendors.add(new Vendor("Moneygram Cambio - Exchange", "$1 = 3.24 Reals\n$1 = 0.94 Euros\n$1 = 6.90 Yuan", R.drawable.moneygram));
        vendors.add(new Vendor("SLW Corretora - Exchange", "$1 = 3.24 Reals\n$1 = 0.94 Euros\n$1 = 6.90 Yuan", R.drawable.slwcorretora));
    }
}


