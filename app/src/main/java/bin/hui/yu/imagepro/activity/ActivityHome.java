package bin.hui.yu.imagepro.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import adapter.AdapterHomeRecylerView;
import bin.hui.yu.imagepro.R;

/**
 * User: yu_huibin
 * Date: 2015-10-20
 * Time: 23:24
 * Fuction: 首页，利用瀑布流展示图片
 */
public class ActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Fresco.initialize(getApplicationContext());

        setContentView(R.layout.activity_activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initView();

    }

    void initView(){

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recylcerview);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        List<String> list = new ArrayList<>();
        list.add("http://b.hiphotos.baidu.com/image/pic/item/faf2b2119313b07e73cdc2690ad7912397dd8c5b.jpg");
        list.add("http://a.hiphotos.baidu.com/image/pic/item/1f178a82b9014a90aeefd5dcaf773912b21beefa.jpg");
        list.add("http://c.hiphotos.baidu.com/image/pic/item/95eef01f3a292df50a6d3e74ba315c6034a87321.jpg");
        list.add("http://d.hiphotos.baidu.com/image/pic/item/267f9e2f07082838dc76bbc7bc99a9014d08f1ee.jpg");
        list.add("http://g.hiphotos.baidu.com/image/pic/item/377adab44aed2e73651dadc08301a18b86d6fa62.jpg");
        list.add("http://d.hiphotos.baidu.com/image/pic/item/f9198618367adab4a1bc31af8fd4b31c8601e4ea.jpg");
        list.add("http://a.hiphotos.baidu.com/image/pic/item/34fae6cd7b899e512f76cec546a7d933c9950d62.jpg");

        AdapterHomeRecylerView adpter = new AdapterHomeRecylerView(ActivityHome.this);
        adpter.setData(list);

        recyclerView.setAdapter(adpter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
