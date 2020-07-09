package arsh;

import android.graphics.drawable.Drawable;

public class DataItem {

    private Drawable image;
    private String title;
    private String subtitle;

    public DataItem(Drawable image, String title, String subtitle) {
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
    }

    public Drawable getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }


}