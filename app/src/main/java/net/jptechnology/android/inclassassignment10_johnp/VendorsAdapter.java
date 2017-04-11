package net.jptechnology.android.inclassassignment10_johnp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class VendorsAdapter extends RecyclerView.Adapter<VendorViewHolder> {

    private List<Vendor> vendors;
    private Context context;

    public VendorsAdapter(List<Vendor> vendors, Context context) {
        this.vendors = vendors;
        this.context = context;
    }

    @Override
    public VendorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_vendor, parent, false);
        return new VendorViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(VendorViewHolder holder, int position) {
        Vendor vendor = vendors.get(position);
        holder.bind(vendor);
    }

    @Override
    public int getItemCount() {
        return vendors.size();
    }


//    @Override
//    public VendorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_vendor);
//        return new VendorViewHolder(view, context);
//    }
//
//    @Override
//    public void onBindViewHolder(VendorViewHolder holder, int position) {
//        Vendor vendor = vendors.get(position);
//        holder.vendorName.setText(vendor.name);
//        holder.vendorInfo.setText(vendor.info);
//        holder.vendorLogo.setImageResource(vendor.logoId);
//    }
}

//public class PersonsAdapter extends RecyclerView.Adapter<PersonViewHolder> {
//
//    private List<Person> persons;
//    private Context context;
//
//    public PersonsAdapter(List<Person> persons, Context context) {
//        this.persons = persons;
//        this.context = context;
//    }
//
//    @Override
//    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_person, parent, false);
//        return new PersonViewHolder(view, context);
//    }
//
//    @Override
//    public void onBindViewHolder(PersonViewHolder holder, int position) {
//        Person person = persons.get(position);
//        holder.bind(person);
//    }
//
//    @Override
//    public int getItemCount() {
//        return persons.size();
//    }
//}