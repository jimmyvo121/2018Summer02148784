package edu.httpscsgsu.a2018summer02148784.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import edu.httpscsgsu.a2018summer02148784.R;
import edu.httpscsgsu.a2018summer02148784.activity.IntentAndBundleActivity;
import edu.httpscsgsu.a2018summer02148784.activity.LaunchModeActivity;
import edu.httpscsgsu.a2018summer02148784.activity.NinePatchActivity;
import edu.httpscsgsu.a2018summer02148784.activity.ScaleTypeActivity;
import edu.httpscsgsu.a2018summer02148784.activity.ViewPagerActivity;
import edu.httpscsgsu.a2018summer02148784.adapter.MainListAdapter;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DemoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DemoFragment extends Fragment {


    public List<String> list = new ArrayList<String>();
    public MainListAdapter adapter;
    private ListView listView;
    //commit test
    public DemoFragment()
    {
        list.add("LaunchMode");
        list.add("SimpleViewPager");
        list.add("9Patch");
        list.add("ScaleType");
        list.add("Intent&Bundle");
        list.add("Notification");
        list.add("AdvanceListView");
        list.add("AdvanceViewPager");
        list.add("LaunchMode");
        list.add("RadioGroup");
        list.add("CheckBox");
        list.add("Dialogs");
        list.add("Handler");
        list.add("Animation");
        list.add("Animator");
        list.add("Gesture");
        list.add("Service&Broadcast");
        list.add("AudioPlayerMVC");
        list.add("LoginLogic");

    }

    public static DemoFragment newInstance(String param1, String param2)
    {
        DemoFragment fragment = new DemoFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        listView = view.findViewById(R.id.main_demo_listview);
        adapter = new MainListAdapter(getContext(), list);
        listView.setAdapter(adapter);

        View headerView = new View(getActivity());
        listView.addHeaderView(headerView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            Intent intent = new Intent();
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 1:
                        //go to activity LaunchMode
                        intent.setClass(getActivity(), LaunchModeActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.setClass(getActivity(), ViewPagerActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.setClass(getActivity(), NinePatchActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.setClass(getActivity(), ScaleTypeActivity.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent.setClass(getActivity(), IntentAndBundleActivity.class);
                        intent.putExtra("Msg","Say Hello!");
                        intent.putExtra("No",10);
                        Bundle bundle = new Bundle();
                        bundle.putInt("B_Msg",100);
                        bundle.putString("B_Msg","FromBundle");
                        intent.putExtra("B",bundle);
                        startActivity(intent);
                    default:
                }
            }
        });
        return view;
    }

}
