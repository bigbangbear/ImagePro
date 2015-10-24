package view;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import bin.hui.yu.imagepro.R;

/**
 * User: yu_huibin
 * Date: 2015-10-21
 * Time: 11:19
 * Fuction:首页瀑布流的View Holder
 */
public class VHolderHomeRecycler extends RecyclerView.ViewHolder{

    public com.facebook.drawee.view.SimpleDraweeView mImageView;

    public VHolderHomeRecycler(View itemView) {
        super(itemView);

        mImageView = (com.facebook.drawee.view.SimpleDraweeView)itemView.findViewById(R.id.image_view);
    }

    public void render(String url, float radio){
        mImageView.setImageURI(Uri.parse(url));
        mImageView.setAspectRatio(radio);

        Log.i("yuhuibin", "render image");
    }

}