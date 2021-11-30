package pl.edu.pb.todoapp;

import androidx.fragment.app.Fragment;

public class TaskListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new pl.edu.pb.todoapp.TaskListFragment();
    }
}