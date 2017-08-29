package examples.jeffery.com.daggerexamples.pc;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import examples.jeffery.com.daggerexamples.R;

/**
 * Created by jeffery on 8/29/17.
 */

public class PCAdapter extends RecyclerView.Adapter {

    private MyPC pc;

    private Context context;

    public PCAdapter(Context context, MyPC pc) {
        this.context = context;
        this.pc = pc;
    }

    @Override
    public int getItemCount() {
        return pc.getItemCount();
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

        svh.txt.setText(pc.getPcParts().get(i));
    }

    private class SimpleViewHolder extends RecyclerView.ViewHolder {
        TextView txt;

        SimpleViewHolder(View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.item_list_text);
        }
    }
}
