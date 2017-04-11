package net.jptechnology.android.inclassassignment10_johnp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Vendor> vendors;
    private VendorsAdapter vendorsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        vendorsAdapter = new VendorsAdapter(vendors, this);
        recyclerView.setAdapter(vendorsAdapter);
    }

    public void addRandomVendor(View view) {
        vendors.add(getRandomVendor());
        vendorsAdapter.notifyDataSetChanged();
    }

    private Vendor getRandomVendor() {
        int num = (int) (Math.random() * 7);
        if (num == 0)
            return new Vendor("Amazonia Cambio - Exchange", "$1 = 3.24 Reais\n$1 = 0.69 Euros\n$1 = 6.90 Chinese Yuan", R.drawable.amazonia);
        else if (num == 1)
            return new Vendor("ARRM Cambio - Exchange", "$1 = 3.24 Reais\n$1 = 0.69 Euros\n$1 = 6.90 Chinese Yuan", R.drawable.arrmcambio);
        else if (num == 2)
            return new Vendor("ARRM Cambio - Exchange", "$1 = 3.24 Reais\n$1 = 0.69 Euros\n$1 = 6.90 Chinese Yuan", R.drawable.arrmcambio);
        else
            return new Vendor("SLW Corretora - Exchange", "$1 = 3.24 Reais\n$1 = 0.69 Euros\n$1 = 6.90 Chinese Yuan", R.drawable.slwcorretora);
    }

    private void initialData() {
        vendors = new ArrayList<>();
        vendors.add(new Vendor("Amazonia Cambio - Exchange", "$1 = 3.24 Reais\n$1 = 0.69 Euros\n$1 = 6.90 Chinese Yuan", R.drawable.amazonia));
        vendors.add(new Vendor("ARRM Cambio - Exchange", "$1 = 3.24 Reais\n$1 = 0.69 Euros\n$1 = 6.90 Chinese Yuan", R.drawable.arrmcambio));
        vendors.add(new Vendor("Avanti Cambio - Exchange", "$1 = 3.24 Reais\n$1 = 0.69 Euros\n$1 = 6.90 Chinese Yuan", R.drawable.avanti));
        vendors.add(new Vendor("GetMoney Cambio - Exchange", "$1 = 3.24 Reais\n$1 = 0.69 Euros\n$1 = 6.90 Chinese Yuan", R.drawable.getmoney));
        vendors.add(new Vendor("Green Cambio - Exchange", "$1 = 3.24 Reais\n$1 = 0.69 Euros\n$1 = 6.90 Chinese Yuan", R.drawable.greencambio));
        vendors.add(new Vendor("Moneygram Cambio - Exchange", "$1 = 3.24 Reais\n$1 = 0.69 Euros\n$1 = 6.90 Chinese Yuan", R.drawable.moneygram));
        vendors.add(new Vendor("SLW Corretora - Exchange", "$1 = 3.24 Reais\n$1 = 0.69 Euros\n$1 = 6.90 Chinese Yuan", R.drawable.slwcorretora));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                vendors.add(getRandomVendor());
                vendorsAdapter.notifyDataSetChanged();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}


