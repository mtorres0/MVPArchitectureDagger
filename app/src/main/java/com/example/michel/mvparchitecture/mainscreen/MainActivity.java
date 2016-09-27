package com.example.michel.mvparchitecture.mainscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.michel.mvparchitecture.App;
import com.example.michel.mvparchitecture.R;
import com.example.michel.mvparchitecture.data.Post;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainScreenContract.View {

    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    //@BindView(R.id.list_prueba)
    ListView listPrueba;

    @Inject
    MainScreenPresenter mainScreenPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ButterKnife.bind(this);
        listPrueba = (ListView) findViewById(R.id.list_prueba);
        list = new ArrayList<>();

        DaggerMainScreenComponent.builder()
                .netComponent(((App) getApplicationContext()).getmNetComponent())
                .mainScreenModule(new MainScreenModule(this))
                .build().inject(this);

        mainScreenPresenter.loadPost();
    }

    @Override
    public void showPosts(List<Post> posts) {
        for(Post post: posts) {
            list.add(post.getTitle());
        }

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listPrueba.setAdapter(adapter);
    }

    @Override
    public void showError(String message) {
        Toast.makeText(getApplicationContext(), "Error" + message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showComplete() {
        Toast.makeText(getApplicationContext(), "Complete", Toast.LENGTH_SHORT).show();
    }
}
