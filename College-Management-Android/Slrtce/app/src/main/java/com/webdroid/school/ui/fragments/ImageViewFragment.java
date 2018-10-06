package com.webdroid.school.ui.fragments;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.webdroid.school.R;
import com.webdroid.school.base.BaseFragment;



public class ImageViewFragment extends BaseFragment {


    private ImageView fileviewerArtwork;
    private static String fileUrl;

    /**
     * Instance of this class
     * @return
     */
    public static ImageViewFragment getInstance(String fileurl){
        setFileUrl(fileurl);
        return new ImageViewFragment();
    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_imageview;
    }

    @Override
    protected void ui(View rootview) {
        fileviewerArtwork = (ImageView) rootview.findViewById(R.id.fileviewer_Artwork);
    }

    @Override
    protected void function() {
        Glide.with(getContext())
                .load(getFileUrl())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .crossFade()
                .fitCenter()
                .error(R.mipmap.school)
                .placeholder(R.mipmap.school)
                .into(fileviewerArtwork);
    }

    @Override
    protected Fragment setfragment() {
        return null;
    }

    @Override
    protected int setContainerId() {
        return 0;
    }

    public static String getFileUrl() {
        return fileUrl;
    }

    public static void setFileUrl(String fileUrls) {
        fileUrl = fileUrls;
    }
}
