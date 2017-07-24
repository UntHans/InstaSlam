package com.somaznasi.hannesv.instaslam2.Model;

import android.net.Uri;

import java.net.URI;

/**
 * Created by hannesv on 2017/07/24.
 */

public class InstaImage {

    public Uri getImageResourceUrl() {
        return imageResourceUrl;
    }

    private Uri imageResourceUrl;

    public InstaImage(Uri imageResourceUrl) {
        this.imageResourceUrl = imageResourceUrl;
    }
}
