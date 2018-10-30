package omurkumru.com.dataBindingExample;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


public class GlideBindingAdapter {

    @BindingAdapter("imgURL")
    public static void setImageResource(ImageView view, String url){

        Context context = view.getContext();

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground);

        Glide.with(context)
                .setDefaultRequestOptions(requestOptions)
                .load(url)
                .into(view);

    }
}
