package horie1024.jp.sample;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * RecyclerView.Adapterサンプル
 */
public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.ViewHolder> {

    private String[] mDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public CardView mCardView;
        public ViewHolder(CardView v) {
            super(v);
            mCardView = v;
        }
    }

    public SampleAdapter(String[] myDataSet) {
        mDataSet = myDataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        CardView v =  (CardView) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.my_card_view, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        TextView tv = (TextView) viewHolder.mCardView.findViewById(R.id.info_text);
        tv.setText(mDataSet[i]);
    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }
}
