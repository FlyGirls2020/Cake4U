package com.example.cake4u.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cake4u.R;
import com.example.cake4u.model.Cakes;

import java.util.ArrayList;

public class CakesAdapter extends RecyclerView.Adapter<CakesAdapter.ProductViewAdapter> {
    private Context contexts;
    private ArrayList<Cakes> myitems;
    private static ClickListener clickListener;

    public CakesAdapter(Context contexts, ArrayList<Cakes> myitems) {
        this.contexts = contexts;
        this.myitems = myitems;
    }

    @NonNull
    @Override


    public ProductViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(contexts);
        View view=inflater.inflate(R.layout.admin_cakes_list,null);

        return  new CakesAdapter.ProductViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewAdapter holder, int position) {
        Cakes product=myitems.get(position);
        holder.ProductImage.setImageBitmap(product.getBitmap());
        holder.ProductName.setText(product.getProduct_name());
        holder.productPrice.setText("$"+product.getProduct_price());
        holder.ProductCount.setText(product.getCount());
        holder.availableProductCount.setText(product.getCount());


    }

    @Override
    public int getItemCount() {
        return  myitems.size();
    }

    class ProductViewAdapter extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener{
        ImageView ProductImage;
        TextView ProductName;
        TextView ProductCount;
        TextView productPrice;
        TextView availableProductCount;



        public ProductViewAdapter(@NonNull View itemView) {
            super(itemView);

            ProductImage=itemView.findViewById(R.id.admin_view_product_Images);
            ProductName=itemView.findViewById(R.id.admin_view_product_names);
            productPrice=itemView.findViewById(R.id.admin_current_product_price);
            ProductCount=itemView.findViewById(R.id.admin_current_product_count);
            availableProductCount=itemView.findViewById(R.id.admin_avilable_product_count);
            ProductImage.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            clickListener.onItemClick(getAdapterPosition(), view);
        }

        @Override
        public boolean onLongClick(View view) {
            clickListener.onItemLongClick(getAdapterPosition(), view);
            return false;

        }
    }

    public void setOnItemClickListener(ClickListener clickListener) {
        CakesAdapter.clickListener=clickListener;
    }
    public interface ClickListener {
        void onItemClick(int position, View v);

        void onItemLongClick(int position, View v);
    }

}

