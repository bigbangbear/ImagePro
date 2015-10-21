package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import bin.hui.yu.imagepro.R;
import view.VHolderHomeRecycler;

/**
 * User: yu_huibin
 * Date: 2015-10-21
 * Time: 10:55
 * Fuction:
 */
public class AdapterHomeRecylerView extends RecyclerView.Adapter{

    private List<String> mImageList = new ArrayList<>();
    private float[] mImageHeight;
    private Context mContext;

    public AdapterHomeRecylerView(Context context) {
        super();
        mContext = context;
    }

    public void setData(List<String> data){
        if (!mImageList.isEmpty()) mImageList.clear();
        mImageList = data;
        setRandomHeight();
    }

    @Override
    public int getItemCount() {
        return mImageList.size();
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ViewGroup.LayoutParams params = holder.itemView.getLayoutParams();

        VHolderHomeRecycler vholder = (VHolderHomeRecycler)holder;
        vholder.render(mImageList.get(position), mImageHeight[position]);

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_vholder_home_image, parent, false);
        VHolderHomeRecycler vHolder = new VHolderHomeRecycler(view);
        return vHolder;
    }

    private void setRandomHeight(){
        mImageHeight = new float[mImageList.size()];

        for (int i=0; i<mImageList.size(); i++){
            mImageHeight[i] = (float)Math.random()*2;
        }
    }
}