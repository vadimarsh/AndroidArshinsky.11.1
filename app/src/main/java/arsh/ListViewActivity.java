package arsh;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;


public class ListViewActivity extends AppCompatActivity {
    private ItemsDataAdapter adapter;
    private List<Drawable> images = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        init();

    }

    private void init() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        ListView listView = findViewById(R.id.listView);
        setSupportActionBar(toolbar);

        fillImages();

        adapter = new ItemsDataAdapter(this, null);
        listView.setAdapter(adapter);

        putDataInApapter();
    }

    private void putDataInApapter() {
        String[] title = getString(R.string.titles).split("\n\n");
        String[] topic = getString(R.string.topics).split("\n\n");

        adapter.addItem(new DataItem(
                images.get(0),
                title[0],
                topic[0]));
        adapter.addItem(new DataItem(
                images.get(1),
                title[1],
                topic[1]));
        adapter.addItem(new DataItem(
                images.get(2),
                title[2],
                topic[1]));
        adapter.addItem(new DataItem(
                images.get(3),
                title[3],
                topic[1]));
        adapter.addItem(new DataItem(
                images.get(4),
                title[4],
                topic[2]));
        adapter.addItem(new DataItem(
                images.get(5),
                title[5],
                topic[2]));
        adapter.addItem(new DataItem(
                images.get(6),
                title[6],
                topic[3]));
    }


    private void fillImages() {
        images.add(ContextCompat.getDrawable(ListViewActivity.this,
                R.mipmap.example1));
        images.add(ContextCompat.getDrawable(ListViewActivity.this,
                R.mipmap.example2));
        images.add(ContextCompat.getDrawable(ListViewActivity.this,
                R.mipmap.example3));
        images.add(ContextCompat.getDrawable(ListViewActivity.this,
                R.mipmap.example4));
        images.add(ContextCompat.getDrawable(ListViewActivity.this,
                R.mipmap.example5));
        images.add(ContextCompat.getDrawable(ListViewActivity.this,
                R.mipmap.example6));
        images.add(ContextCompat.getDrawable(ListViewActivity.this,
                R.mipmap.example7));
    }
}
