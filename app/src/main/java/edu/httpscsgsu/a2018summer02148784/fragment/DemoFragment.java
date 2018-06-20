package edu.httpscsgsu.a2018summer02148784.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

import edu.httpscsgsu.a2018summer02148784.MainActivity;
import edu.httpscsgsu.a2018summer02148784.R;
import edu.httpscsgsu.a2018summer02148784.activity.AdvanceListViewActivity;
import edu.httpscsgsu.a2018summer02148784.activity.AdvanceViewPagerActivity;
import edu.httpscsgsu.a2018summer02148784.activity.BaseActivity;
import edu.httpscsgsu.a2018summer02148784.activity.CheckBoxActivity;
import edu.httpscsgsu.a2018summer02148784.activity.IntentAndBundleActivity;
import edu.httpscsgsu.a2018summer02148784.activity.LaunchModeActivity;
import edu.httpscsgsu.a2018summer02148784.activity.NinePatchActivity;
import edu.httpscsgsu.a2018summer02148784.activity.NotificationActivity;
import edu.httpscsgsu.a2018summer02148784.activity.Quiz1Activity;
import edu.httpscsgsu.a2018summer02148784.activity.RadioGroupActivity;
import edu.httpscsgsu.a2018summer02148784.activity.ScaleTypeActivity;
import edu.httpscsgsu.a2018summer02148784.activity.ViewPagerActivity;
import edu.httpscsgsu.a2018summer02148784.adapter.MainListAdapter;
import edu.httpscsgsu.a2018summer02148784.bean.Base;


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
        list.add("Quiz1");
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
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
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
                        Base newBase = new Base();
                        newBase.setName("Jimmy");
                        Bundle bundle = new Bundle();
                        bundle.putInt("B_Msg",100);
                        bundle.putString("B_Msg","FromBundle");
                        bundle.putSerializable("Base", newBase);
                        intent.putExtra("B",bundle);
                        startActivity(intent);
                        break;
                    case 6:
                        intent.setClass(getActivity(), NotificationActivity.class);
                        startActivity(intent);
                        break;

                    case 7:
                        intent.setClass(getActivity(), AdvanceListViewActivity.class);
                        startActivity(intent);
                        break;
                    case 8:
                        intent.setClass(getActivity(), Quiz1Activity.class);
                        startActivity(intent);
                        break;
                    case 9:
                        ((MainActivity)getActivity()).startActivity(AdvanceViewPagerActivity.class);
                        break;
                    case 10:
                        ((MainActivity)getActivity()).startActivity(LaunchModeActivity.class);
                        break;
                    case 11:
                        ((MainActivity)getActivity()).startActivity(RadioGroupActivity.class);
                        break;
                    case 115:
                        ((MainActivity)getActivity()).startActivity(CheckBoxActivity.class);
                        break;
                        default:
                }
            }
        });
        return view;


    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("fragment","ContentFragment: onDestroy");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("fragment","ContentFragment: onStart");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("fragment","ContentFragment: onStop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("fragment","ContentFragment: onPause");
    }
    public void onResume() {
        super.onResume();
        Log.d("fragment","ContentFragment: onResume");
    }

}
