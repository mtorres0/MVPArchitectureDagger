package com.example.michel.mvparchitecture.mainscreen;

import com.example.michel.mvparchitecture.data.Post;

import java.util.List;

/**
 * Created by michel on 27/09/16.
 */

public interface MainScreenContract {

    interface View {
        void showPosts(List<Post> posts);

        void showError(String message);

        void showComplete();
    }

    interface Presenter {
        void loadPost();
    }

}
