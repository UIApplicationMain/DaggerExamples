package examples.jeffery.com.daggerexamples;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jeffery on 8/26/17.
 */

public class SimpleAdapter extends RecyclerView.Adapter {

    private RandomText rng;

    private Context context;

    SimpleAdapter(Context context, RandomText rng) {
        this.context = context;
        this.rng = rng;
    }

    @Override
    public int getItemCount() {
        return rng.getSayings().size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_simple, viewGroup, false);

        SimpleViewHolder holder = new SimpleViewHolder(itemView);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SimpleViewHolder svh = (SimpleViewHolder) viewHolder;
        svh.txt.setText(rng.getSayings().get(i));
    }

    class SimpleViewHolder extends RecyclerView.ViewHolder {
        TextView txt;

        SimpleViewHolder(View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.item_list_text);
        }
    }
}
